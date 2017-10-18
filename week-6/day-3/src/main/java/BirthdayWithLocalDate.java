import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BirthdayWithLocalDate implements BirthdayCalculator<LocalDate> {

  @Override
  public LocalDate parseDate(String str) {
      return LocalDate.parse(str);
  }

  @Override
  public String printMonthAndDay(LocalDate date) {
      DateTimeFormatter formatters = DateTimeFormatter.ofPattern("MM. dd.");
      String text = date.format(formatters);
      return text;
  }

  @Override
  public boolean isAnniversaryToday(LocalDate date) {
      if (date.equals(LocalDate.now())) {
          return true;
      } else {
        return false;
      }
  }

  @Override
  public int calculateAgeInYears(LocalDate birthday) {
      int age = LocalDate.now().getYear() - birthday.getYear();
    // TODO - return how many years age the input date 'birthday' was
      return age;
  }

  @Override
  public int calculateDaysToNextAnniversary(LocalDate date) {
      int days = 0;
      if (date.getDayOfYear() > LocalDate.now().getDayOfYear()) {
          days = date.getDayOfYear() - LocalDate.now().getDayOfYear();
      } else if (date.getDayOfYear() < LocalDate.now().getDayOfYear())
      {
          days = 365 - (LocalDate.now().getDayOfYear() - date.getDayOfYear());
      } else if ((date.getDayOfYear() - LocalDate.now().getDayOfYear()) == 1) {
          return 1;
      }

    // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)
      return days;
  }

  public static void main(String[] args) {
    new BirthdayWithLocalDate().run();
  }

  private void run() {

    print("Birthday with java.util.Date.");
    String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

    LocalDate birthdayDate = parseDate(birthdayStr);
    print("Your birthday: " + printMonthAndDay(birthdayDate));

    if (isAnniversaryToday(birthdayDate)) {
      int ageInYears = calculateAgeInYears(birthdayDate);
      print("Congratulations! Today is your " + ageInYears + "th birthday!");
    } else {
      int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
      print("You have to wait only " + daysLeft + " days for your next birthday.");
    }
  }

  private void print(String line) {
    System.out.println(line);
  }

  private String readInput(String message) {
    System.out.print(message + ": ");
    return input.nextLine();
  }

  private final Scanner input = new Scanner(System.in, "UTF-8");
}

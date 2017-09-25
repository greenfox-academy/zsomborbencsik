public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public static void main(String[] args) {
        BlogPost firstObject = new BlogPost();
        firstObject.authorName = "John Doe";
        firstObject.title = "Lorem Ipsum";
        firstObject.text = "Lorem ipsum dolor sit amet.";
        firstObject.publicationDate = "2000.05.04.";

        BlogPost secondObject = new BlogPost();
        secondObject.authorName = "Tim Urban";
        secondObject.title = "Wait but why";
        secondObject.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        secondObject.publicationDate = "2010.10.10.";

        BlogPost thirdObject = new BlogPost();
        thirdObject.authorName = "William Turton";
        thirdObject.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        thirdObject.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        thirdObject.publicationDate = "2017.03.28";
    }
}

//"Lorem Ipsum" titled by John Doe posted at "2000.05.04."
//        Lorem ipsum dolor sit amet.
//        "Wait but why" titled by Tim Urban posted at "2010.10.10."
//        A popular long-form, stick-figure-illustrated blog about almost everything.
//        "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
//        Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.




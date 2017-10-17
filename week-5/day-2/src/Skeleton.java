import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Skeleton extends Monster {

    public Skeleton() {
        super("skeleton.png", 0,0);
        this.characterName = "Skeleton";
    }

    public void createSkeletons(int numberOfSkeletons) {
        ArrayList<Skeleton> skeletons = new ArrayList<>(numberOfSkeletons);
        for (int i = 0; i < numberOfSkeletons - 1; i++) {
            skeletons.add(new Skeleton());
            skeletons.get(i).posX = random.nextInt(10) + 1;
            skeletons.get(i).posY = random.nextInt(10) + 1;
        }
    }
}

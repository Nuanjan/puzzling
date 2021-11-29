
import java.util.ArrayList;

// import java.util.Random;
public class PuzzleTest {
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);
        char randomChar = generator.getRandomLetter();
        System.out.println(randomChar);
        String genPassword = generator.generatePassword();
        System.out.println(genPassword);
        ArrayList<String> myPasswordSet = generator.getNewPasswordSet(5);
        System.out.println(myPasswordSet);
        // ..
        // Write your other test cases here.
        // ..
    }
}

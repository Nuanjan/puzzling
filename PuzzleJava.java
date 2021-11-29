import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    private int getRandomRange(int range) {
        Random randomNumber = new Random();
        int ranValue = randomNumber.nextInt(range);
        return ranValue;
    }

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> tenRolls = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int ranValue = getRandomRange(20);
            tenRolls.add(ranValue);
        }
        return tenRolls;
    }

    public Character getRandomLetter() {
        char[] lowerLetterArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        int randomIndex = getRandomRange(lowerLetterArray.length - 1);
        return lowerLetterArray[randomIndex];
    }

    public String generatePassword() {
        String str = "";
        for (int i = 0; i < 8; i++) {
            char randomLetter = getRandomLetter();
            str += randomLetter;
        }
        return str;
    }

    public ArrayList<String> getNewPasswordSet(int size) {
        ArrayList<String> passwordSet = new ArrayList<String>();

        for (int i = 0; i < size; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }
}
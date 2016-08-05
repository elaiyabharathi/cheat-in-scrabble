import java.util.ArrayList;
import java.util.Arrays;

public class Word {
    private static final String ONE_POINTERS = "EAIONRTLSU";
    private static final String TWO_POINTERS = "DG";
    private static final String THREE_POINTERS = "BCMP";
    private static final String FOUR_POINTERS = "FHVWY";
    private static final String FIVE_POINTERS = "K";
    private static final String EIGHT_POINTERS = "JX";
    private static final String TEN_POINTERS = "QZ";
    private String word;
    private int points;

    public String getWord() {
        return word;
    }

    public int getPoints() {
        return points;
    }

    public Word(String word) {
        this.word = word;
        this.points = computePoints();
    }

    public int computePoints() {
        int points = 0;
        char []characters = word.toCharArray();
        for (char c : characters) {
            if (ONE_POINTERS.indexOf(c) != -1) {
                points += 1;
            }
            else if (TWO_POINTERS.indexOf(c) != -1) {
                points += 2;
            }
            else if (THREE_POINTERS.indexOf(c) != -1) {
                points += 3;
            }
            else if (FOUR_POINTERS.indexOf(c) != -1) {
                points += 4;
            }
            else if (FIVE_POINTERS.indexOf(c) != -1) {
                points += 5;
            }
            else if (EIGHT_POINTERS.indexOf(c) != -1) {
                points += 8;
            }
            else {
                points += 10;
            }
        }
        return points;
    }
}

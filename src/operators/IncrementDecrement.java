package operators;

public class IncrementDecrement {
    public static void main(String[] args) {
        // ++ y -- The increment and decrement operators are considered as assignment operators since they reassign the variable.

        int marioLives = 5;

        // ++ Complete form
        marioLives = marioLives + 1;
        System.out.println("Current lives: " + marioLives); // 6

        // ++ Shortcut
        marioLives++;
        System.out.println("Current lives: " + marioLives); // 7

        int daysToGrade = 30;

        // -- Complete form
        daysToGrade = daysToGrade - 1;
        System.out.println("Days to grade: " + daysToGrade); // 29

        // -- Shortcut
        daysToGrade--;
        System.out.println("Days to grade: " + daysToGrade); // 28

        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------");
        System.out.println(" ");

        // Post-increment
        /*
        * This is when the increment is used after the variable. Example --> lives++
        * The variable "lives" is first used in an expression and then incremented by 1.
        * That is, the value of "lives" will be incremented after the expression in which it is used
        * has been evaluated.
        * */
        int lives = 15;
        lives++; // 16

        int totalLives = 100 + lives++; // totalLives is 116

        System.out.println("Total lives: " + totalLives); // 116
        System.out.println("Lives: " + lives); // 17

        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------");
        System.out.println(" ");

        // Pre-increment
        /*
        * This is when the increment is used before the variable. Example --> --breads
        * The variable "breads" is decremented by 1 and then used in the expression.
        * This means that the value of "breads" will be decremented before any expression using
        * the variable is evaluated.
        * */
        int breads = 20;
        --breads; // 19

        int breadsBag = 50 - --breads; // breadsBag is 32

        System.out.println("Breads in bag: " + breadsBag); // 32
        System.out.println("Breads: " + breads); // 18
    }
}

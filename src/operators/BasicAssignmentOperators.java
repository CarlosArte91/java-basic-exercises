package operators;

public class BasicAssignmentOperators {
    public static void main(String[] args) {
        /*
        * The main assignment operator is '=', however, when you want to reassign a
        * variable using basic mathematical operation, you can use the '=' operator
        * in combination with such operations.
        * */
        double numberA = 5;
        double numberB = 8;

        // Long form of reassignment
        numberA = numberA + numberB;
        numberA = numberA - numberB;
        numberA = numberA * numberB;
        numberA = numberA / numberB;
        numberA = numberA % numberB;

        System.out.println("Number A result with long form: " + numberA);

        // Shortcut
        numberA += numberB;
        numberA -= numberB;
        numberA *= numberB;
        numberA /= numberB;
        numberA %= numberB;

        System.out.println("Number A result with shortcut: " + numberA);
    }
}

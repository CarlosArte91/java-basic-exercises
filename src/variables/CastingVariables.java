package variables;

public class CastingVariables {
    public static void main(String[] args) {
        /*
        * Casting the variable type.
        * Variables can be cast (change type) in 2 ways.
        * 1 - Implicitly or automatically
        * 2 - Specifically
        * */

        /*
        * 1 - Implicitly or automatically
        * Automatic casting can only be done whenever the number to be cast is smaller than
        * what is allowed in the selected type.
        * When automatic casting is allowed, the data conversion occurs after the operation.
        * */
        int holidaysPerYear = 18;
        int yearMonths = 12;
        double holidaysPerMonth = holidaysPerYear / yearMonths;
        System.out.println("Holidays per month with casting implicitly: " + holidaysPerMonth);

        // When casting a char data to an int, the int takes the ASCII value of the char.
        char age = '3';
        int ageInt = age;
        System.out.println("Age in integer is: " + ageInt);

        /*
        * 2 - Specifically
        * To perform specific casting, the desired type is written in the code.
        * */
        double monthlyAverageSpending = 42835.95 / 12;
        System.out.println("Monthly average spending: " + monthlyAverageSpending);

        // When casting a decimal to an integer, the decimal part is simply removed.
        int estimatedAverageSpending = (int) monthlyAverageSpending;
        System.out.println("Estimated average spending: " + estimatedAverageSpending);

        int hoursWorked = 68;
        int daysWorked = 6;
        int averageDailyHours = hoursWorked / daysWorked;
        System.out.println("Average daily hours worked: " + averageDailyHours);

        // When a more precise value is required, the integer can be cast to a decimal.
        double exactHours = (double) hoursWorked / daysWorked;
        System.out.println("Exact amount of hours worked: " + exactHours);
    }
}

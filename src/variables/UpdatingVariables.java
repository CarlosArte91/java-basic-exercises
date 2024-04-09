package variables;

public class UpdatingVariables {
    public static void main(String[] args) {
        double amountHourExtra = 10.0;
        double amountCuponFood = 35.3;
        double salary = 1000.0;
        double penssion = 50;
        double bono = 200.0;
        double totalHoursExtra = 10.5;
        double totalCuponsFood = 4.0;

        System.out.println("**********PAYS***********");
        System.out.println("salary: $" + salary);
        System.out.println("bono: $" + bono);
        System.out.println("Hours extra: $" + (totalHoursExtra * amountHourExtra));

        System.out.println("**********DEDUCTIONS***********");
        System.out.println("Penssion: $" + penssion);
        System.out.println("Food: $" + (totalCuponsFood * amountCuponFood));

        totalHoursExtra = totalHoursExtra * amountHourExtra;
        totalCuponsFood = totalCuponsFood * amountCuponFood;
        salary = salary + bono + totalHoursExtra - penssion - totalCuponsFood;

        System.out.println("---------------------------------");
        System.out.println("TOTAL PAY: $" + salary);
    }
}

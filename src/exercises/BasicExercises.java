package exercises;

public class BasicExercises {

    public static void main(String[] args) {
        // Variables exercises
        // My family
        String wifeFirstName = "Andrea";
        String wifeLastName = "Santo Domingo";
        int wifeAge = 35;
        char wifeId = 'M';
        double wifeWeight = 60.59;
        float wifeHeight = 1.67F;

        String sonFirstName = "Luis";
        String sonLastName = "Cortez Santo Domingo";
        int sonAge = 8;
        char sonId = 'J';
        double sonWeight = 20.45;
        float sonHeight = 1.12F;

        // Casting exercises
        char c = 'z'; // convert to int
        int charToInt = (int) c;

        System.out.println("Conversion type: Explicit");
        System.out.println("char to int => " + charToInt);
        System.out.println("Calculation type: N/A");
        System.out.println("**************************************");

        int i = 250; // Convert to long and letter to short
        long intToLong = i;

        System.out.println("Convertion type: Implicit");
        System.out.println("int to long => " + intToLong);
        System.out.println("Calculation type: N/A");
        System.out.println("**************************************");

        short longToShort = (short) intToLong;

        System.out.println("Convertion type: Explicit");
        System.out.println("long to short => " + longToShort);
        System.out.println("Calculation type: N/A");
        System.out.println("**************************************");

        double d = 301.067;
        long doubleToLong = (long) d;

        System.out.println("Convertion type: Explicit");
        System.out.println("double to long => " + doubleToLong);
        System.out.println("Calculation type: Estimation");
        System.out.println("**************************************");

        i = 100;
        float intToFloat = i + 5000.66F;

        System.out.println("Convertion type: Implicit");
        System.out.println("int to float => " + intToFloat);
        System.out.println("Calculation type: Accuracy");
        System.out.println("**************************************");

        i = 737 * 100;
        byte intToByte = (byte) i;

        System.out.println("Convertion type: Explicit");
        System.out.println("int to byte => " + intToByte);
        System.out.println("Calculation type: N/A");
        System.out.println("**************************************");

        d = 298.638 / 25;
        doubleToLong = (long) d;

        System.out.println("Convertion type: Explicit");
        System.out.println("double to long => " + doubleToLong);
        System.out.println("Calculation type: Estimation");
        System.out.println("**************************************");
    }

}

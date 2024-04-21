package classes;

public class MathOperations {
    public static void main(String [] args) {
        // Methods of the Math class

        double x = 2.5;
        double y = 4;
        double result = 0;

        // ceil --> This method rounds a decimal number to the next digit.
        result = Math.ceil(x);
        System.out.println("ceil method --> " + result);

        // floor --> This method rounds a decimal number to the previous digit.
        result = Math.floor(x);
        System.out.println("floor method --> " + result);

        // pow --> Method to raise a number to the power of n.
        result = Math.pow(x, y);
        System.out.println("pow method --> " + result);

        // max --> Returns the greater of two double values.
        result = Math.max(x, y);
        System.out.println("max method --> " + result);

        // sqrt --> Returns the correctly rounded positive square root of a double value.
        result = Math.sqrt(y);
        System.out.println("sqrt method --> " + result);

        // Mathematical calculations using Math

        // Calculate the area of a circle with a radius of 3 meters.
        double circleRadius = 3;
        double circleArea = Math.PI * Math.pow(circleRadius, 2);
        System.out.println("The area of the circle is: " + circleArea + " meters.");

        // Calculate the area of a sphere with a radius of 5 meters.
        double sphereRadius = 5;
        double sphereArea = 4 * Math.PI * Math.pow(sphereRadius, 2);
        System.out.println("The area of the sphere is: " + sphereArea + " meters.");

        // Calculate the volume of a sphere with a radius of 4.5 meters.
        sphereRadius = 4.5;
        double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(sphereRadius, 3);
        System.out.println("The volume of the sphere is: " + sphereVolume + " cubic meters.");
    }
}

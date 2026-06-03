public class TypeCastingExample {

    public static void main(String[] args) {

        // Double to int conversion
        double decimalValue = 45.78;

        int convertedInt = (int) decimalValue;

        System.out.println("Double value : " + decimalValue);

        System.out.println("Converted int value : " + convertedInt);

        // Int to double conversion
        int number = 25;

        double convertedDouble = (double) number;

        System.out.println("Integer value : " + number);

        System.out.println("Converted double value : " + convertedDouble);
    }
}
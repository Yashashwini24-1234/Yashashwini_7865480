public class OperatorPrecedance {

    public static void main(String[] args) {

        int result1 = 10 + 5 * 2;

        int result2 = (10 + 5) * 2;

        int result3 = 20 - 4 / 2;

        int result4 = 8 + 2 * 3 - 4;

        System.out.println("Result of 10 + 5 * 2 = " + result1);

        System.out.println("Result of (10 + 5) * 2 = " + result2);

        System.out.println("Result of 20 - 4 / 2 = " + result2);

        System.out.println("Result of 8 + 2 * 3 - 4 = " + result4);

        System.out.println("\nExplanation:");

        System.out.println("Multiplication and division are performed before addition and subtraction.");

        System.out.println("Expressions inside brackets are evaluated first.");
    }
}
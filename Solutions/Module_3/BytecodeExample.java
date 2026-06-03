public class BytecodeExample {

    // Method to add two numbers
    public int add(int a, int b) {

        return a + b;
    }

    public static void main(String[] args) {

        BytecodeExample obj = new BytecodeExample();

        int result = obj.add(10, 20);

        System.out.println("Result = " + result);
    }
}
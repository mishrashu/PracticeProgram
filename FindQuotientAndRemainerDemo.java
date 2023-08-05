public class FindQuotientAndRemainerDemo {
    public static void main(String[] args) {
        //Write a Java program to find the quotient and remainder when 72 is divided by 5.
        int num1 = 72;
        int num2 = 5;
        int quotient;
        int remainder;

        quotient = num1 / num2;
        remainder = num1 % num2;

        System.out.println("Quotient for " + num1 + " and " + num2 + " = " + quotient);
        System.out.println("Remainder for " + num1 + " and " + num2 + " = " + remainder);
    }
}

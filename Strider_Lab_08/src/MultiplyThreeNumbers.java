public class MultiplyThreeNumbers
{
    public static void main(String[] args)
    {
        int num1 = 2;
        int num2 = 3;
        int num3 = 4;

        int result = multiplyThreeNumbers(num1, num2,num3);
        System.out.println("The product is: " + result);

    }
    public static int multiplyThreeNumbers(int a, int b, int c)
    {
        int product = a * b * c;
        return product;

    }
}
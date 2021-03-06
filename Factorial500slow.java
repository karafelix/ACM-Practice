import java.util.Scanner;
import java.math.BigInteger;

public class Factorial500slow
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;

        while (sc.hasNextInt())
        {
            n = sc.nextInt();
            BigInteger fact = BigInteger.ONE;
            for (int i = 2; i <= n; i++)
                fact = fact.multiply(BigInteger.valueOf(i));

            System.out.printf("%d!\n%d\n", n, fact);
        }
    }
}

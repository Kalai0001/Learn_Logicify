import java.util.*;
import java.math.BigInteger;

public class Main48 {

    public static boolean isPower(BigInteger a, BigInteger b) {

        if (a.equals(BigInteger.ONE)) {
            return b.equals(BigInteger.ONE);
        }

        if (a.equals(BigInteger.ZERO)) {
            return b.equals(BigInteger.ZERO);
        }

        if (b.equals(BigInteger.ONE)) {
            return true;
        }

        if (a.compareTo(BigInteger.ONE) <= 0 || b.compareTo(BigInteger.ONE) < 0) {
            return false;
        }

        BigInteger product = a;

        while (product.compareTo(b) < 0) {
            product = product.multiply(a);
        }

        return product.equals(b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());

        if (isPower(a, b) || isPower(b, a)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

        sc.close();
    }
}
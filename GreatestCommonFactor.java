import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("---Tim UCLN---");

        System.out.println("Nhap vao so a :");
        int a = scanner.nextInt();

        System.out.println("Nhap vao so b :");
        int b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung lớn nhất");
        }

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("UCLN la " + a);

    }
}

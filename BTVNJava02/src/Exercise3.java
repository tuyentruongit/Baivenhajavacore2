import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Tính chu vi và diện tích hình chữ nhật.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài của hình chữ nhật :");
        double a = scanner.nextDouble();
        System.out.println("Nhập chiều rộng của hình chữ nhật :");
        double b = scanner.nextDouble();
        System.out.println(" Chu vi hình chữ nhật là :" + " ( " + a + " + " + b + " ) x 2 = " +( a + b ) * 2 );
        System.out.println(" Chu diện tích chữ nhật là :" + a + " x " + b + " = " + a*b);
    }
}

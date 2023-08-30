import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình bậc nhất : ax + b = 0 ( Với a khác 0)");
        System.out.print("Nhập hệ số a : ");
        double a = scanner.nextInt();
        String condition = ( a == 0) ? "Phương trình không phải là phương trình bậc nhất." : "Nhập hệ Số b : ";
        System.out.print(condition);
        double b = scanner.nextInt();
        System.out.println("Phương trình: " + a + "x + "+ b + " = 0 ");
        double x = -b/a;
       System.out.println("Phương trình trên có nghiệm là : X = " + (double)Math.round(x * 100)/100);


    }
}

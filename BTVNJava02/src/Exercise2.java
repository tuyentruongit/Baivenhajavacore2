import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình bậc nhất : ax2 + bx = 0 ( Với a khác 0)");
        System.out.print("Nhập hệ số a : ");
        int a = scanner.nextInt();
        String condition = ( a == 0) ? "Phương trình không phải là phương trình bậc hai." : "Nhập hệ Số b : ";
        System.out.print(condition);
        int b = scanner.nextInt();
        System.out.print("Nhập hệ số c : ");
        int c = scanner.nextInt();
        System.out.println("Giải phương trình "+ a + "x2 + " + b + "x +" + c + " = 0");
        double delta = (double)b*b - 4 *a *c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        double x1x2 = -b / (2 * a);
        String abc = ( delta>0)? ("x1 = "+ x1)+","+("x2 = "+ x2) :"" ;
        String abc2 = ( delta==0 )? ("Phương Trình có  nghiệm kép : "+ x1x2):"";
        String abc3 = ( delta < 0) ? " Phương trình vô nghiệm":"";





    }
}

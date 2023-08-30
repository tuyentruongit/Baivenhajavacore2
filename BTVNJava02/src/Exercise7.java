import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tính chu vi và diện tích của hình tròn.");
        System.out.print(" Nhập bán kính của hình tròn : ");
        double a = scanner.nextDouble();
        double C = 2*Math.PI*a;
        double S =  (a*a)*Math.PI;
        System.out.println(" Chu vi của hình tròn là :" + (double)Math.round(C*1000)/1000);
        System.out.println(" Diện tích của hình tròn là :" + (double)Math.round(S*1000)/1000);
    }

}

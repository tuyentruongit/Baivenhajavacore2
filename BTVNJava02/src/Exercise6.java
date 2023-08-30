import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh a : ");
        double a = scanner.nextDouble();
        System.out.println("Nhập độ dài cạnh b : ");
        double b = scanner.nextDouble();
        double z = Math.sqrt(a*a+b*b);
        System.out.println("Độ dài cạnh huyền là : "+ z);
        //Sin của mot goc trong tam giac
        double sina = b/z;
        double cosa = a/z;
        System.out.println("Sin góc  a : " + (double)Math.round(sina*100)/100 );
        System.out.println("Cos góc  a : " + (double)Math.round(cosa*100)/100 );



    }
}

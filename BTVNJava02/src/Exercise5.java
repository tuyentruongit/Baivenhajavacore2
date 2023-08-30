import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("Bài tập 5 Phần A");
        String name = "Truong Van Tuyen";
        System.out.println("Ta có chuỗi kí tự:  "+name);
        System.out.println("Kí Tự \"n\"xuất hiện đầu tiên ở vị trí : "+name.indexOf('n'));
        System.out.println("Kí Tự \"n\"xuất hiện cuối cùng ở vị trí : "+name.lastIndexOf('n'));

        System.out.println("------------------------------------------------");
        System.out.println("Bài tập 5 Phần B");
        String s = "Tieng Anh cho nguoi bat dau.";
        System.out.println("Ta có chuỗi kí tự : "+s);
        String s1 = "ng";
        String s2 = "2310";
        System.out.println("Ta thay thế kí tự " + "'"+s1+"'" + " bằng kí tự " +"'"+s2+"'"+ " ta được chuỗi kí tự mới : ");
        System.out.println(s.replace(s1,s2));





    }
}

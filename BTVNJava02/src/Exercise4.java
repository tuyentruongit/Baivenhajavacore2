import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      System.out.println("Nhập ngày tháng năm sinh của bạn (dd/MM/yyyy) : ");
       String input = scanner.nextLine();
        String today = "30/08/2023";
        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate1 = LocalDate.parse(input,dateTimeFormatter);
        LocalDate localDate2 = LocalDate.parse(today,dateTimeFormatter);
        long age = ChronoUnit.YEARS.between(localDate1,localDate2);
        System.out.println("Tuổi của bạn là :"+ age);

    }
}

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите число - ");
        try {
        double number = Double.parseDouble(input.next());
        if (number > 7){
            System.out.print("Привет");
        }
        } catch (Exception exception) {
            System.out.println("Ошибка! Нужно вводить только часла.");
        }
        input.close();
    }
}

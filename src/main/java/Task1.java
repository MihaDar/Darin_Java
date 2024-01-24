import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите число - ");
        int number = input.nextInt();
        if (number > 7){
            System.out.print("Привет");
        }
        input.close();
    }
}

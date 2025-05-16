import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check : ");
        int number = sc.nextInt();
        System.out.print(isArmstrong(number));
    }
    static boolean isArmstrong(int number){
        int original = number;
        int sum = 0;
        while (number > 0){
            int rem = number % 10;
            number = number / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;
    }
}
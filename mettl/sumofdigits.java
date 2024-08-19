
import java.util.Scanner;
public class sumof {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        
       
        for (int num = number; num > 0; num /= 10) {
            
            sum += num % 10;
        }
        
       
        System.out.println("Sum of digits: " + sum);
        
        scanner.close();
    }

}

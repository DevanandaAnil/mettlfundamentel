import java.util.Scanner;
public class colorcode {
 

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a color code (e.g., R, B, G, O, Y, W): ");
        
        String input = scanner.nextLine().trim().toUpperCase();
        
        switch (input) {
            case "R":
                System.out.println("Red");
                break;
            case "B":
                System.out.println("Blue");
                break;
            case "G":
                System.out.println("Green");
                break;
            case "O":
                System.out.println("Orange");
                break;
            case "Y":
                System.out.println("Yellow");
                break;
            case "W":
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid Code");
                break;
        }

    }
}
   

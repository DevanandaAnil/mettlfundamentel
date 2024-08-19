public class Characterc {
 
        public static void main(String[] args) {
            char ch = 'a'; 
            if (Character.isLowerCase(ch)) {
                char upperCh = Character.toUpperCase(ch);
                System.out.println(ch + "->" + upperCh);
            } else {
                System.out.println("The character is not a lowercase letter.");
            }
        }
    }

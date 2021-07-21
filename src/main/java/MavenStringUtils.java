
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;




public class MavenStringUtils {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say something I'm giving up on you: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: " + userInput);
        if (StringUtils.isNumeric(userInput)){
            System.out.println(userInput + "is a number");
        }else{
            System.out.println(userInput + "is not a number");
        }
        System.out.println("Flipped case: " + StringUtils.swapCase(userInput));

        System.out.println("Reversed case: " + StringUtils.reverse(userInput));
    }
}

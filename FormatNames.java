import java.text.Format;
import java.util.Scanner;

public class FormatNames {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Formatter uFormatter = new Formatter_u();// the formater for Upper case display
        Formatter hFormatter = new Formatter_h();// the formater for html display
        String file;
        System.out.println("enter the file name");
        file = scanner.nextLine();
        System.out.println("enter the other file name");
        String output = scanner.nextLine();


        if (args[0].equals("-u")) {
            uFormatter.inputTaker(file);
            uFormatter.outputMaker(output);
        }
        if (args[0].equals("-h")) {
            hFormatter.inputTaker(file);
            hFormatter.outputMaker(output);
        }

    }
}
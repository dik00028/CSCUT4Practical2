import java.text.Format;
import java.util.Scanner;

public class FormatNames {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Formatter uFormatter = new FormatterU();// the formater for Upper case display
        Formatter hFormatter = new FormatterHTML();// the formater for html display
        String file;
        System.out.println("enter the file name");
        file = scanner.nextLine();//get the file name and pass it to the corresponding class
        System.out.println("enter the other file name");
        String output = scanner.nextLine();//get the ouput name and pass it to the corresponding class


        if (args[0].equals("-u")) {// arguments passed
            uFormatter.inputTaker(file); //if -u go to this formatter
            uFormatter.outputMaker(output);
        }
        if (args[0].equals("-h")) { //arguments passed
            hFormatter.inputTaker(file);// if -h go to this Formatter
            hFormatter.outputMaker(output);
        }

    }
}
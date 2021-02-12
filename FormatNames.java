import java.text.Format;
import java.util.Scanner;

public class FormatNames {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Formatter uFormatter = new FormatterU();// the formater for Upper case display
        Formatter hFormatter = new FormatterHTML();// the formater for html display
        Formatter mFormatter = new FormatterM();
        Formatter tFormatter = new FormatterT();
        String file;
        System.out.println("enter the other file name");
        if (args[0].equals("-u")) {
            uFormatter.inputTaker(args[1]);//just for now
            uFormatter.outputMaker(args[2]);// just for now
        }
        if (args[0].equals("-h")) {
            hFormatter.inputTaker(args[1]);
            hFormatter.outputMaker(args[2]);
        }
        if (args[0].equals("-m")) {
            mFormatter.inputTaker(args[1]);
            mFormatter.outputMaker(args[2]);
        }
        if (args[0].equals("-t")) {
            tFormatter.inputTaker(args[1]);
            tFormatter.outputMaker(args[2]);
        }

    }
}
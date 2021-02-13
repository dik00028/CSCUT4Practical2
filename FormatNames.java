/**
 * author : Dion Kadriu
 * A java program to format text based on the argument passed
 */

public class FormatNames {

    /**
     * Main class where the formatting is going to match the argument
     */
    public static void main(String[] args) {

        Formatter uFormatter = new FormatterU();// the formatter for Upper case display
        Formatter hFormatter = new FormatterHTML();// the formatter for html display
        Formatter mFormatter = new FormatterM();//the formatter for the middle names
        Formatter tFormatter = new FormatterT();// the formatter for the title case

        if (args[0].equals("-u")) {  //if the argument is -u manipulate like the uFormatterClass
            uFormatter.inputTaker(args[1]);
            uFormatter.outputMaker(args[2]);
        }
        if (args[0].equals("-h")) {  //if the argument is -u manipulate like the hFormatterClass
            hFormatter.inputTaker(args[1]);
            hFormatter.outputMaker(args[2]);
        }
        if (args[0].equals("-m")) {  //if the argument is -u manipulate like the mFormatterClass
            mFormatter.inputTaker(args[1]);
            mFormatter.outputMaker(args[2]);
        }
        if (args[0].equals("-t")) {  //if the argument is -u manipulate like the tFormatterClass
            tFormatter.inputTaker(args[1]);
            tFormatter.outputMaker(args[2]);
        }

    }
}
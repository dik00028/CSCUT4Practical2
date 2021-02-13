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
        /**
         * argument 1 will be the input while argument two the output
         */
        try {
            if (args[0].equals("-help")){
                System.out.println("The format for the input should be : format -u , -t, -h, -m + input + output");
                System.out.println("-u : to upper case format");
                System.out.println("-h : create html file in title case format");
                System.out.println("-m : middle name format ");
                System.out.println("-t : to title case format");
            }
            if (args[0].equals("-u")) {  //if the argument is -u manipulate like the uFormatterClass
                uFormatter.inputTaker(args[1]);
                uFormatter.outputMaker(args[2]);
            }
            if (args[0].equals("-h")) {  //if the argument is -h manipulate like the hFormatterClass
                hFormatter.inputTaker(args[1]);
                hFormatter.outputMaker(args[2]);
            }
            if (args[0].equals("-m")) {  //if the argument is -m manipulate like the mFormatterClass
                mFormatter.inputTaker(args[1]);
                mFormatter.outputMaker(args[2]);
            }
            if (args[0].equals("-t")) {  //if the argument is -t manipulate like the tFormatterClass
                tFormatter.inputTaker(args[1]);
                tFormatter.outputMaker(args[2]);
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.err.println("missing arguments, press : -help to see the arguments ");;
        }
    }
}
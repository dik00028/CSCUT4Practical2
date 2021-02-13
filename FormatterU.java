
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Formats the data into uppercase
 */
public class FormatterU implements Formatter {

    String formattedData;

    @Override
    public String inputTaker(String filename) {
        FormatterM formatterM = new FormatterM();//creates an instance for base class of formatting inputs
        this.formattedData = formatterM.inputTaker(filename);//set it to the private String of this class
        return this.formattedData;
    }

    @Override
    public void outputMaker(String filename) {
        try {

            PrintWriter outputFile = new PrintWriter(filename);//take the file name  from the parameter as the file that is going to be created

            outputFile.format("%S", this.formattedData);// formats the letters to be in capital form
            outputFile.close();//terminates
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException: " + e.getMessage() + " not openable");
            System.exit(0);
        }
    }

}

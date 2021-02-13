import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Formats the data into uppercase
 */
public class FormatterU implements Formatter {

    String formattedData;

    @Override
    public String inputTaker(String filename) {
        FormatterM formatterM = new FormatterM();
        this.formattedData = formatterM.inputTaker(filename);
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

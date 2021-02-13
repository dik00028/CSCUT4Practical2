
import jdk.jfr.TransitionFrom;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Generates a new html file based on the input
 */


public class FormatterHTML implements Formatter {

    private String formattedData;
    SimpleDateFormat s = new SimpleDateFormat();

    @Override
    public String inputTaker(String filename) {
        FormatterM formatterM= new FormatterM();
        this.formattedData= formatterM.inputTaker(filename).replace("\n","<br>");
        return this.formattedData;
    }

    @Override
    public void outputMaker(String filename) {
        try {
            PrintWriter outputFile = new PrintWriter(filename + ".html");//turning it to a html file
            outputFile.println("<html>");
            outputFile.println("<head>");
            outputFile.println("</head>");
            outputFile.println("<body>");
            outputFile.println("<p style=\"color:blue;\"");
            outputFile.format(this.formattedData);// the names and dates added
            outputFile.println("</p>");
            outputFile.println("</body>");
            outputFile.println("</html>");
            outputFile.close();
            System.out.println("HTML is done");
        } catch (FileNotFoundException e) {  // catching the exception where no file is presented
            System.err.println("FileNotFoundException: " + e.getMessage() + " not openable");System.exit(0);
        }
    }

}

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.tools.JavaFileManager;
import java.lang.Number;
import java.util.logging.SimpleFormatter;
import java.text.ParsePosition;

/**
 * CSCU9T4 Java strings and files exercise.
 */
public class FilesInOut {
    public static void main(String[] args) {

        SimpleDateFormat s = new SimpleDateFormat("ddMMyyyy");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner in = new Scanner(System.in);
        System.out.println("supply filename for input:");


        Date date = null;
        String formattedData = "";//used to add the formated names and dates together in the end
        try {
            String inputFileName = in.nextLine();//gets the name of the file and supplies it as the path
            File inputFile = new File(inputFileName);
            Scanner inFile = new Scanner(inputFile);//scanning the file

            while (inFile.hasNextLine()) {
                String fileContent = inFile.nextLine();//stores the value of each line
                String dateFormatter = fileContent.replaceAll("[^0-9]", "");//stores only the numbers in order to parse them
                date = s.parse(dateFormatter);//parses the numbers to dates
                String nameFormatter = fileContent.replaceAll("[^a-zA-Z]", " ");//stores only the string values

                formattedData = formattedData.concat(nameFormatter).concat(simpleDateFormat.format(date) + "\n");//names and dates are grouped here


            }

        } catch (IOException | ParseException e) {
            System.err.println("IOException: " + e.getMessage()
                    + "not found ");
        }
        System.out.println(formattedData);

        System.out.println("supply filename for output:");


        try {

            String filename = in.nextLine();//get the name of the file that is going to be created
//            String filename = "OutputFile.txt";

            PrintWriter outputFile = new PrintWriter(filename);

            outputFile.format("%S", formattedData);// formats the letters to be in capital form
            outputFile.close();//terminates
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException: " + e.getMessage() + " not openable");
            System.exit(0);
        }
    }
}

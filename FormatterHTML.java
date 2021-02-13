
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
    private String nameFormatter = "";
    SimpleDateFormat s = new SimpleDateFormat();

    @Override
    public String inputTaker(String filename) {
        s = new SimpleDateFormat("ddMMyyyy");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner in = new Scanner(System.in);
        Date date = null;
        String formattedData = "";//used to add the formatted names and dates together in the end

        try {

            File inputFile = new File(filename);
            Scanner inFile = new Scanner(inputFile);//scanning the file

            while (inFile.hasNext()) {
                String fileContent = inFile.next();//stores the value of each line
                if (intOrNot(fileContent)) {
                    String dateFormatter = fileContent;//stores only the numbers in order to parse them
                    date = s.parse(dateFormatter);//parses the numbers to dates
                    formattedData = formattedData.concat(simpleDateFormat.format(date) + "<br>");
                } else {
                    String saveFirst = fileContent.substring(0, 1);

                    nameFormatter = fileContent.substring(1);
                    formattedData = formattedData.concat("<th>"+
                            saveFirst.toUpperCase() + nameFormatter + " ");
                }
                //names and dates are grouped here

            }
            this.formattedData = formattedData;//return the value of the string to pass it to the output

        } catch (IOException | ParseException e) {
            System.err.println("IOException: " + e.getMessage()
                    + "not found ");
        }
        return this.formattedData;
    }

    @Override
    public void outputMaker(String filename) {
        try {

            PrintWriter outputFile = new PrintWriter(filename + ".html");/////////////////////////
            outputFile.println("<html>");
            outputFile.println("<head>");
            outputFile.println("</head>");
            outputFile.println("<body>");
            outputFile.println("<p style=\"color:blue;\"");
            outputFile.format(this.formattedData);
            outputFile.println("</p>");
            outputFile.println("</body>");
            outputFile.println("</html>");
            outputFile.close();
            System.out.println("HTML is done");
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException: " + e.getMessage() + " not openable");
            System.exit(0);
        }

    }

    public boolean intOrNot(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException exception) {
            return false;
        }
        return true;
    }
}





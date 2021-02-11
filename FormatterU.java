import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FormatterU implements Formatter {
    SimpleDateFormat s;
    SimpleDateFormat simpleDateFormat;
    String formattedData;

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

            while (inFile.hasNextLine()) {
                String fileContent = inFile.nextLine();//stores the value of each line
                String dateFormatter = fileContent.replaceAll("[^0-9]", "");//stores only the numbers in order to parse them
                date = s.parse(dateFormatter);//parses the numbers to dates
                String nameFormatter = fileContent.replaceAll("[^a-zA-Z]", " ");//stores only the string values

                formattedData = formattedData.concat(nameFormatter).concat(simpleDateFormat.format(date) + "\n");//names and dates are grouped here

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

            PrintWriter outputFile = new PrintWriter(filename);//take the file name  from the parameter as the file that is going to be created

            outputFile.format("%S", this.formattedData);// formats the letters to be in capital form
            outputFile.close();//terminates
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException: " + e.getMessage() + " not openable");
            System.exit(0);
        }
    }

}


import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Generates a new html file based on the input
 */


public class FormatterHTML implements Formatter {

    private String formattedData;

    @Override
    public String inputTaker(String filename) {
        FormatterM formatterM= new FormatterM();//creating an instance of base class format
        this.formattedData= formatterM.inputTaker(filename).replace("\n","<br>");// replace every escape char with break for html
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


import java.io.FileNotFoundException;

import java.io.PrintWriter;


public class FormatterHTML implements Formatter {


    String formattedData;

    @Override
    public String inputTaker(String filename) {
        Formatter f = new FormatterU();
        f.inputTaker(filename);
        this.formattedData = f.inputTaker(filename);//reusing the formated string from FormatterU class
        System.out.println(this.formattedData);
        return this.formattedData;//returning it if needed for use
    }

    @Override
    public void outputMaker(String filename) {
        try {

            PrintWriter outputFile = new PrintWriter(filename + ".html");/////////////////////////
            outputFile.println("<html>");
            outputFile.println("<head>");
            outputFile.println("</head>");
            outputFile.println("<body>");
            outputFile.println("<p>");
            outputFile.format("%S", this.formattedData);
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

}

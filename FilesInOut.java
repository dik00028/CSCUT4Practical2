//import java.io.*;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
///**
// * CSCU9T4 Java strings and files exercise.
// */
//public class FilesInOut {
//    public static void main(String[] args) {
//
//        SimpleDateFormat s = new SimpleDateFormat("ddMMyyyy");
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        Scanner in = new Scanner(System.in);
//        System.out.println("supply filename for input:");
//
//
//        Date date = null;
//        String formattedData = "";//used to add the formatted names and dates together in the end
////        if (args[0].equals("-u")) {
//            try {
//
//                String inputFileName = in.nextLine();//gets the name of the file and supplies it as the path
//                File inputFile = new File(inputFileName);
//                Scanner inFile = new Scanner(inputFile);//scanning the file
//
//                while (inFile.hasNextLine()) {
//                    String fileContent = inFile.nextLine();//stores the value of each line
//                    String dateFormatter = fileContent.replaceAll("[^0-9]", "");//stores only the numbers in order to parse them
//                    date = s.parse(dateFormatter);//parses the numbers to dates
//                    String nameFormatter = fileContent.replaceAll("[^a-zA-Z]", " ");//stores only the string values
//
//                    formattedData = formattedData.concat(nameFormatter).concat(simpleDateFormat.format(date) + "\n");//names and dates are grouped here
//
//                }
//                System.out.println(formattedData);
//            } catch (IOException | ParseException e) {
//                System.err.println("IOException: " + e.getMessage()
//                        + "not found ");
//            }
//
//
//            System.out.println("supply filename for output:");
//
//
//            try {
//
//                String filename = in.nextLine();//get the name of the file that is going to be created
////            String filename = "OutputFile.txt";
//
//                PrintWriter outputFile = new PrintWriter(filename);
//
//                outputFile.format("%S", formattedData);// formats the letters to be in capital form
//                outputFile.close();//terminates
//            } catch (FileNotFoundException e) {
//                System.err.println("FileNotFoundException: " + e.getMessage() + " not openable");
//                System.exit(0);
//            }
//        }
//    }
//
////}
////Scanner scanner = new Scanner(System.in);
////    Scanner fileIn; //input file connection
////    PrintWriter fileOut; //HTML file connection
////    String filenameIn; //original file's name
////    String filenameOut; //new HTML file's name
////    int dotIndex; //position of . in filename
////    String line = null; // a line from the input file
//
//// 1. ask user for a file name (or file path)
//
////		System.out.println("Enter file name or path");
////                filenameIn = scanner.nextLine();
////
////                // 2. check if file exists
////
////                try {
////
////                //3. rename .txt as .html
////                fileIn = new Scanner(new FileReader(filenameIn));
////                dotIndex = filenameIn.lastIndexOf(".");
////                if(dotIndex == -1) {
////                filenameOut = filenameIn + ".html";
////                }
////                else {
////                filenameOut = filenameIn.substring(0,dotIndex) + ".html";
////                }
////                fileOut = new PrintWriter(filenameOut);
////
////                // 4. determine if file is empty
////
////                try {
////                line = fileIn.nextLine();
////                }
////                catch(NoSuchElementException e) {
////                System.out.println("Error: "+e.getMessage());
////                }
////                if(line==null) {
////                System.out.println("This file is empty :(");
////                }
////                else {
////                // 5. read each line and insert necessary <tags>
////                fileOut.println("<html>");
////                fileOut.println("<head>");
////                fileOut.println("</head>");
////                fileOut.println("<body>");
////                fileOut.println(line);
////
////                while(fileIn.hasNextLine()) {
////
////                fileOut.println("<br>");
////                line = fileIn.nextLine();
////
////                if(line.isEmpty()) {
////                fileOut.println("<br>");
////                }
////                else {
////                fileOut.println(line);
////                }
////
////                }
////                fileOut.println("</body>");
////                fileOut.println("</html>");
////
////                System.out.println("HTML file is processed :)");
////                }
////                fileIn.close();
////                fileOut.close();
////                }
////                catch(FileNotFoundException e) {
////                System.out.println("File not found");
////                }
////
////                }
////                }

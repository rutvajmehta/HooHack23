import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class CSVColumnDeleter {

    public static void main(String[] args) throws IOException {
        String inputFilePath = "2019-20.csv"; // path to input CSV file
        String outputFilePath = "2019-20-filtered.csv"; // path to output CSV file
        List<Integer> columnsToDelete = new ArrayList<>(); // list of column indexes to delete
        // columnsToDelete.add(0);
        columnsToDelete.add(1); // example: delete second column (index 1)
        // columnsToDelete.add(3);
        columnsToDelete.add(4);
        columnsToDelete.add(5);
        columnsToDelete.add(6);
        // columnsToDelete.add(7);
        columnsToDelete.add(8);
        columnsToDelete.add(9);
        columnsToDelete.add(10);
        // columnsToDelete.add(11);
        columnsToDelete.add(12);
        columnsToDelete.add(13);
        columnsToDelete.add(14);
        // columnsToDelete.add(15);
        columnsToDelete.add(16);
        columnsToDelete.add(17);
        columnsToDelete.add(18);
        // columnsToDelete.add(19);
        columnsToDelete.add(20);
        columnsToDelete.add(21);
        columnsToDelete.add(22);
        // columnsToDelete.add(23);
        columnsToDelete.add(24);
        columnsToDelete.add(25);
        columnsToDelete.add(26);
        // columnsToDelete.add(27);
        columnsToDelete.add(28);
        columnsToDelete.add(29);
        columnsToDelete.add(30);
        // columnsToDelete.add(31);
        columnsToDelete.add(32);
        columnsToDelete.add(33);
        columnsToDelete.add(34);
        // columnsToDelete.add(35);
        columnsToDelete.add(36);
        columnsToDelete.add(37);
        columnsToDelete.add(38);
        // columnsToDelete.add(39);
        columnsToDelete.add(40);

        // create a CSVParser to read the input file
        CSVParser parser = new CSVParser(new FileReader(inputFilePath), CSVFormat.DEFAULT);

        // create a CSVPrinter to write the output file
        CSVPrinter printer = new CSVPrinter(new FileWriter(outputFilePath), CSVFormat.DEFAULT);

        // iterate over each record in the input file
        for (CSVRecord record : parser) {
            List<String> modifiedRecord = new ArrayList<>();

            // iterate over each field in the record
            for (int i = 0; i < record.size(); i++) {
                // if the current column should not be deleted, add its value to the modified record
                if (!columnsToDelete.contains(i)) {
                    modifiedRecord.add(record.get(i));
                }
            }

            // write the modified record to the output file
            printer.printRecord(modifiedRecord);
        }

        // close the parser and printer to release resources
        parser.close();
        printer.close();
    }

}

// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

// public class FileInputExample {
//     public static void main(String[] args) {
//         try {
//             File inputFile = new File("input.txt");
//             Scanner scanner = new Scanner(inputFile);

//             while (scanner.hasNextLine()) {
//                 String line = scanner.nextLine();
//                 String[] values = line.split(",");

//                 for (String value : values) {
//                     System.out.print(value.trim() + " ");
//                 }
//                 System.out.println();
//             }

//             scanner.close();
//         } catch (FileNotFoundException e) {
//             System.out.println("File not found.");
//         }
//     }
// }

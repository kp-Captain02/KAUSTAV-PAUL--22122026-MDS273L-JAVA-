package Lab-7;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;

public class lab7 {
    public static void main(String args[]){
        String csvFile = "path/to/dataset.csv";

        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                // Process each line of the CSV dataset
                // Example: System.out.println(Arrays.toString(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

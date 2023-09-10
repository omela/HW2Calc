package epam.oksanaomelyanchuk;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ResultWriter {
   private FileWriter fileWriter;
    {
        try {
            fileWriter = new FileWriter("C:\\Users\\Oksana_Omelyanchuk\\IdeaProjects\\Caclulator\\calculationsResult");
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
    PrintWriter printWriter = new PrintWriter(fileWriter);
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();
    public ResultWriter()
    {
    }
    public void printToFile(Float numOne, String operator, Float numTwo, Float result)
    {
        printWriter.println("Calculation: "+ formatter.format(date));
        printWriter.printf("result: " + " %s " + " %s " + " %s " + " = %s \n", numOne.toString(), operator, numTwo.toString(), result.toString());
        printWriter.close();
                 System.out.println("Your result is ready, please check the file ");
    }
    public void printToFile(Float numOne, String operator, Float result)
    {
        printWriter.println(String.format("Calculation: "+ formatter.format(date)));
        printWriter.printf("result: " + " %s " + " %s " + " = %s \n", numOne.toString(), operator, result.toString());
        printWriter.close();
                 System.out.println("Your result is ready, please check the file ");
    }
}

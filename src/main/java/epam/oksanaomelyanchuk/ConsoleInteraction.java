package epam.oksanaomelyanchuk;

import java.io.IOException;

public class ConsoleInteraction {
private static Boolean b=true; //flag that indicates if User will continue work or willing to leave after calculation is done
        public static void ui() throws IOException
        {
        InputReader input = new InputReader();
while(b)
{
    System.out.println("please enter a value within range ( -20 to 20)");
        input.scanning();
        input.scanningOperatorValue();

           if(input.singleOrDoubleValueOperation().booleanValue()==false) // we can have one operand calculation or two
           {
               System.out.println("please enter a value within range ( -20 to 20)");
               input.scanning();
               input.readOperatorOneMore();
           }
    System.out.println("Would you like to continue? if yes type YES");
    b=input.scanYesNo();

}
        }

}

package epam.oksanaomelyanchuk;


import java.io.IOException;
import java.util.Scanner;

public class InputReader {

      enum Operator
      { //these are of allowed operators
            ADD,
            DIV,
            MULTY,
            SQUAREROOT,
            SUBSTR,
            TOTHESECONDPOWER
        }
   private float operandValue;
  private  float number;
  private Operator operator;
     public void scanning()
     {
         Scanner sc = new Scanner(System.in);
        if(sc.hasNextFloat())
        {
         operandValue=sc.nextFloat();
         if (operandValue <=20 && operandValue>= -20){
         }
         else
         {
             System.out.println("\n Please enter correct operand value");scanning();
         }
         } System.out.println("\n Please enter correct operand value");scanning();
     }
public void scanningOperatorValue()
{ System.out.println("enter operation you want to perform: * , + , - , / , SQUAREROOT , TOTHESECONDPOWER");
    Scanner sc = new Scanner(System.in);
    String operatorValue = sc.next();
    switch (operatorValue)
    {
        case "*": operator =  Operator.MULTY;
        break;
        case "+": operator =  Operator.ADD;
        break;
        case "-": operator = Operator.SUBSTR;
        break;
        case "/":operator = Operator.DIV;
        break;
        case"SQUAREROOT":operator = Operator.SQUAREROOT;
        break;
        case"TOTHESECONDPOWER":operator = Operator.TOTHESECONDPOWER;
        break;
        default: {System.out.println("\n Please select a valid operator");  scanningOperatorValue();}
    }
}
public Boolean singleOrDoubleValueOperation() throws IOException
{
    if (operator== Operator.SQUAREROOT || operator== Operator.TOTHESECONDPOWER){new Calculations().math(operandValue,operator); return true;}
    else{ number = operandValue; return false; }
}
public void readOperatorOneMore()
{
    { float secondNumber=operandValue;
    new Calculations().math(number,operator,secondNumber);}
}
    public Boolean scanYesNo()
    {
        Scanner sc1 = new Scanner(System.in);
        String value = sc1.next();
        switch (value)
        {
            case "YES":  return true;
            default: return false;
        }
    }

}





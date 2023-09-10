package epam.oksanaomelyanchuk;


import static epam.oksanaomelyanchuk.InputReader.*;

public class Calculations {
   private Float result;
    private final ResultWriter resultWriter = new ResultWriter();
    public void math(float number, Operator operator)
    {
        if(operator==Operator.SQUAREROOT)

        {
            if (number<0)
            {
                System.out.println("can not perfotm this operation, please enter number greater than 0 ");
            }else{
           result= (float) Math.sqrt(number);
            System.out.println("total = "+ result);
                resultWriter.printToFile(number,operator.name(),result);}
        }else if ((operator==Operator.TOTHESECONDPOWER))
        {
            result=number*number;
            System.out.println("total = "+ result);
            resultWriter.printToFile(number,operator.name(),result);
        }
    }
    public void math(float number, Operator operator, float secondNumber)
    {
        String operatorValue;
        switch (operator)
        {
            case MULTY: result=number*secondNumber; operatorValue="*";
                 resultWriter.printToFile(number, operator.name(), secondNumber, result); break;
            case ADD: result=number+secondNumber;operatorValue="+";
                resultWriter.printToFile(number, operator.name(), secondNumber, result); break;
            case SUBSTR: result=number-secondNumber;operatorValue="-";
                resultWriter.printToFile(number, operator.name(), secondNumber, result); break;

            case DIV: if (secondNumber!=0)
            {
                result=number/secondNumber; operatorValue="/";
                resultWriter.printToFile(number, operatorValue, secondNumber, result);
            } else {System.out.println("\n Cannot divide by zero.");}  break;

        }
    }

}


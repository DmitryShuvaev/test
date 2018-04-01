/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author DmShu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
Calculator c = new CalculatorImpl();
System.out.println(c.evaluate("(1+38)*4-5")); // Result: 151
System.out.println(c.evaluate("7*6/2+8")); // Result: 29
System.out.println(c.evaluate("-12)1//(")); // Result: null
*/
        Calculator c=new Calculator("1+3+5");
        char v='a';
       // System.out.println(c.calc());
        /*
        c.get_token();
                System.out.println("counter ="+c.counter);
                    c.get_token();
                System.out.println("counter ="+c.counter);
                    c.get_token();
                System.out.println("counter ="+c.counter);
        String str="12";
        v=str.charAt(0);
         System.out.println(v);
*/
              // An equation with +, -, /, *
        String anotherEquation = "2-3*2"; // 85
        double another = computeAnother(anotherEquation);
        System.out.println(another);
        //
        Calcul itp=new Calcul();
    System.out.println("The Postfix expression for A*B-(C+D)+E is: " + itp.infixToPostfix("A*B-(C+D)+E"));
    System.out.println("The Postfix expression for 1+2*4/5-7+3/6 is: " + itp.infixToPostfix("2.2*3.4+5.1"));
   // System.out.println("The Postfix expression for a+(b*c)/d is: " + itp.infixToPostfix("a+(b*c)/d"));
        //System.out.println("The res is: " + itp.evalPf("23*"));
        Calculat calc=new Calculat();
          System.out.println(calc.calc("2+3*5"));
          EvaluateString as=new EvaluateString();
          try{
             System.out.println(as.evaluate("(10+2)*3"));
          }     catch (Exception e){  System.out.println(e); }
            //as.addSpaces(" 2.15   +3  *  4.5");
    }
    static double computeAnother(String equation) {
        double result = 0.0;
        String noMinus = equation.replace("-", "+-");
        String[] byPluses = noMinus.split("\\+");
 System.out.println("noMinus="+byPluses[0]);
  System.out.println("noMinus="+byPluses[1]);
        for (String multipl : byPluses) {
            String[] byMultipl = multipl.split("\\*");
            double multiplResult = 1.0;
            for (String operand : byMultipl) {
                if (operand.contains("/")) {
                    String[] division = operand.split("\\/");
                    double divident = Double.parseDouble(division[0]);
                    for (int i = 1; i < division.length; i++) {
                        divident /= Double.parseDouble(division[i]);
                    }
                    multiplResult *= divident;
                } else {
                    multiplResult *= Double.parseDouble(operand);
                }
            }
            result += multiplResult;
        }

        return result;
    }  
}

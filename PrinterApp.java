/**
 * PrinterApp
 */
public class PrinterApp {

    public static void main(String[] args) {
        String creator;
        int multiplication;
        int addition;
        int subtraction;
        double division;
        System.out.println("PrinterApp");
        System.out.println("This app is made by:");
        creator="Puran Karki";
        System.out.println("This app is made by: "+creator);
        int number1=2;
        int number2=4;
        //System.out.println(number1);
        System.out.println("The value of number1 is: "+number1);
        System.out.println("The value of number2 is: "+number2);
        multiplication=number1*number2;
        System.out.println("The multiplication is: "+multiplication);
        System.out.println(number1+" * "+number2+" = "+multiplication);
        addition=number1+number2;
        System.out.println("The value of addition is: "+addition);
        subtraction=number1-number2;
        System.out.println("The value of subtraction is: "+subtraction);
        division=(double)number1/number2;
        System.out.println("The value of division is: "+division);
        System.out.println(number1+" + "+number2+" = "+addition);
        System.out.println(number1+" - "+number2+" = "+subtraction);
        System.out.println(number1+" / "+number2+" = "+division);

    }
}
import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("enter your first number: ");
        int x = num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        System.out.println("enter your second number: ");
        int y = num2.nextInt();
        CalculatorProgram obj = new CalculatorProgram(x,y);
        System.out.println(obj.addNumbers());
        System.out.println(obj.subtractNumbers());
        System.out.println(obj.multiplyNumbers());
        System.out.println(obj.divideNumbers());

    }
}

class CalculatorProgram{
    int x; // class attributes
    int y; // class attributes
    int z;
    public CalculatorProgram(int x, int y){
        this.x = x; //this. ensures that im updating the class attributes not parameters
        this.y = y;
    }
    public int addNumbers(){ // always have to return int (whatever type the method is)
        z = x + y;
        return z;    }
    public int subtractNumbers(){
        z = x-y;
        return z;
    }
    public int multiplyNumbers(){
        z = x*y;
        return z;    }
    public int divideNumbers(){
        if (y==0) {
            System.out.println("can't divide by zero!!");
            return -1;
        }
        else {
            z = x/y;
            return z;    
        }
    }
}
// added comment
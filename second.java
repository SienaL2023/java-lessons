import java.util.Scanner;
public class second{
    public static void main(String[] args){
        // make an object of mammals class 
        // plus call breathe method
        // make an obj of dog class and call leg method and breathe method
        // make an obj of cat class + call breathe method
        // Mammals obj = new Mammals();
        // obj.breathe();
        // Mammals.InnerMammals innerObj = obj.new InnerMammals();
        // innerObj.eat();
        Dog obj2 = new Dog();
        obj2.breathe(); // calling from mammals
        Scanner objScanner = new Scanner(System.in);
        System.out.println("enter your grade: ");
        // String name = objScanner.nextLine();
        int grade = objScanner.nextInt();
        System.out.println(grade);
        // System.out.println(name);

        // switch CASE
        switch(grade){
            case 9:
                // do something
                System.out.println("youre a freshman");
                break;
            case 10:
                // do something
                System.out.println("youre a sophomore");
                break;
            case 11:
                // do something
                System.out.println("youre a junior");
                break;
            case 12:
                // do something
                System.out.println("youre a senior");
                break;
            default:
                System.out.println("you dont belong here");
        }
        // obj2.legs();
        // Cat obj3 = new Cat();
        // obj3.breathe();
        // obj3.legs();



    }
}

// abstract class only allows you to access the class
// through inheritance or polymorphism
// security --> to hide details and only show the important details
abstract class Mammals{ // parent class
    public void breathe(){
        System.out.println("This animal breathes");
    }
    class InnerMammals{
        public void eat(){
            System.out.println("this animal eats");
        }
    }
}
// inheritance class
class Dog extends Mammals{
    public void legs(){
        System.out.println("This animal has 4 legs");

    }
}

// polymorphism -- change preexisting funcationalites
class Cat extends Dog{
    public void breathe(){
        System.out.println("This animal meows");
    }
}
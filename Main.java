public class Main{
    // class attributes
    final double pi = 3.14;
    // final means u cant change
    int x = 9;
    int y = 7;
    public void helloWorld(){ // class method
        System.out.println("Hello!!!");
    }
    public void BYE(){ // can be before or after main if accessing by object
        System.out.println("bye");
    }

    // constructors - initialize methods
    // this is a constructor method
    // called whenever an object of the class is made
    public Main(int num){ // if this wasnt here x would be always 9
        x = num; // so if u make x an object itll become 5
    }

    public Main(String name){
        System.out.println("hi my name is " + name);

    }

    // task: make a method that changes x by +1
    public void plus(){
        x++;
    }

    // always need a main, all ur methods and stuff have to be called in the main
    public static void main(String[] args){
        // creating  new object of class Main
        // Main obj1 = new Main();
        // obj1.plus();
        // Main obj2 = new Main(); // means its calling from main
        // // makes two objects
        // System.out.println(obj1.x); // to call something do object then variable name
        // obj1.helloWorld();
        // obj2.BYE();
        Main obj = new Main(5); // one obj can only use one constructor
        obj.helloWorld();
        obj.plus();
        System.out.println(obj.x);

        Main obj2 = new Main("joe");
        System.out.println(obj2.x);

    }
    // MODIFIERS
    // Access Modifiers - controls the access level
    // non-access modifiers - do not control access level but provides function

    // access modifiers
        // public - tells u this class is accessible by any other class
        // private - this code is only accessible within the declared class
        // protected - this code is only accessible within the same subclasses
    // non access modifiers
        // final - attribute/method cannot be modified
        // static - this attribute/method belongs to the class and not the object
    
    // encapsulation
}

// 
// }
// extends = whatever i have already ill add to that
// public class animals
    // living
    // mammals
// public class dogs extends to animals
    // fluffy
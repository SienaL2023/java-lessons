// name of class must match java file
public class hello{
    public static void main(String[] args){
        // System.out.println("Hello World");
        // string, int, float, double, character, boolean (true or false)
        int x = 5;   // 1111 1111 --> 217478364 + 1 --> overflow 
                    // binary numbers 0001 --> 8 4 2 1 --> 1
                    // 1001 --> 9
                    // int and float hold up to 8 bits
                    // double holds up to 16 bits
        double z = (double)x;
        double y = 3.5; // can hold more numbers then float/int
        String sample_String = "Hello"; // string is 8 bits
        char sample_char = 'a'; // single quote only 
        // 'a' != "a"
        boolean correct1 = true;
        boolean correct2 = false;
        // Operators
        // + - * / %
        // System.out.println(correct1);
        // System.out.println(x);
        // --x;        // decrement (oppsite of increment (specific amount increase)) before the x
        // x--;        // decrement after x take place
        // System.out.println(x);

        // comparators 
        // and (&&) - true and true --> true
        // and (&&) - true and false --> false
        // or (||) - at least one is true
        // if (correct1 && correct2){
        //     System.out.println("Correct");
        // }
        // else if (correct1) {
        //     System.out.println(correct1);
        // }
        // else{
        //     System.out.println("Not correct!!");
        // }

        // binary and or operator -> & |
        // 1 && 0 --> 0
        // 1|| 0 --> 1
        // 1001 | 1000 --> 1001
        // 1001 & 1000 --> 1000
        
        // for/while loop, functions --> practice
        // for(starting_index; ending condition; increment){

        // }
        // i is intially zero, if i is less than 5, increases by adding i==
        for(int i = 1; i <= 5; i++){
           // System.out.println(i);
        }
        // print matrix
        // for(int i = 1; i <= 3; i++){
        //     System.out.println();
        //     for(int k = 1; k<= 3; k++){
        //         System.out.print(1 + " ");
        //     }
        // }

        // while(condition){

        // }
        // int i = 0;
        // while(i <= 2){
        //     System.out.println();
        //     i++;
        //     int j =0;
        //     while(j <= 2){
        //         System.out.print(1 + " ");
        //         j++;
        //     }
        // }
        String sampleTxt = "This is a sentence!!";
        int lengthOfText = sampleTxt.length();
        String sampleTxtLower = sampleTxt.toLowerCase();
        String sampleTxtUpper = sampleTxt.toUpperCase();
        int sampleTxtIndex = sampleTxt.indexOf("a");

        // System.out.println(lengthOfText);
        // System.out.println(sampleTxtLower);
        // System.out.println(sampleTxtUpper);
        // System.out.println(sampleTxtIndex);

        // MATH BUILT IN FUNCTIONS
        int maxNum = Math.max(5, 10);
        int minNum = Math.min(5, 10);
        int absNumber = Math.abs(-62);
        double sqrtNum = Math.sqrt(64);
        int randomNum = (int)(Math.random() * 100); // 0 to 1  the multiplying makes range 0 to 100

        // System.out.println(sqrtNum);
        // System.out.println(minNum);
        // System.out.println(absNumber);
        // System.out.println(randomNum);

        // sample exercise
        // given a string: print the reversed string
        String input = "Hello";
        String output = "";
        for(int i = 0; i < input.length(); i++){
            if (input.charAt(i) != 'l')
                output = input.charAt(i) + output;
            else
                continue;
        }
        System.out.println(output);
            
        // Arrays
        // in python: numArray = []
        // in java, array of int numbers
        String[] stringArray = {"hello", "bye", "welcome"};
        int[] numArray = {10,20,30,40,50,60,70};
        int arrayLength = stringArray.length; 
        // when getting length from strings u dont need () at the end
        stringArray[0] = "NotHello";

        System.out.println(stringArray[0]);
        System.out.println(numArray[1]);
        System.out.println(arrayLength);
        
        // exercise: calculate the sum of numArray as well as the average
        // additional info: print smallest and largest # in array
        // output: the sum is xxx and the average is xxx, the smallest # is xxx, largest # is xxx
        int sum = 0;
        int length = numArray.length;
        int avg;
        int number;
        int min = numArray[0];
        int max = numArray[0];
        for(int i = 0; i < numArray.length; i++) {
            sum += numArray[i];
            number = numArray[i];
            min = Math.min(min, numArray[i]);
            max = Math.max(max, numArray[i]);
        }
        avg = sum/length;
        // System.out.println("the max is " + max);
        // System.out.println("the min is " + min);
        // System.out.println("the sum is " + sum);
        // System.out.println("the average is " + avg);
        
        // 2-d arrays
        int[][] twodArray = {{1,2,3}, {4,5,6,7}};
        int twoDArrayLength = twodArray.length; // is equal to 2 bc it counts the number of like units
        int insideLength;
        System.out.println(twoDArrayLength);
        System.out.println(twodArray[0][2]); // 0 is the first array and 2 is the index number in the array
        for(int i = 0; i < twoDArrayLength; i++){
            insideLength = twodArray[i].length;
            for(int j = 0; j < insideLength; j++){
                System.out.println(twodArray[i][j]); // prints all the numbers
            }
        }
        // calling method here
        helloWorld("Joe", 9);
        System.out.println(helloWorld("joe", 9));
        helloWorld(9);
        // the number of inputs/type of inputs tells java which
        // helloWorld ur running :)
        math(3,4);
        math(3,4,0);
    }
    // METHODS- function
    // a block of code that is only ran once when called
    // scope - a block of code that belongs within a method
    public static String helloWorld(String fname, int age){
        String statement = fname + " is " + age;
        return statement;
    }
    // method overloading
    public static void helloWorld(int age){
        int statement = age;
        System.out.println(statement);
    }
    // exercise: two methods, both called math(), one does addition, one does subtraction
    public static void math(int num1, int num2){
        int statement = num1 + num2;
        System.out.println(statement);
    }
    public static void math(int num1, int num2, int type){
        int statement = num1 - num2;
        System.out.println(statement);
    }



    // BUILT IN FUNCTIONS
    // STRINGS   
}

// java is a compiler language (java will no run code if theres an error)
// python is a interpreter language (python will run and stop at error)

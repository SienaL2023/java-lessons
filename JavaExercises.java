
import java.util.Arrays;

public class JavaExercises{
    public static void main(String[] args) {
        JavaMethods methodObj = new JavaMethods();
        final int array[] = {135, 300, 45, 90, 90, 9800};
        final int easyArray[] = {2,1,4,3,9,8,7};
        // methodObj.minMaxNum(arr);
        // final int ordered[] = {1,1,2,2,3,3,3,4,5};
        // methodObj.noRepeats(ordered);
        // methodObj.getChange(2.25, 1);
        // System.out.printlfn(methodObj.isPrime(1290098761));
        //System.out.println(methodObj.digitCount(22222, 2));
        methodObj.pairAdd(array, 180);
        System.out.println(methodObj.countConsecutiveNum(easyArray));
    }
}

// this is to store all of our exercises to be ran
class JavaMethods{
    //exercise #1: write a method that finds the largest and smallest element
    // in an array
    void minMaxNum(int[] array){ // void means to print
        int largest = array[0];
        int smallest = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > largest)
                largest = array[i];
            if(array[i] < smallest)
                smallest = array[i];
        }
        int answer[] = {smallest, largest};
        // printed like this when not using imported library, cant print array w/o library
        System.out.println(smallest + " , " + largest);
        
    }
    // exercise #2: given a Sorted array, remove all duplicates
    // and return new modified array
    void noRepeats(int[] array){
        int j = 0; // j will represent index num for newList
        int [] newList = new int[array.length];
        for(int i = 0; i < array.length-1; i++){ 
            // cant compare last number to anything else so compare to previous number with the length-1
            if(array[i] != array[i + 1]){ // i+1 is the next number
                newList[j++] = array[i]; 
                // j++ does newList[j] = array[i] then increase j by one
                // for cleaner code
            }
        }
        newList[j++] = array[array.length-1];
        // j++ makes sure u get final number
        int[] uniqueArray = Arrays.copyOf(newList, j);
        System.out.println(Arrays.toString(uniqueArray));
        
    }
    
    // exercise #3: given a number, return true if the number is prime
    // else return false

    boolean isPrime(int num){ // means return true or false
        // check divisibility from 2 up to the sqrt of that number
        double sqrt = Math.sqrt(num); 
        // double means it can hold more places compared to float
        for(int i = 2; i <= sqrt; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;// outside for loop bc youd be returning true everytime if it wasnt false
    }

    // exercise #4: cash register change program
    // given a specific amount, inputs a number, return the change
    // in numer of dollar bills. quarters, dimes, nickles, and pennis

    void getChange(double amountGiven, double cost){
        int change = (int)Math.round(100 * (amountGiven - cost));
        // multi by 100 to not deal with decimals
        int dollar = change/100;
        change %= 100; 
        // the mod of change/100 will be the amount of coins left
        int quarter = change/25;
        change %= 25;
        int dime = change/10;
        change %= 10;
        int nickle = change/5;
        change %= 5;
        int pennies = change;
        if(dollar > 0){ // if statement for when theres no dollars
                    System.out.println("Number of dollar bills: " + dollar);
        }
        if (quarter > 0){
            System.out.println("Number of quarters : " + quarter);
        }
        if(dime > 0){
                    System.out.println("Number of dime : " + dime);

        }
        if (nickle>0){
                    System.out.println("Number of nickle : " + nickle);

        }
        if(pennies>0){
                    System.out.println("Number of pennies : " + pennies);

        }


    }

    // exercise #5: write a program/method to compute the sum
    // digits in an integer
    // input: 52
    // output: 7
    int sumDigits(int num){
        int sum = 0;
        while(num > 0){
            // 522
            // 522 % 10 = 2 --> first digit
            // 522/10 = 52
            // 52 % 10 = 2 --> 2nd digit
            // 52 / 10 = 5
            // 5 % 10 = 5 --> 3rd digit
            // 5/10 = 0 BREAK OUT OF LOOP
            sum += num % 10;
            num/= 10;
        }
        return sum;
    }
    // exercise #5: given an integer, count the number of
    // digits with the value n
    // input: 522, 2
    // output: 2 times
    int digitCount(int num, int n){
        int x = 0;
        int totalCount = 0;
        while(num>0){ 
            x = num % 10;
            num = num/10;
            if(x==n){
                totalCount += 1;
            }
        }

        return totalCount;
    }

    // exercise #6: given an array, return the sum and
    //avg value of array elements
    void sumAvg(int []arr){
        int sum = 0;
        double avg = 0;
        double lenArr = arr.length;
        for(int i = 0; i < lenArr; i++){
            sum += arr[i];
        }
        avg = sum/lenArr;
        System.out.println("the sum is " + sum);
        System.out.println("The avg is " + avg);
    }

    // exercise #7: given an array print all pairs that
    // add up to specific number
    // input: array, specific num
    // output: print pairs
    void pairAdd(int []arr, int n){
        int length = arr.length;
        for(int i = 0; i < length; i++){
            for(int j = i + 1; j < length-1; j++){
                if(arr[i] + arr[j] == n){
                    System.out.println(arr[i] + "+" + arr[j] + "=" + n);
                }
            }
        }
    }
    // exercise #8: given an array, count highest number of consecutive numbers
    // input: [2,1,4,3,9,8,7]  --> [1,2,3,4,7,8,9]
    // output: 4
    int countConsecutiveNum(int[]arr){
        int consecutive = 1;
        int maxConsecutive = 1;
        Arrays.sort(arr);
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == (arr[i-1] + 1)){
                // went backwards instead of forwards bc u dont know whats ahead
                // dont want out of bounds error
                consecutive += 1;
            }
            else if(arr[i] != arr[i-1]) {
                consecutive = 1; 
                // resets the number of consecutive bc theres a break
                // bc ur solving for the highest number
            }
            // to store the max number everytime
            maxConsecutive = Math.max(maxConsecutive, consecutive);
        }
        return maxConsecutive;
    }


}

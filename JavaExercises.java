
import java.util.Arrays;
public class JavaExercises{
    public static void main(String[] args) {
        JavaMethods methodObj = new JavaMethods();
        final int arr[] = {10, 300, 45, 90, 9800};
        methodObj.minMaxNum(arr);
        final int ordered[] = {1,1,2,2,3,3,3,4,5};
        methodObj.noRepeats(ordered);
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
                // j++ does newList[j] = array[i] then does the j++ thing
                // for cleaner code
            }
        }
        newList[j++] = array[array.length-1];
        // j++ makes sure u get final number
        int[] uniqueArray = Arrays.copyOf(newList, j);
        System.out.println(Arrays.toString(uniqueArray));
        
    }
    
}

public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        boolean inArr = false;
        for (int i = 0; i < array.length; i++){
            inArr = false;
            for (int j = 0; j < array.length; j++){
                 if (array[j] == i) {
                    inArr = true;
            }
            }
            if (inArr == false) {
                return i;
            }

        }
        return 1;
        }

    public static int secondMaxValue(int [] array) {
        int high = array[0];
        int secondHigh = 0;
        int moreThanOne = 0;
        // finds the highest value
        for (int i = 1;i < array.length;i++){
            if (array[i] > high) {
                high = array[i];
            }
        }
        //finds the second highest value
        for (int i = 0;i < array.length;i++){
            // initalizing secondHigh
            if (array[i] < high && secondHigh == 0) {
                secondHigh = array[i];    
            }
            // if secondHigh is already initlized
            else if (array[i] < high && array[i] > secondHigh) {
                secondHigh = array[i];
            }
            // if the highest number appears more than once
            if (array[i] == high) {
                moreThanOne += 1;
            }
        }
        return (moreThanOne > 1) ? high : secondHigh;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        for (int i = 0;i < array1.length;i++){
            boolean inArray = false;
            for (int j = 0;j < array2.length && !inArray;j++){
                if (array1[i] == array2[j]) {
                    inArray = true;
                }
            }
            if (inArray == false) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        boolean highToLow = true;
        boolean lowToHigh = true;
        int cur = 0;
        for (int i = 1;i < array.length && highToLow == true;i++){
            if (array[i] >= array[cur]) {
                cur ++;
            }
            else{
                highToLow = false;
            }
        }
        cur = 0;
        for (int i = 1;i < array.length && lowToHigh == true;i++){
            if (array[i] <= array[cur]) {
                cur ++;
            }
            else{
                lowToHigh = false;
            }
        }
        return highToLow || lowToHigh;
    }
}

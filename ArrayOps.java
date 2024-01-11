public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        // sort the array
        for (int i = 0;i <= array.length; i++){
            if (array[i] > array[i+1]) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        // compare the sorted to array to the actual numbers and return the missing number
        for (int i = 0;i <= n;i++){
            if (array[i] != i) {
                return i;
            }
        }

        }

    public static int secondMaxValue(int [] array) {
        int high = array[0];
        int secondHigh = array[0];
        // finds the highest value
        for (int i = 1;i < array.length;i++){
            if (array[i] > high) {
                high = array[i];
            }
        }
        //finds the second highest value
        for (int i = 1;i < array.length;i++){
            if (array[i] < high && array[i] > secondHigh) {
                secondHigh = array[i];
            }
        }
        return secondHigh;
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

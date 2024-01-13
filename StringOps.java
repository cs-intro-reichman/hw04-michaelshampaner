public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String s = "Hello world";
        char c = 'l';
        System.out.println("the new string is " + allIndexOf(s, c));
    }

    public static String capVowelsLowRest (String string) {
        String outpString = "";
        for (int i = 0; i < string.length(); i++){
            // if current char is low vowel -> change to cap
            if (isLowVowel(string.charAt(i))) {
                outpString += (char)(string.charAt(i) + ('A' - 'a'));
            }
            // if current char is capital not vowel -> change to low
            else if (isCapNotVowel(string.charAt(i))) {
                    outpString += (char)(string.charAt(i) + ('a' - 'A'));
            }
            else{
                // every char beside the two cases above -> add without changes
                outpString += string.charAt(i);
            }

        }
        return outpString;
    }

    public static String camelCase (String string) {
        String outpString = "";
        // if first char is UpperCase
        if (!isLowCase(string.charAt(0)) && string.charAt(0) != ' ') {
            outpString += upperToLow(string.charAt(0));
        }
        else{
            // its a lowCase char
            outpString += string.charAt(0);
        }
        for (int i = 1; i < string.length(); i++){
            if (string.charAt(i) != ' ') {
                if (string.charAt(i-1) == ' ') {
                    // if its lowCase char -> change to upperCase
                    if (isLowCase(string.charAt(i))) {
                        outpString += lowToUpp(string.charAt(i));
                    }
                    else{
                        outpString += string.charAt(i);
                    }
                }
                else if (!isLowCase(string.charAt(i))) {
                    outpString += upperToLow(string.charAt(i));
                }
                else{
                    outpString += string.charAt(i);
                }
            }
        }
        return outpString;
    }

    public static int[] allIndexOf (String string, char chr) {
        String copy = string;
        int [] ansArr;
        int start = 0;
        int count = 0;
        int ansArrCount = 0;
        while (copy.length() > 0 && start > -1) {
            start = copy.indexOf(chr);
            if (start > -1) {
                copy = copy.substring(start + 1);
                count ++;
            }
        }
        ansArr = new int[count];
        for (int i = 0;i < string.length();i++){
            if (string.charAt(i) == chr) {
                ansArr[ansArrCount] = i;
                ansArrCount ++;
            }
        }
        return ansArr;
        }

    public static boolean isLowVowel (char c){
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
        
            default:
                return false;
        }

    }

    public static boolean isCapNotVowel (char c){
        if (c >= 'A' && c <= 'Z') {
            switch (c) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return false;
            default:
                return true;
        }
        }
        return false;

    }

    public static char upperToLow (char c){
        return (char)(c + ('a' - 'A'));
    }

    public static char lowToUpp (char c){
        return (char)(c + ('A' - 'a'));
    }

    public static boolean isLowCase (char c){
        return (c >= 'a' && c <= 'z') ? true : false; 
    }

}

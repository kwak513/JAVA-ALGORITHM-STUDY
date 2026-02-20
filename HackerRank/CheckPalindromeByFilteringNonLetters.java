class Result {

    /*
     * Complete the 'isAlphabeticPalindrome' function below.
     *
     * The function is expected to return a BOOLEAN.
     * The function accepts STRING code as parameter.
     */

    public static boolean isAlphabeticPalindrome(String code) {
    // Write your code here
        
        StringBuilder refinedText = new StringBuilder();
        
        // refining text
        for(char c: code.toCharArray()){
            if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
                refinedText.append(c);
            }
        }
        
        // convert to lowercase
        String refinedTextToString = refinedText.toString().toLowerCase();
        
        int left = 0;
        int right = refinedTextToString.length() - 1;
        
        while(left < right){
            if(refinedTextToString.charAt(left) != refinedTextToString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        
        return true;
        
       
        
    }

}

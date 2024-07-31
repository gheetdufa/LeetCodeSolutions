class Solution {
    public boolean isPalindrome(int x) {
        //if var is - we know it is always wrong as per the problem so
        if(x < 0){
            return false;
        }

    int reversed = 0;
    int tempCheck = x;
        while (x > 0) {
        int digit = x%10;
        //gives last digit
        reversed = reversed *10 + digit;
        x = x/10;
    }
        return (reversed == tempCheck);
    }

}
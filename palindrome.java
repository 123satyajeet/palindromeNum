import java.util.*;

class palindrome{
public static boolean checkPalindrome(int x){
	String str = Integer.toString(x);
        for(int i=0;i<=str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
	
}

public static void main(String args[]){
	System.out.println(checkPalindrome(121));
}


}


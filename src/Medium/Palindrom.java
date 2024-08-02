package Medium;

public class Palindrom {
    public boolean isPalindrome(int x) {
        String result="";
        String convert=String.valueOf(x);
        for(int i=convert.length()-1;i>=0;i--){
            result+=convert.charAt(i);
        }
        if(result.equals(convert)){
            return true;
        }else{
            return false;
        }
    }
}

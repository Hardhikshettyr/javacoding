public class palindromestring {
    public static boolean bruteforce(String s){
        int left=0,right=s.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }else if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }

    public static boolean recursion(int i ,String s){
        if(i>=s.length()/2){
            return true;
        }
        if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(s.length()-i-1))){
            return false;
        }

        return recursion(i+1,s);
    }
    public static void main(String []args){
        String S ="Nitin";
        System.out.println(recursion(0,S));
    }
}
 
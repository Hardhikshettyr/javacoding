public class pali {
    public static boolean isplaindrome(int a[]){
        int i=0;
        int j=a.length-1;
        while(i<j){
            if(a[i]==a[j]){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,1};
        System.out.println(isplaindrome(a));
    }
}

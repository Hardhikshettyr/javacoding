public class vowellowercase{

    public static int lowercasecount(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
            
        }
        return count;
    }
    public static void main(String[]args){
        String s="hardhik shetty";
        System.out.println(lowercasecount(s));
    }
}
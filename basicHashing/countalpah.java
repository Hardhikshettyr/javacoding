
public class countalpah {
    public static void main(String[]args){
        String S="abcdabehf";
        int []hash=new int[26];
        for(int i=0;i<S.length();i++){
            hash[S.charAt(i)-'a']++;
        }

        char []c={'a','g','h','b','c'};
        for(int i=0;i<c.length;i++){
            System.out.println(hash[c[i]-'a']);
        }
    }
}

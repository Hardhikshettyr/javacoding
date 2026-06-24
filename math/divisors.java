import java.util.*;

public class divisors {
    public static List<Integer> bruteforce(int n){
        List<Integer> num=new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                num.add(i);
            }
        }
        return num;
    }

    public static List<Integer> optimal(int n){
        List<Integer> num= new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                num.add(i);
                if(i!=n/i){
                    num.add(n/i);
                }
            }
        }
        return num;
    }

   public static void main(String []args){
        List<Integer> num= optimal(36);

        System.out.println(num);
   } 
}


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class counthasha {
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Map<Character, Integer>map=new HashMap<>();
        
        String n=sc.nextLine();

        

        for(int i=0;i<n.length();i++){
            char c=n.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            char c=sc.next().charAt(0);
            System.out.println(map.getOrDefault(c,0));
        }
    }

}

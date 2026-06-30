import java.util.*;

public class counthash {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Map<Integer, Integer>map=new HashMap<>();
        
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int numbers=sc.nextInt();
            System.out.println(map.getOrDefault(numbers,0));
        }
    }

}

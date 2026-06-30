
import java.util.Scanner;

public class countelements {
    public static void main(String []args){
        int n=5;
        int arr[]={1,3,2,1,3};
        int []hash=new int[13];
        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }

        int q=5;
        int []queries={1,4,2,3,12};
        for(int i=0;i<q;i++){
            int number=queries[i];
            System.out.println(hash[number]);
        }

    }
}

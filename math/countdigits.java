import java.util.*;
public class countdigits {

    public static int bruteforce(int number){
        int counter=0;
        while(number>0){
            counter++;
            number=number/10;
        }
        return counter;
    }

    public static int logirthimic(int number){
        int count=(int)(Math.log10(number)+1);
        
        return count;
    }
    public static void main(String[]args){
        int number=12345;
        int count=logirthimic(number);
        System.out.println(count);
   } 
}

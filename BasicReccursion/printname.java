public class printname {

    public static void name(int count,int n){
        if(count==n){
            return;
        }
        System.out.println("Hardhik");
        name(count+1,n);

    }
    public static void main(String[] args) {
        name(0,5);
    }
} 


public class prime {
    public static boolean isprimebrute(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }

    public static boolean isprimeoptimal(int n){
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count++;
                if(i!=n/i){
                    count++;
                }
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }
    public static void main(String [] args){
        boolean result=isprimeoptimal(37);
        System.out.println(result);
    }
    
}

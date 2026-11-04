public class Merge{
    public static void main(String[] args) {
        int a[]={2,5,6};
        int b[]={1,15,25};
        int c[]=new int[a.length+b.length];
        int m=a.length-1, n=b.length-1, k=c.length-1;

        while(m>=0 && n>=0){
            if(a[m]>b[n]){
                c[k]=a[m];
                m--;
            }else{
                c[k]=b[n];
                n--;
            }
            k--;
        }
        while(n>=0){
            c[k]=b[n];
            n--;
            k--;
        }
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }

    }
}
public class buysellstock{
    public static void main(String[] args) {
        int a[]={7,1,5,3,6,4};
        int buyprice=a[0];
        int maxprofit=0;
        for(int i=1;i<a.length;i++){
            if(buyprice>a[i]){
                buyprice=a[i];
                

            }else{
                int profit=a[i]-buyprice;
                maxprofit=Math.max(maxprofit, profit);
            }
        }
        System.out.println(maxprofit);
    }
}
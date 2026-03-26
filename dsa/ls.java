public class ls {
    public static int linearsearch(int numbers[],int key){
            for(int i=0;i<numbers.length;i++){
                if(numbers[i]==key){
                    return i;
                }       
            }
            return -1;
        }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8};
        int key=9;

        int index=linearsearch(num, key);
        if(index==-1){
            System.out.println("key not found");
        }else{
            System.out.println("key at index"+index);
        }
        
    }
}

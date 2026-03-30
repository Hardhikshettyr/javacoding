public class linearstring{
    public static int tosearch(String menu[], String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[]={"a","b","c"};
        String key="d";
        int ky=tosearch(menu,key);
        if(ky==-1){
            System.out.println("not found");
        }else{
            System.out.println("found");
        }
    }
}
public class linerSearch {
    public static void main(String[] args) {
        int[] data = {10 , 20 , 40 , 30 , 45 , 90};
        int n = data.length;

        int x = 12;
        boolean flag = false; // means data doesn't exits
        for (int i = 0; i <n ; i++) {
            if(data[i] == x){
                flag = true;
                break;
            }
        }
        if(flag == false) System.out.println("data doesn't exits");
        else  System.out.println("data found");
    }
}

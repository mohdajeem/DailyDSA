public class NumberAppearsOne {

    //brute force approach
    public static int count(int[] arr){
        int count;
        for(int i = 0;i<arr.length;i++){
            count = 0;
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count == 0){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,3,2,1};
        System.out.println(count(arr));

    }
}

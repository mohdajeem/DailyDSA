public class NumberAppearsOne {

    //brute force approach
    public static int countLeast(int[] arr){
        int count;
        for(int i = 0;i<arr.length;i++){
            count = 0;
            for(int j = 0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count == 1){
                return arr[i];
            }
        }
        return -1;
    }
    public static int xorCount(int[] arr){
        int xor = 0;
        for(int i = 0;i<arr.length;i++){
            xor = xor^arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1,4,5,11,5};
        System.out.println(countLeast(arr));
        System.out.println(xorCount(arr));
    }
}

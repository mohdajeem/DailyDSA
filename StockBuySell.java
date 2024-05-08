import java.util.*;
public class StockBuySell {
    public static int findMax(int[] arr){
        int maxi = -21;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi = arr[i];
            }
        }
        return maxi;
    }
    public static int findMin(int[] arr){
        int mini = 343232;
        for(int i =0; i<arr.length;i++){
            if(arr[i]<mini){
                mini = arr[i];
            }
        }
        return mini;
    }
    /*
    public static int buySell(int[] arr){
        int maxPro = 0;
        int s = 0;
        int e = arr.length-1;
        while(s<e){
            if(arr[s]>arr[e]){
                s++;
            } else if(arr[s]<arr[e]){
                int diff = arr[e] - arr[s];
                maxPro = Math.max(maxPro,diff);
                e--;
            }
        }
        return maxPro;
    }

     */
    public static int buySell(int[] arr){
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            minPrice = Math.min(minPrice,arr[i]);
            maxPro = Math.max(maxPro,arr[i]-minPrice);
        }
        return maxPro;
    }
    public static void main(String[] args) {
//        int[] arr = {7,1,5,3,6,4};
        int[] arr = {7,6,4,3,1};
        System.out.println(buySell(arr));
    }
}

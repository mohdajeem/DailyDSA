public class SortArrays {
    public static void sortArray(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length -1;
        while(mid<=high){
            if(arr[mid]==0){
                //swap(arr[mid],arr[low]);
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;

            } else if(arr[mid]==1){
                mid++;
            } else{ // when arr[mid] == 2
//                swap(arr[mid],arr[high]);
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,1,0,2,1,0,0,1,1,2};
        sortArray(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

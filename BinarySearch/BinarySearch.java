public class BinarySearch {

    public static void main(String[] args)
    {
        int[] arr= {1,2,3,5,7,8,9,55,121,12,20};
        int target = 121;
        int result = BinarySearch(arr, target);
        System.out.println(result);
    }
    public static int BinarySearch(int[] arr,int target)
    {
        int start=0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid= start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid+1;
            } else if (target > arr[mid]) {
                start=mid+1;
            }
            else return mid;
        } return -1;
    }
}


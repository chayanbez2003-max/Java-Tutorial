public class Binarysearch {
    public static void main(String[] args) {
        int[] arr={-13,-5,-2,0,1,3,5,7,9,10};
        int target=-5;
        int ans=bsearch(arr, target);
        System.out.println(ans);
    }
    //return the index
    //return -1 if there does not exist the target element
    static int bsearch(int [] arr ,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                start=0;
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
                end=arr.length-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
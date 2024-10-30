class BinarySearch{
    public static void main(String[] args){
        int[] arr = {2, 3, 4, 10, 40, 45, 56, 70, 80, 100, 120};
        int target = 10;
        int loc=BS(arr,target);
        if(loc==-1)System.out.println("Target Not Found");
        else System.out.println("Target found at "+loc);
    }
    static int BS(int[] arr,int target){
        int n=arr.length;
        int high=n-1;
        int low=0;
        while(high>=low){
            int mid=low+(high-low)/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid]>target)high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
}
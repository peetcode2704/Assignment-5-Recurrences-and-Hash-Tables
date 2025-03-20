public class sumTarget {
    public int [] findSumTarget(int[] arr, int target){
        //Using 2 pointers method, add everything from array up and keep shrinking until the sum == target
        int startIndex = 0;
        int currentSum = 0;

        //This for loop using the end index to iterate and add all numbers from arr
        for (int endIndex = 0; endIndex < arr.length; endIndex++) {
            currentSum += arr[endIndex];
            //This loop says that we going to keep shrinking the array with startindex  until the end
            while(currentSum > target && startIndex <= endIndex){
                currentSum -= arr[startIndex];
                startIndex++;
            }
            //if the sum is == target which means we already found the subarray that adds up to the target.
            if (currentSum == target) {
                return new int[] { startIndex, endIndex};
            }
        }
        //If no subarray adds up to sum return [-1,-1];
        return new int[] { -1, -1 };
    }
}

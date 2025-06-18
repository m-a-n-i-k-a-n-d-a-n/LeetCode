class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int l=0,r=0;
        float avg=0;
        while(r<k) {
            avg=avg+arr[r];
            r++;
        }
        float maxavg=avg / k;
        while(r<arr.length) {
            avg=avg+arr[r];
            avg=avg-arr[l];
            maxavg=Math.max(avg/k,maxavg);
            l++;
            r++;
        }
        return maxavg;
    }
}
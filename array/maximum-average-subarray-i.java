class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int l=0,r=0;
        double avg=0;
        while(r<k) {
            avg=avg+arr[r];
            r++;
        }
        double maxavg=avg;
        while(r<arr.length) {
            avg=avg+arr[r];
            avg=avg-arr[l];
            maxavg=Math.max(avg,maxavg);
            l++;
            r++;
        }
        return maxavg/k;
    }
}
class Solution {
    public void nextPermutation(int[] arr) {
        int n=arr.length,drop=-1;
        for(int i=n-1;i>0;i--) {
            if(arr[i]>arr[i-1]) {
                drop=i-1;
                break;
            }
        }
        int temp;
        if(drop==-1){
            for(int i=0;i<n/2;i++) {
            temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        }
        if(drop>=0) {
            //System.out.println("drop:"+arr[drop]);
            int sw=n-1;
            while(arr[sw]<=arr[drop]) {
                sw--;
            }
        //System.out.println("swap:"+sw);
        temp=arr[sw];
        arr[sw]=arr[drop];
        arr[drop]=temp;
        int j=n-1;
        drop++;
        while(drop<j) {
            temp=arr[drop];
            arr[drop]=arr[j];
            arr[j]=temp;
            drop++;
            j--;
        }
        }
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
    }
}
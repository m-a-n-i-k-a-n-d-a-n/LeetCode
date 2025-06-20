void sortColors(int* nums, int n) {
    int i,zc=0,oc=0;
    for(i=0;i<n;i++)
    {
        if(*(nums+i)==0)
            ++zc;
        if(*(nums+i)==1)
            ++oc;
    }
    for(i=0;i<zc;i++)
        *(nums+i)=0;
    for(i=zc;i<zc+oc;i++)
        *(nums+i)=1;
    for(i=zc+oc;i<n;i++)
        *(nums+i)=2;
    for(i=0;i<n;i++)
        printf("%d ",*(nums+i));
}
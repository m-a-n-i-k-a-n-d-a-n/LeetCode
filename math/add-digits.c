int addDigits(int num) {
    int r,s=0;
        while((num>0))
        {
            r=num%10;
            s=s+r;
            num/=10;
            if(num==0 && s>9){
            num=s;
            s=0;
            }
        }
        return s;
}
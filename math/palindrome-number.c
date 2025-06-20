bool isPalindrome(int x) {
    int rev=0,n=x;
    if(x<0)
    {
        return false;
    }
    while(n!=0)
    {
        if(rev>INT_MAX/10 || rev<INT_MIN/10)
        {
            return 0;
        }
        rev=rev*10+n%10;
        n=n/10;
    }
    if(rev==x)
        return true;
    else
        return false;
}
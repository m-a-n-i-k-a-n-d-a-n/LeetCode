int scoreOfString(char* s) {
    int as,su=0,i=0;
    while(i<strlen(s)-1)
    {
        as=abs(s[i]-s[i+1]);
        su=su+as;
        i++;
    }
    return su;
}
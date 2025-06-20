int strStr(char* haystack, char* needle) {
    char *res=strstr(haystack,needle);
    if(res==NULL)
        return -1;
    int ptr=res-haystack;
    
    return ptr;
}
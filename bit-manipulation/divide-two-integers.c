int divide(int dd, int ds) {
    if(dd==INT_MIN && ds==-1) return INT_MAX;
    int res= dd/ds;
    return round(res);
}
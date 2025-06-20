class Solution:
    def repeatedStringMatch(self, a, b) :
        m=math.ceil(len(b)/len(a))
        if b in a*m:
            return m
        elif b in a*(m+1):
            return m+1
        else:
            return -1

        
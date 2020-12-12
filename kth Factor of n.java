class Solution 
{
    public int kthFactor(int n, int k) 
    {
        for(int i = 1, ordinal = 0; i<=n;i++) {
             if(n%i==0) ordinal++;  
             if(ordinal==k) return i; 
        }
        return -1;
    }
}

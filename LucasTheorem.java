
class LucasTheorem {
    public static void main(String[] args) {
        int n = 1000, r = 900, p = 13; 
    	System.out.println("nCr % p = "+lucas(n, r, p));
    }
    static int ncrmodp(int n, int r, int p){
        int[] C=new int[r+1];
        C[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=Math.min(i,r);j>0;j--){
                C[j]=(C[j]+C[j-1])%p;
            }
        }
        return C[r];
    }
    static int lucas(int n , int r, int p){
        if(r==0)return 1;
        if(r>n)return 0;
        int ni = n%p; 
        int ri = r%p; 
        return (lucas(n/p, r/p, p) * ncrmodp(ni, ri, p)) % p;
    }    
}
class CatalanNumber {
    public static void main(String[] args) {
        int n = 10;
        catalan(n);
    }
    static int catalan(int n){
        int res=1;
        System.out.print(1 + " ");
        for(int i=1;i<n;i++){
            res = (res * (4 * i - 2)) / (i + 1);
            System.out.print(res + " ");
        }
        return res;
    }
}
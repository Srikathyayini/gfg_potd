class Solution {
    static class Pair implements Comparable<Pair>{
        int a,b;
        Pair(int a,int b){
            this.a=a;
            this.b=b;
        }
        @Override
        public int compareTo(Pair p){
            int frst=Math.abs(a-b);
            int sce=Math.abs(p.a-p.b);
            return sce-frst;
        }
    }
        
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        // code here
       Pair a[]=new Pair[n];
       for(int i=0;i<n;i++){
           a[i]=new Pair(arr[i],brr[i]);
       }
       Arrays.sort(a);
       long ans=0;
       for(Pair i:a){
           if((i.a>i.b && x>0)|| (y==0)){
               ans+=i.a;
               x--;
           }else{
               ans+=i.b;
               y--;
           }
       }
       return ans;
    }
}

public class minLengthSubArray{
     public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        System.out.println(solve(A));
    }
    public static int solve(int[] A){
    int totalCount =0;
           int n = A.length-1;
           for (int i =0 ; i<A.length; i++){
               int evenCount=0;
               int oddCount = 0;
                if(A[i]%2 ==0) {
                   evenCount +=1;
                   return evenCount;
               }else {
                   oddCount +=1;
                   return oddCount;
               }
               
                  
                  
            }
             return totalCount;
    }
}
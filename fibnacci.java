import java.util.Scanner;


public class fibnacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] qb = new int[n +1];
        int x = fab(n , qb);
        System.out.println(x );
    }
    
    public static int fab(int n , int[] qb){
        
        if(n<=1){
            return n;
        }
        if(qb[n] !=0){
            return qb[n];
        }

        int fabi1 = fab(n-1, qb) ;
        int fabi2 = fab(n-2, qb) ;
        int fabi = fabi1 + fabi2 ;
        qb[n] = fabi;
        return fabi;
    }
}

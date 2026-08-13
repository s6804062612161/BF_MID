import java.util.Scanner;

public class Lab4_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] A = new int[H][W];
    
        for (int i=0; i<H;i++){
            for (int j=0;j<W;j++){
                A[i][j]=sc.nextInt();
            }
        }
        int maxsum = -1;
        int ansrow = -1;
        int anscol = -1;

        int r=0;int c=0;
        while (r<H){
            if(c<W-1){
                if (Math.abs(A[r][c]-A[r][c+1])<=10){
                    int sum = A[r][c]+A[r][c+1];
                    if (sum > maxsum){
                        maxsum = sum;
                        ansrow = r+1;
                        anscol = c+1;
                    }
                }                
            }
            if (r<H-1){
                if (Math.abs(A[r][c]-A[r+1][c])<=10){
                    int sum = A[r][c]+A[r+1][c];
                    if (sum > maxsum){
                        maxsum = sum;
                        ansrow = r+1;
                        anscol = c+1;
                    }
                }               
            }
            c++;
            if (c==W){
                c=0;
                r++;
            }

        }
        System.out.print(ansrow + " " + anscol);
        sc.close();
    }
}
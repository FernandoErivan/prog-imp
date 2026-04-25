import java.util.Scanner;
public class script{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[][] m = new int[4][3];

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                
                    System.out.printf("Digite m[%d][%d]:\n", i, j);
                    m[i][j] = sc.nextInt();
                    System.out.print(m[i][j] + " ");
                }    
            }

            System.out.println("\nMatriz:");
            for(int i = 0; i < m.length; i++){
                for(int j = 0; j < m[i].length; j++){
                    System.out.print(m[i][j] + " ");
                }
                System.out.println();
            }
            sc.close();
        }
    }

public class script{
    public static void matriz(int[] v){
        int[][] m = new int [4] [3];
        
        m[2][1] = 14;
        for(int i = 0; i < v.length; i++){
            for(int i = 0; i < m.length; i++){
                for(int j = 0; j < m[0].length; j++){
                    System.out.println("Digite m[%d][%d]", i++, j++);
                    m[i][j] = input.nextInt();
                    System.out.print(m[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
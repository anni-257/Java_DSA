import java.util.*;
public class Examples{

    public static int numOfTimes(int mat[][],int x){
        int rows=mat.length;
        int cols=mat[0].length;
        int cnt;
        cnt=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j]==x){
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static int additionOfRowI(int mat[][],int i){
        int sum=0;
        int rows=mat.length;
        int cols=mat[0].length;
        if(rows<i){
            return 0;
        }

        for(int j=0;j<cols;j++){
            sum+=mat[i][j];
        }

        return sum;
    }

    public static int[][] transpose(int mat[][]){
        int rows=mat.length;
        int cols=mat[0].length;

        /*
        for square matrix
         for(int i=0;i<rows;i++){
            for(int j=0;j<i;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
         */


         
        int mat2[][]=new int[cols][rows];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat2[j][i]= mat[i][j];
            }
        }

        return mat2;
        
    }
    public static void main(String arg[]){
        int mat[][]={{4,7,8},{8,8,7}};
        Scanner sc=new Scanner(System.in);

        // System.out.print("Enter Key Value: ");
        // int key=sc.nextInt();
        // System.out.println("Number of Occurance for "+key+" is: "+numOfTimes(mat, key));

        // System.out.print("Enter row number: ");
        // int x=sc.nextInt();
        // System.out.println("Sum of "+x+"th row is: "+additionOfRowI(mat, x));

        System.out.println("Before Transpose");
        for(int x[]:mat){
            for(int y:x){
                System.out.print(y+" ");
            }System.out.println();
        }

        System.out.println("After Transpose");
        
        for(int x[]:transpose(mat)){
            for(int y:x){
                System.out.print(y+" ");
            }System.out.println();
        }

        
    }
}
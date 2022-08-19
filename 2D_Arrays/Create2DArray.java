import java.util.Scanner;
public class Create2DArray{

    public static void update(int matrix[][],Scanner sc){
        System.out.println("Enter Matrix Elements");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
    }

    public static void print(int matrix[][]){
        System.out.println("Matrix Elements");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }
    }

    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(key==matrix[i][j]){
                    System.out.println("Found at index ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Not Found");
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n=sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m=sc.nextInt();

        int matrix[][]=new int[n][m];
        update(matrix, sc);
        print(matrix);
        System.out.print("Enter key Element: ");
        int key=sc.nextInt();
        search(matrix, key);


    }
}
import java.util.Scanner;
class ArrayCreation{
    public static void input(int arr[],Scanner sc){
        System.out.print("Enter number of subject marks want to fill: ");
        int size=sc.nextInt();
        System.out.println("Enter your marks");
        for(int i=0;i<size;i++){
          arr[i]=sc.nextInt();
        }
    }

    public static void print(int arr[],Scanner sc){
        System.out.print("Enter number of subject marks want to print: ");
        int size=sc.nextInt();
        System.out.print("Your marks: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number of subjects: ");
        int size=sc.nextInt();

        int marks[]=new int[size];
        input(marks,sc);
        print(marks,sc);

    }
}

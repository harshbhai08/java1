
import java.util.Scanner;
public class ser
{
    public static void main(String[] args) {
        int s,flag=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the no. of columns : ");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter the elements :");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printing the input matrix :");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("enter the number to search:");
        s=sc.nextInt();
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (s==matrix[i][j]){
                    System.out.println("entered number is found with value:  "+matrix[i][j]+"at "+i+1+","+j+1);
                    flag=0;
                    break;
                }
            }
        }
        if(flag==1){
            System.out.println("number is not found");
        }

    }
}


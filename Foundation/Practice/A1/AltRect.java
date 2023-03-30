package Foundation.Practice.A1;
import java.util.*;
public class AltRect {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int m = reader.nextInt();
        int n = reader.nextInt();
        char[][] arr = new char[m][n];
        // for(int i=0; i<m; i++)
        // {
        //     for(int j=0; j<n; j++)
        //     {
        //         arr[i][j] = reader.nextInt();
        //     }
        // }
        char c = 'X';
        int top=0, down = m-1;
        int left=0, right = n-1;
        int dir = 0;
        while((top<=down) && (left<=right))
        {
            if(dir==0)
            {
                for(int i=left; i<=right; i++)
                {
                    arr[top][i] = c;
                }
                top+=1;
            }
            else if(dir==1)
            {
                for(int i=top; i<=down; i++)
                {
                    arr[i][right] = c;
                }
                right-=1;
            }
            else if(dir==2)
            {
                for(int i=right; i>=left; i--)
                {
                    arr[down][i] = c;
                }
                down-=1;
            }
            else if(dir==3)
            {
                for(int i=down; i>=top; i--)
                {
                    arr[i][left] = c;
                }
                left+=1;
            }
            dir=(dir+1)%4;
            c = (c=='O')? 'X':'O';
        }
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
           {
                System.out.print(arr[i][j]+" ");

           }
           System.out.println();
        }
    }
}

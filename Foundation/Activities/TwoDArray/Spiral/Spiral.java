package Foundation.Activities.TwoDArray.Spiral;
import java.util.*;
public class Spiral {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int m = reader.nextInt();
        int n = reader.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = reader.nextInt();
            }
        }
        int top = 0, down = m-1;
        int left = 0, right = n-1;
        int dir=0;
        while((top<=down) && (left<=right))
        {
            if(dir==0)
            {
                for(int i=left; i<=right; i++)
                {
                    System.out.print(arr[top][i]+" ");
                }
                top+=1;
            }
            else if(dir==1)
            {
                for(int i=top; i<=down ;i++)
                {
                    System.out.print(arr[i][right]+" ");
                }
                right-=1;
            }
            else if(dir==2)
            {
                for(int i=right; i>=left; i--)
                {
                    System.out.print(arr[down][i]+" ");
                }
                down -=1;
            }
            else if(dir==3)
            {
                for(int i=down; i>=top; i--)
                {
                    System.out.print(arr[i][left]+" ");
                }
                left+=1;
            }
            dir = (dir+1)%4;
        
        }
    }
}

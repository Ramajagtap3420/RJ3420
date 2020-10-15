import java.util.*;
class Matrix
{
	public static void Boundary(int a[][],int m,int n)
	{
	for(int i=0;i<n;i++)
		{
		for(int j=0;j<m;j++)
			{
			if(i==0)
				System.out.print(a[i][j]+" ");
			else if(i==m-1)
				System.out.print(a[i][j]+" ");
			else if(j==0)
				System.out.print(a[i][j]+" ");
			else if(j==n-1)
				System.out.print(a[i][j]+" ");
			else
				System.out.print("  ");
			}
		System.out.println();
		}
	}

	  public static void main(String[] args) 
    { 
        int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 2, 3, 4 }, { 5, 6, 7, 8 } }; 
  
        Boundary(a, 4, 4); 
    } 
}

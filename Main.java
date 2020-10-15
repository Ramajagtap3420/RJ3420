import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m, n, sum = 0, row1 = 0, col_n = 0, diag = 0;
		
		m = sc.nextInt();
		n = sc.nextInt();
		int i, j;
		int[][] mat = new int[m][n];
		
		for(i = 0; i < m; i++)
			{
				for(j = 0; j < n; j++)
				mat[i][j] = sc.nextInt();
			}
		
		for(i = 0; i < m; i++)
			{
				for(j = 0; j < n; j++)
					{
						if (i == 0 || j == 0 || i == n – 1 || j == n – 1)
							{
								System.out.print(mat[i][j] + " ");
								sum = sum + mat[i][j];
							}
						else
								System.out.print(" ");
					}
				System.out.println();
			}
		System.out.print(sum);
	}
}

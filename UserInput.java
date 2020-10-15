import java.util.*;
class UserInput
{

	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int P=sc.nextInt();
	int N=sc.nextInt();
	float R=sc.nextInt();
	float res=P*N*R/100;
	System.out.println(res);
	}
}

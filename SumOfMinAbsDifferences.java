import java.*;
import java.util.Arrays;

public class  SumOfMinAbsDifferences
{
static int Main(int arr[] ,int n)
{

Arrays.sort(arr);
int sum = 0;
sum += Math.abs(arr[0] – arr[1]);
sum += Math.abs(arr[n-1] – arr[n-2]);

for (int i = 1; i < n – 1; i++)
sum +=Math.min(Math.abs(arr[i] – arr[i-1]),Math.abs(arr[i] – arr[i+1])); 

return sum;
}

public static void main(String args[])
{
int arr[] = {1, 3, 6, 9, 3};
int n = arr.length;

System.out.println( "Sum =" + Main(arr, n));
}
}

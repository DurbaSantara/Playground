import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i,j=1;
      for(i=1;i<=n;i++)
       {
        j= 2*i-1;
        System.out.println(j);
       }
	}
}
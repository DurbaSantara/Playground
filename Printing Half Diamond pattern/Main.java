import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
		int hight = in.nextInt();
        int min_star = 1;
       int space = hight-1;
		for(int i = 0 ;i < hight ; i++)
        {
			for(int j = space ;j > i ; j-- ) 
            {
				System.out.print(" ");
			}
			for(int k = 0 ; k< min_star ; k++)
            {
				System.out.print("*");
			}
            min_star+=2;
			System.out.print("\n");			
		}
	}
}
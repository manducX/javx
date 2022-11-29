import java.util.Scanner;
class mul_table_new {
	static void printMultiples(int N)
	{
		System.out.format(" ");	
		for (int i = 1; i <= N; i++) {
			System.out.format("%4d", i);
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		for(int i = 1; i <= N; i++){  
			System.out.format("%4d", i);
			for(int j = 1; j <= N; j++){
				System.out.format("%4d", i*j);
			}
			System.out.println();
		}
	} 
	// Driver code
	public static void main(String args[])
	{
		int N;
		Scanner input = new Scanner(System.in);
        System.out.print("Enter Table Size : ");
        N = input.nextInt();
        input.close();

		printMultiples(N);
	}
}

import java.util.Scanner;

public class WhileForLoop {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int answer = 1;
		
		while(answer != 0)
		{
			System.out.println("Loop how many times? (0 to exit)");
			answer = kb.nextInt();
			
			if(answer == 0)
			{
				System.out.println("Exit program...");
			}
			else
			{
				int counter = answer;

				for(; counter != 0;)
				{
					if(answer > 0)
						counter--;
					else
						counter++;
					
					System.out.println(counter);
				}
			}
		}
		
		kb.close();
	}
}

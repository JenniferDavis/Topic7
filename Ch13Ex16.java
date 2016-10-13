public class Ch13Ex16 
{
	/** Main method */
	public static void main(String[] args) 
	{
		// Check number of strings passed
		if (args.length != 3) 
		{
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

		// The result of the operation
		double result = 0;

		// Determine the operator
		switch (args[1].charAt(0)) 
		{
			case '+': result = Double.parseDouble(args[0]) + Double.parseDouble(args[2]);
			break;
			case '-': result = Double.parseDouble(args[0]) - Double.parseDouble(args[2]);
			break;
			case '.': result = Double.parseDouble(args[0]) * Double.parseDouble(args[2]);
			break;
			case '/': result = Double.parseDouble(args[0]) / Double.parseDouble(args[2]);
		}

		// Display result
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
	}
}
package converting;

public class inputToFahrenheitConverter {
	static tempConverter converter = new tempConverter();

	public static void main(String[] args) throws Exception {
		if (args.length == 3) {
			try {
				int start = Integer.parseInt(args[0]);
				int end = Integer.parseInt(args[1]);
				int step = Integer.parseInt(args[2]);
				tempConverter.celsiusToFahrenheit(start, end, step);
			} catch (NumberFormatException ex) {
					System.out.println ("Error: you need to provide 3 numbers");
			}
		} else if (args.length == 1) {
			try {
				int toConvert = Integer.parseInt(args[0]);
				System.out.println(toConvert + " in fahrenheit = " + tempConverter.celsiusToFahrenheit(toConvert));
			} catch (NumberFormatException ex) {
					System.out.println ("Error: you need to provide 3 numbers");
			}
		}		else {
			System.out.println(" Wrong number of arguments ");
		}
	}
}
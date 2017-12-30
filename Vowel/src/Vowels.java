/*
 * @author Bikrant Das Sharma
 * This class reads input, counts the number of vowels, changes spaces to tildas, and outputs to 
 * a file dentist.txt
 * October 23, 2017
 */


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc;
		FileWriter fw;
		try {
			// gets the input vowel
			sc = new Scanner(new File("/Volumes/BIK'S USB/APCS/Vowel/src/poetry.txt"));
			// creates and/or erases the file dentist
			fw = new FileWriter("/Volumes/BIK'S USB/APCS/Vowel/src/dentist.txt");
			// these ints store the number of each vowel
			int a = 0;
			int e = 0;
			int i = 0;
			int o = 0;
			int u = 0;
			// checks whether the text file has any more lines of input
			while (sc.hasNext()) {
				// sets the string input to one line of input
				String input = sc.nextLine();
				System.out.println("" + input);
				// looks at each character and checks whether it is a vowel, space, or something
				// else
				for (int j = 0; j < input.length(); j++) {
					char ch = input.charAt(j);
					// checks for the vowel a, regardless of case
					if (ch == 'a' || ch == 'A') {
						// increments the number of a values by one
						a++;
						fw.write(ch);
					} // checks for the vowel e, regardless of case
					else if (ch == 'e' || ch == 'E') {
						// increments the number of e values by one
						e++;
						fw.write(ch);
					} // checks for the vowel i, regardless of case
					else if (ch == 'i' || ch == 'I') {
						// increments the number of i values by one
						i++;
						fw.write(ch);
					} // checks for the vowel o, regardless of case
					else if (ch == 'o' || ch == 'O') {
						// increments the number of o values by one
						o++;
						fw.write(ch);
					} // checks for the vowel u, regardless of case
					else if (ch == 'u' || ch == 'U') {
						// increments the number of u values by one
						u++;
						fw.write(ch);
					}
					// checks if there is a space, and replaces it with a ~
					else if (ch == ' ') {
						fw.write('~');
					} else {
						fw.write(ch);
					}
				}
				// new line after each line is checked
				fw.write("\r\n");
			}
			// outputs to the text file the number of each vowel
			fw.write("\r\nNumber of a's: " + a + "\r\n" + "Number of e's: " + e + "\r\n" + "Number of i's: " + i
					+ "\r\n" + "Number of o's: " + o + "\r\n" + "Number of u's: " + u);
			fw.close();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());

		}
	}

}

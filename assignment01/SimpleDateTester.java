package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester {
	public static void main(String[] args) {

    SimpleDate date1 = SimpleDate.of(1999, 3, 4);
    SimpleDate date2 = SimpleDate.of(2000, 8, 6);
    SimpleDate date3 = SimpleDate.of(1998, 3, 5);
    SimpleDate date4 = SimpleDate.of(1999, 3, 4);


    System.out.print("date1 before date2. Expected: true. Actual: ");
    System.out.println(date1.before(date2));
    System.out.print("date1 before date3. Expected: false. Actual: ");
    System.out.println(date1.before(date3));
    System.out.print("date1 before date4. Expected: false. Actual: ");
    System.out.println(date1.before(date4));

    System.out.println();

		try(PrintWriter output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");

      SimpleDate date1_2 = SimpleDate.of(1999, 3, 4);
      SimpleDate date2_2 = SimpleDate.of(2000, 8, 6);
      SimpleDate date3_2 = SimpleDate.of(1998, 3, 5);
      SimpleDate date4_2 = SimpleDate.of(1999, 3, 4);


      output.print("date1_2 before date2_2. Expected: true. Actual: ");
      output.println(date1_2.before(date2_2));
      output.print("date1_2 before date3_2. Expected: false. Actual: ");
      output.println(date1_2.before(date3_2));
      output.print("date1_2 before date4_2. Expected: false. Actual: ");
      output.println(date1_2.before(date4_2));

      output.println();

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester {
	public static void main(String[] args) {

    StreetUSAddress address1 = new StreetUSAddress("1408 Main Street", "",
                               "Boston", "MA", "02101");
    StreetUSAddress address2 = new StreetUSAddress("19 Alpine Court", "Apt 2B",
                               "Detroit", "MI", "48127");

    System.out.println(address1);
    System.out.println();
    System.out.println(address2);

		try(PrintWriter output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

      StreetUSAddress address1_2 = new StreetUSAddress("1408 Main Street", "",
                                 "Boston", "MA", "02101");
      StreetUSAddress address2_2 = new StreetUSAddress("19 Alpine Court", "Apt 2B",
                                 "Detroit", "MI", "48127");

      output.println(address1_2);
      output.println();
      output.println(address2_2);

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

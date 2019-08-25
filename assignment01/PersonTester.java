package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
	public static void main(String[] args) {

    DateAndPlaceOfBirth birth = new DateAndPlaceOfBirth(1999, 3, 4, "Buffalo",
                                "NY", "USA");
    StreetUSAddress address = new StreetUSAddress("1408 Main Street", "Apt 4D",
                              "Boston", "MA", "02101");
    Person person = new Person("Ryan", "Klein", "543-99-0001",
                              birth, address);

    System.out.println(person);
    System.out.println();

		try(PrintWriter output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

      DateAndPlaceOfBirth birth_2 = new DateAndPlaceOfBirth(1999, 3, 4, "Buffalo",
                                  "NY", "USA");
      StreetUSAddress address_2 = new StreetUSAddress("1408 Main Street", "",
                                "Boston", "MA", "02101");
      Person person_2 = new Person("Ryan", "Klein", "543-99-0001",
                                birth_2, address_2);

      output.println(person_2);
      output.println();

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

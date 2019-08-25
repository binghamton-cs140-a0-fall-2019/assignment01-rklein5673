package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
	public static void main(String[] args) {

    DateAndPlaceOfBirth birth = new DateAndPlaceOfBirth(1999, 3, 4, "Buffalo",
                                "NY", "USA");
    StreetUSAddress address = new StreetUSAddress("1408 Main Street", "Apt 4D",
                              "Boston", "MA", "02101");
    Person ryan = new Person("Ryan", "Klein", "543-99-0001",
                              birth, address);
    Computer comp1 = new Computer("Dell", "Intel i5 - Quad Core 2.8 Ghz",
                                  8, 500, true, 499.99);
    Computer comp2 = new Computer("HP", "Intel i7 - Eight Core 3.2 Ghz",
                                  32, 2000, false, 1299.99);
    Computer comp3 = new Computer("Apple", "Intel i7 - Eight Core 3.4 Ghz",
                                  16, 1500, true, 2499.99);
    Computer comp4 = new Computer("Asus", "Intel i3 - Quad Core 2.4 Ghz",
                                  4, 250, false, 299.99);
    ComputerOwner owner = new ComputerOwner(ryan);
    owner.addComputer(comp1);
    owner.addComputer(comp2);
    owner.addComputer(comp3);
    owner.addComputer(comp4);

    System.out.println(owner);
    System.out.println();

    owner.removeComputer(3);
    owner.removeComputer(1);

    System.out.println(owner);
    System.out.println();

		try(PrintWriter output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

      DateAndPlaceOfBirth birth_2 = new DateAndPlaceOfBirth(1999, 3, 4, "Buffalo",
                                  "NY", "USA");
      StreetUSAddress address_2 = new StreetUSAddress("1408 Main Street", "Apt 4D",
                                "Boston", "MA", "02101");
      Person ryan_2 = new Person("Ryan", "Klein", "543-99-0001",
                                birth_2, address_2);
      Computer comp1_2 = new Computer("Dell", "Intel i5 - Quad Core 2.8 Ghz",
                                    8, 500, true, 499.99);
      Computer comp2_2 = new Computer("HP", "Intel i7 - Eight Core 3.2 Ghz",
                                    32, 2000, false, 1299.99);
      Computer comp3_2 = new Computer("Apple", "Intel i7 - Eight Core 3.4 Ghz",
                                    16, 1500, true, 2499.99);
      Computer comp4_2 = new Computer("Asus", "Intel i3 - Quad Core 2.4 Ghz",
                                    4, 250, false, 299.99);
      ComputerOwner owner_2 = new ComputerOwner(ryan);
      owner_2.addComputer(comp1_2);
      owner_2.addComputer(comp2_2);
      owner_2.addComputer(comp3_2);
      owner_2.addComputer(comp4_2);

      output.println(owner_2);
      output.println();

      owner_2.removeComputer(3);
      owner_2.removeComputer(1);

      output.println(owner_2);
      output.println();

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

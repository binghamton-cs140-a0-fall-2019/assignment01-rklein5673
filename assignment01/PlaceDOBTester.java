package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
	public static void main(String[] args) {

    DateAndPlaceOfBirth birth1 = new DateAndPlaceOfBirth(1999, 3, 4, "Buffalo",
                                 "NY", "USA");
    DateAndPlaceOfBirth birth2 = new DateAndPlaceOfBirth(1942, 6, 15, "Lansing",
                                 "MI", "USA");
    DateAndPlaceOfBirth birth3 = new DateAndPlaceOfBirth(1988, 3, 4, "Mountain View",
                                 "CA", "USA");
    DateAndPlaceOfBirth birth4 = new DateAndPlaceOfBirth(1999, 3, 4, "Kiev",
                                 "Ukraine");
    DateAndPlaceOfBirth birth5 = new DateAndPlaceOfBirth(2015, 11, 11, "Singapore",
                                 "Singapore");

    //Print the values of each object
    System.out.println("Birth1: \n" + birth1);
    System.out.println("Birth2: \n" + birth2);
    System.out.println("Birth3: \n" + birth3);
    System.out.println("Birth4: \n" + birth4);
    System.out.println("Birth5: \n" + birth5);

    System.out.println();

    //Testing of olderThan
    System.out.print("birth1 is older than birth2. Expected: false. Actual: ");
    System.out.println(birth1.olderThan(birth2));
    System.out.print("birth1 is older than birth5. Expected: true. Actual: ");
    System.out.println(birth1.olderThan(birth5));
    System.out.print("birth1 is older than birth4. Expected: false. Actual: ");
    System.out.println(birth1.olderThan(birth4));

    System.out.println();

    //Testing of youngerThan
    System.out.print("birth3 is younger than birth1. Expected: false. Actual: ");
    System.out.println(birth3.youngerThan(birth1));
    System.out.print("birth3 is younger than birth2. Expected: true. Actual: ");
    System.out.println(birth3.youngerThan(birth2));
    System.out.print("birth4 is younger than birth1. Expected: false. Actual: ");
    System.out.println(birth4.youngerThan(birth1));

    System.out.println();

    //Testing of hasSameBirthDateAs
    System.out.print("birth1 has the same birth date as birth4. Expected: true. Actual: ");
    System.out.println(birth1.hasSameBirthDateAs(birth4));
    System.out.print("birth1 has the same birth date as birth3. Expected: false. Actual: ");
    System.out.println(birth1.hasSameBirthDateAs(birth3));
    System.out.print("birth4 has the same birth date  as birth5. Expected: false. Actual: ");
    System.out.println(birth4.hasSameBirthDateAs(birth5));

    System.out.println();

    //Testing of hasSameBirthDayAs
    System.out.print("birth1 has the same birthday date as birth4. Expected: true. Actual: ");
    System.out.println(birth1.hasSameBirthDayAs(birth4));
    System.out.print("birth1 has the same birthday as birth3. Expected: true. Actual: ");
    System.out.println(birth1.hasSameBirthDayAs(birth3));
    System.out.print("birth4 has the same birthday as birth5. Expected: false. Actual: ");
    System.out.println(birth4.hasSameBirthDayAs(birth5));

		try(PrintWriter output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

      DateAndPlaceOfBirth birth1_2 = new DateAndPlaceOfBirth(1999, 3, 4, "Buffalo",
                                   "NY", "USA");
      DateAndPlaceOfBirth birth2_2 = new DateAndPlaceOfBirth(1942, 6, 15, "Lansing",
                                   "MI", "USA");
      DateAndPlaceOfBirth birth3_2 = new DateAndPlaceOfBirth(1988, 3, 4, "Mountain View",
                                   "CA", "USA");
      DateAndPlaceOfBirth birth4_2 = new DateAndPlaceOfBirth(1999, 3, 4, "Kiev",
                                   "Ukraine");
      DateAndPlaceOfBirth birth5_2 = new DateAndPlaceOfBirth(2015, 11, 11, "Singapore",
                                   "Singapore");

      //Print the values of each object
      output.println("birth1_2: \n" + birth1_2);
      output.println("birth2_2: \n" + birth2_2);
      output.println("birth3_2: \n" + birth3_2);
      output.println("birth4_2: \n" + birth4_2);
      output.println("birth5_2: \n" + birth5_2);

      output.println();

      //Testing of olderThan
      output.print("birth1_2 is older than birth2_2. Expected: false. Actual: ");
      output.println(birth1_2.olderThan(birth2_2));
      output.print("birth1_2 is older than birth5_2. Expected: true. Actual: ");
      output.println(birth1_2.olderThan(birth5_2));
      output.print("birth1_2 is older than birth4_2. Expected: false. Actual: ");
      output.println(birth1_2.olderThan(birth4_2));

      output.println();

      //Testing of youngerThan
      output.print("birth3_2 is younger than birth1_2. Expected: false. Actual: ");
      output.println(birth3_2.youngerThan(birth1_2));
      output.print("birth3_2 is younger than birth2_2. Expected: true. Actual: ");
      output.println(birth3_2.youngerThan(birth2_2));
      output.print("birth4_2 is younger than birth1_2. Expected: false. Actual: ");
      output.println(birth4_2.youngerThan(birth1_2));

      output.println();

      //Testing of hasSameBirthDateAs
      output.print("birth1_2 has the same birth date as birth4_2. Expected: true. Actual: ");
      output.println(birth1_2.hasSameBirthDateAs(birth4_2));
      output.print("birth1_2 has the same birth date as birth3_2. Expected: false. Actual: ");
      output.println(birth1_2.hasSameBirthDateAs(birth3_2));
      output.print("birth4_2 has the same birth date  as birth5_2. Expected: false. Actual: ");
      output.println(birth4_2.hasSameBirthDateAs(birth5_2));

      output.println();

      //Testing of hasSameBirthDayAs
      output.print("birth1_2 has the same birthday date as birth4_2. Expected: true. Actual: ");
      output.println(birth1_2.hasSameBirthDayAs(birth4_2));
      output.print("birth1_2 has the same birthday as birth3_2. Expected: true. Actual: ");
      output.println(birth1_2.hasSameBirthDayAs(birth3_2));
      output.print("birth4_2 has the same birthday as birth5_2. Expected: false. Actual: ");
      output.println(birth4_2.hasSameBirthDayAs(birth5_2));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

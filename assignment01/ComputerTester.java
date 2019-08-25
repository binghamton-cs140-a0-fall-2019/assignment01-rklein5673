package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
  Computer comp1 = new Computer("Dell", "Intel i5 - Quad Core 2.8 Ghz",
                                8, 500, true, 499.99);
  Computer comp2 = new Computer("HP", "Intel i7 - Eight Core 3.2 Ghz",
                                32, 2000, false, 1299.99);
  Computer comp3 = new Computer("Apple", "Intel i7 - Eight Core 3.4 Ghz",
                                16, 1500, true, 2499.99);
  Computer comp4 = new Computer("Asus", "Intel i3 - Quad Core 2.4 Ghz",
                                4, 250, false, 299.99);

  System.out.println(comp1);
  System.out.println(comp2);
  System.out.println(comp3);
  System.out.println(comp4);

		try(PrintWriter output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

      Computer comp1_2 = new Computer("Dell", "Intel i5 - Quad Core 2.8 Ghz",
                                    8, 500, true, 499.99);
      Computer comp2_2 = new Computer("HP", "Intel i7 - Eight Core 3.2 Ghz",
                                    32, 2000, false, 1299.99);
      Computer comp3_2 = new Computer("Apple", "Intel i7 - Eight Core 3.4 Ghz",
                                    16, 1500, true, 2499.99);
      Computer comp4_2 = new Computer("Asus", "Intel i3 - Quad Core 2.4 Ghz",
                                    4, 250, false, 299.99);

      output.println(comp1_2);
      output.println(comp2_2);
      output.println(comp3_2);
      output.println(comp4_2);

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YeshaCarDemo {

	ArrayList<YeshaWheel> obj2 = new ArrayList<YeshaWheel>();
	static ArrayList<YeshaCar> obj1 = new ArrayList<YeshaCar>();
	static YeshaCar.YeshaCarColour a = YeshaCar.YeshaCarColour.Red;
	static YeshaCar.YeshaCarColour b = YeshaCar.YeshaCarColour.Blue;
	static YeshaWheel.YeshaColour aa = YeshaWheel.YeshaColour.Red;
	static YeshaWheel.YeshaColour bb = YeshaWheel.YeshaColour.Blue;

	public static void main(String[] args) throws IOException, IndexOutOfBoundsException {
		// TODO Auto-generated method stub

		// 1st function called
		YeshaCarDemo o = new YeshaCarDemo();
		o.YeshaCarInfo();

		new YeshaCar(a, 2011, "BMW");
		new YeshaCar(a, 2012, "HONDA");

		System.out.println("by manufactory " + obj1.get(0).YeshasortWheelByManyFactory());
		System.out.println("by wheel " + obj1.get(0).YeshasortWheelByYear());
		System.out.println("Serached BMW " + obj1.get(0).YeshasearchWheel("YeshaBMW"));
		System.out.println("Serached honda " + obj1.get(0).YeshasearchWheel("YeshaHONDA"));
		System.out.println("serached benz " + obj1.get(0).YeshasearchWheel("YeshaBENZ"));
		System.out.println("Latest Wheel " + obj1.get(0).YeshagetLatestWheel());
		System.out.println(obj1.get(0));

	}

	List<String> temps = new ArrayList<String>();
	List<String> tempss = new ArrayList<String>();

	// String s1[],s2[],s3[],s4[];
	public void YeshaCarInfo() throws IOException {
		// FileInputStream fstream = new
		
		String token1 = "";


		// create Scanner inFile1
		@SuppressWarnings("resource")
		Scanner inFile1 = new Scanner(new File("/home/cd/root/YeshaCarData.txt"))
				.useDelimiter(",\\s*");

		// Original answer used LinkedList, but probably preferable to use
		// ArrayList in most cases
		// List<String> temps = new LinkedList<String>();
		// List<String> temps = new ArrayList<String>();

		// while loop
		while (inFile1.hasNextLine()) {
			// find next line
			token1 = inFile1.nextLine();
			temps.add(token1);
		}
		inFile1.close();
		// System.out.println(temps.get(2));
		for (int i = 1; i < temps.size() - 1; i++) {
			if (temps.get(i).contains("YeshaCarInfo")) {
				String delims = "[,]";
				String[] s1 = temps.get(i).split(delims);

				String color = s1[1];

				int year = Integer.parseInt((s1[3]));
				String manu = s1[2];
				if (color.equalsIgnoreCase("blue")) {
					obj1.add(new YeshaCar(b, year, manu));
				} else if (color.equalsIgnoreCase("black")) {
					obj1.add(new YeshaCar(a, year, manu));
				}
			} else if (temps.get(i).contains("YeshaWheelInfo")) {
				String delims = "[,]";
				String[] s2 = temps.get(i).split(delims);

				String colorr = s2[1];
				int yearr = Integer.parseInt((s2[3]));
				String manur = s2[2];
				if (colorr.equalsIgnoreCase("blue")) {
					obj1.get(0).YeshaaddWheel(new YeshaWheel(bb, yearr, manur));
				} else if (colorr.equalsIgnoreCase("black")) {
					obj1.get(0).YeshaaddWheel(new YeshaWheel(aa, yearr, manur));
				}
			}
		}

	}

}


public class YeshaWheel {

	public enum YeshaColour {
		Red, Blue, Green
	};

	YeshaColour Colour;
	int YeshaYear;
	String YeshaManuFactory;

	public YeshaWheel(YeshaColour Colour, int YeshaYear, String YeshaManuFactory) {
		this.Colour = Colour;
		this.YeshaYear = YeshaYear;
		this.YeshaManuFactory = YeshaManuFactory;
	}

	public int getYeshaYear() {
		return YeshaYear;
	}

	public void setYeshaYear(int YeshaYear) {
		this.YeshaYear = YeshaYear;
	}

	public String getYeshaManuFactory() {
		return YeshaManuFactory;
	}

	public void setYeshaManuFactory(String YeshaManuFactory) {
		this.YeshaManuFactory = YeshaManuFactory;
	}

	public YeshaColour getColour() {
		return Colour;
	}

	public void setColour(YeshaColour Colour) {
		this.Colour = Colour;
	}

	public String toString() {
		return ("From YeshaWheel Class \nyear " + YeshaYear + "\nManufatory " + YeshaManuFactory + "\n");
	}

}

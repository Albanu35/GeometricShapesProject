package tech;

public class Pixel {
	// int nrPixel;
	String color;

	// 2 constructors
	public Pixel() {
		this("#FFFFFF");
	}

	public Pixel(String color) {
		this.color = color;
	}

	// method of setter
	public void setPixel(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pixel other = (Pixel) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pixel [color=" + color + "]";
	}
}

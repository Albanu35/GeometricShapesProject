package tech;

import java.util.ArrayList;

public class Screen {
	private ArrayList<Pixel> pixels;
	private Dimensions dimensions;

	public Screen(int nrPixels, int width, int length, int depth) {
		this.dimensions = new Dimensions(width, length, depth);
		this.pixels = new ArrayList<Pixel>();
		for (int i = 0; i < nrPixels; i++) {
			this.pixels.add(new Pixel());
		}
	}

	public void setPixel(int nrPixels, String color) {
		System.out.println("class Screen delegate to Pixel: ");
		this.pixels.get(nrPixels).setPixel(color);

	}

	public void colorScreen(String color) {
		for (int i = 0; i < pixels.size(); i++) {
			this.pixels.get(i).setPixel(color);
		}
	}

	//method of override hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dimensions == null) ? 0 : dimensions.hashCode());
		result = prime * result + ((pixels == null) ? 0 : pixels.hashCode());
		return result;
	}

	//method of override equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Screen other = (Screen) obj;
		if (dimensions == null) {
			if (other.dimensions != null)
				return false;
		} else if (!dimensions.equals(other.dimensions))
			return false;
		if (pixels == null) {
			if (other.pixels != null)
				return false;
		} else if (!pixels.equals(other.pixels))
			return false;
		return true;
	}

	//method override toString
	@Override
	public String toString() {
		return "Screen [pixels=" + pixels + ", dimensions=" + dimensions + "]";
	}
	
}


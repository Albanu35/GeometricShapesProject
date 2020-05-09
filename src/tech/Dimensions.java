package tech;

public class Dimensions {
	private final int width;
	private final int length;
	private final int depth;

	public Dimensions(int width, int length, int depth) {
		this.width = width;
		this.length = length;
		this.depth = depth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + depth;
		result = prime * result + length;
		result = prime * result + width;
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
		Dimensions other = (Dimensions) obj;
		if (depth != other.depth)
			return false;
		if (length != other.length)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dimensions [width=" + width + ", length=" + length + ", depth=" + depth + "]";
	}
}

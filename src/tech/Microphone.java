package tech;

public class Microphone {
	private int maxVolumeMicro;
	private int crtVolumeMicro;

	public Microphone(int maxVolumeMicro) {
		this.maxVolumeMicro = maxVolumeMicro;
		this.crtVolumeMicro = (int) (0.25 * this.maxVolumeMicro);
	}

	public Microphone(int maxVolumeMicro, int crtVolumeMicro) {
		this(maxVolumeMicro);
		this.crtVolumeMicro = crtVolumeMicro;
	}

	// method of increase current volume
	public boolean increaseVolume() {
		if (this.crtVolumeMicro < this.maxVolumeMicro) {
			this.crtVolumeMicro++;
			return true;
		} else {
			return false;
		}
	}

	// method of decrease current volume
	public boolean decreaseVolume() {
		if (this.crtVolumeMicro > 0) {
			this.crtVolumeMicro--;
			return true;
		} else {
			return false;
		}
	}

	// method of volume mute
	public void muteMicrophone() {
		this.crtVolumeMicro = 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + crtVolumeMicro;
		result = prime * result + maxVolumeMicro;
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
		Microphone other = (Microphone) obj;
		if (crtVolumeMicro != other.crtVolumeMicro)
			return false;
		if (maxVolumeMicro != other.maxVolumeMicro)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Microphone [maxVolumeMicro=" + maxVolumeMicro + ", crtVolumeMicro=" + crtVolumeMicro + "]";
	}
}

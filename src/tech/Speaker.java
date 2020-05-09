package tech;

public class Speaker {
	private int maxVolumeSpeaker;
	private int crtVolumeSpeaker;

	public Speaker(int maxVolumeSpeaker) {
		this.maxVolumeSpeaker = maxVolumeSpeaker;
		this.crtVolumeSpeaker = (int) (0.25 * this.maxVolumeSpeaker);
	}

	public Speaker(int maxVolumeSpeaker, int crtVolumeSpeaker) {
		this(maxVolumeSpeaker);
		this.crtVolumeSpeaker = crtVolumeSpeaker;
	}

	// method of increase current volume
	public boolean increaseVolume() {
		if (this.crtVolumeSpeaker < this.maxVolumeSpeaker) {
			this.crtVolumeSpeaker++;
			return true;
		} else {
			return false;
		}
	}

	// method of decrease current volume
	public boolean decreaseVolume() {
		if (this.crtVolumeSpeaker > 0) {
			this.crtVolumeSpeaker--;
			return true;
		} else {
			return false;
		}
	}

	// method of volume mute
	public void setSilenceMode() {
		this.crtVolumeSpeaker = 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + crtVolumeSpeaker;
		result = prime * result + maxVolumeSpeaker;
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
		Speaker other = (Speaker) obj;
		if (crtVolumeSpeaker != other.crtVolumeSpeaker)
			return false;
		if (maxVolumeSpeaker != other.maxVolumeSpeaker)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Speaker [maxVolumeSpeaker=" + maxVolumeSpeaker + ", crtVolumeSpeaker=" + crtVolumeSpeaker + "]";
	}
}

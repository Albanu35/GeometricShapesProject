package tech;

public class Smartphone {
	private Screen theScreen;
	private Case theCase;
	private Speaker theSpeaker;
	private Microphone theMicrophone;

	public Smartphone(int nrPixel, int width, int length, int depth, int maxVolumeSpeaker, int maxVolumeMicro) {
		this.theScreen = new Screen(nrPixel, width, length, depth);
		this.theCase = new Case();
		this.theSpeaker = new Speaker(maxVolumeSpeaker);
		this.theMicrophone = new Microphone(maxVolumeMicro);
	}

	public Smartphone(int nrPixel, int width, int length, int depth, int maxVolumeSpeaker, int maxVolumeMicro,
			int crtVolumeSpeaker, int crtVolumeMicro) {
		this(nrPixel, width, length, depth, maxVolumeSpeaker, maxVolumeMicro);
		this.theSpeaker = new Speaker(crtVolumeSpeaker);
		this.theMicrophone = new Microphone(crtVolumeMicro);
	}
	
	//method hashcode and equals 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((theCase == null) ? 0 : theCase.hashCode());
		result = prime * result + ((theMicrophone == null) ? 0 : theMicrophone.hashCode());
		result = prime * result + ((theScreen == null) ? 0 : theScreen.hashCode());
		result = prime * result + ((theSpeaker == null) ? 0 : theSpeaker.hashCode());
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
		Smartphone other = (Smartphone) obj;
		if (theCase == null) {
			if (other.theCase != null)
				return false;
		} else if (!theCase.equals(other.theCase))
			return false;
		if (theMicrophone == null) {
			if (other.theMicrophone != null)
				return false;
		} else if (!theMicrophone.equals(other.theMicrophone))
			return false;
		if (theScreen == null) {
			if (other.theScreen != null)
				return false;
		} else if (!theScreen.equals(other.theScreen))
			return false;
		if (theSpeaker == null) {
			if (other.theSpeaker != null)
				return false;
		} else if (!theSpeaker.equals(other.theSpeaker))
			return false;
		return true;
	}

	public void pressVolumeUp() {
		// delegate the responsibility to the object specific method
		// Obs: reusing the object functionality
		System.out.println("class Smartphone: delegate to Case ->");
		this.theCase.pressVolumeUp();
		System.out.println("class Smartphone: delegate to Speaker ->");
		this.theSpeaker.increaseVolume();
	}

	public void pressVolumeDown() {
		// delegate the responsibility to the object specific method
		// Obs: reusing the object functionality
		System.out.println("class Smartphone: delegate to Case ->");
		this.theCase.pressVolumeDown();
		System.out.println("class Smartphone: delegate to Speaker ->");
		this.theSpeaker.decreaseVolume();
	}

	public void setPixel(int nrPixel, String color) {
		System.out.println("class Smartphone: delegate to Screen");
		this.theScreen.setPixel(nrPixel, color);

	}

	public void colorScreen(String colorEcran) {
		System.out.println("class Smartphone: delegate to Screen");
		this.theScreen.colorScreen(colorEcran);
	}

	public void increaseMicrophoneVolume() {
		System.out.println("class Smartphone delegate to Microphone");
		this.theMicrophone.increaseVolume();
	}

	public void decreaseMicrophoneVolume() {
		System.out.println("class Smartphone delegate to Microphone");
		this.theMicrophone.decreaseVolume();
	}

	public void muteMicrophone() {
		System.out.println("class Smartphone delegate to Microphone");
		this.theMicrophone.muteMicrophone();
	}

	public void setSilenceMode() {
		System.out.println("class Smartphone delegate to Speaker");
		this.theSpeaker.setSilenceMode();
	}

	//method to String
	@Override
	public String toString() {
		return "Smartphone [theScreen=" + theScreen + ", theCase=" + theCase + ", theSpeaker=" + theSpeaker
				+ ", theMicrophone=" + theMicrophone + "]";
	}
}

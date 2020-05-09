package tech;

public class TestDevices {

	public static void main(String[] args) {
		// to create a smartphone, we will first create it's components
		Screen aPhoneScreen = new Screen(100, 10, 15, 5);
		Case aPhoneCase = new Case();
		Speaker aPhoneSpeaker = new Speaker(100);
		Microphone aPhoneMicrophone = new Microphone(100);
		Smartphone smartphone = new Smartphone(50, 7, 10, 15, 100, 100);

		// we create a nokia object; it will create it's components
		Screen nokiaScreen = new Screen(100, 10, 15, 5);
		Case nokiaCase = new Case();
		Speaker nokiaSpeaker = new Speaker(100);
		Microphone nokiaMicrophone = new Microphone(100);
		Smartphone nokia = new Smartphone(50, 10, 15, 5, 100, 100);

		System.out.println();

		// method toString implemented by Smartphone
		System.out.println(smartphone.toString());
		System.out.println();
		// we use the 'wrapper' methods, implemented by Smartphone
		// to press each case button
		System.out.println("Case 2: use the 'wrapper' methods for smartphone:");
		smartphone.pressVolumeUp();
		smartphone.pressVolumeDown();
		smartphone.colorScreen("red");
		smartphone.setPixel(15, "blue");
		smartphone.increaseMicrophoneVolume();
		smartphone.decreaseMicrophoneVolume();
		smartphone.muteMicrophone();
		smartphone.setSilenceMode();
		System.out.println();

		// method toString implements by nokia
		System.out.println(nokia.toString());
		System.out.println();

		// we use the 'wrapper' methods, implemented by nokia
		// to press each case button
		System.out.println("Case 2: use the 'wrapper' methods for nokia:");
		nokia.pressVolumeUp();
		nokia.pressVolumeDown();
		nokia.colorScreen("yellow");
		nokia.setPixel(25, "green");
		nokia.increaseMicrophoneVolume();
		nokia.decreaseMicrophoneVolume();
		nokia.muteMicrophone();
		nokia.setSilenceMode();
		System.out.println();

		// method of equals and hashcode
		System.out.println("nokia is equals with smartphone? : " + nokia.equals(smartphone));
		System.out.println("Hash code's nokia is: " + nokia.hashCode());
		System.out.println("smartphone is equals with nokia? :" + smartphone.equals(nokia));
		System.out.println("Hash code's smartphone is: " + smartphone.hashCode());
		System.out.println();

		// press each case button to object nokia
		nokia.colorScreen("black");
		nokia.increaseMicrophoneVolume();
		nokia.increaseMicrophoneVolume();
		nokia.pressVolumeUp();
		nokia.setPixel(33, "white");
		System.out.println(nokia.toString());
	}

}
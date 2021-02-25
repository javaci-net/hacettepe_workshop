package chapter09;

public class TV {
	public int channel = 1; // Default channel is 1
	private int volumeLevel = 1; // Default volume level is 1
	private boolean on = false; // By default TV is off

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public int getChannel() {
		return channel;
	}

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public void setChannel(int channel) {
		if (on && channel >= 1 && channel <= 120)
			this.channel = channel;
	}

	public void setVolume(int newVolumeLevel) {
		if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
			volumeLevel = newVolumeLevel;
	}

	public void channelUp() {
		if (on && channel < 120)
			channel++;
	}

	public void channelDown() {
		if (on && channel > 1)
			channel--;
	}

	public void volumeUp() {
		if (on && volumeLevel < 7)
			volumeLevel++;
	}

	public void volumeDown() {
		if (isValidvolumeDown())
			volumeLevel--;
	}

	private boolean isValidvolumeDown() {
		return on && volumeLevel > 1;
	}
}

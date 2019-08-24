import java.net.ConnectException;

public class Out2 {
	public static void main(String[] args) {
        Elavator elavator = new Elavator();
		Home.elevator.callForDown();
		try {
			String rp = Weather.rainfalProbability();
			Home.speaker.makeVoice("rainfal probability is "+rp);
		} catch (ConnectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Boolean isClose = Home.window.close();
		if(isClose) {
			Home.window.lock();
		}
		for(int i = 0; i<Home.lights.length; i++) {
			Home.lights[i].off();
		}
		Home.aircon.off();
	}
}

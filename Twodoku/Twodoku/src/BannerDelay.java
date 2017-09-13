import java.util.Timer;
import java.util.TimerTask;

public class BannerDelay extends TimerTask{

	private Timer timer;
	
	public BannerDelay (Timer timer) {
		this.timer = timer;
	}

	@Override
	public void run() {
		timer.cancel();

	}

}
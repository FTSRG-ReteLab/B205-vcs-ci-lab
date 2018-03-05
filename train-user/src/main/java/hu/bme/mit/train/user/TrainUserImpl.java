package hu.bme.mit.train.user;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainUser;
import java.util.Timer;
import java.util.TimerTask;

public class TrainUserImpl implements TrainUser {

	private TrainController controller;
	private int joystickPosition;
	private Timer timer = new Timer();

	public TrainUserImpl(TrainController controller) {
		this.controller = controller;
	}
	
	@Override
	public void joystickChange(int joystickPos){
		timer.scheduleAtFixedRate(new TimerTask() {
			  @Override
			  public void run() {
				  controller.setJoystickPosition(joystickPos);
				  controller.followSpeed();
			  }
			}, 0, 60*1000);
	}

	@Override
	public boolean getAlarmFlag() {
		return false;
	}

	@Override
	public int getJoystickPosition() {
		return joystickPosition;
	}

	@Override
	public void overrideJoystickPosition(int joystickPosition) {
		this.joystickPosition = joystickPosition;
		controller.setJoystickPosition(joystickPosition);
	}
	
	public int doNot(int x){
		String s = "no";
		int i = 2;
		return x = 99;
	}

}

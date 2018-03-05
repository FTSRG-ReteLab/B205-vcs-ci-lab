package hu.bme.mit.train.user;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainUser;
import java.util.Timer;
import java.util.TimerTask;

public class TrainUserImpl implements TrainUser {

	private TrainController controller;
	private int joystickPosition;
	private Timer timer = new Timer();
	private boolean alarmState;

	public TrainUserImpl(TrainController controller) {
		this.controller = controller;
	}

	@Override
	public void setAlarmState(boolean alarmState){
		this.alarmState = alarmState;
	}
	
	@Override
	public boolean getAlarmState(){
		return alarmState;
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
		this.joystickPositionChanged(joystickPosition);
	}
	
	@Override
	public void joystickPositionChanged(int joystickPosition){
		timer.scheduleAtFixedRate(new TimerTask() {
			  @Override
			  public void run() {
				  controller.setJoystickPosition(joystickPosition);
				  controller.followSpeed();
			  }
			  },0,(long) 60*1000);
	}

}

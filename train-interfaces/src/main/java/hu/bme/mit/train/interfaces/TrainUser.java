package hu.bme.mit.train.interfaces;

public interface TrainUser {

	int getJoystickPosition();

	boolean getAlarmFlag();

	void overrideJoystickPosition(int joystickPosition);
	
	void joystickPositionChanged(int joystickPosition);
	
	void setAlarmState(boolean alarmState);
	
	boolean getAlarmState();

	void setCont(TrainController t);
}

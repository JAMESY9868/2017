package main.java.org.usfirst.frc.team4215.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;


public class Robot extends IterativeRobot {
	Joystick winchJoystick = new Joystick(0);
	WinchTest winch;
	public void robotInit(){
		winch = new WinchTest();
	}

	public void teleopInit() {
	
		double l = winchJoystick.getRawAxis(2);
		

		winch.set(l, l);
		
	}

}

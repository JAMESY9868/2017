package org.usfirst.frc.team4215.robot;

import edu.wpi.first.wpilibj.command.Command;

public class AutonomousCommandRight extends CommandGroup {

	AutonomousCommandRight(){
		addSequential(new CommandDrive(180, 10));
	}

}

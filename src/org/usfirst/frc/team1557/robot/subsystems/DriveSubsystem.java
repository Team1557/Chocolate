package org.usfirst.frc.team1557.robot.subsystems;

import org.usfirst.frc.team1557.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
	
	CANTalon backRight = new CANTalon(RobotMap.backRightId);
	CANTalon backLeft = new CANTalon(RobotMap.backLeftId);
	CANTalon frontLeft = new CANTalon(RobotMap.frontleftId);
	CANTalon frontRight = new CANTalon(RobotMap.frontRightId);
	
	public void tankDrive(double leftSide, double rightSide) {
		backRight.set(rightSide);
		backLeft.set(leftSide);
		frontLeft.set(leftSide);
		frontRight.set(rightSide);
	}
    
	// t methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}


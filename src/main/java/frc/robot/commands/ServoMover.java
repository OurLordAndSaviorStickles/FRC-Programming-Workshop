/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/**
 * This command spins the servo based on controller input
 */
public class ServoMover extends Command {

  public ServoMover() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.servoSubsystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to 
  //in this program, the wheel will turn 360 degrees.
  @Override
  protected void execute() {
      if (Robot.m_oi.joy.getPOV() == 90)
        Robot.servoSubsystem.farRight();
      else if (Robot.m_oi.joy.getPOV() == 270)
        Robot.servoSubsystem.farLeft();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
      return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}

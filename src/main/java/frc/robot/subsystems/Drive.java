// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Constants.DriveConstants;

public class Drive extends SubsystemBase {

  private MotorController leftMotor = new VictorSP(DriveConstants.leftMotorID);
  private MotorController rightMotor = new VictorSP(DriveConstants.rightMotorID);
  private DifferentialDrive differentialDrive = new DifferentialDrive(leftMotor, rightMotor);
  /** Creates a new ExampleSubsystem. */
  public Drive() {}

  public void tankDrive(double leftSpeed, double rightSpeed) {
    differentialDrive.tankDrive(leftSpeed, rightSpeed);
  }

  public void arcadeDrive(double speed, double rotation) {
    differentialDrive.arcadeDrive(speed, rotation);
  }
}

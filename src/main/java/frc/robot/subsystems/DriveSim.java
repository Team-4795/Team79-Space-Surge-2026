// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;
import edu.wpi.first.math.kinematics.DifferentialDriveWheelSpeeds;
import edu.wpi.first.wpilibj.simulation.DifferentialDrivetrainSim;
import edu.wpi.first.wpilibj.simulation.DifferentialDrivetrainSim.KitbotGearing;
import edu.wpi.first.wpilibj.simulation.DifferentialDrivetrainSim.KitbotMotor;
import edu.wpi.first.wpilibj.simulation.DifferentialDrivetrainSim.KitbotWheelSize;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import org.littletonrobotics.junction.Logger;

public class DriveSim extends SubsystemBase {

  private DifferentialDrivetrainSim driveSim = 
    DifferentialDrivetrainSim.createKitbotSim(
        KitbotMotor.kSingleCIMPerSide, 
        KitbotGearing.k10p71, 
        KitbotWheelSize.kSixInch, 
        null);
  DifferentialDriveKinematics kinematics = new DifferentialDriveKinematics(0.5);
  public DriveSim() {}

  public void arcadeDrive(double speed, double rotation) {
    DifferentialDriveWheelSpeeds wheelSpeeds = kinematics.toWheelSpeeds(new ChassisSpeeds(speed * 5, 0, rotation * 10));
    driveSim.setInputs(wheelSpeeds.leftMetersPerSecond, wheelSpeeds.rightMetersPerSecond);
  }

  public void tankDrive(double leftSpeed, double rightSpeed) {
    //driveSim.tankDrive(leftSpeed, rightSpeed);
    driveSim.setInputs(leftSpeed * 5, rightSpeed * 5);
  }

  @Override
  public void periodic() {
    driveSim.update(.02);
    Logger.recordOutput("Drive/Pose", driveSim.getPose());
    Logger.recordOutput("Drive/LeftVelocity", driveSim.getLeftVelocityMetersPerSecond());
    Logger.recordOutput("Drive/RightVelocity", driveSim.getRightVelocityMetersPerSecond());
  }
}


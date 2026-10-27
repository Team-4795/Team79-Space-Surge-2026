// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.DriveSim;
import frc.robot.subsystems.ShooterSim;
import frc.robot.subsystems.IntakeSim;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public final class Autos {
  /** Example static factory for an autonomous command. */

  public static Command leaveAuto(DriveSim driveSim) {
    return Commands.run(() -> 
      driveSim.tankDrive(0.75,0.75), driveSim).
      withTimeout(3);
  }

  public static Command shooterAuto(DriveSim driveSim, ShooterSim shooterSim) {
    return Commands.sequence(
      SubsystemCommands.spinShooter(shooterSim).
      withTimeout(5),
      leaveAuto(driveSim));
  }
}
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drive;
import frc.robot.subsystems.Shooter;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public final class Autos {
  /** Example static factory for an autonomous command. */

  public static Command leaveAuto(Drive drive) {
    return Commands.run(() -> drive.tankDrive(0.5,0.5), drive).withTimeout(3);
  }

  public static Command shooterAuto(Drive drive, Shooter shooter) {
    return Commands.sequence(SubsystemCommands.spinShooter(shooter).withTimeout(5),
     leaveAuto(drive));
  }
}
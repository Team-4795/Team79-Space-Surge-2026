package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.IntakeSim;
import frc.robot.subsystems.ShooterSim;

public class SubsystemCommands {
    public static Command spinShooter(ShooterSim shooter) {
        return Commands.run(() -> shooter.setShooterPower(0.5));
    }
    public static Command reverseShooter(ShooterSim shooter) {
        return Commands.run(() -> shooter.setShooterPower(-0.5));
    }

    public static Command spinIntake(IntakeSim intake) {
        return Commands.run(() -> intake.setIntakePower(0.5));
    }
    public static Command reverseIntake(IntakeSim intake) {
        return Commands.run(() -> intake.setIntakePower(-0.5));
    }
}

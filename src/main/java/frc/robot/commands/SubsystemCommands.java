package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;

public class SubsystemCommands {
    public static Command spinShooter(Shooter shooter) {
        return Commands.run(() -> shooter.setShooterPower(0.5));
    }
    public static Command reverseShooter(Shooter shooter) {
        return Commands.run(() -> shooter.setShooterPower(-0.5));
    }

    public static Command spinIntake(Intake intake) {
        return Commands.run(() -> intake.setIntakePower(0.5));
    }
    public static Command reverseIntake(Intake intake) {
        return Commands.run(() -> intake.setIntakePower(-0.5));
    }
}

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ShooterConstants;

public class Shooter extends SubsystemBase{

    private MotorController shooterMotor = new VictorSP(ShooterConstants.shooterMotorID);

    public Shooter() {}

    public void setShooterPower(double speed) {
        shooterMotor.set(speed);
    }
}

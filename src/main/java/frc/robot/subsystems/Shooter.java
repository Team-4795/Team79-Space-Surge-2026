package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ShooterConstants;

public class Shooter extends SubsystemBase{

    private MotorController leftShooterMotor = new VictorSP(ShooterConstants.leftShooterMotorID);
    private MotorController rightShooterMotor = new VictorSP(ShooterConstants.rightShooterMotorID);

    public Shooter() {}

    public void setShooterPower(double speed) {
        leftShooterMotor.set(speed);
        rightShooterMotor.set(-speed);
    }
}

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConstants;

public class Intake extends SubsystemBase{

    private MotorController intakeMotor = new VictorSP(IntakeConstants.intakeMotorID);

    public Intake() {}

    public void setIntakePower(double speed) {
        intakeMotor.set(speed);
    }
}
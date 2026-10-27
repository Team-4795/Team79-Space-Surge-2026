package frc.robot.subsystems;

import org.littletonrobotics.junction.Logger;

import edu.wpi.first.math.system.plant.DCMotor;
import edu.wpi.first.math.system.plant.LinearSystemId;
import edu.wpi.first.wpilibj.simulation.DCMotorSim;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSim extends SubsystemBase{
    
    private DCMotorSim shooterSim = new DCMotorSim(
        LinearSystemId.createDCMotorSystem(0.75, 0.5), 
        DCMotor.getMiniCIM(2));

    public ShooterSim() {}

    public void setShooterPower(double speed) {
        shooterSim.setInputVoltage(speed);
    }

    @Override
    public void periodic() {
        shooterSim.update(0.2);

        Logger.recordOutput("Shooter/Speed", shooterSim.getAngularVelocityRadPerSec());
    }
}
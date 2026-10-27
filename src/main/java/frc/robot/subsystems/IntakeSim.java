package frc.robot.subsystems;

import org.littletonrobotics.junction.Logger;

import edu.wpi.first.math.system.plant.DCMotor;
import edu.wpi.first.math.system.plant.LinearSystemId;
import edu.wpi.first.wpilibj.simulation.DCMotorSim;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSim extends SubsystemBase{
    private DCMotorSim intakeSim = new DCMotorSim(
        LinearSystemId.createDCMotorSystem(0.75, 0.5), 
        DCMotor.getMiniCIM(1));
    
    public void setIntakePower(double speed) {
        intakeSim.setInputVoltage(speed);
    }

    @Override
    public void periodic() {
        intakeSim.update(0.2);

        Logger.recordOutput("Intake/Speed", intakeSim.getAngularVelocityRadPerSec());
    }
}

package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Serializer extends SubsystemBase {
    WPI_TalonSRX motor;
    public Serializer() {
        motor = new WPI_TalonSRX(4);
    }

    public void setSpeed(double speed) {
        motor.set(speed);
    }
}


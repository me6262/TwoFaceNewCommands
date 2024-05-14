package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Launcher extends SubsystemBase {
    /*
    Spin inside

     */
    WPI_TalonSRX spinUpWheel;
    WPI_TalonSRX spinUpWheelFollower;

    public Launcher() {
        spinUpWheel = new WPI_TalonSRX(11);
        spinUpWheelFollower = new WPI_TalonSRX(12);
        spinUpWheelFollower.follow(spinUpWheel);
    }

    public void setSpeed(double speed) {
        spinUpWheel.set(speed);
    }
}

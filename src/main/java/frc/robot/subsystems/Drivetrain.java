package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {


    WPI_TalonSRX leftLeader, rightLeader, leftFollower, rightFollower;

    DifferentialDrive diff;

    public Drivetrain() {
        // TODO: Set the default command, if any, for this subsystem by calling setDefaultCommand(command)
        //       in the constructor or in the robot coordination class, such as RobotContainer.
        //       Also, you can call addChild(name, sendableChild) to associate sendables with the subsystem
        //       such as SpeedControllers, Encoders, DigitalInputs, etc.
        leftLeader = new WPI_TalonSRX(5);
        leftFollower = new WPI_TalonSRX(6);
        rightFollower = new WPI_TalonSRX(7);
        rightLeader = new WPI_TalonSRX(8);

        leftFollower.follow(leftLeader);

        rightFollower.follow(rightLeader);

        leftFollower.setInverted(true);
        leftLeader.setInverted(true);


        diff = new DifferentialDrive(leftLeader, rightLeader);
    }
    public void drive(double left, double right){
        diff.tankDrive(left, right);
    }
}


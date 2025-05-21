package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {


    WPI_TalonSRX leftLeader;
    WPI_TalonSRX rightLeader;
    WPI_TalonSRX leftFollower;
    WPI_TalonSRX rightFollower;



    // this method is run whenever someone types "new Drivetrain();"
    // it's called a constructor, since it should do everything required to "construct" this object
    //
    // there's a problem, it's not finished. we made 4 motor controllers above, but we never constructed them.
    // one has been constructed for you,
    // but youll have to do the rest and find what CAN ID's are assigned to the other 3 motors
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


    }
    public void drive(double left, double right){
    }

    // arcade drive is when the left joystick is used for forward and reverse,
    // and the right is used for rotation
    // If you want to do this as a fun challenge later, you can
    // there are two ways to do it.
    // you can either find the math behind the calculations online,
    // or you can look up the java class that does it for you online, whatever is more fun for you
    public void arcadeDrive(double xSpeed, double yRotation) {

    }
}









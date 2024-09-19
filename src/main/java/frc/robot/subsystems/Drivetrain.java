package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
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

        leftLeader = new WPI_TalonSRX(5);
        // make new WPI_TalonSRX's for each of the drivetrain motors
        // the names of the variables are on lines 10-13

    }



    // we will use this method later to get the robot to drive
    // right now, It does nothing.
    // you already know how to run a motor, right?
    // just use the variables "left" and "right" defined below as the speeds for your leader motors.
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









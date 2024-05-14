package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;


public class SpinUpCommand extends CommandBase {

    protected double speed;

    public SpinUpCommand(double speed) {
        this.speed = speed;
        // each subsystem used by the command must be passed into the
        // addRequirements() method (which takes a vararg of Subsystem)
        addRequirements(Robot.launcher);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        Robot.launcher.setSpeed(speed);
    }

    @Override
    public boolean isFinished() {
        // TODO: Make this return true when this Command no longer needs to run execute()
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        Robot.launcher.setSpeed(0);
    }
}

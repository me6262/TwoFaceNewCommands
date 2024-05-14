package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.subsystems.Serializer;


public class SpinupSerializerCommand extends CommandBase {

    public SpinupSerializerCommand() {
        // each subsystem used by the command must be passed into the
        // addRequirements() method (which takes a vararg of Subsystem)
        addRequirements(Robot.serializer);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        Robot.serializer.setSpeed(0.77);
    }

    @Override
    public boolean isFinished() {
        // TODO: Make this return true when this Command no longer needs to run execute()
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        Robot.serializer.setSpeed(0);
    }
}

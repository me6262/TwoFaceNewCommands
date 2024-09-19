package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;


public class DriveCommand extends CommandBase {


    // this is the constructor, it is called whenever the object is constructed with the "new" keyword
    // e.g. "new DriveCommand();"
    //
    // commands require that you tell them all of the subsystems that they will use
    // this one uses the drivetrain, so, ask the mentor, instructor, etc. what a "static variable" is
    public DriveCommand() {
        addRequirements(/* put the drivetrain object in here */);


    }

    // this is run the moment the scheduler starts this command.
    // think of it as the robotInit command, but only for this command
    @Override
    public void initialize() {

    }

    // execute is like the periodic functions in Robot.java
    // while the command is running, this method runs every 20 milliseconds
    // this is where you would add the logic to run the motors using controllers
    @Override
    public void execute() {

    }

    // after execute has run, isFinished runs.
    // if the method ever returns true instead of false,
    // the end() method is run
    // if there is a condition where the command should stop,
    // such as if it completed its task, or for safety reasons,
    // you can use IF statements to check on those.
    //
    // if you do not understand return types, that's ok!
    // ask if your peers for help first, if not, ask a programming mentor/veteran student.
    //
    // this command does not need to ever return true because it should never be interrupted,
    // unless the user lets go of the joysticks.
    // look out for other commands in the future that might need to be stopped automatically!
    @Override
    public boolean isFinished() {
        // TODO: Make this return true when this Command no longer needs to run execute()
        return false;
    }


    // this should be used to wrap up whatever actions we were doing before
    // if you don't know what to put here, that's fine.
    // you'll find out when something goes wrong
    @Override
    public void end(boolean interrupted) {

    }
}

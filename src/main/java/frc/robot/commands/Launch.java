package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Robot;

public class Launch extends ParallelCommandGroup {
    public Launch(double speed) {


        addCommands(new SpinUpCommand(speed));
        addCommands(new WaitCommand(0.75 /* long enough? */).andThen(new SpinupSerializerCommand()));
    }
}
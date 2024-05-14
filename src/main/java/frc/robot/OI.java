package frc.robot;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Robot;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.Launch;

public class OI {
    public static CommandXboxController controller;

    public OI() {
        controller = new CommandXboxController(0);
        Robot.drivetrain.setDefaultCommand(new DriveCommand());

        // fast launch
        controller.rightTrigger().whileTrue(new Launch(0.77));

        //slower launch ???
        controller.leftTrigger().whileTrue(new Launch(0.385));


    }
}

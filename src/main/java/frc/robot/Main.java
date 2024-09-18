// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;

/**
 * Do NOT add any static variables to this class, or any initialization at all. Unless you know what
 * you are doing, do not modify this file except to change the parameter class to the startRobot
 * call. If you are in this file at all, you do not need to be
 */
public final class Main {
  private Main() {}

  /**
   * Main initialization function. Do not perform any initialization here.
   *
   * <p>If you change your main robot class, change the parameter type.
   */
  public static void main(String... args) {
   // this line of code basically starts the robot.
   //RobotBase is a class that manages the different modes
   // such as enabled, disabled, teleop, and autonomous.
   // it does most of the heavy lifting to schedule all of the different commands to happen in the right order.
   //nothing needs to change in this file, it just starts things.
    RobotBase.startRobot(Robot::new);
  }
}

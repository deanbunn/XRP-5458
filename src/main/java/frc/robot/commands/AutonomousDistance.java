// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
//import frc.robot.Constants;
//import frc.robot.Constants.Auto5458Constants;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;

public class AutonomousDistance extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public AutonomousDistance(Drivetrain drivetrain) {
    addCommands(
    
        new DriveDistance(0.80,10.0,drivetrain),
        new TurnDegrees(-0.70, 90, drivetrain),
        new WaitCommand(0.7),

        new DriveDistance(0.90, 10.5, drivetrain),
        new TurnDegrees(-0.80, 90, drivetrain),
        new WaitCommand(0.7),

        new DriveDistance(0.70, 8.0, drivetrain),
        new WaitCommand(0.7),
        new TurnDegrees(0.70, 90.0, drivetrain),

        new DriveDistance(0.70, 8.0, drivetrain),
        new TurnDegrees(0.60, 90.0, drivetrain),

        new DriveDistance(0.80, 4.0, drivetrain),
        new TurnDegrees(-0.65, 90.0, drivetrain),

        new DriveDistance(0.80, 4.0, drivetrain)
        
        );

       
       
       
       
        /* new TurnDegrees(-0.80, 90.0, drivetrain),
        new DriveDistance(0.90, 5.0, drivetrain),
        new TurnDegrees(-0.80, 90.0, drivetrain),
        new DriveDistance(0.90, 5.0, drivetrain));*/
  }
}

// new DriveDistance(0.90,35.0, drivetrain),
// new TurnDegrees(-0.80, 90.0, drivetrain),
// new DriveDistance(0.90, 17, drivetrain),
// new TurnDegrees(-0.70, 90.0, drivetrain),
// new DriveDistance(0.90, 10, drivetrain),
// new TurnDegrees(-0.80, 90.0, drivetrain),
// new DriveDistance(0.90, 5, drivetrain)>


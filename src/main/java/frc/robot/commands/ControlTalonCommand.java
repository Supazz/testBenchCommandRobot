// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ControlTalonCommand extends CommandBase {
  // Instance Variables
  private TalonSRX talon;
  private Joystick joystick;
  private byte axis;
  /** Creates a new ControlTalonCommand. */
  public ControlTalonCommand(TalonSRX talon, Joystick joystick, byte axis) {
    this.talon = talon;
    this.joystick = joystick;
    this.axis = axis;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    talon.set(ControlMode.PercentOutput, joystick.getRawAxis(axis));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

package frc.subsystems;
/*----------------------------------------------------------------------------*/

import com.ctre.phoenix.motorcontrol.ControlMode;

/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Drivetrain extends SubsystemBase {
  /**
   * Creates a new Drivetrain.
   */
  private TalonSRX leftFrontTalon, leftBackTalon, rightFrontTalon, rightBackTalon;

  public Drivetrain() {
  leftFrontTalon = new TalonSRX(RobotMap.DRIVETRAIN_LEFT_FRONT_TALONSRX);
  leftBackTalon = new TalonSRX(RobotMap.DRIVETRAIN_LEFT_BACK_TALONSRX);
  rightFrontTalon = new TalonSRX(RobotMap.DRIVETRAIN_RIGHT_FRONT_TALONSRX);
  rightBackTalon = new TalonSRX(RobotMap.DRIVETRAIN_RIGHT_BACK_TALONSRX);
  
  leftBackTalon.set(ControlMode.Follower, leftFrontTalon.getDeviceID());
  rightBackTalon.set(ControlMode.Follower, rightFrontTalon.getDeviceID());
  }

  public void drive(double throttle, double rotation) {
    leftFrontTalon.set(ControlMode.PercentOutput, throttle - rotation);
    rightFrontTalon.set(ControlMode.PercentOutput, throttle + rotation);
  }
 
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

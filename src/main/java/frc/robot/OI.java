package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import frc.RobotMap;
public class OI extends RobotMap {
    private XboxController controller;

    public OI() {
        this.controller = new XboxController(0);
    }

    public double getThrottle() {
        if(Math.abs(controller.getRawAxis(1)) < 0.05) {
            return 0;
        }
        return controller.getRawAxis(1);
    }

    public double getRotation() {
        if(Math.abs(controller.getRawAxis(2)) < 0.05) {
            return 0;
        }
        return controller.getRawAxis(2);
    }
}
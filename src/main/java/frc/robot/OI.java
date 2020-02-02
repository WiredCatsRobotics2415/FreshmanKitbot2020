package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import frc.RobotMap;
public class OI extends RobotMap {
    private XboxController controller = new XboxController(0);

    public OI() {
    }

    public double getThrottle() {
        return Math.abs(controller.getRawAxis(4)) < 0.05 ? 0 : controller.getRawAxis(4);
    }

    public double getRotation() {
        return Math.abs(controller.getRawAxis(1)) < 0.05 ? 0 : controller.getRawAxis(1);
    }
}
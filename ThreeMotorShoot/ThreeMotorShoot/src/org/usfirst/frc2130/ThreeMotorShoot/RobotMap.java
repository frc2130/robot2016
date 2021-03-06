// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2130.ThreeMotorShoot;
    
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController motorSysspd1Motor;
    public static SpeedController motorSysspd2Motor;
    public static SpeedController motorSysspd3Motor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        motorSysspd1Motor = new Victor(0);
        LiveWindow.addActuator("MotorSys", "spd1Motor", (Victor) motorSysspd1Motor);
        
        motorSysspd2Motor = new Victor(1);
        LiveWindow.addActuator("MotorSys", "spd2Motor", (Victor) motorSysspd2Motor);
        
        motorSysspd3Motor = new Victor(2);
        LiveWindow.addActuator("MotorSys", "spd3Motor", (Victor) motorSysspd3Motor);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}

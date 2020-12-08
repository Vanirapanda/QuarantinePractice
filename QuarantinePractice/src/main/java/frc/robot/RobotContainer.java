package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.commands.PunchOut;
import frc.robot.subsystems.PneumaticSubsystem;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {

    public static XboxController controller = new XboxController(0);

    public RobotContainer() {

    }

    private void configureButtonBindings() {
        new JoystickButton(controller, Button.kY.value).whenPressed{
            new PunchOut();
        }
    }
}
package frc.robot;

import frc.robot.commands.PunchOut;
import frc.robot.subsystems.PneumaticSubsystem;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj.XboxController.Button;

public class RobotContainer {

    public static PneumaticSubsystem pneumaticSubsystem = new PneumaticSubsystem();

    public static XboxController controller = new XboxController(0);

    public RobotContainer() {
        configureButtonBindings();
    }

    private void configureButtonBindings() {
        new JoystickButton(controller, Button.kY.value).whenPressed(
            new PunchOut(pneumaticSubsystem)
        );
    }
}
package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp(name = "Outreach", group = "TeleOp")
public class OutreachOp extends LinearOpMode {
    private static BaseRobot baseRobot;

    @Override
    public void runOpMode() {
        baseRobot = new BaseRobot(hardwareMap, gamepad1, gamepad2, telemetry);
        waitForStart();

        while (opModeIsActive()) {
            baseRobot.driveGamepads();

            if (Settings.Deploy.ODOMETRY) {
                baseRobot.odometry.update();
            }
        }
        baseRobot.shutDown();
    }

}

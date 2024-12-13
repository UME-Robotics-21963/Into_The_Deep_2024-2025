package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "BasicTeleOp", group = "TeleOp")
public class BasicTeleOp extends Hardware {

    public void runOpMode() throws InterruptedException {
        Initialize(hardwareMap);

        while (opModeIsActive()) {
            double frontRightPower = (gamepad1.left_stick_y - gamepad1.right_stick_x);
            double backRightPower = (gamepad1.left_stick_y - gamepad1.right_stick_x) / 2.0;
            double frontLeftPower = (gamepad1.left_stick_y + gamepad1.right_stick_x) / 2.0;
            double backLeftPower = (gamepad1.left_stick_y + gamepad1.right_stick_x);
            double armCatcherPower = 0;
            double armPower = 0;

            if (gamepad1.right_trigger != 0) {
                armPower = 1;
                armCatcherPower = 1;
            } if (gamepad1.left_trigger != 0)
                armPower = -1;
            if (gamepad1.right_trigger + gamepad1.left_trigger == 0) {
                armPower = 0;
                armCatcherPower = 0;
            }
            if (gamepad1.right_bumper)
                armCatcherPower = 1;
            if (gamepad1.left_bumper)
                armCatcherPower = -1;
            if (!gamepad1.right_bumper && !gamepad1.left_bumper) armCatcherPower = 0;


            //float scale = 1;
            frontRight.setPower(frontRightPower);
            backRight.setPower(backRightPower);
            frontLeft.setPower(frontLeftPower);
            backLeft.setPower(backLeftPower);
            arm.setPower(armPower);
            armCatcher.setPower(armCatcherPower);


        }
    }
}



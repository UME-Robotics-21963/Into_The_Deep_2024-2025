package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "BasicTeleOp", group = "TeleOp")
public class BasicTeleOp extends Hardware {

    public void runOpMode() throws InterruptedException {
        Initialize(hardwareMap);

        waitForStart();
        while (opModeIsActive()) {
            double frontRightPower = (gamepad1.left_stick_y - gamepad1.right_stick_x) / 2.0;
            double backRightPower = (gamepad1.left_stick_y - gamepad1.right_stick_x) / 2.0;
            double frontLeftPower = (gamepad1.left_stick_y + gamepad1.right_stick_x) / 2.0;
            double backLeftPower = (gamepad1.left_stick_y + gamepad1.right_stick_x);
            double movementPower = 1;
            double armCatcherPower = 0;
            double armPower = 0;

            telemetry.addData("Left trigger", gamepad2.left_trigger);
            telemetry.update();

            if (gamepad2.right_trigger != 0) {
                armPower = 1;
                armCatcherPower = 1;
            }
            if (gamepad2.left_trigger != 0) {
                armPower = -1;
            }
            if (gamepad2.right_trigger + gamepad2.left_trigger == 0) {
                armPower = 0;
                armCatcherPower = 0;
            }
            if (gamepad2.left_bumper) {
                armCatcherPower = 1;
            }
            if (gamepad2.right_bumper) {
                armCatcherPower = -1;
            }
            if (!gamepad2.left_bumper && !gamepad2.right_bumper) {
                armCatcherPower = 0;
            }

            if(gamepad1.x) {
                movementPower = 2;
            }
            else {
                movementPower = 1;
            }
            //float scale = 1;
            frontRight.setPower(frontRightPower * movementPower);
            backRight.setPower(backRightPower * movementPower);
            frontLeft.setPower(frontLeftPower * movementPower);
            backLeft.setPower(backLeftPower * movementPower);
            arm.setPower(armPower/2);
            armCatcher.setPower(armCatcherPower);


        }
    }
}



package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "BasicTeleOp", group = "TeleOp")
public class BasicTeleOp extends Hardware {
    @Override
    public void init() {
        Initialize(hardwareMap);

        frontRight.setPower(gamepad1.left_stick_y);
        backRight.setPower(gamepad1.left_stick_y);
        backLeft.setPower(gamepad1.left_stick_y);
        frontLeft.setPower(gamepad1.left_stick_y);
    }

    @Override
    public void loop() {

    }
}

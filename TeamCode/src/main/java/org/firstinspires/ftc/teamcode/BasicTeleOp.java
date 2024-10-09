package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "BasicTeleOp", group = "TeleOp")
public class BasicTeleOp extends Hardware {
    @Override
    public void init() {
        Initialize(hardwareMap);
    }

    @Override
    public void loop() {
        double leftSidePower = gamepad1.left_stick_y - gamepad1.right_stick_x;
        double rightSidePower = gamepad1.left_stick_y + gamepad1.right_stick_x;
        leftSide.setPower(leftSidePower);
        rightSide.setPower(rightSidePower);

    }
}


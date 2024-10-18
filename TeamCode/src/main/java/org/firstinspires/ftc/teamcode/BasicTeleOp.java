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
        double armPower = 0;

        if(gamepad1.right_trigger != 0)
            armPower = 1;
        if(gamepad1.left_trigger != 0)
            armPower = -1;
        if(gamepad1.right_trigger + gamepad1.left_trigger == 0)
            armPower = 0;


        leftSide.setPower(leftSidePower * .5);
        rightSide.setPower(rightSidePower * .5);
        arm.setPower(armPower * .5);


        }
    }


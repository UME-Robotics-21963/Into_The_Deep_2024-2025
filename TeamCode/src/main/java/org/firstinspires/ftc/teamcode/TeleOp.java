package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class TeleOp extends Hardware {
    @Override
    public void init() {
        Initialize(hardwareMap);

        frontRight.setPower(1);
    }

    @Override
    public void loop() {

    }
}

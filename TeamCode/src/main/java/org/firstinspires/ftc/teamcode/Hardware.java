package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

// A required section to write all of your code
public abstract class Hardware extends OpMode {
    // Makes an instance of DCMotor to create copies
    public static DcMotor rightSide, leftSide;

    // Creates an area to change the copied class
    public static void Initialize(HardwareMap hMap) {
        // Gets the port of motor from phone to set this instance to that port
        rightSide = hMap.get(DcMotor.class, "rightSide");
        leftSide = hMap.get(DcMotor.class, "leftSide");

        // Sets the direction of motor
        rightSide.setDirection(DcMotor.Direction.FORWARD);
        leftSide.setDirection(DcMotor.Direction.REVERSE);


        rightSide.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftSide.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

}
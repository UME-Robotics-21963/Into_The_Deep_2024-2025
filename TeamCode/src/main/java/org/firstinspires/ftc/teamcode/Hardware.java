package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

// A required section to write all of your code
public abstract class Hardware extends LinearOpMode {
    // Makes an instance of DCMotor to create copies
    public static DcMotor frontRight,backRight,frontLeft,backLeft ,arm;
    public static CRServo armCatcher;
    //
    //public static DcMotor arm;

    // Creates an area to change the copied class
    public static void Initialize(HardwareMap hMap) {
        // Gets the port of motor from phone to set this instance to that port
        frontRight = hMap.get(DcMotor.class, "frontRight");
        backRight = hMap.get(DcMotor.class, "backRight");
        frontLeft = hMap.get(DcMotor.class, "frontLeft");
        backLeft= hMap.get(DcMotor.class, "backLeft");
        arm = hMap.get(DcMotor.class, "arm");


        armCatcher = hMap.get(CRServo.class, "armCatcher");

        // Sets the direction of motor
        frontRight.setDirection(DcMotor.Direction.FORWARD);
        backRight.setDirection(DcMotor.Direction.FORWARD);
        frontLeft.setDirection(DcMotor.Direction.FORWARD);
        backLeft.setDirection(DcMotor.Direction.FORWARD);
        arm.setDirection(DcMotor.Direction.FORWARD);


        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

    }

}
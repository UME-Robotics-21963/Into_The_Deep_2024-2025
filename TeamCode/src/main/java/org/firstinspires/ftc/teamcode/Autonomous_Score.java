package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Score", group = "Autonomous")
public class Autonomous_Score extends Hardware {
    @Override
    public void runOpMode() throws InterruptedException {
        Initialize(hardwareMap);

        waitForStart();
        while (opModeIsActive()) {
            BasicMovement(.5, 0, 1.5);
        }
    }

    public void BasicMovement(double forward, double turn, double time) {
        double rightPower, leftPower;

        rightPower = forward - turn;
        leftPower = forward + turn;

        setMove(rightPower, rightPower, leftPower, leftPower);
        int mstime = (int)(1000 * time);
        sleep(mstime);
        setMove(0,0,0,0);
    }
    public void Movement(double forward, double turn, double strafe) {
        double frontRightPower, backRightPower, frontLeftPower, backLeftPower;

        frontRightPower = (forward - turn + strafe);
        backRightPower = (forward - turn - strafe) / 2.0;
        frontLeftPower = (forward + turn - strafe) / 2.0;
        backLeftPower = (forward + turn + strafe);

        setMove(frontRightPower, backRightPower, frontLeftPower, backLeftPower);
    }
    public void setMove(double frontRightPower, double backRightPower, double frontLeftPower, double backLeftPower){
        frontRight.setPower(frontRightPower);
        backRight.setPower(backRightPower);
        frontLeft.setPower(frontLeftPower);
        backLeft.setPower(backLeftPower);
    }
}

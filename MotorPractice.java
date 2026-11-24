package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TBench1;

@TeleOp
public class MotorPractice extends OpMode {
    TBench1 bench = new TBench1();

    @Override
    public void init() {
        bench.init(hardwareMap);

    }

    boolean Pressed = false;
    @Override
    public void loop() {
        double leftStickX = gamepad1.left_stick_x;
        double leftStickY = gamepad1.left_stick_y;

        double rightStickY = gamepad1.right_stick_y;
        double rightStickX = gamepad1.right_stick_x;

        float leftT = gamepad1.left_trigger;

        if (leftStickY <= -0.8 && leftStickX > -0.5 && leftStickX < 0.5) {
            bench.setMotorSpeed(0.5);//back
        } else if (leftStickY >= 0.8 && leftStickX > -0.5 && leftStickX < 0.5) {
            bench.setMotorSpeed(-0.5);//foward

        } else if (leftStickX >= 0.8 && leftStickY > -0.5 && leftStickY < 0.5) {
            bench.motor0.setPower(0.5);
            bench.motor1.setPower(-0.5);
            bench.motor2.setPower(-0.5);
            bench.motor3.setPower(0.5);//right move

            /*
            3---1
            2---0
             */
        }else if (leftStickX <= -0.8 && leftStickY > -0.5 && leftStickY < 0.5) {
            bench.motor0.setPower(-0.5);
            bench.motor1.setPower(0.5);
            bench.motor2.setPower(0.5);
            bench.motor3.setPower(-0.5);//left move

            /*
            3---1
            2---0
             */
        } else {
            bench.setMotorSpeed(0);//stop
        }

        if (rightStickX >= 0.8 && rightStickY > -0.5 && rightStickY < 0.5) {
            bench.motor0.setPower(-0.5);
            bench.motor1.setPower(-0.5);
            bench.motor2.setPower(0.5);
            bench.motor3.setPower(0.5);//turn n place right
        }else if (rightStickX <= -0.8 && rightStickY > -0.5 && rightStickY < 0.5) {
            bench.motor0.setPower(0.5);
            bench.motor1.setPower(0.5);
            bench.motor2.setPower(-0.5);
            bench.motor3.setPower(-0.5);//turn n place left
        } else {
            bench.setMotorSpeed(0);//stop
        }

        if (leftStickX >= 0.8 && leftStickY >= -0.8) { //diagonal foward right
            bench.motor3.setPower(0.5);
            bench.motor0.setPower(0.5);
        }else if (leftStickX <= -0.8 && leftStickY <= 0.8) { //diagonal back left
            bench.motor3.setPower(-0.5);
            bench.motor0.setPower(-0.5);
        }else if (leftStickX <= -0.8 && leftStickY >= -0.8) { //diagonal foward left
            bench.motor2.setPower(0.5);
            bench.motor1.setPower(0.5);
        }else if (leftStickX >= 0.8 && leftStickY <= 0.8) { //diagonal back right
            bench.motor2.setPower(-0.5);
            bench.motor1.setPower(-0.5);
        }else {
            bench.setMotorSpeed(0); //stop
        }

//        if (leftT >= 0.7 && Pressed == false) {
//            Pressed = true;
//            bench.setFlywheelSpeed(1);
//        }
//        else {
//            bench.setFlywheelSpeed(0);
//            Pressed = false;
//        }
    }

}

// -0.5 < x < 0.5

/*
if (motorRunning) {
        bench.setFlywheelSpeed(1);  // Turn motor ON
    } else {
        bench.setFlywheelSpeed(0);  // Turn motor OFF
    }
}
*/
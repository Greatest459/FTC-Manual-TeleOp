package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;
public class TBench1 {

    //motor wheels
    public DcMotor motor0;
            //data types
    public DcMotor motor1;
    public DcMotor motor2;
    public DcMotor motor3;

    //flywheel
//    public DcMotor flywheel;

    public void init(HardwareMap hwMap) { //you can set up different motors

        //My motor tings
        motor0 = hwMap.get(DcMotor.class, "0");
        motor1 = hwMap.get(DcMotor.class, "1");
        motor2 = hwMap.get(DcMotor.class, "2");
        motor3 = hwMap.get(DcMotor.class, "3");

//        flywheel = hwMap.get(DcMotor.class, "flywheel");

        motor0.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor1.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor2.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor3.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

//        flywheel.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//

        motor1.setDirection(DcMotorSimple.Direction.REVERSE);
        motor2.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void setMotorSpeed(double speed) {

        motor0.setPower(speed);
        motor1.setPower(speed);
        motor2.setPower(speed);
        motor3.setPower(speed);

    }

    public void setFlywheelSpeed(double speed) {
//        flywheel.setPower(speed);

    }

}


/*
3---1
2---0
 */

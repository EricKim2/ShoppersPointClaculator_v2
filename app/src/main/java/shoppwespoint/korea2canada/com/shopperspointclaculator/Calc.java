package shoppwespoint.korea2canada.com.shopperspointclaculator;

import java.text.DecimalFormat;

/**
 * Created by Eric on 2017-10-20.
 */

public class Calc {

    String valueCalc (int val, int poi, String point) {
            DecimalFormat df = new DecimalFormat("#.00");

            float pointValue = (float) val / (float) poi;
            System.out.print("\n Point value is : " + pointValue);
            float unitPoint = Float.parseFloat(point);
            System.out.print("\n Final point value is : " + unitPoint);
            float result = unitPoint * pointValue;
            System.out.printf("\n result: " + result);
            String stringResult = df.format(result);
        return stringResult;
//            myValue.setText("$ " + stringResult);
        }







}

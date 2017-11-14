// 클래스로 분리해서 처리 연습
package shoppwespoint.korea2canada.com.shopperspointclaculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText editText1;
    Button button;
    TextView myValue;
    RadioGroup radioGroup;
    RadioButton radioButton;
    String point;
    String sr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1);

        myValue = (TextView) findViewById(R.id.MyValue);

        button = (Button) findViewById(R.id.button);

        /*  Point System
        Points redeemed/	Reward value/	Return per point
                22,000	$30	    0.136%
                38,000	$60	    0.158%
                50,000	$85	    0.170%
                95,000	$170	0.178%
        */
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.clearCheck();

//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
//                radioButton = (RadioButton) group.findViewById(checkedId);
//                if(null!=radioButton && checkedId > -1){
////                    Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                point = editText1.getText().toString();
                System.out.print("\n point is " + point);

                int rb = ((RadioGroup) radioGroup.findViewById(R.id.radioGroup)).getCheckedRadioButtonId();
//                Toast.makeText(MainActivity.this, "rb value is: " + rb, Toast.LENGTH_SHORT).show();
                switch (rb)  {
                    case R.id.radioButton: {
                        System.out.println("Radio1 ");
                        Calc ca = new Calc();
                        sr = ca.valueCalc(10, 8000, point);
                        myValue.setText("$ " + sr);
                        break;
                    }
                    case R.id.radioButton2: {
                        System.out.println("Radio2 ");

                        Calc ca = new Calc();
                        sr = ca.valueCalc(30, 22000, point);
                        myValue.setText("$ " + sr);
                        break;
                    }
                    case R.id.radioButton3: {
                        System.out.println("Radio3 ");
                        Calc ca = new Calc();
                        sr = ca.valueCalc(60, 38000, point);
                        myValue.setText("$ " + sr);
//                        valueCalc3 = new Calc(60, 38000);
                        break;
                    }
                    case R.id.radioButton4: {
                        System.out.println("Radio4 ");
                        Calc ca = new Calc();
                        sr = ca.valueCalc(85, 50000, point);
                        myValue.setText("$ " + sr);
                        break;
                    }
                    case R.id.radioButton5: {
                        System.out.println("Radio5 ");
                        Calc ca = new Calc();
                        sr = ca.valueCalc(170, 95000, point);
                        myValue.setText("$ " + sr);
                        break;
                    }
                }
            }
        });
    }

}

package veikko.vanninen.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //define
    private EditText firstNumber;
    private EditText secondNumber;
    private TextView calculationOutput;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //define variables to android fields
        firstNumber = findViewById(R.id.num1Field);
        secondNumber = findViewById(R.id.num2Field);
        calculationOutput = findViewById(R.id.resultField);
    }
    //method for adding numbers to each other
    public void addNumbers (View view) {
        System.out.println("Number added to each other.");

        int num1 = Integer.parseInt(firstNumber.getText().toString());
        int num2 = Integer.parseInt(secondNumber.getText().toString());
        int result = num1 + num2;

        calculationOutput.setText(Integer.toString(result));
    }
    //method for subtracting numbers from each other
    public void subtractNumbers (View view) {
        System.out.println("Number subtracted from each other.");

        int num1 = Integer.parseInt(firstNumber.getText().toString());
        int num2 = Integer.parseInt(secondNumber.getText().toString());
        int result = num1 - num2;

        calculationOutput.setText(Integer.toString(result));
    }
    //method for dividing numbers from each other
    public void divideNumbers (View view) {
        System.out.println("Numbers divided.");

        int num1 = Integer.parseInt(firstNumber.getText().toString());
        int num2 = Integer.parseInt(secondNumber.getText().toString());
        int result = num1 / num2;

        calculationOutput.setText(Integer.toString(result));
    }
    //method for multiplying numbers to each other
    public void multiplyNumbers (View view) {
        System.out.println("Numbers multiplied.");

        int num1 = Integer.parseInt(firstNumber.getText().toString());
        int num2 = Integer.parseInt(secondNumber.getText().toString());
        int result = num1 * num2;

        calculationOutput.setText(Integer.toString(result));
    }
}
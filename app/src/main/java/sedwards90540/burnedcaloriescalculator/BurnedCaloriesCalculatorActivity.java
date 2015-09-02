package sedwards90540.burnedcaloriescalculator;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.view.View.OnClickListener;

import java.text.NumberFormat;
import java.util.jar.Attributes;
import java.util.jar.Attributes.Name;


public class BurnedCaloriesCalculatorActivity extends ActionBarActivity
        implements TextView.OnEditorActionListener, DialogInterface.OnClickListener, SeekBar.OnSeekBarChangeListener{


    private EditText weightEditText;
    private TextView weightTextView;
    private TextView milesTextView;
    private TextView caloriesTextView;
    private TextView heightTextView;
    private TextView bmiTextView;
    private TextView nameTextView;
    private TextView milesRanTextView;
    private TextView caloriesEditText;
    private TextView bmiEditText;
    private Spinner inchesSpinner;
    private Spinner feetSpinner;
    private TextView userNameEditText;
    private SeekBar seekBar;
    private TextView milesRanEditText;

    private String fattyInfo = "";
    private float runInc = 1.0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burned_calories_calculator);


        // widgets
        weightEditText = (EditText) findViewById(R.id.weightEditText);
        weightTextView = (TextView) findViewById(R.id.weightTextView);
        milesTextView = (TextView) findViewById(R.id.milesTextView);
        caloriesTextView = (TextView) findViewById(R.id.caloriesTextView);
        heightTextView = (TextView) findViewById(R.id.heightTextView);
        bmiEditText = (TextView) findViewById(R.id.bmiEditText);
        bmiTextView = (TextView) findViewById(R.id.bmiTextView);
        nameTextView = (TextView) findViewById(R.id.nameTextView);
        milesRanTextView = (TextView) findViewById(R.id.milesRanEditText);
        caloriesEditText = (TextView) findViewById(R.id.caloriesEditText);
        inchesSpinner = (Spinner) findViewById(R.id.inchesSpinner);
        feetSpinner = (Spinner) findViewById(R.id.feetSpinner);
        userNameEditText = (TextView) findViewById(R.id.userNameEditText);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        milesRanEditText = (TextView) findViewById(R.id.milesRanEditText);

        // listeners
        seekBar.setOnSeekBarChangeListener(this);

    }

    public void calculateAndDisplay(){

        // get the calories burned/weight/miles ran
        float fatinfo;
        fatinfo = Float.parseFloat(weightEditText.getText().toString());
        userNameEditText.setText((int) fatinfo);
        // just testing if it got the right value


       // caloriesBurned = 0.75 * weight * milesRan;

       // bmi = (weight * 703) / ((12 * feet + inches) * (12 * feet + inches));
    }


    @Override
    public void onClick(DialogInterface dialog, int which) {

    }

    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        return false;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        // do nothing
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        NumberFormat percent = NumberFormat.getPercentInstance();
        int progress = seekBar.getProgress();
        milesRanEditText.setText(percent.format(progress));
        // this doesn't work correctly, obviously, since it shows as percents. Just here to get ball rolling

    }
}

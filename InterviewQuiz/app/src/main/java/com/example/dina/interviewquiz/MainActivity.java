package com.example.dina.interviewquiz;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

/**
 * This app in an HR quiz to measure the growth mindset in a potential candidate.
 * The quiz measures each response with a number value.
 * The highest possible number value is 18 and the lowest is 0.
 * Any candidate receiving a score under 12 might not exhibit a growth mindset in their daily lives.
 */
public class MainActivity extends AppCompatActivity {
    String name;
    String email;
    int calculateScore;
    boolean halfAndHalf;
    boolean canDoBetter;
    boolean depends;
    boolean sprint;
    boolean advice;
    boolean yoga;
    boolean bestImmediate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * This method is called when the edit text field is filled.
     */
    public void NameField(Editable insertName) {
        EditText editName = (EditText) findViewById(R.id.name_view);
        String name = editName.getText().toString();
    }

    /**
     * This method is called when the edit email field is filled.
     */
    public void EmailField(Editable insertEmail) {
        EditText editEmail = (EditText) findViewById(R.id.email_view);
        String email = editEmail.getText().toString();
    }

    /**
     * This method is called when a choice for the radio button for question one is marked.
     */
    public void setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener listener) {
        RadioGroup rGroup = (RadioGroup) findViewById(R.id.radioGroup_01);
        RadioButton onRadioButtonClicked = (RadioButton) rGroup.findViewById(rGroup.getCheckedRadioButtonId());
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_Greener:
                if (checked)
                    // The candidate is unsure of self. Is not aware that he/she has experience to offer regardless of employment experience. Mentorship and direction can help this candidate fulfill their potential This response will not add to the score.
                    break;

            case R.id.radio_half_and_half:
                if (checked)
                    // This candidate is aware that has experience to offer but remains open minded to learning and growth. Ideal mindset, score is three.
                    break;

            case R.id.radio_senior:
                if (checked)
                    // This candidate has experience to offer but is closed to learning and growth. This response will not add to the score.
                    break;
        }
    }

    /**
     * This method is called when a choice for the radio button for question two is marked.
     */
    public void setOnCheckedChangeListenerTwo(RadioGroup.OnCheckedChangeListener listener) {
        RadioGroup rGroupTwo = (RadioGroup) findViewById(R.id.radioGroup_02);
        RadioButton onRadioButtonClickedTwo = (RadioButton) rGroupTwo.findViewById(rGroupTwo.getCheckedRadioButtonId());
    }

    public void onRadioButtonClickedTwo(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_satisfied:
                if (checked)
                    // The candidate sees their daily experiences in a one dimensional way. They make safe choices that they will be sure wont generate risk. He/she can contribute to their position but will not invest in moving forward or initiating. This response does not add to the score.
                    break;

            case R.id.radio_can_do_better:
                if (checked)
                    // This candidate makes fair choices but is aware that there is always room for better - this exhibits awareness for growth. Ideal mindset, score is three.
                    break;

            case R.id.radio_regret:
                if (checked)
                    // This candidate either makes poor choices or makes good ones but cannot see themselves positively. Such an approach can create negativity in the office and/ or a poor candidate. This response does not add to the score.
                    break;
        }
    }

    /**
     * This method is called when a choice for the radio button for question three is marked.
     */
    public void setOnCheckedChangeListenerThree(RadioGroup.OnCheckedChangeListener listener) {
        RadioGroup rGroupThree = (RadioGroup) findViewById(R.id.radioGroup_03);
        RadioButton onRadioButtonClickedThree = (RadioButton) rGroupThree.findViewById(rGroupThree.getCheckedRadioButtonId());
    }

    public void onRadioButtonClickedThree(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_stairs:
                if (checked)
                    // The candidate is motivated and shows a desire to make the most out of each daily experience. This response does not add to the score.
                    break;

            case R.id.radio_elevator:
                if (checked)
                    // This candidate does not want to be bothered. This approach will appear in her/his work. This response does not add to the score.
                    break;

            case R.id.radio_depends:
                if (checked)
                    // This candidate shows analytical capabilities. Is open to making the most out of the daily experiences he/ she encounters but leaves room for flexibility when necessary. This response receives a score of three.
                    break;
        }
    }

    /**
     * This method is called when a choice for the radio button for question four is marked.
     */
    public void setOnCheckedChangeListenerFour(RadioGroup.OnCheckedChangeListener listener) {
        RadioGroup rGroupFour = (RadioGroup) findViewById(R.id.radioGroup_04);
        RadioButton onRadioButtonClickedFour = (RadioButton) rGroupFour.findViewById(rGroupFour.getCheckedRadioButtonId());
    }

    public void onRadioButtonClickedFour(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_sprint:
                if (checked)
                    // The candidate is motivated and shows a desire to succeed at all costs. This is the correct response and will add to the score by three.
                    break;

            case R.id.radio_bang:
                if (checked)
                    // This candidate will make a fair effort and hope for the best. This approach will appear in her/his work. This response does not add to the score.
                    break;

            case R.id.radio_miss:
                if (checked)
                    // This candidate shows apathy to challenges and adversity. This approach will appear in his/her work. This response does not add to the score.
                    break;
        }
    }

    /**
     * This method is called when the checkbox for question five is marked.
     */
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.advice_checkbox:
                if (checked) ;
                    // add score of 3
                else
                    // Dont add to score
                    break;
        }
        switch (view.getId()) {
            case R.id.yoga_checkbox:
                if (checked) ;
                    // add score of 2
                else
                    // don't add to score
                    break;
        }
        switch (view.getId()) {
            case R.id.best_immediate_checkbox:
                if (checked) ;
                    // add score of 1
                else
                    // dont add to score
                    break;
        }
    }

    /**
     * Calculates the score.
     * return total score
     */
    private int calculateScore() {
        int scoreHalfAndHalf = 3;
        int scoreCanDoBetter = 3;
        int scoreDepends = 3;
        int scoreSprint = 3;
        int scoreAdvice = 3;
        int scoreYoga = 2;
        int scoreBestImmediate = 1;
        RadioButton onRadioButtonClicked = (RadioButton) findViewById(R.id.radio_half_and_half);
        boolean halfAndHalf = onRadioButtonClicked.isChecked();

        if (halfAndHalf) {
            scoreHalfAndHalf = 3;

        } else {
            scoreHalfAndHalf = 0;
        }
        RadioButton onRadioButtonClickedTwo = (RadioButton) findViewById(R.id.radio_can_do_better);
        boolean canDoBetter = onRadioButtonClickedTwo.isChecked();

        if (canDoBetter) {
            scoreCanDoBetter = 3;

        } else {
            scoreCanDoBetter = 0;
        }

        RadioButton onRadioButtonClickedThree = (RadioButton) findViewById(R.id.radio_depends);
        boolean depends = onRadioButtonClickedThree.isChecked();

        if (depends) {
            scoreDepends = 3;
        } else {
            scoreDepends = 0;
        }
        RadioButton onRadioButtonClickedFour = (RadioButton) findViewById(R.id.radio_sprint);
        boolean sprint = onRadioButtonClickedFour.isChecked();

        if (sprint) {
            scoreSprint = 3;

        } else {
            scoreSprint = 0;
        }
        CheckBox onCheckboxClicked = (CheckBox) findViewById(R.id.advice_checkbox);
        boolean advice = onCheckboxClicked.isChecked();
        CheckBox onCheckboxClickedTwo = (CheckBox) findViewById(R.id.yoga_checkbox);
        boolean yoga = onCheckboxClickedTwo.isChecked();
        CheckBox onCheckboxClickedThree = (CheckBox) findViewById(R.id.best_immediate_checkbox);
        boolean bestImmediate = onCheckboxClickedThree.isChecked();
        if (advice) {
            scoreAdvice = 3;

        } else {
            scoreAdvice = 0;
        }
        if (yoga) {
            scoreYoga = 2;

        } else {
            scoreYoga = 0;
        }
        if (bestImmediate) {
            scoreBestImmediate = 1;

        } else {
            scoreBestImmediate = 0;
        }
        return (scoreHalfAndHalf + scoreCanDoBetter + scoreDepends + scoreSprint + scoreAdvice + scoreYoga + scoreBestImmediate);
    }


    /**
     * This method is called when the order button is clicked.
     */
    public void submitAnswers(View view) {
        EditText editName = (EditText) findViewById(R.id.name_view);
        String name = editName.getText().toString();
        EditText editEmail = (EditText) findViewById(R.id.email_view);
        String email = editEmail.getText().toString();
        RadioButton onRadioButtonClicked = (RadioButton) findViewById(R.id.radio_half_and_half);
        boolean halfAndHalf = onRadioButtonClicked.isChecked();
        RadioButton onRadioButtonClickedTwo = (RadioButton) findViewById(R.id.radio_can_do_better);
        boolean canDoBetter = onRadioButtonClickedTwo.isChecked();
        RadioButton onRadioButtonClickedThree = (RadioButton) findViewById(R.id.radio_depends);
        boolean depends = onRadioButtonClickedThree.isChecked();
        RadioButton onRadioButtonClickedFour = (RadioButton) findViewById(R.id.radio_sprint);
        boolean sprint = onRadioButtonClickedFour.isChecked();
        CheckBox onCheckboxClicked = (CheckBox) findViewById(R.id.advice_checkbox);
        boolean advice = onCheckboxClicked.isChecked();
        CheckBox onCheckboxClickedtwo = (CheckBox) findViewById(R.id.yoga_checkbox);
        boolean yoga = onCheckboxClickedtwo.isChecked();
        CheckBox onCheckboxClickedThree = (CheckBox) findViewById(R.id.best_immediate_checkbox);
        boolean bestImmediate = onCheckboxClickedThree.isChecked();
        int score = calculateScore();
        String emailMessage = internalMessage(name, email, halfAndHalf, canDoBetter, depends, sprint, advice, yoga, bestImmediate, calculateScore);
        Context contextC = getApplicationContext();
        CharSequence text = "Thank you for taking the time to complete the quiz!" + "\nWe will be in touch with you to discuss the results further." + "\nYour final score is: " + calculateScore() + "";
        int duration = Toast.LENGTH_LONG;
        Toast.makeText(contextC, text, Toast.LENGTH_LONG).show();


        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto: dinagdavis@gmail.com")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.email_subject) + " " + name);
        intent.putExtra(Intent.EXTRA_TEXT, emailMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

        displayMessage(getString(R.string.toast_submit));
    }


    /**
     * creates an internal message to HR
     *
     * @param name           provides the name of the applicant from the edit name field
     * @param email          provides the email of the applicant from the edit email field
     * @param halfAndHalf    provides the choice of radiobutton from radioGroup 01
     * @param canDoBetter    provides the choice of radiobutton from radioGroup 02
     * @param depends        provides the choice of radiobutton from radioGroup 03
     * @param sprint         provides the choice of radiobutton from radioGroup 04
     * @param advice         provides the choice for this checkbox
     * @param yoga           provides the choice for this checkbox
     * @param bestImmediate  provides the choice for this checkbox
     * @param calculateScore provides the final score of the applicant
     * @return detailed summary
     */
    private String internalMessage(String name, String email, boolean halfAndHalf, boolean canDoBetter, boolean depends, boolean sprint, boolean advice, boolean yoga, boolean bestImmediate, int calculateScore) {
        String emailMessage = "Name: " + name;
        emailMessage += "\nEmail Address: " + email;
        emailMessage += "\nAnswer to question one: " + halfAndHalf;
        emailMessage += "\nAnswer to question two: " + canDoBetter;
        emailMessage += "\nAnswer to question three: " + depends;
        emailMessage += "\nAnswer to question four: " + sprint;
        emailMessage += "\nAnswer to checkbox one: " + advice;
        emailMessage += "\nAnswer to checkbox two: " + yoga;
        emailMessage += "\nAnswer to checkbox three: " + bestImmediate;
        emailMessage += "\nScore of Response: " + calculateScore();
        return emailMessage;
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView Intro = (TextView) findViewById(R.id.textView_Intro);
        Intro.setText(message);
    }

    /**
     * This method is called when the user touches the screen outside the edit text field.
     */
    public void closeKeyboard(View view) {
        View v = this.getCurrentFocus();
        if (v != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
        }
    }

    /**
     * This method resets the app.
     */
    public void restartQuiz(View view) {
        Intent MainActivity = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage(getBaseContext().getPackageName());
        MainActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(MainActivity);
    }
}


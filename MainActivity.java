package president.example.ikeak.presidentsquiz;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.Dev1Studios.ikeak.presidentsquiz.R;

public class MainActivity extends AppCompatActivity {

    //Views and Buttons
    TextView questionTextView;
    TextView mscoreTextView;
    TextView mtimerTextView;

    TextView correctAnswerView;

    Button mchoice1;
    Button mchoice2;
    Button mchoice3;
    Button mchoice4;


    //Constructors
    private questions Question = new questions();
    private Answers cAnswers = new Answers();
    private choices Choices = new choices();

    //Variables
    private int questionNumber = 0;
    private int mScore = 0;
    private String correctAnswer;
    MediaPlayer mPlayer;

    //Countdown Timers class field
    private CountDownTimer timer;
    private CountDownTimer timer1;


    public void onClick(View view) {

        Button answer1 = (Button) view;

        if(answer1.getText() == correctAnswer) {

            mScore = mScore + 1;
            Toast.makeText(getApplicationContext(), "CORRECT!!", Toast.LENGTH_SHORT).show();
            mtimerTextView.setText("30s");
            timer.cancel();
            timer.start();

            //Correct Answer voice recording
            mPlayer = MediaPlayer.create(this, R.raw.correctrecording);
            mPlayer.start();
            mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mp.release();
                }
            });

            ////Textview correct Answer display/ Text Color / Make textview dissapear
            correctAnswerView.setText(correctAnswer + " IS CORRECT!!!");
            correctAnswerView.setTextColor(Color.parseColor("#4bc306"));
            correctCountDownTimer();


        } else {

            Toast.makeText(getApplicationContext(), "WRONG!!" , Toast.LENGTH_SHORT).show();
            mtimerTextView.setText("30s");
            timer.cancel();
            timer.start();

            //Wrong answer voice recording
            mPlayer = MediaPlayer.create(this, R.raw.wrongrecording);
            mPlayer.start();
            mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mp.release();
                }
            });

            //Textview correct Answer display/ Text Color / Make textview dissapear
            correctAnswerView.setText("WRONG! The Correct Answer was " + correctAnswer);
            correctAnswerView.setTextColor(Color.parseColor("#ef4545"));
            correctCountDownTimer();

        }

        updateUI();
        updateScore(mScore);

    }


    private void updateScore(int points) {

        mscoreTextView.setText("" + points + "/" + Question.getLength());
    }


    public void runTimer() {

        timer = new CountDownTimer(30100, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {

                String tick = String.valueOf(millisUntilFinished / 1000 + "s");
                mtimerTextView.setText(tick);

            }

            @Override
            public void onFinish() {

                Toast.makeText(getApplicationContext(), "TIME RAN OUT!!", Toast.LENGTH_SHORT).show();
                mtimerTextView.setText("0s");
                timer.start();
                correctAnswerView.setText("TIME RAN OUT the correct Answer was " + correctAnswer);
                correctAnswerView.setTextColor(Color.parseColor("#313cdc"));
                correctCountDownTimer();
                updateUI();

            }
        }.start();
    }

public void correctCountDownTimer() {

        timer1 = new CountDownTimer(2100, 1000) {
        @Override
        public void onTick(long millisUntilFinished) {

        }

        @Override
        public void onFinish() {

            correctAnswerView.setVisibility(View.INVISIBLE);
        }
    }.start();
}


    private void updateUI () {

        if (questionNumber < Question.getLength()) {
            questionTextView.setText(Question.getQuestion(questionNumber));
            mchoice1.setText(Choices.getChoices(questionNumber, 1));
            mchoice2.setText(Choices.getChoices(questionNumber, 2));
            mchoice3.setText(Choices.getChoices(questionNumber, 3));
            mchoice4.setText(Choices.getChoices(questionNumber, 4));
            correctAnswer = cAnswers.getAnswer(questionNumber);

            correctAnswerView.setVisibility(View.VISIBLE);

            questionNumber ++;

        } else {


            Toast.makeText(getApplicationContext(), "LAST QUESTION", Toast.LENGTH_LONG).show();
            timer.cancel();
            Intent intent = new Intent(MainActivity.this, HighScoreActivity.class);
            intent.putExtra("Score", mScore);
            startActivity(intent);

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionTextView = (TextView) findViewById(R.id.questionTextView);
        mchoice1 = (Button) findViewById(R.id.choice1);
        mchoice2 = (Button) findViewById(R.id.choice2);
        mchoice3 = (Button) findViewById(R.id.choice3);
        mchoice4 = (Button) findViewById(R.id.choice4);


        mtimerTextView = (TextView) findViewById(R.id.timerTextView);
        mscoreTextView = (TextView) findViewById(R.id.scoreTextView);

        correctAnswerView = (TextView) findViewById(R.id.correctAnswerTextView);

        updateScore(mScore);
        updateUI();
        runTimer();


    }



}


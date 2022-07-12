package president.example.ikeak.presidentsquiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.Dev1Studios.ikeak.presidentsquiz.R;

public class HighScoreActivity extends AppCompatActivity {

    TextView myourScoreTextView;
    TextView mhighScoreTextView;
    TextView companyLabelView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_score);

        myourScoreTextView = (TextView) findViewById(R.id.yourScoreTextView);
        mhighScoreTextView = (TextView) findViewById(R.id.highScoreTextView);
        companyLabelView = (TextView) findViewById(R.id.companyLabel);
        companyLabelView.setText("Created By Dev1 Studios");

        Intent intent = getIntent();
        int score = intent.getIntExtra("Score", 0);
        myourScoreTextView.setText("You scored: " + score);

        //Shared preferences saves the best score
        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("HighScore", 0);

        if (highscore >= score)
            mhighScoreTextView.setText("HighScore: " + score);

        else {

            mhighScoreTextView.setText("New Highscore: " + score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("HighScore", score);
            editor.commit();
        }
    }

        public void onClick(View view) {

            Intent intent = new Intent(HighScoreActivity.this, MainActivity.class);
            startActivity(intent);

        }


    }


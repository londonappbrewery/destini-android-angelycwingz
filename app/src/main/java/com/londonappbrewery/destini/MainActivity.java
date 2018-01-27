package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView mStoryTextView;
    Button mAnswerButton1,mAnswerButton2;
    int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mAnswerButton1 = (Button) findViewById(R.id.buttonTop);
        mAnswerButton2 = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mAnswerButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mStoryIndex==1 || mStoryIndex==2) {
                    mStoryTextView.setText(R.string.T3_Story);
                    mAnswerButton1.setText(R.string.T3_Ans1);
                    mAnswerButton2.setText(R.string.T3_Ans2);
                    mStoryIndex=3;
                }
               else {
                    mStoryTextView.setText(R.string.T6_End);
                    mAnswerButton1.setVisibility(View.GONE);
                    mAnswerButton2.setVisibility(View.GONE);

               }

            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mAnswerButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex==1) {

                    mStoryTextView.setText(R.string.T2_Story);
                    mAnswerButton1.setText(R.string.T2_Ans1);
                    mAnswerButton2.setText(R.string.T2_Ans2);
                    mStoryIndex=2;
                }

                else if (mStoryIndex==2){
                    mStoryTextView.setText(R.string.T4_End);
                    mAnswerButton1.setVisibility(View.GONE);
                    mAnswerButton2.setVisibility(View.GONE);
                }

                else {
                    mStoryTextView.setText(R.string.T5_End);
                    mAnswerButton1.setVisibility(View.GONE);
                    mAnswerButton2.setVisibility(View.GONE);
                }

            }
        });

    }

}

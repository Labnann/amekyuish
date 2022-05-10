package com.cml.amekyuuish;




import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView result;
    SentenceChanger sentenceChanger;
    Button equalSign, copier, clearer;
    EditText input;
    ClipData clip  ;
    EmojiSelector emojiSelector = new EmojiSelector();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result =  findViewById(R.id.viewer);
        clearer = findViewById(R.id.clearer);

        input =  findViewById(R.id.editor);
        equalSign =  findViewById(R.id.equalSign);
        copier =  findViewById(R.id.copier);
        copier.bringToFront();
        sentenceChanger = new SentenceChanger();
        sentenceChanger.setSentence("");


        equalSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                sentenceChanger.setSentence(input.getText().toString());
                sentenceChanger.makeResultSentence();

                //  System.out.println(input.getText().toString());
                result.setText("\n"+sentenceChanger.getResultSentence());
                equalSign.setText(emojiSelector.getEmoji());
            }
        });

        clearer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("");

            }
        }
        );

        copier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clip = ClipData.newPlainText("ResultCopy",sentenceChanger.getResultSentence());
                clipboard.setPrimaryClip(clip);
            }
        });

    }
}
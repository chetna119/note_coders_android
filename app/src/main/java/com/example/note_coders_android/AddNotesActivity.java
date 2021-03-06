package com.example.note_coders_android;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddNotesActivity extends AppCompatActivity {

    EditText title, description;
    Button addNote;
    Button audio_button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_notes);

        title = findViewById(R.id.title);
        description = findViewById(R.id.description);
        addNote = findViewById(R.id.addNote);
        audio_button = findViewById(R.id.audioAddButton);

        addNote.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (!TextUtils.isEmpty(title.getText().toString()) && !TextUtils.isEmpty(description.getText().toString()))
                {
//                    DatabaseClass db = new DatabaseClass(com.example.note_coders_android.AddNotesActivity.this);
//                    db.addNotes(title.getText().toString(), description.getText().toString());

                    Intent intent = new Intent(com.example.note_coders_android.AddNotesActivity.this,MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    finish();

                } else
                    {
                    Toast.makeText(com.example.note_coders_android.AddNotesActivity.this, "Both Fields Required", Toast.LENGTH_SHORT).show();
                }
            }
        });
        audio_button.setOnClickListener(v ->
        {
            //to go to audio activity
            Intent intent = new Intent(AddNotesActivity.this, AudioActivity.class);
            startActivity(intent);
        });
    }
}
package eecs1022.tutorial.greeting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /* This method is invoked when the app is first launched*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* 3 helper methods you can assume.*/
    private void setContentsOfTextView(int id, String newContents) {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    private String getInputOfTextField(int id) {
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    private String getItemSelected(int id) {
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }

    //Controller method to be attached to some GUI components
    public void computeButtonSayGreetingsClicked(View view) {

        String textName = getInputOfTextField(R.id.inputName);
        String textTitle = getItemSelected(R.id.optionsTitles);
        // computation
        String greetingMessage = "Hello " + textTitle + " " + textName;


        //display
        setContentsOfTextView(R.id.buttonSayGreetings, greetingMessage);

    }




}
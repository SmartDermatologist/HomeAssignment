package homeassignmnet.nikhil.com.homeassignment.AddFreind;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import homeassignmnet.nikhil.com.homeassignment.Constants.Constants;
import homeassignmnet.nikhil.com.homeassignment.R;

public class AddFreind extends AppCompatActivity implements View.OnClickListener{
private Button submitDetails;
private EditText editTextUserName,editTextDate;
private Context addFreindActivityContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_freind);
        addFreindActivityContext=AddFreind.this;
        submitDetails= (Button) findViewById(R.id.button_submit);
        editTextDate= (EditText) findViewById(R.id.editText_userDate);
        editTextUserName= (EditText) findViewById(R.id.editText_userName);
        submitDetails.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button_submit:
                 if(!checkInputTypes())
                 {

                 }
        }
    }

    private boolean checkInputTypes()
    {
        if(TextUtils.isEmpty(editTextUserName.getText()))
        {
            editTextUserName.setError(Constants.validUserName);
            Toast.makeText(addFreindActivityContext, Constants.validUserName,Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (TextUtils.isEmpty(editTextDate.getText()))
        {
            editTextDate.setError(Constants.validUserDate);
            Toast.makeText(addFreindActivityContext, Constants.validUserDate,Toast.LENGTH_SHORT).show();
            return true;
        }
        else
        {
           return false;
        }
    }
}

package com.myapps.Seviye1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.annotation.ConfirmPassword;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Password;
import com.myapps.R;

import java.util.List;

public class LoginValidation extends AppCompatActivity implements com.mobsandgeeks.saripaar.Validator.ValidationListener {
    @NotEmpty
    private EditText etName;

    @NotEmpty
   /* @Email
    private EditText etEmail;*/

   /* @NotEmpty
    @Length(min = 12, message = "Miminum length is 12")
    private EditText etPhoneNumber;*/

    @Password(min = 2)
    private EditText etPassword;

    @ConfirmPassword
    private EditText etConfirmPassword;

    private Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_validation);
        etName = (EditText) findViewById(R.id.username);
        etPassword = (EditText) findViewById(R.id.password);
        etConfirmPassword = (EditText) findViewById(R.id.repassword);
        //etEmail = (EditText) findViewById(R.id.edit_text_email);
        //etPhoneNumber = (EditText) findViewById(R.id.edit_text_phone);
        btnlogin = (Button) findViewById(R.id.loginB);

        final com.mobsandgeeks.saripaar.Validator validator = new com.mobsandgeeks.saripaar.Validator(this);
        validator.setValidationListener(this);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validator.validate();
            }
        });
    }

    @Override
    public void onValidationSucceeded() {
        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onValidationFailed(List<ValidationError> errors) {
        for (ValidationError error : errors) {

            View view = error.getView();

            String message = error.getCollatedErrorMessage(this);

            //display the error message
            if (view instanceof EditText) {
                ((EditText) view).setError(message);
                view.requestFocus();

            } else {
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
            }
        }
    }

}

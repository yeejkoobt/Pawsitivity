package com.catastrophic.pawsitivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class LoginActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private TextView responseView;
    private EditText usernameField;
    private EditText passwordField;
    private Button loginButton;
    private static String urlForAPI = "https://pawsitivity-api.herokuapp.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        responseView = (TextView) findViewById(R.id.responseView);
        usernameField = (EditText) findViewById(R.id.usernameField);
        loginButton = (Button) findViewById(R.id.loginButton);
        passwordField = (EditText) findViewById(R.id.passwordField);
//        loginButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String username = usernameField.getText().toString();
//                String password = passwordField.getText().toString();
//                new RegisterActivity.RetrieveFeedTask().execute(username, password);
//            }
//        });
    }

    public void handleLoginClicked(View view) {
        String username = usernameField.getText().toString();
        String password = passwordField.getText().toString();
        new RetrieveFeedTask().execute(username, password);
    }

    class RetrieveFeedTask extends AsyncTask<String, String, String> {

        private Exception exception;

        protected void onPreExecute() {
            progressBar.setVisibility(View.VISIBLE);
            responseView.setText("");
        }

        protected String doInBackground(String... args) {
            String username = args[0];
            String password = args[1];
            // Do some validation here

            try {
                String whereToSearch = urlForAPI + "users/" + username + "/" + password;
                URL url = new URL(whereToSearch);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                    StringBuilder stringBuilder = new StringBuilder();
                    String line = bufferedReader.readLine();
                    stringBuilder.append(line);
                    bufferedReader.close();
                    return stringBuilder.toString();
                }
                finally{
                    urlConnection.disconnect();
                }
            }
            catch(Exception e) {
                Log.e("ERROR", e.getMessage(), e);
                return null;
            }
        }

        protected void onPostExecute(String response) {
            if(response == null) {
                response = "";
                Toast.makeText(LoginActivity.this, "Invalid Username or Password MEOW!",
                        Toast.LENGTH_SHORT).show();
            } else if (response.equals("true")) {
                Intent intent = new Intent(LoginActivity.this, EncourageCatActivity.class);
                intent.putExtra("color", "");
                startActivity(intent);
            }
            progressBar.setVisibility(View.GONE);
            Log.i("INFO", response);
            responseView.setText(response);
        }
    }
}

package com.sdc.android.tutor.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.sdc.android.tutor.MainActivity;
import com.sdc.android.tutor.R;

/**
 * This activity serves as a super activity to be extended by the other activities in this application.
 * Things such as menu options will be handled here.
 */
public class BaseActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_base, menu);
        return true;
    }

    /**
     * Handles response to user selecting a menu item from the base menu
     * @param item MenuItem selected by user
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        Intent intent;
        Toast toast;
        StringBuilder toastMessage = new StringBuilder();
        Context context = getApplicationContext();

        switch (id){
            case R.id.action_settings:
                toastMessage.append("Settings");
                intent = new Intent(this, MainActivity.class);
                break;
            case R.id.action_logout:
                toastMessage.append("Logout");
                intent = new Intent(this, MainActivity.class);
                break;
            default:
                toastMessage.append("");
                intent = new Intent(this, MainActivity.class);
                break;
        }
        toastMessage.append(" menu item selected!");
        toast = Toast.makeText(context,toastMessage.toString(),Toast.LENGTH_SHORT);
        toast.show();
        startActivity(intent);

        return super.onOptionsItemSelected(item);
    }
    }

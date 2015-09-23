package a.colorpicker;

/** Part of ColorPicker application [Project 1 for COMP490 at Kalamazoo College]
 *
 * Date created: 20 September 2015
 * Author: Ariah Lacey
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public static int redInt;
    public static int blueInt;
    public static int greenInt;

    String errorMessage = "Integer must be between 0 and 255!";
    Toast toast = new Toast(this);


    public int getRed() {
        EditText redValue = (EditText) findViewById(R.id.red_value);
        redInt = Integer.parseInt(redValue.getText().toString());
        return redInt;
    }

    public int getBlue() {
        EditText blueValue = (EditText) findViewById(R.id.blue_value);
        blueInt = Integer.parseInt(blueValue.getText().toString());
        return blueInt;
    }

    public int getGreen() {
        EditText greenValue = (EditText) findViewById(R.id.green_value);
        greenInt = Integer.parseInt(greenValue.getText().toString());
        return greenInt;
    }

    /** Called when the user clicks the Done button */
    public void submitValue(View view) {
        if (this.getRed() < 0 || this.getRed() > 255) {
            toast.makeText(this, errorMessage,Toast.LENGTH_SHORT);
            throw new Error(errorMessage);
        }
        if (this.getBlue() < 0 || this.getBlue() > 255) {
            toast.makeText(this, errorMessage,Toast.LENGTH_SHORT);
            throw new Error(errorMessage);
        }
        if (this.getGreen() < 0 || this.getGreen() > 255) {
            toast.makeText(this, errorMessage,Toast.LENGTH_SHORT);
            throw new Error(errorMessage);
        }
        //declare new intent
        Intent intent = new Intent(this, Display.class);
        startActivity(intent);
    }

}

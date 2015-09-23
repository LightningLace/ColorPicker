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

    /** Called when the user clicks the Done button */
    public void submitValue(View view) {
        //declare new intent
        Intent intent = new Intent(this, MainFragment.class);

        //Get values from EditText fields
        EditText redValue = (EditText) findViewById(R.id.red_value);
        EditText blueValue = (EditText) findViewById(R.id.blue_value);
        EditText greenValue = (EditText) findViewById(R.id.green_value);

        //Convert to integer-type values
        redInt = Integer.parseInt(redValue.getText().toString());
        blueInt = Integer.parseInt(blueValue.getText().toString());
        greenInt = Integer.parseInt(greenValue.getText().toString());

        startActivity(intent);
    }

    public static int getRed() {
        return redInt;
    }

    public static int getBlue() {
        return blueInt;
    }

    public static int getGreen() {
        return greenInt;
    }
}

package a.colorpicker;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Canvas;
import android.widget.ImageView;

/**
 * Created by Ariah on 9/23/2015.
 * Part of ColorPicker package and Project 1 for COMP490
 */

public class Display extends AppCompatActivity {

    ImageView imageView;

    public Display() {
    }

    Canvas canvas;
    Main main = new Main();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Create bitmap and canvas
        setContentView(R.layout.activity_display);
        imageView = (ImageView) this.findViewById(R.id.box);
        Bitmap bitmap = Bitmap.createBitmap(getWindowManager().getDefaultDisplay().getWidth(), getWindowManager().getDefaultDisplay().getHeight(), Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);
        imageView.setImageBitmap(bitmap);

        //Draw box
        imageView.setBackgroundColor(Color.rgb(main.getRed(), main.getGreen(), main.getBlue()));


        /* Can't actually get this part to work.... will fix later

        paint = new Paint();
        paint.setColor(Color.CYAN);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(10);
        canvas.drawRect(100, 100, 100, 100, paint);

        */
    }


}

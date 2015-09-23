package a.colorpicker;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Canvas;

/**
 * Created by Ariah on 9/23/2015.
 * Part of ColorPicker package and Project 1 for COMP490
 */

public class Display extends AppCompatActivity {

    public Display() {
    }

    blankCanvas canvas;
    Canvas newCanvas;
    Color color;
    Main main = new Main();
    int rgbVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rgbVal = color.rgb(main.getRed(), main.getGreen(), main.getBlue());
        color = new Color();
        canvas = new blankCanvas(this);
        newCanvas = new Canvas();
        canvas.setBackgroundColor(Color.WHITE);
        canvas.draw(newCanvas, rgbVal);
    }

}

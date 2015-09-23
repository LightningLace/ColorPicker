package a.colorpicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Ariah on 9/23/2015.
 * Part of ColorPicker package and Project 1 for COMP490
 */
public class blankCanvas extends View{

    Paint paint = new Paint();

    public blankCanvas(Context context) {
        super(context);
    }


    public void draw (Canvas canvas, int color) {
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        canvas.drawPaint(paint);
        //canvas.drawRect(100, 100, 100, 100, paint);
    }
}

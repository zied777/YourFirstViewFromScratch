package customViews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

// Now you extend from the View class directly, by the way, TextView, ... extends this class too
public class FirstCustomViewFromScratch extends View {

    //Our Brush
    private Paint paint;

    //Same constructor overriding as the last lesson, we are interested in this constructor basically to receive XML parameters via AttribtueSet
    public FirstCustomViewFromScratch(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        paint = new Paint();
        //Set Color
        paint.setColor(Color.BLACK);
        //Set Style : choose Stroke for now
        paint.setStyle(Paint.Style.STROKE);
        //Set Width of Stroke
        paint.setStrokeWidth(200);
    }


    //All drawing must be done in onDraw. DO NOT INSTANTIATE OBJECTS INSIDE THIS METHOD, it will be called many times
    protected void onDraw(Canvas canvas){

        //call super onDraw
        super.onDraw(canvas);
        //Draw a full size filled black rectangle
        canvas.drawRect(0,0, getWidth(), getHeight(), paint);

    }
}

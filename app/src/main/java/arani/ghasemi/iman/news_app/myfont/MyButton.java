package arani.ghasemi.iman.news_app.myfont;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class MyButton extends android.support.v7.widget.AppCompatButton {
    public MyButton(Context context) {
        super(context);
        init();
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface typeface = Typeface.createFromAsset(getContext().getAssets(), "IRAN_Sans.ttf");
            setTypeface(typeface);
        }
    }
}

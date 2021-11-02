package arani.ghasemi.iman.news_app.myfont;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class MyEditText extends android.support.v7.widget.AppCompatEditText {
    public MyEditText(Context context) {
        super(context);
        init();
    }

    public MyEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyEditText(Context context, AttributeSet attrs, int defStyleAttr) {
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

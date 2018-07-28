package com.github.megatronking.funnydraw.sample;

import android.graphics.Rect;
import android.support.annotation.NonNull;

import com.github.megatronking.funnydraw.draw.Canvas;
import com.github.megatronking.funnydraw.draw.MotionDrawer;
import com.github.megatronking.funnydraw.draw.RectMotionDrawer;

/**
 * Draw a square on google ai canvas.
 *
 * @author Magetron King
 * @since 18/7/27 11:42
 */

public class SquareSample implements Sample {

    @NonNull
    @Override
    public MotionDrawer buildDrawer(Canvas canvas) {
        Rect rect = new Rect(canvas.centerX - canvas.width / 4, canvas.centerY - canvas.width / 4,
                canvas.centerX + canvas.width / 4, canvas.centerY + canvas.width / 4);
        return new RectMotionDrawer(rect, DEFAULT_DURATION);
    }

}

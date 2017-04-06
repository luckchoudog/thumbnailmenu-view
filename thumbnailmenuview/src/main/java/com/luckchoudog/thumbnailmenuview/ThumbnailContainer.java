package com.luckchoudog.thumbnailmenuview;

import android.content.Context;
import android.widget.LinearLayout;

/**
 * ScrollView/HorizontalScrollView 中的 唯一子 ViewGroup
 */
public class ThumbnailContainer extends LinearLayout {

    private int direction;

    public ThumbnailContainer(Context context, int direction) {
        super(context);

        this.direction = direction;
    }

}

package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.b20;
import defpackage.cw8;
import defpackage.g66;
import defpackage.kp5;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class VerticalGridView extends b20 {
    public VerticalGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.O1.D1(1);
        u0(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g66.lbVerticalGridView);
        cw8.m(this, context, g66.lbVerticalGridView, attributeSet, typedArrayObtainStyledAttributes, 0);
        setColumnWidth(typedArrayObtainStyledAttributes);
        setNumColumns(typedArrayObtainStyledAttributes.getInt(g66.lbVerticalGridView_numberOfColumns, 1));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setColumnWidth(TypedArray typedArray) {
        if (typedArray.peekValue(g66.lbVerticalGridView_columnWidth) != null) {
            setColumnWidth(typedArray.getLayoutDimension(g66.lbVerticalGridView_columnWidth, 0));
        }
    }

    public void setNumColumns(int i) {
        GridLayoutManager gridLayoutManager = this.O1;
        if (i >= 0) {
            gridLayoutManager.W0 = i;
            requestLayout();
        } else {
            gridLayoutManager.getClass();
            kp5.e();
        }
    }

    public void setColumnWidth(int i) {
        this.O1.E1(i);
        requestLayout();
    }

    public VerticalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}

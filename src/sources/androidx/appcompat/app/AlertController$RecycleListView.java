package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import defpackage.h66;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int f0;
    public final int g0;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h66.RecycleListView);
        this.g0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(h66.RecycleListView_paddingBottomNoButtons, -1);
        this.f0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(h66.RecycleListView_paddingTopNoTitle, -1);
    }
}

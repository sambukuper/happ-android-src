package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.c;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class io0 extends c {
    public final /* synthetic */ byte p = 1;

    public /* synthetic */ io0(Context context) {
        super(context);
    }

    @Override // defpackage.p96
    public PointF a(int i) {
        switch (this.p) {
            case 0:
                return null;
            default:
                return super.a(i);
        }
    }

    @Override // androidx.recyclerview.widget.c
    public int g(View view, int i) {
        switch (this.p) {
            case 0:
                return 0;
            default:
                return super.g(view, i);
        }
    }

    @Override // androidx.recyclerview.widget.c
    public int h(View view, int i) {
        switch (this.p) {
            case 0:
                return 0;
            default:
                return super.h(view, i);
        }
    }

    @Override // androidx.recyclerview.widget.c
    public float i(DisplayMetrics displayMetrics) {
        switch (this.p) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.i(displayMetrics);
        }
    }

    public io0(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}

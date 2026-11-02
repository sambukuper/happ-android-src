package defpackage;

import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n96 {
    public int a;
    public int b;
    public int c;
    public int d;
    public BaseInterpolator e;
    public boolean f;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.S(i);
            this.f = false;
        } else if (this.f) {
            BaseInterpolator baseInterpolator = this.e;
            if (baseInterpolator != null && this.c < 1) {
                bt.i("If you provide an interpolator, you must set a positive duration");
                return;
            }
            int i2 = this.c;
            if (i2 < 1) {
                bt.i("Scroll duration must be a positive number");
            } else {
                recyclerView.h1.c(this.a, this.b, i2, baseInterpolator);
                this.f = false;
            }
        }
    }
}

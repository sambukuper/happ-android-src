package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oq extends wl7 {
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ WeakReference i;
    public final /* synthetic */ tq j;

    public oq(tq tqVar, int i, int i2, WeakReference weakReference) {
        this.j = tqVar;
        this.g = i;
        this.h = i2;
        this.i = weakReference;
    }

    @Override // defpackage.wl7
    public final void T(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.g) != -1) {
            typeface = en.d(typeface, i, (this.h & 2) != 0);
        }
        tq tqVar = this.j;
        if (tqVar.n) {
            tqVar.l = typeface;
            TextView textView = (TextView) this.i.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = tqVar.j;
                if (zIsAttachedToWindow) {
                    textView.post(new pq(textView, typeface, i2));
                } else {
                    tq.d(textView, typeface, i2);
                }
            }
        }
    }
}

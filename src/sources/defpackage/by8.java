package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class by8 {
    public static final hy8 a;
    public static final ap0 b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new iy8();
        } else {
            a = new hy8();
        }
        b = new ap0(Float.class, "translationAlpha", (byte) 16);
        new ap0(Rect.class, "clipBounds", (byte) 17);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.h(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        a.i(view, i);
    }
}

package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class aq {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static aq c;
    public rf6 a;

    public static synchronized aq a() {
        try {
            if (c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return rf6.e(i, mode);
    }

    public static synchronized void d() {
        if (c == null) {
            aq aqVar = new aq();
            c = aqVar;
            aqVar.a = rf6.b();
            rf6 rf6Var = c.a;
            fu6 fu6Var = new fu6();
            synchronized (rf6Var) {
                rf6Var.e = fu6Var;
            }
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.c(context, i);
    }
}

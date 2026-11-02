package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e31 {
    public final y5 a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet d;
    public Object e;

    public e31(Context context, y5 y5Var) {
        this.a = y5Var;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.e = obj;
                ((ki3) this.a.h0).execute(new sc(wv0.Y0(this.d), this, (byte) 16));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}

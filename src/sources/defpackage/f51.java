package defpackage;

import android.content.Context;
import io.sentry.c2;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f51 {
    public volatile Object a;
    public final Object b;

    public f51() {
        this.b = new CopyOnWriteArraySet();
    }

    public Object a(Context context) {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        this.a = ((c2) this.b).f(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.a;
    }

    public f51(c2 c2Var) {
        this.a = null;
        this.b = c2Var;
    }
}

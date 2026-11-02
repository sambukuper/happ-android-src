package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xw8 {
    public final yw8 a = new yw8();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        yw8 yw8Var = this.a;
        if (yw8Var.d) {
            yw8.a(autoCloseable);
            return;
        }
        synchronized (yw8Var.a) {
            autoCloseable2 = (AutoCloseable) yw8Var.b.put(str, autoCloseable);
        }
        yw8.a(autoCloseable2);
    }

    public final void b() {
        yw8 yw8Var = this.a;
        if (!yw8Var.d) {
            yw8Var.d = true;
            synchronized (yw8Var.a) {
                try {
                    Iterator it = yw8Var.b.values().iterator();
                    while (it.hasNext()) {
                        yw8.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = yw8Var.c.iterator();
                    while (it2.hasNext()) {
                        yw8.a((AutoCloseable) it2.next());
                    }
                    yw8Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        yw8 yw8Var = this.a;
        synchronized (yw8Var.a) {
            autoCloseable = (AutoCloseable) yw8Var.b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}

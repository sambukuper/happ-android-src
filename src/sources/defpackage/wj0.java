package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wj0 {
    public final bm3 a;
    public final Object b;
    public final ArrayList c;
    public final Object d;
    public final ArrayList e;
    public final Object f;
    public final ArrayList g;

    public wj0(bm3 bm3Var) {
        bm3Var.getClass();
        this.a = bm3Var;
        this.b = new Object();
        this.c = new ArrayList();
        this.d = new Object();
        this.e = new ArrayList();
        this.f = new Object();
        this.g = new ArrayList();
    }

    public final void a(uj0 uj0Var, Runnable runnable) {
        boolean zAdd;
        int iOrdinal = uj0Var.ordinal();
        if (iOrdinal == 0) {
            synchronized (this.b) {
                zAdd = this.c.add(runnable);
            }
        } else if (iOrdinal == 1) {
            synchronized (this.d) {
                zAdd = this.e.add(runnable);
            }
        } else if (iOrdinal != 2) {
            b61.c();
            return;
        } else {
            synchronized (this.f) {
                zAdd = this.g.add(runnable);
            }
        }
        if (zAdd) {
            return;
        }
        uj0Var.toString();
        runnable.run();
    }

    public final void b() {
        synchronized (this.b) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        synchronized (this.d) {
            try {
                Iterator it2 = this.e.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f) {
            Iterator it3 = this.g.iterator();
            while (it3.hasNext()) {
                ((Runnable) it3.next()).run();
            }
        }
    }
}

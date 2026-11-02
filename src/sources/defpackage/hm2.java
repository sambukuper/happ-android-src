package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hm2 implements AutoCloseable {
    public final Object X = new Object();
    public final kt Y = new kt();
    public boolean Z;

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.X) {
            if (this.Z) {
                return;
            }
            this.Z = true;
            Iterator<E> it = this.Y.iterator();
            if (it.hasNext()) {
                throw p61.k(it);
            }
            this.Y.clear();
        }
    }

    public final void g(ne6 ne6Var) {
        ne6Var.getClass();
        synchronized (this.X) {
            try {
                if (this.Z) {
                    return;
                }
                Iterator it = this.Y.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

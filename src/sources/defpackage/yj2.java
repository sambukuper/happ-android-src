package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yj2 implements n63 {
    public final n63 Y;
    public final Object X = new Object();
    public final HashSet Z = new HashSet();

    public yj2(n63 n63Var) {
        this.Y = n63Var;
    }

    @Override // defpackage.n63
    public int a() {
        return this.Y.a();
    }

    @Override // defpackage.n63
    public int b() {
        return this.Y.b();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        this.Y.close();
        synchronized (this.X) {
            hashSet = new HashSet(this.Z);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((xj2) it.next()).c(this);
        }
    }

    public final void g(xj2 xj2Var) {
        synchronized (this.X) {
            this.Z.add(xj2Var);
        }
    }

    @Override // defpackage.n63
    public final int getFormat() {
        return this.Y.getFormat();
    }

    @Override // defpackage.n63
    public m63[] n() {
        return this.Y.n();
    }

    @Override // defpackage.n63
    public d63 r0() {
        return this.Y.r0();
    }
}

package defpackage;

import io.sentry.c2;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g18 implements xj2 {
    public f63 Y;
    public final ArrayList Z;
    public final ArrayDeque X = new ArrayDeque();
    public boolean f0 = false;

    public g18(k42 k42Var) {
        s08.b();
        this.Z = new ArrayList();
    }

    public final void a() {
        s08.b();
        new z53("Camera is closed.", 3, null);
        ArrayDeque arrayDeque = this.X;
        Iterator it = arrayDeque.iterator();
        if (it.hasNext()) {
            throw p61.k(it);
        }
        arrayDeque.clear();
        Iterator it2 = new ArrayList(this.Z).iterator();
        if (it2.hasNext()) {
            throw p61.k(it2);
        }
    }

    public final void b() {
        int iS;
        s08.b();
        if (this.f0) {
            return;
        }
        f63 f63Var = this.Y;
        f63Var.getClass();
        s08.b();
        lr lrVar = (lr) f63Var.Z;
        s08.b();
        mb6.s("The ImageReader is not initialized.", ((z76) lrVar.Y) != null);
        z76 z76Var = (z76) lrVar.Y;
        synchronized (z76Var.Z) {
            iS = ((q63) z76Var.f0).s() - z76Var.X;
        }
        if (iS == 0 || this.X.poll() == null) {
            return;
        }
        c2.m();
    }

    @Override // defpackage.xj2
    public final void c(yj2 yj2Var) {
        ((lv2) km4.J()).execute(new fl6((Object) this, (byte) 10));
    }
}

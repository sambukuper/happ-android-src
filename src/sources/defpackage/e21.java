package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e21 implements qr6, o15 {
    public final qr6 X;
    public final o15 Y;
    public s61 Z;
    public Throwable f0;

    public e21(qr6 qr6Var) {
        q15 q15VarA = r15.a();
        qr6Var.getClass();
        this.X = qr6Var;
        this.Y = q15VarA;
    }

    @Override // defpackage.qr6
    public final xr6 X0(String str) {
        str.getClass();
        return this.X.X0(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.X.close();
    }

    @Override // defpackage.o15
    public final Object g(q51 q51Var) {
        return this.Y.g(q51Var);
    }

    @Override // defpackage.o15
    public final boolean k() {
        return this.Y.k();
    }

    @Override // defpackage.o15
    public final void m(Object obj) {
        this.Y.m(null);
    }

    public final void p(StringBuilder sb) {
        if (this.Z == null && this.f0 == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        s61 s61Var = this.Z;
        if (s61Var != null) {
            sb.append("\t\tCoroutine: " + s61Var);
            sb.append('\n');
        }
        Throwable th = this.f0;
        if (th != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            Iterator it = wv0.o0(fm7.s0(gv3.W(th)), 1).iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }

    public final String toString() {
        return this.X.toString();
    }
}

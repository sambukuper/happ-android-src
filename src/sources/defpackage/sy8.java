package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sy8 {
    public final String a;
    public final it2 b;
    public final b71 c;
    public final int d;
    public final Object e;
    public boolean f;
    public ly8 g;
    public final u77 h;
    public final xe2 i;
    public mk0 j;
    public og7 k;
    public s15 l;

    public sy8(String str, it2 it2Var, b71 b71Var) {
        str.getClass();
        b71Var.getClass();
        this.a = str;
        this.b = it2Var;
        this.c = b71Var;
        qv qvVar = ry8.a;
        qvVar.getClass();
        this.d = qv.b.incrementAndGet(qvVar);
        this.e = new Object();
        u77 u77VarB = v77.b(3, 4, null);
        this.h = u77VarB;
        this.i = w51.t(u77VarB);
        yk0 yk0Var = yk0.a;
        this.j = yk0Var;
        if (u77VarB.g(yk0Var)) {
            return;
        }
        bt.i("Check failed.");
        throw null;
    }

    public final void a(ai0 ai0Var) {
        mk0 mk0Var;
        synchronized (this.e) {
            try {
                if (this.f) {
                    return;
                }
                this.f = true;
                toString();
                ly8 ly8Var = this.g;
                if (ly8Var != null) {
                    synchronized (ly8Var.Y) {
                        ly8Var.Z = true;
                    }
                }
                og7 og7Var = this.k;
                if (og7Var != null) {
                    og7Var.m(null);
                }
                s15 s15Var = this.l;
                if (s15Var != null) {
                    s15Var.b();
                }
                synchronized (this.e) {
                    mk0Var = this.j;
                }
                if (!(mk0Var instanceof pk0)) {
                    if (!(mk0Var instanceof qk0)) {
                        b(new qk0(null));
                    }
                    b(new pk0(this.a, wu0.Y, null, null, null, null, null, null, ai0Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(mk0 mk0Var) {
        this.j = mk0Var;
        if (this.h.g(mk0Var)) {
            return;
        }
        throw new IllegalStateException(("Failed to emit " + mk0Var + " in " + this).toString());
    }

    public final String toString() {
        return "VirtualCamera-" + this.d;
    }
}

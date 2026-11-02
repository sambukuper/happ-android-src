package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h68 {
    public final a23 a;
    public int b = -1;
    public long c = 9205357640488583168L;
    public boolean d = true;
    public final /* synthetic */ r68 e;

    public h68(r68 r68Var, a23 a23Var) {
        this.e = r68Var;
        this.a = a23Var;
    }

    public final void a() {
        g68 g68Var = g68.X;
        r68 r68Var = this.e;
        r68Var.q.setValue(g68Var);
        if (this.d) {
            r68Var.s();
        }
    }

    public final long b(long j, kp5 kp5Var, x78 x78Var, boolean z) {
        int length = x78Var.a.a.Y.length();
        int iD = this.b;
        r68 r68Var = this.e;
        if (iD < 0 || iD > length) {
            iD = r68Var.b.d(this.c, false);
        }
        int i = iD;
        long jC = r68Var.C(r68Var.a.d(), i, r68Var.b.d(j, false), false, kp5Var, false, z, null);
        if (this.b == -1 && !f88.b(jC)) {
            this.b = (int) (jC >> 32);
        }
        if (f88.e(jC)) {
            jC = ct7.c((int) (4294967295L & jC), (int) (jC >> 32));
        }
        r68Var.a.j(jC);
        r68Var.y(s88.Z);
        return jC;
    }
}

package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mz1 {
    public byte a = 1;
    public final fv4 b;
    public fv4 c;
    public fv4 d;
    public int e;
    public int f;

    public mz1(fv4 fv4Var) {
        this.b = fv4Var;
        this.c = fv4Var;
    }

    public final void a() {
        this.a = (byte) 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        dv4 dv4VarB = this.c.b.b();
        int iA = dv4VarB.a(6);
        return !(iA == 0 || ((ByteBuffer) dv4VarB.f0).get(iA + dv4VarB.X) == 0) || this.e == 65039;
    }
}

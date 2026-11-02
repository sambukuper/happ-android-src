package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t06 {
    public final q06 a;
    public final boolean b;
    public final qd7 c;
    public final gn2 d;
    public final boolean e;
    public final Object f;
    public boolean g = true;

    public t06(q06 q06Var, Object obj, boolean z, qd7 qd7Var, gn2 gn2Var, boolean z2) {
        this.a = q06Var;
        this.b = z;
        this.c = qd7Var;
        this.d = gn2Var;
        this.e = z2;
        this.f = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        d01.b("Unexpected form of a provided value");
        b61.n();
        return null;
    }
}

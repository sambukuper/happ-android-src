package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rz6 {
    public final Object a;
    public final sn2 b;
    public final sn2 c;
    public final Object d;
    public final uy7 e;
    public final sn2 f;
    public Object g;
    public int h = -1;
    public final /* synthetic */ tz6 i;

    public rz6(tz6 tz6Var, Object obj, sn2 sn2Var, sn2 sn2Var2, Object obj2, uy7 uy7Var, sn2 sn2Var3) {
        this.i = tz6Var;
        this.a = obj;
        this.b = sn2Var;
        this.c = sn2Var2;
        this.d = obj2;
        this.e = uy7Var;
        this.f = sn2Var3;
    }

    public final void a() {
        Object obj = this.g;
        if (obj instanceof nz6) {
            ((nz6) obj).h(this.h, this.i.X);
            return;
        }
        gq1 gq1Var = obj instanceof gq1 ? (gq1) obj : null;
        if (gq1Var != null) {
            gq1Var.a();
        }
    }
}

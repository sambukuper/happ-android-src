package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hq2 extends i1 {
    public final bx5 a;
    public final String b;
    public final Object c;

    public hq2(bx5 bx5Var, cd1 cd1Var, int i) {
        String str = bx5Var.b;
        cd1Var = (i & 4) != 0 ? null : cd1Var;
        str.getClass();
        this.a = bx5Var;
        this.b = str;
        this.c = cd1Var;
    }

    @Override // defpackage.i1
    public final bx5 a() {
        return this.a;
    }

    @Override // defpackage.i1
    public final Object b() {
        return this.c;
    }

    @Override // defpackage.i1
    public final String c() {
        return this.b;
    }
}

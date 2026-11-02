package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class do8 extends i1 {
    public final bx5 a;
    public final String b;
    public final Integer c;
    public final e95 d;
    public final int e;

    public do8(bx5 bx5Var, int i, e95 e95Var, int i2) {
        int i3;
        String str = bx5Var.b;
        Integer num = (i2 & 16) != 0 ? null : 0;
        e95Var = (i2 & 32) != 0 ? null : e95Var;
        str.getClass();
        this.a = bx5Var;
        this.b = str;
        this.c = num;
        this.d = e95Var;
        if (i < 10) {
            i3 = 1;
        } else if (i < 100) {
            i3 = 2;
        } else {
            if (i >= 1000) {
                bt.q(ie2.h("Max value ", i, " is too large"));
                throw null;
            }
            i3 = 3;
        }
        this.e = i3;
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

    @Override // defpackage.i1
    public final e95 d() {
        return this.d;
    }
}

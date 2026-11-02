package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fo8 implements z82 {
    public final do8 a;
    public final int b;
    public final Integer c;
    public final int d;

    public fo8(do8 do8Var, int i, Integer num) {
        do8Var.getClass();
        this.a = do8Var;
        this.b = i;
        this.c = num;
        int i2 = do8Var.e;
        this.d = i2;
        if (i < 0) {
            em7.c(ie2.h("The minimum number of digits (", i, ") is negative"));
            throw null;
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("The maximum number of digits (" + i2 + ") is less than the minimum number of digits (" + i + ')').toString());
        }
        if (num == null || num.intValue() > i) {
            return;
        }
        throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i + ')').toString());
    }

    @Override // defpackage.z82
    public final rj2 a() {
        k97 k97Var = new k97(new al5(1, this.a.a, bx5.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 24), this.b, (byte) 0);
        Integer num = this.c;
        return num != null ? new k97(k97Var, num.intValue()) : k97Var;
    }

    @Override // defpackage.z82
    public final li5 b() {
        Integer numValueOf = Integer.valueOf(this.b);
        Integer numValueOf2 = Integer.valueOf(this.d);
        do8 do8Var = this.a;
        return u70.p0(numValueOf, numValueOf2, this.c, do8Var.a, do8Var.b, false);
    }

    @Override // defpackage.z82
    public final /* bridge */ /* synthetic */ i1 c() {
        return this.a;
    }
}

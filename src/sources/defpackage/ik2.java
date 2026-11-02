package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ik2 implements z82 {
    public static final List g = i21.L(0, 0, 0, 0, 0, 0, 0, 0, 0);
    public final i1 a;
    public final int b;
    public final int c;
    public final List d;
    public final int e;
    public final int f;

    static {
        i21.L(2, 1, 0, 2, 1, 0, 2, 1, 0);
    }

    public ik2(int i, int i2) {
        List list = g;
        list.getClass();
        hq2 hq2Var = ja8.d;
        hq2Var.getClass();
        this.a = hq2Var;
        this.b = i;
        this.c = i2;
        this.d = list;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.z82
    public final rj2 a() {
        return new dd1(new d0(1, this.a.a(), bx5.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 5), this.b, this.c, this.d);
    }

    @Override // defpackage.z82
    public final li5 b() {
        i1 i1Var = this.a;
        return new li5(i21.K(new w75(i21.K(new hk2(this.b, this.c, i1Var.a(), i1Var.c())))), d02.X);
    }

    @Override // defpackage.z82
    public final i1 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ik2)) {
            return false;
        }
        ik2 ik2Var = (ik2) obj;
        return this.e == ik2Var.e && this.f == ik2Var.f;
    }

    public final int hashCode() {
        return (this.e * 31) + this.f;
    }
}

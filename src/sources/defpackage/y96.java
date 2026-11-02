package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y96 implements z82 {
    public final i1 a;
    public final boolean b;

    public y96(boolean z) {
        hq2 hq2Var = a79.a;
        hq2Var.getClass();
        this.a = hq2Var;
        this.b = z;
    }

    @Override // defpackage.z82
    public final rj2 a() {
        return new c11(new al5(1, this.a.a(), bx5.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 5), (byte) 3);
    }

    @Override // defpackage.z82
    public final li5 b() {
        i1 i1Var = this.a;
        bx5 bx5VarA = i1Var.a();
        String strC = i1Var.c();
        bx5VarA.getClass();
        strC.getClass();
        List listK = i21.K(new w75(i21.K(new x96(bx5VarA, strC))));
        d02 d02Var = d02.X;
        return new li5(d02Var, i21.L(new li5(listK, d02Var), new li5(i21.L(new ko5("+"), new w75(i21.K(new eo8(null, null, bx5VarA, strC, false)))), d02Var), new li5(i21.L(new ko5("-"), new w75(i21.K(new eo8(null, null, bx5VarA, strC, true)))), d02Var)));
    }

    @Override // defpackage.z82
    public final i1 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y96) && this.b == ((y96) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(2000) * 31);
    }
}

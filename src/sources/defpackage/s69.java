package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s69 implements z82 {
    public final i1 a;
    public final Integer b;
    public final Integer c;
    public final dg5 d;
    public final boolean e;

    public s69(dg5 dg5Var, boolean z) {
        hq2 hq2Var = a79.a;
        Integer numValueOf = Integer.valueOf(dg5Var != dg5.Y ? 1 : 4);
        Integer num = dg5Var != dg5.Z ? null : 4;
        hq2Var.getClass();
        this.a = hq2Var;
        this.b = numValueOf;
        this.c = num;
        this.d = dg5Var;
        this.e = z;
    }

    @Override // defpackage.z82
    public final rj2 a() {
        k97 k97Var = new k97(new al5(1, this.a.a(), bx5.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 13), this.b.intValue());
        Integer num = this.c;
        return num != null ? new k97(k97Var, num.intValue()) : k97Var;
    }

    @Override // defpackage.z82
    public final li5 b() {
        i1 i1Var = this.a;
        bx5 bx5VarA = i1Var.a();
        String strC = i1Var.c();
        bx5VarA.getClass();
        strC.getClass();
        Integer num = this.b;
        Integer num2 = this.c;
        ArrayList arrayListN = i21.N(u70.p0(num, null, num2, bx5VarA, strC, true));
        arrayListN.add(u70.p0(num, 4, num2, bx5VarA, strC, false));
        List listL = i21.L(new ko5("+"), new w75(i21.K(new eo8(5, null, bx5VarA, strC, false))));
        d02 d02Var = d02.X;
        arrayListN.add(new li5(listL, d02Var));
        return new li5(d02Var, arrayListN);
    }

    @Override // defpackage.z82
    public final i1 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s69)) {
            return false;
        }
        s69 s69Var = (s69) obj;
        return this.d == s69Var.d && this.e == s69Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + (this.d.hashCode() * 31);
    }
}

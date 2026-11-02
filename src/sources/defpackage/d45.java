package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d45 implements bo0 {
    public final ni8 X;
    public dn2 Y;
    public final d45 Z;
    public final hi8 f0;
    public final g44 g0;

    public d45(ni8 ni8Var, dn2 dn2Var, d45 d45Var, hi8 hi8Var) {
        ni8Var.getClass();
        this.X = ni8Var;
        this.Y = dn2Var;
        this.Z = d45Var;
        this.f0 = hi8Var;
        this.g0 = x97.P(w74.X, new zk3(this, (byte) 15));
    }

    @Override // defpackage.lh8
    public final boolean B() {
        return false;
    }

    @Override // defpackage.bo0
    public final ni8 F() {
        return this.X;
    }

    @Override // defpackage.lh8
    public final Collection c() {
        List list = (List) this.g0.getValue();
        return list == null ? d02.X : list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d45.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        d45 d45Var = (d45) obj;
        d45 d45Var2 = this.Z;
        if (d45Var2 != null) {
            this = d45Var2;
        }
        d45 d45Var3 = d45Var.Z;
        if (d45Var3 != null) {
            obj = d45Var3;
        }
        return this == obj;
    }

    @Override // defpackage.lh8
    public final zz3 f() {
        t14 t14VarB = this.X.b();
        t14VarB.getClass();
        return y08.e(t14VarB);
    }

    @Override // defpackage.lh8
    public final List g() {
        return d02.X;
    }

    public final int hashCode() {
        d45 d45Var = this.Z;
        return d45Var != null ? d45Var.hashCode() : super.hashCode();
    }

    public final String toString() {
        return "CapturedType(" + this.X + ')';
    }

    @Override // defpackage.lh8
    public final ot0 x() {
        return null;
    }

    public /* synthetic */ d45(ni8 ni8Var, pl1 pl1Var, hi8 hi8Var, int i) {
        this(ni8Var, (i & 2) != 0 ? null : pl1Var, (d45) null, (i & 8) != 0 ? null : hi8Var);
    }
}

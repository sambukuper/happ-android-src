package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u1 implements ih1, fe2, da7, ah8, pw3 {
    public final tb6 X;

    public u1(dn2 dn2Var) {
        tb6 tb6VarX = null;
        tb6 tb6Var = dn2Var instanceof tb6 ? (tb6) dn2Var : null;
        if (tb6Var != null) {
            tb6VarX = tb6Var;
        } else if (dn2Var != null) {
            tb6VarX = zc1.X(null, dn2Var);
        }
        this.X = tb6VarX;
    }

    public boolean B() {
        return false;
    }

    public boolean F() {
        return false;
    }

    public boolean G() {
        return false;
    }

    public u1 K() {
        return null;
    }

    public u1 N(boolean z) {
        if (!z) {
            return this;
        }
        xw3.j(this, "Definitely not null captured type is not supported yet: ");
        return null;
    }

    @Override // defpackage.wu3
    public final List Q() {
        return (List) t().getValue();
    }

    public abstract u1 S(boolean z);

    public u1 T() {
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u1) && z39.I(qe4.q0, this, (x14) obj);
    }

    public pw3 f() {
        return null;
    }

    public int hashCode() {
        lv3 lv3VarM = M();
        int iHashCode = lv3VarM != null ? lv3VarM.hashCode() : 0;
        return Boolean.hashCode(z()) + ((L().hashCode() + (iHashCode * 31)) * 31);
    }

    public abstract g44 t();

    public String toString() {
        return lh4.W0(this, false);
    }

    public zu3 v() {
        return null;
    }

    public boolean x() {
        return false;
    }
}

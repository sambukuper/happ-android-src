package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rk1 implements zu3, pz4 {
    public final zu3 X;
    public final sx4 Y;
    public final g44 Z;
    public final g44 f0;

    public rk1(zu3 zu3Var, sx4 sx4Var) {
        this.X = zu3Var;
        this.Y = sx4Var;
        qk1 qk1Var = new qk1(this, (byte) 0);
        w74 w74Var = w74.X;
        this.Z = x97.P(w74Var, qk1Var);
        this.f0 = x97.P(w74Var, new qk1(this, (byte) 1));
    }

    @Override // defpackage.zu3
    public final boolean C() {
        return this.X.C();
    }

    @Override // defpackage.zu3
    public final String E() {
        String strB = this.Y.getName().b();
        strB.getClass();
        return strB;
    }

    @Override // defpackage.zu3
    public final boolean I() {
        return this.X.I();
    }

    @Override // defpackage.zu3
    public final boolean O(Object obj) {
        return this.X.O(obj);
    }

    @Override // defpackage.zu3
    public final Collection P() {
        return this.X.P();
    }

    @Override // defpackage.wu3
    public final List Q() {
        return this.X.Q();
    }

    @Override // defpackage.zu3
    public final List c() {
        return (List) this.f0.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pz4) {
            return this.X.equals(((pz4) obj).q());
        }
        return false;
    }

    @Override // defpackage.zu3
    public final List getTypeParameters() {
        return (List) this.Z.getValue();
    }

    @Override // defpackage.zu3
    public final int hashCode() {
        return this.X.hashCode() * 31;
    }

    @Override // defpackage.zu3
    public final boolean n() {
        return this.X.n();
    }

    @Override // defpackage.zu3
    public final String p() {
        return el1.g(this.Y).a.a;
    }

    @Override // defpackage.pz4
    public final zu3 q() {
        return this.X;
    }

    public final String toString() {
        return "MutableCollectionKClass(" + this.X + ')';
    }

    @Override // defpackage.zu3
    public final Collection u() {
        return this.X.u();
    }
}

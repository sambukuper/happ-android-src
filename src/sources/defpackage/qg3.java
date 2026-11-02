package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qg3 implements lh8, mh8 {
    public t14 X;
    public final LinkedHashSet Y;
    public final int Z;

    public qg3(AbstractCollection abstractCollection) {
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.Y = linkedHashSet;
        this.Z = linkedHashSet.hashCode();
    }

    @Override // defpackage.lh8
    public final boolean B() {
        return false;
    }

    public final aa7 a() {
        ch8.Y.getClass();
        return dh3.P(ch8.Z, this, d02.X, false, du7.b("member scope for intersection type", this.Y), new f0(this, (byte) 16));
    }

    public final String b(gn2 gn2Var) {
        gn2Var.getClass();
        byte b = 1;
        return wv0.y0(wv0.S0(this.Y, new x72(gn2Var, b)), " & ", "{", "}", new ds2(gn2Var, b), 24);
    }

    @Override // defpackage.lh8
    public final Collection c() {
        return this.Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg3)) {
            return false;
        }
        return this.Y.equals(((qg3) obj).Y);
    }

    @Override // defpackage.lh8
    public final zz3 f() {
        zz3 zz3VarF = ((t14) this.Y.iterator().next()).n0().f();
        zz3VarF.getClass();
        return zz3VarF;
    }

    @Override // defpackage.lh8
    public final List g() {
        return d02.X;
    }

    public final int hashCode() {
        return this.Z;
    }

    public final String toString() {
        return b(cl1.l0);
    }

    @Override // defpackage.lh8
    public final ot0 x() {
        return null;
    }
}

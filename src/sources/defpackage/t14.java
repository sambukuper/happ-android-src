package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t14 implements zk, x14 {
    public int X;

    public et4 K() {
        return u32.a(o32.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t14)) {
            return false;
        }
        t14 t14Var = (t14) obj;
        if (o0() == t14Var.o0()) {
            return z39.I(lh4.E0, q0(), t14Var.q0());
        }
        return false;
    }

    @Override // defpackage.zk
    public final sm getAnnotations() {
        return xm.a(m0());
    }

    public final int hashCode() {
        int iHashCode;
        int i = this.X;
        if (i != 0) {
            return i;
        }
        if (vr3.J(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (o0() ? 1 : 0) + ((l0().hashCode() + (n0().hashCode() * 31)) * 31);
        }
        this.X = iHashCode;
        return iHashCode;
    }

    public List l0() {
        return d02.X;
    }

    public ch8 m0() {
        ch8.Y.getClass();
        return ch8.Z;
    }

    public abstract lh8 n0();

    public abstract boolean o0();

    public abstract mo8 q0();

    public t14 p0(z14 z14Var) {
        return this;
    }
}

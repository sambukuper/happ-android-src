package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i3 implements lh8 {
    public int X;
    public final oe4 Y;

    public i3(ve4 ve4Var) {
        ve4Var.getClass();
        this.Y = new oe4(ve4Var, new f3(this, (byte) 1), new f0(this, (byte) 4));
    }

    public abstract Collection a();

    public t14 b() {
        return u32.c(s32.CYCLIC_UPPER_BOUNDS, new String[0]);
    }

    public lh4 d() {
        return lh4.G0;
    }

    @Override // defpackage.lh8
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final List c() {
        return ((h3) this.Y.invoke()).b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lh8) && obj.hashCode() == hashCode()) {
            lh8 lh8Var = (lh8) obj;
            if (lh8Var.g().size() == g().size()) {
                ot0 ot0VarX = x();
                ot0 ot0VarX2 = lh8Var.x();
                if (ot0VarX2 == null || u32.f(ot0VarX) || bl1.m(ot0VarX) || u32.f(ot0VarX2) || bl1.m(ot0VarX2)) {
                    return false;
                }
                return h(ot0VarX2);
            }
        }
        return false;
    }

    public abstract boolean h(ot0 ot0Var);

    public final int hashCode() {
        int i = this.X;
        if (i != 0) {
            return i;
        }
        ot0 ot0VarX = x();
        int iIdentityHashCode = (u32.f(ot0VarX) || bl1.m(ot0VarX)) ? System.identityHashCode(this) : bl1.f(ot0VarX).a.hashCode();
        this.X = iIdentityHashCode;
        return iIdentityHashCode;
    }

    public List i(List list) {
        return list;
    }
}

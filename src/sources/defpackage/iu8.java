package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class iu8 extends hu8 {
    public final String X;
    public final List Y;
    public final int Z;
    public final d90 f0;
    public final float g0;
    public final d90 h0;
    public final float i0;
    public final float j0;
    public final int k0;
    public final int l0;
    public final float m0;
    public final float n0;
    public final float o0;
    public final float p0;

    public iu8(String str, List list, int i, d90 d90Var, float f, d90 d90Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.X = str;
        this.Y = list;
        this.Z = i;
        this.f0 = d90Var;
        this.g0 = f;
        this.h0 = d90Var2;
        this.i0 = f2;
        this.j0 = f3;
        this.k0 = i2;
        this.l0 = i3;
        this.m0 = f4;
        this.n0 = f5;
        this.o0 = f6;
        this.p0 = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iu8.class != obj.getClass()) {
            return false;
        }
        iu8 iu8Var = (iu8) obj;
        return this.X.equals(iu8Var.X) && dh3.f(this.f0, iu8Var.f0) && this.g0 == iu8Var.g0 && dh3.f(this.h0, iu8Var.h0) && this.i0 == iu8Var.i0 && this.j0 == iu8Var.j0 && this.k0 == iu8Var.k0 && this.l0 == iu8Var.l0 && this.m0 == iu8Var.m0 && this.n0 == iu8Var.n0 && this.o0 == iu8Var.o0 && this.p0 == iu8Var.p0 && this.Z == iu8Var.Z && dh3.f(this.Y, iu8Var.Y);
    }

    public final int hashCode() {
        int iF = p61.f(this.X.hashCode() * 31, 31, this.Y);
        d90 d90Var = this.f0;
        int iD = pc6.d((iF + (d90Var != null ? d90Var.hashCode() : 0)) * 31, this.g0, 31);
        d90 d90Var2 = this.h0;
        return Integer.hashCode(this.Z) + pc6.d(pc6.d(pc6.d(pc6.d(oi0.e(this.l0, oi0.e(this.k0, pc6.d(pc6.d((iD + (d90Var2 != null ? d90Var2.hashCode() : 0)) * 31, this.i0, 31), this.j0, 31), 31), 31), this.m0, 31), this.n0, 31), this.o0, 31), this.p0, 31);
    }
}

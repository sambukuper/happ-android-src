package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zw1 implements nr5 {
    public final long X;
    public final fi1 Y;
    public final int Z;
    public final fd f0;
    public final c9 g0;
    public final c9 h0;
    public final n09 i0;
    public final n09 j0;
    public final d9 k0;
    public final d9 l0;
    public final d9 m0;
    public final o09 n0;
    public final o09 o0;

    public zw1(long j, fi1 fi1Var, fd fdVar) {
        int iX0 = fi1Var.x0(48.0f);
        this.X = j;
        this.Y = fi1Var;
        this.Z = iX0;
        this.f0 = fdVar;
        int iX1 = fi1Var.x0(Float.intBitsToFloat((int) (j >> 32)));
        n50 n50Var = pz2.q0;
        this.g0 = new c9(n50Var, n50Var, iX1);
        n50 n50Var2 = pz2.s0;
        this.h0 = new c9(n50Var2, n50Var2, iX1);
        this.i0 = new n09(pu.c);
        this.j0 = new n09(pu.d);
        int iX2 = fi1Var.x0(Float.intBitsToFloat((int) (j & 4294967295L)));
        o50 o50Var = pz2.n0;
        o50 o50Var2 = pz2.p0;
        this.k0 = new d9(o50Var, o50Var2, iX2);
        this.l0 = new d9(o50Var2, o50Var, iX2);
        this.m0 = new d9(pz2.o0, o50Var, iX2);
        this.n0 = new o09(o50Var, iX0);
        this.o0 = new o09(o50Var2, iX0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zw1) {
            zw1 zw1Var = (zw1) obj;
            return this.X == zw1Var.X && dh3.f(this.Y, zw1Var.Y) && this.Z == zw1Var.Z && this.f0 == zw1Var.f0;
        }
        return false;
    }

    public final int hashCode() {
        return this.f0.hashCode() + oi0.e(this.Z, (this.Y.hashCode() + (Long.hashCode(this.X) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) mt1.a(this.X)) + ", density=" + this.Y + ", verticalMargin=" + this.Z + ", onPositionCalculated=" + this.f0 + ')';
    }

    @Override // defpackage.nr5
    public final long x(lf3 lf3Var, long j, z24 z24Var, long j2) {
        lf3 lf3Var2;
        long j3;
        char c;
        int iA;
        int i;
        int i2;
        char c2 = ' ';
        int i3 = (int) (j >> 32);
        boolean z = true;
        List listL = i21.L(this.g0, this.h0, ((int) (lf3Var.a() >> 32)) < i3 / 2 ? this.i0 : this.j0);
        int size = listL.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                lf3Var2 = lf3Var;
                j3 = j;
                c = c2;
                iA = 0;
                break;
            }
            fu4 fu4Var = (fu4) listL.get(i4);
            int i5 = (int) (j2 >> c2);
            int i6 = size;
            c = c2;
            j3 = j;
            int i7 = i4;
            lf3Var2 = lf3Var;
            iA = fu4Var.a(lf3Var2, j3, i5, z24Var);
            if (i7 == listL.size() - 1 || (iA >= 0 && i5 + iA <= i3)) {
                break;
            }
            i4 = i7 + 1;
            size = i6;
            c2 = c;
        }
        int i8 = (int) (j3 & 4294967295L);
        List listL2 = i21.L(this.k0, this.l0, this.m0, ((int) (lf3Var2.a() & 4294967295L)) < i8 / 2 ? this.n0 : this.o0);
        int size2 = listL2.size();
        int i9 = 0;
        while (i9 < size2) {
            boolean z2 = z;
            int i10 = (int) (j2 & 4294967295L);
            int iA2 = ((gu4) listL2.get(i9)).a(lf3Var2, j3, i10);
            if (i9 == listL2.size() - 1 || (iA2 >= (i2 = this.Z) && i10 + iA2 <= i8 - i2)) {
                i = iA2;
                long j4 = (((long) iA) << c) | (((long) i) & 4294967295L);
                this.f0.K(lf3Var2, os4.b(j4, j2));
                return j4;
            }
            i9++;
            z = z2;
        }
        i = 0;
        long j5 = (((long) iA) << c) | (((long) i) & 4294967295L);
        this.f0.K(lf3Var2, os4.b(j5, j2));
        return j5;
    }
}

package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fy5 extends yp2 {
    public static final fy5 I0;
    public static final au3 J0 = new au3(8);
    public int A0;
    public List B0;
    public tz5 C0;
    public List D0;
    public a06 E0;
    public List F0;
    public byte G0;
    public int H0;
    public final jb0 Y;
    public int Z;
    public int f0;
    public int g0;
    public int h0;
    public List i0;
    public List j0;
    public List k0;
    public int l0;
    public List m0;
    public int n0;
    public List o0;
    public List p0;
    public int q0;
    public List r0;
    public List s0;
    public List t0;
    public List u0;
    public List v0;
    public List w0;
    public int x0;
    public int y0;
    public nz5 z0;

    static {
        fy5 fy5Var = new fy5();
        I0 = fy5Var;
        fy5Var.p();
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public fy5(defpackage.iv0 r22, defpackage.r62 r23) {
        /*
            Method dump skipped, instruction units count: 1618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy5.<init>(iv0, r62):void");
    }

    @Override // defpackage.ou4
    public final d2 a() {
        return I0;
    }

    @Override // defpackage.d2
    public final int b() {
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        int i = this.H0;
        if (i != -1) {
            return i;
        }
        int iL = (this.Z & 1) == 1 ? nv0.l(1, this.f0) : 0;
        int i2 = 0;
        int iM = 0;
        while (true) {
            int size = this.k0.size();
            list = this.k0;
            if (i2 >= size) {
                break;
            }
            iM += nv0.m(((Integer) list.get(i2)).intValue());
            i2++;
        }
        int iN = iL + iM;
        if (!list.isEmpty()) {
            iN = iN + 1 + nv0.m(iM);
        }
        this.l0 = iM;
        if ((this.Z & 2) == 2) {
            iN += nv0.l(3, this.g0);
        }
        if ((this.Z & 4) == 4) {
            iN += nv0.l(4, this.h0);
        }
        for (int i3 = 0; i3 < this.i0.size(); i3++) {
            iN += nv0.n(5, (d2) this.i0.get(i3));
        }
        for (int i4 = 0; i4 < this.j0.size(); i4++) {
            iN += nv0.n(6, (d2) this.j0.get(i4));
        }
        int i5 = 0;
        int iM2 = 0;
        while (true) {
            int size2 = this.m0.size();
            list2 = this.m0;
            if (i5 >= size2) {
                break;
            }
            iM2 += nv0.m(((Integer) list2.get(i5)).intValue());
            i5++;
        }
        int iN2 = iN + iM2;
        if (!list2.isEmpty()) {
            iN2 = iN2 + 1 + nv0.m(iM2);
        }
        this.n0 = iM2;
        for (int i6 = 0; i6 < this.r0.size(); i6++) {
            iN2 += nv0.n(8, (d2) this.r0.get(i6));
        }
        for (int i7 = 0; i7 < this.s0.size(); i7++) {
            iN2 += nv0.n(9, (d2) this.s0.get(i7));
        }
        for (int i8 = 0; i8 < this.t0.size(); i8++) {
            iN2 += nv0.n(10, (d2) this.t0.get(i8));
        }
        for (int i9 = 0; i9 < this.u0.size(); i9++) {
            iN2 += nv0.n(11, (d2) this.u0.get(i9));
        }
        for (int i10 = 0; i10 < this.v0.size(); i10++) {
            iN2 += nv0.n(13, (d2) this.v0.get(i10));
        }
        int i11 = 0;
        int iM3 = 0;
        while (true) {
            int size3 = this.w0.size();
            list3 = this.w0;
            if (i11 >= size3) {
                break;
            }
            iM3 += nv0.m(((Integer) list3.get(i11)).intValue());
            i11++;
        }
        int iN3 = iN2 + iM3;
        if (!list3.isEmpty()) {
            iN3 = iN3 + 2 + nv0.m(iM3);
        }
        this.x0 = iM3;
        if ((this.Z & 8) == 8) {
            iN3 += nv0.l(17, this.y0);
        }
        if ((this.Z & 16) == 16) {
            iN3 += nv0.n(18, this.z0);
        }
        if ((this.Z & 32) == 32) {
            iN3 += nv0.l(19, this.A0);
        }
        for (int i12 = 0; i12 < this.o0.size(); i12++) {
            iN3 += nv0.n(20, (d2) this.o0.get(i12));
        }
        int i13 = 0;
        int iM4 = 0;
        while (true) {
            int size4 = this.p0.size();
            list4 = this.p0;
            if (i13 >= size4) {
                break;
            }
            iM4 += nv0.m(((Integer) list4.get(i13)).intValue());
            i13++;
        }
        int iN4 = iN3 + iM4;
        if (!list4.isEmpty()) {
            iN4 = iN4 + 2 + nv0.m(iM4);
        }
        this.q0 = iM4;
        for (int i14 = 0; i14 < this.B0.size(); i14++) {
            iN4 += nv0.n(25, (d2) this.B0.get(i14));
        }
        if ((this.Z & 64) == 64) {
            iN4 += nv0.n(30, this.C0);
        }
        int i15 = 0;
        int iM5 = 0;
        while (true) {
            int size5 = this.D0.size();
            list5 = this.D0;
            if (i15 >= size5) {
                break;
            }
            iM5 += nv0.m(((Integer) list5.get(i15)).intValue());
            i15++;
        }
        int size6 = (list5.size() * 2) + iN4 + iM5;
        if ((this.Z & 128) == 128) {
            size6 += nv0.n(32, this.E0);
        }
        for (int i16 = 0; i16 < this.F0.size(); i16++) {
            size6 += nv0.n(33, (d2) this.F0.get(i16));
        }
        int size7 = this.Y.size() + j() + size6;
        this.H0 = size7;
        return size7;
    }

    @Override // defpackage.ou4
    public final boolean d() {
        byte b = this.G0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.Z & 2) != 2) {
            this.G0 = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.i0.size(); i++) {
            if (!((sz5) this.i0.get(i)).d()) {
                this.G0 = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.j0.size(); i2++) {
            if (!((nz5) this.j0.get(i2)).d()) {
                this.G0 = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.o0.size(); i3++) {
            if (!((nz5) this.o0.get(i3)).d()) {
                this.G0 = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.r0.size(); i4++) {
            if (!((iy5) this.r0.get(i4)).d()) {
                this.G0 = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.s0.size(); i5++) {
            if (!((vy5) this.s0.get(i5)).d()) {
                this.G0 = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.t0.size(); i6++) {
            if (!((cz5) this.t0.get(i6)).d()) {
                this.G0 = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.u0.size(); i7++) {
            if (!((pz5) this.u0.get(i7)).d()) {
                this.G0 = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.v0.size(); i8++) {
            if (!((qy5) this.v0.get(i8)).d()) {
                this.G0 = (byte) 0;
                return false;
            }
        }
        if ((this.Z & 16) == 16 && !this.z0.d()) {
            this.G0 = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < this.B0.size(); i9++) {
            if (!((cy5) this.B0.get(i9)).d()) {
                this.G0 = (byte) 0;
                return false;
            }
        }
        if ((this.Z & 64) == 64 && !this.C0.d()) {
            this.G0 = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.F0.size(); i10++) {
            if (!((gy5) this.F0.get(i10)).d()) {
                this.G0 = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.G0 = (byte) 1;
            return true;
        }
        this.G0 = (byte) 0;
        return false;
    }

    @Override // defpackage.d2
    public final up2 e() {
        dy5 dy5VarH = dy5.h();
        dy5VarH.i(this);
        return dy5VarH;
    }

    @Override // defpackage.d2
    public final void f(nv0 nv0Var) throws IOException {
        b();
        mj0 mj0Var = new mj0(this);
        if ((this.Z & 1) == 1) {
            nv0Var.V(1, this.f0);
        }
        if (this.k0.size() > 0) {
            nv0Var.e0(18);
            nv0Var.e0(this.l0);
        }
        for (int i = 0; i < this.k0.size(); i++) {
            nv0Var.W(((Integer) this.k0.get(i)).intValue());
        }
        if ((this.Z & 2) == 2) {
            nv0Var.V(3, this.g0);
        }
        if ((this.Z & 4) == 4) {
            nv0Var.V(4, this.h0);
        }
        for (int i2 = 0; i2 < this.i0.size(); i2++) {
            nv0Var.X(5, (d2) this.i0.get(i2));
        }
        for (int i3 = 0; i3 < this.j0.size(); i3++) {
            nv0Var.X(6, (d2) this.j0.get(i3));
        }
        if (this.m0.size() > 0) {
            nv0Var.e0(58);
            nv0Var.e0(this.n0);
        }
        for (int i4 = 0; i4 < this.m0.size(); i4++) {
            nv0Var.W(((Integer) this.m0.get(i4)).intValue());
        }
        for (int i5 = 0; i5 < this.r0.size(); i5++) {
            nv0Var.X(8, (d2) this.r0.get(i5));
        }
        for (int i6 = 0; i6 < this.s0.size(); i6++) {
            nv0Var.X(9, (d2) this.s0.get(i6));
        }
        for (int i7 = 0; i7 < this.t0.size(); i7++) {
            nv0Var.X(10, (d2) this.t0.get(i7));
        }
        for (int i8 = 0; i8 < this.u0.size(); i8++) {
            nv0Var.X(11, (d2) this.u0.get(i8));
        }
        for (int i9 = 0; i9 < this.v0.size(); i9++) {
            nv0Var.X(13, (d2) this.v0.get(i9));
        }
        if (this.w0.size() > 0) {
            nv0Var.e0(130);
            nv0Var.e0(this.x0);
        }
        for (int i10 = 0; i10 < this.w0.size(); i10++) {
            nv0Var.W(((Integer) this.w0.get(i10)).intValue());
        }
        if ((this.Z & 8) == 8) {
            nv0Var.V(17, this.y0);
        }
        if ((this.Z & 16) == 16) {
            nv0Var.X(18, this.z0);
        }
        if ((this.Z & 32) == 32) {
            nv0Var.V(19, this.A0);
        }
        for (int i11 = 0; i11 < this.o0.size(); i11++) {
            nv0Var.X(20, (d2) this.o0.get(i11));
        }
        if (this.p0.size() > 0) {
            nv0Var.e0(170);
            nv0Var.e0(this.q0);
        }
        for (int i12 = 0; i12 < this.p0.size(); i12++) {
            nv0Var.W(((Integer) this.p0.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.B0.size(); i13++) {
            nv0Var.X(25, (d2) this.B0.get(i13));
        }
        if ((this.Z & 64) == 64) {
            nv0Var.X(30, this.C0);
        }
        for (int i14 = 0; i14 < this.D0.size(); i14++) {
            nv0Var.V(31, ((Integer) this.D0.get(i14)).intValue());
        }
        if ((this.Z & 128) == 128) {
            nv0Var.X(32, this.E0);
        }
        for (int i15 = 0; i15 < this.F0.size(); i15++) {
            nv0Var.X(33, (d2) this.F0.get(i15));
        }
        mj0Var.b0(19000, nv0Var);
        nv0Var.a0(this.Y);
    }

    public final void p() {
        this.f0 = 6;
        this.g0 = 0;
        this.h0 = 0;
        List list = Collections.EMPTY_LIST;
        this.i0 = list;
        this.j0 = list;
        this.k0 = list;
        this.m0 = list;
        this.o0 = list;
        this.p0 = list;
        this.r0 = list;
        this.s0 = list;
        this.t0 = list;
        this.u0 = list;
        this.v0 = list;
        this.w0 = list;
        this.y0 = 0;
        this.z0 = nz5.w0;
        this.A0 = 0;
        this.B0 = list;
        this.C0 = tz5.i0;
        this.D0 = list;
        this.E0 = a06.g0;
        this.F0 = list;
    }

    public fy5() {
        this.l0 = -1;
        this.n0 = -1;
        this.q0 = -1;
        this.x0 = -1;
        this.G0 = (byte) -1;
        this.H0 = -1;
        this.Y = jb0.X;
    }

    public fy5(dy5 dy5Var) {
        super(dy5Var);
        this.l0 = -1;
        this.n0 = -1;
        this.q0 = -1;
        this.x0 = -1;
        this.G0 = (byte) -1;
        this.H0 = -1;
        this.Y = dy5Var.X;
    }
}

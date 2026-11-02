package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lh3 implements zr4, ug3 {
    public final /* synthetic */ ug3 X;
    public final z24 Y;

    public lh3(ug3 ug3Var, z24 z24Var) {
        this.X = ug3Var;
        this.Y = z24Var;
    }

    @Override // defpackage.fi1
    public final float A(long j) {
        return this.X.A(j);
    }

    @Override // defpackage.fi1
    public final long D0(long j) {
        return this.X.D0(j);
    }

    @Override // defpackage.fi1
    public final float G0(long j) {
        return this.X.G0(j);
    }

    @Override // defpackage.fi1
    public final long M(float f) {
        return this.X.M(f);
    }

    @Override // defpackage.fi1
    public final float R(int i) {
        return this.X.R(i);
    }

    @Override // defpackage.fi1
    public final float W(float f) {
        return this.X.W(f);
    }

    @Override // defpackage.fi1
    public final float b0() {
        return this.X.b0();
    }

    @Override // defpackage.ug3
    public final boolean c0() {
        return this.X.c0();
    }

    @Override // defpackage.fi1
    public final float getDensity() {
        return this.X.getDensity();
    }

    @Override // defpackage.ug3
    public final z24 getLayoutDirection() {
        return this.Y;
    }

    @Override // defpackage.fi1
    public final float h0(float f) {
        return this.X.h0(f);
    }

    @Override // defpackage.fi1
    public final long q(float f) {
        return this.X.q(f);
    }

    @Override // defpackage.fi1
    public final long r(long j) {
        return this.X.r(j);
    }

    @Override // defpackage.zr4
    public final yr4 u(int i, int i2, Map map, gn2 gn2Var, gn2 gn2Var2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            wc3.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new kh3(i, i2, map, gn2Var);
    }

    @Override // defpackage.fi1
    public final int x0(float f) {
        return this.X.x0(f);
    }
}

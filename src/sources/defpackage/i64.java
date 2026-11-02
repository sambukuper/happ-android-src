package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i64 implements zr4 {
    public final f64 X;
    public final wp7 Y;
    public final z64 Z;
    public final vz4 f0;

    public i64(f64 f64Var, wp7 wp7Var) {
        this.X = f64Var;
        this.Y = wp7Var;
        this.Z = (z64) f64Var.b.invoke();
        gf3.a();
        this.f0 = new vz4();
    }

    @Override // defpackage.fi1
    public final float A(long j) {
        return this.Y.A(j);
    }

    @Override // defpackage.fi1
    public final long D0(long j) {
        return this.Y.D0(j);
    }

    @Override // defpackage.fi1
    public final float G0(long j) {
        return this.Y.G0(j);
    }

    @Override // defpackage.fi1
    public final long M(float f) {
        return this.Y.M(f);
    }

    @Override // defpackage.fi1
    public final float R(int i) {
        return this.Y.R(i);
    }

    @Override // defpackage.fi1
    public final float W(float f) {
        return this.Y.W(f);
    }

    @Override // defpackage.fi1
    public final float b0() {
        return this.Y.b0();
    }

    @Override // defpackage.ug3
    public final boolean c0() {
        return this.Y.c0();
    }

    @Override // defpackage.zr4
    public final yr4 g0(int i, int i2, Map map, gn2 gn2Var) {
        return this.Y.g0(i, i2, map, gn2Var);
    }

    @Override // defpackage.fi1
    public final float getDensity() {
        return this.Y.getDensity();
    }

    @Override // defpackage.ug3
    public final z24 getLayoutDirection() {
        return this.Y.getLayoutDirection();
    }

    @Override // defpackage.fi1
    public final float h0(float f) {
        return this.Y.h0(f);
    }

    @Override // defpackage.fi1
    public final long q(float f) {
        return this.Y.q(f);
    }

    @Override // defpackage.fi1
    public final long r(long j) {
        return this.Y.r(j);
    }

    @Override // defpackage.zr4
    public final yr4 u(int i, int i2, Map map, gn2 gn2Var, gn2 gn2Var2) {
        return this.Y.u(i, i2, map, gn2Var, gn2Var2);
    }

    @Override // defpackage.fi1
    public final int x0(float f) {
        return this.Y.x0(f);
    }
}

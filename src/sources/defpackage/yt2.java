package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lyt2;", "Lqx4;", "Lr97;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class yt2 extends qx4 {
    public final float X;
    public final float Y;
    public final float Z;
    public final float f0;
    public final float g0;
    public final float h0;
    public final float i0;
    public final float j0;
    public final float k0;
    public final float l0;
    public final long m0;
    public final x67 n0;
    public final boolean o0;
    public final o60 p0;
    public final long q0;
    public final long r0;
    public final int s0;
    public final int t0;
    public final g60 u0;
    public final u24 v0;

    public yt2(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, x67 x67Var, boolean z, o60 o60Var, long j2, long j3, int i, int i2, g60 g60Var, u24 u24Var) {
        this.X = f;
        this.Y = f2;
        this.Z = f3;
        this.f0 = f4;
        this.g0 = f5;
        this.h0 = f6;
        this.i0 = f7;
        this.j0 = f8;
        this.k0 = f9;
        this.l0 = f10;
        this.m0 = j;
        this.n0 = x67Var;
        this.o0 = z;
        this.p0 = o60Var;
        this.q0 = j2;
        this.r0 = j3;
        this.s0 = i;
        this.t0 = i2;
        this.u0 = g60Var;
        this.v0 = u24Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        r97 r97Var = new r97();
        r97Var.q0 = this.X;
        r97Var.r0 = this.Y;
        r97Var.s0 = this.Z;
        r97Var.t0 = this.f0;
        r97Var.u0 = this.g0;
        r97Var.v0 = this.h0;
        r97Var.w0 = this.i0;
        r97Var.x0 = this.j0;
        r97Var.y0 = this.k0;
        r97Var.z0 = this.l0;
        r97Var.A0 = this.m0;
        r97Var.B0 = this.n0;
        r97Var.C0 = this.o0;
        r97Var.D0 = this.p0;
        r97Var.E0 = this.q0;
        r97Var.F0 = this.r0;
        r97Var.G0 = this.s0;
        r97Var.H0 = this.t0;
        r97Var.I0 = this.u0;
        r97Var.J0 = this.v0;
        r97Var.K0 = new t16(r97Var, (byte) 19);
        return r97Var;
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        i55 i55Var;
        r97 r97Var = (r97) jx4Var;
        r97Var.q0 = this.X;
        r97Var.r0 = this.Y;
        r97Var.s0 = this.Z;
        r97Var.t0 = this.f0;
        r97Var.u0 = this.g0;
        r97Var.v0 = this.h0;
        r97Var.w0 = this.i0;
        r97Var.x0 = this.j0;
        r97Var.y0 = this.k0;
        r97Var.z0 = this.l0;
        r97Var.A0 = this.m0;
        r97Var.B0 = this.n0;
        r97Var.C0 = this.o0;
        r97Var.D0 = this.p0;
        r97Var.E0 = this.q0;
        r97Var.F0 = this.r0;
        r97Var.G0 = this.s0;
        r97Var.H0 = this.t0;
        r97Var.I0 = this.u0;
        r97Var.J0 = this.v0;
        t16 t16Var = r97Var.K0;
        if (r97Var.X.p0 && (i55Var = yn0.X(r97Var, 2).x0) != null) {
            i55Var.t1(t16Var, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt2)) {
            return false;
        }
        yt2 yt2Var = (yt2) obj;
        if (Float.compare(this.X, yt2Var.X) != 0 || Float.compare(this.Y, yt2Var.Y) != 0 || Float.compare(this.Z, yt2Var.Z) != 0 || Float.compare(this.f0, yt2Var.f0) != 0 || Float.compare(this.g0, yt2Var.g0) != 0 || Float.compare(this.h0, yt2Var.h0) != 0 || Float.compare(this.i0, yt2Var.i0) != 0 || Float.compare(this.j0, yt2Var.j0) != 0 || Float.compare(this.k0, yt2Var.k0) != 0 || Float.compare(this.l0, yt2Var.l0) != 0 || !gd8.a(this.m0, yt2Var.m0) || !dh3.f(this.n0, yt2Var.n0) || this.o0 != yt2Var.o0 || !dh3.f(this.p0, yt2Var.p0)) {
            return false;
        }
        long j = yt2Var.q0;
        int i = dw0.h;
        return tk8.a(this.q0, j) && tk8.a(this.r0, yt2Var.r0) && this.s0 == yt2Var.s0 && this.t0 == yt2Var.t0 && dh3.f(this.u0, yt2Var.u0) && dh3.f(this.v0, yt2Var.v0);
    }

    public final int hashCode() {
        int iD = pc6.d(pc6.d(pc6.d(pc6.d(pc6.d(pc6.d(pc6.d(pc6.d(pc6.d(Float.hashCode(this.X) * 31, this.Y, 31), this.Z, 31), this.f0, 31), this.g0, 31), this.h0, 31), this.i0, 31), this.j0, 31), this.k0, 31), this.l0, 31);
        int i = gd8.c;
        int iF = pc6.f((this.n0.hashCode() + p61.g(iD, this.m0, 31)) * 31, 31, this.o0);
        o60 o60Var = this.p0;
        int iHashCode = (iF + (o60Var == null ? 0 : o60Var.hashCode())) * 31;
        int i2 = dw0.h;
        int iE = oi0.e(this.t0, oi0.e(this.s0, p61.g(p61.g(iHashCode, this.q0, 31), this.r0, 31), 31), 31);
        g60 g60Var = this.u0;
        return this.v0.hashCode() + ((iE + (g60Var != null ? g60Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String strB = gd8.b(this.m0);
        String strH = dw0.h(this.q0);
        String strH2 = dw0.h(this.r0);
        String strH3 = ie2.h("CompositingStrategy(value=", this.s0, ")");
        String strF = oc.F(this.t0);
        StringBuilder sbK = ie2.k("GraphicsLayerElement(scaleX=", this.X, ", scaleY=", this.Y, ", alpha=");
        sbK.append(this.Z);
        sbK.append(", translationX=");
        sbK.append(this.f0);
        sbK.append(", translationY=");
        sbK.append(this.g0);
        sbK.append(", shadowElevation=");
        sbK.append(this.h0);
        sbK.append(", rotationX=");
        sbK.append(this.i0);
        sbK.append(", rotationY=");
        sbK.append(this.j0);
        sbK.append(", rotationZ=");
        sbK.append(this.k0);
        sbK.append(", cameraDistance=");
        sbK.append(this.l0);
        sbK.append(", transformOrigin=");
        sbK.append(strB);
        sbK.append(", shape=");
        sbK.append(this.n0);
        sbK.append(", clip=");
        sbK.append(this.o0);
        sbK.append(", renderEffect=");
        sbK.append(this.p0);
        sbK.append(", ambientShadowColor=");
        oi0.y(sbK, strH, ", spotShadowColor=", strH2, ", compositingStrategy=");
        oi0.y(sbK, strH3, ", blendMode=", strF, ", colorFilter=");
        sbK.append(this.u0);
        sbK.append(", outsets=");
        sbK.append(this.v0);
        sbK.append(")");
        return sbK.toString();
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r97 extends jx4 implements g34, w07 {
    public long A0;
    public x67 B0;
    public boolean C0;
    public o60 D0;
    public long E0;
    public long F0;
    public int G0;
    public int H0;
    public g60 I0;
    public u24 J0;
    public t16 K0;
    public float q0;
    public float r0;
    public float s0;
    public float t0;
    public float u0;
    public float v0;
    public float w0;
    public float x0;
    public float y0;
    public float z0;

    @Override // defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        eo5 eo5VarO = tr4Var.o(j);
        return zr4Var.g0(eo5VarO.X, eo5VarO.Y, e02.X, new gq6(eo5VarO, this, (byte) 3));
    }

    @Override // defpackage.jx4
    public final boolean N0() {
        return false;
    }

    @Override // defpackage.w07
    public final void h(f17 f17Var) {
        if (this.C0) {
            d17.e(f17Var, this.B0);
        }
    }

    @Override // defpackage.w07
    public final boolean k() {
        return false;
    }

    public final String toString() {
        float f = this.q0;
        float f2 = this.r0;
        float f3 = this.s0;
        float f4 = this.t0;
        float f5 = this.u0;
        float f6 = this.v0;
        float f7 = this.w0;
        float f8 = this.x0;
        float f9 = this.y0;
        float f10 = this.z0;
        String strB = gd8.b(this.A0);
        x67 x67Var = this.B0;
        boolean z = this.C0;
        o60 o60Var = this.D0;
        String strH = dw0.h(this.E0);
        String strH2 = dw0.h(this.F0);
        String strH3 = ie2.h("CompositingStrategy(value=", this.G0, ")");
        String strF = oc.F(this.H0);
        g60 g60Var = this.I0;
        u24 u24Var = this.J0;
        StringBuilder sbK = ie2.k("SimpleGraphicsLayerModifier(scaleX=", f, ", scaleY=", f2, ", alpha = ");
        sbK.append(f3);
        sbK.append(", translationX=");
        sbK.append(f4);
        sbK.append(", translationY=");
        sbK.append(f5);
        sbK.append(", shadowElevation=");
        sbK.append(f6);
        sbK.append(", rotationX=");
        sbK.append(f7);
        sbK.append(", rotationY=");
        sbK.append(f8);
        sbK.append(", rotationZ=");
        sbK.append(f9);
        sbK.append(", cameraDistance=");
        sbK.append(f10);
        sbK.append(", transformOrigin=");
        sbK.append(strB);
        sbK.append(", shape=");
        sbK.append(x67Var);
        sbK.append(", clip=");
        sbK.append(z);
        sbK.append(", renderEffect=");
        sbK.append(o60Var);
        sbK.append(", ambientShadowColor=");
        oi0.y(sbK, strH, ", spotShadowColor=", strH2, ", compositingStrategy=");
        oi0.y(sbK, strH3, ", blendMode=", strF, ", colorFilter=");
        sbK.append(g60Var);
        sbK.append("outsets=");
        sbK.append(u24Var);
        sbK.append(")");
        return sbK.toString();
    }
}

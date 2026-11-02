package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lu67;", "Lqx4;", "Lj60;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class u67 extends qx4 {
    public final float X;
    public final jm6 Y;
    public final boolean Z;
    public final long f0;
    public final long g0;

    public u67(float f, jm6 jm6Var, boolean z, long j, long j2) {
        this.X = f;
        this.Y = jm6Var;
        this.Z = z;
        this.f0 = j;
        this.g0 = j2;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new j60(new t16(this, (byte) 18));
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        i55 i55Var;
        j60 j60Var = (j60) jx4Var;
        t16 t16Var = new t16(this, (byte) 18);
        j60Var.q0 = t16Var;
        if (j60Var.X.p0 && (i55Var = yn0.X(j60Var, 2).x0) != null) {
            i55Var.t1(t16Var, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u67)) {
            return false;
        }
        u67 u67Var = (u67) obj;
        if (!kt1.b(this.X, u67Var.X) || !this.Y.equals(u67Var.Y) || this.Z != u67Var.Z) {
            return false;
        }
        long j = u67Var.f0;
        int i = dw0.h;
        return tk8.a(this.f0, j) && tk8.a(this.g0, u67Var.g0);
    }

    public final int hashCode() {
        int iF = pc6.f((this.Y.hashCode() + (Float.hashCode(this.X) * 31)) * 31, 31, this.Z);
        int i = dw0.h;
        return Long.hashCode(this.g0) + p61.g(iF, this.f0, 31);
    }

    public final String toString() {
        String strC = kt1.c(this.X);
        String strH = dw0.h(this.f0);
        String strH2 = dw0.h(this.g0);
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append(strC);
        sb.append(", shape=");
        sb.append(this.Y);
        sb.append(", clip=");
        sb.append(this.Z);
        sb.append(", ambientColor=");
        sb.append(strH);
        sb.append(", spotColor=");
        return oi0.p(sb, strH2, ")");
    }
}

package defpackage;

import coil3.compose.AsyncImagePainter;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv41;", "Lqx4;", "Lw41;", "io.coil-kt.coil3_coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v41 extends qx4 {
    public final v63 X;
    public final v76 Y;
    public final xu Z;
    public final gn2 f0;
    public final q8 g0;
    public final z41 h0;
    public final ev i0;
    public final String j0;

    public v41(v63 v63Var, v76 v76Var, xu xuVar, gn2 gn2Var, q8 q8Var, z41 z41Var, ev evVar, String str) {
        this.X = v63Var;
        this.Y = v76Var;
        this.Z = xuVar;
        this.f0 = gn2Var;
        this.g0 = q8Var;
        this.h0 = z41Var;
        this.i0 = evVar;
        this.j0 = str;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        xu xuVar = this.Z;
        v63 v63Var = this.X;
        yu yuVar = new yu(xuVar, v63Var, this.Y);
        AsyncImagePainter asyncImagePainter = new AsyncImagePainter(yuVar);
        asyncImagePainter.o0 = this.f0;
        asyncImagePainter.p0 = this.h0;
        asyncImagePainter.q0 = this.i0;
        asyncImagePainter.l(yuVar);
        ab7 ab7Var = v63Var.o;
        return new w41(asyncImagePainter, this.g0, this.h0, this.j0, ab7Var instanceof u31 ? (u31) ab7Var : null);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        w41 w41Var = (w41) jx4Var;
        long jH = w41Var.w0.getR0();
        u31 u31Var = w41Var.v0;
        xu xuVar = this.Z;
        v63 v63Var = this.X;
        yu yuVar = new yu(xuVar, v63Var, this.Y);
        AsyncImagePainter asyncImagePainter = w41Var.w0;
        asyncImagePainter.o0 = this.f0;
        z41 z41Var = this.h0;
        asyncImagePainter.p0 = z41Var;
        asyncImagePainter.q0 = this.i0;
        asyncImagePainter.l(yuVar);
        boolean zA = ua7.a(jH, asyncImagePainter.getR0());
        w41Var.q0 = this.g0;
        ab7 ab7Var = v63Var.o;
        w41Var.v0 = ab7Var instanceof u31 ? (u31) ab7Var : null;
        w41Var.r0 = z41Var;
        w41Var.s0 = 1.0f;
        w41Var.t0 = true;
        String str = w41Var.u0;
        String str2 = this.j0;
        if (!dh3.f(str, str2)) {
            w41Var.u0 = str2;
            ch3.I(w41Var);
        }
        boolean zF = dh3.f(u31Var, w41Var.v0);
        if (!zA || !zF) {
            nr4.E(w41Var);
        }
        z68.W(w41Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v41) {
            v41 v41Var = (v41) obj;
            if (this.X.equals(v41Var.X) && this.Y == v41Var.Y && dh3.f(this.Z, v41Var.Z) && dh3.f(this.f0, v41Var.f0) && dh3.f(this.g0, v41Var.g0) && dh3.f(this.h0, v41Var.h0) && Float.compare(1.0f, 1.0f) == 0 && dh3.f(this.i0, v41Var.i0) && dh3.f(this.j0, v41Var.j0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iF = pc6.f(pc6.d((this.h0.hashCode() + ((this.g0.hashCode() + oi0.e(1, (this.f0.hashCode() + ((this.Z.hashCode() + ((this.Y.hashCode() + (this.X.hashCode() * 31)) * 31)) * 31)) * 961, 31)) * 31)) * 31, 1.0f, 961), 31, true);
        ev evVar = this.i0;
        int iHashCode = (iF + (evVar == null ? 0 : evVar.hashCode())) * 31;
        String str = this.j0;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ContentPainterElement(request=" + this.X + ", imageLoader=" + this.Y + ", modelEqualityDelegate=" + this.Z + ", transform=" + this.f0 + ", onState=null, filterQuality=Low, alignment=" + this.g0 + ", contentScale=" + this.h0 + ", alpha=1.0, colorFilter=null, clipToBounds=true, previewHandler=" + this.i0 + ", contentDescription=" + this.j0 + ")";
    }
}

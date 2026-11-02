package androidx.compose.foundation.text.modifiers;

import defpackage.ch3;
import defpackage.dh3;
import defpackage.ez4;
import defpackage.fi2;
import defpackage.fw0;
import defpackage.gn2;
import defpackage.jx4;
import defpackage.mx;
import defpackage.nr4;
import defpackage.o88;
import defpackage.oi0;
import defpackage.pc6;
import defpackage.ql;
import defpackage.qx4;
import defpackage.t28;
import defpackage.z68;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Lqx4;", "Lt28;", "Lfw0;", "color", "Lfw0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextAnnotatedStringElement extends qx4 {
    public final ql X;
    public final o88 Y;
    public final fi2 Z;
    private final fw0 color = null;
    public final gn2 f0;
    public final int g0;
    public final boolean h0;
    public final int i0;
    public final int j0;
    public final List k0;
    public final gn2 l0;
    public final mx m0;
    public final gn2 n0;

    public TextAnnotatedStringElement(ql qlVar, o88 o88Var, fi2 fi2Var, gn2 gn2Var, int i, boolean z, int i2, int i3, List list, gn2 gn2Var2, mx mxVar, gn2 gn2Var3) {
        this.X = qlVar;
        this.Y = o88Var;
        this.Z = fi2Var;
        this.f0 = gn2Var;
        this.g0 = i;
        this.h0 = z;
        this.i0 = i2;
        this.j0 = i3;
        this.k0 = list;
        this.l0 = gn2Var2;
        this.m0 = mxVar;
        this.n0 = gn2Var3;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        fw0 fw0Var = this.color;
        t28 t28Var = new t28();
        t28Var.q0 = this.X;
        t28Var.r0 = this.Y;
        t28Var.s0 = this.Z;
        t28Var.t0 = this.f0;
        t28Var.u0 = this.g0;
        t28Var.v0 = this.h0;
        t28Var.w0 = this.i0;
        t28Var.x0 = this.j0;
        t28Var.y0 = this.k0;
        t28Var.z0 = this.l0;
        t28Var.A0 = fw0Var;
        t28Var.B0 = this.m0;
        t28Var.C0 = this.n0;
        return t28Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        boolean z;
        t28 t28Var = (t28) jx4Var;
        fw0 fw0Var = this.color;
        boolean zF = dh3.f(fw0Var, t28Var.A0);
        t28Var.A0 = fw0Var;
        boolean z2 = false;
        boolean z3 = true;
        o88 o88Var = this.Y;
        if (zF) {
            o88 o88Var2 = t28Var.r0;
            if (o88Var == o88Var2) {
                o88Var.getClass();
            } else if (!o88Var.a.b(o88Var2.a)) {
                z = true;
            }
            z = false;
        } else {
            z = true;
        }
        String str = t28Var.q0.Y;
        ql qlVar = this.X;
        boolean zF2 = dh3.f(str, qlVar.Y);
        boolean z4 = (zF2 && dh3.f(t28Var.q0.X, qlVar.X)) ? false : true;
        if (z4) {
            t28Var.q0 = qlVar;
        }
        if (!zF2) {
            t28Var.G0 = null;
        }
        boolean z5 = !t28Var.r0.c(o88Var);
        t28Var.r0 = o88Var;
        List list = t28Var.y0;
        List list2 = this.k0;
        if (!dh3.f(list, list2)) {
            t28Var.y0 = list2;
            z5 = true;
        }
        int i = t28Var.x0;
        int i2 = this.j0;
        if (i != i2) {
            t28Var.x0 = i2;
            z5 = true;
        }
        int i3 = t28Var.w0;
        int i4 = this.i0;
        if (i3 != i4) {
            t28Var.w0 = i4;
            z5 = true;
        }
        boolean z6 = t28Var.v0;
        boolean z7 = this.h0;
        if (z6 != z7) {
            t28Var.v0 = z7;
            z5 = true;
        }
        fi2 fi2Var = t28Var.s0;
        fi2 fi2Var2 = this.Z;
        if (!dh3.f(fi2Var, fi2Var2)) {
            t28Var.s0 = fi2Var2;
            z5 = true;
        }
        int i5 = t28Var.u0;
        int i6 = this.g0;
        if (i5 != i6) {
            t28Var.u0 = i6;
            z5 = true;
        }
        mx mxVar = t28Var.B0;
        mx mxVar2 = this.m0;
        if (!dh3.f(mxVar, mxVar2)) {
            t28Var.B0 = mxVar2;
            z5 = true;
        }
        gn2 gn2Var = t28Var.t0;
        gn2 gn2Var2 = this.f0;
        if (gn2Var != gn2Var2) {
            t28Var.t0 = gn2Var2;
            z2 = true;
        }
        gn2 gn2Var3 = t28Var.z0;
        gn2 gn2Var4 = this.l0;
        if (gn2Var3 != gn2Var4) {
            t28Var.z0 = gn2Var4;
            z2 = true;
        }
        gn2 gn2Var5 = t28Var.C0;
        gn2 gn2Var6 = this.n0;
        if (gn2Var5 != gn2Var6) {
            t28Var.C0 = gn2Var6;
        } else {
            z3 = z2;
        }
        if (z4 || z5 || z3) {
            ez4 ez4VarY0 = t28Var.Y0();
            ql qlVar2 = t28Var.q0;
            o88 o88Var3 = t28Var.r0;
            fi2 fi2Var3 = t28Var.s0;
            int i7 = t28Var.u0;
            boolean z8 = t28Var.v0;
            int i8 = t28Var.w0;
            int i9 = t28Var.x0;
            List list3 = t28Var.y0;
            mx mxVar3 = t28Var.B0;
            ez4VarY0.a = qlVar2;
            ez4VarY0.f(o88Var3);
            ez4VarY0.b = fi2Var3;
            ez4VarY0.c = i7;
            ez4VarY0.d = z8;
            ez4VarY0.e = i8;
            ez4VarY0.f = i9;
            ez4VarY0.g = list3;
            ez4VarY0.h = mxVar3;
            ez4VarY0.s = (ez4VarY0.s << 2) | 2;
            ez4VarY0.m = null;
            ez4VarY0.o = null;
            ez4VarY0.q = -1;
            ez4VarY0.p = -1;
            ez4VarY0.r = null;
        }
        if (t28Var.p0) {
            if (z4 || (z && t28Var.F0 != null)) {
                ch3.I(t28Var);
            }
            if (z4 || z5 || z3) {
                nr4.E(t28Var);
                z68.W(t28Var);
            }
            if (z) {
                z68.W(t28Var);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return dh3.f(this.color, textAnnotatedStringElement.color) && dh3.f(this.X, textAnnotatedStringElement.X) && dh3.f(this.Y, textAnnotatedStringElement.Y) && dh3.f(this.k0, textAnnotatedStringElement.k0) && dh3.f(this.Z, textAnnotatedStringElement.Z) && this.f0 == textAnnotatedStringElement.f0 && this.n0 == textAnnotatedStringElement.n0 && this.g0 == textAnnotatedStringElement.g0 && this.h0 == textAnnotatedStringElement.h0 && this.i0 == textAnnotatedStringElement.i0 && this.j0 == textAnnotatedStringElement.j0 && this.l0 == textAnnotatedStringElement.l0;
    }

    public final int hashCode() {
        int iHashCode = (this.Z.hashCode() + pc6.g(this.Y, this.X.hashCode() * 31, 31)) * 31;
        gn2 gn2Var = this.f0;
        int iF = (((pc6.f(oi0.e(this.g0, (iHashCode + (gn2Var != null ? gn2Var.hashCode() : 0)) * 31, 31), 31, this.h0) + this.i0) * 31) + this.j0) * 31;
        List list = this.k0;
        int iHashCode2 = (iF + (list != null ? list.hashCode() : 0)) * 31;
        gn2 gn2Var2 = this.l0;
        int iHashCode3 = (iHashCode2 + (gn2Var2 != null ? gn2Var2.hashCode() : 0)) * 961;
        fw0 fw0Var = this.color;
        int iHashCode4 = (iHashCode3 + (fw0Var != null ? fw0Var.hashCode() : 0)) * 31;
        gn2 gn2Var3 = this.n0;
        return iHashCode4 + (gn2Var3 != null ? gn2Var3.hashCode() : 0);
    }
}

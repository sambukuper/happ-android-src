package androidx.compose.foundation.text.modifiers;

import defpackage.ch3;
import defpackage.dh3;
import defpackage.fi2;
import defpackage.fw0;
import defpackage.jx4;
import defpackage.l88;
import defpackage.nr4;
import defpackage.o88;
import defpackage.oi0;
import defpackage.pc6;
import defpackage.qx4;
import defpackage.wg5;
import defpackage.z68;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Lqx4;", "Ll88;", "Lfw0;", "color", "Lfw0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextStringSimpleElement extends qx4 {
    public final String X;
    public final o88 Y;
    public final fi2 Z;
    private final fw0 color = null;
    public final int f0;
    public final boolean g0;
    public final int h0;
    public final int i0;

    public TextStringSimpleElement(String str, o88 o88Var, fi2 fi2Var, int i, boolean z, int i2, int i3) {
        this.X = str;
        this.Y = o88Var;
        this.Z = fi2Var;
        this.f0 = i;
        this.g0 = z;
        this.h0 = i2;
        this.i0 = i3;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        fw0 fw0Var = this.color;
        l88 l88Var = new l88();
        l88Var.q0 = this.X;
        l88Var.r0 = this.Y;
        l88Var.s0 = this.Z;
        l88Var.t0 = this.f0;
        l88Var.u0 = this.g0;
        l88Var.v0 = this.h0;
        l88Var.w0 = this.i0;
        l88Var.x0 = fw0Var;
        return l88Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        boolean z;
        l88 l88Var = (l88) jx4Var;
        fw0 fw0Var = this.color;
        boolean zF = dh3.f(fw0Var, l88Var.x0);
        l88Var.x0 = fw0Var;
        boolean z2 = false;
        boolean z3 = true;
        o88 o88Var = this.Y;
        if (zF) {
            o88 o88Var2 = l88Var.r0;
            if (o88Var == o88Var2) {
                o88Var.getClass();
            } else if (!o88Var.a.b(o88Var2.a)) {
                z = true;
            }
            z = false;
        } else {
            z = true;
        }
        String str = l88Var.q0;
        String str2 = this.X;
        if (!dh3.f(str, str2)) {
            l88Var.q0 = str2;
            l88Var.B0 = null;
            z2 = true;
        }
        boolean z4 = !l88Var.r0.c(o88Var);
        l88Var.r0 = o88Var;
        int i = l88Var.w0;
        int i2 = this.i0;
        if (i != i2) {
            l88Var.w0 = i2;
            z4 = true;
        }
        int i3 = l88Var.v0;
        int i4 = this.h0;
        if (i3 != i4) {
            l88Var.v0 = i4;
            z4 = true;
        }
        boolean z5 = l88Var.u0;
        boolean z6 = this.g0;
        if (z5 != z6) {
            l88Var.u0 = z6;
            z4 = true;
        }
        fi2 fi2Var = l88Var.s0;
        fi2 fi2Var2 = this.Z;
        if (!dh3.f(fi2Var, fi2Var2)) {
            l88Var.s0 = fi2Var2;
            z4 = true;
        }
        int i5 = l88Var.t0;
        int i6 = this.f0;
        if (i5 == i6) {
            z3 = z4;
        } else {
            l88Var.t0 = i6;
        }
        if (z2 || z3) {
            wg5 wg5VarY0 = l88Var.Y0();
            String str3 = l88Var.q0;
            o88 o88Var3 = l88Var.r0;
            fi2 fi2Var3 = l88Var.s0;
            int i7 = l88Var.t0;
            boolean z7 = l88Var.u0;
            int i8 = l88Var.v0;
            int i9 = l88Var.w0;
            wg5VarY0.a = str3;
            wg5VarY0.b = o88Var3;
            wg5VarY0.c = fi2Var3;
            wg5VarY0.d = i7;
            wg5VarY0.e = z7;
            wg5VarY0.f = i8;
            wg5VarY0.g = i9;
            wg5VarY0.s = (wg5VarY0.s << 2) | 2;
            wg5VarY0.c();
        }
        if (l88Var.p0) {
            if (z2 || (z && l88Var.A0 != null)) {
                ch3.I(l88Var);
            }
            if (z2 || z3) {
                nr4.E(l88Var);
                z68.W(l88Var);
            }
            if (z) {
                z68.W(l88Var);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return dh3.f(this.color, textStringSimpleElement.color) && dh3.f(this.X, textStringSimpleElement.X) && dh3.f(this.Y, textStringSimpleElement.Y) && dh3.f(this.Z, textStringSimpleElement.Z) && this.f0 == textStringSimpleElement.f0 && this.g0 == textStringSimpleElement.g0 && this.h0 == textStringSimpleElement.h0 && this.i0 == textStringSimpleElement.i0;
    }

    public final int hashCode() {
        int iF = (((pc6.f(oi0.e(this.f0, (this.Z.hashCode() + pc6.g(this.Y, this.X.hashCode() * 31, 31)) * 31, 31), 31, this.g0) + this.h0) * 31) + this.i0) * 31;
        fw0 fw0Var = this.color;
        return iF + (fw0Var != null ? fw0Var.hashCode() : 0);
    }
}

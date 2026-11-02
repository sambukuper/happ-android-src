package androidx.compose.ui.graphics.painter;

import defpackage.bt;
import defpackage.dh3;
import defpackage.g60;
import defpackage.hf3;
import defpackage.je;
import defpackage.og5;
import defpackage.oi0;
import defpackage.p61;
import defpackage.pf3;
import defpackage.sv1;
import defpackage.u15;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Log5;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BitmapPainter extends og5 {
    public final je h0;
    public final long i0;
    public boolean j0 = true;
    public final long k0;
    public float l0;
    public g60 m0;

    public BitmapPainter(je jeVar, long j) {
        int i;
        this.h0 = jeVar;
        this.i0 = j;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > jeVar.a.getWidth() || i > jeVar.a.getHeight()) {
            bt.q("Failed requirement.");
            throw null;
        }
        this.k0 = j;
        this.l0 = 1.0f;
    }

    @Override // defpackage.og5
    public final boolean d(float f) {
        this.l0 = f;
        return true;
    }

    @Override // defpackage.og5
    public final boolean e(g60 g60Var) {
        this.m0 = g60Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return dh3.f(this.h0, bitmapPainter.h0) && hf3.a(0L, 0L) && pf3.a(this.i0, bitmapPainter.i0) && this.j0 == bitmapPainter.j0;
    }

    @Override // defpackage.og5
    public final long h() {
        return u15.R(this.k0);
    }

    public final int hashCode() {
        return Integer.hashCode(this.j0 ? 1 : 0) + p61.g(p61.g(this.h0.hashCode() * 31, 0L, 31), this.i0, 31);
    }

    @Override // defpackage.og5
    public final void i(sv1 sv1Var) {
        int iRound = Math.round(Float.intBitsToFloat((int) (sv1Var.e() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (sv1Var.e() & 4294967295L)));
        float f = this.l0;
        g60 g60Var = this.m0;
        boolean z = this.j0;
        sv1.D(sv1Var, this.h0, this.i0, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f, g60Var, z ? 1 : 0, 328);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        String strD = hf3.d(0L);
        String strB = pf3.b(this.i0);
        boolean z = this.j0;
        if (z == 0) {
            str = "None";
        } else if (z == 1) {
            str = "Low";
        } else if (z == 2) {
            str = "Medium";
        } else {
            str = z == 3 ? "High" : "Unknown";
        }
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.h0);
        sb.append(", srcOffset=");
        sb.append(strD);
        sb.append(", srcSize=");
        return oi0.q(sb, strB, ", filterQuality=", str, ")");
    }
}

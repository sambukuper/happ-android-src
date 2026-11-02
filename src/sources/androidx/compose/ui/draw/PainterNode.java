package androidx.compose.ui.draw;

import defpackage.ci8;
import defpackage.d1;
import defpackage.e02;
import defpackage.eo5;
import defpackage.g34;
import defpackage.g60;
import defpackage.jx4;
import defpackage.og5;
import defpackage.p34;
import defpackage.pz2;
import defpackage.q31;
import defpackage.rv1;
import defpackage.s31;
import defpackage.sw6;
import defpackage.tr4;
import defpackage.ua7;
import defpackage.ug3;
import defpackage.um0;
import defpackage.wl6;
import defpackage.yr4;
import defpackage.z24;
import defpackage.z68;
import defpackage.zr4;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Lg34;", "Ljx4;", "Lrv1;", "Log5;", "painter", "Log5;", "Y0", "()Log5;", "d1", "(Log5;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class PainterNode extends jx4 implements g34, rv1 {
    private og5 painter;
    public g60 q0;

    public PainterNode(og5 og5Var, g60 g60Var) {
        this.painter = og5Var;
        this.q0 = g60Var;
    }

    public static boolean a1(long j) {
        return !ua7.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean b1(long j) {
        return !ua7.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // defpackage.g34
    public final int J0(ug3 ug3Var, tr4 tr4Var, int i) {
        if (!Z0()) {
            return tr4Var.a(i);
        }
        long jC1 = c1(s31.b(0, i, 0, 0, 13));
        return Math.max(q31.i(jC1), tr4Var.a(i));
    }

    @Override // defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        eo5 eo5VarO = tr4Var.o(c1(j));
        return zr4Var.g0(eo5VarO.X, eo5VarO.Y, e02.X, new d1(eo5VarO, (byte) 9));
    }

    @Override // defpackage.jx4
    public final boolean N0() {
        return false;
    }

    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final og5 getPainter() {
        return this.painter;
    }

    public final boolean Z0() {
        return this.painter.getR0() != 9205357640488583168L;
    }

    public final long c1(long j) {
        boolean z = false;
        boolean z2 = q31.d(j) && q31.c(j);
        if (q31.f(j) && q31.e(j)) {
            z = true;
        }
        if ((!Z0() && z2) || z) {
            return q31.a(j, q31.h(j), 0, q31.g(j), 0, 10);
        }
        long jH = this.painter.getR0();
        int iRound = b1(jH) ? Math.round(Float.intBitsToFloat((int) (jH >> 32))) : q31.j(j);
        int iRound2 = a1(jH) ? Math.round(Float.intBitsToFloat((int) (jH & 4294967295L))) : q31.i(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(s31.f(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(s31.g(iRound, j))) << 32);
        if (Z0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!b1(this.painter.getR0()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.painter.getR0() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!a1(this.painter.getR0()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.painter.getR0() & 4294967295L)))) & 4294967295L);
            if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) {
                jFloatToRawIntBits = 0;
            } else {
                float fM = ci8.m(jFloatToRawIntBits2, jFloatToRawIntBits);
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(fM);
                long jFloatToRawIntBits4 = Float.floatToRawIntBits(fM);
                int i = sw6.a;
                jFloatToRawIntBits = z68.J0(jFloatToRawIntBits2, (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & 4294967295L));
            }
        }
        return q31.a(j, s31.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, s31.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    public final void d1(og5 og5Var) {
        this.painter = og5Var;
    }

    @Override // defpackage.g34
    public final int i0(ug3 ug3Var, tr4 tr4Var, int i) {
        if (!Z0()) {
            return tr4Var.m(i);
        }
        long jC1 = c1(s31.b(0, 0, 0, i, 7));
        return Math.max(q31.j(jC1), tr4Var.m(i));
    }

    @Override // defpackage.g34
    public final int m0(ug3 ug3Var, tr4 tr4Var, int i) {
        if (!Z0()) {
            return tr4Var.k(i);
        }
        long jC1 = c1(s31.b(0, 0, 0, i, 7));
        return Math.max(q31.j(jC1), tr4Var.k(i));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=true, alignment=" + pz2.i0 + ", alpha=1.0, colorFilter=" + this.q0 + ")";
    }

    @Override // defpackage.rv1
    public final void u0(p34 p34Var) {
        long jJ0;
        um0 um0Var = p34Var.X;
        long jH = this.painter.getR0();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(b1(jH) ? Float.intBitsToFloat((int) (jH >> 32)) : Float.intBitsToFloat((int) (um0Var.e() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(a1(jH) ? Float.intBitsToFloat((int) (jH & 4294967295L)) : Float.intBitsToFloat((int) (um0Var.e() & 4294967295L)))) & 4294967295L);
        if (Float.intBitsToFloat((int) (um0Var.e() >> 32)) == 0.0f || Float.intBitsToFloat((int) (um0Var.e() & 4294967295L)) == 0.0f) {
            jJ0 = 0;
        } else {
            float fM = ci8.m(jFloatToRawIntBits, um0Var.e());
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fM)) << 32) | (((long) Float.floatToRawIntBits(fM)) & 4294967295L);
            int i = sw6.a;
            jJ0 = z68.J0(jFloatToRawIntBits, jFloatToRawIntBits2);
        }
        long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jJ0 >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jJ0 & 4294967295L)))) & 4294967295L);
        long jRound2 = (((long) Math.round(Float.intBitsToFloat((int) (um0Var.e() & 4294967295L)))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat((int) (um0Var.e() >> 32)))) << 32);
        long jRound3 = (((long) Math.round(((p34Var.getLayoutDirection() == z24.X ? 0.0f : (-1.0f) * 0.0f) + 1.0f) * ((((int) (jRound2 >> 32)) - ((int) (jRound >> 32))) / 2.0f))) << 32) | (((long) Math.round((1.0f + 0.0f) * ((((int) (jRound2 & 4294967295L)) - ((int) (jRound & 4294967295L))) / 2.0f))) & 4294967295L);
        float f = (int) (jRound3 >> 32);
        float f2 = (int) (jRound3 & 4294967295L);
        ((wl6) um0Var.Y.Y).V(f, f2);
        try {
            this.painter.g(p34Var, jJ0, 1.0f, this.q0);
            ((wl6) um0Var.Y.Y).V(-f, -f2);
            p34Var.a();
        } catch (Throwable th) {
            ((wl6) um0Var.Y.Y).V(-f, -f2);
            throw th;
        }
    }

    @Override // defpackage.g34
    public final int y0(ug3 ug3Var, tr4 tr4Var, int i) {
        if (!Z0()) {
            return tr4Var.K(i);
        }
        long jC1 = c1(s31.b(0, i, 0, 0, 13));
        return Math.max(q31.i(jC1), tr4Var.K(i));
    }
}

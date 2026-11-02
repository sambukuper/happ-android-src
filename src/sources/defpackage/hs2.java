package defpackage;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hs2 extends oh1 implements rv1 {
    public final td s0;
    public final dy1 t0;
    public final ig5 u0;

    public hs2(cz7 cz7Var, td tdVar, dy1 dy1Var, ig5 ig5Var) {
        this.s0 = tdVar;
        this.t0 = dy1Var;
        this.u0 = ig5Var;
        Y0(cz7Var);
    }

    public static boolean b1(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // defpackage.rv1
    public final void u0(p34 p34Var) {
        boolean zB1;
        char c;
        long j;
        um0 um0Var = p34Var.X;
        long jE = um0Var.e();
        td tdVar = this.s0;
        tdVar.j(jE);
        if (ua7.e(um0Var.e())) {
            p34Var.a();
            return;
        }
        p34Var.a();
        tdVar.d.getValue();
        Canvas canvasB = fb.b(um0Var.Y.k());
        dy1 dy1Var = this.t0;
        boolean zF = dy1.f(dy1Var.f);
        ig5 ig5Var = this.u0;
        if (zF) {
            zB1 = b1(270.0f, (((long) Float.floatToRawIntBits(p34Var.h0(ig5Var.b(p34Var.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (um0Var.e() & 4294967295L)))) << 32), dy1Var.c(), canvasB);
        } else {
            zB1 = false;
        }
        if (dy1.f(dy1Var.d)) {
            c = ' ';
            j = 4294967295L;
            zB1 = b1(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(p34Var.h0(ig5Var.b))) & 4294967295L), dy1Var.e(), canvasB) || zB1;
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if (dy1.f(dy1Var.g)) {
            zB1 = b1(90.0f, (((long) Float.floatToRawIntBits(p34Var.h0(ig5Var.c(p34Var.getLayoutDirection())) + (-((float) nr4.O(Float.intBitsToFloat((int) (um0Var.e() >> c))))))) & j) | (((long) Float.floatToRawIntBits(0.0f)) << c), dy1Var.d(), canvasB) || zB1;
        }
        if (dy1.f(dy1Var.e)) {
            EdgeEffect edgeEffectB = dy1Var.b();
            zB1 = b1(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (um0Var.e() >> c)))) << c) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (um0Var.e() & j))) + p34Var.h0(ig5Var.d))) & j), edgeEffectB, canvasB) || zB1;
        }
        if (zB1) {
            tdVar.d();
        }
    }
}

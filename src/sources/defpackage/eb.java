package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eb implements sm0 {
    public Canvas a = fb.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.sm0
    public final void a(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.sm0
    public final void b(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.sm0
    public final void c(float f, long j, df dfVar) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, dfVar.a);
    }

    @Override // defpackage.sm0
    public final void d(je jeVar, long j, long j2, long j3, df dfVar) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapC = ue3.c(jeVar);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapC, rect, rect2, dfVar.a);
    }

    @Override // defpackage.sm0
    public final void e(lf lfVar, df dfVar) {
        Canvas canvas = this.a;
        if (lfVar instanceof lf) {
            canvas.drawPath(lfVar.a, dfVar.a);
        } else {
            u52.k("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.sm0
    public final void f(float f, float f2, float f3, float f4, float f5, float f6, df dfVar) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, dfVar.a);
    }

    @Override // defpackage.sm0
    public final void g() {
        this.a.save();
    }

    @Override // defpackage.sm0
    public final void h(long j, long j2, df dfVar) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), dfVar.a);
    }

    @Override // defpackage.sm0
    public final void i() {
        ys0.r(this.a, false);
    }

    @Override // defpackage.sm0
    public final void j(float f, float f2, float f3, float f4, df dfVar) {
        this.a.drawRect(f, f2, f3, f4, u15.w(dfVar));
    }

    @Override // defpackage.sm0
    public final void k(float[] fArr) {
        if (ch3.K(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        nr4.R(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.sm0
    public final void l(lf lfVar) {
        Canvas canvas = this.a;
        if (lfVar instanceof lf) {
            canvas.clipPath(lfVar.a, Region.Op.INTERSECT);
        } else {
            u52.k("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.sm0
    public final void m(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.sm0
    public final void n(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.sm0
    public final void o(je jeVar, long j, df dfVar) {
        this.a.drawBitmap(ue3.c(jeVar), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), dfVar.a);
    }

    @Override // defpackage.sm0
    public final void p() {
        this.a.restore();
    }

    @Override // defpackage.sm0
    public final void r(s86 s86Var, df dfVar) {
        this.a.saveLayer(s86Var.a, s86Var.b, s86Var.c, s86Var.d, dfVar.a, 31);
    }

    @Override // defpackage.sm0
    public final void s() {
        ys0.r(this.a, true);
    }

    @Override // defpackage.sm0
    public final void t(float f, float f2, float f3, float f4, float f5, float f6, df dfVar) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, dfVar.a);
    }
}

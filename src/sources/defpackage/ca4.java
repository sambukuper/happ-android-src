package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ca4 extends mw1 {
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public boolean m;
    public float n;
    public Pair o;

    @Override // defpackage.mw1
    public final void a(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        if (this.f != rect.width()) {
            this.f = rect.width();
            g();
        }
        float fE = e();
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - fE) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.a;
        if (linearProgressIndicatorSpec.s) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f2 = this.f / 2.0f;
        float f3 = fE / 2.0f;
        canvas.clipRect(-f2, -f3, f2, f3);
        int i = linearProgressIndicatorSpec.a;
        this.g = i * f;
        this.h = Math.min(i / 2, linearProgressIndicatorSpec.a()) * f;
        this.j = linearProgressIndicatorSpec.l * f;
        this.i = Math.min(linearProgressIndicatorSpec.a / 2.0f, linearProgressIndicatorSpec.e()) * f;
        if (z || z2) {
            if ((z && linearProgressIndicatorSpec.g == 2) || (z2 && linearProgressIndicatorSpec.h == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && linearProgressIndicatorSpec.h != 3)) {
                canvas.translate(0.0f, ((1.0f - f) * linearProgressIndicatorSpec.a) / 2.0f);
            }
        }
        if (z2 && linearProgressIndicatorSpec.h == 3) {
            this.n = f;
        } else {
            this.n = 1.0f;
        }
    }

    @Override // defpackage.mw1
    public final void b(int i, int i2, Canvas canvas, Paint paint) {
        int iV = yn0.v(i, i2);
        this.m = false;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.a;
        int iMin = Math.min(linearProgressIndicatorSpec.t, linearProgressIndicatorSpec.a);
        if (iMin <= 0 || iV == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iV);
        Integer num = linearProgressIndicatorSpec.u;
        float f = iMin;
        j(canvas, paint, new lw1(new float[]{(this.f / 2.0f) - (num != null ? (linearProgressIndicatorSpec.t / 2.0f) + num.floatValue() : this.g / 2.0f), 0.0f}, new float[]{1.0f, 0.0f}), f, f, (this.h * f) / this.g, null, 0.0f, 0.0f, 0.0f, false);
    }

    @Override // defpackage.mw1
    public final void c(Canvas canvas, Paint paint, kw1 kw1Var, int i) {
        int iV = yn0.v(kw1Var.c, i);
        this.m = kw1Var.h;
        float f = kw1Var.a;
        float f2 = kw1Var.b;
        int i2 = kw1Var.d;
        i(canvas, paint, f, f2, iV, i2, i2, kw1Var.e, kw1Var.f, true);
    }

    @Override // defpackage.mw1
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int iV = yn0.v(i, i2);
        this.m = false;
        i(canvas, paint, f, f2, iV, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // defpackage.mw1
    public final void g() {
        Path path = this.b;
        path.rewind();
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.a;
        if (linearProgressIndicatorSpec.b(this.m)) {
            int i = this.m ? linearProgressIndicatorSpec.j : linearProgressIndicatorSpec.k;
            float f = this.f;
            int i2 = (int) (f / i);
            this.k = f / i2;
            for (int i3 = 0; i3 <= i2; i3++) {
                int i4 = i3 * 2;
                float f2 = i4 + 1;
                path.cubicTo(i4 + 0.48f, 0.0f, f2 - 0.48f, 1.0f, f2, 1.0f);
                float f3 = f2 + 0.48f;
                float f4 = i4 + 2;
                path.cubicTo(f3, 1.0f, f4 - 0.48f, 0.0f, f4, 0.0f);
            }
            Matrix matrix = this.e;
            matrix.reset();
            matrix.setScale(this.k / 2.0f, -2.0f);
            matrix.postTranslate(0.0f, 1.0f);
            path.transform(matrix);
        } else {
            path.lineTo(this.f, 0.0f);
        }
        this.d.setPath(path, false);
    }

    public final void i(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float fD;
        float fD2;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec;
        int i4;
        float f5;
        Canvas canvas2;
        Pair pair = this.o;
        float fL = z91.l(f, 0.0f, 1.0f);
        float fL2 = z91.l(f2, 0.0f, 1.0f);
        float fD3 = z51.D(1.0f - this.n, 1.0f, fL);
        float fD4 = z51.D(1.0f - this.n, 1.0f, fL2);
        int iL = (int) ((z91.l(fD3, 0.0f, 0.01f) * i2) / 0.01f);
        int iL2 = (int) (((1.0f - z91.l(fD4, 0.99f, 1.0f)) * i3) / 0.01f);
        float f6 = this.f;
        int i5 = (int) ((fD3 * f6) + iL);
        int i6 = (int) ((fD4 * f6) - iL2);
        float f7 = this.h;
        float f8 = this.i;
        if (f7 != f8) {
            float fMax = Math.max(f7, f8);
            float f9 = this.f;
            float f10 = fMax / f9;
            fD = z51.D(this.h, this.i, z91.l(i5 / f9, 0.0f, f10) / f10);
            float f11 = this.h;
            float f12 = this.i;
            float f13 = this.f;
            fD2 = z51.D(f11, f12, z91.l((f13 - i6) / f13, 0.0f, f10) / f10);
        } else {
            fD = f7;
            fD2 = fD;
        }
        float f14 = (-this.f) / 2.0f;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec2 = (LinearProgressIndicatorSpec) this.a;
        boolean z2 = linearProgressIndicatorSpec2.b(this.m) && z && f3 > 0.0f;
        if (i5 <= i6) {
            float f15 = i5 + fD;
            float f16 = i6 - fD2;
            float f17 = fD * 2.0f;
            float f18 = fD2 * 2.0f;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.g);
            ((lw1) pair.first).b();
            ((lw1) pair.second).b();
            ((lw1) pair.first).e(f15 + f14);
            ((lw1) pair.second).e(f16 + f14);
            if (i5 == 0 && f16 + fD2 < f15 + fD) {
                lw1 lw1Var = (lw1) pair.first;
                float f19 = this.g;
                j(canvas, paint, lw1Var, f17, f19, fD, (lw1) pair.second, f18, f19, fD2, true);
                return;
            }
            if (f15 - fD > f16 - fD2) {
                lw1 lw1Var2 = (lw1) pair.second;
                float f20 = this.g;
                j(canvas, paint, lw1Var2, f18, f20, fD2, (lw1) pair.first, f17, f20, fD, false);
                return;
            }
            float f21 = fD2;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(linearProgressIndicatorSpec2.c() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z2) {
                float f22 = this.f;
                float f23 = f15 / f22;
                float f24 = f16 / f22;
                if (this.m) {
                    linearProgressIndicatorSpec = linearProgressIndicatorSpec2;
                    i4 = linearProgressIndicatorSpec.j;
                } else {
                    linearProgressIndicatorSpec = linearProgressIndicatorSpec2;
                    i4 = linearProgressIndicatorSpec.k;
                }
                if (i4 != this.l) {
                    this.l = i4;
                    g();
                }
                Path path = this.c;
                path.rewind();
                float f25 = (-this.f) / 2.0f;
                boolean zB = linearProgressIndicatorSpec.b(this.m);
                if (zB) {
                    float f26 = this.f;
                    f5 = 1.0f;
                    float f27 = this.k;
                    float f28 = f26 / f27;
                    float f29 = f4 / f28;
                    float f30 = f28 / (f28 + 1.0f);
                    f23 = (f23 + f29) * f30;
                    f24 = (f24 + f29) * f30;
                    f25 -= f27 * f4;
                } else {
                    f5 = 1.0f;
                }
                PathMeasure pathMeasure = this.d;
                float length = pathMeasure.getLength() * f23;
                float length2 = pathMeasure.getLength() * f24;
                pathMeasure.getSegment(length, length2, path, true);
                lw1 lw1Var3 = (lw1) pair.first;
                lw1Var3.b();
                pathMeasure.getPosTan(length, lw1Var3.a, lw1Var3.b);
                lw1 lw1Var4 = (lw1) pair.second;
                lw1Var4.b();
                pathMeasure.getPosTan(length2, lw1Var4.a, lw1Var4.b);
                Matrix matrix = this.e;
                matrix.reset();
                matrix.setTranslate(f25, 0.0f);
                lw1Var3.e(f25);
                lw1Var4.e(f25);
                if (zB) {
                    float f31 = this.j * f3;
                    matrix.postScale(f5, f31);
                    lw1Var3.d(f31);
                    lw1Var4.d(f31);
                }
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            } else {
                float[] fArr = ((lw1) pair.first).a;
                float f32 = fArr[0];
                float f33 = fArr[1];
                float[] fArr2 = ((lw1) pair.second).a;
                canvas.drawLine(f32, f33, fArr2[0], fArr2[1], paint);
                canvas2 = canvas;
                linearProgressIndicatorSpec = linearProgressIndicatorSpec2;
            }
            if (linearProgressIndicatorSpec.c()) {
                return;
            }
            if (f15 > 0.0f && fD > 0.0f) {
                j(canvas2, paint, (lw1) pair.first, f17, this.g, fD, null, 0.0f, 0.0f, 0.0f, false);
            }
            if (f16 >= this.f || f21 <= 0.0f) {
                return;
            }
            j(canvas, paint, (lw1) pair.second, f18, this.g, f21, null, 0.0f, 0.0f, 0.0f, false);
        }
    }

    public final void j(Canvas canvas, Paint paint, lw1 lw1Var, float f, float f2, float f3, lw1 lw1Var2, float f4, float f5, float f6, boolean z) {
        float f7;
        float f8;
        float fMin = Math.min(f2, this.g);
        float f9 = (-f) / 2.0f;
        float f10 = (-fMin) / 2.0f;
        float f11 = f / 2.0f;
        float f12 = fMin / 2.0f;
        RectF rectF = new RectF(f9, f10, f11, f12);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (lw1Var2 != null) {
            float[] fArr = lw1Var2.b;
            float[] fArr2 = lw1Var2.a;
            float fMin2 = Math.min(f5, this.g);
            float fMin3 = Math.min(f4 / 2.0f, (f6 * fMin2) / this.g);
            RectF rectF2 = new RectF();
            if (z) {
                float f13 = (fArr2[0] - fMin3) - (lw1Var.a[0] - f3);
                if (f13 > 0.0f) {
                    lw1Var2.e((-f13) / 2.0f);
                    f8 = f4 + f13;
                } else {
                    f8 = f4;
                }
                rectF2.set(0.0f, f10, f11, f12);
            } else {
                float f14 = (fArr2[0] + fMin3) - (lw1Var.a[0] + f3);
                if (f14 < 0.0f) {
                    lw1Var2.e((-f14) / 2.0f);
                    f7 = f4 - f14;
                } else {
                    f7 = f4;
                }
                rectF2.set(f9, f10, 0.0f, f12);
                f8 = f7;
            }
            RectF rectF3 = new RectF((-f8) / 2.0f, (-fMin2) / 2.0f, f8 / 2.0f, fMin2 / 2.0f);
            canvas.translate(fArr2[0], fArr2[1]);
            canvas.rotate(mw1.h(fArr));
            Path path = new Path();
            path.addRoundRect(rectF3, fMin3, fMin3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-mw1.h(fArr));
            canvas.translate(-fArr2[0], -fArr2[1]);
            float[] fArr3 = lw1Var.a;
            canvas.translate(fArr3[0], fArr3[1]);
            canvas.rotate(mw1.h(lw1Var.b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            float[] fArr4 = lw1Var.a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(mw1.h(lw1Var.b));
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        canvas.restore();
    }
}

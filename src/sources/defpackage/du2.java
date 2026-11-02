package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class du2 implements zt2 {
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public o60 G;
    public int H;
    public final vm0 b;
    public final um0 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public g60 k;
    public long l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public long r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    public int y;
    public int z;

    public du2() {
        vm0 vm0Var = new vm0();
        um0 um0Var = new um0();
        this.b = vm0Var;
        this.c = um0Var;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.d = renderNode;
        this.e = 0L;
        renderNode.setClipToBounds(false);
        R(renderNode, 0);
        this.i = 1.0f;
        this.j = 3;
        this.l = 9205357640488583168L;
        this.m = 1.0f;
        this.n = 1.0f;
        long j = dw0.b;
        this.r = j;
        this.s = j;
        this.w = 8.0f;
        this.H = 0;
    }

    @Override // defpackage.zt2
    public final void A(float f) {
        this.m = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.zt2
    public final float B() {
        return this.w;
    }

    @Override // defpackage.zt2
    public final void C(fi1 fi1Var, z24 z24Var, xt2 xt2Var, wi wiVar) {
        um0 um0Var = this.c;
        RecordingCanvas recordingCanvasBeginRecording = this.d.beginRecording();
        float f = this.y;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.z)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            vm0 vm0Var = this.b;
            eb ebVar = vm0Var.a;
            Canvas canvas = ebVar.a;
            ebVar.a = recordingCanvasBeginRecording;
            lr lrVar = um0Var.Y;
            lrVar.B(fi1Var);
            lrVar.C(z24Var);
            lrVar.Z = xt2Var;
            lrVar.D(this.e);
            lrVar.A(ebVar);
            if (this.y > 0.0f || this.z > 0.0f) {
                int i = (int) (jFloatToRawIntBits >> 32);
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                ebVar.n(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                wiVar.B(um0Var);
                ebVar.n(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            } else {
                wiVar.B(um0Var);
            }
            vm0Var.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // defpackage.zt2
    public final float D() {
        return this.o;
    }

    @Override // defpackage.zt2
    public final void E(o60 o60Var) {
        this.G = o60Var;
        if (Build.VERSION.SDK_INT >= 31) {
            tc.x(this.d, o60Var);
        }
    }

    @Override // defpackage.zt2
    public final void F(boolean z) {
        this.x = z;
        Q();
    }

    @Override // defpackage.zt2
    public final float G() {
        return this.t;
    }

    @Override // defpackage.zt2
    public final void H(int i) {
        this.H = i;
        S();
    }

    @Override // defpackage.zt2
    public final void I(float f) {
        this.o = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.zt2
    public final void J(long j) {
        this.s = j;
        this.d.setSpotShadowColor(z51.U(j));
    }

    @Override // defpackage.zt2
    public final Matrix K() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.zt2
    public final void L(float f) {
        this.w = f;
        this.d.setCameraDistance(f);
    }

    @Override // defpackage.zt2
    public final float M() {
        return this.q;
    }

    @Override // defpackage.zt2
    public final float N() {
        return this.n;
    }

    @Override // defpackage.zt2
    public final void O(float f) {
        this.t = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.zt2
    public final int P() {
        return this.j;
    }

    public final void Q() {
        boolean z = this.x;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.C) {
            this.C = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.D) {
            this.D = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void R(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.f);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        Paint paint = this.f;
        if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void S() {
        int i = this.H;
        if (i != 1 && this.j == 3 && this.k == null && this.G == null) {
            R(this.d, i);
        } else {
            R(this.d, 1);
        }
    }

    public final void T() {
        long j = this.l;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.setPivotX((Float.intBitsToFloat((int) (this.e >> 32)) / 2.0f) + this.y);
            this.d.setPivotY((Float.intBitsToFloat((int) (this.e & 4294967295L)) / 2.0f) + this.z);
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.y);
            this.d.setPivotY(Float.intBitsToFloat((int) (this.l & 4294967295L)) + this.z);
        }
    }

    public final void U() {
        RenderNode renderNode = this.d;
        int i = this.E;
        renderNode.setPosition(i - this.y, this.F - this.z, i + ((int) Float.intBitsToFloat((int) (this.e >> 32))) + this.A, this.F + ((int) Float.intBitsToFloat((int) (this.e & 4294967295L))) + this.B);
    }

    @Override // defpackage.zt2
    public final float a() {
        return this.i;
    }

    @Override // defpackage.zt2
    public final void b(float f) {
        this.u = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.zt2
    public final float c() {
        return this.m;
    }

    @Override // defpackage.zt2
    public final void d(float f) {
        this.q = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.zt2
    public final o60 e() {
        return this.G;
    }

    @Override // defpackage.zt2
    public final void f(float f) {
        this.v = f;
        this.d.setRotationZ(f);
    }

    @Override // defpackage.zt2
    public final void g(float f) {
        this.p = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.zt2
    public final void h(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        Q();
    }

    @Override // defpackage.zt2
    public final void i(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(wa.L(i));
        S();
    }

    @Override // defpackage.zt2
    public final void j() {
        this.d.discardDisplayList();
    }

    @Override // defpackage.zt2
    public final void k(int i, long j, int i2) {
        this.E = i;
        this.F = i2;
        boolean zA = ua7.a(this.e, u15.R(j));
        this.e = u15.R(j);
        U();
        if (zA || !z85.b(this.l, 9205357640488583168L)) {
            return;
        }
        this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.y);
        this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.z);
    }

    @Override // defpackage.zt2
    public final void l(sm0 sm0Var) {
        Canvas canvas = fb.a;
        ((eb) sm0Var).a.drawRenderNode(this.d);
    }

    @Override // defpackage.zt2
    public final int m() {
        return this.H;
    }

    @Override // defpackage.zt2
    public final g60 n() {
        return this.k;
    }

    @Override // defpackage.zt2
    public final void o(float f) {
        this.n = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.zt2
    public final float p() {
        return this.u;
    }

    @Override // defpackage.zt2
    public final void q(g60 g60Var) {
        this.k = g60Var;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(g60Var != null ? g60Var.a : null);
        S();
    }

    @Override // defpackage.zt2
    public final boolean r() {
        return this.d.hasDisplayList();
    }

    @Override // defpackage.zt2
    public final float s() {
        return this.v;
    }

    @Override // defpackage.zt2
    public final void t(long j) {
        this.l = j;
        T();
    }

    @Override // defpackage.zt2
    public final long u() {
        return this.r;
    }

    @Override // defpackage.zt2
    public final void v(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.zt2
    public final void w(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0)) {
            StringBuilder sbR = oi0.r(i, "Outsets cannot be negative! Left: ", i2, ", Top: ", ", Right: ");
            sbR.append(i3);
            sbR.append(", Bottom: ");
            sbR.append(i4);
            vc3.a(sbR.toString());
        }
        int i5 = this.y;
        if (i == i5 && i2 == this.z && i3 == this.A && i4 == this.B) {
            return;
        }
        boolean z = (i == i5 && i2 == this.z) ? false : true;
        this.y = i;
        this.z = i2;
        this.A = i3;
        this.B = i4;
        U();
        if (z) {
            T();
        }
    }

    @Override // defpackage.zt2
    public final float x() {
        return this.p;
    }

    @Override // defpackage.zt2
    public final long y() {
        return this.s;
    }

    @Override // defpackage.zt2
    public final void z(long j) {
        this.r = j;
        this.d.setAmbientShadowColor(z51.U(j));
    }
}

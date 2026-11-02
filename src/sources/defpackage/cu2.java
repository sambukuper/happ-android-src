package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cu2 implements zt2 {
    public static final AtomicBoolean K = new AtomicBoolean(true);
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public o60 J;
    public final vm0 b;
    public final um0 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public g60 l;
    public float m;
    public boolean n;
    public long o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public long u;
    public long v;
    public float w;
    public float x;
    public float y;
    public float z;

    public cu2(AndroidComposeView androidComposeView, vm0 vm0Var, um0 um0Var) {
        this.b = vm0Var;
        this.c = um0Var;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.d = renderNodeCreate;
        this.e = 0L;
        this.i = 0L;
        if (K.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                wd6.c(renderNodeCreate, wd6.a(renderNodeCreate));
                wd6.d(renderNodeCreate, wd6.b(renderNodeCreate));
            }
            vd6.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        R(0);
        this.j = 0;
        this.k = 3;
        this.m = 1.0f;
        this.o = 9205357640488583168L;
        this.p = 1.0f;
        this.q = 1.0f;
        long j = dw0.b;
        this.u = j;
        this.v = j;
        this.z = 8.0f;
    }

    @Override // defpackage.zt2
    public final void A(float f) {
        this.p = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.zt2
    public final float B() {
        return this.z;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.zt2
    public final void C(fi1 fi1Var, z24 z24Var, xt2 xt2Var, wi wiVar) throws Throwable {
        DisplayListCanvas displayListCanvas;
        int i;
        int i2;
        fi1 fi1VarM;
        z24 z24VarO;
        sm0 sm0VarK;
        long jP;
        xt2 xt2Var2;
        um0 um0Var = this.c;
        lr lrVar = um0Var.Y;
        DisplayListCanvas displayListCanvasStart = this.d.start(Math.max(((int) (this.e >> 32)) + this.B + this.D, (int) (this.i >> 32)), Math.max(((int) (this.e & 4294967295L)) + this.C + this.E, (int) (this.i & 4294967295L)));
        float f = this.B;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.C)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            eb ebVar = this.b.a;
            Canvas canvas = ebVar.a;
            ebVar.a = (Canvas) displayListCanvasStart;
            try {
                try {
                    if (this.B <= 0.0f) {
                        try {
                            if (this.C <= 0.0f) {
                                long jR = u15.R(this.e);
                                fi1 fi1VarM2 = lrVar.m();
                                z24 z24VarO2 = lrVar.o();
                                sm0 sm0VarK2 = lrVar.k();
                                canvas = canvas;
                                long jP2 = lrVar.p();
                                displayListCanvasStart = displayListCanvasStart;
                                xt2 xt2Var3 = (xt2) lrVar.Z;
                                lrVar.B(fi1Var);
                                lrVar.C(z24Var);
                                lrVar.A(ebVar);
                                lrVar.D(jR);
                                lrVar.Z = xt2Var;
                                ebVar.g();
                                try {
                                    wiVar.B(um0Var);
                                    ebVar.p();
                                    lrVar.B(fi1VarM2);
                                    lrVar.C(z24VarO2);
                                    lrVar.A(sm0VarK2);
                                    lrVar.D(jP2);
                                    lrVar.Z = xt2Var3;
                                } catch (Throwable th) {
                                    ebVar.p();
                                    lrVar.B(fi1VarM2);
                                    lrVar.C(z24VarO2);
                                    lrVar.A(sm0VarK2);
                                    lrVar.D(jP2);
                                    lrVar.Z = xt2Var3;
                                    throw th;
                                }
                            }
                            ebVar.a = canvas;
                            this.d.end(displayListCanvasStart);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            displayListCanvasStart = displayListCanvasStart;
                            displayListCanvas = displayListCanvasStart;
                            this.d.end(displayListCanvas);
                            throw th;
                        }
                    }
                    wiVar.B(um0Var);
                    ebVar.p();
                    lrVar.B(fi1VarM);
                    lrVar.C(z24VarO);
                    lrVar.A(sm0VarK);
                    lrVar.D(jP);
                    lrVar.Z = xt2Var2;
                    ebVar.n(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
                    ebVar.a = canvas;
                    this.d.end(displayListCanvasStart);
                    return;
                } catch (Throwable th3) {
                    displayListCanvas = displayListCanvasStart;
                    try {
                        ebVar.p();
                        lrVar.B(fi1VarM);
                        lrVar.C(z24VarO);
                        lrVar.A(sm0VarK);
                        lrVar.D(jP);
                        lrVar.Z = xt2Var2;
                        throw th3;
                    } catch (Throwable th4) {
                        th = th4;
                        this.d.end(displayListCanvas);
                        throw th;
                    }
                }
                i = (int) (jFloatToRawIntBits >> 32);
                i2 = (int) (jFloatToRawIntBits & 4294967295L);
                ebVar.n(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                long jR2 = u15.R(this.e);
                fi1VarM = lrVar.m();
                z24VarO = lrVar.o();
                sm0VarK = lrVar.k();
                jP = lrVar.p();
                xt2Var2 = (xt2) lrVar.Z;
                lrVar.B(fi1Var);
                lrVar.C(z24Var);
                lrVar.A(ebVar);
                lrVar.D(jR2);
                lrVar.Z = xt2Var;
                ebVar.g();
            } catch (Throwable th5) {
                th = th5;
                displayListCanvas = displayListCanvasStart;
                this.d.end(displayListCanvas);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            displayListCanvas = displayListCanvasStart;
        }
    }

    @Override // defpackage.zt2
    public final float D() {
        return this.r;
    }

    @Override // defpackage.zt2
    public final void E(o60 o60Var) {
        this.J = o60Var;
    }

    @Override // defpackage.zt2
    public final void F(boolean z) {
        this.A = z;
        Q();
    }

    @Override // defpackage.zt2
    public final float G() {
        return this.w;
    }

    @Override // defpackage.zt2
    public final void H(int i) {
        this.j = i;
        S();
    }

    @Override // defpackage.zt2
    public final void I(float f) {
        this.r = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.zt2
    public final void J(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            wd6.d(this.d, z51.U(j));
        }
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
        this.z = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.zt2
    public final float M() {
        return this.t;
    }

    @Override // defpackage.zt2
    public final float N() {
        return this.q;
    }

    @Override // defpackage.zt2
    public final void O(float f) {
        this.w = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.zt2
    public final int P() {
        return this.k;
    }

    public final void Q() {
        boolean z = this.A;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.F) {
            this.F = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.G) {
            this.G = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void R(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void S() {
        int i = this.j;
        if (i != 1 && this.k == 3 && this.l == null) {
            R(i);
        } else {
            R(1);
        }
    }

    public final void T() {
        long j = this.o;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.n = true;
            this.d.setPivotX((((int) (this.e >> 32)) / 2.0f) + this.B);
            this.d.setPivotY((((int) (4294967295L & this.e)) / 2.0f) + this.C);
        } else {
            this.n = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.B);
            this.d.setPivotY(Float.intBitsToFloat((int) (this.o & 4294967295L)) + this.C);
        }
    }

    public final void U() {
        RenderNode renderNode = this.d;
        int i = this.H;
        int i2 = i - this.B;
        int i3 = this.I;
        int i4 = i3 - this.C;
        long j = this.e;
        renderNode.setLeftTopRightBottom(i2, i4, i + ((int) (j >> 32)) + this.D, i3 + ((int) (j & 4294967295L)) + this.E);
    }

    @Override // defpackage.zt2
    public final float a() {
        return this.m;
    }

    @Override // defpackage.zt2
    public final void b(float f) {
        this.x = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.zt2
    public final float c() {
        return this.p;
    }

    @Override // defpackage.zt2
    public final void d(float f) {
        this.t = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.zt2
    public final o60 e() {
        return this.J;
    }

    @Override // defpackage.zt2
    public final void f(float f) {
        this.y = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.zt2
    public final void g(float f) {
        this.s = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.zt2
    public final void h(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        Q();
    }

    @Override // defpackage.zt2
    public final void i(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(wa.N(i)));
        S();
    }

    @Override // defpackage.zt2
    public final void j() {
        vd6.a(this.d);
    }

    @Override // defpackage.zt2
    public final void k(int i, long j, int i2) {
        this.H = i;
        this.I = i2;
        boolean zA = pf3.a(this.e, j);
        this.e = j;
        U();
        if (zA) {
            return;
        }
        if (this.n || z85.b(this.o, 9205357640488583168L)) {
            this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.B);
            this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.C);
        }
    }

    @Override // defpackage.zt2
    public final void l(sm0 sm0Var) {
        Canvas canvas = fb.a;
        DisplayListCanvas displayListCanvas = ((eb) sm0Var).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.d);
    }

    @Override // defpackage.zt2
    public final int m() {
        return this.j;
    }

    @Override // defpackage.zt2
    public final g60 n() {
        return this.l;
    }

    @Override // defpackage.zt2
    public final void o(float f) {
        this.q = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.zt2
    public final float p() {
        return this.x;
    }

    @Override // defpackage.zt2
    public final void q(g60 g60Var) {
        this.l = g60Var;
        if (g60Var == null) {
            S();
            return;
        }
        R(1);
        RenderNode renderNode = this.d;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(g60Var.a);
        renderNode.setLayerPaint(paint);
    }

    @Override // defpackage.zt2
    public final boolean r() {
        return this.d.isValid();
    }

    @Override // defpackage.zt2
    public final float s() {
        return this.y;
    }

    @Override // defpackage.zt2
    public final void t(long j) {
        this.o = j;
        T();
    }

    @Override // defpackage.zt2
    public final long u() {
        return this.u;
    }

    @Override // defpackage.zt2
    public final void v(float f) {
        this.m = f;
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
        int i5 = this.B;
        if (i == i5 && i2 == this.C && i3 == this.D && i4 == this.E) {
            return;
        }
        boolean z = (i == i5 && i2 == this.C) ? false : true;
        this.B = i;
        this.C = i2;
        this.D = i3;
        this.E = i4;
        U();
        if (z) {
            T();
        }
    }

    @Override // defpackage.zt2
    public final float x() {
        return this.s;
    }

    @Override // defpackage.zt2
    public final long y() {
        return this.v;
    }

    @Override // defpackage.zt2
    public final void z(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            wd6.c(this.d, z51.U(j));
        }
    }
}

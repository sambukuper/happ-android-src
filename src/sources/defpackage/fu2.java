package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fu2 implements zt2 {
    public static final eu2 I = new eu2();
    public float A;
    public float B;
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public o60 H;
    public final pv1 b;
    public final vm0 c;
    public final vw8 d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public g60 o;
    public int p;
    public float q;
    public boolean r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public long y;
    public long z;

    public fu2(pv1 pv1Var) {
        vm0 vm0Var = new vm0();
        um0 um0Var = new um0();
        this.b = pv1Var;
        this.c = vm0Var;
        vw8 vw8Var = new vw8(pv1Var, vm0Var, um0Var);
        this.d = vw8Var;
        this.e = pv1Var.getResources();
        this.f = new Rect();
        pv1Var.addView(vw8Var);
        vw8Var.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.p = 0;
        this.q = 1.0f;
        this.s = 9205357640488583168L;
        this.t = 1.0f;
        this.u = 1.0f;
        long j = dw0.b;
        this.y = j;
        this.z = j;
    }

    @Override // defpackage.zt2
    public final void A(float f) {
        this.t = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.zt2
    public final float B() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
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
    public final void C(fi1 fi1Var, z24 z24Var, xt2 xt2Var, wi wiVar) {
        vw8 vw8Var = this.d;
        ViewParent parent = vw8Var.getParent();
        pv1 pv1Var = this.b;
        if (parent == null) {
            pv1Var.addView(vw8Var);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.D)) << 32) | (((long) Float.floatToRawIntBits(this.E)) & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        vw8Var.l0 = fi1Var;
        vw8Var.m0 = z24Var;
        vw8Var.n0 = wiVar;
        vw8Var.o0 = xt2Var;
        vw8Var.p0 = fIntBitsToFloat;
        vw8Var.q0 = fIntBitsToFloat2;
        if (vw8Var.isAttachedToWindow()) {
            vw8Var.setVisibility(4);
            vw8Var.setVisibility(0);
            try {
                eb ebVar = this.c.a;
                eu2 eu2Var = I;
                Canvas canvas = ebVar.a;
                ebVar.a = eu2Var;
                pv1Var.a(ebVar, vw8Var, vw8Var.getDrawingTime());
                ebVar.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.zt2
    public final float D() {
        return this.v;
    }

    @Override // defpackage.zt2
    public final void E(o60 o60Var) {
        this.H = o60Var;
        if (Build.VERSION.SDK_INT >= 31) {
            tc.y(this.d, o60Var);
        }
    }

    @Override // defpackage.zt2
    public final void F(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // defpackage.zt2
    public final float G() {
        return this.A;
    }

    @Override // defpackage.zt2
    public final void H(int i) {
        this.p = i;
        S();
    }

    @Override // defpackage.zt2
    public final void I(float f) {
        this.v = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.zt2
    public final void J(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.z = j;
            en.W(this.d, z51.U(j));
        }
    }

    @Override // defpackage.zt2
    public final Matrix K() {
        return this.d.getMatrix();
    }

    @Override // defpackage.zt2
    public final void L(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.zt2
    public final float M() {
        return this.x;
    }

    @Override // defpackage.zt2
    public final float N() {
        return this.u;
    }

    @Override // defpackage.zt2
    public final void O(float f) {
        this.A = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.zt2
    public final int P() {
        return this.n;
    }

    public final void Q(int i) {
        Paint paint = this.g;
        vw8 vw8Var = this.d;
        boolean z = true;
        if (i == 1) {
            vw8Var.setLayerType(2, paint);
        } else if (i == 2) {
            vw8Var.setLayerType(0, paint);
            z = false;
        } else {
            vw8Var.setLayerType(0, paint);
        }
        vw8Var.setCanUseCompositingLayer$ui_graphics(z);
    }

    public final void R() {
        boolean z = this.m;
        vw8 vw8Var = this.d;
        if (z || vw8Var.getClipToOutline()) {
            this.k = true;
        }
        int i = this.h;
        int i2 = i - this.D;
        int i3 = this.i;
        int i4 = i3 - this.E;
        long j = this.j;
        vw8Var.layout(i2, i4, i + ((int) (j >> 32)) + this.F, i3 + ((int) (j & 4294967295L)) + this.G);
    }

    public final void S() {
        int i = this.p;
        if (i != 1 && this.n == 3 && this.o == null) {
            Q(i);
        } else {
            Q(1);
        }
    }

    public final void T() {
        boolean z = this.r;
        vw8 vw8Var = this.d;
        if (z || z85.b(this.s, 9205357640488583168L)) {
            vw8Var.setPivotX((((int) (this.j >> 32)) / 2.0f) + this.D);
            vw8Var.setPivotY((((int) (this.j & 4294967295L)) / 2.0f) + this.E);
        } else {
            vw8Var.setPivotX(Float.intBitsToFloat((int) (this.s >> 32)) + this.D);
            vw8Var.setPivotY(Float.intBitsToFloat((int) (this.s & 4294967295L)) + this.E);
        }
    }

    @Override // defpackage.zt2
    public final float a() {
        return this.q;
    }

    @Override // defpackage.zt2
    public final void b(float f) {
        this.B = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.zt2
    public final float c() {
        return this.t;
    }

    @Override // defpackage.zt2
    public final void d(float f) {
        this.x = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.zt2
    public final o60 e() {
        return this.H;
    }

    @Override // defpackage.zt2
    public final void f(float f) {
        this.C = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.zt2
    public final void g(float f) {
        this.w = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.zt2
    public final void h(Outline outline, long j) {
        vw8 vw8Var = this.d;
        vw8Var.j0 = outline;
        vw8Var.invalidateOutline();
        if ((this.m || vw8Var.getClipToOutline()) && outline != null) {
            vw8Var.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // defpackage.zt2
    public final void i(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(wa.N(i)));
        S();
    }

    @Override // defpackage.zt2
    public final void j() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // defpackage.zt2
    public final void k(int i, long j, int i2) {
        if (!pf3.a(this.j, j)) {
            this.h = i;
            this.i = i2;
            this.j = j;
            R();
            return;
        }
        int i3 = this.h;
        vw8 vw8Var = this.d;
        if (i3 != i) {
            vw8Var.offsetLeftAndRight(i - i3);
        }
        int i4 = this.i;
        if (i4 != i2) {
            vw8Var.offsetTopAndBottom(i2 - i4);
        }
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.zt2
    public final void l(sm0 sm0Var) {
        Rect rect;
        boolean z = this.k;
        vw8 vw8Var = this.d;
        if (z) {
            if ((this.m || vw8Var.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = vw8Var.getWidth();
                rect.bottom = vw8Var.getHeight();
            } else {
                rect = null;
            }
            vw8Var.setClipBounds(rect);
        }
        Canvas canvas = fb.a;
        if (((eb) sm0Var).a.isHardwareAccelerated()) {
            this.b.a(sm0Var, vw8Var, vw8Var.getDrawingTime());
        }
    }

    @Override // defpackage.zt2
    public final int m() {
        return this.p;
    }

    @Override // defpackage.zt2
    public final g60 n() {
        return this.o;
    }

    @Override // defpackage.zt2
    public final void o(float f) {
        this.u = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.zt2
    public final float p() {
        return this.B;
    }

    @Override // defpackage.zt2
    public final void q(g60 g60Var) {
        this.o = g60Var;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(g60Var != null ? g60Var.a : null);
        S();
    }

    @Override // defpackage.zt2
    public final float s() {
        return this.C;
    }

    @Override // defpackage.zt2
    public final void t(long j) {
        this.s = j;
        this.r = (j & 9223372034707292159L) == 9205357640488583168L;
        T();
    }

    @Override // defpackage.zt2
    public final long u() {
        return this.y;
    }

    @Override // defpackage.zt2
    public final void v(float f) {
        this.q = f;
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
        int i5 = this.D;
        if (i == i5 && i2 == this.E && i3 == this.F && i4 == this.G) {
            return;
        }
        boolean z = (i == i5 && i2 == this.E) ? false : true;
        this.D = i;
        this.E = i2;
        this.F = i3;
        this.G = i4;
        R();
        if (z) {
            T();
        }
    }

    @Override // defpackage.zt2
    public final float x() {
        return this.w;
    }

    @Override // defpackage.zt2
    public final long y() {
        return this.z;
    }

    @Override // defpackage.zt2
    public final void z(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.y = j;
            en.V(this.d, z51.U(j));
        }
    }
}

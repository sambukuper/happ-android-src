package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import io.sentry.c2;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class gr4 extends Drawable implements n77 {
    public static final Paint G0;
    public static final fr4[] H0;
    public a77 A0;
    public uf7 B0;
    public final tf7[] C0;
    public float[] D0;
    public float[] E0;
    public o61 F0;
    public final vk1 X;
    public er4 Y;
    public final k77[] Z;
    public final k77[] f0;
    public final BitSet g0;
    public boolean h0;
    public boolean i0;
    public final Matrix j0;
    public final Path k0;
    public final Path l0;
    public final RectF m0;
    public final RectF n0;
    public final Region o0;
    public final Region p0;
    public final Paint q0;
    public final Paint r0;
    public final v67 s0;
    public final q02 t0;
    public final p91 u0;
    public PorterDuffColorFilter v0;
    public PorterDuffColorFilter w0;
    public final RectF x0;
    public boolean y0;
    public boolean z0;

    static {
        Paint paint = new Paint(1);
        G0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        H0 = new fr4[4];
        int i = 0;
        while (true) {
            fr4[] fr4VarArr = H0;
            if (i >= fr4VarArr.length) {
                return;
            }
            fr4VarArr[i] = new fr4(i);
            i++;
        }
    }

    public gr4(er4 er4Var) {
        this.X = new vk1((Object) this, (byte) 26);
        this.Z = new k77[4];
        this.f0 = new k77[4];
        this.g0 = new BitSet(8);
        this.j0 = new Matrix();
        this.k0 = new Path();
        this.l0 = new Path();
        this.m0 = new RectF();
        this.n0 = new RectF();
        this.o0 = new Region();
        this.p0 = new Region();
        Paint paint = new Paint(1);
        this.q0 = paint;
        Paint paint2 = new Paint(1);
        this.r0 = paint2;
        this.s0 = new v67();
        this.u0 = p91.h();
        this.x0 = new RectF();
        this.y0 = true;
        this.z0 = true;
        this.C0 = new tf7[4];
        this.Y = er4Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        D();
        B(getState());
        this.t0 = new q02((Object) this, (byte) 21);
    }

    public final void A(float f) {
        this.Y.k = f;
        invalidateSelf();
    }

    public final boolean B(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.Y.c == null || color2 == (colorForState2 = this.Y.c.getColorForState(iArr, (color2 = (paint2 = this.q0).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.Y.d == null || color == (colorForState = this.Y.d.getColorForState(iArr, (color = (paint = this.r0).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    public final void C(boolean z, int[] iArr) {
        boolean z2;
        m61 m61Var;
        RectF rectFI = i();
        if (!this.Y.a.f() || rectFI.isEmpty()) {
            return;
        }
        int i = 0;
        boolean z3 = z | (this.B0 == null);
        if (this.D0 == null) {
            this.D0 = new float[4];
        }
        a77 a77VarB = this.Y.a.b(iArr);
        float[] fArr = this.D0;
        if (fArr.length > 1) {
            float f = fArr[0];
            int i2 = 1;
            while (true) {
                if (i2 < fArr.length) {
                    if (fArr[i2] == f) {
                        i2++;
                    }
                } else if (a77VarB.j(i())) {
                    z2 = true;
                }
                z2 = false;
            }
        } else if (a77VarB.j(i())) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.z0 = z2;
        if (!z2) {
            this.h0 = true;
            this.i0 = true;
        }
        while (i < 4) {
            this.u0.getClass();
            if (i == 1) {
                m61Var = a77VarB.g;
            } else if (i != 2) {
                m61Var = i != 3 ? a77VarB.f : a77VarB.e;
            } else {
                m61Var = a77VarB.h;
            }
            float fA = m61Var.a(rectFI);
            if (z3) {
                this.D0[i] = fA;
            }
            tf7[] tf7VarArr = this.C0;
            tf7 tf7Var = tf7VarArr[i];
            if (tf7Var != null) {
                tf7Var.a(fA);
                if (z3) {
                    tf7VarArr[i].f();
                }
            }
            i++;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    public final boolean D() {
        PorterDuffColorFilter porterDuffColorFilter = this.v0;
        PorterDuffColorFilter porterDuffColorFilter2 = this.w0;
        er4 er4Var = this.Y;
        this.v0 = d(er4Var.f, er4Var.g, this.q0, true);
        er4 er4Var2 = this.Y;
        this.w0 = d(er4Var2.e, er4Var2.g, this.r0, false);
        this.Y.getClass();
        return (Objects.equals(porterDuffColorFilter, this.v0) && Objects.equals(porterDuffColorFilter2, this.w0)) ? false : true;
    }

    public final void E() {
        er4 er4Var = this.Y;
        float f = er4Var.n + 0.0f;
        er4Var.p = (int) Math.ceil(0.75f * f);
        this.Y.q = (int) Math.ceil(f * 0.25f);
        D();
        if (n() || !q()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        this.u0.a(this.Y.a.d(), this.D0, this.Y.j, rectF, this.t0, path);
        if (this.Y.i != 1.0f) {
            Matrix matrix = this.j0;
            matrix.reset();
            float f = this.Y.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.x0, true);
    }

    public final float c(RectF rectF, a77 a77Var, float[] fArr) {
        if (fArr == null) {
            if (a77Var.j(rectF)) {
                return a77Var.e.a(rectF);
            }
            return -1.0f;
        }
        if (this.z0) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        int color;
        int iE;
        if (colorStateList == null || mode == null) {
            if (!z || (iE = e((color = paint.getColor()))) == color) {
                return null;
            }
            return new PorterDuffColorFilter(iE, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = e(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.v0;
        Paint paint2 = this.q0;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.Y.l;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.w0;
        Paint paint3 = this.r0;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.Y.k);
        int alpha2 = paint3.getAlpha();
        int i2 = this.Y.l;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = n() || !q();
        Paint.Style style = this.Y.r;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z2 = this.h0;
            paint = paint2;
            Path path = this.k0;
            if (z2) {
                if (z) {
                    b(i(), path);
                }
                this.h0 = false;
            }
            if (n()) {
                canvas.save();
                canvas.translate((int) (((double) this.Y.q) * Math.sin(Math.toRadians(0.0d))), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.Y.q)));
                if (this.y0) {
                    Rect bounds = getBounds();
                    RectF rectF = this.x0;
                    int iWidth = (int) (rectF.width() - bounds.width());
                    int iHeight = (int) (rectF.height() - bounds.height());
                    if (iWidth < 0 || iHeight < 0) {
                        c2.l(oi0.r(iWidth, "Invalid shadow bounds. Check that the treatments result in a valid path. extra width: ", iHeight, " extra height: ", " path bounds: "), rectF);
                        return;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.Y.p * 2) + ((int) rectF.width()) + iWidth, (this.Y.p * 2) + ((int) rectF.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    int i3 = bounds.left;
                    int i4 = this.Y.p;
                    float f = (i3 - i4) - iWidth;
                    float f2 = (bounds.top - i4) - iHeight;
                    canvas2.translate(-f, -f2);
                    f(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    f(canvas);
                    canvas.restore();
                }
            }
            g(canvas, paint, path, this.Y.a.d(), this.D0, i());
        } else {
            paint = paint2;
        }
        if (o()) {
            if (this.i0) {
                a77 a77VarK = k();
                z67 z67VarK = a77VarK.k();
                m61 m61Var = a77VarK.e;
                vk1 vk1Var = this.X;
                z67VarK.e = vk1Var.A(m61Var);
                z67VarK.f = vk1Var.A(a77VarK.f);
                z67VarK.h = vk1Var.A(a77VarK.h);
                z67VarK.g = vk1Var.A(a77VarK.g);
                this.A0 = z67VarK.a();
                float[] fArr = this.D0;
                if (fArr != null) {
                    if (this.E0 == null) {
                        this.E0 = new float[fArr.length];
                    }
                    float fL = l();
                    int i5 = 0;
                    while (true) {
                        float[] fArr2 = this.D0;
                        if (i5 >= fArr2.length) {
                            break;
                        }
                        this.E0[i5] = Math.max(0.0f, fArr2[i5] - fL);
                        i5++;
                    }
                } else {
                    this.E0 = null;
                }
                if (z) {
                    a77 a77Var = this.A0;
                    float[] fArr3 = this.E0;
                    float f3 = this.Y.j;
                    RectF rectFI = i();
                    RectF rectF2 = this.n0;
                    rectF2.set(rectFI);
                    float fL2 = l();
                    rectF2.inset(fL2, fL2);
                    this.u0.a(a77Var, fArr3, f3, rectF2, null, this.l0);
                }
                this.i0 = false;
            }
            h(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final int e(int i) {
        int i2;
        er4 er4Var = this.Y;
        float f = er4Var.n + 0.0f + er4Var.m;
        sy1 sy1Var = er4Var.b;
        if (sy1Var == null || !sy1Var.a || qw0.d(i, 255) != sy1Var.d) {
            return i;
        }
        float f2 = sy1Var.e;
        float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iN = yn0.N(qw0.d(i, 255), fMin, sy1Var.b);
        if (fMin > 0.0f && (i2 = sy1Var.c) != 0) {
            iN = qw0.b(qw0.d(i2, sy1.f), iN);
        }
        return qw0.d(iN, iAlpha);
    }

    public final void f(Canvas canvas) {
        this.g0.cardinality();
        int i = this.Y.q;
        Path path = this.k0;
        v67 v67Var = this.s0;
        if (i != 0) {
            canvas.drawPath(path, (Paint) v67Var.d);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            k77 k77Var = this.Z[i2];
            int i3 = this.Y.p;
            Matrix matrix = k77.b;
            k77Var.a(matrix, v67Var, i3, canvas);
            this.f0[i2].a(matrix, v67Var, this.Y.p, canvas);
        }
        if (this.y0) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.Y.q));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.Y.q));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, G0);
            canvas.translate(iSin, iCos);
        }
    }

    public final void g(Canvas canvas, Paint paint, Path path, a77 a77Var, float[] fArr, RectF rectF) {
        float fC = c(rectF, a77Var, fArr);
        if (fC < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fC * this.Y.j;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.Y.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.Y;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.Y.o == 2) {
            return;
        }
        RectF rectFI = i();
        if (rectFI.isEmpty()) {
            return;
        }
        float fC = c(rectFI, this.Y.a.d(), this.D0);
        if (fC >= 0.0f) {
            outline.setRoundRect(getBounds(), fC * this.Y.j);
            return;
        }
        boolean z = this.h0;
        Path path = this.k0;
        if (z) {
            b(rectFI, path);
            this.h0 = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            cw1.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                bw1.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            bw1.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.Y.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.o0;
        region.set(bounds);
        RectF rectFI = i();
        Path path = this.k0;
        b(rectFI, path);
        Region region2 = this.p0;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public void h(Canvas canvas) {
        a77 a77Var = this.A0;
        float[] fArr = this.E0;
        RectF rectFI = i();
        RectF rectF = this.n0;
        rectF.set(rectFI);
        float fL = l();
        rectF.inset(fL, fL);
        g(canvas, this.r0, this.l0, a77Var, fArr, rectF);
    }

    public final RectF i() {
        Rect bounds = getBounds();
        RectF rectF = this.m0;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.h0 = true;
        this.i0 = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.Y.f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.Y.e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.Y.d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.Y.c;
        return (colorStateList4 != null && colorStateList4.isStateful()) || this.Y.a.f();
    }

    public final float j() {
        float[] fArr = this.D0;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFI = i();
        a77 a77VarK = k();
        p91 p91Var = this.u0;
        p91Var.getClass();
        float fA = a77VarK.e.a(rectFI);
        a77 a77VarK2 = k();
        p91Var.getClass();
        float fA2 = a77VarK2.h.a(rectFI) + fA;
        a77 a77VarK3 = k();
        p91Var.getClass();
        float fA3 = fA2 - a77VarK3.g.a(rectFI);
        a77 a77VarK4 = k();
        p91Var.getClass();
        return (fA3 - a77VarK4.f.a(rectFI)) / 2.0f;
    }

    public final a77 k() {
        return this.Y.a.d();
    }

    public final float l() {
        if (o()) {
            return this.r0.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float m() {
        float[] fArr = this.D0;
        return fArr != null ? fArr[3] : this.Y.a.d().e.a(i());
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.Y = new er4(this.Y);
        return this;
    }

    public final boolean n() {
        er4 er4Var = this.Y;
        byte b = er4Var.o;
        if (b == 1 || er4Var.p <= 0) {
            return false;
        }
        return b == 2 || !(q() || this.k0.isConvex() || Build.VERSION.SDK_INT >= 29);
    }

    public final boolean o() {
        Paint.Style style = this.Y.r;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.r0.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.h0 = true;
        this.i0 = true;
        super.onBoundsChange(rect);
        if (!this.Y.a.f() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        boolean z = false;
        for (tf7 tf7Var : this.C0) {
            if (tf7Var != null && tf7Var.f) {
                z = true;
                break;
            }
        }
        C(true ^ z, state);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.Y.a.f()) {
            C(false, iArr);
        }
        boolean z = B(iArr) || D();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p(Context context) {
        this.Y.b = new sy1(context);
        E();
    }

    public final boolean q() {
        if (this.Y.a.b(getState()).j(i())) {
            return this.D0 == null || this.z0;
        }
        return false;
    }

    public final void r(uf7 uf7Var) {
        if (this.B0 == uf7Var) {
            return;
        }
        this.B0 = uf7Var;
        int i = 0;
        while (true) {
            tf7[] tf7VarArr = this.C0;
            if (i >= tf7VarArr.length) {
                C(true, getState());
                invalidateSelf();
                return;
            }
            if (tf7VarArr[i] == null) {
                tf7VarArr[i] = new tf7(this, H0[i]);
            }
            tf7 tf7Var = tf7VarArr[i];
            uf7 uf7Var2 = new uf7();
            uf7Var2.a((float) uf7Var.b);
            double d = uf7Var.a;
            uf7Var2.b((float) (d * d));
            tf7Var.m = uf7Var2;
            i++;
        }
    }

    public final void s(float f) {
        er4 er4Var = this.Y;
        if (er4Var.n != f) {
            er4Var.n = f;
            E();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        er4 er4Var = this.Y;
        if (er4Var.l != i) {
            er4Var.l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.Y.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.n77
    public final void setShapeAppearanceModel(a77 a77Var) {
        this.Y.a = a77Var;
        this.D0 = null;
        this.E0 = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.Y.f = colorStateList;
        D();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        er4 er4Var = this.Y;
        if (er4Var.g != mode) {
            er4Var.g = mode;
            D();
            super.invalidateSelf();
        }
    }

    public final void t(ColorStateList colorStateList) {
        er4 er4Var = this.Y;
        if (er4Var.c != colorStateList) {
            er4Var.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void u(float f) {
        er4 er4Var = this.Y;
        if (er4Var.j != f) {
            er4Var.j = f;
            this.h0 = true;
            this.i0 = true;
            invalidateSelf();
        }
    }

    public final void v() {
        this.s0.a(-12303292);
        this.Y.getClass();
        super.invalidateSelf();
    }

    public final void w() {
        er4 er4Var = this.Y;
        if (er4Var.o != 2) {
            er4Var.o = (byte) 2;
            super.invalidateSelf();
        }
    }

    public final void x(y67 y67Var) {
        if (y67Var instanceof a77) {
            setShapeAppearanceModel((a77) y67Var);
            return;
        }
        th7 th7Var = (th7) y67Var;
        er4 er4Var = this.Y;
        if (er4Var.a != th7Var) {
            er4Var.a = th7Var;
            C(true, getState());
            invalidateSelf();
        }
    }

    public final void y(ColorStateList colorStateList) {
        er4 er4Var = this.Y;
        if (er4Var.d != colorStateList) {
            er4Var.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void z(ColorStateList colorStateList) {
        this.Y.e = colorStateList;
        D();
        super.invalidateSelf();
    }

    public gr4(Context context, AttributeSet attributeSet, int i, int i2) {
        this(a77.g(context, attributeSet, i, i2).a());
    }

    public gr4(a77 a77Var) {
        this(new er4(a77Var));
    }

    public gr4(y67 y67Var) {
        this(new er4(y67Var));
    }

    public gr4() {
        this(new a77());
    }
}

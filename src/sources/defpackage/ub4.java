package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ub4 implements View.OnTouchListener {
    public static final int s0 = ViewConfiguration.getTapTimeout();
    public final lx X;
    public final AccelerateInterpolator Y;
    public final qw1 Z;
    public xb f0;
    public final float[] g0;
    public final float[] h0;
    public final int i0;
    public final float[] j0;
    public final float[] k0;
    public final float[] l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public final qw1 r0;

    public ub4(qw1 qw1Var) {
        lx lxVar = new lx();
        lxVar.e = Long.MIN_VALUE;
        lxVar.g = -1L;
        lxVar.f = 0L;
        this.X = lxVar;
        this.Y = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.g0 = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.h0 = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.j0 = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.k0 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.l0 = fArr5;
        this.Z = qw1Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.i0 = s0;
        lxVar.a = (short) 500;
        lxVar.b = (short) 500;
        this.r0 = qw1Var;
    }

    public static float b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(float f, float f2, float f3, int i) {
        float fB;
        float interpolation;
        float fB2 = b(this.g0[i] * f2, 0.0f, this.h0[i]);
        float fC = c(f2 - f, fB2) - c(f, fB2);
        AccelerateInterpolator accelerateInterpolator = this.Y;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f4 = this.j0[i];
            float f5 = this.k0[i];
            float f6 = this.l0[i];
            float f7 = f4 * f3;
            return fB > 0.0f ? b(fB * f7, f5, f6) : -b((-fB) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f8 = this.j0[i];
        float f9 = this.k0[i];
        float f10 = this.l0[i];
        float f11 = f8 * f3;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f && f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.p0) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.n0) {
            this.p0 = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        lx lxVar = this.X;
        int i2 = (int) (jCurrentAnimationTimeMillis - lxVar.e);
        short s = lxVar.b;
        if (i2 > s) {
            i = s;
        } else if (i2 >= 0) {
            i = i2;
        }
        lxVar.i = i;
        lxVar.h = lxVar.a(jCurrentAnimationTimeMillis);
        lxVar.g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        qw1 qw1Var;
        int count;
        lx lxVar = this.X;
        float f = lxVar.d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(lxVar.c);
        if (iAbs != 0 && (count = (qw1Var = this.r0).getCount()) != 0) {
            int childCount = qw1Var.getChildCount();
            int firstVisiblePosition = qw1Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && qw1Var.getChildAt(0).getTop() >= 0)) : !(i >= count && qw1Var.getChildAt(childCount - 1).getBottom() <= qw1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
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
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.q0
            r1 = 0
            if (r0 != 0) goto L7
            goto L78
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L78
        L17:
            r7.d()
            return r1
        L1b:
            r7.o0 = r2
            r7.m0 = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            qw1 r4 = r7.Z
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            lx r9 = r7.X
            r9.c = r0
            r9.d = r8
            boolean r8 = r7.p0
            if (r8 != 0) goto L78
            boolean r8 = r7.e()
            if (r8 == 0) goto L78
            xb r8 = r7.f0
            if (r8 != 0) goto L60
            xb r8 = new xb
            r8.<init>(r7, r2)
            r7.f0 = r8
        L60:
            r7.p0 = r2
            r7.n0 = r2
            boolean r9 = r7.m0
            if (r9 != 0) goto L73
            int r9 = r7.i0
            if (r9 <= 0) goto L73
            long r5 = (long) r9
            java.util.WeakHashMap r9 = defpackage.cw8.a
            r4.postOnAnimationDelayed(r8, r5)
            goto L76
        L73:
            r8.run()
        L76:
            r7.m0 = r2
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub4.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}

package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vw8 extends View {
    public static final nu0 r0 = new nu0((byte) 4);
    public final pv1 f0;
    public final vm0 g0;
    public final um0 h0;
    public boolean i0;
    public Outline j0;
    public boolean k0;
    public fi1 l0;
    public z24 m0;
    public gn2 n0;
    public xt2 o0;
    public float p0;
    public float q0;

    public vw8(pv1 pv1Var, vm0 vm0Var, um0 um0Var) {
        super(pv1Var.getContext());
        this.f0 = pv1Var;
        this.g0 = vm0Var;
        this.h0 = um0Var;
        setOutlineProvider(r0);
        this.k0 = true;
        this.l0 = z39.Z;
        this.m0 = z24.X;
        zt2.a.getClass();
        this.n0 = ti.x0;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f = this.p0;
        um0 um0Var = this.h0;
        vm0 vm0Var = this.g0;
        if (f > 0.0f || this.q0 > 0.0f) {
            int iSave = canvas.save();
            canvas.translate(this.p0, this.q0);
            eb ebVar = vm0Var.a;
            Canvas canvas2 = ebVar.a;
            ebVar.a = canvas;
            fi1 fi1Var = this.l0;
            z24 z24Var = this.m0;
            float width = getWidth();
            long jFloatToRawIntBits = (4294967295L & ((long) Float.floatToRawIntBits(getHeight()))) | (Float.floatToRawIntBits(width) << 32);
            xt2 xt2Var = this.o0;
            gn2 gn2Var = this.n0;
            lr lrVar = um0Var.Y;
            lr lrVar2 = um0Var.Y;
            fi1 fi1VarM = lrVar.m();
            z24 z24VarO = lrVar2.o();
            sm0 sm0VarK = lrVar2.k();
            long jP = lrVar2.p();
            xt2 xt2Var2 = (xt2) lrVar2.Z;
            lrVar2.B(fi1Var);
            lrVar2.C(z24Var);
            lrVar2.A(ebVar);
            lrVar2.D(jFloatToRawIntBits);
            lrVar2.Z = xt2Var;
            ebVar.g();
            try {
                gn2Var.B(um0Var);
                ebVar.p();
                lrVar2.B(fi1VarM);
                lrVar2.C(z24VarO);
                lrVar2.A(sm0VarK);
                lrVar2.D(jP);
                lrVar2.Z = xt2Var2;
                vm0Var.a.a = canvas2;
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                ebVar.p();
                lrVar2.B(fi1VarM);
                lrVar2.C(z24VarO);
                lrVar2.A(sm0VarK);
                lrVar2.D(jP);
                lrVar2.Z = xt2Var2;
                throw th;
            }
        } else {
            eb ebVar2 = vm0Var.a;
            Canvas canvas3 = ebVar2.a;
            ebVar2.a = canvas;
            fi1 fi1Var2 = this.l0;
            z24 z24Var2 = this.m0;
            float width2 = getWidth();
            long jFloatToRawIntBits2 = (4294967295L & ((long) Float.floatToRawIntBits(getHeight()))) | (Float.floatToRawIntBits(width2) << 32);
            xt2 xt2Var3 = this.o0;
            gn2 gn2Var2 = this.n0;
            lr lrVar3 = um0Var.Y;
            lr lrVar4 = um0Var.Y;
            fi1 fi1VarM2 = lrVar3.m();
            z24 z24VarO2 = lrVar4.o();
            sm0 sm0VarK2 = lrVar4.k();
            long jP2 = lrVar4.p();
            xt2 xt2Var4 = (xt2) lrVar4.Z;
            lrVar4.B(fi1Var2);
            lrVar4.C(z24Var2);
            lrVar4.A(ebVar2);
            lrVar4.D(jFloatToRawIntBits2);
            lrVar4.Z = xt2Var3;
            ebVar2.g();
            try {
                gn2Var2.B(um0Var);
                ebVar2.p();
                lrVar4.B(fi1VarM2);
                lrVar4.C(z24VarO2);
                lrVar4.A(sm0VarK2);
                lrVar4.D(jP2);
                lrVar4.Z = xt2Var4;
                vm0Var.a.a = canvas3;
            } catch (Throwable th2) {
                ebVar2.p();
                lrVar4.B(fi1VarM2);
                lrVar4.C(z24VarO2);
                lrVar4.A(sm0VarK2);
                lrVar4.D(jP2);
                lrVar4.Z = xt2Var4;
                throw th2;
            }
        }
        this.i0 = false;
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.k0;
    }

    public final vm0 getCanvasHolder() {
        return this.g0;
    }

    public final View getOwnerView() {
        return this.f0;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.k0;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.i0) {
            return;
        }
        this.i0 = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.k0 != z) {
            this.k0 = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.i0 = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}

package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pz0 implements ScrollCaptureCallback {
    public final y07 a;
    public final lf3 b;
    public final p41 c;
    public final AndroidComposeView d;
    public final m51 e;
    public final u03 f;

    public pz0(y07 y07Var, lf3 lf3Var, m51 m51Var, p41 p41Var, AndroidComposeView androidComposeView) {
        this.a = y07Var;
        this.b = lf3Var;
        this.c = p41Var;
        this.d = androidComposeView;
        this.e = new m51(m51Var.Y.B0(gp1.Y));
        this.f = new u03(lf3Var.b(), new oz0(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ScrollCaptureSession scrollCaptureSession, lf3 lf3Var, s51 s51Var) {
        nz0 nz0Var;
        int i;
        int i2;
        ScrollCaptureSession scrollCaptureSession2;
        int i3;
        lf3 lf3Var2;
        int i4;
        int iN;
        int iN2;
        int i5;
        int i6;
        Canvas canvasLockHardwareCanvas;
        if (s51Var instanceof nz0) {
            nz0Var = (nz0) s51Var;
            int i7 = nz0Var.l0;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                nz0Var.l0 = i7 - Integer.MIN_VALUE;
            } else {
                nz0Var = new nz0(this, s51Var);
            }
        } else {
            nz0Var = new nz0(this, s51Var);
        }
        Object obj = nz0Var.j0;
        int i8 = nz0Var.l0;
        u03 u03Var = this.f;
        c71 c71Var = c71.X;
        if (i8 == 0) {
            w39.n0(obj);
            i = lf3Var.b;
            i2 = lf3Var.d;
            nz0Var.f0 = scrollCaptureSession;
            nz0Var.g0 = lf3Var;
            nz0Var.h0 = i;
            nz0Var.i0 = i2;
            nz0Var.l0 = 1;
            if (i > i2) {
                u03Var.getClass();
                u52.l("Expected min=", i, i2, " ≤ max=");
                return null;
            }
            int i9 = i2 - i;
            int i10 = u03Var.a;
            if (i9 > i10) {
                em7.c(pc6.m("Expected range (", i9, i10, ") to be ≤ viewportSize="));
                return null;
            }
            Object objB = u03Var.b((((i9 / 2) + i) - (i10 / 2)) - u03Var.b, nz0Var);
            Object obj2 = dn8.a;
            if (objB != c71Var) {
                objB = obj2;
            }
            if (objB == c71Var) {
                obj2 = objB;
            }
            if (obj2 != c71Var) {
            }
            return c71Var;
        }
        if (i8 == 1) {
            int i11 = nz0Var.i0;
            int i12 = nz0Var.h0;
            lf3 lf3Var3 = nz0Var.g0;
            ScrollCaptureSession scrollCaptureSession3 = (ScrollCaptureSession) nz0Var.f0;
            w39.n0(obj);
            i = i12;
            lf3Var = lf3Var3;
            i2 = i11;
            scrollCaptureSession = scrollCaptureSession3;
        } else {
            if (i8 != 2) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = nz0Var.i0;
            i4 = nz0Var.h0;
            lf3Var2 = nz0Var.g0;
            scrollCaptureSession2 = (ScrollCaptureSession) nz0Var.f0;
            w39.n0(obj);
        }
        iN = x97.n(i4 - nr4.O(u03Var.b), 0, u03Var.a);
        iN2 = x97.n(i3 - nr4.O(u03Var.b), 0, u03Var.a);
        i5 = lf3Var2.a;
        i6 = lf3Var2.c;
        if (iN == iN2) {
            return lf3.e;
        }
        canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iN);
            lf3 lf3Var4 = this.b;
            canvasLockHardwareCanvas.translate(-lf3Var4.a, -lf3Var4.b);
            this.d.getRootView().draw(canvasLockHardwareCanvas);
            int iO = nr4.O(u03Var.b);
            return new lf3(i5, iN + iO, i6, iN2 + iO);
        } finally {
            scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        h80 h80Var = new h80((byte) 5);
        nz0Var.f0 = scrollCaptureSession;
        nz0Var.g0 = lf3Var;
        nz0Var.h0 = i;
        nz0Var.i0 = i2;
        nz0Var.l0 = 2;
        s61 s61Var = nz0Var.Y;
        s61Var.getClass();
        if (z68.H(s61Var).a(h80Var, nz0Var) != c71Var) {
            scrollCaptureSession2 = scrollCaptureSession;
            i3 = i2;
            lf3Var2 = lf3Var;
            i4 = i;
            iN = x97.n(i4 - nr4.O(u03Var.b), 0, u03Var.a);
            iN2 = x97.n(i3 - nr4.O(u03Var.b), 0, u03Var.a);
            i5 = lf3Var2.a;
            i6 = lf3Var2.c;
            if (iN == iN2) {
                return lf3.e;
            }
            canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iN);
            lf3 lf3Var5 = this.b;
            canvasLockHardwareCanvas.translate(-lf3Var5.a, -lf3Var5.b);
            this.d.getRootView().draw(canvasLockHardwareCanvas);
            int iO2 = nr4.O(u03Var.b);
            return new lf3(i5, iN + iO2, i6, iN2 + iO2);
        }
        return c71Var;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        w51.G(this.e, r55.Y, null, new q0(this, runnable, null, (byte) 14), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        og7 og7VarG = w51.G(this.e, null, null, new pi(this, scrollCaptureSession, rect, consumer, null, (byte) 1), 3);
        og7VarG.D(new y0((Object) cancellationSignal, (byte) 17));
        cancellationSignal.setOnCancelListener(new qz0(og7VarG, (byte) 0));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(pu.S(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        ((rh5) this.c.b).setValue(Boolean.TRUE);
        runnable.run();
    }
}

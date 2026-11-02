package defpackage;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class by7 implements Closeable {
    public final Surface Y;
    public final int Z;
    public final Size f0;
    public final float[] g0;
    public final float[] h0;
    public d41 i0;
    public Executor j0;
    public final ud0 m0;
    public final qd0 n0;
    public final Object X = new Object();
    public boolean k0 = false;
    public boolean l0 = false;

    public by7(Surface surface, int i, Size size, jz jzVar, jz jzVar2) {
        float[] fArr = new float[16];
        this.g0 = fArr;
        float[] fArr2 = new float[16];
        this.h0 = fArr2;
        this.Y = surface;
        this.Z = i;
        this.f0 = size;
        g(fArr, new float[16], jzVar);
        g(fArr2, new float[16], jzVar2);
        qd0 qd0Var = new qd0();
        qd0Var.c = new if6();
        ud0 ud0Var = new ud0(qd0Var);
        qd0Var.b = ud0Var;
        try {
            this.n0 = qd0Var;
            qd0Var.a = "SurfaceOutputImpl close future complete";
        } catch (Exception e) {
            ud0Var.b(e);
        }
        this.m0 = ud0Var;
    }

    public static void g(float[] fArr, float[] fArr2, jz jzVar) {
        Matrix.setIdentityM(fArr, 0);
        if (jzVar == null) {
            return;
        }
        Size size = jzVar.a;
        boolean z = jzVar.e;
        int i = jzVar.d;
        g33.M(fArr);
        g33.L(fArr, i);
        if (z) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeG = hd8.g(i, size);
        android.graphics.Matrix matrixA = hd8.a(hd8.h(size), hd8.h(sizeG), i, z);
        RectF rectF = new RectF(jzVar.b);
        matrixA.mapRect(rectF);
        float width = rectF.left / sizeG.getWidth();
        float height = ((sizeG.getHeight() - rectF.height()) - rectF.top) / sizeG.getHeight();
        float fWidth = rectF.width() / sizeG.getWidth();
        float fHeight = rectF.height() / sizeG.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        cj0 cj0Var = jzVar.c;
        Matrix.setIdentityM(fArr2, 0);
        g33.M(fArr2);
        if (cj0Var != null) {
            mb6.s("Camera has no transform.", cj0Var.q());
            g33.L(fArr2, cj0Var.c().c());
            if (cj0Var.e()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.X) {
            try {
                if (!this.l0) {
                    this.l0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.n0.b(null);
    }

    public final Surface k(lv2 lv2Var, d41 d41Var) {
        boolean z;
        synchronized (this.X) {
            this.j0 = lv2Var;
            this.i0 = d41Var;
            z = this.k0;
        }
        if (z) {
            m();
        }
        return this.Y;
    }

    public final void m() {
        Executor executor;
        d41 d41Var;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.X) {
            try {
                if (this.j0 == null || (d41Var = this.i0) == null) {
                    this.k0 = true;
                } else if (!this.l0) {
                    atomicReference.set(d41Var);
                    executor = this.j0;
                    this.k0 = false;
                }
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new sc4((Object) this, (Object) atomicReference, (byte) 13));
            } catch (RejectedExecutionException unused) {
                hi5.z0("SurfaceOutputImpl");
            }
        }
    }
}

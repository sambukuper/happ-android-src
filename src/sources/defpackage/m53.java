package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m53 implements p63 {
    public f53 X;
    public volatile int Y;
    public volatile int Z;
    public volatile boolean g0;
    public volatile boolean h0;
    public Executor i0;
    public z76 j0;
    public ImageWriter k0;
    public ByteBuffer p0;
    public ByteBuffer q0;
    public ByteBuffer r0;
    public ByteBuffer s0;
    public ByteBuffer t0;
    public ByteBuffer u0;
    public volatile int f0 = 1;
    public Rect l0 = new Rect();
    public Rect m0 = new Rect();
    public Matrix n0 = new Matrix();
    public Matrix o0 = new Matrix();
    public final Object v0 = new Object();
    public boolean w0 = true;

    public n63 a(q63 q63Var) {
        return q63Var.v();
    }

    public final xb4 b(final n63 n63Var) throws Throwable {
        Object obj;
        Executor executor;
        final f53 f53Var;
        boolean z;
        z76 z76Var;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer6;
        q53 q53VarH;
        q53 q53Var;
        int i = this.g0 ? this.Y : 0;
        Object obj2 = this.v0;
        synchronized (obj2) {
            try {
                try {
                    executor = this.i0;
                    f53Var = this.X;
                    z = this.g0 && i != this.Z;
                    if (z) {
                        g(n63Var, i);
                    }
                    if (this.g0 || this.f0 == 3) {
                        d(n63Var);
                    }
                    try {
                        z76Var = this.j0;
                        try {
                            imageWriter = this.k0;
                            byteBuffer = this.p0;
                            byteBuffer2 = this.q0;
                            byteBuffer3 = this.r0;
                            byteBuffer4 = this.s0;
                            byteBuffer5 = this.t0;
                            byteBuffer6 = this.u0;
                        } catch (Throwable th) {
                            th = th;
                            obj = obj2;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
            }
        }
        if (f53Var == null || executor == null || !this.w0) {
            return new u73(new uc5("No analyzer or executor currently set."), (byte) 1);
        }
        int i2 = this.f0;
        if (z76Var != null) {
            if (i2 == 2) {
                q53VarH = ImageProcessingUtil.c(n63Var, z76Var, byteBuffer, i, this.h0);
            } else {
                if (this.f0 == 1) {
                    if (this.h0) {
                        ImageProcessingUtil.a(n63Var);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        q53VarH = ImageProcessingUtil.g(n63Var, z76Var, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i);
                    }
                }
                q53Var = null;
            }
            q53Var = q53VarH;
        } else {
            if (i2 == 3) {
                if (this.h0) {
                    ImageProcessingUtil.a(n63Var);
                }
                if (byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null) {
                    q53VarH = ImageProcessingUtil.h(n63Var, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, i);
                    q53Var = q53VarH;
                }
            }
            q53Var = null;
        }
        boolean z2 = q53Var == null;
        final n63 n63Var2 = z2 ? n63Var : q53Var;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.v0) {
            if (z && !z2) {
                try {
                    f(n63Var.b(), n63Var.a(), n63Var2.b(), n63Var2.a());
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            this.Z = i;
            rect.set(this.m0);
            matrix.set(this.o0);
        }
        final qd0 qd0Var = new qd0();
        qd0Var.c = new if6();
        ud0 ud0Var = new ud0(qd0Var);
        qd0Var.b = ud0Var;
        qd0Var.a = p61.class;
        try {
            executor.execute(new Runnable() { // from class: l53
                @Override // java.lang.Runnable
                public final void run() {
                    m53 m53Var = this.X;
                    n63 n63Var3 = n63Var;
                    Matrix matrix2 = matrix;
                    n63 n63Var4 = n63Var2;
                    Rect rect2 = rect;
                    f53 f53Var2 = f53Var;
                    qd0 qd0Var2 = qd0Var;
                    if (!m53Var.w0) {
                        qd0Var2.d(new uc5("ImageAnalysis is detached"));
                        return;
                    }
                    s57 s57Var = new s57(n63Var4, null, new oy(n63Var3.r0().a(), n63Var3.r0().getTimestamp(), m53Var.g0 ? 0 : m53Var.Y, matrix2, n63Var3.r0().b()));
                    if (!rect2.isEmpty()) {
                        Rect rect3 = new Rect(rect2);
                        if (!rect3.intersect(0, 0, s57Var.h0, s57Var.i0)) {
                            rect3.setEmpty();
                        }
                        synchronized (s57Var.f0) {
                        }
                    }
                    f53Var2.M(s57Var);
                    qd0Var2.b(null);
                }
            });
            qd0Var.a = "analyzeImage";
            return ud0Var;
        } catch (Exception e) {
            ud0Var.b(e);
            return ud0Var;
        }
    }

    public final void d(n63 n63Var) {
        if (this.f0 != 1 && this.f0 != 3) {
            if (this.f0 == 2 && this.p0 == null) {
                this.p0 = ByteBuffer.allocateDirect(n63Var.a() * n63Var.b() * 4);
                return;
            }
            return;
        }
        ByteBuffer byteBufferAllocateDirect = this.q0;
        if (byteBufferAllocateDirect == null) {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(n63Var.a() * n63Var.b());
            this.q0 = byteBufferAllocateDirect;
        }
        byteBufferAllocateDirect.position(0);
        ByteBuffer byteBufferAllocateDirect2 = this.r0;
        if (byteBufferAllocateDirect2 == null) {
            byteBufferAllocateDirect2 = ByteBuffer.allocateDirect((n63Var.a() * n63Var.b()) / 4);
            this.r0 = byteBufferAllocateDirect2;
        }
        byteBufferAllocateDirect2.position(0);
        ByteBuffer byteBufferAllocateDirect3 = this.s0;
        if (byteBufferAllocateDirect3 == null) {
            byteBufferAllocateDirect3 = ByteBuffer.allocateDirect((n63Var.a() * n63Var.b()) / 4);
            this.s0 = byteBufferAllocateDirect3;
        }
        byteBufferAllocateDirect3.position(0);
        if (this.f0 == 3) {
            ByteBuffer byteBufferAllocateDirect4 = this.t0;
            if (byteBufferAllocateDirect4 == null) {
                byteBufferAllocateDirect4 = ByteBuffer.allocateDirect(n63Var.a() * n63Var.b());
                this.t0 = byteBufferAllocateDirect4;
            }
            byteBufferAllocateDirect4.position(0);
            ByteBuffer byteBufferAllocateDirect5 = this.u0;
            if (byteBufferAllocateDirect5 == null) {
                byteBufferAllocateDirect5 = ByteBuffer.allocateDirect((n63Var.a() * n63Var.b()) / 2);
                this.u0 = byteBufferAllocateDirect5;
            }
            byteBufferAllocateDirect5.position(0);
        }
    }

    public void e(n63 n63Var) throws Throwable {
        xb4 xb4VarB = b(n63Var);
        q02 q02Var = new q02((Object) n63Var, (byte) 8);
        xb4VarB.a(new zo2(xb4VarB, q02Var, (byte) 0), dp1.a());
    }

    public final void f(int i, int i2, int i3, int i4) {
        int i5 = this.Y;
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            RectF rectF2 = hd8.a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i5);
            RectF rectF3 = new RectF(0.0f, 0.0f, i3, i4);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.l0);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.m0 = rect;
        this.o0.setConcat(this.n0, matrix);
    }

    public final void g(n63 n63Var, int i) {
        z76 z76Var = this.j0;
        if (z76Var == null) {
            return;
        }
        z76Var.f();
        int iB = n63Var.b();
        int iA = n63Var.a();
        int iE = this.j0.e();
        int iS = this.j0.s();
        boolean z = i == 90 || i == 270;
        int i2 = z ? iA : iB;
        if (!z) {
            iB = iA;
        }
        this.j0 = new z76(z68.x(i2, iB, iE, iS));
        if (this.f0 == 1) {
            ImageWriter imageWriter = this.k0;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.k0 = ImageWriter.newInstance(this.j0.getSurface(), this.j0.s());
        }
    }

    public final void h(Matrix matrix) {
        synchronized (this.v0) {
            this.n0 = matrix;
            this.o0 = new Matrix(this.n0);
        }
    }

    public final void i(Rect rect) {
        synchronized (this.v0) {
            this.l0 = rect;
            this.m0 = new Rect(this.l0);
        }
    }

    @Override // defpackage.p63
    public final void k(q63 q63Var) throws Throwable {
        try {
            n63 n63VarA = a(q63Var);
            if (n63VarA != null) {
                e(n63VarA);
            }
        } catch (IllegalStateException unused) {
            hi5.z0("ImageAnalysisAnalyzer");
        }
    }

    public void c() {
    }
}

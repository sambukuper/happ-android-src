package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jg1 implements cy7, SurfaceTexture.OnFrameAvailableListener {
    public final ib5 a;
    public final HandlerThread b;
    public final lv2 c;
    public final Handler d;
    public final AtomicBoolean e;
    public final float[] f;
    public final float[] g;
    public final LinkedHashMap h;
    public int i;
    public boolean j;
    public final ArrayList k;

    public jg1(px1 px1Var) {
        Map map = Collections.EMPTY_MAP;
        this.e = new AtomicBoolean(false);
        this.f = new float[16];
        this.g = new float[16];
        this.h = new LinkedHashMap();
        this.i = 0;
        this.j = false;
        this.k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new lv2(handler);
        this.a = new ib5();
        try {
            h(px1Var);
        } catch (RuntimeException e) {
            a();
            throw e;
        }
    }

    @Override // defpackage.cy7
    public final void a() {
        if (this.e.getAndSet(true)) {
            return;
        }
        e(new c1(this, (byte) 14), new v7((byte) 5));
    }

    @Override // defpackage.cy7
    public final void b(hy7 hy7Var) {
        if (this.e.get()) {
            hy7Var.c();
        } else {
            e(new sc(this, hy7Var, (byte) 19), new ig1(hy7Var, (byte) 0));
        }
    }

    @Override // defpackage.cy7
    public final void c(by7 by7Var) {
        if (this.e.get()) {
            by7Var.close();
        } else {
            e(new sc(this, by7Var, (byte) 18), new c1(by7Var, (byte) 15));
        }
    }

    public final void d() {
        if (this.j && this.i == 0) {
            LinkedHashMap linkedHashMap = this.h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((by7) it.next()).close();
            }
            Iterator it2 = this.k.iterator();
            if (it2.hasNext()) {
                ((cy) it2.next()).getClass();
                new Exception("Failed to snapshot: DefaultSurfaceProcessor is released.");
                throw null;
            }
            linkedHashMap.clear();
            this.a.h();
            this.b.quit();
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new j0((Object) this, (Object) runnable2, (Object) runnable, (byte) 8));
        } catch (RejectedExecutionException unused) {
            hi5.z0("DefaultSurfaceProcessor");
            runnable2.run();
        }
    }

    public final void f(Exception exc) {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ((cy) it.next()).getClass();
            throw null;
        }
        arrayList.clear();
    }

    public final Bitmap g(Size size, float[] fArr, int i) {
        float[] fArr2 = (float[]) fArr.clone();
        g33.L(fArr2, i);
        g33.M(fArr2);
        Size sizeG = hd8.g(i, size);
        ib5 ib5Var = this.a;
        ib5Var.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeG.getHeight() * sizeG.getWidth() * 4);
        mb6.o(byteBufferAllocateDirect.capacity() == (sizeG.getHeight() * sizeG.getWidth()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        mb6.o(byteBufferAllocateDirect.isDirect(), "ByteBuffer is not direct.");
        int[] iArr = fp2.a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        fp2.b("glGenTextures");
        int i2 = iArr2[0];
        GLES20.glActiveTexture(33985);
        fp2.b("glActiveTexture");
        GLES20.glBindTexture(3553, i2);
        fp2.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeG.getWidth(), sizeG.getHeight(), 0, 6407, 5121, null);
        fp2.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        fp2.b("glGenFramebuffers");
        int i3 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i3);
        fp2.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        fp2.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        fp2.b("glActiveTexture");
        GLES20.glBindTexture(36197, ib5Var.m);
        fp2.b("glBindTexture");
        ib5Var.i = null;
        GLES20.glViewport(0, 0, sizeG.getWidth(), sizeG.getHeight());
        GLES20.glScissor(0, 0, sizeG.getWidth(), sizeG.getHeight());
        dp2 dp2Var = ib5Var.k;
        dp2Var.getClass();
        if (dp2Var instanceof ep2) {
            GLES20.glUniformMatrix4fv(((ep2) dp2Var).f, 1, false, fArr2, 0);
            fp2.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        fp2.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeG.getWidth(), sizeG.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        fp2.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        fp2.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        fp2.b("glDeleteFramebuffers");
        int i4 = ib5Var.m;
        GLES20.glActiveTexture(33984);
        fp2.b("glActiveTexture");
        GLES20.glBindTexture(36197, i4);
        fp2.b("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeG.getWidth(), sizeG.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.d(bitmapCreateBitmap, byteBufferAllocateDirect, sizeG.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public final void h(px1 px1Var) {
        Map map = Collections.EMPTY_MAP;
        qd0 qd0Var = new qd0();
        qd0Var.c = new if6();
        ud0 ud0Var = new ud0(qd0Var);
        qd0Var.b = ud0Var;
        qd0Var.a = p61.class;
        try {
            e(new j0(this, px1Var, qd0Var), new v7((byte) 5));
            qd0Var.a = "Init GlRenderer";
        } catch (Exception e) {
            ud0Var.b(e);
        }
        try {
            ud0Var.get();
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof RuntimeException)) {
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((RuntimeException) e);
        }
    }

    public final void i(yf8 yf8Var) {
        ArrayList arrayList = this.k;
        if (arrayList.isEmpty()) {
            return;
        }
        if (yf8Var == null) {
            f(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    byteArrayOutputStream.close();
                    return;
                }
                ((cy) it.next()).getClass();
                Bitmap bitmapG = g((Size) yf8Var.Y, (float[]) yf8Var.Z, 0);
                byteArrayOutputStream.reset();
                bitmapG.compress(Bitmap.CompressFormat.JPEG, 0, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Surface surface = (Surface) yf8Var.X;
                Objects.requireNonNull(byteArray);
                ImageProcessingUtil.i(byteArray, surface);
                throw null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            f(e);
        }
        f(e);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f;
        surfaceTexture.getTransformMatrix(fArr);
        yf8 yf8Var = null;
        for (Map.Entry entry : this.h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            by7 by7Var = (by7) entry.getKey();
            float[] fArr2 = by7Var.g0;
            float[] fArr3 = this.g;
            Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
            int i = by7Var.Z;
            if (i == 34) {
                try {
                    this.a.k(surfaceTexture.getTimestamp(), fArr3, surface);
                } catch (RuntimeException unused) {
                    hi5.z0("DefaultSurfaceProcessor");
                }
            } else {
                mb6.s("Unsupported format: " + i, i == 256);
                mb6.s("Only one JPEG output is supported.", yf8Var == null);
                yf8Var = new yf8(surface, by7Var.f0, (float[]) fArr3.clone());
            }
        }
        try {
            i(yf8Var);
        } catch (RuntimeException e) {
            f(e);
        }
    }
}

package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import okhttp3.internal.http2.Http2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ax1 extends ib5 {
    public int n = -1;
    public int o = -1;
    public final dq p;
    public final dq q;

    public ax1(dq dqVar, dq dqVar2) {
        this.p = dqVar;
        this.q = dqVar2;
    }

    @Override // defpackage.ib5
    public final ly e(px1 px1Var) {
        Map map = Collections.EMPTY_MAP;
        ly lyVarE = super.e(px1Var);
        this.n = fp2.g();
        this.o = fp2.g();
        return lyVarE;
    }

    @Override // defpackage.ib5
    public final void h() {
        super.h();
        this.n = -1;
        this.o = -1;
    }

    public final void m(long j, Surface surface, by7 by7Var, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        fp2.d(this.a, true);
        fp2.c(this.c);
        HashMap map = this.b;
        mb6.s("The surface is not registered.", map.containsKey(surface));
        yy yyVarB = (yy) map.get(surface);
        Objects.requireNonNull(yyVarB);
        if (yyVarB == fp2.j) {
            yyVarB = b(surface);
            if (yyVarB == null) {
                return;
            } else {
                map.put(surface, yyVarB);
            }
        }
        yy yyVar = yyVarB;
        EGLSurface eGLSurface = yyVar.a;
        if (surface != this.i) {
            f(eGLSurface);
            this.i = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
        n(yyVar, by7Var, surfaceTexture, this.p, this.n, true);
        n(yyVar, by7Var, surfaceTexture2, this.q, this.o, false);
        EGLExt.eglPresentationTimeANDROID(this.d, eGLSurface, j);
        if (EGL14.eglSwapBuffers(this.d, eGLSurface)) {
            return;
        }
        Integer.toHexString(EGL14.eglGetError());
        hi5.z0("DualOpenGlRenderer");
        j(surface, false);
    }

    public final void n(yy yyVar, by7 by7Var, SurfaceTexture surfaceTexture, dq dqVar, int i, boolean z) {
        l(i);
        int i2 = yyVar.b;
        int i3 = yyVar.c;
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glScissor(0, 0, i2, i3);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, z ? by7Var.g0 : by7Var.h0, 0);
        dp2 dp2Var = this.k;
        dp2Var.getClass();
        if (dp2Var instanceof ep2) {
            GLES20.glUniformMatrix4fv(((ep2) dp2Var).f, 1, false, fArr2, 0);
            fp2.b("glUniformMatrix4fv");
        }
        rg5 rg5Var = (rg5) dqVar.Z;
        Object obj = rg5Var.a;
        Object obj2 = rg5Var.b;
        Size size = new Size((int) (((Float) rg5Var.a).floatValue() * i2), (int) (((Float) obj2).floatValue() * i3));
        Size size2 = new Size(i2, i3);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        rg5 rg5Var2 = (rg5) dqVar.Y;
        if (((Float) obj).floatValue() != 0.0f || ((Float) obj2).floatValue() != 0.0f) {
            Matrix.translateM(fArr4, 0, ((Float) rg5Var2.a).floatValue() / ((Float) obj).floatValue(), ((Float) rg5Var2.b).floatValue() / ((Float) obj2).floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(dp2Var.b, 1, false, fArr5, 0);
        fp2.b("glUniformMatrix4fv");
        GLES20.glUniform1f(dp2Var.c, 1.0f);
        fp2.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        fp2.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}

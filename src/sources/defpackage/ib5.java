package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Size;
import android.view.Surface;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ib5 {
    public Thread c;
    public EGLConfig g;
    public Surface i;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final HashMap b = new HashMap();
    public EGLDisplay d = EGL14.EGL_NO_DISPLAY;
    public EGLContext e = EGL14.EGL_NO_CONTEXT;
    public int[] f = fp2.a;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public Map j = Collections.EMPTY_MAP;
    public dp2 k = null;
    public cp2 l = cp2.X;
    public int m = -1;

    public final void a(px1 px1Var, z47 z47Var) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.d = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            bt.i("Unable to get EGL14 display");
            return;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.d, iArr, 0, iArr, 1)) {
            this.d = EGL14.EGL_NO_DISPLAY;
            bt.i("Unable to initialize EGL14");
            return;
        }
        if (z47Var != null) {
            z47Var.Z = iArr[0] + "." + iArr[1];
        }
        int i = px1Var.a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.d, new int[]{12324, i, 12323, i, 12322, i, 12321, px1Var.a() ? 2 : 8, 12325, 0, 12326, 0, 12352, px1Var.a() ? 64 : 4, 12610, px1Var.a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            bt.i("Unable to find a suitable EGLConfig");
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, px1Var.a() ? 3 : 2, 12344}, 0);
        fp2.a("eglCreateContext");
        this.g = eGLConfig;
        this.e = eGLContextEglCreateContext;
        EGL14.eglQueryContext(this.d, eGLContextEglCreateContext, 12440, new int[1], 0);
    }

    public final yy b(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.d;
            EGLConfig eGLConfig = this.g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceH = fp2.h(eGLDisplay, eGLConfig, surface, this.f);
            EGLDisplay eGLDisplay2 = this.d;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceH, 12375, iArr, 0);
            int i = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceH, 12374, iArr2, 0);
            Size size = new Size(i, iArr2[0]);
            return new yy(eGLSurfaceH, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e) {
            e.getMessage();
            hi5.z0("OpenGlRenderer");
            return null;
        }
    }

    public final void c() {
        EGLDisplay eGLDisplay = this.d;
        EGLConfig eGLConfig = this.g;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = fp2.a;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        fp2.a("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            this.h = eGLSurfaceEglCreatePbufferSurface;
        } else {
            bt.i("surface was null");
        }
    }

    public final rg5 d(px1 px1Var) {
        fp2.d(this.a, false);
        try {
            a(px1Var, null);
            c();
            f(this.h);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString(this.d, 12373);
            if (strGlGetString == null) {
                strGlGetString = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            if (strEglQueryString == null) {
                strEglQueryString = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            return new rg5(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e) {
            e.getMessage();
            hi5.z0("OpenGlRenderer");
            return new rg5(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET);
        } finally {
            i();
        }
    }

    public ly e(px1 px1Var) {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = this.a;
        fp2.d(atomicBoolean, false);
        z47 z47Var = new z47((byte) 5, false);
        z47Var.Y = "0.0";
        z47Var.Z = "0.0";
        z47Var.f0 = _UrlKt.FRAGMENT_ENCODE_SET;
        z47Var.g0 = _UrlKt.FRAGMENT_ENCODE_SET;
        try {
            if (px1Var.a()) {
                rg5 rg5VarD = d(px1Var);
                String str = (String) rg5VarD.a;
                String str2 = (String) rg5VarD.b;
                if (!str.contains("GL_EXT_YUV_target")) {
                    hi5.z0("OpenGlRenderer");
                    px1Var = px1.d;
                }
                int[] iArr = fp2.a;
                if (px1Var.a == 3) {
                    if (str2.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                        iArr = fp2.b;
                    } else {
                        hi5.z0("GLUtils");
                    }
                }
                this.f = iArr;
                z47Var.f0 = str;
                z47Var.g0 = str2;
            }
            a(px1Var, z47Var);
            c();
            f(this.h);
            z47Var.Y = fp2.i();
            this.j = fp2.f(px1Var);
            int iG = fp2.g();
            this.m = iG;
            l(iG);
            this.c = Thread.currentThread();
            atomicBoolean.set(true);
            if (_UrlKt.FRAGMENT_ENCODE_SET.isEmpty()) {
                return new ly((String) z47Var.Y, (String) z47Var.Z, (String) z47Var.f0, (String) z47Var.g0);
            }
            bt.i("Missing required properties:".concat(_UrlKt.FRAGMENT_ENCODE_SET));
            return null;
        } catch (IllegalArgumentException e) {
            e = e;
            i();
            throw e;
        } catch (IllegalStateException e2) {
            e = e2;
            i();
            throw e;
        }
    }

    public final void f(EGLSurface eGLSurface) {
        this.d.getClass();
        this.e.getClass();
        if (EGL14.eglMakeCurrent(this.d, eGLSurface, eGLSurface, this.e)) {
            return;
        }
        bt.i("eglMakeCurrent failed");
    }

    public final void g(Surface surface) {
        fp2.d(this.a, true);
        fp2.c(this.c);
        HashMap map = this.b;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, fp2.j);
    }

    public void h() {
        if (this.a.getAndSet(false)) {
            fp2.c(this.c);
            i();
        }
    }

    public final void i() {
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((dp2) it.next()).a);
        }
        this.j = Collections.EMPTY_MAP;
        this.k = null;
        if (!Objects.equals(this.d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap map = this.b;
            for (yy yyVar : map.values()) {
                if (!Objects.equals(yyVar.a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.d, yyVar.a)) {
                    try {
                        fp2.a("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        e.toString();
                        hi5.z0("GLUtils");
                    }
                }
            }
            map.clear();
            if (!Objects.equals(this.h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.d, this.h);
                this.h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.d, this.e);
                this.e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.d);
            this.d = EGL14.EGL_NO_DISPLAY;
        }
        this.g = null;
        this.m = -1;
        this.l = cp2.X;
        this.i = null;
        this.c = null;
    }

    public final void j(Surface surface, boolean z) {
        if (this.i == surface) {
            this.i = null;
            f(this.h);
        }
        HashMap map = this.b;
        yy yyVar = z ? (yy) map.remove(surface) : (yy) map.put(surface, fp2.j);
        if (yyVar == null || yyVar == fp2.j) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.d, yyVar.a);
        } catch (RuntimeException e) {
            e.getMessage();
            hi5.z0("OpenGlRenderer");
        }
    }

    public final void k(long j, float[] fArr, Surface surface) {
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
        int i = yyVarB.c;
        int i2 = yyVarB.b;
        EGLSurface eGLSurface = yyVarB.a;
        if (surface != this.i) {
            f(eGLSurface);
            this.i = surface;
            GLES20.glViewport(0, 0, i2, i);
            GLES20.glScissor(0, 0, i2, i);
        }
        dp2 dp2Var = this.k;
        dp2Var.getClass();
        if (dp2Var instanceof ep2) {
            GLES20.glUniformMatrix4fv(((ep2) dp2Var).f, 1, false, fArr, 0);
            fp2.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        fp2.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.d, eGLSurface, j);
        if (EGL14.eglSwapBuffers(this.d, eGLSurface)) {
            return;
        }
        Integer.toHexString(EGL14.eglGetError());
        hi5.z0("OpenGlRenderer");
        j(surface, false);
    }

    public final void l(int i) {
        dp2 dp2Var = (dp2) this.j.get(this.l);
        if (dp2Var == null) {
            bt.p(this.l, "Unable to configure program for input format: ");
            return;
        }
        if (this.k != dp2Var) {
            this.k = dp2Var;
            dp2Var.b();
            Objects.toString(this.l);
            Objects.toString(this.k);
        }
        GLES20.glActiveTexture(33984);
        fp2.b("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        fp2.b("glBindTexture");
    }
}

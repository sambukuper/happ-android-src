package defpackage;

import android.graphics.ColorSpace;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraExtensionSession;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import android.view.autofill.AutofillId;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bt implements p95, kt5 {
    public static /* bridge */ /* synthetic */ ColorSpace a(Object obj) {
        return (ColorSpace) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillId b(Object obj) {
        return (AutofillId) obj;
    }

    public static /* synthetic */ void c() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void d(int i, int i2) {
        throw new IllegalArgumentException("Callable expects " + i + ((Object) " arguments, but ") + i2 + ((Object) " were provided."));
    }

    public static /* synthetic */ void e(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void f(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void g(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void h(Object obj, String str) throws SSLPeerUnverifiedException {
        throw new SSLPeerUnverifiedException(str + obj);
    }

    public static /* synthetic */ void i(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2) {
        throw new NumberFormatException(str + obj + obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void l(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return CameraExtensionSession.class;
    }

    public static /* synthetic */ void n() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void p(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void q(String str) {
        throw new IllegalArgumentException(str);
    }

    @Override // defpackage.p95
    public w19 C(View view, w19 w19Var) {
        k19 e19Var;
        view.getClass();
        t19 t19Var = w19Var.a;
        t19Var.t(8);
        int i = t19Var.h(8).d;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 36) {
            e19Var = new j19(w19Var);
        } else if (i2 >= 35) {
            e19Var = new i19(w19Var);
        } else if (i2 >= 34) {
            e19Var = new h19(w19Var);
        } else if (i2 >= 31) {
            e19Var = new g19(w19Var);
        } else if (i2 >= 30) {
            e19Var = new f19(w19Var);
        } else {
            e19Var = i2 >= 29 ? new e19(w19Var) : new d19(w19Var);
        }
        e19Var.d(519, fe3.c(0, 0, 0, i));
        return e19Var.b();
    }

    @Override // defpackage.kt5
    public void o(hy7 hy7Var) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(hy7Var.b.getWidth(), hy7Var.b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        hy7Var.a(surface, dp1.a(), new ml0(surface, surfaceTexture, (byte) 0));
    }
}

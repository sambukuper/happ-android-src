package defpackage;

import android.app.ApplicationExitInfo;
import android.os.Bundle;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.io.IOException;
import java.nio.file.Path;
import java.security.InvalidKeyException;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u52 implements ry0, r51 {
    public final /* synthetic */ byte X;

    public /* synthetic */ u52(fu6 fu6Var) {
        this.X = (byte) 14;
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo a(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* bridge */ /* synthetic */ Class c() {
        return Path.class;
    }

    public static /* synthetic */ void e(int i, int i2, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(("No parameter with index " + i + '+' + i2 + ((Object) " (name=") + obj + ((Object) " type=") + obj2 + ((Object) ") in ") + obj3).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f(int i, Object obj, String str) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void h(int i, String str) throws IOException {
        throw new IOException(str + i);
    }

    public static /* synthetic */ void i(Object obj, Object obj2) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IOException(sb.toString());
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void k(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void l(String str, int i, int i2, Object obj) {
        throw new IllegalArgumentException((str + i + obj + i2).toString());
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + '\'').toString());
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void p(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4 + obj5);
    }

    public static /* synthetic */ void q(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void r(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void s(String str) throws IOException {
        throw new IOException(str);
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new p14(str + obj);
    }

    public static /* synthetic */ void u(String str) throws InvalidKeyException {
        throw new InvalidKeyException(str);
    }

    @Override // defpackage.ry0
    public Object d(y5 y5Var) {
        switch (this.X) {
            case 0:
                h44 h44Var = ExecutorsRegistrar.a;
                return nl8.X;
            default:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(y5Var);
        }
    }

    @Override // defpackage.r51
    public Object g(fb9 fb9Var) throws IOException {
        int i;
        Object obj;
        switch (this.X) {
            case 1:
                i = 403;
                break;
            case 2:
                i = -1;
                break;
            default:
                synchronized (fb9Var.a) {
                    if (!fb9Var.c) {
                        throw new IllegalStateException("Task is not yet complete");
                    }
                    if (fb9Var.d) {
                        throw new CancellationException("Task is already canceled.");
                    }
                    boolean zIsInstance = IOException.class.isInstance(fb9Var.f);
                    Exception exc = fb9Var.f;
                    if (zIsInstance) {
                        throw ((Throwable) IOException.class.cast(exc));
                    }
                    if (exc != null) {
                        throw new er6(exc);
                    }
                    obj = fb9Var.e;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    s("SERVICE_NOT_AVAILABLE");
                    return null;
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    s("INSTANCE_ID_RESET");
                    return null;
                }
                if (string2 != null) {
                    s(string2);
                    return null;
                }
                bundle.toString();
                new Throwable();
                s("SERVICE_NOT_AVAILABLE");
                return null;
        }
        return Integer.valueOf(i);
    }

    public /* synthetic */ u52(byte b) {
        this.X = b;
    }
}

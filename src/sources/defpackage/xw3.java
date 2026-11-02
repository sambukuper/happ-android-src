package defpackage;

import android.app.RemoteAction;
import android.view.autofill.AutofillManager;
import java.net.ProtocolException;
import java.nio.file.Path;
import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xw3 implements u87 {
    public static /* bridge */ /* synthetic */ RemoteAction a(Object obj) {
        return (RemoteAction) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillManager b(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class d() {
        return AutofillManager.class;
    }

    public static /* bridge */ /* synthetic */ Path e(Object obj) {
        return (Path) obj;
    }

    public static /* synthetic */ void h(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void i(Object obj) throws InvalidKeySpecException {
        throw new InvalidKeySpecException("Unsupported algorithm: " + obj);
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new p14(str + obj);
    }

    public static /* synthetic */ void k(String str) throws ProtocolException {
        throw new ProtocolException(str);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2) {
        throw new AssertionError(str + obj + obj2);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void o(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void p(StringBuilder sb, Object obj, Object obj2) {
        sb.append('/');
        sb.append(obj);
        sb.append(' ');
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void q(Throwable th) throws InvalidKeyException {
        throw new InvalidKeyException(th);
    }

    public static /* synthetic */ void s(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void t(String str) throws InvalidKeySpecException {
        throw new InvalidKeySpecException(str);
    }

    public static /* synthetic */ void u(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void v(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void x(Object obj, String str) throws InvalidKeyException {
        throw new InvalidKeyException(str + obj);
    }

    public static /* synthetic */ void z(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    @Override // defpackage.u87
    public boolean c() {
        return false;
    }
}

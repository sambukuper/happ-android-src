package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ve4 {
    public static final String d;
    public static final me4 e;
    public final t97 a;
    public final qe4 b;
    public final String c;

    static {
        String canonicalName = ve4.class.getCanonicalName();
        canonicalName.getClass();
        int iR0 = fm7.r0(canonicalName, ".", 0, 6);
        d = iR0 == -1 ? _UrlKt.FRAGMENT_ENCODE_SET : canonicalName.substring(0, iR0);
        e = new me4("NO_LOCKS", oy1.v0);
    }

    public ve4(String str) {
        this(str, new wl6((Object) new ReentrantLock(), (byte) 28));
    }

    public static void e(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (i < length) {
            if (!stackTrace[i].getClassName().startsWith(d)) {
                List listSubList = Arrays.asList(stackTrace).subList(i, length);
                assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
            }
            i++;
        }
        i = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
    }

    public final te4 a(dn2 dn2Var) {
        return new te4(this, dn2Var);
    }

    public final pe4 b(gn2 gn2Var) {
        return new pe4(this, new ConcurrentHashMap(3, 1.0f, 2), gn2Var, (byte) 1);
    }

    public final vt1 c(gn2 gn2Var) {
        return new vt1(this, new ConcurrentHashMap(3, 1.0f, 2), gn2Var, (byte) 1);
    }

    public h70 d(Object obj, String str) {
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        sb.append(obj == null ? _UrlKt.FRAGMENT_ENCODE_SET : oi0.k(obj, "on input: "));
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        e(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return oi0.p(sb, this.c, ")");
    }

    public ve4(String str, t97 t97Var) {
        qe4 qe4Var = qe4.Y;
        this.a = t97Var;
        this.b = qe4Var;
        this.c = str;
    }
}

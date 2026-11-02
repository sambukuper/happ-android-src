package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.view.textclassifier.TextClassifier;
import androidx.work.multiprocess.RemoteWorkManagerClient;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.f6;
import io.sentry.j5;
import io.sentry.n0;
import io.sentry.protocol.a0;
import io.sentry.protocol.c0;
import io.sentry.protocol.e0;
import io.sentry.s5;
import io.sentry.u4;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kp5 implements zn2, ts1, ur6, u4, f6 {
    public final /* synthetic */ byte X;

    public static /* bridge */ /* synthetic */ TextClassifier d(Object obj) {
        return (TextClassifier) obj;
    }

    public static /* synthetic */ void e() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void f(int i, long j) throws IOException {
        throw new IOException("Content-Length (" + j + ((Object) ") and stream length (") + i + ((Object) ") disagree"));
    }

    public static /* synthetic */ void g(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void h(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void i(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new IllegalArgumentException(str + obj + '.');
    }

    public static /* synthetic */ void k(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2) {
        throw new qi1(str + obj + obj2);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void n(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static /* synthetic */ void o(StringBuilder sb, Object obj) {
        sb.append(", ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static /* synthetic */ void p(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void r(String str) throws gu6 {
        throw new gu6(str);
    }

    public static /* synthetic */ void s(Object obj, String str) {
        throw new IllegalStateException((str + obj + '\'').toString());
    }

    public static /* synthetic */ void t(String str) {
        throw new RuntimeException(str);
    }

    @Override // defpackage.zn2
    public Object apply(Object obj) {
        switch (this.X) {
            case 4:
                return xu5.b;
            case 10:
                kp5 kp5Var = RemoteWorkManagerClient.j;
                return null;
            default:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        lr lrVarA = qz.a();
                        lrVarA.z(cursorRawQuery.getString(1));
                        lrVarA.f0 = hu5.b(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        lrVarA.Z = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(lrVarA.e());
                        break;
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
        }
    }

    public j5 b(j5 j5Var, n0 n0Var) {
        String message;
        String message2;
        List list;
        Throwable thA = j5Var.a();
        String name = thA != null ? thA.getClass().getName() : null;
        if (name == null) {
            name = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if (!fm7.d0(name, "ForegroundServiceDidNotStartInTimeException", false) && !fm7.d0(name, "RemoteServiceException", false) && !fm7.d0(name, "ApplicationNotResponding", false)) {
            Throwable thA2 = j5Var.a();
            if (thA2 != null && thA2.getStackTrace() != null) {
                StackTraceElement[] stackTrace = thA2.getStackTrace();
                stackTrace.getClass();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    String fileName = stackTraceElement.getFileName();
                    if (fileName != null && fm7.d0(fileName, "libgojni.so", false)) {
                        return j5Var;
                    }
                }
            }
            ArrayList arrayListE = j5Var.e();
            if (arrayListE != null) {
                Iterator it = arrayListE.iterator();
                while (it.hasNext()) {
                    c0 c0Var = ((e0) it.next()).k0;
                    if (c0Var != null && (list = c0Var.X) != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            String str = ((a0) it2.next()).h0;
                            if (str != null && fm7.d0(str, "libgojni.so", false)) {
                                return j5Var;
                            }
                        }
                    }
                }
            }
            if (((!(thA instanceof ConnectException) && !(thA instanceof UnknownHostException)) || (message = ((IOException) thA).getMessage()) == null || !fm7.d0(message, "github.com", false)) && (!(thA instanceof SocketException) || (message2 = ((SocketException) thA).getMessage()) == null || !fm7.d0(message2, "127.0.0.1", false))) {
                s5 s5Var = j5Var.w0;
                int i = s5Var == null ? -1 : t27.a[s5Var.ordinal()];
                if (i != 1 && i != 2 && i != 3) {
                    return j5Var;
                }
            }
        }
        return null;
    }

    @Override // io.sentry.u4
    public void c(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setDsn("https://dc4747c4eb1f380d72dd79917ed695c7@o312638.ingest.us.sentry.io/4507922783731712");
        sentryAndroidOptions.setEnvironment("another");
        sentryAndroidOptions.setBeforeSend(new kp5((byte) 27));
    }

    public /* synthetic */ kp5(byte b) {
        this.X = b;
    }

    @Override // defpackage.ts1
    public double a(double d) {
        return d;
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.gson.a;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class x79 {
    public static final kc6 a = new kc6(":([0-9\\-,]+)(?:\\/|\\?|#|$)");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String a(Uri uri) {
        uri.getClass();
        int port = uri.getPort();
        Integer numValueOf = Integer.valueOf(port);
        if (port == -1) {
            numValueOf = null;
        }
        String strJ = numValueOf != null ? pc6.j(numValueOf.intValue(), ":") : null;
        if (strJ == null) {
            String host = uri.getHost();
            String strJ2 = host != null ? j(host) : null;
            return strJ2 == null ? "" : strJ2;
        }
        String host2 = uri.getHost();
        if (host2 == null) {
            return "";
        }
        String strJ3 = j(host2);
        int iM0 = fm7.m0(strJ3, strJ, 0, false, 6);
        Integer numValueOf2 = iM0 != -1 ? Integer.valueOf(iM0) : null;
        return numValueOf2 != null ? fm7.Q0(numValueOf2.intValue(), strJ3) : strJ3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String b(Uri uri) {
        String host = uri.getHost();
        String strJ = host != null ? j(host) : null;
        return strJ == null ? "" : strJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Serializable c(Intent intent, String str, Class cls) {
        intent.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            return intent.getSerializableExtra(str, cls);
        }
        Serializable serializableExtra = intent.getSerializableExtra(str);
        if (serializableExtra != null) {
            return serializableExtra;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final qg5 d(long j) {
        int i = 0;
        while (true) {
            if (j >= -2147483648L && j <= 2147483647L) {
                return new qg5(Integer.valueOf((int) j), Integer.valueOf(i));
            }
            j /= 10;
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String e(Object obj) {
        obj.getClass();
        if (obj instanceof String) {
            a aVar = yw2.b;
            aVar.getClass();
            obj = aVar.c((String) obj, new yi8(Object.class));
        }
        return yw2.d.h(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String f(long j) {
        return g(j).concat("/s");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String g(long j) {
        double d = j;
        if (d < 1024.0d) {
            ss8 ss8Var = ss8.a;
            return String.format(ss8.n(), "%d B", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
        }
        double d2 = d / 1024.0d;
        if (d2 < 1024.0d) {
            ss8 ss8Var2 = ss8.a;
            return String.format(ss8.n(), "%.1f KB", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1));
        }
        double d3 = d2 / 1024.0d;
        if (d3 < 1024.0d) {
            ss8 ss8Var3 = ss8.a;
            return String.format(ss8.n(), "%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(d3)}, 1));
        }
        double d4 = d3 / 1024.0d;
        if (d4 < 1024.0d) {
            ss8 ss8Var4 = ss8.a;
            return String.format(ss8.n(), "%.1f GB", Arrays.copyOf(new Object[]{Double.valueOf(d4)}, 1));
        }
        double d5 = d4 / 1024.0d;
        if (d5 < 1024.0d) {
            ss8 ss8Var5 = ss8.a;
            return String.format(ss8.n(), "%.1f TB", Arrays.copyOf(new Object[]{Double.valueOf(d5)}, 1));
        }
        ss8 ss8Var6 = ss8.a;
        return String.format(ss8.n(), "%.1f PB", Arrays.copyOf(new Object[]{Double.valueOf(d5 / 1024.0d)}, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void h(Context context, int i) {
        context.getClass();
        new Handler(Looper.getMainLooper()).post(new rh(context, i, (byte) 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void i(Context context, String str) {
        new Handler(Looper.getMainLooper()).post(new sc4(context, str, (byte) 21));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String j(String str) {
        return mm7.W(mm7.W(str, "[", "", false), "]", "", false);
    }
}

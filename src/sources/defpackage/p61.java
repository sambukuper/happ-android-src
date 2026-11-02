package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import android.os.Trace;
import io.sentry.c2;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class p61 implements sd0 {
    public static final /* synthetic */ int[] X = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    public static final int[] Y = {2, 1, 4, 3};

    public static /* synthetic */ String A(int i) {
        if (i == 1) {
            return "DECLARATION";
        }
        if (i == 2) {
            return "FAKE_OVERRIDE";
        }
        if (i == 3) {
            return "DELEGATION";
        }
        if (i == 4) {
            return "SYNTHESIZED";
        }
        throw null;
    }

    public static /* synthetic */ int B(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String C(int i) {
        if (i == 1) {
            return "OK";
        }
        if (i == 2) {
            return "TRANSIENT_ERROR";
        }
        if (i != 3) {
            return i != 4 ? "null" : "INVALID_PAYLOAD";
        }
        return "FATAL_ERROR";
    }

    public static /* synthetic */ String D(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "RenderOptions";
        }
        return "Document";
    }

    public static /* synthetic */ String E(int i) {
        if (i == 1) {
            return "DECLARATION";
        }
        if (i == 2) {
            return "FAKE_OVERRIDE";
        }
        if (i != 3) {
            return i != 4 ? "null" : "SYNTHESIZED";
        }
        return "DELEGATION";
    }

    public static /* synthetic */ int F(String str) {
        if (str == null) {
            b61.i("Name is null");
            return 0;
        }
        if (str.equals("L")) {
            return 1;
        }
        if (str.equals("M")) {
            return 2;
        }
        if (str.equals("Q")) {
            return 3;
        }
        if (str.equals("H")) {
            return 4;
        }
        bt.q("No enum constant com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.".concat(str));
        return 0;
    }

    public static /* synthetic */ int[] G(int i) {
        int[] iArr = new int[i];
        System.arraycopy(X, 0, iArr, 0, i);
        return iArr;
    }

    public static /* synthetic */ boolean a(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static /* synthetic */ byte b(int i) {
        if (i == 1) {
            return (byte) 1;
        }
        if (i == 2) {
            return (byte) 0;
        }
        if (i == 3) {
            return (byte) 3;
        }
        if (i == 4) {
            return (byte) 2;
        }
        throw null;
    }

    public static /* synthetic */ byte c(int i) {
        switch (i) {
            case 1:
                return (byte) 4;
            case 2:
                return (byte) 12;
            case 3:
                return (byte) 5;
            case 4:
                return (byte) 13;
            case 5:
                return (byte) 7;
            case 6:
                return (byte) 15;
            default:
                throw null;
        }
    }

    public static /* synthetic */ byte d(int i) {
        switch (i) {
            case 1:
                return (byte) 0;
            case 2:
                return (byte) 1;
            case 3:
                return (byte) 2;
            case 4:
                return (byte) 3;
            case 5:
                return (byte) 4;
            case 6:
                return (byte) 5;
            default:
                throw null;
        }
    }

    public static float e(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static int f(int i, int i2, List list) {
        return (list.hashCode() + i) * i2;
    }

    public static int g(int i, long j, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static long h(long j) {
        Trace.endSection();
        return SystemClock.elapsedRealtimeNanos() - j;
    }

    public static long i(long j, long j2, long j3, long j4) {
        return (j * j2) + j3 + j4;
    }

    public static o14 j(String str) {
        wc3.c(str);
        return new o14();
    }

    public static ClassCastException k(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String l(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String m(String str, id2 id2Var, String str2) {
        return str + id2Var + str2;
    }

    public static String n(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String o(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder p(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static Date q(PrintWriter printWriter) {
        printWriter.getClass();
        return new Date();
    }

    public static HashMap r(Class cls, ov ovVar) {
        HashMap map = new HashMap();
        map.put(cls, ovVar);
        return map;
    }

    public static Map s(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static /* synthetic */ void u() {
    }

    public static void v(int i, lp2 lp2Var, int i2, dx0 dx0Var) {
        lp2Var.g0(Integer.valueOf(i));
        lp2Var.b(dx0Var, Integer.valueOf(i2));
    }

    public static void w(lr lrVar, long j) {
        lrVar.k().p();
        lrVar.D(j);
    }

    public static /* synthetic */ void x(Object obj) {
        if (obj == null) {
            return;
        }
        c2.m();
    }

    public static void y(String str, ux0 ux0Var) {
        ux0Var.l0(new nh0(str));
    }

    public static /* synthetic */ void z(Object obj) throws Exception {
        boolean zIsTerminated;
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (!(obj instanceof ExecutorService)) {
            if (obj instanceof TypedArray) {
                ((TypedArray) obj).recycle();
                return;
            }
            if (obj instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) obj).release();
                return;
            } else if (obj instanceof MediaDrm) {
                ((MediaDrm) obj).release();
                return;
            } else {
                kp5.e();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) obj;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}

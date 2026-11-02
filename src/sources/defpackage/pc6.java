package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.url._UrlKt;
import org.xml.sax.Attributes;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class pc6 {
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    public static final String a(char c, int i) {
        String str;
        String str2 = " ";
        if (i == 1) {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        } else {
            if (i != 2) {
                if (i == 3) {
                    str = _UrlKt.FRAGMENT_ENCODE_SET;
                } else if (i != 4) {
                    throw null;
                }
            }
            str = " ";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(c);
        if (i == 1 || i == 2) {
            str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        } else if (i != 3 && i != 4) {
            throw null;
        }
        sb.append(str2);
        return sb.toString();
    }

    public static Number b(int i, rq3 rq3Var) {
        if (i == 1) {
            return Double.valueOf(rq3Var.nextDouble());
        }
        if (i == 2) {
            return new f44(rq3Var.r());
        }
        if (i == 3) {
            String strR = rq3Var.r();
            if (strR.indexOf(46) >= 0) {
                return c(strR, rq3Var);
            }
            try {
                return Long.valueOf(Long.parseLong(strR));
            } catch (NumberFormatException unused) {
                return c(strR, rq3Var);
            }
        }
        String strR2 = rq3Var.r();
        try {
            return z91.K(strR2);
        } catch (NumberFormatException e) {
            StringBuilder sbP = p61.p("Cannot parse ", strR2, "; at path ");
            sbP.append(rq3Var.C());
            throw new eq3(sbP.toString(), e);
        }
    }

    public static Double c(String str, rq3 rq3Var) throws cp4 {
        try {
            Double dValueOf = Double.valueOf(str);
            if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                boolean z = true;
                if (rq3Var.q0 != 1) {
                    z = false;
                }
                if (!z) {
                    throw new cp4("JSON forbids NaN and infinities: " + dValueOf + "; at path " + rq3Var.C());
                }
            }
            return dValueOf;
        } catch (NumberFormatException e) {
            StringBuilder sbP = p61.p("Cannot parse ", str, "; at path ");
            sbP.append(rq3Var.C());
            throw new eq3(sbP.toString(), e);
        }
    }

    public static int d(int i, float f, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int e(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int f(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static int g(o88 o88Var, int i, int i2) {
        return (o88Var.hashCode() + i) * i2;
    }

    public static int h(Attributes attributes, int i) {
        return mu6.a(attributes.getLocalName(i)).ordinal();
    }

    public static ClassCastException i(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String j(int i, String str) {
        return str + i;
    }

    public static String k(int i, String str, int i2, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String l(Class cls, String str) {
        return str + cls;
    }

    public static String m(String str, int i, int i2, String str2) {
        return str + i + str2 + i2;
    }

    public static String n(String str, Class cls, String str2) {
        return str + cls + str2;
    }

    public static String o(String str, String str2) {
        return str + str2;
    }

    public static String p(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String q(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String r(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder s(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static void t(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void u(qx7 qx7Var, ox7 ox7Var, nx7 nx7Var, qx7 qx7Var2, ox7 ox7Var2) {
        jl7 jl7Var = rx7.e;
        nx7Var.a(we5.f(qx7Var, ox7Var, jl7Var));
        nx7Var.a(we5.f(qx7Var2, ox7Var2, jl7Var));
    }

    public static /* synthetic */ void v(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                kp5.e();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
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

    public static /* synthetic */ void w(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                kp5.e();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
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

    public static /* synthetic */ int x(String str) {
        if (str == null) {
            b61.i("Name is null");
            return 0;
        }
        if (str.equals("px")) {
            return 1;
        }
        if (str.equals("em")) {
            return 2;
        }
        if (str.equals("ex")) {
            return 3;
        }
        if (str.equals("in")) {
            return 4;
        }
        if (str.equals("cm")) {
            return 5;
        }
        if (str.equals("mm")) {
            return 6;
        }
        if (str.equals("pt")) {
            return 7;
        }
        if (str.equals("pc")) {
            return 8;
        }
        if (str.equals("percent")) {
            return 9;
        }
        bt.q("No enum constant com.caverock.androidsvg.SVG.Unit.".concat(str));
        return 0;
    }
}

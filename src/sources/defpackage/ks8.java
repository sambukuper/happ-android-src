package defpackage;

import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ks8 {
    public static final byte[] a;
    public static final nz2 b = dh3.D(new String[0]);
    public static final b86 c;
    public static final TimeZone d;
    public static final kc6 e;
    public static final String f;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        i90 i90Var = new i90();
        i90Var.write(bArr, 0, 0);
        c = new b86(0L, i90Var, (byte) 1);
        kb0 kb0Var = kb0.f0;
        hi5.q0(ra.f("efbbbf"), ra.f("feff"), ra.f("fffe"), ra.f("0000ffff"), ra.f("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        timeZone.getClass();
        d = timeZone;
        e = new kc6("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f = fm7.y0(fm7.x0("okhttp3.", l95.class.getName()), "Client");
    }

    public static final boolean a(u23 u23Var, u23 u23Var2) {
        u23Var.getClass();
        return dh3.f(u23Var.d, u23Var2.d) && u23Var.e == u23Var2.e && dh3.f(u23Var.a, u23Var2.a);
    }

    public static final int b(long j) {
        if (j < 0) {
            kp5.h("timeout < 0");
            return 0;
        }
        if (TimeUnit.MILLISECONDS == null) {
            bt.i("unit == null");
            return 0;
        }
        if (j > 2147483647L) {
            em7.c("timeout too large.");
            return 0;
        }
        if (j != 0 || j <= 0) {
            return (int) j;
        }
        em7.c("timeout too small.");
        return 0;
    }

    public static final void c(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!dh3.f(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(String str, char c2, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int f(String str, String str2, int i, int i2) {
        while (i < i2) {
            if (fm7.e0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final String g(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean h(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                int i = 0;
                while (true) {
                    if (i < strArr2.length) {
                        int i2 = i + 1;
                        try {
                            if (comparator.compare(str, strArr2[i]) == 0) {
                                return true;
                            }
                            i = i2;
                        } catch (ArrayIndexOutOfBoundsException e2) {
                            em7.g(e2.getMessage());
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long i(zf6 zf6Var) {
        String strA = zf6Var.h0.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List j(Object... objArr) {
        Object[] objArr2 = (Object[]) objArr.clone();
        List listUnmodifiableList = Collections.unmodifiableList(i21.L(Arrays.copyOf(objArr2, objArr2.length)));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final int k(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (dh3.k(cCharAt, 31) <= 0 || dh3.k(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int l(String str, int i, int i2) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int m(String str, int i, int i2) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 != i) {
                    i3--;
                }
            }
        }
        return i;
    }

    public static final String[] n(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean o(String str) {
        str.getClass();
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int p(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final int q(ba0 ba0Var) {
        return (ba0Var.readByte() & 255) | ((ba0Var.readByte() & 255) << 16) | ((ba0Var.readByte() & 255) << 8);
    }

    public static final boolean r(je7 je7Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = je7Var.timeout().hasDeadline() ? je7Var.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        je7Var.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i)) + jNanoTime);
        try {
            i90 i90Var = new i90();
            while (je7Var.read(i90Var, 8192L) != -1) {
                i90Var.g();
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                je7Var.timeout().clearDeadline();
                return true;
            }
            je7Var.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                je7Var.timeout().clearDeadline();
                return false;
            }
            je7Var.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                je7Var.timeout().clearDeadline();
            } else {
                je7Var.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    public static final nz2 s(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kz2 kz2Var = (kz2) it.next();
            kb0 kb0Var = kz2Var.a;
            kb0 kb0Var2 = kz2Var.b;
            String strT = kb0Var.t();
            String strT2 = kb0Var2.t();
            arrayList.add(strT);
            arrayList.add(fm7.R0(strT2).toString());
        }
        return new nz2((String[]) arrayList.toArray(new String[0]));
    }

    public static final String t(u23 u23Var, boolean z) {
        int i;
        u23Var.getClass();
        int i2 = u23Var.e;
        String strL = u23Var.d;
        if (fm7.d0(strL, ":", false)) {
            strL = p61.l(']', "[", strL);
        }
        if (!z) {
            String str = u23Var.a;
            str.getClass();
            if (str.equals("http")) {
                i = 80;
            } else {
                i = str.equals("https") ? XRayConfig.DEFAULT_PORT : -1;
            }
            if (i2 == i) {
                return strL;
            }
        }
        return strL + ':' + i2;
    }

    public static final List u(List list) {
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final int v(String str, int i) {
        if (str != null) {
            try {
                long j = Long.parseLong(str);
                if (j > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j < 0) {
                    return 0;
                }
                return (int) j;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }
}

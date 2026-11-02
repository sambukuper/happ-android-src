package io.sentry.util;

import defpackage.bt;
import defpackage.p61;
import defpackage.pc6;
import defpackage.u52;
import io.sentry.ILogger;
import io.sentry.a3;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.t0;
import io.sentry.b4;
import io.sentry.j5;
import io.sentry.n0;
import io.sentry.o1;
import io.sentry.p3;
import io.sentry.protocol.c0;
import io.sentry.protocol.e0;
import io.sentry.protocol.v;
import io.sentry.q5;
import io.sentry.s5;
import io.sentry.s6;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final String[] a = new String[0];

    public static void a(String str) {
        q5.d().a(str);
    }

    public static b4 b(b4 b4Var) {
        if (((Double) b4Var.c) != null) {
            return b4Var;
        }
        return new b4((Boolean) b4Var.a, (Double) b4Var.b, c((Boolean) b4Var.a, null, (Double) b4Var.b), (Boolean) b4Var.d, (Double) b4Var.e);
    }

    public static Double c(Boolean bool, Double d, Double d2) {
        if (d != null) {
            return d;
        }
        double dC = o.a().c();
        if (d2 == null || bool == null) {
            return Double.valueOf(dC);
        }
        if (bool.booleanValue()) {
            return Double.valueOf(d2.doubleValue() * dC);
        }
        return Double.valueOf(((1.0d - d2.doubleValue()) * dC) + d2.doubleValue());
    }

    public static ClassLoader d(ClassLoader classLoader) {
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader != null ? contextClassLoader : ClassLoader.getSystemClassLoader();
    }

    public static boolean e(File file) {
        return file.isDirectory() || file.mkdirs() || file.isDirectory();
    }

    public static n0 f(Object obj) {
        n0 n0Var = new n0();
        n0Var.d(obj, "sentry:typeCheckHint");
        return n0Var;
    }

    public static boolean g(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return true;
        }
        for (File file2 : fileArrListFiles) {
            if (!g(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    public static io.sentry.c h(io.sentry.c cVar, Boolean bool, Double d, Double d2) {
        if (cVar == null) {
            cVar = new io.sentry.c(a3.X);
        }
        if (cVar.d == null) {
            Double d3 = cVar.c;
            if (d3 != null) {
                d = d3;
            }
            Double dC = c(bool, d2, d);
            if (cVar.f) {
                cVar.d = dC;
            }
        }
        if (cVar.f && cVar.g) {
            cVar.f = false;
        }
        return cVar;
    }

    public static boolean i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean j(n0 n0Var, Class cls) {
        return cls.isInstance(n0Var.b("sentry:typeCheckHint"));
    }

    public static byte[] k(InputStream inputStream, long j) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                long j2 = 0;
                while (true) {
                    int i = bufferedInputStream.read(bArr);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return byteArray;
                    }
                    j2 += (long) i;
                    if (j2 > j) {
                        throw new IOException(String.format("Reading input failed, because %d read bytes is bigger than the maximum allowed size of %d bytes.", Long.valueOf(j2), Long.valueOf(j)));
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static boolean l(n0 n0Var) {
        return Boolean.TRUE.equals(n0Var.c(Boolean.class, "sentry:isFromHybridSdk"));
    }

    public static boolean m(j5 j5Var, SentryAndroidOptions sentryAndroidOptions) {
        long j;
        o1 serializer = sentryAndroidOptions.getSerializer();
        ILogger logger = sentryAndroidOptions.getLogger();
        Charset charset = e.a;
        try {
            d dVar = new d();
            serializer.a(j5Var, dVar);
            j = dVar.X;
        } catch (Throwable th) {
            logger.e(s5.ERROR, "Could not calculate size of serializable", th);
            j = 0;
        }
        return j <= s6.MAX_EVENT_SIZE_BYTES;
    }

    public static boolean n(Double d, boolean z) {
        if (d == null) {
            return z;
        }
        return !d.isNaN() && d.doubleValue() >= 0.0d && d.doubleValue() <= 1.0d;
    }

    public static void o(Class cls, Object obj, ILogger iLogger) {
        iLogger.h(s5.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }

    public static ConcurrentHashMap p(Map map) {
        if (map == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    public static byte[] q(long j, String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            u52.s(pc6.p("File '", file.getName(), "' doesn't exists"));
            return null;
        }
        if (!file.isFile()) {
            u52.s(pc6.p("Reading path ", str, " failed, because it's not a file."));
            return null;
        }
        if (!file.canRead()) {
            u52.s(pc6.p("Reading the item ", str, " failed, because can't read the file."));
            return null;
        }
        if (file.length() > j) {
            throw new IOException(String.format("Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", str, Long.valueOf(file.length()), Long.valueOf(j)));
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                byte[] bArrK = k(bufferedInputStream, j);
                bufferedInputStream.close();
                fileInputStream.close();
                return bArrK;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                fileInputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static String r(File file) throws IOException {
        if (!file.exists() || !file.isFile() || !file.canRead()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb.append(line);
            }
            while (true) {
                String line2 = bufferedReader.readLine();
                if (line2 == null) {
                    bufferedReader.close();
                    return sb.toString();
                }
                sb.append("\n");
                sb.append(line2);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void s(Object obj, String str) {
        if (obj != null) {
            return;
        }
        bt.q(str);
    }

    public static void t(Throwable th) {
        if ((th instanceof VirtualMachineError) || (th instanceof ThreadDeath) || (th instanceof LinkageError)) {
            throw ((Error) th);
        }
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public static boolean u(n0 n0Var) {
        return !(io.sentry.hints.d.class.isInstance(n0Var.b("sentry:typeCheckHint")) || io.sentry.hints.b.class.isInstance(n0Var.b("sentry:typeCheckHint"))) || t0.class.isInstance(n0Var.b("sentry:typeCheckHint"));
    }

    public static boolean v(s6 s6Var, SentryAndroidOptions sentryAndroidOptions, boolean z) {
        boolean z2 = k.a;
        if (!z2 && (sentryAndroidOptions.getVersionDetector() instanceof p3)) {
            sentryAndroidOptions.setVersionDetector(new io.sentry.d((Object) sentryAndroidOptions, (byte) 2));
        }
        if (!sentryAndroidOptions.getVersionDetector().a()) {
            return !z || s6Var == null || sentryAndroidOptions.isForceInit() || s6Var.getInitPriority().ordinal() <= sentryAndroidOptions.getInitPriority().ordinal();
        }
        sentryAndroidOptions.getLogger().h(s5.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
        bt.i(pc6.p("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See ", z2 ? "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions" : "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions", " for more details."));
        return false;
    }

    public static void w(j5 j5Var, SentryAndroidOptions sentryAndroidOptions) {
        ArrayList arrayListD = j5Var.d();
        if (arrayListD != null) {
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                c0 c0Var = ((v) it.next()).g0;
                if (c0Var != null) {
                    x(c0Var, j5Var, sentryAndroidOptions, "Truncated exception stack frames of event %s");
                }
            }
        }
        ArrayList arrayListE = j5Var.e();
        if (arrayListE != null) {
            Iterator it2 = arrayListE.iterator();
            while (it2.hasNext()) {
                c0 c0Var2 = ((e0) it2.next()).k0;
                if (c0Var2 != null) {
                    x(c0Var2, j5Var, sentryAndroidOptions, "Truncated thread stack frames for event %s");
                }
            }
        }
    }

    public static void x(c0 c0Var, j5 j5Var, s6 s6Var, String str) {
        List list = c0Var.X;
        if (list == null || list.size() <= 500) {
            return;
        }
        ArrayList arrayList = new ArrayList(500);
        arrayList.addAll(list.subList(0, 250));
        arrayList.addAll(list.subList(list.size() - 250, list.size()));
        c0Var.X = arrayList;
        s6Var.getLogger().h(s5.DEBUG, str, j5Var.X);
    }

    public static CopyOnWriteArrayList y(CopyOnWriteArrayList copyOnWriteArrayList) {
        ArrayList arrayList = new ArrayList();
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                throw p61.k(it);
            }
        }
        return new CopyOnWriteArrayList(arrayList);
    }
}

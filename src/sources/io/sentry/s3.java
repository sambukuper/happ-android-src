package io.sentry;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s3 extends c0 {
    public static final Charset i = Charset.forName("UTF-8");
    public final i1 e;
    public final z0 f;
    public final o1 g;
    public final ILogger h;

    public s3(i1 i1Var, z0 z0Var, o1 o1Var, ILogger iLogger, long j, int i2) {
        super(i1Var, iLogger, j, i2);
        this.e = i1Var;
        io.sentry.util.b.s(z0Var, "Envelope reader is required.");
        this.f = z0Var;
        io.sentry.util.b.s(o1Var, "Serializer is required.");
        this.g = o1Var;
        io.sentry.util.b.s(iLogger, "Logger is required.");
        this.h = iLogger;
    }

    @Override // io.sentry.c0
    public final boolean a(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    @Override // io.sentry.c0
    public final void b(File file, n0 n0Var) {
        boolean zA = a(file.getName());
        ILogger iLogger = this.h;
        try {
            if (!zA) {
                iLogger.h(s5.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    io.sentry.internal.debugmeta.c cVarA = this.f.a(bufferedInputStream);
                    if (cVarA == null) {
                        iLogger.h(s5.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        e(cVarA, n0Var);
                        iLogger.h(s5.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    Object objB = n0Var.b("sentry:typeCheckHint");
                    if (!io.sentry.hints.h.class.isInstance(n0Var.b("sentry:typeCheckHint")) || objB == null) {
                        io.sentry.util.b.o(io.sentry.hints.h.class, objB, iLogger);
                    } else {
                        d(file, (io.sentry.hints.h) objB);
                    }
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                iLogger.e(s5.ERROR, "Error processing envelope.", e);
                Object objB2 = n0Var.b("sentry:typeCheckHint");
                if (!io.sentry.hints.h.class.isInstance(n0Var.b("sentry:typeCheckHint")) || objB2 == null) {
                    io.sentry.util.b.o(io.sentry.hints.h.class, objB2, iLogger);
                } else {
                    d(file, (io.sentry.hints.h) objB2);
                }
            }
        } catch (Throwable th3) {
            Object objB3 = n0Var.b("sentry:typeCheckHint");
            if (!io.sentry.hints.h.class.isInstance(n0Var.b("sentry:typeCheckHint")) || objB3 == null) {
                io.sentry.util.b.o(io.sentry.hints.h.class, objB3, iLogger);
            } else {
                d(file, (io.sentry.hints.h) objB3);
            }
            throw th3;
        }
    }

    public final b4 c(l7 l7Var) {
        String str;
        ILogger iLogger = this.h;
        if (l7Var != null && (str = l7Var.i0) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(str));
                if (io.sentry.util.b.n(dValueOf, false)) {
                    String str2 = l7Var.j0;
                    if (str2 != null) {
                        Double dValueOf2 = Double.valueOf(Double.parseDouble(str2));
                        if (io.sentry.util.b.n(dValueOf2, false)) {
                            return new b4(Boolean.TRUE, dValueOf, dValueOf2);
                        }
                    }
                    return io.sentry.util.b.b(new b4(Boolean.TRUE, dValueOf));
                }
                iLogger.h(s5.ERROR, "Invalid sample rate parsed from TraceContext: %s", str);
            } catch (Exception unused) {
                iLogger.h(s5.ERROR, "Unable to parse sample rate from TraceContext: %s", str);
            }
        }
        return new b4(Boolean.TRUE, (Double) null);
    }

    public final /* synthetic */ void d(File file, io.sentry.hints.h hVar) {
        ILogger iLogger = this.h;
        if (hVar.a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            iLogger.h(s5.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e) {
            iLogger.d(s5.ERROR, e, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x0237  */
    public final void e(io.sentry.internal.debugmeta.c cVar, n0 n0Var) {
        int size;
        Object objB;
        s5 s5Var = s5.DEBUG;
        Iterable iterable = (Iterable) cVar.Z;
        c5 c5Var = (c5) cVar.Y;
        io.sentry.protocol.w wVar = c5Var.X;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                it.next();
                i2++;
            }
            size = i2;
        }
        Object[] objArr = {Integer.valueOf(size)};
        ILogger iLogger = this.h;
        iLogger.h(s5Var, "Processing Envelope with %d item(s)", objArr);
        Iterator it2 = iterable.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            h5 h5Var = (h5) it2.next();
            int i4 = i3 + 1;
            i5 i5Var = h5Var.a;
            i5 i5Var2 = h5Var.a;
            r5 r5Var = i5Var.g0;
            boolean zEquals = r5.Event.equals(i5Var.g0);
            o1 o1Var = this.g;
            Iterator it3 = it2;
            Charset charset = i;
            i1 i1Var = this.e;
            if (zEquals) {
                try {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(h5Var.g()), charset));
                        try {
                            j5 j5Var = (j5) o1Var.b(bufferedReader, j5.class);
                            if (j5Var == null) {
                                iLogger.h(s5.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i4), i5Var2.g0);
                            } else {
                                io.sentry.protocol.u uVar = j5Var.Z;
                                if (uVar != null) {
                                    String str = uVar.X;
                                    if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
                                        n0Var.d(Boolean.TRUE, "sentry:isFromHybridSdk");
                                    }
                                }
                                if (wVar == null || wVar.equals(j5Var.X)) {
                                    i1Var.z(j5Var, n0Var);
                                    iLogger.h(s5.DEBUG, "Item %d is being captured.", Integer.valueOf(i4));
                                    if (!f(n0Var)) {
                                        iLogger.h(s5.WARNING, "Timed out waiting for event id submission: %s", j5Var.X);
                                        bufferedReader.close();
                                        return;
                                    }
                                } else {
                                    iLogger.h(s5.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i4), c5Var.X, j5Var.X);
                                    bufferedReader.close();
                                }
                            }
                            bufferedReader.close();
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        iLogger.e(s5.ERROR, "Item failed to process.", th);
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                objB = n0Var.b("sentry:typeCheckHint");
                if (!(objB instanceof io.sentry.hints.k) && !((io.sentry.hints.k) objB).e()) {
                    iLogger.h(s5.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i4));
                    return;
                }
                Object objB2 = n0Var.b("sentry:typeCheckHint");
                if (!io.sentry.android.core.t0.class.isInstance(n0Var.b("sentry:typeCheckHint")) && objB2 != null) {
                    io.sentry.android.core.t0 t0Var = (io.sentry.android.core.t0) objB2;
                    t0Var.Z = new CountDownLatch(1);
                    t0Var.X = false;
                    t0Var.Y = false;
                }
                it2 = it3;
                i3 = i4;
            } else {
                if (r5.Transaction.equals(r5Var)) {
                    try {
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(h5Var.g()), charset));
                            try {
                                io.sentry.protocol.f0 f0Var = (io.sentry.protocol.f0) o1Var.b(bufferedReader2, io.sentry.protocol.f0.class);
                                if (f0Var == null) {
                                    iLogger.h(s5.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i4), i5Var2.g0);
                                } else if (wVar == null || wVar.equals(f0Var.X)) {
                                    l7 l7Var = c5Var.Z;
                                    if (f0Var.Y.j() != null) {
                                        f0Var.Y.j().a(c(l7Var));
                                    }
                                    i1Var.w(f0Var, l7Var, n0Var, null);
                                    iLogger.h(s5.DEBUG, "Item %d is being captured.", Integer.valueOf(i4));
                                    if (!f(n0Var)) {
                                        iLogger.h(s5.WARNING, "Timed out waiting for event id submission: %s", f0Var.X);
                                        bufferedReader2.close();
                                        return;
                                    }
                                } else {
                                    iLogger.h(s5.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i4), c5Var.X, f0Var.X);
                                    bufferedReader2.close();
                                }
                                bufferedReader2.close();
                            } catch (Throwable th5) {
                                try {
                                    bufferedReader2.close();
                                    throw th5;
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                    throw th5;
                                }
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            iLogger.e(s5.ERROR, "Item failed to process.", th);
                            objB = n0Var.b("sentry:typeCheckHint");
                            if (!(objB instanceof io.sentry.hints.k)) {
                            }
                            Object objB3 = n0Var.b("sentry:typeCheckHint");
                            if (!io.sentry.android.core.t0.class.isInstance(n0Var.b("sentry:typeCheckHint"))) {
                            }
                            it2 = it3;
                            i3 = i4;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                    }
                } else {
                    i1Var.g(new io.sentry.internal.debugmeta.c(wVar, c5Var.Y, h5Var), n0Var);
                    iLogger.h(s5.DEBUG, "%s item %d is being captured.", r5Var.getItemType(), Integer.valueOf(i4));
                    if (!f(n0Var)) {
                        iLogger.h(s5.WARNING, "Timed out waiting for item type submission: %s", r5Var.getItemType());
                        return;
                    }
                }
                objB = n0Var.b("sentry:typeCheckHint");
                if (!(objB instanceof io.sentry.hints.k)) {
                }
                Object objB4 = n0Var.b("sentry:typeCheckHint");
                if (!io.sentry.android.core.t0.class.isInstance(n0Var.b("sentry:typeCheckHint"))) {
                }
                it2 = it3;
                i3 = i4;
            }
            it2 = it3;
            i3 = i4;
        }
    }

    public final boolean f(n0 n0Var) {
        Object objB = n0Var.b("sentry:typeCheckHint");
        if (objB instanceof io.sentry.hints.f) {
            return ((io.sentry.hints.f) objB).d();
        }
        io.sentry.util.b.o(io.sentry.hints.f.class, objB, this.h);
        return true;
    }
}

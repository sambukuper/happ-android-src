package io.sentry.android.core;

import android.app.ApplicationExitInfo;
import android.content.Context;
import defpackage.b8;
import defpackage.o8;
import io.sentry.ILogger;
import io.sentry.h5;
import io.sentry.i5;
import io.sentry.j5;
import io.sentry.k2;
import io.sentry.r5;
import io.sentry.s5;
import j$.time.Instant;
import j$.time.format.DateTimeFormatter;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 implements k0 {
    public final SentryAndroidOptions a;
    public final o8 b;
    public final Context c;

    public j2(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
        this.b = new o8(sentryAndroidOptions);
        this.c = context;
    }

    @Override // io.sentry.android.core.k0
    public final boolean a(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getReason() == 5;
    }

    @Override // io.sentry.android.core.k0
    public final Long b() {
        return io.sentry.android.core.cache.b.j(this.a, "last_tombstone_report", "Tombstone");
    }

    @Override // io.sentry.android.core.k0
    public final String c() {
        return "Tombstone";
    }

    @Override // io.sentry.android.core.k0
    public final boolean d() {
        return this.a.isReportHistoricalTombstones();
    }

    @Override // io.sentry.android.core.k0
    public final io.sentry.n e(ApplicationExitInfo applicationExitInfo, boolean z) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            boolean zIsAttachRawTombstone = sentryAndroidOptions.isAttachRawTombstone();
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            try {
                if (traceInputStream == null) {
                    sentryAndroidOptions.getLogger().h(s5.WARNING, "No tombstone InputStream available for ApplicationExitInfo from %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())));
                    if (traceInputStream == null) {
                        return null;
                    }
                    traceInputStream.close();
                    return null;
                }
                byte[] bArrR = zIsAttachRawTombstone ? io.sentry.config.a.r(traceInputStream) : null;
                io.sentry.android.core.internal.tombstone.c cVar = new io.sentry.android.core.internal.tombstone.c(zIsAttachRawTombstone ? new ByteArrayInputStream(bArrR) : traceInputStream, sentryAndroidOptions.getInAppIncludes(), sentryAndroidOptions.getInAppExcludes(), this.c.getApplicationInfo().nativeLibraryDir);
                try {
                    j5 j5VarG = cVar.g();
                    cVar.close();
                    traceInputStream.close();
                    long timestamp = applicationExitInfo.getTimestamp();
                    j5VarG.r0 = new Date(timestamp);
                    i2 i2Var = new i2(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z);
                    io.sentry.n0 n0VarF = io.sentry.util.b.f(i2Var);
                    if (bArrR != null) {
                        n0VarF.g = new io.sentry.a("tombstone.pb", "application/x-protobuf", bArrR);
                    }
                    try {
                        j5 j5VarG2 = g(timestamp, j5VarG, n0VarF);
                        if (j5VarG2 != null) {
                            j5VarG = j5VarG2;
                        }
                    } catch (Throwable th) {
                        sentryAndroidOptions.getLogger().h(s5.WARNING, "Failed to merge native event with tombstone, continuing without merge: %s", th.getMessage());
                    }
                    return new io.sentry.n(j5VarG, n0VarF, i2Var, (byte) 1);
                } catch (Throwable th2) {
                    try {
                        cVar.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                if (traceInputStream == null) {
                    throw th4;
                }
                try {
                    traceInputStream.close();
                    throw th4;
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                    throw th4;
                }
            }
        } catch (Throwable th6) {
            sentryAndroidOptions.getLogger().h(s5.WARNING, "Failed to parse tombstone from %s: %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())), th6.getMessage());
            return null;
        }
        sentryAndroidOptions.getLogger().h(s5.WARNING, "Failed to parse tombstone from %s: %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())), th6.getMessage());
        return null;
    }

    @Override // io.sentry.android.core.k0
    public final void f(long j) {
        io.sentry.android.core.cache.b.l(this.a, Long.valueOf(j), "last_tombstone_report", "Tombstone");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018f  */
    /* JADX WARN: Code duplicated, block: B:246:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final j5 g(long j, j5 j5Var, io.sentry.n0 n0Var) {
        j5 j5Var2;
        boolean z;
        File[] fileArr;
        String name;
        c1 c1Var;
        c1 c1VarI;
        int i;
        String string;
        io.sentry.n nVar;
        String str;
        o8 o8Var = this.b;
        ArrayList arrayList = (ArrayList) o8Var.f0;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) o8Var.Z;
        int i2 = 0;
        if (o8Var.Y) {
            j5Var2 = null;
        } else {
            boolean z2 = true;
            o8Var.Y = true;
            String outboxPath = sentryAndroidOptions.getOutboxPath();
            if (outboxPath == null) {
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Outbox path is null, skipping native event collection.", new Object[0]);
            } else {
                File[] fileArrListFiles = new File(outboxPath).listFiles();
                if (fileArrListFiles == null) {
                    sentryAndroidOptions.getLogger().h(s5.DEBUG, "Outbox path is not a directory or an I/O error occurred: %s", outboxPath);
                } else if (fileArrListFiles.length == 0) {
                    sentryAndroidOptions.getLogger().h(s5.DEBUG, "No envelope files found in outbox.", new Object[0]);
                } else {
                    sentryAndroidOptions.getLogger().h(s5.DEBUG, "Scanning %d files in outbox for native events.", Integer.valueOf(fileArrListFiles.length));
                    int length = fileArrListFiles.length;
                    int i3 = 0;
                    while (i3 < length) {
                        File file = fileArrListFiles[i3];
                        if (!file.isFile() || (name = file.getName()) == null || name.startsWith("session") || name.startsWith("previous_session") || name.startsWith("startup_crash")) {
                            z = z2;
                            fileArr = fileArrListFiles;
                        } else {
                            try {
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                                int i4 = i2;
                                do {
                                    try {
                                        i = bufferedInputStream.read();
                                        c1Var = null;
                                        if (i == -1) {
                                            if (i4 > 0) {
                                                break;
                                            }
                                            i4 = -1;
                                            break;
                                        }
                                        i4++;
                                    } catch (Throwable th) {
                                        th = th;
                                        z = z2;
                                        fileArr = fileArrListFiles;
                                        c1Var = null;
                                    }
                                } while (i != 10);
                                if (i4 < 0) {
                                    try {
                                        bufferedInputStream.close();
                                        z = z2;
                                        fileArr = fileArrListFiles;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z = z2;
                                        fileArr = fileArrListFiles;
                                        sentryAndroidOptions.getLogger().d(s5.DEBUG, th, "Error extracting metadata from envelope file: %s", file.getAbsolutePath());
                                    }
                                } else {
                                    boolean z3 = z2;
                                    fileArr = fileArrListFiles;
                                    long j2 = i4;
                                    while (true) {
                                        if (j2 < 209715200) {
                                            try {
                                                StringBuilder sb = new StringBuilder();
                                                z = z3;
                                                while (true) {
                                                    try {
                                                        int i5 = bufferedInputStream.read();
                                                        if (i5 == -1) {
                                                            if (sb.length() <= 0) {
                                                                string = null;
                                                                break;
                                                            }
                                                            string = sb.toString();
                                                            break;
                                                        }
                                                        if (i5 == 10) {
                                                            string = sb.toString();
                                                            break;
                                                        }
                                                        sb.append((char) i5);
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        Throwable th4 = th;
                                                        try {
                                                            bufferedInputStream.close();
                                                        } catch (Throwable th5) {
                                                            th4.addSuppressed(th5);
                                                        }
                                                        throw th4;
                                                    }
                                                }
                                                if (string != null && !string.isEmpty()) {
                                                    long length2 = j2 + ((long) (string.length() + 1));
                                                    b8 b8VarM = o8Var.m(string);
                                                    if (b8VarM != null) {
                                                        int i6 = b8VarM.b;
                                                        if ("event".equals((String) b8VarM.c)) {
                                                            c1VarI = o8Var.i(bufferedInputStream, i6, file);
                                                            if (c1VarI != null) {
                                                                try {
                                                                    bufferedInputStream.close();
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    sentryAndroidOptions.getLogger().d(s5.DEBUG, th, "Error extracting metadata from envelope file: %s", file.getAbsolutePath());
                                                                    c1VarI = c1Var;
                                                                    if (c1VarI != null) {
                                                                        arrayList.add(c1VarI);
                                                                        sentryAndroidOptions.getLogger().h(s5.DEBUG, "Found native event in outbox: %s (timestamp: %d)", file.getName(), Long.valueOf(c1VarI.b));
                                                                    }
                                                                    i3++;
                                                                    fileArrListFiles = fileArr;
                                                                    z2 = z;
                                                                    i2 = 0;
                                                                }
                                                            }
                                                            if (c1VarI != null) {
                                                                arrayList.add(c1VarI);
                                                                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Found native event in outbox: %s (timestamp: %d)", file.getName(), Long.valueOf(c1VarI.b));
                                                            }
                                                        } else {
                                                            o8.o(bufferedInputStream, i6);
                                                        }
                                                        long j3 = length2 + ((long) i6);
                                                        int i7 = bufferedInputStream.read();
                                                        if (i7 != -1) {
                                                            j2 = j3 + 1;
                                                            if (i7 == 10) {
                                                                z3 = z;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                z = z3;
                                            }
                                        } else {
                                            z = z3;
                                        }
                                        bufferedInputStream.close();
                                    }
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                z = z2;
                                fileArr = fileArrListFiles;
                                c1Var = null;
                            }
                            c1VarI = c1Var;
                            if (c1VarI != null) {
                                arrayList.add(c1VarI);
                                sentryAndroidOptions.getLogger().h(s5.DEBUG, "Found native event in outbox: %s (timestamp: %d)", file.getName(), Long.valueOf(c1VarI.b));
                            }
                        }
                        i3++;
                        fileArrListFiles = fileArr;
                        z2 = z;
                        i2 = 0;
                    }
                    j5Var2 = null;
                    sentryAndroidOptions.getLogger().h(s5.DEBUG, "Collected %d native events from outbox.", Integer.valueOf(arrayList.size()));
                }
            }
            j5Var2 = null;
        }
        long tombstoneMergeTimeThresholdMillis = sentryAndroidOptions.getTombstoneMergeTimeThresholdMillis();
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                c1 c1Var2 = (c1) it.next();
                long jAbs = Math.abs(j - c1Var2.b);
                if (jAbs <= tombstoneMergeTimeThresholdMillis) {
                    sentryAndroidOptions.getLogger().h(s5.DEBUG, "Matched native event by timestamp (diff: %d ms, threshold: %d ms)", Long.valueOf(jAbs), Long.valueOf(tombstoneMergeTimeThresholdMillis));
                    arrayList.remove(c1Var2);
                    File file2 = c1Var2.a;
                    try {
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file2));
                        try {
                            io.sentry.internal.debugmeta.c cVarA = sentryAndroidOptions.getEnvelopeReader().a(bufferedInputStream2);
                            if (cVarA != null) {
                                Iterator it2 = ((Iterable) cVarA.Z).iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        h5 h5Var = (h5) it2.next();
                                        if (r5.Event.equals(h5Var.a.g0)) {
                                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(h5Var.g()), StandardCharsets.UTF_8));
                                            try {
                                                j5 j5Var3 = (j5) sentryAndroidOptions.getSerializer().b(bufferedReader, j5.class);
                                                if (j5Var3 != null && "native".equals(j5Var3.j0)) {
                                                    io.sentry.n nVar2 = new io.sentry.n(j5Var3, file2, cVarA, (byte) 2);
                                                    bufferedReader.close();
                                                    bufferedInputStream2.close();
                                                    nVar = nVar2;
                                                    break;
                                                }
                                                bufferedReader.close();
                                            } catch (Throwable th9) {
                                                try {
                                                    bufferedReader.close();
                                                    throw th9;
                                                } catch (Throwable th10) {
                                                    th9.addSuppressed(th10);
                                                    throw th9;
                                                }
                                            }
                                            try {
                                                bufferedInputStream2.close();
                                                throw th;
                                            } catch (Throwable th11) {
                                                th.addSuppressed(th11);
                                                throw th;
                                            }
                                        }
                                    }
                                }
                            }
                            bufferedInputStream2.close();
                        } catch (Throwable th12) {
                            bufferedInputStream2.close();
                            throw th12;
                        }
                    } catch (Throwable th13) {
                        sentryAndroidOptions.getLogger().d(s5.DEBUG, th13, "Error loading envelope file: %s", file2.getAbsolutePath());
                    }
                }
            } else {
                sentryAndroidOptions.getLogger().h(s5.DEBUG, "No native event matched the tombstone timestamp %d within %d ms.", Long.valueOf(j), Long.valueOf(tombstoneMergeTimeThresholdMillis));
            }
            nVar = j5Var2;
            break;
        }
        if (nVar != 0) {
            File file3 = (File) nVar.c;
            SentryAndroidOptions sentryAndroidOptions2 = this.a;
            ILogger logger = sentryAndroidOptions2.getLogger();
            s5 s5Var = s5.DEBUG;
            logger.h(s5Var, "Found matching native event for tombstone, removing from outbox: %s", file3.getName());
            try {
                if (file3.delete()) {
                    sentryAndroidOptions.getLogger().h(s5Var, "Deleted native event file from outbox: %s", file3.getName());
                    j5 j5Var4 = (j5) nVar.b;
                    ArrayList arrayListD = j5Var.d();
                    io.sentry.protocol.f fVar = j5Var.p0;
                    ArrayList arrayListE = j5Var.e();
                    if (arrayListD != null && !arrayListD.isEmpty() && fVar != null && arrayListE != null) {
                        io.sentry.protocol.o oVar = ((io.sentry.protocol.v) arrayListD.get(0)).h0;
                        if (oVar != null) {
                            oVar.X = io.sentry.android.core.internal.tombstone.a.TOMBSTONE_MERGED.getValue();
                        }
                        io.sentry.protocol.p pVar = j5Var4.s0;
                        if (pVar == null || (str = pVar.Y) == null || str.isEmpty()) {
                            j5Var4.s0 = j5Var.s0;
                        }
                        j5Var4.h(arrayListD);
                        j5Var4.p0 = fVar;
                        j5Var4.u0 = new k2(arrayListE);
                    }
                    for (h5 h5Var2 : (Iterable) ((io.sentry.internal.debugmeta.c) nVar.d).Z) {
                        try {
                            i5 i5Var = h5Var2.a;
                            String str2 = i5Var.Z;
                            if (i5Var.g0 == r5.Attachment && str2 != null) {
                                byte[] bArrG = h5Var2.g();
                                i5 i5Var2 = h5Var2.a;
                                try {
                                    n0Var.b.add(new io.sentry.a(bArrG, str2, i5Var2.X, i5Var2.j0));
                                } catch (Throwable th14) {
                                    th = th14;
                                    sentryAndroidOptions2.getLogger().h(s5.DEBUG, "Failed to process envelope item: %s", th.getMessage());
                                }
                            }
                        } catch (Throwable th15) {
                            th = th15;
                        }
                    }
                    return j5Var4;
                }
                sentryAndroidOptions.getLogger().h(s5.WARNING, "Failed to delete native event file: %s", file3.getAbsolutePath());
            } catch (Throwable th16) {
                sentryAndroidOptions.getLogger().d(s5.ERROR, th16, "Error deleting native event file: %s", file3.getAbsolutePath());
            }
        }
        return j5Var2;
    }
}

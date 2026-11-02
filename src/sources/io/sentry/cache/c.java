package io.sentry.cache;

import defpackage.j78;
import io.sentry.ILogger;
import io.sentry.android.core.d2;
import io.sentry.android.core.i2;
import io.sentry.c5;
import io.sentry.c7;
import io.sentry.d7;
import io.sentry.h5;
import io.sentry.hints.i;
import io.sentry.hints.j;
import io.sentry.i5;
import io.sentry.n0;
import io.sentry.o1;
import io.sentry.p7;
import io.sentry.r5;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.z4;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class c implements d {
    public static final Charset k0 = Charset.forName("UTF-8");
    public final s6 X;
    public final io.sentry.d Z;
    public final int f0;
    public final io.sentry.util.g Y = new io.sentry.util.g(new j78(this, (byte) 23));
    public final WeakHashMap h0 = new WeakHashMap();
    public final io.sentry.util.a i0 = new io.sentry.util.a();
    public final io.sentry.util.a j0 = new io.sentry.util.a();
    public final CountDownLatch g0 = new CountDownLatch(1);

    public c(s6 s6Var, String str, int i) {
        this.X = s6Var;
        this.Z = new io.sentry.d(str);
        this.f0 = i;
    }

    @Override // io.sentry.cache.d
    public final void J(io.sentry.internal.debugmeta.c cVar) {
        io.sentry.util.b.s(cVar, "Envelope is required.");
        File fileB = b(cVar);
        boolean zDelete = fileB.delete();
        s6 s6Var = this.X;
        if (zDelete) {
            s6Var.getLogger().h(s5.DEBUG, "Discarding envelope from cache: %s", fileB.getAbsolutePath());
        } else {
            s6Var.getLogger().h(s5.DEBUG, "Envelope was not cached or could not be deleted: %s", fileB.getAbsolutePath());
        }
    }

    public final File[] a() {
        io.sentry.d dVar = this.Z;
        File file = (File) dVar.Y;
        if (file.isDirectory() && file.canWrite() && file.canRead()) {
            File[] fileArrListFiles = ((File) dVar.Y).listFiles(new b());
            if (fileArrListFiles != null) {
                return fileArrListFiles;
            }
        } else {
            this.X.getLogger().h(s5.ERROR, "The directory for caching files is inaccessible.: %s", file.getAbsolutePath());
        }
        return new File[0];
    }

    public final File b(io.sentry.internal.debugmeta.c cVar) {
        String str;
        WeakHashMap weakHashMap = this.h0;
        io.sentry.util.a aVar = this.i0;
        aVar.g();
        try {
            if (weakHashMap.containsKey(cVar)) {
                str = (String) weakHashMap.get(cVar);
            } else {
                String strConcat = io.sentry.config.a.f().concat(".envelope");
                weakHashMap.put(cVar, strConcat);
                str = strConcat;
            }
            File file = new File((File) this.Z.Y, str);
            aVar.close();
            return file;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c(File file, File file2) {
        io.sentry.util.a aVar = this.j0;
        aVar.g();
        try {
            if (!file.exists()) {
                aVar.close();
                return;
            }
            boolean zExists = file2.exists();
            s6 s6Var = this.X;
            if (zExists) {
                s6Var.getLogger().h(s5.DEBUG, "Previous session file already exists, deleting it.", new Object[0]);
                if (!file2.delete()) {
                    s6Var.getLogger().h(s5.WARNING, "Unable to delete previous session file: %s", file2);
                }
            }
            s6Var.getLogger().h(s5.INFO, "Moving current session to previous session.", new Object[0]);
            try {
                if (!file.renameTo(file2)) {
                    s6Var.getLogger().h(s5.WARNING, "Unable to move current session to previous session.", new Object[0]);
                }
            } catch (Throwable th) {
                s6Var.getLogger().e(s5.ERROR, "Error moving current session to previous session.", th);
            }
            aVar.close();
        } catch (Throwable th2) {
            try {
                aVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final io.sentry.internal.debugmeta.c d(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                io.sentry.internal.debugmeta.c cVarC = ((o1) this.Y.a()).c(bufferedInputStream);
                bufferedInputStream.close();
                return cVarC;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            this.X.getLogger().e(s5.ERROR, "Failed to deserialize the envelope.", e);
            return null;
        }
    }

    public final d7 e(h5 h5Var) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(h5Var.g()), k0));
            try {
                d7 d7Var = (d7) ((o1) this.Y.a()).b(bufferedReader, d7.class);
                bufferedReader.close();
                return d7Var;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.X.getLogger().e(s5.ERROR, "Failed to deserialize the session.", th3);
            return null;
        }
    }

    public final d7 f(io.sentry.internal.debugmeta.c cVar) {
        Iterable iterable = (Iterable) cVar.Z;
        boolean zHasNext = iterable.iterator().hasNext();
        s6 s6Var = this.X;
        if (!zHasNext) {
            s6Var.getLogger().h(s5.INFO, "Current envelope is empty.", new Object[0]);
            return null;
        }
        h5 h5Var = (h5) iterable.iterator().next();
        r5 r5Var = r5.Session;
        i5 i5Var = h5Var.a;
        r5 r5Var2 = i5Var.g0;
        if (!r5Var.equals(i5Var.g0)) {
            s6Var.getLogger().h(s5.INFO, "Current envelope has a different envelope type %s", r5Var2);
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(h5Var.g()), k0));
            try {
                d7 d7Var = (d7) ((o1) this.Y.a()).b(bufferedReader, d7.class);
                if (d7Var != null) {
                    bufferedReader.close();
                    return d7Var;
                }
                s6Var.getLogger().h(s5.ERROR, "Item of type %s returned null by the parser.", r5Var2);
                bufferedReader.close();
                return null;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            s6Var.getLogger().e(s5.ERROR, "Item failed to process.", th3);
            return null;
        }
        s6Var.getLogger().e(s5.ERROR, "Item failed to process.", th3);
        return null;
    }

    public final boolean h() {
        s6 s6Var = this.X;
        try {
            return this.g0.await(s6Var.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            s6Var.getLogger().h(s5.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    public final void i(File file, d7 d7Var) {
        String str = d7Var.g0;
        s6 s6Var = this.X;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, k0));
                try {
                    s6Var.getLogger().h(s5.DEBUG, "Overwriting session to offline storage: %s", str);
                    ((o1) this.Y.a()).a(d7Var, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            s6Var.getLogger().d(s5.ERROR, th5, "Error writing Session to offline storage: %s", str);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        s6 s6Var = this.X;
        File[] fileArrA = a();
        ArrayList arrayList = new ArrayList(fileArrA.length);
        for (File file : fileArrA) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(((o1) this.Y.a()).c(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                s6Var.getLogger().h(s5.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e) {
                s6Var.getLogger().e(s5.ERROR, "Error while reading cached envelope from file " + file.getAbsolutePath(), e);
            }
        }
        return arrayList.iterator();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0065  */
    /* JADX WARN: Code duplicated, block: B:198:0x0409  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    @Override // io.sentry.cache.d
    public boolean m(io.sentry.internal.debugmeta.c cVar, n0 n0Var) {
        ?? r15;
        ?? r16;
        boolean z;
        Throwable th;
        boolean z2;
        Date date;
        boolean z3;
        ?? r13;
        String str;
        boolean z4;
        File[] fileArr;
        int i;
        io.sentry.util.g gVar;
        d7 d7VarE;
        Boolean bool;
        String str2;
        int i2;
        h5 h5VarE;
        d7 d7VarE2;
        io.sentry.util.b.s(cVar, "Envelope is required.");
        io.sentry.d dVar = this.Z;
        File file = (File) dVar.Y;
        io.sentry.util.b.e(file);
        String absolutePath = file.getAbsolutePath();
        File[] fileArrA = a();
        int length = fileArrA.length;
        io.sentry.util.g gVar2 = this.Y;
        s6 s6Var = this.X;
        int i3 = this.f0;
        if (length >= i3) {
            String str3 = "Cache folder if full (respecting maxSize). Rotating files";
            s6Var.getLogger().h(s5.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i4 = (length - i3) + 1;
            if (fileArrA.length > 1) {
                Arrays.sort(fileArrA, new d2((byte) 2));
            }
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArrA, i4, length);
            int i5 = 0;
            r16 = str3;
            while (i5 < i4) {
                File file2 = fileArrA[i5];
                io.sentry.internal.debugmeta.c cVarD = d(file2);
                String str4 = "File can't be deleted: %s";
                if (cVarD == null) {
                    fileArr = fileArrA;
                    i = i4;
                    gVar = gVar2;
                    s6Var = s6Var;
                    break;
                }
                Iterable iterable = (Iterable) cVarD.Z;
                if (iterable.iterator().hasNext()) {
                    fileArr = fileArrA;
                    s6Var.getClientReportRecorder().b(io.sentry.clientreport.d.CACHE_OVERFLOW, cVarD);
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            d7VarE = null;
                            break;
                        }
                        h5 h5Var = (h5) it.next();
                        if (h5Var == null ? false : h5Var.a.g0.equals(r5.Session)) {
                            d7VarE = e(h5Var);
                            break;
                        }
                    }
                    if (d7VarE != null) {
                        String str5 = d7VarE.g0;
                        if (d7VarE.i0.equals(c7.Ok) && str5 != null && (bool = d7VarE.h0) != null && bool.booleanValue()) {
                            int length2 = fileArr2.length;
                            int i6 = 0;
                            while (true) {
                                if (i6 < length2) {
                                    i = i4;
                                    File file3 = fileArr2[i6];
                                    gVar = gVar2;
                                    io.sentry.internal.debugmeta.c cVarD2 = d(file3);
                                    if (cVarD2 != null) {
                                        Iterable iterable2 = (Iterable) cVarD2.Z;
                                        if (iterable2.iterator().hasNext()) {
                                            Iterator it2 = iterable2.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    str2 = str5;
                                                    length2 = length2;
                                                    s6Var = s6Var;
                                                    i2 = i6;
                                                    h5VarE = null;
                                                    break;
                                                }
                                                it2 = it2;
                                                h5 h5Var2 = (h5) it2.next();
                                                if ((h5Var2 == null ? false : h5Var2.a.g0.equals(r5.Session)) && (d7VarE2 = e(h5Var2)) != null) {
                                                    String str6 = d7VarE2.g0;
                                                    i2 = i6;
                                                    if (d7VarE2.i0.equals(c7.Ok) && str6 != null) {
                                                        Boolean bool2 = d7VarE2.h0;
                                                        if (bool2 != null && bool2.booleanValue()) {
                                                            s6Var.getLogger().h(s5.ERROR, "Session %s has 2 times the init flag.", str5);
                                                            break;
                                                        }
                                                        if (str5 != null && str5.equals(str6)) {
                                                            d7VarE2.h0 = Boolean.TRUE;
                                                            try {
                                                                h5VarE = h5.e((o1) gVar.a(), d7VarE2);
                                                                try {
                                                                    it2.remove();
                                                                    str2 = str5;
                                                                    break;
                                                                } catch (IOException e) {
                                                                    e = e;
                                                                    str2 = str5;
                                                                    s6Var.getLogger().d(s5.ERROR, e, "Failed to create new envelope item for the session %s", str2);
                                                                    h5VarE = h5VarE;
                                                                    break;
                                                                }
                                                            } catch (IOException e2) {
                                                                e = e2;
                                                                h5VarE = null;
                                                            }
                                                        }
                                                    }
                                                    i6 = i2;
                                                    str5 = str5;
                                                }
                                            }
                                            if (h5VarE != null) {
                                                ArrayList arrayList = new ArrayList();
                                                Iterator it3 = iterable2.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList.add((h5) it3.next());
                                                }
                                                arrayList.add(h5VarE);
                                                io.sentry.internal.debugmeta.c cVar2 = new io.sentry.internal.debugmeta.c((c5) cVarD2.Y, arrayList);
                                                long jLastModified = file3.lastModified();
                                                if (!file3.delete()) {
                                                    s6Var.getLogger().h(s5.WARNING, "File can't be deleted: %s", file3.getAbsolutePath());
                                                }
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                                    try {
                                                        ((o1) gVar.a()).e(cVar2, fileOutputStream);
                                                        file3.setLastModified(jLastModified);
                                                        fileOutputStream.close();
                                                        break;
                                                    } catch (Throwable th2) {
                                                        try {
                                                            fileOutputStream.close();
                                                        } catch (Throwable th3) {
                                                            th2.addSuppressed(th3);
                                                        }
                                                        throw th2;
                                                    }
                                                } catch (Throwable th4) {
                                                    s6Var.getLogger().e(s5.ERROR, "Failed to serialize the new envelope to the disk.", th4);
                                                    break;
                                                }
                                            }
                                        } else {
                                            str2 = str5;
                                            length2 = length2;
                                            s6Var = s6Var;
                                            i2 = i6;
                                        }
                                    } else {
                                        str2 = str5;
                                        length2 = length2;
                                        s6Var = s6Var;
                                        i2 = i6;
                                    }
                                    i6 = i2 + 1;
                                    i4 = i;
                                    gVar2 = gVar;
                                    length2 = length2;
                                    s6Var = s6Var;
                                    str5 = str2;
                                }
                            }
                        }
                    }
                } else {
                    fileArr = fileArrA;
                }
                i = i4;
                gVar = gVar2;
                s6Var = s6Var;
                break;
                if (!file2.delete()) {
                    s6Var.getLogger().h(s5.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
                }
                i5++;
                fileArrA = fileArr;
                i4 = i;
                gVar2 = gVar;
                s6Var = s6Var;
                r16 = str4;
            }
        }
        io.sentry.util.g gVar3 = gVar2;
        s6 s6Var2 = s6Var;
        File file4 = new File(absolutePath, "session.json");
        File file5 = new File(absolutePath, "previous_session.json");
        boolean zJ = io.sentry.util.b.j(n0Var, i.class);
        io.sentry.util.a aVar = this.j0;
        if (zJ) {
            aVar.g();
            try {
                if (!file4.delete()) {
                    s6Var2.getLogger().h(s5.WARNING, "Current envelope doesn't exist.", new Object[0]);
                }
                aVar.close();
            } catch (Throwable th5) {
                try {
                    aVar.close();
                    throw th5;
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                    throw th5;
                }
            }
        }
        boolean zIsInstance = io.sentry.hints.a.class.isInstance(n0Var.b("sentry:typeCheckHint"));
        Charset charset = k0;
        if (zIsInstance || io.sentry.hints.g.class.isInstance(n0Var.b("sentry:typeCheckHint"))) {
            Object objB = n0Var.b("sentry:typeCheckHint");
            File file6 = new File(((File) dVar.Y).getAbsolutePath(), "previous_session.json");
            if (file6.exists()) {
                ILogger logger = s6Var2.getLogger();
                s5 s5Var = s5.WARNING;
                logger.h(s5Var, "Previous session is not ended, we'd need to end it.", new Object[0]);
                try {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file6), charset));
                        try {
                            d7 d7Var = (d7) ((o1) gVar3.a()).b(bufferedReader, d7.class);
                            if (d7Var != null) {
                                Date date2 = d7Var.X;
                                try {
                                    if (objB instanceof io.sentry.hints.a) {
                                        io.sentry.hints.a aVar2 = (io.sentry.hints.a) objB;
                                        Long lB = aVar2.b();
                                        if (lB != null) {
                                            date = new Date(lB.longValue());
                                            if (date.before(date2)) {
                                                s6Var2.getLogger().h(s5Var, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                                                bufferedReader.close();
                                                r15 = 1;
                                            }
                                        } else {
                                            date = null;
                                        }
                                        d7Var.c(c7.Abnormal, null, true, aVar2.e());
                                        z = true;
                                        d7Var.b(date);
                                        i(file6, d7Var);
                                        z2 = z;
                                    } else {
                                        if (objB instanceof io.sentry.hints.g) {
                                            date = new Date(((i2) ((io.sentry.hints.g) objB)).f0);
                                            if (date.before(date2)) {
                                                s6Var2.getLogger().h(s5Var, "Native crash exit happened before previous session start, not ending the session.", new Object[0]);
                                                bufferedReader.close();
                                                r15 = 1;
                                            } else {
                                                z = true;
                                                z = true;
                                                try {
                                                    d7Var.c(c7.Crashed, null, true, null);
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    th = th;
                                                    r16 = z;
                                                    bufferedReader.close();
                                                    throw th;
                                                }
                                            }
                                            th = th;
                                            r16 = z;
                                            try {
                                                bufferedReader.close();
                                                throw th;
                                            } catch (Throwable th8) {
                                                th.addSuppressed(th8);
                                                throw th;
                                            }
                                        }
                                        z = true;
                                        date = null;
                                        d7Var.b(date);
                                        i(file6, d7Var);
                                        z2 = z;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    r16 = 1;
                                    bufferedReader.close();
                                    throw th;
                                }
                            } else {
                                z2 = true;
                            }
                            bufferedReader.close();
                            r15 = z2;
                        } catch (Throwable th10) {
                            th = th10;
                            z = true;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        s6Var2.getLogger().e(s5.ERROR, "Error processing previous session.", th);
                        r15 = r16;
                    }
                } catch (Throwable th12) {
                    th = th12;
                    r16 = 1;
                    s6Var2.getLogger().e(s5.ERROR, "Error processing previous session.", th);
                    r15 = r16;
                }
            } else {
                r15 = 1;
                s6Var2.getLogger().h(s5.DEBUG, "No previous session file to end.", new Object[0]);
            }
        } else {
            r15 = 1;
        }
        if (j.class.isInstance(n0Var.b("sentry:typeCheckHint"))) {
            aVar.g();
            try {
                d7 d7VarF = f(cVar);
                if (d7VarF == null || (str = d7VarF.g0) == null || !str.equals(null)) {
                    c(file4, file5);
                    if (d7VarF != null) {
                        i(file4, d7VarF);
                    }
                }
                aVar.close();
                if (new File(s6Var2.getCacheDirPath(), ".sentry-native/last_crash").exists()) {
                    z4 = false;
                } else {
                    File file7 = new File(s6Var2.getCacheDirPath(), "last_crash");
                    if (file7.exists()) {
                        z4 = false;
                        z4 = false;
                        s6Var2.getLogger().h(s5.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                        if (!file7.delete()) {
                            s6Var2.getLogger().h(s5.ERROR, "Failed to delete the crash marker file. %s.", file7.getAbsolutePath());
                        }
                    } else {
                        z4 = false;
                    }
                }
                z4.c.a();
                this.g0.countDown();
                z3 = z4;
            } catch (Throwable th13) {
                try {
                    aVar.close();
                    throw th13;
                } catch (Throwable th14) {
                    th13.addSuppressed(th14);
                    throw th13;
                }
            }
        } else {
            z3 = false;
        }
        File fileB = b(cVar);
        if (fileB.exists()) {
            s6Var2.getLogger().h(s5.WARNING, "Not adding Envelope to offline storage because it already exists: %s", fileB.getAbsolutePath());
            return r15;
        }
        ILogger logger2 = s6Var2.getLogger();
        s5 s5Var2 = s5.DEBUG;
        logger2.h(s5Var2, "Adding Envelope to offline storage: %s", fileB.getAbsolutePath());
        if (fileB.exists()) {
            s6Var2.getLogger().h(s5Var2, "Overwriting envelope to offline storage: %s", fileB.getAbsolutePath());
            if (!fileB.delete()) {
                s6Var2.getLogger().h(s5.ERROR, "Failed to delete: %s", fileB.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileB);
            try {
                ((o1) gVar3.a()).e(cVar, fileOutputStream2);
                fileOutputStream2.close();
                r13 = r15;
                if (p7.class.isInstance(n0Var.b("sentry:typeCheckHint"))) {
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(new File(s6Var2.getCacheDirPath(), "last_crash"));
                        try {
                            fileOutputStream3.write(io.sentry.vendor.a.f(new Date().getTime()).getBytes(charset));
                            fileOutputStream3.flush();
                            fileOutputStream3.close();
                        } catch (Throwable th15) {
                            try {
                                fileOutputStream3.close();
                                throw th15;
                            } catch (Throwable th16) {
                                th15.addSuppressed(th16);
                                throw th15;
                            }
                        }
                    } catch (Throwable th17) {
                        s6Var2.getLogger().e(s5.ERROR, "Error writing the crash marker file to the disk", th17);
                    }
                }
                return r13;
            } catch (Throwable th18) {
                try {
                    fileOutputStream2.close();
                    throw th18;
                } catch (Throwable th19) {
                    th18.addSuppressed(th19);
                    throw th18;
                }
            }
        } catch (Throwable th20) {
            s6Var2.getLogger().d(s5.ERROR, th20, "Error writing Envelope %s to offline storage", fileB.getAbsolutePath());
            r13 = z3;
        }
    }
}

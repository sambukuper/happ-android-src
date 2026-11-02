package io.sentry;

import defpackage.i82;
import defpackage.pc6;
import defpackage.x43;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h5 {
    public static final Charset d = Charset.forName("UTF-8");
    public final i5 a;
    public final Callable b;
    public byte[] c;

    public h5(i5 i5Var, byte[] bArr) {
        this.a = i5Var;
        this.c = bArr;
        this.b = null;
    }

    public static void a(long j, String str, long j2) throws io.sentry.exception.c {
        if (j > j2) {
            throw new io.sentry.exception.c(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    public static h5 b(o1 o1Var, io.sentry.clientreport.b bVar) {
        io.sentry.util.b.s(o1Var, "ISerializer is required.");
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new i82(o1Var, bVar, (byte) 5));
        return new h5(new i5(r5.resolve(bVar), new d5(cVar, (byte) 11), "application/json", null, null), new d5(cVar, (byte) 12));
    }

    public static h5 c(w3 w3Var, o1 o1Var) throws io.sentry.exception.c {
        File file = w3Var.n0;
        if (file == null || !file.exists()) {
            throw new io.sentry.exception.c(pc6.p("Dropping perfetto profile chunk, because the trace file '", file != null ? file.getName() : "null", "' doesn't exist"));
        }
        AtomicReference atomicReference = new AtomicReference(null);
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new g5(o1Var, w3Var, atomicReference, file));
        return new h5(new i5(r5.ProfileChunk, -1, new d5(cVar, (byte) 18), w3Var.m0, file.getName(), null, w3Var.h0, null, new x43(atomicReference, (byte) 3)), new d5(cVar, (byte) 19));
    }

    public static h5 d(w3 w3Var, o1 o1Var, f1 f1Var) {
        File file = w3Var.n0;
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new g5(file, w3Var, f1Var, o1Var));
        return new h5(new i5(r5.ProfileChunk, new d5(cVar, (byte) 16), "application-json", file != null ? file.getName() : null, null, w3Var.h0, null), new d5(cVar, (byte) 17));
    }

    public static h5 e(o1 o1Var, d7 d7Var) {
        io.sentry.util.b.s(o1Var, "ISerializer is required.");
        io.sentry.util.b.s(d7Var, "Session is required.");
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new i82(o1Var, d7Var, (byte) 2));
        return new h5(new i5(r5.Session, new d5(cVar, (byte) 0), "application/json", null, null), new d5(cVar, (byte) 1));
    }

    public static byte[] i(LinkedHashMap linkedHashMap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (linkedHashMap.size() | 128));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                byte[] bytes = ((String) entry.getKey()).getBytes(d);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] bArr = (byte[]) entry.getValue();
                int length2 = bArr.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(bArr);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final io.sentry.clientreport.b f(o1 o1Var) throws IOException {
        if (this.a.g0 != r5.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(g()), d));
        try {
            io.sentry.clientreport.b bVar = (io.sentry.clientreport.b) o1Var.b(bufferedReader, io.sentry.clientreport.b.class);
            bufferedReader.close();
            return bVar;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final byte[] g() {
        Callable callable;
        byte[] bArr = this.c;
        if (bArr != null || (callable = this.b) == null) {
            return bArr;
        }
        byte[] bArr2 = (byte[]) callable.call();
        this.c = bArr2;
        return bArr2;
    }

    public final io.sentry.protocol.f0 h(o1 o1Var) throws IOException {
        if (this.a.g0 != r5.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(g()), d));
        try {
            io.sentry.protocol.f0 f0Var = (io.sentry.protocol.f0) o1Var.b(bufferedReader, io.sentry.protocol.f0.class);
            bufferedReader.close();
            return f0Var;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public h5(i5 i5Var, Callable callable) {
        this.a = i5Var;
        this.b = callable;
        this.c = null;
    }
}

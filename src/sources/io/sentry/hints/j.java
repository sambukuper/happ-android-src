package io.sentry.hints;

import defpackage.wg;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.h5;
import io.sentry.p;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements io.sentry.cache.tape.f, io.sentry.clientreport.f, io.sentry.metrics.a {
    @Override // io.sentry.metrics.a
    public io.sentry.logger.b c(SentryAndroidOptions sentryAndroidOptions, wg wgVar) {
        return new io.sentry.logger.b(sentryAndroidOptions, wgVar, (byte) 1);
    }

    @Override // io.sentry.cache.tape.f
    public Object d(byte[] bArr) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            if (dataInputStream.readShort() == 1) {
                long j = dataInputStream.readLong();
                int i = dataInputStream.readInt();
                if (i >= 0 && i <= 1000) {
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        String utf = dataInputStream.readUTF();
                        String utf2 = dataInputStream.readUTF();
                        boolean z = dataInputStream.readBoolean();
                        String utf3 = dataInputStream.readUTF();
                        if (z) {
                            utf3 = null;
                        }
                        stackTraceElementArr[i2] = new StackTraceElement(utf, utf2, utf3, dataInputStream.readInt());
                    }
                    return new io.sentry.android.core.anr.g(j, stackTraceElementArr);
                }
            }
        } catch (EOFException unused) {
        }
        return null;
    }

    @Override // io.sentry.cache.tape.f
    public void e(Comparable comparable, OutputStream outputStream) throws IOException {
        io.sentry.android.core.anr.g gVar = (io.sentry.android.core.anr.g) comparable;
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        try {
            gVar.a(dataOutputStream);
            dataOutputStream.flush();
            outputStream.flush();
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.clientreport.f
    public io.sentry.internal.debugmeta.c j(io.sentry.internal.debugmeta.c cVar) {
        return cVar;
    }

    @Override // io.sentry.clientreport.f
    public void a(io.sentry.clientreport.d dVar, p pVar) {
    }

    @Override // io.sentry.clientreport.f
    public void b(io.sentry.clientreport.d dVar, io.sentry.internal.debugmeta.c cVar) {
    }

    @Override // io.sentry.clientreport.f
    public void g(io.sentry.clientreport.d dVar, h5 h5Var) {
    }

    @Override // io.sentry.clientreport.f
    public void f(io.sentry.clientreport.d dVar, p pVar, long j) {
    }
}

package io.sentry.android.core.anr;

import io.sentry.ILogger;
import io.sentry.cache.tape.j;
import io.sentry.s5;
import io.sentry.s6;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements AutoCloseable {
    public final io.sentry.cache.tape.g X;

    public d(s6 s6Var, File file) {
        j jVar;
        ILogger logger = s6Var.getLogger();
        try {
            try {
                RandomAccessFile randomAccessFileR = j.R(file, true);
                try {
                    jVar = new j(file, randomAccessFileR, 120, true);
                } catch (Throwable th) {
                    randomAccessFileR.close();
                    throw th;
                }
            } catch (IOException unused) {
                if (!file.delete()) {
                    throw new IOException("Could not delete file");
                }
                RandomAccessFile randomAccessFileR2 = j.R(file, true);
                try {
                    jVar = new j(file, randomAccessFileR2, 120, true);
                } catch (Throwable th2) {
                    randomAccessFileR2.close();
                    throw th2;
                }
            }
        } catch (IOException e) {
            logger.e(s5.ERROR, "Failed to create stacktrace queue", e);
            jVar = null;
        }
        if (jVar == null) {
            this.X = new io.sentry.cache.tape.b();
        } else {
            this.X = new io.sentry.cache.tape.e(jVar, new io.sentry.hints.j());
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.X.close();
    }
}

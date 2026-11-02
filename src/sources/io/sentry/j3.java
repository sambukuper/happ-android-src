package io.sentry;

import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j3 implements o1 {
    public static final j3 a = new j3();

    @Override // io.sentry.o1
    public final Object b(Reader reader, Class cls) {
        return null;
    }

    @Override // io.sentry.o1
    public final io.sentry.internal.debugmeta.c c(BufferedInputStream bufferedInputStream) {
        return null;
    }

    @Override // io.sentry.o1
    public final String d(Map map) {
        return _UrlKt.FRAGMENT_ENCODE_SET;
    }

    @Override // io.sentry.o1
    public final void a(Object obj, Writer writer) {
    }

    @Override // io.sentry.o1
    public final void e(io.sentry.internal.debugmeta.c cVar, OutputStream outputStream) {
    }
}

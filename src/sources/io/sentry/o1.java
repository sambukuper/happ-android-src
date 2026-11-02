package io.sentry;

import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface o1 {
    void a(Object obj, Writer writer);

    Object b(Reader reader, Class cls);

    io.sentry.internal.debugmeta.c c(BufferedInputStream bufferedInputStream);

    String d(Map map);

    void e(io.sentry.internal.debugmeta.c cVar, OutputStream outputStream);
}

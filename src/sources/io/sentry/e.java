package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static void a(HashMap map, String str, io.sentry.internal.debugmeta.c cVar, String str2, ILogger iLogger) throws IOException {
        Object obj = map.get(str);
        cVar.p(str2);
        cVar.v(iLogger, obj);
    }

    public static void b(ConcurrentHashMap concurrentHashMap, String str, io.sentry.internal.debugmeta.c cVar, String str2, ILogger iLogger) throws IOException {
        Object obj = concurrentHashMap.get(str);
        cVar.p(str2);
        cVar.v(iLogger, obj);
    }
}

package io.sentry.util;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final ThreadLocal a = new ThreadLocal();
    public static final m b = new m();

    public static m a() {
        ThreadLocal threadLocal = a;
        Integer num = (Integer) threadLocal.get();
        threadLocal.set(Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        return b;
    }

    public static boolean b() {
        Integer num = (Integer) a.get();
        return num != null && num.intValue() > 0;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j98 {
    public static final ThreadLocal a = new ThreadLocal();

    public static d42 a() {
        ThreadLocal threadLocal = a;
        d42 d42Var = (d42) threadLocal.get();
        if (d42Var != null) {
            return d42Var;
        }
        n60 n60Var = new n60(Thread.currentThread());
        threadLocal.set(n60Var);
        return n60Var;
    }
}

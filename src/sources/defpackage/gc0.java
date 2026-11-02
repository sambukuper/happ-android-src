package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gc0 {
    public static final /* synthetic */ int a = 0;

    static {
        Object rj6Var;
        try {
            rj6Var = Class.forName("java.lang.ClassValue");
        } catch (Throwable th) {
            rj6Var = new rj6(th);
        }
        if (!(rj6Var instanceof rj6)) {
            rj6Var = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (rj6Var instanceof rj6) {
            rj6Var = obj;
        }
    }
}

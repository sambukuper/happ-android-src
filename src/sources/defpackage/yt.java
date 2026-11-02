package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yt {
    public static final int a;

    static {
        Object rj6Var;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            rj6Var = property != null ? mm7.b0(property) : null;
        } catch (Throwable th) {
            rj6Var = new rj6(th);
        }
        Integer num = (Integer) (rj6Var instanceof rj6 ? null : rj6Var);
        a = num != null ? num.intValue() : 2097152;
    }
}

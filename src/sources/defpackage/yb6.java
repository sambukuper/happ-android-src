package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yb6 {
    public static final zb6 a;

    static {
        zb6 zb6Var = null;
        try {
            zb6Var = (zb6) bc6.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (zb6Var == null) {
            zb6Var = new zb6();
        }
        a = zb6Var;
    }
}

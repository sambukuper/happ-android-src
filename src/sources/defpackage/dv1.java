package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class dv1 {
    public static final dv1 X;
    public static final dv1 Y;
    public static final /* synthetic */ dv1[] Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        dv1 dv1Var = new dv1("SETTLE", 0);
        X = dv1Var;
        dv1 dv1Var2 = new dv1("DISMISS", 1);
        Y = dv1Var2;
        Z = new dv1[]{dv1Var, dv1Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static dv1 valueOf(String str) {
        return (dv1) Enum.valueOf(dv1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static dv1[] values() {
        return (dv1[]) Z.clone();
    }
}

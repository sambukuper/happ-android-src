package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class bv1 {
    public static final bv1 X;
    public static final bv1 Y;
    public static final bv1 Z;
    public static final /* synthetic */ bv1[] f0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        bv1 bv1Var = new bv1("SETTLE", 0);
        X = bv1Var;
        bv1 bv1Var2 = new bv1("DISMISS", 1);
        Y = bv1Var2;
        bv1 bv1Var3 = new bv1("SHARE", 2);
        Z = bv1Var3;
        f0 = new bv1[]{bv1Var, bv1Var2, bv1Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static bv1 valueOf(String str) {
        return (bv1) Enum.valueOf(bv1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static bv1[] values() {
        return (bv1[]) f0.clone();
    }
}

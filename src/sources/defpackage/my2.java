package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class my2 {
    public static final my2 X;
    public static final my2 Y;
    public static final my2 Z;
    public static final /* synthetic */ my2[] f0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        my2 my2Var = new my2("POSITIVE", 0);
        X = my2Var;
        my2 my2Var2 = new my2("NEGATIVE", 1);
        Y = my2Var2;
        my2 my2Var3 = new my2("INFO", 2);
        Z = my2Var3;
        f0 = new my2[]{my2Var, my2Var2, my2Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static my2 valueOf(String str) {
        return (my2) Enum.valueOf(my2.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static my2[] values() {
        return (my2[]) f0.clone();
    }
}

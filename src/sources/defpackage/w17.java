package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class w17 {
    public static final w17 X;
    public static final w17 Y;
    public static final w17 Z;
    public static final /* synthetic */ w17[] f0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        w17 w17Var = new w17("UNDEFINED", 0);
        X = w17Var;
        w17 w17Var2 = new w17("RUNNING", 1);
        Y = w17Var2;
        w17 w17Var3 = new w17("STOPPED", 2);
        Z = w17Var3;
        f0 = new w17[]{w17Var, w17Var2, w17Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static w17 valueOf(String str) {
        return (w17) Enum.valueOf(w17.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static w17[] values() {
        return (w17[]) f0.clone();
    }
}

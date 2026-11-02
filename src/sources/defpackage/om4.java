package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class om4 {
    public static final om4 X;
    public static final om4 Y;
    public static final om4 Z;
    public static final om4 f0;
    public static final om4 g0;
    public static final /* synthetic */ om4[] h0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        om4 om4Var = new om4("STARTED", 0);
        X = om4Var;
        om4 om4Var2 = new om4("STOPPED", 1);
        Y = om4Var2;
        om4 om4Var3 = new om4("RUNNING", 2);
        Z = om4Var3;
        om4 om4Var4 = new om4("NOT_RUNNING", 3);
        f0 = om4Var4;
        om4 om4Var5 = new om4("START_FAILURE", 4);
        g0 = om4Var5;
        h0 = new om4[]{om4Var, om4Var2, om4Var3, om4Var4, om4Var5};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static om4 valueOf(String str) {
        return (om4) Enum.valueOf(om4.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static om4[] values() {
        return (om4[]) h0.clone();
    }
}

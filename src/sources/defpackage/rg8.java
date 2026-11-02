package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class rg8 {
    public static final rg8 X;
    public static final rg8 Y;
    public static final rg8 Z;
    public static final rg8 f0;
    public static final rg8 g0;
    public static final /* synthetic */ rg8[] h0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        rg8 rg8Var = new rg8("STARTED", 0);
        X = rg8Var;
        rg8 rg8Var2 = new rg8("STOPPED", 1);
        Y = rg8Var2;
        rg8 rg8Var3 = new rg8("RUNNING", 2);
        Z = rg8Var3;
        rg8 rg8Var4 = new rg8("NOT_RUNNING", 3);
        f0 = rg8Var4;
        rg8 rg8Var5 = new rg8("START_FAILURE", 4);
        g0 = rg8Var5;
        h0 = new rg8[]{rg8Var, rg8Var2, rg8Var3, rg8Var4, rg8Var5};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static rg8 valueOf(String str) {
        return (rg8) Enum.valueOf(rg8.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static rg8[] values() {
        return (rg8[]) h0.clone();
    }
}

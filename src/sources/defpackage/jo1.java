package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class jo1 {
    public static final jo1 X;
    public static final jo1 Y;
    public static final jo1 Z;
    public static final jo1 f0;
    public static final jo1 g0;
    public static final jo1 h0;
    public static final /* synthetic */ jo1[] i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        jo1 jo1Var = new jo1("UPDATING", 0);
        X = jo1Var;
        jo1 jo1Var2 = new jo1("CHECK_UPDATING", 1);
        Y = jo1Var2;
        jo1 jo1Var3 = new jo1("FALLBACK", 2);
        Z = jo1Var3;
        jo1 jo1Var4 = new jo1("ERROR_TIME_OUT", 3);
        f0 = jo1Var4;
        jo1 jo1Var5 = new jo1("ERROR_CONNECTION", 4);
        g0 = jo1Var5;
        jo1 jo1Var6 = new jo1("ERROR_CERTIFICATE", 5);
        h0 = jo1Var6;
        i0 = new jo1[]{jo1Var, jo1Var2, jo1Var3, jo1Var4, jo1Var5, jo1Var6, new jo1("ERROR_RESTRICTED", 6)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static jo1 valueOf(String str) {
        return (jo1) Enum.valueOf(jo1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static jo1[] values() {
        return (jo1[]) i0.clone();
    }
}

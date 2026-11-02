package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ho1 {
    public static final ho1 X;
    public static final ho1 Y;
    public static final ho1 Z;
    public static final /* synthetic */ ho1[] f0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ho1 ho1Var = new ho1("SUCCESS", 0);
        X = ho1Var;
        ho1 ho1Var2 = new ho1("FAILURE", 1);
        Y = ho1Var2;
        ho1 ho1Var3 = new ho1("QR_CODE", 2);
        Z = ho1Var3;
        f0 = new ho1[]{ho1Var, ho1Var2, ho1Var3, new ho1("QR_DATA_SEND", 3)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ho1 valueOf(String str) {
        return (ho1) Enum.valueOf(ho1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ho1[] values() {
        return (ho1[]) f0.clone();
    }
}

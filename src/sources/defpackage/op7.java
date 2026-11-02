package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class op7 {
    public static final op7 X;
    public static final op7 Y;
    public static final op7 Z;
    public static final /* synthetic */ op7[] f0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        op7 op7Var = new op7("CLOSED", 0);
        X = op7Var;
        op7 op7Var2 = new op7("CREATE", 1);
        Y = op7Var2;
        op7 op7Var3 = new op7("IMPORT_FROM_CLIPBOARD", 2);
        Z = op7Var3;
        f0 = new op7[]{op7Var, op7Var2, op7Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static op7 valueOf(String str) {
        return (op7) Enum.valueOf(op7.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static op7[] values() {
        return (op7[]) f0.clone();
    }
}

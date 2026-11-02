package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class qm4 {
    public static final qm4 X;
    public static final qm4 Y;
    public static final qm4 Z;
    public static final /* synthetic */ qm4[] f0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        qm4 qm4Var = new qm4("INVISIBLE", 0);
        X = qm4Var;
        qm4 qm4Var2 = new qm4("NO_UNSEEN", 1);
        Y = qm4Var2;
        qm4 qm4Var3 = new qm4("INCOMING", 2);
        Z = qm4Var3;
        f0 = new qm4[]{qm4Var, qm4Var2, qm4Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static qm4 valueOf(String str) {
        return (qm4) Enum.valueOf(qm4.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static qm4[] values() {
        return (qm4[]) f0.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class cv1 {
    public static final cv1 X;
    public static final cv1 Y;
    public static final cv1 Z;
    public static final /* synthetic */ cv1[] f0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        cv1 cv1Var = new cv1("SETTLE", 0);
        X = cv1Var;
        cv1 cv1Var2 = new cv1("DISMISS", 1);
        Y = cv1Var2;
        cv1 cv1Var3 = new cv1("SHARE", 2);
        Z = cv1Var3;
        f0 = new cv1[]{cv1Var, cv1Var2, cv1Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static cv1 valueOf(String str) {
        return (cv1) Enum.valueOf(cv1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static cv1[] values() {
        return (cv1[]) f0.clone();
    }
}

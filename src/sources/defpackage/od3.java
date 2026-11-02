package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class od3 {
    public static final od3 X;
    public static final od3 Y;
    public static final od3 Z;
    public static final /* synthetic */ od3[] f0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        od3 od3Var = new od3("IP_URL", 0);
        X = od3Var;
        od3 od3Var2 = new od3("SITE_URL", 1);
        Y = od3Var2;
        od3 od3Var3 = new od3("REMOTE_DNS", 2);
        od3 od3Var4 = new od3("DOMESTIC_DNS", 3);
        od3 od3Var5 = new od3("TITLE", 4);
        Z = od3Var5;
        f0 = new od3[]{od3Var, od3Var2, od3Var3, od3Var4, od3Var5};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static od3 valueOf(String str) {
        return (od3) Enum.valueOf(od3.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static od3[] values() {
        return (od3[]) f0.clone();
    }
}

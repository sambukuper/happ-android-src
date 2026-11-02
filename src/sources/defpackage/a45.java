package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class a45 {
    public static final a45 X;
    public static final a45 Y;
    public static final /* synthetic */ a45[] Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        a45 a45Var = new a45("WIFI", 0);
        X = a45Var;
        a45 a45Var2 = new a45("MOBILE", 1);
        Y = a45Var2;
        Z = new a45[]{a45Var, a45Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a45 valueOf(String str) {
        return (a45) Enum.valueOf(a45.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a45[] values() {
        return (a45[]) Z.clone();
    }
}

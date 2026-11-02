package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class vn5 {
    public static final we5 X;
    public static final vn5 Y;
    public static final vn5 Z;
    public static final /* synthetic */ vn5[] f0;
    public static final /* synthetic */ n22 g0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        vn5 vn5Var = new vn5("TIME", 0);
        Y = vn5Var;
        vn5 vn5Var2 = new vn5("ICON", 1);
        Z = vn5Var2;
        vn5[] vn5VarArr = {vn5Var, vn5Var2};
        f0 = vn5VarArr;
        g0 = new n22(vn5VarArr);
        X = new we5((byte) 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static vn5 valueOf(String str) {
        return (vn5) Enum.valueOf(vn5.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static vn5[] values() {
        return (vn5[]) f0.clone();
    }
}

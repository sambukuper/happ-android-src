package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class jk5 {
    public static final we5 X;
    public static final jk5 Y;
    public static final jk5 Z;
    public static final jk5 f0;
    public static final /* synthetic */ jk5[] g0;
    public static final /* synthetic */ n22 h0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        jk5 jk5Var = new jk5("OFF", 0);
        Y = jk5Var;
        jk5 jk5Var2 = new jk5("ON", 1);
        Z = jk5Var2;
        jk5 jk5Var3 = new jk5("BYPASS", 2);
        f0 = jk5Var3;
        jk5[] jk5VarArr = {jk5Var, jk5Var2, jk5Var3};
        g0 = jk5VarArr;
        h0 = new n22(jk5VarArr);
        X = new we5((byte) 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static jk5 valueOf(String str) {
        return (jk5) Enum.valueOf(jk5.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static jk5[] values() {
        return (jk5[]) g0.clone();
    }
}

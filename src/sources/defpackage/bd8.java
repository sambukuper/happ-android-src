package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class bd8 {
    public static final bd8 X;
    public static final bd8 Y;
    public static final /* synthetic */ bd8[] Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        bd8 bd8Var = new bd8("PROXY", 0);
        X = bd8Var;
        bd8 bd8Var2 = new bd8("DIRECT", 1);
        Y = bd8Var2;
        Z = new bd8[]{bd8Var, bd8Var2, new bd8("BLOCK", 2)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static bd8 valueOf(String str) {
        return (bd8) Enum.valueOf(bd8.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static bd8[] values() {
        return (bd8[]) Z.clone();
    }
}

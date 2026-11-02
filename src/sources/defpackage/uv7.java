package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class uv7 {
    public static final uv7 X;
    public static final uv7 Y;
    public static final /* synthetic */ uv7[] Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        uv7 uv7Var = new uv7("SELECTION", 0);
        X = uv7Var;
        uv7 uv7Var2 = new uv7("DEFAULT", 1);
        Y = uv7Var2;
        Z = new uv7[]{uv7Var, uv7Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uv7 valueOf(String str) {
        return (uv7) Enum.valueOf(uv7.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static uv7[] values() {
        return (uv7[]) Z.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class si7 {
    public static final si7 X;
    public static final si7 Y;
    public static final /* synthetic */ si7[] Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        si7 si7Var = new si7("DOWNLOAD", 0);
        X = si7Var;
        si7 si7Var2 = new si7("UPLOAD", 1);
        Y = si7Var2;
        Z = new si7[]{si7Var, si7Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static si7 valueOf(String str) {
        return (si7) Enum.valueOf(si7.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static si7[] values() {
        return (si7[]) Z.clone();
    }
}

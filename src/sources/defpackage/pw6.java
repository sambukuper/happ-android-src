package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pw6 {
    public static final pw6 X;
    public static final pw6 Y;
    public static final /* synthetic */ pw6[] Z;

    static {
        pw6 pw6Var = new pw6("FILL", 0);
        X = pw6Var;
        pw6 pw6Var2 = new pw6("FIT", 1);
        Y = pw6Var2;
        Z = new pw6[]{pw6Var, pw6Var2};
    }

    public static pw6 valueOf(String str) {
        return (pw6) Enum.valueOf(pw6.class, str);
    }

    public static pw6[] values() {
        return (pw6[]) Z.clone();
    }
}

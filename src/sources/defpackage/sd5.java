package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sd5 {
    public static final sd5 X;
    public static final sd5 Y;
    public static final /* synthetic */ sd5[] Z;

    static {
        sd5 sd5Var = new sd5("Vertical", 0);
        X = sd5Var;
        sd5 sd5Var2 = new sd5("Horizontal", 1);
        Y = sd5Var2;
        Z = new sd5[]{sd5Var, sd5Var2};
    }

    public static sd5 valueOf(String str) {
        return (sd5) Enum.valueOf(sd5.class, str);
    }

    public static sd5[] values() {
        return (sd5[]) Z.clone();
    }
}

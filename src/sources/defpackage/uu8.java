package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uu8 {
    public static final uu8 X;
    public static final uu8 Y;
    public static final /* synthetic */ uu8[] Z;

    static {
        uu8 uu8Var = new uu8("Lsq2", 0);
        X = uu8Var;
        uu8 uu8Var2 = new uu8("Impulse", 1);
        Y = uu8Var2;
        Z = new uu8[]{uu8Var, uu8Var2};
    }

    public static uu8 valueOf(String str) {
        return (uu8) Enum.valueOf(uu8.class, str);
    }

    public static uu8[] values() {
        return (uu8[]) Z.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ib8 {
    public static final ib8 X;
    public static final ib8 Y;
    public static final /* synthetic */ ib8[] Z;

    static {
        ib8 ib8Var = new ib8("On", 0);
        X = ib8Var;
        ib8 ib8Var2 = new ib8("Off", 1);
        Y = ib8Var2;
        Z = new ib8[]{ib8Var, ib8Var2, new ib8("Indeterminate", 2)};
    }

    public static ib8 valueOf(String str) {
        return (ib8) Enum.valueOf(ib8.class, str);
    }

    public static ib8[] values() {
        return (ib8[]) Z.clone();
    }
}

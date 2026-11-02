package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zi8 {
    public static final zi8 X;
    public static final zi8 Y;
    public static final /* synthetic */ zi8[] Z;

    static {
        zi8 zi8Var = new zi8("SUPERTYPE", 0);
        X = zi8Var;
        zi8 zi8Var2 = new zi8("COMMON", 1);
        Y = zi8Var2;
        Z = new zi8[]{zi8Var, zi8Var2};
    }

    public static zi8 valueOf(String str) {
        return (zi8) Enum.valueOf(zi8.class, str);
    }

    public static zi8[] values() {
        return (zi8[]) Z.clone();
    }
}

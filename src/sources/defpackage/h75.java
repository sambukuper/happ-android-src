package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h75 {
    public static final h75 X;
    public static final h75 Y;
    public static final h75 Z;
    public static final /* synthetic */ h75[] f0;

    static {
        h75 h75Var = new h75("FORCE_FLEXIBILITY", 0);
        X = h75Var;
        h75 h75Var2 = new h75("NULLABLE", 1);
        Y = h75Var2;
        h75 h75Var3 = new h75("NOT_NULL", 2);
        Z = h75Var3;
        f0 = new h75[]{h75Var, h75Var2, h75Var3};
    }

    public static h75 valueOf(String str) {
        return (h75) Enum.valueOf(h75.class, str);
    }

    public static h75[] values() {
        return (h75[]) f0.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ps0 {
    public static final ps0 X;
    public static final ps0 Y;
    public static final ps0 Z;
    public static final /* synthetic */ ps0[] f0;

    static {
        ps0 ps0Var = new ps0("NONE", 0);
        X = ps0Var;
        ps0 ps0Var2 = new ps0("ALL_JSON_OBJECTS", 1);
        Y = ps0Var2;
        ps0 ps0Var3 = new ps0("POLYMORPHIC", 2);
        Z = ps0Var3;
        f0 = new ps0[]{ps0Var, ps0Var2, ps0Var3};
    }

    public static ps0 valueOf(String str) {
        return (ps0) Enum.valueOf(ps0.class, str);
    }

    public static ps0[] values() {
        return (ps0[]) f0.clone();
    }
}

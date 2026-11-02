package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tb8 {
    public static final tb8 X;
    public static final tb8 Y;
    public static final tb8 Z;
    public static final /* synthetic */ tb8[] f0;

    static {
        tb8 tb8Var = new tb8("Uninitialized", 0);
        X = tb8Var;
        tb8 tb8Var2 = new tb8("Detached", 1);
        Y = tb8Var2;
        tb8 tb8Var3 = new tb8("Attached", 2);
        Z = tb8Var3;
        f0 = new tb8[]{tb8Var, tb8Var2, tb8Var3};
    }

    public static tb8 valueOf(String str) {
        return (tb8) Enum.valueOf(tb8.class, str);
    }

    public static tb8[] values() {
        return (tb8[]) f0.clone();
    }
}

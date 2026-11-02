package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bg8 {
    public static final bg8 X;
    public static final bg8 Y;
    public static final bg8 Z;
    public static final bg8 f0;
    public static final /* synthetic */ bg8[] g0;

    static {
        bg8 bg8Var = new bg8("SUCCESSFUL", 0);
        X = bg8Var;
        bg8 bg8Var2 = new bg8("REREGISTER", 1);
        Y = bg8Var2;
        bg8 bg8Var3 = new bg8("CANCELLED", 2);
        Z = bg8Var3;
        bg8 bg8Var4 = new bg8("ALREADY_SELECTED", 3);
        f0 = bg8Var4;
        g0 = new bg8[]{bg8Var, bg8Var2, bg8Var3, bg8Var4};
    }

    public static bg8 valueOf(String str) {
        return (bg8) Enum.valueOf(bg8.class, str);
    }

    public static bg8[] values() {
        return (bg8[]) g0.clone();
    }
}

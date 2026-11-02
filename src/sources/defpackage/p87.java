package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p87 {
    public static final p87 X;
    public static final p87 Y;
    public static final p87 Z;
    public static final /* synthetic */ p87[] f0;

    static {
        p87 p87Var = new p87("Hidden", 0);
        X = p87Var;
        p87 p87Var2 = new p87("Expanded", 1);
        Y = p87Var2;
        p87 p87Var3 = new p87("PartiallyExpanded", 2);
        Z = p87Var3;
        f0 = new p87[]{p87Var, p87Var2, p87Var3};
    }

    public static p87 valueOf(String str) {
        return (p87) Enum.valueOf(p87.class, str);
    }

    public static p87[] values() {
        return (p87[]) f0.clone();
    }
}

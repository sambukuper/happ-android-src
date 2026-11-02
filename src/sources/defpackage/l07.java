package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l07 {
    public static final l07 X;
    public static final l07 Y;
    public static final l07 Z;
    public static final /* synthetic */ l07[] f0;

    static {
        l07 l07Var = new l07("Left", 0);
        X = l07Var;
        l07 l07Var2 = new l07("Middle", 1);
        Y = l07Var2;
        l07 l07Var3 = new l07("Right", 2);
        Z = l07Var3;
        f0 = new l07[]{l07Var, l07Var2, l07Var3};
    }

    public static l07 valueOf(String str) {
        return (l07) Enum.valueOf(l07.class, str);
    }

    public static l07[] values() {
        return (l07[]) f0.clone();
    }
}

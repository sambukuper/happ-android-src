package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ik6 {
    public static final ik6 X;
    public static final /* synthetic */ ik6[] Y;

    static {
        ik6 ik6Var = new ik6("MustUse", 0);
        X = ik6Var;
        Y = new ik6[]{ik6Var, new ik6("ExplicitlyIgnorable", 1), new ik6("Unspecified", 2)};
    }

    public static ik6 valueOf(String str) {
        return (ik6) Enum.valueOf(ik6.class, str);
    }

    public static ik6[] values() {
        return (ik6[]) Y.clone();
    }
}

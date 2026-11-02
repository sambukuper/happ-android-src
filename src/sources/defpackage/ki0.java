package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ki0 {
    public static final ki0 X;
    public static final /* synthetic */ ki0[] Y;

    static {
        ki0 ki0Var = new ki0("AT_LEAST", 0);
        X = ki0Var;
        Y = new ki0[]{ki0Var, new ki0("EXACT", 1)};
    }

    public static ki0 valueOf(String str) {
        return (ki0) Enum.valueOf(ki0.class, str);
    }

    public static ki0[] values() {
        return (ki0[]) Y.clone();
    }
}

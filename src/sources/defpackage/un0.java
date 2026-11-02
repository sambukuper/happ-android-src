package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class un0 {
    public static final un0 X;
    public static final /* synthetic */ un0[] Y;

    static {
        un0 un0Var = new un0("FOR_SUBTYPING", 0);
        X = un0Var;
        Y = new un0[]{un0Var, new un0("FOR_INCORPORATION", 1), new un0("FROM_EXPRESSION", 2)};
    }

    public static un0 valueOf(String str) {
        return (un0) Enum.valueOf(un0.class, str);
    }

    public static un0[] values() {
        return (un0[]) Y.clone();
    }
}

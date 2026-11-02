package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ff5 {
    public static final ff5 X;
    public static final ff5 Y;
    public static final /* synthetic */ ff5[] Z;

    static {
        ff5 ff5Var = new ff5("RENDER_OVERRIDE", 0);
        X = ff5Var;
        ff5 ff5Var2 = new ff5("RENDER_OPEN", 1);
        Y = ff5Var2;
        Z = new ff5[]{ff5Var, ff5Var2, new ff5("RENDER_OPEN_OVERRIDE", 2)};
    }

    public static ff5 valueOf(String str) {
        return (ff5) Enum.valueOf(ff5.class, str);
    }

    public static ff5[] values() {
        return (ff5[]) Z.clone();
    }
}

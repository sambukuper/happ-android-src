package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d78 {
    public static final d78 X;
    public static final d78 Y;
    public static final /* synthetic */ d78[] Z;

    static {
        d78 d78Var = new d78("Filled", 0);
        X = d78Var;
        d78 d78Var2 = new d78("Outlined", 1);
        Y = d78Var2;
        Z = new d78[]{d78Var, d78Var2};
    }

    public static d78 valueOf(String str) {
        return (d78) Enum.valueOf(d78.class, str);
    }

    public static d78[] values() {
        return (d78[]) Z.clone();
    }
}

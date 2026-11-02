package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cs4 {
    public static final cs4 X;
    public static final cs4 Y;
    public static final /* synthetic */ cs4[] Z;

    static {
        cs4 cs4Var = new cs4("Width", 0);
        X = cs4Var;
        cs4 cs4Var2 = new cs4("Height", 1);
        Y = cs4Var2;
        Z = new cs4[]{cs4Var, cs4Var2};
    }

    public static cs4 valueOf(String str) {
        return (cs4) Enum.valueOf(cs4.class, str);
    }

    public static cs4[] values() {
        return (cs4[]) Z.clone();
    }
}

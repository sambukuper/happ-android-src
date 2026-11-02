package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pl6 {
    public static final pl6 X;
    public static final pl6 Y;
    public static final /* synthetic */ pl6[] Z;

    /* JADX INFO: Fake field, exist only in values array */
    pl6 EF0;

    static {
        pl6 pl6Var = new pl6("AUTOMATIC", 0);
        pl6 pl6Var2 = new pl6("TRUNCATE", 1);
        X = pl6Var2;
        pl6 pl6Var3 = new pl6("WRITE_AHEAD_LOGGING", 2);
        Y = pl6Var3;
        Z = new pl6[]{pl6Var, pl6Var2, pl6Var3};
    }

    public static pl6 valueOf(String str) {
        return (pl6) Enum.valueOf(pl6.class, str);
    }

    public static pl6[] values() {
        return (pl6[]) Z.clone();
    }
}

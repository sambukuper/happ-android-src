package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tb0 {
    public static final tb0 X;
    public static final tb0 Y;
    public static final /* synthetic */ tb0[] Z;

    static {
        tb0 tb0Var = new tb0("all", 0);
        X = tb0Var;
        tb0 tb0Var2 = new tb0("aural", 1);
        tb0 tb0Var3 = new tb0("braille", 2);
        tb0 tb0Var4 = new tb0("embossed", 3);
        tb0 tb0Var5 = new tb0("handheld", 4);
        tb0 tb0Var6 = new tb0("print", 5);
        tb0 tb0Var7 = new tb0("projection", 6);
        tb0 tb0Var8 = new tb0("screen", 7);
        Y = tb0Var8;
        Z = new tb0[]{tb0Var, tb0Var2, tb0Var3, tb0Var4, tb0Var5, tb0Var6, tb0Var7, tb0Var8, new tb0("speech", 8), new tb0("tty", 9), new tb0("tv", 10)};
    }

    public static tb0 valueOf(String str) {
        return (tb0) Enum.valueOf(tb0.class, str);
    }

    public static tb0[] values() {
        return (tb0[]) Z.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wq3 {
    public static final wq3 X;
    public static final wq3 Y;
    public static final wq3 Z;
    public static final /* synthetic */ wq3[] f0;

    static {
        wq3 wq3Var = new wq3("DYNAMIC", 0);
        X = wq3Var;
        wq3 wq3Var2 = new wq3("STATIC", 1);
        Y = wq3Var2;
        wq3 wq3Var3 = new wq3("DEFAULT_TYPING", 2);
        Z = wq3Var3;
        f0 = new wq3[]{wq3Var, wq3Var2, wq3Var3};
    }

    public static wq3 valueOf(String str) {
        return (wq3) Enum.valueOf(wq3.class, str);
    }

    public static wq3[] values() {
        return (wq3[]) f0.clone();
    }
}

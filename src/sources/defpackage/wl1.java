package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wl1 {
    public static final wl1 X;
    public static final wl1 Y;
    public static final /* synthetic */ wl1[] Z;

    static {
        wl1 wl1Var = new wl1("STABLE", 0);
        X = wl1Var;
        wl1 wl1Var2 = new wl1("UNSTABLE", 1);
        Y = wl1Var2;
        Z = new wl1[]{wl1Var, wl1Var2};
    }

    public static wl1 valueOf(String str) {
        return (wl1) Enum.valueOf(wl1.class, str);
    }

    public static wl1[] values() {
        return (wl1[]) Z.clone();
    }
}

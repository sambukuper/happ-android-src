package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wg3 {
    public static final wg3 X;
    public static final wg3 Y;
    public static final /* synthetic */ wg3[] Z;

    static {
        wg3 wg3Var = new wg3("Min", 0);
        X = wg3Var;
        wg3 wg3Var2 = new wg3("Max", 1);
        Y = wg3Var2;
        Z = new wg3[]{wg3Var, wg3Var2};
    }

    public static wg3 valueOf(String str) {
        return (wg3) Enum.valueOf(wg3.class, str);
    }

    public static wg3[] values() {
        return (wg3[]) Z.clone();
    }
}

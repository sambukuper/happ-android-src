package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lv8 {
    public static final s18 X;
    public static final lv8 Y;
    public static final lv8 Z;
    public static final lv8 f0;
    public static final lv8 g0;
    public static final /* synthetic */ lv8[] h0;

    static {
        lv8 lv8Var = new lv8("UNSPECIFIED", 0);
        Y = lv8Var;
        lv8 lv8Var2 = new lv8("OFF", 1);
        Z = lv8Var2;
        lv8 lv8Var3 = new lv8("ON", 2);
        f0 = lv8Var3;
        lv8 lv8Var4 = new lv8("PREVIEW", 3);
        g0 = lv8Var4;
        h0 = new lv8[]{lv8Var, lv8Var2, lv8Var3, lv8Var4};
        X = new s18((byte) 11);
    }

    public static lv8 valueOf(String str) {
        return (lv8) Enum.valueOf(lv8.class, str);
    }

    public static lv8[] values() {
        return (lv8[]) h0.clone();
    }
}

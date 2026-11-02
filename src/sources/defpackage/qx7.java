package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qx7 {
    public static final qx7 X;
    public static final qx7 Y;
    public static final qx7 Z;
    public static final qx7 f0;
    public static final qx7 g0;
    public static final /* synthetic */ qx7[] h0;

    static {
        qx7 qx7Var = new qx7("PRIV", 0);
        X = qx7Var;
        qx7 qx7Var2 = new qx7("YUV", 1);
        Y = qx7Var2;
        qx7 qx7Var3 = new qx7("JPEG", 2);
        Z = qx7Var3;
        qx7 qx7Var4 = new qx7("JPEG_R", 3);
        f0 = qx7Var4;
        qx7 qx7Var5 = new qx7("RAW", 4);
        g0 = qx7Var5;
        h0 = new qx7[]{qx7Var, qx7Var2, qx7Var3, qx7Var4, qx7Var5};
    }

    public static qx7 valueOf(String str) {
        return (qx7) Enum.valueOf(qx7.class, str);
    }

    public static qx7[] values() {
        return (qx7[]) h0.clone();
    }
}

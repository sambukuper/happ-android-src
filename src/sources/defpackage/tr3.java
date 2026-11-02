package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tr3 {
    public static final tr3 X;
    public static final tr3 Y;
    public static final tr3 Z;
    public static final tr3 f0;
    public static final tr3 g0;
    public static final /* synthetic */ tr3[] h0;

    static {
        tr3 tr3Var = new tr3("PROPERTY", 0);
        X = tr3Var;
        tr3 tr3Var2 = new tr3("WRAPPER_OBJECT", 1);
        Y = tr3Var2;
        tr3 tr3Var3 = new tr3("WRAPPER_ARRAY", 2);
        Z = tr3Var3;
        tr3 tr3Var4 = new tr3("EXTERNAL_PROPERTY", 3);
        f0 = tr3Var4;
        tr3 tr3Var5 = new tr3("EXISTING_PROPERTY", 4);
        g0 = tr3Var5;
        h0 = new tr3[]{tr3Var, tr3Var2, tr3Var3, tr3Var4, tr3Var5, new tr3("NOTHING", 5)};
    }

    public static tr3 valueOf(String str) {
        return (tr3) Enum.valueOf(tr3.class, str);
    }

    public static tr3[] values() {
        return (tr3[]) h0.clone();
    }
}

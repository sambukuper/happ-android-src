package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wu0 {
    public static final wu0 X;
    public static final wu0 Y;
    public static final wu0 Z;
    public static final wu0 f0;
    public static final wu0 g0;
    public static final wu0 h0;
    public static final /* synthetic */ wu0[] i0;

    static {
        wu0 wu0Var = new wu0("APP_CLOSED", 0);
        X = wu0Var;
        wu0 wu0Var2 = new wu0("APP_DISCONNECTED", 1);
        Y = wu0Var2;
        wu0 wu0Var3 = new wu0("CAMERA2_CLOSED", 2);
        Z = wu0Var3;
        wu0 wu0Var4 = new wu0("CAMERA2_DISCONNECTED", 3);
        f0 = wu0Var4;
        wu0 wu0Var5 = new wu0("CAMERA2_ERROR", 4);
        g0 = wu0Var5;
        wu0 wu0Var6 = new wu0("CAMERA2_EXCEPTION", 5);
        h0 = wu0Var6;
        i0 = new wu0[]{wu0Var, wu0Var2, wu0Var3, wu0Var4, wu0Var5, wu0Var6};
    }

    public static wu0 valueOf(String str) {
        return (wu0) Enum.valueOf(wu0.class, str);
    }

    public static wu0[] values() {
        return (wu0[]) i0.clone();
    }
}

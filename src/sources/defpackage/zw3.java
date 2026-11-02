package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zw3 {
    public static final zw3 X;
    public static final zw3 Y;
    public static final zw3 Z;
    public static final zw3 f0;
    public static final /* synthetic */ zw3[] g0;

    static {
        zw3 zw3Var = new zw3("PUBLIC", 0);
        X = zw3Var;
        zw3 zw3Var2 = new zw3("PROTECTED", 1);
        Y = zw3Var2;
        zw3 zw3Var3 = new zw3("INTERNAL", 2);
        Z = zw3Var3;
        zw3 zw3Var4 = new zw3("PRIVATE", 3);
        f0 = zw3Var4;
        g0 = new zw3[]{zw3Var, zw3Var2, zw3Var3, zw3Var4};
    }

    public static zw3 valueOf(String str) {
        return (zw3) Enum.valueOf(zw3.class, str);
    }

    public static zw3[] values() {
        return (zw3[]) g0.clone();
    }
}

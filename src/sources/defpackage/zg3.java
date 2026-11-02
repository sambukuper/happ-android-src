package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zg3 {
    public static final zg3 X;
    public static final zg3 Y;
    public static final /* synthetic */ zg3[] Z;

    static {
        zg3 zg3Var = new zg3("Width", 0);
        X = zg3Var;
        zg3 zg3Var2 = new zg3("Height", 1);
        Y = zg3Var2;
        Z = new zg3[]{zg3Var, zg3Var2};
    }

    public static zg3 valueOf(String str) {
        return (zg3) Enum.valueOf(zg3.class, str);
    }

    public static zg3[] values() {
        return (zg3[]) Z.clone();
    }
}

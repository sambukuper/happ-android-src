package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zk8 {
    public static final zk8 X;
    public static final zk8 Y;
    public static final zk8 Z;
    public static final /* synthetic */ zk8[] f0;

    static {
        zk8 zk8Var = new zk8("MISSING", 0);
        X = zk8Var;
        zk8 zk8Var2 = new zk8("ICU", 1);
        Y = zk8Var2;
        zk8 zk8Var3 = new zk8("JAVA", 2);
        Z = zk8Var3;
        f0 = new zk8[]{zk8Var, zk8Var2, zk8Var3};
    }

    public static zk8 valueOf(String str) {
        return (zk8) Enum.valueOf(zk8.class, str);
    }

    public static zk8[] values() {
        return (zk8[]) f0.clone();
    }
}

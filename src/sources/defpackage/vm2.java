package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vm2 {
    public static final vm2 X;
    public static final vm2 Y;
    public static final vm2 Z;
    public static final vm2 f0;
    public static final vm2 g0;
    public static final /* synthetic */ vm2[] h0;

    static {
        vm2 vm2Var = new vm2("ON_CONFIGURE", 0);
        X = vm2Var;
        vm2 vm2Var2 = new vm2("ON_CREATE", 1);
        Y = vm2Var2;
        vm2 vm2Var3 = new vm2("ON_UPGRADE", 2);
        Z = vm2Var3;
        vm2 vm2Var4 = new vm2("ON_DOWNGRADE", 3);
        f0 = vm2Var4;
        vm2 vm2Var5 = new vm2("ON_OPEN", 4);
        g0 = vm2Var5;
        h0 = new vm2[]{vm2Var, vm2Var2, vm2Var3, vm2Var4, vm2Var5};
    }

    public static vm2 valueOf(String str) {
        return (vm2) Enum.valueOf(vm2.class, str);
    }

    public static vm2[] values() {
        return (vm2[]) h0.clone();
    }
}

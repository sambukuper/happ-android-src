package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pq8 {
    public static final pq8 X;
    public static final pq8 Y;
    public static final pq8 Z;
    public static final /* synthetic */ pq8[] f0;
    public static final /* synthetic */ n22 g0;

    static {
        pq8 pq8Var = new pq8("SESSION_CONFIG", 0);
        X = pq8Var;
        pq8 pq8Var2 = new pq8("DEFAULT", 1);
        Y = pq8Var2;
        pq8 pq8Var3 = new pq8("CAMERA2_CAMERA_CONTROL", 2);
        Z = pq8Var3;
        pq8[] pq8VarArr = {pq8Var, pq8Var2, pq8Var3};
        f0 = pq8VarArr;
        g0 = new n22(pq8VarArr);
    }

    public static pq8 valueOf(String str) {
        return (pq8) Enum.valueOf(pq8.class, str);
    }

    public static pq8[] values() {
        return (pq8[]) f0.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mz4 {
    public static final mz4 X;
    public static final mz4 Y;
    public static final /* synthetic */ mz4[] Z;

    static {
        mz4 mz4Var = new mz4("READ_ONLY", 0);
        X = mz4Var;
        mz4 mz4Var2 = new mz4("MUTABLE", 1);
        Y = mz4Var2;
        Z = new mz4[]{mz4Var, mz4Var2};
    }

    public static mz4 valueOf(String str) {
        return (mz4) Enum.valueOf(mz4.class, str);
    }

    public static mz4[] values() {
        return (mz4[]) Z.clone();
    }
}

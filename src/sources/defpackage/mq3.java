package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mq3 {
    public static final mq3 X;
    public static final mq3 Y;
    public static final mq3 Z;
    public static final /* synthetic */ mq3[] f0;

    static {
        mq3 mq3Var = new mq3("AUTO", 0);
        X = mq3Var;
        mq3 mq3Var2 = new mq3("READ_ONLY", 1);
        Y = mq3Var2;
        mq3 mq3Var3 = new mq3("WRITE_ONLY", 2);
        Z = mq3Var3;
        f0 = new mq3[]{mq3Var, mq3Var2, mq3Var3, new mq3("READ_WRITE", 3)};
    }

    public static mq3 valueOf(String str) {
        return (mq3) Enum.valueOf(mq3.class, str);
    }

    public static mq3[] values() {
        return (mq3[]) f0.clone();
    }
}

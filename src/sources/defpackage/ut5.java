package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ut5 {
    public static final ut5 X;
    public static final ut5 Y;
    public static final /* synthetic */ ut5[] Z;

    static {
        ut5 ut5Var = new ut5("IDLE", 0);
        X = ut5Var;
        ut5 ut5Var2 = new ut5("STREAMING", 1);
        Y = ut5Var2;
        Z = new ut5[]{ut5Var, ut5Var2};
    }

    public static ut5 valueOf(String str) {
        return (ut5) Enum.valueOf(ut5.class, str);
    }

    public static ut5[] values() {
        return (ut5[]) Z.clone();
    }
}

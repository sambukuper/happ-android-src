package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r14 {
    public static final r14 X;
    public static final r14 Y;
    public static final r14 Z;
    public static final /* synthetic */ r14[] f0;

    static {
        r14 r14Var = new r14("RUNTIME", 0);
        X = r14Var;
        r14 r14Var2 = new r14("BINARY", 1);
        Y = r14Var2;
        r14 r14Var3 = new r14("SOURCE", 2);
        Z = r14Var3;
        f0 = new r14[]{r14Var, r14Var2, r14Var3};
    }

    public static r14 valueOf(String str) {
        return (r14) Enum.valueOf(r14.class, str);
    }

    public static r14[] values() {
        return (r14[]) f0.clone();
    }
}

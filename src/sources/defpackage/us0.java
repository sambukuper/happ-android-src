package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class us0 {
    public static final us0 X;
    public static final us0 Y;
    public static final us0 Z;
    public static final us0 f0;
    public static final us0 g0;
    public static final us0 h0;
    public static final /* synthetic */ us0[] i0;

    static {
        us0 us0Var = new us0("CLASS", 0);
        X = us0Var;
        us0 us0Var2 = new us0("INTERFACE", 1);
        Y = us0Var2;
        us0 us0Var3 = new us0("ENUM_CLASS", 2);
        Z = us0Var3;
        us0 us0Var4 = new us0("ENUM_ENTRY", 3);
        f0 = us0Var4;
        us0 us0Var5 = new us0("ANNOTATION_CLASS", 4);
        g0 = us0Var5;
        us0 us0Var6 = new us0("OBJECT", 5);
        h0 = us0Var6;
        i0 = new us0[]{us0Var, us0Var2, us0Var3, us0Var4, us0Var5, us0Var6};
    }

    public static us0 valueOf(String str) {
        return (us0) Enum.valueOf(us0.class, str);
    }

    public static us0[] values() {
        return (us0[]) i0.clone();
    }

    public final boolean a() {
        return this == h0 || this == f0;
    }
}

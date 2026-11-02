package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public static final i0 X;
    public static final i0 Y;
    public static final i0 Z;
    public static final /* synthetic */ i0[] f0;

    static {
        i0 i0Var = new i0("PROPERTY", 0);
        X = i0Var;
        i0 i0Var2 = new i0("BACKING_FIELD", 1);
        Y = i0Var2;
        i0 i0Var3 = new i0("DELEGATE_FIELD", 2);
        Z = i0Var3;
        f0 = new i0[]{i0Var, i0Var2, i0Var3};
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f0.clone();
    }
}

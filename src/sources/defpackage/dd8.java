package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dd8 {
    public static final dd8 X;
    public static final dd8 Y;
    public static final /* synthetic */ dd8[] Z;

    static {
        dd8 dd8Var = new dd8("DEFERRED", 0);
        X = dd8Var;
        dd8 dd8Var2 = new dd8("IMMEDIATE", 1);
        Y = dd8Var2;
        Z = new dd8[]{dd8Var, dd8Var2, new dd8("EXCLUSIVE", 2)};
    }

    public static dd8 valueOf(String str) {
        return (dd8) Enum.valueOf(dd8.class, str);
    }

    public static dd8[] values() {
        return (dd8[]) Z.clone();
    }
}

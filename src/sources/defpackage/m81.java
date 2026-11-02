package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m81 {
    public static final m81 X;
    public static final m81 Y;
    public static final m81 Z;
    public static final /* synthetic */ m81[] f0;

    static {
        m81 m81Var = new m81("None", 0);
        X = m81Var;
        m81 m81Var2 = new m81("Cancelled", 1);
        Y = m81Var2;
        m81 m81Var3 = new m81("Redirected", 2);
        Z = m81Var3;
        f0 = new m81[]{m81Var, m81Var2, m81Var3, new m81("RedirectCancelled", 3)};
    }

    public static m81 valueOf(String str) {
        return (m81) Enum.valueOf(m81.class, str);
    }

    public static m81[] values() {
        return (m81[]) f0.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m55 {
    public static final m55 X;
    public static final m55 Y;
    public static final /* synthetic */ m55[] Z;

    static {
        m55 m55Var = new m55("Width", 0);
        X = m55Var;
        m55 m55Var2 = new m55("Height", 1);
        Y = m55Var2;
        Z = new m55[]{m55Var, m55Var2};
    }

    public static m55 valueOf(String str) {
        return (m55) Enum.valueOf(m55.class, str);
    }

    public static m55[] values() {
        return (m55[]) Z.clone();
    }
}

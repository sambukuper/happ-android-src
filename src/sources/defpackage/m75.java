package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m75 {
    public static final m75 X;
    public static final /* synthetic */ m75[] Y;

    /* JADX INFO: Fake field, exist only in values array */
    m75 EF0;

    static {
        m75 m75Var = new m75("SET", 0);
        m75 m75Var2 = new m75("SKIP", 1);
        m75 m75Var3 = new m75("FAIL", 2);
        m75 m75Var4 = new m75("AS_EMPTY", 3);
        m75 m75Var5 = new m75("DEFAULT", 4);
        X = m75Var5;
        Y = new m75[]{m75Var, m75Var2, m75Var3, m75Var4, m75Var5};
    }

    public static m75 valueOf(String str) {
        return (m75) Enum.valueOf(m75.class, str);
    }

    public static m75[] values() {
        return (m75[]) Y.clone();
    }
}

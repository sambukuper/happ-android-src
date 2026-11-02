package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m86 {
    public static final m86 X;
    public static final m86 Y;
    public static final m86 Z;
    public static final m86 f0;
    public static final m86 g0;
    public static final m86 h0;
    public static final /* synthetic */ m86[] i0;

    static {
        m86 m86Var = new m86("ShutDown", 0);
        X = m86Var;
        m86 m86Var2 = new m86("ShuttingDown", 1);
        Y = m86Var2;
        m86 m86Var3 = new m86("Inactive", 2);
        Z = m86Var3;
        m86 m86Var4 = new m86("InactivePendingWork", 3);
        f0 = m86Var4;
        m86 m86Var5 = new m86("Idle", 4);
        g0 = m86Var5;
        m86 m86Var6 = new m86("PendingWork", 5);
        h0 = m86Var6;
        i0 = new m86[]{m86Var, m86Var2, m86Var3, m86Var4, m86Var5, m86Var6};
    }

    public static m86 valueOf(String str) {
        return (m86) Enum.valueOf(m86.class, str);
    }

    public static m86[] values() {
        return (m86[]) i0.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class m28 {
    public static final m28 X;
    public static final m28 Y;
    public static final m28 Z;
    public static final m28 f0;
    public static final /* synthetic */ m28[] g0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        m28 m28Var = new m28("OK", 0);
        X = m28Var;
        m28 m28Var2 = new m28("TIMEOUT", 1);
        Y = m28Var2;
        m28 m28Var3 = new m28("BAD_ANSWER", 2);
        Z = m28Var3;
        m28 m28Var4 = new m28("NETWORK_ERROR", 3);
        f0 = m28Var4;
        g0 = new m28[]{m28Var, m28Var2, m28Var3, m28Var4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static m28 valueOf(String str) {
        return (m28) Enum.valueOf(m28.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static m28[] values() {
        return (m28[]) g0.clone();
    }
}

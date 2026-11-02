package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m34 {
    public static final m34 X;
    public static final m34 Y;
    public static final m34 Z;
    public static final /* synthetic */ m34[] f0;

    static {
        m34 m34Var = new m34("InMeasureBlock", 0);
        X = m34Var;
        m34 m34Var2 = new m34("InLayoutBlock", 1);
        Y = m34Var2;
        m34 m34Var3 = new m34("NotUsed", 2);
        Z = m34Var3;
        f0 = new m34[]{m34Var, m34Var2, m34Var3};
    }

    public static m34 valueOf(String str) {
        return (m34) Enum.valueOf(m34.class, str);
    }

    public static m34[] values() {
        return (m34[]) f0.clone();
    }
}

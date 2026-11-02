package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mo3 {
    public static final mo3 X;
    public static final mo3 Y;
    public static final mo3 Z;
    public static final mo3 f0;
    public static final mo3 g0;
    public static final mo3 h0;
    public static final mo3 i0;
    public static final mo3 j0;
    public static final mo3 k0;
    public static final mo3 l0;
    public static final /* synthetic */ mo3[] m0;

    static {
        mo3 mo3Var = new mo3("BINARY", 0);
        X = mo3Var;
        mo3 mo3Var2 = new mo3("BOOLEAN", 1);
        mo3 mo3Var3 = new mo3("NUMBER", 2);
        Y = mo3Var3;
        mo3 mo3Var4 = new mo3("NUMBER_FLOAT", 3);
        Z = mo3Var4;
        mo3 mo3Var5 = new mo3("NUMBER_INT", 4);
        f0 = mo3Var5;
        mo3 mo3Var6 = new mo3("STRING", 5);
        g0 = mo3Var6;
        mo3 mo3Var7 = new mo3("SCALAR", 6);
        h0 = mo3Var7;
        mo3 mo3Var8 = new mo3("ARRAY", 7);
        i0 = mo3Var8;
        mo3 mo3Var9 = new mo3("OBJECT", 8);
        j0 = mo3Var9;
        mo3 mo3Var10 = new mo3("ANY", 9);
        k0 = mo3Var10;
        mo3 mo3Var11 = new mo3("NATURAL", 10);
        l0 = mo3Var11;
        m0 = new mo3[]{mo3Var, mo3Var2, mo3Var3, mo3Var4, mo3Var5, mo3Var6, mo3Var7, mo3Var8, mo3Var9, mo3Var10, mo3Var11, new mo3("POJO", 11)};
    }

    public static mo3 valueOf(String str) {
        return (mo3) Enum.valueOf(mo3.class, str);
    }

    public static mo3[] values() {
        return (mo3[]) m0.clone();
    }

    public final boolean a() {
        return this == Y || this == f0 || this == Z;
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lb8 {
    public static final lb8 X;
    public static final lb8 Y;
    public static final lb8 Z;
    public static final lb8 f0;
    public static final lb8 g0;
    public static final /* synthetic */ lb8[] h0;

    static {
        lb8 lb8Var = new lb8("NUMBER", 0);
        X = lb8Var;
        lb8 lb8Var2 = new lb8("OPERATOR", 1);
        Y = lb8Var2;
        lb8 lb8Var3 = new lb8("KEYWORD", 2);
        lb8 lb8Var4 = new lb8("TYPE", 3);
        lb8 lb8Var5 = new lb8("LANG_CONST", 4);
        Z = lb8Var5;
        lb8 lb8Var6 = new lb8("PREPROCESSOR", 5);
        lb8 lb8Var7 = new lb8("VARIABLE", 6);
        lb8 lb8Var8 = new lb8("METHOD", 7);
        lb8 lb8Var9 = new lb8("STRING", 8);
        f0 = lb8Var9;
        lb8 lb8Var10 = new lb8("COMMENT", 9);
        g0 = lb8Var10;
        h0 = new lb8[]{lb8Var, lb8Var2, lb8Var3, lb8Var4, lb8Var5, lb8Var6, lb8Var7, lb8Var8, lb8Var9, lb8Var10, new lb8("TAG", 10), new lb8("TAG_NAME", 11), new lb8("ATTR_NAME", 12), new lb8("ATTR_VALUE", 13), new lb8("ENTITY_REF", 14)};
    }

    public static lb8 valueOf(String str) {
        return (lb8) Enum.valueOf(lb8.class, str);
    }

    public static lb8[] values() {
        return (lb8[]) h0.clone();
    }
}

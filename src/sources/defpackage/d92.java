package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d92 {
    public static final d92 Y;
    public static final d92 Z;
    public static final d92[] f0;
    public static final /* synthetic */ d92[] g0;
    public final byte X;

    /* JADX INFO: Fake field, exist only in values array */
    d92 EF0;

    static {
        ml3 ml3Var = ml3.DOUBLE;
        d92 d92Var = new d92("DOUBLE", 0, 0, 1, ml3Var);
        ml3 ml3Var2 = ml3.FLOAT;
        d92 d92Var2 = new d92("FLOAT", 1, 1, 1, ml3Var2);
        ml3 ml3Var3 = ml3.LONG;
        d92 d92Var3 = new d92("INT64", 2, 2, 1, ml3Var3);
        d92 d92Var4 = new d92("UINT64", 3, 3, 1, ml3Var3);
        ml3 ml3Var4 = ml3.INT;
        d92 d92Var5 = new d92("INT32", 4, 4, 1, ml3Var4);
        d92 d92Var6 = new d92("FIXED64", 5, 5, 1, ml3Var3);
        d92 d92Var7 = new d92("FIXED32", 6, 6, 1, ml3Var4);
        ml3 ml3Var5 = ml3.BOOLEAN;
        d92 d92Var8 = new d92("BOOL", 7, 7, 1, ml3Var5);
        ml3 ml3Var6 = ml3.STRING;
        d92 d92Var9 = new d92("STRING", 8, 8, 1, ml3Var6);
        ml3 ml3Var7 = ml3.MESSAGE;
        d92 d92Var10 = new d92("MESSAGE", 9, 9, 1, ml3Var7);
        ml3 ml3Var8 = ml3.BYTE_STRING;
        d92 d92Var11 = new d92("BYTES", 10, 10, 1, ml3Var8);
        d92 d92Var12 = new d92("UINT32", 11, 11, 1, ml3Var4);
        ml3 ml3Var9 = ml3.ENUM;
        d92 d92Var13 = new d92("ENUM", 12, 12, 1, ml3Var9);
        d92 d92Var14 = new d92("SFIXED32", 13, 13, 1, ml3Var4);
        d92 d92Var15 = new d92("SFIXED64", 14, 14, 1, ml3Var3);
        d92 d92Var16 = new d92("SINT32", 15, 15, 1, ml3Var4);
        d92 d92Var17 = new d92("SINT64", 16, 16, 1, ml3Var3);
        d92 d92Var18 = new d92("GROUP", 17, 17, 1, ml3Var7);
        d92 d92Var19 = new d92("DOUBLE_LIST", 18, 18, 2, ml3Var);
        d92 d92Var20 = new d92("FLOAT_LIST", 19, 19, 2, ml3Var2);
        d92 d92Var21 = new d92("INT64_LIST", 20, 20, 2, ml3Var3);
        d92 d92Var22 = new d92("UINT64_LIST", 21, 21, 2, ml3Var3);
        d92 d92Var23 = new d92("INT32_LIST", 22, 22, 2, ml3Var4);
        d92 d92Var24 = new d92("FIXED64_LIST", 23, 23, 2, ml3Var3);
        d92 d92Var25 = new d92("FIXED32_LIST", 24, 24, 2, ml3Var4);
        d92 d92Var26 = new d92("BOOL_LIST", 25, 25, 2, ml3Var5);
        d92 d92Var27 = new d92("STRING_LIST", 26, 26, 2, ml3Var6);
        d92 d92Var28 = new d92("MESSAGE_LIST", 27, 27, 2, ml3Var7);
        d92 d92Var29 = new d92("BYTES_LIST", 28, 28, 2, ml3Var8);
        d92 d92Var30 = new d92("UINT32_LIST", 29, 29, 2, ml3Var4);
        d92 d92Var31 = new d92("ENUM_LIST", 30, 30, 2, ml3Var9);
        d92 d92Var32 = new d92("SFIXED32_LIST", 31, 31, 2, ml3Var4);
        d92 d92Var33 = new d92("SFIXED64_LIST", 32, 32, 2, ml3Var3);
        d92 d92Var34 = new d92("SINT32_LIST", 33, 33, 2, ml3Var4);
        d92 d92Var35 = new d92("SINT64_LIST", 34, 34, 2, ml3Var3);
        d92 d92Var36 = new d92("DOUBLE_LIST_PACKED", 35, 35, 3, ml3Var);
        Y = d92Var36;
        d92 d92Var37 = new d92("FLOAT_LIST_PACKED", 36, 36, 3, ml3Var2);
        d92 d92Var38 = new d92("INT64_LIST_PACKED", 37, 37, 3, ml3Var3);
        d92 d92Var39 = new d92("UINT64_LIST_PACKED", 38, 38, 3, ml3Var3);
        d92 d92Var40 = new d92("INT32_LIST_PACKED", 39, 39, 3, ml3Var4);
        d92 d92Var41 = new d92("FIXED64_LIST_PACKED", 40, 40, 3, ml3Var3);
        d92 d92Var42 = new d92("FIXED32_LIST_PACKED", 41, 41, 3, ml3Var4);
        d92 d92Var43 = new d92("BOOL_LIST_PACKED", 42, 42, 3, ml3Var5);
        d92 d92Var44 = new d92("UINT32_LIST_PACKED", 43, 43, 3, ml3Var4);
        d92 d92Var45 = new d92("ENUM_LIST_PACKED", 44, 44, 3, ml3Var9);
        d92 d92Var46 = new d92("SFIXED32_LIST_PACKED", 45, 45, 3, ml3Var4);
        d92 d92Var47 = new d92("SFIXED64_LIST_PACKED", 46, 46, 3, ml3Var3);
        d92 d92Var48 = new d92("SINT32_LIST_PACKED", 47, 47, 3, ml3Var4);
        d92 d92Var49 = new d92("SINT64_LIST_PACKED", 48, 48, 3, ml3Var3);
        Z = d92Var49;
        g0 = new d92[]{d92Var, d92Var2, d92Var3, d92Var4, d92Var5, d92Var6, d92Var7, d92Var8, d92Var9, d92Var10, d92Var11, d92Var12, d92Var13, d92Var14, d92Var15, d92Var16, d92Var17, d92Var18, d92Var19, d92Var20, d92Var21, d92Var22, d92Var23, d92Var24, d92Var25, d92Var26, d92Var27, d92Var28, d92Var29, d92Var30, d92Var31, d92Var32, d92Var33, d92Var34, d92Var35, d92Var36, d92Var37, d92Var38, d92Var39, d92Var40, d92Var41, d92Var42, d92Var43, d92Var44, d92Var45, d92Var46, d92Var47, d92Var48, d92Var49, new d92("GROUP_LIST", 49, 49, 2, ml3Var7), new d92("MAP", 50, 50, 4, ml3.VOID)};
        d92[] d92VarArrValues = values();
        f0 = new d92[d92VarArrValues.length];
        for (d92 d92Var50 : d92VarArrValues) {
            f0[d92Var50.X] = d92Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d92(String str, int i, int i2, int i3, ml3 ml3Var) {
        super(str, i);
        this.X = i2;
        int iB = p61.B(i3);
        if (iB == 1 || iB == 3) {
            Class cls = ml3Var.X;
        }
        if (i3 == 1) {
            ml3Var.ordinal();
        }
    }

    public static d92 valueOf(String str) {
        return (d92) Enum.valueOf(d92.class, str);
    }

    public static d92[] values() {
        return (d92[]) g0.clone();
    }
}

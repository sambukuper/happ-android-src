package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
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
public class b39 {
    public static final t29 Z;
    public static final v29 f0;
    public static final x29 g0;
    public static final /* synthetic */ b39[] h0;
    public final d39 X;
    public final byte Y;

    /* JADX INFO: Fake field, exist only in values array */
    b39 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    b39 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    b39 EF2;

    static {
        b39 b39Var = new b39("DOUBLE", 0, d39.DOUBLE, 1);
        b39 b39Var2 = new b39("FLOAT", 1, d39.FLOAT, 5);
        d39 d39Var = d39.LONG;
        b39 b39Var3 = new b39("INT64", 2, d39Var, 0);
        b39 b39Var4 = new b39("UINT64", 3, d39Var, 0);
        d39 d39Var2 = d39.INT;
        b39 b39Var5 = new b39("INT32", 4, d39Var2, 0);
        b39 b39Var6 = new b39("FIXED64", 5, d39Var, 1);
        b39 b39Var7 = new b39("FIXED32", 6, d39Var2, 5);
        b39 b39Var8 = new b39("BOOL", 7, d39.BOOLEAN, 0);
        t29 t29Var = new t29("STRING", 8, d39.STRING, 2);
        Z = t29Var;
        d39 d39Var3 = d39.MESSAGE;
        v29 v29Var = new v29("GROUP", 9, d39Var3, 3);
        f0 = v29Var;
        x29 x29Var = new x29("MESSAGE", 10, d39Var3, 2);
        g0 = x29Var;
        h0 = new b39[]{b39Var, b39Var2, b39Var3, b39Var4, b39Var5, b39Var6, b39Var7, b39Var8, t29Var, v29Var, x29Var, new z29("BYTES", 11, d39.BYTE_STRING, 2), new b39("UINT32", 12, d39Var2, 0), new b39("ENUM", 13, d39.ENUM, 0), new b39("SFIXED32", 14, d39Var2, 5), new b39("SFIXED64", 15, d39Var, 1), new b39("SINT32", 16, d39Var2, 0), new b39("SINT64", 17, d39Var, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b39(String str, int i, d39 d39Var, int i2) {
        super(str, i);
        this.X = d39Var;
        this.Y = i2;
    }

    public static b39 valueOf(String str) {
        return (b39) Enum.valueOf(b39.class, str);
    }

    public static b39[] values() {
        return (b39[]) h0.clone();
    }
}

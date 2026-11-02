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
public class a39 {
    public static final a39 Z;
    public static final a39 f0;
    public static final u29 g0;
    public static final w29 h0;
    public static final a39 i0;
    public static final /* synthetic */ a39[] j0;
    public final c39 X;
    public final byte Y;

    /* JADX INFO: Fake field, exist only in values array */
    a39 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    a39 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    a39 EF2;

    static {
        a39 a39Var = new a39("DOUBLE", 0, c39.g0, 1);
        a39 a39Var2 = new a39("FLOAT", 1, c39.f0, 5);
        c39 c39Var = c39.Z;
        a39 a39Var3 = new a39("INT64", 2, c39Var, 0);
        a39 a39Var4 = new a39("UINT64", 3, c39Var, 0);
        c39 c39Var2 = c39.Y;
        a39 a39Var5 = new a39("INT32", 4, c39Var2, 0);
        Z = a39Var5;
        a39 a39Var6 = new a39("FIXED64", 5, c39Var, 1);
        a39 a39Var7 = new a39("FIXED32", 6, c39Var2, 5);
        a39 a39Var8 = new a39("BOOL", 7, c39.h0, 0);
        f0 = a39Var8;
        s29 s29Var = new s29("STRING", 8, c39.i0, 2);
        c39 c39Var3 = c39.l0;
        u29 u29Var = new u29("GROUP", 9, c39Var3, 3);
        g0 = u29Var;
        w29 w29Var = new w29("MESSAGE", 10, c39Var3, 2);
        h0 = w29Var;
        y29 y29Var = new y29("BYTES", 11, c39.j0, 2);
        a39 a39Var9 = new a39("UINT32", 12, c39Var2, 0);
        a39 a39Var10 = new a39("ENUM", 13, c39.k0, 0);
        i0 = a39Var10;
        j0 = new a39[]{a39Var, a39Var2, a39Var3, a39Var4, a39Var5, a39Var6, a39Var7, a39Var8, s29Var, u29Var, w29Var, y29Var, a39Var9, a39Var10, new a39("SFIXED32", 14, c39Var2, 5), new a39("SFIXED64", 15, c39Var, 1), new a39("SINT32", 16, c39Var2, 0), new a39("SINT64", 17, c39Var, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a39(String str, int i, c39 c39Var, int i2) {
        super(str, i);
        this.X = c39Var;
        this.Y = i2;
    }

    public static a39 valueOf(String str) {
        return (a39) Enum.valueOf(a39.class, str);
    }

    public static a39[] values() {
        return (a39[]) j0.clone();
    }

    public boolean a() {
        return !(this instanceof s29);
    }
}

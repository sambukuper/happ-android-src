package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gk8 extends tf3 {
    public final /* synthetic */ byte b = 0;

    public gk8(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // defpackage.s21
    public final t14 a(vx4 vx4Var) {
        aa7 aa7VarX;
        aa7 aa7VarX2;
        aa7 aa7VarX3;
        aa7 aa7VarX4;
        byte b = this.b;
        s32 s32Var = s32.NOT_FOUND_UNSIGNED_TYPE;
        vx4Var.getClass();
        switch (b) {
            case 0:
                sx4 sx4VarM = oc.m(vx4Var, tg7.S);
                return (sx4VarM == null || (aa7VarX = sx4VarM.X()) == null) ? u32.c(s32Var, "UByte") : aa7VarX;
            case 1:
                sx4 sx4VarM2 = oc.m(vx4Var, tg7.U);
                return (sx4VarM2 == null || (aa7VarX2 = sx4VarM2.X()) == null) ? u32.c(s32Var, "UInt") : aa7VarX2;
            case 2:
                sx4 sx4VarM3 = oc.m(vx4Var, tg7.V);
                return (sx4VarM3 == null || (aa7VarX3 = sx4VarM3.X()) == null) ? u32.c(s32Var, "ULong") : aa7VarX3;
            default:
                sx4 sx4VarM4 = oc.m(vx4Var, tg7.T);
                return (sx4VarM4 == null || (aa7VarX4 = sx4VarM4.X()) == null) ? u32.c(s32Var, "UShort") : aa7VarX4;
        }
    }

    @Override // defpackage.s21
    public final String toString() {
        byte b = this.b;
        Object obj = this.a;
        switch (b) {
            case 0:
                return ((Number) obj).intValue() + ".toUByte()";
            case 1:
                return ((Number) obj).intValue() + ".toUInt()";
            case 2:
                return ((Number) obj).longValue() + ".toULong()";
            default:
                return ((Number) obj).intValue() + ".toUShort()";
        }
    }

    public gk8(short s) {
        super(Short.valueOf(s));
    }

    public gk8(int i) {
        super(Integer.valueOf(i));
    }

    public gk8(long j) {
        super(Long.valueOf(j));
    }
}

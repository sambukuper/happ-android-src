package defpackage;

import java.io.IOException;
import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u75 extends kb8 implements p51 {
    public static final u75 g0 = new u75((byte) 0);
    public static final u75 h0 = new u75((byte) 1);
    public static final u75 i0 = new u75((byte) 2);
    public final /* synthetic */ byte f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u75(byte b) {
        super(Float.class, (byte) 2);
        this.f0 = b;
        switch (b) {
            case 1:
                super(Number.class, (byte) 2);
                break;
            case 2:
                super(Short.class, (byte) 2);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.p51
    public final ar3 a(t37 t37Var, d50 d50Var) {
        Class cls = this.X;
        no3 no3VarK = lj7.k(t37Var, d50Var, cls);
        if (no3VarK == null || no3VarK.Y.ordinal() != 5) {
            return this;
        }
        return cls == BigDecimal.class ? s75.g0 : s75.h0;
    }

    @Override // defpackage.kb8, defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) {
        switch (this.f0) {
            case 0:
                ro3Var.a0(((Float) obj).floatValue());
                break;
            case 1:
                ro3Var.c0(((Number) obj).intValue());
                break;
            case 2:
                ro3Var.B0(((Short) obj).shortValue());
                break;
            case 3:
                ro3Var.Y(((Double) obj).doubleValue());
                break;
            case 4:
                ro3Var.c0(((Integer) obj).intValue());
                break;
            default:
                ro3Var.u0(((Long) obj).longValue());
                break;
        }
    }

    @Override // defpackage.kb8, defpackage.ar3
    public void f(Object obj, ro3 ro3Var, t37 t37Var, ri8 ri8Var) throws IOException {
        switch (this.f0) {
            case 3:
                Double d = (Double) obj;
                double dDoubleValue = d.doubleValue();
                String str = q75.a;
                if (!Double.isFinite(dDoubleValue)) {
                    z76 z76VarE = ri8Var.e(ro3Var, ri8Var.d(obj, gr3.VALUE_NUMBER_FLOAT));
                    ro3Var.Y(d.doubleValue());
                    ri8Var.f(ro3Var, z76VarE);
                } else {
                    ro3Var.Y(d.doubleValue());
                }
                break;
            case 4:
                e(obj, ro3Var, t37Var);
                break;
            default:
                super.f(obj, ro3Var, t37Var, ri8Var);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u75(Class cls, byte b) {
        super(cls, (byte) 2);
        this.f0 = b;
    }
}

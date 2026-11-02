package defpackage;

import java.io.IOException;
import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s75 extends kb8 {
    public static final s75 g0 = new s75((byte) 0);
    public static final s75 h0 = new s75((byte) 1);
    public final /* synthetic */ byte f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s75(byte b) {
        super(0, BigDecimal.class);
        this.f0 = b;
        switch (b) {
            case 1:
                super(0, Object.class);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.kb8, defpackage.ar3
    public boolean c(t37 t37Var, Object obj) {
        switch (this.f0) {
            case 0:
                return false;
            default:
                return super.c(t37Var, obj);
        }
    }

    @Override // defpackage.kb8, defpackage.ar3
    public void e(Object obj, ro3 ro3Var, t37 t37Var) throws IOException {
        String string;
        switch (this.f0) {
            case 0:
                if (ro3Var.p(qo3.l0)) {
                    BigDecimal bigDecimal = (BigDecimal) obj;
                    int iScale = bigDecimal.scale();
                    if (iScale < -9999 || iScale > 9999) {
                        String str = String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(bigDecimal.scale()), 9999, 9999);
                        t37Var.getClass();
                        throw new pp3(((qf1) t37Var).q0, str, null);
                    }
                    string = bigDecimal.toPlainString();
                } else {
                    string = obj.toString();
                }
                ro3Var.c1(string);
                return;
            default:
                super.e(obj, ro3Var, t37Var);
                return;
        }
    }

    @Override // defpackage.kb8
    public final String p(Object obj) {
        switch (this.f0) {
            case 0:
                throw new IllegalStateException();
            default:
                return obj.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s75(int i, Class cls) {
        super(i, cls);
        this.f0 = (byte) 1;
    }
}

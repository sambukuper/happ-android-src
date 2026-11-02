package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t75 extends kb8 implements p51 {
    public static final t75 f0 = new t75(Number.class, (byte) 2);

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
        Number number = (Number) obj;
        if (number instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) number;
            r59 r59Var = (r59) ro3Var;
            r59Var.h1("write a number");
            if (r59Var.g0) {
                r59Var.t1(r59Var.g1(bigDecimal));
                return;
            } else {
                r59Var.C0(r59Var.g1(bigDecimal));
                return;
            }
        }
        if (number instanceof BigInteger) {
            BigInteger bigInteger = (BigInteger) number;
            r59 r59Var2 = (r59) ro3Var;
            r59Var2.h1("write a number");
            if (r59Var2.g0) {
                r59Var2.t1(bigInteger.toString());
                return;
            } else {
                r59Var2.C0(bigInteger.toString());
                return;
            }
        }
        if (number instanceof Long) {
            ro3Var.u0(number.longValue());
            return;
        }
        if (number instanceof Double) {
            ro3Var.Y(number.doubleValue());
            return;
        }
        if (number instanceof Float) {
            ro3Var.a0(number.floatValue());
            return;
        }
        if ((number instanceof Integer) || (number instanceof Byte) || (number instanceof Short)) {
            ro3Var.c0(number.intValue());
            return;
        }
        String string = number.toString();
        r59 r59Var3 = (r59) ro3Var;
        r59Var3.h1("write a number");
        if (string == null) {
            r59Var3.s1();
        } else if (r59Var3.g0) {
            r59Var3.t1(string);
        } else {
            r59Var3.C0(string);
        }
    }
}

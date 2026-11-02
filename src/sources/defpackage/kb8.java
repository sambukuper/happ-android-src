package defpackage;

import j$.time.Instant;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kb8 extends lj7 {
    public final /* synthetic */ byte Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kb8(int i, Class cls) {
        super(i, cls);
        this.Z = (byte) 3;
    }

    public static void o(Object obj, ro3 ro3Var) throws IOException {
        if (obj instanceof Date) {
            ro3Var.u0(((Date) obj).getTime() / 1000);
            return;
        }
        if (obj instanceof Instant) {
            ro3Var.u0(((Instant) obj).getEpochSecond());
            return;
        }
        if (obj instanceof Map) {
            ro3Var.Z0();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                ro3Var.U((String) entry.getKey());
                o(entry.getValue(), ro3Var);
            }
            ro3Var.J();
            return;
        }
        if (obj instanceof List) {
            ro3Var.H0();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                o(it.next(), ro3Var);
            }
            ro3Var.D();
            return;
        }
        eq2 eq2Var = (eq2) ro3Var;
        if (obj == null) {
            eq2Var.X();
            return;
        }
        z75 z75Var = eq2Var.Y;
        if (z75Var != null) {
            np3 np3Var = (np3) z75Var;
            l37 l37Var = np3Var.Y;
            if (l37Var.j(n37.f0) && eq2Var.X == null) {
                eq2Var.X = l37Var.h();
            }
            if (!l37Var.j(n37.l0) || !(obj instanceof Closeable)) {
                np3Var.a(l37Var).F(eq2Var, obj);
                if (l37Var.j(n37.m0)) {
                    eq2Var.flush();
                    return;
                }
                return;
            }
            Closeable closeable = (Closeable) obj;
            try {
                np3Var.a(l37Var).F(eq2Var, obj);
                if (l37Var.j(n37.m0)) {
                    eq2Var.flush();
                }
                closeable.close();
                return;
            } catch (Exception e) {
                it0.f(null, closeable, e);
                throw null;
            }
        }
        if (obj instanceof String) {
            eq2Var.c1((String) obj);
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof Integer) {
                eq2Var.c0(number.intValue());
                return;
            }
            if (number instanceof Long) {
                eq2Var.u0(number.longValue());
                return;
            }
            if (number instanceof Double) {
                eq2Var.Y(number.doubleValue());
                return;
            }
            if (number instanceof Float) {
                eq2Var.a0(number.floatValue());
                return;
            }
            if (number instanceof Short) {
                eq2Var.B0(number.shortValue());
                return;
            }
            if (number instanceof Byte) {
                eq2Var.B0(number.byteValue());
                return;
            }
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                r59 r59Var = (r59) eq2Var;
                r59Var.h1("write a number");
                if (r59Var.g0) {
                    r59Var.t1(bigInteger.toString());
                    return;
                } else {
                    r59Var.C0(bigInteger.toString());
                    return;
                }
            }
            if (number instanceof BigDecimal) {
                BigDecimal bigDecimal = (BigDecimal) number;
                r59 r59Var2 = (r59) eq2Var;
                r59Var2.h1("write a number");
                if (r59Var2.g0) {
                    r59Var2.t1(r59Var2.g1(bigDecimal));
                    return;
                } else {
                    r59Var2.C0(r59Var2.g1(bigDecimal));
                    return;
                }
            }
            if (number instanceof AtomicInteger) {
                eq2Var.c0(((AtomicInteger) number).get());
                return;
            } else if (number instanceof AtomicLong) {
                eq2Var.u0(((AtomicLong) number).get());
                return;
            }
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            eq2Var.u(m10.a, bArr, 0, bArr.length);
            return;
        } else if (obj instanceof Boolean) {
            eq2Var.C(((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof AtomicBoolean) {
            eq2Var.C(((AtomicBoolean) obj).get());
            return;
        }
        om0.g("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed ", obj.getClass().getName(), ")");
    }

    @Override // defpackage.ar3
    public boolean c(t37 t37Var, Object obj) {
        switch (this.Z) {
            case 3:
                return p(obj).isEmpty();
            default:
                return super.c(t37Var, obj);
        }
    }

    @Override // defpackage.ar3
    public void e(Object obj, ro3 ro3Var, t37 t37Var) throws IOException {
        switch (this.Z) {
            case 1:
                ro3Var.Z0();
                Iterator it = ((ds0) obj).a.entrySet().iterator();
                while (it.hasNext()) {
                    q((Map.Entry) it.next(), ro3Var);
                }
                ro3Var.J();
                break;
            default:
                ro3Var.c1(p(obj));
                break;
        }
    }

    @Override // defpackage.ar3
    public void f(Object obj, ro3 ro3Var, t37 t37Var, ri8 ri8Var) throws IOException {
        switch (this.Z) {
            case 2:
                z76 z76VarE = ri8Var.e(ro3Var, ri8Var.d(obj, gr3.VALUE_STRING));
                e(obj, ro3Var, t37Var);
                ri8Var.f(ro3Var, z76VarE);
                break;
            case 3:
                z76 z76VarE2 = ri8Var.e(ro3Var, ri8Var.d(obj, gr3.VALUE_STRING));
                e(obj, ro3Var, t37Var);
                ri8Var.f(ro3Var, z76VarE2);
                break;
            default:
                super.f(obj, ro3Var, t37Var, ri8Var);
                break;
        }
    }

    public abstract String p(Object obj);

    public void q(Map.Entry entry, ro3 ro3Var) throws IOException {
        ro3Var.U((String) entry.getKey());
        o(entry.getValue(), ro3Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kb8(Class cls, byte b) {
        super(cls);
        this.Z = b;
    }
}

package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ro3 implements Closeable, Flushable {
    public it5 X;

    static {
        ll7[] ll7VarArrValues = ll7.values();
        if (ll7VarArrValues.length > 31) {
            kp5.n("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", new Object[]{ll7VarArrValues[0].getClass().getName(), Integer.valueOf(ll7VarArrValues.length)});
            return;
        }
        for (ll7 ll7Var : ll7VarArrValues) {
            ll7Var.getClass();
        }
        ll7.CAN_WRITE_FORMATTED_NUMBERS.c();
        ll7.CAN_WRITE_BINARY_NATIVELY.c();
    }

    public static void k(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        kp5.n("invalid argument(s) (offset=%d, length=%d) for input array of %d element", new Object[]{0, Integer.valueOf(i2), Integer.valueOf(i)});
    }

    public abstract void B0(short s);

    public abstract void C(boolean z);

    public abstract void C0(String str);

    public abstract void D();

    public abstract void H0();

    public abstract void J();

    public abstract void J0(Object obj);

    public abstract void R(r37 r37Var);

    public abstract void U(String str);

    public abstract void V0(Object obj);

    public abstract void X();

    public abstract void Y(double d);

    public abstract void Z0();

    public abstract void a0(float f);

    public abstract void a1(Object obj);

    public abstract void b1(r37 r37Var);

    public abstract void c0(int i);

    public abstract void c1(String str);

    public abstract void d1(char[] cArr, int i, int i2);

    public final void e1(z76 z76Var) {
        Object obj = z76Var.g0;
        gr3 gr3Var = (gr3) z76Var.i0;
        String string = Objects.toString(obj, null);
        boolean z = false;
        if (string != null) {
            int i = z76Var.X;
            if (gr3Var != gr3.START_OBJECT) {
                if (i == 0) {
                    throw null;
                }
                if (i == 3 || i == 4) {
                    z76Var.X = 1;
                    i = 1;
                }
            }
            z76Var.Y = true;
            int iB = p61.B(i);
            if (iB == 1) {
                Z0();
                U(string);
            } else if (iB == 2) {
                a1(z76Var.Z);
                U((String) z76Var.h0);
                c1(string);
                z = true;
            } else if (iB != 3 && iB != 4) {
                H0();
                c1(string);
            }
        }
        int iOrdinal = gr3Var.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 3) {
                return;
            }
            J0(z76Var.Z);
        } else {
            if (z) {
                return;
            }
            a1(z76Var.Z);
        }
    }

    public final void f1(z76 z76Var) {
        gr3 gr3Var = (gr3) z76Var.i0;
        if (gr3Var == gr3.START_OBJECT) {
            J();
        } else if (gr3Var == gr3.START_ARRAY) {
            D();
        }
        if (z76Var.Y) {
            int iB = p61.B(z76Var.X);
            if (iB == 0) {
                D();
                return;
            }
            if (iB == 2 || iB == 3) {
                return;
            }
            if (iB != 4) {
                J();
                return;
            }
            Object obj = z76Var.g0;
            String strValueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            U((String) z76Var.h0);
            c1(strValueOf);
        }
    }

    public abstract void flush();

    public final void g(String str) {
        throw new po3(str, this);
    }

    public abstract void m(Object obj);

    public abstract boolean p(qo3 qo3Var);

    public abstract void u(l10 l10Var, byte[] bArr, int i, int i2);

    public abstract void u0(long j);
}

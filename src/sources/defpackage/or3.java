package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class or3 extends rq3 {
    public static final lr3 v0 = new lr3();
    public static final Object w0 = new Object();
    public Object[] r0;
    public int s0;
    public String[] t0;
    public int[] u0;

    @Override // defpackage.rq3
    public final String C() {
        return d1(true);
    }

    @Override // defpackage.rq3
    public final void F0() {
        c1(3);
        i1(((wa4) ((bq3) g1()).X.entrySet()).iterator());
    }

    @Override // defpackage.rq3
    public final void K0() {
        c1(2);
        h1();
        h1();
        int i = this.s0;
        if (i > 0) {
            int[] iArr = this.u0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.rq3
    public final void Q0() {
        c1(1);
        i1(((en3) g1()).X.iterator());
        this.u0[this.s0 - 1] = 0;
    }

    @Override // defpackage.rq3
    public final boolean R() {
        c1(8);
        boolean zF = ((iq3) h1()).f();
        int i = this.s0;
        if (i > 0) {
            int[] iArr = this.u0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return zF;
    }

    @Override // defpackage.rq3
    public final void X() {
        c1(9);
        h1();
        int i = this.s0;
        if (i > 0) {
            int[] iArr = this.u0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.rq3
    public final int c0() {
        if (this.s0 == 0) {
            return 10;
        }
        Object objG1 = g1();
        if (objG1 instanceof Iterator) {
            boolean z = this.r0[this.s0 - 2] instanceof bq3;
            Iterator it = (Iterator) objG1;
            if (!it.hasNext()) {
                return z ? 4 : 2;
            }
            if (z) {
                return 5;
            }
            i1(it.next());
            return c0();
        }
        if (objG1 instanceof bq3) {
            return 3;
        }
        if (objG1 instanceof en3) {
            return 1;
        }
        if (objG1 instanceof iq3) {
            Serializable serializable = ((iq3) objG1).X;
            if (serializable instanceof String) {
                return 6;
            }
            if (serializable instanceof Boolean) {
                return 8;
            }
            if (serializable instanceof Number) {
                return 7;
            }
            throw new AssertionError();
        }
        if (objG1 instanceof xp3) {
            return 9;
        }
        if (objG1 == w0) {
            bt.i("JsonReader is closed");
            return 0;
        }
        throw new cp4("Custom JsonElement subclass " + objG1.getClass().getName() + " is not supported");
    }

    public final void c1(int i) {
        if (c0() == i) {
            return;
        }
        u52.o("Expected ", ie2.r(i), " but was ", ie2.r(c0()), e1());
    }

    @Override // defpackage.rq3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.r0 = new Object[]{w0};
        this.s0 = 1;
    }

    public final String d1(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.s0;
            if (i >= i2) {
                return sb.toString();
            }
            Object[] objArr = this.r0;
            Object obj = objArr[i];
            if (obj instanceof en3) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    int i3 = this.u0[i];
                    if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                        i3--;
                    }
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                }
            } else if ((obj instanceof bq3) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String str = this.t0[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    @Override // defpackage.rq3
    public final String e0() {
        return f1(false);
    }

    public final String e1() {
        return " at path ".concat(d1(false));
    }

    public final String f1(boolean z) {
        c1(5);
        Map.Entry entry = (Map.Entry) ((Iterator) g1()).next();
        String str = (String) entry.getKey();
        this.t0[this.s0 - 1] = z ? "<skipped>" : str;
        i1(entry.getValue());
        return str;
    }

    public final Object g1() {
        return this.r0[this.s0 - 1];
    }

    public final Object h1() {
        Object[] objArr = this.r0;
        int i = this.s0 - 1;
        this.s0 = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    @Override // defpackage.rq3
    public final boolean hasNext() {
        int iC0 = c0();
        return (iC0 == 4 || iC0 == 2 || iC0 == 10) ? false : true;
    }

    public final void i1(Object obj) {
        int i = this.s0;
        Object[] objArr = this.r0;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.r0 = Arrays.copyOf(objArr, i2);
            this.u0 = Arrays.copyOf(this.u0, i2);
            this.t0 = (String[]) Arrays.copyOf(this.t0, i2);
        }
        Object[] objArr2 = this.r0;
        int i3 = this.s0;
        this.s0 = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // defpackage.rq3
    public final void j0() {
        c1(4);
        this.t0[this.s0 - 1] = null;
        h1();
        h1();
        int i = this.s0;
        if (i > 0) {
            int[] iArr = this.u0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.rq3
    public final double nextDouble() throws cp4 {
        int iC0 = c0();
        if (iC0 != 7 && iC0 != 6) {
            u52.o("Expected ", ie2.r(7), " but was ", ie2.r(iC0), e1());
            return 0.0d;
        }
        double dH = ((iq3) g1()).h();
        if (this.q0 != 1 && (Double.isNaN(dH) || Double.isInfinite(dH))) {
            throw new cp4("JSON forbids NaN and infinities: " + dH);
        }
        h1();
        int i = this.s0;
        if (i > 0) {
            int[] iArr = this.u0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return dH;
    }

    @Override // defpackage.rq3
    public final int nextInt() {
        int iC0 = c0();
        if (iC0 != 7 && iC0 != 6) {
            u52.o("Expected ", ie2.r(7), " but was ", ie2.r(iC0), e1());
            return 0;
        }
        int iA = ((iq3) g1()).a();
        h1();
        int i = this.s0;
        if (i > 0) {
            int[] iArr = this.u0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return iA;
    }

    @Override // defpackage.rq3
    public final long nextLong() {
        int iC0 = c0();
        if (iC0 != 7 && iC0 != 6) {
            u52.o("Expected ", ie2.r(7), " but was ", ie2.r(iC0), e1());
            return 0L;
        }
        iq3 iq3Var = (iq3) g1();
        long jLongValue = iq3Var.X instanceof Number ? iq3Var.i().longValue() : Long.parseLong(iq3Var.d());
        h1();
        int i = this.s0;
        if (i > 0) {
            int[] iArr = this.u0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return jLongValue;
    }

    @Override // defpackage.rq3
    public final String p() {
        return d1(false);
    }

    @Override // defpackage.rq3
    public final String r() {
        int iC0 = c0();
        if (iC0 != 6 && iC0 != 7) {
            u52.o("Expected ", ie2.r(6), " but was ", ie2.r(iC0), e1());
            return null;
        }
        String strD = ((iq3) h1()).d();
        int i = this.s0;
        if (i > 0) {
            int[] iArr = this.u0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return strD;
    }

    @Override // defpackage.rq3
    public final String toString() {
        return or3.class.getSimpleName().concat(e1());
    }

    @Override // defpackage.rq3
    public final void v() {
        int iB = p61.B(c0());
        if (iB == 1) {
            K0();
            return;
        }
        if (iB != 9) {
            if (iB == 3) {
                j0();
                return;
            }
            if (iB == 4) {
                f1(true);
                return;
            }
            h1();
            int i = this.s0;
            if (i > 0) {
                int[] iArr = this.u0;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
        }
    }
}

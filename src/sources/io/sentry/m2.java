package io.sentry;

import defpackage.bt;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.Reader;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 implements q3 {
    public final io.sentry.vendor.gson.stream.a X;
    public final ArrayDeque Y = new ArrayDeque();
    public int Z = 0;

    public m2(Reader reader) {
        this.X = new io.sentry.vendor.gson.stream.a(reader);
    }

    @Override // io.sentry.q3
    public final Long A() throws IOException {
        if (this.X.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Long.valueOf(nextLong());
        }
        p();
        return null;
    }

    @Override // io.sentry.q3
    public final Object E0() throws IOException {
        k2 k2Var = new k2();
        boolean zB = false;
        while (!zB) {
            int[] iArr = d2.a;
            io.sentry.vendor.gson.stream.a aVar = this.X;
            int i = iArr[aVar.peek().ordinal()];
            ArrayList arrayList = k2Var.a;
            switch (i) {
                case 1:
                    Q0();
                    arrayList.add(new g2());
                    break;
                case 2:
                    K0();
                    zB = k2Var.b();
                    break;
                case 3:
                    F0();
                    arrayList.add(new h2());
                    break;
                case 4:
                    j0();
                    zB = k2Var.b();
                    break;
                case 5:
                    arrayList.add(new i2(aVar.e0()));
                    break;
                case 6:
                    zB = k2Var.c(new b2(this, (byte) 0));
                    break;
                case 7:
                    zB = k2Var.c(new b2(k2Var, this));
                    break;
                case 8:
                    zB = k2Var.c(new b2(this, (byte) 2));
                    break;
                case 9:
                    p();
                    zB = k2Var.c(new c2((byte) 0));
                    break;
                case 10:
                    zB = true;
                    break;
            }
        }
        f2 f2VarA = k2Var.a();
        if (f2VarA != null) {
            return f2VarA.getValue();
        }
        return null;
    }

    @Override // io.sentry.q3
    public final void F0() throws IOException {
        io.sentry.vendor.gson.stream.a aVar = this.X;
        int iK = aVar.j0;
        if (iK == 0) {
            iK = aVar.k();
        }
        if (iK != 1) {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(aVar.peek());
            c2.l(sb, aVar.u());
        } else {
            aVar.R(3);
            aVar.j0 = 0;
            k();
            this.Z++;
        }
    }

    @Override // io.sentry.q3
    public final TimeZone I(ILogger iLogger) throws IOException {
        if (this.X.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            p();
            return null;
        }
        try {
            return DesugarTimeZone.getTimeZone(r());
        } catch (Exception e) {
            iLogger.e(s5.ERROR, "Error when deserializing TimeZone", e);
            return null;
        }
    }

    @Override // io.sentry.q3
    public final String K() throws IOException {
        if (this.X.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return r();
        }
        p();
        return null;
    }

    @Override // io.sentry.q3
    public final void K0() throws IOException {
        io.sentry.vendor.gson.stream.a aVar = this.X;
        int iK = aVar.j0;
        if (iK == 0) {
            iK = aVar.k();
        }
        if (iK != 4) {
            StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
            sb.append(aVar.peek());
            c2.l(sb, aVar.u());
            return;
        }
        int i = aVar.o0;
        aVar.o0 = i - 1;
        int[] iArr = aVar.q0;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        aVar.j0 = 0;
        this.Z--;
    }

    @Override // io.sentry.q3
    public final void L(boolean z) {
        this.X.Y = z;
    }

    @Override // io.sentry.q3
    public final ArrayList M0(ILogger iLogger, a2 a2Var) throws IOException {
        boolean z;
        io.sentry.vendor.gson.stream.a aVar = this.X;
        if (aVar.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            p();
            return null;
        }
        Q0();
        ArrayList arrayList = new ArrayList();
        while (aVar.hasNext()) {
            l2 l2Var = new l2(this.Z, aVar.peek());
            this.Y.addLast(l2Var);
            try {
                try {
                    arrayList.add(a2Var.a(this, iLogger));
                } catch (Exception e) {
                    iLogger.e(s5.WARNING, "Failed to deserialize object in list.", e);
                    try {
                        u(l2Var);
                        z = true;
                    } catch (Exception e2) {
                        iLogger.e(s5.ERROR, "Stream unrecoverable, aborting list deserialization.", e2);
                        z = false;
                    }
                    if (!z) {
                        g(l2Var);
                        K0();
                        return arrayList;
                    }
                }
                g(l2Var);
            } catch (Throwable th) {
                g(l2Var);
                throw th;
            }
        }
        K0();
        return arrayList;
    }

    @Override // io.sentry.q3
    public final HashMap Q(ILogger iLogger, a2 a2Var) throws IOException {
        boolean z;
        io.sentry.vendor.gson.stream.a aVar = this.X;
        if (aVar.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            p();
            return null;
        }
        F0();
        HashMap map = new HashMap();
        if (aVar.hasNext()) {
            while (true) {
                String strE0 = aVar.e0();
                l2 l2Var = new l2(this.Z, aVar.peek());
                this.Y.addLast(l2Var);
                try {
                    try {
                        map.put(strE0, a2Var.a(this, iLogger));
                    } catch (Exception e) {
                        iLogger.e(s5.WARNING, "Failed to deserialize object in map.", e);
                        try {
                            u(l2Var);
                            z = true;
                        } catch (Exception e2) {
                            iLogger.e(s5.ERROR, "Stream unrecoverable, aborting map deserialization.", e2);
                            z = false;
                        }
                        if (!z) {
                            g(l2Var);
                            break;
                        }
                        j0();
                        return map;
                    }
                    g(l2Var);
                    if (aVar.peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && aVar.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        break;
                    }
                } catch (Throwable th) {
                    g(l2Var);
                    throw th;
                }
            }
        }
        j0();
        return map;
    }

    @Override // io.sentry.q3
    public final void Q0() throws IOException {
        io.sentry.vendor.gson.stream.a aVar = this.X;
        int iK = aVar.j0;
        if (iK == 0) {
            iK = aVar.k();
        }
        if (iK != 3) {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(aVar.peek());
            c2.l(sb, aVar.u());
        } else {
            aVar.R(1);
            aVar.q0[aVar.o0 - 1] = 0;
            aVar.j0 = 0;
            k();
            this.Z++;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.X.close();
    }

    @Override // io.sentry.q3
    public final Double d0() throws IOException {
        if (this.X.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Double.valueOf(nextDouble());
        }
        p();
        return null;
    }

    @Override // io.sentry.q3
    public final String e0() {
        return this.X.e0();
    }

    public final void g(l2 l2Var) {
        if (l2Var == null) {
            return;
        }
        ArrayDeque arrayDeque = this.Y;
        if (arrayDeque.isEmpty() || arrayDeque.peekLast() != l2Var) {
            arrayDeque.remove(l2Var);
        } else {
            arrayDeque.removeLast();
        }
    }

    @Override // io.sentry.q3
    public final boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // io.sentry.q3
    public final void j0() throws IOException {
        io.sentry.vendor.gson.stream.a aVar = this.X;
        int iK = aVar.j0;
        if (iK == 0) {
            iK = aVar.k();
        }
        if (iK != 2) {
            StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
            sb.append(aVar.peek());
            c2.l(sb, aVar.u());
            return;
        }
        int i = aVar.o0;
        int i2 = i - 1;
        aVar.o0 = i2;
        aVar.p0[i2] = null;
        int[] iArr = aVar.q0;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        aVar.j0 = 0;
        this.Z--;
    }

    public final void k() {
        l2 l2Var = (l2) this.Y.peekLast();
        if (l2Var != null) {
            l2Var.c = true;
        }
    }

    @Override // io.sentry.q3
    public final Date l0(ILogger iLogger) throws IOException {
        if (this.X.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            p();
            return null;
        }
        String strR = r();
        if (strR == null) {
            return null;
        }
        try {
            try {
                return io.sentry.config.a.h(strR);
            } catch (Exception e) {
                iLogger.e(s5.ERROR, "Error when deserializing millis timestamp format.", e);
                return null;
            }
        } catch (Exception unused) {
            return io.sentry.config.a.i(strR);
        }
    }

    public final boolean m() throws IOException {
        io.sentry.vendor.gson.stream.a aVar = this.X;
        int iK = aVar.j0;
        if (iK == 0) {
            iK = aVar.k();
        }
        boolean z = false;
        if (iK == 5) {
            aVar.j0 = 0;
            int[] iArr = aVar.q0;
            int i = aVar.o0 - 1;
            iArr[i] = iArr[i] + 1;
            z = true;
        } else {
            if (iK != 6) {
                StringBuilder sb = new StringBuilder("Expected a boolean but was ");
                sb.append(aVar.peek());
                c2.l(sb, aVar.u());
                return false;
            }
            aVar.j0 = 0;
            int[] iArr2 = aVar.q0;
            int i2 = aVar.o0 - 1;
            iArr2[i2] = iArr2[i2] + 1;
        }
        k();
        return z;
    }

    @Override // io.sentry.q3
    public final Boolean m0() throws IOException {
        if (this.X.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Boolean.valueOf(m());
        }
        p();
        return null;
    }

    @Override // io.sentry.q3
    public final double nextDouble() {
        double dNextDouble = this.X.nextDouble();
        k();
        return dNextDouble;
    }

    @Override // io.sentry.q3
    public final float nextFloat() throws IOException {
        double dNextDouble = this.X.nextDouble();
        k();
        return (float) dNextDouble;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cc  */
    @Override // io.sentry.q3
    public final int nextInt() throws IOException {
        String strD;
        int i;
        double d;
        io.sentry.vendor.gson.stream.a aVar = this.X;
        int iK = aVar.j0;
        if (iK == 0) {
            iK = aVar.k();
        }
        if (iK == 15) {
            long j = aVar.k0;
            i = (int) j;
            if (j != i) {
                throw new NumberFormatException("Expected an int but was " + aVar.k0 + aVar.u());
            }
            aVar.j0 = 0;
            int[] iArr = aVar.q0;
            int i2 = aVar.o0 - 1;
            iArr[i2] = iArr[i2] + 1;
        } else {
            if (iK == 16) {
                aVar.m0 = new String(aVar.Z, aVar.f0, aVar.l0);
                aVar.f0 += aVar.l0;
            } else {
                if (iK != 8 && iK != 9 && iK != 10) {
                    StringBuilder sb = new StringBuilder("Expected an int but was ");
                    sb.append(aVar.peek());
                    c2.l(sb, aVar.u());
                    return 0;
                }
                if (iK == 10) {
                    strD = aVar.J();
                    aVar.m0 = strD;
                } else {
                    strD = aVar.D(iK == 8 ? '\'' : '\"');
                    aVar.m0 = strD;
                }
                try {
                    i = Integer.parseInt(strD);
                    aVar.j0 = 0;
                    int[] iArr2 = aVar.q0;
                    int i3 = aVar.o0 - 1;
                    iArr2[i3] = iArr2[i3] + 1;
                } catch (NumberFormatException unused) {
                    aVar.j0 = 11;
                    d = Double.parseDouble(aVar.m0);
                    i = (int) d;
                    if (i == d) {
                        bt.j("Expected an int but was ", aVar.m0, aVar.u());
                        return 0;
                    }
                    aVar.m0 = null;
                    aVar.j0 = 0;
                    int[] iArr3 = aVar.q0;
                    int i4 = aVar.o0 - 1;
                    iArr3[i4] = iArr3[i4] + 1;
                }
            }
            aVar.j0 = 11;
            d = Double.parseDouble(aVar.m0);
            i = (int) d;
            if (i == d) {
                bt.j("Expected an int but was ", aVar.m0, aVar.u());
                return 0;
            }
            aVar.m0 = null;
            aVar.j0 = 0;
            int[] iArr4 = aVar.q0;
            int i5 = aVar.o0 - 1;
            iArr4[i5] = iArr4[i5] + 1;
        }
        k();
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    @Override // io.sentry.q3
    public final long nextLong() throws IOException {
        String strD;
        long j;
        double d;
        long j2;
        io.sentry.vendor.gson.stream.a aVar = this.X;
        int iK = aVar.j0;
        if (iK == 0) {
            iK = aVar.k();
        }
        if (iK == 15) {
            aVar.j0 = 0;
            int[] iArr = aVar.q0;
            int i = aVar.o0 - 1;
            iArr[i] = iArr[i] + 1;
            j = aVar.k0;
        } else {
            if (iK == 16) {
                aVar.m0 = new String(aVar.Z, aVar.f0, aVar.l0);
                aVar.f0 += aVar.l0;
            } else {
                if (iK != 8 && iK != 9 && iK != 10) {
                    StringBuilder sb = new StringBuilder("Expected a long but was ");
                    sb.append(aVar.peek());
                    c2.l(sb, aVar.u());
                    return 0L;
                }
                if (iK == 10) {
                    strD = aVar.J();
                    aVar.m0 = strD;
                } else {
                    strD = aVar.D(iK == 8 ? '\'' : '\"');
                    aVar.m0 = strD;
                }
                try {
                    long j3 = Long.parseLong(strD);
                    aVar.j0 = 0;
                    int[] iArr2 = aVar.q0;
                    int i2 = aVar.o0 - 1;
                    iArr2[i2] = iArr2[i2] + 1;
                    j = j3;
                } catch (NumberFormatException unused) {
                    aVar.j0 = 11;
                    d = Double.parseDouble(aVar.m0);
                    j2 = (long) d;
                    if (j2 == d) {
                        bt.j("Expected a long but was ", aVar.m0, aVar.u());
                        return 0L;
                    }
                    aVar.m0 = null;
                    aVar.j0 = 0;
                    int[] iArr3 = aVar.q0;
                    int i3 = aVar.o0 - 1;
                    iArr3[i3] = iArr3[i3] + 1;
                    j = j2;
                }
            }
            aVar.j0 = 11;
            d = Double.parseDouble(aVar.m0);
            j2 = (long) d;
            if (j2 == d) {
                bt.j("Expected a long but was ", aVar.m0, aVar.u());
                return 0L;
            }
            aVar.m0 = null;
            aVar.j0 = 0;
            int[] iArr4 = aVar.q0;
            int i4 = aVar.o0 - 1;
            iArr4[i4] = iArr4[i4] + 1;
            j = j2;
        }
        k();
        return j;
    }

    public final void p() throws IOException {
        io.sentry.vendor.gson.stream.a aVar = this.X;
        int iK = aVar.j0;
        if (iK == 0) {
            iK = aVar.k();
        }
        if (iK != 7) {
            StringBuilder sb = new StringBuilder("Expected null but was ");
            sb.append(aVar.peek());
            c2.l(sb, aVar.u());
        } else {
            aVar.j0 = 0;
            int[] iArr = aVar.q0;
            int i = aVar.o0 - 1;
            iArr[i] = iArr[i] + 1;
            k();
        }
    }

    @Override // io.sentry.q3
    public final io.sentry.vendor.gson.stream.b peek() {
        return this.X.peek();
    }

    @Override // io.sentry.q3
    public final String r() throws IOException {
        String str;
        io.sentry.vendor.gson.stream.a aVar = this.X;
        int iK = aVar.j0;
        if (iK == 0) {
            iK = aVar.k();
        }
        if (iK == 10) {
            str = aVar.J();
        } else if (iK == 8) {
            str = aVar.D('\'');
        } else if (iK == 9) {
            str = aVar.D('\"');
        } else if (iK == 11) {
            str = aVar.m0;
            aVar.m0 = null;
        } else if (iK == 15) {
            str = Long.toString(aVar.k0);
        } else {
            if (iK != 16) {
                StringBuilder sb = new StringBuilder("Expected a string but was ");
                sb.append(aVar.peek());
                c2.l(sb, aVar.u());
                return null;
            }
            str = new String(aVar.Z, aVar.f0, aVar.l0);
            aVar.f0 += aVar.l0;
        }
        aVar.j0 = 0;
        int[] iArr = aVar.q0;
        int i = aVar.o0 - 1;
        iArr[i] = iArr[i] + 1;
        k();
        return str;
    }

    public final void u(l2 l2Var) throws IOException {
        io.sentry.vendor.gson.stream.a aVar;
        while (true) {
            int i = this.Z;
            int i2 = l2Var.a;
            aVar = this.X;
            if (i <= i2) {
                break;
            }
            io.sentry.vendor.gson.stream.b bVarPeek = aVar.peek();
            if (bVarPeek == io.sentry.vendor.gson.stream.b.END_OBJECT) {
                j0();
            } else if (bVarPeek == io.sentry.vendor.gson.stream.b.END_ARRAY) {
                K0();
            } else {
                v();
            }
        }
        if (l2Var.c || aVar.peek() != l2Var.b) {
            return;
        }
        v();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x009d. Please report as an issue. */
    @Override // io.sentry.q3
    public final void v() throws IOException {
        io.sentry.vendor.gson.stream.a aVar;
        int i = 0;
        do {
            aVar = this.X;
            int iK = aVar.j0;
            if (iK == 0) {
                iK = aVar.k();
            }
            if (iK == 3) {
                aVar.R(1);
            } else {
                if (iK == 1) {
                    aVar.R(3);
                } else if (iK == 4 || iK == 2) {
                    aVar.o0--;
                    i--;
                } else if (iK == 14 || iK == 10) {
                    while (true) {
                        int i2 = 0;
                        while (true) {
                            int i3 = aVar.f0 + i2;
                            if (i3 < aVar.g0) {
                                char c = aVar.Z[i3];
                                if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                                    if (c != '#') {
                                        if (c != ',') {
                                            if (c != '/' && c != '=') {
                                                if (c != '{' && c != '}' && c != ':') {
                                                    if (c != ';') {
                                                        switch (c) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i2++;
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    aVar.g();
                                }
                                aVar.f0 += i2;
                            } else {
                                aVar.f0 = i3;
                                if (!aVar.m(1)) {
                                }
                            }
                        }
                    }
                } else if (iK == 8 || iK == 12) {
                    aVar.X('\'');
                } else if (iK == 9 || iK == 13) {
                    aVar.X('\"');
                } else if (iK == 16) {
                    aVar.f0 += aVar.l0;
                }
                aVar.j0 = 0;
            }
            i++;
            aVar.j0 = 0;
        } while (i != 0);
        int[] iArr = aVar.q0;
        int i4 = aVar.o0 - 1;
        iArr[i4] = iArr[i4] + 1;
        aVar.p0[i4] = "null";
        k();
    }

    @Override // io.sentry.q3
    public final Float w0() throws IOException {
        if (this.X.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Float.valueOf(nextFloat());
        }
        p();
        return null;
    }

    @Override // io.sentry.q3
    public final Integer x() throws IOException {
        if (this.X.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Integer.valueOf(nextInt());
        }
        p();
        return null;
    }

    @Override // io.sentry.q3
    public final Object y0(ILogger iLogger, a2 a2Var) throws IOException {
        if (this.X.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return a2Var.a(this, iLogger);
        }
        p();
        return null;
    }

    @Override // io.sentry.q3
    public final void z(ILogger iLogger, AbstractMap abstractMap, String str) throws Throwable {
        l2 l2Var = null;
        try {
            try {
                l2 l2Var2 = new l2(this.Z, this.X.peek());
                this.Y.addLast(l2Var2);
                try {
                    abstractMap.put(str, E0());
                    g(l2Var2);
                } catch (Exception e) {
                    e = e;
                    l2Var = l2Var2;
                    iLogger.d(s5.ERROR, e, "Error deserializing unknown key: %s", str);
                    if (l2Var != null) {
                        try {
                            u(l2Var);
                        } catch (Exception e2) {
                            iLogger.e(s5.ERROR, "Stream unrecoverable after unknown key deserialization failure.", e2);
                        }
                    }
                    g(l2Var);
                } catch (Throwable th) {
                    th = th;
                    l2Var = l2Var2;
                    g(l2Var);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }
}

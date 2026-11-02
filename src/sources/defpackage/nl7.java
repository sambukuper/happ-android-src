package defpackage;

import java.util.ArrayList;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nl7 extends hi5 implements tn3 {
    public final vm3 g0;
    public final q59 h0;
    public final d7 i0;
    public final g55 j0;
    public int k0;
    public jh0 l0;
    public final mn3 m0;
    public final do3 n0;

    public nl7(vm3 vm3Var, q59 q59Var, d7 d7Var, e37 e37Var, jh0 jh0Var) {
        e37Var.getClass();
        this.g0 = vm3Var;
        this.h0 = q59Var;
        this.i0 = d7Var;
        this.j0 = vm3Var.b;
        this.k0 = -1;
        this.l0 = jh0Var;
        mn3 mn3Var = vm3Var.a;
        this.m0 = mn3Var;
        this.n0 = mn3Var.c ? null : new do3(e37Var);
    }

    @Override // defpackage.hi5, defpackage.rd1
    public final byte A() {
        d7 d7Var = this.i0;
        long j = d7Var.j();
        byte b = (byte) j;
        if (j == b) {
            return b;
        }
        d7.s(d7Var, "Failed to parse byte for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.hi5, defpackage.rd1
    public final short B() {
        d7 d7Var = this.i0;
        long j = d7Var.j();
        short s = (short) j;
        if (j == s) {
            return s;
        }
        d7.s(d7Var, "Failed to parse short for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.hi5, defpackage.rd1
    public final float C() {
        d7 d7Var = this.i0;
        String strM = d7Var.m();
        try {
            float f = Float.parseFloat(strM);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            d7.s(d7Var, ys0.N(Float.valueOf(f), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            d7.s(d7Var, p61.l('\'', "Failed to parse type 'float' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.hi5, defpackage.rd1
    public final double E() {
        d7 d7Var = this.i0;
        String strM = d7Var.m();
        try {
            double d = Double.parseDouble(strM);
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            d7.s(d7Var, ys0.N(Double.valueOf(d), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            d7.s(d7Var, p61.l('\'', "Failed to parse type 'double' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0152  */
    /* JADX WARN: Code duplicated, block: B:50:0x0153  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0153, please report this as an issue */
    @Override // defpackage.rd1
    public final Object a(ow3 ow3Var) {
        String message;
        String strA;
        vm3 vm3Var = this.g0;
        d7 d7Var = this.i0;
        eb9 eb9Var = (eb9) d7Var.d;
        ow3Var.getClass();
        try {
            if (!(ow3Var instanceof m2)) {
                return ow3Var.b(this);
            }
            String strR = km4.r(vm3Var, ((m2) ow3Var).d());
            String strD = d7Var.D(strR, this.m0.b);
            if (strD != null) {
                try {
                    ow3 ow3VarU = nr4.u((m2) ow3Var, this, strD);
                    jh0 jh0Var = new jh0();
                    jh0Var.Y = strR;
                    this.l0 = jh0Var;
                    return ow3VarU.b(this);
                } catch (m37 e) {
                    String message2 = e.getMessage();
                    message2.getClass();
                    String strY0 = fm7.y0(fm7.M0('\n', message2), ".");
                    String message3 = e.getMessage();
                    message3.getClass();
                    String strSubstring = _UrlKt.FRAGMENT_ENCODE_SET;
                    int iL0 = fm7.l0(message3, '\n', 0, 6);
                    if (iL0 != -1) {
                        strSubstring = message3.substring(iL0 + 1, message3.length());
                    }
                    d7.s(d7Var, strY0, 0, strSubstring, 2);
                    throw null;
                }
            }
            String strR2 = km4.r(vm3Var, ((m2) ow3Var).d());
            ao3 ao3VarI = i();
            String strA2 = ((m2) ow3Var).d().a();
            if (!(ao3VarI instanceof aq3)) {
                StringBuilder sb = new StringBuilder("Expected ");
                zb6 zb6Var = yb6.a;
                sb.append(zb6Var.b(aq3.class).E());
                sb.append(", but had ");
                sb.append(zb6Var.b(ao3VarI.getClass()).E());
                sb.append(" as the serialized body of ");
                sb.append(strA2);
                throw new vn3(ys0.t(-1, sb.toString(), eb9Var.l(), null, vm3Var.a.h ? ys0.J(ao3VarI.toString(), -1).toString() : null));
            }
            aq3 aq3Var = (aq3) ao3VarI;
            ao3 ao3Var = (ao3) aq3Var.get(strR2);
            if (ao3Var != null) {
                hq3 hq3VarA = co3.a(ao3Var);
                strA = hq3VarA instanceof wp3 ? null : hq3VarA.a();
            }
            try {
                ow3 ow3VarU2 = nr4.u((m2) ow3Var, this, strA);
                strR2.getClass();
                return new ir3(vm3Var, aq3Var, strR2, ow3VarU2.d()).a(ow3VarU2);
            } catch (m37 e2) {
                String message4 = e2.getMessage();
                message4.getClass();
                throw new vn3(ys0.t(-1, message4, null, null, vm3Var.a.h ? ys0.J(aq3Var.toString(), -1).toString() : null));
            }
            message = e.getMessage();
            message.getClass();
            if (fm7.d0(message, "at path", false)) {
                throw e;
            }
            throw new cw4(e.getMessage() + " at path: " + eb9Var.l(), e, e.X, e.Y);
        } catch (cw4 e3) {
            message = e3.getMessage();
            message.getClass();
            if (fm7.d0(message, "at path", false)) {
                throw e3;
            }
            throw new cw4(e3.getMessage() + " at path: " + eb9Var.l(), e3, e3.X, e3.Y);
        }
    }

    @Override // defpackage.hi5, defpackage.rd1
    public final boolean c() {
        boolean z;
        boolean z2;
        d7 d7Var = this.i0;
        int iO = d7Var.O();
        String str = (String) d7Var.g;
        if (iO == str.length()) {
            d7.s(d7Var, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iO) == '\"') {
            iO++;
            z = true;
        } else {
            z = false;
        }
        int I = d7Var.I(iO);
        if (I >= str.length() || I == -1) {
            d7.s(d7Var, "EOF", 0, null, 6);
            throw null;
        }
        int i = I + 1;
        int iCharAt = str.charAt(I) | ' ';
        if (iCharAt == 102) {
            d7Var.e(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                d7.s(d7Var, "Expected valid boolean literal prefix, but had '" + d7Var.m() + '\'', 0, null, 6);
                throw null;
            }
            d7Var.e(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (d7Var.b == str.length()) {
            d7.s(d7Var, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(d7Var.b) == '\"') {
            d7Var.b++;
            return z2;
        }
        d7.s(d7Var, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // defpackage.hi5, defpackage.rd1
    public final char d() {
        d7 d7Var = this.i0;
        String strM = d7Var.m();
        if (strM.length() == 1) {
            return strM.charAt(0);
        }
        d7.s(d7Var, p61.l('\'', "Expected single char, but got '", strM), 0, null, 6);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.f01
    public final int e(e37 e37Var) {
        int iA;
        char c;
        d7 d7Var = this.i0;
        eb9 eb9Var = (eb9) d7Var.d;
        e37Var.getClass();
        q59 q59Var = this.h0;
        int iOrdinal = q59Var.ordinal();
        char c2 = ':';
        int i = 0;
        zP = false;
        boolean zP = false;
        byte b = 1;
        int i2 = -1;
        if (iOrdinal == 0) {
            boolean zP2 = d7Var.P();
            while (true) {
                boolean zC = d7Var.c();
                do3 do3Var = this.n0;
                if (zC) {
                    boolean z = this.m0.b;
                    String strN = z ? d7Var.n() : d7Var.f();
                    d7Var.i(c2);
                    vm3 vm3Var = this.g0;
                    byte b2 = b;
                    iA = sp3.a(e37Var, vm3Var, strN);
                    if (iA == -3) {
                        if (!sp3.c(vm3Var, e37Var)) {
                            jh0 jh0Var = this.l0;
                            if (jh0Var == null || !dh3.f(jh0Var.Y, strN)) {
                                int i3 = eb9Var.Y;
                                int[] iArr = (int[]) eb9Var.g0;
                                if (iArr[i3] == -2) {
                                    iArr[i3] = -1;
                                    i3--;
                                    eb9Var.Y = i3;
                                }
                                if (i3 != -1) {
                                    eb9Var.Y = i3 - 1;
                                }
                                d7Var.r(p61.l('\'', "Encountered an unknown key '", strN), fm7.r0(((String) d7Var.g).subSequence(0, d7Var.b).toString(), strN, 0, 6), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
                                throw null;
                            }
                            jh0Var.Y = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bE = d7Var.E();
                        if (bE == 8 || bE == 6) {
                            while (true) {
                                byte bE2 = d7Var.E();
                                b = b2;
                                if (bE2 != b) {
                                    c = 6;
                                    if (bE2 == 8 || bE2 == 6) {
                                        arrayList.add(Byte.valueOf(bE2));
                                    } else if (bE2 == 9) {
                                        if (((Number) wv0.A0(arrayList)).byteValue() != 8) {
                                            d7.s(d7Var, "found ] instead of }", 0, null, 6);
                                            throw null;
                                        }
                                        bw0.j0(arrayList);
                                    } else if (bE2 == 7) {
                                        if (((Number) wv0.A0(arrayList)).byteValue() != 6) {
                                            d7.s(d7Var, "found } instead of ]", 0, null, 6);
                                            throw null;
                                        }
                                        bw0.j0(arrayList);
                                    } else if (bE2 == 10) {
                                        d7.s(d7Var, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                        throw null;
                                    }
                                    d7Var.g();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z) {
                                    d7Var.m();
                                } else {
                                    d7Var.f();
                                }
                                b2 = b;
                            }
                        } else {
                            d7Var.m();
                            b = b2;
                            c = 6;
                        }
                        zP2 = d7Var.P();
                        c2 = ':';
                    } else if (do3Var != null) {
                        ry1 ry1Var = do3Var.a;
                        if (iA < 64) {
                            ry1Var.a |= 1 << iA;
                        } else {
                            int i4 = (iA >>> 6) - 1;
                            long[] jArr = (long[]) ry1Var.d;
                            jArr[i4] = jArr[i4] | (1 << (iA & 63));
                        }
                    }
                } else if (!zP2) {
                    if (do3Var == null) {
                        i2 = -1;
                        break;
                    }
                    ry1 ry1Var2 = do3Var.a;
                    yn1 yn1Var = (yn1) ry1Var2.c;
                    e37 e37Var2 = (e37) ry1Var2.b;
                    int iE = e37Var2.e();
                    while (true) {
                        long j = ry1Var2.a;
                        long j2 = -1;
                        if (j == -1) {
                            if (iE > 64) {
                                long[] jArr2 = (long[]) ry1Var2.d;
                                int length = jArr2.length;
                                while (true) {
                                    if (i < length) {
                                        int i5 = i + 1;
                                        int i6 = i5 * 64;
                                        long j3 = jArr2[i];
                                        while (true) {
                                            if (j3 != j2) {
                                                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j3);
                                                j3 |= 1 << iNumberOfTrailingZeros;
                                                iA = iNumberOfTrailingZeros + i6;
                                                if (((Boolean) yn1Var.K(e37Var2, Integer.valueOf(iA))).booleanValue()) {
                                                    jArr2[i] = j3;
                                                } else {
                                                    j2 = -1;
                                                }
                                            } else {
                                                jArr2[i] = j3;
                                                i = i5;
                                                j2 = -1;
                                            }
                                        }
                                    }
                                }
                            }
                            i2 = -1;
                            break;
                        }
                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j);
                        ry1Var2.a |= 1 << iNumberOfTrailingZeros2;
                        if (((Boolean) yn1Var.K(e37Var2, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                            i2 = iNumberOfTrailingZeros2;
                            break;
                        }
                    }
                } else {
                    ys0.F(d7Var, "object");
                    throw null;
                }
                i2 = iA;
                break;
            }
        } else if (iOrdinal != 2) {
            boolean zP3 = d7Var.P();
            if (d7Var.c()) {
                int i7 = this.k0;
                if (i7 != -1 && !zP3) {
                    d7.s(d7Var, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i2 = i7 + 1;
                this.k0 = i2;
            } else if (zP3) {
                ys0.F(d7Var, "array");
                throw null;
            }
        } else {
            int i8 = this.k0;
            Object[] objArr = i8 % 2 != 0;
            if (objArr != true) {
                d7Var.i(':');
            } else if (i8 != -1) {
                zP = d7Var.P();
            }
            if (d7Var.c()) {
                if (objArr != false) {
                    int i9 = this.k0;
                    int i10 = d7Var.b;
                    if (i9 == -1) {
                        if (zP) {
                            d7.s(d7Var, "Unexpected leading comma", i10, null, 4);
                            throw null;
                        }
                    } else if (!zP) {
                        d7.s(d7Var, "Expected comma after the key-value pair", i10, null, 4);
                        throw null;
                    }
                }
                i2 = this.k0 + 1;
                this.k0 = i2;
            } else if (zP) {
                ys0.F(d7Var, "object");
                throw null;
            }
        }
        if (q59Var != q59.MAP) {
            ((int[]) eb9Var.g0)[eb9Var.Y] = i2;
        }
        return i2;
    }

    @Override // defpackage.tn3
    public final ao3 i() {
        return new fc0(this.g0.a, this.i0).f();
    }

    @Override // defpackage.hi5, defpackage.rd1
    public final int l() {
        d7 d7Var = this.i0;
        long j = d7Var.j();
        int i = (int) j;
        if (j == i) {
            return i;
        }
        d7.s(d7Var, "Failed to parse int for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.hi5, defpackage.f01
    public final void n(e37 e37Var) {
        e37Var.getClass();
        if (e37Var.e() == 0 && sp3.c(this.g0, e37Var)) {
            while (e(e37Var) != -1) {
            }
        }
        d7 d7Var = this.i0;
        if (d7Var.P()) {
            ys0.F(d7Var, _UrlKt.FRAGMENT_ENCODE_SET);
            throw null;
        }
        d7Var.i(this.h0.Y);
        eb9 eb9Var = (eb9) d7Var.d;
        int i = eb9Var.Y;
        int[] iArr = (int[]) eb9Var.g0;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            i--;
            eb9Var.Y = i;
        }
        if (i != -1) {
            eb9Var.Y = i - 1;
        }
    }

    @Override // defpackage.f01
    public final g55 o() {
        return this.j0;
    }

    @Override // defpackage.hi5, defpackage.rd1
    public final rd1 p(e37 e37Var) {
        e37Var.getClass();
        return pl7.a(e37Var) ? new un3(this.i0, this.g0) : this;
    }

    @Override // defpackage.hi5, defpackage.f01
    public final Object q(e37 e37Var, int i, ow3 ow3Var, Object obj) {
        eb9 eb9Var = (eb9) this.i0.d;
        e37Var.getClass();
        ow3Var.getClass();
        boolean z = this.h0 == q59.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) eb9Var.g0;
            int i2 = eb9Var.Y;
            if (iArr[i2] == -2) {
                ((Object[]) eb9Var.f0)[i2] = oy1.F0;
            }
        }
        Object objA = a(ow3Var);
        if (z) {
            int[] iArr2 = (int[]) eb9Var.g0;
            int i3 = eb9Var.Y;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                eb9Var.Y = i4;
                if (i4 == ((Object[]) eb9Var.f0).length) {
                    eb9Var.m();
                }
            }
            Object[] objArr = (Object[]) eb9Var.f0;
            int i5 = eb9Var.Y;
            objArr[i5] = ((mn3) eb9Var.Z).h ? objA : pz2.W0;
            ((int[]) eb9Var.g0)[i5] = -2;
        }
        return objA;
    }

    @Override // defpackage.hi5, defpackage.rd1
    public final String s() {
        boolean z = this.m0.b;
        d7 d7Var = this.i0;
        return z ? d7Var.n() : d7Var.l();
    }

    @Override // defpackage.hi5, defpackage.rd1
    public final f01 t(e37 e37Var) {
        e37Var.getClass();
        vm3 vm3Var = this.g0;
        q59 q59VarG = d28.g(vm3Var, e37Var);
        d7 d7Var = this.i0;
        eb9 eb9Var = (eb9) d7Var.d;
        int i = eb9Var.Y + 1;
        eb9Var.Y = i;
        if (i == ((Object[]) eb9Var.f0).length) {
            eb9Var.m();
        }
        ((Object[]) eb9Var.f0)[i] = e37Var;
        d7Var.i(q59VarG.X);
        if (d7Var.E() == 4) {
            d7.s(d7Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = q59VarG.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new nl7(vm3Var, q59VarG, d7Var, e37Var, this.l0);
        }
        return (this.h0 == q59VarG && vm3Var.a.c) ? this : new nl7(vm3Var, q59VarG, d7Var, e37Var, this.l0);
    }

    @Override // defpackage.hi5, defpackage.rd1
    public final int u(e37 e37Var) {
        e37Var.getClass();
        return sp3.b(e37Var, this.g0, s(), " at path ".concat(((eb9) this.i0.d).l()));
    }

    @Override // defpackage.hi5, defpackage.rd1
    public final long v() {
        return this.i0.j();
    }

    @Override // defpackage.hi5, defpackage.rd1
    public final boolean w() {
        boolean z;
        do3 do3Var = this.n0;
        if (!(do3Var != null ? do3Var.b : false)) {
            d7 d7Var = this.i0;
            int I = d7Var.I(d7Var.O());
            String str = (String) d7Var.g;
            int length = str.length() - I;
            if (length >= 4 && I != -1) {
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        if (length <= 4 || x97.g(str.charAt(I + 4)) != 0) {
                            d7Var.b = I + 4;
                            z = true;
                            break;
                        }
                    } else if ("null".charAt(i) == str.charAt(I + i)) {
                        i++;
                    }
                    z = false;
                    break;
                }
            } else {
                z = false;
                break;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tn3
    public final vm3 y() {
        return this.g0;
    }
}

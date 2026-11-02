package defpackage;

import java.util.ArrayList;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kr0 {
    public final /* synthetic */ byte a;
    public long b;
    public Object c;

    public kr0(ba0 ba0Var) {
        this.a = (byte) 1;
        this.c = ba0Var;
        this.b = _HeadersCommonKt.HEADER_LIMIT;
    }

    public static long e(kr0 kr0Var, long j, float f) {
        long jF = z85.f(kr0Var.b, j);
        kr0Var.b = jF;
        float fC = ((sd5) kr0Var.c) == null ? z85.c(jF) : Math.abs(kr0Var.g(jF));
        if (fC <= 0.0f || fC < f) {
            return 9205357640488583168L;
        }
        sd5 sd5Var = (sd5) kr0Var.c;
        long j2 = kr0Var.b;
        if (sd5Var == null) {
            float fC2 = z85.c(j2);
            return z85.e(kr0Var.b, z85.g(f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / fC2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / fC2)) & 4294967295L)));
        }
        float fG = kr0Var.g(j2) - (Math.signum(kr0Var.g(kr0Var.b)) * f);
        long j3 = kr0Var.b;
        sd5 sd5Var2 = (sd5) kr0Var.c;
        sd5 sd5Var3 = sd5.Y;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (sd5Var2 == sd5Var3 ? j3 & 4294967295L : j3 >> 32));
        if (((sd5) kr0Var.c) == sd5Var3) {
            return (((long) Float.floatToRawIntBits(fG)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fG)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
    }

    public void a(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        kr0 kr0Var = (kr0) this.c;
        if (kr0Var != null) {
            kr0Var.a(i - 64);
        }
    }

    public int b(int i) {
        kr0 kr0Var = (kr0) this.c;
        if (kr0Var == null) {
            long j = this.b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.b);
        }
        return Long.bitCount(this.b) + kr0Var.b(i - 64);
    }

    public void c() {
        if (((kr0) this.c) == null) {
            this.c = new kr0();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return ((1 << i) & this.b) != 0;
        }
        c();
        return ((kr0) this.c).d(i - 64);
    }

    public void f(int i, boolean z) {
        if (i >= 64) {
            c();
            ((kr0) this.c).f(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            k(i);
        } else {
            a(i);
        }
        if (z2 || ((kr0) this.c) != null) {
            c();
            ((kr0) this.c).f(0, z2);
        }
    }

    public float g(long j) {
        return Float.intBitsToFloat((int) (((sd5) this.c) == sd5.Y ? j >> 32 : j & 4294967295L));
    }

    public nz2 h() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String strV = ((ba0) this.c).V(this.b);
            this.b -= (long) strV.length();
            if (strV.length() == 0) {
                return new nz2((String[]) arrayList.toArray(new String[0]));
            }
            int iL0 = fm7.l0(strV, ':', 1, 4);
            if (iL0 != -1) {
                String strSubstring = strV.substring(0, iL0);
                String strSubstring2 = strV.substring(iL0 + 1);
                arrayList.add(strSubstring);
                arrayList.add(fm7.R0(strSubstring2).toString());
            } else if (strV.charAt(0) == ':') {
                String strSubstring3 = strV.substring(1);
                arrayList.add(_UrlKt.FRAGMENT_ENCODE_SET);
                arrayList.add(fm7.R0(strSubstring3).toString());
            } else {
                arrayList.add(_UrlKt.FRAGMENT_ENCODE_SET);
                arrayList.add(fm7.R0(strV).toString());
            }
        }
    }

    public boolean i(int i) {
        if (i >= 64) {
            c();
            return ((kr0) this.c).i(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        kr0 kr0Var = (kr0) this.c;
        if (kr0Var != null) {
            if (kr0Var.d(0)) {
                k(63);
            }
            ((kr0) this.c).i(0);
        }
        return z;
    }

    public void j() {
        this.b = 0L;
        kr0 kr0Var = (kr0) this.c;
        if (kr0Var != null) {
            kr0Var.j();
        }
    }

    public void k(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            c();
            ((kr0) this.c).k(i - 64);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((kr0) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((kr0) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kr0(sd5 sd5Var) {
        this(0L, sd5Var);
        this.a = (byte) 2;
    }

    public kr0() {
        this.a = (byte) 0;
        this.b = 0L;
    }

    public kr0(long j, sd5 sd5Var) {
        this.a = (byte) 2;
        this.c = sd5Var;
        this.b = j;
    }
}

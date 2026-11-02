package defpackage;

import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dw0 {
    public static final long b = z51.e(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final long a;

    static {
        z51.e(4282664004L);
        z51.e(4287137928L);
        z51.e(4291611852L);
        c = z51.e(4294967295L);
        d = z51.e(4294901760L);
        z51.e(4278255360L);
        e = z51.e(4278190335L);
        z51.e(4294967040L);
        z51.e(4278255615L);
        z51.e(4294902015L);
        f = z51.d(0);
        g = z51.c(0.0f, 0.0f, 0.0f, 0.0f, nw0.u);
    }

    public /* synthetic */ dw0(long j) {
        this.a = j;
    }

    public static final long a(long j, lw0 lw0Var) {
        l21 l21VarV;
        lw0 lw0VarE = e(j);
        int i = lw0VarE.c;
        int i2 = lw0Var.c;
        if ((i | i2) < 0) {
            l21VarV = zc1.v(lw0VarE, lw0Var);
        } else {
            vz4 vz4Var = m21.a;
            int i3 = i | (i2 << 6);
            Object objB = vz4Var.b(i3);
            if (objB == null) {
                objB = zc1.v(lw0VarE, lw0Var);
                vz4Var.h(i3, objB);
            }
            l21VarV = (l21) objB;
        }
        return l21VarV.a(j);
    }

    public static long b(float f2, long j) {
        return z51.c(g(j), f(j), d(j), f2, e(j));
    }

    public static final float c(long j) {
        float fE;
        float f2;
        if ((63 & j) == 0) {
            fE = (float) ln7.e((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fE = (float) ln7.e((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fE / f2;
    }

    public static final float d(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) ln7.e((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - me2.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final lw0 e(long j) {
        float[] fArr = nw0.a;
        return nw0.y[(int) (j & 63)];
    }

    public static final float f(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) ln7.e((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - me2.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float g(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) ln7.e((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - me2.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static String h(long j) {
        float fG = g(j);
        float f2 = f(j);
        float fD = d(j);
        float fC = c(j);
        String str = e(j).a;
        StringBuilder sbK = ie2.k("Color(", fG, ", ", f2, ", ");
        sbK.append(fD);
        sbK.append(", ");
        sbK.append(fC);
        sbK.append(", ");
        return oi0.p(sbK, str, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dw0) {
            return this.a == ((dw0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return h(this.a);
    }
}

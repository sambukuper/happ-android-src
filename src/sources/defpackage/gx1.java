package defpackage;

import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gx1 implements Comparable {
    public static final be Y = new be(27);
    public static final long Z = vj8.A(4611686018427387903L);
    public static final long f0 = vj8.A(-4611686018427387903L);
    public static final long g0 = 9223372036854759646L;
    public final long X;

    public /* synthetic */ gx1(long j) {
        this.X = j;
    }

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long jM = vj8.m(j, j3);
        if (-4611686018426L > jM || jM >= 4611686018427L) {
            return vj8.A(jM);
        }
        return vj8.B((jM * 1000000) + (j2 - (j3 * 1000000)));
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strU0 = fm7.u0(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strU0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strU0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strU0, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strU0, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return dh3.l(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final long d(long j) {
        return ((((int) j) & 1) != 1 || h(j)) ? j(j, lx1.MILLISECONDS) : j >> 1;
    }

    public static final int e(long j) {
        if (h(j)) {
            return 0;
        }
        return (int) (j(j, lx1.MINUTES) % 60);
    }

    public static final int f(long j) {
        if (h(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final int g(long j) {
        if (h(j)) {
            return 0;
        }
        return (int) (j(j, lx1.SECONDS) % 60);
    }

    public static final boolean h(long j) {
        return j == Z || j == f0;
    }

    public static final long i(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            return (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? vj8.A(j3 / 1000000) : vj8.B(j3);
        }
        long jM = vj8.m(j >> 1, j2 >> 1);
        if (jM == 9223372036854759646L) {
            bt.q("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (jM == 4611686018427387903L || jM == -4611686018427387903L) {
            return vj8.A(jM);
        }
        return (-4611686018426L > jM || jM >= 4611686018427L) ? vj8.A(x97.p(jM, -4611686018427387903L, 4611686018427387903L)) : vj8.B(jM * 1000000);
    }

    public static final long j(long j, lx1 lx1Var) {
        if (j == Z) {
            return Long.MAX_VALUE;
        }
        if (j == f0) {
            return Long.MIN_VALUE;
        }
        return lx1Var.X.convert(j >> 1, ((((int) j) & 1) == 0 ? lx1.NANOSECONDS : lx1.MILLISECONDS).X);
    }

    public static final long k(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = ix1.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.X, ((gx1) obj).X);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gx1) {
            return this.X == ((gx1) obj).X;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.X);
    }

    public final String toString() {
        long jK = this.X;
        if (jK == 0) {
            return "0s";
        }
        if (jK == Z) {
            return "Infinity";
        }
        if (jK == f0) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = jK < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (jK < 0) {
            jK = k(jK);
        }
        long j = j(jK, lx1.DAYS);
        int iJ = h(jK) ? 0 : (int) (j(jK, lx1.HOURS) % 24);
        int iE = e(jK);
        int iG = g(jK);
        int iF = f(jK);
        boolean z2 = j != 0;
        boolean z3 = iJ != 0;
        boolean z4 = iE != 0;
        boolean z5 = (iG == 0 && iF == 0) ? false : true;
        if (z2) {
            sb.append(j);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iJ);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iE);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iG != 0 || z2 || z3 || z4) {
                b(sb, iG, iF, 9, "s", false);
            } else if (iF >= 1000000) {
                b(sb, iF / 1000000, iF % 1000000, 6, "ms", false);
            } else if (iF >= 1000) {
                b(sb, iF / XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax, iF % XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax, 3, "us", false);
            } else {
                sb.append(iF);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}

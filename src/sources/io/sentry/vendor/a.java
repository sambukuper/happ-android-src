package io.sentry.vendor;

import defpackage.bt;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import okhttp3.internal.ws.RealWebSocket;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final byte[] a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static boolean a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static byte[] b(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        int i = (length / 3) * 4;
        int i2 = length % 3;
        if (i2 == 1) {
            i += 2;
        } else if (i2 == 2) {
            i += 3;
        }
        byte[] bArr3 = new byte[i];
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (true) {
            int i6 = i3 + 3;
            bArr2 = a;
            if (i6 > length) {
                break;
            }
            int i7 = (bArr[i3 + 2] & 255) | ((bArr[i3] & 255) << 16) | ((bArr[i3 + 1] & 255) << 8);
            bArr3[i4] = bArr2[(i7 >> 18) & 63];
            bArr3[i4 + 1] = bArr2[(i7 >> 12) & 63];
            bArr3[i4 + 2] = bArr2[(i7 >> 6) & 63];
            bArr3[i4 + 3] = bArr2[i7 & 63];
            int i8 = i4 + 4;
            i5--;
            if (i5 == 0) {
                i4 += 5;
                bArr3[i8] = 10;
                i5 = 19;
            } else {
                i4 = i8;
            }
            i3 = i6;
        }
        if (i3 == length - 1) {
            int i9 = (bArr[i3] & 255) << 4;
            bArr3[i4] = bArr2[(i9 >> 6) & 63];
            bArr3[i4 + 1] = bArr2[i9 & 63];
            return bArr3;
        }
        if (i3 == length - 2) {
            int i10 = ((bArr[i3 + 1] & 255) << 2) | ((bArr[i3] & 255) << 10);
            bArr3[i4] = bArr2[(i10 >> 12) & 63];
            bArr3[i4 + 1] = bArr2[(i10 >> 6) & 63];
            bArr3[i4 + 2] = bArr2[i10 & 63];
        }
        return bArr3;
    }

    public static long c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        long j = i - (i2 <= 2 ? 1 : 0);
        long jE = e(j, 400L);
        int i9 = (int) (j - (400 * jE));
        return (((((long) i6) * 1000) + ((((long) i5) * RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) + ((((long) i4) * 3600000) + ((((jE * 146097) + ((long) ((((i9 / 4) + (i9 * 365)) - (i9 / 100)) + ((((((i2 + (i2 > 2 ? -3 : 9)) * 153) + 2) / 5) + i3) - 1)))) - 719468) * 86400000)))) + ((long) i7)) - ((long) i8);
    }

    public static long d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(new SimpleTimeZone(i8, "GMT"));
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, i3);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, i7);
        return gregorianCalendar.getTimeInMillis();
    }

    public static long e(long j, long j2) {
        int i;
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (i = ((int) ((j ^ j2) >> 63)) | 1) < 0) ? j3 + ((long) i) : j3;
    }

    public static String f(long j) {
        if (j < -12219292800000L) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(new SimpleTimeZone(0, "UTC"));
            gregorianCalendar.setTimeInMillis(j);
            StringBuilder sb = new StringBuilder(24);
            g(sb, gregorianCalendar.get(1), 4);
            sb.append('-');
            g(sb, gregorianCalendar.get(2) + 1, 2);
            sb.append('-');
            g(sb, gregorianCalendar.get(5), 2);
            sb.append('T');
            g(sb, gregorianCalendar.get(11), 2);
            sb.append(':');
            g(sb, gregorianCalendar.get(12), 2);
            sb.append(':');
            g(sb, gregorianCalendar.get(13), 2);
            sb.append('.');
            g(sb, gregorianCalendar.get(14), 3);
            sb.append('Z');
            return sb.toString();
        }
        long jE = e(j, 86400000L);
        int iE = (int) (j - (e(j, 86400000L) * 86400000));
        long j2 = jE + 719468;
        long jE2 = e(j2, 146097L);
        int i = (int) (j2 - (146097 * jE2));
        int i2 = (((i / 36524) + (i - (i / 1460))) - (i / 146096)) / 365;
        int i3 = (int) ((jE2 * 400) + ((long) i2));
        int i4 = i - (((i2 / 4) + (i2 * 365)) - (i2 / 100));
        int i5 = ((i4 * 5) + 2) / 153;
        int i6 = (i4 - (((i5 * 153) + 2) / 5)) + 1;
        int i7 = i5 < 10 ? i5 + 3 : i5 - 9;
        int[] iArr = {i3 + (i7 <= 2 ? 1 : 0), i7, i6};
        int i8 = iE / 3600000;
        int i9 = iE - (3600000 * i8);
        int i10 = i9 / 60000;
        int i11 = i9 - (60000 * i10);
        int i12 = i11 / XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
        int i13 = i11 - (i12 * XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax);
        StringBuilder sb2 = new StringBuilder(24);
        g(sb2, iArr[0], 4);
        sb2.append('-');
        g(sb2, iArr[1], 2);
        sb2.append('-');
        g(sb2, iArr[2], 2);
        sb2.append('T');
        g(sb2, i8, 2);
        sb2.append(':');
        g(sb2, i10, 2);
        sb2.append(':');
        g(sb2, i12, 2);
        sb2.append('.');
        g(sb2, i13, 3);
        sb2.append('Z');
        return sb2.toString();
    }

    public static void g(StringBuilder sb, int i, int i2) {
        if (i < 0) {
            sb.append('-');
            g(sb, -i, i2);
            return;
        }
        String string = Integer.toString(i);
        for (int length = i2 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    public static int h(int i, int i2, String str) {
        if (i < 0 || i2 > str.length() || i >= i2) {
            throw new NumberFormatException(str);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt < '0' || cCharAt > '9') {
                throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
            }
            i3 = ((i3 * 10) + cCharAt) - 48;
        }
        return i3;
    }

    public static long i(String str) {
        int i;
        int iH;
        int i2;
        int i3;
        int iH2;
        int i4;
        boolean z;
        char cCharAt;
        int i5;
        int iH3;
        int i6;
        boolean z2;
        int length = str.length();
        int iH4 = h(0, 4, str);
        int i7 = a(str, 4, '-') ? 5 : 4;
        int i8 = i7 + 2;
        int iH5 = h(i7, i8, str);
        if (a(str, i8, '-')) {
            i8 = i7 + 3;
        }
        int i9 = i8 + 2;
        int iH6 = h(i8, i9, str);
        if (!a(str, i9, 'T')) {
            if (i9 == length) {
                return new GregorianCalendar(iH4, iH5 - 1, iH6).getTimeInMillis();
            }
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 != 'Z' && cCharAt2 != '+' && cCharAt2 != '-') {
                bt.q("Invalid date separator");
                return 0L;
            }
            char cCharAt3 = str.charAt(i9);
            if (cCharAt3 == 'Z') {
                i5 = i8 + 3;
                z2 = true;
                i6 = 0;
            } else {
                if (cCharAt3 != '+' && cCharAt3 != '-') {
                    bt.q("Invalid time zone indicator");
                    return 0L;
                }
                i2 = cCharAt3 == '+' ? 1 : -1;
                int i10 = i8 + 5;
                int iH7 = h(i8 + 3, i10, str);
                if (a(str, i10, ':')) {
                    i10 = i8 + 6;
                }
                int i11 = i10 + 2;
                if (length >= i11) {
                    iH3 = h(i10, i11, str);
                    i5 = i11;
                } else {
                    i5 = i10;
                    iH3 = 0;
                }
                if (iH7 < 0 || iH7 > 23 || iH3 < 0 || iH3 > 59) {
                    bt.q("Invalid time zone");
                    return 0L;
                }
                i6 = i2 * ((int) ((((long) iH3) * RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) + (((long) iH7) * 3600000)));
                z2 = false;
            }
            if (!z2 && i5 != length) {
                bt.q("Invalid trailing characters");
                return 0L;
            }
            if (iH4 < 1582 || (iH4 == 1582 && (iH5 < 10 || (iH5 == 10 && iH6 < 15)))) {
                return d(iH4, iH5, iH6, 0, 0, 0, 0, i6);
            }
            j(iH4, iH5, iH6);
            return c(iH4, iH5, iH6, 0, 0, 0, 0, i6);
        }
        j(iH4, iH5, iH6);
        int i12 = i8 + 5;
        int iH8 = h(i8 + 3, i12, str);
        if (a(str, i12, ':')) {
            i12 = i8 + 6;
        }
        int i13 = i12 + 2;
        int iH9 = h(i12, i13, str);
        if (a(str, i13, ':')) {
            i13 = i12 + 3;
        }
        if (length <= i13 || (cCharAt = str.charAt(i13)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
            i = 0;
            iH = 0;
        } else {
            int i14 = i13 + 2;
            iH = h(i13, i14, str);
            if (iH > 59 && iH < 63) {
                iH = 59;
            }
            if (a(str, i14, '.')) {
                int i15 = i13 + 3;
                int length2 = i15;
                while (true) {
                    if (length2 >= str.length()) {
                        length2 = str.length();
                        break;
                    }
                    char cCharAt4 = str.charAt(length2);
                    if (cCharAt4 < '0' || cCharAt4 > '9') {
                        break;
                    }
                    length2++;
                }
                if (length2 == i15) {
                    bt.q("Missing millisecond digits");
                    return 0L;
                }
                int iMin = Math.min(length2, i13 + 6);
                int iH10 = h(i15, iMin, str);
                int i16 = iMin - i15;
                if (i16 == 1) {
                    iH10 *= 100;
                } else if (i16 == 2) {
                    iH10 *= 10;
                }
                int i17 = length2;
                i = iH10;
                i13 = i17;
            } else {
                i13 = i14;
                i = 0;
            }
        }
        if (iH8 < 0 || iH8 > 23 || iH9 < 0 || iH9 > 59 || iH < 0 || iH > 59 || i < 0 || i > 999) {
            bt.q("Invalid time");
            return 0L;
        }
        if (length <= i13) {
            bt.q("No time zone indicator");
            return 0L;
        }
        char cCharAt5 = str.charAt(i13);
        if (cCharAt5 == 'Z') {
            i3 = i13 + 1;
            z = true;
            i4 = 0;
        } else {
            if (cCharAt5 != '+' && cCharAt5 != '-') {
                bt.q("Invalid time zone indicator");
                return 0L;
            }
            i2 = cCharAt5 == '+' ? 1 : -1;
            int i18 = i13 + 3;
            int iH11 = h(i13 + 1, i18, str);
            if (a(str, i18, ':')) {
                i18 = i13 + 4;
            }
            i3 = i18 + 2;
            if (length >= i3) {
                iH2 = h(i18, i3, str);
            } else {
                i3 = i18;
                iH2 = 0;
            }
            if (iH11 < 0 || iH11 > 23 || iH2 < 0 || iH2 > 59) {
                bt.q("Invalid time zone");
                return 0L;
            }
            i4 = i2 * ((int) ((((long) iH2) * RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) + (((long) iH11) * 3600000)));
            z = false;
        }
        if (z || i3 == length) {
            return (iH4 < 1582 || (iH4 == 1582 && (iH5 < 10 || (iH5 == 10 && iH6 < 15)))) ? d(iH4, iH5, iH6, iH8, iH9, iH, i, i4) : c(iH4, iH5, iH6, iH8, iH9, iH, i, i4);
        }
        bt.q("Invalid trailing characters");
        return 0L;
    }

    public static void j(int i, int i2, int i3) {
        int i4;
        if (i >= 1 && i2 >= 1 && i2 <= 12 && i3 >= 1) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                i4 = (i % 4 != 0 || (i % 100 == 0 && i % 400 != 0)) ? 28 : 29;
            }
            if (i3 <= i4) {
                return;
            }
        }
        bt.q("Invalid date");
    }
}

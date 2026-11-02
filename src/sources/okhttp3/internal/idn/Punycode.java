package okhttp3.internal.idn;

import defpackage.bt;
import defpackage.fm7;
import defpackage.i90;
import defpackage.if3;
import defpackage.kb0;
import defpackage.kp5;
import defpackage.mm7;
import defpackage.ra;
import defpackage.x97;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010&R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010&R\u0018\u0010/\u001a\u00020\u0006*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lokhttp3/internal/idn/Punycode;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", _UrlKt.FRAGMENT_ENCODE_SET, "string", _UrlKt.FRAGMENT_ENCODE_SET, "pos", "limit", "Li90;", "result", _UrlKt.FRAGMENT_ENCODE_SET, "encodeLabel", "(Ljava/lang/String;IILi90;)Z", "decodeLabel", "delta", "numpoints", "first", "adapt", "(IIZ)I", "requiresEncode", "(Ljava/lang/String;II)Z", _UrlKt.FRAGMENT_ENCODE_SET, "codePoints", "(Ljava/lang/String;II)Ljava/util/List;", "encode", "(Ljava/lang/String;)Ljava/lang/String;", "decode", "PREFIX_STRING", "Ljava/lang/String;", "getPREFIX_STRING", "()Ljava/lang/String;", "Lkb0;", "PREFIX", "Lkb0;", "getPREFIX", "()Lkb0;", "BASE", "I", "TMIN", "TMAX", "SKEW", "DAMP", "INITIAL_BIAS", "INITIAL_N", "getPunycodeDigit", "(I)I", "punycodeDigit", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Punycode {
    private static final int BASE = 36;
    private static final int DAMP = 700;
    private static final int INITIAL_BIAS = 72;
    private static final int INITIAL_N = 128;
    private static final kb0 PREFIX;
    private static final int SKEW = 38;
    private static final int TMAX = 26;
    private static final int TMIN = 1;
    public static final Punycode INSTANCE = new Punycode();
    private static final String PREFIX_STRING = "xn--";

    static {
        kb0 kb0Var = kb0.f0;
        PREFIX = ra.g("xn--");
    }

    private Punycode() {
    }

    private final int adapt(int delta, int numpoints, boolean first) {
        int i = first ? delta / DAMP : delta / 2;
        int i2 = (i / numpoints) + i;
        int i3 = 0;
        while (i2 > 455) {
            i2 /= 35;
            i3 += BASE;
        }
        return ((i2 * BASE) / (i2 + SKEW)) + i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [char] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    private final List<Integer> codePoints(String str, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        while (i < i2) {
            int iCharAt = str.charAt(i);
            if (55296 <= iCharAt && iCharAt < 57344) {
                int i3 = i + 1;
                char cCharAt = i3 < i2 ? str.charAt(i3) : (char) 0;
                if (Character.isLowSurrogate(iCharAt) || !Character.isLowSurrogate(cCharAt)) {
                    iCharAt = 63;
                } else {
                    iCharAt = DnsOverHttps.MAX_RESPONSE_SIZE + (((iCharAt & 1023) << 10) | (cCharAt & 1023));
                    i = i3;
                }
            }
            arrayList.add(Integer.valueOf(iCharAt));
            i++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean decodeLabel(String string, int pos, int limit, i90 result) {
        int i;
        int i2;
        int i3;
        int i4 = 1;
        if (!mm7.U(pos, 0, 4, string, PREFIX_STRING, true)) {
            result.c1(pos, limit, string);
            return true;
        }
        int i5 = pos + 4;
        ArrayList arrayList = new ArrayList();
        int iQ0 = fm7.q0(string, '-', limit, 4);
        char c = '0';
        char c2 = '[';
        char c3 = '{';
        if (iQ0 >= i5) {
            while (i5 < iQ0) {
                int i6 = i5 + 1;
                char cCharAt = string.charAt(i5);
                if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && (('0' > cCharAt || cCharAt >= ':') && cCharAt != '-'))) {
                    return false;
                }
                arrayList.add(Integer.valueOf(cCharAt));
                i5 = i6;
            }
            i5++;
        }
        int i7 = 128;
        int iAdapt = INITIAL_BIAS;
        int i8 = 0;
        while (i5 < limit) {
            int i9 = i4;
            if3 if3VarW = x97.W(x97.a0(BASE, Integer.MAX_VALUE), BASE);
            int i10 = if3VarW.X;
            int i11 = if3VarW.Y;
            int i12 = if3VarW.Z;
            if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                i = i8;
                int i13 = i9;
                while (i5 != limit) {
                    int i14 = i5 + 1;
                    char cCharAt2 = string.charAt(i5);
                    if ('a' <= cCharAt2 && cCharAt2 < c3) {
                        i2 = cCharAt2 - 'a';
                    } else if ('A' <= cCharAt2 && cCharAt2 < c2) {
                        i2 = cCharAt2 - 'A';
                    } else {
                        if (c > cCharAt2 || cCharAt2 >= ':') {
                            return false;
                        }
                        i2 = cCharAt2 - 22;
                    }
                    int i15 = i13;
                    int i16 = i2 * i15;
                    int i17 = i;
                    if (i17 > Integer.MAX_VALUE - i16) {
                        return false;
                    }
                    i = i17 + i16;
                    if (i10 <= iAdapt) {
                        i3 = i9;
                    } else {
                        i3 = i10 >= iAdapt + TMAX ? TMAX : i10 - iAdapt;
                    }
                    if (i2 >= i3) {
                        int i18 = 36 - i3;
                        if (i15 > Integer.MAX_VALUE / i18) {
                            return false;
                        }
                        i13 = i15 * i18;
                        if (i10 != i11) {
                            i10 += i12;
                            i5 = i14;
                            c = '0';
                            c2 = '[';
                            c3 = '{';
                        }
                    }
                    i5 = i14;
                }
                return false;
            }
            i = i8;
            iAdapt = adapt(i - i8, arrayList.size() + 1, i8 == 0 ? i9 : false);
            int size = i / (arrayList.size() + 1);
            if (i7 > Integer.MAX_VALUE - size) {
                return false;
            }
            i7 += size;
            int size2 = i % (arrayList.size() + 1);
            if (i7 > 1114111) {
                return false;
            }
            arrayList.add(size2, Integer.valueOf(i7));
            i8 = size2 + 1;
            i4 = i9;
            c = '0';
            c2 = '[';
            c3 = '{';
        }
        boolean z = i4;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            result.e1(((Number) it.next()).intValue());
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean encodeLabel(String string, int pos, int limit, i90 result) {
        int i;
        int i2;
        int i3;
        int i4 = 1;
        if (!requiresEncode(string, pos, limit)) {
            result.c1(pos, limit, string);
            return true;
        }
        result.C0(PREFIX);
        List<Integer> listCodePoints = codePoints(string, pos, limit);
        Iterator<Integer> it = listCodePoints.iterator();
        int i5 = 0;
        while (true) {
            i = 128;
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = it.next().intValue();
            if (iIntValue < 128) {
                result.H0(iIntValue);
                i5++;
            }
        }
        if (i5 > 0) {
            result.H0(45);
        }
        int iAdapt = INITIAL_BIAS;
        int i6 = 0;
        int i7 = i5;
        while (i7 < listCodePoints.size()) {
            Iterator<T> it2 = listCodePoints.iterator();
            if (!it2.hasNext()) {
                bt.n();
                return false;
            }
            Object next = it2.next();
            if (it2.hasNext()) {
                int iIntValue2 = ((Number) next).intValue();
                if (iIntValue2 < i) {
                    iIntValue2 = Integer.MAX_VALUE;
                }
                do {
                    Object next2 = it2.next();
                    int iIntValue3 = ((Number) next2).intValue();
                    if (iIntValue3 < i) {
                        iIntValue3 = Integer.MAX_VALUE;
                    }
                    if (iIntValue2 > iIntValue3) {
                        next = next2;
                        iIntValue2 = iIntValue3;
                    }
                } while (it2.hasNext());
            }
            int iIntValue4 = ((Number) next).intValue();
            int i8 = (i7 + 1) * (iIntValue4 - i);
            if (i6 <= Integer.MAX_VALUE - i8) {
                int i9 = i6 + i8;
                Iterator<Integer> it3 = listCodePoints.iterator();
                while (it3.hasNext()) {
                    int iIntValue5 = it3.next().intValue();
                    if (iIntValue5 < iIntValue4) {
                        if (i9 != Integer.MAX_VALUE) {
                            i9++;
                        }
                    } else if (iIntValue5 == iIntValue4) {
                        if3 if3VarW = x97.W(x97.a0(BASE, Integer.MAX_VALUE), BASE);
                        int i10 = if3VarW.X;
                        int i11 = if3VarW.Y;
                        int i12 = if3VarW.Z;
                        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                            i3 = i9;
                            while (true) {
                                if (i10 <= iAdapt) {
                                    i2 = i4;
                                } else {
                                    i2 = i4;
                                    i4 = i10 >= iAdapt + TMAX ? TMAX : i10 - iAdapt;
                                }
                                if (i3 < i4) {
                                    break;
                                }
                                int i13 = i3 - i4;
                                int i14 = 36 - i4;
                                result.H0(getPunycodeDigit((i13 % i14) + i4));
                                i3 = i13 / i14;
                                if (i10 == i11) {
                                    break;
                                }
                                i10 += i12;
                                i4 = i2;
                            }
                        } else {
                            i2 = i4;
                            i3 = i9;
                        }
                        result.H0(getPunycodeDigit(i3));
                        int i15 = i7 + 1;
                        iAdapt = adapt(i9, i15, i7 == i5 ? i2 : false);
                        i7 = i15;
                        i9 = 0;
                        i4 = i2;
                    }
                }
                i6 = i9 + 1;
                i = iIntValue4 + 1;
            }
            return false;
        }
        return i4;
    }

    private final int getPunycodeDigit(int i) {
        if (i < TMAX) {
            return i + 97;
        }
        if (i < BASE) {
            return i + 22;
        }
        kp5.g(i, "unexpected digit: ");
        return 0;
    }

    private final boolean requiresEncode(String str, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) >= 128) {
                return true;
            }
            i++;
        }
        return false;
    }

    public final String decode(String string) {
        int iL0;
        string.getClass();
        int length = string.length();
        i90 i90Var = new i90();
        for (int i = 0; i < length; i = iL0 + 1) {
            iL0 = fm7.l0(string, '.', i, 4);
            if (iL0 == -1) {
                iL0 = length;
            }
            if (!decodeLabel(string, i, iL0, i90Var)) {
                return null;
            }
            if (iL0 >= length) {
                break;
            }
            i90Var.H0(46);
        }
        return i90Var.Y();
    }

    public final String encode(String string) {
        int iL0;
        string.getClass();
        int length = string.length();
        i90 i90Var = new i90();
        for (int i = 0; i < length; i = iL0 + 1) {
            iL0 = fm7.l0(string, '.', i, 4);
            if (iL0 == -1) {
                iL0 = length;
            }
            if (!encodeLabel(string, i, iL0, i90Var)) {
                return null;
            }
            if (iL0 >= length) {
                break;
            }
            i90Var.H0(46);
        }
        return i90Var.Y();
    }

    public final kb0 getPREFIX() {
        return PREFIX;
    }

    public final String getPREFIX_STRING() {
        return PREFIX_STRING;
    }
}

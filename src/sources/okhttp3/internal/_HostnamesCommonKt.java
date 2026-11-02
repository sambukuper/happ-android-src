package okhttp3.internal;

import defpackage.bt;
import defpackage.dh3;
import defpackage.eu;
import defpackage.fm7;
import defpackage.i90;
import defpackage.kc6;
import defpackage.mm7;
import defpackage.p61;
import defpackage.x97;
import java.io.EOFException;
import java.util.Arrays;
import kotlin.Metadata;
import okhttp3.internal.idn.IdnaMappingTableInstanceKt;
import okhttp3.internal.idn.Punycode;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0017\u0010\u0012\u001a\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001b\u0010\u0019\"\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "canParseAsIpAddress", "(Ljava/lang/String;)Z", "containsInvalidLabelLengths", "containsInvalidHostnameAsciiCodes", "input", _UrlKt.FRAGMENT_ENCODE_SET, "pos", "limit", _UrlKt.FRAGMENT_ENCODE_SET, "decodeIpv6", "(Ljava/lang/String;II)[B", "address", "addressOffset", "decodeIpv4Suffix", "(Ljava/lang/String;II[BI)Z", "inet6AddressToAscii", "([B)Ljava/lang/String;", "canonicalizeInetAddress", "([B)[B", "isMappedIpv4Address", "([B)Z", "inet4AddressToAscii", "toCanonicalHost", "(Ljava/lang/String;)Ljava/lang/String;", MetaParams.HOST, "idnToAscii", "Lkc6;", "VERIFY_AS_IP_ADDRESS", "Lkc6;", "okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class _HostnamesCommonKt {
    private static final kc6 VERIFY_AS_IP_ADDRESS = new kc6("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static final boolean canParseAsIpAddress(String str) {
        str.getClass();
        return VERIFY_AS_IP_ADDRESS.d(str);
    }

    public static final byte[] canonicalizeInetAddress(byte[] bArr) {
        bArr.getClass();
        return isMappedIpv4Address(bArr) ? eu.F0(bArr, x97.a0(12, 16)) : bArr;
    }

    public static final boolean containsInvalidHostnameAsciiCodes(String str) {
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (dh3.k(cCharAt, 31) <= 0 || dh3.k(cCharAt, 127) >= 0 || fm7.l0(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean containsInvalidLabelLengths(String str) {
        str.getClass();
        int length = str.length();
        if (1 <= length && length < 254) {
            int i = 0;
            while (true) {
                int iL0 = fm7.l0(str, '.', i, 4);
                int length2 = iL0 == -1 ? str.length() - i : iL0 - i;
                if (1 <= length2 && length2 < 64) {
                    if (iL0 == -1 || iL0 == str.length() - 1) {
                        break;
                    }
                    i = iL0 + 1;
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean decodeIpv4Suffix(String str, int i, int i2, byte[] bArr, int i3) {
        str.getClass();
        bArr.getClass();
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char cCharAt = str.charAt(i5);
                if (dh3.k(cCharAt, 48) < 0 || dh3.k(cCharAt, 57) > 0) {
                    break;
                }
                if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i5++;
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a A[LOOP:1: B:28:0x004e->B:31:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x0060 A[EDGE_INSN: B:52:0x0060->B:32:0x0060 BREAK  A[LOOP:1: B:28:0x004e->B:31:0x005a], SYNTHETIC] */
    public static final byte[] decodeIpv6(String str, int i, int i2) {
        int i3;
        int i4;
        int hexDigit;
        str.getClass();
        byte[] bArr = new byte[16];
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (i < i2) {
            if (i5 == 16) {
                return null;
            }
            int i8 = i + 2;
            if (i8 <= i2 && mm7.Y(str, "::", i, false)) {
                if (i6 != -1) {
                    return null;
                }
                i5 += 2;
                i6 = i5;
                if (i8 == i2) {
                    break;
                }
                i7 = i8;
                i3 = 0;
                i = i7;
                while (i < i2) {
                    hexDigit = _UtilCommonKt.parseHexDigit(str.charAt(i));
                    if (hexDigit != -1) {
                        break;
                        break;
                    }
                    i3 = (i3 << 4) + hexDigit;
                    i++;
                }
                i4 = i - i7;
                return i4 == 0 ? null : null;
            }
            if (i5 != 0) {
                if (!mm7.Y(str, ":", i, false)) {
                    if (!mm7.Y(str, ".", i, false) || !decodeIpv4Suffix(str, i7, i2, bArr, i5 - 2)) {
                        return null;
                    }
                    i5 += 2;
                    break;
                }
                i++;
            }
            i7 = i;
            i3 = 0;
            i = i7;
            while (i < i2) {
                hexDigit = _UtilCommonKt.parseHexDigit(str.charAt(i));
                if (hexDigit != -1) {
                    break;
                }
                i3 = (i3 << 4) + hexDigit;
                i++;
            }
            i4 = i - i7;
            if (i4 == 0 && i4 <= 4) {
                int i9 = i5 + 1;
                bArr[i5] = (byte) ((i3 >>> 8) & 255);
                i5 += 2;
                bArr[i9] = (byte) (i3 & 255);
            }
        }
        if (i5 != 16) {
            if (i6 == -1) {
                return null;
            }
            eu.d0(16 - (i5 - i6), i6, i5, bArr, bArr);
            Arrays.fill(bArr, i6, (16 - i5) + i6, (byte) 0);
        }
        return bArr;
    }

    public static final String idnToAscii(String str) throws EOFException {
        str.getClass();
        i90 i90Var = new i90();
        i90Var.d1(str);
        i90 i90Var2 = new i90();
        while (!i90Var.F()) {
            if (!IdnaMappingTableInstanceKt.getIDNA_MAPPING_TABLE().map(i90Var.a0(), i90Var2)) {
                return null;
            }
        }
        i90Var.d1(_NormalizeJvmKt.normalizeNfc(i90Var2.Y()));
        Punycode punycode = Punycode.INSTANCE;
        String strDecode = punycode.decode(i90Var.Y());
        if (strDecode != null && strDecode.equals(_NormalizeJvmKt.normalizeNfc(strDecode))) {
            return punycode.encode(strDecode);
        }
        return null;
    }

    public static final String inet4AddressToAscii(byte[] bArr) {
        bArr.getClass();
        if (bArr.length != 4) {
            bt.q("Failed requirement.");
            return null;
        }
        i90 i90Var = new i90();
        i90Var.J0(_UtilCommonKt.and(bArr[0], 255));
        i90Var.H0(46);
        i90Var.J0(_UtilCommonKt.and(bArr[1], 255));
        i90Var.H0(46);
        i90Var.J0(_UtilCommonKt.and(bArr[2], 255));
        i90Var.H0(46);
        i90Var.J0(_UtilCommonKt.and(bArr[3], 255));
        return i90Var.Y();
    }

    public static final String inet6AddressToAscii(byte[] bArr) {
        bArr.getClass();
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        i90 i90Var = new i90();
        while (i2 < bArr.length) {
            if (i2 == i) {
                i90Var.H0(58);
                i2 += i4;
                if (i2 == 16) {
                    i90Var.H0(58);
                }
            } else {
                if (i2 > 0) {
                    i90Var.H0(58);
                }
                i90Var.V0((_UtilCommonKt.and(bArr[i2], 255) << 8) | _UtilCommonKt.and(bArr[i2 + 1], 255));
                i2 += 2;
            }
        }
        return i90Var.Y();
    }

    private static final boolean isMappedIpv4Address(byte[] bArr) {
        if (bArr.length != 16) {
            return false;
        }
        for (int i = 0; i < 10; i++) {
            if (bArr[i] != 0) {
                return false;
            }
        }
        return bArr[10] == -1 && bArr[11] == -1;
    }

    public static final String toCanonicalHost(String str) {
        str.getClass();
        if (fm7.d0(str, ":", false)) {
            byte[] bArrDecodeIpv6 = (mm7.Z(str, false, "[") && mm7.R(str, false, "]")) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
            if (bArrDecodeIpv6 != null) {
                byte[] bArrCanonicalizeInetAddress = canonicalizeInetAddress(bArrDecodeIpv6);
                if (bArrCanonicalizeInetAddress.length == 16) {
                    return inet6AddressToAscii(bArrCanonicalizeInetAddress);
                }
                if (bArrCanonicalizeInetAddress.length == 4) {
                    return inet4AddressToAscii(bArrCanonicalizeInetAddress);
                }
                bt.g(p61.l('\'', "Invalid IPv6 address: '", str));
                return null;
            }
        } else {
            String strIdnToAscii = idnToAscii(str);
            if (strIdnToAscii != null && strIdnToAscii.length() != 0 && !containsInvalidHostnameAsciiCodes(strIdnToAscii) && !containsInvalidLabelLengths(strIdnToAscii)) {
                return strIdnToAscii;
            }
        }
        return null;
    }
}

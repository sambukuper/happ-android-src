package defpackage;

import java.io.IOException;
import java.util.Arrays;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cr3 {
    public static final char[] a = fq0.a(true);
    public static final cr3 b = new cr3();

    public static char[] a(String str) {
        int length = str.length();
        char[] cArrG = new char[Math.min(Math.max(16, Math.min((length >> 3) + 6, XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax) + length), 32000)];
        int[] iArr = fq0.f;
        int length2 = iArr.length;
        int i = 0;
        int i2 = 0;
        b38 b38Var = null;
        char[] cArr = null;
        loop0: while (i < length) {
            while (true) {
                char cCharAt = str.charAt(i);
                if (cCharAt >= length2 || iArr[cCharAt] == 0) {
                    if (i2 >= cArrG.length) {
                        if (b38Var == null) {
                            b38Var = new b38(null);
                            b38Var.f = cArrG;
                            b38Var.g = cArrG.length;
                            b38Var.b = -1;
                        }
                        try {
                            cArrG = b38Var.g();
                            i2 = 0;
                        } catch (IOException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    int i3 = i2 + 1;
                    cArrG[i2] = cCharAt;
                    i++;
                    if (i >= length) {
                        i2 = i3;
                        break loop0;
                    }
                    i2 = i3;
                }
            }
            int i4 = 2;
            if (cArr == null) {
                cArr = new char[]{'\\', 0, '0', '0', 0, 0};
            }
            int i5 = i + 1;
            char cCharAt2 = str.charAt(i);
            int i6 = iArr[cCharAt2];
            if (i6 < 0) {
                cArr[1] = 'u';
                char[] cArr2 = a;
                cArr[4] = cArr2[cCharAt2 >> 4];
                cArr[5] = cArr2[cCharAt2 & 15];
                i4 = 6;
            } else {
                cArr[1] = (char) i6;
            }
            int i7 = i2 + i4;
            if (i7 > cArrG.length) {
                int length3 = cArrG.length - i2;
                if (length3 > 0) {
                    System.arraycopy(cArr, 0, cArrG, i2, length3);
                }
                if (b38Var == null) {
                    b38Var = new b38(null);
                    b38Var.f = cArrG;
                    b38Var.g = cArrG.length;
                    b38Var.b = -1;
                }
                try {
                    cArrG = b38Var.g();
                    int i8 = i4 - length3;
                    System.arraycopy(cArr, length3, cArrG, 0, i8);
                    i2 = i8;
                } catch (IOException e2) {
                    throw new IllegalStateException(e2);
                }
            } else {
                System.arraycopy(cArr, 0, cArrG, i2, i4);
                i2 = i7;
            }
            i = i5;
        }
        if (b38Var == null) {
            return Arrays.copyOfRange(cArrG, 0, i2);
        }
        b38Var.g = i2;
        try {
            return b38Var.d();
        } catch (IOException e3) {
            throw new IllegalStateException(e3);
        }
    }
}

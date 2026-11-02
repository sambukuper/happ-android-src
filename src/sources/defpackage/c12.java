package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.PSKKeyManager;
import org.conscrypt.metrics.ConscryptStatsLog;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.enums.EDeeplinkType;
import su.happ.proxyutility.util.ErrorCodeJNIWrapper;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c12 {
    public static final ArrayList a = new ArrayList();

    static {
        ErrorCodeJNIWrapper errorCodeJNIWrapper = new ErrorCodeJNIWrapper();
        List listL = i21.L(9, 154, 48, 25, 251, 45, 12, 169, 250, 198, 161, 304, 399, 207, 75, 193, 118, 391, 59, 270, 164, 353, 314, 65, 137, 26, Integer.valueOf(HttpStatusCodesKt.HTTP_EARLY_HINTS), 262, 56, 145, 372, 144, 247, 160, 392, 366, 365, 347, 129, 257, 381, 306, 238, 68, 341, 4, 316, 223, 271, 79, 348, 340, 167, 310, 5, Integer.valueOf(ConscryptStatsLog.TLS_HANDSHAKE_REPORTED), 201, 245, 202, 155, 375, 260, 237, 114, 20, 286, 339, 206, 117, 93, 226, 385, 324, 344, 398, 276, 219, 354, 278, 195, 29, 31, 349, 370, 280, 192, 39, 53, 227, 97);
        ArrayList arrayList = new ArrayList(xv0.Z(listL, 10));
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            arrayList.add(errorCodeJNIWrapper.a(((Number) it.next()).intValue()));
        }
        List listL2 = i21.L(224, 17, 240, 122, 139, 252, 179, 89, 132, 246, 328, 190, 309, 177, 81, 225, 182, 163, 232, 327, 77, 166, 143, 37, 66, 100, 94, 338, Integer.valueOf(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS), 203, 299, 73, 21, 47, 287, 220, 217, 54, 394, 321, 281, 335, 303, 333, 373, 351, 231, 293, 336, 229, 236, 390, 49, 377, 208, 360, 185, 374, 162, 110, 76, 311, 187, 51, 120, 71, 305, 298, 52, 152, 274, 290, 253, 42, 330, 342, 389, 214, 243, 19, 131, 18, 258, 87, 36, 382, 128, 337, 174, Integer.valueOf(ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_GCM_SHA256));
        ArrayList arrayList2 = new ArrayList(xv0.Z(listL2, 10));
        Iterator it2 = listL2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(errorCodeJNIWrapper.a(((Number) it2.next()).intValue()));
        }
        List listL3 = i21.L(98, 191, 23, 113, 61, 109, 146, 234, 248, 2, 22, 205, 107, 173, 176, 357, 279, 288, 43, 41, 397, 88, 386, 104, 60, 74, Integer.valueOf(ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA), 264, 363, 315, 72, 70, 325, 55, Integer.valueOf(HttpStatusCodesKt.HTTP_TEMP_REDIRECT), 16, 15, 196, 62, 63, 235, 384, 259, 213, 388, 115, 3, 165, 266, 322, 13, 378, Integer.valueOf(WebSocketProtocol.PAYLOAD_SHORT), 171, 228, 159, 124, 320, 197, 345, 125, 186, 319, 396, 121, 356, 119, 275, 295, 95, 249, 112, 222, 331, 133, 24, 135, 277, 209, 69, 82, 395, Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES), 361, 267, 393, 96, 380, 241, 7);
        ArrayList arrayList3 = new ArrayList(xv0.Z(listL3, 10));
        Iterator it3 = listL3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(errorCodeJNIWrapper.a(((Number) it3.next()).intValue()));
        }
        for (int i = 0; i < 90; i++) {
            a.add(b((String) arrayList.get(i), (String) arrayList2.get(i), (String) arrayList3.get(i)));
        }
    }

    public static void a(int i, int i2) {
        int i3;
        String str;
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i4 = 0;
        options.inScaled = false;
        HappApplication happApplication = HappApplication.M0;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(k32.i().getResources(), i2, options);
        ArrayList arrayList = a;
        Object obj = arrayList.get(i);
        bitmapDecodeResource.getClass();
        int width = bitmapDecodeResource.getWidth();
        int height = bitmapDecodeResource.getHeight();
        StringBuffer stringBuffer = new StringBuffer();
        kt ktVar = new kt();
        int i5 = 0;
        int i6 = 0;
        loop0: while (true) {
            i3 = 2;
            if (i5 >= width) {
                break;
            }
            int i7 = 0;
            while (i7 < height) {
                if (i6 == 45) {
                    break loop0;
                }
                int pixel = bitmapDecodeResource.getPixel(i5, i7);
                ktVar.addLast(Integer.valueOf(pixel & 3));
                ktVar.addLast(Integer.valueOf((pixel & 768) >> 8));
                if (ktVar.Z >= 4) {
                    stringBuffer.append((char) ((((Number) ktVar.removeFirst()).intValue() << 6) | (((Number) ktVar.removeFirst()).intValue() << 4) | (((Number) ktVar.removeFirst()).intValue() << 2) | ((Number) ktVar.removeFirst()).intValue()));
                    i6++;
                }
                i7++;
                i6 += 2;
            }
            i5++;
        }
        if (new String(stringBuffer).equals("!encoded!")) {
            StringBuffer stringBuffer2 = new StringBuffer();
            kt ktVar2 = new kt();
            int i8 = 0;
            int i9 = 0;
            loop2: while (i8 < width) {
                for (int i10 = i4; i10 < height; i10++) {
                    if (i9 < 18) {
                        i9++;
                    } else {
                        int pixel2 = bitmapDecodeResource.getPixel(i8, i10);
                        ktVar2.addLast(Integer.valueOf(pixel2 & 3));
                        ktVar2.addLast(Integer.valueOf((pixel2 & 768) >> 8));
                        if (ktVar2.Z < 4) {
                            continue;
                        } else {
                            char cIntValue = (char) ((((Number) ktVar2.removeFirst()).intValue() << 6) | (((Number) ktVar2.removeFirst()).intValue() << 4) | (((Number) ktVar2.removeFirst()).intValue() << 2) | ((Number) ktVar2.removeFirst()).intValue());
                            if (cIntValue == '!') {
                                break loop2;
                            } else {
                                stringBuffer2.append(cIntValue);
                            }
                        }
                    }
                }
                i8++;
                i4 = 0;
            }
            int i11 = Integer.parseInt(new String(stringBuffer2));
            StringBuffer stringBuffer3 = new StringBuffer();
            kt ktVar3 = new kt();
            int i12 = 0;
            int i13 = 0;
            loop4: for (int i14 = 0; i14 < width; i14++) {
                int i15 = 0;
                while (i15 < height) {
                    int i16 = i3;
                    if (i12 < ((String.valueOf(i11).length() + 1) * 2) + 18) {
                        i12++;
                    } else {
                        int i17 = i13 + 1;
                        if (i13 == i16 * i11) {
                            break loop4;
                        }
                        int pixel3 = bitmapDecodeResource.getPixel(i14, i15);
                        ktVar3.addLast(Integer.valueOf(pixel3 & 3));
                        ktVar3.addLast(Integer.valueOf((pixel3 & 768) >> 8));
                        if (ktVar3.Z >= 4) {
                            stringBuffer3.append((char) ((((Number) ktVar3.removeFirst()).intValue() << 6) | (((Number) ktVar3.removeFirst()).intValue() << 4) | (((Number) ktVar3.removeFirst()).intValue() << 2) | ((Number) ktVar3.removeFirst()).intValue()));
                        }
                        i13 = i17;
                    }
                    i15++;
                    i3 = i16;
                }
            }
            str = new String(stringBuffer3);
        } else {
            str = null;
        }
        str.getClass();
        arrayList.set(i, obj + str);
    }

    public static String b(String str, String str2, String str3) {
        Object rj6Var;
        str.getClass();
        str2.getClass();
        str3.getClass();
        try {
            Charset charset = iq0.a;
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            byte[] bArrDecode = Base64.decode(bytes, 0);
            byte[] bytes2 = str2.getBytes(charset);
            bytes2.getClass();
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes2, 0, bytes2.length, "AES");
            byte[] bytes3 = "kkkkkkkkkkkk".getBytes(charset);
            bytes3.getClass();
            byte[] bytes4 = str3.getBytes(charset);
            bytes4.getClass();
            byte[] bArrDecode2 = Base64.decode(bytes4, 0);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeySpec, new GCMParameterSpec(128, bytes3));
            bArrDecode.getClass();
            bArrDecode2.getClass();
            byte[] bArrDoFinal = cipher.doFinal(eu.B0(bArrDecode, bArrDecode2));
            bArrDoFinal.getClass();
            rj6Var = new String(bArrDoFinal, charset);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (rj6Var instanceof rj6) {
            rj6Var = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return (String) rj6Var;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [byte[], java.io.Serializable] */
    public static Serializable c(String str, byte[] bArr) {
        try {
            String str2 = new ErrorCodeJNIWrapper().a(35) + "|fRC77gcp0,";
            Charset charset = iq0.a;
            byte[] bytes = str2.getBytes(charset);
            bytes.getClass();
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, 0, bytes.length, "AES");
            byte[] bytes2 = new ErrorCodeJNIWrapper().a(1059).getBytes(charset);
            bytes2.getClass();
            byte[] bytes3 = str.getBytes(charset);
            bytes3.getClass();
            byte[] bArrDecode = Base64.decode(bytes3, 0);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeySpec, new GCMParameterSpec(128, bytes2));
            bArrDecode.getClass();
            return cipher.doFinal(eu.B0(bArr, bArrDecode));
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            return new rj6(th);
        }
    }

    public static boolean d(String str) {
        str.getClass();
        EDeeplinkType eDeeplinkTypeB = ae1.b(str);
        return eDeeplinkTypeB == EDeeplinkType.CRYPTO || eDeeplinkTypeB == EDeeplinkType.CRYPTO2 || eDeeplinkTypeB == EDeeplinkType.CRYPTO3 || eDeeplinkTypeB == EDeeplinkType.CRYPTO4 || eDeeplinkTypeB == EDeeplinkType.CRYPTO5;
    }

    public static void e() {
        ArrayList arrayList = a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String string = UUID.randomUUID().toString();
            string.getClass();
            arrayList.set(i, string);
        }
    }
}

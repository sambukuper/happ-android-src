package defpackage;

import android.content.ClipboardManager;
import android.os.Build;
import androidx.cardview.widget.CardView;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.ServerAffiliationInfo;
import su.happ.proxyutility.dto.ServerCache;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zc1 {
    public static final xd6 c;
    public static final xd6 d;
    public static final xd6 e;
    public static final xd6 f;
    public static final xd6 g;
    public static final zy0 a = new zy0(1711338385, false, new dx0(13));
    public static final dw4 b = new dw4((byte) 9);
    public static final int[] h = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    static {
        byte b2 = 6;
        c = new xd6(new ew6((byte) 2), new dw6((byte) 23), b2);
        d = new xd6(new ew6((byte) 3), new dw6((byte) 24), b2);
        e = new xd6(new ew6((byte) 4), new dw6((byte) 25), b2);
        f = new xd6(new ew6((byte) 5), new dw6((byte) 26), b2);
        g = new xd6(new ew6(b2), new dw6((byte) 27), b2);
    }

    public static final float A(long j, s86 s86Var) {
        float f2 = s86Var.d;
        float f3 = s86Var.c;
        if (t(j, s86Var)) {
            return 0.0f;
        }
        float fD = z85.d(z85.e(s86Var.f(), j));
        if (fD >= Float.MAX_VALUE) {
            fD = Float.MAX_VALUE;
        }
        float fD2 = z85.d(z85.e((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(s86Var.b)) & 4294967295L), j));
        if (fD2 < fD) {
            fD = fD2;
        }
        float fD3 = z85.d(z85.e((((long) Float.floatToRawIntBits(s86Var.a)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), j));
        if (fD3 < fD) {
            fD = fD3;
        }
        float fD4 = z85.d(z85.e((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32), j));
        return fD4 < fD ? fD4 : fD;
    }

    public static void B(int i, int i2, byte[] bArr, int[] iArr) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        D((i4 << 26) | i3, i2, bArr);
        D((i4 >>> 6) | (i5 << 20), i2 + 4, bArr);
        D((i5 >>> 12) | (i6 << 13), i2 + 8, bArr);
        D((i7 << 7) | (i6 >>> 19), i2 + 12, bArr);
    }

    public static void C(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        iArr2[i2] = (i4 << 26) | i3;
        iArr2[i2 + 1] = (i4 >>> 6) | (i5 << 20);
        iArr2[i2 + 2] = (i5 >>> 12) | (i6 << 13);
        iArr2[i2 + 3] = (i7 << 7) | (i6 >>> 19);
    }

    public static void D(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static final n22 E(Enum[] enumArr) {
        enumArr.getClass();
        return new n22(enumArr);
    }

    public static boolean F(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final Method G(mv3 mv3Var, String str) {
        str.getClass();
        if (!(mv3Var instanceof fs0)) {
            return null;
        }
        String strM0 = fm7.M0('(', str);
        if (strM0.equals("<init>")) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + mv3Var + '/' + str);
        }
        Method[] declaredMethods = ((fs0) mv3Var).t().getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (dh3.f(method.getName(), strM0)) {
                StringBuilder sb = new StringBuilder();
                sb.append(method.getName());
                sb.append("(");
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                for (Class<?> cls : parameterTypes) {
                    cls.getClass();
                    n(sb, cls);
                }
                sb.append(")");
                Class<?> returnType = method.getReturnType();
                returnType.getClass();
                n(sb, returnType);
                if (sb.toString().equals(str)) {
                    return method;
                }
            }
        }
        return null;
    }

    public static final xe2 H(xe2 xe2Var, s61 s61Var) {
        if (s61Var.H0(oy1.E0) != null) {
            xw3.z(s61Var, "Flow context cannot contain job in it. Had ");
            return null;
        }
        if (s61Var.equals(b02.X)) {
            return xe2Var;
        }
        return xe2Var instanceof wo2 ? wo2.c((wo2) xe2Var, s61Var, 0, null, 6) : new np0(xe2Var, s61Var, 0, null, 12);
    }

    public static final kx4 I(kx4 kx4Var, oh2 oh2Var) {
        return kx4Var.y(new ph2(oh2Var));
    }

    public static ov2 J(SSLSession sSLSession) throws IOException {
        List listJ;
        List listJ2 = d02.X;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            bt.i("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            u52.s("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        wr0 wr0VarH = wr0.b.h(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            bt.i("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            u52.s("tlsVersion == NONE");
            return null;
        }
        db8 db8VarC = d28.c(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            listJ = peerCertificates != null ? ks8.j(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listJ2;
        } catch (SSLPeerUnverifiedException unused) {
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listJ2 = ks8.j(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new ov2(db8VarC, wr0VarH, listJ2, new hg(listJ, (byte) 3));
    }

    public static final zu3 K(Annotation annotation) {
        annotation.getClass();
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        clsAnnotationType.getClass();
        return yb6.a.b(clsAnnotationType);
    }

    public static final String L(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final Class M(zu3 zu3Var) {
        zu3Var.getClass();
        Class clsT = ((fs0) zu3Var).t();
        clsT.getClass();
        return clsT;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class N(zu3 zu3Var) {
        zu3Var.getClass();
        Class clsT = ((fs0) zu3Var).t();
        if (clsT.isPrimitive()) {
            String name = clsT.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsT;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class O(zu3 zu3Var) {
        zu3Var.getClass();
        Class clsT = ((fs0) zu3Var).t();
        if (clsT.isPrimitive()) {
            return clsT;
        }
        String name = clsT.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final ClipboardManager P(iu0 iu0Var) {
        if (iu0Var instanceof kb) {
            return ((kb) iu0Var).a.v();
        }
        em7.c(oi0.l("Extracting native reference is only supported from androidx.compose.ui.platform.AndroidClipboard instances but received ", yb6.a.b(iu0Var.getClass()).p()));
        return null;
    }

    public static final ow3 Q(ow3 ow3Var) {
        ow3Var.getClass();
        return ow3Var.d().c() ? ow3Var : new l75(ow3Var);
    }

    public static void R(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[8];
        u(0, 0, iArr, iArr3);
        d0(iArr3);
        C(0, 0, iArr3, iArr4);
        C(5, 4, iArr3, iArr4);
        mb6.O(h, iArr4, iArr4);
        y(0, 0, iArr4, iArr2);
        y(4, 5, iArr4, iArr2);
        iArr2[9] = iArr2[9] & 16777215;
    }

    public static final float[] S(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static boolean T() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static final boolean U(Constructor constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        parameterTypes.getClass();
        for (Class<?> cls : parameterTypes) {
            if (cls.getName().equals(nu3.a.a.a)) {
                return true;
            }
        }
        return false;
    }

    public static int V(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            i |= iArr[i2];
        }
        return ((i - 1) & (~i)) >> 31;
    }

    public static final w1 W(Object[] objArr) {
        objArr.getClass();
        return new w1(objArr);
    }

    public static tb6 X(ld0 ld0Var, dn2 dn2Var) {
        if (dn2Var != null) {
            return new tb6(ld0Var, dn2Var);
        }
        bt.q("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
        return null;
    }

    public static final ArrayList Y(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ServerCache serverCache = (ServerCache) it.next();
            serverCache.getClass();
            ServerConfig serverConfigA = ServerConfig.a(serverCache.getConfig());
            ServerAffiliationInfo serverAffiliationInfoB = serverCache.getAffiliationInfo();
            arrayList.add(ServerCache.a(serverCache, serverConfigA, serverAffiliationInfoB != null ? ServerAffiliationInfo.a(serverAffiliationInfoB) : null, false, 9));
        }
        return arrayList;
    }

    public static void Z(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        long j = ((long) i3) * 121666;
        int i10 = ((int) j) & 33554431;
        long j2 = j >> 25;
        long j3 = ((long) i5) * 121666;
        int i11 = ((int) j3) & 33554431;
        long j4 = ((long) i8) * 121666;
        long j5 = ((long) iArr[9]) * 121666;
        int i12 = ((int) j5) & 33554431;
        long j6 = (((long) i) * 121666) + ((j5 >> 25) * 38);
        iArr2[0] = ((int) j6) & 67108863;
        long j7 = (((long) i6) * 121666) + (j3 >> 25);
        iArr2[5] = ((int) j7) & 67108863;
        long j8 = (((long) i2) * 121666) + (j6 >> 26);
        iArr2[1] = ((int) j8) & 67108863;
        long j9 = (((long) i4) * 121666) + j2;
        iArr2[3] = ((int) j9) & 67108863;
        long j10 = (((long) i7) * 121666) + (j7 >> 26);
        iArr2[6] = ((int) j10) & 67108863;
        long j11 = (((long) i9) * 121666) + (j4 >> 25);
        iArr2[8] = ((int) j11) & 67108863;
        iArr2[2] = ((int) (j8 >> 26)) + i10;
        iArr2[4] = i11 + ((int) (j9 >> 26));
        iArr2[7] = (((int) j4) & 33554431) + ((int) (j10 >> 26));
        iArr2[9] = i12 + ((int) (j11 >> 26));
    }

    /* JADX WARN: Code duplicated, block: B:123:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:135:0x020b  */
    /* JADX WARN: Code duplicated, block: B:138:0x0220  */
    /* JADX WARN: Code duplicated, block: B:139:0x0224  */
    /* JADX WARN: Code duplicated, block: B:142:0x0234  */
    /* JADX WARN: Code duplicated, block: B:144:0x0240  */
    /* JADX WARN: Code duplicated, block: B:145:0x024c  */
    /* JADX WARN: Code duplicated, block: B:152:0x027f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0285  */
    /* JADX WARN: Code duplicated, block: B:158:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:161:0x02b4 A[LOOP:0: B:160:0x02b2->B:161:0x02b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:167:0x02df  */
    /* JADX WARN: Code duplicated, block: B:176:0x030e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0314  */
    /* JADX WARN: Code duplicated, block: B:182:0x0335  */
    /* JADX WARN: Code duplicated, block: B:191:0x036c  */
    /* JADX WARN: Code duplicated, block: B:193:0x0372  */
    /* JADX WARN: Code duplicated, block: B:195:0x0384  */
    /* JADX WARN: Code duplicated, block: B:196:0x038e  */
    /* JADX WARN: Code duplicated, block: B:199:0x039c  */
    /* JADX WARN: Code duplicated, block: B:200:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:203:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:204:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:206:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:210:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:211:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:213:0x0409  */
    /* JADX WARN: Code duplicated, block: B:216:0x0445  */
    /* JADX WARN: Code duplicated, block: B:220:0x0476  */
    /* JADX WARN: Code duplicated, block: B:223:0x0488  */
    /* JADX WARN: Code duplicated, block: B:229:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:238:0x04da  */
    /* JADX WARN: Code duplicated, block: B:240:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:241:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:244:0x04ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:245:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:248:0x0502  */
    /* JADX WARN: Code duplicated, block: B:251:0x052e  */
    /* JADX WARN: Code duplicated, block: B:252:0x0530  */
    /* JADX WARN: Code duplicated, block: B:255:0x053e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:258:0x0543  */
    /* JADX WARN: Code duplicated, block: B:261:0x056c  */
    /* JADX WARN: Code duplicated, block: B:263:0x0574  */
    /* JADX WARN: Code duplicated, block: B:266:0x0580  */
    /* JADX WARN: Code duplicated, block: B:267:0x0582  */
    /* JADX WARN: Code duplicated, block: B:268:0x0584  */
    /* JADX WARN: Code duplicated, block: B:271:0x058b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:274:0x0590  */
    /* JADX WARN: Code duplicated, block: B:276:0x0593  */
    /* JADX WARN: Code duplicated, block: B:278:0x059f  */
    /* JADX WARN: Code duplicated, block: B:280:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:282:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:284:0x05de  */
    /* JADX WARN: Code duplicated, block: B:286:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:288:0x0601  */
    /* JADX WARN: Code duplicated, block: B:290:0x060d  */
    /* JADX WARN: Code duplicated, block: B:292:0x0625  */
    /* JADX WARN: Code duplicated, block: B:294:0x0633  */
    /* JADX WARN: Code duplicated, block: B:297:0x0638 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:306:0x064a  */
    /* JADX WARN: Code duplicated, block: B:308:0x0663  */
    /* JADX WARN: Code duplicated, block: B:310:0x0687  */
    /* JADX WARN: Code duplicated, block: B:313:0x069e  */
    /* JADX WARN: Code duplicated, block: B:318:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:322:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:327:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:329:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:331:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:333:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:335:0x0703  */
    /* JADX WARN: Code duplicated, block: B:337:0x070f  */
    /* JADX WARN: Code duplicated, block: B:339:0x0726  */
    /* JADX WARN: Code duplicated, block: B:341:0x0736  */
    /* JADX WARN: Code duplicated, block: B:342:0x0755  */
    /* JADX WARN: Code duplicated, block: B:345:0x078e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:348:0x0797  */
    /* JADX WARN: Code duplicated, block: B:351:0x07c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:352:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:355:0x07ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:356:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:359:0x0839  */
    /* JADX WARN: Code duplicated, block: B:360:0x0844  */
    /* JADX WARN: Code duplicated, block: B:363:0x0862  */
    /* JADX WARN: Code duplicated, block: B:364:0x0866  */
    public static final void a(ce8 ce8Var, gn2 gn2Var, kx4 kx4Var, g22 g22Var, h62 h62Var, rn2 rn2Var, zy0 zy0Var, lp2 lp2Var, int i) {
        zy0 zy0Var2;
        rh5 rh5Var;
        boolean z;
        Object objK;
        ce8 ce8Var2;
        boolean zF;
        Object objK2;
        boolean zF2;
        Object objK3;
        y05 y05Var;
        Object objC;
        rh5 rh5Var2;
        Object value;
        r12 r12Var;
        r12 r12Var2;
        g22 g22Var2;
        rh5 rh5Var3;
        boolean zF3;
        Object objK4;
        y05 y05Var2;
        u72 u72Var;
        u72 u72Var2;
        qw6 qw6Var;
        qw6 qw6Var2;
        eb7 eb7Var;
        Object objK5;
        boolean z2;
        eb7 eb7Var2;
        fp0 fp0Var;
        Object objK6;
        fp0 fp0Var2;
        h62 h62Var2;
        Object objP;
        Object objK7;
        boolean zF4;
        Object objK8;
        rn2 rn2Var2;
        Object objK9;
        y05 y05Var3;
        boolean zH;
        Object objK10;
        boolean z3;
        Object objK11;
        fk fkVar;
        x77 x77Var;
        ug8 ug8Var;
        Object objK12;
        dn2 dn2Var;
        boolean z4;
        boolean zH2;
        Object objK13;
        be8 be8Var;
        be8 be8Var2;
        fp0 fp0Var3;
        boolean zA;
        eb7 eb7Var3;
        fp0 fp0Var4;
        be8 be8Var3;
        boolean z5;
        boolean z6;
        boolean z7;
        Object obj;
        sd8 sd8Var;
        sd8 sd8Var2;
        sd8 sd8Var3;
        boolean z8;
        wk6 wk6Var;
        hx4 hx4Var;
        x77 x77Var2;
        kx4 qu8Var;
        ug8 ug8Var2;
        be8 be8Var4;
        boolean z9;
        boolean z10;
        x77 x77Var3;
        ug8 ug8Var3;
        sd8 sd8Var4;
        boolean z11;
        sd8 sd8Var5;
        sd8 sd8VarG;
        boolean zH3;
        Object objK14;
        x77 x77Var4;
        g22 g22Var3;
        h62 h62Var3;
        boolean zH4;
        Object objK15;
        boolean zG;
        Object objK16;
        Object objK17;
        fk fkVar2;
        boolean z12;
        Object objK18;
        Object objK19;
        Object objK20;
        Object objK21;
        Object objK22;
        Object objK23;
        Object value2;
        r12 r12VarM0;
        rh5 rh5Var4;
        Object value3;
        boolean z13;
        vd7 vd7Var;
        int size;
        int i2;
        kx4 kx4Var2 = kx4Var;
        rh5 rh5Var5 = ce8Var.e;
        lp2Var.X(-1310802509);
        int i3 = (i & 6) == 0 ? (lp2Var.f(ce8Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= lp2Var.h(gn2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= lp2Var.f(kx4Var2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= lp2Var.f(g22Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= lp2Var.f(h62Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= lp2Var.h(rn2Var) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        int i4 = i3 | 1572864;
        if ((12582912 & i) == 0) {
            i4 |= lp2Var.h(null) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= lp2Var.h(zy0Var) ? 67108864 : 33554432;
        }
        int i5 = i4;
        byte b2 = 1;
        if (lp2Var.N(i5 & 1, (i5 & 38347923) != 38347922)) {
            rh5 rh5Var6 = ce8Var.d;
            Object value4 = rh5Var5.getValue();
            Object objK24 = lp2Var.K();
            Object obj2 = zz0.a;
            if (objK24 == obj2) {
                objK24 = z51.H(Boolean.FALSE);
                lp2Var.g0(objK24);
            }
            y05 y05Var4 = (y05) objK24;
            Object objK25 = lp2Var.K();
            if (objK25 == obj2) {
                objK25 = new hg(y05Var4, b2);
                lp2Var.g0(objK25);
            }
            int i6 = i5 & 14;
            int i7 = i6 | 48;
            b22.a(ce8Var, (dn2) objK25, lp2Var, i7);
            if (value4 != null && ((Boolean) gn2Var.B(value4)).booleanValue()) {
                y05Var4.setValue(Boolean.TRUE);
            }
            if (((Boolean) gn2Var.B(rh5Var6.getValue())).booleanValue() || ((Boolean) gn2Var.B(ce8Var.c())).booleanValue() || ((value4 != null && ((Boolean) gn2Var.B(value4)).booleanValue()) || ((((Boolean) y05Var4.getValue()).booleanValue() && !dh3.f(ce8Var.c(), rh5Var6.getValue())) || ce8Var.g() || ce8Var.d()))) {
                lp2Var.W(-273709037);
                int i8 = i7 & 14;
                boolean z14 = ((i8 ^ 6) > 4 && lp2Var.f(ce8Var)) || (i7 & 6) == 4;
                Object objK26 = lp2Var.K();
                if (z14 || objK26 == obj2) {
                    objK26 = ce8Var.c();
                    lp2Var.g0(objK26);
                }
                if (ce8Var.g()) {
                    objK26 = ce8Var.c();
                }
                lp2Var.W(2016262395);
                r12 r12VarM1 = m0(ce8Var, gn2Var, objK26, lp2Var);
                lp2Var.p(false);
                Object value5 = rh5Var6.getValue();
                lp2Var.W(2016262395);
                r12 r12VarM2 = m0(ce8Var, gn2Var, value5, lp2Var);
                lp2Var.p(false);
                int i9 = i8 | 3072;
                int i10 = (i9 & 14) ^ 6;
                if (i10 <= 4 || !lp2Var.f(ce8Var)) {
                    rh5Var = rh5Var5;
                    if ((i9 & 6) != 4) {
                        z = false;
                    }
                    objK = lp2Var.K();
                    if (z || objK == obj2) {
                        objK = new ce8(new b15(r12VarM1), ce8Var, ce8Var.c.concat(" > EnterExitTransition"));
                        lp2Var.g0(objK);
                    }
                    ce8Var2 = (ce8) objK;
                    zF = ((i10 <= 4 && lp2Var.f(ce8Var)) || (i9 & 6) == 4) | lp2Var.f(ce8Var2);
                    objK2 = lp2Var.K();
                    if (zF || objK2 == obj2) {
                        objK2 = new gq6(ce8Var, ce8Var2, (byte) 18);
                        lp2Var.g0(objK2);
                    }
                    u70.a(ce8Var2, (gn2) objK2, lp2Var);
                    if (ce8Var.g()) {
                        ce8Var2.j(r12VarM1, r12VarM2);
                    } else {
                        ce8Var2.l(r12VarM2);
                        ce8Var2.l.setValue(Boolean.FALSE);
                    }
                    if (ce8Var.g()) {
                        lp2Var.W(782538635);
                        lp2Var.p(false);
                    } else {
                        lp2Var.W(782386797);
                        value2 = rh5Var.getValue();
                        if (value2 == null) {
                            lp2Var.W(782437481);
                            lp2Var.p(false);
                            r12VarM0 = null;
                        } else {
                            lp2Var.W(782437482);
                            lp2Var.W(2016262395);
                            r12VarM0 = m0(ce8Var, gn2Var, value2, lp2Var);
                            lp2Var.p(false);
                            lp2Var.p(false);
                        }
                        rh5Var4 = ce8Var2.d;
                        rh5 rh5Var7 = ce8Var2.e;
                        value3 = rh5Var7.getValue();
                        if (value3 == null && r12VarM0 == null && dh3.f(rh5Var4.getValue(), ce8Var2.c())) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        rh5Var7.setValue(r12VarM0);
                        if (z13) {
                            ce8Var2.f.setValue(new xd8(value3, rh5Var4.getValue()));
                            ce8Var2.a.b.setValue(value3);
                            if (ce8Var2.h.l() == Long.MIN_VALUE) {
                                ce8Var2.k(true);
                            }
                            vd7Var = ce8Var2.j;
                            size = vd7Var.size();
                            for (i2 = 0; i2 < size; i2++) {
                                ((yd8) vd7Var.get(i2)).h0.m(-2.0f);
                            }
                        }
                        lp2Var.p(false);
                    }
                    zF2 = lp2Var.f(ce8Var2);
                    objK3 = lp2Var.K();
                    if (zF2 || objK3 == obj2) {
                        objK3 = z51.H(g22Var);
                        lp2Var.g0(objK3);
                    }
                    y05Var = (y05) objK3;
                    objC = ce8Var2.c();
                    rh5Var2 = ce8Var2.d;
                    value = rh5Var2.getValue();
                    r12Var = r12.Z;
                    r12Var2 = r12.Y;
                    if (objC == value || ce8Var2.c() != r12Var2) {
                        if (rh5Var2.getValue() != r12Var) {
                            y05Var.setValue(((g22) y05Var.getValue()).a(g22Var));
                        }
                    } else if (ce8Var2.g()) {
                        y05Var.setValue(g22Var);
                    } else {
                        y05Var.setValue(g22.b);
                    }
                    g22Var2 = (g22) y05Var.getValue();
                    rh5Var3 = ce8Var2.d;
                    zF3 = lp2Var.f(ce8Var2);
                    objK4 = lp2Var.K();
                    if (zF3 || objK4 == obj2) {
                        objK4 = z51.H(h62Var);
                        lp2Var.g0(objK4);
                    }
                    y05Var2 = (y05) objK4;
                    if (ce8Var2.c() != rh5Var3.getValue() && ce8Var2.c() == r12Var2) {
                        lp2Var.W(-505142498);
                        lp2Var.p(false);
                        if (ce8Var2.g()) {
                            y05Var2.setValue(h62Var);
                        } else {
                            y05Var2.setValue(h62.b);
                        }
                    } else if (rh5Var3.getValue() != r12Var2) {
                        lp2Var.W(-504838512);
                        u72Var = ((h62) y05Var2.getValue()).a.a;
                        if (u72Var != null) {
                            u72Var2 = new u72(1.0f, u72Var.b);
                        } else {
                            u72Var2 = null;
                        }
                        qw6Var = ((h62) y05Var2.getValue()).a.d;
                        if (qw6Var != null) {
                            qw6Var2 = new qw6(1.0f, qw6Var.b, qw6Var.c);
                        } else {
                            qw6Var2 = null;
                        }
                        eb7Var = ((h62) y05Var2.getValue()).a.b;
                        if (eb7Var == null) {
                            lp2Var.W(-504119809);
                            z2 = false;
                            lp2Var.p(false);
                            eb7Var2 = null;
                        } else {
                            lp2Var.W(-708998590);
                            objK5 = lp2Var.K();
                            if (objK5 == obj2) {
                                objK5 = ti.t0;
                                lp2Var.g0(objK5);
                            }
                            eb7 eb7Var4 = new eb7((gn2) objK5, eb7Var.b);
                            z2 = false;
                            lp2Var.p(false);
                            eb7Var2 = eb7Var4;
                        }
                        fp0Var = ((h62) y05Var2.getValue()).a.c;
                        if (fp0Var == null) {
                            lp2Var.W(-504024174);
                            lp2Var.p(z2);
                            fp0Var2 = null;
                        } else {
                            lp2Var.W(-708995505);
                            objK6 = lp2Var.K();
                            if (objK6 == obj2) {
                                objK6 = ti.u0;
                                lp2Var.g0(objK6);
                            }
                            fp0 fp0Var5 = new fp0(fp0Var.a, (gn2) objK6, fp0Var.c, fp0Var.d);
                            lp2Var.p(false);
                            fp0Var2 = fp0Var5;
                        }
                        be8 be8Var5 = ((h62) y05Var2.getValue()).a;
                        y05Var2.setValue(new h62(new be8(u72Var2, eb7Var2, fp0Var2, qw6Var2, (LinkedHashMap) null, 96)).a(h62Var));
                        lp2Var.p(false);
                    } else {
                        lp2Var.W(-503833306);
                        lp2Var.p(false);
                    }
                    h62Var2 = (h62) y05Var2.getValue();
                    objP = z51.P(rn2Var, lp2Var);
                    objK7 = rn2Var.K(ce8Var2.c(), rh5Var3.getValue());
                    zF4 = lp2Var.f(ce8Var2) | lp2Var.f(objP);
                    objK8 = lp2Var.K();
                    if (zF4 || objK8 == obj2) {
                        objK8 = new r0(ce8Var2, objP, null, (byte) 5);
                        lp2Var.g0(objK8);
                    }
                    rn2Var2 = (rn2) objK8;
                    objK9 = lp2Var.K();
                    if (objK9 == obj2) {
                        objK9 = z51.H(objK7);
                        lp2Var.g0(objK9);
                    }
                    y05Var3 = (y05) objK9;
                    zH = lp2Var.h(rn2Var2);
                    objK10 = lp2Var.K();
                    if (zH || objK10 == obj2) {
                        objK10 = new sd7(rn2Var2, y05Var3, null, (byte) 0);
                        lp2Var.g0(objK10);
                    }
                    u70.h((rn2) objK10, lp2Var, dn8.a);
                    if (ce8Var2.c() != r12Var && rh5Var3.getValue() == r12Var && ((Boolean) y05Var3.getValue()).booleanValue()) {
                        lp2Var.W(-270520625);
                        z12 = false;
                        lp2Var.p(false);
                        kx4Var2 = kx4Var;
                        zy0Var2 = zy0Var;
                    } else {
                        lp2Var.W(-272022668);
                        if (i6 == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objK11 = lp2Var.K();
                        if (z3 || objK11 == obj2) {
                            objK11 = new fk(ce8Var2);
                            lp2Var.g0(objK11);
                        }
                        fkVar = (fk) objK11;
                        x77Var = fkVar.c;
                        ug8Var = ys0.p0;
                        objK12 = lp2Var.K();
                        if (objK12 == obj2) {
                            objK12 = nx.g0;
                            lp2Var.g0(objK12);
                        }
                        dn2Var = (dn2) objK12;
                        lp2Var.W(-1491182875);
                        lp2Var.p(false);
                        lp2Var.W(-1491180092);
                        lp2Var.p(false);
                        lp2Var.W(-31257052);
                        lp2Var.p(false);
                        if (ce8Var2.e.getValue() != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        x77Var.c(z4);
                        zH2 = lp2Var.h(x77Var);
                        objK13 = lp2Var.K();
                        if (zH2 || objK13 == obj2) {
                            objK13 = new y12(x77Var, (byte) 1);
                            lp2Var.g0(objK13);
                        }
                        b22.a(ce8Var2, (dn2) objK13, lp2Var, 0);
                        be8Var = g22Var2.a;
                        be8Var2 = h62Var2.a;
                        fp0Var3 = be8Var2.c;
                        zA = tk8.a(x77Var.e, dw0.f);
                        eb7Var3 = be8Var.b;
                        fp0Var4 = be8Var.c;
                        if (eb7Var3 == null) {
                            z5 = zA;
                            if (be8Var2.b == null) {
                                if (hf3.a(x77Var.i, 0L)) {
                                    z6 = false;
                                }
                                if (fp0Var4 == null || fp0Var3 != null) {
                                    be8Var3 = be8Var2;
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z6) {
                                    lp2Var.W(1018653691);
                                    objK23 = lp2Var.K();
                                    if (objK23 == obj2) {
                                        objK23 = "Built-in slide";
                                        lp2Var.g0("Built-in slide");
                                    }
                                    String str = (String) objK23;
                                    obj = obj2;
                                    sd8 sd8VarG2 = rq7.g(ce8Var2, ug8Var, str, lp2Var, 384, 0);
                                    lp2Var.p(false);
                                    sd8Var = sd8VarG2;
                                } else {
                                    obj = obj2;
                                    lp2Var.W(1018759494);
                                    lp2Var.p(false);
                                    sd8Var = null;
                                }
                                if (z7) {
                                    lp2Var.W(1018851285);
                                    ug8 ug8Var4 = ys0.q0;
                                    objK22 = lp2Var.K();
                                    if (objK22 == obj) {
                                        objK22 = "Built-in shrink/expand";
                                        lp2Var.g0("Built-in shrink/expand");
                                    }
                                    sd8 sd8VarG3 = rq7.g(ce8Var2, ug8Var4, (String) objK22, lp2Var, 384, 0);
                                    lp2Var.p(false);
                                    sd8Var2 = sd8VarG3;
                                } else {
                                    lp2Var.W(1018962109);
                                    lp2Var.p(false);
                                    sd8Var2 = null;
                                }
                                if (z7) {
                                    lp2Var.W(1019035735);
                                    objK21 = lp2Var.K();
                                    if (objK21 == obj) {
                                        objK21 = "Built-in InterruptionHandlingOffset";
                                        lp2Var.g0("Built-in InterruptionHandlingOffset");
                                    }
                                    sd8 sd8VarG4 = rq7.g(ce8Var2, ug8Var, (String) objK21, lp2Var, 384, 0);
                                    lp2Var.p(false);
                                    sd8Var3 = sd8VarG4;
                                } else {
                                    lp2Var.W(1019206141);
                                    lp2Var.p(false);
                                    sd8Var3 = null;
                                }
                                z8 = (fp0Var4 == 0 && !fp0Var4.d) || !((fp0Var3 == null || fp0Var3.d) && z7);
                                wk6Var = nw0.e;
                                hx4Var = hx4.X;
                                if (z5) {
                                    x77Var2 = x77Var;
                                    lp2Var.W(1020031362);
                                    lp2Var.p(false);
                                    qu8Var = hx4Var;
                                } else {
                                    lp2Var.W(1019733235);
                                    ug8 ug8Var5 = new ug8(ti.i0, new wi(wk6Var, (byte) 2));
                                    objK20 = lp2Var.K();
                                    if (objK20 == obj) {
                                        objK20 = "Built-in veil";
                                        lp2Var.g0("Built-in veil");
                                    }
                                    qu8Var = new qu8(ce8Var2, rq7.g(ce8Var2, ug8Var5, (String) objK20, lp2Var, 384, 0), g22Var2, h62Var2, x77Var);
                                    x77Var2 = x77Var;
                                    lp2Var.p(false);
                                }
                                ug8Var2 = ys0.j0;
                                if (be8Var.a == null || be8Var3.a != null) {
                                    be8Var4 = be8Var;
                                } else {
                                    be8Var4 = be8Var;
                                    z9 = x77Var2.f != 1.0f;
                                    if (be8Var4.d != null && be8Var3.d == null && x77Var2.g == 1.0f) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    if (z9) {
                                        lp2Var.W(-1511865571);
                                        objK19 = lp2Var.K();
                                        if (objK19 == obj) {
                                            objK19 = "Built-in alpha";
                                            lp2Var.g0("Built-in alpha");
                                        }
                                        x77 x77Var5 = x77Var2;
                                        ug8Var3 = ug8Var2;
                                        x77Var3 = x77Var5;
                                        sd8 sd8VarG5 = rq7.g(ce8Var2, ug8Var3, (String) objK19, lp2Var, 384, 0);
                                        lp2Var.p(false);
                                        sd8Var4 = sd8VarG5;
                                    } else {
                                        x77Var3 = x77Var2;
                                        ug8Var3 = ug8Var2;
                                        lp2Var.W(-1511696126);
                                        lp2Var.p(false);
                                        sd8Var4 = null;
                                    }
                                    if (z10 != 0) {
                                        lp2Var.W(-1511628483);
                                        objK18 = lp2Var.K();
                                        if (objK18 == obj) {
                                            objK18 = "Built-in scale";
                                            lp2Var.g0("Built-in scale");
                                        }
                                        sd8 sd8VarG6 = rq7.g(ce8Var2, ug8Var3, (String) objK18, lp2Var, 384, 0);
                                        z11 = false;
                                        lp2Var.p(false);
                                        sd8Var5 = sd8VarG6;
                                    } else {
                                        z11 = false;
                                        lp2Var.W(-1511459038);
                                        lp2Var.p(false);
                                        sd8Var5 = null;
                                    }
                                    if (z10) {
                                        lp2Var.W(-1511381382);
                                        sd8VarG = rq7.g(ce8Var2, b22.a, "TransformOriginInterruptionHandling", lp2Var, 384, 0);
                                        lp2Var.p(z11);
                                    } else {
                                        lp2Var.W(-1511209054);
                                        lp2Var.p(z11);
                                        sd8VarG = null;
                                    }
                                    zH3 = lp2Var.h(sd8Var4) | lp2Var.f(r26) | lp2Var.f(r27) | lp2Var.h(x77Var3) | lp2Var.h(sd8Var5) | lp2Var.f(ce8Var2) | lp2Var.h(sd8VarG);
                                    objK14 = lp2Var.K();
                                    if (!zH3 || objK14 == obj) {
                                        x77 x77Var6 = x77Var3;
                                        objK14 = new t12(sd8Var4, x77Var6, sd8Var5, ce8Var2, r26, r27, sd8VarG);
                                        x77Var4 = x77Var6;
                                        g22Var3 = r26;
                                        h62Var3 = r27;
                                        lp2Var.g0(objK14);
                                    } else {
                                        g22Var3 = g22Var2;
                                        h62Var3 = h62Var2;
                                        x77Var4 = x77Var3;
                                    }
                                    t12 t12Var = (t12) objK14;
                                    r06 r06Var = bh1.a;
                                    zH4 = lp2Var.h(x77Var4);
                                    objK15 = lp2Var.K();
                                    if (zH4 || objK15 == obj) {
                                        objK15 = new y12(x77Var4, (byte) 0);
                                        lp2Var.g0(objK15);
                                    }
                                    kx4 kx4VarY = new ox4((dn2) objK15).y(hx4Var);
                                    zG = lp2Var.g(z8) | lp2Var.f(dn2Var);
                                    objK16 = lp2Var.K();
                                    if (zG || objK16 == obj) {
                                        objK16 = new z12(dn2Var, z8);
                                        lp2Var.g0(objK16);
                                    }
                                    kx4 kx4VarY2 = kx4VarY.y(jm4.I(hx4Var, (gn2) objK16)).y(new s12(ce8Var2, sd8Var2, sd8Var3, sd8Var, g22Var3, h62Var3, x77Var4, dn2Var, t12Var)).y(qu8Var);
                                    lp2Var.W(-1255657861);
                                    lp2Var.p(false);
                                    kx4Var2 = kx4Var;
                                    kx4 kx4VarY3 = kx4Var2.y(kx4VarY2.y(hx4Var));
                                    objK17 = lp2Var.K();
                                    if (objK17 == obj) {
                                        fkVar2 = fkVar;
                                        objK17 = new mj(fkVar2);
                                        lp2Var.g0(objK17);
                                    } else {
                                        fkVar2 = fkVar;
                                    }
                                    mj mjVar = (mj) objK17;
                                    int iHashCode = Long.hashCode(lp2Var.T);
                                    kl5 kl5VarL = lp2Var.l();
                                    kx4 kx4VarQ = w45.Q(lp2Var, kx4VarY3);
                                    uz0.j.getClass();
                                    lp2Var.Z();
                                    if (lp2Var.S) {
                                        lp2Var.k();
                                    } else {
                                        lp2Var.j0();
                                    }
                                    pn7.m(pz2.B0, lp2Var, mjVar);
                                    pn7.m(pz2.A0, lp2Var, kl5VarL);
                                    pn7.j(lp2Var, Integer.valueOf(iHashCode));
                                    pn7.l(lp2Var);
                                    pn7.m(pz2.z0, lp2Var, kx4VarQ);
                                    zy0Var2 = zy0Var;
                                    zy0Var2.x(fkVar2, lp2Var, Integer.valueOf((i5 >> 21) & 112));
                                    lp2Var.p(true);
                                    z12 = false;
                                    lp2Var.p(false);
                                }
                                if (be8Var4.d != null) {
                                    z10 = true;
                                } else {
                                    z10 = true;
                                }
                                if (z9) {
                                    lp2Var.W(-1511865571);
                                    objK19 = lp2Var.K();
                                    if (objK19 == obj) {
                                        objK19 = "Built-in alpha";
                                        lp2Var.g0("Built-in alpha");
                                    }
                                    x77 x77Var7 = x77Var2;
                                    ug8Var3 = ug8Var2;
                                    x77Var3 = x77Var7;
                                    sd8 sd8VarG7 = rq7.g(ce8Var2, ug8Var3, (String) objK19, lp2Var, 384, 0);
                                    lp2Var.p(false);
                                    sd8Var4 = sd8VarG7;
                                } else {
                                    x77Var3 = x77Var2;
                                    ug8Var3 = ug8Var2;
                                    lp2Var.W(-1511696126);
                                    lp2Var.p(false);
                                    sd8Var4 = null;
                                }
                                if (z10 != 0) {
                                    lp2Var.W(-1511628483);
                                    objK18 = lp2Var.K();
                                    if (objK18 == obj) {
                                        objK18 = "Built-in scale";
                                        lp2Var.g0("Built-in scale");
                                    }
                                    sd8 sd8VarG8 = rq7.g(ce8Var2, ug8Var3, (String) objK18, lp2Var, 384, 0);
                                    z11 = false;
                                    lp2Var.p(false);
                                    sd8Var5 = sd8VarG8;
                                } else {
                                    z11 = false;
                                    lp2Var.W(-1511459038);
                                    lp2Var.p(false);
                                    sd8Var5 = null;
                                }
                                if (z10) {
                                    lp2Var.W(-1511381382);
                                    sd8VarG = rq7.g(ce8Var2, b22.a, "TransformOriginInterruptionHandling", lp2Var, 384, 0);
                                    lp2Var.p(z11);
                                } else {
                                    lp2Var.W(-1511209054);
                                    lp2Var.p(z11);
                                    sd8VarG = null;
                                }
                                zH3 = lp2Var.h(sd8Var4) | lp2Var.f(r26) | lp2Var.f(r27) | lp2Var.h(x77Var3) | lp2Var.h(sd8Var5) | lp2Var.f(ce8Var2) | lp2Var.h(sd8VarG);
                                objK14 = lp2Var.K();
                                if (zH3) {
                                    x77 x77Var8 = x77Var3;
                                    objK14 = new t12(sd8Var4, x77Var8, sd8Var5, ce8Var2, r26, r27, sd8VarG);
                                    x77Var4 = x77Var8;
                                    g22Var3 = r26;
                                    h62Var3 = r27;
                                    lp2Var.g0(objK14);
                                } else {
                                    x77 x77Var9 = x77Var3;
                                    objK14 = new t12(sd8Var4, x77Var9, sd8Var5, ce8Var2, r26, r27, sd8VarG);
                                    x77Var4 = x77Var9;
                                    g22Var3 = r26;
                                    h62Var3 = r27;
                                    lp2Var.g0(objK14);
                                }
                                t12 t12Var2 = (t12) objK14;
                                r06 r06Var2 = bh1.a;
                                zH4 = lp2Var.h(x77Var4);
                                objK15 = lp2Var.K();
                                if (zH4) {
                                    objK15 = new y12(x77Var4, (byte) 0);
                                    lp2Var.g0(objK15);
                                } else {
                                    objK15 = new y12(x77Var4, (byte) 0);
                                    lp2Var.g0(objK15);
                                }
                                kx4 kx4VarY4 = new ox4((dn2) objK15).y(hx4Var);
                                zG = lp2Var.g(z8) | lp2Var.f(dn2Var);
                                objK16 = lp2Var.K();
                                if (zG) {
                                    objK16 = new z12(dn2Var, z8);
                                    lp2Var.g0(objK16);
                                } else {
                                    objK16 = new z12(dn2Var, z8);
                                    lp2Var.g0(objK16);
                                }
                                kx4 kx4VarY5 = kx4VarY4.y(jm4.I(hx4Var, (gn2) objK16)).y(new s12(ce8Var2, sd8Var2, sd8Var3, sd8Var, g22Var3, h62Var3, x77Var4, dn2Var, t12Var2)).y(qu8Var);
                                lp2Var.W(-1255657861);
                                lp2Var.p(false);
                                kx4Var2 = kx4Var;
                                kx4 kx4VarY6 = kx4Var2.y(kx4VarY5.y(hx4Var));
                                objK17 = lp2Var.K();
                                if (objK17 == obj) {
                                    fkVar2 = fkVar;
                                    objK17 = new mj(fkVar2);
                                    lp2Var.g0(objK17);
                                } else {
                                    fkVar2 = fkVar;
                                }
                                mj mjVar2 = (mj) objK17;
                                int iHashCode2 = Long.hashCode(lp2Var.T);
                                kl5 kl5VarL2 = lp2Var.l();
                                kx4 kx4VarQ2 = w45.Q(lp2Var, kx4VarY6);
                                uz0.j.getClass();
                                lp2Var.Z();
                                if (lp2Var.S) {
                                    lp2Var.k();
                                } else {
                                    lp2Var.j0();
                                }
                                pn7.m(pz2.B0, lp2Var, mjVar2);
                                pn7.m(pz2.A0, lp2Var, kl5VarL2);
                                pn7.j(lp2Var, Integer.valueOf(iHashCode2));
                                pn7.l(lp2Var);
                                pn7.m(pz2.z0, lp2Var, kx4VarQ2);
                                zy0Var2 = zy0Var;
                                zy0Var2.x(fkVar2, lp2Var, Integer.valueOf((i5 >> 21) & 112));
                                lp2Var.p(true);
                                z12 = false;
                                lp2Var.p(false);
                            } else {
                                be8Var3 = be8Var2;
                            }
                        } else {
                            be8Var3 = be8Var2;
                            z5 = zA;
                        }
                        be8Var3 = be8Var2;
                        z6 = true;
                        if (fp0Var4 == null) {
                            be8Var3 = be8Var2;
                            z7 = true;
                        } else {
                            be8Var3 = be8Var2;
                            z7 = true;
                        }
                        if (z6) {
                            lp2Var.W(1018653691);
                            objK23 = lp2Var.K();
                            if (objK23 == obj2) {
                                objK23 = "Built-in slide";
                                lp2Var.g0("Built-in slide");
                            }
                            String str2 = (String) objK23;
                            obj = obj2;
                            sd8 sd8VarG9 = rq7.g(ce8Var2, ug8Var, str2, lp2Var, 384, 0);
                            lp2Var.p(false);
                            sd8Var = sd8VarG9;
                        } else {
                            obj = obj2;
                            lp2Var.W(1018759494);
                            lp2Var.p(false);
                            sd8Var = null;
                        }
                        if (z7) {
                            lp2Var.W(1018851285);
                            ug8 ug8Var6 = ys0.q0;
                            objK22 = lp2Var.K();
                            if (objK22 == obj) {
                                objK22 = "Built-in shrink/expand";
                                lp2Var.g0("Built-in shrink/expand");
                            }
                            sd8 sd8VarG10 = rq7.g(ce8Var2, ug8Var6, (String) objK22, lp2Var, 384, 0);
                            lp2Var.p(false);
                            sd8Var2 = sd8VarG10;
                        } else {
                            lp2Var.W(1018962109);
                            lp2Var.p(false);
                            sd8Var2 = null;
                        }
                        if (z7) {
                            lp2Var.W(1019035735);
                            objK21 = lp2Var.K();
                            if (objK21 == obj) {
                                objK21 = "Built-in InterruptionHandlingOffset";
                                lp2Var.g0("Built-in InterruptionHandlingOffset");
                            }
                            sd8 sd8VarG11 = rq7.g(ce8Var2, ug8Var, (String) objK21, lp2Var, 384, 0);
                            lp2Var.p(false);
                            sd8Var3 = sd8VarG11;
                        } else {
                            lp2Var.W(1019206141);
                            lp2Var.p(false);
                            sd8Var3 = null;
                        }
                        if (fp0Var4 == 0) {
                        }
                        wk6Var = nw0.e;
                        hx4Var = hx4.X;
                        if (z5) {
                            lp2Var.W(1019733235);
                            ug8 ug8Var7 = new ug8(ti.i0, new wi(wk6Var, (byte) 2));
                            objK20 = lp2Var.K();
                            if (objK20 == obj) {
                                objK20 = "Built-in veil";
                                lp2Var.g0("Built-in veil");
                            }
                            qu8Var = new qu8(ce8Var2, rq7.g(ce8Var2, ug8Var7, (String) objK20, lp2Var, 384, 0), g22Var2, h62Var2, x77Var);
                            x77Var2 = x77Var;
                            lp2Var.p(false);
                        } else {
                            x77Var2 = x77Var;
                            lp2Var.W(1020031362);
                            lp2Var.p(false);
                            qu8Var = hx4Var;
                        }
                        ug8Var2 = ys0.j0;
                        if (be8Var.a == null) {
                            be8Var4 = be8Var;
                        } else {
                            be8Var4 = be8Var;
                        }
                        if (be8Var4.d != null) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        if (z9) {
                            lp2Var.W(-1511865571);
                            objK19 = lp2Var.K();
                            if (objK19 == obj) {
                                objK19 = "Built-in alpha";
                                lp2Var.g0("Built-in alpha");
                            }
                            x77 x77Var10 = x77Var2;
                            ug8Var3 = ug8Var2;
                            x77Var3 = x77Var10;
                            sd8 sd8VarG12 = rq7.g(ce8Var2, ug8Var3, (String) objK19, lp2Var, 384, 0);
                            lp2Var.p(false);
                            sd8Var4 = sd8VarG12;
                        } else {
                            x77Var3 = x77Var2;
                            ug8Var3 = ug8Var2;
                            lp2Var.W(-1511696126);
                            lp2Var.p(false);
                            sd8Var4 = null;
                        }
                        if (z10 != 0) {
                            lp2Var.W(-1511628483);
                            objK18 = lp2Var.K();
                            if (objK18 == obj) {
                                objK18 = "Built-in scale";
                                lp2Var.g0("Built-in scale");
                            }
                            sd8 sd8VarG13 = rq7.g(ce8Var2, ug8Var3, (String) objK18, lp2Var, 384, 0);
                            z11 = false;
                            lp2Var.p(false);
                            sd8Var5 = sd8VarG13;
                        } else {
                            z11 = false;
                            lp2Var.W(-1511459038);
                            lp2Var.p(false);
                            sd8Var5 = null;
                        }
                        if (z10) {
                            lp2Var.W(-1511381382);
                            sd8VarG = rq7.g(ce8Var2, b22.a, "TransformOriginInterruptionHandling", lp2Var, 384, 0);
                            lp2Var.p(z11);
                        } else {
                            lp2Var.W(-1511209054);
                            lp2Var.p(z11);
                            sd8VarG = null;
                        }
                        zH3 = lp2Var.h(sd8Var4) | lp2Var.f(r26) | lp2Var.f(r27) | lp2Var.h(x77Var3) | lp2Var.h(sd8Var5) | lp2Var.f(ce8Var2) | lp2Var.h(sd8VarG);
                        objK14 = lp2Var.K();
                        if (zH3) {
                            x77 x77Var11 = x77Var3;
                            objK14 = new t12(sd8Var4, x77Var11, sd8Var5, ce8Var2, r26, r27, sd8VarG);
                            x77Var4 = x77Var11;
                            g22Var3 = r26;
                            h62Var3 = r27;
                            lp2Var.g0(objK14);
                        } else {
                            x77 x77Var12 = x77Var3;
                            objK14 = new t12(sd8Var4, x77Var12, sd8Var5, ce8Var2, r26, r27, sd8VarG);
                            x77Var4 = x77Var12;
                            g22Var3 = r26;
                            h62Var3 = r27;
                            lp2Var.g0(objK14);
                        }
                        t12 t12Var3 = (t12) objK14;
                        r06 r06Var3 = bh1.a;
                        zH4 = lp2Var.h(x77Var4);
                        objK15 = lp2Var.K();
                        if (zH4) {
                            objK15 = new y12(x77Var4, (byte) 0);
                            lp2Var.g0(objK15);
                        } else {
                            objK15 = new y12(x77Var4, (byte) 0);
                            lp2Var.g0(objK15);
                        }
                        kx4 kx4VarY7 = new ox4((dn2) objK15).y(hx4Var);
                        zG = lp2Var.g(z8) | lp2Var.f(dn2Var);
                        objK16 = lp2Var.K();
                        if (zG) {
                            objK16 = new z12(dn2Var, z8);
                            lp2Var.g0(objK16);
                        } else {
                            objK16 = new z12(dn2Var, z8);
                            lp2Var.g0(objK16);
                        }
                        kx4 kx4VarY8 = kx4VarY7.y(jm4.I(hx4Var, (gn2) objK16)).y(new s12(ce8Var2, sd8Var2, sd8Var3, sd8Var, g22Var3, h62Var3, x77Var4, dn2Var, t12Var3)).y(qu8Var);
                        lp2Var.W(-1255657861);
                        lp2Var.p(false);
                        kx4Var2 = kx4Var;
                        kx4 kx4VarY9 = kx4Var2.y(kx4VarY8.y(hx4Var));
                        objK17 = lp2Var.K();
                        if (objK17 == obj) {
                            fkVar2 = fkVar;
                            objK17 = new mj(fkVar2);
                            lp2Var.g0(objK17);
                        } else {
                            fkVar2 = fkVar;
                        }
                        mj mjVar3 = (mj) objK17;
                        int iHashCode3 = Long.hashCode(lp2Var.T);
                        kl5 kl5VarL3 = lp2Var.l();
                        kx4 kx4VarQ3 = w45.Q(lp2Var, kx4VarY9);
                        uz0.j.getClass();
                        lp2Var.Z();
                        if (lp2Var.S) {
                            lp2Var.k();
                        } else {
                            lp2Var.j0();
                        }
                        pn7.m(pz2.B0, lp2Var, mjVar3);
                        pn7.m(pz2.A0, lp2Var, kl5VarL3);
                        pn7.j(lp2Var, Integer.valueOf(iHashCode3));
                        pn7.l(lp2Var);
                        pn7.m(pz2.z0, lp2Var, kx4VarQ3);
                        zy0Var2 = zy0Var;
                        zy0Var2.x(fkVar2, lp2Var, Integer.valueOf((i5 >> 21) & 112));
                        lp2Var.p(true);
                        z12 = false;
                        lp2Var.p(false);
                    }
                    lp2Var.p(z12);
                } else {
                    rh5Var = rh5Var5;
                }
                z = true;
                objK = lp2Var.K();
                if (z) {
                    objK = new ce8(new b15(r12VarM1), ce8Var, ce8Var.c.concat(" > EnterExitTransition"));
                    lp2Var.g0(objK);
                } else {
                    objK = new ce8(new b15(r12VarM1), ce8Var, ce8Var.c.concat(" > EnterExitTransition"));
                    lp2Var.g0(objK);
                }
                ce8Var2 = (ce8) objK;
                zF = ((i10 <= 4 && lp2Var.f(ce8Var)) || (i9 & 6) == 4) | lp2Var.f(ce8Var2);
                objK2 = lp2Var.K();
                if (zF) {
                    objK2 = new gq6(ce8Var, ce8Var2, (byte) 18);
                    lp2Var.g0(objK2);
                } else {
                    objK2 = new gq6(ce8Var, ce8Var2, (byte) 18);
                    lp2Var.g0(objK2);
                }
                u70.a(ce8Var2, (gn2) objK2, lp2Var);
                if (ce8Var.g()) {
                    ce8Var2.j(r12VarM1, r12VarM2);
                } else {
                    ce8Var2.l(r12VarM2);
                    ce8Var2.l.setValue(Boolean.FALSE);
                }
                if (ce8Var.g()) {
                    lp2Var.W(782386797);
                    value2 = rh5Var.getValue();
                    if (value2 == null) {
                        lp2Var.W(782437481);
                        lp2Var.p(false);
                        r12VarM0 = null;
                    } else {
                        lp2Var.W(782437482);
                        lp2Var.W(2016262395);
                        r12VarM0 = m0(ce8Var, gn2Var, value2, lp2Var);
                        lp2Var.p(false);
                        lp2Var.p(false);
                    }
                    rh5Var4 = ce8Var2.d;
                    rh5 rh5Var8 = ce8Var2.e;
                    value3 = rh5Var8.getValue();
                    if (value3 == null) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    rh5Var8.setValue(r12VarM0);
                    if (z13) {
                        ce8Var2.f.setValue(new xd8(value3, rh5Var4.getValue()));
                        ce8Var2.a.b.setValue(value3);
                        if (ce8Var2.h.l() == Long.MIN_VALUE) {
                            ce8Var2.k(true);
                        }
                        vd7Var = ce8Var2.j;
                        size = vd7Var.size();
                        while (i2 < size) {
                            ((yd8) vd7Var.get(i2)).h0.m(-2.0f);
                        }
                    }
                    lp2Var.p(false);
                } else {
                    lp2Var.W(782538635);
                    lp2Var.p(false);
                }
                zF2 = lp2Var.f(ce8Var2);
                objK3 = lp2Var.K();
                if (zF2) {
                    objK3 = z51.H(g22Var);
                    lp2Var.g0(objK3);
                } else {
                    objK3 = z51.H(g22Var);
                    lp2Var.g0(objK3);
                }
                y05Var = (y05) objK3;
                objC = ce8Var2.c();
                rh5Var2 = ce8Var2.d;
                value = rh5Var2.getValue();
                r12Var = r12.Z;
                r12Var2 = r12.Y;
                if (objC == value) {
                    if (rh5Var2.getValue() != r12Var) {
                        y05Var.setValue(((g22) y05Var.getValue()).a(g22Var));
                    }
                } else if (rh5Var2.getValue() != r12Var) {
                    y05Var.setValue(((g22) y05Var.getValue()).a(g22Var));
                }
                g22Var2 = (g22) y05Var.getValue();
                rh5Var3 = ce8Var2.d;
                zF3 = lp2Var.f(ce8Var2);
                objK4 = lp2Var.K();
                if (zF3) {
                    objK4 = z51.H(h62Var);
                    lp2Var.g0(objK4);
                } else {
                    objK4 = z51.H(h62Var);
                    lp2Var.g0(objK4);
                }
                y05Var2 = (y05) objK4;
                if (ce8Var2.c() != rh5Var3.getValue()) {
                    if (rh5Var3.getValue() != r12Var2) {
                        lp2Var.W(-504838512);
                        u72Var = ((h62) y05Var2.getValue()).a.a;
                        if (u72Var != null) {
                            u72Var2 = new u72(1.0f, u72Var.b);
                        } else {
                            u72Var2 = null;
                        }
                        qw6Var = ((h62) y05Var2.getValue()).a.d;
                        if (qw6Var != null) {
                            qw6Var2 = new qw6(1.0f, qw6Var.b, qw6Var.c);
                        } else {
                            qw6Var2 = null;
                        }
                        eb7Var = ((h62) y05Var2.getValue()).a.b;
                        if (eb7Var == null) {
                            lp2Var.W(-504119809);
                            z2 = false;
                            lp2Var.p(false);
                            eb7Var2 = null;
                        } else {
                            lp2Var.W(-708998590);
                            objK5 = lp2Var.K();
                            if (objK5 == obj2) {
                                objK5 = ti.t0;
                                lp2Var.g0(objK5);
                            }
                            eb7 eb7Var5 = new eb7((gn2) objK5, eb7Var.b);
                            z2 = false;
                            lp2Var.p(false);
                            eb7Var2 = eb7Var5;
                        }
                        fp0Var = ((h62) y05Var2.getValue()).a.c;
                        if (fp0Var == null) {
                            lp2Var.W(-504024174);
                            lp2Var.p(z2);
                            fp0Var2 = null;
                        } else {
                            lp2Var.W(-708995505);
                            objK6 = lp2Var.K();
                            if (objK6 == obj2) {
                                objK6 = ti.u0;
                                lp2Var.g0(objK6);
                            }
                            fp0 fp0Var6 = new fp0(fp0Var.a, (gn2) objK6, fp0Var.c, fp0Var.d);
                            lp2Var.p(false);
                            fp0Var2 = fp0Var6;
                        }
                        be8 be8Var6 = ((h62) y05Var2.getValue()).a;
                        y05Var2.setValue(new h62(new be8(u72Var2, eb7Var2, fp0Var2, qw6Var2, (LinkedHashMap) null, 96)).a(h62Var));
                        lp2Var.p(false);
                    } else {
                        lp2Var.W(-503833306);
                        lp2Var.p(false);
                    }
                } else if (rh5Var3.getValue() != r12Var2) {
                    lp2Var.W(-504838512);
                    u72Var = ((h62) y05Var2.getValue()).a.a;
                    if (u72Var != null) {
                        u72Var2 = new u72(1.0f, u72Var.b);
                    } else {
                        u72Var2 = null;
                    }
                    qw6Var = ((h62) y05Var2.getValue()).a.d;
                    if (qw6Var != null) {
                        qw6Var2 = new qw6(1.0f, qw6Var.b, qw6Var.c);
                    } else {
                        qw6Var2 = null;
                    }
                    eb7Var = ((h62) y05Var2.getValue()).a.b;
                    if (eb7Var == null) {
                        lp2Var.W(-504119809);
                        z2 = false;
                        lp2Var.p(false);
                        eb7Var2 = null;
                    } else {
                        lp2Var.W(-708998590);
                        objK5 = lp2Var.K();
                        if (objK5 == obj2) {
                            objK5 = ti.t0;
                            lp2Var.g0(objK5);
                        }
                        eb7 eb7Var6 = new eb7((gn2) objK5, eb7Var.b);
                        z2 = false;
                        lp2Var.p(false);
                        eb7Var2 = eb7Var6;
                    }
                    fp0Var = ((h62) y05Var2.getValue()).a.c;
                    if (fp0Var == null) {
                        lp2Var.W(-504024174);
                        lp2Var.p(z2);
                        fp0Var2 = null;
                    } else {
                        lp2Var.W(-708995505);
                        objK6 = lp2Var.K();
                        if (objK6 == obj2) {
                            objK6 = ti.u0;
                            lp2Var.g0(objK6);
                        }
                        fp0 fp0Var7 = new fp0(fp0Var.a, (gn2) objK6, fp0Var.c, fp0Var.d);
                        lp2Var.p(false);
                        fp0Var2 = fp0Var7;
                    }
                    be8 be8Var7 = ((h62) y05Var2.getValue()).a;
                    y05Var2.setValue(new h62(new be8(u72Var2, eb7Var2, fp0Var2, qw6Var2, (LinkedHashMap) null, 96)).a(h62Var));
                    lp2Var.p(false);
                } else {
                    lp2Var.W(-503833306);
                    lp2Var.p(false);
                }
                h62Var2 = (h62) y05Var2.getValue();
                objP = z51.P(rn2Var, lp2Var);
                objK7 = rn2Var.K(ce8Var2.c(), rh5Var3.getValue());
                zF4 = lp2Var.f(ce8Var2) | lp2Var.f(objP);
                objK8 = lp2Var.K();
                if (zF4) {
                    objK8 = new r0(ce8Var2, objP, null, (byte) 5);
                    lp2Var.g0(objK8);
                } else {
                    objK8 = new r0(ce8Var2, objP, null, (byte) 5);
                    lp2Var.g0(objK8);
                }
                rn2Var2 = (rn2) objK8;
                objK9 = lp2Var.K();
                if (objK9 == obj2) {
                    objK9 = z51.H(objK7);
                    lp2Var.g0(objK9);
                }
                y05Var3 = (y05) objK9;
                zH = lp2Var.h(rn2Var2);
                objK10 = lp2Var.K();
                if (zH) {
                    objK10 = new sd7(rn2Var2, y05Var3, null, (byte) 0);
                    lp2Var.g0(objK10);
                } else {
                    objK10 = new sd7(rn2Var2, y05Var3, null, (byte) 0);
                    lp2Var.g0(objK10);
                }
                u70.h((rn2) objK10, lp2Var, dn8.a);
                if (ce8Var2.c() != r12Var) {
                    lp2Var.W(-272022668);
                    if (i6 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objK11 = lp2Var.K();
                    if (z3) {
                        objK11 = new fk(ce8Var2);
                        lp2Var.g0(objK11);
                    } else {
                        objK11 = new fk(ce8Var2);
                        lp2Var.g0(objK11);
                    }
                    fkVar = (fk) objK11;
                    x77Var = fkVar.c;
                    ug8Var = ys0.p0;
                    objK12 = lp2Var.K();
                    if (objK12 == obj2) {
                        objK12 = nx.g0;
                        lp2Var.g0(objK12);
                    }
                    dn2Var = (dn2) objK12;
                    lp2Var.W(-1491182875);
                    lp2Var.p(false);
                    lp2Var.W(-1491180092);
                    lp2Var.p(false);
                    lp2Var.W(-31257052);
                    lp2Var.p(false);
                    if (ce8Var2.e.getValue() != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    x77Var.c(z4);
                    zH2 = lp2Var.h(x77Var);
                    objK13 = lp2Var.K();
                    if (zH2) {
                        objK13 = new y12(x77Var, (byte) 1);
                        lp2Var.g0(objK13);
                    } else {
                        objK13 = new y12(x77Var, (byte) 1);
                        lp2Var.g0(objK13);
                    }
                    b22.a(ce8Var2, (dn2) objK13, lp2Var, 0);
                    be8Var = g22Var2.a;
                    be8Var2 = h62Var2.a;
                    fp0Var3 = be8Var2.c;
                    zA = tk8.a(x77Var.e, dw0.f);
                    eb7Var3 = be8Var.b;
                    fp0Var4 = be8Var.c;
                    if (eb7Var3 == null) {
                        z5 = zA;
                        if (be8Var2.b == null) {
                            if (hf3.a(x77Var.i, 0L)) {
                                z6 = false;
                            }
                            if (fp0Var4 == null) {
                                be8Var3 = be8Var2;
                                z7 = true;
                            } else {
                                be8Var3 = be8Var2;
                                z7 = true;
                            }
                            if (z6) {
                                lp2Var.W(1018653691);
                                objK23 = lp2Var.K();
                                if (objK23 == obj2) {
                                    objK23 = "Built-in slide";
                                    lp2Var.g0("Built-in slide");
                                }
                                String str3 = (String) objK23;
                                obj = obj2;
                                sd8 sd8VarG14 = rq7.g(ce8Var2, ug8Var, str3, lp2Var, 384, 0);
                                lp2Var.p(false);
                                sd8Var = sd8VarG14;
                            } else {
                                obj = obj2;
                                lp2Var.W(1018759494);
                                lp2Var.p(false);
                                sd8Var = null;
                            }
                            if (z7) {
                                lp2Var.W(1018851285);
                                ug8 ug8Var8 = ys0.q0;
                                objK22 = lp2Var.K();
                                if (objK22 == obj) {
                                    objK22 = "Built-in shrink/expand";
                                    lp2Var.g0("Built-in shrink/expand");
                                }
                                sd8 sd8VarG15 = rq7.g(ce8Var2, ug8Var8, (String) objK22, lp2Var, 384, 0);
                                lp2Var.p(false);
                                sd8Var2 = sd8VarG15;
                            } else {
                                lp2Var.W(1018962109);
                                lp2Var.p(false);
                                sd8Var2 = null;
                            }
                            if (z7) {
                                lp2Var.W(1019035735);
                                objK21 = lp2Var.K();
                                if (objK21 == obj) {
                                    objK21 = "Built-in InterruptionHandlingOffset";
                                    lp2Var.g0("Built-in InterruptionHandlingOffset");
                                }
                                sd8 sd8VarG16 = rq7.g(ce8Var2, ug8Var, (String) objK21, lp2Var, 384, 0);
                                lp2Var.p(false);
                                sd8Var3 = sd8VarG16;
                            } else {
                                lp2Var.W(1019206141);
                                lp2Var.p(false);
                                sd8Var3 = null;
                            }
                            if (fp0Var4 == 0) {
                            }
                            wk6Var = nw0.e;
                            hx4Var = hx4.X;
                            if (z5) {
                                lp2Var.W(1019733235);
                                ug8 ug8Var9 = new ug8(ti.i0, new wi(wk6Var, (byte) 2));
                                objK20 = lp2Var.K();
                                if (objK20 == obj) {
                                    objK20 = "Built-in veil";
                                    lp2Var.g0("Built-in veil");
                                }
                                qu8Var = new qu8(ce8Var2, rq7.g(ce8Var2, ug8Var9, (String) objK20, lp2Var, 384, 0), g22Var2, h62Var2, x77Var);
                                x77Var2 = x77Var;
                                lp2Var.p(false);
                            } else {
                                x77Var2 = x77Var;
                                lp2Var.W(1020031362);
                                lp2Var.p(false);
                                qu8Var = hx4Var;
                            }
                            ug8Var2 = ys0.j0;
                            if (be8Var.a == null) {
                                be8Var4 = be8Var;
                            } else {
                                be8Var4 = be8Var;
                            }
                            if (be8Var4.d != null) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            if (z9) {
                                lp2Var.W(-1511865571);
                                objK19 = lp2Var.K();
                                if (objK19 == obj) {
                                    objK19 = "Built-in alpha";
                                    lp2Var.g0("Built-in alpha");
                                }
                                x77 x77Var13 = x77Var2;
                                ug8Var3 = ug8Var2;
                                x77Var3 = x77Var13;
                                sd8 sd8VarG17 = rq7.g(ce8Var2, ug8Var3, (String) objK19, lp2Var, 384, 0);
                                lp2Var.p(false);
                                sd8Var4 = sd8VarG17;
                            } else {
                                x77Var3 = x77Var2;
                                ug8Var3 = ug8Var2;
                                lp2Var.W(-1511696126);
                                lp2Var.p(false);
                                sd8Var4 = null;
                            }
                            if (z10 != 0) {
                                lp2Var.W(-1511628483);
                                objK18 = lp2Var.K();
                                if (objK18 == obj) {
                                    objK18 = "Built-in scale";
                                    lp2Var.g0("Built-in scale");
                                }
                                sd8 sd8VarG18 = rq7.g(ce8Var2, ug8Var3, (String) objK18, lp2Var, 384, 0);
                                z11 = false;
                                lp2Var.p(false);
                                sd8Var5 = sd8VarG18;
                            } else {
                                z11 = false;
                                lp2Var.W(-1511459038);
                                lp2Var.p(false);
                                sd8Var5 = null;
                            }
                            if (z10) {
                                lp2Var.W(-1511381382);
                                sd8VarG = rq7.g(ce8Var2, b22.a, "TransformOriginInterruptionHandling", lp2Var, 384, 0);
                                lp2Var.p(z11);
                            } else {
                                lp2Var.W(-1511209054);
                                lp2Var.p(z11);
                                sd8VarG = null;
                            }
                            zH3 = lp2Var.h(sd8Var4) | lp2Var.f(r26) | lp2Var.f(r27) | lp2Var.h(x77Var3) | lp2Var.h(sd8Var5) | lp2Var.f(ce8Var2) | lp2Var.h(sd8VarG);
                            objK14 = lp2Var.K();
                            if (zH3) {
                                x77 x77Var14 = x77Var3;
                                objK14 = new t12(sd8Var4, x77Var14, sd8Var5, ce8Var2, r26, r27, sd8VarG);
                                x77Var4 = x77Var14;
                                g22Var3 = r26;
                                h62Var3 = r27;
                                lp2Var.g0(objK14);
                            } else {
                                x77 x77Var15 = x77Var3;
                                objK14 = new t12(sd8Var4, x77Var15, sd8Var5, ce8Var2, r26, r27, sd8VarG);
                                x77Var4 = x77Var15;
                                g22Var3 = r26;
                                h62Var3 = r27;
                                lp2Var.g0(objK14);
                            }
                            t12 t12Var4 = (t12) objK14;
                            r06 r06Var4 = bh1.a;
                            zH4 = lp2Var.h(x77Var4);
                            objK15 = lp2Var.K();
                            if (zH4) {
                                objK15 = new y12(x77Var4, (byte) 0);
                                lp2Var.g0(objK15);
                            } else {
                                objK15 = new y12(x77Var4, (byte) 0);
                                lp2Var.g0(objK15);
                            }
                            kx4 kx4VarY10 = new ox4((dn2) objK15).y(hx4Var);
                            zG = lp2Var.g(z8) | lp2Var.f(dn2Var);
                            objK16 = lp2Var.K();
                            if (zG) {
                                objK16 = new z12(dn2Var, z8);
                                lp2Var.g0(objK16);
                            } else {
                                objK16 = new z12(dn2Var, z8);
                                lp2Var.g0(objK16);
                            }
                            kx4 kx4VarY11 = kx4VarY10.y(jm4.I(hx4Var, (gn2) objK16)).y(new s12(ce8Var2, sd8Var2, sd8Var3, sd8Var, g22Var3, h62Var3, x77Var4, dn2Var, t12Var4)).y(qu8Var);
                            lp2Var.W(-1255657861);
                            lp2Var.p(false);
                            kx4Var2 = kx4Var;
                            kx4 kx4VarY12 = kx4Var2.y(kx4VarY11.y(hx4Var));
                            objK17 = lp2Var.K();
                            if (objK17 == obj) {
                                fkVar2 = fkVar;
                                objK17 = new mj(fkVar2);
                                lp2Var.g0(objK17);
                            } else {
                                fkVar2 = fkVar;
                            }
                            mj mjVar4 = (mj) objK17;
                            int iHashCode4 = Long.hashCode(lp2Var.T);
                            kl5 kl5VarL4 = lp2Var.l();
                            kx4 kx4VarQ4 = w45.Q(lp2Var, kx4VarY12);
                            uz0.j.getClass();
                            lp2Var.Z();
                            if (lp2Var.S) {
                                lp2Var.k();
                            } else {
                                lp2Var.j0();
                            }
                            pn7.m(pz2.B0, lp2Var, mjVar4);
                            pn7.m(pz2.A0, lp2Var, kl5VarL4);
                            pn7.j(lp2Var, Integer.valueOf(iHashCode4));
                            pn7.l(lp2Var);
                            pn7.m(pz2.z0, lp2Var, kx4VarQ4);
                            zy0Var2 = zy0Var;
                            zy0Var2.x(fkVar2, lp2Var, Integer.valueOf((i5 >> 21) & 112));
                            lp2Var.p(true);
                            z12 = false;
                            lp2Var.p(false);
                        } else {
                            be8Var3 = be8Var2;
                        }
                    } else {
                        be8Var3 = be8Var2;
                        z5 = zA;
                    }
                    be8Var3 = be8Var2;
                    z6 = true;
                    if (fp0Var4 == null) {
                        be8Var3 = be8Var2;
                        z7 = true;
                    } else {
                        be8Var3 = be8Var2;
                        z7 = true;
                    }
                    if (z6) {
                        lp2Var.W(1018653691);
                        objK23 = lp2Var.K();
                        if (objK23 == obj2) {
                            objK23 = "Built-in slide";
                            lp2Var.g0("Built-in slide");
                        }
                        String str4 = (String) objK23;
                        obj = obj2;
                        sd8 sd8VarG19 = rq7.g(ce8Var2, ug8Var, str4, lp2Var, 384, 0);
                        lp2Var.p(false);
                        sd8Var = sd8VarG19;
                    } else {
                        obj = obj2;
                        lp2Var.W(1018759494);
                        lp2Var.p(false);
                        sd8Var = null;
                    }
                    if (z7) {
                        lp2Var.W(1018851285);
                        ug8 ug8Var10 = ys0.q0;
                        objK22 = lp2Var.K();
                        if (objK22 == obj) {
                            objK22 = "Built-in shrink/expand";
                            lp2Var.g0("Built-in shrink/expand");
                        }
                        sd8 sd8VarG110 = rq7.g(ce8Var2, ug8Var10, (String) objK22, lp2Var, 384, 0);
                        lp2Var.p(false);
                        sd8Var2 = sd8VarG110;
                    } else {
                        lp2Var.W(1018962109);
                        lp2Var.p(false);
                        sd8Var2 = null;
                    }
                    if (z7) {
                        lp2Var.W(1019035735);
                        objK21 = lp2Var.K();
                        if (objK21 == obj) {
                            objK21 = "Built-in InterruptionHandlingOffset";
                            lp2Var.g0("Built-in InterruptionHandlingOffset");
                        }
                        sd8 sd8VarG111 = rq7.g(ce8Var2, ug8Var, (String) objK21, lp2Var, 384, 0);
                        lp2Var.p(false);
                        sd8Var3 = sd8VarG111;
                    } else {
                        lp2Var.W(1019206141);
                        lp2Var.p(false);
                        sd8Var3 = null;
                    }
                    if (fp0Var4 == 0) {
                    }
                    wk6Var = nw0.e;
                    hx4Var = hx4.X;
                    if (z5) {
                        lp2Var.W(1019733235);
                        ug8 ug8Var11 = new ug8(ti.i0, new wi(wk6Var, (byte) 2));
                        objK20 = lp2Var.K();
                        if (objK20 == obj) {
                            objK20 = "Built-in veil";
                            lp2Var.g0("Built-in veil");
                        }
                        qu8Var = new qu8(ce8Var2, rq7.g(ce8Var2, ug8Var11, (String) objK20, lp2Var, 384, 0), g22Var2, h62Var2, x77Var);
                        x77Var2 = x77Var;
                        lp2Var.p(false);
                    } else {
                        x77Var2 = x77Var;
                        lp2Var.W(1020031362);
                        lp2Var.p(false);
                        qu8Var = hx4Var;
                    }
                    ug8Var2 = ys0.j0;
                    if (be8Var.a == null) {
                        be8Var4 = be8Var;
                    } else {
                        be8Var4 = be8Var;
                    }
                    if (be8Var4.d != null) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (z9) {
                        lp2Var.W(-1511865571);
                        objK19 = lp2Var.K();
                        if (objK19 == obj) {
                            objK19 = "Built-in alpha";
                            lp2Var.g0("Built-in alpha");
                        }
                        x77 x77Var16 = x77Var2;
                        ug8Var3 = ug8Var2;
                        x77Var3 = x77Var16;
                        sd8 sd8VarG112 = rq7.g(ce8Var2, ug8Var3, (String) objK19, lp2Var, 384, 0);
                        lp2Var.p(false);
                        sd8Var4 = sd8VarG112;
                    } else {
                        x77Var3 = x77Var2;
                        ug8Var3 = ug8Var2;
                        lp2Var.W(-1511696126);
                        lp2Var.p(false);
                        sd8Var4 = null;
                    }
                    if (z10 != 0) {
                        lp2Var.W(-1511628483);
                        objK18 = lp2Var.K();
                        if (objK18 == obj) {
                            objK18 = "Built-in scale";
                            lp2Var.g0("Built-in scale");
                        }
                        sd8 sd8VarG113 = rq7.g(ce8Var2, ug8Var3, (String) objK18, lp2Var, 384, 0);
                        z11 = false;
                        lp2Var.p(false);
                        sd8Var5 = sd8VarG113;
                    } else {
                        z11 = false;
                        lp2Var.W(-1511459038);
                        lp2Var.p(false);
                        sd8Var5 = null;
                    }
                    if (z10) {
                        lp2Var.W(-1511381382);
                        sd8VarG = rq7.g(ce8Var2, b22.a, "TransformOriginInterruptionHandling", lp2Var, 384, 0);
                        lp2Var.p(z11);
                    } else {
                        lp2Var.W(-1511209054);
                        lp2Var.p(z11);
                        sd8VarG = null;
                    }
                    zH3 = lp2Var.h(sd8Var4) | lp2Var.f(r26) | lp2Var.f(r27) | lp2Var.h(x77Var3) | lp2Var.h(sd8Var5) | lp2Var.f(ce8Var2) | lp2Var.h(sd8VarG);
                    objK14 = lp2Var.K();
                    if (zH3) {
                        x77 x77Var17 = x77Var3;
                        objK14 = new t12(sd8Var4, x77Var17, sd8Var5, ce8Var2, r26, r27, sd8VarG);
                        x77Var4 = x77Var17;
                        g22Var3 = r26;
                        h62Var3 = r27;
                        lp2Var.g0(objK14);
                    } else {
                        x77 x77Var18 = x77Var3;
                        objK14 = new t12(sd8Var4, x77Var18, sd8Var5, ce8Var2, r26, r27, sd8VarG);
                        x77Var4 = x77Var18;
                        g22Var3 = r26;
                        h62Var3 = r27;
                        lp2Var.g0(objK14);
                    }
                    t12 t12Var5 = (t12) objK14;
                    r06 r06Var5 = bh1.a;
                    zH4 = lp2Var.h(x77Var4);
                    objK15 = lp2Var.K();
                    if (zH4) {
                        objK15 = new y12(x77Var4, (byte) 0);
                        lp2Var.g0(objK15);
                    } else {
                        objK15 = new y12(x77Var4, (byte) 0);
                        lp2Var.g0(objK15);
                    }
                    kx4 kx4VarY13 = new ox4((dn2) objK15).y(hx4Var);
                    zG = lp2Var.g(z8) | lp2Var.f(dn2Var);
                    objK16 = lp2Var.K();
                    if (zG) {
                        objK16 = new z12(dn2Var, z8);
                        lp2Var.g0(objK16);
                    } else {
                        objK16 = new z12(dn2Var, z8);
                        lp2Var.g0(objK16);
                    }
                    kx4 kx4VarY14 = kx4VarY13.y(jm4.I(hx4Var, (gn2) objK16)).y(new s12(ce8Var2, sd8Var2, sd8Var3, sd8Var, g22Var3, h62Var3, x77Var4, dn2Var, t12Var5)).y(qu8Var);
                    lp2Var.W(-1255657861);
                    lp2Var.p(false);
                    kx4Var2 = kx4Var;
                    kx4 kx4VarY15 = kx4Var2.y(kx4VarY14.y(hx4Var));
                    objK17 = lp2Var.K();
                    if (objK17 == obj) {
                        fkVar2 = fkVar;
                        objK17 = new mj(fkVar2);
                        lp2Var.g0(objK17);
                    } else {
                        fkVar2 = fkVar;
                    }
                    mj mjVar5 = (mj) objK17;
                    int iHashCode5 = Long.hashCode(lp2Var.T);
                    kl5 kl5VarL5 = lp2Var.l();
                    kx4 kx4VarQ5 = w45.Q(lp2Var, kx4VarY15);
                    uz0.j.getClass();
                    lp2Var.Z();
                    if (lp2Var.S) {
                        lp2Var.k();
                    } else {
                        lp2Var.j0();
                    }
                    pn7.m(pz2.B0, lp2Var, mjVar5);
                    pn7.m(pz2.A0, lp2Var, kl5VarL5);
                    pn7.j(lp2Var, Integer.valueOf(iHashCode5));
                    pn7.l(lp2Var);
                    pn7.m(pz2.z0, lp2Var, kx4VarQ5);
                    zy0Var2 = zy0Var;
                    zy0Var2.x(fkVar2, lp2Var, Integer.valueOf((i5 >> 21) & 112));
                    lp2Var.p(true);
                    z12 = false;
                    lp2Var.p(false);
                } else {
                    lp2Var.W(-272022668);
                    if (i6 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objK11 = lp2Var.K();
                    if (z3) {
                        objK11 = new fk(ce8Var2);
                        lp2Var.g0(objK11);
                    } else {
                        objK11 = new fk(ce8Var2);
                        lp2Var.g0(objK11);
                    }
                    fkVar = (fk) objK11;
                    x77Var = fkVar.c;
                    ug8Var = ys0.p0;
                    objK12 = lp2Var.K();
                    if (objK12 == obj2) {
                        objK12 = nx.g0;
                        lp2Var.g0(objK12);
                    }
                    dn2Var = (dn2) objK12;
                    lp2Var.W(-1491182875);
                    lp2Var.p(false);
                    lp2Var.W(-1491180092);
                    lp2Var.p(false);
                    lp2Var.W(-31257052);
                    lp2Var.p(false);
                    if (ce8Var2.e.getValue() != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    x77Var.c(z4);
                    zH2 = lp2Var.h(x77Var);
                    objK13 = lp2Var.K();
                    if (zH2) {
                        objK13 = new y12(x77Var, (byte) 1);
                        lp2Var.g0(objK13);
                    } else {
                        objK13 = new y12(x77Var, (byte) 1);
                        lp2Var.g0(objK13);
                    }
                    b22.a(ce8Var2, (dn2) objK13, lp2Var, 0);
                    be8Var = g22Var2.a;
                    be8Var2 = h62Var2.a;
                    fp0Var3 = be8Var2.c;
                    zA = tk8.a(x77Var.e, dw0.f);
                    eb7Var3 = be8Var.b;
                    fp0Var4 = be8Var.c;
                    if (eb7Var3 == null) {
                        z5 = zA;
                        if (be8Var2.b == null) {
                            if (hf3.a(x77Var.i, 0L)) {
                                z6 = false;
                            }
                            if (fp0Var4 == null) {
                                be8Var3 = be8Var2;
                                z7 = true;
                            } else {
                                be8Var3 = be8Var2;
                                z7 = true;
                            }
                            if (z6) {
                                lp2Var.W(1018653691);
                                objK23 = lp2Var.K();
                                if (objK23 == obj2) {
                                    objK23 = "Built-in slide";
                                    lp2Var.g0("Built-in slide");
                                }
                                String str5 = (String) objK23;
                                obj = obj2;
                                sd8 sd8VarG114 = rq7.g(ce8Var2, ug8Var, str5, lp2Var, 384, 0);
                                lp2Var.p(false);
                                sd8Var = sd8VarG114;
                            } else {
                                obj = obj2;
                                lp2Var.W(1018759494);
                                lp2Var.p(false);
                                sd8Var = null;
                            }
                            if (z7) {
                                lp2Var.W(1018851285);
                                ug8 ug8Var12 = ys0.q0;
                                objK22 = lp2Var.K();
                                if (objK22 == obj) {
                                    objK22 = "Built-in shrink/expand";
                                    lp2Var.g0("Built-in shrink/expand");
                                }
                                sd8 sd8VarG115 = rq7.g(ce8Var2, ug8Var12, (String) objK22, lp2Var, 384, 0);
                                lp2Var.p(false);
                                sd8Var2 = sd8VarG115;
                            } else {
                                lp2Var.W(1018962109);
                                lp2Var.p(false);
                                sd8Var2 = null;
                            }
                            if (z7) {
                                lp2Var.W(1019035735);
                                objK21 = lp2Var.K();
                                if (objK21 == obj) {
                                    objK21 = "Built-in InterruptionHandlingOffset";
                                    lp2Var.g0("Built-in InterruptionHandlingOffset");
                                }
                                sd8 sd8VarG116 = rq7.g(ce8Var2, ug8Var, (String) objK21, lp2Var, 384, 0);
                                lp2Var.p(false);
                                sd8Var3 = sd8VarG116;
                            } else {
                                lp2Var.W(1019206141);
                                lp2Var.p(false);
                                sd8Var3 = null;
                            }
                            if (fp0Var4 == 0) {
                            }
                            wk6Var = nw0.e;
                            hx4Var = hx4.X;
                            if (z5) {
                                lp2Var.W(1019733235);
                                ug8 ug8Var13 = new ug8(ti.i0, new wi(wk6Var, (byte) 2));
                                objK20 = lp2Var.K();
                                if (objK20 == obj) {
                                    objK20 = "Built-in veil";
                                    lp2Var.g0("Built-in veil");
                                }
                                qu8Var = new qu8(ce8Var2, rq7.g(ce8Var2, ug8Var13, (String) objK20, lp2Var, 384, 0), g22Var2, h62Var2, x77Var);
                                x77Var2 = x77Var;
                                lp2Var.p(false);
                            } else {
                                x77Var2 = x77Var;
                                lp2Var.W(1020031362);
                                lp2Var.p(false);
                                qu8Var = hx4Var;
                            }
                            ug8Var2 = ys0.j0;
                            if (be8Var.a == null) {
                                be8Var4 = be8Var;
                            } else {
                                be8Var4 = be8Var;
                            }
                            if (be8Var4.d != null) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            if (z9) {
                                lp2Var.W(-1511865571);
                                objK19 = lp2Var.K();
                                if (objK19 == obj) {
                                    objK19 = "Built-in alpha";
                                    lp2Var.g0("Built-in alpha");
                                }
                                x77 x77Var19 = x77Var2;
                                ug8Var3 = ug8Var2;
                                x77Var3 = x77Var19;
                                sd8 sd8VarG117 = rq7.g(ce8Var2, ug8Var3, (String) objK19, lp2Var, 384, 0);
                                lp2Var.p(false);
                                sd8Var4 = sd8VarG117;
                            } else {
                                x77Var3 = x77Var2;
                                ug8Var3 = ug8Var2;
                                lp2Var.W(-1511696126);
                                lp2Var.p(false);
                                sd8Var4 = null;
                            }
                            if (z10 != 0) {
                                lp2Var.W(-1511628483);
                                objK18 = lp2Var.K();
                                if (objK18 == obj) {
                                    objK18 = "Built-in scale";
                                    lp2Var.g0("Built-in scale");
                                }
                                sd8 sd8VarG118 = rq7.g(ce8Var2, ug8Var3, (String) objK18, lp2Var, 384, 0);
                                z11 = false;
                                lp2Var.p(false);
                                sd8Var5 = sd8VarG118;
                            } else {
                                z11 = false;
                                lp2Var.W(-1511459038);
                                lp2Var.p(false);
                                sd8Var5 = null;
                            }
                            if (z10) {
                                lp2Var.W(-1511381382);
                                sd8VarG = rq7.g(ce8Var2, b22.a, "TransformOriginInterruptionHandling", lp2Var, 384, 0);
                                lp2Var.p(z11);
                            } else {
                                lp2Var.W(-1511209054);
                                lp2Var.p(z11);
                                sd8VarG = null;
                            }
                            zH3 = lp2Var.h(sd8Var4) | lp2Var.f(r26) | lp2Var.f(r27) | lp2Var.h(x77Var3) | lp2Var.h(sd8Var5) | lp2Var.f(ce8Var2) | lp2Var.h(sd8VarG);
                            objK14 = lp2Var.K();
                            if (zH3) {
                                x77 x77Var110 = x77Var3;
                                objK14 = new t12(sd8Var4, x77Var110, sd8Var5, ce8Var2, r26, r27, sd8VarG);
                                x77Var4 = x77Var110;
                                g22Var3 = r26;
                                h62Var3 = r27;
                                lp2Var.g0(objK14);
                            } else {
                                x77 x77Var111 = x77Var3;
                                objK14 = new t12(sd8Var4, x77Var111, sd8Var5, ce8Var2, r26, r27, sd8VarG);
                                x77Var4 = x77Var111;
                                g22Var3 = r26;
                                h62Var3 = r27;
                                lp2Var.g0(objK14);
                            }
                            t12 t12Var6 = (t12) objK14;
                            r06 r06Var6 = bh1.a;
                            zH4 = lp2Var.h(x77Var4);
                            objK15 = lp2Var.K();
                            if (zH4) {
                                objK15 = new y12(x77Var4, (byte) 0);
                                lp2Var.g0(objK15);
                            } else {
                                objK15 = new y12(x77Var4, (byte) 0);
                                lp2Var.g0(objK15);
                            }
                            kx4 kx4VarY16 = new ox4((dn2) objK15).y(hx4Var);
                            zG = lp2Var.g(z8) | lp2Var.f(dn2Var);
                            objK16 = lp2Var.K();
                            if (zG) {
                                objK16 = new z12(dn2Var, z8);
                                lp2Var.g0(objK16);
                            } else {
                                objK16 = new z12(dn2Var, z8);
                                lp2Var.g0(objK16);
                            }
                            kx4 kx4VarY17 = kx4VarY16.y(jm4.I(hx4Var, (gn2) objK16)).y(new s12(ce8Var2, sd8Var2, sd8Var3, sd8Var, g22Var3, h62Var3, x77Var4, dn2Var, t12Var6)).y(qu8Var);
                            lp2Var.W(-1255657861);
                            lp2Var.p(false);
                            kx4Var2 = kx4Var;
                            kx4 kx4VarY18 = kx4Var2.y(kx4VarY17.y(hx4Var));
                            objK17 = lp2Var.K();
                            if (objK17 == obj) {
                                fkVar2 = fkVar;
                                objK17 = new mj(fkVar2);
                                lp2Var.g0(objK17);
                            } else {
                                fkVar2 = fkVar;
                            }
                            mj mjVar6 = (mj) objK17;
                            int iHashCode6 = Long.hashCode(lp2Var.T);
                            kl5 kl5VarL6 = lp2Var.l();
                            kx4 kx4VarQ6 = w45.Q(lp2Var, kx4VarY18);
                            uz0.j.getClass();
                            lp2Var.Z();
                            if (lp2Var.S) {
                                lp2Var.k();
                            } else {
                                lp2Var.j0();
                            }
                            pn7.m(pz2.B0, lp2Var, mjVar6);
                            pn7.m(pz2.A0, lp2Var, kl5VarL6);
                            pn7.j(lp2Var, Integer.valueOf(iHashCode6));
                            pn7.l(lp2Var);
                            pn7.m(pz2.z0, lp2Var, kx4VarQ6);
                            zy0Var2 = zy0Var;
                            zy0Var2.x(fkVar2, lp2Var, Integer.valueOf((i5 >> 21) & 112));
                            lp2Var.p(true);
                            z12 = false;
                            lp2Var.p(false);
                        } else {
                            be8Var3 = be8Var2;
                        }
                    } else {
                        be8Var3 = be8Var2;
                        z5 = zA;
                    }
                    be8Var3 = be8Var2;
                    z6 = true;
                    if (fp0Var4 == null) {
                        be8Var3 = be8Var2;
                        z7 = true;
                    } else {
                        be8Var3 = be8Var2;
                        z7 = true;
                    }
                    if (z6) {
                        lp2Var.W(1018653691);
                        objK23 = lp2Var.K();
                        if (objK23 == obj2) {
                            objK23 = "Built-in slide";
                            lp2Var.g0("Built-in slide");
                        }
                        String str6 = (String) objK23;
                        obj = obj2;
                        sd8 sd8VarG119 = rq7.g(ce8Var2, ug8Var, str6, lp2Var, 384, 0);
                        lp2Var.p(false);
                        sd8Var = sd8VarG119;
                    } else {
                        obj = obj2;
                        lp2Var.W(1018759494);
                        lp2Var.p(false);
                        sd8Var = null;
                    }
                    if (z7) {
                        lp2Var.W(1018851285);
                        ug8 ug8Var14 = ys0.q0;
                        objK22 = lp2Var.K();
                        if (objK22 == obj) {
                            objK22 = "Built-in shrink/expand";
                            lp2Var.g0("Built-in shrink/expand");
                        }
                        sd8 sd8VarG1110 = rq7.g(ce8Var2, ug8Var14, (String) objK22, lp2Var, 384, 0);
                        lp2Var.p(false);
                        sd8Var2 = sd8VarG1110;
                    } else {
                        lp2Var.W(1018962109);
                        lp2Var.p(false);
                        sd8Var2 = null;
                    }
                    if (z7) {
                        lp2Var.W(1019035735);
                        objK21 = lp2Var.K();
                        if (objK21 == obj) {
                            objK21 = "Built-in InterruptionHandlingOffset";
                            lp2Var.g0("Built-in InterruptionHandlingOffset");
                        }
                        sd8 sd8VarG1111 = rq7.g(ce8Var2, ug8Var, (String) objK21, lp2Var, 384, 0);
                        lp2Var.p(false);
                        sd8Var3 = sd8VarG1111;
                    } else {
                        lp2Var.W(1019206141);
                        lp2Var.p(false);
                        sd8Var3 = null;
                    }
                    if (fp0Var4 == 0) {
                    }
                    wk6Var = nw0.e;
                    hx4Var = hx4.X;
                    if (z5) {
                        lp2Var.W(1019733235);
                        ug8 ug8Var15 = new ug8(ti.i0, new wi(wk6Var, (byte) 2));
                        objK20 = lp2Var.K();
                        if (objK20 == obj) {
                            objK20 = "Built-in veil";
                            lp2Var.g0("Built-in veil");
                        }
                        qu8Var = new qu8(ce8Var2, rq7.g(ce8Var2, ug8Var15, (String) objK20, lp2Var, 384, 0), g22Var2, h62Var2, x77Var);
                        x77Var2 = x77Var;
                        lp2Var.p(false);
                    } else {
                        x77Var2 = x77Var;
                        lp2Var.W(1020031362);
                        lp2Var.p(false);
                        qu8Var = hx4Var;
                    }
                    ug8Var2 = ys0.j0;
                    if (be8Var.a == null) {
                        be8Var4 = be8Var;
                    } else {
                        be8Var4 = be8Var;
                    }
                    if (be8Var4.d != null) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (z9) {
                        lp2Var.W(-1511865571);
                        objK19 = lp2Var.K();
                        if (objK19 == obj) {
                            objK19 = "Built-in alpha";
                            lp2Var.g0("Built-in alpha");
                        }
                        x77 x77Var112 = x77Var2;
                        ug8Var3 = ug8Var2;
                        x77Var3 = x77Var112;
                        sd8 sd8VarG1112 = rq7.g(ce8Var2, ug8Var3, (String) objK19, lp2Var, 384, 0);
                        lp2Var.p(false);
                        sd8Var4 = sd8VarG1112;
                    } else {
                        x77Var3 = x77Var2;
                        ug8Var3 = ug8Var2;
                        lp2Var.W(-1511696126);
                        lp2Var.p(false);
                        sd8Var4 = null;
                    }
                    if (z10 != 0) {
                        lp2Var.W(-1511628483);
                        objK18 = lp2Var.K();
                        if (objK18 == obj) {
                            objK18 = "Built-in scale";
                            lp2Var.g0("Built-in scale");
                        }
                        sd8 sd8VarG1113 = rq7.g(ce8Var2, ug8Var3, (String) objK18, lp2Var, 384, 0);
                        z11 = false;
                        lp2Var.p(false);
                        sd8Var5 = sd8VarG1113;
                    } else {
                        z11 = false;
                        lp2Var.W(-1511459038);
                        lp2Var.p(false);
                        sd8Var5 = null;
                    }
                    if (z10) {
                        lp2Var.W(-1511381382);
                        sd8VarG = rq7.g(ce8Var2, b22.a, "TransformOriginInterruptionHandling", lp2Var, 384, 0);
                        lp2Var.p(z11);
                    } else {
                        lp2Var.W(-1511209054);
                        lp2Var.p(z11);
                        sd8VarG = null;
                    }
                    zH3 = lp2Var.h(sd8Var4) | lp2Var.f(r26) | lp2Var.f(r27) | lp2Var.h(x77Var3) | lp2Var.h(sd8Var5) | lp2Var.f(ce8Var2) | lp2Var.h(sd8VarG);
                    objK14 = lp2Var.K();
                    if (zH3) {
                        x77 x77Var113 = x77Var3;
                        objK14 = new t12(sd8Var4, x77Var113, sd8Var5, ce8Var2, r26, r27, sd8VarG);
                        x77Var4 = x77Var113;
                        g22Var3 = r26;
                        h62Var3 = r27;
                        lp2Var.g0(objK14);
                    } else {
                        x77 x77Var114 = x77Var3;
                        objK14 = new t12(sd8Var4, x77Var114, sd8Var5, ce8Var2, r26, r27, sd8VarG);
                        x77Var4 = x77Var114;
                        g22Var3 = r26;
                        h62Var3 = r27;
                        lp2Var.g0(objK14);
                    }
                    t12 t12Var7 = (t12) objK14;
                    r06 r06Var7 = bh1.a;
                    zH4 = lp2Var.h(x77Var4);
                    objK15 = lp2Var.K();
                    if (zH4) {
                        objK15 = new y12(x77Var4, (byte) 0);
                        lp2Var.g0(objK15);
                    } else {
                        objK15 = new y12(x77Var4, (byte) 0);
                        lp2Var.g0(objK15);
                    }
                    kx4 kx4VarY19 = new ox4((dn2) objK15).y(hx4Var);
                    zG = lp2Var.g(z8) | lp2Var.f(dn2Var);
                    objK16 = lp2Var.K();
                    if (zG) {
                        objK16 = new z12(dn2Var, z8);
                        lp2Var.g0(objK16);
                    } else {
                        objK16 = new z12(dn2Var, z8);
                        lp2Var.g0(objK16);
                    }
                    kx4 kx4VarY110 = kx4VarY19.y(jm4.I(hx4Var, (gn2) objK16)).y(new s12(ce8Var2, sd8Var2, sd8Var3, sd8Var, g22Var3, h62Var3, x77Var4, dn2Var, t12Var7)).y(qu8Var);
                    lp2Var.W(-1255657861);
                    lp2Var.p(false);
                    kx4Var2 = kx4Var;
                    kx4 kx4VarY111 = kx4Var2.y(kx4VarY110.y(hx4Var));
                    objK17 = lp2Var.K();
                    if (objK17 == obj) {
                        fkVar2 = fkVar;
                        objK17 = new mj(fkVar2);
                        lp2Var.g0(objK17);
                    } else {
                        fkVar2 = fkVar;
                    }
                    mj mjVar7 = (mj) objK17;
                    int iHashCode7 = Long.hashCode(lp2Var.T);
                    kl5 kl5VarL7 = lp2Var.l();
                    kx4 kx4VarQ7 = w45.Q(lp2Var, kx4VarY111);
                    uz0.j.getClass();
                    lp2Var.Z();
                    if (lp2Var.S) {
                        lp2Var.k();
                    } else {
                        lp2Var.j0();
                    }
                    pn7.m(pz2.B0, lp2Var, mjVar7);
                    pn7.m(pz2.A0, lp2Var, kl5VarL7);
                    pn7.j(lp2Var, Integer.valueOf(iHashCode7));
                    pn7.l(lp2Var);
                    pn7.m(pz2.z0, lp2Var, kx4VarQ7);
                    zy0Var2 = zy0Var;
                    zy0Var2.x(fkVar2, lp2Var, Integer.valueOf((i5 >> 21) & 112));
                    lp2Var.p(true);
                    z12 = false;
                    lp2Var.p(false);
                }
                lp2Var.p(z12);
            } else {
                lp2Var.W(-270514673);
                lp2Var.p(false);
                zy0Var2 = zy0Var;
            }
        } else {
            zy0Var2 = zy0Var;
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new yj(ce8Var, gn2Var, kx4Var2, g22Var, h62Var, rn2Var, zy0Var2, i);
        }
    }

    public static void a0(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = iArr[1];
        int i4 = iArr2[1];
        int i5 = iArr[2];
        int i6 = iArr2[2];
        int i7 = iArr[3];
        int i8 = iArr2[3];
        int i9 = iArr[4];
        int i10 = iArr2[4];
        int i11 = iArr[5];
        int i12 = iArr2[5];
        int i13 = iArr[6];
        int i14 = iArr2[6];
        int i15 = iArr[7];
        int i16 = iArr2[7];
        int i17 = iArr[8];
        int i18 = iArr2[8];
        int i19 = iArr[9];
        int i20 = iArr2[9];
        long j = i;
        long j2 = i2;
        long j3 = j * j2;
        long j4 = i4;
        long j5 = j * j4;
        long j6 = i3;
        long j7 = (j6 * j2) + j5;
        long j8 = i6;
        long j9 = (j6 * j4) + (j * j8);
        long j10 = i5;
        long j11 = (j10 * j2) + j9;
        long j12 = ((j10 * j4) + (j6 * j8)) << 1;
        long j13 = i8;
        long j14 = j * j13;
        long j15 = i7;
        long jI = p61.i(j15, j2, j14, j12);
        long j16 = (j10 * j8) << 1;
        long j17 = i10;
        long j18 = i9;
        long jI2 = p61.i(j18, j2, (j15 * j4) + (j6 * j13) + (j * j17), j16);
        long j19 = ((j18 * j4) + ((j15 * j8) + ((j10 * j13) + (j6 * j17)))) << 1;
        long j20 = (j15 * j13) + (((j18 * j8) + (j10 * j17)) << 1);
        long j21 = (j18 * j13) + (j15 * j17);
        long j22 = (j18 * j17) << 1;
        long j23 = i11;
        long j24 = i12;
        long j25 = j23 * j24;
        long j26 = i14;
        long j27 = j23 * j26;
        long j28 = i13;
        long j29 = (j28 * j24) + j27;
        long j30 = i16;
        long j31 = (j28 * j26) + (j23 * j30);
        long j32 = i15;
        long j33 = i18;
        long j34 = j23 * j33;
        long j35 = i17;
        long jI3 = p61.i(j35, j24, j34, ((j32 * j26) + (j28 * j30)) << 1);
        long j36 = i20;
        long j37 = (j35 * j26) + (j28 * j33) + (j23 * j36);
        long j38 = i19;
        long jI4 = p61.i(j38, j24, j37, (j32 * j30) << 1);
        long j39 = j3 - (((j26 * j38) + ((j35 * j30) + ((j32 * j33) + (j28 * j36)))) * 76);
        long j40 = j7 - (((j35 * j33) + (((j30 * j38) + (j32 * j36)) << 1)) * 38);
        long j41 = j11 - (((j38 * j33) + (j35 * j36)) * 38);
        long j42 = jI - ((j36 * j38) * 76);
        long j43 = j19 - j25;
        long j44 = j20 - j29;
        long j45 = j21 - ((j32 * j24) + j31);
        long j46 = j22 - jI3;
        long j47 = i + i11;
        long j48 = i2 + i12;
        long j49 = j47 * j48;
        long j50 = i4 + i14;
        long j51 = j47 * j50;
        long j52 = i3 + i13;
        long j53 = (j52 * j48) + j51;
        long j54 = i6 + i16;
        long j55 = i5 + i15;
        long j56 = (j55 * j48) + (j52 * j50) + (j47 * j54);
        long j57 = ((j55 * j50) + (j52 * j54)) << 1;
        long j58 = i8 + i18;
        long j59 = i7 + i17;
        long jI5 = p61.i(j59, j48, j47 * j58, j57);
        long j60 = i10 + i20;
        long j61 = i9 + i19;
        long jI6 = p61.i(j61, j48, (j59 * j50) + (j52 * j58) + (j47 * j60), (j55 * j54) << 1);
        long j62 = ((j50 * j61) + ((j59 * j54) + ((j55 * j58) + (j52 * j60)))) << 1;
        long j63 = (j59 * j58) + (((j54 * j61) + (j55 * j60)) << 1);
        long j64 = (j61 * j58) + (j59 * j60);
        long j65 = (j60 * j61) << 1;
        long j66 = (jI5 - j42) + j46;
        int i21 = ((int) j66) & 67108863;
        long j67 = ((jI6 - jI2) - jI4) + (j66 >> 26);
        int i22 = ((int) j67) & 33554431;
        long j68 = ((((j67 >> 25) + j62) - j43) * 38) + j39;
        iArr3[0] = ((int) j68) & 67108863;
        long j69 = ((j63 - j44) * 38) + j40 + (j68 >> 26);
        iArr3[1] = ((int) j69) & 67108863;
        long j70 = ((j64 - j45) * 38) + j41 + (j69 >> 26);
        iArr3[2] = ((int) j70) & 33554431;
        long j71 = ((j65 - j46) * 38) + j42 + (j70 >> 25);
        iArr3[3] = ((int) j71) & 67108863;
        long jI7 = p61.i(jI4, 38L, jI2, j71 >> 26);
        iArr3[4] = ((int) jI7) & 33554431;
        long j72 = (j49 - j39) + j43 + (jI7 >> 25);
        iArr3[5] = ((int) j72) & 67108863;
        long j73 = (j53 - j40) + j44 + (j72 >> 26);
        iArr3[6] = ((int) j73) & 67108863;
        long j74 = (j56 - j41) + j45 + (j73 >> 26);
        iArr3[7] = ((int) j74) & 33554431;
        long j75 = (j74 >> 25) + ((long) i21);
        iArr3[8] = ((int) j75) & 67108863;
        iArr3[9] = i22 + ((int) (j75 >> 26));
    }

    public static final void b(boolean z, kx4 kx4Var, g22 g22Var, h62 h62Var, String str, zy0 zy0Var, lp2 lp2Var, int i) {
        kx4 kx4Var2;
        g22 g22Var2;
        h62 h62Var2;
        String str2;
        p50 p50Var;
        p50 p50Var2 = pz2.i0;
        p50 p50Var3 = pz2.j0;
        p50 p50Var4 = pz2.h0;
        n50 n50Var = pz2.s0;
        lp2Var.X(234057107);
        int i2 = i | (lp2Var.g(z) ? 32 : 16) | 224640;
        byte b2 = 0;
        if (lp2Var.N(i2 & 1, (599185 & i2) != 599184)) {
            g22 g22VarC = b22.c(null, 3);
            Map map = iz8.a;
            wf7 wf7VarV = wl7.V(0.0f, 400.0f, new pf3(4294967297L), 1);
            ti tiVar = ti.n0;
            n50 n50Var2 = pz2.q0;
            if (dh3.f(n50Var, n50Var2)) {
                p50Var = p50Var4;
            } else {
                p50Var = dh3.f(n50Var, n50Var) ? p50Var3 : p50Var2;
            }
            g22 g22VarA = g22VarC.a(b22.b(wf7VarV, p50Var, new a22(tiVar, b2)));
            h62 h62VarD = b22.d(null, 3);
            wf7 wf7VarV2 = wl7.V(0.0f, 400.0f, new pf3(4294967297L), 1);
            ti tiVar2 = ti.q0;
            if (dh3.f(n50Var, n50Var2)) {
                p50Var2 = p50Var4;
            } else if (dh3.f(n50Var, n50Var)) {
                p50Var2 = p50Var3;
            }
            h62 h62VarA = h62VarD.a(b22.e(wf7VarV2, p50Var2, new a22(tiVar2, (byte) 2)));
            str2 = "AnimatedVisibility";
            ce8 ce8VarO = rq7.o(Boolean.valueOf(z), "AnimatedVisibility", lp2Var, ((i2 >> 3) & 14) | 48);
            Object objK = lp2Var.K();
            if (objK == zz0.a) {
                objK = ti.g0;
                lp2Var.g0(objK);
            }
            gn2 gn2Var = (gn2) objK;
            hx4 hx4Var = hx4.X;
            e(ce8VarO, gn2Var, hx4Var, g22VarA, h62VarA, zy0Var, lp2Var, 1600944);
            kx4Var2 = hx4Var;
            g22Var2 = g22VarA;
            h62Var2 = h62VarA;
        } else {
            lp2Var.Q();
            kx4Var2 = kx4Var;
            g22Var2 = g22Var;
            h62Var2 = h62Var;
            str2 = str;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new bk(z, kx4Var2, g22Var2, h62Var2, str2, zy0Var, i, (byte) 0);
        }
    }

    public static final float[] b0(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:69:0x0107  */
    /* JADX WARN: Code duplicated, block: B:71:0x0127  */
    /* JADX WARN: Code duplicated, block: B:74:0x0135  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void c(boolean z, kx4 kx4Var, g22 g22Var, h62 h62Var, String str, zy0 zy0Var, lp2 lp2Var, int i, int i2) {
        int i3;
        kx4 kx4Var2;
        int i4;
        g22 g22Var2;
        int i5;
        int i6;
        h62 h62Var2;
        int i7;
        int i8;
        zy0 zy0Var2;
        boolean z2;
        kx4 kx4Var3;
        g22 g22VarA;
        h62 h62VarA;
        String str2;
        j86 j86VarR;
        float f2;
        Object objK;
        int i9;
        p50 p50Var = pz2.m0;
        lp2Var.X(-1448730565);
        if ((i & 6) == 0) {
            i3 = (lp2Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                kx4Var2 = kx4Var;
                i3 |= lp2Var.f(kx4Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    g22Var2 = g22Var;
                    if (lp2Var.f(g22Var2)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        h62Var2 = h62Var;
                        if (lp2Var.f(h62Var2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i3 | 24576;
                    if ((196608 & i) == 0) {
                        zy0Var2 = zy0Var;
                        if (lp2Var.h(zy0Var2)) {
                            i9 = 131072;
                        } else {
                            i9 = DnsOverHttps.MAX_RESPONSE_SIZE;
                        }
                        i8 |= i9;
                    } else {
                        zy0Var2 = zy0Var;
                    }
                    if ((74899 & i8) != 74898) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (lp2Var.N(i8 & 1, z2)) {
                        if (i10 != 0) {
                            kx4Var3 = hx4.X;
                        } else {
                            kx4Var3 = kx4Var2;
                        }
                        if (i4 != 0) {
                            g22 g22VarC = b22.c(null, 3);
                            Map map = iz8.a;
                            f2 = 0.0f;
                            g22VarA = g22VarC.a(b22.b(wl7.V(0.0f, 400.0f, new pf3(4294967297L), 1), p50Var, ti.o0));
                        } else {
                            f2 = 0.0f;
                            g22VarA = g22Var2;
                        }
                        if (i6 != 0) {
                            ug8 ug8Var = b22.a;
                            Map map2 = iz8.a;
                            h62VarA = b22.e(wl7.V(f2, 400.0f, new pf3(4294967297L), 1), p50Var, ti.r0).a(b22.d(null, 3));
                        } else {
                            h62VarA = h62Var2;
                        }
                        ce8 ce8VarO = rq7.o(Boolean.valueOf(z), "AnimatedVisibility", lp2Var, (i8 & 14) | ((i8 >> 9) & 112));
                        objK = lp2Var.K();
                        if (objK == zz0.a) {
                            objK = ti.f0;
                            lp2Var.g0(objK);
                        }
                        int i11 = i8 << 3;
                        e(ce8VarO, (gn2) objK, kx4Var3, g22VarA, h62VarA, zy0Var2, lp2Var, (i11 & 896) | 48 | (i11 & 7168) | (57344 & i11) | (i11 & 3670016));
                        str2 = "AnimatedVisibility";
                    } else {
                        lp2Var.Q();
                        kx4Var3 = kx4Var2;
                        g22VarA = g22Var2;
                        h62VarA = h62Var2;
                        str2 = str;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new ak(z, kx4Var3, g22VarA, h62VarA, str2, zy0Var, i, i2);
                    }
                }
                i3 |= 3072;
                h62Var2 = h62Var;
                i8 = i3 | 24576;
                if ((196608 & i) == 0) {
                    zy0Var2 = zy0Var;
                    if (lp2Var.h(zy0Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = DnsOverHttps.MAX_RESPONSE_SIZE;
                    }
                    i8 |= i9;
                } else {
                    zy0Var2 = zy0Var;
                }
                if ((74899 & i8) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (lp2Var.N(i8 & 1, z2)) {
                    if (i10 != 0) {
                        kx4Var3 = hx4.X;
                    } else {
                        kx4Var3 = kx4Var2;
                    }
                    if (i4 != 0) {
                        g22 g22VarC2 = b22.c(null, 3);
                        Map map3 = iz8.a;
                        f2 = 0.0f;
                        g22VarA = g22VarC2.a(b22.b(wl7.V(0.0f, 400.0f, new pf3(4294967297L), 1), p50Var, ti.o0));
                    } else {
                        f2 = 0.0f;
                        g22VarA = g22Var2;
                    }
                    if (i6 != 0) {
                        ug8 ug8Var2 = b22.a;
                        Map map4 = iz8.a;
                        h62VarA = b22.e(wl7.V(f2, 400.0f, new pf3(4294967297L), 1), p50Var, ti.r0).a(b22.d(null, 3));
                    } else {
                        h62VarA = h62Var2;
                    }
                    ce8 ce8VarO2 = rq7.o(Boolean.valueOf(z), "AnimatedVisibility", lp2Var, (i8 & 14) | ((i8 >> 9) & 112));
                    objK = lp2Var.K();
                    if (objK == zz0.a) {
                        objK = ti.f0;
                        lp2Var.g0(objK);
                    }
                    int i12 = i8 << 3;
                    e(ce8VarO2, (gn2) objK, kx4Var3, g22VarA, h62VarA, zy0Var2, lp2Var, (i12 & 896) | 48 | (i12 & 7168) | (57344 & i12) | (i12 & 3670016));
                    str2 = "AnimatedVisibility";
                } else {
                    lp2Var.Q();
                    kx4Var3 = kx4Var2;
                    g22VarA = g22Var2;
                    h62VarA = h62Var2;
                    str2 = str;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new ak(z, kx4Var3, g22VarA, h62VarA, str2, zy0Var, i, i2);
                }
            }
            i3 |= 384;
            g22Var2 = g22Var;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    h62Var2 = h62Var;
                    if (lp2Var.f(h62Var2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 24576;
                if ((196608 & i) == 0) {
                    zy0Var2 = zy0Var;
                    if (lp2Var.h(zy0Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = DnsOverHttps.MAX_RESPONSE_SIZE;
                    }
                    i8 |= i9;
                } else {
                    zy0Var2 = zy0Var;
                }
                if ((74899 & i8) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (lp2Var.N(i8 & 1, z2)) {
                    if (i10 != 0) {
                        kx4Var3 = hx4.X;
                    } else {
                        kx4Var3 = kx4Var2;
                    }
                    if (i4 != 0) {
                        g22 g22VarC3 = b22.c(null, 3);
                        Map map5 = iz8.a;
                        f2 = 0.0f;
                        g22VarA = g22VarC3.a(b22.b(wl7.V(0.0f, 400.0f, new pf3(4294967297L), 1), p50Var, ti.o0));
                    } else {
                        f2 = 0.0f;
                        g22VarA = g22Var2;
                    }
                    if (i6 != 0) {
                        ug8 ug8Var3 = b22.a;
                        Map map6 = iz8.a;
                        h62VarA = b22.e(wl7.V(f2, 400.0f, new pf3(4294967297L), 1), p50Var, ti.r0).a(b22.d(null, 3));
                    } else {
                        h62VarA = h62Var2;
                    }
                    ce8 ce8VarO3 = rq7.o(Boolean.valueOf(z), "AnimatedVisibility", lp2Var, (i8 & 14) | ((i8 >> 9) & 112));
                    objK = lp2Var.K();
                    if (objK == zz0.a) {
                        objK = ti.f0;
                        lp2Var.g0(objK);
                    }
                    int i13 = i8 << 3;
                    e(ce8VarO3, (gn2) objK, kx4Var3, g22VarA, h62VarA, zy0Var2, lp2Var, (i13 & 896) | 48 | (i13 & 7168) | (57344 & i13) | (i13 & 3670016));
                    str2 = "AnimatedVisibility";
                } else {
                    lp2Var.Q();
                    kx4Var3 = kx4Var2;
                    g22VarA = g22Var2;
                    h62VarA = h62Var2;
                    str2 = str;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new ak(z, kx4Var3, g22VarA, h62VarA, str2, zy0Var, i, i2);
                }
            }
            i3 |= 3072;
            h62Var2 = h62Var;
            i8 = i3 | 24576;
            if ((196608 & i) == 0) {
                zy0Var2 = zy0Var;
                if (lp2Var.h(zy0Var2)) {
                    i9 = 131072;
                } else {
                    i9 = DnsOverHttps.MAX_RESPONSE_SIZE;
                }
                i8 |= i9;
            } else {
                zy0Var2 = zy0Var;
            }
            if ((74899 & i8) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (lp2Var.N(i8 & 1, z2)) {
                if (i10 != 0) {
                    kx4Var3 = hx4.X;
                } else {
                    kx4Var3 = kx4Var2;
                }
                if (i4 != 0) {
                    g22 g22VarC4 = b22.c(null, 3);
                    Map map7 = iz8.a;
                    f2 = 0.0f;
                    g22VarA = g22VarC4.a(b22.b(wl7.V(0.0f, 400.0f, new pf3(4294967297L), 1), p50Var, ti.o0));
                } else {
                    f2 = 0.0f;
                    g22VarA = g22Var2;
                }
                if (i6 != 0) {
                    ug8 ug8Var4 = b22.a;
                    Map map8 = iz8.a;
                    h62VarA = b22.e(wl7.V(f2, 400.0f, new pf3(4294967297L), 1), p50Var, ti.r0).a(b22.d(null, 3));
                } else {
                    h62VarA = h62Var2;
                }
                ce8 ce8VarO4 = rq7.o(Boolean.valueOf(z), "AnimatedVisibility", lp2Var, (i8 & 14) | ((i8 >> 9) & 112));
                objK = lp2Var.K();
                if (objK == zz0.a) {
                    objK = ti.f0;
                    lp2Var.g0(objK);
                }
                int i14 = i8 << 3;
                e(ce8VarO4, (gn2) objK, kx4Var3, g22VarA, h62VarA, zy0Var2, lp2Var, (i14 & 896) | 48 | (i14 & 7168) | (57344 & i14) | (i14 & 3670016));
                str2 = "AnimatedVisibility";
            } else {
                lp2Var.Q();
                kx4Var3 = kx4Var2;
                g22VarA = g22Var2;
                h62VarA = h62Var2;
                str2 = str;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new ak(z, kx4Var3, g22VarA, h62VarA, str2, zy0Var, i, i2);
            }
        }
        i3 |= 48;
        kx4Var2 = kx4Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                g22Var2 = g22Var;
                if (lp2Var.f(g22Var2)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    h62Var2 = h62Var;
                    if (lp2Var.f(h62Var2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 24576;
                if ((196608 & i) == 0) {
                    zy0Var2 = zy0Var;
                    if (lp2Var.h(zy0Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = DnsOverHttps.MAX_RESPONSE_SIZE;
                    }
                    i8 |= i9;
                } else {
                    zy0Var2 = zy0Var;
                }
                if ((74899 & i8) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (lp2Var.N(i8 & 1, z2)) {
                    if (i10 != 0) {
                        kx4Var3 = hx4.X;
                    } else {
                        kx4Var3 = kx4Var2;
                    }
                    if (i4 != 0) {
                        g22 g22VarC5 = b22.c(null, 3);
                        Map map9 = iz8.a;
                        f2 = 0.0f;
                        g22VarA = g22VarC5.a(b22.b(wl7.V(0.0f, 400.0f, new pf3(4294967297L), 1), p50Var, ti.o0));
                    } else {
                        f2 = 0.0f;
                        g22VarA = g22Var2;
                    }
                    if (i6 != 0) {
                        ug8 ug8Var5 = b22.a;
                        Map map10 = iz8.a;
                        h62VarA = b22.e(wl7.V(f2, 400.0f, new pf3(4294967297L), 1), p50Var, ti.r0).a(b22.d(null, 3));
                    } else {
                        h62VarA = h62Var2;
                    }
                    ce8 ce8VarO5 = rq7.o(Boolean.valueOf(z), "AnimatedVisibility", lp2Var, (i8 & 14) | ((i8 >> 9) & 112));
                    objK = lp2Var.K();
                    if (objK == zz0.a) {
                        objK = ti.f0;
                        lp2Var.g0(objK);
                    }
                    int i15 = i8 << 3;
                    e(ce8VarO5, (gn2) objK, kx4Var3, g22VarA, h62VarA, zy0Var2, lp2Var, (i15 & 896) | 48 | (i15 & 7168) | (57344 & i15) | (i15 & 3670016));
                    str2 = "AnimatedVisibility";
                } else {
                    lp2Var.Q();
                    kx4Var3 = kx4Var2;
                    g22VarA = g22Var2;
                    h62VarA = h62Var2;
                    str2 = str;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new ak(z, kx4Var3, g22VarA, h62VarA, str2, zy0Var, i, i2);
                }
            }
            i3 |= 3072;
            h62Var2 = h62Var;
            i8 = i3 | 24576;
            if ((196608 & i) == 0) {
                zy0Var2 = zy0Var;
                if (lp2Var.h(zy0Var2)) {
                    i9 = 131072;
                } else {
                    i9 = DnsOverHttps.MAX_RESPONSE_SIZE;
                }
                i8 |= i9;
            } else {
                zy0Var2 = zy0Var;
            }
            if ((74899 & i8) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (lp2Var.N(i8 & 1, z2)) {
                if (i10 != 0) {
                    kx4Var3 = hx4.X;
                } else {
                    kx4Var3 = kx4Var2;
                }
                if (i4 != 0) {
                    g22 g22VarC6 = b22.c(null, 3);
                    Map map11 = iz8.a;
                    f2 = 0.0f;
                    g22VarA = g22VarC6.a(b22.b(wl7.V(0.0f, 400.0f, new pf3(4294967297L), 1), p50Var, ti.o0));
                } else {
                    f2 = 0.0f;
                    g22VarA = g22Var2;
                }
                if (i6 != 0) {
                    ug8 ug8Var6 = b22.a;
                    Map map12 = iz8.a;
                    h62VarA = b22.e(wl7.V(f2, 400.0f, new pf3(4294967297L), 1), p50Var, ti.r0).a(b22.d(null, 3));
                } else {
                    h62VarA = h62Var2;
                }
                ce8 ce8VarO6 = rq7.o(Boolean.valueOf(z), "AnimatedVisibility", lp2Var, (i8 & 14) | ((i8 >> 9) & 112));
                objK = lp2Var.K();
                if (objK == zz0.a) {
                    objK = ti.f0;
                    lp2Var.g0(objK);
                }
                int i16 = i8 << 3;
                e(ce8VarO6, (gn2) objK, kx4Var3, g22VarA, h62VarA, zy0Var2, lp2Var, (i16 & 896) | 48 | (i16 & 7168) | (57344 & i16) | (i16 & 3670016));
                str2 = "AnimatedVisibility";
            } else {
                lp2Var.Q();
                kx4Var3 = kx4Var2;
                g22VarA = g22Var2;
                h62VarA = h62Var2;
                str2 = str;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new ak(z, kx4Var3, g22VarA, h62VarA, str2, zy0Var, i, i2);
            }
        }
        i3 |= 384;
        g22Var2 = g22Var;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                h62Var2 = h62Var;
                if (lp2Var.f(h62Var2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i3 | 24576;
            if ((196608 & i) == 0) {
                zy0Var2 = zy0Var;
                if (lp2Var.h(zy0Var2)) {
                    i9 = 131072;
                } else {
                    i9 = DnsOverHttps.MAX_RESPONSE_SIZE;
                }
                i8 |= i9;
            } else {
                zy0Var2 = zy0Var;
            }
            if ((74899 & i8) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (lp2Var.N(i8 & 1, z2)) {
                if (i10 != 0) {
                    kx4Var3 = hx4.X;
                } else {
                    kx4Var3 = kx4Var2;
                }
                if (i4 != 0) {
                    g22 g22VarC7 = b22.c(null, 3);
                    Map map13 = iz8.a;
                    f2 = 0.0f;
                    g22VarA = g22VarC7.a(b22.b(wl7.V(0.0f, 400.0f, new pf3(4294967297L), 1), p50Var, ti.o0));
                } else {
                    f2 = 0.0f;
                    g22VarA = g22Var2;
                }
                if (i6 != 0) {
                    ug8 ug8Var7 = b22.a;
                    Map map14 = iz8.a;
                    h62VarA = b22.e(wl7.V(f2, 400.0f, new pf3(4294967297L), 1), p50Var, ti.r0).a(b22.d(null, 3));
                } else {
                    h62VarA = h62Var2;
                }
                ce8 ce8VarO7 = rq7.o(Boolean.valueOf(z), "AnimatedVisibility", lp2Var, (i8 & 14) | ((i8 >> 9) & 112));
                objK = lp2Var.K();
                if (objK == zz0.a) {
                    objK = ti.f0;
                    lp2Var.g0(objK);
                }
                int i17 = i8 << 3;
                e(ce8VarO7, (gn2) objK, kx4Var3, g22VarA, h62VarA, zy0Var2, lp2Var, (i17 & 896) | 48 | (i17 & 7168) | (57344 & i17) | (i17 & 3670016));
                str2 = "AnimatedVisibility";
            } else {
                lp2Var.Q();
                kx4Var3 = kx4Var2;
                g22VarA = g22Var2;
                h62VarA = h62Var2;
                str2 = str;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new ak(z, kx4Var3, g22VarA, h62VarA, str2, zy0Var, i, i2);
            }
        }
        i3 |= 3072;
        h62Var2 = h62Var;
        i8 = i3 | 24576;
        if ((196608 & i) == 0) {
            zy0Var2 = zy0Var;
            if (lp2Var.h(zy0Var2)) {
                i9 = 131072;
            } else {
                i9 = DnsOverHttps.MAX_RESPONSE_SIZE;
            }
            i8 |= i9;
        } else {
            zy0Var2 = zy0Var;
        }
        if ((74899 & i8) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (lp2Var.N(i8 & 1, z2)) {
            if (i10 != 0) {
                kx4Var3 = hx4.X;
            } else {
                kx4Var3 = kx4Var2;
            }
            if (i4 != 0) {
                g22 g22VarC8 = b22.c(null, 3);
                Map map15 = iz8.a;
                f2 = 0.0f;
                g22VarA = g22VarC8.a(b22.b(wl7.V(0.0f, 400.0f, new pf3(4294967297L), 1), p50Var, ti.o0));
            } else {
                f2 = 0.0f;
                g22VarA = g22Var2;
            }
            if (i6 != 0) {
                ug8 ug8Var8 = b22.a;
                Map map16 = iz8.a;
                h62VarA = b22.e(wl7.V(f2, 400.0f, new pf3(4294967297L), 1), p50Var, ti.r0).a(b22.d(null, 3));
            } else {
                h62VarA = h62Var2;
            }
            ce8 ce8VarO8 = rq7.o(Boolean.valueOf(z), "AnimatedVisibility", lp2Var, (i8 & 14) | ((i8 >> 9) & 112));
            objK = lp2Var.K();
            if (objK == zz0.a) {
                objK = ti.f0;
                lp2Var.g0(objK);
            }
            int i18 = i8 << 3;
            e(ce8VarO8, (gn2) objK, kx4Var3, g22VarA, h62VarA, zy0Var2, lp2Var, (i18 & 896) | 48 | (i18 & 7168) | (57344 & i18) | (i18 & 3670016));
            str2 = "AnimatedVisibility";
        } else {
            lp2Var.Q();
            kx4Var3 = kx4Var2;
            g22VarA = g22Var2;
            h62VarA = h62Var2;
            str2 = str;
        }
        j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new ak(z, kx4Var3, g22VarA, h62VarA, str2, zy0Var, i, i2);
        }
    }

    public static final float[] c0(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    public static final void d(boolean z, kx4 kx4Var, g22 g22Var, h62 h62Var, String str, zy0 zy0Var, lp2 lp2Var, int i) {
        g22 g22Var2;
        h62 h62Var2;
        String str2;
        p50 p50Var;
        p50 p50Var2 = pz2.i0;
        p50 p50Var3 = pz2.l0;
        p50 p50Var4 = pz2.f0;
        o50 o50Var = pz2.p0;
        lp2Var.X(1799879339);
        int i2 = i | (lp2Var.g(z) ? 32 : 16) | 224256;
        byte b2 = 1;
        if (lp2Var.N(i2 & 1, (599185 & i2) != 599184)) {
            byte b3 = 3;
            g22 g22VarC = b22.c(null, 3);
            Map map = iz8.a;
            wf7 wf7VarV = wl7.V(0.0f, 400.0f, new pf3(4294967297L), 1);
            ti tiVar = ti.p0;
            o50 o50Var2 = pz2.n0;
            if (dh3.f(o50Var, o50Var2)) {
                p50Var = p50Var4;
            } else {
                p50Var = dh3.f(o50Var, o50Var) ? p50Var3 : p50Var2;
            }
            g22 g22VarA = g22VarC.a(b22.b(wf7VarV, p50Var, new a22(tiVar, b2)));
            h62 h62VarD = b22.d(null, 3);
            wf7 wf7VarV2 = wl7.V(0.0f, 400.0f, new pf3(4294967297L), 1);
            ti tiVar2 = ti.s0;
            if (dh3.f(o50Var, o50Var2)) {
                p50Var2 = p50Var4;
            } else if (dh3.f(o50Var, o50Var)) {
                p50Var2 = p50Var3;
            }
            h62 h62VarA = h62VarD.a(b22.e(wf7VarV2, p50Var2, new a22(tiVar2, b3)));
            ce8 ce8VarO = rq7.o(Boolean.valueOf(z), "AnimatedVisibility", lp2Var, ((i2 >> 3) & 14) | 48);
            Object objK = lp2Var.K();
            if (objK == zz0.a) {
                objK = ti.h0;
                lp2Var.g0(objK);
            }
            g22Var2 = g22VarA;
            e(ce8VarO, (gn2) objK, kx4Var, g22Var2, h62VarA, zy0Var, lp2Var, 1600944);
            str2 = "AnimatedVisibility";
            h62Var2 = h62VarA;
        } else {
            lp2Var.Q();
            g22Var2 = g22Var;
            h62Var2 = h62Var;
            str2 = str;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new bk(z, kx4Var, g22Var2, h62Var2, str2, zy0Var, i, (byte) 1);
        }
    }

    public static void d0(int[] iArr) {
        int i = (iArr[9] >>> 23) & 1;
        g0(iArr, i);
        g0(iArr, -i);
    }

    public static final void e(ce8 ce8Var, gn2 gn2Var, kx4 kx4Var, g22 g22Var, h62 h62Var, zy0 zy0Var, lp2 lp2Var, int i) {
        int i2;
        g22 g22Var2;
        h62 h62Var2;
        zy0 zy0Var2;
        lp2Var.X(-497872534);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(ce8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.h(gn2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.f(kx4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            g22Var2 = g22Var;
            i2 |= lp2Var.f(g22Var2) ? 2048 : 1024;
        } else {
            g22Var2 = g22Var;
        }
        if ((i & 24576) == 0) {
            h62Var2 = h62Var;
            i2 |= lp2Var.f(h62Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            h62Var2 = h62Var;
        }
        int i3 = i2 | 196608;
        if ((1572864 & i) == 0) {
            zy0Var2 = zy0Var;
            i3 |= lp2Var.h(zy0Var2) ? 1048576 : 524288;
        } else {
            zy0Var2 = zy0Var;
        }
        if (lp2Var.N(i3 & 1, (599187 & i3) != 599186)) {
            int i4 = i3 & 112;
            int i5 = i3 & 14;
            boolean z = (i4 == 32) | (i5 == 4);
            Object objK = lp2Var.K();
            be beVar = zz0.a;
            if (z || objK == beVar) {
                objK = new dk(gn2Var, ce8Var);
                lp2Var.g0(objK);
            }
            kx4 kx4VarQ0 = z68.q0(kx4Var, (sn2) objK);
            Object objK2 = lp2Var.K();
            if (objK2 == beVar) {
                objK2 = bj.f0;
                lp2Var.g0(objK2);
            }
            int i6 = 196608 | i5 | i4 | (i3 & 7168) | (57344 & i3);
            int i7 = i3 << 6;
            a(ce8Var, gn2Var, kx4VarQ0, g22Var2, h62Var2, (rn2) objK2, zy0Var2, lp2Var, i6 | (29360128 & i7) | (i7 & 234881024));
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new vi(ce8Var, gn2Var, kx4Var, g22Var, h62Var, zy0Var, i);
        }
    }

    public static void e0(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00be  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:59:0x0107  */
    /* JADX WARN: Code duplicated, block: B:60:0x010a  */
    /* JADX WARN: Code duplicated, block: B:64:0x012a  */
    /* JADX WARN: Code duplicated, block: B:65:0x012c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0138 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x013a  */
    /* JADX WARN: Code duplicated, block: B:72:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x014f  */
    /* JADX WARN: Code duplicated, block: B:75:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0162  */
    /* JADX WARN: Code duplicated, block: B:80:0x0166  */
    /* JADX WARN: Code duplicated, block: B:81:0x0168  */
    /* JADX WARN: Code duplicated, block: B:85:0x0190  */
    /* JADX WARN: Code duplicated, block: B:87:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void f(final ql qlVar, kx4 kx4Var, final o88 o88Var, int i, int i2, int i3, int i4, boolean z, lp2 lp2Var, final int i5, final int i6) {
        kx4 kx4Var2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        final int i14;
        final kx4 kx4Var3;
        final int i15;
        final int i16;
        final int i17;
        final boolean z3;
        j86 j86VarR;
        kx4 kx4Var4;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z4;
        Object objK;
        Object obj;
        aj2 aj2Var;
        o88 o88Var2;
        long j;
        boolean zF;
        Object objK2;
        long jB;
        long j2;
        o88 o88Var3;
        boolean z5;
        boolean zF2;
        Object objK3;
        o88 o88Var4;
        boolean zF3;
        Object objK4;
        int iOrdinal;
        o88 o88Var5;
        mx mxVar;
        lp2Var.X(-2092389705);
        int i23 = 2;
        int i24 = i5 | (lp2Var.f(qlVar) ? 4 : 2);
        int i25 = i6 & 2;
        if (i25 == 0) {
            if ((i5 & 48) == 0) {
                kx4Var2 = kx4Var;
                i24 |= lp2Var.f(kx4Var2) ? 32 : 16;
            }
            if (lp2Var.f(o88Var)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i8 = i24 | i7;
            i9 = i8 | 25600;
            i10 = i6 & 32;
            if (i10 != 0) {
                if ((i5 & 196608) == 0) {
                    i11 = i3;
                    if (lp2Var.d(i11)) {
                        i12 = 131072;
                    } else {
                        i12 = DnsOverHttps.MAX_RESPONSE_SIZE;
                    }
                    i9 |= i12;
                }
                i13 = i9 | 14155776;
                if ((4793491 & i13) != 4793490) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (lp2Var.N(i13 & 1, z2)) {
                    lp2Var.S();
                    if ((i5 & 1) != 0 || lp2Var.x()) {
                        if (i25 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        i18 = i13 & (-7169);
                        if (i10 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        i19 = i11;
                        i20 = 2;
                        i21 = 5;
                        i22 = 1;
                        z4 = true;
                    } else {
                        lp2Var.Q();
                        kx4 kx4Var5 = kx4Var2;
                        i18 = i13 & (-7169);
                        kx4Var4 = kx4Var5;
                        i20 = i2;
                        i22 = i4;
                        z4 = z;
                        i19 = i11;
                        i21 = i;
                    }
                    lp2Var.q();
                    objK = lp2Var.K();
                    obj = zz0.a;
                    if (objK == obj) {
                        kw4 kw4Var = kw4.a;
                        int iE = kw4.l().e(-1, "pref_font_size");
                        aj2.X.getClass();
                        objK = k32.g(iE);
                        lp2Var.g0(objK);
                    }
                    aj2Var = (aj2) objK;
                    o88Var2 = (o88) lp2Var.j(u78.a);
                    j = ((dw0) lp2Var.j(j41.a)).a;
                    zF = lp2Var.f(o88Var2) | lp2Var.e(j);
                    objK2 = lp2Var.K();
                    if (zF || objK2 == obj) {
                        jB = o88Var2.b();
                        if (jB != 16) {
                            j2 = jB;
                        } else {
                            j2 = j;
                        }
                        objK2 = o88.a(o88Var2, j2, 0L, null, null, 0L, 0L, null, 16777214);
                        lp2Var.g0(objK2);
                    }
                    o88Var3 = (o88) objK2;
                    if ((i18 & 896) == 256) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    zF2 = z5 | lp2Var.f(o88Var3);
                    objK3 = lp2Var.K();
                    if (zF2 || objK3 == obj) {
                        objK3 = o88Var3.d(o88Var);
                        lp2Var.g0(objK3);
                    }
                    o88Var4 = (o88) objK3;
                    zF3 = lp2Var.f(o88Var4);
                    objK4 = lp2Var.K();
                    if (zF3 || objK4 == obj) {
                        float fC = v88.c(o88Var4.a.b);
                        iOrdinal = aj2Var.ordinal();
                        if (iOrdinal == 0) {
                            i23 = -2;
                        } else if (iOrdinal == 1) {
                            i23 = 0;
                        } else if (iOrdinal != 2) {
                            b61.c();
                            return;
                        }
                        objK4 = o88.a(o88Var4, 0L, eu7.i(fC + i23, 4294967296L), null, null, 0L, 0L, null, 16777213);
                        lp2Var.g0(objK4);
                    }
                    o88Var5 = (o88) objK4;
                    if (z4) {
                        mxVar = new mx(eu7.g(8), o88Var5.a.b, eu7.f(0.25d));
                    } else {
                        mxVar = null;
                    }
                    u78.c(qlVar, kx4Var4, 0L, mxVar, 0L, 0L, new o28(i21), 0L, i20, false, i19, i22, null, null, o88Var5, lp2Var, i18 & WebSocketProtocol.PAYLOAD_SHORT, ((i18 >> 3) & 57344) | 196992);
                    i15 = i21;
                    kx4Var3 = kx4Var4;
                    i16 = i20;
                    i14 = i19;
                    i17 = i22;
                    z3 = z4;
                } else {
                    lp2Var.Q();
                    kx4 kx4Var6 = kx4Var2;
                    i14 = i11;
                    kx4Var3 = kx4Var6;
                    i15 = i;
                    i16 = i2;
                    i17 = i4;
                    z3 = z;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: az2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iP = w79.P(i5 | 1);
                            ql qlVar2 = qlVar;
                            kx4 kx4Var7 = kx4Var3;
                            o88 o88Var6 = o88Var;
                            byte b2 = i15;
                            byte b3 = i16;
                            int i26 = i14;
                            boolean z6 = i17;
                            boolean z7 = z3;
                            zc1.f(qlVar2, kx4Var7, o88Var6, b2, b3, i26, z6 ? 1 : 0, z7, (lp2) obj2, iP, i6);
                            return dn8.a;
                        }
                    };
                }
            }
            i9 = 222208 | i8;
            i11 = i3;
            i13 = i9 | 14155776;
            if ((4793491 & i13) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (lp2Var.N(i13 & 1, z2)) {
                lp2Var.S();
                if ((i5 & 1) != 0) {
                    if (i25 != 0) {
                        kx4Var4 = hx4.X;
                    } else {
                        kx4Var4 = kx4Var2;
                    }
                    i18 = i13 & (-7169);
                    if (i10 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    i19 = i11;
                    i20 = 2;
                    i21 = 5;
                    i22 = 1;
                    z4 = true;
                } else {
                    if (i25 != 0) {
                        kx4Var4 = hx4.X;
                    } else {
                        kx4Var4 = kx4Var2;
                    }
                    i18 = i13 & (-7169);
                    if (i10 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    i19 = i11;
                    i20 = 2;
                    i21 = 5;
                    i22 = 1;
                    z4 = true;
                }
                lp2Var.q();
                objK = lp2Var.K();
                obj = zz0.a;
                if (objK == obj) {
                    kw4 kw4Var2 = kw4.a;
                    int iE2 = kw4.l().e(-1, "pref_font_size");
                    aj2.X.getClass();
                    objK = k32.g(iE2);
                    lp2Var.g0(objK);
                }
                aj2Var = (aj2) objK;
                o88Var2 = (o88) lp2Var.j(u78.a);
                j = ((dw0) lp2Var.j(j41.a)).a;
                zF = lp2Var.f(o88Var2) | lp2Var.e(j);
                objK2 = lp2Var.K();
                if (zF) {
                    jB = o88Var2.b();
                    if (jB != 16) {
                        j2 = jB;
                    } else {
                        j2 = j;
                    }
                    objK2 = o88.a(o88Var2, j2, 0L, null, null, 0L, 0L, null, 16777214);
                    lp2Var.g0(objK2);
                } else {
                    jB = o88Var2.b();
                    if (jB != 16) {
                        j2 = jB;
                    } else {
                        j2 = j;
                    }
                    objK2 = o88.a(o88Var2, j2, 0L, null, null, 0L, 0L, null, 16777214);
                    lp2Var.g0(objK2);
                }
                o88Var3 = (o88) objK2;
                if ((i18 & 896) == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zF2 = z5 | lp2Var.f(o88Var3);
                objK3 = lp2Var.K();
                if (zF2) {
                    objK3 = o88Var3.d(o88Var);
                    lp2Var.g0(objK3);
                } else {
                    objK3 = o88Var3.d(o88Var);
                    lp2Var.g0(objK3);
                }
                o88Var4 = (o88) objK3;
                zF3 = lp2Var.f(o88Var4);
                objK4 = lp2Var.K();
                if (zF3) {
                    float fC2 = v88.c(o88Var4.a.b);
                    iOrdinal = aj2Var.ordinal();
                    if (iOrdinal == 0) {
                        i23 = -2;
                    } else if (iOrdinal == 1) {
                        i23 = 0;
                    } else if (iOrdinal != 2) {
                        b61.c();
                        return;
                    }
                    objK4 = o88.a(o88Var4, 0L, eu7.i(fC2 + i23, 4294967296L), null, null, 0L, 0L, null, 16777213);
                    lp2Var.g0(objK4);
                } else {
                    float fC3 = v88.c(o88Var4.a.b);
                    iOrdinal = aj2Var.ordinal();
                    if (iOrdinal == 0) {
                        i23 = -2;
                    } else if (iOrdinal == 1) {
                        i23 = 0;
                    } else if (iOrdinal != 2) {
                        b61.c();
                        return;
                    }
                    objK4 = o88.a(o88Var4, 0L, eu7.i(fC3 + i23, 4294967296L), null, null, 0L, 0L, null, 16777213);
                    lp2Var.g0(objK4);
                }
                o88Var5 = (o88) objK4;
                if (z4) {
                    mxVar = new mx(eu7.g(8), o88Var5.a.b, eu7.f(0.25d));
                } else {
                    mxVar = null;
                }
                u78.c(qlVar, kx4Var4, 0L, mxVar, 0L, 0L, new o28(i21), 0L, i20, false, i19, i22, null, null, o88Var5, lp2Var, i18 & WebSocketProtocol.PAYLOAD_SHORT, ((i18 >> 3) & 57344) | 196992);
                i15 = i21;
                kx4Var3 = kx4Var4;
                i16 = i20;
                i14 = i19;
                i17 = i22;
                z3 = z4;
            } else {
                lp2Var.Q();
                kx4 kx4Var7 = kx4Var2;
                i14 = i11;
                kx4Var3 = kx4Var7;
                i15 = i;
                i16 = i2;
                i17 = i4;
                z3 = z;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: az2
                    @Override // defpackage.rn2
                    public final Object K(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iP = w79.P(i5 | 1);
                        ql qlVar2 = qlVar;
                        kx4 kx4Var8 = kx4Var3;
                        o88 o88Var6 = o88Var;
                        byte b2 = i15;
                        byte b3 = i16;
                        int i26 = i14;
                        boolean z6 = i17;
                        boolean z7 = z3;
                        zc1.f(qlVar2, kx4Var8, o88Var6, b2, b3, i26, z6 ? 1 : 0, z7, (lp2) obj2, iP, i6);
                        return dn8.a;
                    }
                };
            }
        }
        i24 |= 48;
        kx4Var2 = kx4Var;
        if (lp2Var.f(o88Var)) {
            i7 = 256;
        } else {
            i7 = 128;
        }
        i8 = i24 | i7;
        i9 = i8 | 25600;
        i10 = i6 & 32;
        if (i10 != 0) {
            if ((i5 & 196608) == 0) {
                i11 = i3;
                if (lp2Var.d(i11)) {
                    i12 = 131072;
                } else {
                    i12 = DnsOverHttps.MAX_RESPONSE_SIZE;
                }
                i9 |= i12;
            }
            i13 = i9 | 14155776;
            if ((4793491 & i13) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (lp2Var.N(i13 & 1, z2)) {
                lp2Var.S();
                if ((i5 & 1) != 0) {
                    if (i25 != 0) {
                        kx4Var4 = hx4.X;
                    } else {
                        kx4Var4 = kx4Var2;
                    }
                    i18 = i13 & (-7169);
                    if (i10 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    i19 = i11;
                    i20 = 2;
                    i21 = 5;
                    i22 = 1;
                    z4 = true;
                } else {
                    if (i25 != 0) {
                        kx4Var4 = hx4.X;
                    } else {
                        kx4Var4 = kx4Var2;
                    }
                    i18 = i13 & (-7169);
                    if (i10 != 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                    i19 = i11;
                    i20 = 2;
                    i21 = 5;
                    i22 = 1;
                    z4 = true;
                }
                lp2Var.q();
                objK = lp2Var.K();
                obj = zz0.a;
                if (objK == obj) {
                    kw4 kw4Var3 = kw4.a;
                    int iE3 = kw4.l().e(-1, "pref_font_size");
                    aj2.X.getClass();
                    objK = k32.g(iE3);
                    lp2Var.g0(objK);
                }
                aj2Var = (aj2) objK;
                o88Var2 = (o88) lp2Var.j(u78.a);
                j = ((dw0) lp2Var.j(j41.a)).a;
                zF = lp2Var.f(o88Var2) | lp2Var.e(j);
                objK2 = lp2Var.K();
                if (zF) {
                    jB = o88Var2.b();
                    if (jB != 16) {
                        j2 = jB;
                    } else {
                        j2 = j;
                    }
                    objK2 = o88.a(o88Var2, j2, 0L, null, null, 0L, 0L, null, 16777214);
                    lp2Var.g0(objK2);
                } else {
                    jB = o88Var2.b();
                    if (jB != 16) {
                        j2 = jB;
                    } else {
                        j2 = j;
                    }
                    objK2 = o88.a(o88Var2, j2, 0L, null, null, 0L, 0L, null, 16777214);
                    lp2Var.g0(objK2);
                }
                o88Var3 = (o88) objK2;
                if ((i18 & 896) == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zF2 = z5 | lp2Var.f(o88Var3);
                objK3 = lp2Var.K();
                if (zF2) {
                    objK3 = o88Var3.d(o88Var);
                    lp2Var.g0(objK3);
                } else {
                    objK3 = o88Var3.d(o88Var);
                    lp2Var.g0(objK3);
                }
                o88Var4 = (o88) objK3;
                zF3 = lp2Var.f(o88Var4);
                objK4 = lp2Var.K();
                if (zF3) {
                    float fC4 = v88.c(o88Var4.a.b);
                    iOrdinal = aj2Var.ordinal();
                    if (iOrdinal == 0) {
                        i23 = -2;
                    } else if (iOrdinal == 1) {
                        i23 = 0;
                    } else if (iOrdinal != 2) {
                        b61.c();
                        return;
                    }
                    objK4 = o88.a(o88Var4, 0L, eu7.i(fC4 + i23, 4294967296L), null, null, 0L, 0L, null, 16777213);
                    lp2Var.g0(objK4);
                } else {
                    float fC5 = v88.c(o88Var4.a.b);
                    iOrdinal = aj2Var.ordinal();
                    if (iOrdinal == 0) {
                        i23 = -2;
                    } else if (iOrdinal == 1) {
                        i23 = 0;
                    } else if (iOrdinal != 2) {
                        b61.c();
                        return;
                    }
                    objK4 = o88.a(o88Var4, 0L, eu7.i(fC5 + i23, 4294967296L), null, null, 0L, 0L, null, 16777213);
                    lp2Var.g0(objK4);
                }
                o88Var5 = (o88) objK4;
                if (z4) {
                    mxVar = new mx(eu7.g(8), o88Var5.a.b, eu7.f(0.25d));
                } else {
                    mxVar = null;
                }
                u78.c(qlVar, kx4Var4, 0L, mxVar, 0L, 0L, new o28(i21), 0L, i20, false, i19, i22, null, null, o88Var5, lp2Var, i18 & WebSocketProtocol.PAYLOAD_SHORT, ((i18 >> 3) & 57344) | 196992);
                i15 = i21;
                kx4Var3 = kx4Var4;
                i16 = i20;
                i14 = i19;
                i17 = i22;
                z3 = z4;
            } else {
                lp2Var.Q();
                kx4 kx4Var8 = kx4Var2;
                i14 = i11;
                kx4Var3 = kx4Var8;
                i15 = i;
                i16 = i2;
                i17 = i4;
                z3 = z;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: az2
                    @Override // defpackage.rn2
                    public final Object K(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iP = w79.P(i5 | 1);
                        ql qlVar2 = qlVar;
                        kx4 kx4Var9 = kx4Var3;
                        o88 o88Var6 = o88Var;
                        byte b2 = i15;
                        byte b3 = i16;
                        int i26 = i14;
                        boolean z6 = i17;
                        boolean z7 = z3;
                        zc1.f(qlVar2, kx4Var9, o88Var6, b2, b3, i26, z6 ? 1 : 0, z7, (lp2) obj2, iP, i6);
                        return dn8.a;
                    }
                };
            }
        }
        i9 = 222208 | i8;
        i11 = i3;
        i13 = i9 | 14155776;
        if ((4793491 & i13) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (lp2Var.N(i13 & 1, z2)) {
            lp2Var.S();
            if ((i5 & 1) != 0) {
                if (i25 != 0) {
                    kx4Var4 = hx4.X;
                } else {
                    kx4Var4 = kx4Var2;
                }
                i18 = i13 & (-7169);
                if (i10 != 0) {
                    i11 = Integer.MAX_VALUE;
                }
                i19 = i11;
                i20 = 2;
                i21 = 5;
                i22 = 1;
                z4 = true;
            } else {
                if (i25 != 0) {
                    kx4Var4 = hx4.X;
                } else {
                    kx4Var4 = kx4Var2;
                }
                i18 = i13 & (-7169);
                if (i10 != 0) {
                    i11 = Integer.MAX_VALUE;
                }
                i19 = i11;
                i20 = 2;
                i21 = 5;
                i22 = 1;
                z4 = true;
            }
            lp2Var.q();
            objK = lp2Var.K();
            obj = zz0.a;
            if (objK == obj) {
                kw4 kw4Var4 = kw4.a;
                int iE4 = kw4.l().e(-1, "pref_font_size");
                aj2.X.getClass();
                objK = k32.g(iE4);
                lp2Var.g0(objK);
            }
            aj2Var = (aj2) objK;
            o88Var2 = (o88) lp2Var.j(u78.a);
            j = ((dw0) lp2Var.j(j41.a)).a;
            zF = lp2Var.f(o88Var2) | lp2Var.e(j);
            objK2 = lp2Var.K();
            if (zF) {
                jB = o88Var2.b();
                if (jB != 16) {
                    j2 = jB;
                } else {
                    j2 = j;
                }
                objK2 = o88.a(o88Var2, j2, 0L, null, null, 0L, 0L, null, 16777214);
                lp2Var.g0(objK2);
            } else {
                jB = o88Var2.b();
                if (jB != 16) {
                    j2 = jB;
                } else {
                    j2 = j;
                }
                objK2 = o88.a(o88Var2, j2, 0L, null, null, 0L, 0L, null, 16777214);
                lp2Var.g0(objK2);
            }
            o88Var3 = (o88) objK2;
            if ((i18 & 896) == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            zF2 = z5 | lp2Var.f(o88Var3);
            objK3 = lp2Var.K();
            if (zF2) {
                objK3 = o88Var3.d(o88Var);
                lp2Var.g0(objK3);
            } else {
                objK3 = o88Var3.d(o88Var);
                lp2Var.g0(objK3);
            }
            o88Var4 = (o88) objK3;
            zF3 = lp2Var.f(o88Var4);
            objK4 = lp2Var.K();
            if (zF3) {
                float fC6 = v88.c(o88Var4.a.b);
                iOrdinal = aj2Var.ordinal();
                if (iOrdinal == 0) {
                    i23 = -2;
                } else if (iOrdinal == 1) {
                    i23 = 0;
                } else if (iOrdinal != 2) {
                    b61.c();
                    return;
                }
                objK4 = o88.a(o88Var4, 0L, eu7.i(fC6 + i23, 4294967296L), null, null, 0L, 0L, null, 16777213);
                lp2Var.g0(objK4);
            } else {
                float fC7 = v88.c(o88Var4.a.b);
                iOrdinal = aj2Var.ordinal();
                if (iOrdinal == 0) {
                    i23 = -2;
                } else if (iOrdinal == 1) {
                    i23 = 0;
                } else if (iOrdinal != 2) {
                    b61.c();
                    return;
                }
                objK4 = o88.a(o88Var4, 0L, eu7.i(fC7 + i23, 4294967296L), null, null, 0L, 0L, null, 16777213);
                lp2Var.g0(objK4);
            }
            o88Var5 = (o88) objK4;
            if (z4) {
                mxVar = new mx(eu7.g(8), o88Var5.a.b, eu7.f(0.25d));
            } else {
                mxVar = null;
            }
            u78.c(qlVar, kx4Var4, 0L, mxVar, 0L, 0L, new o28(i21), 0L, i20, false, i19, i22, null, null, o88Var5, lp2Var, i18 & WebSocketProtocol.PAYLOAD_SHORT, ((i18 >> 3) & 57344) | 196992);
            i15 = i21;
            kx4Var3 = kx4Var4;
            i16 = i20;
            i14 = i19;
            i17 = i22;
            z3 = z4;
        } else {
            lp2Var.Q();
            kx4 kx4Var9 = kx4Var2;
            i14 = i11;
            kx4Var3 = kx4Var9;
            i15 = i;
            i16 = i2;
            i17 = i4;
            z3 = z;
        }
        j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: az2
                @Override // defpackage.rn2
                public final Object K(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = w79.P(i5 | 1);
                    ql qlVar2 = qlVar;
                    kx4 kx4Var10 = kx4Var3;
                    o88 o88Var6 = o88Var;
                    byte b2 = i15;
                    byte b3 = i16;
                    int i26 = i14;
                    boolean z6 = i17;
                    boolean z7 = z3;
                    zc1.f(qlVar2, kx4Var10, o88Var6, b2, b3, i26, z6 ? 1 : 0, z7, (lp2) obj2, iP, i6);
                    return dn8.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f0(xg1 xg1Var, ux0 ux0Var) {
        xg1Var.getClass();
        ux0Var.getClass();
        ((rm3) xg1Var).D(new p0(xg1Var, ux0Var, (byte) 13));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0122  */
    /* JADX WARN: Code duplicated, block: B:104:0x0129  */
    /* JADX WARN: Code duplicated, block: B:113:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0147  */
    /* JADX WARN: Code duplicated, block: B:116:0x014c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0151  */
    /* JADX WARN: Code duplicated, block: B:121:0x0157  */
    /* JADX WARN: Code duplicated, block: B:123:0x015a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0160  */
    /* JADX WARN: Code duplicated, block: B:127:0x0163  */
    /* JADX WARN: Code duplicated, block: B:128:0x0165  */
    /* JADX WARN: Code duplicated, block: B:130:0x0169  */
    /* JADX WARN: Code duplicated, block: B:131:0x0173  */
    /* JADX WARN: Code duplicated, block: B:134:0x0183  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:140:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:141:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:145:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:146:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:149:0x0200 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x0202  */
    /* JADX WARN: Code duplicated, block: B:153:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x0217  */
    /* JADX WARN: Code duplicated, block: B:156:0x0225 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x0227  */
    /* JADX WARN: Code duplicated, block: B:160:0x022b  */
    /* JADX WARN: Code duplicated, block: B:162:0x022f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0232  */
    /* JADX WARN: Code duplicated, block: B:167:0x025a  */
    /* JADX WARN: Code duplicated, block: B:169:0x027c  */
    /* JADX WARN: Code duplicated, block: B:171:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:174:0x02da  */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x0102  */
    /* JADX WARN: Code duplicated, block: B:94:0x0105  */
    /* JADX WARN: Code duplicated, block: B:98:0x0116  */
    /* JADX WARN: Code duplicated, block: B:99:0x0118  */
    public static final void g(final String str, kx4 kx4Var, o88 o88Var, int i, int i2, int i3, int i4, boolean z, gn2 gn2Var, lp2 lp2Var, final int i5, final int i6) {
        int i7;
        kx4 kx4Var2;
        int i8;
        o88 o88Var2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z2;
        final boolean z3;
        final gn2 gn2Var2;
        final kx4 kx4Var3;
        final o88 o88Var3;
        final int i24;
        final int i25;
        final int i26;
        final int i27;
        j86 j86VarR;
        boolean z4;
        boolean z5;
        int i28;
        kx4 kx4Var4;
        int i29;
        int i30;
        int i31;
        o88 o88Var4;
        Object objK;
        Object obj;
        aj2 aj2Var;
        o88 o88Var5;
        long j;
        boolean zF;
        Object objK2;
        long jB;
        long j2;
        o88 o88Var6;
        boolean z6;
        boolean zF2;
        Object objK3;
        o88 o88Var7;
        boolean zF3;
        Object objK4;
        int iOrdinal;
        int i32;
        o88 o88Var8;
        mx mxVar;
        str.getClass();
        lp2Var.X(753940506);
        if ((i5 & 6) == 0) {
            i7 = (lp2Var.f(str) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        int i33 = i6 & 2;
        if (i33 == 0) {
            if ((i5 & 48) == 0) {
                kx4Var2 = kx4Var;
                i7 |= lp2Var.f(kx4Var2) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 != 0) {
                if ((i5 & 384) == 0) {
                    o88Var2 = o88Var;
                    if (lp2Var.f(o88Var2)) {
                        i9 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i9 = 128;
                    }
                    i7 |= i9;
                }
                if ((i5 & 3072) == 0) {
                    if ((i6 & 8) == 0) {
                        i10 = i;
                        int i34 = lp2Var.d(i10) ? 2048 : 1024;
                        i7 |= i34;
                    } else {
                        i10 = i;
                    }
                    i7 |= i34;
                } else {
                    i10 = i;
                }
                i11 = i6 & 16;
                if (i11 != 0) {
                    if ((i5 & 24576) == 0) {
                        i12 = i2;
                        if (lp2Var.d(i12)) {
                            i13 = Http2.INITIAL_MAX_FRAME_SIZE;
                        } else {
                            i13 = 8192;
                        }
                        i7 |= i13;
                    }
                    i14 = i6 & 32;
                    if (i14 != 0) {
                        if ((196608 & i5) == 0) {
                            i15 = i3;
                            if (lp2Var.d(i15)) {
                                i16 = 131072;
                            } else {
                                i16 = DnsOverHttps.MAX_RESPONSE_SIZE;
                            }
                            i7 |= i16;
                        }
                        i17 = i6 & 64;
                        if (i17 != 0) {
                            i7 |= 1572864;
                            i18 = i4;
                        } else {
                            i18 = i4;
                            if ((i5 & 1572864) == 0) {
                                if (lp2Var.d(i18)) {
                                    i19 = 1048576;
                                } else {
                                    i19 = 524288;
                                }
                                i7 |= i19;
                            }
                        }
                        i20 = i6 & 128;
                        if (i20 != 0) {
                            i7 |= 12582912;
                        } else if ((i5 & 12582912) == 0) {
                            if (lp2Var.g(z)) {
                                i21 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                            } else {
                                i21 = 4194304;
                            }
                            i7 |= i21;
                        }
                        i22 = i6 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (i22 != 0) {
                            if ((i5 & 100663296) == 0) {
                                if (lp2Var.h(gn2Var)) {
                                    i23 = 67108864;
                                } else {
                                    i23 = 33554432;
                                }
                                i7 |= i23;
                            }
                            if ((i7 & 38347923) != 38347922) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (lp2Var.N(i7 & 1, z2)) {
                                lp2Var.S();
                                if ((i5 & 1) != 0 || lp2Var.x()) {
                                    if (i33 != 0) {
                                        kx4Var2 = hx4.X;
                                    }
                                    if (i8 != 0) {
                                        o88Var2 = null;
                                    }
                                    if ((i6 & 8) != 0) {
                                        i7 &= -7169;
                                        i10 = 5;
                                    }
                                    if (i11 != 0) {
                                        i12 = 2;
                                    }
                                    if (i14 != 0) {
                                        i15 = Integer.MAX_VALUE;
                                    }
                                    if (i17 != 0) {
                                        i18 = 1;
                                    }
                                    if (i20 != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = z;
                                    }
                                    if (i22 != 0) {
                                        z5 = z4;
                                        i28 = i7;
                                        kx4Var4 = kx4Var2;
                                        i29 = i10;
                                        i30 = i12;
                                        i31 = i15;
                                        gn2Var = null;
                                    } else {
                                        z5 = z4;
                                    }
                                    int i35 = i18;
                                    o88Var4 = o88Var2;
                                    lp2Var.q();
                                    objK = lp2Var.K();
                                    obj = zz0.a;
                                    if (objK == obj) {
                                        kw4 kw4Var = kw4.a;
                                        int iE = kw4.l().e(-1, "pref_font_size");
                                        aj2.X.getClass();
                                        objK = k32.g(iE);
                                        lp2Var.g0(objK);
                                    }
                                    aj2Var = (aj2) objK;
                                    o88Var5 = (o88) lp2Var.j(u78.a);
                                    j = ((dw0) lp2Var.j(j41.a)).a;
                                    zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                                    objK2 = lp2Var.K();
                                    if (zF || objK2 == obj) {
                                        jB = o88Var5.b();
                                        if (jB != 16) {
                                            j2 = jB;
                                        } else {
                                            j2 = j;
                                        }
                                        objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                                        lp2Var.g0(objK2);
                                    }
                                    o88Var6 = (o88) objK2;
                                    if ((i28 & 896) == 256) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    zF2 = z6 | lp2Var.f(o88Var6);
                                    objK3 = lp2Var.K();
                                    if (zF2 || objK3 == obj) {
                                        objK3 = o88Var6.d(o88Var4);
                                        lp2Var.g0(objK3);
                                    }
                                    o88Var7 = (o88) objK3;
                                    zF3 = lp2Var.f(o88Var7);
                                    objK4 = lp2Var.K();
                                    if (zF3 || objK4 == obj) {
                                        float fC = v88.c(o88Var7.a.b);
                                        iOrdinal = aj2Var.ordinal();
                                        if (iOrdinal == 0) {
                                            i32 = -2;
                                        } else if (iOrdinal != 1) {
                                            i32 = 2;
                                            if (iOrdinal != 2) {
                                                b61.c();
                                                return;
                                            }
                                        } else {
                                            i32 = 0;
                                        }
                                        objK4 = o88.a(o88Var7, 0L, eu7.i(fC + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                                        lp2Var.g0(objK4);
                                    }
                                    o88Var8 = (o88) objK4;
                                    if (z5) {
                                        mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                                    } else {
                                        mxVar = null;
                                    }
                                    o28 o28Var = new o28(i29);
                                    int i36 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                                    int i37 = i28 >> 6;
                                    int i38 = ((i28 >> 9) & 14) | (i37 & 896);
                                    int i39 = i28 >> 3;
                                    int i40 = i29;
                                    u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var, 0L, i30, false, i31, i35, gn2Var, o88Var8, lp2Var, i36, i38 | (57344 & i39) | (i39 & 458752) | (3670016 & i37), 11252);
                                    kx4Var3 = kx4Var4;
                                    i24 = i30;
                                    i25 = i31;
                                    i26 = i35;
                                    gn2Var2 = gn2Var;
                                    z3 = z5;
                                    o88Var3 = o88Var4;
                                    i27 = i40;
                                } else {
                                    lp2Var.Q();
                                    if ((i6 & 8) != 0) {
                                        i7 &= -7169;
                                    }
                                    z5 = z;
                                }
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                                int i310 = i18;
                                o88Var4 = o88Var2;
                                lp2Var.q();
                                objK = lp2Var.K();
                                obj = zz0.a;
                                if (objK == obj) {
                                    kw4 kw4Var2 = kw4.a;
                                    int iE2 = kw4.l().e(-1, "pref_font_size");
                                    aj2.X.getClass();
                                    objK = k32.g(iE2);
                                    lp2Var.g0(objK);
                                }
                                aj2Var = (aj2) objK;
                                o88Var5 = (o88) lp2Var.j(u78.a);
                                j = ((dw0) lp2Var.j(j41.a)).a;
                                zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                                objK2 = lp2Var.K();
                                if (zF) {
                                    jB = o88Var5.b();
                                    if (jB != 16) {
                                        j2 = jB;
                                    } else {
                                        j2 = j;
                                    }
                                    objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                                    lp2Var.g0(objK2);
                                } else {
                                    jB = o88Var5.b();
                                    if (jB != 16) {
                                        j2 = jB;
                                    } else {
                                        j2 = j;
                                    }
                                    objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                                    lp2Var.g0(objK2);
                                }
                                o88Var6 = (o88) objK2;
                                if ((i28 & 896) == 256) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                zF2 = z6 | lp2Var.f(o88Var6);
                                objK3 = lp2Var.K();
                                if (zF2) {
                                    objK3 = o88Var6.d(o88Var4);
                                    lp2Var.g0(objK3);
                                } else {
                                    objK3 = o88Var6.d(o88Var4);
                                    lp2Var.g0(objK3);
                                }
                                o88Var7 = (o88) objK3;
                                zF3 = lp2Var.f(o88Var7);
                                objK4 = lp2Var.K();
                                if (zF3) {
                                    float fC2 = v88.c(o88Var7.a.b);
                                    iOrdinal = aj2Var.ordinal();
                                    if (iOrdinal == 0) {
                                        i32 = -2;
                                    } else if (iOrdinal != 1) {
                                        i32 = 2;
                                        if (iOrdinal != 2) {
                                            b61.c();
                                            return;
                                        }
                                    } else {
                                        i32 = 0;
                                    }
                                    objK4 = o88.a(o88Var7, 0L, eu7.i(fC2 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                                    lp2Var.g0(objK4);
                                } else {
                                    float fC3 = v88.c(o88Var7.a.b);
                                    iOrdinal = aj2Var.ordinal();
                                    if (iOrdinal == 0) {
                                        i32 = -2;
                                    } else if (iOrdinal != 1) {
                                        i32 = 2;
                                        if (iOrdinal != 2) {
                                            b61.c();
                                            return;
                                        }
                                    } else {
                                        i32 = 0;
                                    }
                                    objK4 = o88.a(o88Var7, 0L, eu7.i(fC3 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                                    lp2Var.g0(objK4);
                                }
                                o88Var8 = (o88) objK4;
                                if (z5) {
                                    mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                                } else {
                                    mxVar = null;
                                }
                                o28 o28Var2 = new o28(i29);
                                int i311 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                                int i312 = i28 >> 6;
                                int i313 = ((i28 >> 9) & 14) | (i312 & 896);
                                int i314 = i28 >> 3;
                                int i41 = i29;
                                u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var2, 0L, i30, false, i31, i310, gn2Var, o88Var8, lp2Var, i311, i313 | (57344 & i314) | (i314 & 458752) | (3670016 & i312), 11252);
                                kx4Var3 = kx4Var4;
                                i24 = i30;
                                i25 = i31;
                                i26 = i310;
                                gn2Var2 = gn2Var;
                                z3 = z5;
                                o88Var3 = o88Var4;
                                i27 = i41;
                            } else {
                                lp2Var.Q();
                                z3 = z;
                                gn2Var2 = gn2Var;
                                kx4Var3 = kx4Var2;
                                o88Var3 = o88Var2;
                                i24 = i12;
                                i25 = i15;
                                i26 = i18;
                                i27 = i10;
                            }
                            j86VarR = lp2Var.r();
                            if (j86VarR != null) {
                                j86VarR.d = new rn2() { // from class: zy2
                                    @Override // defpackage.rn2
                                    public final Object K(Object obj2, Object obj3) {
                                        ((Integer) obj3).getClass();
                                        zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                                        return dn8.a;
                                    }
                                };
                            }
                        }
                        i7 |= 100663296;
                        if ((i7 & 38347923) != 38347922) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (lp2Var.N(i7 & 1, z2)) {
                            lp2Var.S();
                            if ((i5 & 1) != 0) {
                                if (i33 != 0) {
                                    kx4Var2 = hx4.X;
                                }
                                if (i8 != 0) {
                                    o88Var2 = null;
                                }
                                if ((i6 & 8) != 0) {
                                    i7 &= -7169;
                                    i10 = 5;
                                }
                                if (i11 != 0) {
                                    i12 = 2;
                                }
                                if (i14 != 0) {
                                    i15 = Integer.MAX_VALUE;
                                }
                                if (i17 != 0) {
                                    i18 = 1;
                                }
                                if (i20 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                if (i22 != 0) {
                                    z5 = z4;
                                    i28 = i7;
                                    kx4Var4 = kx4Var2;
                                    i29 = i10;
                                    i30 = i12;
                                    i31 = i15;
                                    gn2Var = null;
                                } else {
                                    z5 = z4;
                                    i28 = i7;
                                    kx4Var4 = kx4Var2;
                                    i29 = i10;
                                    i30 = i12;
                                    i31 = i15;
                                }
                            } else {
                                if (i33 != 0) {
                                    kx4Var2 = hx4.X;
                                }
                                if (i8 != 0) {
                                    o88Var2 = null;
                                }
                                if ((i6 & 8) != 0) {
                                    i7 &= -7169;
                                    i10 = 5;
                                }
                                if (i11 != 0) {
                                    i12 = 2;
                                }
                                if (i14 != 0) {
                                    i15 = Integer.MAX_VALUE;
                                }
                                if (i17 != 0) {
                                    i18 = 1;
                                }
                                if (i20 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                if (i22 != 0) {
                                    z5 = z4;
                                    i28 = i7;
                                    kx4Var4 = kx4Var2;
                                    i29 = i10;
                                    i30 = i12;
                                    i31 = i15;
                                    gn2Var = null;
                                } else {
                                    z5 = z4;
                                    i28 = i7;
                                    kx4Var4 = kx4Var2;
                                    i29 = i10;
                                    i30 = i12;
                                    i31 = i15;
                                }
                            }
                            int i315 = i18;
                            o88Var4 = o88Var2;
                            lp2Var.q();
                            objK = lp2Var.K();
                            obj = zz0.a;
                            if (objK == obj) {
                                kw4 kw4Var3 = kw4.a;
                                int iE3 = kw4.l().e(-1, "pref_font_size");
                                aj2.X.getClass();
                                objK = k32.g(iE3);
                                lp2Var.g0(objK);
                            }
                            aj2Var = (aj2) objK;
                            o88Var5 = (o88) lp2Var.j(u78.a);
                            j = ((dw0) lp2Var.j(j41.a)).a;
                            zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                            objK2 = lp2Var.K();
                            if (zF) {
                                jB = o88Var5.b();
                                if (jB != 16) {
                                    j2 = jB;
                                } else {
                                    j2 = j;
                                }
                                objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                                lp2Var.g0(objK2);
                            } else {
                                jB = o88Var5.b();
                                if (jB != 16) {
                                    j2 = jB;
                                } else {
                                    j2 = j;
                                }
                                objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                                lp2Var.g0(objK2);
                            }
                            o88Var6 = (o88) objK2;
                            if ((i28 & 896) == 256) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            zF2 = z6 | lp2Var.f(o88Var6);
                            objK3 = lp2Var.K();
                            if (zF2) {
                                objK3 = o88Var6.d(o88Var4);
                                lp2Var.g0(objK3);
                            } else {
                                objK3 = o88Var6.d(o88Var4);
                                lp2Var.g0(objK3);
                            }
                            o88Var7 = (o88) objK3;
                            zF3 = lp2Var.f(o88Var7);
                            objK4 = lp2Var.K();
                            if (zF3) {
                                float fC4 = v88.c(o88Var7.a.b);
                                iOrdinal = aj2Var.ordinal();
                                if (iOrdinal == 0) {
                                    i32 = -2;
                                } else if (iOrdinal != 1) {
                                    i32 = 2;
                                    if (iOrdinal != 2) {
                                        b61.c();
                                        return;
                                    }
                                } else {
                                    i32 = 0;
                                }
                                objK4 = o88.a(o88Var7, 0L, eu7.i(fC4 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                                lp2Var.g0(objK4);
                            } else {
                                float fC5 = v88.c(o88Var7.a.b);
                                iOrdinal = aj2Var.ordinal();
                                if (iOrdinal == 0) {
                                    i32 = -2;
                                } else if (iOrdinal != 1) {
                                    i32 = 2;
                                    if (iOrdinal != 2) {
                                        b61.c();
                                        return;
                                    }
                                } else {
                                    i32 = 0;
                                }
                                objK4 = o88.a(o88Var7, 0L, eu7.i(fC5 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                                lp2Var.g0(objK4);
                            }
                            o88Var8 = (o88) objK4;
                            if (z5) {
                                mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                            } else {
                                mxVar = null;
                            }
                            o28 o28Var3 = new o28(i29);
                            int i316 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                            int i317 = i28 >> 6;
                            int i318 = ((i28 >> 9) & 14) | (i317 & 896);
                            int i319 = i28 >> 3;
                            int i42 = i29;
                            u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var3, 0L, i30, false, i31, i315, gn2Var, o88Var8, lp2Var, i316, i318 | (57344 & i319) | (i319 & 458752) | (3670016 & i317), 11252);
                            kx4Var3 = kx4Var4;
                            i24 = i30;
                            i25 = i31;
                            i26 = i315;
                            gn2Var2 = gn2Var;
                            z3 = z5;
                            o88Var3 = o88Var4;
                            i27 = i42;
                        } else {
                            lp2Var.Q();
                            z3 = z;
                            gn2Var2 = gn2Var;
                            kx4Var3 = kx4Var2;
                            o88Var3 = o88Var2;
                            i24 = i12;
                            i25 = i15;
                            i26 = i18;
                            i27 = i10;
                        }
                        j86VarR = lp2Var.r();
                        if (j86VarR != null) {
                            j86VarR.d = new rn2() { // from class: zy2
                                @Override // defpackage.rn2
                                public final Object K(Object obj2, Object obj3) {
                                    ((Integer) obj3).getClass();
                                    zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                                    return dn8.a;
                                }
                            };
                        }
                    }
                    i7 |= 196608;
                    i15 = i3;
                    i17 = i6 & 64;
                    if (i17 != 0) {
                        i7 |= 1572864;
                        i18 = i4;
                    } else {
                        i18 = i4;
                        if ((i5 & 1572864) == 0) {
                            if (lp2Var.d(i18)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i7 |= i19;
                        }
                    }
                    i20 = i6 & 128;
                    if (i20 != 0) {
                        i7 |= 12582912;
                    } else if ((i5 & 12582912) == 0) {
                        if (lp2Var.g(z)) {
                            i21 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                        } else {
                            i21 = 4194304;
                        }
                        i7 |= i21;
                    }
                    i22 = i6 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i22 != 0) {
                        if ((i5 & 100663296) == 0) {
                            if (lp2Var.h(gn2Var)) {
                                i23 = 67108864;
                            } else {
                                i23 = 33554432;
                            }
                            i7 |= i23;
                        }
                        if ((i7 & 38347923) != 38347922) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (lp2Var.N(i7 & 1, z2)) {
                            lp2Var.S();
                            if ((i5 & 1) != 0) {
                                if (i33 != 0) {
                                    kx4Var2 = hx4.X;
                                }
                                if (i8 != 0) {
                                    o88Var2 = null;
                                }
                                if ((i6 & 8) != 0) {
                                    i7 &= -7169;
                                    i10 = 5;
                                }
                                if (i11 != 0) {
                                    i12 = 2;
                                }
                                if (i14 != 0) {
                                    i15 = Integer.MAX_VALUE;
                                }
                                if (i17 != 0) {
                                    i18 = 1;
                                }
                                if (i20 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                if (i22 != 0) {
                                    z5 = z4;
                                    i28 = i7;
                                    kx4Var4 = kx4Var2;
                                    i29 = i10;
                                    i30 = i12;
                                    i31 = i15;
                                    gn2Var = null;
                                } else {
                                    z5 = z4;
                                    i28 = i7;
                                    kx4Var4 = kx4Var2;
                                    i29 = i10;
                                    i30 = i12;
                                    i31 = i15;
                                }
                            } else {
                                if (i33 != 0) {
                                    kx4Var2 = hx4.X;
                                }
                                if (i8 != 0) {
                                    o88Var2 = null;
                                }
                                if ((i6 & 8) != 0) {
                                    i7 &= -7169;
                                    i10 = 5;
                                }
                                if (i11 != 0) {
                                    i12 = 2;
                                }
                                if (i14 != 0) {
                                    i15 = Integer.MAX_VALUE;
                                }
                                if (i17 != 0) {
                                    i18 = 1;
                                }
                                if (i20 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                if (i22 != 0) {
                                    z5 = z4;
                                    i28 = i7;
                                    kx4Var4 = kx4Var2;
                                    i29 = i10;
                                    i30 = i12;
                                    i31 = i15;
                                    gn2Var = null;
                                } else {
                                    z5 = z4;
                                    i28 = i7;
                                    kx4Var4 = kx4Var2;
                                    i29 = i10;
                                    i30 = i12;
                                    i31 = i15;
                                }
                            }
                            int i3110 = i18;
                            o88Var4 = o88Var2;
                            lp2Var.q();
                            objK = lp2Var.K();
                            obj = zz0.a;
                            if (objK == obj) {
                                kw4 kw4Var4 = kw4.a;
                                int iE4 = kw4.l().e(-1, "pref_font_size");
                                aj2.X.getClass();
                                objK = k32.g(iE4);
                                lp2Var.g0(objK);
                            }
                            aj2Var = (aj2) objK;
                            o88Var5 = (o88) lp2Var.j(u78.a);
                            j = ((dw0) lp2Var.j(j41.a)).a;
                            zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                            objK2 = lp2Var.K();
                            if (zF) {
                                jB = o88Var5.b();
                                if (jB != 16) {
                                    j2 = jB;
                                } else {
                                    j2 = j;
                                }
                                objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                                lp2Var.g0(objK2);
                            } else {
                                jB = o88Var5.b();
                                if (jB != 16) {
                                    j2 = jB;
                                } else {
                                    j2 = j;
                                }
                                objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                                lp2Var.g0(objK2);
                            }
                            o88Var6 = (o88) objK2;
                            if ((i28 & 896) == 256) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            zF2 = z6 | lp2Var.f(o88Var6);
                            objK3 = lp2Var.K();
                            if (zF2) {
                                objK3 = o88Var6.d(o88Var4);
                                lp2Var.g0(objK3);
                            } else {
                                objK3 = o88Var6.d(o88Var4);
                                lp2Var.g0(objK3);
                            }
                            o88Var7 = (o88) objK3;
                            zF3 = lp2Var.f(o88Var7);
                            objK4 = lp2Var.K();
                            if (zF3) {
                                float fC6 = v88.c(o88Var7.a.b);
                                iOrdinal = aj2Var.ordinal();
                                if (iOrdinal == 0) {
                                    i32 = -2;
                                } else if (iOrdinal != 1) {
                                    i32 = 2;
                                    if (iOrdinal != 2) {
                                        b61.c();
                                        return;
                                    }
                                } else {
                                    i32 = 0;
                                }
                                objK4 = o88.a(o88Var7, 0L, eu7.i(fC6 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                                lp2Var.g0(objK4);
                            } else {
                                float fC7 = v88.c(o88Var7.a.b);
                                iOrdinal = aj2Var.ordinal();
                                if (iOrdinal == 0) {
                                    i32 = -2;
                                } else if (iOrdinal != 1) {
                                    i32 = 2;
                                    if (iOrdinal != 2) {
                                        b61.c();
                                        return;
                                    }
                                } else {
                                    i32 = 0;
                                }
                                objK4 = o88.a(o88Var7, 0L, eu7.i(fC7 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                                lp2Var.g0(objK4);
                            }
                            o88Var8 = (o88) objK4;
                            if (z5) {
                                mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                            } else {
                                mxVar = null;
                            }
                            o28 o28Var4 = new o28(i29);
                            int i3111 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                            int i3112 = i28 >> 6;
                            int i3113 = ((i28 >> 9) & 14) | (i3112 & 896);
                            int i3114 = i28 >> 3;
                            int i43 = i29;
                            u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var4, 0L, i30, false, i31, i3110, gn2Var, o88Var8, lp2Var, i3111, i3113 | (57344 & i3114) | (i3114 & 458752) | (3670016 & i3112), 11252);
                            kx4Var3 = kx4Var4;
                            i24 = i30;
                            i25 = i31;
                            i26 = i3110;
                            gn2Var2 = gn2Var;
                            z3 = z5;
                            o88Var3 = o88Var4;
                            i27 = i43;
                        } else {
                            lp2Var.Q();
                            z3 = z;
                            gn2Var2 = gn2Var;
                            kx4Var3 = kx4Var2;
                            o88Var3 = o88Var2;
                            i24 = i12;
                            i25 = i15;
                            i26 = i18;
                            i27 = i10;
                        }
                        j86VarR = lp2Var.r();
                        if (j86VarR != null) {
                            j86VarR.d = new rn2() { // from class: zy2
                                @Override // defpackage.rn2
                                public final Object K(Object obj2, Object obj3) {
                                    ((Integer) obj3).getClass();
                                    zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                                    return dn8.a;
                                }
                            };
                        }
                    }
                    i7 |= 100663296;
                    if ((i7 & 38347923) != 38347922) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (lp2Var.N(i7 & 1, z2)) {
                        lp2Var.S();
                        if ((i5 & 1) != 0) {
                            if (i33 != 0) {
                                kx4Var2 = hx4.X;
                            }
                            if (i8 != 0) {
                                o88Var2 = null;
                            }
                            if ((i6 & 8) != 0) {
                                i7 &= -7169;
                                i10 = 5;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i17 != 0) {
                                i18 = 1;
                            }
                            if (i20 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i22 != 0) {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                                gn2Var = null;
                            } else {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                            }
                        } else {
                            if (i33 != 0) {
                                kx4Var2 = hx4.X;
                            }
                            if (i8 != 0) {
                                o88Var2 = null;
                            }
                            if ((i6 & 8) != 0) {
                                i7 &= -7169;
                                i10 = 5;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i17 != 0) {
                                i18 = 1;
                            }
                            if (i20 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i22 != 0) {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                                gn2Var = null;
                            } else {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                            }
                        }
                        int i3115 = i18;
                        o88Var4 = o88Var2;
                        lp2Var.q();
                        objK = lp2Var.K();
                        obj = zz0.a;
                        if (objK == obj) {
                            kw4 kw4Var5 = kw4.a;
                            int iE5 = kw4.l().e(-1, "pref_font_size");
                            aj2.X.getClass();
                            objK = k32.g(iE5);
                            lp2Var.g0(objK);
                        }
                        aj2Var = (aj2) objK;
                        o88Var5 = (o88) lp2Var.j(u78.a);
                        j = ((dw0) lp2Var.j(j41.a)).a;
                        zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                        objK2 = lp2Var.K();
                        if (zF) {
                            jB = o88Var5.b();
                            if (jB != 16) {
                                j2 = jB;
                            } else {
                                j2 = j;
                            }
                            objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                            lp2Var.g0(objK2);
                        } else {
                            jB = o88Var5.b();
                            if (jB != 16) {
                                j2 = jB;
                            } else {
                                j2 = j;
                            }
                            objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                            lp2Var.g0(objK2);
                        }
                        o88Var6 = (o88) objK2;
                        if ((i28 & 896) == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        zF2 = z6 | lp2Var.f(o88Var6);
                        objK3 = lp2Var.K();
                        if (zF2) {
                            objK3 = o88Var6.d(o88Var4);
                            lp2Var.g0(objK3);
                        } else {
                            objK3 = o88Var6.d(o88Var4);
                            lp2Var.g0(objK3);
                        }
                        o88Var7 = (o88) objK3;
                        zF3 = lp2Var.f(o88Var7);
                        objK4 = lp2Var.K();
                        if (zF3) {
                            float fC8 = v88.c(o88Var7.a.b);
                            iOrdinal = aj2Var.ordinal();
                            if (iOrdinal == 0) {
                                i32 = -2;
                            } else if (iOrdinal != 1) {
                                i32 = 2;
                                if (iOrdinal != 2) {
                                    b61.c();
                                    return;
                                }
                            } else {
                                i32 = 0;
                            }
                            objK4 = o88.a(o88Var7, 0L, eu7.i(fC8 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                            lp2Var.g0(objK4);
                        } else {
                            float fC9 = v88.c(o88Var7.a.b);
                            iOrdinal = aj2Var.ordinal();
                            if (iOrdinal == 0) {
                                i32 = -2;
                            } else if (iOrdinal != 1) {
                                i32 = 2;
                                if (iOrdinal != 2) {
                                    b61.c();
                                    return;
                                }
                            } else {
                                i32 = 0;
                            }
                            objK4 = o88.a(o88Var7, 0L, eu7.i(fC9 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                            lp2Var.g0(objK4);
                        }
                        o88Var8 = (o88) objK4;
                        if (z5) {
                            mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                        } else {
                            mxVar = null;
                        }
                        o28 o28Var5 = new o28(i29);
                        int i3116 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                        int i3117 = i28 >> 6;
                        int i3118 = ((i28 >> 9) & 14) | (i3117 & 896);
                        int i3119 = i28 >> 3;
                        int i44 = i29;
                        u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var5, 0L, i30, false, i31, i3115, gn2Var, o88Var8, lp2Var, i3116, i3118 | (57344 & i3119) | (i3119 & 458752) | (3670016 & i3117), 11252);
                        kx4Var3 = kx4Var4;
                        i24 = i30;
                        i25 = i31;
                        i26 = i3115;
                        gn2Var2 = gn2Var;
                        z3 = z5;
                        o88Var3 = o88Var4;
                        i27 = i44;
                    } else {
                        lp2Var.Q();
                        z3 = z;
                        gn2Var2 = gn2Var;
                        kx4Var3 = kx4Var2;
                        o88Var3 = o88Var2;
                        i24 = i12;
                        i25 = i15;
                        i26 = i18;
                        i27 = i10;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: zy2
                            @Override // defpackage.rn2
                            public final Object K(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                                return dn8.a;
                            }
                        };
                    }
                }
                i7 |= 24576;
                i12 = i2;
                i14 = i6 & 32;
                if (i14 != 0) {
                    if ((196608 & i5) == 0) {
                        i15 = i3;
                        if (lp2Var.d(i15)) {
                            i16 = 131072;
                        } else {
                            i16 = DnsOverHttps.MAX_RESPONSE_SIZE;
                        }
                        i7 |= i16;
                    }
                    i17 = i6 & 64;
                    if (i17 != 0) {
                        i7 |= 1572864;
                        i18 = i4;
                    } else {
                        i18 = i4;
                        if ((i5 & 1572864) == 0) {
                            if (lp2Var.d(i18)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i7 |= i19;
                        }
                    }
                    i20 = i6 & 128;
                    if (i20 != 0) {
                        i7 |= 12582912;
                    } else if ((i5 & 12582912) == 0) {
                        if (lp2Var.g(z)) {
                            i21 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                        } else {
                            i21 = 4194304;
                        }
                        i7 |= i21;
                    }
                    i22 = i6 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i22 != 0) {
                        if ((i5 & 100663296) == 0) {
                            if (lp2Var.h(gn2Var)) {
                                i23 = 67108864;
                            } else {
                                i23 = 33554432;
                            }
                            i7 |= i23;
                        }
                        if ((i7 & 38347923) != 38347922) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (lp2Var.N(i7 & 1, z2)) {
                            lp2Var.S();
                            if ((i5 & 1) != 0) {
                                if (i33 != 0) {
                                    kx4Var2 = hx4.X;
                                }
                                if (i8 != 0) {
                                    o88Var2 = null;
                                }
                                if ((i6 & 8) != 0) {
                                    i7 &= -7169;
                                    i10 = 5;
                                }
                                if (i11 != 0) {
                                    i12 = 2;
                                }
                                if (i14 != 0) {
                                    i15 = Integer.MAX_VALUE;
                                }
                                if (i17 != 0) {
                                    i18 = 1;
                                }
                                if (i20 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                if (i22 != 0) {
                                    z5 = z4;
                                    i28 = i7;
                                    kx4Var4 = kx4Var2;
                                    i29 = i10;
                                    i30 = i12;
                                    i31 = i15;
                                    gn2Var = null;
                                } else {
                                    z5 = z4;
                                    i28 = i7;
                                    kx4Var4 = kx4Var2;
                                    i29 = i10;
                                    i30 = i12;
                                    i31 = i15;
                                }
                            } else {
                                if (i33 != 0) {
                                    kx4Var2 = hx4.X;
                                }
                                if (i8 != 0) {
                                    o88Var2 = null;
                                }
                                if ((i6 & 8) != 0) {
                                    i7 &= -7169;
                                    i10 = 5;
                                }
                                if (i11 != 0) {
                                    i12 = 2;
                                }
                                if (i14 != 0) {
                                    i15 = Integer.MAX_VALUE;
                                }
                                if (i17 != 0) {
                                    i18 = 1;
                                }
                                if (i20 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                if (i22 != 0) {
                                    z5 = z4;
                                    i28 = i7;
                                    kx4Var4 = kx4Var2;
                                    i29 = i10;
                                    i30 = i12;
                                    i31 = i15;
                                    gn2Var = null;
                                } else {
                                    z5 = z4;
                                    i28 = i7;
                                    kx4Var4 = kx4Var2;
                                    i29 = i10;
                                    i30 = i12;
                                    i31 = i15;
                                }
                            }
                            int i31110 = i18;
                            o88Var4 = o88Var2;
                            lp2Var.q();
                            objK = lp2Var.K();
                            obj = zz0.a;
                            if (objK == obj) {
                                kw4 kw4Var6 = kw4.a;
                                int iE6 = kw4.l().e(-1, "pref_font_size");
                                aj2.X.getClass();
                                objK = k32.g(iE6);
                                lp2Var.g0(objK);
                            }
                            aj2Var = (aj2) objK;
                            o88Var5 = (o88) lp2Var.j(u78.a);
                            j = ((dw0) lp2Var.j(j41.a)).a;
                            zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                            objK2 = lp2Var.K();
                            if (zF) {
                                jB = o88Var5.b();
                                if (jB != 16) {
                                    j2 = jB;
                                } else {
                                    j2 = j;
                                }
                                objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                                lp2Var.g0(objK2);
                            } else {
                                jB = o88Var5.b();
                                if (jB != 16) {
                                    j2 = jB;
                                } else {
                                    j2 = j;
                                }
                                objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                                lp2Var.g0(objK2);
                            }
                            o88Var6 = (o88) objK2;
                            if ((i28 & 896) == 256) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            zF2 = z6 | lp2Var.f(o88Var6);
                            objK3 = lp2Var.K();
                            if (zF2) {
                                objK3 = o88Var6.d(o88Var4);
                                lp2Var.g0(objK3);
                            } else {
                                objK3 = o88Var6.d(o88Var4);
                                lp2Var.g0(objK3);
                            }
                            o88Var7 = (o88) objK3;
                            zF3 = lp2Var.f(o88Var7);
                            objK4 = lp2Var.K();
                            if (zF3) {
                                float fC10 = v88.c(o88Var7.a.b);
                                iOrdinal = aj2Var.ordinal();
                                if (iOrdinal == 0) {
                                    i32 = -2;
                                } else if (iOrdinal != 1) {
                                    i32 = 2;
                                    if (iOrdinal != 2) {
                                        b61.c();
                                        return;
                                    }
                                } else {
                                    i32 = 0;
                                }
                                objK4 = o88.a(o88Var7, 0L, eu7.i(fC10 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                                lp2Var.g0(objK4);
                            } else {
                                float fC11 = v88.c(o88Var7.a.b);
                                iOrdinal = aj2Var.ordinal();
                                if (iOrdinal == 0) {
                                    i32 = -2;
                                } else if (iOrdinal != 1) {
                                    i32 = 2;
                                    if (iOrdinal != 2) {
                                        b61.c();
                                        return;
                                    }
                                } else {
                                    i32 = 0;
                                }
                                objK4 = o88.a(o88Var7, 0L, eu7.i(fC11 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                                lp2Var.g0(objK4);
                            }
                            o88Var8 = (o88) objK4;
                            if (z5) {
                                mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                            } else {
                                mxVar = null;
                            }
                            o28 o28Var6 = new o28(i29);
                            int i31111 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                            int i31112 = i28 >> 6;
                            int i31113 = ((i28 >> 9) & 14) | (i31112 & 896);
                            int i31114 = i28 >> 3;
                            int i45 = i29;
                            u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var6, 0L, i30, false, i31, i31110, gn2Var, o88Var8, lp2Var, i31111, i31113 | (57344 & i31114) | (i31114 & 458752) | (3670016 & i31112), 11252);
                            kx4Var3 = kx4Var4;
                            i24 = i30;
                            i25 = i31;
                            i26 = i31110;
                            gn2Var2 = gn2Var;
                            z3 = z5;
                            o88Var3 = o88Var4;
                            i27 = i45;
                        } else {
                            lp2Var.Q();
                            z3 = z;
                            gn2Var2 = gn2Var;
                            kx4Var3 = kx4Var2;
                            o88Var3 = o88Var2;
                            i24 = i12;
                            i25 = i15;
                            i26 = i18;
                            i27 = i10;
                        }
                        j86VarR = lp2Var.r();
                        if (j86VarR != null) {
                            j86VarR.d = new rn2() { // from class: zy2
                                @Override // defpackage.rn2
                                public final Object K(Object obj2, Object obj3) {
                                    ((Integer) obj3).getClass();
                                    zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                                    return dn8.a;
                                }
                            };
                        }
                    }
                    i7 |= 100663296;
                    if ((i7 & 38347923) != 38347922) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (lp2Var.N(i7 & 1, z2)) {
                        lp2Var.S();
                        if ((i5 & 1) != 0) {
                            if (i33 != 0) {
                                kx4Var2 = hx4.X;
                            }
                            if (i8 != 0) {
                                o88Var2 = null;
                            }
                            if ((i6 & 8) != 0) {
                                i7 &= -7169;
                                i10 = 5;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i17 != 0) {
                                i18 = 1;
                            }
                            if (i20 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i22 != 0) {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                                gn2Var = null;
                            } else {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                            }
                        } else {
                            if (i33 != 0) {
                                kx4Var2 = hx4.X;
                            }
                            if (i8 != 0) {
                                o88Var2 = null;
                            }
                            if ((i6 & 8) != 0) {
                                i7 &= -7169;
                                i10 = 5;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i17 != 0) {
                                i18 = 1;
                            }
                            if (i20 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i22 != 0) {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                                gn2Var = null;
                            } else {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                            }
                        }
                        int i31115 = i18;
                        o88Var4 = o88Var2;
                        lp2Var.q();
                        objK = lp2Var.K();
                        obj = zz0.a;
                        if (objK == obj) {
                            kw4 kw4Var7 = kw4.a;
                            int iE7 = kw4.l().e(-1, "pref_font_size");
                            aj2.X.getClass();
                            objK = k32.g(iE7);
                            lp2Var.g0(objK);
                        }
                        aj2Var = (aj2) objK;
                        o88Var5 = (o88) lp2Var.j(u78.a);
                        j = ((dw0) lp2Var.j(j41.a)).a;
                        zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                        objK2 = lp2Var.K();
                        if (zF) {
                            jB = o88Var5.b();
                            if (jB != 16) {
                                j2 = jB;
                            } else {
                                j2 = j;
                            }
                            objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                            lp2Var.g0(objK2);
                        } else {
                            jB = o88Var5.b();
                            if (jB != 16) {
                                j2 = jB;
                            } else {
                                j2 = j;
                            }
                            objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                            lp2Var.g0(objK2);
                        }
                        o88Var6 = (o88) objK2;
                        if ((i28 & 896) == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        zF2 = z6 | lp2Var.f(o88Var6);
                        objK3 = lp2Var.K();
                        if (zF2) {
                            objK3 = o88Var6.d(o88Var4);
                            lp2Var.g0(objK3);
                        } else {
                            objK3 = o88Var6.d(o88Var4);
                            lp2Var.g0(objK3);
                        }
                        o88Var7 = (o88) objK3;
                        zF3 = lp2Var.f(o88Var7);
                        objK4 = lp2Var.K();
                        if (zF3) {
                            float fC12 = v88.c(o88Var7.a.b);
                            iOrdinal = aj2Var.ordinal();
                            if (iOrdinal == 0) {
                                i32 = -2;
                            } else if (iOrdinal != 1) {
                                i32 = 2;
                                if (iOrdinal != 2) {
                                    b61.c();
                                    return;
                                }
                            } else {
                                i32 = 0;
                            }
                            objK4 = o88.a(o88Var7, 0L, eu7.i(fC12 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                            lp2Var.g0(objK4);
                        } else {
                            float fC13 = v88.c(o88Var7.a.b);
                            iOrdinal = aj2Var.ordinal();
                            if (iOrdinal == 0) {
                                i32 = -2;
                            } else if (iOrdinal != 1) {
                                i32 = 2;
                                if (iOrdinal != 2) {
                                    b61.c();
                                    return;
                                }
                            } else {
                                i32 = 0;
                            }
                            objK4 = o88.a(o88Var7, 0L, eu7.i(fC13 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                            lp2Var.g0(objK4);
                        }
                        o88Var8 = (o88) objK4;
                        if (z5) {
                            mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                        } else {
                            mxVar = null;
                        }
                        o28 o28Var7 = new o28(i29);
                        int i31116 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                        int i31117 = i28 >> 6;
                        int i31118 = ((i28 >> 9) & 14) | (i31117 & 896);
                        int i31119 = i28 >> 3;
                        int i46 = i29;
                        u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var7, 0L, i30, false, i31, i31115, gn2Var, o88Var8, lp2Var, i31116, i31118 | (57344 & i31119) | (i31119 & 458752) | (3670016 & i31117), 11252);
                        kx4Var3 = kx4Var4;
                        i24 = i30;
                        i25 = i31;
                        i26 = i31115;
                        gn2Var2 = gn2Var;
                        z3 = z5;
                        o88Var3 = o88Var4;
                        i27 = i46;
                    } else {
                        lp2Var.Q();
                        z3 = z;
                        gn2Var2 = gn2Var;
                        kx4Var3 = kx4Var2;
                        o88Var3 = o88Var2;
                        i24 = i12;
                        i25 = i15;
                        i26 = i18;
                        i27 = i10;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: zy2
                            @Override // defpackage.rn2
                            public final Object K(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                                return dn8.a;
                            }
                        };
                    }
                }
                i7 |= 196608;
                i15 = i3;
                i17 = i6 & 64;
                if (i17 != 0) {
                    i7 |= 1572864;
                    i18 = i4;
                } else {
                    i18 = i4;
                    if ((i5 & 1572864) == 0) {
                        if (lp2Var.d(i18)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i7 |= i19;
                    }
                }
                i20 = i6 & 128;
                if (i20 != 0) {
                    i7 |= 12582912;
                } else if ((i5 & 12582912) == 0) {
                    if (lp2Var.g(z)) {
                        i21 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                    } else {
                        i21 = 4194304;
                    }
                    i7 |= i21;
                }
                i22 = i6 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i22 != 0) {
                    if ((i5 & 100663296) == 0) {
                        if (lp2Var.h(gn2Var)) {
                            i23 = 67108864;
                        } else {
                            i23 = 33554432;
                        }
                        i7 |= i23;
                    }
                    if ((i7 & 38347923) != 38347922) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (lp2Var.N(i7 & 1, z2)) {
                        lp2Var.S();
                        if ((i5 & 1) != 0) {
                            if (i33 != 0) {
                                kx4Var2 = hx4.X;
                            }
                            if (i8 != 0) {
                                o88Var2 = null;
                            }
                            if ((i6 & 8) != 0) {
                                i7 &= -7169;
                                i10 = 5;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i17 != 0) {
                                i18 = 1;
                            }
                            if (i20 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i22 != 0) {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                                gn2Var = null;
                            } else {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                            }
                        } else {
                            if (i33 != 0) {
                                kx4Var2 = hx4.X;
                            }
                            if (i8 != 0) {
                                o88Var2 = null;
                            }
                            if ((i6 & 8) != 0) {
                                i7 &= -7169;
                                i10 = 5;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i17 != 0) {
                                i18 = 1;
                            }
                            if (i20 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i22 != 0) {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                                gn2Var = null;
                            } else {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                            }
                        }
                        int i311110 = i18;
                        o88Var4 = o88Var2;
                        lp2Var.q();
                        objK = lp2Var.K();
                        obj = zz0.a;
                        if (objK == obj) {
                            kw4 kw4Var8 = kw4.a;
                            int iE8 = kw4.l().e(-1, "pref_font_size");
                            aj2.X.getClass();
                            objK = k32.g(iE8);
                            lp2Var.g0(objK);
                        }
                        aj2Var = (aj2) objK;
                        o88Var5 = (o88) lp2Var.j(u78.a);
                        j = ((dw0) lp2Var.j(j41.a)).a;
                        zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                        objK2 = lp2Var.K();
                        if (zF) {
                            jB = o88Var5.b();
                            if (jB != 16) {
                                j2 = jB;
                            } else {
                                j2 = j;
                            }
                            objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                            lp2Var.g0(objK2);
                        } else {
                            jB = o88Var5.b();
                            if (jB != 16) {
                                j2 = jB;
                            } else {
                                j2 = j;
                            }
                            objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                            lp2Var.g0(objK2);
                        }
                        o88Var6 = (o88) objK2;
                        if ((i28 & 896) == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        zF2 = z6 | lp2Var.f(o88Var6);
                        objK3 = lp2Var.K();
                        if (zF2) {
                            objK3 = o88Var6.d(o88Var4);
                            lp2Var.g0(objK3);
                        } else {
                            objK3 = o88Var6.d(o88Var4);
                            lp2Var.g0(objK3);
                        }
                        o88Var7 = (o88) objK3;
                        zF3 = lp2Var.f(o88Var7);
                        objK4 = lp2Var.K();
                        if (zF3) {
                            float fC14 = v88.c(o88Var7.a.b);
                            iOrdinal = aj2Var.ordinal();
                            if (iOrdinal == 0) {
                                i32 = -2;
                            } else if (iOrdinal != 1) {
                                i32 = 2;
                                if (iOrdinal != 2) {
                                    b61.c();
                                    return;
                                }
                            } else {
                                i32 = 0;
                            }
                            objK4 = o88.a(o88Var7, 0L, eu7.i(fC14 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                            lp2Var.g0(objK4);
                        } else {
                            float fC15 = v88.c(o88Var7.a.b);
                            iOrdinal = aj2Var.ordinal();
                            if (iOrdinal == 0) {
                                i32 = -2;
                            } else if (iOrdinal != 1) {
                                i32 = 2;
                                if (iOrdinal != 2) {
                                    b61.c();
                                    return;
                                }
                            } else {
                                i32 = 0;
                            }
                            objK4 = o88.a(o88Var7, 0L, eu7.i(fC15 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                            lp2Var.g0(objK4);
                        }
                        o88Var8 = (o88) objK4;
                        if (z5) {
                            mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                        } else {
                            mxVar = null;
                        }
                        o28 o28Var8 = new o28(i29);
                        int i311111 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                        int i311112 = i28 >> 6;
                        int i311113 = ((i28 >> 9) & 14) | (i311112 & 896);
                        int i311114 = i28 >> 3;
                        int i47 = i29;
                        u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var8, 0L, i30, false, i31, i311110, gn2Var, o88Var8, lp2Var, i311111, i311113 | (57344 & i311114) | (i311114 & 458752) | (3670016 & i311112), 11252);
                        kx4Var3 = kx4Var4;
                        i24 = i30;
                        i25 = i31;
                        i26 = i311110;
                        gn2Var2 = gn2Var;
                        z3 = z5;
                        o88Var3 = o88Var4;
                        i27 = i47;
                    } else {
                        lp2Var.Q();
                        z3 = z;
                        gn2Var2 = gn2Var;
                        kx4Var3 = kx4Var2;
                        o88Var3 = o88Var2;
                        i24 = i12;
                        i25 = i15;
                        i26 = i18;
                        i27 = i10;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: zy2
                            @Override // defpackage.rn2
                            public final Object K(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                                return dn8.a;
                            }
                        };
                    }
                }
                i7 |= 100663296;
                if ((i7 & 38347923) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (lp2Var.N(i7 & 1, z2)) {
                    lp2Var.S();
                    if ((i5 & 1) != 0) {
                        if (i33 != 0) {
                            kx4Var2 = hx4.X;
                        }
                        if (i8 != 0) {
                            o88Var2 = null;
                        }
                        if ((i6 & 8) != 0) {
                            i7 &= -7169;
                            i10 = 5;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i17 != 0) {
                            i18 = 1;
                        }
                        if (i20 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i22 != 0) {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                            gn2Var = null;
                        } else {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                        }
                    } else {
                        if (i33 != 0) {
                            kx4Var2 = hx4.X;
                        }
                        if (i8 != 0) {
                            o88Var2 = null;
                        }
                        if ((i6 & 8) != 0) {
                            i7 &= -7169;
                            i10 = 5;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i17 != 0) {
                            i18 = 1;
                        }
                        if (i20 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i22 != 0) {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                            gn2Var = null;
                        } else {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                        }
                    }
                    int i311115 = i18;
                    o88Var4 = o88Var2;
                    lp2Var.q();
                    objK = lp2Var.K();
                    obj = zz0.a;
                    if (objK == obj) {
                        kw4 kw4Var9 = kw4.a;
                        int iE9 = kw4.l().e(-1, "pref_font_size");
                        aj2.X.getClass();
                        objK = k32.g(iE9);
                        lp2Var.g0(objK);
                    }
                    aj2Var = (aj2) objK;
                    o88Var5 = (o88) lp2Var.j(u78.a);
                    j = ((dw0) lp2Var.j(j41.a)).a;
                    zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                    objK2 = lp2Var.K();
                    if (zF) {
                        jB = o88Var5.b();
                        if (jB != 16) {
                            j2 = jB;
                        } else {
                            j2 = j;
                        }
                        objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                        lp2Var.g0(objK2);
                    } else {
                        jB = o88Var5.b();
                        if (jB != 16) {
                            j2 = jB;
                        } else {
                            j2 = j;
                        }
                        objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                        lp2Var.g0(objK2);
                    }
                    o88Var6 = (o88) objK2;
                    if ((i28 & 896) == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    zF2 = z6 | lp2Var.f(o88Var6);
                    objK3 = lp2Var.K();
                    if (zF2) {
                        objK3 = o88Var6.d(o88Var4);
                        lp2Var.g0(objK3);
                    } else {
                        objK3 = o88Var6.d(o88Var4);
                        lp2Var.g0(objK3);
                    }
                    o88Var7 = (o88) objK3;
                    zF3 = lp2Var.f(o88Var7);
                    objK4 = lp2Var.K();
                    if (zF3) {
                        float fC16 = v88.c(o88Var7.a.b);
                        iOrdinal = aj2Var.ordinal();
                        if (iOrdinal == 0) {
                            i32 = -2;
                        } else if (iOrdinal != 1) {
                            i32 = 2;
                            if (iOrdinal != 2) {
                                b61.c();
                                return;
                            }
                        } else {
                            i32 = 0;
                        }
                        objK4 = o88.a(o88Var7, 0L, eu7.i(fC16 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                        lp2Var.g0(objK4);
                    } else {
                        float fC17 = v88.c(o88Var7.a.b);
                        iOrdinal = aj2Var.ordinal();
                        if (iOrdinal == 0) {
                            i32 = -2;
                        } else if (iOrdinal != 1) {
                            i32 = 2;
                            if (iOrdinal != 2) {
                                b61.c();
                                return;
                            }
                        } else {
                            i32 = 0;
                        }
                        objK4 = o88.a(o88Var7, 0L, eu7.i(fC17 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                        lp2Var.g0(objK4);
                    }
                    o88Var8 = (o88) objK4;
                    if (z5) {
                        mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                    } else {
                        mxVar = null;
                    }
                    o28 o28Var9 = new o28(i29);
                    int i311116 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                    int i311117 = i28 >> 6;
                    int i311118 = ((i28 >> 9) & 14) | (i311117 & 896);
                    int i311119 = i28 >> 3;
                    int i48 = i29;
                    u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var9, 0L, i30, false, i31, i311115, gn2Var, o88Var8, lp2Var, i311116, i311118 | (57344 & i311119) | (i311119 & 458752) | (3670016 & i311117), 11252);
                    kx4Var3 = kx4Var4;
                    i24 = i30;
                    i25 = i31;
                    i26 = i311115;
                    gn2Var2 = gn2Var;
                    z3 = z5;
                    o88Var3 = o88Var4;
                    i27 = i48;
                } else {
                    lp2Var.Q();
                    z3 = z;
                    gn2Var2 = gn2Var;
                    kx4Var3 = kx4Var2;
                    o88Var3 = o88Var2;
                    i24 = i12;
                    i25 = i15;
                    i26 = i18;
                    i27 = i10;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: zy2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                            return dn8.a;
                        }
                    };
                }
            }
            i7 |= 384;
            o88Var2 = o88Var;
            if ((i5 & 3072) == 0) {
                if ((i6 & 8) == 0) {
                    i10 = i;
                    if (lp2Var.d(i10)) {
                    }
                    i7 |= i34;
                } else {
                    i10 = i;
                }
                i7 |= i34;
            } else {
                i10 = i;
            }
            i11 = i6 & 16;
            if (i11 != 0) {
                if ((i5 & 24576) == 0) {
                    i12 = i2;
                    if (lp2Var.d(i12)) {
                        i13 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i13 = 8192;
                    }
                    i7 |= i13;
                }
                i14 = i6 & 32;
                if (i14 != 0) {
                    if ((196608 & i5) == 0) {
                        i15 = i3;
                        if (lp2Var.d(i15)) {
                            i16 = 131072;
                        } else {
                            i16 = DnsOverHttps.MAX_RESPONSE_SIZE;
                        }
                        i7 |= i16;
                    }
                    i17 = i6 & 64;
                    if (i17 != 0) {
                        i7 |= 1572864;
                        i18 = i4;
                    } else {
                        i18 = i4;
                        if ((i5 & 1572864) == 0) {
                            if (lp2Var.d(i18)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i7 |= i19;
                        }
                    }
                    i20 = i6 & 128;
                    if (i20 != 0) {
                        i7 |= 12582912;
                    } else if ((i5 & 12582912) == 0) {
                        if (lp2Var.g(z)) {
                            i21 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                        } else {
                            i21 = 4194304;
                        }
                        i7 |= i21;
                    }
                    i22 = i6 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i22 != 0) {
                        if ((i5 & 100663296) == 0) {
                            if (lp2Var.h(gn2Var)) {
                                i23 = 67108864;
                            } else {
                                i23 = 33554432;
                            }
                            i7 |= i23;
                        }
                        if ((i7 & 38347923) != 38347922) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (lp2Var.N(i7 & 1, z2)) {
                            lp2Var.S();
                            if ((i5 & 1) != 0) {
                                if (i33 != 0) {
                                    kx4Var2 = hx4.X;
                                }
                                if (i8 != 0) {
                                    o88Var2 = null;
                                }
                                if ((i6 & 8) != 0) {
                                    i7 &= -7169;
                                    i10 = 5;
                                }
                                if (i11 != 0) {
                                    i12 = 2;
                                }
                                if (i14 != 0) {
                                    i15 = Integer.MAX_VALUE;
                                }
                                if (i17 != 0) {
                                    i18 = 1;
                                }
                                if (i20 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                if (i22 != 0) {
                                    z5 = z4;
                                    i28 = i7;
                                    kx4Var4 = kx4Var2;
                                    i29 = i10;
                                    i30 = i12;
                                    i31 = i15;
                                    gn2Var = null;
                                } else {
                                    z5 = z4;
                                    i28 = i7;
                                    kx4Var4 = kx4Var2;
                                    i29 = i10;
                                    i30 = i12;
                                    i31 = i15;
                                }
                            } else {
                                if (i33 != 0) {
                                    kx4Var2 = hx4.X;
                                }
                                if (i8 != 0) {
                                    o88Var2 = null;
                                }
                                if ((i6 & 8) != 0) {
                                    i7 &= -7169;
                                    i10 = 5;
                                }
                                if (i11 != 0) {
                                    i12 = 2;
                                }
                                if (i14 != 0) {
                                    i15 = Integer.MAX_VALUE;
                                }
                                if (i17 != 0) {
                                    i18 = 1;
                                }
                                if (i20 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                if (i22 != 0) {
                                    z5 = z4;
                                    i28 = i7;
                                    kx4Var4 = kx4Var2;
                                    i29 = i10;
                                    i30 = i12;
                                    i31 = i15;
                                    gn2Var = null;
                                } else {
                                    z5 = z4;
                                    i28 = i7;
                                    kx4Var4 = kx4Var2;
                                    i29 = i10;
                                    i30 = i12;
                                    i31 = i15;
                                }
                            }
                            int i3111110 = i18;
                            o88Var4 = o88Var2;
                            lp2Var.q();
                            objK = lp2Var.K();
                            obj = zz0.a;
                            if (objK == obj) {
                                kw4 kw4Var10 = kw4.a;
                                int iE10 = kw4.l().e(-1, "pref_font_size");
                                aj2.X.getClass();
                                objK = k32.g(iE10);
                                lp2Var.g0(objK);
                            }
                            aj2Var = (aj2) objK;
                            o88Var5 = (o88) lp2Var.j(u78.a);
                            j = ((dw0) lp2Var.j(j41.a)).a;
                            zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                            objK2 = lp2Var.K();
                            if (zF) {
                                jB = o88Var5.b();
                                if (jB != 16) {
                                    j2 = jB;
                                } else {
                                    j2 = j;
                                }
                                objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                                lp2Var.g0(objK2);
                            } else {
                                jB = o88Var5.b();
                                if (jB != 16) {
                                    j2 = jB;
                                } else {
                                    j2 = j;
                                }
                                objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                                lp2Var.g0(objK2);
                            }
                            o88Var6 = (o88) objK2;
                            if ((i28 & 896) == 256) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            zF2 = z6 | lp2Var.f(o88Var6);
                            objK3 = lp2Var.K();
                            if (zF2) {
                                objK3 = o88Var6.d(o88Var4);
                                lp2Var.g0(objK3);
                            } else {
                                objK3 = o88Var6.d(o88Var4);
                                lp2Var.g0(objK3);
                            }
                            o88Var7 = (o88) objK3;
                            zF3 = lp2Var.f(o88Var7);
                            objK4 = lp2Var.K();
                            if (zF3) {
                                float fC18 = v88.c(o88Var7.a.b);
                                iOrdinal = aj2Var.ordinal();
                                if (iOrdinal == 0) {
                                    i32 = -2;
                                } else if (iOrdinal != 1) {
                                    i32 = 2;
                                    if (iOrdinal != 2) {
                                        b61.c();
                                        return;
                                    }
                                } else {
                                    i32 = 0;
                                }
                                objK4 = o88.a(o88Var7, 0L, eu7.i(fC18 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                                lp2Var.g0(objK4);
                            } else {
                                float fC19 = v88.c(o88Var7.a.b);
                                iOrdinal = aj2Var.ordinal();
                                if (iOrdinal == 0) {
                                    i32 = -2;
                                } else if (iOrdinal != 1) {
                                    i32 = 2;
                                    if (iOrdinal != 2) {
                                        b61.c();
                                        return;
                                    }
                                } else {
                                    i32 = 0;
                                }
                                objK4 = o88.a(o88Var7, 0L, eu7.i(fC19 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                                lp2Var.g0(objK4);
                            }
                            o88Var8 = (o88) objK4;
                            if (z5) {
                                mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                            } else {
                                mxVar = null;
                            }
                            o28 o28Var10 = new o28(i29);
                            int i3111111 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                            int i3111112 = i28 >> 6;
                            int i3111113 = ((i28 >> 9) & 14) | (i3111112 & 896);
                            int i3111114 = i28 >> 3;
                            int i49 = i29;
                            u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var10, 0L, i30, false, i31, i3111110, gn2Var, o88Var8, lp2Var, i3111111, i3111113 | (57344 & i3111114) | (i3111114 & 458752) | (3670016 & i3111112), 11252);
                            kx4Var3 = kx4Var4;
                            i24 = i30;
                            i25 = i31;
                            i26 = i3111110;
                            gn2Var2 = gn2Var;
                            z3 = z5;
                            o88Var3 = o88Var4;
                            i27 = i49;
                        } else {
                            lp2Var.Q();
                            z3 = z;
                            gn2Var2 = gn2Var;
                            kx4Var3 = kx4Var2;
                            o88Var3 = o88Var2;
                            i24 = i12;
                            i25 = i15;
                            i26 = i18;
                            i27 = i10;
                        }
                        j86VarR = lp2Var.r();
                        if (j86VarR != null) {
                            j86VarR.d = new rn2() { // from class: zy2
                                @Override // defpackage.rn2
                                public final Object K(Object obj2, Object obj3) {
                                    ((Integer) obj3).getClass();
                                    zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                                    return dn8.a;
                                }
                            };
                        }
                    }
                    i7 |= 100663296;
                    if ((i7 & 38347923) != 38347922) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (lp2Var.N(i7 & 1, z2)) {
                        lp2Var.S();
                        if ((i5 & 1) != 0) {
                            if (i33 != 0) {
                                kx4Var2 = hx4.X;
                            }
                            if (i8 != 0) {
                                o88Var2 = null;
                            }
                            if ((i6 & 8) != 0) {
                                i7 &= -7169;
                                i10 = 5;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i17 != 0) {
                                i18 = 1;
                            }
                            if (i20 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i22 != 0) {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                                gn2Var = null;
                            } else {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                            }
                        } else {
                            if (i33 != 0) {
                                kx4Var2 = hx4.X;
                            }
                            if (i8 != 0) {
                                o88Var2 = null;
                            }
                            if ((i6 & 8) != 0) {
                                i7 &= -7169;
                                i10 = 5;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i17 != 0) {
                                i18 = 1;
                            }
                            if (i20 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i22 != 0) {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                                gn2Var = null;
                            } else {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                            }
                        }
                        int i3111115 = i18;
                        o88Var4 = o88Var2;
                        lp2Var.q();
                        objK = lp2Var.K();
                        obj = zz0.a;
                        if (objK == obj) {
                            kw4 kw4Var11 = kw4.a;
                            int iE11 = kw4.l().e(-1, "pref_font_size");
                            aj2.X.getClass();
                            objK = k32.g(iE11);
                            lp2Var.g0(objK);
                        }
                        aj2Var = (aj2) objK;
                        o88Var5 = (o88) lp2Var.j(u78.a);
                        j = ((dw0) lp2Var.j(j41.a)).a;
                        zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                        objK2 = lp2Var.K();
                        if (zF) {
                            jB = o88Var5.b();
                            if (jB != 16) {
                                j2 = jB;
                            } else {
                                j2 = j;
                            }
                            objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                            lp2Var.g0(objK2);
                        } else {
                            jB = o88Var5.b();
                            if (jB != 16) {
                                j2 = jB;
                            } else {
                                j2 = j;
                            }
                            objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                            lp2Var.g0(objK2);
                        }
                        o88Var6 = (o88) objK2;
                        if ((i28 & 896) == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        zF2 = z6 | lp2Var.f(o88Var6);
                        objK3 = lp2Var.K();
                        if (zF2) {
                            objK3 = o88Var6.d(o88Var4);
                            lp2Var.g0(objK3);
                        } else {
                            objK3 = o88Var6.d(o88Var4);
                            lp2Var.g0(objK3);
                        }
                        o88Var7 = (o88) objK3;
                        zF3 = lp2Var.f(o88Var7);
                        objK4 = lp2Var.K();
                        if (zF3) {
                            float fC110 = v88.c(o88Var7.a.b);
                            iOrdinal = aj2Var.ordinal();
                            if (iOrdinal == 0) {
                                i32 = -2;
                            } else if (iOrdinal != 1) {
                                i32 = 2;
                                if (iOrdinal != 2) {
                                    b61.c();
                                    return;
                                }
                            } else {
                                i32 = 0;
                            }
                            objK4 = o88.a(o88Var7, 0L, eu7.i(fC110 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                            lp2Var.g0(objK4);
                        } else {
                            float fC111 = v88.c(o88Var7.a.b);
                            iOrdinal = aj2Var.ordinal();
                            if (iOrdinal == 0) {
                                i32 = -2;
                            } else if (iOrdinal != 1) {
                                i32 = 2;
                                if (iOrdinal != 2) {
                                    b61.c();
                                    return;
                                }
                            } else {
                                i32 = 0;
                            }
                            objK4 = o88.a(o88Var7, 0L, eu7.i(fC111 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                            lp2Var.g0(objK4);
                        }
                        o88Var8 = (o88) objK4;
                        if (z5) {
                            mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                        } else {
                            mxVar = null;
                        }
                        o28 o28Var11 = new o28(i29);
                        int i3111116 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                        int i3111117 = i28 >> 6;
                        int i3111118 = ((i28 >> 9) & 14) | (i3111117 & 896);
                        int i3111119 = i28 >> 3;
                        int i410 = i29;
                        u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var11, 0L, i30, false, i31, i3111115, gn2Var, o88Var8, lp2Var, i3111116, i3111118 | (57344 & i3111119) | (i3111119 & 458752) | (3670016 & i3111117), 11252);
                        kx4Var3 = kx4Var4;
                        i24 = i30;
                        i25 = i31;
                        i26 = i3111115;
                        gn2Var2 = gn2Var;
                        z3 = z5;
                        o88Var3 = o88Var4;
                        i27 = i410;
                    } else {
                        lp2Var.Q();
                        z3 = z;
                        gn2Var2 = gn2Var;
                        kx4Var3 = kx4Var2;
                        o88Var3 = o88Var2;
                        i24 = i12;
                        i25 = i15;
                        i26 = i18;
                        i27 = i10;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: zy2
                            @Override // defpackage.rn2
                            public final Object K(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                                return dn8.a;
                            }
                        };
                    }
                }
                i7 |= 196608;
                i15 = i3;
                i17 = i6 & 64;
                if (i17 != 0) {
                    i7 |= 1572864;
                    i18 = i4;
                } else {
                    i18 = i4;
                    if ((i5 & 1572864) == 0) {
                        if (lp2Var.d(i18)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i7 |= i19;
                    }
                }
                i20 = i6 & 128;
                if (i20 != 0) {
                    i7 |= 12582912;
                } else if ((i5 & 12582912) == 0) {
                    if (lp2Var.g(z)) {
                        i21 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                    } else {
                        i21 = 4194304;
                    }
                    i7 |= i21;
                }
                i22 = i6 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i22 != 0) {
                    if ((i5 & 100663296) == 0) {
                        if (lp2Var.h(gn2Var)) {
                            i23 = 67108864;
                        } else {
                            i23 = 33554432;
                        }
                        i7 |= i23;
                    }
                    if ((i7 & 38347923) != 38347922) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (lp2Var.N(i7 & 1, z2)) {
                        lp2Var.S();
                        if ((i5 & 1) != 0) {
                            if (i33 != 0) {
                                kx4Var2 = hx4.X;
                            }
                            if (i8 != 0) {
                                o88Var2 = null;
                            }
                            if ((i6 & 8) != 0) {
                                i7 &= -7169;
                                i10 = 5;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i17 != 0) {
                                i18 = 1;
                            }
                            if (i20 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i22 != 0) {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                                gn2Var = null;
                            } else {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                            }
                        } else {
                            if (i33 != 0) {
                                kx4Var2 = hx4.X;
                            }
                            if (i8 != 0) {
                                o88Var2 = null;
                            }
                            if ((i6 & 8) != 0) {
                                i7 &= -7169;
                                i10 = 5;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i17 != 0) {
                                i18 = 1;
                            }
                            if (i20 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i22 != 0) {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                                gn2Var = null;
                            } else {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                            }
                        }
                        int i31111110 = i18;
                        o88Var4 = o88Var2;
                        lp2Var.q();
                        objK = lp2Var.K();
                        obj = zz0.a;
                        if (objK == obj) {
                            kw4 kw4Var12 = kw4.a;
                            int iE12 = kw4.l().e(-1, "pref_font_size");
                            aj2.X.getClass();
                            objK = k32.g(iE12);
                            lp2Var.g0(objK);
                        }
                        aj2Var = (aj2) objK;
                        o88Var5 = (o88) lp2Var.j(u78.a);
                        j = ((dw0) lp2Var.j(j41.a)).a;
                        zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                        objK2 = lp2Var.K();
                        if (zF) {
                            jB = o88Var5.b();
                            if (jB != 16) {
                                j2 = jB;
                            } else {
                                j2 = j;
                            }
                            objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                            lp2Var.g0(objK2);
                        } else {
                            jB = o88Var5.b();
                            if (jB != 16) {
                                j2 = jB;
                            } else {
                                j2 = j;
                            }
                            objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                            lp2Var.g0(objK2);
                        }
                        o88Var6 = (o88) objK2;
                        if ((i28 & 896) == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        zF2 = z6 | lp2Var.f(o88Var6);
                        objK3 = lp2Var.K();
                        if (zF2) {
                            objK3 = o88Var6.d(o88Var4);
                            lp2Var.g0(objK3);
                        } else {
                            objK3 = o88Var6.d(o88Var4);
                            lp2Var.g0(objK3);
                        }
                        o88Var7 = (o88) objK3;
                        zF3 = lp2Var.f(o88Var7);
                        objK4 = lp2Var.K();
                        if (zF3) {
                            float fC112 = v88.c(o88Var7.a.b);
                            iOrdinal = aj2Var.ordinal();
                            if (iOrdinal == 0) {
                                i32 = -2;
                            } else if (iOrdinal != 1) {
                                i32 = 2;
                                if (iOrdinal != 2) {
                                    b61.c();
                                    return;
                                }
                            } else {
                                i32 = 0;
                            }
                            objK4 = o88.a(o88Var7, 0L, eu7.i(fC112 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                            lp2Var.g0(objK4);
                        } else {
                            float fC113 = v88.c(o88Var7.a.b);
                            iOrdinal = aj2Var.ordinal();
                            if (iOrdinal == 0) {
                                i32 = -2;
                            } else if (iOrdinal != 1) {
                                i32 = 2;
                                if (iOrdinal != 2) {
                                    b61.c();
                                    return;
                                }
                            } else {
                                i32 = 0;
                            }
                            objK4 = o88.a(o88Var7, 0L, eu7.i(fC113 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                            lp2Var.g0(objK4);
                        }
                        o88Var8 = (o88) objK4;
                        if (z5) {
                            mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                        } else {
                            mxVar = null;
                        }
                        o28 o28Var12 = new o28(i29);
                        int i31111111 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                        int i31111112 = i28 >> 6;
                        int i31111113 = ((i28 >> 9) & 14) | (i31111112 & 896);
                        int i31111114 = i28 >> 3;
                        int i411 = i29;
                        u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var12, 0L, i30, false, i31, i31111110, gn2Var, o88Var8, lp2Var, i31111111, i31111113 | (57344 & i31111114) | (i31111114 & 458752) | (3670016 & i31111112), 11252);
                        kx4Var3 = kx4Var4;
                        i24 = i30;
                        i25 = i31;
                        i26 = i31111110;
                        gn2Var2 = gn2Var;
                        z3 = z5;
                        o88Var3 = o88Var4;
                        i27 = i411;
                    } else {
                        lp2Var.Q();
                        z3 = z;
                        gn2Var2 = gn2Var;
                        kx4Var3 = kx4Var2;
                        o88Var3 = o88Var2;
                        i24 = i12;
                        i25 = i15;
                        i26 = i18;
                        i27 = i10;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: zy2
                            @Override // defpackage.rn2
                            public final Object K(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                                return dn8.a;
                            }
                        };
                    }
                }
                i7 |= 100663296;
                if ((i7 & 38347923) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (lp2Var.N(i7 & 1, z2)) {
                    lp2Var.S();
                    if ((i5 & 1) != 0) {
                        if (i33 != 0) {
                            kx4Var2 = hx4.X;
                        }
                        if (i8 != 0) {
                            o88Var2 = null;
                        }
                        if ((i6 & 8) != 0) {
                            i7 &= -7169;
                            i10 = 5;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i17 != 0) {
                            i18 = 1;
                        }
                        if (i20 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i22 != 0) {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                            gn2Var = null;
                        } else {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                        }
                    } else {
                        if (i33 != 0) {
                            kx4Var2 = hx4.X;
                        }
                        if (i8 != 0) {
                            o88Var2 = null;
                        }
                        if ((i6 & 8) != 0) {
                            i7 &= -7169;
                            i10 = 5;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i17 != 0) {
                            i18 = 1;
                        }
                        if (i20 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i22 != 0) {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                            gn2Var = null;
                        } else {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                        }
                    }
                    int i31111115 = i18;
                    o88Var4 = o88Var2;
                    lp2Var.q();
                    objK = lp2Var.K();
                    obj = zz0.a;
                    if (objK == obj) {
                        kw4 kw4Var13 = kw4.a;
                        int iE13 = kw4.l().e(-1, "pref_font_size");
                        aj2.X.getClass();
                        objK = k32.g(iE13);
                        lp2Var.g0(objK);
                    }
                    aj2Var = (aj2) objK;
                    o88Var5 = (o88) lp2Var.j(u78.a);
                    j = ((dw0) lp2Var.j(j41.a)).a;
                    zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                    objK2 = lp2Var.K();
                    if (zF) {
                        jB = o88Var5.b();
                        if (jB != 16) {
                            j2 = jB;
                        } else {
                            j2 = j;
                        }
                        objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                        lp2Var.g0(objK2);
                    } else {
                        jB = o88Var5.b();
                        if (jB != 16) {
                            j2 = jB;
                        } else {
                            j2 = j;
                        }
                        objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                        lp2Var.g0(objK2);
                    }
                    o88Var6 = (o88) objK2;
                    if ((i28 & 896) == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    zF2 = z6 | lp2Var.f(o88Var6);
                    objK3 = lp2Var.K();
                    if (zF2) {
                        objK3 = o88Var6.d(o88Var4);
                        lp2Var.g0(objK3);
                    } else {
                        objK3 = o88Var6.d(o88Var4);
                        lp2Var.g0(objK3);
                    }
                    o88Var7 = (o88) objK3;
                    zF3 = lp2Var.f(o88Var7);
                    objK4 = lp2Var.K();
                    if (zF3) {
                        float fC114 = v88.c(o88Var7.a.b);
                        iOrdinal = aj2Var.ordinal();
                        if (iOrdinal == 0) {
                            i32 = -2;
                        } else if (iOrdinal != 1) {
                            i32 = 2;
                            if (iOrdinal != 2) {
                                b61.c();
                                return;
                            }
                        } else {
                            i32 = 0;
                        }
                        objK4 = o88.a(o88Var7, 0L, eu7.i(fC114 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                        lp2Var.g0(objK4);
                    } else {
                        float fC115 = v88.c(o88Var7.a.b);
                        iOrdinal = aj2Var.ordinal();
                        if (iOrdinal == 0) {
                            i32 = -2;
                        } else if (iOrdinal != 1) {
                            i32 = 2;
                            if (iOrdinal != 2) {
                                b61.c();
                                return;
                            }
                        } else {
                            i32 = 0;
                        }
                        objK4 = o88.a(o88Var7, 0L, eu7.i(fC115 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                        lp2Var.g0(objK4);
                    }
                    o88Var8 = (o88) objK4;
                    if (z5) {
                        mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                    } else {
                        mxVar = null;
                    }
                    o28 o28Var13 = new o28(i29);
                    int i31111116 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                    int i31111117 = i28 >> 6;
                    int i31111118 = ((i28 >> 9) & 14) | (i31111117 & 896);
                    int i31111119 = i28 >> 3;
                    int i412 = i29;
                    u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var13, 0L, i30, false, i31, i31111115, gn2Var, o88Var8, lp2Var, i31111116, i31111118 | (57344 & i31111119) | (i31111119 & 458752) | (3670016 & i31111117), 11252);
                    kx4Var3 = kx4Var4;
                    i24 = i30;
                    i25 = i31;
                    i26 = i31111115;
                    gn2Var2 = gn2Var;
                    z3 = z5;
                    o88Var3 = o88Var4;
                    i27 = i412;
                } else {
                    lp2Var.Q();
                    z3 = z;
                    gn2Var2 = gn2Var;
                    kx4Var3 = kx4Var2;
                    o88Var3 = o88Var2;
                    i24 = i12;
                    i25 = i15;
                    i26 = i18;
                    i27 = i10;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: zy2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                            return dn8.a;
                        }
                    };
                }
            }
            i7 |= 24576;
            i12 = i2;
            i14 = i6 & 32;
            if (i14 != 0) {
                if ((196608 & i5) == 0) {
                    i15 = i3;
                    if (lp2Var.d(i15)) {
                        i16 = 131072;
                    } else {
                        i16 = DnsOverHttps.MAX_RESPONSE_SIZE;
                    }
                    i7 |= i16;
                }
                i17 = i6 & 64;
                if (i17 != 0) {
                    i7 |= 1572864;
                    i18 = i4;
                } else {
                    i18 = i4;
                    if ((i5 & 1572864) == 0) {
                        if (lp2Var.d(i18)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i7 |= i19;
                    }
                }
                i20 = i6 & 128;
                if (i20 != 0) {
                    i7 |= 12582912;
                } else if ((i5 & 12582912) == 0) {
                    if (lp2Var.g(z)) {
                        i21 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                    } else {
                        i21 = 4194304;
                    }
                    i7 |= i21;
                }
                i22 = i6 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i22 != 0) {
                    if ((i5 & 100663296) == 0) {
                        if (lp2Var.h(gn2Var)) {
                            i23 = 67108864;
                        } else {
                            i23 = 33554432;
                        }
                        i7 |= i23;
                    }
                    if ((i7 & 38347923) != 38347922) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (lp2Var.N(i7 & 1, z2)) {
                        lp2Var.S();
                        if ((i5 & 1) != 0) {
                            if (i33 != 0) {
                                kx4Var2 = hx4.X;
                            }
                            if (i8 != 0) {
                                o88Var2 = null;
                            }
                            if ((i6 & 8) != 0) {
                                i7 &= -7169;
                                i10 = 5;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i17 != 0) {
                                i18 = 1;
                            }
                            if (i20 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i22 != 0) {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                                gn2Var = null;
                            } else {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                            }
                        } else {
                            if (i33 != 0) {
                                kx4Var2 = hx4.X;
                            }
                            if (i8 != 0) {
                                o88Var2 = null;
                            }
                            if ((i6 & 8) != 0) {
                                i7 &= -7169;
                                i10 = 5;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i17 != 0) {
                                i18 = 1;
                            }
                            if (i20 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i22 != 0) {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                                gn2Var = null;
                            } else {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                            }
                        }
                        int i311111110 = i18;
                        o88Var4 = o88Var2;
                        lp2Var.q();
                        objK = lp2Var.K();
                        obj = zz0.a;
                        if (objK == obj) {
                            kw4 kw4Var14 = kw4.a;
                            int iE14 = kw4.l().e(-1, "pref_font_size");
                            aj2.X.getClass();
                            objK = k32.g(iE14);
                            lp2Var.g0(objK);
                        }
                        aj2Var = (aj2) objK;
                        o88Var5 = (o88) lp2Var.j(u78.a);
                        j = ((dw0) lp2Var.j(j41.a)).a;
                        zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                        objK2 = lp2Var.K();
                        if (zF) {
                            jB = o88Var5.b();
                            if (jB != 16) {
                                j2 = jB;
                            } else {
                                j2 = j;
                            }
                            objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                            lp2Var.g0(objK2);
                        } else {
                            jB = o88Var5.b();
                            if (jB != 16) {
                                j2 = jB;
                            } else {
                                j2 = j;
                            }
                            objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                            lp2Var.g0(objK2);
                        }
                        o88Var6 = (o88) objK2;
                        if ((i28 & 896) == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        zF2 = z6 | lp2Var.f(o88Var6);
                        objK3 = lp2Var.K();
                        if (zF2) {
                            objK3 = o88Var6.d(o88Var4);
                            lp2Var.g0(objK3);
                        } else {
                            objK3 = o88Var6.d(o88Var4);
                            lp2Var.g0(objK3);
                        }
                        o88Var7 = (o88) objK3;
                        zF3 = lp2Var.f(o88Var7);
                        objK4 = lp2Var.K();
                        if (zF3) {
                            float fC116 = v88.c(o88Var7.a.b);
                            iOrdinal = aj2Var.ordinal();
                            if (iOrdinal == 0) {
                                i32 = -2;
                            } else if (iOrdinal != 1) {
                                i32 = 2;
                                if (iOrdinal != 2) {
                                    b61.c();
                                    return;
                                }
                            } else {
                                i32 = 0;
                            }
                            objK4 = o88.a(o88Var7, 0L, eu7.i(fC116 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                            lp2Var.g0(objK4);
                        } else {
                            float fC117 = v88.c(o88Var7.a.b);
                            iOrdinal = aj2Var.ordinal();
                            if (iOrdinal == 0) {
                                i32 = -2;
                            } else if (iOrdinal != 1) {
                                i32 = 2;
                                if (iOrdinal != 2) {
                                    b61.c();
                                    return;
                                }
                            } else {
                                i32 = 0;
                            }
                            objK4 = o88.a(o88Var7, 0L, eu7.i(fC117 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                            lp2Var.g0(objK4);
                        }
                        o88Var8 = (o88) objK4;
                        if (z5) {
                            mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                        } else {
                            mxVar = null;
                        }
                        o28 o28Var14 = new o28(i29);
                        int i311111111 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                        int i311111112 = i28 >> 6;
                        int i311111113 = ((i28 >> 9) & 14) | (i311111112 & 896);
                        int i311111114 = i28 >> 3;
                        int i413 = i29;
                        u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var14, 0L, i30, false, i31, i311111110, gn2Var, o88Var8, lp2Var, i311111111, i311111113 | (57344 & i311111114) | (i311111114 & 458752) | (3670016 & i311111112), 11252);
                        kx4Var3 = kx4Var4;
                        i24 = i30;
                        i25 = i31;
                        i26 = i311111110;
                        gn2Var2 = gn2Var;
                        z3 = z5;
                        o88Var3 = o88Var4;
                        i27 = i413;
                    } else {
                        lp2Var.Q();
                        z3 = z;
                        gn2Var2 = gn2Var;
                        kx4Var3 = kx4Var2;
                        o88Var3 = o88Var2;
                        i24 = i12;
                        i25 = i15;
                        i26 = i18;
                        i27 = i10;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: zy2
                            @Override // defpackage.rn2
                            public final Object K(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                                return dn8.a;
                            }
                        };
                    }
                }
                i7 |= 100663296;
                if ((i7 & 38347923) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (lp2Var.N(i7 & 1, z2)) {
                    lp2Var.S();
                    if ((i5 & 1) != 0) {
                        if (i33 != 0) {
                            kx4Var2 = hx4.X;
                        }
                        if (i8 != 0) {
                            o88Var2 = null;
                        }
                        if ((i6 & 8) != 0) {
                            i7 &= -7169;
                            i10 = 5;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i17 != 0) {
                            i18 = 1;
                        }
                        if (i20 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i22 != 0) {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                            gn2Var = null;
                        } else {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                        }
                    } else {
                        if (i33 != 0) {
                            kx4Var2 = hx4.X;
                        }
                        if (i8 != 0) {
                            o88Var2 = null;
                        }
                        if ((i6 & 8) != 0) {
                            i7 &= -7169;
                            i10 = 5;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i17 != 0) {
                            i18 = 1;
                        }
                        if (i20 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i22 != 0) {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                            gn2Var = null;
                        } else {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                        }
                    }
                    int i311111115 = i18;
                    o88Var4 = o88Var2;
                    lp2Var.q();
                    objK = lp2Var.K();
                    obj = zz0.a;
                    if (objK == obj) {
                        kw4 kw4Var15 = kw4.a;
                        int iE15 = kw4.l().e(-1, "pref_font_size");
                        aj2.X.getClass();
                        objK = k32.g(iE15);
                        lp2Var.g0(objK);
                    }
                    aj2Var = (aj2) objK;
                    o88Var5 = (o88) lp2Var.j(u78.a);
                    j = ((dw0) lp2Var.j(j41.a)).a;
                    zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                    objK2 = lp2Var.K();
                    if (zF) {
                        jB = o88Var5.b();
                        if (jB != 16) {
                            j2 = jB;
                        } else {
                            j2 = j;
                        }
                        objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                        lp2Var.g0(objK2);
                    } else {
                        jB = o88Var5.b();
                        if (jB != 16) {
                            j2 = jB;
                        } else {
                            j2 = j;
                        }
                        objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                        lp2Var.g0(objK2);
                    }
                    o88Var6 = (o88) objK2;
                    if ((i28 & 896) == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    zF2 = z6 | lp2Var.f(o88Var6);
                    objK3 = lp2Var.K();
                    if (zF2) {
                        objK3 = o88Var6.d(o88Var4);
                        lp2Var.g0(objK3);
                    } else {
                        objK3 = o88Var6.d(o88Var4);
                        lp2Var.g0(objK3);
                    }
                    o88Var7 = (o88) objK3;
                    zF3 = lp2Var.f(o88Var7);
                    objK4 = lp2Var.K();
                    if (zF3) {
                        float fC118 = v88.c(o88Var7.a.b);
                        iOrdinal = aj2Var.ordinal();
                        if (iOrdinal == 0) {
                            i32 = -2;
                        } else if (iOrdinal != 1) {
                            i32 = 2;
                            if (iOrdinal != 2) {
                                b61.c();
                                return;
                            }
                        } else {
                            i32 = 0;
                        }
                        objK4 = o88.a(o88Var7, 0L, eu7.i(fC118 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                        lp2Var.g0(objK4);
                    } else {
                        float fC119 = v88.c(o88Var7.a.b);
                        iOrdinal = aj2Var.ordinal();
                        if (iOrdinal == 0) {
                            i32 = -2;
                        } else if (iOrdinal != 1) {
                            i32 = 2;
                            if (iOrdinal != 2) {
                                b61.c();
                                return;
                            }
                        } else {
                            i32 = 0;
                        }
                        objK4 = o88.a(o88Var7, 0L, eu7.i(fC119 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                        lp2Var.g0(objK4);
                    }
                    o88Var8 = (o88) objK4;
                    if (z5) {
                        mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                    } else {
                        mxVar = null;
                    }
                    o28 o28Var15 = new o28(i29);
                    int i311111116 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                    int i311111117 = i28 >> 6;
                    int i311111118 = ((i28 >> 9) & 14) | (i311111117 & 896);
                    int i311111119 = i28 >> 3;
                    int i414 = i29;
                    u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var15, 0L, i30, false, i31, i311111115, gn2Var, o88Var8, lp2Var, i311111116, i311111118 | (57344 & i311111119) | (i311111119 & 458752) | (3670016 & i311111117), 11252);
                    kx4Var3 = kx4Var4;
                    i24 = i30;
                    i25 = i31;
                    i26 = i311111115;
                    gn2Var2 = gn2Var;
                    z3 = z5;
                    o88Var3 = o88Var4;
                    i27 = i414;
                } else {
                    lp2Var.Q();
                    z3 = z;
                    gn2Var2 = gn2Var;
                    kx4Var3 = kx4Var2;
                    o88Var3 = o88Var2;
                    i24 = i12;
                    i25 = i15;
                    i26 = i18;
                    i27 = i10;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: zy2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                            return dn8.a;
                        }
                    };
                }
            }
            i7 |= 196608;
            i15 = i3;
            i17 = i6 & 64;
            if (i17 != 0) {
                i7 |= 1572864;
                i18 = i4;
            } else {
                i18 = i4;
                if ((i5 & 1572864) == 0) {
                    if (lp2Var.d(i18)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i7 |= i19;
                }
            }
            i20 = i6 & 128;
            if (i20 != 0) {
                i7 |= 12582912;
            } else if ((i5 & 12582912) == 0) {
                if (lp2Var.g(z)) {
                    i21 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                } else {
                    i21 = 4194304;
                }
                i7 |= i21;
            }
            i22 = i6 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i22 != 0) {
                if ((i5 & 100663296) == 0) {
                    if (lp2Var.h(gn2Var)) {
                        i23 = 67108864;
                    } else {
                        i23 = 33554432;
                    }
                    i7 |= i23;
                }
                if ((i7 & 38347923) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (lp2Var.N(i7 & 1, z2)) {
                    lp2Var.S();
                    if ((i5 & 1) != 0) {
                        if (i33 != 0) {
                            kx4Var2 = hx4.X;
                        }
                        if (i8 != 0) {
                            o88Var2 = null;
                        }
                        if ((i6 & 8) != 0) {
                            i7 &= -7169;
                            i10 = 5;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i17 != 0) {
                            i18 = 1;
                        }
                        if (i20 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i22 != 0) {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                            gn2Var = null;
                        } else {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                        }
                    } else {
                        if (i33 != 0) {
                            kx4Var2 = hx4.X;
                        }
                        if (i8 != 0) {
                            o88Var2 = null;
                        }
                        if ((i6 & 8) != 0) {
                            i7 &= -7169;
                            i10 = 5;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i17 != 0) {
                            i18 = 1;
                        }
                        if (i20 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i22 != 0) {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                            gn2Var = null;
                        } else {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                        }
                    }
                    int i3111111110 = i18;
                    o88Var4 = o88Var2;
                    lp2Var.q();
                    objK = lp2Var.K();
                    obj = zz0.a;
                    if (objK == obj) {
                        kw4 kw4Var16 = kw4.a;
                        int iE16 = kw4.l().e(-1, "pref_font_size");
                        aj2.X.getClass();
                        objK = k32.g(iE16);
                        lp2Var.g0(objK);
                    }
                    aj2Var = (aj2) objK;
                    o88Var5 = (o88) lp2Var.j(u78.a);
                    j = ((dw0) lp2Var.j(j41.a)).a;
                    zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                    objK2 = lp2Var.K();
                    if (zF) {
                        jB = o88Var5.b();
                        if (jB != 16) {
                            j2 = jB;
                        } else {
                            j2 = j;
                        }
                        objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                        lp2Var.g0(objK2);
                    } else {
                        jB = o88Var5.b();
                        if (jB != 16) {
                            j2 = jB;
                        } else {
                            j2 = j;
                        }
                        objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                        lp2Var.g0(objK2);
                    }
                    o88Var6 = (o88) objK2;
                    if ((i28 & 896) == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    zF2 = z6 | lp2Var.f(o88Var6);
                    objK3 = lp2Var.K();
                    if (zF2) {
                        objK3 = o88Var6.d(o88Var4);
                        lp2Var.g0(objK3);
                    } else {
                        objK3 = o88Var6.d(o88Var4);
                        lp2Var.g0(objK3);
                    }
                    o88Var7 = (o88) objK3;
                    zF3 = lp2Var.f(o88Var7);
                    objK4 = lp2Var.K();
                    if (zF3) {
                        float fC1110 = v88.c(o88Var7.a.b);
                        iOrdinal = aj2Var.ordinal();
                        if (iOrdinal == 0) {
                            i32 = -2;
                        } else if (iOrdinal != 1) {
                            i32 = 2;
                            if (iOrdinal != 2) {
                                b61.c();
                                return;
                            }
                        } else {
                            i32 = 0;
                        }
                        objK4 = o88.a(o88Var7, 0L, eu7.i(fC1110 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                        lp2Var.g0(objK4);
                    } else {
                        float fC1111 = v88.c(o88Var7.a.b);
                        iOrdinal = aj2Var.ordinal();
                        if (iOrdinal == 0) {
                            i32 = -2;
                        } else if (iOrdinal != 1) {
                            i32 = 2;
                            if (iOrdinal != 2) {
                                b61.c();
                                return;
                            }
                        } else {
                            i32 = 0;
                        }
                        objK4 = o88.a(o88Var7, 0L, eu7.i(fC1111 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                        lp2Var.g0(objK4);
                    }
                    o88Var8 = (o88) objK4;
                    if (z5) {
                        mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                    } else {
                        mxVar = null;
                    }
                    o28 o28Var16 = new o28(i29);
                    int i3111111111 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                    int i3111111112 = i28 >> 6;
                    int i3111111113 = ((i28 >> 9) & 14) | (i3111111112 & 896);
                    int i3111111114 = i28 >> 3;
                    int i415 = i29;
                    u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var16, 0L, i30, false, i31, i3111111110, gn2Var, o88Var8, lp2Var, i3111111111, i3111111113 | (57344 & i3111111114) | (i3111111114 & 458752) | (3670016 & i3111111112), 11252);
                    kx4Var3 = kx4Var4;
                    i24 = i30;
                    i25 = i31;
                    i26 = i3111111110;
                    gn2Var2 = gn2Var;
                    z3 = z5;
                    o88Var3 = o88Var4;
                    i27 = i415;
                } else {
                    lp2Var.Q();
                    z3 = z;
                    gn2Var2 = gn2Var;
                    kx4Var3 = kx4Var2;
                    o88Var3 = o88Var2;
                    i24 = i12;
                    i25 = i15;
                    i26 = i18;
                    i27 = i10;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: zy2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                            return dn8.a;
                        }
                    };
                }
            }
            i7 |= 100663296;
            if ((i7 & 38347923) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (lp2Var.N(i7 & 1, z2)) {
                lp2Var.S();
                if ((i5 & 1) != 0) {
                    if (i33 != 0) {
                        kx4Var2 = hx4.X;
                    }
                    if (i8 != 0) {
                        o88Var2 = null;
                    }
                    if ((i6 & 8) != 0) {
                        i7 &= -7169;
                        i10 = 5;
                    }
                    if (i11 != 0) {
                        i12 = 2;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i17 != 0) {
                        i18 = 1;
                    }
                    if (i20 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i22 != 0) {
                        z5 = z4;
                        i28 = i7;
                        kx4Var4 = kx4Var2;
                        i29 = i10;
                        i30 = i12;
                        i31 = i15;
                        gn2Var = null;
                    } else {
                        z5 = z4;
                        i28 = i7;
                        kx4Var4 = kx4Var2;
                        i29 = i10;
                        i30 = i12;
                        i31 = i15;
                    }
                } else {
                    if (i33 != 0) {
                        kx4Var2 = hx4.X;
                    }
                    if (i8 != 0) {
                        o88Var2 = null;
                    }
                    if ((i6 & 8) != 0) {
                        i7 &= -7169;
                        i10 = 5;
                    }
                    if (i11 != 0) {
                        i12 = 2;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i17 != 0) {
                        i18 = 1;
                    }
                    if (i20 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i22 != 0) {
                        z5 = z4;
                        i28 = i7;
                        kx4Var4 = kx4Var2;
                        i29 = i10;
                        i30 = i12;
                        i31 = i15;
                        gn2Var = null;
                    } else {
                        z5 = z4;
                        i28 = i7;
                        kx4Var4 = kx4Var2;
                        i29 = i10;
                        i30 = i12;
                        i31 = i15;
                    }
                }
                int i3111111115 = i18;
                o88Var4 = o88Var2;
                lp2Var.q();
                objK = lp2Var.K();
                obj = zz0.a;
                if (objK == obj) {
                    kw4 kw4Var17 = kw4.a;
                    int iE17 = kw4.l().e(-1, "pref_font_size");
                    aj2.X.getClass();
                    objK = k32.g(iE17);
                    lp2Var.g0(objK);
                }
                aj2Var = (aj2) objK;
                o88Var5 = (o88) lp2Var.j(u78.a);
                j = ((dw0) lp2Var.j(j41.a)).a;
                zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                objK2 = lp2Var.K();
                if (zF) {
                    jB = o88Var5.b();
                    if (jB != 16) {
                        j2 = jB;
                    } else {
                        j2 = j;
                    }
                    objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                    lp2Var.g0(objK2);
                } else {
                    jB = o88Var5.b();
                    if (jB != 16) {
                        j2 = jB;
                    } else {
                        j2 = j;
                    }
                    objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                    lp2Var.g0(objK2);
                }
                o88Var6 = (o88) objK2;
                if ((i28 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zF2 = z6 | lp2Var.f(o88Var6);
                objK3 = lp2Var.K();
                if (zF2) {
                    objK3 = o88Var6.d(o88Var4);
                    lp2Var.g0(objK3);
                } else {
                    objK3 = o88Var6.d(o88Var4);
                    lp2Var.g0(objK3);
                }
                o88Var7 = (o88) objK3;
                zF3 = lp2Var.f(o88Var7);
                objK4 = lp2Var.K();
                if (zF3) {
                    float fC1112 = v88.c(o88Var7.a.b);
                    iOrdinal = aj2Var.ordinal();
                    if (iOrdinal == 0) {
                        i32 = -2;
                    } else if (iOrdinal != 1) {
                        i32 = 2;
                        if (iOrdinal != 2) {
                            b61.c();
                            return;
                        }
                    } else {
                        i32 = 0;
                    }
                    objK4 = o88.a(o88Var7, 0L, eu7.i(fC1112 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                    lp2Var.g0(objK4);
                } else {
                    float fC1113 = v88.c(o88Var7.a.b);
                    iOrdinal = aj2Var.ordinal();
                    if (iOrdinal == 0) {
                        i32 = -2;
                    } else if (iOrdinal != 1) {
                        i32 = 2;
                        if (iOrdinal != 2) {
                            b61.c();
                            return;
                        }
                    } else {
                        i32 = 0;
                    }
                    objK4 = o88.a(o88Var7, 0L, eu7.i(fC1113 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                    lp2Var.g0(objK4);
                }
                o88Var8 = (o88) objK4;
                if (z5) {
                    mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                } else {
                    mxVar = null;
                }
                o28 o28Var17 = new o28(i29);
                int i3111111116 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                int i3111111117 = i28 >> 6;
                int i3111111118 = ((i28 >> 9) & 14) | (i3111111117 & 896);
                int i3111111119 = i28 >> 3;
                int i416 = i29;
                u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var17, 0L, i30, false, i31, i3111111115, gn2Var, o88Var8, lp2Var, i3111111116, i3111111118 | (57344 & i3111111119) | (i3111111119 & 458752) | (3670016 & i3111111117), 11252);
                kx4Var3 = kx4Var4;
                i24 = i30;
                i25 = i31;
                i26 = i3111111115;
                gn2Var2 = gn2Var;
                z3 = z5;
                o88Var3 = o88Var4;
                i27 = i416;
            } else {
                lp2Var.Q();
                z3 = z;
                gn2Var2 = gn2Var;
                kx4Var3 = kx4Var2;
                o88Var3 = o88Var2;
                i24 = i12;
                i25 = i15;
                i26 = i18;
                i27 = i10;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: zy2
                    @Override // defpackage.rn2
                    public final Object K(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                        return dn8.a;
                    }
                };
            }
        }
        i7 |= 48;
        kx4Var2 = kx4Var;
        i8 = i6 & 4;
        if (i8 != 0) {
            if ((i5 & 384) == 0) {
                o88Var2 = o88Var;
                if (lp2Var.f(o88Var2)) {
                    i9 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i9 = 128;
                }
                i7 |= i9;
            }
            if ((i5 & 3072) == 0) {
                if ((i6 & 8) == 0) {
                    i10 = i;
                    if (lp2Var.d(i10)) {
                    }
                    i7 |= i34;
                } else {
                    i10 = i;
                }
                i7 |= i34;
            } else {
                i10 = i;
            }
            i11 = i6 & 16;
            if (i11 != 0) {
                if ((i5 & 24576) == 0) {
                    i12 = i2;
                    if (lp2Var.d(i12)) {
                        i13 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i13 = 8192;
                    }
                    i7 |= i13;
                }
                i14 = i6 & 32;
                if (i14 != 0) {
                    if ((196608 & i5) == 0) {
                        i15 = i3;
                        if (lp2Var.d(i15)) {
                            i16 = 131072;
                        } else {
                            i16 = DnsOverHttps.MAX_RESPONSE_SIZE;
                        }
                        i7 |= i16;
                    }
                    i17 = i6 & 64;
                    if (i17 != 0) {
                        i7 |= 1572864;
                        i18 = i4;
                    } else {
                        i18 = i4;
                        if ((i5 & 1572864) == 0) {
                            if (lp2Var.d(i18)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i7 |= i19;
                        }
                    }
                    i20 = i6 & 128;
                    if (i20 != 0) {
                        i7 |= 12582912;
                    } else if ((i5 & 12582912) == 0) {
                        if (lp2Var.g(z)) {
                            i21 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                        } else {
                            i21 = 4194304;
                        }
                        i7 |= i21;
                    }
                    i22 = i6 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i22 != 0) {
                        if ((i5 & 100663296) == 0) {
                            if (lp2Var.h(gn2Var)) {
                                i23 = 67108864;
                            } else {
                                i23 = 33554432;
                            }
                            i7 |= i23;
                        }
                        if ((i7 & 38347923) != 38347922) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (lp2Var.N(i7 & 1, z2)) {
                            lp2Var.S();
                            if ((i5 & 1) != 0) {
                                if (i33 != 0) {
                                    kx4Var2 = hx4.X;
                                }
                                if (i8 != 0) {
                                    o88Var2 = null;
                                }
                                if ((i6 & 8) != 0) {
                                    i7 &= -7169;
                                    i10 = 5;
                                }
                                if (i11 != 0) {
                                    i12 = 2;
                                }
                                if (i14 != 0) {
                                    i15 = Integer.MAX_VALUE;
                                }
                                if (i17 != 0) {
                                    i18 = 1;
                                }
                                if (i20 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                if (i22 != 0) {
                                    z5 = z4;
                                    i28 = i7;
                                    kx4Var4 = kx4Var2;
                                    i29 = i10;
                                    i30 = i12;
                                    i31 = i15;
                                    gn2Var = null;
                                } else {
                                    z5 = z4;
                                    i28 = i7;
                                    kx4Var4 = kx4Var2;
                                    i29 = i10;
                                    i30 = i12;
                                    i31 = i15;
                                }
                            } else {
                                if (i33 != 0) {
                                    kx4Var2 = hx4.X;
                                }
                                if (i8 != 0) {
                                    o88Var2 = null;
                                }
                                if ((i6 & 8) != 0) {
                                    i7 &= -7169;
                                    i10 = 5;
                                }
                                if (i11 != 0) {
                                    i12 = 2;
                                }
                                if (i14 != 0) {
                                    i15 = Integer.MAX_VALUE;
                                }
                                if (i17 != 0) {
                                    i18 = 1;
                                }
                                if (i20 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                if (i22 != 0) {
                                    z5 = z4;
                                    i28 = i7;
                                    kx4Var4 = kx4Var2;
                                    i29 = i10;
                                    i30 = i12;
                                    i31 = i15;
                                    gn2Var = null;
                                } else {
                                    z5 = z4;
                                    i28 = i7;
                                    kx4Var4 = kx4Var2;
                                    i29 = i10;
                                    i30 = i12;
                                    i31 = i15;
                                }
                            }
                            int i31111111110 = i18;
                            o88Var4 = o88Var2;
                            lp2Var.q();
                            objK = lp2Var.K();
                            obj = zz0.a;
                            if (objK == obj) {
                                kw4 kw4Var18 = kw4.a;
                                int iE18 = kw4.l().e(-1, "pref_font_size");
                                aj2.X.getClass();
                                objK = k32.g(iE18);
                                lp2Var.g0(objK);
                            }
                            aj2Var = (aj2) objK;
                            o88Var5 = (o88) lp2Var.j(u78.a);
                            j = ((dw0) lp2Var.j(j41.a)).a;
                            zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                            objK2 = lp2Var.K();
                            if (zF) {
                                jB = o88Var5.b();
                                if (jB != 16) {
                                    j2 = jB;
                                } else {
                                    j2 = j;
                                }
                                objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                                lp2Var.g0(objK2);
                            } else {
                                jB = o88Var5.b();
                                if (jB != 16) {
                                    j2 = jB;
                                } else {
                                    j2 = j;
                                }
                                objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                                lp2Var.g0(objK2);
                            }
                            o88Var6 = (o88) objK2;
                            if ((i28 & 896) == 256) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            zF2 = z6 | lp2Var.f(o88Var6);
                            objK3 = lp2Var.K();
                            if (zF2) {
                                objK3 = o88Var6.d(o88Var4);
                                lp2Var.g0(objK3);
                            } else {
                                objK3 = o88Var6.d(o88Var4);
                                lp2Var.g0(objK3);
                            }
                            o88Var7 = (o88) objK3;
                            zF3 = lp2Var.f(o88Var7);
                            objK4 = lp2Var.K();
                            if (zF3) {
                                float fC1114 = v88.c(o88Var7.a.b);
                                iOrdinal = aj2Var.ordinal();
                                if (iOrdinal == 0) {
                                    i32 = -2;
                                } else if (iOrdinal != 1) {
                                    i32 = 2;
                                    if (iOrdinal != 2) {
                                        b61.c();
                                        return;
                                    }
                                } else {
                                    i32 = 0;
                                }
                                objK4 = o88.a(o88Var7, 0L, eu7.i(fC1114 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                                lp2Var.g0(objK4);
                            } else {
                                float fC1115 = v88.c(o88Var7.a.b);
                                iOrdinal = aj2Var.ordinal();
                                if (iOrdinal == 0) {
                                    i32 = -2;
                                } else if (iOrdinal != 1) {
                                    i32 = 2;
                                    if (iOrdinal != 2) {
                                        b61.c();
                                        return;
                                    }
                                } else {
                                    i32 = 0;
                                }
                                objK4 = o88.a(o88Var7, 0L, eu7.i(fC1115 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                                lp2Var.g0(objK4);
                            }
                            o88Var8 = (o88) objK4;
                            if (z5) {
                                mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                            } else {
                                mxVar = null;
                            }
                            o28 o28Var18 = new o28(i29);
                            int i31111111111 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                            int i31111111112 = i28 >> 6;
                            int i31111111113 = ((i28 >> 9) & 14) | (i31111111112 & 896);
                            int i31111111114 = i28 >> 3;
                            int i417 = i29;
                            u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var18, 0L, i30, false, i31, i31111111110, gn2Var, o88Var8, lp2Var, i31111111111, i31111111113 | (57344 & i31111111114) | (i31111111114 & 458752) | (3670016 & i31111111112), 11252);
                            kx4Var3 = kx4Var4;
                            i24 = i30;
                            i25 = i31;
                            i26 = i31111111110;
                            gn2Var2 = gn2Var;
                            z3 = z5;
                            o88Var3 = o88Var4;
                            i27 = i417;
                        } else {
                            lp2Var.Q();
                            z3 = z;
                            gn2Var2 = gn2Var;
                            kx4Var3 = kx4Var2;
                            o88Var3 = o88Var2;
                            i24 = i12;
                            i25 = i15;
                            i26 = i18;
                            i27 = i10;
                        }
                        j86VarR = lp2Var.r();
                        if (j86VarR != null) {
                            j86VarR.d = new rn2() { // from class: zy2
                                @Override // defpackage.rn2
                                public final Object K(Object obj2, Object obj3) {
                                    ((Integer) obj3).getClass();
                                    zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                                    return dn8.a;
                                }
                            };
                        }
                    }
                    i7 |= 100663296;
                    if ((i7 & 38347923) != 38347922) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (lp2Var.N(i7 & 1, z2)) {
                        lp2Var.S();
                        if ((i5 & 1) != 0) {
                            if (i33 != 0) {
                                kx4Var2 = hx4.X;
                            }
                            if (i8 != 0) {
                                o88Var2 = null;
                            }
                            if ((i6 & 8) != 0) {
                                i7 &= -7169;
                                i10 = 5;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i17 != 0) {
                                i18 = 1;
                            }
                            if (i20 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i22 != 0) {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                                gn2Var = null;
                            } else {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                            }
                        } else {
                            if (i33 != 0) {
                                kx4Var2 = hx4.X;
                            }
                            if (i8 != 0) {
                                o88Var2 = null;
                            }
                            if ((i6 & 8) != 0) {
                                i7 &= -7169;
                                i10 = 5;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i17 != 0) {
                                i18 = 1;
                            }
                            if (i20 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i22 != 0) {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                                gn2Var = null;
                            } else {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                            }
                        }
                        int i31111111115 = i18;
                        o88Var4 = o88Var2;
                        lp2Var.q();
                        objK = lp2Var.K();
                        obj = zz0.a;
                        if (objK == obj) {
                            kw4 kw4Var19 = kw4.a;
                            int iE19 = kw4.l().e(-1, "pref_font_size");
                            aj2.X.getClass();
                            objK = k32.g(iE19);
                            lp2Var.g0(objK);
                        }
                        aj2Var = (aj2) objK;
                        o88Var5 = (o88) lp2Var.j(u78.a);
                        j = ((dw0) lp2Var.j(j41.a)).a;
                        zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                        objK2 = lp2Var.K();
                        if (zF) {
                            jB = o88Var5.b();
                            if (jB != 16) {
                                j2 = jB;
                            } else {
                                j2 = j;
                            }
                            objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                            lp2Var.g0(objK2);
                        } else {
                            jB = o88Var5.b();
                            if (jB != 16) {
                                j2 = jB;
                            } else {
                                j2 = j;
                            }
                            objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                            lp2Var.g0(objK2);
                        }
                        o88Var6 = (o88) objK2;
                        if ((i28 & 896) == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        zF2 = z6 | lp2Var.f(o88Var6);
                        objK3 = lp2Var.K();
                        if (zF2) {
                            objK3 = o88Var6.d(o88Var4);
                            lp2Var.g0(objK3);
                        } else {
                            objK3 = o88Var6.d(o88Var4);
                            lp2Var.g0(objK3);
                        }
                        o88Var7 = (o88) objK3;
                        zF3 = lp2Var.f(o88Var7);
                        objK4 = lp2Var.K();
                        if (zF3) {
                            float fC1116 = v88.c(o88Var7.a.b);
                            iOrdinal = aj2Var.ordinal();
                            if (iOrdinal == 0) {
                                i32 = -2;
                            } else if (iOrdinal != 1) {
                                i32 = 2;
                                if (iOrdinal != 2) {
                                    b61.c();
                                    return;
                                }
                            } else {
                                i32 = 0;
                            }
                            objK4 = o88.a(o88Var7, 0L, eu7.i(fC1116 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                            lp2Var.g0(objK4);
                        } else {
                            float fC1117 = v88.c(o88Var7.a.b);
                            iOrdinal = aj2Var.ordinal();
                            if (iOrdinal == 0) {
                                i32 = -2;
                            } else if (iOrdinal != 1) {
                                i32 = 2;
                                if (iOrdinal != 2) {
                                    b61.c();
                                    return;
                                }
                            } else {
                                i32 = 0;
                            }
                            objK4 = o88.a(o88Var7, 0L, eu7.i(fC1117 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                            lp2Var.g0(objK4);
                        }
                        o88Var8 = (o88) objK4;
                        if (z5) {
                            mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                        } else {
                            mxVar = null;
                        }
                        o28 o28Var19 = new o28(i29);
                        int i31111111116 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                        int i31111111117 = i28 >> 6;
                        int i31111111118 = ((i28 >> 9) & 14) | (i31111111117 & 896);
                        int i31111111119 = i28 >> 3;
                        int i418 = i29;
                        u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var19, 0L, i30, false, i31, i31111111115, gn2Var, o88Var8, lp2Var, i31111111116, i31111111118 | (57344 & i31111111119) | (i31111111119 & 458752) | (3670016 & i31111111117), 11252);
                        kx4Var3 = kx4Var4;
                        i24 = i30;
                        i25 = i31;
                        i26 = i31111111115;
                        gn2Var2 = gn2Var;
                        z3 = z5;
                        o88Var3 = o88Var4;
                        i27 = i418;
                    } else {
                        lp2Var.Q();
                        z3 = z;
                        gn2Var2 = gn2Var;
                        kx4Var3 = kx4Var2;
                        o88Var3 = o88Var2;
                        i24 = i12;
                        i25 = i15;
                        i26 = i18;
                        i27 = i10;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: zy2
                            @Override // defpackage.rn2
                            public final Object K(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                                return dn8.a;
                            }
                        };
                    }
                }
                i7 |= 196608;
                i15 = i3;
                i17 = i6 & 64;
                if (i17 != 0) {
                    i7 |= 1572864;
                    i18 = i4;
                } else {
                    i18 = i4;
                    if ((i5 & 1572864) == 0) {
                        if (lp2Var.d(i18)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i7 |= i19;
                    }
                }
                i20 = i6 & 128;
                if (i20 != 0) {
                    i7 |= 12582912;
                } else if ((i5 & 12582912) == 0) {
                    if (lp2Var.g(z)) {
                        i21 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                    } else {
                        i21 = 4194304;
                    }
                    i7 |= i21;
                }
                i22 = i6 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i22 != 0) {
                    if ((i5 & 100663296) == 0) {
                        if (lp2Var.h(gn2Var)) {
                            i23 = 67108864;
                        } else {
                            i23 = 33554432;
                        }
                        i7 |= i23;
                    }
                    if ((i7 & 38347923) != 38347922) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (lp2Var.N(i7 & 1, z2)) {
                        lp2Var.S();
                        if ((i5 & 1) != 0) {
                            if (i33 != 0) {
                                kx4Var2 = hx4.X;
                            }
                            if (i8 != 0) {
                                o88Var2 = null;
                            }
                            if ((i6 & 8) != 0) {
                                i7 &= -7169;
                                i10 = 5;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i17 != 0) {
                                i18 = 1;
                            }
                            if (i20 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i22 != 0) {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                                gn2Var = null;
                            } else {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                            }
                        } else {
                            if (i33 != 0) {
                                kx4Var2 = hx4.X;
                            }
                            if (i8 != 0) {
                                o88Var2 = null;
                            }
                            if ((i6 & 8) != 0) {
                                i7 &= -7169;
                                i10 = 5;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i17 != 0) {
                                i18 = 1;
                            }
                            if (i20 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i22 != 0) {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                                gn2Var = null;
                            } else {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                            }
                        }
                        int i311111111110 = i18;
                        o88Var4 = o88Var2;
                        lp2Var.q();
                        objK = lp2Var.K();
                        obj = zz0.a;
                        if (objK == obj) {
                            kw4 kw4Var110 = kw4.a;
                            int iE110 = kw4.l().e(-1, "pref_font_size");
                            aj2.X.getClass();
                            objK = k32.g(iE110);
                            lp2Var.g0(objK);
                        }
                        aj2Var = (aj2) objK;
                        o88Var5 = (o88) lp2Var.j(u78.a);
                        j = ((dw0) lp2Var.j(j41.a)).a;
                        zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                        objK2 = lp2Var.K();
                        if (zF) {
                            jB = o88Var5.b();
                            if (jB != 16) {
                                j2 = jB;
                            } else {
                                j2 = j;
                            }
                            objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                            lp2Var.g0(objK2);
                        } else {
                            jB = o88Var5.b();
                            if (jB != 16) {
                                j2 = jB;
                            } else {
                                j2 = j;
                            }
                            objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                            lp2Var.g0(objK2);
                        }
                        o88Var6 = (o88) objK2;
                        if ((i28 & 896) == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        zF2 = z6 | lp2Var.f(o88Var6);
                        objK3 = lp2Var.K();
                        if (zF2) {
                            objK3 = o88Var6.d(o88Var4);
                            lp2Var.g0(objK3);
                        } else {
                            objK3 = o88Var6.d(o88Var4);
                            lp2Var.g0(objK3);
                        }
                        o88Var7 = (o88) objK3;
                        zF3 = lp2Var.f(o88Var7);
                        objK4 = lp2Var.K();
                        if (zF3) {
                            float fC1118 = v88.c(o88Var7.a.b);
                            iOrdinal = aj2Var.ordinal();
                            if (iOrdinal == 0) {
                                i32 = -2;
                            } else if (iOrdinal != 1) {
                                i32 = 2;
                                if (iOrdinal != 2) {
                                    b61.c();
                                    return;
                                }
                            } else {
                                i32 = 0;
                            }
                            objK4 = o88.a(o88Var7, 0L, eu7.i(fC1118 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                            lp2Var.g0(objK4);
                        } else {
                            float fC1119 = v88.c(o88Var7.a.b);
                            iOrdinal = aj2Var.ordinal();
                            if (iOrdinal == 0) {
                                i32 = -2;
                            } else if (iOrdinal != 1) {
                                i32 = 2;
                                if (iOrdinal != 2) {
                                    b61.c();
                                    return;
                                }
                            } else {
                                i32 = 0;
                            }
                            objK4 = o88.a(o88Var7, 0L, eu7.i(fC1119 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                            lp2Var.g0(objK4);
                        }
                        o88Var8 = (o88) objK4;
                        if (z5) {
                            mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                        } else {
                            mxVar = null;
                        }
                        o28 o28Var110 = new o28(i29);
                        int i311111111111 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                        int i311111111112 = i28 >> 6;
                        int i311111111113 = ((i28 >> 9) & 14) | (i311111111112 & 896);
                        int i311111111114 = i28 >> 3;
                        int i419 = i29;
                        u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var110, 0L, i30, false, i31, i311111111110, gn2Var, o88Var8, lp2Var, i311111111111, i311111111113 | (57344 & i311111111114) | (i311111111114 & 458752) | (3670016 & i311111111112), 11252);
                        kx4Var3 = kx4Var4;
                        i24 = i30;
                        i25 = i31;
                        i26 = i311111111110;
                        gn2Var2 = gn2Var;
                        z3 = z5;
                        o88Var3 = o88Var4;
                        i27 = i419;
                    } else {
                        lp2Var.Q();
                        z3 = z;
                        gn2Var2 = gn2Var;
                        kx4Var3 = kx4Var2;
                        o88Var3 = o88Var2;
                        i24 = i12;
                        i25 = i15;
                        i26 = i18;
                        i27 = i10;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: zy2
                            @Override // defpackage.rn2
                            public final Object K(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                                return dn8.a;
                            }
                        };
                    }
                }
                i7 |= 100663296;
                if ((i7 & 38347923) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (lp2Var.N(i7 & 1, z2)) {
                    lp2Var.S();
                    if ((i5 & 1) != 0) {
                        if (i33 != 0) {
                            kx4Var2 = hx4.X;
                        }
                        if (i8 != 0) {
                            o88Var2 = null;
                        }
                        if ((i6 & 8) != 0) {
                            i7 &= -7169;
                            i10 = 5;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i17 != 0) {
                            i18 = 1;
                        }
                        if (i20 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i22 != 0) {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                            gn2Var = null;
                        } else {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                        }
                    } else {
                        if (i33 != 0) {
                            kx4Var2 = hx4.X;
                        }
                        if (i8 != 0) {
                            o88Var2 = null;
                        }
                        if ((i6 & 8) != 0) {
                            i7 &= -7169;
                            i10 = 5;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i17 != 0) {
                            i18 = 1;
                        }
                        if (i20 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i22 != 0) {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                            gn2Var = null;
                        } else {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                        }
                    }
                    int i311111111115 = i18;
                    o88Var4 = o88Var2;
                    lp2Var.q();
                    objK = lp2Var.K();
                    obj = zz0.a;
                    if (objK == obj) {
                        kw4 kw4Var111 = kw4.a;
                        int iE111 = kw4.l().e(-1, "pref_font_size");
                        aj2.X.getClass();
                        objK = k32.g(iE111);
                        lp2Var.g0(objK);
                    }
                    aj2Var = (aj2) objK;
                    o88Var5 = (o88) lp2Var.j(u78.a);
                    j = ((dw0) lp2Var.j(j41.a)).a;
                    zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                    objK2 = lp2Var.K();
                    if (zF) {
                        jB = o88Var5.b();
                        if (jB != 16) {
                            j2 = jB;
                        } else {
                            j2 = j;
                        }
                        objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                        lp2Var.g0(objK2);
                    } else {
                        jB = o88Var5.b();
                        if (jB != 16) {
                            j2 = jB;
                        } else {
                            j2 = j;
                        }
                        objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                        lp2Var.g0(objK2);
                    }
                    o88Var6 = (o88) objK2;
                    if ((i28 & 896) == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    zF2 = z6 | lp2Var.f(o88Var6);
                    objK3 = lp2Var.K();
                    if (zF2) {
                        objK3 = o88Var6.d(o88Var4);
                        lp2Var.g0(objK3);
                    } else {
                        objK3 = o88Var6.d(o88Var4);
                        lp2Var.g0(objK3);
                    }
                    o88Var7 = (o88) objK3;
                    zF3 = lp2Var.f(o88Var7);
                    objK4 = lp2Var.K();
                    if (zF3) {
                        float fC11110 = v88.c(o88Var7.a.b);
                        iOrdinal = aj2Var.ordinal();
                        if (iOrdinal == 0) {
                            i32 = -2;
                        } else if (iOrdinal != 1) {
                            i32 = 2;
                            if (iOrdinal != 2) {
                                b61.c();
                                return;
                            }
                        } else {
                            i32 = 0;
                        }
                        objK4 = o88.a(o88Var7, 0L, eu7.i(fC11110 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                        lp2Var.g0(objK4);
                    } else {
                        float fC11111 = v88.c(o88Var7.a.b);
                        iOrdinal = aj2Var.ordinal();
                        if (iOrdinal == 0) {
                            i32 = -2;
                        } else if (iOrdinal != 1) {
                            i32 = 2;
                            if (iOrdinal != 2) {
                                b61.c();
                                return;
                            }
                        } else {
                            i32 = 0;
                        }
                        objK4 = o88.a(o88Var7, 0L, eu7.i(fC11111 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                        lp2Var.g0(objK4);
                    }
                    o88Var8 = (o88) objK4;
                    if (z5) {
                        mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                    } else {
                        mxVar = null;
                    }
                    o28 o28Var111 = new o28(i29);
                    int i311111111116 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                    int i311111111117 = i28 >> 6;
                    int i311111111118 = ((i28 >> 9) & 14) | (i311111111117 & 896);
                    int i311111111119 = i28 >> 3;
                    int i4110 = i29;
                    u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var111, 0L, i30, false, i31, i311111111115, gn2Var, o88Var8, lp2Var, i311111111116, i311111111118 | (57344 & i311111111119) | (i311111111119 & 458752) | (3670016 & i311111111117), 11252);
                    kx4Var3 = kx4Var4;
                    i24 = i30;
                    i25 = i31;
                    i26 = i311111111115;
                    gn2Var2 = gn2Var;
                    z3 = z5;
                    o88Var3 = o88Var4;
                    i27 = i4110;
                } else {
                    lp2Var.Q();
                    z3 = z;
                    gn2Var2 = gn2Var;
                    kx4Var3 = kx4Var2;
                    o88Var3 = o88Var2;
                    i24 = i12;
                    i25 = i15;
                    i26 = i18;
                    i27 = i10;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: zy2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                            return dn8.a;
                        }
                    };
                }
            }
            i7 |= 24576;
            i12 = i2;
            i14 = i6 & 32;
            if (i14 != 0) {
                if ((196608 & i5) == 0) {
                    i15 = i3;
                    if (lp2Var.d(i15)) {
                        i16 = 131072;
                    } else {
                        i16 = DnsOverHttps.MAX_RESPONSE_SIZE;
                    }
                    i7 |= i16;
                }
                i17 = i6 & 64;
                if (i17 != 0) {
                    i7 |= 1572864;
                    i18 = i4;
                } else {
                    i18 = i4;
                    if ((i5 & 1572864) == 0) {
                        if (lp2Var.d(i18)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i7 |= i19;
                    }
                }
                i20 = i6 & 128;
                if (i20 != 0) {
                    i7 |= 12582912;
                } else if ((i5 & 12582912) == 0) {
                    if (lp2Var.g(z)) {
                        i21 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                    } else {
                        i21 = 4194304;
                    }
                    i7 |= i21;
                }
                i22 = i6 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i22 != 0) {
                    if ((i5 & 100663296) == 0) {
                        if (lp2Var.h(gn2Var)) {
                            i23 = 67108864;
                        } else {
                            i23 = 33554432;
                        }
                        i7 |= i23;
                    }
                    if ((i7 & 38347923) != 38347922) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (lp2Var.N(i7 & 1, z2)) {
                        lp2Var.S();
                        if ((i5 & 1) != 0) {
                            if (i33 != 0) {
                                kx4Var2 = hx4.X;
                            }
                            if (i8 != 0) {
                                o88Var2 = null;
                            }
                            if ((i6 & 8) != 0) {
                                i7 &= -7169;
                                i10 = 5;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i17 != 0) {
                                i18 = 1;
                            }
                            if (i20 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i22 != 0) {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                                gn2Var = null;
                            } else {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                            }
                        } else {
                            if (i33 != 0) {
                                kx4Var2 = hx4.X;
                            }
                            if (i8 != 0) {
                                o88Var2 = null;
                            }
                            if ((i6 & 8) != 0) {
                                i7 &= -7169;
                                i10 = 5;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i17 != 0) {
                                i18 = 1;
                            }
                            if (i20 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i22 != 0) {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                                gn2Var = null;
                            } else {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                            }
                        }
                        int i3111111111110 = i18;
                        o88Var4 = o88Var2;
                        lp2Var.q();
                        objK = lp2Var.K();
                        obj = zz0.a;
                        if (objK == obj) {
                            kw4 kw4Var112 = kw4.a;
                            int iE112 = kw4.l().e(-1, "pref_font_size");
                            aj2.X.getClass();
                            objK = k32.g(iE112);
                            lp2Var.g0(objK);
                        }
                        aj2Var = (aj2) objK;
                        o88Var5 = (o88) lp2Var.j(u78.a);
                        j = ((dw0) lp2Var.j(j41.a)).a;
                        zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                        objK2 = lp2Var.K();
                        if (zF) {
                            jB = o88Var5.b();
                            if (jB != 16) {
                                j2 = jB;
                            } else {
                                j2 = j;
                            }
                            objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                            lp2Var.g0(objK2);
                        } else {
                            jB = o88Var5.b();
                            if (jB != 16) {
                                j2 = jB;
                            } else {
                                j2 = j;
                            }
                            objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                            lp2Var.g0(objK2);
                        }
                        o88Var6 = (o88) objK2;
                        if ((i28 & 896) == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        zF2 = z6 | lp2Var.f(o88Var6);
                        objK3 = lp2Var.K();
                        if (zF2) {
                            objK3 = o88Var6.d(o88Var4);
                            lp2Var.g0(objK3);
                        } else {
                            objK3 = o88Var6.d(o88Var4);
                            lp2Var.g0(objK3);
                        }
                        o88Var7 = (o88) objK3;
                        zF3 = lp2Var.f(o88Var7);
                        objK4 = lp2Var.K();
                        if (zF3) {
                            float fC11112 = v88.c(o88Var7.a.b);
                            iOrdinal = aj2Var.ordinal();
                            if (iOrdinal == 0) {
                                i32 = -2;
                            } else if (iOrdinal != 1) {
                                i32 = 2;
                                if (iOrdinal != 2) {
                                    b61.c();
                                    return;
                                }
                            } else {
                                i32 = 0;
                            }
                            objK4 = o88.a(o88Var7, 0L, eu7.i(fC11112 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                            lp2Var.g0(objK4);
                        } else {
                            float fC11113 = v88.c(o88Var7.a.b);
                            iOrdinal = aj2Var.ordinal();
                            if (iOrdinal == 0) {
                                i32 = -2;
                            } else if (iOrdinal != 1) {
                                i32 = 2;
                                if (iOrdinal != 2) {
                                    b61.c();
                                    return;
                                }
                            } else {
                                i32 = 0;
                            }
                            objK4 = o88.a(o88Var7, 0L, eu7.i(fC11113 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                            lp2Var.g0(objK4);
                        }
                        o88Var8 = (o88) objK4;
                        if (z5) {
                            mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                        } else {
                            mxVar = null;
                        }
                        o28 o28Var112 = new o28(i29);
                        int i3111111111111 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                        int i3111111111112 = i28 >> 6;
                        int i3111111111113 = ((i28 >> 9) & 14) | (i3111111111112 & 896);
                        int i3111111111114 = i28 >> 3;
                        int i4111 = i29;
                        u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var112, 0L, i30, false, i31, i3111111111110, gn2Var, o88Var8, lp2Var, i3111111111111, i3111111111113 | (57344 & i3111111111114) | (i3111111111114 & 458752) | (3670016 & i3111111111112), 11252);
                        kx4Var3 = kx4Var4;
                        i24 = i30;
                        i25 = i31;
                        i26 = i3111111111110;
                        gn2Var2 = gn2Var;
                        z3 = z5;
                        o88Var3 = o88Var4;
                        i27 = i4111;
                    } else {
                        lp2Var.Q();
                        z3 = z;
                        gn2Var2 = gn2Var;
                        kx4Var3 = kx4Var2;
                        o88Var3 = o88Var2;
                        i24 = i12;
                        i25 = i15;
                        i26 = i18;
                        i27 = i10;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: zy2
                            @Override // defpackage.rn2
                            public final Object K(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                                return dn8.a;
                            }
                        };
                    }
                }
                i7 |= 100663296;
                if ((i7 & 38347923) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (lp2Var.N(i7 & 1, z2)) {
                    lp2Var.S();
                    if ((i5 & 1) != 0) {
                        if (i33 != 0) {
                            kx4Var2 = hx4.X;
                        }
                        if (i8 != 0) {
                            o88Var2 = null;
                        }
                        if ((i6 & 8) != 0) {
                            i7 &= -7169;
                            i10 = 5;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i17 != 0) {
                            i18 = 1;
                        }
                        if (i20 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i22 != 0) {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                            gn2Var = null;
                        } else {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                        }
                    } else {
                        if (i33 != 0) {
                            kx4Var2 = hx4.X;
                        }
                        if (i8 != 0) {
                            o88Var2 = null;
                        }
                        if ((i6 & 8) != 0) {
                            i7 &= -7169;
                            i10 = 5;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i17 != 0) {
                            i18 = 1;
                        }
                        if (i20 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i22 != 0) {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                            gn2Var = null;
                        } else {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                        }
                    }
                    int i3111111111115 = i18;
                    o88Var4 = o88Var2;
                    lp2Var.q();
                    objK = lp2Var.K();
                    obj = zz0.a;
                    if (objK == obj) {
                        kw4 kw4Var113 = kw4.a;
                        int iE113 = kw4.l().e(-1, "pref_font_size");
                        aj2.X.getClass();
                        objK = k32.g(iE113);
                        lp2Var.g0(objK);
                    }
                    aj2Var = (aj2) objK;
                    o88Var5 = (o88) lp2Var.j(u78.a);
                    j = ((dw0) lp2Var.j(j41.a)).a;
                    zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                    objK2 = lp2Var.K();
                    if (zF) {
                        jB = o88Var5.b();
                        if (jB != 16) {
                            j2 = jB;
                        } else {
                            j2 = j;
                        }
                        objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                        lp2Var.g0(objK2);
                    } else {
                        jB = o88Var5.b();
                        if (jB != 16) {
                            j2 = jB;
                        } else {
                            j2 = j;
                        }
                        objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                        lp2Var.g0(objK2);
                    }
                    o88Var6 = (o88) objK2;
                    if ((i28 & 896) == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    zF2 = z6 | lp2Var.f(o88Var6);
                    objK3 = lp2Var.K();
                    if (zF2) {
                        objK3 = o88Var6.d(o88Var4);
                        lp2Var.g0(objK3);
                    } else {
                        objK3 = o88Var6.d(o88Var4);
                        lp2Var.g0(objK3);
                    }
                    o88Var7 = (o88) objK3;
                    zF3 = lp2Var.f(o88Var7);
                    objK4 = lp2Var.K();
                    if (zF3) {
                        float fC11114 = v88.c(o88Var7.a.b);
                        iOrdinal = aj2Var.ordinal();
                        if (iOrdinal == 0) {
                            i32 = -2;
                        } else if (iOrdinal != 1) {
                            i32 = 2;
                            if (iOrdinal != 2) {
                                b61.c();
                                return;
                            }
                        } else {
                            i32 = 0;
                        }
                        objK4 = o88.a(o88Var7, 0L, eu7.i(fC11114 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                        lp2Var.g0(objK4);
                    } else {
                        float fC11115 = v88.c(o88Var7.a.b);
                        iOrdinal = aj2Var.ordinal();
                        if (iOrdinal == 0) {
                            i32 = -2;
                        } else if (iOrdinal != 1) {
                            i32 = 2;
                            if (iOrdinal != 2) {
                                b61.c();
                                return;
                            }
                        } else {
                            i32 = 0;
                        }
                        objK4 = o88.a(o88Var7, 0L, eu7.i(fC11115 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                        lp2Var.g0(objK4);
                    }
                    o88Var8 = (o88) objK4;
                    if (z5) {
                        mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                    } else {
                        mxVar = null;
                    }
                    o28 o28Var113 = new o28(i29);
                    int i3111111111116 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                    int i3111111111117 = i28 >> 6;
                    int i3111111111118 = ((i28 >> 9) & 14) | (i3111111111117 & 896);
                    int i3111111111119 = i28 >> 3;
                    int i4112 = i29;
                    u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var113, 0L, i30, false, i31, i3111111111115, gn2Var, o88Var8, lp2Var, i3111111111116, i3111111111118 | (57344 & i3111111111119) | (i3111111111119 & 458752) | (3670016 & i3111111111117), 11252);
                    kx4Var3 = kx4Var4;
                    i24 = i30;
                    i25 = i31;
                    i26 = i3111111111115;
                    gn2Var2 = gn2Var;
                    z3 = z5;
                    o88Var3 = o88Var4;
                    i27 = i4112;
                } else {
                    lp2Var.Q();
                    z3 = z;
                    gn2Var2 = gn2Var;
                    kx4Var3 = kx4Var2;
                    o88Var3 = o88Var2;
                    i24 = i12;
                    i25 = i15;
                    i26 = i18;
                    i27 = i10;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: zy2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                            return dn8.a;
                        }
                    };
                }
            }
            i7 |= 196608;
            i15 = i3;
            i17 = i6 & 64;
            if (i17 != 0) {
                i7 |= 1572864;
                i18 = i4;
            } else {
                i18 = i4;
                if ((i5 & 1572864) == 0) {
                    if (lp2Var.d(i18)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i7 |= i19;
                }
            }
            i20 = i6 & 128;
            if (i20 != 0) {
                i7 |= 12582912;
            } else if ((i5 & 12582912) == 0) {
                if (lp2Var.g(z)) {
                    i21 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                } else {
                    i21 = 4194304;
                }
                i7 |= i21;
            }
            i22 = i6 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i22 != 0) {
                if ((i5 & 100663296) == 0) {
                    if (lp2Var.h(gn2Var)) {
                        i23 = 67108864;
                    } else {
                        i23 = 33554432;
                    }
                    i7 |= i23;
                }
                if ((i7 & 38347923) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (lp2Var.N(i7 & 1, z2)) {
                    lp2Var.S();
                    if ((i5 & 1) != 0) {
                        if (i33 != 0) {
                            kx4Var2 = hx4.X;
                        }
                        if (i8 != 0) {
                            o88Var2 = null;
                        }
                        if ((i6 & 8) != 0) {
                            i7 &= -7169;
                            i10 = 5;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i17 != 0) {
                            i18 = 1;
                        }
                        if (i20 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i22 != 0) {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                            gn2Var = null;
                        } else {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                        }
                    } else {
                        if (i33 != 0) {
                            kx4Var2 = hx4.X;
                        }
                        if (i8 != 0) {
                            o88Var2 = null;
                        }
                        if ((i6 & 8) != 0) {
                            i7 &= -7169;
                            i10 = 5;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i17 != 0) {
                            i18 = 1;
                        }
                        if (i20 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i22 != 0) {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                            gn2Var = null;
                        } else {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                        }
                    }
                    int i31111111111110 = i18;
                    o88Var4 = o88Var2;
                    lp2Var.q();
                    objK = lp2Var.K();
                    obj = zz0.a;
                    if (objK == obj) {
                        kw4 kw4Var114 = kw4.a;
                        int iE114 = kw4.l().e(-1, "pref_font_size");
                        aj2.X.getClass();
                        objK = k32.g(iE114);
                        lp2Var.g0(objK);
                    }
                    aj2Var = (aj2) objK;
                    o88Var5 = (o88) lp2Var.j(u78.a);
                    j = ((dw0) lp2Var.j(j41.a)).a;
                    zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                    objK2 = lp2Var.K();
                    if (zF) {
                        jB = o88Var5.b();
                        if (jB != 16) {
                            j2 = jB;
                        } else {
                            j2 = j;
                        }
                        objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                        lp2Var.g0(objK2);
                    } else {
                        jB = o88Var5.b();
                        if (jB != 16) {
                            j2 = jB;
                        } else {
                            j2 = j;
                        }
                        objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                        lp2Var.g0(objK2);
                    }
                    o88Var6 = (o88) objK2;
                    if ((i28 & 896) == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    zF2 = z6 | lp2Var.f(o88Var6);
                    objK3 = lp2Var.K();
                    if (zF2) {
                        objK3 = o88Var6.d(o88Var4);
                        lp2Var.g0(objK3);
                    } else {
                        objK3 = o88Var6.d(o88Var4);
                        lp2Var.g0(objK3);
                    }
                    o88Var7 = (o88) objK3;
                    zF3 = lp2Var.f(o88Var7);
                    objK4 = lp2Var.K();
                    if (zF3) {
                        float fC11116 = v88.c(o88Var7.a.b);
                        iOrdinal = aj2Var.ordinal();
                        if (iOrdinal == 0) {
                            i32 = -2;
                        } else if (iOrdinal != 1) {
                            i32 = 2;
                            if (iOrdinal != 2) {
                                b61.c();
                                return;
                            }
                        } else {
                            i32 = 0;
                        }
                        objK4 = o88.a(o88Var7, 0L, eu7.i(fC11116 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                        lp2Var.g0(objK4);
                    } else {
                        float fC11117 = v88.c(o88Var7.a.b);
                        iOrdinal = aj2Var.ordinal();
                        if (iOrdinal == 0) {
                            i32 = -2;
                        } else if (iOrdinal != 1) {
                            i32 = 2;
                            if (iOrdinal != 2) {
                                b61.c();
                                return;
                            }
                        } else {
                            i32 = 0;
                        }
                        objK4 = o88.a(o88Var7, 0L, eu7.i(fC11117 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                        lp2Var.g0(objK4);
                    }
                    o88Var8 = (o88) objK4;
                    if (z5) {
                        mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                    } else {
                        mxVar = null;
                    }
                    o28 o28Var114 = new o28(i29);
                    int i31111111111111 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                    int i31111111111112 = i28 >> 6;
                    int i31111111111113 = ((i28 >> 9) & 14) | (i31111111111112 & 896);
                    int i31111111111114 = i28 >> 3;
                    int i4113 = i29;
                    u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var114, 0L, i30, false, i31, i31111111111110, gn2Var, o88Var8, lp2Var, i31111111111111, i31111111111113 | (57344 & i31111111111114) | (i31111111111114 & 458752) | (3670016 & i31111111111112), 11252);
                    kx4Var3 = kx4Var4;
                    i24 = i30;
                    i25 = i31;
                    i26 = i31111111111110;
                    gn2Var2 = gn2Var;
                    z3 = z5;
                    o88Var3 = o88Var4;
                    i27 = i4113;
                } else {
                    lp2Var.Q();
                    z3 = z;
                    gn2Var2 = gn2Var;
                    kx4Var3 = kx4Var2;
                    o88Var3 = o88Var2;
                    i24 = i12;
                    i25 = i15;
                    i26 = i18;
                    i27 = i10;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: zy2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                            return dn8.a;
                        }
                    };
                }
            }
            i7 |= 100663296;
            if ((i7 & 38347923) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (lp2Var.N(i7 & 1, z2)) {
                lp2Var.S();
                if ((i5 & 1) != 0) {
                    if (i33 != 0) {
                        kx4Var2 = hx4.X;
                    }
                    if (i8 != 0) {
                        o88Var2 = null;
                    }
                    if ((i6 & 8) != 0) {
                        i7 &= -7169;
                        i10 = 5;
                    }
                    if (i11 != 0) {
                        i12 = 2;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i17 != 0) {
                        i18 = 1;
                    }
                    if (i20 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i22 != 0) {
                        z5 = z4;
                        i28 = i7;
                        kx4Var4 = kx4Var2;
                        i29 = i10;
                        i30 = i12;
                        i31 = i15;
                        gn2Var = null;
                    } else {
                        z5 = z4;
                        i28 = i7;
                        kx4Var4 = kx4Var2;
                        i29 = i10;
                        i30 = i12;
                        i31 = i15;
                    }
                } else {
                    if (i33 != 0) {
                        kx4Var2 = hx4.X;
                    }
                    if (i8 != 0) {
                        o88Var2 = null;
                    }
                    if ((i6 & 8) != 0) {
                        i7 &= -7169;
                        i10 = 5;
                    }
                    if (i11 != 0) {
                        i12 = 2;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i17 != 0) {
                        i18 = 1;
                    }
                    if (i20 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i22 != 0) {
                        z5 = z4;
                        i28 = i7;
                        kx4Var4 = kx4Var2;
                        i29 = i10;
                        i30 = i12;
                        i31 = i15;
                        gn2Var = null;
                    } else {
                        z5 = z4;
                        i28 = i7;
                        kx4Var4 = kx4Var2;
                        i29 = i10;
                        i30 = i12;
                        i31 = i15;
                    }
                }
                int i31111111111115 = i18;
                o88Var4 = o88Var2;
                lp2Var.q();
                objK = lp2Var.K();
                obj = zz0.a;
                if (objK == obj) {
                    kw4 kw4Var115 = kw4.a;
                    int iE115 = kw4.l().e(-1, "pref_font_size");
                    aj2.X.getClass();
                    objK = k32.g(iE115);
                    lp2Var.g0(objK);
                }
                aj2Var = (aj2) objK;
                o88Var5 = (o88) lp2Var.j(u78.a);
                j = ((dw0) lp2Var.j(j41.a)).a;
                zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                objK2 = lp2Var.K();
                if (zF) {
                    jB = o88Var5.b();
                    if (jB != 16) {
                        j2 = jB;
                    } else {
                        j2 = j;
                    }
                    objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                    lp2Var.g0(objK2);
                } else {
                    jB = o88Var5.b();
                    if (jB != 16) {
                        j2 = jB;
                    } else {
                        j2 = j;
                    }
                    objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                    lp2Var.g0(objK2);
                }
                o88Var6 = (o88) objK2;
                if ((i28 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zF2 = z6 | lp2Var.f(o88Var6);
                objK3 = lp2Var.K();
                if (zF2) {
                    objK3 = o88Var6.d(o88Var4);
                    lp2Var.g0(objK3);
                } else {
                    objK3 = o88Var6.d(o88Var4);
                    lp2Var.g0(objK3);
                }
                o88Var7 = (o88) objK3;
                zF3 = lp2Var.f(o88Var7);
                objK4 = lp2Var.K();
                if (zF3) {
                    float fC11118 = v88.c(o88Var7.a.b);
                    iOrdinal = aj2Var.ordinal();
                    if (iOrdinal == 0) {
                        i32 = -2;
                    } else if (iOrdinal != 1) {
                        i32 = 2;
                        if (iOrdinal != 2) {
                            b61.c();
                            return;
                        }
                    } else {
                        i32 = 0;
                    }
                    objK4 = o88.a(o88Var7, 0L, eu7.i(fC11118 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                    lp2Var.g0(objK4);
                } else {
                    float fC11119 = v88.c(o88Var7.a.b);
                    iOrdinal = aj2Var.ordinal();
                    if (iOrdinal == 0) {
                        i32 = -2;
                    } else if (iOrdinal != 1) {
                        i32 = 2;
                        if (iOrdinal != 2) {
                            b61.c();
                            return;
                        }
                    } else {
                        i32 = 0;
                    }
                    objK4 = o88.a(o88Var7, 0L, eu7.i(fC11119 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                    lp2Var.g0(objK4);
                }
                o88Var8 = (o88) objK4;
                if (z5) {
                    mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                } else {
                    mxVar = null;
                }
                o28 o28Var115 = new o28(i29);
                int i31111111111116 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                int i31111111111117 = i28 >> 6;
                int i31111111111118 = ((i28 >> 9) & 14) | (i31111111111117 & 896);
                int i31111111111119 = i28 >> 3;
                int i4114 = i29;
                u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var115, 0L, i30, false, i31, i31111111111115, gn2Var, o88Var8, lp2Var, i31111111111116, i31111111111118 | (57344 & i31111111111119) | (i31111111111119 & 458752) | (3670016 & i31111111111117), 11252);
                kx4Var3 = kx4Var4;
                i24 = i30;
                i25 = i31;
                i26 = i31111111111115;
                gn2Var2 = gn2Var;
                z3 = z5;
                o88Var3 = o88Var4;
                i27 = i4114;
            } else {
                lp2Var.Q();
                z3 = z;
                gn2Var2 = gn2Var;
                kx4Var3 = kx4Var2;
                o88Var3 = o88Var2;
                i24 = i12;
                i25 = i15;
                i26 = i18;
                i27 = i10;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: zy2
                    @Override // defpackage.rn2
                    public final Object K(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                        return dn8.a;
                    }
                };
            }
        }
        i7 |= 384;
        o88Var2 = o88Var;
        if ((i5 & 3072) == 0) {
            if ((i6 & 8) == 0) {
                i10 = i;
                if (lp2Var.d(i10)) {
                }
                i7 |= i34;
            } else {
                i10 = i;
            }
            i7 |= i34;
        } else {
            i10 = i;
        }
        i11 = i6 & 16;
        if (i11 != 0) {
            if ((i5 & 24576) == 0) {
                i12 = i2;
                if (lp2Var.d(i12)) {
                    i13 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i13 = 8192;
                }
                i7 |= i13;
            }
            i14 = i6 & 32;
            if (i14 != 0) {
                if ((196608 & i5) == 0) {
                    i15 = i3;
                    if (lp2Var.d(i15)) {
                        i16 = 131072;
                    } else {
                        i16 = DnsOverHttps.MAX_RESPONSE_SIZE;
                    }
                    i7 |= i16;
                }
                i17 = i6 & 64;
                if (i17 != 0) {
                    i7 |= 1572864;
                    i18 = i4;
                } else {
                    i18 = i4;
                    if ((i5 & 1572864) == 0) {
                        if (lp2Var.d(i18)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i7 |= i19;
                    }
                }
                i20 = i6 & 128;
                if (i20 != 0) {
                    i7 |= 12582912;
                } else if ((i5 & 12582912) == 0) {
                    if (lp2Var.g(z)) {
                        i21 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                    } else {
                        i21 = 4194304;
                    }
                    i7 |= i21;
                }
                i22 = i6 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i22 != 0) {
                    if ((i5 & 100663296) == 0) {
                        if (lp2Var.h(gn2Var)) {
                            i23 = 67108864;
                        } else {
                            i23 = 33554432;
                        }
                        i7 |= i23;
                    }
                    if ((i7 & 38347923) != 38347922) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (lp2Var.N(i7 & 1, z2)) {
                        lp2Var.S();
                        if ((i5 & 1) != 0) {
                            if (i33 != 0) {
                                kx4Var2 = hx4.X;
                            }
                            if (i8 != 0) {
                                o88Var2 = null;
                            }
                            if ((i6 & 8) != 0) {
                                i7 &= -7169;
                                i10 = 5;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i17 != 0) {
                                i18 = 1;
                            }
                            if (i20 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i22 != 0) {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                                gn2Var = null;
                            } else {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                            }
                        } else {
                            if (i33 != 0) {
                                kx4Var2 = hx4.X;
                            }
                            if (i8 != 0) {
                                o88Var2 = null;
                            }
                            if ((i6 & 8) != 0) {
                                i7 &= -7169;
                                i10 = 5;
                            }
                            if (i11 != 0) {
                                i12 = 2;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i17 != 0) {
                                i18 = 1;
                            }
                            if (i20 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i22 != 0) {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                                gn2Var = null;
                            } else {
                                z5 = z4;
                                i28 = i7;
                                kx4Var4 = kx4Var2;
                                i29 = i10;
                                i30 = i12;
                                i31 = i15;
                            }
                        }
                        int i311111111111110 = i18;
                        o88Var4 = o88Var2;
                        lp2Var.q();
                        objK = lp2Var.K();
                        obj = zz0.a;
                        if (objK == obj) {
                            kw4 kw4Var116 = kw4.a;
                            int iE116 = kw4.l().e(-1, "pref_font_size");
                            aj2.X.getClass();
                            objK = k32.g(iE116);
                            lp2Var.g0(objK);
                        }
                        aj2Var = (aj2) objK;
                        o88Var5 = (o88) lp2Var.j(u78.a);
                        j = ((dw0) lp2Var.j(j41.a)).a;
                        zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                        objK2 = lp2Var.K();
                        if (zF) {
                            jB = o88Var5.b();
                            if (jB != 16) {
                                j2 = jB;
                            } else {
                                j2 = j;
                            }
                            objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                            lp2Var.g0(objK2);
                        } else {
                            jB = o88Var5.b();
                            if (jB != 16) {
                                j2 = jB;
                            } else {
                                j2 = j;
                            }
                            objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                            lp2Var.g0(objK2);
                        }
                        o88Var6 = (o88) objK2;
                        if ((i28 & 896) == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        zF2 = z6 | lp2Var.f(o88Var6);
                        objK3 = lp2Var.K();
                        if (zF2) {
                            objK3 = o88Var6.d(o88Var4);
                            lp2Var.g0(objK3);
                        } else {
                            objK3 = o88Var6.d(o88Var4);
                            lp2Var.g0(objK3);
                        }
                        o88Var7 = (o88) objK3;
                        zF3 = lp2Var.f(o88Var7);
                        objK4 = lp2Var.K();
                        if (zF3) {
                            float fC111110 = v88.c(o88Var7.a.b);
                            iOrdinal = aj2Var.ordinal();
                            if (iOrdinal == 0) {
                                i32 = -2;
                            } else if (iOrdinal != 1) {
                                i32 = 2;
                                if (iOrdinal != 2) {
                                    b61.c();
                                    return;
                                }
                            } else {
                                i32 = 0;
                            }
                            objK4 = o88.a(o88Var7, 0L, eu7.i(fC111110 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                            lp2Var.g0(objK4);
                        } else {
                            float fC111111 = v88.c(o88Var7.a.b);
                            iOrdinal = aj2Var.ordinal();
                            if (iOrdinal == 0) {
                                i32 = -2;
                            } else if (iOrdinal != 1) {
                                i32 = 2;
                                if (iOrdinal != 2) {
                                    b61.c();
                                    return;
                                }
                            } else {
                                i32 = 0;
                            }
                            objK4 = o88.a(o88Var7, 0L, eu7.i(fC111111 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                            lp2Var.g0(objK4);
                        }
                        o88Var8 = (o88) objK4;
                        if (z5) {
                            mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                        } else {
                            mxVar = null;
                        }
                        o28 o28Var116 = new o28(i29);
                        int i311111111111111 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                        int i311111111111112 = i28 >> 6;
                        int i311111111111113 = ((i28 >> 9) & 14) | (i311111111111112 & 896);
                        int i311111111111114 = i28 >> 3;
                        int i4115 = i29;
                        u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var116, 0L, i30, false, i31, i311111111111110, gn2Var, o88Var8, lp2Var, i311111111111111, i311111111111113 | (57344 & i311111111111114) | (i311111111111114 & 458752) | (3670016 & i311111111111112), 11252);
                        kx4Var3 = kx4Var4;
                        i24 = i30;
                        i25 = i31;
                        i26 = i311111111111110;
                        gn2Var2 = gn2Var;
                        z3 = z5;
                        o88Var3 = o88Var4;
                        i27 = i4115;
                    } else {
                        lp2Var.Q();
                        z3 = z;
                        gn2Var2 = gn2Var;
                        kx4Var3 = kx4Var2;
                        o88Var3 = o88Var2;
                        i24 = i12;
                        i25 = i15;
                        i26 = i18;
                        i27 = i10;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: zy2
                            @Override // defpackage.rn2
                            public final Object K(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                                return dn8.a;
                            }
                        };
                    }
                }
                i7 |= 100663296;
                if ((i7 & 38347923) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (lp2Var.N(i7 & 1, z2)) {
                    lp2Var.S();
                    if ((i5 & 1) != 0) {
                        if (i33 != 0) {
                            kx4Var2 = hx4.X;
                        }
                        if (i8 != 0) {
                            o88Var2 = null;
                        }
                        if ((i6 & 8) != 0) {
                            i7 &= -7169;
                            i10 = 5;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i17 != 0) {
                            i18 = 1;
                        }
                        if (i20 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i22 != 0) {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                            gn2Var = null;
                        } else {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                        }
                    } else {
                        if (i33 != 0) {
                            kx4Var2 = hx4.X;
                        }
                        if (i8 != 0) {
                            o88Var2 = null;
                        }
                        if ((i6 & 8) != 0) {
                            i7 &= -7169;
                            i10 = 5;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i17 != 0) {
                            i18 = 1;
                        }
                        if (i20 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i22 != 0) {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                            gn2Var = null;
                        } else {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                        }
                    }
                    int i311111111111115 = i18;
                    o88Var4 = o88Var2;
                    lp2Var.q();
                    objK = lp2Var.K();
                    obj = zz0.a;
                    if (objK == obj) {
                        kw4 kw4Var117 = kw4.a;
                        int iE117 = kw4.l().e(-1, "pref_font_size");
                        aj2.X.getClass();
                        objK = k32.g(iE117);
                        lp2Var.g0(objK);
                    }
                    aj2Var = (aj2) objK;
                    o88Var5 = (o88) lp2Var.j(u78.a);
                    j = ((dw0) lp2Var.j(j41.a)).a;
                    zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                    objK2 = lp2Var.K();
                    if (zF) {
                        jB = o88Var5.b();
                        if (jB != 16) {
                            j2 = jB;
                        } else {
                            j2 = j;
                        }
                        objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                        lp2Var.g0(objK2);
                    } else {
                        jB = o88Var5.b();
                        if (jB != 16) {
                            j2 = jB;
                        } else {
                            j2 = j;
                        }
                        objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                        lp2Var.g0(objK2);
                    }
                    o88Var6 = (o88) objK2;
                    if ((i28 & 896) == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    zF2 = z6 | lp2Var.f(o88Var6);
                    objK3 = lp2Var.K();
                    if (zF2) {
                        objK3 = o88Var6.d(o88Var4);
                        lp2Var.g0(objK3);
                    } else {
                        objK3 = o88Var6.d(o88Var4);
                        lp2Var.g0(objK3);
                    }
                    o88Var7 = (o88) objK3;
                    zF3 = lp2Var.f(o88Var7);
                    objK4 = lp2Var.K();
                    if (zF3) {
                        float fC111112 = v88.c(o88Var7.a.b);
                        iOrdinal = aj2Var.ordinal();
                        if (iOrdinal == 0) {
                            i32 = -2;
                        } else if (iOrdinal != 1) {
                            i32 = 2;
                            if (iOrdinal != 2) {
                                b61.c();
                                return;
                            }
                        } else {
                            i32 = 0;
                        }
                        objK4 = o88.a(o88Var7, 0L, eu7.i(fC111112 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                        lp2Var.g0(objK4);
                    } else {
                        float fC111113 = v88.c(o88Var7.a.b);
                        iOrdinal = aj2Var.ordinal();
                        if (iOrdinal == 0) {
                            i32 = -2;
                        } else if (iOrdinal != 1) {
                            i32 = 2;
                            if (iOrdinal != 2) {
                                b61.c();
                                return;
                            }
                        } else {
                            i32 = 0;
                        }
                        objK4 = o88.a(o88Var7, 0L, eu7.i(fC111113 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                        lp2Var.g0(objK4);
                    }
                    o88Var8 = (o88) objK4;
                    if (z5) {
                        mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                    } else {
                        mxVar = null;
                    }
                    o28 o28Var117 = new o28(i29);
                    int i311111111111116 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                    int i311111111111117 = i28 >> 6;
                    int i311111111111118 = ((i28 >> 9) & 14) | (i311111111111117 & 896);
                    int i311111111111119 = i28 >> 3;
                    int i4116 = i29;
                    u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var117, 0L, i30, false, i31, i311111111111115, gn2Var, o88Var8, lp2Var, i311111111111116, i311111111111118 | (57344 & i311111111111119) | (i311111111111119 & 458752) | (3670016 & i311111111111117), 11252);
                    kx4Var3 = kx4Var4;
                    i24 = i30;
                    i25 = i31;
                    i26 = i311111111111115;
                    gn2Var2 = gn2Var;
                    z3 = z5;
                    o88Var3 = o88Var4;
                    i27 = i4116;
                } else {
                    lp2Var.Q();
                    z3 = z;
                    gn2Var2 = gn2Var;
                    kx4Var3 = kx4Var2;
                    o88Var3 = o88Var2;
                    i24 = i12;
                    i25 = i15;
                    i26 = i18;
                    i27 = i10;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: zy2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                            return dn8.a;
                        }
                    };
                }
            }
            i7 |= 196608;
            i15 = i3;
            i17 = i6 & 64;
            if (i17 != 0) {
                i7 |= 1572864;
                i18 = i4;
            } else {
                i18 = i4;
                if ((i5 & 1572864) == 0) {
                    if (lp2Var.d(i18)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i7 |= i19;
                }
            }
            i20 = i6 & 128;
            if (i20 != 0) {
                i7 |= 12582912;
            } else if ((i5 & 12582912) == 0) {
                if (lp2Var.g(z)) {
                    i21 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                } else {
                    i21 = 4194304;
                }
                i7 |= i21;
            }
            i22 = i6 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i22 != 0) {
                if ((i5 & 100663296) == 0) {
                    if (lp2Var.h(gn2Var)) {
                        i23 = 67108864;
                    } else {
                        i23 = 33554432;
                    }
                    i7 |= i23;
                }
                if ((i7 & 38347923) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (lp2Var.N(i7 & 1, z2)) {
                    lp2Var.S();
                    if ((i5 & 1) != 0) {
                        if (i33 != 0) {
                            kx4Var2 = hx4.X;
                        }
                        if (i8 != 0) {
                            o88Var2 = null;
                        }
                        if ((i6 & 8) != 0) {
                            i7 &= -7169;
                            i10 = 5;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i17 != 0) {
                            i18 = 1;
                        }
                        if (i20 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i22 != 0) {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                            gn2Var = null;
                        } else {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                        }
                    } else {
                        if (i33 != 0) {
                            kx4Var2 = hx4.X;
                        }
                        if (i8 != 0) {
                            o88Var2 = null;
                        }
                        if ((i6 & 8) != 0) {
                            i7 &= -7169;
                            i10 = 5;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i17 != 0) {
                            i18 = 1;
                        }
                        if (i20 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i22 != 0) {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                            gn2Var = null;
                        } else {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                        }
                    }
                    int i3111111111111110 = i18;
                    o88Var4 = o88Var2;
                    lp2Var.q();
                    objK = lp2Var.K();
                    obj = zz0.a;
                    if (objK == obj) {
                        kw4 kw4Var118 = kw4.a;
                        int iE118 = kw4.l().e(-1, "pref_font_size");
                        aj2.X.getClass();
                        objK = k32.g(iE118);
                        lp2Var.g0(objK);
                    }
                    aj2Var = (aj2) objK;
                    o88Var5 = (o88) lp2Var.j(u78.a);
                    j = ((dw0) lp2Var.j(j41.a)).a;
                    zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                    objK2 = lp2Var.K();
                    if (zF) {
                        jB = o88Var5.b();
                        if (jB != 16) {
                            j2 = jB;
                        } else {
                            j2 = j;
                        }
                        objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                        lp2Var.g0(objK2);
                    } else {
                        jB = o88Var5.b();
                        if (jB != 16) {
                            j2 = jB;
                        } else {
                            j2 = j;
                        }
                        objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                        lp2Var.g0(objK2);
                    }
                    o88Var6 = (o88) objK2;
                    if ((i28 & 896) == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    zF2 = z6 | lp2Var.f(o88Var6);
                    objK3 = lp2Var.K();
                    if (zF2) {
                        objK3 = o88Var6.d(o88Var4);
                        lp2Var.g0(objK3);
                    } else {
                        objK3 = o88Var6.d(o88Var4);
                        lp2Var.g0(objK3);
                    }
                    o88Var7 = (o88) objK3;
                    zF3 = lp2Var.f(o88Var7);
                    objK4 = lp2Var.K();
                    if (zF3) {
                        float fC111114 = v88.c(o88Var7.a.b);
                        iOrdinal = aj2Var.ordinal();
                        if (iOrdinal == 0) {
                            i32 = -2;
                        } else if (iOrdinal != 1) {
                            i32 = 2;
                            if (iOrdinal != 2) {
                                b61.c();
                                return;
                            }
                        } else {
                            i32 = 0;
                        }
                        objK4 = o88.a(o88Var7, 0L, eu7.i(fC111114 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                        lp2Var.g0(objK4);
                    } else {
                        float fC111115 = v88.c(o88Var7.a.b);
                        iOrdinal = aj2Var.ordinal();
                        if (iOrdinal == 0) {
                            i32 = -2;
                        } else if (iOrdinal != 1) {
                            i32 = 2;
                            if (iOrdinal != 2) {
                                b61.c();
                                return;
                            }
                        } else {
                            i32 = 0;
                        }
                        objK4 = o88.a(o88Var7, 0L, eu7.i(fC111115 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                        lp2Var.g0(objK4);
                    }
                    o88Var8 = (o88) objK4;
                    if (z5) {
                        mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                    } else {
                        mxVar = null;
                    }
                    o28 o28Var118 = new o28(i29);
                    int i3111111111111111 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                    int i3111111111111112 = i28 >> 6;
                    int i3111111111111113 = ((i28 >> 9) & 14) | (i3111111111111112 & 896);
                    int i3111111111111114 = i28 >> 3;
                    int i4117 = i29;
                    u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var118, 0L, i30, false, i31, i3111111111111110, gn2Var, o88Var8, lp2Var, i3111111111111111, i3111111111111113 | (57344 & i3111111111111114) | (i3111111111111114 & 458752) | (3670016 & i3111111111111112), 11252);
                    kx4Var3 = kx4Var4;
                    i24 = i30;
                    i25 = i31;
                    i26 = i3111111111111110;
                    gn2Var2 = gn2Var;
                    z3 = z5;
                    o88Var3 = o88Var4;
                    i27 = i4117;
                } else {
                    lp2Var.Q();
                    z3 = z;
                    gn2Var2 = gn2Var;
                    kx4Var3 = kx4Var2;
                    o88Var3 = o88Var2;
                    i24 = i12;
                    i25 = i15;
                    i26 = i18;
                    i27 = i10;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: zy2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                            return dn8.a;
                        }
                    };
                }
            }
            i7 |= 100663296;
            if ((i7 & 38347923) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (lp2Var.N(i7 & 1, z2)) {
                lp2Var.S();
                if ((i5 & 1) != 0) {
                    if (i33 != 0) {
                        kx4Var2 = hx4.X;
                    }
                    if (i8 != 0) {
                        o88Var2 = null;
                    }
                    if ((i6 & 8) != 0) {
                        i7 &= -7169;
                        i10 = 5;
                    }
                    if (i11 != 0) {
                        i12 = 2;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i17 != 0) {
                        i18 = 1;
                    }
                    if (i20 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i22 != 0) {
                        z5 = z4;
                        i28 = i7;
                        kx4Var4 = kx4Var2;
                        i29 = i10;
                        i30 = i12;
                        i31 = i15;
                        gn2Var = null;
                    } else {
                        z5 = z4;
                        i28 = i7;
                        kx4Var4 = kx4Var2;
                        i29 = i10;
                        i30 = i12;
                        i31 = i15;
                    }
                } else {
                    if (i33 != 0) {
                        kx4Var2 = hx4.X;
                    }
                    if (i8 != 0) {
                        o88Var2 = null;
                    }
                    if ((i6 & 8) != 0) {
                        i7 &= -7169;
                        i10 = 5;
                    }
                    if (i11 != 0) {
                        i12 = 2;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i17 != 0) {
                        i18 = 1;
                    }
                    if (i20 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i22 != 0) {
                        z5 = z4;
                        i28 = i7;
                        kx4Var4 = kx4Var2;
                        i29 = i10;
                        i30 = i12;
                        i31 = i15;
                        gn2Var = null;
                    } else {
                        z5 = z4;
                        i28 = i7;
                        kx4Var4 = kx4Var2;
                        i29 = i10;
                        i30 = i12;
                        i31 = i15;
                    }
                }
                int i3111111111111115 = i18;
                o88Var4 = o88Var2;
                lp2Var.q();
                objK = lp2Var.K();
                obj = zz0.a;
                if (objK == obj) {
                    kw4 kw4Var119 = kw4.a;
                    int iE119 = kw4.l().e(-1, "pref_font_size");
                    aj2.X.getClass();
                    objK = k32.g(iE119);
                    lp2Var.g0(objK);
                }
                aj2Var = (aj2) objK;
                o88Var5 = (o88) lp2Var.j(u78.a);
                j = ((dw0) lp2Var.j(j41.a)).a;
                zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                objK2 = lp2Var.K();
                if (zF) {
                    jB = o88Var5.b();
                    if (jB != 16) {
                        j2 = jB;
                    } else {
                        j2 = j;
                    }
                    objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                    lp2Var.g0(objK2);
                } else {
                    jB = o88Var5.b();
                    if (jB != 16) {
                        j2 = jB;
                    } else {
                        j2 = j;
                    }
                    objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                    lp2Var.g0(objK2);
                }
                o88Var6 = (o88) objK2;
                if ((i28 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zF2 = z6 | lp2Var.f(o88Var6);
                objK3 = lp2Var.K();
                if (zF2) {
                    objK3 = o88Var6.d(o88Var4);
                    lp2Var.g0(objK3);
                } else {
                    objK3 = o88Var6.d(o88Var4);
                    lp2Var.g0(objK3);
                }
                o88Var7 = (o88) objK3;
                zF3 = lp2Var.f(o88Var7);
                objK4 = lp2Var.K();
                if (zF3) {
                    float fC111116 = v88.c(o88Var7.a.b);
                    iOrdinal = aj2Var.ordinal();
                    if (iOrdinal == 0) {
                        i32 = -2;
                    } else if (iOrdinal != 1) {
                        i32 = 2;
                        if (iOrdinal != 2) {
                            b61.c();
                            return;
                        }
                    } else {
                        i32 = 0;
                    }
                    objK4 = o88.a(o88Var7, 0L, eu7.i(fC111116 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                    lp2Var.g0(objK4);
                } else {
                    float fC111117 = v88.c(o88Var7.a.b);
                    iOrdinal = aj2Var.ordinal();
                    if (iOrdinal == 0) {
                        i32 = -2;
                    } else if (iOrdinal != 1) {
                        i32 = 2;
                        if (iOrdinal != 2) {
                            b61.c();
                            return;
                        }
                    } else {
                        i32 = 0;
                    }
                    objK4 = o88.a(o88Var7, 0L, eu7.i(fC111117 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                    lp2Var.g0(objK4);
                }
                o88Var8 = (o88) objK4;
                if (z5) {
                    mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                } else {
                    mxVar = null;
                }
                o28 o28Var119 = new o28(i29);
                int i3111111111111116 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                int i3111111111111117 = i28 >> 6;
                int i3111111111111118 = ((i28 >> 9) & 14) | (i3111111111111117 & 896);
                int i3111111111111119 = i28 >> 3;
                int i4118 = i29;
                u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var119, 0L, i30, false, i31, i3111111111111115, gn2Var, o88Var8, lp2Var, i3111111111111116, i3111111111111118 | (57344 & i3111111111111119) | (i3111111111111119 & 458752) | (3670016 & i3111111111111117), 11252);
                kx4Var3 = kx4Var4;
                i24 = i30;
                i25 = i31;
                i26 = i3111111111111115;
                gn2Var2 = gn2Var;
                z3 = z5;
                o88Var3 = o88Var4;
                i27 = i4118;
            } else {
                lp2Var.Q();
                z3 = z;
                gn2Var2 = gn2Var;
                kx4Var3 = kx4Var2;
                o88Var3 = o88Var2;
                i24 = i12;
                i25 = i15;
                i26 = i18;
                i27 = i10;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: zy2
                    @Override // defpackage.rn2
                    public final Object K(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                        return dn8.a;
                    }
                };
            }
        }
        i7 |= 24576;
        i12 = i2;
        i14 = i6 & 32;
        if (i14 != 0) {
            if ((196608 & i5) == 0) {
                i15 = i3;
                if (lp2Var.d(i15)) {
                    i16 = 131072;
                } else {
                    i16 = DnsOverHttps.MAX_RESPONSE_SIZE;
                }
                i7 |= i16;
            }
            i17 = i6 & 64;
            if (i17 != 0) {
                i7 |= 1572864;
                i18 = i4;
            } else {
                i18 = i4;
                if ((i5 & 1572864) == 0) {
                    if (lp2Var.d(i18)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i7 |= i19;
                }
            }
            i20 = i6 & 128;
            if (i20 != 0) {
                i7 |= 12582912;
            } else if ((i5 & 12582912) == 0) {
                if (lp2Var.g(z)) {
                    i21 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                } else {
                    i21 = 4194304;
                }
                i7 |= i21;
            }
            i22 = i6 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i22 != 0) {
                if ((i5 & 100663296) == 0) {
                    if (lp2Var.h(gn2Var)) {
                        i23 = 67108864;
                    } else {
                        i23 = 33554432;
                    }
                    i7 |= i23;
                }
                if ((i7 & 38347923) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (lp2Var.N(i7 & 1, z2)) {
                    lp2Var.S();
                    if ((i5 & 1) != 0) {
                        if (i33 != 0) {
                            kx4Var2 = hx4.X;
                        }
                        if (i8 != 0) {
                            o88Var2 = null;
                        }
                        if ((i6 & 8) != 0) {
                            i7 &= -7169;
                            i10 = 5;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i17 != 0) {
                            i18 = 1;
                        }
                        if (i20 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i22 != 0) {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                            gn2Var = null;
                        } else {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                        }
                    } else {
                        if (i33 != 0) {
                            kx4Var2 = hx4.X;
                        }
                        if (i8 != 0) {
                            o88Var2 = null;
                        }
                        if ((i6 & 8) != 0) {
                            i7 &= -7169;
                            i10 = 5;
                        }
                        if (i11 != 0) {
                            i12 = 2;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i17 != 0) {
                            i18 = 1;
                        }
                        if (i20 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i22 != 0) {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                            gn2Var = null;
                        } else {
                            z5 = z4;
                            i28 = i7;
                            kx4Var4 = kx4Var2;
                            i29 = i10;
                            i30 = i12;
                            i31 = i15;
                        }
                    }
                    int i31111111111111110 = i18;
                    o88Var4 = o88Var2;
                    lp2Var.q();
                    objK = lp2Var.K();
                    obj = zz0.a;
                    if (objK == obj) {
                        kw4 kw4Var1110 = kw4.a;
                        int iE1110 = kw4.l().e(-1, "pref_font_size");
                        aj2.X.getClass();
                        objK = k32.g(iE1110);
                        lp2Var.g0(objK);
                    }
                    aj2Var = (aj2) objK;
                    o88Var5 = (o88) lp2Var.j(u78.a);
                    j = ((dw0) lp2Var.j(j41.a)).a;
                    zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                    objK2 = lp2Var.K();
                    if (zF) {
                        jB = o88Var5.b();
                        if (jB != 16) {
                            j2 = jB;
                        } else {
                            j2 = j;
                        }
                        objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                        lp2Var.g0(objK2);
                    } else {
                        jB = o88Var5.b();
                        if (jB != 16) {
                            j2 = jB;
                        } else {
                            j2 = j;
                        }
                        objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                        lp2Var.g0(objK2);
                    }
                    o88Var6 = (o88) objK2;
                    if ((i28 & 896) == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    zF2 = z6 | lp2Var.f(o88Var6);
                    objK3 = lp2Var.K();
                    if (zF2) {
                        objK3 = o88Var6.d(o88Var4);
                        lp2Var.g0(objK3);
                    } else {
                        objK3 = o88Var6.d(o88Var4);
                        lp2Var.g0(objK3);
                    }
                    o88Var7 = (o88) objK3;
                    zF3 = lp2Var.f(o88Var7);
                    objK4 = lp2Var.K();
                    if (zF3) {
                        float fC111118 = v88.c(o88Var7.a.b);
                        iOrdinal = aj2Var.ordinal();
                        if (iOrdinal == 0) {
                            i32 = -2;
                        } else if (iOrdinal != 1) {
                            i32 = 2;
                            if (iOrdinal != 2) {
                                b61.c();
                                return;
                            }
                        } else {
                            i32 = 0;
                        }
                        objK4 = o88.a(o88Var7, 0L, eu7.i(fC111118 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                        lp2Var.g0(objK4);
                    } else {
                        float fC111119 = v88.c(o88Var7.a.b);
                        iOrdinal = aj2Var.ordinal();
                        if (iOrdinal == 0) {
                            i32 = -2;
                        } else if (iOrdinal != 1) {
                            i32 = 2;
                            if (iOrdinal != 2) {
                                b61.c();
                                return;
                            }
                        } else {
                            i32 = 0;
                        }
                        objK4 = o88.a(o88Var7, 0L, eu7.i(fC111119 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                        lp2Var.g0(objK4);
                    }
                    o88Var8 = (o88) objK4;
                    if (z5) {
                        mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                    } else {
                        mxVar = null;
                    }
                    o28 o28Var1110 = new o28(i29);
                    int i31111111111111111 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                    int i31111111111111112 = i28 >> 6;
                    int i31111111111111113 = ((i28 >> 9) & 14) | (i31111111111111112 & 896);
                    int i31111111111111114 = i28 >> 3;
                    int i4119 = i29;
                    u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var1110, 0L, i30, false, i31, i31111111111111110, gn2Var, o88Var8, lp2Var, i31111111111111111, i31111111111111113 | (57344 & i31111111111111114) | (i31111111111111114 & 458752) | (3670016 & i31111111111111112), 11252);
                    kx4Var3 = kx4Var4;
                    i24 = i30;
                    i25 = i31;
                    i26 = i31111111111111110;
                    gn2Var2 = gn2Var;
                    z3 = z5;
                    o88Var3 = o88Var4;
                    i27 = i4119;
                } else {
                    lp2Var.Q();
                    z3 = z;
                    gn2Var2 = gn2Var;
                    kx4Var3 = kx4Var2;
                    o88Var3 = o88Var2;
                    i24 = i12;
                    i25 = i15;
                    i26 = i18;
                    i27 = i10;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: zy2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                            return dn8.a;
                        }
                    };
                }
            }
            i7 |= 100663296;
            if ((i7 & 38347923) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (lp2Var.N(i7 & 1, z2)) {
                lp2Var.S();
                if ((i5 & 1) != 0) {
                    if (i33 != 0) {
                        kx4Var2 = hx4.X;
                    }
                    if (i8 != 0) {
                        o88Var2 = null;
                    }
                    if ((i6 & 8) != 0) {
                        i7 &= -7169;
                        i10 = 5;
                    }
                    if (i11 != 0) {
                        i12 = 2;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i17 != 0) {
                        i18 = 1;
                    }
                    if (i20 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i22 != 0) {
                        z5 = z4;
                        i28 = i7;
                        kx4Var4 = kx4Var2;
                        i29 = i10;
                        i30 = i12;
                        i31 = i15;
                        gn2Var = null;
                    } else {
                        z5 = z4;
                        i28 = i7;
                        kx4Var4 = kx4Var2;
                        i29 = i10;
                        i30 = i12;
                        i31 = i15;
                    }
                } else {
                    if (i33 != 0) {
                        kx4Var2 = hx4.X;
                    }
                    if (i8 != 0) {
                        o88Var2 = null;
                    }
                    if ((i6 & 8) != 0) {
                        i7 &= -7169;
                        i10 = 5;
                    }
                    if (i11 != 0) {
                        i12 = 2;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i17 != 0) {
                        i18 = 1;
                    }
                    if (i20 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i22 != 0) {
                        z5 = z4;
                        i28 = i7;
                        kx4Var4 = kx4Var2;
                        i29 = i10;
                        i30 = i12;
                        i31 = i15;
                        gn2Var = null;
                    } else {
                        z5 = z4;
                        i28 = i7;
                        kx4Var4 = kx4Var2;
                        i29 = i10;
                        i30 = i12;
                        i31 = i15;
                    }
                }
                int i31111111111111115 = i18;
                o88Var4 = o88Var2;
                lp2Var.q();
                objK = lp2Var.K();
                obj = zz0.a;
                if (objK == obj) {
                    kw4 kw4Var1111 = kw4.a;
                    int iE1111 = kw4.l().e(-1, "pref_font_size");
                    aj2.X.getClass();
                    objK = k32.g(iE1111);
                    lp2Var.g0(objK);
                }
                aj2Var = (aj2) objK;
                o88Var5 = (o88) lp2Var.j(u78.a);
                j = ((dw0) lp2Var.j(j41.a)).a;
                zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                objK2 = lp2Var.K();
                if (zF) {
                    jB = o88Var5.b();
                    if (jB != 16) {
                        j2 = jB;
                    } else {
                        j2 = j;
                    }
                    objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                    lp2Var.g0(objK2);
                } else {
                    jB = o88Var5.b();
                    if (jB != 16) {
                        j2 = jB;
                    } else {
                        j2 = j;
                    }
                    objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                    lp2Var.g0(objK2);
                }
                o88Var6 = (o88) objK2;
                if ((i28 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zF2 = z6 | lp2Var.f(o88Var6);
                objK3 = lp2Var.K();
                if (zF2) {
                    objK3 = o88Var6.d(o88Var4);
                    lp2Var.g0(objK3);
                } else {
                    objK3 = o88Var6.d(o88Var4);
                    lp2Var.g0(objK3);
                }
                o88Var7 = (o88) objK3;
                zF3 = lp2Var.f(o88Var7);
                objK4 = lp2Var.K();
                if (zF3) {
                    float fC1111110 = v88.c(o88Var7.a.b);
                    iOrdinal = aj2Var.ordinal();
                    if (iOrdinal == 0) {
                        i32 = -2;
                    } else if (iOrdinal != 1) {
                        i32 = 2;
                        if (iOrdinal != 2) {
                            b61.c();
                            return;
                        }
                    } else {
                        i32 = 0;
                    }
                    objK4 = o88.a(o88Var7, 0L, eu7.i(fC1111110 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                    lp2Var.g0(objK4);
                } else {
                    float fC1111111 = v88.c(o88Var7.a.b);
                    iOrdinal = aj2Var.ordinal();
                    if (iOrdinal == 0) {
                        i32 = -2;
                    } else if (iOrdinal != 1) {
                        i32 = 2;
                        if (iOrdinal != 2) {
                            b61.c();
                            return;
                        }
                    } else {
                        i32 = 0;
                    }
                    objK4 = o88.a(o88Var7, 0L, eu7.i(fC1111111 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                    lp2Var.g0(objK4);
                }
                o88Var8 = (o88) objK4;
                if (z5) {
                    mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                } else {
                    mxVar = null;
                }
                o28 o28Var1111 = new o28(i29);
                int i31111111111111116 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                int i31111111111111117 = i28 >> 6;
                int i31111111111111118 = ((i28 >> 9) & 14) | (i31111111111111117 & 896);
                int i31111111111111119 = i28 >> 3;
                int i41110 = i29;
                u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var1111, 0L, i30, false, i31, i31111111111111115, gn2Var, o88Var8, lp2Var, i31111111111111116, i31111111111111118 | (57344 & i31111111111111119) | (i31111111111111119 & 458752) | (3670016 & i31111111111111117), 11252);
                kx4Var3 = kx4Var4;
                i24 = i30;
                i25 = i31;
                i26 = i31111111111111115;
                gn2Var2 = gn2Var;
                z3 = z5;
                o88Var3 = o88Var4;
                i27 = i41110;
            } else {
                lp2Var.Q();
                z3 = z;
                gn2Var2 = gn2Var;
                kx4Var3 = kx4Var2;
                o88Var3 = o88Var2;
                i24 = i12;
                i25 = i15;
                i26 = i18;
                i27 = i10;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: zy2
                    @Override // defpackage.rn2
                    public final Object K(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                        return dn8.a;
                    }
                };
            }
        }
        i7 |= 196608;
        i15 = i3;
        i17 = i6 & 64;
        if (i17 != 0) {
            i7 |= 1572864;
            i18 = i4;
        } else {
            i18 = i4;
            if ((i5 & 1572864) == 0) {
                if (lp2Var.d(i18)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i7 |= i19;
            }
        }
        i20 = i6 & 128;
        if (i20 != 0) {
            i7 |= 12582912;
        } else if ((i5 & 12582912) == 0) {
            if (lp2Var.g(z)) {
                i21 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
            } else {
                i21 = 4194304;
            }
            i7 |= i21;
        }
        i22 = i6 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i22 != 0) {
            if ((i5 & 100663296) == 0) {
                if (lp2Var.h(gn2Var)) {
                    i23 = 67108864;
                } else {
                    i23 = 33554432;
                }
                i7 |= i23;
            }
            if ((i7 & 38347923) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (lp2Var.N(i7 & 1, z2)) {
                lp2Var.S();
                if ((i5 & 1) != 0) {
                    if (i33 != 0) {
                        kx4Var2 = hx4.X;
                    }
                    if (i8 != 0) {
                        o88Var2 = null;
                    }
                    if ((i6 & 8) != 0) {
                        i7 &= -7169;
                        i10 = 5;
                    }
                    if (i11 != 0) {
                        i12 = 2;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i17 != 0) {
                        i18 = 1;
                    }
                    if (i20 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i22 != 0) {
                        z5 = z4;
                        i28 = i7;
                        kx4Var4 = kx4Var2;
                        i29 = i10;
                        i30 = i12;
                        i31 = i15;
                        gn2Var = null;
                    } else {
                        z5 = z4;
                        i28 = i7;
                        kx4Var4 = kx4Var2;
                        i29 = i10;
                        i30 = i12;
                        i31 = i15;
                    }
                } else {
                    if (i33 != 0) {
                        kx4Var2 = hx4.X;
                    }
                    if (i8 != 0) {
                        o88Var2 = null;
                    }
                    if ((i6 & 8) != 0) {
                        i7 &= -7169;
                        i10 = 5;
                    }
                    if (i11 != 0) {
                        i12 = 2;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i17 != 0) {
                        i18 = 1;
                    }
                    if (i20 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i22 != 0) {
                        z5 = z4;
                        i28 = i7;
                        kx4Var4 = kx4Var2;
                        i29 = i10;
                        i30 = i12;
                        i31 = i15;
                        gn2Var = null;
                    } else {
                        z5 = z4;
                        i28 = i7;
                        kx4Var4 = kx4Var2;
                        i29 = i10;
                        i30 = i12;
                        i31 = i15;
                    }
                }
                int i311111111111111110 = i18;
                o88Var4 = o88Var2;
                lp2Var.q();
                objK = lp2Var.K();
                obj = zz0.a;
                if (objK == obj) {
                    kw4 kw4Var1112 = kw4.a;
                    int iE1112 = kw4.l().e(-1, "pref_font_size");
                    aj2.X.getClass();
                    objK = k32.g(iE1112);
                    lp2Var.g0(objK);
                }
                aj2Var = (aj2) objK;
                o88Var5 = (o88) lp2Var.j(u78.a);
                j = ((dw0) lp2Var.j(j41.a)).a;
                zF = lp2Var.f(o88Var5) | lp2Var.e(j);
                objK2 = lp2Var.K();
                if (zF) {
                    jB = o88Var5.b();
                    if (jB != 16) {
                        j2 = jB;
                    } else {
                        j2 = j;
                    }
                    objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                    lp2Var.g0(objK2);
                } else {
                    jB = o88Var5.b();
                    if (jB != 16) {
                        j2 = jB;
                    } else {
                        j2 = j;
                    }
                    objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                    lp2Var.g0(objK2);
                }
                o88Var6 = (o88) objK2;
                if ((i28 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zF2 = z6 | lp2Var.f(o88Var6);
                objK3 = lp2Var.K();
                if (zF2) {
                    objK3 = o88Var6.d(o88Var4);
                    lp2Var.g0(objK3);
                } else {
                    objK3 = o88Var6.d(o88Var4);
                    lp2Var.g0(objK3);
                }
                o88Var7 = (o88) objK3;
                zF3 = lp2Var.f(o88Var7);
                objK4 = lp2Var.K();
                if (zF3) {
                    float fC1111112 = v88.c(o88Var7.a.b);
                    iOrdinal = aj2Var.ordinal();
                    if (iOrdinal == 0) {
                        i32 = -2;
                    } else if (iOrdinal != 1) {
                        i32 = 2;
                        if (iOrdinal != 2) {
                            b61.c();
                            return;
                        }
                    } else {
                        i32 = 0;
                    }
                    objK4 = o88.a(o88Var7, 0L, eu7.i(fC1111112 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                    lp2Var.g0(objK4);
                } else {
                    float fC1111113 = v88.c(o88Var7.a.b);
                    iOrdinal = aj2Var.ordinal();
                    if (iOrdinal == 0) {
                        i32 = -2;
                    } else if (iOrdinal != 1) {
                        i32 = 2;
                        if (iOrdinal != 2) {
                            b61.c();
                            return;
                        }
                    } else {
                        i32 = 0;
                    }
                    objK4 = o88.a(o88Var7, 0L, eu7.i(fC1111113 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                    lp2Var.g0(objK4);
                }
                o88Var8 = (o88) objK4;
                if (z5) {
                    mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
                } else {
                    mxVar = null;
                }
                o28 o28Var1112 = new o28(i29);
                int i311111111111111111 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
                int i311111111111111112 = i28 >> 6;
                int i311111111111111113 = ((i28 >> 9) & 14) | (i311111111111111112 & 896);
                int i311111111111111114 = i28 >> 3;
                int i41111 = i29;
                u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var1112, 0L, i30, false, i31, i311111111111111110, gn2Var, o88Var8, lp2Var, i311111111111111111, i311111111111111113 | (57344 & i311111111111111114) | (i311111111111111114 & 458752) | (3670016 & i311111111111111112), 11252);
                kx4Var3 = kx4Var4;
                i24 = i30;
                i25 = i31;
                i26 = i311111111111111110;
                gn2Var2 = gn2Var;
                z3 = z5;
                o88Var3 = o88Var4;
                i27 = i41111;
            } else {
                lp2Var.Q();
                z3 = z;
                gn2Var2 = gn2Var;
                kx4Var3 = kx4Var2;
                o88Var3 = o88Var2;
                i24 = i12;
                i25 = i15;
                i26 = i18;
                i27 = i10;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: zy2
                    @Override // defpackage.rn2
                    public final Object K(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                        return dn8.a;
                    }
                };
            }
        }
        i7 |= 100663296;
        if ((i7 & 38347923) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (lp2Var.N(i7 & 1, z2)) {
            lp2Var.S();
            if ((i5 & 1) != 0) {
                if (i33 != 0) {
                    kx4Var2 = hx4.X;
                }
                if (i8 != 0) {
                    o88Var2 = null;
                }
                if ((i6 & 8) != 0) {
                    i7 &= -7169;
                    i10 = 5;
                }
                if (i11 != 0) {
                    i12 = 2;
                }
                if (i14 != 0) {
                    i15 = Integer.MAX_VALUE;
                }
                if (i17 != 0) {
                    i18 = 1;
                }
                if (i20 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i22 != 0) {
                    z5 = z4;
                    i28 = i7;
                    kx4Var4 = kx4Var2;
                    i29 = i10;
                    i30 = i12;
                    i31 = i15;
                    gn2Var = null;
                } else {
                    z5 = z4;
                    i28 = i7;
                    kx4Var4 = kx4Var2;
                    i29 = i10;
                    i30 = i12;
                    i31 = i15;
                }
            } else {
                if (i33 != 0) {
                    kx4Var2 = hx4.X;
                }
                if (i8 != 0) {
                    o88Var2 = null;
                }
                if ((i6 & 8) != 0) {
                    i7 &= -7169;
                    i10 = 5;
                }
                if (i11 != 0) {
                    i12 = 2;
                }
                if (i14 != 0) {
                    i15 = Integer.MAX_VALUE;
                }
                if (i17 != 0) {
                    i18 = 1;
                }
                if (i20 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i22 != 0) {
                    z5 = z4;
                    i28 = i7;
                    kx4Var4 = kx4Var2;
                    i29 = i10;
                    i30 = i12;
                    i31 = i15;
                    gn2Var = null;
                } else {
                    z5 = z4;
                    i28 = i7;
                    kx4Var4 = kx4Var2;
                    i29 = i10;
                    i30 = i12;
                    i31 = i15;
                }
            }
            int i311111111111111115 = i18;
            o88Var4 = o88Var2;
            lp2Var.q();
            objK = lp2Var.K();
            obj = zz0.a;
            if (objK == obj) {
                kw4 kw4Var1113 = kw4.a;
                int iE1113 = kw4.l().e(-1, "pref_font_size");
                aj2.X.getClass();
                objK = k32.g(iE1113);
                lp2Var.g0(objK);
            }
            aj2Var = (aj2) objK;
            o88Var5 = (o88) lp2Var.j(u78.a);
            j = ((dw0) lp2Var.j(j41.a)).a;
            zF = lp2Var.f(o88Var5) | lp2Var.e(j);
            objK2 = lp2Var.K();
            if (zF) {
                jB = o88Var5.b();
                if (jB != 16) {
                    j2 = jB;
                } else {
                    j2 = j;
                }
                objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                lp2Var.g0(objK2);
            } else {
                jB = o88Var5.b();
                if (jB != 16) {
                    j2 = jB;
                } else {
                    j2 = j;
                }
                objK2 = o88.a(o88Var5, j2, 0L, null, null, 0L, 0L, null, 16777214);
                lp2Var.g0(objK2);
            }
            o88Var6 = (o88) objK2;
            if ((i28 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            zF2 = z6 | lp2Var.f(o88Var6);
            objK3 = lp2Var.K();
            if (zF2) {
                objK3 = o88Var6.d(o88Var4);
                lp2Var.g0(objK3);
            } else {
                objK3 = o88Var6.d(o88Var4);
                lp2Var.g0(objK3);
            }
            o88Var7 = (o88) objK3;
            zF3 = lp2Var.f(o88Var7);
            objK4 = lp2Var.K();
            if (zF3) {
                float fC1111114 = v88.c(o88Var7.a.b);
                iOrdinal = aj2Var.ordinal();
                if (iOrdinal == 0) {
                    i32 = -2;
                } else if (iOrdinal != 1) {
                    i32 = 2;
                    if (iOrdinal != 2) {
                        b61.c();
                        return;
                    }
                } else {
                    i32 = 0;
                }
                objK4 = o88.a(o88Var7, 0L, eu7.i(fC1111114 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                lp2Var.g0(objK4);
            } else {
                float fC1111115 = v88.c(o88Var7.a.b);
                iOrdinal = aj2Var.ordinal();
                if (iOrdinal == 0) {
                    i32 = -2;
                } else if (iOrdinal != 1) {
                    i32 = 2;
                    if (iOrdinal != 2) {
                        b61.c();
                        return;
                    }
                } else {
                    i32 = 0;
                }
                objK4 = o88.a(o88Var7, 0L, eu7.i(fC1111115 + i32, 4294967296L), null, null, 0L, 0L, null, 16777213);
                lp2Var.g0(objK4);
            }
            o88Var8 = (o88) objK4;
            if (z5) {
                mxVar = new mx(eu7.g(8), o88Var8.a.b, eu7.f(0.25d));
            } else {
                mxVar = null;
            }
            o28 o28Var1113 = new o28(i29);
            int i311111111111111116 = i28 & WebSocketProtocol.PAYLOAD_SHORT;
            int i311111111111111117 = i28 >> 6;
            int i311111111111111118 = ((i28 >> 9) & 14) | (i311111111111111117 & 896);
            int i311111111111111119 = i28 >> 3;
            int i41112 = i29;
            u78.b(str, kx4Var4, 0L, mxVar, 0L, 0L, o28Var1113, 0L, i30, false, i31, i311111111111111115, gn2Var, o88Var8, lp2Var, i311111111111111116, i311111111111111118 | (57344 & i311111111111111119) | (i311111111111111119 & 458752) | (3670016 & i311111111111111117), 11252);
            kx4Var3 = kx4Var4;
            i24 = i30;
            i25 = i31;
            i26 = i311111111111111115;
            gn2Var2 = gn2Var;
            z3 = z5;
            o88Var3 = o88Var4;
            i27 = i41112;
        } else {
            lp2Var.Q();
            z3 = z;
            gn2Var2 = gn2Var;
            kx4Var3 = kx4Var2;
            o88Var3 = o88Var2;
            i24 = i12;
            i25 = i15;
            i26 = i18;
            i27 = i10;
        }
        j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: zy2
                @Override // defpackage.rn2
                public final Object K(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    zc1.g(str, kx4Var3, o88Var3, i27, i24, i25, i26, z3, gn2Var2, (lp2) obj2, w79.P(i5 | 1), i6);
                    return dn8.a;
                }
            };
        }
    }

    public static void g0(int[] iArr, int i) {
        int i2 = iArr[9];
        long j = ((long) (((i2 >> 24) + i) * 19)) + ((long) iArr[0]);
        iArr[0] = ((int) j) & 67108863;
        long j2 = (j >> 26) + ((long) iArr[1]);
        iArr[1] = ((int) j2) & 67108863;
        long j3 = (j2 >> 26) + ((long) iArr[2]);
        iArr[2] = ((int) j3) & 33554431;
        long j4 = (j3 >> 25) + ((long) iArr[3]);
        iArr[3] = ((int) j4) & 67108863;
        long j5 = (j4 >> 26) + ((long) iArr[4]);
        iArr[4] = ((int) j5) & 33554431;
        long j6 = (j5 >> 25) + ((long) iArr[5]);
        iArr[5] = ((int) j6) & 67108863;
        long j7 = (j6 >> 26) + ((long) iArr[6]);
        iArr[6] = ((int) j7) & 67108863;
        long j8 = (j7 >> 26) + ((long) iArr[7]);
        iArr[7] = 33554431 & ((int) j8);
        long j9 = (j8 >> 25) + ((long) iArr[8]);
        iArr[8] = 67108863 & ((int) j9);
        iArr[9] = (16777215 & i2) + ((int) (j9 >> 26));
    }

    public static final void h(ep6 ep6Var, sq6 sq6Var, gw5 gw5Var, kx4 kx4Var, lp2 lp2Var, int i) {
        ep6Var.getClass();
        lp2Var.X(-692349946);
        y05 y05VarO = i21.o(ep6Var.f, lp2Var);
        boolean zH = lp2Var.h(ep6Var);
        Object objK = lp2Var.K();
        Object obj = zz0.a;
        if (zH || objK == obj) {
            Object al5Var = new al5(1, ep6Var, ep6.class, "onUiIntent", "onUiIntent(Lsu/happ/proxyutility/feature/routing/profile/RoutingProfileUiIntent;)V", 0, (byte) 7);
            lp2Var.g0(al5Var);
            objK = al5Var;
        }
        pv3 pv3Var = (pv3) objK;
        byte b2 = 2;
        o87 o87VarF = zw4.f(null, lp2Var, 6, 2);
        n84 n84Var = n84.ON_RESUME;
        boolean zF = lp2Var.f(pv3Var);
        Object objK2 = lp2Var.K();
        if (zF || objK2 == obj) {
            objK2 = new aa3(pv3Var, b2);
            lp2Var.g0(objK2);
        }
        yn0.i(n84Var, null, (dn2) objK2, lp2Var, 6);
        sx2.b(kx4Var, jm4.U(1842770761, new b1(pv3Var, (byte) 17), lp2Var), null, null, 0, 0L, null, jm4.U(-903494752, new df4(ep6Var, gw5Var, sq6Var, pv3Var, y05VarO, o87VarF, (byte) 3), lp2Var), lp2Var, 12582966);
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new j30(ep6Var, sq6Var, gw5Var, kx4Var, i, (byte) 9);
        }
    }

    public static final nc3 h0(int i, lp2 lp2Var) {
        Object objK = lp2Var.K();
        if (objK == zz0.a) {
            objK = new nc3();
            lp2Var.g0(objK);
        }
        nc3 nc3Var = (nc3) objK;
        nc3Var.a(0, lp2Var);
        return nc3Var;
    }

    public static final void i(sn6 sn6Var, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        lp2Var.X(525471437);
        int i2 = i | (lp2Var.f(sn6Var) ? 4 : 2) | (lp2Var.h(gn2Var) ? 32 : 16) | (lp2Var.f(kx4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var, 0);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4Var);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, tw0VarA);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
            pn7.l(lp2Var);
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            FillElement fillElement = b.a;
            w51.d(sn6Var, gn2Var, fillElement, lp2Var, (i2 & 14) | 384 | (i2 & 112));
            String strJ0 = vj8.j0(y46.settings_routing_profiles_description, lp2Var);
            ox1 ox1Var = hr.a;
            kx4 kx4VarW = os4.w(fillElement, ((gr) lp2Var.j(ox1Var)).a.d);
            sr srVar = ((gr) lp2Var.j(ox1Var)).a;
            vj8.g(strJ0, os4.A(kx4VarW, 0.0f, 8.0f, 0.0f, 0.0f, 13), lp2Var, 0);
            cm5 cm5Var = sn6Var.b;
            String str = sn6Var.c;
            String str2 = sn6Var.d;
            FillElement fillElement2 = b.c;
            sr srVar2 = ((gr) lp2Var.j(ox1Var)).a;
            z91.i(cm5Var, str, str2, gn2Var, os4.A(fillElement2, 0.0f, 24.0f, 0.0f, 0.0f, 13), lp2Var, (i2 << 6) & 7168);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new fh((Object) sn6Var, (Object) gn2Var, kx4Var, i, (byte) 17);
        }
    }

    public static final void i0(CopyOnWriteArrayList copyOnWriteArrayList, Collection collection) {
        copyOnWriteArrayList.getClass();
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.addAll(collection);
    }

    public static lw0 j(lw0 lw0Var) {
        h09 h09Var = w45.f;
        wl6 wl6Var = wl6.g0;
        if (z91.B(lw0Var.b, 12884901888L)) {
            wk6 wk6Var = (wk6) lw0Var;
            h09 h09Var2 = wk6Var.d;
            if (!s(h09Var2, h09Var)) {
                return new wk6(wk6Var.a, wk6Var.h, h09Var, b0(p((float[]) wl6Var.Y, h09Var2.a(), h09Var.a()), wk6Var.i), wk6Var.k, wk6Var.n, wk6Var.e, wk6Var.f, wk6Var.g, -1);
            }
        }
        return lw0Var;
    }

    public static void j0(mj0 mj0Var, float f2) {
        fm6 fm6Var = (fm6) mj0Var.Y;
        CardView cardView = (CardView) mj0Var.Z;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f2 != fm6Var.e || fm6Var.f != useCompatPadding || fm6Var.g != preventCornerOverlap) {
            fm6Var.e = f2;
            fm6Var.f = useCompatPadding;
            fm6Var.g = preventCornerOverlap;
            fm6Var.b(null);
            fm6Var.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            mj0Var.X(0, 0, 0, 0);
            return;
        }
        fm6 fm6Var2 = (fm6) mj0Var.Y;
        float f3 = fm6Var2.e;
        float f4 = fm6Var2.a;
        int iCeil = (int) Math.ceil(gm6.a(f3, f4, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(gm6.b(f3, f4, cardView.getPreventCornerOverlap()));
        mj0Var.X(iCeil, iCeil2, iCeil, iCeil2);
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    public static void k0(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        long j = i;
        long j2 = j * j;
        long j3 = i2 * 2;
        long j4 = j * j3;
        long j5 = i3 * 2;
        long j6 = j * j5;
        long j7 = i2;
        long j8 = (j7 * j7) + j6;
        long j9 = i4 * 2;
        long j10 = (j * j9) + (j3 * j5);
        long j11 = i5 * 2;
        long j12 = (j7 * j9) + (j * j11) + (((long) i3) * j5);
        long j13 = (j5 * j9) + (j3 * j11);
        long j14 = j5 * j11;
        long j15 = i4;
        long j16 = (j15 * j15) + j14;
        long j17 = j15 * j11;
        long j18 = i6;
        long j19 = j18 * j18;
        long j20 = i7 * 2;
        long j21 = j18 * j20;
        long j22 = i8 * 2;
        long j23 = j18 * j22;
        long j24 = i7;
        long j25 = (j24 * j24) + j23;
        long j26 = j20 * j22;
        long j27 = i9 * 2;
        long j28 = i10 * 2;
        long j29 = (j24 * j27) + (j18 * j28) + (((long) i8) * j22);
        long j30 = (j22 * j27) + (j20 * j28);
        long j31 = j22 * j28;
        long j32 = i9;
        long j33 = j2 - (j30 * 38);
        long j34 = j4 - (((j32 * j32) + j31) * 38);
        long j35 = j8 - ((j32 * j28) * 38);
        long j36 = j10 - ((((long) i10) * j28) * 38);
        long j37 = j13 - j19;
        long j38 = j16 - j21;
        long j39 = j17 - j25;
        long j40 = (((long) i5) * j11) - ((j18 * j27) + j26);
        int i11 = i2 + i7;
        int i12 = i3 + i8;
        int i13 = i4 + i9;
        int i14 = i5 + i10;
        long j41 = i + i6;
        long j42 = i11 * 2;
        long j43 = j41 * j42;
        long j44 = i12 * 2;
        long j45 = i11;
        long j46 = (j45 * j45) + (j41 * j44);
        long j47 = i13 * 2;
        long j48 = i14 * 2;
        long j49 = i13;
        long j50 = ((long) i14) * j48;
        long j51 = (((j41 * j47) + (j42 * j44)) - j36) + j40;
        int i15 = ((int) j51) & 67108863;
        long j52 = ((((j45 * j47) + ((j41 * j48) + (((long) i12) * j44))) - j12) - j29) + (j51 >> 26);
        int i16 = ((int) j52) & 33554431;
        long j53 = ((((j52 >> 25) + ((j47 * j44) + (j42 * j48))) - j37) * 38) + j33;
        iArr2[0] = ((int) j53) & 67108863;
        long j54 = ((((j49 * j49) + (j44 * j48)) - j38) * 38) + j34 + (j53 >> 26);
        iArr2[1] = ((int) j54) & 67108863;
        long j55 = (((j49 * j48) - j39) * 38) + j35 + (j54 >> 26);
        iArr2[2] = ((int) j55) & 33554431;
        long j56 = ((j50 - j40) * 38) + j36 + (j55 >> 25);
        iArr2[3] = ((int) j56) & 67108863;
        long jI = p61.i(j29, 38L, j12, j56 >> 26);
        iArr2[4] = ((int) jI) & 33554431;
        long j57 = ((j41 * j41) - j33) + j37 + (jI >> 25);
        iArr2[5] = ((int) j57) & 67108863;
        long j58 = (j43 - j34) + j38 + (j57 >> 26);
        iArr2[6] = ((int) j58) & 67108863;
        long j59 = (j46 - j35) + j39 + (j58 >> 26);
        iArr2[7] = ((int) j59) & 33554431;
        long j60 = (j59 >> 25) + ((long) i15);
        iArr2[8] = ((int) j60) & 67108863;
        iArr2[9] = i16 + ((int) (j60 >> 26));
    }

    public static final lc3 l(nc3 nc3Var, float f2, float f3, kc3 kc3Var, lp2 lp2Var, int i, int i2) {
        Float fValueOf = Float.valueOf(f2);
        Float fValueOf2 = Float.valueOf(f3);
        Object objK = lp2Var.K();
        be beVar = zz0.a;
        if (objK == beVar) {
            objK = new lc3(nc3Var, fValueOf, fValueOf2, kc3Var);
            lp2Var.g0(objK);
        }
        lc3 lc3Var = (lc3) objK;
        boolean zH = lp2Var.h(kc3Var);
        Object objK2 = lp2Var.K();
        if (zH || objK2 == beVar) {
            hd hdVar = new hd(fValueOf, lc3Var, fValueOf2, kc3Var, (byte) 3);
            lp2Var.g0(hdVar);
            objK2 = hdVar;
        }
        u70.q((dn2) objK2, lp2Var);
        boolean zH2 = lp2Var.h(nc3Var);
        Object objK3 = lp2Var.K();
        if (zH2 || objK3 == beVar) {
            objK3 = new zw2(nc3Var, lc3Var, (byte) 8);
            lp2Var.g0(objK3);
        }
        u70.a(lc3Var, (gn2) objK3, lp2Var);
        return lc3Var;
    }

    public static void l0(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] - iArr2[i];
        }
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            int i3 = iArr2[i];
            iArr3[i] = i2 + i3;
            iArr4[i] = i2 - i3;
        }
    }

    public static final r12 m0(ce8 ce8Var, gn2 gn2Var, Object obj, lp2 lp2Var) {
        lp2Var.U(-422486566, ce8Var);
        boolean zG = ce8Var.g();
        r12 r12Var = r12.Z;
        r12 r12Var2 = r12.Y;
        r12 r12Var3 = r12.X;
        if (zG) {
            lp2Var.W(-212166497);
            lp2Var.p(false);
            if (((Boolean) gn2Var.B(obj)).booleanValue()) {
                r12Var = r12Var2;
            } else if (!((Boolean) gn2Var.B(ce8Var.c())).booleanValue()) {
                r12Var = r12Var3;
            }
        } else {
            lp2Var.W(-211886815);
            Object objK = lp2Var.K();
            if (objK == zz0.a) {
                objK = z51.H(Boolean.FALSE);
                lp2Var.g0(objK);
            }
            y05 y05Var = (y05) objK;
            Object value = ce8Var.e.getValue();
            if (((Boolean) gn2Var.B(ce8Var.c())).booleanValue() || (value != null && ((Boolean) gn2Var.B(value)).booleanValue())) {
                y05Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) gn2Var.B(obj)).booleanValue()) {
                r12Var = r12Var2;
            } else if ((value != null && ((Boolean) gn2Var.B(value)).booleanValue()) || !((Boolean) y05Var.getValue()).booleanValue()) {
                r12Var = r12Var3;
            }
            lp2Var.p(false);
        }
        lp2Var.p(false);
        return r12Var;
    }

    public static final void n(StringBuilder sb, Class cls) {
        while (cls.isArray()) {
            sb.append("[");
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (cls.equals(Void.TYPE)) {
            sb.append("V");
            return;
        }
        if (cls.equals(Integer.TYPE)) {
            sb.append("I");
            return;
        }
        if (cls.equals(Long.TYPE)) {
            sb.append("J");
            return;
        }
        if (cls.equals(Short.TYPE)) {
            sb.append("S");
            return;
        }
        if (cls.equals(Byte.TYPE)) {
            sb.append("B");
            return;
        }
        if (cls.equals(Boolean.TYPE)) {
            sb.append("Z");
            return;
        }
        if (cls.equals(Character.TYPE)) {
            sb.append("C");
            return;
        }
        if (cls.equals(Float.TYPE)) {
            sb.append("F");
            return;
        }
        if (cls.equals(Double.TYPE)) {
            sb.append("D");
            return;
        }
        sb.append("L");
        String strReplace = cls.getName().replace('.', '/');
        strReplace.getClass();
        sb.append((CharSequence) strReplace);
        sb.append(";");
    }

    public static final String n0(q51 q51Var) {
        Object rj6Var;
        if (q51Var instanceof np1) {
            return ((np1) q51Var).toString();
        }
        try {
            rj6Var = q51Var + '@' + L(q51Var);
        } catch (Throwable th) {
            rj6Var = new rj6(th);
        }
        if (sj6.a(rj6Var) != null) {
            rj6Var = q51Var.getClass().getName() + '@' + L(q51Var);
        }
        return (String) rj6Var;
    }

    public static xe2 o(xe2 xe2Var, int i) {
        l90 l90Var;
        if (i < 0 && i != -2 && i != -1) {
            em7.c(pc6.j(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1) {
            i = 0;
            l90Var = l90.Y;
        } else {
            l90Var = l90.X;
        }
        int i2 = i;
        l90 l90Var2 = l90Var;
        return xe2Var instanceof wo2 ? wo2.c((wo2) xe2Var, null, i2, l90Var2, 1) : new np0(xe2Var, null, i2, l90Var2, 2);
    }

    public static final s86 o0(y24 y24Var) {
        s86 s86VarR = jm4.r(y24Var, true);
        long jP = y24Var.p(s86VarR.f());
        float f2 = s86VarR.c;
        float f3 = s86VarR.d;
        long jP2 = y24Var.p((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        return new s86(Float.intBitsToFloat((int) (jP >> 32)), Float.intBitsToFloat((int) (jP & 4294967295L)), Float.intBitsToFloat((int) (jP2 >> 32)), Float.intBitsToFloat((int) (jP2 & 4294967295L)));
    }

    public static final float[] p(float[] fArr, float[] fArr2, float[] fArr3) {
        c0(fArr, fArr2);
        c0(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrS = S(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return b0(fArrS, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static void q(int i, int i2, int[] iArr, int[] iArr2) {
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = iArr2[i3];
            iArr2[i3] = i4 ^ ((iArr[i2 + i3] ^ i4) & i);
        }
    }

    public static void r(int[] iArr, int i) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            iArr[i3] = (iArr[i3] ^ i2) - i2;
        }
    }

    public static final boolean s(h09 h09Var, h09 h09Var2) {
        if (h09Var == h09Var2) {
            return true;
        }
        return Math.abs(h09Var.a - h09Var2.a) < 0.001f && Math.abs(h09Var.b - h09Var2.b) < 0.001f;
    }

    public static final boolean t(long j, s86 s86Var) {
        float f2 = s86Var.a;
        float f3 = s86Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f2 > fIntBitsToFloat || fIntBitsToFloat > f3) {
            return false;
        }
        float f4 = s86Var.b;
        float f5 = s86Var.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f4 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f5;
    }

    public static void u(int i, int i2, int[] iArr, int[] iArr2) {
        for (int i3 = 0; i3 < 10; i3++) {
            iArr2[i2 + i3] = iArr[i + i3];
        }
    }

    public static final l21 v(lw0 lw0Var, lw0 lw0Var2) {
        if (lw0Var == lw0Var2) {
            return new j21(lw0Var, lw0Var, 1);
        }
        return (z91.B(lw0Var.b, 12884901888L) && z91.B(lw0Var2.b, 12884901888L)) ? new k21((wk6) lw0Var, (wk6) lw0Var2) : new l21(lw0Var, lw0Var2, 0);
    }

    public static void w(int i, int[] iArr, int[] iArr2) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = iArr[i3];
            int i5 = iArr2[i3];
            int i6 = (i4 ^ i5) & i2;
            iArr[i3] = i4 ^ i6;
            iArr2[i3] = i5 ^ i6;
        }
    }

    public static void x(int i, int i2, byte[] bArr, int[] iArr) {
        int iZ = z(i, bArr);
        int iZ2 = z(i + 4, bArr);
        int iZ3 = z(i + 8, bArr);
        int iZ4 = z(i + 12, bArr);
        iArr[i2] = iZ & 67108863;
        iArr[i2 + 1] = ((iZ >>> 26) | (iZ2 << 6)) & 67108863;
        iArr[i2 + 2] = ((iZ2 >>> 20) | (iZ3 << 12)) & 33554431;
        iArr[i2 + 3] = 67108863 & ((iZ4 << 19) | (iZ3 >>> 13));
        iArr[i2 + 4] = iZ4 >>> 7;
    }

    public static void y(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        iArr2[i2] = i3 & 67108863;
        iArr2[i2 + 1] = ((i3 >>> 26) | (i4 << 6)) & 67108863;
        iArr2[i2 + 2] = ((i4 >>> 20) | (i5 << 12)) & 33554431;
        iArr2[i2 + 3] = 67108863 & ((i6 << 19) | (i5 >>> 13));
        iArr2[i2 + 4] = i6 >>> 7;
    }

    public static int z(int i, byte[] bArr) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }
}

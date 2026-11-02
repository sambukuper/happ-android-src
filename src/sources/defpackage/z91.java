package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import io.sentry.c2;
import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.domain.routing.entity.RouteProfileId;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z91 {
    public static final zy0 a = new zy0(360970742, false, new dx0(12));
    public static final xd6 b = new xd6(new cw6(0), new zw5((byte) 21), 6);
    public static final ut8 c = new ut8(11);
    public static final ut8 d = new ut8(12);
    public static final ut8 e = new ut8(13);

    public static tx5 A(fx5 fx5Var, sm smVar, sm smVar2, boolean z, fl1 fl1Var, ke7 ke7Var) {
        if (smVar == null) {
            a(8);
            throw null;
        }
        if (smVar2 == null) {
            a(9);
            throw null;
        }
        if (fl1Var == null) {
            a(10);
            throw null;
        }
        if (ke7Var == null) {
            a(11);
            throw null;
        }
        tx5 tx5Var = new tx5(fx5Var, smVar, fx5Var.m(), fl1Var, z, false, false, 1, null, ke7Var);
        tx5Var.q0 = tx5.I0(tx5Var, fx5Var.c(), smVar2);
        return tx5Var;
    }

    public static final boolean B(long j, long j2) {
        return j == j2;
    }

    public static final kx4 C(kx4 kx4Var, gn2 gn2Var) {
        return kx4Var.y(new ih2(new kh2(gn2Var)));
    }

    public static final RotateAnimation E() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(2000L);
        rotateAnimation.setRepeatCount(-1);
        return rotateAnimation;
    }

    public static final List F(v15 v15Var) {
        String strB = v15Var.b();
        strB.getClass();
        fk2 fk2Var = js3.a;
        if (mm7.Z(strB, false, "get") || mm7.Z(strB, false, "is")) {
            v15 v15VarM = M(v15Var, "get", null, 12);
            if (v15VarM == null) {
                v15VarM = M(v15Var, "is", null, 8);
            }
            return i21.M(v15VarM);
        }
        if (mm7.Z(strB, false, "set")) {
            return eu.q0(new v15[]{M(v15Var, "set", null, 4), M(v15Var, "set", "is", 4)});
        }
        List list = (List) ua0.b.get(v15Var);
        return list == null ? d02.X : list;
    }

    public static final lf6 G(x78 x78Var, int i) {
        w78 w78Var = x78Var.a;
        bz4 bz4Var = x78Var.b;
        if (w78Var.a.Y.length() != 0) {
            int iC = bz4Var.c(i);
            if ((i != 0 && iC == bz4Var.c(i - 1)) || (i != w78Var.a.Y.length() && iC == bz4Var.c(i + 1))) {
                return x78Var.a(i);
            }
        }
        return x78Var.i(i);
    }

    public static final boolean I(t07 t07Var) {
        e17 e17Var = c17.s;
        s05 s05Var = t07Var.X;
        Object objG = s05Var.g(e17Var);
        if (objG == null) {
            objG = null;
        }
        if (dh3.f(objG, oy1.m0)) {
            return false;
        }
        return s05Var.b(s07.g) || s05Var.b(s07.h);
    }

    public static kx4 J(t25 t25Var) {
        return new w25(t25Var);
    }

    public static BigDecimal K(String str) {
        k(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static final Integer L(Object obj, Object[] objArr) {
        int iV0 = eu.v0(obj, objArr);
        Integer numValueOf = Integer.valueOf(iV0);
        if (iV0 != -1) {
            return numValueOf;
        }
        return null;
    }

    public static v15 M(v15 v15Var, String str, String str2, int i) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!v15Var.Y) {
            String strC = v15Var.c();
            if (mm7.Z(strC, false, str) && strC.length() != str.length() && ('a' > (cCharAt = strC.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return v15.e(str2.concat(fm7.x0(str, strC)));
                }
                if (!z) {
                    return v15Var;
                }
                String strX0 = fm7.x0(str, strC);
                if (strX0.length() != 0 && i21.J(0, strX0)) {
                    if (strX0.length() != 1 && i21.J(1, strX0)) {
                        Iterator it = new kf3(0, strX0.length() - 1, 1).iterator();
                        do {
                            jf3 jf3Var = (jf3) it;
                            if (!jf3Var.Z) {
                                next = null;
                                break;
                            }
                            next = jf3Var.next();
                        } while (i21.J(((Number) next).intValue(), strX0));
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            strX0 = i21.Y(strX0.substring(0, iIntValue)).concat(strX0.substring(iIntValue));
                        } else {
                            strX0 = i21.Y(strX0);
                        }
                    } else if (strX0.length() != 0 && 'A' <= (cCharAt2 = strX0.charAt(0)) && cCharAt2 < '[') {
                        strX0 = Character.toLowerCase(cCharAt2) + strX0.substring(1);
                    }
                }
                if (v15.f(strX0)) {
                    return v15.e(strX0);
                }
            }
        }
        return null;
    }

    public static ka0 N(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        kf3 kf3Var = new kf3(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(xv0.Z(kf3Var, 10));
        Iterator it = kf3Var.iterator();
        while (true) {
            jf3 jf3Var = (jf3) it;
            if (!jf3Var.Z) {
                int[] iArrX0 = wv0.X0(arrayList);
                int[] iArrCopyOf = Arrays.copyOf(iArrX0, iArrX0.length);
                return new ka0(Arrays.copyOf(iArrCopyOf, iArrCopyOf.length));
            }
            jf3Var.nextInt();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
    }

    public static final void O(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final String P(Object obj) {
        return pc6.p(obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName(), "@", String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)));
    }

    public static final String Q(Object[] objArr, int i, int i2, f2 f2Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == f2Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static String R(long j) {
        if (B(j, 12884901888L)) {
            return "Rgb";
        }
        if (B(j, 12884901889L)) {
            return "Xyz";
        }
        if (B(j, 12884901890L)) {
            return "Lab";
        }
        return B(j, 17179869187L) ? "Cmyk" : "Unknown";
    }

    public static final void S() {
        throw new UnsupportedOperationException();
    }

    public static final kx4 T(kx4 kx4Var, gn2 gn2Var) {
        return kx4Var.y(new m08(gn2Var));
    }

    public static ui8 U(ui8 ui8Var) {
        byte b2 = 0;
        if (!(ui8Var instanceof nb3)) {
            return new do0(ui8Var, b2);
        }
        nb3 nb3Var = (nb3) ui8Var;
        hi8[] hi8VarArr = nb3Var.b;
        ArrayList<qg5> arrayListN0 = eu.N0(nb3Var.c, hi8VarArr);
        ArrayList arrayList = new ArrayList(xv0.Z(arrayListN0, 10));
        for (qg5 qg5Var : arrayListN0) {
            arrayList.add(q((ni8) qg5Var.X, (hi8) qg5Var.Y));
        }
        return new nb3(hi8VarArr, (ni8[]) arrayList.toArray(new ni8[0]), true);
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
            case 29:
                objArr[0] = "descriptor";
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static final void b(ce8 ce8Var, kx4 kx4Var, gn2 gn2Var, gn2 gn2Var2, zy0 zy0Var, lp2 lp2Var, int i) {
        int i2;
        p50 p50Var = pz2.Z;
        lp2Var.X(511725103);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(ce8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.f(kx4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.h(gn2Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= lp2Var.f(p50Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= lp2Var.h(gn2Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= lp2Var.h(zy0Var) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        if (lp2Var.N(i2 & 1, (74899 & i2) != 74898)) {
            Object objK = lp2Var.K();
            if (objK == zz0.a) {
                objK = ti.Z;
                lp2Var.g0(objK);
            }
            d(ce8Var, kx4Var, gn2Var, gn2Var2, (gn2) objK, zy0Var, lp2Var, 196608 | (i2 & 14) | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | ((i2 << 3) & 3670016));
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new ui(ce8Var, kx4Var, gn2Var, gn2Var2, zy0Var, i, (byte) 0);
        }
    }

    public static final void c(Object obj, kx4 kx4Var, gn2 gn2Var, q8 q8Var, String str, gn2 gn2Var2, zy0 zy0Var, lp2 lp2Var, int i) {
        q8 q8Var2;
        lp2Var.X(1501828832);
        int i2 = i | (lp2Var.f(obj) ? 4 : 2) | 3072;
        if (lp2Var.N(i2 & 1, (599187 & i2) != 599186)) {
            p50 p50Var = pz2.Z;
            b(rq7.o(obj, str, lp2Var, (i2 & 14) | 48), kx4Var, gn2Var, gn2Var2, zy0Var, lp2Var, 224688);
            q8Var2 = p50Var;
        } else {
            lp2Var.Q();
            q8Var2 = q8Var;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new aj(obj, kx4Var, gn2Var, q8Var2, str, gn2Var2, zy0Var, i);
        }
    }

    public static final void d(ce8 ce8Var, kx4 kx4Var, gn2 gn2Var, gn2 gn2Var2, gn2 gn2Var3, zy0 zy0Var, lp2 lp2Var, int i) {
        lp2 lp2Var2;
        int i2;
        sd8 sd8Var;
        Object obj;
        s05 s05Var;
        vd7 vd7Var;
        rh5 rh5Var;
        lj ljVar;
        sd8 sd8Var2;
        be beVar;
        vd7 vd7Var2;
        sd8 sd8VarG;
        lp2 lp2Var3;
        boolean z;
        int i3;
        int i4;
        p50 p50Var = pz2.Z;
        lp2Var.X(1935038908);
        int i5 = (i & 6) == 0 ? (lp2Var.f(ce8Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= lp2Var.f(kx4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= lp2Var.h(gn2Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= lp2Var.f(p50Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= lp2Var.h(gn2Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= lp2Var.h(gn2Var3) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        zy0 zy0Var2 = zy0Var;
        if ((1572864 & i) == 0) {
            i5 |= lp2Var.h(zy0Var2) ? 1048576 : 524288;
        }
        if (lp2Var.N(i5 & 1, (599187 & i5) != 599186)) {
            int i6 = i5 & 14;
            boolean z2 = i6 == 4;
            Object objK = lp2Var.K();
            be beVar2 = zz0.a;
            if (z2 || objK == beVar2) {
                objK = new lj(ce8Var);
                lp2Var.g0(objK);
            }
            lj ljVar2 = (lj) objK;
            boolean z3 = i6 == 4;
            Object objK2 = lp2Var.K();
            Object obj2 = objK2;
            if (z3 || objK2 == beVar2) {
                Object[] objArr = {ce8Var.c()};
                vd7 vd7Var3 = new vd7();
                vd7Var3.addAll(eu.K0(objArr));
                lp2Var.g0(vd7Var3);
                obj2 = vd7Var3;
            }
            vd7 vd7Var4 = (vd7) obj2;
            rh5 rh5Var2 = ce8Var.e;
            rh5 rh5Var3 = ce8Var.d;
            boolean zF = (i6 == 4) | lp2Var.f(rh5Var2.getValue());
            Object objK3 = lp2Var.K();
            if (zF || objK3 == beVar2) {
                long[] jArr = uw6.a;
                objK3 = new s05();
                lp2Var.g0(objK3);
            }
            s05 s05Var2 = (s05) objK3;
            if (!vd7Var4.contains(ce8Var.c())) {
                vd7Var4.clear();
                vd7Var4.add(ce8Var.c());
            }
            if (dh3.f(ce8Var.c(), rh5Var3.getValue()) && rh5Var2.getValue() == null) {
                if (vd7Var4.size() != 1 || !dh3.f(vd7Var4.get(0), ce8Var.c())) {
                    vd7Var4.clear();
                    vd7Var4.add(ce8Var.c());
                }
                if (s05Var2.e != 1 || s05Var2.c(ce8Var.c())) {
                    s05Var2.a();
                }
                ljVar2.getClass();
            }
            Object value = rh5Var2.getValue();
            if (value == null || value.equals(ce8Var.c())) {
                i2 = i5;
            } else {
                ListIterator listIterator = vd7Var4.listIterator();
                int i7 = 0;
                while (true) {
                    o03 o03Var = (o03) listIterator;
                    if (!o03Var.hasNext()) {
                        i2 = i5;
                        i4 = -1;
                        break;
                    }
                    i2 = i5;
                    if (dh3.f(gn2Var2.B(o03Var.next()), gn2Var2.B(value))) {
                        i4 = i7;
                        break;
                    } else {
                        i7++;
                        i5 = i2;
                    }
                }
                if (i4 == -1) {
                    vd7Var4.add(value);
                } else if (!dh3.f(vd7Var4.get(i4), value)) {
                    vd7Var4.set(i4, value);
                }
            }
            if (!dh3.f(ce8Var.c(), rh5Var3.getValue())) {
                ListIterator listIterator2 = vd7Var4.listIterator();
                int i8 = 0;
                while (true) {
                    o03 o03Var2 = (o03) listIterator2;
                    if (!o03Var2.hasNext()) {
                        i3 = -1;
                        break;
                    } else {
                        if (dh3.f(gn2Var2.B(o03Var2.next()), gn2Var2.B(rh5Var3.getValue()))) {
                            i3 = i8;
                            break;
                        }
                        i8++;
                    }
                }
                if (i3 == -1) {
                    vd7Var4.add(rh5Var3.getValue());
                } else if (!dh3.f(vd7Var4.get(i3), rh5Var3.getValue()) || i3 != vd7Var4.size() - 1) {
                    dh3.f(rh5Var3.getValue(), vd7Var4.get(i3));
                    vd7Var4.remove(i3);
                    vd7Var4.add(rh5Var3.getValue());
                }
            }
            Object value2 = rh5Var2.getValue();
            boolean zF2 = lp2Var.f(value2);
            Object objK4 = lp2Var.K();
            if (zF2 || objK4 == beVar2) {
                objK4 = value2 != null ? new rj5(ljVar2, rh5Var3.getValue(), value2) : null;
                lp2Var.g0(objK4);
            }
            rj5 rj5Var = (rj5) objK4;
            boolean zF3 = lp2Var.f(rj5Var) | ((i2 & 458752) == 131072);
            Object objK5 = lp2Var.K();
            if (!zF3 && objK5 != beVar2) {
                obj = objK5;
                sd8Var = null;
            } else if (rj5Var != null && gn2Var3.B(rj5Var) != null) {
                c2.m();
                return;
            } else {
                sd8Var = null;
                lp2Var.g0(null);
                obj = null;
            }
            if (obj != null) {
                c2.m();
                return;
            }
            if (s05Var2.b(rh5Var3.getValue()) && s05Var2.b(ce8Var.c()) && (value2 == null || s05Var2.b(value2))) {
                lp2Var.W(-297322234);
                lp2Var.p(false);
                s05Var = s05Var2;
                vd7Var = vd7Var4;
                rh5Var = rh5Var2;
                ljVar = ljVar2;
                sd8Var2 = sd8Var;
                beVar = beVar2;
            } else {
                lp2Var.W(-302069574);
                s05Var2.a();
                int size = vd7Var4.size();
                int i9 = 0;
                while (i9 < size) {
                    int i10 = i9;
                    Object obj3 = vd7Var4.get(i10);
                    s05 s05Var3 = s05Var2;
                    rh5 rh5Var4 = rh5Var2;
                    zy0 zy0Var3 = zy0Var2;
                    vd7 vd7Var5 = vd7Var4;
                    be beVar3 = beVar2;
                    lj ljVar3 = ljVar2;
                    s05Var3.l(obj3, jm4.U(427839334, new aj(obj3, ce8Var, rj5Var, gn2Var, ljVar3, vd7Var5, zy0Var3), lp2Var));
                    i9 = i10 + 1;
                    vd7Var4 = vd7Var5;
                    s05Var2 = s05Var3;
                    ljVar2 = ljVar3;
                    rh5Var2 = rh5Var4;
                    zy0Var2 = zy0Var;
                    beVar2 = beVar3;
                    sd8Var = sd8Var;
                }
                lj ljVar4 = ljVar2;
                s05Var = s05Var2;
                vd7Var = vd7Var4;
                rh5Var = rh5Var2;
                ljVar = ljVar4;
                sd8Var2 = sd8Var;
                beVar = beVar2;
                lp2Var.p(false);
            }
            boolean zF4 = lp2Var.f(ce8Var.f()) | lp2Var.f(ljVar) | lp2Var.f(rh5Var.getValue());
            Object objK6 = lp2Var.K();
            if (zF4 || objK6 == beVar) {
                objK6 = (a51) gn2Var.B(ljVar);
                lp2Var.g0(objK6);
            }
            a51 a51Var = (a51) objK6;
            ce8 ce8Var2 = ljVar.a;
            boolean zF5 = lp2Var.f(ljVar);
            Object objK7 = lp2Var.K();
            if (zF5 || objK7 == beVar) {
                objK7 = z51.H(Boolean.FALSE);
                lp2Var.g0(objK7);
            }
            y05 y05Var = (y05) objK7;
            y05 y05VarP = z51.P(a51Var.d, lp2Var);
            if (dh3.f(ce8Var2.c(), ce8Var2.d.getValue())) {
                y05Var.setValue(Boolean.FALSE);
            } else if (y05VarP.getValue() != null) {
                y05Var.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) y05Var.getValue()).booleanValue();
            kx4 kx4Var2 = hx4.X;
            if (zBooleanValue) {
                lp2Var.W(1353077497);
                vd7Var2 = vd7Var;
                lp2 lp2Var4 = lp2Var;
                sd8VarG = rq7.g(ljVar.a, ys0.q0, null, lp2Var4, 0, 2);
                boolean zF6 = lp2Var4.f(sd8VarG);
                Object objK8 = lp2Var4.K();
                if (zF6 || objK8 == beVar) {
                    objK8 = w39.l(kx4Var2);
                    lp2Var4.g0(objK8);
                }
                kx4Var2 = (kx4) objK8;
                lp2Var4.p(false);
                lp2Var3 = lp2Var4;
            } else {
                lp2 lp2Var5 = lp2Var;
                vd7Var2 = vd7Var;
                lp2Var5.W(1353343539);
                lp2Var5.p(false);
                sd8VarG = sd8Var2;
                lp2Var3 = lp2Var5;
            }
            kx4 kx4VarY = kx4Var.y(kx4Var2.y(new hj(sd8VarG, y05VarP, ljVar)));
            Object objK9 = lp2Var3.K();
            if (objK9 == beVar) {
                objK9 = new dj(ljVar);
                lp2Var3.g0(objK9);
            }
            dj djVar = (dj) objK9;
            int iHashCode = Long.hashCode(lp2Var3.T);
            kl5 kl5VarL = lp2Var3.l();
            kx4 kx4VarQ = w45.Q(lp2Var3, kx4VarY);
            uz0.j.getClass();
            lp2Var3.Z();
            if (lp2Var3.S) {
                lp2Var3.k();
            } else {
                lp2Var3.j0();
            }
            pn7.m(pz2.B0, lp2Var3, djVar);
            pn7.m(pz2.A0, lp2Var3, kl5VarL);
            pn7.j(lp2Var3, Integer.valueOf(iHashCode));
            pn7.l(lp2Var3);
            pn7.m(pz2.z0, lp2Var3, kx4VarQ);
            lp2Var3.W(758586195);
            int size2 = vd7Var2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Object obj4 = vd7Var2.get(i11);
                lp2Var3.U(1420119555, gn2Var2.B(obj4));
                rn2 rn2Var = (rn2) s05Var.g(obj4);
                if (rn2Var == null) {
                    lp2Var3.W(1074069702);
                    z = false;
                } else {
                    z = false;
                    lp2Var3.W(1420120731);
                    rn2Var.K(lp2Var3, 0);
                }
                lp2Var3.p(z);
                lp2Var3.p(z);
            }
            lp2Var3.p(false);
            lp2Var3.p(true);
            lp2Var2 = lp2Var3;
        } else {
            gn2Var = gn2Var;
            lp2 lp2Var6 = lp2Var;
            lp2Var6.Q();
            lp2Var2 = lp2Var6;
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new vi(ce8Var, kx4Var, gn2Var, gn2Var2, gn2Var3, zy0Var, i);
        }
    }

    public static final void e(y68 y68Var, kx4 kx4Var, lp2 lp2Var, int i) {
        y68Var.getClass();
        lp2Var.X(1040771803);
        int i2 = (lp2Var.f(y68Var) ? 4 : 2) | i;
        if (lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            zc1.c(y68Var.c().Z.length() > 0, null, null, null, null, jm4.U(-605176397, new o90((Object) kx4Var, (Object) y68Var, (byte) 5), lp2Var), lp2Var, 196608, 30);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new i9((byte) 15, i, y68Var, kx4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0143  */
    /* JADX WARN: Code duplicated, block: B:104:0x014b  */
    /* JADX WARN: Code duplicated, block: B:105:0x014e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0155  */
    /* JADX WARN: Code duplicated, block: B:111:0x015e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0161  */
    /* JADX WARN: Code duplicated, block: B:114:0x0167  */
    /* JADX WARN: Code duplicated, block: B:116:0x016f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0176  */
    /* JADX WARN: Code duplicated, block: B:121:0x0180  */
    /* JADX WARN: Code duplicated, block: B:123:0x0187  */
    /* JADX WARN: Code duplicated, block: B:125:0x018d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0195  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:141:0x01be  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:146:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:151:0x01da  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:161:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:162:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:164:0x0204  */
    /* JADX WARN: Code duplicated, block: B:166:0x020a  */
    /* JADX WARN: Code duplicated, block: B:167:0x020d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0215  */
    /* JADX WARN: Code duplicated, block: B:173:0x021c  */
    /* JADX WARN: Code duplicated, block: B:175:0x0222  */
    /* JADX WARN: Code duplicated, block: B:177:0x0228  */
    /* JADX WARN: Code duplicated, block: B:181:0x0233  */
    /* JADX WARN: Code duplicated, block: B:182:0x0236  */
    /* JADX WARN: Code duplicated, block: B:184:0x023c  */
    /* JADX WARN: Code duplicated, block: B:185:0x023f  */
    /* JADX WARN: Code duplicated, block: B:188:0x024b  */
    /* JADX WARN: Code duplicated, block: B:194:0x0257  */
    /* JADX WARN: Code duplicated, block: B:197:0x0260  */
    /* JADX WARN: Code duplicated, block: B:199:0x026f  */
    /* JADX WARN: Code duplicated, block: B:206:0x02a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:207:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:210:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:213:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:215:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:217:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:218:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:220:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:221:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:223:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:224:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:226:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:227:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:229:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:230:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:232:0x02da  */
    /* JADX WARN: Code duplicated, block: B:233:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:235:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:236:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:238:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:239:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:241:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:242:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:244:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:246:0x031b  */
    /* JADX WARN: Code duplicated, block: B:249:0x033a  */
    /* JADX WARN: Code duplicated, block: B:251:0x0340  */
    /* JADX WARN: Code duplicated, block: B:257:0x034d  */
    /* JADX WARN: Code duplicated, block: B:258:0x034f  */
    /* JADX WARN: Code duplicated, block: B:261:0x0359 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:264:0x0360  */
    /* JADX WARN: Code duplicated, block: B:267:0x0377  */
    /* JADX WARN: Code duplicated, block: B:270:0x0390  */
    /* JADX WARN: Code duplicated, block: B:273:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:276:0x03f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:279:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:282:0x0429  */
    /* JADX WARN: Code duplicated, block: B:284:0x042f  */
    /* JADX WARN: Code duplicated, block: B:287:0x0444  */
    /* JADX WARN: Code duplicated, block: B:288:0x0447  */
    /* JADX WARN: Code duplicated, block: B:291:0x045a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:292:0x045c  */
    /* JADX WARN: Code duplicated, block: B:296:0x0589  */
    /* JADX WARN: Code duplicated, block: B:297:0x059c  */
    /* JADX WARN: Code duplicated, block: B:301:0x05b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:302:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:303:0x05b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:304:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:305:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:307:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:308:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:310:0x0638  */
    /* JADX WARN: Code duplicated, block: B:313:0x065b  */
    /* JADX WARN: Code duplicated, block: B:315:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00df  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:80:0x0105  */
    /* JADX WARN: Code duplicated, block: B:82:0x010d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0110  */
    /* JADX WARN: Code duplicated, block: B:85:0x0115  */
    /* JADX WARN: Code duplicated, block: B:88:0x011d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0122  */
    /* JADX WARN: Code duplicated, block: B:92:0x0128  */
    /* JADX WARN: Code duplicated, block: B:94:0x012e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0131  */
    /* JADX WARN: Code duplicated, block: B:99:0x013a  */
    public static final void f(final String str, final gn2 gn2Var, final kx4 kx4Var, kx4 kx4Var2, int i, final y68 y68Var, ay6 ay6Var, final o88 o88Var, rn2 rn2Var, rn2 rn2Var2, boolean z, boolean z2, wx3 wx3Var, w58 w58Var, de3 de3Var, gg5 gg5Var, long j, long j2, long j3, long j4, lp2 lp2Var, final int i2, final int i3, final int i4) {
        int i5;
        kx4 kx4Var3;
        kx4 kx4Var4;
        final int i6;
        int i7;
        int i8;
        rn2 rn2Var3;
        int i9;
        int i10;
        rn2 rn2Var4;
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
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        char c2;
        boolean z3;
        final ay6 ay6Var2;
        final boolean z4;
        final wx3 wx3Var2;
        final de3 de3Var2;
        final gg5 gg5Var2;
        final long j5;
        final long j6;
        final long j7;
        final long j8;
        final kx4 kx4Var5;
        final rn2 rn2Var5;
        final int i36;
        final rn2 rn2Var6;
        final boolean z5;
        final w58 w58Var2;
        j86 j86VarR;
        int i37;
        kx4 kx4VarT;
        final ay6 ay6VarG;
        boolean z6;
        wx3 wx3Var3;
        final w58 w58Var3;
        final de3 de3Var3;
        gg5 ig5Var;
        long j9;
        long j10;
        long j11;
        long j12;
        final gg5 gg5Var3;
        final rn2 rn2Var7;
        int i38;
        final rn2 rn2Var8;
        boolean z7;
        boolean z8;
        Object objK;
        Object obj;
        Object objK2;
        y05 y05VarS;
        boolean zT;
        Object objK3;
        final y05 y05Var;
        Object objK4;
        q80 q80Var;
        boolean zBooleanValue;
        final boolean z9;
        boolean zG;
        Object objK5;
        final boolean z10;
        q80 q80Var2;
        be7 be7Var;
        final i48 i48VarA;
        o88 o88Var2;
        long jB;
        Object objK6;
        boolean z11;
        boolean zF;
        Object objK7;
        int i39;
        int i40;
        int i41;
        str.getClass();
        gn2Var.getClass();
        lp2Var.X(-509284419);
        if ((i2 & 6) == 0) {
            i5 = (lp2Var.f(str) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= lp2Var.h(gn2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            kx4Var3 = kx4Var;
            i5 |= lp2Var.f(kx4Var3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            kx4Var3 = kx4Var;
        }
        int i42 = i4 & 8;
        if (i42 == 0) {
            if ((i2 & 3072) == 0) {
                kx4Var4 = kx4Var2;
                i5 |= lp2Var.f(kx4Var4) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                if ((i4 & 16) == 0) {
                    i6 = i;
                    if (lp2Var.d(i6)) {
                        i41 = 16384;
                    }
                    i5 |= i41;
                } else {
                    i6 = i;
                }
                i41 = 8192;
                i5 |= i41;
            } else {
                i6 = i;
            }
            if ((i2 & 196608) == 0) {
                if (lp2Var.f(y68Var)) {
                    i40 = 131072;
                } else {
                    i40 = 65536;
                }
                i5 |= i40;
            }
            if ((i2 & 1572864) == 0) {
                i5 |= 524288;
            }
            if ((i2 & 12582912) == 0) {
                if (lp2Var.f(o88Var)) {
                    i39 = 8388608;
                } else {
                    i39 = 4194304;
                }
                i5 |= i39;
            }
            i7 = i5 | 100663296;
            i8 = i4 & 512;
            if (i8 != 0) {
                if ((i2 & 805306368) == 0) {
                    rn2Var3 = rn2Var;
                    if (lp2Var.h(rn2Var3)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i7 |= i9;
                }
                i10 = i4 & 1024;
                if (i10 != 0) {
                    rn2Var4 = rn2Var2;
                    i12 = i3 | 6;
                    i11 = 131072;
                } else {
                    rn2Var4 = rn2Var2;
                    if ((i3 & 6) == 0) {
                        i11 = 131072;
                        if (lp2Var.h(rn2Var4)) {
                            i13 = 4;
                        } else {
                            i13 = 2;
                        }
                        i12 = i3 | i13;
                    } else {
                        i11 = 131072;
                        i12 = i3;
                    }
                }
                i14 = i4 & 2048;
                if (i14 != 0) {
                    i12 |= 48;
                } else if ((i3 & 48) == 0) {
                    if (lp2Var.g(z)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i12 |= i15;
                }
                i16 = i12;
                i17 = i4 & 4096;
                if (i17 != 0) {
                    i19 = i16 | 384;
                } else {
                    i18 = i16;
                    if ((i3 & 384) != 0) {
                        if (lp2Var.g(z2)) {
                            i20 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        } else {
                            i20 = 128;
                        }
                        i18 |= i20;
                    }
                    i19 = i18;
                }
                i21 = i4 & 8192;
                if (i21 != 0) {
                    i23 = i19 | 3072;
                } else {
                    i22 = i19;
                    if ((i3 & 3072) == 0) {
                        i23 = i22 | (lp2Var.f(wx3Var) ? 2048 : 1024);
                    } else {
                        i23 = i22;
                    }
                }
                i24 = i4 & Http2.INITIAL_MAX_FRAME_SIZE;
                if (i24 != 0) {
                    i25 = i23;
                    if ((i3 & 24576) == 0) {
                        i25 |= lp2Var.f(w58Var) ? 16384 : 8192;
                    }
                    i26 = i4 & 32768;
                    if (i26 != 0) {
                        i25 |= 196608;
                    } else if ((i3 & 196608) == 0) {
                        if (lp2Var.f(de3Var)) {
                            i27 = i11;
                        } else {
                            i27 = 65536;
                        }
                        i25 |= i27;
                    }
                    i28 = i4 & DnsOverHttps.MAX_RESPONSE_SIZE;
                    if (i28 != 0) {
                        i25 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        if (lp2Var.f(gg5Var)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i25 |= i29;
                    }
                    i30 = i4 & i11;
                    if (i30 != 0) {
                        if ((i3 & 12582912) == 0) {
                            i25 |= lp2Var.e(j) ? 8388608 : 4194304;
                        }
                        i31 = i4 & 262144;
                        if (i31 != 0) {
                            i25 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            if (lp2Var.e(j2)) {
                                i32 = 67108864;
                            } else {
                                i32 = 33554432;
                            }
                            i25 |= i32;
                        }
                        i33 = i4 & 524288;
                        if (i33 != 0) {
                            i25 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i25 |= lp2Var.e(j3) ? 536870912 : 268435456;
                        }
                        i34 = i25;
                        i35 = i4 & 1048576;
                        if (i35 != 0) {
                            c2 = 6;
                        } else if (lp2Var.e(j4)) {
                            c2 = 4;
                        } else {
                            c2 = 2;
                        }
                        if ((i7 & 306783379) != 306783378 && (i34 & 306783379) == 306783378 && (c2 & 3) == 2) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (lp2Var.N(i7 & 1, z3)) {
                            lp2Var.S();
                            i37 = i2 & 1;
                            kx4VarT = hx4.X;
                            if (i37 != 0 || lp2Var.x()) {
                                if (i42 != 0) {
                                    kx4Var4 = kx4VarT;
                                }
                                if ((i4 & 16) != 0) {
                                    i7 &= -57345;
                                    i6 = 5;
                                }
                                ay6VarG = dh3.G(lp2Var);
                                int i43 = i7 & (-3670017);
                                if (i8 != 0) {
                                    rn2Var3 = null;
                                }
                                if (i10 != 0) {
                                    rn2Var4 = null;
                                }
                                if (i14 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z;
                                }
                                if (i17 != 0) {
                                    z5 = true;
                                } else {
                                    z5 = z2;
                                }
                                if (i21 != 0) {
                                    wx3Var3 = wx3.g;
                                } else {
                                    wx3Var3 = wx3Var;
                                }
                                if (i24 != 0) {
                                    w58Var3 = qe4.x0;
                                } else {
                                    w58Var3 = w58Var;
                                }
                                if (i26 != 0) {
                                    de3Var3 = null;
                                } else {
                                    de3Var3 = de3Var;
                                }
                                if (i28 != 0) {
                                    ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                                } else {
                                    ig5Var = gg5Var;
                                }
                                if (i30 != 0) {
                                    j9 = dw0.f;
                                } else {
                                    j9 = j;
                                }
                                if (i31 != 0) {
                                    j10 = dw0.f;
                                } else {
                                    j10 = j2;
                                }
                                if (i33 != 0) {
                                    j11 = dw0.f;
                                } else {
                                    j11 = j3;
                                }
                                if (i35 != 0) {
                                    j12 = dw0.f;
                                } else {
                                    j12 = j4;
                                }
                                gg5Var3 = ig5Var;
                                rn2Var7 = rn2Var3;
                                i38 = i43;
                                rn2Var8 = rn2Var4;
                            } else {
                                lp2Var.Q();
                                if ((i4 & 16) != 0) {
                                    i7 &= -57345;
                                }
                                ay6VarG = ay6Var;
                                z6 = z;
                                w58Var3 = w58Var;
                                de3Var3 = de3Var;
                                gg5Var3 = gg5Var;
                                j9 = j;
                                j10 = j2;
                                j11 = j3;
                                j12 = j4;
                                i38 = i7 & (-3670017);
                                rn2Var7 = rn2Var3;
                                i6 = i6;
                                rn2Var8 = rn2Var4;
                                z5 = z2;
                                wx3Var3 = wx3Var;
                            }
                            lp2Var.q();
                            int i44 = i11;
                            boolean z12 = (((458752 & i38) ^ 196608) <= i44 && lp2Var.f(y68Var)) || (i38 & 196608) == i44;
                            if ((i38 & 112) == 32) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            z8 = z7 | z12;
                            objK = lp2Var.K();
                            obj = zz0.a;
                            if (z8 || objK == obj) {
                                objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                                lp2Var.g0(objK);
                            }
                            u70.h((rn2) objK, lp2Var, y68Var);
                            objK2 = lp2Var.K();
                            if (objK2 == obj) {
                                objK2 = new xz4();
                                lp2Var.g0(objK2);
                            }
                            final xz4 xz4Var = (xz4) objK2;
                            y05VarS = km4.s(xz4Var, lp2Var, 6);
                            zT = oc.t(lp2Var);
                            objK3 = lp2Var.K();
                            if (objK3 == obj) {
                                objK3 = z51.H(Boolean.FALSE);
                                lp2Var.g0(objK3);
                            }
                            y05Var = (y05) objK3;
                            objK4 = lp2Var.K();
                            if (objK4 == obj) {
                                objK4 = new q80();
                                lp2Var.g0(objK4);
                            }
                            q80Var = (q80) objK4;
                            WeakHashMap weakHashMap = c29.w;
                            Boolean bool = (Boolean) hw7.b(lp2Var).c.d.getValue();
                            zBooleanValue = bool.booleanValue();
                            final kx4 kx4Var6 = kx4Var4;
                            Boolean boolValueOf = Boolean.valueOf(zT);
                            z9 = z6;
                            Boolean bool2 = (Boolean) y05VarS.getValue();
                            bool2.getClass();
                            zG = lp2Var.g(zT) | lp2Var.f(y05VarS) | lp2Var.g(zBooleanValue) | lp2Var.h(q80Var);
                            objK5 = lp2Var.K();
                            if (!zG || objK5 == obj) {
                                objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                                z10 = zT;
                                q80Var2 = q80Var;
                                lp2Var.g0(objK5);
                            } else {
                                z10 = zT;
                                q80Var2 = q80Var;
                            }
                            u70.i(boolValueOf, bool2, bool, (rn2) objK5, lp2Var);
                            be7Var = (be7) lp2Var.j(y01.q);
                            lp2Var.W(204007653);
                            if (z10) {
                                objK6 = lp2Var.K();
                                if (objK6 == obj) {
                                    objK6 = new gh(y05Var, (byte) 6);
                                    lp2Var.g0(objK6);
                                }
                                kx4 kx4VarJ = z51.J(kx4VarT, (gn2) objK6);
                                if ((i34 & 896) == 256) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                zF = z11 | lp2Var.f(r137) | lp2Var.f(be7Var);
                                objK7 = lp2Var.K();
                                if (zF || objK7 == obj) {
                                    objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                                    lp2Var.g0(objK7);
                                }
                                kx4VarT = mb6.T(kx4VarJ, (gn2) objK7);
                            }
                            final kx4 kx4Var7 = kx4VarT;
                            lp2Var.p(false);
                            long j13 = ys0.y(lp2Var).c.a;
                            long j14 = ys0.y(lp2Var).c.a;
                            long j15 = ys0.y(lp2Var).c.c;
                            long j16 = ys0.y(lp2Var).c.e;
                            long j17 = dw0.f;
                            long j18 = ys0.y(lp2Var).k.a;
                            long j19 = ys0.y(lp2Var).k.c;
                            long j20 = ys0.y(lp2Var).c.a;
                            long j21 = ys0.y(lp2Var).c.a;
                            long j22 = ys0.y(lp2Var).c.c;
                            long j23 = ys0.y(lp2Var).c.e;
                            long j24 = ys0.y(lp2Var).c.a;
                            long j25 = ys0.y(lp2Var).c.a;
                            long j26 = ys0.y(lp2Var).c.c;
                            long j27 = ys0.y(lp2Var).c.e;
                            long j28 = ys0.y(lp2Var).c.c;
                            long j29 = ys0.y(lp2Var).c.c;
                            long j30 = ys0.y(lp2Var).c.c;
                            long j31 = ys0.y(lp2Var).k.c;
                            long j32 = ys0.y(lp2Var).c.b;
                            long j33 = ys0.y(lp2Var).c.b;
                            long j34 = ys0.y(lp2Var).c.c;
                            long j35 = ys0.y(lp2Var).c.e;
                            long j36 = dw0.g;
                            iw0 iw0Var = (iw0) lp2Var.j(kw0.a);
                            q06 q06Var = i88.a;
                            i48VarA = lh4.O0(iw0Var, (h88) lp2Var.j(q06Var)).a(j13, j14, j15, j16, j17, j17, j17, j17, j18, j19, null, j9, j10, j11, j12, j20, j21, j22, j23, j24, j25, j26, j27, j36, j36, j36, j36, j28, j29, j30, j31, j32, j33, j34, j35, j36, j36, j36, j36, j36, j36, j36, j36);
                            if (o88Var == null) {
                                lp2Var.W(204085828);
                                o88Var2 = (o88) lp2Var.j(u78.a);
                                lp2Var.p(false);
                            } else {
                                lp2Var.W(204085084);
                                lp2Var.p(false);
                                o88Var2 = o88Var;
                            }
                            jB = o88Var2.b();
                            if (jB == 16) {
                                if (!z5) {
                                    jB = i48VarA.c;
                                } else if (z9) {
                                    jB = i48VarA.d;
                                } else if (((Boolean) r137.getValue()).booleanValue()) {
                                    jB = i48VarA.a;
                                } else {
                                    jB = i48VarA.b;
                                }
                            }
                            final o88 o88VarD = o88Var2.d(new o88(jB, 0L, null, null, 0L, 0, 0, 0L, 16777214));
                            t06 t06VarA = q06Var.a(i48VarA.k);
                            final wx3 wx3Var4 = wx3Var3;
                            final q80 q80Var3 = q80Var2;
                            final kx4 kx4Var8 = kx4Var3;
                            mb6.a(t06VarA, jm4.U(1035408509, new rn2() { // from class: uy2
                                @Override // defpackage.rn2
                                public final Object K(Object obj2, Object obj3) {
                                    wx3 wx3Var5;
                                    lp2 lp2Var2 = (lp2) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    byte b2 = 0;
                                    if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        kx4 kx4VarY = hi5.P(kx4Var8, q80Var3).y(kx4Var7);
                                        boolean z13 = z10;
                                        wx3 wx3Var6 = wx3Var4;
                                        if (z13) {
                                            Boolean bool3 = (Boolean) y05Var.getValue();
                                            bool3.getClass();
                                            wx3Var5 = new wx3(wx3Var6.a, wx3Var6.b, wx3Var6.c, wx3Var6.d, bool3, wx3Var6.f);
                                        } else {
                                            wx3Var5 = wx3Var6;
                                        }
                                        final boolean z14 = z9;
                                        final i48 i48Var = i48VarA;
                                        fe7 fe7Var = new fe7(z14 ? i48Var.j : i48Var.i);
                                        zy0 zy0VarU = jm4.U(-1314685591, new wy2(b2, i6, str, kx4Var6), lp2Var2);
                                        final boolean z15 = z5;
                                        final xz4 xz4Var2 = xz4Var;
                                        zy0 zy0VarU2 = jm4.U(306314943, new rn2() { // from class: xy2
                                            @Override // defpackage.rn2
                                            public final Object K(Object obj4, Object obj5) {
                                                lp2 lp2Var3 = (lp2) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                if (lp2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    lh4.H0.K0(z15, z14, xz4Var2, null, i48Var, null, 0.0f, 0.0f, lp2Var3, 100663680, 232);
                                                } else {
                                                    lp2Var3.Q();
                                                }
                                                return dn8.a;
                                            }
                                        }, lp2Var2);
                                        q58 q58Var = new q58();
                                        y68 y68Var2 = y68Var;
                                        w58 w58Var4 = w58Var3;
                                        x30.b(y68Var2, kx4VarY, z15, de3Var3, o88VarD, wx3Var5, w58Var4, xz4Var2, fe7Var, new z48(y68Var2, w58Var4, q58Var, zy0VarU, rn2Var7, rn2Var8, z15, z14, xz4Var2, gg5Var3, i48Var, zy0VarU2), ay6VarG, lp2Var2, 0, 6, 4744);
                                    } else {
                                        lp2Var2.Q();
                                    }
                                    return dn8.a;
                                }
                            }, lp2Var), lp2Var, 56);
                            z4 = z9;
                            w58Var2 = w58Var3;
                            rn2Var5 = rn2Var7;
                            rn2Var6 = rn2Var8;
                            gg5Var2 = gg5Var3;
                            de3Var2 = de3Var3;
                            ay6Var2 = ay6VarG;
                            kx4Var5 = kx4Var6;
                            i36 = i6;
                            j5 = j9;
                            j6 = j10;
                            j7 = j11;
                            j8 = j12;
                            wx3Var2 = wx3Var4;
                        } else {
                            lp2Var.Q();
                            ay6Var2 = ay6Var;
                            z4 = z;
                            wx3Var2 = wx3Var;
                            de3Var2 = de3Var;
                            gg5Var2 = gg5Var;
                            j5 = j;
                            j6 = j2;
                            j7 = j3;
                            j8 = j4;
                            kx4Var5 = kx4Var4;
                            rn2Var5 = rn2Var3;
                            i36 = i6;
                            rn2Var6 = rn2Var4;
                            z5 = z2;
                            w58Var2 = w58Var;
                        }
                        j86VarR = lp2Var.r();
                        if (j86VarR != null) {
                            j86VarR.d = new rn2() { // from class: vy2
                                @Override // defpackage.rn2
                                public final Object K(Object obj2, Object obj3) {
                                    ((Integer) obj3).getClass();
                                    int iP = w79.P(i2 | 1);
                                    int iP2 = w79.P(i3);
                                    z91.f(str, gn2Var, kx4Var, kx4Var5, i36, y68Var, ay6Var2, o88Var, rn2Var5, rn2Var6, z4, z5, wx3Var2, w58Var2, de3Var2, gg5Var2, j5, j6, j7, j8, (lp2) obj2, iP, iP2, i4);
                                    return dn8.a;
                                }
                            };
                        }
                    }
                    i25 |= 12582912;
                    i31 = i4 & 262144;
                    if (i31 != 0) {
                        i25 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        if (lp2Var.e(j2)) {
                            i32 = 67108864;
                        } else {
                            i32 = 33554432;
                        }
                        i25 |= i32;
                    }
                    i33 = i4 & 524288;
                    if (i33 != 0) {
                        i25 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i25 |= lp2Var.e(j3) ? 536870912 : 268435456;
                    }
                    i34 = i25;
                    i35 = i4 & 1048576;
                    if (i35 != 0) {
                        c2 = 6;
                    } else if (lp2Var.e(j4)) {
                        c2 = 4;
                    } else {
                        c2 = 2;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (lp2Var.N(i7 & 1, z3)) {
                        lp2Var.S();
                        i37 = i2 & 1;
                        kx4VarT = hx4.X;
                        if (i37 != 0) {
                            if (i42 != 0) {
                                kx4Var4 = kx4VarT;
                            }
                            if ((i4 & 16) != 0) {
                                i7 &= -57345;
                                i6 = 5;
                            }
                            ay6VarG = dh3.G(lp2Var);
                            int i45 = i7 & (-3670017);
                            if (i8 != 0) {
                                rn2Var3 = null;
                            }
                            if (i10 != 0) {
                                rn2Var4 = null;
                            }
                            if (i14 != 0) {
                                z6 = false;
                            } else {
                                z6 = z;
                            }
                            if (i17 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            if (i21 != 0) {
                                wx3Var3 = wx3.g;
                            } else {
                                wx3Var3 = wx3Var;
                            }
                            if (i24 != 0) {
                                w58Var3 = qe4.x0;
                            } else {
                                w58Var3 = w58Var;
                            }
                            if (i26 != 0) {
                                de3Var3 = null;
                            } else {
                                de3Var3 = de3Var;
                            }
                            if (i28 != 0) {
                                ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                ig5Var = gg5Var;
                            }
                            if (i30 != 0) {
                                j9 = dw0.f;
                            } else {
                                j9 = j;
                            }
                            if (i31 != 0) {
                                j10 = dw0.f;
                            } else {
                                j10 = j2;
                            }
                            if (i33 != 0) {
                                j11 = dw0.f;
                            } else {
                                j11 = j3;
                            }
                            if (i35 != 0) {
                                j12 = dw0.f;
                            } else {
                                j12 = j4;
                            }
                            gg5Var3 = ig5Var;
                            rn2Var7 = rn2Var3;
                            i38 = i45;
                            rn2Var8 = rn2Var4;
                        } else {
                            if (i42 != 0) {
                                kx4Var4 = kx4VarT;
                            }
                            if ((i4 & 16) != 0) {
                                i7 &= -57345;
                                i6 = 5;
                            }
                            ay6VarG = dh3.G(lp2Var);
                            int i46 = i7 & (-3670017);
                            if (i8 != 0) {
                                rn2Var3 = null;
                            }
                            if (i10 != 0) {
                                rn2Var4 = null;
                            }
                            if (i14 != 0) {
                                z6 = false;
                            } else {
                                z6 = z;
                            }
                            if (i17 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            if (i21 != 0) {
                                wx3Var3 = wx3.g;
                            } else {
                                wx3Var3 = wx3Var;
                            }
                            if (i24 != 0) {
                                w58Var3 = qe4.x0;
                            } else {
                                w58Var3 = w58Var;
                            }
                            if (i26 != 0) {
                                de3Var3 = null;
                            } else {
                                de3Var3 = de3Var;
                            }
                            if (i28 != 0) {
                                ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                ig5Var = gg5Var;
                            }
                            if (i30 != 0) {
                                j9 = dw0.f;
                            } else {
                                j9 = j;
                            }
                            if (i31 != 0) {
                                j10 = dw0.f;
                            } else {
                                j10 = j2;
                            }
                            if (i33 != 0) {
                                j11 = dw0.f;
                            } else {
                                j11 = j3;
                            }
                            if (i35 != 0) {
                                j12 = dw0.f;
                            } else {
                                j12 = j4;
                            }
                            gg5Var3 = ig5Var;
                            rn2Var7 = rn2Var3;
                            i38 = i46;
                            rn2Var8 = rn2Var4;
                        }
                        lp2Var.q();
                        int i47 = i11;
                        if (((458752 & i38) ^ 196608) <= i47) {
                        }
                        if ((i38 & 112) == 32) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = z7 | z12;
                        objK = lp2Var.K();
                        obj = zz0.a;
                        if (z8) {
                            objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                            lp2Var.g0(objK);
                        } else {
                            objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                            lp2Var.g0(objK);
                        }
                        u70.h((rn2) objK, lp2Var, y68Var);
                        objK2 = lp2Var.K();
                        if (objK2 == obj) {
                            objK2 = new xz4();
                            lp2Var.g0(objK2);
                        }
                        final xz4 xz4Var2 = (xz4) objK2;
                        y05VarS = km4.s(xz4Var2, lp2Var, 6);
                        zT = oc.t(lp2Var);
                        objK3 = lp2Var.K();
                        if (objK3 == obj) {
                            objK3 = z51.H(Boolean.FALSE);
                            lp2Var.g0(objK3);
                        }
                        y05Var = (y05) objK3;
                        objK4 = lp2Var.K();
                        if (objK4 == obj) {
                            objK4 = new q80();
                            lp2Var.g0(objK4);
                        }
                        q80Var = (q80) objK4;
                        WeakHashMap weakHashMap2 = c29.w;
                        Boolean bool3 = (Boolean) hw7.b(lp2Var).c.d.getValue();
                        zBooleanValue = bool3.booleanValue();
                        final kx4 kx4Var9 = kx4Var4;
                        Boolean boolValueOf2 = Boolean.valueOf(zT);
                        z9 = z6;
                        Boolean bool4 = (Boolean) y05VarS.getValue();
                        bool4.getClass();
                        zG = lp2Var.g(zT) | lp2Var.f(y05VarS) | lp2Var.g(zBooleanValue) | lp2Var.h(q80Var);
                        objK5 = lp2Var.K();
                        if (zG) {
                            objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                            z10 = zT;
                            q80Var2 = q80Var;
                            lp2Var.g0(objK5);
                        } else {
                            objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                            z10 = zT;
                            q80Var2 = q80Var;
                            lp2Var.g0(objK5);
                        }
                        u70.i(boolValueOf2, bool4, bool3, (rn2) objK5, lp2Var);
                        be7Var = (be7) lp2Var.j(y01.q);
                        lp2Var.W(204007653);
                        if (z10) {
                            objK6 = lp2Var.K();
                            if (objK6 == obj) {
                                objK6 = new gh(y05Var, (byte) 6);
                                lp2Var.g0(objK6);
                            }
                            kx4 kx4VarJ2 = z51.J(kx4VarT, (gn2) objK6);
                            if ((i34 & 896) == 256) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            zF = z11 | lp2Var.f(r137) | lp2Var.f(be7Var);
                            objK7 = lp2Var.K();
                            if (zF) {
                                objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                                lp2Var.g0(objK7);
                            } else {
                                objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                                lp2Var.g0(objK7);
                            }
                            kx4VarT = mb6.T(kx4VarJ2, (gn2) objK7);
                        }
                        final kx4 kx4Var10 = kx4VarT;
                        lp2Var.p(false);
                        long j110 = ys0.y(lp2Var).c.a;
                        long j111 = ys0.y(lp2Var).c.a;
                        long j112 = ys0.y(lp2Var).c.c;
                        long j113 = ys0.y(lp2Var).c.e;
                        long j114 = dw0.f;
                        long j115 = ys0.y(lp2Var).k.a;
                        long j116 = ys0.y(lp2Var).k.c;
                        long j210 = ys0.y(lp2Var).c.a;
                        long j211 = ys0.y(lp2Var).c.a;
                        long j212 = ys0.y(lp2Var).c.c;
                        long j213 = ys0.y(lp2Var).c.e;
                        long j214 = ys0.y(lp2Var).c.a;
                        long j215 = ys0.y(lp2Var).c.a;
                        long j216 = ys0.y(lp2Var).c.c;
                        long j217 = ys0.y(lp2Var).c.e;
                        long j218 = ys0.y(lp2Var).c.c;
                        long j219 = ys0.y(lp2Var).c.c;
                        long j37 = ys0.y(lp2Var).c.c;
                        long j38 = ys0.y(lp2Var).k.c;
                        long j39 = ys0.y(lp2Var).c.b;
                        long j310 = ys0.y(lp2Var).c.b;
                        long j311 = ys0.y(lp2Var).c.c;
                        long j312 = ys0.y(lp2Var).c.e;
                        long j313 = dw0.g;
                        iw0 iw0Var2 = (iw0) lp2Var.j(kw0.a);
                        q06 q06Var2 = i88.a;
                        i48VarA = lh4.O0(iw0Var2, (h88) lp2Var.j(q06Var2)).a(j110, j111, j112, j113, j114, j114, j114, j114, j115, j116, null, j9, j10, j11, j12, j210, j211, j212, j213, j214, j215, j216, j217, j313, j313, j313, j313, j218, j219, j37, j38, j39, j310, j311, j312, j313, j313, j313, j313, j313, j313, j313, j313);
                        if (o88Var == null) {
                            lp2Var.W(204085828);
                            o88Var2 = (o88) lp2Var.j(u78.a);
                            lp2Var.p(false);
                        } else {
                            lp2Var.W(204085084);
                            lp2Var.p(false);
                            o88Var2 = o88Var;
                        }
                        jB = o88Var2.b();
                        if (jB == 16) {
                            if (!z5) {
                                jB = i48VarA.c;
                            } else if (z9) {
                                jB = i48VarA.d;
                            } else if (((Boolean) r137.getValue()).booleanValue()) {
                                jB = i48VarA.a;
                            } else {
                                jB = i48VarA.b;
                            }
                        }
                        final o88 o88VarD2 = o88Var2.d(new o88(jB, 0L, null, null, 0L, 0, 0, 0L, 16777214));
                        t06 t06VarA2 = q06Var2.a(i48VarA.k);
                        final wx3 wx3Var5 = wx3Var3;
                        final q80 q80Var4 = q80Var2;
                        final kx4 kx4Var11 = kx4Var3;
                        mb6.a(t06VarA2, jm4.U(1035408509, new rn2() { // from class: uy2
                            @Override // defpackage.rn2
                            public final Object K(Object obj2, Object obj3) {
                                wx3 wx3Var6;
                                lp2 lp2Var2 = (lp2) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                byte b2 = 0;
                                if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    kx4 kx4VarY = hi5.P(kx4Var11, q80Var4).y(kx4Var10);
                                    boolean z13 = z10;
                                    wx3 wx3Var7 = wx3Var5;
                                    if (z13) {
                                        Boolean bool5 = (Boolean) y05Var.getValue();
                                        bool5.getClass();
                                        wx3Var6 = new wx3(wx3Var7.a, wx3Var7.b, wx3Var7.c, wx3Var7.d, bool5, wx3Var7.f);
                                    } else {
                                        wx3Var6 = wx3Var7;
                                    }
                                    final boolean z14 = z9;
                                    final i48 i48Var = i48VarA;
                                    fe7 fe7Var = new fe7(z14 ? i48Var.j : i48Var.i);
                                    zy0 zy0VarU = jm4.U(-1314685591, new wy2(b2, i6, str, kx4Var9), lp2Var2);
                                    final boolean z15 = z5;
                                    final xz4 xz4Var3 = xz4Var2;
                                    zy0 zy0VarU2 = jm4.U(306314943, new rn2() { // from class: xy2
                                        @Override // defpackage.rn2
                                        public final Object K(Object obj4, Object obj5) {
                                            lp2 lp2Var3 = (lp2) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            if (lp2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                lh4.H0.K0(z15, z14, xz4Var3, null, i48Var, null, 0.0f, 0.0f, lp2Var3, 100663680, 232);
                                            } else {
                                                lp2Var3.Q();
                                            }
                                            return dn8.a;
                                        }
                                    }, lp2Var2);
                                    q58 q58Var = new q58();
                                    y68 y68Var2 = y68Var;
                                    w58 w58Var4 = w58Var3;
                                    x30.b(y68Var2, kx4VarY, z15, de3Var3, o88VarD2, wx3Var6, w58Var4, xz4Var3, fe7Var, new z48(y68Var2, w58Var4, q58Var, zy0VarU, rn2Var7, rn2Var8, z15, z14, xz4Var3, gg5Var3, i48Var, zy0VarU2), ay6VarG, lp2Var2, 0, 6, 4744);
                                } else {
                                    lp2Var2.Q();
                                }
                                return dn8.a;
                            }
                        }, lp2Var), lp2Var, 56);
                        z4 = z9;
                        w58Var2 = w58Var3;
                        rn2Var5 = rn2Var7;
                        rn2Var6 = rn2Var8;
                        gg5Var2 = gg5Var3;
                        de3Var2 = de3Var3;
                        ay6Var2 = ay6VarG;
                        kx4Var5 = kx4Var9;
                        i36 = i6;
                        j5 = j9;
                        j6 = j10;
                        j7 = j11;
                        j8 = j12;
                        wx3Var2 = wx3Var5;
                    } else {
                        lp2Var.Q();
                        ay6Var2 = ay6Var;
                        z4 = z;
                        wx3Var2 = wx3Var;
                        de3Var2 = de3Var;
                        gg5Var2 = gg5Var;
                        j5 = j;
                        j6 = j2;
                        j7 = j3;
                        j8 = j4;
                        kx4Var5 = kx4Var4;
                        rn2Var5 = rn2Var3;
                        i36 = i6;
                        rn2Var6 = rn2Var4;
                        z5 = z2;
                        w58Var2 = w58Var;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: vy2
                            @Override // defpackage.rn2
                            public final Object K(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                int iP = w79.P(i2 | 1);
                                int iP2 = w79.P(i3);
                                z91.f(str, gn2Var, kx4Var, kx4Var5, i36, y68Var, ay6Var2, o88Var, rn2Var5, rn2Var6, z4, z5, wx3Var2, w58Var2, de3Var2, gg5Var2, j5, j6, j7, j8, (lp2) obj2, iP, iP2, i4);
                                return dn8.a;
                            }
                        };
                    }
                }
                i25 = i23 | 24576;
                i26 = i4 & 32768;
                if (i26 != 0) {
                    i25 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (lp2Var.f(de3Var)) {
                        i27 = i11;
                    } else {
                        i27 = 65536;
                    }
                    i25 |= i27;
                }
                i28 = i4 & DnsOverHttps.MAX_RESPONSE_SIZE;
                if (i28 != 0) {
                    i25 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (lp2Var.f(gg5Var)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i25 |= i29;
                }
                i30 = i4 & i11;
                if (i30 != 0) {
                    if ((i3 & 12582912) == 0) {
                        i25 |= lp2Var.e(j) ? 8388608 : 4194304;
                    }
                    i31 = i4 & 262144;
                    if (i31 != 0) {
                        i25 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        if (lp2Var.e(j2)) {
                            i32 = 67108864;
                        } else {
                            i32 = 33554432;
                        }
                        i25 |= i32;
                    }
                    i33 = i4 & 524288;
                    if (i33 != 0) {
                        i25 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i25 |= lp2Var.e(j3) ? 536870912 : 268435456;
                    }
                    i34 = i25;
                    i35 = i4 & 1048576;
                    if (i35 != 0) {
                        c2 = 6;
                    } else if (lp2Var.e(j4)) {
                        c2 = 4;
                    } else {
                        c2 = 2;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (lp2Var.N(i7 & 1, z3)) {
                        lp2Var.S();
                        i37 = i2 & 1;
                        kx4VarT = hx4.X;
                        if (i37 != 0) {
                            if (i42 != 0) {
                                kx4Var4 = kx4VarT;
                            }
                            if ((i4 & 16) != 0) {
                                i7 &= -57345;
                                i6 = 5;
                            }
                            ay6VarG = dh3.G(lp2Var);
                            int i48 = i7 & (-3670017);
                            if (i8 != 0) {
                                rn2Var3 = null;
                            }
                            if (i10 != 0) {
                                rn2Var4 = null;
                            }
                            if (i14 != 0) {
                                z6 = false;
                            } else {
                                z6 = z;
                            }
                            if (i17 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            if (i21 != 0) {
                                wx3Var3 = wx3.g;
                            } else {
                                wx3Var3 = wx3Var;
                            }
                            if (i24 != 0) {
                                w58Var3 = qe4.x0;
                            } else {
                                w58Var3 = w58Var;
                            }
                            if (i26 != 0) {
                                de3Var3 = null;
                            } else {
                                de3Var3 = de3Var;
                            }
                            if (i28 != 0) {
                                ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                ig5Var = gg5Var;
                            }
                            if (i30 != 0) {
                                j9 = dw0.f;
                            } else {
                                j9 = j;
                            }
                            if (i31 != 0) {
                                j10 = dw0.f;
                            } else {
                                j10 = j2;
                            }
                            if (i33 != 0) {
                                j11 = dw0.f;
                            } else {
                                j11 = j3;
                            }
                            if (i35 != 0) {
                                j12 = dw0.f;
                            } else {
                                j12 = j4;
                            }
                            gg5Var3 = ig5Var;
                            rn2Var7 = rn2Var3;
                            i38 = i48;
                            rn2Var8 = rn2Var4;
                        } else {
                            if (i42 != 0) {
                                kx4Var4 = kx4VarT;
                            }
                            if ((i4 & 16) != 0) {
                                i7 &= -57345;
                                i6 = 5;
                            }
                            ay6VarG = dh3.G(lp2Var);
                            int i49 = i7 & (-3670017);
                            if (i8 != 0) {
                                rn2Var3 = null;
                            }
                            if (i10 != 0) {
                                rn2Var4 = null;
                            }
                            if (i14 != 0) {
                                z6 = false;
                            } else {
                                z6 = z;
                            }
                            if (i17 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            if (i21 != 0) {
                                wx3Var3 = wx3.g;
                            } else {
                                wx3Var3 = wx3Var;
                            }
                            if (i24 != 0) {
                                w58Var3 = qe4.x0;
                            } else {
                                w58Var3 = w58Var;
                            }
                            if (i26 != 0) {
                                de3Var3 = null;
                            } else {
                                de3Var3 = de3Var;
                            }
                            if (i28 != 0) {
                                ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                ig5Var = gg5Var;
                            }
                            if (i30 != 0) {
                                j9 = dw0.f;
                            } else {
                                j9 = j;
                            }
                            if (i31 != 0) {
                                j10 = dw0.f;
                            } else {
                                j10 = j2;
                            }
                            if (i33 != 0) {
                                j11 = dw0.f;
                            } else {
                                j11 = j3;
                            }
                            if (i35 != 0) {
                                j12 = dw0.f;
                            } else {
                                j12 = j4;
                            }
                            gg5Var3 = ig5Var;
                            rn2Var7 = rn2Var3;
                            i38 = i49;
                            rn2Var8 = rn2Var4;
                        }
                        lp2Var.q();
                        int i410 = i11;
                        if (((458752 & i38) ^ 196608) <= i410) {
                        }
                        if ((i38 & 112) == 32) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = z7 | z12;
                        objK = lp2Var.K();
                        obj = zz0.a;
                        if (z8) {
                            objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                            lp2Var.g0(objK);
                        } else {
                            objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                            lp2Var.g0(objK);
                        }
                        u70.h((rn2) objK, lp2Var, y68Var);
                        objK2 = lp2Var.K();
                        if (objK2 == obj) {
                            objK2 = new xz4();
                            lp2Var.g0(objK2);
                        }
                        final xz4 xz4Var3 = (xz4) objK2;
                        y05VarS = km4.s(xz4Var3, lp2Var, 6);
                        zT = oc.t(lp2Var);
                        objK3 = lp2Var.K();
                        if (objK3 == obj) {
                            objK3 = z51.H(Boolean.FALSE);
                            lp2Var.g0(objK3);
                        }
                        y05Var = (y05) objK3;
                        objK4 = lp2Var.K();
                        if (objK4 == obj) {
                            objK4 = new q80();
                            lp2Var.g0(objK4);
                        }
                        q80Var = (q80) objK4;
                        WeakHashMap weakHashMap3 = c29.w;
                        Boolean bool5 = (Boolean) hw7.b(lp2Var).c.d.getValue();
                        zBooleanValue = bool5.booleanValue();
                        final kx4 kx4Var12 = kx4Var4;
                        Boolean boolValueOf3 = Boolean.valueOf(zT);
                        z9 = z6;
                        Boolean bool6 = (Boolean) y05VarS.getValue();
                        bool6.getClass();
                        zG = lp2Var.g(zT) | lp2Var.f(y05VarS) | lp2Var.g(zBooleanValue) | lp2Var.h(q80Var);
                        objK5 = lp2Var.K();
                        if (zG) {
                            objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                            z10 = zT;
                            q80Var2 = q80Var;
                            lp2Var.g0(objK5);
                        } else {
                            objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                            z10 = zT;
                            q80Var2 = q80Var;
                            lp2Var.g0(objK5);
                        }
                        u70.i(boolValueOf3, bool6, bool5, (rn2) objK5, lp2Var);
                        be7Var = (be7) lp2Var.j(y01.q);
                        lp2Var.W(204007653);
                        if (z10) {
                            objK6 = lp2Var.K();
                            if (objK6 == obj) {
                                objK6 = new gh(y05Var, (byte) 6);
                                lp2Var.g0(objK6);
                            }
                            kx4 kx4VarJ3 = z51.J(kx4VarT, (gn2) objK6);
                            if ((i34 & 896) == 256) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            zF = z11 | lp2Var.f(r137) | lp2Var.f(be7Var);
                            objK7 = lp2Var.K();
                            if (zF) {
                                objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                                lp2Var.g0(objK7);
                            } else {
                                objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                                lp2Var.g0(objK7);
                            }
                            kx4VarT = mb6.T(kx4VarJ3, (gn2) objK7);
                        }
                        final kx4 kx4Var13 = kx4VarT;
                        lp2Var.p(false);
                        long j117 = ys0.y(lp2Var).c.a;
                        long j118 = ys0.y(lp2Var).c.a;
                        long j119 = ys0.y(lp2Var).c.c;
                        long j1110 = ys0.y(lp2Var).c.e;
                        long j1111 = dw0.f;
                        long j1112 = ys0.y(lp2Var).k.a;
                        long j1113 = ys0.y(lp2Var).k.c;
                        long j2110 = ys0.y(lp2Var).c.a;
                        long j2111 = ys0.y(lp2Var).c.a;
                        long j2112 = ys0.y(lp2Var).c.c;
                        long j2113 = ys0.y(lp2Var).c.e;
                        long j2114 = ys0.y(lp2Var).c.a;
                        long j2115 = ys0.y(lp2Var).c.a;
                        long j2116 = ys0.y(lp2Var).c.c;
                        long j2117 = ys0.y(lp2Var).c.e;
                        long j2118 = ys0.y(lp2Var).c.c;
                        long j2119 = ys0.y(lp2Var).c.c;
                        long j314 = ys0.y(lp2Var).c.c;
                        long j315 = ys0.y(lp2Var).k.c;
                        long j316 = ys0.y(lp2Var).c.b;
                        long j317 = ys0.y(lp2Var).c.b;
                        long j318 = ys0.y(lp2Var).c.c;
                        long j319 = ys0.y(lp2Var).c.e;
                        long j3110 = dw0.g;
                        iw0 iw0Var3 = (iw0) lp2Var.j(kw0.a);
                        q06 q06Var3 = i88.a;
                        i48VarA = lh4.O0(iw0Var3, (h88) lp2Var.j(q06Var3)).a(j117, j118, j119, j1110, j1111, j1111, j1111, j1111, j1112, j1113, null, j9, j10, j11, j12, j2110, j2111, j2112, j2113, j2114, j2115, j2116, j2117, j3110, j3110, j3110, j3110, j2118, j2119, j314, j315, j316, j317, j318, j319, j3110, j3110, j3110, j3110, j3110, j3110, j3110, j3110);
                        if (o88Var == null) {
                            lp2Var.W(204085828);
                            o88Var2 = (o88) lp2Var.j(u78.a);
                            lp2Var.p(false);
                        } else {
                            lp2Var.W(204085084);
                            lp2Var.p(false);
                            o88Var2 = o88Var;
                        }
                        jB = o88Var2.b();
                        if (jB == 16) {
                            if (!z5) {
                                jB = i48VarA.c;
                            } else if (z9) {
                                jB = i48VarA.d;
                            } else if (((Boolean) r137.getValue()).booleanValue()) {
                                jB = i48VarA.a;
                            } else {
                                jB = i48VarA.b;
                            }
                        }
                        final o88 o88VarD3 = o88Var2.d(new o88(jB, 0L, null, null, 0L, 0, 0, 0L, 16777214));
                        t06 t06VarA3 = q06Var3.a(i48VarA.k);
                        final wx3 wx3Var6 = wx3Var3;
                        final q80 q80Var5 = q80Var2;
                        final kx4 kx4Var14 = kx4Var3;
                        mb6.a(t06VarA3, jm4.U(1035408509, new rn2() { // from class: uy2
                            @Override // defpackage.rn2
                            public final Object K(Object obj2, Object obj3) {
                                wx3 wx3Var7;
                                lp2 lp2Var2 = (lp2) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                byte b2 = 0;
                                if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    kx4 kx4VarY = hi5.P(kx4Var14, q80Var5).y(kx4Var13);
                                    boolean z13 = z10;
                                    wx3 wx3Var8 = wx3Var6;
                                    if (z13) {
                                        Boolean bool7 = (Boolean) y05Var.getValue();
                                        bool7.getClass();
                                        wx3Var7 = new wx3(wx3Var8.a, wx3Var8.b, wx3Var8.c, wx3Var8.d, bool7, wx3Var8.f);
                                    } else {
                                        wx3Var7 = wx3Var8;
                                    }
                                    final boolean z14 = z9;
                                    final i48 i48Var = i48VarA;
                                    fe7 fe7Var = new fe7(z14 ? i48Var.j : i48Var.i);
                                    zy0 zy0VarU = jm4.U(-1314685591, new wy2(b2, i6, str, kx4Var12), lp2Var2);
                                    final boolean z15 = z5;
                                    final xz4 xz4Var4 = xz4Var3;
                                    zy0 zy0VarU2 = jm4.U(306314943, new rn2() { // from class: xy2
                                        @Override // defpackage.rn2
                                        public final Object K(Object obj4, Object obj5) {
                                            lp2 lp2Var3 = (lp2) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            if (lp2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                lh4.H0.K0(z15, z14, xz4Var4, null, i48Var, null, 0.0f, 0.0f, lp2Var3, 100663680, 232);
                                            } else {
                                                lp2Var3.Q();
                                            }
                                            return dn8.a;
                                        }
                                    }, lp2Var2);
                                    q58 q58Var = new q58();
                                    y68 y68Var2 = y68Var;
                                    w58 w58Var4 = w58Var3;
                                    x30.b(y68Var2, kx4VarY, z15, de3Var3, o88VarD3, wx3Var7, w58Var4, xz4Var4, fe7Var, new z48(y68Var2, w58Var4, q58Var, zy0VarU, rn2Var7, rn2Var8, z15, z14, xz4Var4, gg5Var3, i48Var, zy0VarU2), ay6VarG, lp2Var2, 0, 6, 4744);
                                } else {
                                    lp2Var2.Q();
                                }
                                return dn8.a;
                            }
                        }, lp2Var), lp2Var, 56);
                        z4 = z9;
                        w58Var2 = w58Var3;
                        rn2Var5 = rn2Var7;
                        rn2Var6 = rn2Var8;
                        gg5Var2 = gg5Var3;
                        de3Var2 = de3Var3;
                        ay6Var2 = ay6VarG;
                        kx4Var5 = kx4Var12;
                        i36 = i6;
                        j5 = j9;
                        j6 = j10;
                        j7 = j11;
                        j8 = j12;
                        wx3Var2 = wx3Var6;
                    } else {
                        lp2Var.Q();
                        ay6Var2 = ay6Var;
                        z4 = z;
                        wx3Var2 = wx3Var;
                        de3Var2 = de3Var;
                        gg5Var2 = gg5Var;
                        j5 = j;
                        j6 = j2;
                        j7 = j3;
                        j8 = j4;
                        kx4Var5 = kx4Var4;
                        rn2Var5 = rn2Var3;
                        i36 = i6;
                        rn2Var6 = rn2Var4;
                        z5 = z2;
                        w58Var2 = w58Var;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: vy2
                            @Override // defpackage.rn2
                            public final Object K(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                int iP = w79.P(i2 | 1);
                                int iP2 = w79.P(i3);
                                z91.f(str, gn2Var, kx4Var, kx4Var5, i36, y68Var, ay6Var2, o88Var, rn2Var5, rn2Var6, z4, z5, wx3Var2, w58Var2, de3Var2, gg5Var2, j5, j6, j7, j8, (lp2) obj2, iP, iP2, i4);
                                return dn8.a;
                            }
                        };
                    }
                }
                i25 |= 12582912;
                i31 = i4 & 262144;
                if (i31 != 0) {
                    i25 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    if (lp2Var.e(j2)) {
                        i32 = 67108864;
                    } else {
                        i32 = 33554432;
                    }
                    i25 |= i32;
                }
                i33 = i4 & 524288;
                if (i33 != 0) {
                    i25 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i25 |= lp2Var.e(j3) ? 536870912 : 268435456;
                }
                i34 = i25;
                i35 = i4 & 1048576;
                if (i35 != 0) {
                    c2 = 6;
                } else if (lp2Var.e(j4)) {
                    c2 = 4;
                } else {
                    c2 = 2;
                }
                if ((i7 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (lp2Var.N(i7 & 1, z3)) {
                    lp2Var.S();
                    i37 = i2 & 1;
                    kx4VarT = hx4.X;
                    if (i37 != 0) {
                        if (i42 != 0) {
                            kx4Var4 = kx4VarT;
                        }
                        if ((i4 & 16) != 0) {
                            i7 &= -57345;
                            i6 = 5;
                        }
                        ay6VarG = dh3.G(lp2Var);
                        int i411 = i7 & (-3670017);
                        if (i8 != 0) {
                            rn2Var3 = null;
                        }
                        if (i10 != 0) {
                            rn2Var4 = null;
                        }
                        if (i14 != 0) {
                            z6 = false;
                        } else {
                            z6 = z;
                        }
                        if (i17 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i21 != 0) {
                            wx3Var3 = wx3.g;
                        } else {
                            wx3Var3 = wx3Var;
                        }
                        if (i24 != 0) {
                            w58Var3 = qe4.x0;
                        } else {
                            w58Var3 = w58Var;
                        }
                        if (i26 != 0) {
                            de3Var3 = null;
                        } else {
                            de3Var3 = de3Var;
                        }
                        if (i28 != 0) {
                            ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            ig5Var = gg5Var;
                        }
                        if (i30 != 0) {
                            j9 = dw0.f;
                        } else {
                            j9 = j;
                        }
                        if (i31 != 0) {
                            j10 = dw0.f;
                        } else {
                            j10 = j2;
                        }
                        if (i33 != 0) {
                            j11 = dw0.f;
                        } else {
                            j11 = j3;
                        }
                        if (i35 != 0) {
                            j12 = dw0.f;
                        } else {
                            j12 = j4;
                        }
                        gg5Var3 = ig5Var;
                        rn2Var7 = rn2Var3;
                        i38 = i411;
                        rn2Var8 = rn2Var4;
                    } else {
                        if (i42 != 0) {
                            kx4Var4 = kx4VarT;
                        }
                        if ((i4 & 16) != 0) {
                            i7 &= -57345;
                            i6 = 5;
                        }
                        ay6VarG = dh3.G(lp2Var);
                        int i412 = i7 & (-3670017);
                        if (i8 != 0) {
                            rn2Var3 = null;
                        }
                        if (i10 != 0) {
                            rn2Var4 = null;
                        }
                        if (i14 != 0) {
                            z6 = false;
                        } else {
                            z6 = z;
                        }
                        if (i17 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i21 != 0) {
                            wx3Var3 = wx3.g;
                        } else {
                            wx3Var3 = wx3Var;
                        }
                        if (i24 != 0) {
                            w58Var3 = qe4.x0;
                        } else {
                            w58Var3 = w58Var;
                        }
                        if (i26 != 0) {
                            de3Var3 = null;
                        } else {
                            de3Var3 = de3Var;
                        }
                        if (i28 != 0) {
                            ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            ig5Var = gg5Var;
                        }
                        if (i30 != 0) {
                            j9 = dw0.f;
                        } else {
                            j9 = j;
                        }
                        if (i31 != 0) {
                            j10 = dw0.f;
                        } else {
                            j10 = j2;
                        }
                        if (i33 != 0) {
                            j11 = dw0.f;
                        } else {
                            j11 = j3;
                        }
                        if (i35 != 0) {
                            j12 = dw0.f;
                        } else {
                            j12 = j4;
                        }
                        gg5Var3 = ig5Var;
                        rn2Var7 = rn2Var3;
                        i38 = i412;
                        rn2Var8 = rn2Var4;
                    }
                    lp2Var.q();
                    int i413 = i11;
                    if (((458752 & i38) ^ 196608) <= i413) {
                    }
                    if ((i38 & 112) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z7 | z12;
                    objK = lp2Var.K();
                    obj = zz0.a;
                    if (z8) {
                        objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                        lp2Var.g0(objK);
                    } else {
                        objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                        lp2Var.g0(objK);
                    }
                    u70.h((rn2) objK, lp2Var, y68Var);
                    objK2 = lp2Var.K();
                    if (objK2 == obj) {
                        objK2 = new xz4();
                        lp2Var.g0(objK2);
                    }
                    final xz4 xz4Var4 = (xz4) objK2;
                    y05VarS = km4.s(xz4Var4, lp2Var, 6);
                    zT = oc.t(lp2Var);
                    objK3 = lp2Var.K();
                    if (objK3 == obj) {
                        objK3 = z51.H(Boolean.FALSE);
                        lp2Var.g0(objK3);
                    }
                    y05Var = (y05) objK3;
                    objK4 = lp2Var.K();
                    if (objK4 == obj) {
                        objK4 = new q80();
                        lp2Var.g0(objK4);
                    }
                    q80Var = (q80) objK4;
                    WeakHashMap weakHashMap4 = c29.w;
                    Boolean bool7 = (Boolean) hw7.b(lp2Var).c.d.getValue();
                    zBooleanValue = bool7.booleanValue();
                    final kx4 kx4Var15 = kx4Var4;
                    Boolean boolValueOf4 = Boolean.valueOf(zT);
                    z9 = z6;
                    Boolean bool8 = (Boolean) y05VarS.getValue();
                    bool8.getClass();
                    zG = lp2Var.g(zT) | lp2Var.f(y05VarS) | lp2Var.g(zBooleanValue) | lp2Var.h(q80Var);
                    objK5 = lp2Var.K();
                    if (zG) {
                        objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                        z10 = zT;
                        q80Var2 = q80Var;
                        lp2Var.g0(objK5);
                    } else {
                        objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                        z10 = zT;
                        q80Var2 = q80Var;
                        lp2Var.g0(objK5);
                    }
                    u70.i(boolValueOf4, bool8, bool7, (rn2) objK5, lp2Var);
                    be7Var = (be7) lp2Var.j(y01.q);
                    lp2Var.W(204007653);
                    if (z10) {
                        objK6 = lp2Var.K();
                        if (objK6 == obj) {
                            objK6 = new gh(y05Var, (byte) 6);
                            lp2Var.g0(objK6);
                        }
                        kx4 kx4VarJ4 = z51.J(kx4VarT, (gn2) objK6);
                        if ((i34 & 896) == 256) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zF = z11 | lp2Var.f(r137) | lp2Var.f(be7Var);
                        objK7 = lp2Var.K();
                        if (zF) {
                            objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                            lp2Var.g0(objK7);
                        } else {
                            objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                            lp2Var.g0(objK7);
                        }
                        kx4VarT = mb6.T(kx4VarJ4, (gn2) objK7);
                    }
                    final kx4 kx4Var16 = kx4VarT;
                    lp2Var.p(false);
                    long j1114 = ys0.y(lp2Var).c.a;
                    long j1115 = ys0.y(lp2Var).c.a;
                    long j1116 = ys0.y(lp2Var).c.c;
                    long j1117 = ys0.y(lp2Var).c.e;
                    long j1118 = dw0.f;
                    long j1119 = ys0.y(lp2Var).k.a;
                    long j11110 = ys0.y(lp2Var).k.c;
                    long j21110 = ys0.y(lp2Var).c.a;
                    long j21111 = ys0.y(lp2Var).c.a;
                    long j21112 = ys0.y(lp2Var).c.c;
                    long j21113 = ys0.y(lp2Var).c.e;
                    long j21114 = ys0.y(lp2Var).c.a;
                    long j21115 = ys0.y(lp2Var).c.a;
                    long j21116 = ys0.y(lp2Var).c.c;
                    long j21117 = ys0.y(lp2Var).c.e;
                    long j21118 = ys0.y(lp2Var).c.c;
                    long j21119 = ys0.y(lp2Var).c.c;
                    long j3111 = ys0.y(lp2Var).c.c;
                    long j3112 = ys0.y(lp2Var).k.c;
                    long j3113 = ys0.y(lp2Var).c.b;
                    long j3114 = ys0.y(lp2Var).c.b;
                    long j3115 = ys0.y(lp2Var).c.c;
                    long j3116 = ys0.y(lp2Var).c.e;
                    long j3117 = dw0.g;
                    iw0 iw0Var4 = (iw0) lp2Var.j(kw0.a);
                    q06 q06Var4 = i88.a;
                    i48VarA = lh4.O0(iw0Var4, (h88) lp2Var.j(q06Var4)).a(j1114, j1115, j1116, j1117, j1118, j1118, j1118, j1118, j1119, j11110, null, j9, j10, j11, j12, j21110, j21111, j21112, j21113, j21114, j21115, j21116, j21117, j3117, j3117, j3117, j3117, j21118, j21119, j3111, j3112, j3113, j3114, j3115, j3116, j3117, j3117, j3117, j3117, j3117, j3117, j3117, j3117);
                    if (o88Var == null) {
                        lp2Var.W(204085828);
                        o88Var2 = (o88) lp2Var.j(u78.a);
                        lp2Var.p(false);
                    } else {
                        lp2Var.W(204085084);
                        lp2Var.p(false);
                        o88Var2 = o88Var;
                    }
                    jB = o88Var2.b();
                    if (jB == 16) {
                        if (!z5) {
                            jB = i48VarA.c;
                        } else if (z9) {
                            jB = i48VarA.d;
                        } else if (((Boolean) r137.getValue()).booleanValue()) {
                            jB = i48VarA.a;
                        } else {
                            jB = i48VarA.b;
                        }
                    }
                    final o88 o88VarD4 = o88Var2.d(new o88(jB, 0L, null, null, 0L, 0, 0, 0L, 16777214));
                    t06 t06VarA4 = q06Var4.a(i48VarA.k);
                    final wx3 wx3Var7 = wx3Var3;
                    final q80 q80Var6 = q80Var2;
                    final kx4 kx4Var17 = kx4Var3;
                    mb6.a(t06VarA4, jm4.U(1035408509, new rn2() { // from class: uy2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            wx3 wx3Var8;
                            lp2 lp2Var2 = (lp2) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            byte b2 = 0;
                            if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                kx4 kx4VarY = hi5.P(kx4Var17, q80Var6).y(kx4Var16);
                                boolean z13 = z10;
                                wx3 wx3Var9 = wx3Var7;
                                if (z13) {
                                    Boolean bool9 = (Boolean) y05Var.getValue();
                                    bool9.getClass();
                                    wx3Var8 = new wx3(wx3Var9.a, wx3Var9.b, wx3Var9.c, wx3Var9.d, bool9, wx3Var9.f);
                                } else {
                                    wx3Var8 = wx3Var9;
                                }
                                final boolean z14 = z9;
                                final i48 i48Var = i48VarA;
                                fe7 fe7Var = new fe7(z14 ? i48Var.j : i48Var.i);
                                zy0 zy0VarU = jm4.U(-1314685591, new wy2(b2, i6, str, kx4Var15), lp2Var2);
                                final boolean z15 = z5;
                                final xz4 xz4Var5 = xz4Var4;
                                zy0 zy0VarU2 = jm4.U(306314943, new rn2() { // from class: xy2
                                    @Override // defpackage.rn2
                                    public final Object K(Object obj4, Object obj5) {
                                        lp2 lp2Var3 = (lp2) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        if (lp2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            lh4.H0.K0(z15, z14, xz4Var5, null, i48Var, null, 0.0f, 0.0f, lp2Var3, 100663680, 232);
                                        } else {
                                            lp2Var3.Q();
                                        }
                                        return dn8.a;
                                    }
                                }, lp2Var2);
                                q58 q58Var = new q58();
                                y68 y68Var2 = y68Var;
                                w58 w58Var4 = w58Var3;
                                x30.b(y68Var2, kx4VarY, z15, de3Var3, o88VarD4, wx3Var8, w58Var4, xz4Var5, fe7Var, new z48(y68Var2, w58Var4, q58Var, zy0VarU, rn2Var7, rn2Var8, z15, z14, xz4Var5, gg5Var3, i48Var, zy0VarU2), ay6VarG, lp2Var2, 0, 6, 4744);
                            } else {
                                lp2Var2.Q();
                            }
                            return dn8.a;
                        }
                    }, lp2Var), lp2Var, 56);
                    z4 = z9;
                    w58Var2 = w58Var3;
                    rn2Var5 = rn2Var7;
                    rn2Var6 = rn2Var8;
                    gg5Var2 = gg5Var3;
                    de3Var2 = de3Var3;
                    ay6Var2 = ay6VarG;
                    kx4Var5 = kx4Var15;
                    i36 = i6;
                    j5 = j9;
                    j6 = j10;
                    j7 = j11;
                    j8 = j12;
                    wx3Var2 = wx3Var7;
                } else {
                    lp2Var.Q();
                    ay6Var2 = ay6Var;
                    z4 = z;
                    wx3Var2 = wx3Var;
                    de3Var2 = de3Var;
                    gg5Var2 = gg5Var;
                    j5 = j;
                    j6 = j2;
                    j7 = j3;
                    j8 = j4;
                    kx4Var5 = kx4Var4;
                    rn2Var5 = rn2Var3;
                    i36 = i6;
                    rn2Var6 = rn2Var4;
                    z5 = z2;
                    w58Var2 = w58Var;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: vy2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iP = w79.P(i2 | 1);
                            int iP2 = w79.P(i3);
                            z91.f(str, gn2Var, kx4Var, kx4Var5, i36, y68Var, ay6Var2, o88Var, rn2Var5, rn2Var6, z4, z5, wx3Var2, w58Var2, de3Var2, gg5Var2, j5, j6, j7, j8, (lp2) obj2, iP, iP2, i4);
                            return dn8.a;
                        }
                    };
                }
            }
            i7 = i5 | 905969664;
            rn2Var3 = rn2Var;
            i10 = i4 & 1024;
            if (i10 != 0) {
                rn2Var4 = rn2Var2;
                i12 = i3 | 6;
                i11 = 131072;
            } else {
                rn2Var4 = rn2Var2;
                if ((i3 & 6) == 0) {
                    i11 = 131072;
                    if (lp2Var.h(rn2Var4)) {
                        i13 = 4;
                    } else {
                        i13 = 2;
                    }
                    i12 = i3 | i13;
                } else {
                    i11 = 131072;
                    i12 = i3;
                }
            }
            i14 = i4 & 2048;
            if (i14 != 0) {
                i12 |= 48;
            } else if ((i3 & 48) == 0) {
                if (lp2Var.g(z)) {
                    i15 = 32;
                } else {
                    i15 = 16;
                }
                i12 |= i15;
            }
            i16 = i12;
            i17 = i4 & 4096;
            if (i17 != 0) {
                i19 = i16 | 384;
            } else {
                i18 = i16;
                if ((i3 & 384) != 0) {
                    if (lp2Var.g(z2)) {
                        i20 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i20 = 128;
                    }
                    i18 |= i20;
                }
                i19 = i18;
            }
            i21 = i4 & 8192;
            if (i21 != 0) {
                i23 = i19 | 3072;
            } else {
                i22 = i19;
                if ((i3 & 3072) == 0) {
                    i23 = i22 | (lp2Var.f(wx3Var) ? 2048 : 1024);
                } else {
                    i23 = i22;
                }
            }
            i24 = i4 & Http2.INITIAL_MAX_FRAME_SIZE;
            if (i24 != 0) {
                i25 = i23;
                if ((i3 & 24576) == 0) {
                    i25 |= lp2Var.f(w58Var) ? 16384 : 8192;
                }
                i26 = i4 & 32768;
                if (i26 != 0) {
                    i25 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (lp2Var.f(de3Var)) {
                        i27 = i11;
                    } else {
                        i27 = 65536;
                    }
                    i25 |= i27;
                }
                i28 = i4 & DnsOverHttps.MAX_RESPONSE_SIZE;
                if (i28 != 0) {
                    i25 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (lp2Var.f(gg5Var)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i25 |= i29;
                }
                i30 = i4 & i11;
                if (i30 != 0) {
                    if ((i3 & 12582912) == 0) {
                        i25 |= lp2Var.e(j) ? 8388608 : 4194304;
                    }
                    i31 = i4 & 262144;
                    if (i31 != 0) {
                        i25 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        if (lp2Var.e(j2)) {
                            i32 = 67108864;
                        } else {
                            i32 = 33554432;
                        }
                        i25 |= i32;
                    }
                    i33 = i4 & 524288;
                    if (i33 != 0) {
                        i25 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i25 |= lp2Var.e(j3) ? 536870912 : 268435456;
                    }
                    i34 = i25;
                    i35 = i4 & 1048576;
                    if (i35 != 0) {
                        c2 = 6;
                    } else if (lp2Var.e(j4)) {
                        c2 = 4;
                    } else {
                        c2 = 2;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (lp2Var.N(i7 & 1, z3)) {
                        lp2Var.S();
                        i37 = i2 & 1;
                        kx4VarT = hx4.X;
                        if (i37 != 0) {
                            if (i42 != 0) {
                                kx4Var4 = kx4VarT;
                            }
                            if ((i4 & 16) != 0) {
                                i7 &= -57345;
                                i6 = 5;
                            }
                            ay6VarG = dh3.G(lp2Var);
                            int i414 = i7 & (-3670017);
                            if (i8 != 0) {
                                rn2Var3 = null;
                            }
                            if (i10 != 0) {
                                rn2Var4 = null;
                            }
                            if (i14 != 0) {
                                z6 = false;
                            } else {
                                z6 = z;
                            }
                            if (i17 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            if (i21 != 0) {
                                wx3Var3 = wx3.g;
                            } else {
                                wx3Var3 = wx3Var;
                            }
                            if (i24 != 0) {
                                w58Var3 = qe4.x0;
                            } else {
                                w58Var3 = w58Var;
                            }
                            if (i26 != 0) {
                                de3Var3 = null;
                            } else {
                                de3Var3 = de3Var;
                            }
                            if (i28 != 0) {
                                ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                ig5Var = gg5Var;
                            }
                            if (i30 != 0) {
                                j9 = dw0.f;
                            } else {
                                j9 = j;
                            }
                            if (i31 != 0) {
                                j10 = dw0.f;
                            } else {
                                j10 = j2;
                            }
                            if (i33 != 0) {
                                j11 = dw0.f;
                            } else {
                                j11 = j3;
                            }
                            if (i35 != 0) {
                                j12 = dw0.f;
                            } else {
                                j12 = j4;
                            }
                            gg5Var3 = ig5Var;
                            rn2Var7 = rn2Var3;
                            i38 = i414;
                            rn2Var8 = rn2Var4;
                        } else {
                            if (i42 != 0) {
                                kx4Var4 = kx4VarT;
                            }
                            if ((i4 & 16) != 0) {
                                i7 &= -57345;
                                i6 = 5;
                            }
                            ay6VarG = dh3.G(lp2Var);
                            int i415 = i7 & (-3670017);
                            if (i8 != 0) {
                                rn2Var3 = null;
                            }
                            if (i10 != 0) {
                                rn2Var4 = null;
                            }
                            if (i14 != 0) {
                                z6 = false;
                            } else {
                                z6 = z;
                            }
                            if (i17 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            if (i21 != 0) {
                                wx3Var3 = wx3.g;
                            } else {
                                wx3Var3 = wx3Var;
                            }
                            if (i24 != 0) {
                                w58Var3 = qe4.x0;
                            } else {
                                w58Var3 = w58Var;
                            }
                            if (i26 != 0) {
                                de3Var3 = null;
                            } else {
                                de3Var3 = de3Var;
                            }
                            if (i28 != 0) {
                                ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                ig5Var = gg5Var;
                            }
                            if (i30 != 0) {
                                j9 = dw0.f;
                            } else {
                                j9 = j;
                            }
                            if (i31 != 0) {
                                j10 = dw0.f;
                            } else {
                                j10 = j2;
                            }
                            if (i33 != 0) {
                                j11 = dw0.f;
                            } else {
                                j11 = j3;
                            }
                            if (i35 != 0) {
                                j12 = dw0.f;
                            } else {
                                j12 = j4;
                            }
                            gg5Var3 = ig5Var;
                            rn2Var7 = rn2Var3;
                            i38 = i415;
                            rn2Var8 = rn2Var4;
                        }
                        lp2Var.q();
                        int i416 = i11;
                        if (((458752 & i38) ^ 196608) <= i416) {
                        }
                        if ((i38 & 112) == 32) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = z7 | z12;
                        objK = lp2Var.K();
                        obj = zz0.a;
                        if (z8) {
                            objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                            lp2Var.g0(objK);
                        } else {
                            objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                            lp2Var.g0(objK);
                        }
                        u70.h((rn2) objK, lp2Var, y68Var);
                        objK2 = lp2Var.K();
                        if (objK2 == obj) {
                            objK2 = new xz4();
                            lp2Var.g0(objK2);
                        }
                        final xz4 xz4Var5 = (xz4) objK2;
                        y05VarS = km4.s(xz4Var5, lp2Var, 6);
                        zT = oc.t(lp2Var);
                        objK3 = lp2Var.K();
                        if (objK3 == obj) {
                            objK3 = z51.H(Boolean.FALSE);
                            lp2Var.g0(objK3);
                        }
                        y05Var = (y05) objK3;
                        objK4 = lp2Var.K();
                        if (objK4 == obj) {
                            objK4 = new q80();
                            lp2Var.g0(objK4);
                        }
                        q80Var = (q80) objK4;
                        WeakHashMap weakHashMap5 = c29.w;
                        Boolean bool9 = (Boolean) hw7.b(lp2Var).c.d.getValue();
                        zBooleanValue = bool9.booleanValue();
                        final kx4 kx4Var18 = kx4Var4;
                        Boolean boolValueOf5 = Boolean.valueOf(zT);
                        z9 = z6;
                        Boolean bool10 = (Boolean) y05VarS.getValue();
                        bool10.getClass();
                        zG = lp2Var.g(zT) | lp2Var.f(y05VarS) | lp2Var.g(zBooleanValue) | lp2Var.h(q80Var);
                        objK5 = lp2Var.K();
                        if (zG) {
                            objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                            z10 = zT;
                            q80Var2 = q80Var;
                            lp2Var.g0(objK5);
                        } else {
                            objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                            z10 = zT;
                            q80Var2 = q80Var;
                            lp2Var.g0(objK5);
                        }
                        u70.i(boolValueOf5, bool10, bool9, (rn2) objK5, lp2Var);
                        be7Var = (be7) lp2Var.j(y01.q);
                        lp2Var.W(204007653);
                        if (z10) {
                            objK6 = lp2Var.K();
                            if (objK6 == obj) {
                                objK6 = new gh(y05Var, (byte) 6);
                                lp2Var.g0(objK6);
                            }
                            kx4 kx4VarJ5 = z51.J(kx4VarT, (gn2) objK6);
                            if ((i34 & 896) == 256) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            zF = z11 | lp2Var.f(r137) | lp2Var.f(be7Var);
                            objK7 = lp2Var.K();
                            if (zF) {
                                objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                                lp2Var.g0(objK7);
                            } else {
                                objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                                lp2Var.g0(objK7);
                            }
                            kx4VarT = mb6.T(kx4VarJ5, (gn2) objK7);
                        }
                        final kx4 kx4Var19 = kx4VarT;
                        lp2Var.p(false);
                        long j11111 = ys0.y(lp2Var).c.a;
                        long j11112 = ys0.y(lp2Var).c.a;
                        long j11113 = ys0.y(lp2Var).c.c;
                        long j11114 = ys0.y(lp2Var).c.e;
                        long j11115 = dw0.f;
                        long j11116 = ys0.y(lp2Var).k.a;
                        long j11117 = ys0.y(lp2Var).k.c;
                        long j211110 = ys0.y(lp2Var).c.a;
                        long j211111 = ys0.y(lp2Var).c.a;
                        long j211112 = ys0.y(lp2Var).c.c;
                        long j211113 = ys0.y(lp2Var).c.e;
                        long j211114 = ys0.y(lp2Var).c.a;
                        long j211115 = ys0.y(lp2Var).c.a;
                        long j211116 = ys0.y(lp2Var).c.c;
                        long j211117 = ys0.y(lp2Var).c.e;
                        long j211118 = ys0.y(lp2Var).c.c;
                        long j211119 = ys0.y(lp2Var).c.c;
                        long j3118 = ys0.y(lp2Var).c.c;
                        long j3119 = ys0.y(lp2Var).k.c;
                        long j31110 = ys0.y(lp2Var).c.b;
                        long j31111 = ys0.y(lp2Var).c.b;
                        long j31112 = ys0.y(lp2Var).c.c;
                        long j31113 = ys0.y(lp2Var).c.e;
                        long j31114 = dw0.g;
                        iw0 iw0Var5 = (iw0) lp2Var.j(kw0.a);
                        q06 q06Var5 = i88.a;
                        i48VarA = lh4.O0(iw0Var5, (h88) lp2Var.j(q06Var5)).a(j11111, j11112, j11113, j11114, j11115, j11115, j11115, j11115, j11116, j11117, null, j9, j10, j11, j12, j211110, j211111, j211112, j211113, j211114, j211115, j211116, j211117, j31114, j31114, j31114, j31114, j211118, j211119, j3118, j3119, j31110, j31111, j31112, j31113, j31114, j31114, j31114, j31114, j31114, j31114, j31114, j31114);
                        if (o88Var == null) {
                            lp2Var.W(204085828);
                            o88Var2 = (o88) lp2Var.j(u78.a);
                            lp2Var.p(false);
                        } else {
                            lp2Var.W(204085084);
                            lp2Var.p(false);
                            o88Var2 = o88Var;
                        }
                        jB = o88Var2.b();
                        if (jB == 16) {
                            if (!z5) {
                                jB = i48VarA.c;
                            } else if (z9) {
                                jB = i48VarA.d;
                            } else if (((Boolean) r137.getValue()).booleanValue()) {
                                jB = i48VarA.a;
                            } else {
                                jB = i48VarA.b;
                            }
                        }
                        final o88 o88VarD5 = o88Var2.d(new o88(jB, 0L, null, null, 0L, 0, 0, 0L, 16777214));
                        t06 t06VarA5 = q06Var5.a(i48VarA.k);
                        final wx3 wx3Var8 = wx3Var3;
                        final q80 q80Var7 = q80Var2;
                        final kx4 kx4Var110 = kx4Var3;
                        mb6.a(t06VarA5, jm4.U(1035408509, new rn2() { // from class: uy2
                            @Override // defpackage.rn2
                            public final Object K(Object obj2, Object obj3) {
                                wx3 wx3Var9;
                                lp2 lp2Var2 = (lp2) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                byte b2 = 0;
                                if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    kx4 kx4VarY = hi5.P(kx4Var110, q80Var7).y(kx4Var19);
                                    boolean z13 = z10;
                                    wx3 wx3Var10 = wx3Var8;
                                    if (z13) {
                                        Boolean bool11 = (Boolean) y05Var.getValue();
                                        bool11.getClass();
                                        wx3Var9 = new wx3(wx3Var10.a, wx3Var10.b, wx3Var10.c, wx3Var10.d, bool11, wx3Var10.f);
                                    } else {
                                        wx3Var9 = wx3Var10;
                                    }
                                    final boolean z14 = z9;
                                    final i48 i48Var = i48VarA;
                                    fe7 fe7Var = new fe7(z14 ? i48Var.j : i48Var.i);
                                    zy0 zy0VarU = jm4.U(-1314685591, new wy2(b2, i6, str, kx4Var18), lp2Var2);
                                    final boolean z15 = z5;
                                    final xz4 xz4Var6 = xz4Var5;
                                    zy0 zy0VarU2 = jm4.U(306314943, new rn2() { // from class: xy2
                                        @Override // defpackage.rn2
                                        public final Object K(Object obj4, Object obj5) {
                                            lp2 lp2Var3 = (lp2) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            if (lp2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                lh4.H0.K0(z15, z14, xz4Var6, null, i48Var, null, 0.0f, 0.0f, lp2Var3, 100663680, 232);
                                            } else {
                                                lp2Var3.Q();
                                            }
                                            return dn8.a;
                                        }
                                    }, lp2Var2);
                                    q58 q58Var = new q58();
                                    y68 y68Var2 = y68Var;
                                    w58 w58Var4 = w58Var3;
                                    x30.b(y68Var2, kx4VarY, z15, de3Var3, o88VarD5, wx3Var9, w58Var4, xz4Var6, fe7Var, new z48(y68Var2, w58Var4, q58Var, zy0VarU, rn2Var7, rn2Var8, z15, z14, xz4Var6, gg5Var3, i48Var, zy0VarU2), ay6VarG, lp2Var2, 0, 6, 4744);
                                } else {
                                    lp2Var2.Q();
                                }
                                return dn8.a;
                            }
                        }, lp2Var), lp2Var, 56);
                        z4 = z9;
                        w58Var2 = w58Var3;
                        rn2Var5 = rn2Var7;
                        rn2Var6 = rn2Var8;
                        gg5Var2 = gg5Var3;
                        de3Var2 = de3Var3;
                        ay6Var2 = ay6VarG;
                        kx4Var5 = kx4Var18;
                        i36 = i6;
                        j5 = j9;
                        j6 = j10;
                        j7 = j11;
                        j8 = j12;
                        wx3Var2 = wx3Var8;
                    } else {
                        lp2Var.Q();
                        ay6Var2 = ay6Var;
                        z4 = z;
                        wx3Var2 = wx3Var;
                        de3Var2 = de3Var;
                        gg5Var2 = gg5Var;
                        j5 = j;
                        j6 = j2;
                        j7 = j3;
                        j8 = j4;
                        kx4Var5 = kx4Var4;
                        rn2Var5 = rn2Var3;
                        i36 = i6;
                        rn2Var6 = rn2Var4;
                        z5 = z2;
                        w58Var2 = w58Var;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: vy2
                            @Override // defpackage.rn2
                            public final Object K(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                int iP = w79.P(i2 | 1);
                                int iP2 = w79.P(i3);
                                z91.f(str, gn2Var, kx4Var, kx4Var5, i36, y68Var, ay6Var2, o88Var, rn2Var5, rn2Var6, z4, z5, wx3Var2, w58Var2, de3Var2, gg5Var2, j5, j6, j7, j8, (lp2) obj2, iP, iP2, i4);
                                return dn8.a;
                            }
                        };
                    }
                }
                i25 |= 12582912;
                i31 = i4 & 262144;
                if (i31 != 0) {
                    i25 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    if (lp2Var.e(j2)) {
                        i32 = 67108864;
                    } else {
                        i32 = 33554432;
                    }
                    i25 |= i32;
                }
                i33 = i4 & 524288;
                if (i33 != 0) {
                    i25 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i25 |= lp2Var.e(j3) ? 536870912 : 268435456;
                }
                i34 = i25;
                i35 = i4 & 1048576;
                if (i35 != 0) {
                    c2 = 6;
                } else if (lp2Var.e(j4)) {
                    c2 = 4;
                } else {
                    c2 = 2;
                }
                if ((i7 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (lp2Var.N(i7 & 1, z3)) {
                    lp2Var.S();
                    i37 = i2 & 1;
                    kx4VarT = hx4.X;
                    if (i37 != 0) {
                        if (i42 != 0) {
                            kx4Var4 = kx4VarT;
                        }
                        if ((i4 & 16) != 0) {
                            i7 &= -57345;
                            i6 = 5;
                        }
                        ay6VarG = dh3.G(lp2Var);
                        int i417 = i7 & (-3670017);
                        if (i8 != 0) {
                            rn2Var3 = null;
                        }
                        if (i10 != 0) {
                            rn2Var4 = null;
                        }
                        if (i14 != 0) {
                            z6 = false;
                        } else {
                            z6 = z;
                        }
                        if (i17 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i21 != 0) {
                            wx3Var3 = wx3.g;
                        } else {
                            wx3Var3 = wx3Var;
                        }
                        if (i24 != 0) {
                            w58Var3 = qe4.x0;
                        } else {
                            w58Var3 = w58Var;
                        }
                        if (i26 != 0) {
                            de3Var3 = null;
                        } else {
                            de3Var3 = de3Var;
                        }
                        if (i28 != 0) {
                            ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            ig5Var = gg5Var;
                        }
                        if (i30 != 0) {
                            j9 = dw0.f;
                        } else {
                            j9 = j;
                        }
                        if (i31 != 0) {
                            j10 = dw0.f;
                        } else {
                            j10 = j2;
                        }
                        if (i33 != 0) {
                            j11 = dw0.f;
                        } else {
                            j11 = j3;
                        }
                        if (i35 != 0) {
                            j12 = dw0.f;
                        } else {
                            j12 = j4;
                        }
                        gg5Var3 = ig5Var;
                        rn2Var7 = rn2Var3;
                        i38 = i417;
                        rn2Var8 = rn2Var4;
                    } else {
                        if (i42 != 0) {
                            kx4Var4 = kx4VarT;
                        }
                        if ((i4 & 16) != 0) {
                            i7 &= -57345;
                            i6 = 5;
                        }
                        ay6VarG = dh3.G(lp2Var);
                        int i418 = i7 & (-3670017);
                        if (i8 != 0) {
                            rn2Var3 = null;
                        }
                        if (i10 != 0) {
                            rn2Var4 = null;
                        }
                        if (i14 != 0) {
                            z6 = false;
                        } else {
                            z6 = z;
                        }
                        if (i17 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i21 != 0) {
                            wx3Var3 = wx3.g;
                        } else {
                            wx3Var3 = wx3Var;
                        }
                        if (i24 != 0) {
                            w58Var3 = qe4.x0;
                        } else {
                            w58Var3 = w58Var;
                        }
                        if (i26 != 0) {
                            de3Var3 = null;
                        } else {
                            de3Var3 = de3Var;
                        }
                        if (i28 != 0) {
                            ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            ig5Var = gg5Var;
                        }
                        if (i30 != 0) {
                            j9 = dw0.f;
                        } else {
                            j9 = j;
                        }
                        if (i31 != 0) {
                            j10 = dw0.f;
                        } else {
                            j10 = j2;
                        }
                        if (i33 != 0) {
                            j11 = dw0.f;
                        } else {
                            j11 = j3;
                        }
                        if (i35 != 0) {
                            j12 = dw0.f;
                        } else {
                            j12 = j4;
                        }
                        gg5Var3 = ig5Var;
                        rn2Var7 = rn2Var3;
                        i38 = i418;
                        rn2Var8 = rn2Var4;
                    }
                    lp2Var.q();
                    int i419 = i11;
                    if (((458752 & i38) ^ 196608) <= i419) {
                    }
                    if ((i38 & 112) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z7 | z12;
                    objK = lp2Var.K();
                    obj = zz0.a;
                    if (z8) {
                        objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                        lp2Var.g0(objK);
                    } else {
                        objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                        lp2Var.g0(objK);
                    }
                    u70.h((rn2) objK, lp2Var, y68Var);
                    objK2 = lp2Var.K();
                    if (objK2 == obj) {
                        objK2 = new xz4();
                        lp2Var.g0(objK2);
                    }
                    final xz4 xz4Var6 = (xz4) objK2;
                    y05VarS = km4.s(xz4Var6, lp2Var, 6);
                    zT = oc.t(lp2Var);
                    objK3 = lp2Var.K();
                    if (objK3 == obj) {
                        objK3 = z51.H(Boolean.FALSE);
                        lp2Var.g0(objK3);
                    }
                    y05Var = (y05) objK3;
                    objK4 = lp2Var.K();
                    if (objK4 == obj) {
                        objK4 = new q80();
                        lp2Var.g0(objK4);
                    }
                    q80Var = (q80) objK4;
                    WeakHashMap weakHashMap6 = c29.w;
                    Boolean bool11 = (Boolean) hw7.b(lp2Var).c.d.getValue();
                    zBooleanValue = bool11.booleanValue();
                    final kx4 kx4Var111 = kx4Var4;
                    Boolean boolValueOf6 = Boolean.valueOf(zT);
                    z9 = z6;
                    Boolean bool12 = (Boolean) y05VarS.getValue();
                    bool12.getClass();
                    zG = lp2Var.g(zT) | lp2Var.f(y05VarS) | lp2Var.g(zBooleanValue) | lp2Var.h(q80Var);
                    objK5 = lp2Var.K();
                    if (zG) {
                        objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                        z10 = zT;
                        q80Var2 = q80Var;
                        lp2Var.g0(objK5);
                    } else {
                        objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                        z10 = zT;
                        q80Var2 = q80Var;
                        lp2Var.g0(objK5);
                    }
                    u70.i(boolValueOf6, bool12, bool11, (rn2) objK5, lp2Var);
                    be7Var = (be7) lp2Var.j(y01.q);
                    lp2Var.W(204007653);
                    if (z10) {
                        objK6 = lp2Var.K();
                        if (objK6 == obj) {
                            objK6 = new gh(y05Var, (byte) 6);
                            lp2Var.g0(objK6);
                        }
                        kx4 kx4VarJ6 = z51.J(kx4VarT, (gn2) objK6);
                        if ((i34 & 896) == 256) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zF = z11 | lp2Var.f(r137) | lp2Var.f(be7Var);
                        objK7 = lp2Var.K();
                        if (zF) {
                            objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                            lp2Var.g0(objK7);
                        } else {
                            objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                            lp2Var.g0(objK7);
                        }
                        kx4VarT = mb6.T(kx4VarJ6, (gn2) objK7);
                    }
                    final kx4 kx4Var112 = kx4VarT;
                    lp2Var.p(false);
                    long j11118 = ys0.y(lp2Var).c.a;
                    long j11119 = ys0.y(lp2Var).c.a;
                    long j111110 = ys0.y(lp2Var).c.c;
                    long j111111 = ys0.y(lp2Var).c.e;
                    long j111112 = dw0.f;
                    long j111113 = ys0.y(lp2Var).k.a;
                    long j111114 = ys0.y(lp2Var).k.c;
                    long j2111110 = ys0.y(lp2Var).c.a;
                    long j2111111 = ys0.y(lp2Var).c.a;
                    long j2111112 = ys0.y(lp2Var).c.c;
                    long j2111113 = ys0.y(lp2Var).c.e;
                    long j2111114 = ys0.y(lp2Var).c.a;
                    long j2111115 = ys0.y(lp2Var).c.a;
                    long j2111116 = ys0.y(lp2Var).c.c;
                    long j2111117 = ys0.y(lp2Var).c.e;
                    long j2111118 = ys0.y(lp2Var).c.c;
                    long j2111119 = ys0.y(lp2Var).c.c;
                    long j31115 = ys0.y(lp2Var).c.c;
                    long j31116 = ys0.y(lp2Var).k.c;
                    long j31117 = ys0.y(lp2Var).c.b;
                    long j31118 = ys0.y(lp2Var).c.b;
                    long j31119 = ys0.y(lp2Var).c.c;
                    long j311110 = ys0.y(lp2Var).c.e;
                    long j311111 = dw0.g;
                    iw0 iw0Var6 = (iw0) lp2Var.j(kw0.a);
                    q06 q06Var6 = i88.a;
                    i48VarA = lh4.O0(iw0Var6, (h88) lp2Var.j(q06Var6)).a(j11118, j11119, j111110, j111111, j111112, j111112, j111112, j111112, j111113, j111114, null, j9, j10, j11, j12, j2111110, j2111111, j2111112, j2111113, j2111114, j2111115, j2111116, j2111117, j311111, j311111, j311111, j311111, j2111118, j2111119, j31115, j31116, j31117, j31118, j31119, j311110, j311111, j311111, j311111, j311111, j311111, j311111, j311111, j311111);
                    if (o88Var == null) {
                        lp2Var.W(204085828);
                        o88Var2 = (o88) lp2Var.j(u78.a);
                        lp2Var.p(false);
                    } else {
                        lp2Var.W(204085084);
                        lp2Var.p(false);
                        o88Var2 = o88Var;
                    }
                    jB = o88Var2.b();
                    if (jB == 16) {
                        if (!z5) {
                            jB = i48VarA.c;
                        } else if (z9) {
                            jB = i48VarA.d;
                        } else if (((Boolean) r137.getValue()).booleanValue()) {
                            jB = i48VarA.a;
                        } else {
                            jB = i48VarA.b;
                        }
                    }
                    final o88 o88VarD6 = o88Var2.d(new o88(jB, 0L, null, null, 0L, 0, 0, 0L, 16777214));
                    t06 t06VarA6 = q06Var6.a(i48VarA.k);
                    final wx3 wx3Var9 = wx3Var3;
                    final q80 q80Var8 = q80Var2;
                    final kx4 kx4Var113 = kx4Var3;
                    mb6.a(t06VarA6, jm4.U(1035408509, new rn2() { // from class: uy2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            wx3 wx3Var10;
                            lp2 lp2Var2 = (lp2) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            byte b2 = 0;
                            if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                kx4 kx4VarY = hi5.P(kx4Var113, q80Var8).y(kx4Var112);
                                boolean z13 = z10;
                                wx3 wx3Var11 = wx3Var9;
                                if (z13) {
                                    Boolean bool13 = (Boolean) y05Var.getValue();
                                    bool13.getClass();
                                    wx3Var10 = new wx3(wx3Var11.a, wx3Var11.b, wx3Var11.c, wx3Var11.d, bool13, wx3Var11.f);
                                } else {
                                    wx3Var10 = wx3Var11;
                                }
                                final boolean z14 = z9;
                                final i48 i48Var = i48VarA;
                                fe7 fe7Var = new fe7(z14 ? i48Var.j : i48Var.i);
                                zy0 zy0VarU = jm4.U(-1314685591, new wy2(b2, i6, str, kx4Var111), lp2Var2);
                                final boolean z15 = z5;
                                final xz4 xz4Var7 = xz4Var6;
                                zy0 zy0VarU2 = jm4.U(306314943, new rn2() { // from class: xy2
                                    @Override // defpackage.rn2
                                    public final Object K(Object obj4, Object obj5) {
                                        lp2 lp2Var3 = (lp2) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        if (lp2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            lh4.H0.K0(z15, z14, xz4Var7, null, i48Var, null, 0.0f, 0.0f, lp2Var3, 100663680, 232);
                                        } else {
                                            lp2Var3.Q();
                                        }
                                        return dn8.a;
                                    }
                                }, lp2Var2);
                                q58 q58Var = new q58();
                                y68 y68Var2 = y68Var;
                                w58 w58Var4 = w58Var3;
                                x30.b(y68Var2, kx4VarY, z15, de3Var3, o88VarD6, wx3Var10, w58Var4, xz4Var7, fe7Var, new z48(y68Var2, w58Var4, q58Var, zy0VarU, rn2Var7, rn2Var8, z15, z14, xz4Var7, gg5Var3, i48Var, zy0VarU2), ay6VarG, lp2Var2, 0, 6, 4744);
                            } else {
                                lp2Var2.Q();
                            }
                            return dn8.a;
                        }
                    }, lp2Var), lp2Var, 56);
                    z4 = z9;
                    w58Var2 = w58Var3;
                    rn2Var5 = rn2Var7;
                    rn2Var6 = rn2Var8;
                    gg5Var2 = gg5Var3;
                    de3Var2 = de3Var3;
                    ay6Var2 = ay6VarG;
                    kx4Var5 = kx4Var111;
                    i36 = i6;
                    j5 = j9;
                    j6 = j10;
                    j7 = j11;
                    j8 = j12;
                    wx3Var2 = wx3Var9;
                } else {
                    lp2Var.Q();
                    ay6Var2 = ay6Var;
                    z4 = z;
                    wx3Var2 = wx3Var;
                    de3Var2 = de3Var;
                    gg5Var2 = gg5Var;
                    j5 = j;
                    j6 = j2;
                    j7 = j3;
                    j8 = j4;
                    kx4Var5 = kx4Var4;
                    rn2Var5 = rn2Var3;
                    i36 = i6;
                    rn2Var6 = rn2Var4;
                    z5 = z2;
                    w58Var2 = w58Var;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: vy2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iP = w79.P(i2 | 1);
                            int iP2 = w79.P(i3);
                            z91.f(str, gn2Var, kx4Var, kx4Var5, i36, y68Var, ay6Var2, o88Var, rn2Var5, rn2Var6, z4, z5, wx3Var2, w58Var2, de3Var2, gg5Var2, j5, j6, j7, j8, (lp2) obj2, iP, iP2, i4);
                            return dn8.a;
                        }
                    };
                }
            }
            i25 = i23 | 24576;
            i26 = i4 & 32768;
            if (i26 != 0) {
                i25 |= 196608;
            } else if ((i3 & 196608) == 0) {
                if (lp2Var.f(de3Var)) {
                    i27 = i11;
                } else {
                    i27 = 65536;
                }
                i25 |= i27;
            }
            i28 = i4 & DnsOverHttps.MAX_RESPONSE_SIZE;
            if (i28 != 0) {
                i25 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (lp2Var.f(gg5Var)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i25 |= i29;
            }
            i30 = i4 & i11;
            if (i30 != 0) {
                if ((i3 & 12582912) == 0) {
                    i25 |= lp2Var.e(j) ? 8388608 : 4194304;
                }
                i31 = i4 & 262144;
                if (i31 != 0) {
                    i25 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    if (lp2Var.e(j2)) {
                        i32 = 67108864;
                    } else {
                        i32 = 33554432;
                    }
                    i25 |= i32;
                }
                i33 = i4 & 524288;
                if (i33 != 0) {
                    i25 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i25 |= lp2Var.e(j3) ? 536870912 : 268435456;
                }
                i34 = i25;
                i35 = i4 & 1048576;
                if (i35 != 0) {
                    c2 = 6;
                } else if (lp2Var.e(j4)) {
                    c2 = 4;
                } else {
                    c2 = 2;
                }
                if ((i7 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (lp2Var.N(i7 & 1, z3)) {
                    lp2Var.S();
                    i37 = i2 & 1;
                    kx4VarT = hx4.X;
                    if (i37 != 0) {
                        if (i42 != 0) {
                            kx4Var4 = kx4VarT;
                        }
                        if ((i4 & 16) != 0) {
                            i7 &= -57345;
                            i6 = 5;
                        }
                        ay6VarG = dh3.G(lp2Var);
                        int i4110 = i7 & (-3670017);
                        if (i8 != 0) {
                            rn2Var3 = null;
                        }
                        if (i10 != 0) {
                            rn2Var4 = null;
                        }
                        if (i14 != 0) {
                            z6 = false;
                        } else {
                            z6 = z;
                        }
                        if (i17 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i21 != 0) {
                            wx3Var3 = wx3.g;
                        } else {
                            wx3Var3 = wx3Var;
                        }
                        if (i24 != 0) {
                            w58Var3 = qe4.x0;
                        } else {
                            w58Var3 = w58Var;
                        }
                        if (i26 != 0) {
                            de3Var3 = null;
                        } else {
                            de3Var3 = de3Var;
                        }
                        if (i28 != 0) {
                            ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            ig5Var = gg5Var;
                        }
                        if (i30 != 0) {
                            j9 = dw0.f;
                        } else {
                            j9 = j;
                        }
                        if (i31 != 0) {
                            j10 = dw0.f;
                        } else {
                            j10 = j2;
                        }
                        if (i33 != 0) {
                            j11 = dw0.f;
                        } else {
                            j11 = j3;
                        }
                        if (i35 != 0) {
                            j12 = dw0.f;
                        } else {
                            j12 = j4;
                        }
                        gg5Var3 = ig5Var;
                        rn2Var7 = rn2Var3;
                        i38 = i4110;
                        rn2Var8 = rn2Var4;
                    } else {
                        if (i42 != 0) {
                            kx4Var4 = kx4VarT;
                        }
                        if ((i4 & 16) != 0) {
                            i7 &= -57345;
                            i6 = 5;
                        }
                        ay6VarG = dh3.G(lp2Var);
                        int i4111 = i7 & (-3670017);
                        if (i8 != 0) {
                            rn2Var3 = null;
                        }
                        if (i10 != 0) {
                            rn2Var4 = null;
                        }
                        if (i14 != 0) {
                            z6 = false;
                        } else {
                            z6 = z;
                        }
                        if (i17 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i21 != 0) {
                            wx3Var3 = wx3.g;
                        } else {
                            wx3Var3 = wx3Var;
                        }
                        if (i24 != 0) {
                            w58Var3 = qe4.x0;
                        } else {
                            w58Var3 = w58Var;
                        }
                        if (i26 != 0) {
                            de3Var3 = null;
                        } else {
                            de3Var3 = de3Var;
                        }
                        if (i28 != 0) {
                            ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            ig5Var = gg5Var;
                        }
                        if (i30 != 0) {
                            j9 = dw0.f;
                        } else {
                            j9 = j;
                        }
                        if (i31 != 0) {
                            j10 = dw0.f;
                        } else {
                            j10 = j2;
                        }
                        if (i33 != 0) {
                            j11 = dw0.f;
                        } else {
                            j11 = j3;
                        }
                        if (i35 != 0) {
                            j12 = dw0.f;
                        } else {
                            j12 = j4;
                        }
                        gg5Var3 = ig5Var;
                        rn2Var7 = rn2Var3;
                        i38 = i4111;
                        rn2Var8 = rn2Var4;
                    }
                    lp2Var.q();
                    int i4112 = i11;
                    if (((458752 & i38) ^ 196608) <= i4112) {
                    }
                    if ((i38 & 112) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z7 | z12;
                    objK = lp2Var.K();
                    obj = zz0.a;
                    if (z8) {
                        objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                        lp2Var.g0(objK);
                    } else {
                        objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                        lp2Var.g0(objK);
                    }
                    u70.h((rn2) objK, lp2Var, y68Var);
                    objK2 = lp2Var.K();
                    if (objK2 == obj) {
                        objK2 = new xz4();
                        lp2Var.g0(objK2);
                    }
                    final xz4 xz4Var7 = (xz4) objK2;
                    y05VarS = km4.s(xz4Var7, lp2Var, 6);
                    zT = oc.t(lp2Var);
                    objK3 = lp2Var.K();
                    if (objK3 == obj) {
                        objK3 = z51.H(Boolean.FALSE);
                        lp2Var.g0(objK3);
                    }
                    y05Var = (y05) objK3;
                    objK4 = lp2Var.K();
                    if (objK4 == obj) {
                        objK4 = new q80();
                        lp2Var.g0(objK4);
                    }
                    q80Var = (q80) objK4;
                    WeakHashMap weakHashMap7 = c29.w;
                    Boolean bool13 = (Boolean) hw7.b(lp2Var).c.d.getValue();
                    zBooleanValue = bool13.booleanValue();
                    final kx4 kx4Var114 = kx4Var4;
                    Boolean boolValueOf7 = Boolean.valueOf(zT);
                    z9 = z6;
                    Boolean bool14 = (Boolean) y05VarS.getValue();
                    bool14.getClass();
                    zG = lp2Var.g(zT) | lp2Var.f(y05VarS) | lp2Var.g(zBooleanValue) | lp2Var.h(q80Var);
                    objK5 = lp2Var.K();
                    if (zG) {
                        objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                        z10 = zT;
                        q80Var2 = q80Var;
                        lp2Var.g0(objK5);
                    } else {
                        objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                        z10 = zT;
                        q80Var2 = q80Var;
                        lp2Var.g0(objK5);
                    }
                    u70.i(boolValueOf7, bool14, bool13, (rn2) objK5, lp2Var);
                    be7Var = (be7) lp2Var.j(y01.q);
                    lp2Var.W(204007653);
                    if (z10) {
                        objK6 = lp2Var.K();
                        if (objK6 == obj) {
                            objK6 = new gh(y05Var, (byte) 6);
                            lp2Var.g0(objK6);
                        }
                        kx4 kx4VarJ7 = z51.J(kx4VarT, (gn2) objK6);
                        if ((i34 & 896) == 256) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zF = z11 | lp2Var.f(r137) | lp2Var.f(be7Var);
                        objK7 = lp2Var.K();
                        if (zF) {
                            objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                            lp2Var.g0(objK7);
                        } else {
                            objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                            lp2Var.g0(objK7);
                        }
                        kx4VarT = mb6.T(kx4VarJ7, (gn2) objK7);
                    }
                    final kx4 kx4Var115 = kx4VarT;
                    lp2Var.p(false);
                    long j111115 = ys0.y(lp2Var).c.a;
                    long j111116 = ys0.y(lp2Var).c.a;
                    long j111117 = ys0.y(lp2Var).c.c;
                    long j111118 = ys0.y(lp2Var).c.e;
                    long j111119 = dw0.f;
                    long j1111110 = ys0.y(lp2Var).k.a;
                    long j1111111 = ys0.y(lp2Var).k.c;
                    long j21111110 = ys0.y(lp2Var).c.a;
                    long j21111111 = ys0.y(lp2Var).c.a;
                    long j21111112 = ys0.y(lp2Var).c.c;
                    long j21111113 = ys0.y(lp2Var).c.e;
                    long j21111114 = ys0.y(lp2Var).c.a;
                    long j21111115 = ys0.y(lp2Var).c.a;
                    long j21111116 = ys0.y(lp2Var).c.c;
                    long j21111117 = ys0.y(lp2Var).c.e;
                    long j21111118 = ys0.y(lp2Var).c.c;
                    long j21111119 = ys0.y(lp2Var).c.c;
                    long j311112 = ys0.y(lp2Var).c.c;
                    long j311113 = ys0.y(lp2Var).k.c;
                    long j311114 = ys0.y(lp2Var).c.b;
                    long j311115 = ys0.y(lp2Var).c.b;
                    long j311116 = ys0.y(lp2Var).c.c;
                    long j311117 = ys0.y(lp2Var).c.e;
                    long j311118 = dw0.g;
                    iw0 iw0Var7 = (iw0) lp2Var.j(kw0.a);
                    q06 q06Var7 = i88.a;
                    i48VarA = lh4.O0(iw0Var7, (h88) lp2Var.j(q06Var7)).a(j111115, j111116, j111117, j111118, j111119, j111119, j111119, j111119, j1111110, j1111111, null, j9, j10, j11, j12, j21111110, j21111111, j21111112, j21111113, j21111114, j21111115, j21111116, j21111117, j311118, j311118, j311118, j311118, j21111118, j21111119, j311112, j311113, j311114, j311115, j311116, j311117, j311118, j311118, j311118, j311118, j311118, j311118, j311118, j311118);
                    if (o88Var == null) {
                        lp2Var.W(204085828);
                        o88Var2 = (o88) lp2Var.j(u78.a);
                        lp2Var.p(false);
                    } else {
                        lp2Var.W(204085084);
                        lp2Var.p(false);
                        o88Var2 = o88Var;
                    }
                    jB = o88Var2.b();
                    if (jB == 16) {
                        if (!z5) {
                            jB = i48VarA.c;
                        } else if (z9) {
                            jB = i48VarA.d;
                        } else if (((Boolean) r137.getValue()).booleanValue()) {
                            jB = i48VarA.a;
                        } else {
                            jB = i48VarA.b;
                        }
                    }
                    final o88 o88VarD7 = o88Var2.d(new o88(jB, 0L, null, null, 0L, 0, 0, 0L, 16777214));
                    t06 t06VarA7 = q06Var7.a(i48VarA.k);
                    final wx3 wx3Var10 = wx3Var3;
                    final q80 q80Var9 = q80Var2;
                    final kx4 kx4Var116 = kx4Var3;
                    mb6.a(t06VarA7, jm4.U(1035408509, new rn2() { // from class: uy2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            wx3 wx3Var11;
                            lp2 lp2Var2 = (lp2) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            byte b2 = 0;
                            if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                kx4 kx4VarY = hi5.P(kx4Var116, q80Var9).y(kx4Var115);
                                boolean z13 = z10;
                                wx3 wx3Var12 = wx3Var10;
                                if (z13) {
                                    Boolean bool15 = (Boolean) y05Var.getValue();
                                    bool15.getClass();
                                    wx3Var11 = new wx3(wx3Var12.a, wx3Var12.b, wx3Var12.c, wx3Var12.d, bool15, wx3Var12.f);
                                } else {
                                    wx3Var11 = wx3Var12;
                                }
                                final boolean z14 = z9;
                                final i48 i48Var = i48VarA;
                                fe7 fe7Var = new fe7(z14 ? i48Var.j : i48Var.i);
                                zy0 zy0VarU = jm4.U(-1314685591, new wy2(b2, i6, str, kx4Var114), lp2Var2);
                                final boolean z15 = z5;
                                final xz4 xz4Var8 = xz4Var7;
                                zy0 zy0VarU2 = jm4.U(306314943, new rn2() { // from class: xy2
                                    @Override // defpackage.rn2
                                    public final Object K(Object obj4, Object obj5) {
                                        lp2 lp2Var3 = (lp2) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        if (lp2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            lh4.H0.K0(z15, z14, xz4Var8, null, i48Var, null, 0.0f, 0.0f, lp2Var3, 100663680, 232);
                                        } else {
                                            lp2Var3.Q();
                                        }
                                        return dn8.a;
                                    }
                                }, lp2Var2);
                                q58 q58Var = new q58();
                                y68 y68Var2 = y68Var;
                                w58 w58Var4 = w58Var3;
                                x30.b(y68Var2, kx4VarY, z15, de3Var3, o88VarD7, wx3Var11, w58Var4, xz4Var8, fe7Var, new z48(y68Var2, w58Var4, q58Var, zy0VarU, rn2Var7, rn2Var8, z15, z14, xz4Var8, gg5Var3, i48Var, zy0VarU2), ay6VarG, lp2Var2, 0, 6, 4744);
                            } else {
                                lp2Var2.Q();
                            }
                            return dn8.a;
                        }
                    }, lp2Var), lp2Var, 56);
                    z4 = z9;
                    w58Var2 = w58Var3;
                    rn2Var5 = rn2Var7;
                    rn2Var6 = rn2Var8;
                    gg5Var2 = gg5Var3;
                    de3Var2 = de3Var3;
                    ay6Var2 = ay6VarG;
                    kx4Var5 = kx4Var114;
                    i36 = i6;
                    j5 = j9;
                    j6 = j10;
                    j7 = j11;
                    j8 = j12;
                    wx3Var2 = wx3Var10;
                } else {
                    lp2Var.Q();
                    ay6Var2 = ay6Var;
                    z4 = z;
                    wx3Var2 = wx3Var;
                    de3Var2 = de3Var;
                    gg5Var2 = gg5Var;
                    j5 = j;
                    j6 = j2;
                    j7 = j3;
                    j8 = j4;
                    kx4Var5 = kx4Var4;
                    rn2Var5 = rn2Var3;
                    i36 = i6;
                    rn2Var6 = rn2Var4;
                    z5 = z2;
                    w58Var2 = w58Var;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: vy2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iP = w79.P(i2 | 1);
                            int iP2 = w79.P(i3);
                            z91.f(str, gn2Var, kx4Var, kx4Var5, i36, y68Var, ay6Var2, o88Var, rn2Var5, rn2Var6, z4, z5, wx3Var2, w58Var2, de3Var2, gg5Var2, j5, j6, j7, j8, (lp2) obj2, iP, iP2, i4);
                            return dn8.a;
                        }
                    };
                }
            }
            i25 |= 12582912;
            i31 = i4 & 262144;
            if (i31 != 0) {
                i25 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                if (lp2Var.e(j2)) {
                    i32 = 67108864;
                } else {
                    i32 = 33554432;
                }
                i25 |= i32;
            }
            i33 = i4 & 524288;
            if (i33 != 0) {
                i25 |= 805306368;
            } else if ((i3 & 805306368) == 0) {
                i25 |= lp2Var.e(j3) ? 536870912 : 268435456;
            }
            i34 = i25;
            i35 = i4 & 1048576;
            if (i35 != 0) {
                c2 = 6;
            } else if (lp2Var.e(j4)) {
                c2 = 4;
            } else {
                c2 = 2;
            }
            if ((i7 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (lp2Var.N(i7 & 1, z3)) {
                lp2Var.S();
                i37 = i2 & 1;
                kx4VarT = hx4.X;
                if (i37 != 0) {
                    if (i42 != 0) {
                        kx4Var4 = kx4VarT;
                    }
                    if ((i4 & 16) != 0) {
                        i7 &= -57345;
                        i6 = 5;
                    }
                    ay6VarG = dh3.G(lp2Var);
                    int i4113 = i7 & (-3670017);
                    if (i8 != 0) {
                        rn2Var3 = null;
                    }
                    if (i10 != 0) {
                        rn2Var4 = null;
                    }
                    if (i14 != 0) {
                        z6 = false;
                    } else {
                        z6 = z;
                    }
                    if (i17 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i21 != 0) {
                        wx3Var3 = wx3.g;
                    } else {
                        wx3Var3 = wx3Var;
                    }
                    if (i24 != 0) {
                        w58Var3 = qe4.x0;
                    } else {
                        w58Var3 = w58Var;
                    }
                    if (i26 != 0) {
                        de3Var3 = null;
                    } else {
                        de3Var3 = de3Var;
                    }
                    if (i28 != 0) {
                        ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        ig5Var = gg5Var;
                    }
                    if (i30 != 0) {
                        j9 = dw0.f;
                    } else {
                        j9 = j;
                    }
                    if (i31 != 0) {
                        j10 = dw0.f;
                    } else {
                        j10 = j2;
                    }
                    if (i33 != 0) {
                        j11 = dw0.f;
                    } else {
                        j11 = j3;
                    }
                    if (i35 != 0) {
                        j12 = dw0.f;
                    } else {
                        j12 = j4;
                    }
                    gg5Var3 = ig5Var;
                    rn2Var7 = rn2Var3;
                    i38 = i4113;
                    rn2Var8 = rn2Var4;
                } else {
                    if (i42 != 0) {
                        kx4Var4 = kx4VarT;
                    }
                    if ((i4 & 16) != 0) {
                        i7 &= -57345;
                        i6 = 5;
                    }
                    ay6VarG = dh3.G(lp2Var);
                    int i4114 = i7 & (-3670017);
                    if (i8 != 0) {
                        rn2Var3 = null;
                    }
                    if (i10 != 0) {
                        rn2Var4 = null;
                    }
                    if (i14 != 0) {
                        z6 = false;
                    } else {
                        z6 = z;
                    }
                    if (i17 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i21 != 0) {
                        wx3Var3 = wx3.g;
                    } else {
                        wx3Var3 = wx3Var;
                    }
                    if (i24 != 0) {
                        w58Var3 = qe4.x0;
                    } else {
                        w58Var3 = w58Var;
                    }
                    if (i26 != 0) {
                        de3Var3 = null;
                    } else {
                        de3Var3 = de3Var;
                    }
                    if (i28 != 0) {
                        ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        ig5Var = gg5Var;
                    }
                    if (i30 != 0) {
                        j9 = dw0.f;
                    } else {
                        j9 = j;
                    }
                    if (i31 != 0) {
                        j10 = dw0.f;
                    } else {
                        j10 = j2;
                    }
                    if (i33 != 0) {
                        j11 = dw0.f;
                    } else {
                        j11 = j3;
                    }
                    if (i35 != 0) {
                        j12 = dw0.f;
                    } else {
                        j12 = j4;
                    }
                    gg5Var3 = ig5Var;
                    rn2Var7 = rn2Var3;
                    i38 = i4114;
                    rn2Var8 = rn2Var4;
                }
                lp2Var.q();
                int i4115 = i11;
                if (((458752 & i38) ^ 196608) <= i4115) {
                }
                if ((i38 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z7 | z12;
                objK = lp2Var.K();
                obj = zz0.a;
                if (z8) {
                    objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                    lp2Var.g0(objK);
                } else {
                    objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                    lp2Var.g0(objK);
                }
                u70.h((rn2) objK, lp2Var, y68Var);
                objK2 = lp2Var.K();
                if (objK2 == obj) {
                    objK2 = new xz4();
                    lp2Var.g0(objK2);
                }
                final xz4 xz4Var8 = (xz4) objK2;
                y05VarS = km4.s(xz4Var8, lp2Var, 6);
                zT = oc.t(lp2Var);
                objK3 = lp2Var.K();
                if (objK3 == obj) {
                    objK3 = z51.H(Boolean.FALSE);
                    lp2Var.g0(objK3);
                }
                y05Var = (y05) objK3;
                objK4 = lp2Var.K();
                if (objK4 == obj) {
                    objK4 = new q80();
                    lp2Var.g0(objK4);
                }
                q80Var = (q80) objK4;
                WeakHashMap weakHashMap8 = c29.w;
                Boolean bool15 = (Boolean) hw7.b(lp2Var).c.d.getValue();
                zBooleanValue = bool15.booleanValue();
                final kx4 kx4Var117 = kx4Var4;
                Boolean boolValueOf8 = Boolean.valueOf(zT);
                z9 = z6;
                Boolean bool16 = (Boolean) y05VarS.getValue();
                bool16.getClass();
                zG = lp2Var.g(zT) | lp2Var.f(y05VarS) | lp2Var.g(zBooleanValue) | lp2Var.h(q80Var);
                objK5 = lp2Var.K();
                if (zG) {
                    objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                    z10 = zT;
                    q80Var2 = q80Var;
                    lp2Var.g0(objK5);
                } else {
                    objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                    z10 = zT;
                    q80Var2 = q80Var;
                    lp2Var.g0(objK5);
                }
                u70.i(boolValueOf8, bool16, bool15, (rn2) objK5, lp2Var);
                be7Var = (be7) lp2Var.j(y01.q);
                lp2Var.W(204007653);
                if (z10) {
                    objK6 = lp2Var.K();
                    if (objK6 == obj) {
                        objK6 = new gh(y05Var, (byte) 6);
                        lp2Var.g0(objK6);
                    }
                    kx4 kx4VarJ8 = z51.J(kx4VarT, (gn2) objK6);
                    if ((i34 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zF = z11 | lp2Var.f(r137) | lp2Var.f(be7Var);
                    objK7 = lp2Var.K();
                    if (zF) {
                        objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                        lp2Var.g0(objK7);
                    } else {
                        objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                        lp2Var.g0(objK7);
                    }
                    kx4VarT = mb6.T(kx4VarJ8, (gn2) objK7);
                }
                final kx4 kx4Var118 = kx4VarT;
                lp2Var.p(false);
                long j1111112 = ys0.y(lp2Var).c.a;
                long j1111113 = ys0.y(lp2Var).c.a;
                long j1111114 = ys0.y(lp2Var).c.c;
                long j1111115 = ys0.y(lp2Var).c.e;
                long j1111116 = dw0.f;
                long j1111117 = ys0.y(lp2Var).k.a;
                long j1111118 = ys0.y(lp2Var).k.c;
                long j211111110 = ys0.y(lp2Var).c.a;
                long j211111111 = ys0.y(lp2Var).c.a;
                long j211111112 = ys0.y(lp2Var).c.c;
                long j211111113 = ys0.y(lp2Var).c.e;
                long j211111114 = ys0.y(lp2Var).c.a;
                long j211111115 = ys0.y(lp2Var).c.a;
                long j211111116 = ys0.y(lp2Var).c.c;
                long j211111117 = ys0.y(lp2Var).c.e;
                long j211111118 = ys0.y(lp2Var).c.c;
                long j211111119 = ys0.y(lp2Var).c.c;
                long j311119 = ys0.y(lp2Var).c.c;
                long j3111110 = ys0.y(lp2Var).k.c;
                long j3111111 = ys0.y(lp2Var).c.b;
                long j3111112 = ys0.y(lp2Var).c.b;
                long j3111113 = ys0.y(lp2Var).c.c;
                long j3111114 = ys0.y(lp2Var).c.e;
                long j3111115 = dw0.g;
                iw0 iw0Var8 = (iw0) lp2Var.j(kw0.a);
                q06 q06Var8 = i88.a;
                i48VarA = lh4.O0(iw0Var8, (h88) lp2Var.j(q06Var8)).a(j1111112, j1111113, j1111114, j1111115, j1111116, j1111116, j1111116, j1111116, j1111117, j1111118, null, j9, j10, j11, j12, j211111110, j211111111, j211111112, j211111113, j211111114, j211111115, j211111116, j211111117, j3111115, j3111115, j3111115, j3111115, j211111118, j211111119, j311119, j3111110, j3111111, j3111112, j3111113, j3111114, j3111115, j3111115, j3111115, j3111115, j3111115, j3111115, j3111115, j3111115);
                if (o88Var == null) {
                    lp2Var.W(204085828);
                    o88Var2 = (o88) lp2Var.j(u78.a);
                    lp2Var.p(false);
                } else {
                    lp2Var.W(204085084);
                    lp2Var.p(false);
                    o88Var2 = o88Var;
                }
                jB = o88Var2.b();
                if (jB == 16) {
                    if (!z5) {
                        jB = i48VarA.c;
                    } else if (z9) {
                        jB = i48VarA.d;
                    } else if (((Boolean) r137.getValue()).booleanValue()) {
                        jB = i48VarA.a;
                    } else {
                        jB = i48VarA.b;
                    }
                }
                final o88 o88VarD8 = o88Var2.d(new o88(jB, 0L, null, null, 0L, 0, 0, 0L, 16777214));
                t06 t06VarA8 = q06Var8.a(i48VarA.k);
                final wx3 wx3Var11 = wx3Var3;
                final q80 q80Var10 = q80Var2;
                final kx4 kx4Var119 = kx4Var3;
                mb6.a(t06VarA8, jm4.U(1035408509, new rn2() { // from class: uy2
                    @Override // defpackage.rn2
                    public final Object K(Object obj2, Object obj3) {
                        wx3 wx3Var12;
                        lp2 lp2Var2 = (lp2) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        byte b2 = 0;
                        if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                            kx4 kx4VarY = hi5.P(kx4Var119, q80Var10).y(kx4Var118);
                            boolean z13 = z10;
                            wx3 wx3Var13 = wx3Var11;
                            if (z13) {
                                Boolean bool17 = (Boolean) y05Var.getValue();
                                bool17.getClass();
                                wx3Var12 = new wx3(wx3Var13.a, wx3Var13.b, wx3Var13.c, wx3Var13.d, bool17, wx3Var13.f);
                            } else {
                                wx3Var12 = wx3Var13;
                            }
                            final boolean z14 = z9;
                            final i48 i48Var = i48VarA;
                            fe7 fe7Var = new fe7(z14 ? i48Var.j : i48Var.i);
                            zy0 zy0VarU = jm4.U(-1314685591, new wy2(b2, i6, str, kx4Var117), lp2Var2);
                            final boolean z15 = z5;
                            final xz4 xz4Var9 = xz4Var8;
                            zy0 zy0VarU2 = jm4.U(306314943, new rn2() { // from class: xy2
                                @Override // defpackage.rn2
                                public final Object K(Object obj4, Object obj5) {
                                    lp2 lp2Var3 = (lp2) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (lp2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        lh4.H0.K0(z15, z14, xz4Var9, null, i48Var, null, 0.0f, 0.0f, lp2Var3, 100663680, 232);
                                    } else {
                                        lp2Var3.Q();
                                    }
                                    return dn8.a;
                                }
                            }, lp2Var2);
                            q58 q58Var = new q58();
                            y68 y68Var2 = y68Var;
                            w58 w58Var4 = w58Var3;
                            x30.b(y68Var2, kx4VarY, z15, de3Var3, o88VarD8, wx3Var12, w58Var4, xz4Var9, fe7Var, new z48(y68Var2, w58Var4, q58Var, zy0VarU, rn2Var7, rn2Var8, z15, z14, xz4Var9, gg5Var3, i48Var, zy0VarU2), ay6VarG, lp2Var2, 0, 6, 4744);
                        } else {
                            lp2Var2.Q();
                        }
                        return dn8.a;
                    }
                }, lp2Var), lp2Var, 56);
                z4 = z9;
                w58Var2 = w58Var3;
                rn2Var5 = rn2Var7;
                rn2Var6 = rn2Var8;
                gg5Var2 = gg5Var3;
                de3Var2 = de3Var3;
                ay6Var2 = ay6VarG;
                kx4Var5 = kx4Var117;
                i36 = i6;
                j5 = j9;
                j6 = j10;
                j7 = j11;
                j8 = j12;
                wx3Var2 = wx3Var11;
            } else {
                lp2Var.Q();
                ay6Var2 = ay6Var;
                z4 = z;
                wx3Var2 = wx3Var;
                de3Var2 = de3Var;
                gg5Var2 = gg5Var;
                j5 = j;
                j6 = j2;
                j7 = j3;
                j8 = j4;
                kx4Var5 = kx4Var4;
                rn2Var5 = rn2Var3;
                i36 = i6;
                rn2Var6 = rn2Var4;
                z5 = z2;
                w58Var2 = w58Var;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: vy2
                    @Override // defpackage.rn2
                    public final Object K(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iP = w79.P(i2 | 1);
                        int iP2 = w79.P(i3);
                        z91.f(str, gn2Var, kx4Var, kx4Var5, i36, y68Var, ay6Var2, o88Var, rn2Var5, rn2Var6, z4, z5, wx3Var2, w58Var2, de3Var2, gg5Var2, j5, j6, j7, j8, (lp2) obj2, iP, iP2, i4);
                        return dn8.a;
                    }
                };
            }
        }
        i5 |= 3072;
        kx4Var4 = kx4Var2;
        if ((i2 & 24576) == 0) {
            if ((i4 & 16) == 0) {
                i6 = i;
                if (lp2Var.d(i6)) {
                    i41 = 16384;
                }
                i5 |= i41;
            } else {
                i6 = i;
            }
            i41 = 8192;
            i5 |= i41;
        } else {
            i6 = i;
        }
        if ((i2 & 196608) == 0) {
            if (lp2Var.f(y68Var)) {
                i40 = 131072;
            } else {
                i40 = 65536;
            }
            i5 |= i40;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= 524288;
        }
        if ((i2 & 12582912) == 0) {
            if (lp2Var.f(o88Var)) {
                i39 = 8388608;
            } else {
                i39 = 4194304;
            }
            i5 |= i39;
        }
        i7 = i5 | 100663296;
        i8 = i4 & 512;
        if (i8 != 0) {
            if ((i2 & 805306368) == 0) {
                rn2Var3 = rn2Var;
                if (lp2Var.h(rn2Var3)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i7 |= i9;
            }
            i10 = i4 & 1024;
            if (i10 != 0) {
                rn2Var4 = rn2Var2;
                i12 = i3 | 6;
                i11 = 131072;
            } else {
                rn2Var4 = rn2Var2;
                if ((i3 & 6) == 0) {
                    i11 = 131072;
                    if (lp2Var.h(rn2Var4)) {
                        i13 = 4;
                    } else {
                        i13 = 2;
                    }
                    i12 = i3 | i13;
                } else {
                    i11 = 131072;
                    i12 = i3;
                }
            }
            i14 = i4 & 2048;
            if (i14 != 0) {
                i12 |= 48;
            } else if ((i3 & 48) == 0) {
                if (lp2Var.g(z)) {
                    i15 = 32;
                } else {
                    i15 = 16;
                }
                i12 |= i15;
            }
            i16 = i12;
            i17 = i4 & 4096;
            if (i17 != 0) {
                i19 = i16 | 384;
            } else {
                i18 = i16;
                if ((i3 & 384) != 0) {
                    if (lp2Var.g(z2)) {
                        i20 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i20 = 128;
                    }
                    i18 |= i20;
                }
                i19 = i18;
            }
            i21 = i4 & 8192;
            if (i21 != 0) {
                i23 = i19 | 3072;
            } else {
                i22 = i19;
                if ((i3 & 3072) == 0) {
                    i23 = i22 | (lp2Var.f(wx3Var) ? 2048 : 1024);
                } else {
                    i23 = i22;
                }
            }
            i24 = i4 & Http2.INITIAL_MAX_FRAME_SIZE;
            if (i24 != 0) {
                i25 = i23;
                if ((i3 & 24576) == 0) {
                    i25 |= lp2Var.f(w58Var) ? 16384 : 8192;
                }
                i26 = i4 & 32768;
                if (i26 != 0) {
                    i25 |= 196608;
                } else if ((i3 & 196608) == 0) {
                    if (lp2Var.f(de3Var)) {
                        i27 = i11;
                    } else {
                        i27 = 65536;
                    }
                    i25 |= i27;
                }
                i28 = i4 & DnsOverHttps.MAX_RESPONSE_SIZE;
                if (i28 != 0) {
                    i25 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (lp2Var.f(gg5Var)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i25 |= i29;
                }
                i30 = i4 & i11;
                if (i30 != 0) {
                    if ((i3 & 12582912) == 0) {
                        i25 |= lp2Var.e(j) ? 8388608 : 4194304;
                    }
                    i31 = i4 & 262144;
                    if (i31 != 0) {
                        i25 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        if (lp2Var.e(j2)) {
                            i32 = 67108864;
                        } else {
                            i32 = 33554432;
                        }
                        i25 |= i32;
                    }
                    i33 = i4 & 524288;
                    if (i33 != 0) {
                        i25 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i25 |= lp2Var.e(j3) ? 536870912 : 268435456;
                    }
                    i34 = i25;
                    i35 = i4 & 1048576;
                    if (i35 != 0) {
                        c2 = 6;
                    } else if (lp2Var.e(j4)) {
                        c2 = 4;
                    } else {
                        c2 = 2;
                    }
                    if ((i7 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (lp2Var.N(i7 & 1, z3)) {
                        lp2Var.S();
                        i37 = i2 & 1;
                        kx4VarT = hx4.X;
                        if (i37 != 0) {
                            if (i42 != 0) {
                                kx4Var4 = kx4VarT;
                            }
                            if ((i4 & 16) != 0) {
                                i7 &= -57345;
                                i6 = 5;
                            }
                            ay6VarG = dh3.G(lp2Var);
                            int i4116 = i7 & (-3670017);
                            if (i8 != 0) {
                                rn2Var3 = null;
                            }
                            if (i10 != 0) {
                                rn2Var4 = null;
                            }
                            if (i14 != 0) {
                                z6 = false;
                            } else {
                                z6 = z;
                            }
                            if (i17 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            if (i21 != 0) {
                                wx3Var3 = wx3.g;
                            } else {
                                wx3Var3 = wx3Var;
                            }
                            if (i24 != 0) {
                                w58Var3 = qe4.x0;
                            } else {
                                w58Var3 = w58Var;
                            }
                            if (i26 != 0) {
                                de3Var3 = null;
                            } else {
                                de3Var3 = de3Var;
                            }
                            if (i28 != 0) {
                                ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                ig5Var = gg5Var;
                            }
                            if (i30 != 0) {
                                j9 = dw0.f;
                            } else {
                                j9 = j;
                            }
                            if (i31 != 0) {
                                j10 = dw0.f;
                            } else {
                                j10 = j2;
                            }
                            if (i33 != 0) {
                                j11 = dw0.f;
                            } else {
                                j11 = j3;
                            }
                            if (i35 != 0) {
                                j12 = dw0.f;
                            } else {
                                j12 = j4;
                            }
                            gg5Var3 = ig5Var;
                            rn2Var7 = rn2Var3;
                            i38 = i4116;
                            rn2Var8 = rn2Var4;
                        } else {
                            if (i42 != 0) {
                                kx4Var4 = kx4VarT;
                            }
                            if ((i4 & 16) != 0) {
                                i7 &= -57345;
                                i6 = 5;
                            }
                            ay6VarG = dh3.G(lp2Var);
                            int i4117 = i7 & (-3670017);
                            if (i8 != 0) {
                                rn2Var3 = null;
                            }
                            if (i10 != 0) {
                                rn2Var4 = null;
                            }
                            if (i14 != 0) {
                                z6 = false;
                            } else {
                                z6 = z;
                            }
                            if (i17 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            if (i21 != 0) {
                                wx3Var3 = wx3.g;
                            } else {
                                wx3Var3 = wx3Var;
                            }
                            if (i24 != 0) {
                                w58Var3 = qe4.x0;
                            } else {
                                w58Var3 = w58Var;
                            }
                            if (i26 != 0) {
                                de3Var3 = null;
                            } else {
                                de3Var3 = de3Var;
                            }
                            if (i28 != 0) {
                                ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                ig5Var = gg5Var;
                            }
                            if (i30 != 0) {
                                j9 = dw0.f;
                            } else {
                                j9 = j;
                            }
                            if (i31 != 0) {
                                j10 = dw0.f;
                            } else {
                                j10 = j2;
                            }
                            if (i33 != 0) {
                                j11 = dw0.f;
                            } else {
                                j11 = j3;
                            }
                            if (i35 != 0) {
                                j12 = dw0.f;
                            } else {
                                j12 = j4;
                            }
                            gg5Var3 = ig5Var;
                            rn2Var7 = rn2Var3;
                            i38 = i4117;
                            rn2Var8 = rn2Var4;
                        }
                        lp2Var.q();
                        int i4118 = i11;
                        if (((458752 & i38) ^ 196608) <= i4118) {
                        }
                        if ((i38 & 112) == 32) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = z7 | z12;
                        objK = lp2Var.K();
                        obj = zz0.a;
                        if (z8) {
                            objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                            lp2Var.g0(objK);
                        } else {
                            objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                            lp2Var.g0(objK);
                        }
                        u70.h((rn2) objK, lp2Var, y68Var);
                        objK2 = lp2Var.K();
                        if (objK2 == obj) {
                            objK2 = new xz4();
                            lp2Var.g0(objK2);
                        }
                        final xz4 xz4Var9 = (xz4) objK2;
                        y05VarS = km4.s(xz4Var9, lp2Var, 6);
                        zT = oc.t(lp2Var);
                        objK3 = lp2Var.K();
                        if (objK3 == obj) {
                            objK3 = z51.H(Boolean.FALSE);
                            lp2Var.g0(objK3);
                        }
                        y05Var = (y05) objK3;
                        objK4 = lp2Var.K();
                        if (objK4 == obj) {
                            objK4 = new q80();
                            lp2Var.g0(objK4);
                        }
                        q80Var = (q80) objK4;
                        WeakHashMap weakHashMap9 = c29.w;
                        Boolean bool17 = (Boolean) hw7.b(lp2Var).c.d.getValue();
                        zBooleanValue = bool17.booleanValue();
                        final kx4 kx4Var1110 = kx4Var4;
                        Boolean boolValueOf9 = Boolean.valueOf(zT);
                        z9 = z6;
                        Boolean bool18 = (Boolean) y05VarS.getValue();
                        bool18.getClass();
                        zG = lp2Var.g(zT) | lp2Var.f(y05VarS) | lp2Var.g(zBooleanValue) | lp2Var.h(q80Var);
                        objK5 = lp2Var.K();
                        if (zG) {
                            objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                            z10 = zT;
                            q80Var2 = q80Var;
                            lp2Var.g0(objK5);
                        } else {
                            objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                            z10 = zT;
                            q80Var2 = q80Var;
                            lp2Var.g0(objK5);
                        }
                        u70.i(boolValueOf9, bool18, bool17, (rn2) objK5, lp2Var);
                        be7Var = (be7) lp2Var.j(y01.q);
                        lp2Var.W(204007653);
                        if (z10) {
                            objK6 = lp2Var.K();
                            if (objK6 == obj) {
                                objK6 = new gh(y05Var, (byte) 6);
                                lp2Var.g0(objK6);
                            }
                            kx4 kx4VarJ9 = z51.J(kx4VarT, (gn2) objK6);
                            if ((i34 & 896) == 256) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            zF = z11 | lp2Var.f(r137) | lp2Var.f(be7Var);
                            objK7 = lp2Var.K();
                            if (zF) {
                                objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                                lp2Var.g0(objK7);
                            } else {
                                objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                                lp2Var.g0(objK7);
                            }
                            kx4VarT = mb6.T(kx4VarJ9, (gn2) objK7);
                        }
                        final kx4 kx4Var1111 = kx4VarT;
                        lp2Var.p(false);
                        long j1111119 = ys0.y(lp2Var).c.a;
                        long j11111110 = ys0.y(lp2Var).c.a;
                        long j11111111 = ys0.y(lp2Var).c.c;
                        long j11111112 = ys0.y(lp2Var).c.e;
                        long j11111113 = dw0.f;
                        long j11111114 = ys0.y(lp2Var).k.a;
                        long j11111115 = ys0.y(lp2Var).k.c;
                        long j2111111110 = ys0.y(lp2Var).c.a;
                        long j2111111111 = ys0.y(lp2Var).c.a;
                        long j2111111112 = ys0.y(lp2Var).c.c;
                        long j2111111113 = ys0.y(lp2Var).c.e;
                        long j2111111114 = ys0.y(lp2Var).c.a;
                        long j2111111115 = ys0.y(lp2Var).c.a;
                        long j2111111116 = ys0.y(lp2Var).c.c;
                        long j2111111117 = ys0.y(lp2Var).c.e;
                        long j2111111118 = ys0.y(lp2Var).c.c;
                        long j2111111119 = ys0.y(lp2Var).c.c;
                        long j3111116 = ys0.y(lp2Var).c.c;
                        long j3111117 = ys0.y(lp2Var).k.c;
                        long j3111118 = ys0.y(lp2Var).c.b;
                        long j3111119 = ys0.y(lp2Var).c.b;
                        long j31111110 = ys0.y(lp2Var).c.c;
                        long j31111111 = ys0.y(lp2Var).c.e;
                        long j31111112 = dw0.g;
                        iw0 iw0Var9 = (iw0) lp2Var.j(kw0.a);
                        q06 q06Var9 = i88.a;
                        i48VarA = lh4.O0(iw0Var9, (h88) lp2Var.j(q06Var9)).a(j1111119, j11111110, j11111111, j11111112, j11111113, j11111113, j11111113, j11111113, j11111114, j11111115, null, j9, j10, j11, j12, j2111111110, j2111111111, j2111111112, j2111111113, j2111111114, j2111111115, j2111111116, j2111111117, j31111112, j31111112, j31111112, j31111112, j2111111118, j2111111119, j3111116, j3111117, j3111118, j3111119, j31111110, j31111111, j31111112, j31111112, j31111112, j31111112, j31111112, j31111112, j31111112, j31111112);
                        if (o88Var == null) {
                            lp2Var.W(204085828);
                            o88Var2 = (o88) lp2Var.j(u78.a);
                            lp2Var.p(false);
                        } else {
                            lp2Var.W(204085084);
                            lp2Var.p(false);
                            o88Var2 = o88Var;
                        }
                        jB = o88Var2.b();
                        if (jB == 16) {
                            if (!z5) {
                                jB = i48VarA.c;
                            } else if (z9) {
                                jB = i48VarA.d;
                            } else if (((Boolean) r137.getValue()).booleanValue()) {
                                jB = i48VarA.a;
                            } else {
                                jB = i48VarA.b;
                            }
                        }
                        final o88 o88VarD9 = o88Var2.d(new o88(jB, 0L, null, null, 0L, 0, 0, 0L, 16777214));
                        t06 t06VarA9 = q06Var9.a(i48VarA.k);
                        final wx3 wx3Var12 = wx3Var3;
                        final q80 q80Var11 = q80Var2;
                        final kx4 kx4Var1112 = kx4Var3;
                        mb6.a(t06VarA9, jm4.U(1035408509, new rn2() { // from class: uy2
                            @Override // defpackage.rn2
                            public final Object K(Object obj2, Object obj3) {
                                wx3 wx3Var13;
                                lp2 lp2Var2 = (lp2) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                byte b2 = 0;
                                if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    kx4 kx4VarY = hi5.P(kx4Var1112, q80Var11).y(kx4Var1111);
                                    boolean z13 = z10;
                                    wx3 wx3Var14 = wx3Var12;
                                    if (z13) {
                                        Boolean bool19 = (Boolean) y05Var.getValue();
                                        bool19.getClass();
                                        wx3Var13 = new wx3(wx3Var14.a, wx3Var14.b, wx3Var14.c, wx3Var14.d, bool19, wx3Var14.f);
                                    } else {
                                        wx3Var13 = wx3Var14;
                                    }
                                    final boolean z14 = z9;
                                    final i48 i48Var = i48VarA;
                                    fe7 fe7Var = new fe7(z14 ? i48Var.j : i48Var.i);
                                    zy0 zy0VarU = jm4.U(-1314685591, new wy2(b2, i6, str, kx4Var1110), lp2Var2);
                                    final boolean z15 = z5;
                                    final xz4 xz4Var10 = xz4Var9;
                                    zy0 zy0VarU2 = jm4.U(306314943, new rn2() { // from class: xy2
                                        @Override // defpackage.rn2
                                        public final Object K(Object obj4, Object obj5) {
                                            lp2 lp2Var3 = (lp2) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            if (lp2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                lh4.H0.K0(z15, z14, xz4Var10, null, i48Var, null, 0.0f, 0.0f, lp2Var3, 100663680, 232);
                                            } else {
                                                lp2Var3.Q();
                                            }
                                            return dn8.a;
                                        }
                                    }, lp2Var2);
                                    q58 q58Var = new q58();
                                    y68 y68Var2 = y68Var;
                                    w58 w58Var4 = w58Var3;
                                    x30.b(y68Var2, kx4VarY, z15, de3Var3, o88VarD9, wx3Var13, w58Var4, xz4Var10, fe7Var, new z48(y68Var2, w58Var4, q58Var, zy0VarU, rn2Var7, rn2Var8, z15, z14, xz4Var10, gg5Var3, i48Var, zy0VarU2), ay6VarG, lp2Var2, 0, 6, 4744);
                                } else {
                                    lp2Var2.Q();
                                }
                                return dn8.a;
                            }
                        }, lp2Var), lp2Var, 56);
                        z4 = z9;
                        w58Var2 = w58Var3;
                        rn2Var5 = rn2Var7;
                        rn2Var6 = rn2Var8;
                        gg5Var2 = gg5Var3;
                        de3Var2 = de3Var3;
                        ay6Var2 = ay6VarG;
                        kx4Var5 = kx4Var1110;
                        i36 = i6;
                        j5 = j9;
                        j6 = j10;
                        j7 = j11;
                        j8 = j12;
                        wx3Var2 = wx3Var12;
                    } else {
                        lp2Var.Q();
                        ay6Var2 = ay6Var;
                        z4 = z;
                        wx3Var2 = wx3Var;
                        de3Var2 = de3Var;
                        gg5Var2 = gg5Var;
                        j5 = j;
                        j6 = j2;
                        j7 = j3;
                        j8 = j4;
                        kx4Var5 = kx4Var4;
                        rn2Var5 = rn2Var3;
                        i36 = i6;
                        rn2Var6 = rn2Var4;
                        z5 = z2;
                        w58Var2 = w58Var;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: vy2
                            @Override // defpackage.rn2
                            public final Object K(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                int iP = w79.P(i2 | 1);
                                int iP2 = w79.P(i3);
                                z91.f(str, gn2Var, kx4Var, kx4Var5, i36, y68Var, ay6Var2, o88Var, rn2Var5, rn2Var6, z4, z5, wx3Var2, w58Var2, de3Var2, gg5Var2, j5, j6, j7, j8, (lp2) obj2, iP, iP2, i4);
                                return dn8.a;
                            }
                        };
                    }
                }
                i25 |= 12582912;
                i31 = i4 & 262144;
                if (i31 != 0) {
                    i25 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    if (lp2Var.e(j2)) {
                        i32 = 67108864;
                    } else {
                        i32 = 33554432;
                    }
                    i25 |= i32;
                }
                i33 = i4 & 524288;
                if (i33 != 0) {
                    i25 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i25 |= lp2Var.e(j3) ? 536870912 : 268435456;
                }
                i34 = i25;
                i35 = i4 & 1048576;
                if (i35 != 0) {
                    c2 = 6;
                } else if (lp2Var.e(j4)) {
                    c2 = 4;
                } else {
                    c2 = 2;
                }
                if ((i7 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (lp2Var.N(i7 & 1, z3)) {
                    lp2Var.S();
                    i37 = i2 & 1;
                    kx4VarT = hx4.X;
                    if (i37 != 0) {
                        if (i42 != 0) {
                            kx4Var4 = kx4VarT;
                        }
                        if ((i4 & 16) != 0) {
                            i7 &= -57345;
                            i6 = 5;
                        }
                        ay6VarG = dh3.G(lp2Var);
                        int i4119 = i7 & (-3670017);
                        if (i8 != 0) {
                            rn2Var3 = null;
                        }
                        if (i10 != 0) {
                            rn2Var4 = null;
                        }
                        if (i14 != 0) {
                            z6 = false;
                        } else {
                            z6 = z;
                        }
                        if (i17 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i21 != 0) {
                            wx3Var3 = wx3.g;
                        } else {
                            wx3Var3 = wx3Var;
                        }
                        if (i24 != 0) {
                            w58Var3 = qe4.x0;
                        } else {
                            w58Var3 = w58Var;
                        }
                        if (i26 != 0) {
                            de3Var3 = null;
                        } else {
                            de3Var3 = de3Var;
                        }
                        if (i28 != 0) {
                            ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            ig5Var = gg5Var;
                        }
                        if (i30 != 0) {
                            j9 = dw0.f;
                        } else {
                            j9 = j;
                        }
                        if (i31 != 0) {
                            j10 = dw0.f;
                        } else {
                            j10 = j2;
                        }
                        if (i33 != 0) {
                            j11 = dw0.f;
                        } else {
                            j11 = j3;
                        }
                        if (i35 != 0) {
                            j12 = dw0.f;
                        } else {
                            j12 = j4;
                        }
                        gg5Var3 = ig5Var;
                        rn2Var7 = rn2Var3;
                        i38 = i4119;
                        rn2Var8 = rn2Var4;
                    } else {
                        if (i42 != 0) {
                            kx4Var4 = kx4VarT;
                        }
                        if ((i4 & 16) != 0) {
                            i7 &= -57345;
                            i6 = 5;
                        }
                        ay6VarG = dh3.G(lp2Var);
                        int i41110 = i7 & (-3670017);
                        if (i8 != 0) {
                            rn2Var3 = null;
                        }
                        if (i10 != 0) {
                            rn2Var4 = null;
                        }
                        if (i14 != 0) {
                            z6 = false;
                        } else {
                            z6 = z;
                        }
                        if (i17 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i21 != 0) {
                            wx3Var3 = wx3.g;
                        } else {
                            wx3Var3 = wx3Var;
                        }
                        if (i24 != 0) {
                            w58Var3 = qe4.x0;
                        } else {
                            w58Var3 = w58Var;
                        }
                        if (i26 != 0) {
                            de3Var3 = null;
                        } else {
                            de3Var3 = de3Var;
                        }
                        if (i28 != 0) {
                            ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            ig5Var = gg5Var;
                        }
                        if (i30 != 0) {
                            j9 = dw0.f;
                        } else {
                            j9 = j;
                        }
                        if (i31 != 0) {
                            j10 = dw0.f;
                        } else {
                            j10 = j2;
                        }
                        if (i33 != 0) {
                            j11 = dw0.f;
                        } else {
                            j11 = j3;
                        }
                        if (i35 != 0) {
                            j12 = dw0.f;
                        } else {
                            j12 = j4;
                        }
                        gg5Var3 = ig5Var;
                        rn2Var7 = rn2Var3;
                        i38 = i41110;
                        rn2Var8 = rn2Var4;
                    }
                    lp2Var.q();
                    int i41111 = i11;
                    if (((458752 & i38) ^ 196608) <= i41111) {
                    }
                    if ((i38 & 112) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z7 | z12;
                    objK = lp2Var.K();
                    obj = zz0.a;
                    if (z8) {
                        objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                        lp2Var.g0(objK);
                    } else {
                        objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                        lp2Var.g0(objK);
                    }
                    u70.h((rn2) objK, lp2Var, y68Var);
                    objK2 = lp2Var.K();
                    if (objK2 == obj) {
                        objK2 = new xz4();
                        lp2Var.g0(objK2);
                    }
                    final xz4 xz4Var10 = (xz4) objK2;
                    y05VarS = km4.s(xz4Var10, lp2Var, 6);
                    zT = oc.t(lp2Var);
                    objK3 = lp2Var.K();
                    if (objK3 == obj) {
                        objK3 = z51.H(Boolean.FALSE);
                        lp2Var.g0(objK3);
                    }
                    y05Var = (y05) objK3;
                    objK4 = lp2Var.K();
                    if (objK4 == obj) {
                        objK4 = new q80();
                        lp2Var.g0(objK4);
                    }
                    q80Var = (q80) objK4;
                    WeakHashMap weakHashMap10 = c29.w;
                    Boolean bool19 = (Boolean) hw7.b(lp2Var).c.d.getValue();
                    zBooleanValue = bool19.booleanValue();
                    final kx4 kx4Var1113 = kx4Var4;
                    Boolean boolValueOf10 = Boolean.valueOf(zT);
                    z9 = z6;
                    Boolean bool110 = (Boolean) y05VarS.getValue();
                    bool110.getClass();
                    zG = lp2Var.g(zT) | lp2Var.f(y05VarS) | lp2Var.g(zBooleanValue) | lp2Var.h(q80Var);
                    objK5 = lp2Var.K();
                    if (zG) {
                        objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                        z10 = zT;
                        q80Var2 = q80Var;
                        lp2Var.g0(objK5);
                    } else {
                        objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                        z10 = zT;
                        q80Var2 = q80Var;
                        lp2Var.g0(objK5);
                    }
                    u70.i(boolValueOf10, bool110, bool19, (rn2) objK5, lp2Var);
                    be7Var = (be7) lp2Var.j(y01.q);
                    lp2Var.W(204007653);
                    if (z10) {
                        objK6 = lp2Var.K();
                        if (objK6 == obj) {
                            objK6 = new gh(y05Var, (byte) 6);
                            lp2Var.g0(objK6);
                        }
                        kx4 kx4VarJ10 = z51.J(kx4VarT, (gn2) objK6);
                        if ((i34 & 896) == 256) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zF = z11 | lp2Var.f(r137) | lp2Var.f(be7Var);
                        objK7 = lp2Var.K();
                        if (zF) {
                            objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                            lp2Var.g0(objK7);
                        } else {
                            objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                            lp2Var.g0(objK7);
                        }
                        kx4VarT = mb6.T(kx4VarJ10, (gn2) objK7);
                    }
                    final kx4 kx4Var1114 = kx4VarT;
                    lp2Var.p(false);
                    long j11111116 = ys0.y(lp2Var).c.a;
                    long j11111117 = ys0.y(lp2Var).c.a;
                    long j11111118 = ys0.y(lp2Var).c.c;
                    long j11111119 = ys0.y(lp2Var).c.e;
                    long j111111110 = dw0.f;
                    long j111111111 = ys0.y(lp2Var).k.a;
                    long j111111112 = ys0.y(lp2Var).k.c;
                    long j21111111110 = ys0.y(lp2Var).c.a;
                    long j21111111111 = ys0.y(lp2Var).c.a;
                    long j21111111112 = ys0.y(lp2Var).c.c;
                    long j21111111113 = ys0.y(lp2Var).c.e;
                    long j21111111114 = ys0.y(lp2Var).c.a;
                    long j21111111115 = ys0.y(lp2Var).c.a;
                    long j21111111116 = ys0.y(lp2Var).c.c;
                    long j21111111117 = ys0.y(lp2Var).c.e;
                    long j21111111118 = ys0.y(lp2Var).c.c;
                    long j21111111119 = ys0.y(lp2Var).c.c;
                    long j31111113 = ys0.y(lp2Var).c.c;
                    long j31111114 = ys0.y(lp2Var).k.c;
                    long j31111115 = ys0.y(lp2Var).c.b;
                    long j31111116 = ys0.y(lp2Var).c.b;
                    long j31111117 = ys0.y(lp2Var).c.c;
                    long j31111118 = ys0.y(lp2Var).c.e;
                    long j31111119 = dw0.g;
                    iw0 iw0Var10 = (iw0) lp2Var.j(kw0.a);
                    q06 q06Var10 = i88.a;
                    i48VarA = lh4.O0(iw0Var10, (h88) lp2Var.j(q06Var10)).a(j11111116, j11111117, j11111118, j11111119, j111111110, j111111110, j111111110, j111111110, j111111111, j111111112, null, j9, j10, j11, j12, j21111111110, j21111111111, j21111111112, j21111111113, j21111111114, j21111111115, j21111111116, j21111111117, j31111119, j31111119, j31111119, j31111119, j21111111118, j21111111119, j31111113, j31111114, j31111115, j31111116, j31111117, j31111118, j31111119, j31111119, j31111119, j31111119, j31111119, j31111119, j31111119, j31111119);
                    if (o88Var == null) {
                        lp2Var.W(204085828);
                        o88Var2 = (o88) lp2Var.j(u78.a);
                        lp2Var.p(false);
                    } else {
                        lp2Var.W(204085084);
                        lp2Var.p(false);
                        o88Var2 = o88Var;
                    }
                    jB = o88Var2.b();
                    if (jB == 16) {
                        if (!z5) {
                            jB = i48VarA.c;
                        } else if (z9) {
                            jB = i48VarA.d;
                        } else if (((Boolean) r137.getValue()).booleanValue()) {
                            jB = i48VarA.a;
                        } else {
                            jB = i48VarA.b;
                        }
                    }
                    final o88 o88VarD10 = o88Var2.d(new o88(jB, 0L, null, null, 0L, 0, 0, 0L, 16777214));
                    t06 t06VarA10 = q06Var10.a(i48VarA.k);
                    final wx3 wx3Var13 = wx3Var3;
                    final q80 q80Var12 = q80Var2;
                    final kx4 kx4Var1115 = kx4Var3;
                    mb6.a(t06VarA10, jm4.U(1035408509, new rn2() { // from class: uy2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            wx3 wx3Var14;
                            lp2 lp2Var2 = (lp2) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            byte b2 = 0;
                            if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                kx4 kx4VarY = hi5.P(kx4Var1115, q80Var12).y(kx4Var1114);
                                boolean z13 = z10;
                                wx3 wx3Var15 = wx3Var13;
                                if (z13) {
                                    Boolean bool111 = (Boolean) y05Var.getValue();
                                    bool111.getClass();
                                    wx3Var14 = new wx3(wx3Var15.a, wx3Var15.b, wx3Var15.c, wx3Var15.d, bool111, wx3Var15.f);
                                } else {
                                    wx3Var14 = wx3Var15;
                                }
                                final boolean z14 = z9;
                                final i48 i48Var = i48VarA;
                                fe7 fe7Var = new fe7(z14 ? i48Var.j : i48Var.i);
                                zy0 zy0VarU = jm4.U(-1314685591, new wy2(b2, i6, str, kx4Var1113), lp2Var2);
                                final boolean z15 = z5;
                                final xz4 xz4Var11 = xz4Var10;
                                zy0 zy0VarU2 = jm4.U(306314943, new rn2() { // from class: xy2
                                    @Override // defpackage.rn2
                                    public final Object K(Object obj4, Object obj5) {
                                        lp2 lp2Var3 = (lp2) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        if (lp2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            lh4.H0.K0(z15, z14, xz4Var11, null, i48Var, null, 0.0f, 0.0f, lp2Var3, 100663680, 232);
                                        } else {
                                            lp2Var3.Q();
                                        }
                                        return dn8.a;
                                    }
                                }, lp2Var2);
                                q58 q58Var = new q58();
                                y68 y68Var2 = y68Var;
                                w58 w58Var4 = w58Var3;
                                x30.b(y68Var2, kx4VarY, z15, de3Var3, o88VarD10, wx3Var14, w58Var4, xz4Var11, fe7Var, new z48(y68Var2, w58Var4, q58Var, zy0VarU, rn2Var7, rn2Var8, z15, z14, xz4Var11, gg5Var3, i48Var, zy0VarU2), ay6VarG, lp2Var2, 0, 6, 4744);
                            } else {
                                lp2Var2.Q();
                            }
                            return dn8.a;
                        }
                    }, lp2Var), lp2Var, 56);
                    z4 = z9;
                    w58Var2 = w58Var3;
                    rn2Var5 = rn2Var7;
                    rn2Var6 = rn2Var8;
                    gg5Var2 = gg5Var3;
                    de3Var2 = de3Var3;
                    ay6Var2 = ay6VarG;
                    kx4Var5 = kx4Var1113;
                    i36 = i6;
                    j5 = j9;
                    j6 = j10;
                    j7 = j11;
                    j8 = j12;
                    wx3Var2 = wx3Var13;
                } else {
                    lp2Var.Q();
                    ay6Var2 = ay6Var;
                    z4 = z;
                    wx3Var2 = wx3Var;
                    de3Var2 = de3Var;
                    gg5Var2 = gg5Var;
                    j5 = j;
                    j6 = j2;
                    j7 = j3;
                    j8 = j4;
                    kx4Var5 = kx4Var4;
                    rn2Var5 = rn2Var3;
                    i36 = i6;
                    rn2Var6 = rn2Var4;
                    z5 = z2;
                    w58Var2 = w58Var;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: vy2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iP = w79.P(i2 | 1);
                            int iP2 = w79.P(i3);
                            z91.f(str, gn2Var, kx4Var, kx4Var5, i36, y68Var, ay6Var2, o88Var, rn2Var5, rn2Var6, z4, z5, wx3Var2, w58Var2, de3Var2, gg5Var2, j5, j6, j7, j8, (lp2) obj2, iP, iP2, i4);
                            return dn8.a;
                        }
                    };
                }
            }
            i25 = i23 | 24576;
            i26 = i4 & 32768;
            if (i26 != 0) {
                i25 |= 196608;
            } else if ((i3 & 196608) == 0) {
                if (lp2Var.f(de3Var)) {
                    i27 = i11;
                } else {
                    i27 = 65536;
                }
                i25 |= i27;
            }
            i28 = i4 & DnsOverHttps.MAX_RESPONSE_SIZE;
            if (i28 != 0) {
                i25 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (lp2Var.f(gg5Var)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i25 |= i29;
            }
            i30 = i4 & i11;
            if (i30 != 0) {
                if ((i3 & 12582912) == 0) {
                    i25 |= lp2Var.e(j) ? 8388608 : 4194304;
                }
                i31 = i4 & 262144;
                if (i31 != 0) {
                    i25 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    if (lp2Var.e(j2)) {
                        i32 = 67108864;
                    } else {
                        i32 = 33554432;
                    }
                    i25 |= i32;
                }
                i33 = i4 & 524288;
                if (i33 != 0) {
                    i25 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i25 |= lp2Var.e(j3) ? 536870912 : 268435456;
                }
                i34 = i25;
                i35 = i4 & 1048576;
                if (i35 != 0) {
                    c2 = 6;
                } else if (lp2Var.e(j4)) {
                    c2 = 4;
                } else {
                    c2 = 2;
                }
                if ((i7 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (lp2Var.N(i7 & 1, z3)) {
                    lp2Var.S();
                    i37 = i2 & 1;
                    kx4VarT = hx4.X;
                    if (i37 != 0) {
                        if (i42 != 0) {
                            kx4Var4 = kx4VarT;
                        }
                        if ((i4 & 16) != 0) {
                            i7 &= -57345;
                            i6 = 5;
                        }
                        ay6VarG = dh3.G(lp2Var);
                        int i41112 = i7 & (-3670017);
                        if (i8 != 0) {
                            rn2Var3 = null;
                        }
                        if (i10 != 0) {
                            rn2Var4 = null;
                        }
                        if (i14 != 0) {
                            z6 = false;
                        } else {
                            z6 = z;
                        }
                        if (i17 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i21 != 0) {
                            wx3Var3 = wx3.g;
                        } else {
                            wx3Var3 = wx3Var;
                        }
                        if (i24 != 0) {
                            w58Var3 = qe4.x0;
                        } else {
                            w58Var3 = w58Var;
                        }
                        if (i26 != 0) {
                            de3Var3 = null;
                        } else {
                            de3Var3 = de3Var;
                        }
                        if (i28 != 0) {
                            ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            ig5Var = gg5Var;
                        }
                        if (i30 != 0) {
                            j9 = dw0.f;
                        } else {
                            j9 = j;
                        }
                        if (i31 != 0) {
                            j10 = dw0.f;
                        } else {
                            j10 = j2;
                        }
                        if (i33 != 0) {
                            j11 = dw0.f;
                        } else {
                            j11 = j3;
                        }
                        if (i35 != 0) {
                            j12 = dw0.f;
                        } else {
                            j12 = j4;
                        }
                        gg5Var3 = ig5Var;
                        rn2Var7 = rn2Var3;
                        i38 = i41112;
                        rn2Var8 = rn2Var4;
                    } else {
                        if (i42 != 0) {
                            kx4Var4 = kx4VarT;
                        }
                        if ((i4 & 16) != 0) {
                            i7 &= -57345;
                            i6 = 5;
                        }
                        ay6VarG = dh3.G(lp2Var);
                        int i41113 = i7 & (-3670017);
                        if (i8 != 0) {
                            rn2Var3 = null;
                        }
                        if (i10 != 0) {
                            rn2Var4 = null;
                        }
                        if (i14 != 0) {
                            z6 = false;
                        } else {
                            z6 = z;
                        }
                        if (i17 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i21 != 0) {
                            wx3Var3 = wx3.g;
                        } else {
                            wx3Var3 = wx3Var;
                        }
                        if (i24 != 0) {
                            w58Var3 = qe4.x0;
                        } else {
                            w58Var3 = w58Var;
                        }
                        if (i26 != 0) {
                            de3Var3 = null;
                        } else {
                            de3Var3 = de3Var;
                        }
                        if (i28 != 0) {
                            ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            ig5Var = gg5Var;
                        }
                        if (i30 != 0) {
                            j9 = dw0.f;
                        } else {
                            j9 = j;
                        }
                        if (i31 != 0) {
                            j10 = dw0.f;
                        } else {
                            j10 = j2;
                        }
                        if (i33 != 0) {
                            j11 = dw0.f;
                        } else {
                            j11 = j3;
                        }
                        if (i35 != 0) {
                            j12 = dw0.f;
                        } else {
                            j12 = j4;
                        }
                        gg5Var3 = ig5Var;
                        rn2Var7 = rn2Var3;
                        i38 = i41113;
                        rn2Var8 = rn2Var4;
                    }
                    lp2Var.q();
                    int i41114 = i11;
                    if (((458752 & i38) ^ 196608) <= i41114) {
                    }
                    if ((i38 & 112) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z7 | z12;
                    objK = lp2Var.K();
                    obj = zz0.a;
                    if (z8) {
                        objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                        lp2Var.g0(objK);
                    } else {
                        objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                        lp2Var.g0(objK);
                    }
                    u70.h((rn2) objK, lp2Var, y68Var);
                    objK2 = lp2Var.K();
                    if (objK2 == obj) {
                        objK2 = new xz4();
                        lp2Var.g0(objK2);
                    }
                    final xz4 xz4Var11 = (xz4) objK2;
                    y05VarS = km4.s(xz4Var11, lp2Var, 6);
                    zT = oc.t(lp2Var);
                    objK3 = lp2Var.K();
                    if (objK3 == obj) {
                        objK3 = z51.H(Boolean.FALSE);
                        lp2Var.g0(objK3);
                    }
                    y05Var = (y05) objK3;
                    objK4 = lp2Var.K();
                    if (objK4 == obj) {
                        objK4 = new q80();
                        lp2Var.g0(objK4);
                    }
                    q80Var = (q80) objK4;
                    WeakHashMap weakHashMap11 = c29.w;
                    Boolean bool111 = (Boolean) hw7.b(lp2Var).c.d.getValue();
                    zBooleanValue = bool111.booleanValue();
                    final kx4 kx4Var1116 = kx4Var4;
                    Boolean boolValueOf11 = Boolean.valueOf(zT);
                    z9 = z6;
                    Boolean bool112 = (Boolean) y05VarS.getValue();
                    bool112.getClass();
                    zG = lp2Var.g(zT) | lp2Var.f(y05VarS) | lp2Var.g(zBooleanValue) | lp2Var.h(q80Var);
                    objK5 = lp2Var.K();
                    if (zG) {
                        objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                        z10 = zT;
                        q80Var2 = q80Var;
                        lp2Var.g0(objK5);
                    } else {
                        objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                        z10 = zT;
                        q80Var2 = q80Var;
                        lp2Var.g0(objK5);
                    }
                    u70.i(boolValueOf11, bool112, bool111, (rn2) objK5, lp2Var);
                    be7Var = (be7) lp2Var.j(y01.q);
                    lp2Var.W(204007653);
                    if (z10) {
                        objK6 = lp2Var.K();
                        if (objK6 == obj) {
                            objK6 = new gh(y05Var, (byte) 6);
                            lp2Var.g0(objK6);
                        }
                        kx4 kx4VarJ11 = z51.J(kx4VarT, (gn2) objK6);
                        if ((i34 & 896) == 256) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zF = z11 | lp2Var.f(r137) | lp2Var.f(be7Var);
                        objK7 = lp2Var.K();
                        if (zF) {
                            objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                            lp2Var.g0(objK7);
                        } else {
                            objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                            lp2Var.g0(objK7);
                        }
                        kx4VarT = mb6.T(kx4VarJ11, (gn2) objK7);
                    }
                    final kx4 kx4Var1117 = kx4VarT;
                    lp2Var.p(false);
                    long j111111113 = ys0.y(lp2Var).c.a;
                    long j111111114 = ys0.y(lp2Var).c.a;
                    long j111111115 = ys0.y(lp2Var).c.c;
                    long j111111116 = ys0.y(lp2Var).c.e;
                    long j111111117 = dw0.f;
                    long j111111118 = ys0.y(lp2Var).k.a;
                    long j111111119 = ys0.y(lp2Var).k.c;
                    long j211111111110 = ys0.y(lp2Var).c.a;
                    long j211111111111 = ys0.y(lp2Var).c.a;
                    long j211111111112 = ys0.y(lp2Var).c.c;
                    long j211111111113 = ys0.y(lp2Var).c.e;
                    long j211111111114 = ys0.y(lp2Var).c.a;
                    long j211111111115 = ys0.y(lp2Var).c.a;
                    long j211111111116 = ys0.y(lp2Var).c.c;
                    long j211111111117 = ys0.y(lp2Var).c.e;
                    long j211111111118 = ys0.y(lp2Var).c.c;
                    long j211111111119 = ys0.y(lp2Var).c.c;
                    long j311111110 = ys0.y(lp2Var).c.c;
                    long j311111111 = ys0.y(lp2Var).k.c;
                    long j311111112 = ys0.y(lp2Var).c.b;
                    long j311111113 = ys0.y(lp2Var).c.b;
                    long j311111114 = ys0.y(lp2Var).c.c;
                    long j311111115 = ys0.y(lp2Var).c.e;
                    long j311111116 = dw0.g;
                    iw0 iw0Var11 = (iw0) lp2Var.j(kw0.a);
                    q06 q06Var11 = i88.a;
                    i48VarA = lh4.O0(iw0Var11, (h88) lp2Var.j(q06Var11)).a(j111111113, j111111114, j111111115, j111111116, j111111117, j111111117, j111111117, j111111117, j111111118, j111111119, null, j9, j10, j11, j12, j211111111110, j211111111111, j211111111112, j211111111113, j211111111114, j211111111115, j211111111116, j211111111117, j311111116, j311111116, j311111116, j311111116, j211111111118, j211111111119, j311111110, j311111111, j311111112, j311111113, j311111114, j311111115, j311111116, j311111116, j311111116, j311111116, j311111116, j311111116, j311111116, j311111116);
                    if (o88Var == null) {
                        lp2Var.W(204085828);
                        o88Var2 = (o88) lp2Var.j(u78.a);
                        lp2Var.p(false);
                    } else {
                        lp2Var.W(204085084);
                        lp2Var.p(false);
                        o88Var2 = o88Var;
                    }
                    jB = o88Var2.b();
                    if (jB == 16) {
                        if (!z5) {
                            jB = i48VarA.c;
                        } else if (z9) {
                            jB = i48VarA.d;
                        } else if (((Boolean) r137.getValue()).booleanValue()) {
                            jB = i48VarA.a;
                        } else {
                            jB = i48VarA.b;
                        }
                    }
                    final o88 o88VarD11 = o88Var2.d(new o88(jB, 0L, null, null, 0L, 0, 0, 0L, 16777214));
                    t06 t06VarA11 = q06Var11.a(i48VarA.k);
                    final wx3 wx3Var14 = wx3Var3;
                    final q80 q80Var13 = q80Var2;
                    final kx4 kx4Var1118 = kx4Var3;
                    mb6.a(t06VarA11, jm4.U(1035408509, new rn2() { // from class: uy2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            wx3 wx3Var15;
                            lp2 lp2Var2 = (lp2) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            byte b2 = 0;
                            if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                kx4 kx4VarY = hi5.P(kx4Var1118, q80Var13).y(kx4Var1117);
                                boolean z13 = z10;
                                wx3 wx3Var16 = wx3Var14;
                                if (z13) {
                                    Boolean bool113 = (Boolean) y05Var.getValue();
                                    bool113.getClass();
                                    wx3Var15 = new wx3(wx3Var16.a, wx3Var16.b, wx3Var16.c, wx3Var16.d, bool113, wx3Var16.f);
                                } else {
                                    wx3Var15 = wx3Var16;
                                }
                                final boolean z14 = z9;
                                final i48 i48Var = i48VarA;
                                fe7 fe7Var = new fe7(z14 ? i48Var.j : i48Var.i);
                                zy0 zy0VarU = jm4.U(-1314685591, new wy2(b2, i6, str, kx4Var1116), lp2Var2);
                                final boolean z15 = z5;
                                final xz4 xz4Var12 = xz4Var11;
                                zy0 zy0VarU2 = jm4.U(306314943, new rn2() { // from class: xy2
                                    @Override // defpackage.rn2
                                    public final Object K(Object obj4, Object obj5) {
                                        lp2 lp2Var3 = (lp2) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        if (lp2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            lh4.H0.K0(z15, z14, xz4Var12, null, i48Var, null, 0.0f, 0.0f, lp2Var3, 100663680, 232);
                                        } else {
                                            lp2Var3.Q();
                                        }
                                        return dn8.a;
                                    }
                                }, lp2Var2);
                                q58 q58Var = new q58();
                                y68 y68Var2 = y68Var;
                                w58 w58Var4 = w58Var3;
                                x30.b(y68Var2, kx4VarY, z15, de3Var3, o88VarD11, wx3Var15, w58Var4, xz4Var12, fe7Var, new z48(y68Var2, w58Var4, q58Var, zy0VarU, rn2Var7, rn2Var8, z15, z14, xz4Var12, gg5Var3, i48Var, zy0VarU2), ay6VarG, lp2Var2, 0, 6, 4744);
                            } else {
                                lp2Var2.Q();
                            }
                            return dn8.a;
                        }
                    }, lp2Var), lp2Var, 56);
                    z4 = z9;
                    w58Var2 = w58Var3;
                    rn2Var5 = rn2Var7;
                    rn2Var6 = rn2Var8;
                    gg5Var2 = gg5Var3;
                    de3Var2 = de3Var3;
                    ay6Var2 = ay6VarG;
                    kx4Var5 = kx4Var1116;
                    i36 = i6;
                    j5 = j9;
                    j6 = j10;
                    j7 = j11;
                    j8 = j12;
                    wx3Var2 = wx3Var14;
                } else {
                    lp2Var.Q();
                    ay6Var2 = ay6Var;
                    z4 = z;
                    wx3Var2 = wx3Var;
                    de3Var2 = de3Var;
                    gg5Var2 = gg5Var;
                    j5 = j;
                    j6 = j2;
                    j7 = j3;
                    j8 = j4;
                    kx4Var5 = kx4Var4;
                    rn2Var5 = rn2Var3;
                    i36 = i6;
                    rn2Var6 = rn2Var4;
                    z5 = z2;
                    w58Var2 = w58Var;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: vy2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iP = w79.P(i2 | 1);
                            int iP2 = w79.P(i3);
                            z91.f(str, gn2Var, kx4Var, kx4Var5, i36, y68Var, ay6Var2, o88Var, rn2Var5, rn2Var6, z4, z5, wx3Var2, w58Var2, de3Var2, gg5Var2, j5, j6, j7, j8, (lp2) obj2, iP, iP2, i4);
                            return dn8.a;
                        }
                    };
                }
            }
            i25 |= 12582912;
            i31 = i4 & 262144;
            if (i31 != 0) {
                i25 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                if (lp2Var.e(j2)) {
                    i32 = 67108864;
                } else {
                    i32 = 33554432;
                }
                i25 |= i32;
            }
            i33 = i4 & 524288;
            if (i33 != 0) {
                i25 |= 805306368;
            } else if ((i3 & 805306368) == 0) {
                i25 |= lp2Var.e(j3) ? 536870912 : 268435456;
            }
            i34 = i25;
            i35 = i4 & 1048576;
            if (i35 != 0) {
                c2 = 6;
            } else if (lp2Var.e(j4)) {
                c2 = 4;
            } else {
                c2 = 2;
            }
            if ((i7 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (lp2Var.N(i7 & 1, z3)) {
                lp2Var.S();
                i37 = i2 & 1;
                kx4VarT = hx4.X;
                if (i37 != 0) {
                    if (i42 != 0) {
                        kx4Var4 = kx4VarT;
                    }
                    if ((i4 & 16) != 0) {
                        i7 &= -57345;
                        i6 = 5;
                    }
                    ay6VarG = dh3.G(lp2Var);
                    int i41115 = i7 & (-3670017);
                    if (i8 != 0) {
                        rn2Var3 = null;
                    }
                    if (i10 != 0) {
                        rn2Var4 = null;
                    }
                    if (i14 != 0) {
                        z6 = false;
                    } else {
                        z6 = z;
                    }
                    if (i17 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i21 != 0) {
                        wx3Var3 = wx3.g;
                    } else {
                        wx3Var3 = wx3Var;
                    }
                    if (i24 != 0) {
                        w58Var3 = qe4.x0;
                    } else {
                        w58Var3 = w58Var;
                    }
                    if (i26 != 0) {
                        de3Var3 = null;
                    } else {
                        de3Var3 = de3Var;
                    }
                    if (i28 != 0) {
                        ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        ig5Var = gg5Var;
                    }
                    if (i30 != 0) {
                        j9 = dw0.f;
                    } else {
                        j9 = j;
                    }
                    if (i31 != 0) {
                        j10 = dw0.f;
                    } else {
                        j10 = j2;
                    }
                    if (i33 != 0) {
                        j11 = dw0.f;
                    } else {
                        j11 = j3;
                    }
                    if (i35 != 0) {
                        j12 = dw0.f;
                    } else {
                        j12 = j4;
                    }
                    gg5Var3 = ig5Var;
                    rn2Var7 = rn2Var3;
                    i38 = i41115;
                    rn2Var8 = rn2Var4;
                } else {
                    if (i42 != 0) {
                        kx4Var4 = kx4VarT;
                    }
                    if ((i4 & 16) != 0) {
                        i7 &= -57345;
                        i6 = 5;
                    }
                    ay6VarG = dh3.G(lp2Var);
                    int i41116 = i7 & (-3670017);
                    if (i8 != 0) {
                        rn2Var3 = null;
                    }
                    if (i10 != 0) {
                        rn2Var4 = null;
                    }
                    if (i14 != 0) {
                        z6 = false;
                    } else {
                        z6 = z;
                    }
                    if (i17 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i21 != 0) {
                        wx3Var3 = wx3.g;
                    } else {
                        wx3Var3 = wx3Var;
                    }
                    if (i24 != 0) {
                        w58Var3 = qe4.x0;
                    } else {
                        w58Var3 = w58Var;
                    }
                    if (i26 != 0) {
                        de3Var3 = null;
                    } else {
                        de3Var3 = de3Var;
                    }
                    if (i28 != 0) {
                        ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        ig5Var = gg5Var;
                    }
                    if (i30 != 0) {
                        j9 = dw0.f;
                    } else {
                        j9 = j;
                    }
                    if (i31 != 0) {
                        j10 = dw0.f;
                    } else {
                        j10 = j2;
                    }
                    if (i33 != 0) {
                        j11 = dw0.f;
                    } else {
                        j11 = j3;
                    }
                    if (i35 != 0) {
                        j12 = dw0.f;
                    } else {
                        j12 = j4;
                    }
                    gg5Var3 = ig5Var;
                    rn2Var7 = rn2Var3;
                    i38 = i41116;
                    rn2Var8 = rn2Var4;
                }
                lp2Var.q();
                int i41117 = i11;
                if (((458752 & i38) ^ 196608) <= i41117) {
                }
                if ((i38 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z7 | z12;
                objK = lp2Var.K();
                obj = zz0.a;
                if (z8) {
                    objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                    lp2Var.g0(objK);
                } else {
                    objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                    lp2Var.g0(objK);
                }
                u70.h((rn2) objK, lp2Var, y68Var);
                objK2 = lp2Var.K();
                if (objK2 == obj) {
                    objK2 = new xz4();
                    lp2Var.g0(objK2);
                }
                final xz4 xz4Var12 = (xz4) objK2;
                y05VarS = km4.s(xz4Var12, lp2Var, 6);
                zT = oc.t(lp2Var);
                objK3 = lp2Var.K();
                if (objK3 == obj) {
                    objK3 = z51.H(Boolean.FALSE);
                    lp2Var.g0(objK3);
                }
                y05Var = (y05) objK3;
                objK4 = lp2Var.K();
                if (objK4 == obj) {
                    objK4 = new q80();
                    lp2Var.g0(objK4);
                }
                q80Var = (q80) objK4;
                WeakHashMap weakHashMap12 = c29.w;
                Boolean bool113 = (Boolean) hw7.b(lp2Var).c.d.getValue();
                zBooleanValue = bool113.booleanValue();
                final kx4 kx4Var1119 = kx4Var4;
                Boolean boolValueOf12 = Boolean.valueOf(zT);
                z9 = z6;
                Boolean bool114 = (Boolean) y05VarS.getValue();
                bool114.getClass();
                zG = lp2Var.g(zT) | lp2Var.f(y05VarS) | lp2Var.g(zBooleanValue) | lp2Var.h(q80Var);
                objK5 = lp2Var.K();
                if (zG) {
                    objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                    z10 = zT;
                    q80Var2 = q80Var;
                    lp2Var.g0(objK5);
                } else {
                    objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                    z10 = zT;
                    q80Var2 = q80Var;
                    lp2Var.g0(objK5);
                }
                u70.i(boolValueOf12, bool114, bool113, (rn2) objK5, lp2Var);
                be7Var = (be7) lp2Var.j(y01.q);
                lp2Var.W(204007653);
                if (z10) {
                    objK6 = lp2Var.K();
                    if (objK6 == obj) {
                        objK6 = new gh(y05Var, (byte) 6);
                        lp2Var.g0(objK6);
                    }
                    kx4 kx4VarJ12 = z51.J(kx4VarT, (gn2) objK6);
                    if ((i34 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zF = z11 | lp2Var.f(r137) | lp2Var.f(be7Var);
                    objK7 = lp2Var.K();
                    if (zF) {
                        objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                        lp2Var.g0(objK7);
                    } else {
                        objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                        lp2Var.g0(objK7);
                    }
                    kx4VarT = mb6.T(kx4VarJ12, (gn2) objK7);
                }
                final kx4 kx4Var11110 = kx4VarT;
                lp2Var.p(false);
                long j1111111110 = ys0.y(lp2Var).c.a;
                long j1111111111 = ys0.y(lp2Var).c.a;
                long j1111111112 = ys0.y(lp2Var).c.c;
                long j1111111113 = ys0.y(lp2Var).c.e;
                long j1111111114 = dw0.f;
                long j1111111115 = ys0.y(lp2Var).k.a;
                long j1111111116 = ys0.y(lp2Var).k.c;
                long j2111111111110 = ys0.y(lp2Var).c.a;
                long j2111111111111 = ys0.y(lp2Var).c.a;
                long j2111111111112 = ys0.y(lp2Var).c.c;
                long j2111111111113 = ys0.y(lp2Var).c.e;
                long j2111111111114 = ys0.y(lp2Var).c.a;
                long j2111111111115 = ys0.y(lp2Var).c.a;
                long j2111111111116 = ys0.y(lp2Var).c.c;
                long j2111111111117 = ys0.y(lp2Var).c.e;
                long j2111111111118 = ys0.y(lp2Var).c.c;
                long j2111111111119 = ys0.y(lp2Var).c.c;
                long j311111117 = ys0.y(lp2Var).c.c;
                long j311111118 = ys0.y(lp2Var).k.c;
                long j311111119 = ys0.y(lp2Var).c.b;
                long j3111111110 = ys0.y(lp2Var).c.b;
                long j3111111111 = ys0.y(lp2Var).c.c;
                long j3111111112 = ys0.y(lp2Var).c.e;
                long j3111111113 = dw0.g;
                iw0 iw0Var12 = (iw0) lp2Var.j(kw0.a);
                q06 q06Var12 = i88.a;
                i48VarA = lh4.O0(iw0Var12, (h88) lp2Var.j(q06Var12)).a(j1111111110, j1111111111, j1111111112, j1111111113, j1111111114, j1111111114, j1111111114, j1111111114, j1111111115, j1111111116, null, j9, j10, j11, j12, j2111111111110, j2111111111111, j2111111111112, j2111111111113, j2111111111114, j2111111111115, j2111111111116, j2111111111117, j3111111113, j3111111113, j3111111113, j3111111113, j2111111111118, j2111111111119, j311111117, j311111118, j311111119, j3111111110, j3111111111, j3111111112, j3111111113, j3111111113, j3111111113, j3111111113, j3111111113, j3111111113, j3111111113, j3111111113);
                if (o88Var == null) {
                    lp2Var.W(204085828);
                    o88Var2 = (o88) lp2Var.j(u78.a);
                    lp2Var.p(false);
                } else {
                    lp2Var.W(204085084);
                    lp2Var.p(false);
                    o88Var2 = o88Var;
                }
                jB = o88Var2.b();
                if (jB == 16) {
                    if (!z5) {
                        jB = i48VarA.c;
                    } else if (z9) {
                        jB = i48VarA.d;
                    } else if (((Boolean) r137.getValue()).booleanValue()) {
                        jB = i48VarA.a;
                    } else {
                        jB = i48VarA.b;
                    }
                }
                final o88 o88VarD12 = o88Var2.d(new o88(jB, 0L, null, null, 0L, 0, 0, 0L, 16777214));
                t06 t06VarA12 = q06Var12.a(i48VarA.k);
                final wx3 wx3Var15 = wx3Var3;
                final q80 q80Var14 = q80Var2;
                final kx4 kx4Var11111 = kx4Var3;
                mb6.a(t06VarA12, jm4.U(1035408509, new rn2() { // from class: uy2
                    @Override // defpackage.rn2
                    public final Object K(Object obj2, Object obj3) {
                        wx3 wx3Var16;
                        lp2 lp2Var2 = (lp2) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        byte b2 = 0;
                        if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                            kx4 kx4VarY = hi5.P(kx4Var11111, q80Var14).y(kx4Var11110);
                            boolean z13 = z10;
                            wx3 wx3Var17 = wx3Var15;
                            if (z13) {
                                Boolean bool115 = (Boolean) y05Var.getValue();
                                bool115.getClass();
                                wx3Var16 = new wx3(wx3Var17.a, wx3Var17.b, wx3Var17.c, wx3Var17.d, bool115, wx3Var17.f);
                            } else {
                                wx3Var16 = wx3Var17;
                            }
                            final boolean z14 = z9;
                            final i48 i48Var = i48VarA;
                            fe7 fe7Var = new fe7(z14 ? i48Var.j : i48Var.i);
                            zy0 zy0VarU = jm4.U(-1314685591, new wy2(b2, i6, str, kx4Var1119), lp2Var2);
                            final boolean z15 = z5;
                            final xz4 xz4Var13 = xz4Var12;
                            zy0 zy0VarU2 = jm4.U(306314943, new rn2() { // from class: xy2
                                @Override // defpackage.rn2
                                public final Object K(Object obj4, Object obj5) {
                                    lp2 lp2Var3 = (lp2) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (lp2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        lh4.H0.K0(z15, z14, xz4Var13, null, i48Var, null, 0.0f, 0.0f, lp2Var3, 100663680, 232);
                                    } else {
                                        lp2Var3.Q();
                                    }
                                    return dn8.a;
                                }
                            }, lp2Var2);
                            q58 q58Var = new q58();
                            y68 y68Var2 = y68Var;
                            w58 w58Var4 = w58Var3;
                            x30.b(y68Var2, kx4VarY, z15, de3Var3, o88VarD12, wx3Var16, w58Var4, xz4Var13, fe7Var, new z48(y68Var2, w58Var4, q58Var, zy0VarU, rn2Var7, rn2Var8, z15, z14, xz4Var13, gg5Var3, i48Var, zy0VarU2), ay6VarG, lp2Var2, 0, 6, 4744);
                        } else {
                            lp2Var2.Q();
                        }
                        return dn8.a;
                    }
                }, lp2Var), lp2Var, 56);
                z4 = z9;
                w58Var2 = w58Var3;
                rn2Var5 = rn2Var7;
                rn2Var6 = rn2Var8;
                gg5Var2 = gg5Var3;
                de3Var2 = de3Var3;
                ay6Var2 = ay6VarG;
                kx4Var5 = kx4Var1119;
                i36 = i6;
                j5 = j9;
                j6 = j10;
                j7 = j11;
                j8 = j12;
                wx3Var2 = wx3Var15;
            } else {
                lp2Var.Q();
                ay6Var2 = ay6Var;
                z4 = z;
                wx3Var2 = wx3Var;
                de3Var2 = de3Var;
                gg5Var2 = gg5Var;
                j5 = j;
                j6 = j2;
                j7 = j3;
                j8 = j4;
                kx4Var5 = kx4Var4;
                rn2Var5 = rn2Var3;
                i36 = i6;
                rn2Var6 = rn2Var4;
                z5 = z2;
                w58Var2 = w58Var;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: vy2
                    @Override // defpackage.rn2
                    public final Object K(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iP = w79.P(i2 | 1);
                        int iP2 = w79.P(i3);
                        z91.f(str, gn2Var, kx4Var, kx4Var5, i36, y68Var, ay6Var2, o88Var, rn2Var5, rn2Var6, z4, z5, wx3Var2, w58Var2, de3Var2, gg5Var2, j5, j6, j7, j8, (lp2) obj2, iP, iP2, i4);
                        return dn8.a;
                    }
                };
            }
        }
        i7 = i5 | 905969664;
        rn2Var3 = rn2Var;
        i10 = i4 & 1024;
        if (i10 != 0) {
            rn2Var4 = rn2Var2;
            i12 = i3 | 6;
            i11 = 131072;
        } else {
            rn2Var4 = rn2Var2;
            if ((i3 & 6) == 0) {
                i11 = 131072;
                if (lp2Var.h(rn2Var4)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                i12 = i3 | i13;
            } else {
                i11 = 131072;
                i12 = i3;
            }
        }
        i14 = i4 & 2048;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i3 & 48) == 0) {
            if (lp2Var.g(z)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        i16 = i12;
        i17 = i4 & 4096;
        if (i17 != 0) {
            i19 = i16 | 384;
        } else {
            i18 = i16;
            if ((i3 & 384) != 0) {
                if (lp2Var.g(z2)) {
                    i20 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i20 = 128;
                }
                i18 |= i20;
            }
            i19 = i18;
        }
        i21 = i4 & 8192;
        if (i21 != 0) {
            i23 = i19 | 3072;
        } else {
            i22 = i19;
            if ((i3 & 3072) == 0) {
                i23 = i22 | (lp2Var.f(wx3Var) ? 2048 : 1024);
            } else {
                i23 = i22;
            }
        }
        i24 = i4 & Http2.INITIAL_MAX_FRAME_SIZE;
        if (i24 != 0) {
            i25 = i23;
            if ((i3 & 24576) == 0) {
                i25 |= lp2Var.f(w58Var) ? 16384 : 8192;
            }
            i26 = i4 & 32768;
            if (i26 != 0) {
                i25 |= 196608;
            } else if ((i3 & 196608) == 0) {
                if (lp2Var.f(de3Var)) {
                    i27 = i11;
                } else {
                    i27 = 65536;
                }
                i25 |= i27;
            }
            i28 = i4 & DnsOverHttps.MAX_RESPONSE_SIZE;
            if (i28 != 0) {
                i25 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (lp2Var.f(gg5Var)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i25 |= i29;
            }
            i30 = i4 & i11;
            if (i30 != 0) {
                if ((i3 & 12582912) == 0) {
                    i25 |= lp2Var.e(j) ? 8388608 : 4194304;
                }
                i31 = i4 & 262144;
                if (i31 != 0) {
                    i25 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    if (lp2Var.e(j2)) {
                        i32 = 67108864;
                    } else {
                        i32 = 33554432;
                    }
                    i25 |= i32;
                }
                i33 = i4 & 524288;
                if (i33 != 0) {
                    i25 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i25 |= lp2Var.e(j3) ? 536870912 : 268435456;
                }
                i34 = i25;
                i35 = i4 & 1048576;
                if (i35 != 0) {
                    c2 = 6;
                } else if (lp2Var.e(j4)) {
                    c2 = 4;
                } else {
                    c2 = 2;
                }
                if ((i7 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (lp2Var.N(i7 & 1, z3)) {
                    lp2Var.S();
                    i37 = i2 & 1;
                    kx4VarT = hx4.X;
                    if (i37 != 0) {
                        if (i42 != 0) {
                            kx4Var4 = kx4VarT;
                        }
                        if ((i4 & 16) != 0) {
                            i7 &= -57345;
                            i6 = 5;
                        }
                        ay6VarG = dh3.G(lp2Var);
                        int i41118 = i7 & (-3670017);
                        if (i8 != 0) {
                            rn2Var3 = null;
                        }
                        if (i10 != 0) {
                            rn2Var4 = null;
                        }
                        if (i14 != 0) {
                            z6 = false;
                        } else {
                            z6 = z;
                        }
                        if (i17 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i21 != 0) {
                            wx3Var3 = wx3.g;
                        } else {
                            wx3Var3 = wx3Var;
                        }
                        if (i24 != 0) {
                            w58Var3 = qe4.x0;
                        } else {
                            w58Var3 = w58Var;
                        }
                        if (i26 != 0) {
                            de3Var3 = null;
                        } else {
                            de3Var3 = de3Var;
                        }
                        if (i28 != 0) {
                            ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            ig5Var = gg5Var;
                        }
                        if (i30 != 0) {
                            j9 = dw0.f;
                        } else {
                            j9 = j;
                        }
                        if (i31 != 0) {
                            j10 = dw0.f;
                        } else {
                            j10 = j2;
                        }
                        if (i33 != 0) {
                            j11 = dw0.f;
                        } else {
                            j11 = j3;
                        }
                        if (i35 != 0) {
                            j12 = dw0.f;
                        } else {
                            j12 = j4;
                        }
                        gg5Var3 = ig5Var;
                        rn2Var7 = rn2Var3;
                        i38 = i41118;
                        rn2Var8 = rn2Var4;
                    } else {
                        if (i42 != 0) {
                            kx4Var4 = kx4VarT;
                        }
                        if ((i4 & 16) != 0) {
                            i7 &= -57345;
                            i6 = 5;
                        }
                        ay6VarG = dh3.G(lp2Var);
                        int i41119 = i7 & (-3670017);
                        if (i8 != 0) {
                            rn2Var3 = null;
                        }
                        if (i10 != 0) {
                            rn2Var4 = null;
                        }
                        if (i14 != 0) {
                            z6 = false;
                        } else {
                            z6 = z;
                        }
                        if (i17 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i21 != 0) {
                            wx3Var3 = wx3.g;
                        } else {
                            wx3Var3 = wx3Var;
                        }
                        if (i24 != 0) {
                            w58Var3 = qe4.x0;
                        } else {
                            w58Var3 = w58Var;
                        }
                        if (i26 != 0) {
                            de3Var3 = null;
                        } else {
                            de3Var3 = de3Var;
                        }
                        if (i28 != 0) {
                            ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            ig5Var = gg5Var;
                        }
                        if (i30 != 0) {
                            j9 = dw0.f;
                        } else {
                            j9 = j;
                        }
                        if (i31 != 0) {
                            j10 = dw0.f;
                        } else {
                            j10 = j2;
                        }
                        if (i33 != 0) {
                            j11 = dw0.f;
                        } else {
                            j11 = j3;
                        }
                        if (i35 != 0) {
                            j12 = dw0.f;
                        } else {
                            j12 = j4;
                        }
                        gg5Var3 = ig5Var;
                        rn2Var7 = rn2Var3;
                        i38 = i41119;
                        rn2Var8 = rn2Var4;
                    }
                    lp2Var.q();
                    int i411110 = i11;
                    if (((458752 & i38) ^ 196608) <= i411110) {
                    }
                    if ((i38 & 112) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z7 | z12;
                    objK = lp2Var.K();
                    obj = zz0.a;
                    if (z8) {
                        objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                        lp2Var.g0(objK);
                    } else {
                        objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                        lp2Var.g0(objK);
                    }
                    u70.h((rn2) objK, lp2Var, y68Var);
                    objK2 = lp2Var.K();
                    if (objK2 == obj) {
                        objK2 = new xz4();
                        lp2Var.g0(objK2);
                    }
                    final xz4 xz4Var13 = (xz4) objK2;
                    y05VarS = km4.s(xz4Var13, lp2Var, 6);
                    zT = oc.t(lp2Var);
                    objK3 = lp2Var.K();
                    if (objK3 == obj) {
                        objK3 = z51.H(Boolean.FALSE);
                        lp2Var.g0(objK3);
                    }
                    y05Var = (y05) objK3;
                    objK4 = lp2Var.K();
                    if (objK4 == obj) {
                        objK4 = new q80();
                        lp2Var.g0(objK4);
                    }
                    q80Var = (q80) objK4;
                    WeakHashMap weakHashMap13 = c29.w;
                    Boolean bool115 = (Boolean) hw7.b(lp2Var).c.d.getValue();
                    zBooleanValue = bool115.booleanValue();
                    final kx4 kx4Var11112 = kx4Var4;
                    Boolean boolValueOf13 = Boolean.valueOf(zT);
                    z9 = z6;
                    Boolean bool116 = (Boolean) y05VarS.getValue();
                    bool116.getClass();
                    zG = lp2Var.g(zT) | lp2Var.f(y05VarS) | lp2Var.g(zBooleanValue) | lp2Var.h(q80Var);
                    objK5 = lp2Var.K();
                    if (zG) {
                        objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                        z10 = zT;
                        q80Var2 = q80Var;
                        lp2Var.g0(objK5);
                    } else {
                        objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                        z10 = zT;
                        q80Var2 = q80Var;
                        lp2Var.g0(objK5);
                    }
                    u70.i(boolValueOf13, bool116, bool115, (rn2) objK5, lp2Var);
                    be7Var = (be7) lp2Var.j(y01.q);
                    lp2Var.W(204007653);
                    if (z10) {
                        objK6 = lp2Var.K();
                        if (objK6 == obj) {
                            objK6 = new gh(y05Var, (byte) 6);
                            lp2Var.g0(objK6);
                        }
                        kx4 kx4VarJ13 = z51.J(kx4VarT, (gn2) objK6);
                        if ((i34 & 896) == 256) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zF = z11 | lp2Var.f(r137) | lp2Var.f(be7Var);
                        objK7 = lp2Var.K();
                        if (zF) {
                            objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                            lp2Var.g0(objK7);
                        } else {
                            objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                            lp2Var.g0(objK7);
                        }
                        kx4VarT = mb6.T(kx4VarJ13, (gn2) objK7);
                    }
                    final kx4 kx4Var11113 = kx4VarT;
                    lp2Var.p(false);
                    long j1111111117 = ys0.y(lp2Var).c.a;
                    long j1111111118 = ys0.y(lp2Var).c.a;
                    long j1111111119 = ys0.y(lp2Var).c.c;
                    long j11111111110 = ys0.y(lp2Var).c.e;
                    long j11111111111 = dw0.f;
                    long j11111111112 = ys0.y(lp2Var).k.a;
                    long j11111111113 = ys0.y(lp2Var).k.c;
                    long j21111111111110 = ys0.y(lp2Var).c.a;
                    long j21111111111111 = ys0.y(lp2Var).c.a;
                    long j21111111111112 = ys0.y(lp2Var).c.c;
                    long j21111111111113 = ys0.y(lp2Var).c.e;
                    long j21111111111114 = ys0.y(lp2Var).c.a;
                    long j21111111111115 = ys0.y(lp2Var).c.a;
                    long j21111111111116 = ys0.y(lp2Var).c.c;
                    long j21111111111117 = ys0.y(lp2Var).c.e;
                    long j21111111111118 = ys0.y(lp2Var).c.c;
                    long j21111111111119 = ys0.y(lp2Var).c.c;
                    long j3111111114 = ys0.y(lp2Var).c.c;
                    long j3111111115 = ys0.y(lp2Var).k.c;
                    long j3111111116 = ys0.y(lp2Var).c.b;
                    long j3111111117 = ys0.y(lp2Var).c.b;
                    long j3111111118 = ys0.y(lp2Var).c.c;
                    long j3111111119 = ys0.y(lp2Var).c.e;
                    long j31111111110 = dw0.g;
                    iw0 iw0Var13 = (iw0) lp2Var.j(kw0.a);
                    q06 q06Var13 = i88.a;
                    i48VarA = lh4.O0(iw0Var13, (h88) lp2Var.j(q06Var13)).a(j1111111117, j1111111118, j1111111119, j11111111110, j11111111111, j11111111111, j11111111111, j11111111111, j11111111112, j11111111113, null, j9, j10, j11, j12, j21111111111110, j21111111111111, j21111111111112, j21111111111113, j21111111111114, j21111111111115, j21111111111116, j21111111111117, j31111111110, j31111111110, j31111111110, j31111111110, j21111111111118, j21111111111119, j3111111114, j3111111115, j3111111116, j3111111117, j3111111118, j3111111119, j31111111110, j31111111110, j31111111110, j31111111110, j31111111110, j31111111110, j31111111110, j31111111110);
                    if (o88Var == null) {
                        lp2Var.W(204085828);
                        o88Var2 = (o88) lp2Var.j(u78.a);
                        lp2Var.p(false);
                    } else {
                        lp2Var.W(204085084);
                        lp2Var.p(false);
                        o88Var2 = o88Var;
                    }
                    jB = o88Var2.b();
                    if (jB == 16) {
                        if (!z5) {
                            jB = i48VarA.c;
                        } else if (z9) {
                            jB = i48VarA.d;
                        } else if (((Boolean) r137.getValue()).booleanValue()) {
                            jB = i48VarA.a;
                        } else {
                            jB = i48VarA.b;
                        }
                    }
                    final o88 o88VarD13 = o88Var2.d(new o88(jB, 0L, null, null, 0L, 0, 0, 0L, 16777214));
                    t06 t06VarA13 = q06Var13.a(i48VarA.k);
                    final wx3 wx3Var16 = wx3Var3;
                    final q80 q80Var15 = q80Var2;
                    final kx4 kx4Var11114 = kx4Var3;
                    mb6.a(t06VarA13, jm4.U(1035408509, new rn2() { // from class: uy2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            wx3 wx3Var17;
                            lp2 lp2Var2 = (lp2) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            byte b2 = 0;
                            if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                kx4 kx4VarY = hi5.P(kx4Var11114, q80Var15).y(kx4Var11113);
                                boolean z13 = z10;
                                wx3 wx3Var18 = wx3Var16;
                                if (z13) {
                                    Boolean bool117 = (Boolean) y05Var.getValue();
                                    bool117.getClass();
                                    wx3Var17 = new wx3(wx3Var18.a, wx3Var18.b, wx3Var18.c, wx3Var18.d, bool117, wx3Var18.f);
                                } else {
                                    wx3Var17 = wx3Var18;
                                }
                                final boolean z14 = z9;
                                final i48 i48Var = i48VarA;
                                fe7 fe7Var = new fe7(z14 ? i48Var.j : i48Var.i);
                                zy0 zy0VarU = jm4.U(-1314685591, new wy2(b2, i6, str, kx4Var11112), lp2Var2);
                                final boolean z15 = z5;
                                final xz4 xz4Var14 = xz4Var13;
                                zy0 zy0VarU2 = jm4.U(306314943, new rn2() { // from class: xy2
                                    @Override // defpackage.rn2
                                    public final Object K(Object obj4, Object obj5) {
                                        lp2 lp2Var3 = (lp2) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        if (lp2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            lh4.H0.K0(z15, z14, xz4Var14, null, i48Var, null, 0.0f, 0.0f, lp2Var3, 100663680, 232);
                                        } else {
                                            lp2Var3.Q();
                                        }
                                        return dn8.a;
                                    }
                                }, lp2Var2);
                                q58 q58Var = new q58();
                                y68 y68Var2 = y68Var;
                                w58 w58Var4 = w58Var3;
                                x30.b(y68Var2, kx4VarY, z15, de3Var3, o88VarD13, wx3Var17, w58Var4, xz4Var14, fe7Var, new z48(y68Var2, w58Var4, q58Var, zy0VarU, rn2Var7, rn2Var8, z15, z14, xz4Var14, gg5Var3, i48Var, zy0VarU2), ay6VarG, lp2Var2, 0, 6, 4744);
                            } else {
                                lp2Var2.Q();
                            }
                            return dn8.a;
                        }
                    }, lp2Var), lp2Var, 56);
                    z4 = z9;
                    w58Var2 = w58Var3;
                    rn2Var5 = rn2Var7;
                    rn2Var6 = rn2Var8;
                    gg5Var2 = gg5Var3;
                    de3Var2 = de3Var3;
                    ay6Var2 = ay6VarG;
                    kx4Var5 = kx4Var11112;
                    i36 = i6;
                    j5 = j9;
                    j6 = j10;
                    j7 = j11;
                    j8 = j12;
                    wx3Var2 = wx3Var16;
                } else {
                    lp2Var.Q();
                    ay6Var2 = ay6Var;
                    z4 = z;
                    wx3Var2 = wx3Var;
                    de3Var2 = de3Var;
                    gg5Var2 = gg5Var;
                    j5 = j;
                    j6 = j2;
                    j7 = j3;
                    j8 = j4;
                    kx4Var5 = kx4Var4;
                    rn2Var5 = rn2Var3;
                    i36 = i6;
                    rn2Var6 = rn2Var4;
                    z5 = z2;
                    w58Var2 = w58Var;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: vy2
                        @Override // defpackage.rn2
                        public final Object K(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iP = w79.P(i2 | 1);
                            int iP2 = w79.P(i3);
                            z91.f(str, gn2Var, kx4Var, kx4Var5, i36, y68Var, ay6Var2, o88Var, rn2Var5, rn2Var6, z4, z5, wx3Var2, w58Var2, de3Var2, gg5Var2, j5, j6, j7, j8, (lp2) obj2, iP, iP2, i4);
                            return dn8.a;
                        }
                    };
                }
            }
            i25 |= 12582912;
            i31 = i4 & 262144;
            if (i31 != 0) {
                i25 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                if (lp2Var.e(j2)) {
                    i32 = 67108864;
                } else {
                    i32 = 33554432;
                }
                i25 |= i32;
            }
            i33 = i4 & 524288;
            if (i33 != 0) {
                i25 |= 805306368;
            } else if ((i3 & 805306368) == 0) {
                i25 |= lp2Var.e(j3) ? 536870912 : 268435456;
            }
            i34 = i25;
            i35 = i4 & 1048576;
            if (i35 != 0) {
                c2 = 6;
            } else if (lp2Var.e(j4)) {
                c2 = 4;
            } else {
                c2 = 2;
            }
            if ((i7 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (lp2Var.N(i7 & 1, z3)) {
                lp2Var.S();
                i37 = i2 & 1;
                kx4VarT = hx4.X;
                if (i37 != 0) {
                    if (i42 != 0) {
                        kx4Var4 = kx4VarT;
                    }
                    if ((i4 & 16) != 0) {
                        i7 &= -57345;
                        i6 = 5;
                    }
                    ay6VarG = dh3.G(lp2Var);
                    int i411111 = i7 & (-3670017);
                    if (i8 != 0) {
                        rn2Var3 = null;
                    }
                    if (i10 != 0) {
                        rn2Var4 = null;
                    }
                    if (i14 != 0) {
                        z6 = false;
                    } else {
                        z6 = z;
                    }
                    if (i17 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i21 != 0) {
                        wx3Var3 = wx3.g;
                    } else {
                        wx3Var3 = wx3Var;
                    }
                    if (i24 != 0) {
                        w58Var3 = qe4.x0;
                    } else {
                        w58Var3 = w58Var;
                    }
                    if (i26 != 0) {
                        de3Var3 = null;
                    } else {
                        de3Var3 = de3Var;
                    }
                    if (i28 != 0) {
                        ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        ig5Var = gg5Var;
                    }
                    if (i30 != 0) {
                        j9 = dw0.f;
                    } else {
                        j9 = j;
                    }
                    if (i31 != 0) {
                        j10 = dw0.f;
                    } else {
                        j10 = j2;
                    }
                    if (i33 != 0) {
                        j11 = dw0.f;
                    } else {
                        j11 = j3;
                    }
                    if (i35 != 0) {
                        j12 = dw0.f;
                    } else {
                        j12 = j4;
                    }
                    gg5Var3 = ig5Var;
                    rn2Var7 = rn2Var3;
                    i38 = i411111;
                    rn2Var8 = rn2Var4;
                } else {
                    if (i42 != 0) {
                        kx4Var4 = kx4VarT;
                    }
                    if ((i4 & 16) != 0) {
                        i7 &= -57345;
                        i6 = 5;
                    }
                    ay6VarG = dh3.G(lp2Var);
                    int i411112 = i7 & (-3670017);
                    if (i8 != 0) {
                        rn2Var3 = null;
                    }
                    if (i10 != 0) {
                        rn2Var4 = null;
                    }
                    if (i14 != 0) {
                        z6 = false;
                    } else {
                        z6 = z;
                    }
                    if (i17 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i21 != 0) {
                        wx3Var3 = wx3.g;
                    } else {
                        wx3Var3 = wx3Var;
                    }
                    if (i24 != 0) {
                        w58Var3 = qe4.x0;
                    } else {
                        w58Var3 = w58Var;
                    }
                    if (i26 != 0) {
                        de3Var3 = null;
                    } else {
                        de3Var3 = de3Var;
                    }
                    if (i28 != 0) {
                        ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        ig5Var = gg5Var;
                    }
                    if (i30 != 0) {
                        j9 = dw0.f;
                    } else {
                        j9 = j;
                    }
                    if (i31 != 0) {
                        j10 = dw0.f;
                    } else {
                        j10 = j2;
                    }
                    if (i33 != 0) {
                        j11 = dw0.f;
                    } else {
                        j11 = j3;
                    }
                    if (i35 != 0) {
                        j12 = dw0.f;
                    } else {
                        j12 = j4;
                    }
                    gg5Var3 = ig5Var;
                    rn2Var7 = rn2Var3;
                    i38 = i411112;
                    rn2Var8 = rn2Var4;
                }
                lp2Var.q();
                int i411113 = i11;
                if (((458752 & i38) ^ 196608) <= i411113) {
                }
                if ((i38 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z7 | z12;
                objK = lp2Var.K();
                obj = zz0.a;
                if (z8) {
                    objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                    lp2Var.g0(objK);
                } else {
                    objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                    lp2Var.g0(objK);
                }
                u70.h((rn2) objK, lp2Var, y68Var);
                objK2 = lp2Var.K();
                if (objK2 == obj) {
                    objK2 = new xz4();
                    lp2Var.g0(objK2);
                }
                final xz4 xz4Var14 = (xz4) objK2;
                y05VarS = km4.s(xz4Var14, lp2Var, 6);
                zT = oc.t(lp2Var);
                objK3 = lp2Var.K();
                if (objK3 == obj) {
                    objK3 = z51.H(Boolean.FALSE);
                    lp2Var.g0(objK3);
                }
                y05Var = (y05) objK3;
                objK4 = lp2Var.K();
                if (objK4 == obj) {
                    objK4 = new q80();
                    lp2Var.g0(objK4);
                }
                q80Var = (q80) objK4;
                WeakHashMap weakHashMap14 = c29.w;
                Boolean bool117 = (Boolean) hw7.b(lp2Var).c.d.getValue();
                zBooleanValue = bool117.booleanValue();
                final kx4 kx4Var11115 = kx4Var4;
                Boolean boolValueOf14 = Boolean.valueOf(zT);
                z9 = z6;
                Boolean bool118 = (Boolean) y05VarS.getValue();
                bool118.getClass();
                zG = lp2Var.g(zT) | lp2Var.f(y05VarS) | lp2Var.g(zBooleanValue) | lp2Var.h(q80Var);
                objK5 = lp2Var.K();
                if (zG) {
                    objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                    z10 = zT;
                    q80Var2 = q80Var;
                    lp2Var.g0(objK5);
                } else {
                    objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                    z10 = zT;
                    q80Var2 = q80Var;
                    lp2Var.g0(objK5);
                }
                u70.i(boolValueOf14, bool118, bool117, (rn2) objK5, lp2Var);
                be7Var = (be7) lp2Var.j(y01.q);
                lp2Var.W(204007653);
                if (z10) {
                    objK6 = lp2Var.K();
                    if (objK6 == obj) {
                        objK6 = new gh(y05Var, (byte) 6);
                        lp2Var.g0(objK6);
                    }
                    kx4 kx4VarJ14 = z51.J(kx4VarT, (gn2) objK6);
                    if ((i34 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zF = z11 | lp2Var.f(r137) | lp2Var.f(be7Var);
                    objK7 = lp2Var.K();
                    if (zF) {
                        objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                        lp2Var.g0(objK7);
                    } else {
                        objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                        lp2Var.g0(objK7);
                    }
                    kx4VarT = mb6.T(kx4VarJ14, (gn2) objK7);
                }
                final kx4 kx4Var11116 = kx4VarT;
                lp2Var.p(false);
                long j11111111114 = ys0.y(lp2Var).c.a;
                long j11111111115 = ys0.y(lp2Var).c.a;
                long j11111111116 = ys0.y(lp2Var).c.c;
                long j11111111117 = ys0.y(lp2Var).c.e;
                long j11111111118 = dw0.f;
                long j11111111119 = ys0.y(lp2Var).k.a;
                long j111111111110 = ys0.y(lp2Var).k.c;
                long j211111111111110 = ys0.y(lp2Var).c.a;
                long j211111111111111 = ys0.y(lp2Var).c.a;
                long j211111111111112 = ys0.y(lp2Var).c.c;
                long j211111111111113 = ys0.y(lp2Var).c.e;
                long j211111111111114 = ys0.y(lp2Var).c.a;
                long j211111111111115 = ys0.y(lp2Var).c.a;
                long j211111111111116 = ys0.y(lp2Var).c.c;
                long j211111111111117 = ys0.y(lp2Var).c.e;
                long j211111111111118 = ys0.y(lp2Var).c.c;
                long j211111111111119 = ys0.y(lp2Var).c.c;
                long j31111111111 = ys0.y(lp2Var).c.c;
                long j31111111112 = ys0.y(lp2Var).k.c;
                long j31111111113 = ys0.y(lp2Var).c.b;
                long j31111111114 = ys0.y(lp2Var).c.b;
                long j31111111115 = ys0.y(lp2Var).c.c;
                long j31111111116 = ys0.y(lp2Var).c.e;
                long j31111111117 = dw0.g;
                iw0 iw0Var14 = (iw0) lp2Var.j(kw0.a);
                q06 q06Var14 = i88.a;
                i48VarA = lh4.O0(iw0Var14, (h88) lp2Var.j(q06Var14)).a(j11111111114, j11111111115, j11111111116, j11111111117, j11111111118, j11111111118, j11111111118, j11111111118, j11111111119, j111111111110, null, j9, j10, j11, j12, j211111111111110, j211111111111111, j211111111111112, j211111111111113, j211111111111114, j211111111111115, j211111111111116, j211111111111117, j31111111117, j31111111117, j31111111117, j31111111117, j211111111111118, j211111111111119, j31111111111, j31111111112, j31111111113, j31111111114, j31111111115, j31111111116, j31111111117, j31111111117, j31111111117, j31111111117, j31111111117, j31111111117, j31111111117, j31111111117);
                if (o88Var == null) {
                    lp2Var.W(204085828);
                    o88Var2 = (o88) lp2Var.j(u78.a);
                    lp2Var.p(false);
                } else {
                    lp2Var.W(204085084);
                    lp2Var.p(false);
                    o88Var2 = o88Var;
                }
                jB = o88Var2.b();
                if (jB == 16) {
                    if (!z5) {
                        jB = i48VarA.c;
                    } else if (z9) {
                        jB = i48VarA.d;
                    } else if (((Boolean) r137.getValue()).booleanValue()) {
                        jB = i48VarA.a;
                    } else {
                        jB = i48VarA.b;
                    }
                }
                final o88 o88VarD14 = o88Var2.d(new o88(jB, 0L, null, null, 0L, 0, 0, 0L, 16777214));
                t06 t06VarA14 = q06Var14.a(i48VarA.k);
                final wx3 wx3Var17 = wx3Var3;
                final q80 q80Var16 = q80Var2;
                final kx4 kx4Var11117 = kx4Var3;
                mb6.a(t06VarA14, jm4.U(1035408509, new rn2() { // from class: uy2
                    @Override // defpackage.rn2
                    public final Object K(Object obj2, Object obj3) {
                        wx3 wx3Var18;
                        lp2 lp2Var2 = (lp2) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        byte b2 = 0;
                        if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                            kx4 kx4VarY = hi5.P(kx4Var11117, q80Var16).y(kx4Var11116);
                            boolean z13 = z10;
                            wx3 wx3Var19 = wx3Var17;
                            if (z13) {
                                Boolean bool119 = (Boolean) y05Var.getValue();
                                bool119.getClass();
                                wx3Var18 = new wx3(wx3Var19.a, wx3Var19.b, wx3Var19.c, wx3Var19.d, bool119, wx3Var19.f);
                            } else {
                                wx3Var18 = wx3Var19;
                            }
                            final boolean z14 = z9;
                            final i48 i48Var = i48VarA;
                            fe7 fe7Var = new fe7(z14 ? i48Var.j : i48Var.i);
                            zy0 zy0VarU = jm4.U(-1314685591, new wy2(b2, i6, str, kx4Var11115), lp2Var2);
                            final boolean z15 = z5;
                            final xz4 xz4Var15 = xz4Var14;
                            zy0 zy0VarU2 = jm4.U(306314943, new rn2() { // from class: xy2
                                @Override // defpackage.rn2
                                public final Object K(Object obj4, Object obj5) {
                                    lp2 lp2Var3 = (lp2) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (lp2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        lh4.H0.K0(z15, z14, xz4Var15, null, i48Var, null, 0.0f, 0.0f, lp2Var3, 100663680, 232);
                                    } else {
                                        lp2Var3.Q();
                                    }
                                    return dn8.a;
                                }
                            }, lp2Var2);
                            q58 q58Var = new q58();
                            y68 y68Var2 = y68Var;
                            w58 w58Var4 = w58Var3;
                            x30.b(y68Var2, kx4VarY, z15, de3Var3, o88VarD14, wx3Var18, w58Var4, xz4Var15, fe7Var, new z48(y68Var2, w58Var4, q58Var, zy0VarU, rn2Var7, rn2Var8, z15, z14, xz4Var15, gg5Var3, i48Var, zy0VarU2), ay6VarG, lp2Var2, 0, 6, 4744);
                        } else {
                            lp2Var2.Q();
                        }
                        return dn8.a;
                    }
                }, lp2Var), lp2Var, 56);
                z4 = z9;
                w58Var2 = w58Var3;
                rn2Var5 = rn2Var7;
                rn2Var6 = rn2Var8;
                gg5Var2 = gg5Var3;
                de3Var2 = de3Var3;
                ay6Var2 = ay6VarG;
                kx4Var5 = kx4Var11115;
                i36 = i6;
                j5 = j9;
                j6 = j10;
                j7 = j11;
                j8 = j12;
                wx3Var2 = wx3Var17;
            } else {
                lp2Var.Q();
                ay6Var2 = ay6Var;
                z4 = z;
                wx3Var2 = wx3Var;
                de3Var2 = de3Var;
                gg5Var2 = gg5Var;
                j5 = j;
                j6 = j2;
                j7 = j3;
                j8 = j4;
                kx4Var5 = kx4Var4;
                rn2Var5 = rn2Var3;
                i36 = i6;
                rn2Var6 = rn2Var4;
                z5 = z2;
                w58Var2 = w58Var;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: vy2
                    @Override // defpackage.rn2
                    public final Object K(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iP = w79.P(i2 | 1);
                        int iP2 = w79.P(i3);
                        z91.f(str, gn2Var, kx4Var, kx4Var5, i36, y68Var, ay6Var2, o88Var, rn2Var5, rn2Var6, z4, z5, wx3Var2, w58Var2, de3Var2, gg5Var2, j5, j6, j7, j8, (lp2) obj2, iP, iP2, i4);
                        return dn8.a;
                    }
                };
            }
        }
        i25 = i23 | 24576;
        i26 = i4 & 32768;
        if (i26 != 0) {
            i25 |= 196608;
        } else if ((i3 & 196608) == 0) {
            if (lp2Var.f(de3Var)) {
                i27 = i11;
            } else {
                i27 = 65536;
            }
            i25 |= i27;
        }
        i28 = i4 & DnsOverHttps.MAX_RESPONSE_SIZE;
        if (i28 != 0) {
            i25 |= 1572864;
        } else if ((i3 & 1572864) == 0) {
            if (lp2Var.f(gg5Var)) {
                i29 = 1048576;
            } else {
                i29 = 524288;
            }
            i25 |= i29;
        }
        i30 = i4 & i11;
        if (i30 != 0) {
            if ((i3 & 12582912) == 0) {
                i25 |= lp2Var.e(j) ? 8388608 : 4194304;
            }
            i31 = i4 & 262144;
            if (i31 != 0) {
                i25 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                if (lp2Var.e(j2)) {
                    i32 = 67108864;
                } else {
                    i32 = 33554432;
                }
                i25 |= i32;
            }
            i33 = i4 & 524288;
            if (i33 != 0) {
                i25 |= 805306368;
            } else if ((i3 & 805306368) == 0) {
                i25 |= lp2Var.e(j3) ? 536870912 : 268435456;
            }
            i34 = i25;
            i35 = i4 & 1048576;
            if (i35 != 0) {
                c2 = 6;
            } else if (lp2Var.e(j4)) {
                c2 = 4;
            } else {
                c2 = 2;
            }
            if ((i7 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (lp2Var.N(i7 & 1, z3)) {
                lp2Var.S();
                i37 = i2 & 1;
                kx4VarT = hx4.X;
                if (i37 != 0) {
                    if (i42 != 0) {
                        kx4Var4 = kx4VarT;
                    }
                    if ((i4 & 16) != 0) {
                        i7 &= -57345;
                        i6 = 5;
                    }
                    ay6VarG = dh3.G(lp2Var);
                    int i411114 = i7 & (-3670017);
                    if (i8 != 0) {
                        rn2Var3 = null;
                    }
                    if (i10 != 0) {
                        rn2Var4 = null;
                    }
                    if (i14 != 0) {
                        z6 = false;
                    } else {
                        z6 = z;
                    }
                    if (i17 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i21 != 0) {
                        wx3Var3 = wx3.g;
                    } else {
                        wx3Var3 = wx3Var;
                    }
                    if (i24 != 0) {
                        w58Var3 = qe4.x0;
                    } else {
                        w58Var3 = w58Var;
                    }
                    if (i26 != 0) {
                        de3Var3 = null;
                    } else {
                        de3Var3 = de3Var;
                    }
                    if (i28 != 0) {
                        ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        ig5Var = gg5Var;
                    }
                    if (i30 != 0) {
                        j9 = dw0.f;
                    } else {
                        j9 = j;
                    }
                    if (i31 != 0) {
                        j10 = dw0.f;
                    } else {
                        j10 = j2;
                    }
                    if (i33 != 0) {
                        j11 = dw0.f;
                    } else {
                        j11 = j3;
                    }
                    if (i35 != 0) {
                        j12 = dw0.f;
                    } else {
                        j12 = j4;
                    }
                    gg5Var3 = ig5Var;
                    rn2Var7 = rn2Var3;
                    i38 = i411114;
                    rn2Var8 = rn2Var4;
                } else {
                    if (i42 != 0) {
                        kx4Var4 = kx4VarT;
                    }
                    if ((i4 & 16) != 0) {
                        i7 &= -57345;
                        i6 = 5;
                    }
                    ay6VarG = dh3.G(lp2Var);
                    int i411115 = i7 & (-3670017);
                    if (i8 != 0) {
                        rn2Var3 = null;
                    }
                    if (i10 != 0) {
                        rn2Var4 = null;
                    }
                    if (i14 != 0) {
                        z6 = false;
                    } else {
                        z6 = z;
                    }
                    if (i17 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i21 != 0) {
                        wx3Var3 = wx3.g;
                    } else {
                        wx3Var3 = wx3Var;
                    }
                    if (i24 != 0) {
                        w58Var3 = qe4.x0;
                    } else {
                        w58Var3 = w58Var;
                    }
                    if (i26 != 0) {
                        de3Var3 = null;
                    } else {
                        de3Var3 = de3Var;
                    }
                    if (i28 != 0) {
                        ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        ig5Var = gg5Var;
                    }
                    if (i30 != 0) {
                        j9 = dw0.f;
                    } else {
                        j9 = j;
                    }
                    if (i31 != 0) {
                        j10 = dw0.f;
                    } else {
                        j10 = j2;
                    }
                    if (i33 != 0) {
                        j11 = dw0.f;
                    } else {
                        j11 = j3;
                    }
                    if (i35 != 0) {
                        j12 = dw0.f;
                    } else {
                        j12 = j4;
                    }
                    gg5Var3 = ig5Var;
                    rn2Var7 = rn2Var3;
                    i38 = i411115;
                    rn2Var8 = rn2Var4;
                }
                lp2Var.q();
                int i411116 = i11;
                if (((458752 & i38) ^ 196608) <= i411116) {
                }
                if ((i38 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z7 | z12;
                objK = lp2Var.K();
                obj = zz0.a;
                if (z8) {
                    objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                    lp2Var.g0(objK);
                } else {
                    objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                    lp2Var.g0(objK);
                }
                u70.h((rn2) objK, lp2Var, y68Var);
                objK2 = lp2Var.K();
                if (objK2 == obj) {
                    objK2 = new xz4();
                    lp2Var.g0(objK2);
                }
                final xz4 xz4Var15 = (xz4) objK2;
                y05VarS = km4.s(xz4Var15, lp2Var, 6);
                zT = oc.t(lp2Var);
                objK3 = lp2Var.K();
                if (objK3 == obj) {
                    objK3 = z51.H(Boolean.FALSE);
                    lp2Var.g0(objK3);
                }
                y05Var = (y05) objK3;
                objK4 = lp2Var.K();
                if (objK4 == obj) {
                    objK4 = new q80();
                    lp2Var.g0(objK4);
                }
                q80Var = (q80) objK4;
                WeakHashMap weakHashMap15 = c29.w;
                Boolean bool119 = (Boolean) hw7.b(lp2Var).c.d.getValue();
                zBooleanValue = bool119.booleanValue();
                final kx4 kx4Var11118 = kx4Var4;
                Boolean boolValueOf15 = Boolean.valueOf(zT);
                z9 = z6;
                Boolean bool1110 = (Boolean) y05VarS.getValue();
                bool1110.getClass();
                zG = lp2Var.g(zT) | lp2Var.f(y05VarS) | lp2Var.g(zBooleanValue) | lp2Var.h(q80Var);
                objK5 = lp2Var.K();
                if (zG) {
                    objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                    z10 = zT;
                    q80Var2 = q80Var;
                    lp2Var.g0(objK5);
                } else {
                    objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                    z10 = zT;
                    q80Var2 = q80Var;
                    lp2Var.g0(objK5);
                }
                u70.i(boolValueOf15, bool1110, bool119, (rn2) objK5, lp2Var);
                be7Var = (be7) lp2Var.j(y01.q);
                lp2Var.W(204007653);
                if (z10) {
                    objK6 = lp2Var.K();
                    if (objK6 == obj) {
                        objK6 = new gh(y05Var, (byte) 6);
                        lp2Var.g0(objK6);
                    }
                    kx4 kx4VarJ15 = z51.J(kx4VarT, (gn2) objK6);
                    if ((i34 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zF = z11 | lp2Var.f(r137) | lp2Var.f(be7Var);
                    objK7 = lp2Var.K();
                    if (zF) {
                        objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                        lp2Var.g0(objK7);
                    } else {
                        objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                        lp2Var.g0(objK7);
                    }
                    kx4VarT = mb6.T(kx4VarJ15, (gn2) objK7);
                }
                final kx4 kx4Var11119 = kx4VarT;
                lp2Var.p(false);
                long j111111111111 = ys0.y(lp2Var).c.a;
                long j111111111112 = ys0.y(lp2Var).c.a;
                long j111111111113 = ys0.y(lp2Var).c.c;
                long j111111111114 = ys0.y(lp2Var).c.e;
                long j111111111115 = dw0.f;
                long j111111111116 = ys0.y(lp2Var).k.a;
                long j111111111117 = ys0.y(lp2Var).k.c;
                long j2111111111111110 = ys0.y(lp2Var).c.a;
                long j2111111111111111 = ys0.y(lp2Var).c.a;
                long j2111111111111112 = ys0.y(lp2Var).c.c;
                long j2111111111111113 = ys0.y(lp2Var).c.e;
                long j2111111111111114 = ys0.y(lp2Var).c.a;
                long j2111111111111115 = ys0.y(lp2Var).c.a;
                long j2111111111111116 = ys0.y(lp2Var).c.c;
                long j2111111111111117 = ys0.y(lp2Var).c.e;
                long j2111111111111118 = ys0.y(lp2Var).c.c;
                long j2111111111111119 = ys0.y(lp2Var).c.c;
                long j31111111118 = ys0.y(lp2Var).c.c;
                long j31111111119 = ys0.y(lp2Var).k.c;
                long j311111111110 = ys0.y(lp2Var).c.b;
                long j311111111111 = ys0.y(lp2Var).c.b;
                long j311111111112 = ys0.y(lp2Var).c.c;
                long j311111111113 = ys0.y(lp2Var).c.e;
                long j311111111114 = dw0.g;
                iw0 iw0Var15 = (iw0) lp2Var.j(kw0.a);
                q06 q06Var15 = i88.a;
                i48VarA = lh4.O0(iw0Var15, (h88) lp2Var.j(q06Var15)).a(j111111111111, j111111111112, j111111111113, j111111111114, j111111111115, j111111111115, j111111111115, j111111111115, j111111111116, j111111111117, null, j9, j10, j11, j12, j2111111111111110, j2111111111111111, j2111111111111112, j2111111111111113, j2111111111111114, j2111111111111115, j2111111111111116, j2111111111111117, j311111111114, j311111111114, j311111111114, j311111111114, j2111111111111118, j2111111111111119, j31111111118, j31111111119, j311111111110, j311111111111, j311111111112, j311111111113, j311111111114, j311111111114, j311111111114, j311111111114, j311111111114, j311111111114, j311111111114, j311111111114);
                if (o88Var == null) {
                    lp2Var.W(204085828);
                    o88Var2 = (o88) lp2Var.j(u78.a);
                    lp2Var.p(false);
                } else {
                    lp2Var.W(204085084);
                    lp2Var.p(false);
                    o88Var2 = o88Var;
                }
                jB = o88Var2.b();
                if (jB == 16) {
                    if (!z5) {
                        jB = i48VarA.c;
                    } else if (z9) {
                        jB = i48VarA.d;
                    } else if (((Boolean) r137.getValue()).booleanValue()) {
                        jB = i48VarA.a;
                    } else {
                        jB = i48VarA.b;
                    }
                }
                final o88 o88VarD15 = o88Var2.d(new o88(jB, 0L, null, null, 0L, 0, 0, 0L, 16777214));
                t06 t06VarA15 = q06Var15.a(i48VarA.k);
                final wx3 wx3Var18 = wx3Var3;
                final q80 q80Var17 = q80Var2;
                final kx4 kx4Var111110 = kx4Var3;
                mb6.a(t06VarA15, jm4.U(1035408509, new rn2() { // from class: uy2
                    @Override // defpackage.rn2
                    public final Object K(Object obj2, Object obj3) {
                        wx3 wx3Var19;
                        lp2 lp2Var2 = (lp2) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        byte b2 = 0;
                        if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                            kx4 kx4VarY = hi5.P(kx4Var111110, q80Var17).y(kx4Var11119);
                            boolean z13 = z10;
                            wx3 wx3Var110 = wx3Var18;
                            if (z13) {
                                Boolean bool1111 = (Boolean) y05Var.getValue();
                                bool1111.getClass();
                                wx3Var19 = new wx3(wx3Var110.a, wx3Var110.b, wx3Var110.c, wx3Var110.d, bool1111, wx3Var110.f);
                            } else {
                                wx3Var19 = wx3Var110;
                            }
                            final boolean z14 = z9;
                            final i48 i48Var = i48VarA;
                            fe7 fe7Var = new fe7(z14 ? i48Var.j : i48Var.i);
                            zy0 zy0VarU = jm4.U(-1314685591, new wy2(b2, i6, str, kx4Var11118), lp2Var2);
                            final boolean z15 = z5;
                            final xz4 xz4Var16 = xz4Var15;
                            zy0 zy0VarU2 = jm4.U(306314943, new rn2() { // from class: xy2
                                @Override // defpackage.rn2
                                public final Object K(Object obj4, Object obj5) {
                                    lp2 lp2Var3 = (lp2) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (lp2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        lh4.H0.K0(z15, z14, xz4Var16, null, i48Var, null, 0.0f, 0.0f, lp2Var3, 100663680, 232);
                                    } else {
                                        lp2Var3.Q();
                                    }
                                    return dn8.a;
                                }
                            }, lp2Var2);
                            q58 q58Var = new q58();
                            y68 y68Var2 = y68Var;
                            w58 w58Var4 = w58Var3;
                            x30.b(y68Var2, kx4VarY, z15, de3Var3, o88VarD15, wx3Var19, w58Var4, xz4Var16, fe7Var, new z48(y68Var2, w58Var4, q58Var, zy0VarU, rn2Var7, rn2Var8, z15, z14, xz4Var16, gg5Var3, i48Var, zy0VarU2), ay6VarG, lp2Var2, 0, 6, 4744);
                        } else {
                            lp2Var2.Q();
                        }
                        return dn8.a;
                    }
                }, lp2Var), lp2Var, 56);
                z4 = z9;
                w58Var2 = w58Var3;
                rn2Var5 = rn2Var7;
                rn2Var6 = rn2Var8;
                gg5Var2 = gg5Var3;
                de3Var2 = de3Var3;
                ay6Var2 = ay6VarG;
                kx4Var5 = kx4Var11118;
                i36 = i6;
                j5 = j9;
                j6 = j10;
                j7 = j11;
                j8 = j12;
                wx3Var2 = wx3Var18;
            } else {
                lp2Var.Q();
                ay6Var2 = ay6Var;
                z4 = z;
                wx3Var2 = wx3Var;
                de3Var2 = de3Var;
                gg5Var2 = gg5Var;
                j5 = j;
                j6 = j2;
                j7 = j3;
                j8 = j4;
                kx4Var5 = kx4Var4;
                rn2Var5 = rn2Var3;
                i36 = i6;
                rn2Var6 = rn2Var4;
                z5 = z2;
                w58Var2 = w58Var;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: vy2
                    @Override // defpackage.rn2
                    public final Object K(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iP = w79.P(i2 | 1);
                        int iP2 = w79.P(i3);
                        z91.f(str, gn2Var, kx4Var, kx4Var5, i36, y68Var, ay6Var2, o88Var, rn2Var5, rn2Var6, z4, z5, wx3Var2, w58Var2, de3Var2, gg5Var2, j5, j6, j7, j8, (lp2) obj2, iP, iP2, i4);
                        return dn8.a;
                    }
                };
            }
        }
        i25 |= 12582912;
        i31 = i4 & 262144;
        if (i31 != 0) {
            i25 |= 100663296;
        } else if ((i3 & 100663296) == 0) {
            if (lp2Var.e(j2)) {
                i32 = 67108864;
            } else {
                i32 = 33554432;
            }
            i25 |= i32;
        }
        i33 = i4 & 524288;
        if (i33 != 0) {
            i25 |= 805306368;
        } else if ((i3 & 805306368) == 0) {
            i25 |= lp2Var.e(j3) ? 536870912 : 268435456;
        }
        i34 = i25;
        i35 = i4 & 1048576;
        if (i35 != 0) {
            c2 = 6;
        } else if (lp2Var.e(j4)) {
            c2 = 4;
        } else {
            c2 = 2;
        }
        if ((i7 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (lp2Var.N(i7 & 1, z3)) {
            lp2Var.S();
            i37 = i2 & 1;
            kx4VarT = hx4.X;
            if (i37 != 0) {
                if (i42 != 0) {
                    kx4Var4 = kx4VarT;
                }
                if ((i4 & 16) != 0) {
                    i7 &= -57345;
                    i6 = 5;
                }
                ay6VarG = dh3.G(lp2Var);
                int i411117 = i7 & (-3670017);
                if (i8 != 0) {
                    rn2Var3 = null;
                }
                if (i10 != 0) {
                    rn2Var4 = null;
                }
                if (i14 != 0) {
                    z6 = false;
                } else {
                    z6 = z;
                }
                if (i17 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i21 != 0) {
                    wx3Var3 = wx3.g;
                } else {
                    wx3Var3 = wx3Var;
                }
                if (i24 != 0) {
                    w58Var3 = qe4.x0;
                } else {
                    w58Var3 = w58Var;
                }
                if (i26 != 0) {
                    de3Var3 = null;
                } else {
                    de3Var3 = de3Var;
                }
                if (i28 != 0) {
                    ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    ig5Var = gg5Var;
                }
                if (i30 != 0) {
                    j9 = dw0.f;
                } else {
                    j9 = j;
                }
                if (i31 != 0) {
                    j10 = dw0.f;
                } else {
                    j10 = j2;
                }
                if (i33 != 0) {
                    j11 = dw0.f;
                } else {
                    j11 = j3;
                }
                if (i35 != 0) {
                    j12 = dw0.f;
                } else {
                    j12 = j4;
                }
                gg5Var3 = ig5Var;
                rn2Var7 = rn2Var3;
                i38 = i411117;
                rn2Var8 = rn2Var4;
            } else {
                if (i42 != 0) {
                    kx4Var4 = kx4VarT;
                }
                if ((i4 & 16) != 0) {
                    i7 &= -57345;
                    i6 = 5;
                }
                ay6VarG = dh3.G(lp2Var);
                int i411118 = i7 & (-3670017);
                if (i8 != 0) {
                    rn2Var3 = null;
                }
                if (i10 != 0) {
                    rn2Var4 = null;
                }
                if (i14 != 0) {
                    z6 = false;
                } else {
                    z6 = z;
                }
                if (i17 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i21 != 0) {
                    wx3Var3 = wx3.g;
                } else {
                    wx3Var3 = wx3Var;
                }
                if (i24 != 0) {
                    w58Var3 = qe4.x0;
                } else {
                    w58Var3 = w58Var;
                }
                if (i26 != 0) {
                    de3Var3 = null;
                } else {
                    de3Var3 = de3Var;
                }
                if (i28 != 0) {
                    ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    ig5Var = gg5Var;
                }
                if (i30 != 0) {
                    j9 = dw0.f;
                } else {
                    j9 = j;
                }
                if (i31 != 0) {
                    j10 = dw0.f;
                } else {
                    j10 = j2;
                }
                if (i33 != 0) {
                    j11 = dw0.f;
                } else {
                    j11 = j3;
                }
                if (i35 != 0) {
                    j12 = dw0.f;
                } else {
                    j12 = j4;
                }
                gg5Var3 = ig5Var;
                rn2Var7 = rn2Var3;
                i38 = i411118;
                rn2Var8 = rn2Var4;
            }
            lp2Var.q();
            int i411119 = i11;
            if (((458752 & i38) ^ 196608) <= i411119) {
            }
            if ((i38 & 112) == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = z7 | z12;
            objK = lp2Var.K();
            obj = zz0.a;
            if (z8) {
                objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                lp2Var.g0(objK);
            } else {
                objK = new kx2(gn2Var, y68Var, null, (byte) 1);
                lp2Var.g0(objK);
            }
            u70.h((rn2) objK, lp2Var, y68Var);
            objK2 = lp2Var.K();
            if (objK2 == obj) {
                objK2 = new xz4();
                lp2Var.g0(objK2);
            }
            final xz4 xz4Var16 = (xz4) objK2;
            y05VarS = km4.s(xz4Var16, lp2Var, 6);
            zT = oc.t(lp2Var);
            objK3 = lp2Var.K();
            if (objK3 == obj) {
                objK3 = z51.H(Boolean.FALSE);
                lp2Var.g0(objK3);
            }
            y05Var = (y05) objK3;
            objK4 = lp2Var.K();
            if (objK4 == obj) {
                objK4 = new q80();
                lp2Var.g0(objK4);
            }
            q80Var = (q80) objK4;
            WeakHashMap weakHashMap16 = c29.w;
            Boolean bool1111 = (Boolean) hw7.b(lp2Var).c.d.getValue();
            zBooleanValue = bool1111.booleanValue();
            final kx4 kx4Var111111 = kx4Var4;
            Boolean boolValueOf16 = Boolean.valueOf(zT);
            z9 = z6;
            Boolean bool1112 = (Boolean) y05VarS.getValue();
            bool1112.getClass();
            zG = lp2Var.g(zT) | lp2Var.f(y05VarS) | lp2Var.g(zBooleanValue) | lp2Var.h(q80Var);
            objK5 = lp2Var.K();
            if (zG) {
                objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                z10 = zT;
                q80Var2 = q80Var;
                lp2Var.g0(objK5);
            } else {
                objK5 = new y81(zT, zBooleanValue, q80Var, y05VarS, (q51) null);
                z10 = zT;
                q80Var2 = q80Var;
                lp2Var.g0(objK5);
            }
            u70.i(boolValueOf16, bool1112, bool1111, (rn2) objK5, lp2Var);
            be7Var = (be7) lp2Var.j(y01.q);
            lp2Var.W(204007653);
            if (z10) {
                objK6 = lp2Var.K();
                if (objK6 == obj) {
                    objK6 = new gh(y05Var, (byte) 6);
                    lp2Var.g0(objK6);
                }
                kx4 kx4VarJ16 = z51.J(kx4VarT, (gn2) objK6);
                if ((i34 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zF = z11 | lp2Var.f(r137) | lp2Var.f(be7Var);
                objK7 = lp2Var.K();
                if (zF) {
                    objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                    lp2Var.g0(objK7);
                } else {
                    objK7 = new yy2(z5, be7Var, y05VarS, y05Var);
                    lp2Var.g0(objK7);
                }
                kx4VarT = mb6.T(kx4VarJ16, (gn2) objK7);
            }
            final kx4 kx4Var111112 = kx4VarT;
            lp2Var.p(false);
            long j111111111118 = ys0.y(lp2Var).c.a;
            long j111111111119 = ys0.y(lp2Var).c.a;
            long j1111111111110 = ys0.y(lp2Var).c.c;
            long j1111111111111 = ys0.y(lp2Var).c.e;
            long j1111111111112 = dw0.f;
            long j1111111111113 = ys0.y(lp2Var).k.a;
            long j1111111111114 = ys0.y(lp2Var).k.c;
            long j21111111111111110 = ys0.y(lp2Var).c.a;
            long j21111111111111111 = ys0.y(lp2Var).c.a;
            long j21111111111111112 = ys0.y(lp2Var).c.c;
            long j21111111111111113 = ys0.y(lp2Var).c.e;
            long j21111111111111114 = ys0.y(lp2Var).c.a;
            long j21111111111111115 = ys0.y(lp2Var).c.a;
            long j21111111111111116 = ys0.y(lp2Var).c.c;
            long j21111111111111117 = ys0.y(lp2Var).c.e;
            long j21111111111111118 = ys0.y(lp2Var).c.c;
            long j21111111111111119 = ys0.y(lp2Var).c.c;
            long j311111111115 = ys0.y(lp2Var).c.c;
            long j311111111116 = ys0.y(lp2Var).k.c;
            long j311111111117 = ys0.y(lp2Var).c.b;
            long j311111111118 = ys0.y(lp2Var).c.b;
            long j311111111119 = ys0.y(lp2Var).c.c;
            long j3111111111110 = ys0.y(lp2Var).c.e;
            long j3111111111111 = dw0.g;
            iw0 iw0Var16 = (iw0) lp2Var.j(kw0.a);
            q06 q06Var16 = i88.a;
            i48VarA = lh4.O0(iw0Var16, (h88) lp2Var.j(q06Var16)).a(j111111111118, j111111111119, j1111111111110, j1111111111111, j1111111111112, j1111111111112, j1111111111112, j1111111111112, j1111111111113, j1111111111114, null, j9, j10, j11, j12, j21111111111111110, j21111111111111111, j21111111111111112, j21111111111111113, j21111111111111114, j21111111111111115, j21111111111111116, j21111111111111117, j3111111111111, j3111111111111, j3111111111111, j3111111111111, j21111111111111118, j21111111111111119, j311111111115, j311111111116, j311111111117, j311111111118, j311111111119, j3111111111110, j3111111111111, j3111111111111, j3111111111111, j3111111111111, j3111111111111, j3111111111111, j3111111111111, j3111111111111);
            if (o88Var == null) {
                lp2Var.W(204085828);
                o88Var2 = (o88) lp2Var.j(u78.a);
                lp2Var.p(false);
            } else {
                lp2Var.W(204085084);
                lp2Var.p(false);
                o88Var2 = o88Var;
            }
            jB = o88Var2.b();
            if (jB == 16) {
                if (!z5) {
                    jB = i48VarA.c;
                } else if (z9) {
                    jB = i48VarA.d;
                } else if (((Boolean) r137.getValue()).booleanValue()) {
                    jB = i48VarA.a;
                } else {
                    jB = i48VarA.b;
                }
            }
            final o88 o88VarD16 = o88Var2.d(new o88(jB, 0L, null, null, 0L, 0, 0, 0L, 16777214));
            t06 t06VarA16 = q06Var16.a(i48VarA.k);
            final wx3 wx3Var19 = wx3Var3;
            final q80 q80Var18 = q80Var2;
            final kx4 kx4Var111113 = kx4Var3;
            mb6.a(t06VarA16, jm4.U(1035408509, new rn2() { // from class: uy2
                @Override // defpackage.rn2
                public final Object K(Object obj2, Object obj3) {
                    wx3 wx3Var110;
                    lp2 lp2Var2 = (lp2) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    byte b2 = 0;
                    if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        kx4 kx4VarY = hi5.P(kx4Var111113, q80Var18).y(kx4Var111112);
                        boolean z13 = z10;
                        wx3 wx3Var111 = wx3Var19;
                        if (z13) {
                            Boolean bool1113 = (Boolean) y05Var.getValue();
                            bool1113.getClass();
                            wx3Var110 = new wx3(wx3Var111.a, wx3Var111.b, wx3Var111.c, wx3Var111.d, bool1113, wx3Var111.f);
                        } else {
                            wx3Var110 = wx3Var111;
                        }
                        final boolean z14 = z9;
                        final i48 i48Var = i48VarA;
                        fe7 fe7Var = new fe7(z14 ? i48Var.j : i48Var.i);
                        zy0 zy0VarU = jm4.U(-1314685591, new wy2(b2, i6, str, kx4Var111111), lp2Var2);
                        final boolean z15 = z5;
                        final xz4 xz4Var17 = xz4Var16;
                        zy0 zy0VarU2 = jm4.U(306314943, new rn2() { // from class: xy2
                            @Override // defpackage.rn2
                            public final Object K(Object obj4, Object obj5) {
                                lp2 lp2Var3 = (lp2) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (lp2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    lh4.H0.K0(z15, z14, xz4Var17, null, i48Var, null, 0.0f, 0.0f, lp2Var3, 100663680, 232);
                                } else {
                                    lp2Var3.Q();
                                }
                                return dn8.a;
                            }
                        }, lp2Var2);
                        q58 q58Var = new q58();
                        y68 y68Var2 = y68Var;
                        w58 w58Var4 = w58Var3;
                        x30.b(y68Var2, kx4VarY, z15, de3Var3, o88VarD16, wx3Var110, w58Var4, xz4Var17, fe7Var, new z48(y68Var2, w58Var4, q58Var, zy0VarU, rn2Var7, rn2Var8, z15, z14, xz4Var17, gg5Var3, i48Var, zy0VarU2), ay6VarG, lp2Var2, 0, 6, 4744);
                    } else {
                        lp2Var2.Q();
                    }
                    return dn8.a;
                }
            }, lp2Var), lp2Var, 56);
            z4 = z9;
            w58Var2 = w58Var3;
            rn2Var5 = rn2Var7;
            rn2Var6 = rn2Var8;
            gg5Var2 = gg5Var3;
            de3Var2 = de3Var3;
            ay6Var2 = ay6VarG;
            kx4Var5 = kx4Var111111;
            i36 = i6;
            j5 = j9;
            j6 = j10;
            j7 = j11;
            j8 = j12;
            wx3Var2 = wx3Var19;
        } else {
            lp2Var.Q();
            ay6Var2 = ay6Var;
            z4 = z;
            wx3Var2 = wx3Var;
            de3Var2 = de3Var;
            gg5Var2 = gg5Var;
            j5 = j;
            j6 = j2;
            j7 = j3;
            j8 = j4;
            kx4Var5 = kx4Var4;
            rn2Var5 = rn2Var3;
            i36 = i6;
            rn2Var6 = rn2Var4;
            z5 = z2;
            w58Var2 = w58Var;
        }
        j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: vy2
                @Override // defpackage.rn2
                public final Object K(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = w79.P(i2 | 1);
                    int iP2 = w79.P(i3);
                    z91.f(str, gn2Var, kx4Var, kx4Var5, i36, y68Var, ay6Var2, o88Var, rn2Var5, rn2Var6, z4, z5, wx3Var2, w58Var2, de3Var2, gg5Var2, j5, j6, j7, j8, (lp2) obj2, iP, iP2, i4);
                    return dn8.a;
                }
            };
        }
    }

    public static final void g(kx4 kx4Var, zy0 zy0Var, lp2 lp2Var, int i) {
        int i2;
        kx4 kx4Var2;
        zy0 zy0Var2;
        lp2Var.X(790527681);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(kx4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.h(zy0Var) ? 32 : 16;
        }
        if (lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = lp2Var.K();
            be beVar = zz0.a;
            if (objK == beVar) {
                rh5 rh5Var = new rh5(null, lh4.i0);
                lp2Var.g0(rh5Var);
                objK = rh5Var;
            }
            y05 y05Var = (y05) objK;
            Object objK2 = lp2Var.K();
            if (objK2 == beVar) {
                objK2 = new eh(y05Var, (byte) 7);
                lp2Var.g0(objK2);
            }
            dn2 dn2Var = (dn2) objK2;
            or5 or5Var = ng1.a;
            i30 i30VarF = x97.f(w39.Y, lp2Var, 6);
            kx4Var2 = kx4Var;
            zy0Var2 = zy0Var;
            mb6.b(new t06[]{r38.b.a(jb5.I(dn2Var, lp2Var, 2)), r38.a.a(i30VarF)}, jm4.U(1070596993, new no5(kx4Var2, y05Var, zy0Var2, i30VarF, dn2Var), lp2Var), lp2Var, 56);
        } else {
            kx4Var2 = kx4Var;
            zy0Var2 = zy0Var;
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new dh(kx4Var2, zy0Var2, i, b2);
        }
    }

    public static final void h(kx4 kx4Var, zy0 zy0Var, lp2 lp2Var, int i) {
        int i2;
        lp2Var.X(155925518);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(kx4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.h(zy0Var) ? 32 : 16;
        }
        byte b2 = 3;
        if (lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            boolean z = lp2Var.j(r38.a) != null;
            boolean z2 = lp2Var.j(r38.b) != null;
            if (z && z2) {
                lp2Var.W(-1977187922);
                xr4 xr4VarC = g80.c(pz2.Z, true);
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
                pn7.m(pz2.B0, lp2Var, xr4VarC);
                pn7.m(pz2.A0, lp2Var, kl5VarL);
                pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
                pn7.l(lp2Var);
                pn7.m(pz2.z0, lp2Var, kx4VarQ);
                zy0Var.K(lp2Var, Integer.valueOf((i2 >> 3) & 14));
                lp2Var.p(true);
                lp2Var.p(false);
            } else if (z) {
                lp2Var.W(-1976997706);
                jb5.d(kx4Var, zy0Var, lp2Var, i2 & WebSocketProtocol.PAYLOAD_SHORT);
                lp2Var.p(false);
            } else if (z2) {
                lp2Var.W(-1976846922);
                ng1.d(kx4Var, zy0Var, lp2Var, i2 & WebSocketProtocol.PAYLOAD_SHORT);
                lp2Var.p(false);
            } else {
                lp2Var.W(-1976716505);
                g(kx4Var, zy0Var, lp2Var, i2 & WebSocketProtocol.PAYLOAD_SHORT);
                lp2Var.p(false);
            }
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new dh(kx4Var, zy0Var, i, b2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(cm5 cm5Var, String str, String str2, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        int i2;
        kx4 kx4Var2;
        gn2Var.getClass();
        lp2Var.X(-2071167686);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(cm5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.f(str != null ? new RouteProfileId(str) : null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.f(str2 != null ? new RouteProfileId(str2) : null) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= lp2Var.h(gn2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            kx4Var2 = kx4Var;
            i2 |= lp2Var.f(kx4Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            kx4Var2 = kx4Var;
        }
        if (lp2Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = (i2 & 14) == 4;
            Object objK = lp2Var.K();
            Object obj = zz0.a;
            if (z || objK == obj) {
                objK = mb6.f0(((b2) cm5Var).a());
                lp2Var.g0(objK);
            }
            j2 j2Var = (j2) objK;
            ((gr) lp2Var.j(hr.a)).getClass();
            ig5 ig5VarE = os4.e(7, 48.0f);
            kx4 kx4VarE = g33.e(g33.s(kx4Var2));
            boolean zH = lp2Var.h(j2Var) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objK2 = lp2Var.K();
            if (zH || objK2 == obj) {
                objK2 = new ii(j2Var, str, str2, gn2Var);
                lp2Var.g0(objK2);
            }
            jb5.a(kx4VarE, null, 0.0f, ig5VarE, null, null, null, false, null, false, (gn2) objK2, lp2Var, 0, 2038);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new kr4(cm5Var, str, str2, gn2Var, kx4Var, i, (byte) 1);
        }
    }

    public static void k(String str) {
        if (str.length() <= 10000) {
            return;
        }
        bt.j("Number string too large: ", str.substring(0, 30), "...");
    }

    public static float l(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public static int m(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static final Object n(xe2 xe2Var, rn2 rn2Var, q51 q51Var) {
        int i = eg2.a;
        Object objA = zc1.o(new rp0(new dg2(rn2Var, null, (byte) 0), xe2Var, b02.X, -2, l90.X), 0).a(a65.X, q51Var);
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        if (objA != c71Var) {
            objA = dn8Var;
        }
        return objA == c71Var ? objA : dn8Var;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00ed  */
    public static qb6 o(Class cls) throws InvocationTargetException {
        b04 b04Var;
        i04 lr5Var;
        a04 a04Var;
        x66 x66Var = new x66();
        x66Var.X = null;
        x66Var.Y = null;
        boolean z = false;
        x66Var.Z = 0;
        x66Var.f0 = null;
        x66Var.g0 = null;
        x66Var.h0 = null;
        x66Var.i0 = null;
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        declaredAnnotations.getClass();
        for (Annotation annotation : declaredAnnotations) {
            annotation.getClass();
            Class clsM = zc1.M(zc1.K(annotation));
            qs0 qs0VarA = ia6.a(clsM);
            if (qs0VarA.a().equals(ks3.a)) {
                lr5Var = new y45(x66Var);
            } else if (x66.j0 || x66Var.i0 != null || (a04Var = (a04) x66.k0.get(qs0VarA)) == null) {
                lr5Var = null;
            } else {
                x66Var.i0 = a04Var;
                lr5Var = new lr5((Object) x66Var, (byte) 4);
            }
            if (lr5Var != null) {
                yn0.V(lr5Var, annotation, clsM);
            }
        }
        hv4 hv4Var = hv4.g;
        if (x66Var.i0 == null || x66Var.X == null) {
            b04Var = null;
        } else {
            hv4 hv4Var2 = new hv4((x66Var.Z & 8) != 0, x66Var.X);
            hv4Var.getClass();
            hv4 hv4Var3 = hv4Var2.f ? hv4Var : hv4.h;
            int i = hv4Var3.b;
            int i2 = hv4Var.b;
            if (i > i2 || (i >= i2 && hv4Var3.c > hv4Var.c)) {
                hv4Var = hv4Var3;
            }
            int i3 = hv4Var2.c;
            int i4 = hv4Var2.b;
            if ((i4 != 1 || i3 != 0) && i4 != 0) {
                int i5 = hv4Var.b;
                if (i4 > i5 || (i4 >= i5 && i3 > hv4Var.c)) {
                    z = true;
                }
                z = !z;
            }
            if (z) {
                a04 a04Var2 = x66Var.i0;
                if ((a04Var2 == a04.CLASS || a04Var2 == a04.FILE_FACADE || a04Var2 == a04.MULTIFILE_CLASS_PART) && x66Var.f0 == null) {
                    b04Var = null;
                }
            } else {
                x66Var.h0 = x66Var.f0;
                x66Var.f0 = null;
            }
            b04Var = new b04(x66Var.i0, hv4Var2, x66Var.f0, x66Var.h0, x66Var.g0, x66Var.Y, x66Var.Z);
        }
        if (b04Var == null) {
            return null;
        }
        return new qb6(cls, b04Var);
    }

    public static Handler p(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return en.f(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            u52.q(cause);
            return null;
        }
    }

    public static final ni8 q(ni8 ni8Var, hi8 hi8Var) {
        if (hi8Var == null || ni8Var.a() == rt8.INVARIANT) {
            return ni8Var;
        }
        if (hi8Var.D() != ni8Var.a()) {
            co0 co0Var = new co0(ni8Var);
            ch8.Y.getClass();
            return new wg7(new zn0(ni8Var, co0Var, false, ch8.Z));
        }
        if (!ni8Var.c()) {
            return new wg7(ni8Var.b());
        }
        me4 me4Var = ve4.e;
        me4Var.getClass();
        return new wg7(new z74(me4Var, new f3(ni8Var, (byte) 5)));
    }

    public static i44 r(jd0 jd0Var, t14 t14Var, v15 v15Var, sm smVar, int i) {
        if (jd0Var == null) {
            a(32);
            throw null;
        }
        if (smVar == null) {
            a(33);
            throw null;
        }
        if (t14Var == null) {
            return null;
        }
        g51 g51Var = new g51(jd0Var, t14Var, v15Var);
        kc6 kc6Var = d25.a;
        return new i44(jd0Var, g51Var, smVar, v15.e(d25.b + '_' + i));
    }

    public static hx5 s(fx5 fx5Var, sm smVar) {
        return y(fx5Var, smVar, true, fx5Var.getSource());
    }

    public static tx5 t(fx5 fx5Var, sm smVar) {
        rm rmVar = oy1.f0;
        ke7 source = fx5Var.getSource();
        if (source != null) {
            return A(fx5Var, smVar, rmVar, true, fx5Var.e(), source);
        }
        a(6);
        throw null;
    }

    public static gx5 u(sx4 sx4Var) {
        if (sx4Var == null) {
            a(26);
            throw null;
        }
        vx4 vx4VarC = bl1.c(sx4Var);
        vx4VarC.getClass();
        sx4 sx4VarM = oc.m(vx4VarC, qg7.B);
        if (sx4VarM == null) {
            return null;
        }
        rm rmVar = oy1.f0;
        fl1 fl1Var = gl1.e;
        v15 v15Var = ug7.b;
        ke7 source = sx4Var.getSource();
        fx4 fx4Var = fx4.Y;
        gx5 gx5VarI0 = gx5.I0(sx4Var, fx4Var, fl1Var, false, v15Var, 4, source);
        hx5 hx5Var = new hx5(gx5VarI0, rmVar, fx4Var, fl1Var, false, false, false, 4, null, sx4Var.getSource());
        gx5VarI0.L0(hx5Var, null, null, null);
        ch8.Y.getClass();
        ch8 ch8Var = ch8.Z;
        lh8 lh8VarL = sx4VarM.l();
        List listSingletonList = Collections.singletonList(new wg7(sx4Var.X()));
        ch8Var.getClass();
        lh8VarL.getClass();
        listSingletonList.getClass();
        aa7 aa7VarN = dh3.N(ch8Var, lh8VarL, listSingletonList, false);
        List list = Collections.EMPTY_LIST;
        gx5VarI0.O0(aa7VarN, list, null, null, list);
        hx5Var.J0(gx5VarI0.j());
        return gx5VarI0;
    }

    public static q97 v(sx4 sx4Var) {
        if (sx4Var == null) {
            a(24);
            throw null;
        }
        rm rmVar = oy1.f0;
        q97 q97VarR0 = q97.R0(sx4Var, ug7.c, 4, sx4Var.getSource());
        ot8 ot8Var = new ot8(q97VarR0, null, 0, rmVar, v15.e("value"), el1.e(sx4Var).v(), false, false, false, null, sx4Var.getSource());
        List list = Collections.EMPTY_LIST;
        return q97VarR0.L0(null, null, list, list, Collections.singletonList(ot8Var), sx4Var.X(), fx4.Y, gl1.e);
    }

    public static q97 w(sx4 sx4Var) {
        if (sx4Var == null) {
            a(22);
            throw null;
        }
        q97 q97VarR0 = q97.R0(sx4Var, ug7.a, 4, sx4Var.getSource());
        List list = Collections.EMPTY_LIST;
        return q97VarR0.L0(null, null, list, list, list, el1.e(sx4Var).h(sx4Var.X()), fx4.Y, gl1.e);
    }

    public static i44 x(jd0 jd0Var, t14 t14Var, sm smVar) {
        if (t14Var == null) {
            return null;
        }
        return new i44(jd0Var, new o62(jd0Var, t14Var), smVar);
    }

    public static hx5 y(fx5 fx5Var, sm smVar, boolean z, ke7 ke7Var) {
        if (smVar == null) {
            a(18);
            throw null;
        }
        if (ke7Var != null) {
            return new hx5(fx5Var, smVar, fx5Var.m(), fx5Var.e(), z, false, false, 1, null, ke7Var);
        }
        a(19);
        throw null;
    }

    public void D(l77 l77Var, float f, float f2) {
        float f3 = f2 * f;
        l77Var.d(0.0f, f3, 180.0f, 90.0f);
        double d2 = f3;
        l77Var.c((float) (Math.sin(Math.toRadians(90.0d)) * d2), (float) (Math.sin(Math.toRadians(0.0d)) * d2));
    }

    public void H(qr6 qr6Var, Object obj) {
        qr6Var.getClass();
        if (obj == null) {
            return;
        }
        xr6 xr6VarX0 = qr6Var.X0(z());
        try {
            j(xr6VarX0, obj);
            xr6VarX0.S0();
            u15.h(xr6VarX0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u15.h(xr6VarX0, th);
                throw th2;
            }
        }
    }

    public abstract void j(xr6 xr6Var, Object obj);

    public abstract String z();
}

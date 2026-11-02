package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import androidx.leanback.transition.FadeAndShortSlide;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.FileClientSessionCache;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ci8 {
    public static final zy0 a = new zy0(-1131826196, false, new dx0(3));
    public static final l71 b = new l71(16);
    public static final sf c = new sf(XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax);
    public static final sf d;
    public static final sf e;
    public static final StackTraceElement[] f;
    public static g73 g;

    static {
        new sf(1007);
        d = new sf(1008);
        e = new sf(1002);
        f = new StackTraceElement[0];
    }

    public static void A(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static boolean B(int i, Object obj) {
        int iT;
        if (obj instanceof on2) {
            if (obj instanceof bo2) {
                iT = ((bo2) obj).t();
            } else if (obj instanceof dn2) {
                iT = 0;
            } else if (obj instanceof gn2) {
                iT = 1;
            } else if (obj instanceof rn2) {
                iT = 2;
            } else if (obj instanceof sn2) {
                iT = 3;
            } else if (obj instanceof tn2) {
                iT = 4;
            } else if (obj instanceof un2) {
                iT = 5;
            } else if (obj instanceof vn2) {
                iT = 6;
            } else if (obj instanceof wn2) {
                iT = 7;
            } else if (obj instanceof xn2) {
                iT = 8;
            } else if (obj instanceof yn2) {
                iT = 9;
            } else if (obj instanceof en2) {
                iT = 10;
            } else if (obj instanceof fn2) {
                iT = 11;
            } else {
                boolean z = obj instanceof vo2;
                if (z) {
                    iT = 12;
                } else if (obj instanceof hn2) {
                    iT = 13;
                } else if (obj instanceof in2) {
                    iT = 14;
                } else if (obj instanceof jn2) {
                    iT = 15;
                } else if (obj instanceof kn2) {
                    iT = 16;
                } else if (obj instanceof ln2) {
                    iT = 17;
                } else if (obj instanceof mn2) {
                    iT = 18;
                } else if (obj instanceof nn2) {
                    iT = 19;
                } else if (obj instanceof pn2) {
                    iT = 20;
                } else if (obj instanceof qn2) {
                    iT = 21;
                } else {
                    iT = z ? 22 : -1;
                }
            }
            if (iT == i) {
                return true;
            }
        }
        return false;
    }

    public static final kx4 C(x64 x64Var, vk1 vk1Var, sd5 sd5Var) {
        return new s54(x64Var, vk1Var, sd5Var);
    }

    public static int D(int i, byte[] bArr) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static void E(int i, int i2, byte[] bArr, int[] iArr) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i + i4] = D(i3, bArr);
            i3 += 4;
        }
    }

    public static void F(long j, byte[] bArr, int i) {
        A((int) (4294967295L & j), i, bArr);
        A((int) (j >>> 32), i + 4, bArr);
    }

    public static String G(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            bt.q("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static final byte[] H(long j) {
        byte[] bArr = new byte[12];
        for (int i = 0; i < 8; i++) {
            bArr[i + 4] = (byte) (255 & j);
            j >>>= 8;
        }
        return bArr;
    }

    public static final List I(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        byte[] bArrZ = z(bArr, bArr2);
        byte[] bArrZ2 = z(bArrZ, new byte[]{1});
        byte[] bArrCopyOf = Arrays.copyOf(bArrZ2, 33);
        bArrCopyOf[32] = 2;
        return i21.L(bArrZ2, z(bArrZ, bArrCopyOf));
    }

    public static final dy3 J(cy5 cy5Var, w15 w15Var) {
        cy5Var.getClass();
        w15Var.getClass();
        String strQ = q(w15Var, cy5Var.Z);
        List<ay5> list = cy5Var.f0;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (ay5 ay5Var : list) {
            zx5 zx5Var = ay5Var.f0;
            zx5Var.getClass();
            xy3 xy3VarK = K(zx5Var, w15Var);
            qg5 qg5Var = xy3VarK != null ? new qg5(w15Var.getString(ay5Var.Z), xy3VarK) : null;
            if (qg5Var != null) {
                arrayList.add(qg5Var);
            }
        }
        return new dy3(strQ, zp4.P(arrayList));
    }

    public static final xy3 K(zx5 zx5Var, w15 w15Var) {
        zx5Var.getClass();
        w15Var.getClass();
        boolean zBooleanValue = md2.U.e(zx5Var.o0).booleanValue();
        yx5 yx5Var = zx5Var.Z;
        if (zBooleanValue) {
            int i = yx5Var != null ? a76.a[yx5Var.ordinal()] : -1;
            if (i == 1) {
                return new ty3((byte) zx5Var.f0);
            }
            if (i == 2) {
                return new wy3((short) zx5Var.f0);
            }
            if (i == 3) {
                return new uy3((int) zx5Var.f0);
            }
            if (i == 4) {
                return new vy3(zx5Var.f0);
            }
            kp5.q(zx5Var.Z, "Cannot read value of unsigned type: ");
            return null;
        }
        switch (yx5Var != null ? a76.a[yx5Var.ordinal()] : -1) {
            case -1:
                return null;
            case 0:
            default:
                b61.c();
                return null;
            case 1:
                return new iy3((byte) zx5Var.f0);
            case 2:
                return new ry3((short) zx5Var.f0);
            case 3:
                return new ny3((int) zx5Var.f0);
            case 4:
                return new qy3(zx5Var.f0);
            case 5:
                return new jy3((char) zx5Var.f0);
            case 6:
                return new my3(zx5Var.g0);
            case 7:
                return new ky3(zx5Var.h0);
            case 8:
                return new hy3(zx5Var.f0 != 0);
            case 9:
                return new sy3(w15Var.getString(zx5Var.i0));
            case 10:
                String strQ = q(w15Var, zx5Var.j0);
                int i2 = zx5Var.n0;
                return i2 == 0 ? new oy3(strQ) : new fy3(strQ, i2);
            case 11:
                return new ly3(q(w15Var, zx5Var.j0), w15Var.getString(zx5Var.k0));
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                cy5 cy5Var = zx5Var.l0;
                cy5Var.getClass();
                return new ey3(J(cy5Var, w15Var));
            case 13:
                List<zx5> list = zx5Var.m0;
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (zx5 zx5Var2 : list) {
                    zx5Var2.getClass();
                    xy3 xy3VarK = K(zx5Var2, w15Var);
                    if (xy3VarK != null) {
                        arrayList.add(xy3VarK);
                    }
                }
                return new gy3(arrayList);
        }
    }

    public static final kx4 L(kx4 kx4Var, float f2, float f3) {
        return (f2 == 1.0f && f3 == 1.0f) ? kx4Var : jm4.J(kx4Var, f2, f3, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 1048572);
    }

    public static void M(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(pc6.p(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        dh3.I(classCastException, ci8.class.getName());
        throw classCastException;
    }

    public static final void N(zu3 zu3Var, String str) {
        String string;
        zu3Var.getClass();
        String str2 = "in the polymorphic scope of '" + zu3Var.E() + '\'';
        if (str == null) {
            string = p61.l('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbT = oi0.t("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            oi0.y(sbT, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbT.append(zu3Var.E());
            sbT.append("' has to be sealed and '@Serializable'.");
            string = sbT.toString();
        }
        throw new m37(string);
    }

    public static final void O(int i) {
        throw new m37(pc6.j(i, "An unknown field for index "));
    }

    public static int P(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Object Q(xi0 xi0Var, zu3 zu3Var) {
        zu3Var.getClass();
        if (xi0Var instanceof bo8) {
            return ((bo8) xi0Var).C0(zu3Var);
        }
        if (!(xi0Var instanceof aj0)) {
            return null;
        }
        aj0 aj0Var = (aj0) xi0Var;
        if (aj0Var.getImplementation() == xi0Var) {
            return null;
        }
        aj0 implementation = aj0Var.getImplementation();
        implementation.getClass();
        return Q(implementation, zu3Var);
    }

    public static final void a(kx4 kx4Var, String str, zy0 zy0Var, lp2 lp2Var, int i, int i2) {
        int i3;
        lp2Var.X(736727446);
        if ((i & 6) == 0) {
            i3 = (lp2Var.f(kx4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= lp2Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= lp2Var.h(zy0Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (lp2Var.N(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                str = null;
            }
            kx4 kx4VarF = u15.f(kx4Var, ((dp) lp2Var.j(ep.z)).b.b, u70.e);
            tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var, 0);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4VarF);
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
            if (str != null) {
                lp2Var.W(-1804487787);
                oc.b(str, os4.w(b.a, ((gr) lp2Var.j(hr.a)).a.a), lp2Var, (i3 >> 3) & 14);
                lp2Var.p(false);
            } else {
                lp2Var.W(-1804271562);
                lp2Var.p(false);
            }
            zy0Var.x(uw0.a, lp2Var, Integer.valueOf(((i3 >> 3) & 112) | 6));
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        String str2 = str;
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new tx2(kx4Var, str2, zy0Var, i, i2);
        }
    }

    public static final void b(dn2 dn2Var, kx4 kx4Var, p64 p64Var, d74 d74Var, lp2 lp2Var, int i) {
        d74 d74Var2;
        p64 p64Var2;
        kx4 kx4Var2;
        lp2Var.X(1055276397);
        int i2 = (lp2Var.h(dn2Var) ? 4 : 2) | i | (lp2Var.f(kx4Var) ? 32 : 16) | (lp2Var.f(p64Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (lp2Var.f(d74Var) ? 2048 : 1024);
        if (lp2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            d74Var2 = d74Var;
            h64 h64Var = new h64(p64Var, kx4Var, d74Var2, z51.P(dn2Var, lp2Var), (byte) 0);
            p64Var2 = p64Var;
            kx4Var2 = kx4Var;
            w79.b(jm4.U(-933153643, h64Var, lp2Var), lp2Var, 6);
        } else {
            d74Var2 = d74Var;
            p64Var2 = p64Var;
            kx4Var2 = kx4Var;
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new j30(dn2Var, kx4Var2, p64Var2, d74Var2, i);
        }
    }

    public static final void c(int i, final dn2 dn2Var, lp2 lp2Var, kx4 kx4Var, final boolean z) {
        kx4 kx4Var2;
        dn2Var.getClass();
        lp2Var.X(931925431);
        int i2 = (lp2Var.g(z) ? 4 : 2) | i | (lp2Var.h(dn2Var) ? 32 : 16) | 384;
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            final Context context = (Context) lp2Var.j(pc.b);
            boolean zF = lp2Var.f(context);
            Object objK = lp2Var.K();
            if (zF || objK == zz0.a) {
                objK = new Intent(Build.VERSION.SDK_INT >= 26 ? "android.settings.MANAGE_UNKNOWN_APP_SOURCES" : "android.settings.SECURITY_SETTINGS").setData(Uri.parse(String.format("package:%s", Arrays.copyOf(new Object[]{context.getPackageName()}, 1)))).addFlags(268435456);
                lp2Var.g0(objK);
            }
            final Intent intent = (Intent) objK;
            intent.getClass();
            ch3.c(dn2Var, vj8.j0(y46.update_settings_install_settings, lp2Var), !z, null, jm4.U(661469170, new rn2() { // from class: oj6
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    lp2 lp2Var2 = (lp2) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        wq6 wq6VarA = vq6.a(new ft(8.0f, new bt()), pz2.o0, lp2Var2, 54);
                        int iHashCode = Long.hashCode(lp2Var2.T);
                        kl5 kl5VarL = lp2Var2.l();
                        kx4 kx4VarQ = w45.Q(lp2Var2, hx4.X);
                        uz0.j.getClass();
                        lp2Var2.Z();
                        if (lp2Var2.S) {
                            lp2Var2.k();
                        } else {
                            lp2Var2.j0();
                        }
                        pn7.m(pz2.B0, lp2Var2, wq6VarA);
                        pn7.m(pz2.A0, lp2Var2, kl5VarL);
                        pn7.m(pz2.C0, lp2Var2, Integer.valueOf(iHashCode));
                        pn7.l(lp2Var2);
                        pn7.m(pz2.z0, lp2Var2, kx4VarQ);
                        boolean z2 = z;
                        dn2 dn2Var2 = dn2Var;
                        if (z2) {
                            lp2Var2.W(1245645236);
                            lp2Var2.p(false);
                        } else {
                            lp2Var2.W(1245190683);
                            z51.g(vj8.j0(y46.dialog_input_in_center_button_negative, lp2Var2), null, false, o88.a(((ds) lp2Var2.j(es.a)).c, ((dp) lp2Var2.j(ep.z)).c.a, 0L, dj2.f0, null, 0L, 0L, null, 16777210), 0, 0, 1, 0, false, null, null, dn2Var2, lp2Var2, 1572864, 4022);
                            lp2Var2.p(false);
                        }
                        String strJ0 = vj8.j0(y46.title_settings, lp2Var2);
                        o88 o88VarA = o88.a(((ds) lp2Var2.j(es.a)).c, ((dp) lp2Var2.j(ep.z)).a, 0L, dj2.f0, null, 0L, 0L, null, 16777210);
                        Context context2 = context;
                        boolean zH = lp2Var2.h(context2);
                        Intent intent2 = intent;
                        boolean zH2 = zH | lp2Var2.h(intent2) | lp2Var2.f(dn2Var2);
                        Object objK2 = lp2Var2.K();
                        if (zH2 || objK2 == zz0.a) {
                            objK2 = new g00((Object) context2, (Object) intent2, (Object) dn2Var2, (byte) 18);
                            lp2Var2.g0(objK2);
                        }
                        z51.g(strJ0, null, false, o88VarA, 0, 0, 1, 0, false, null, null, (dn2) objK2, lp2Var2, 1572864, 4022);
                        lp2Var2.p(true);
                    } else {
                        lp2Var2.Q();
                    }
                    return dn8.a;
                }
            }, lp2Var), zc1.a, lp2Var, 1769856 | ((i2 >> 3) & 14), 16);
            kx4Var2 = hx4.X;
        } else {
            lp2Var.Q();
            kx4Var2 = kx4Var;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new wx2(i, dn2Var, kx4Var2, z);
        }
    }

    public static Collection d(Object obj) {
        if ((obj instanceof qv3) && !(obj instanceof rv3)) {
            M(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e2) {
            dh3.I(e2, ci8.class.getName());
            throw e2;
        }
    }

    public static List e(Object obj) {
        if ((obj instanceof qv3) && !(obj instanceof sv3)) {
            M(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e2) {
            dh3.I(e2, ci8.class.getName());
            throw e2;
        }
    }

    public static Map f(Object obj) {
        if ((obj instanceof qv3) && !(obj instanceof tv3)) {
            M(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            dh3.I(e2, ci8.class.getName());
            throw e2;
        }
    }

    public static Set g(Object obj) {
        if ((obj instanceof qv3) && !(obj instanceof aw3)) {
            M(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e2) {
            dh3.I(e2, ci8.class.getName());
            throw e2;
        }
    }

    public static final byte[] h(byte[] bArr) {
        int[] iArr;
        int i;
        bArr.getClass();
        f60 f60Var = new f60();
        int length = bArr.length;
        byte[] bArr2 = f60Var.f;
        if (length != 0) {
            int length2 = bArr.length;
            if (bArr != null && length2 != 0) {
                int i2 = f60Var.g;
                if (i2 != 0) {
                    i = 64 - i2;
                    if (i >= length2) {
                        System.arraycopy(bArr, 0, bArr2, i2, length2);
                        f60Var.g += length2;
                    } else {
                        System.arraycopy(bArr, 0, bArr2, i2, i);
                        f60Var.d(64);
                        f60Var.b(0, bArr2);
                        f60Var.g = 0;
                        Arrays.fill(bArr2, (byte) 0);
                    }
                } else {
                    i = 0;
                }
                int i3 = length2 + 0;
                int i4 = i3 - 64;
                int i5 = i + 0;
                while (i5 < i4) {
                    f60Var.d(64);
                    f60Var.b(i5, bArr);
                    i5 += 64;
                }
                int i6 = i3 - i5;
                System.arraycopy(bArr, i5, bArr2, 0, i6);
                f60Var.g += i6;
            }
        }
        byte[] bArr3 = new byte[32];
        int length3 = bArr3.length;
        int i7 = f60Var.a;
        if (length3 - i7 < 0) {
            throw new re5("output buffer too short");
        }
        f60Var.l = -1;
        int i8 = f60Var.g;
        if (i8 > 0) {
            f60Var.d(i8);
        }
        f60Var.b(0, bArr2);
        int i9 = i7 >>> 2;
        int i10 = i7 & 3;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            iArr = f60Var.i;
            if (i11 >= i9) {
                break;
            }
            A(iArr[i11], i12, bArr3);
            i12 += 4;
            i11++;
        }
        if (i10 > 0) {
            int i13 = iArr[i9];
            int i14 = (i7 + 0) - i10;
            bArr3[i14] = (byte) i13;
            for (int i15 = 1; i15 < i10; i15++) {
                i13 >>>= 8;
                bArr3[i14 + i15] = (byte) i13;
            }
        }
        f60Var.g = 0;
        f60Var.l = 0;
        f60Var.j = 0;
        f60Var.k = 0;
        Arrays.fill(f60Var.h, 0);
        Arrays.fill(bArr2, (byte) 0);
        byte[] bArr4 = f60Var.e;
        if (bArr4 != null) {
            System.arraycopy(bArr4, 0, bArr2, 0, bArr4.length);
            f60Var.g = 64;
        }
        f60Var.e(f60Var.c, f60Var.d, f60Var.e);
        return bArr3;
    }

    public static Object i(int i, Object obj) {
        if (obj == null || B(i, obj)) {
            return obj;
        }
        M(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static void j(dx7 dx7Var, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                dx7Var.l(i);
            } else if (obj instanceof byte[]) {
                dx7Var.j(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                dx7Var.h(i, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dx7Var.h(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                dx7Var.i(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                dx7Var.i(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                dx7Var.i(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                dx7Var.i(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                dx7Var.t(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                dx7Var.i(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public static final byte[] k(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        bArr.getClass();
        bArr3.getClass();
        uo0 uo0Var = new uo0();
        uo0Var.e(false, new lr(new q02(bArr, bArr.length), bArr2, bArr3));
        int iD = uo0Var.d(bArr4.length);
        byte[] bArr5 = new byte[iD];
        int iF = uo0Var.f(bArr4, bArr4.length, bArr5);
        int iB = uo0Var.b(iF, bArr5) + iF;
        return iB == iD ? bArr5 : Arrays.copyOf(bArr5, iB);
    }

    public static final byte[] l(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        bArr.getClass();
        bArr3.getClass();
        uo0 uo0Var = new uo0();
        uo0Var.e(true, new lr(new q02(bArr, bArr.length), bArr2, bArr3));
        byte[] bArr5 = new byte[uo0Var.d(bArr4.length)];
        uo0Var.b(uo0Var.f(bArr4, bArr4.length, bArr5), bArr5);
        return bArr5;
    }

    public static final float m(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final void n(sx4 sx4Var, LinkedHashSet linkedHashSet, et4 et4Var, boolean z) {
        for (ed1 ed1Var : hi5.b0(et4Var, pk1.o, 2)) {
            if (ed1Var instanceof sx4) {
                sx4 sx4VarH0 = (sx4) ed1Var;
                if (sx4VarH0.C()) {
                    v15 name = sx4VarH0.getName();
                    name.getClass();
                    ot0 ot0VarE = et4Var.e(name, x45.f0);
                    sx4VarH0 = ot0VarE instanceof sx4 ? (sx4) ot0VarE : ot0VarE instanceof km1 ? ((km1) ot0VarE).H0() : null;
                }
                if (sx4VarH0 != null) {
                    int i = bl1.a;
                    Iterator it = sx4VarH0.l().c().iterator();
                    while (it.hasNext()) {
                        if (bl1.n((t14) it.next(), sx4Var.a())) {
                            linkedHashSet.add(sx4VarH0);
                            break;
                        }
                    }
                    if (z) {
                        et4 et4VarQ0 = sx4VarH0.q0();
                        et4VarQ0.getClass();
                        n(sx4Var, linkedHashSet, et4VarQ0, z);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (defpackage.w79.n(r11.getWidth(), r11.getHeight(), (int) (r2 >> 32), (int) (r2 & 4294967295L), r4, r20) == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap o(android.graphics.drawable.Drawable r16, android.graphics.Bitmap.Config r17, defpackage.ta7 r18, defpackage.pw6 r19, defpackage.ta7 r20, boolean r21) {
        /*
            r0 = r16
            r1 = r18
            r4 = r19
            r5 = r20
            boolean r2 = r0 instanceof android.graphics.drawable.BitmapDrawable
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 32
            if (r2 == 0) goto L5d
            r2 = r0
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            android.graphics.Bitmap r11 = r2.getBitmap()
            android.graphics.Bitmap$Config r2 = r11.getConfig()
            if (r17 == 0) goto L2a
            boolean r3 = defpackage.ue3.z(r17)
            if (r3 == 0) goto L27
            goto L2a
        L27:
            r3 = r17
            goto L2c
        L2a:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
        L2c:
            if (r2 != r3) goto L5d
            if (r21 == 0) goto L31
            goto L5c
        L31:
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            long r2 = defpackage.w79.l(r2, r3, r1, r4, r5)
            long r6 = r2 >> r10
            int r6 = (int) r6
            long r2 = r2 & r8
            int r2 = (int) r2
            r5 = r2
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            r7 = r6
            r6 = r4
            r4 = r7
            r7 = r20
            double r2 = defpackage.w79.n(r2, r3, r4, r5, r6, r7)
            r4 = r6
            r5 = r7
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L5d
        L5c:
            return r11
        L5d:
            android.graphics.drawable.Drawable r6 = r0.mutate()
            int r0 = defpackage.at8.b(r6)
            r2 = 512(0x200, float:7.17E-43)
            if (r0 <= 0) goto L6a
            goto L6b
        L6a:
            r0 = r2
        L6b:
            int r3 = defpackage.at8.a(r6)
            if (r3 <= 0) goto L72
            r2 = r3
        L72:
            long r11 = defpackage.w79.l(r0, r2, r1, r4, r5)
            long r13 = r11 >> r10
            int r1 = (int) r13
            long r7 = r11 & r8
            int r3 = (int) r7
            r15 = r2
            r2 = r1
            r1 = r15
            double r2 = defpackage.w79.n(r0, r1, r2, r3, r4, r5)
            double r4 = (double) r0
            double r4 = r4 * r2
            int r0 = defpackage.nr4.N(r4)
            double r4 = (double) r1
            double r2 = r2 * r4
            int r1 = defpackage.nr4.N(r2)
            if (r17 == 0) goto L9b
            boolean r2 = defpackage.ue3.z(r17)
            if (r2 == 0) goto L98
            goto L9b
        L98:
            r2 = r17
            goto L9d
        L9b:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L9d:
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Rect r3 = r6.getBounds()
            int r4 = r3.left
            int r5 = r3.top
            int r7 = r3.right
            int r3 = r3.bottom
            r8 = 0
            r6.setBounds(r8, r8, r0, r1)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r2)
            r6.draw(r0)
            r6.setBounds(r4, r5, r7, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci8.o(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, ta7, pw6, ta7, boolean):android.graphics.Bitmap");
    }

    public static final wk p(wk wkVar) {
        wk wkVarC = wkVar.c();
        int iB = wkVarC.b();
        for (int i = 0; i < iB; i++) {
            wkVarC.e(i, wkVar.a(i));
        }
        return wkVarC;
    }

    public static final String q(w15 w15Var, int i) {
        w15Var.getClass();
        String strA = w15Var.a(i);
        return w15Var.b(i) ? ".".concat(strA) : strA;
    }

    public static Object r(dh8 dh8Var) {
        Class cls = dh8Var.j0;
        Class clsV = it0.v(cls);
        if (clsV == null) {
            if (dh8Var.I0() || dh8Var.M() || cls == UUID.class) {
                return dp3.Z;
            }
            if (cls == String.class) {
                return _UrlKt.FRAGMENT_ENCODE_SET;
            }
            if (dh8Var.L0(Date.class)) {
                return new Date(0L);
            }
            if (!dh8Var.L0(Calendar.class)) {
                return null;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(0L);
            return gregorianCalendar;
        }
        if (clsV == Integer.TYPE) {
            return 0;
        }
        if (clsV == Long.TYPE) {
            return 0L;
        }
        if (clsV == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (clsV == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (clsV == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (clsV == Byte.TYPE) {
            return (byte) 0;
        }
        if (clsV == Short.TYPE) {
            return (short) 0;
        }
        if (clsV == Character.TYPE) {
            return (char) 0;
        }
        u52.m("Class ", clsV.getName(), " is not a primitive type");
        return null;
    }

    public static final zu3 u(lv3 lv3Var) {
        if (lv3Var instanceof zu3) {
            return (zu3) lv3Var;
        }
        Object obj = null;
        if (!(lv3Var instanceof rw3)) {
            xw3.j(lv3Var, "Cannot calculate JVM erasure for type: ");
            return null;
        }
        List upperBounds = ((rw3) lv3Var).getUpperBounds();
        for (Object obj2 : upperBounds) {
            lv3 lv3VarM = ((pw3) obj2).M();
            ev3 ev3Var = lv3VarM instanceof ev3 ? (ev3) lv3VarM : null;
            if (ev3Var != null && ev3Var.g0() != ts0.INTERFACE && ev3Var.g0() != ts0.ANNOTATION_CLASS) {
                obj = obj2;
                break;
            }
        }
        pw3 pw3Var = (pw3) obj;
        if (pw3Var == null) {
            pw3Var = (pw3) wv0.t0(upperBounds);
        }
        return pw3Var != null ? v(pw3Var) : yb6.a.b(Object.class);
    }

    public static final zu3 v(pw3 pw3Var) {
        zu3 zu3VarU;
        pw3Var.getClass();
        lv3 lv3VarM = pw3Var.M();
        if (lv3VarM != null && (zu3VarU = u(lv3VarM)) != null) {
            return zu3VarU;
        }
        xw3.j(pw3Var, "Cannot calculate JVM erasure for type: ");
        return null;
    }

    public static final g73 w() {
        g73 g73Var = g;
        if (g73Var != null) {
            return g73Var;
        }
        f73 f73Var = new f73("Filled.MoreVert", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = gu8.a;
        fe7 fe7Var = new fe7(dw0.b);
        cc0 cc0Var = new cc0((byte) 2);
        ArrayList arrayList = cc0Var.b;
        cc0Var.e(12.0f, 8.0f);
        arrayList.add(new aj5(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f));
        cc0Var.f(-0.9f, -2.0f, -2.0f, -2.0f);
        cc0Var.f(-2.0f, 0.9f, -2.0f, 2.0f);
        cc0Var.f(0.9f, 2.0f, 2.0f, 2.0f);
        cc0Var.c();
        cc0Var.e(12.0f, 10.0f);
        arrayList.add(new aj5(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f));
        cc0Var.f(0.9f, 2.0f, 2.0f, 2.0f);
        cc0Var.f(2.0f, -0.9f, 2.0f, -2.0f);
        cc0Var.f(-0.9f, -2.0f, -2.0f, -2.0f);
        cc0Var.c();
        cc0Var.e(12.0f, 16.0f);
        arrayList.add(new aj5(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f));
        cc0Var.f(0.9f, 2.0f, 2.0f, 2.0f);
        cc0Var.f(2.0f, -0.9f, 2.0f, -2.0f);
        cc0Var.f(-0.9f, -2.0f, -2.0f, -2.0f);
        cc0Var.c();
        f73.a(f73Var, arrayList, fe7Var);
        g73 g73VarB = f73Var.b();
        g = g73VarB;
        return g73VarB;
    }

    public static final Object x(o05 o05Var, js5 js5Var, Serializable serializable) {
        o05Var.getClass();
        js5Var.getClass();
        Object objC = o05Var.c(js5Var);
        return objC == null ? serializable : objC;
    }

    public static final xi4 y(xi4 xi4Var) {
        LayoutNode layoutNode = xi4Var.w0.w0;
        while (true) {
            LayoutNode layoutNodeW = layoutNode.w();
            LayoutNode layoutNode2 = null;
            if ((layoutNodeW != null ? layoutNodeW.k0 : null) == null) {
                xi4 xi4VarT0 = layoutNode.getOuterCoordinator$ui().T0();
                xi4VarT0.getClass();
                return xi4VarT0;
            }
            LayoutNode layoutNodeW2 = layoutNode.w();
            if (layoutNodeW2 != null) {
                layoutNode2 = layoutNodeW2.k0;
            }
            layoutNode2.getClass();
            LayoutNode layoutNodeW3 = layoutNode.w();
            layoutNodeW3.getClass();
            layoutNode = layoutNodeW3.k0;
            layoutNode.getClass();
        }
    }

    public static final byte[] z(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        if (bArr.length > 64) {
            bArr = h(bArr);
        }
        byte[] bArr3 = new byte[64];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        byte[] bArr4 = new byte[64];
        byte[] bArr5 = new byte[64];
        for (int i = 0; i < 64; i++) {
            bArr4[i] = (byte) (bArr3[i] ^ 54);
            bArr5[i] = (byte) (bArr3[i] ^ 92);
        }
        return h(eu.B0(bArr5, h(eu.B0(bArr4, bArr2))));
    }

    public float s(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        return view.getTranslationX();
    }

    public float t(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        return view.getTranslationY();
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ch3 {
    public static final md0 a = new md0(4);
    public static final zy0 b = new zy0(739772753, false, new dx0(14));
    public static final md0 c = new md0(7);
    public static final md0 d = new md0(8);
    public static final jw0 e = jw0.l0;
    public static final k82 f;
    public static final k82 g;
    public static final k82[] h;

    static {
        k82 k82Var = new k82("CLIENT_TELEMETRY");
        f = k82Var;
        k82 k82Var2 = new k82("CLIENT_NOTIFICATION_TELEMETRY");
        g = k82Var2;
        h = new k82[]{k82Var, k82Var2};
    }

    public static void A(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw p61.k(it);
        }
    }

    public static boolean B() {
        try {
            if (AndroidComposeView.J1 == null) {
                AndroidComposeView.J1 = Class.forName("android.os.SystemProperties");
            }
            Method declaredMethod = AndroidComposeView.K1;
            if (declaredMethod == null) {
                Class cls = AndroidComposeView.J1;
                declaredMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                AndroidComposeView.K1 = declaredMethod;
            }
            Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return dh3.f(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final ys3 C(yy3 yy3Var) {
        yy3Var.getClass();
        gz3 gz3Var = ys3.c;
        gz3Var.getClass();
        return (ys3) jb5.N(yy3Var.s, gz3Var);
    }

    public static final at3 D(cz3 cz3Var) {
        cz3Var.getClass();
        gz3 gz3Var = at3.b;
        gz3Var.getClass();
        return (at3) jb5.N(cz3Var.f, gz3Var);
    }

    public static final et3 E(iz3 iz3Var) {
        iz3Var.getClass();
        gz3 gz3Var = et3.b;
        gz3Var.getClass();
        return (et3) jb5.N(iz3Var.l, gz3Var);
    }

    public static final vt3 F(kz3 kz3Var) {
        kz3Var.getClass();
        gz3 gz3Var = vt3.g;
        gz3Var.getClass();
        return (vt3) jb5.N(kz3Var.p, gz3Var);
    }

    public static Object G(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c4.j(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (i6.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static int H(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    public static final void I(w07 w07Var) {
        yn0.Z(w07Var).I();
    }

    public static String J(String str) {
        return oi0.m("Happ/4.9.0/", str, "/", "17926543066011721" + (v18.d(we3.a.a(), pa8.b).X.getDayOfMonth() % 2 == 0 ? '6' : '5') + "04");
    }

    public static final boolean K(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final s61 M(b71 b71Var, s61 s61Var) {
        s61 s61VarW = w(b71Var.getCoroutineContext(), s61Var, true);
        nf1 nf1Var = tp1.a;
        return (s61VarW == nf1Var || s61VarW.H0(pz2.E0) != null) ? s61VarW : s61VarW.B0(nf1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void N(jx4 jx4Var, dn2 dn2Var) {
        x85 x85Var = jx4Var.i0;
        if (x85Var == null) {
            x85Var = new x85((w85) jx4Var);
            jx4Var.i0 = x85Var;
        }
        of5 snapshotObserver = yn0.a0(jx4Var).getSnapshotObserver();
        snapshotObserver.a.c(x85Var, x85.Y, dn2Var);
    }

    public static final boolean O(t14 t14Var) {
        ot0 ot0VarX = t14Var.n0().x();
        if (ot0VarX != null && bd3.a(ot0VarX) && bd3.a(ot0VarX) && !el1.g((sx4) ot0VarX).equals(ug7.h)) {
            return true;
        }
        ot0 ot0VarX2 = t14Var.n0().x();
        hi8 hi8Var = ot0VarX2 instanceof hi8 ? (hi8) ot0VarX2 : null;
        return hi8Var == null ? false : O(y08.f(hi8Var));
    }

    public static LinkedHashSet P(v15 v15Var, Collection collection, Collection collection2, sx4 sx4Var, l32 l32Var, hf5 hf5Var, boolean z) {
        if (collection == null) {
            a(13);
            throw null;
        }
        if (sx4Var == null) {
            a(15);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        hf5Var.h(v15Var, collection, collection2, sx4Var, new al1(l32Var, linkedHashSet, z));
        return linkedHashSet;
    }

    public static LinkedHashSet Q(v15 v15Var, AbstractCollection abstractCollection, Collection collection, sx4 sx4Var, l32 l32Var, hf5 hf5Var) {
        if (sx4Var != null) {
            return P(v15Var, abstractCollection, collection, sx4Var, l32Var, hf5Var, false);
        }
        a(3);
        throw null;
    }

    public static LinkedHashSet R(v15 v15Var, Collection collection, AbstractCollection abstractCollection, sx4 sx4Var, hf5 hf5Var) {
        qe4 qe4Var = qe4.r0;
        if (collection == null) {
            a(7);
            throw null;
        }
        if (sx4Var != null) {
            return P(v15Var, collection, abstractCollection, sx4Var, qe4Var, hf5Var, true);
        }
        a(9);
        throw null;
    }

    public static final void S(int i, int i2, e37 e37Var) {
        e37Var.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(e37Var.f(i4));
            }
            i3 >>>= 1;
        }
        String strA = e37Var.a();
        strA.getClass();
        throw new cw4(arrayList.size() == 1 ? oi0.q(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", strA, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + strA + "', but they were missing", null, arrayList, strA);
    }

    public static final am8 T(q51 q51Var, s61 s61Var, Object obj) {
        am8 am8Var = null;
        if ((q51Var instanceof d71) && s61Var.H0(rm0.Z) != null) {
            d71 d71VarC = (d71) q51Var;
            while (!(d71VarC instanceof pp1) && (d71VarC = d71VarC.c()) != null) {
                if (d71VarC instanceof am8) {
                    am8Var = (am8) d71VarC;
                    break;
                }
            }
            if (am8Var != null) {
                am8Var.r0(s61Var, obj);
            }
        }
        return am8Var;
    }

    public static void U(int i, int i2, byte[] bArr) {
        if (bArr == null) {
            b61.i("'buf' cannot be null");
            return;
        }
        int length = bArr.length - i;
        if ((length | i | i2 | (length - i2)) >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("buf.length: ");
        oi0.x(sb, bArr.length, ", off: ", i, ", len: ");
        bt.f(i2, sb);
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static final void b(r68 r68Var, boolean z, zy0 zy0Var, lp2 lp2Var, int i) {
        int i2;
        kx4 kx4VarG;
        lp2Var.X(-1442752422);
        if ((i & 6) == 0) {
            i2 = (lp2Var.h(r68Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.h(zy0Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        byte b2 = 1;
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            lp2Var.W(-1299459355);
            if (z) {
                lp2Var.W(-1299415211);
                boolean zH = lp2Var.h(r68Var);
                Object objK = lp2Var.K();
                if (zH || objK == zz0.a) {
                    objK = new tk0(r68Var, null, b2);
                    lp2Var.g0(objK);
                }
                kx4VarG = z39.G((rn2) objK);
                lp2Var.p(false);
            } else {
                lp2Var.W(-1298836224);
                lp2Var.p(false);
                kx4VarG = hx4.X;
            }
            z91.h(kx4VarG, zy0Var, lp2Var, (i2 >> 3) & 112);
            lp2Var.p(false);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new mx0(r68Var, z, zy0Var, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:68:0x0156  */
    /* JADX WARN: Code duplicated, block: B:71:0x0162  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void c(final dn2 dn2Var, final String str, boolean z, q8 q8Var, final zy0 zy0Var, final zy0 zy0Var2, lp2 lp2Var, final int i, final int i2) {
        dn2 dn2Var2;
        int i3;
        boolean z2;
        int i4;
        zy0 zy0Var3;
        boolean z3;
        final q8 q8Var2;
        final boolean z4;
        j86 j86VarR;
        boolean z5;
        boolean z6;
        boolean z7;
        int i5;
        int i6;
        dn2Var.getClass();
        str.getClass();
        lp2Var.X(-978992161);
        if ((i & 6) == 0) {
            dn2Var2 = dn2Var;
            i3 = (lp2Var.h(dn2Var2) ? 4 : 2) | i;
        } else {
            dn2Var2 = dn2Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= lp2Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= lp2Var.f(hx4.X) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= lp2Var.g(z2) ? 2048 : 1024;
            }
            i4 = i3 | 24576;
            if ((196608 & i) == 0) {
                zy0Var3 = zy0Var;
                if (lp2Var.h(zy0Var3)) {
                    i6 = 131072;
                } else {
                    i6 = DnsOverHttps.MAX_RESPONSE_SIZE;
                }
                i4 |= i6;
            } else {
                zy0Var3 = zy0Var;
            }
            if ((1572864 & i) == 0) {
                if (lp2Var.h(zy0Var2)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i4 |= i5;
            }
            if ((599187 & i4) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (lp2Var.N(i4 & 1, z3)) {
                if (i7 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                p50 p50Var = pz2.h0;
                final Context context = (Context) lp2Var.j(pc.b);
                final Activity activity = (Activity) lp2Var.j(yc4.a);
                final Configuration configuration = (Configuration) lp2Var.j(pc.a);
                jm6 jm6Var = ((tr) lp2Var.j(ur.a)).b.a;
                long j = ((dp) lp2Var.j(ep.z)).j.b;
                if ((4 & 1) != 0) {
                    z6 = true;
                } else {
                    z6 = z5;
                }
                if ((2 & 4) != 0) {
                    z7 = true;
                } else {
                    z7 = z5;
                }
                final byte b2 = 0;
                final zy0 zy0Var4 = zy0Var3;
                final byte b3 = 1;
                z51.a(dn2Var2, jm4.U(2072838807, new rn2() { // from class: pv2
                    @Override // defpackage.rn2
                    public final Object K(Object obj, Object obj2) {
                        byte b4 = b2;
                        dn8 dn8Var = dn8.a;
                        Configuration configuration2 = configuration;
                        Activity activity2 = activity;
                        Context context2 = context;
                        zy0 zy0Var5 = zy0Var4;
                        lp2 lp2Var2 = (lp2) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (b4) {
                            case 0:
                                if (!lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    lp2Var2.Q();
                                } else {
                                    ch3.d(context2, activity2, configuration2, jm4.U(-11083602, new h8(zy0Var5, (byte) 3), lp2Var2), lp2Var2);
                                }
                                break;
                            default:
                                if (!lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    lp2Var2.Q();
                                } else {
                                    ch3.d(context2, activity2, configuration2, jm4.U(1605112777, new h8(zy0Var5, (byte) 4), lp2Var2), lp2Var2);
                                }
                                break;
                        }
                        return dn8Var;
                    }
                }, lp2Var), jm4.U(-1788164845, new j30((Object) str, (Object) context, (Object) activity, (Object) configuration, (byte) 1), lp2Var), jm4.U(-605932110, new rn2() { // from class: pv2
                    @Override // defpackage.rn2
                    public final Object K(Object obj, Object obj2) {
                        byte b4 = b3;
                        dn8 dn8Var = dn8.a;
                        Configuration configuration2 = configuration;
                        Activity activity2 = activity;
                        Context context2 = context;
                        zy0 zy0Var5 = zy0Var2;
                        lp2 lp2Var2 = (lp2) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (b4) {
                            case 0:
                                if (!lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    lp2Var2.Q();
                                } else {
                                    ch3.d(context2, activity2, configuration2, jm4.U(-11083602, new h8(zy0Var5, (byte) 3), lp2Var2), lp2Var2);
                                }
                                break;
                            default:
                                if (!lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    lp2Var2.Q();
                                } else {
                                    ch3.d(context2, activity2, configuration2, jm4.U(1605112777, new h8(zy0Var5, (byte) 4), lp2Var2), lp2Var2);
                                }
                                break;
                        }
                        return dn8Var;
                    }
                }, lp2Var), jm6Var, j, 0L, 0L, 0L, new vn1(z6, z7, true, true, 224), lp2Var, (i4 & 14) | 1769520 | (i4 & 896));
                z4 = z5;
                q8Var2 = p50Var;
            } else {
                lp2Var.Q();
                q8Var2 = q8Var;
                z4 = z2;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: qv2
                    @Override // defpackage.rn2
                    public final Object K(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ch3.c(dn2Var, str, z4, q8Var2, zy0Var, zy0Var2, (lp2) obj, w79.P(i | 1), i2);
                        return dn8.a;
                    }
                };
            }
        }
        i3 |= 3072;
        z2 = z;
        i4 = i3 | 24576;
        if ((196608 & i) == 0) {
            zy0Var3 = zy0Var;
            if (lp2Var.h(zy0Var3)) {
                i6 = 131072;
            } else {
                i6 = DnsOverHttps.MAX_RESPONSE_SIZE;
            }
            i4 |= i6;
        } else {
            zy0Var3 = zy0Var;
        }
        if ((1572864 & i) == 0) {
            if (lp2Var.h(zy0Var2)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i4 |= i5;
        }
        if ((599187 & i4) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (lp2Var.N(i4 & 1, z3)) {
            if (i7 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            p50 p50Var2 = pz2.h0;
            final Context context2 = (Context) lp2Var.j(pc.b);
            final Activity activity2 = (Activity) lp2Var.j(yc4.a);
            final Configuration configuration2 = (Configuration) lp2Var.j(pc.a);
            jm6 jm6Var2 = ((tr) lp2Var.j(ur.a)).b.a;
            long j2 = ((dp) lp2Var.j(ep.z)).j.b;
            if ((4 & 1) != 0) {
                z6 = true;
            } else {
                z6 = z5;
            }
            if ((2 & 4) != 0) {
                z7 = true;
            } else {
                z7 = z5;
            }
            final byte b4 = 0;
            final zy0 zy0Var5 = zy0Var3;
            final byte b5 = 1;
            z51.a(dn2Var2, jm4.U(2072838807, new rn2() { // from class: pv2
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    byte b6 = b4;
                    dn8 dn8Var = dn8.a;
                    Configuration configuration3 = configuration2;
                    Activity activity3 = activity2;
                    Context context3 = context2;
                    zy0 zy0Var6 = zy0Var5;
                    lp2 lp2Var2 = (lp2) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (b6) {
                        case 0:
                            if (!lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                lp2Var2.Q();
                            } else {
                                ch3.d(context3, activity3, configuration3, jm4.U(-11083602, new h8(zy0Var6, (byte) 3), lp2Var2), lp2Var2);
                            }
                            break;
                        default:
                            if (!lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                lp2Var2.Q();
                            } else {
                                ch3.d(context3, activity3, configuration3, jm4.U(1605112777, new h8(zy0Var6, (byte) 4), lp2Var2), lp2Var2);
                            }
                            break;
                    }
                    return dn8Var;
                }
            }, lp2Var), jm4.U(-1788164845, new j30((Object) str, (Object) context2, (Object) activity2, (Object) configuration2, (byte) 1), lp2Var), jm4.U(-605932110, new rn2() { // from class: pv2
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    byte b6 = b5;
                    dn8 dn8Var = dn8.a;
                    Configuration configuration3 = configuration2;
                    Activity activity3 = activity2;
                    Context context3 = context2;
                    zy0 zy0Var6 = zy0Var2;
                    lp2 lp2Var2 = (lp2) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (b6) {
                        case 0:
                            if (!lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                lp2Var2.Q();
                            } else {
                                ch3.d(context3, activity3, configuration3, jm4.U(-11083602, new h8(zy0Var6, (byte) 3), lp2Var2), lp2Var2);
                            }
                            break;
                        default:
                            if (!lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                lp2Var2.Q();
                            } else {
                                ch3.d(context3, activity3, configuration3, jm4.U(1605112777, new h8(zy0Var6, (byte) 4), lp2Var2), lp2Var2);
                            }
                            break;
                    }
                    return dn8Var;
                }
            }, lp2Var), jm6Var2, j2, 0L, 0L, 0L, new vn1(z6, z7, true, true, 224), lp2Var, (i4 & 14) | 1769520 | (i4 & 896));
            z4 = z5;
            q8Var2 = p50Var2;
        } else {
            lp2Var.Q();
            q8Var2 = q8Var;
            z4 = z2;
        }
        j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: qv2
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ch3.c(dn2Var, str, z4, q8Var2, zy0Var, zy0Var2, (lp2) obj, w79.P(i | 1), i2);
                    return dn8.a;
                }
            };
        }
    }

    public static final void d(Context context, Activity activity, Configuration configuration, zy0 zy0Var, lp2 lp2Var) {
        mb6.b(new t06[]{pc.b.a(context), yc4.a.a(activity), pc.a.a(configuration)}, jm4.U(-1350573132, new h8(zy0Var, (byte) 5), lp2Var), lp2Var, 48);
    }

    public static final void e(sq6 sq6Var, dn2 dn2Var, gn2 gn2Var, o87 o87Var, lp2 lp2Var, int i) {
        sq6Var.getClass();
        dn2Var.getClass();
        gn2Var.getClass();
        lp2Var.X(215703711);
        y05 y05VarO = i21.o(sq6Var.c, lp2Var);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && lp2Var.h(sq6Var)) || (i & 6) == 4;
        Object objK = lp2Var.K();
        Object obj = zz0.a;
        if (z2 || objK == obj) {
            Object al5Var = new al5(1, sq6Var, sq6.class, "onUiIntent", "onUiIntent(Lsu/happ/proxyutility/feature/routing/sub_select/RoutingSubscriptionSelectUiIntent;)V", 0, (byte) 9);
            lp2Var.g0(al5Var);
            objK = al5Var;
        }
        pv3 pv3Var = (pv3) objK;
        boolean zF = lp2Var.f(pv3Var);
        if ((((i & 112) ^ 48) <= 32 || !lp2Var.f(dn2Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = zF | z;
        Object objK2 = lp2Var.K();
        if (z3 || objK2 == obj) {
            objK2 = new jq6(pv3Var, dn2Var, (byte) 0);
            lp2Var.g0(objK2);
        }
        int i2 = i >> 6;
        vr3.d((dn2) ((pv3) objK2), o87Var, false, false, false, false, jm4.U(1657106298, new lv5(sq6Var, gn2Var, pv3Var, dn2Var, y05VarO), lp2Var), lp2Var, (i2 & 112) | 12582912 | (i2 & 896), 120);
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new i40(sq6Var, dn2Var, gn2Var, o87Var, i);
        }
    }

    public static final void f(lp2 lp2Var, kx4 kx4Var) {
        ld ldVar = ld.h;
        int iHashCode = Long.hashCode(lp2Var.T);
        kx4 kx4VarQ = w45.Q(lp2Var, kx4Var);
        kl5 kl5VarL = lp2Var.l();
        uz0.j.getClass();
        lp2Var.Z();
        if (lp2Var.S) {
            lp2Var.k();
        } else {
            lp2Var.j0();
        }
        pn7.m(pz2.B0, lp2Var, ldVar);
        pn7.m(pz2.A0, lp2Var, kl5VarL);
        pn7.l(lp2Var);
        pn7.m(pz2.z0, lp2Var, kx4VarQ);
        pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
        lp2Var.p(true);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 17741. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static void h(defpackage.n31 r40, defpackage.ka4 r41, java.util.ArrayList r42, int r43) {
        /*
            Method dump skipped, instruction units count: 1774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch3.h(n31, ka4, java.util.ArrayList, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable k(xe2 xe2Var, ze2 ze2Var, s51 s51Var) throws Throwable {
        of2 of2Var;
        ea6 ea6Var;
        CancellationException cancellationExceptionR;
        if (s51Var instanceof of2) {
            of2Var = (of2) s51Var;
            int i = of2Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                of2Var.h0 = i - Integer.MIN_VALUE;
            } else {
                of2Var = new of2(s51Var);
            }
        } else {
            of2Var = new of2(s51Var);
        }
        Object obj = of2Var.g0;
        int i2 = of2Var.h0;
        if (i2 == 0) {
            w39.n0(obj);
            ea6 ea6Var2 = new ea6();
            try {
                ze2 te0Var = new te0(ze2Var, ea6Var2, (byte) 2);
                of2Var.f0 = ea6Var2;
                of2Var.h0 = 1;
                Object objA = xe2Var.a(te0Var, of2Var);
                c71 c71Var = c71.X;
                if (objA == c71Var) {
                    return c71Var;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                ea6Var = ea6Var2;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ea6Var = of2Var.f0;
            try {
                w39.n0(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) ea6Var.X;
        if (th3 == null || !th3.equals(th)) {
            s61 s61Var = of2Var.Y;
            s61Var.getClass();
            bm3 bm3Var = (bm3) s61Var.H0(oy1.E0);
            if (bm3Var == null || !bm3Var.isCancelled() || (cancellationExceptionR = bm3Var.R()) == null || !cancellationExceptionR.equals(th)) {
                if (th3 == null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    gv3.g(th3, th);
                    throw th3;
                }
                gv3.g(th, th3);
                throw th;
            }
        }
        throw th;
    }

    public static final void l(int i, int i2) {
        if (i < 0 || i >= i2) {
            kp5.k(pc6.m("index: ", i, i2, ", size: "));
        }
    }

    public static final void m(int i, int i2) {
        if (i < 0 || i > i2) {
            kp5.k(pc6.m("index: ", i, i2, ", size: "));
        }
    }

    public static final void n(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            bt.f(i3, oi0.r(i, "fromIndex: ", i2, ", toIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            bt.q(pc6.m("fromIndex: ", i, i2, " > toIndex: "));
        }
    }

    public static byte[] o(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final wd0 p(b14 b14Var, boolean z) {
        pt3 pt3Var;
        wd0 le0Var;
        wd0 mg3Var;
        boolean zX;
        l14 l14VarU = b14Var.U();
        boolean zC = z51.C(l14VarU);
        kz3 kz3Var = l14VarU.g0;
        if (zC) {
            return v98.a;
        }
        ov3 ov3Var = l14VarU.Y;
        if (z) {
            kz3Var.getClass();
            pt3Var = F(kz3Var).c;
        } else {
            kz3Var.getClass();
            pt3Var = F(kz3Var).d;
        }
        Method methodT = pt3Var != null ? ov3Var.T(pt3Var.d, pt3Var.e) : null;
        byte b2 = 2;
        int i = 6;
        boolean z2 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        if (methodT == null) {
            if (a28.o(l14VarU) && l14VarU.e() == zw3.Z) {
                Class clsV = a28.v(((ob6) wv0.O0(l14VarU.g())).B());
                if (clsV == null) {
                    throw new p14("Underlying property of inline class " + l14VarU + " should have a field");
                }
                Method methodF = a28.f(clsV, l14VarU);
                mg3Var = mb6.K(b14Var) ? new mg3(methodF, mb6.C(b14Var.U())) : new ng3(methodF);
            } else {
                Field fieldW = l14VarU.w();
                if (fieldW == null) {
                    xw3.j(l14VarU, "No accessors or field is found for property ");
                    return null;
                }
                boolean z3 = true;
                if ((ov3Var instanceof ev3) && ((ev3) ov3Var).g0() == ts0.COMPANION_OBJECT) {
                    Class<?> enclosingClass = zc1.M((zu3) ov3Var).getEnclosingClass();
                    enclosingClass.getClass();
                    zu3 zu3VarB = yb6.a.b(enclosingClass);
                    ev3 ev3Var = zu3VarB instanceof ev3 ? (ev3) zu3VarB : null;
                    if (ev3Var == null) {
                        zX = false;
                    } else if (ev3Var.g0() == ts0.INTERFACE || ev3Var.g0() == ts0.ANNOTATION_CLASS) {
                        nw3[] nw3VarArr = ns3.a;
                        kz3Var.getClass();
                        zX = ns3.b.x(ns3.a[6], kz3Var);
                    } else {
                        zX = true;
                    }
                } else {
                    zX = false;
                }
                if (!zX && Modifier.isStatic(fieldW.getModifiers())) {
                    q(b14Var);
                    le0Var = z ? new de0(fieldW, z2, b2) : new he0(fieldW, !ms8.k(l14VarU.j()), objArr6 == true ? 1 : 0, b2);
                } else if (z) {
                    le0Var = mb6.K(b14Var) ? new be0(fieldW, mb6.C(b14Var.U())) : new de0(fieldW, z3, objArr5 == true ? 1 : 0);
                } else {
                    le0Var = mb6.K(b14Var) ? new fe0(fieldW, !ms8.k(l14VarU.j()), mb6.C(b14Var.U())) : new he0(fieldW, !ms8.k(l14VarU.j()), z3, objArr4 == true ? 1 : 0);
                }
            }
            return a28.c(mg3Var, b14Var, d02.X, false);
        }
        if (Modifier.isStatic(methodT.getModifiers())) {
            q(b14Var);
            le0Var = mb6.K(b14Var) ? new le0(methodT, false, mb6.C(b14Var.U())) : new me0(methodT, objArr == true ? 1 : 0, i, b2);
        } else {
            le0Var = mb6.K(b14Var) ? new je0(methodT, mb6.C(b14Var.U())) : new me0(methodT, objArr3 == true ? 1 : 0, i, objArr2 == true ? 1 : 0);
        }
        mg3Var = le0Var;
        return a28.c(mg3Var, b14Var, d02.X, false);
    }

    public static final void q(b14 b14Var) {
        if (b14Var.U().Y instanceof ew3) {
            return;
        }
        StringBuilder sb = new StringBuilder("Only top-level properties are supported for now: ");
        sb.append(b14Var.U().Y);
        String name = b14Var.getName();
        sb.append('/');
        sb.append(name);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static boolean r(byte[] bArr, int i, int i2, byte[] bArr2) {
        if (i < 0) {
            bt.q("'len' cannot be negative");
            return false;
        }
        if (bArr.length - i < 0) {
            kp5.k("'aOff' value invalid for specified length");
            return false;
        }
        if (i2 > bArr2.length - i) {
            kp5.k("'bOff' value invalid for specified length");
            return false;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 |= bArr[i4] ^ bArr2[i2 + i4];
        }
        return i3 == 0;
    }

    public static final s86 s(jx4 jx4Var, boolean z, boolean z2) {
        if (!jx4Var.X.p0) {
            return s86.e;
        }
        if (z) {
            return yn0.X(jx4Var, 8).s1();
        }
        i55 i55VarX = yn0.X(jx4Var, 8);
        return jm4.x(i55VarX).H(i55VarX, z2);
    }

    public static View t(View view, int i) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = AndroidComposeView.P1;
            if (declaredMethod == null) {
                declaredMethod = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", null);
                AndroidComposeView.P1 = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (dh3.f(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View viewT = t(viewGroup.getChildAt(i2), i);
                    if (viewT != null) {
                        return viewT;
                    }
                }
            }
        }
        return null;
    }

    public static final kx4 u(kx4 kx4Var) {
        return kx4Var.y(wg2.X);
    }

    public static final kx4 v(kx4 kx4Var, boolean z, xz4 xz4Var) {
        return kx4Var.y(z ? new bi2(xz4Var) : hx4.X);
    }

    public static final s61 w(s61 s61Var, s61 s61Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        byte b2 = 23;
        boolean zBooleanValue = ((Boolean) s61Var.U(new dx0(b2), bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) s61Var2.U(new dx0(b2), bool)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return s61Var.B0(s61Var2);
        }
        dx0 dx0Var = new dx0((byte) 24);
        b02 b02Var = b02.X;
        s61 s61Var3 = (s61) s61Var.U(dx0Var, b02Var);
        Object objU = s61Var2;
        if (zBooleanValue2) {
            objU = s61Var2.U(new dx0((byte) 25), b02Var);
        }
        return s61Var3.B0((s61) objU);
    }

    public static ot8 x(v15 v15Var, sx4 sx4Var) {
        if (v15Var == null) {
            a(19);
            throw null;
        }
        if (sx4Var == null) {
            a(20);
            throw null;
        }
        Collection collectionB = sx4Var.B();
        if (collectionB.size() != 1) {
            return null;
        }
        for (ot8 ot8Var : ((gs0) collectionB.iterator().next()).L()) {
            if (ot8Var.getName().equals(v15Var)) {
                return ot8Var;
            }
        }
        return null;
    }

    public static final Object y(yp2 yp2Var, aq2 aq2Var) {
        yp2Var.getClass();
        if (yp2Var.l(aq2Var)) {
            return yp2Var.k(aq2Var);
        }
        return null;
    }

    public static final Object z(yp2 yp2Var, aq2 aq2Var, int i) {
        yp2Var.getClass();
        yp2Var.o(aq2Var);
        b92 b92Var = yp2Var.X;
        zp2 zp2Var = aq2Var.d;
        b92Var.getClass();
        gc7 gc7Var = b92Var.a;
        if (!zp2Var.Z) {
            bt.q("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
        Object obj = gc7Var.get(zp2Var);
        if (i < (obj == null ? 0 : ((List) obj).size())) {
            yp2Var.o(aq2Var);
            if (zp2Var.Z) {
                Object obj2 = gc7Var.get(zp2Var);
                if (obj2 != null) {
                    return aq2Var.a(((List) obj2).get(i));
                }
                throw new IndexOutOfBoundsException();
            }
            bt.q("getRepeatedField() can only be called on repeated fields.");
        }
        return null;
    }

    public boolean L(Annotation annotation) {
        return false;
    }

    public ch3 g(Annotation annotation) {
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        am amVar = new am();
        amVar.i = clsAnnotationType;
        amVar.j = annotation;
        return amVar;
    }

    public yr2 i() {
        return new yr2((byte) 5, false);
    }

    public tm j() {
        return a;
    }
}

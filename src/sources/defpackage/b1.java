package defpackage;

import android.app.RemoteAction;
import android.graphics.RectF;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ComposeView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.ExcludeSettingsCache;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.excluded_routes.ExcludedRoutesActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b1 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ b1(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0236 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0238 A[LOOP:6: B:99:0x0202->B:112:0x0238, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:136:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:16:0x008b  */
    /* JADX WARN: Code duplicated, block: B:226:0x043d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:227:0x043f A[Catch: all -> 0x045c, LOOP:13: B:217:0x0413->B:227:0x043f, LOOP_END, TryCatch #1 {, blocks: (B:214:0x03fe, B:217:0x0413, B:219:0x041f, B:221:0x0429, B:223:0x042f, B:224:0x0437, B:227:0x043f, B:228:0x0442, B:230:0x0448, B:232:0x044e), top: B:346:0x03fe }] */
    /* JADX WARN: Code duplicated, block: B:265:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:350:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x023b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5 A[LOOP:0: B:27:0x00b5->B:38:0x00e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:397:0x0442 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x011f A[LOOP:2: B:44:0x00f0->B:55:0x011f, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) throws Exception {
        boolean zI;
        kv6 kv6Var;
        char c;
        char c2;
        Object objH0;
        Object next;
        String str;
        qg5 qg5Var;
        String str2;
        Object next2;
        String str3;
        String str4;
        char c3 = 7;
        lm0 lm0VarY = null;
        n17Var = null;
        n17Var = null;
        n17Var = null;
        n17 n17Var = null;
        switch (this.X) {
            case 0:
                AbstractComposeView abstractComposeView = (AbstractComposeView) this.Y;
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = AbstractComposeView.o0;
                if (lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    abstractComposeView.a(0, lp2Var);
                } else {
                    lp2Var.Q();
                }
                return dn8.a;
            case 1:
                my6 my6Var = (my6) this.Y;
                w51.G(my6Var.M0(), null, null, new w2(my6Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 2:
                em7 em7Var = (em7) this.Y;
                s86 s86VarV = pu.V((RectF) obj);
                s86 s86VarV2 = pu.V((RectF) obj2);
                switch (em7Var.X) {
                    case 2:
                        zI = s86VarV.i(s86VarV2);
                        break;
                    default:
                        zI = s86VarV2.a(s86VarV.d());
                        break;
                }
                return Boolean.valueOf(zI);
            case 3:
                ((Integer) obj2).getClass();
                int i2 = ComposeView.r0;
                ((ComposeView) this.Y).a(w79.P(1), (lp2) obj);
                return dn8.a;
            case 4:
                lp2 lp2Var2 = (lp2) this.Y;
                kx4 kx4Var = (kx4) obj;
                kx4 kx4VarP = (ix4) obj2;
                if (kx4VarP instanceof yz0) {
                    sn2 sn2Var = ((yz0) kx4VarP).m0;
                    ci8.i(3, sn2Var);
                    kx4VarP = w45.P(lp2Var2, (kx4) sn2Var.x(hx4.X, lp2Var2, 0));
                }
                return kx4Var.y(kx4VarP);
            case 5:
                p91 p91Var = (p91) this.Y;
                ((Integer) obj).getClass();
                if (obj2 instanceof jz0) {
                    jz0 jz0Var = (jz0) obj2;
                    t05 t05Var = (t05) p91Var.h;
                    if (t05Var == null) {
                        t05 t05Var2 = vw6.a;
                        t05Var = new t05();
                        p91Var.h = t05Var;
                    }
                    t05Var.k(jz0Var);
                    ((c15) p91Var.f).b(jz0Var);
                }
                if (obj2 instanceof pp2) {
                    p91Var.f((pp2) obj2);
                }
                if (obj2 instanceof j86) {
                    ((j86) obj2).c();
                }
                return dn8.a;
            case 6:
                n38 n38Var = (n38) this.Y;
                lp2 lp2Var3 = (lp2) obj;
                ((Integer) obj2).getClass();
                lp2Var3.W(666084174);
                String str5 = n38Var.b;
                lp2Var3.p(false);
                return str5;
            case 7:
                ((Integer) obj2).getClass();
                ((un1) this.Y).a(w79.P(1), (lp2) obj);
                return dn8.a;
            case 8:
                ExcludedRoutesActivity excludedRoutesActivity = (ExcludedRoutesActivity) this.Y;
                ExcludeSettingsCache excludeSettingsCache = (ExcludeSettingsCache) obj;
                String str6 = (String) obj2;
                int i3 = ExcludedRoutesActivity.U0;
                excludeSettingsCache.getClass();
                str6.getClass();
                m52 m52VarB = excludedRoutesActivity.B();
                Class<ExcludedRoutesActivity> cls = ExcludedRoutesActivity.class;
                int i4 = 0;
                int i5 = 0;
                ub ubVar = new ub(i5, excludedRoutesActivity, cls, "showSuccessSnackbar", "showSuccessSnackbar()V", i4, (byte) 2);
                ub ubVar2 = new ub(i5, excludedRoutesActivity, cls, "showFailureSnackbar", "showFailureSnackbar()V", i4, (byte) 3);
                Object objE = m52VarB.f().e(str6, excludeSettingsCache);
                if (sj6.a(objE) == null) {
                    ubVar.invoke();
                } else {
                    ubVar2.invoke();
                }
                return dn8.a;
            case 9:
                lp2 lp2Var4 = (lp2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (lp2Var4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    throw null;
                }
                lp2Var4.Q();
                return dn8.a;
            case 10:
                ((Integer) obj2).getClass();
                ((nc3) this.Y).a(w79.P(1), (lp2) obj);
                return dn8.a;
            case 11:
                hv6 hv6Var = (hv6) obj;
                List list = (List) ((nw2) this.Y).K(hv6Var, obj2);
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    Object obj3 = list.get(i6);
                    if (obj3 != null && (kv6Var = hv6Var.Y) != null && !kv6Var.c(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i6 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                ((Integer) obj2).getClass();
                ((lw4) this.Y).a(w79.P(1), (lp2) obj);
                return dn8.a;
            case 13:
                p87 p87Var = p87.Z;
                p87 p87Var2 = p87.Y;
                o87 o87Var = (o87) this.Y;
                pf3 pf3Var = (pf3) obj;
                float fG = q31.g(((q31) obj2).a);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                p87 p87Var3 = p87.X;
                linkedHashMap.put(p87Var3, Float.valueOf(fG));
                float f = fG / 2.0f;
                if (((int) (pf3Var.a & 4294967295L)) > f && !o87Var.a) {
                    linkedHashMap.put(p87Var, Float.valueOf(f));
                }
                int i7 = (int) (pf3Var.a & 4294967295L);
                if (i7 != 0) {
                    linkedHashMap.put(p87Var2, Float.valueOf(Math.max(0.0f, fG - i7)));
                }
                lp4 lp4Var = new lp4(linkedHashMap);
                int iOrdinal = ((p87) ((zi1) o87Var.d.j0).getValue()).ordinal();
                if (iOrdinal == 0) {
                    p87Var2 = p87Var3;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        b61.c();
                        return null;
                    }
                    if (!linkedHashMap.containsKey(p87Var)) {
                        p87Var = linkedHashMap.containsKey(p87Var2) ? p87Var2 : p87Var3;
                    }
                    p87Var2 = p87Var;
                } else if (!linkedHashMap.containsKey(p87Var2)) {
                    p87Var2 = p87Var3;
                }
                return new qg5(lp4Var, p87Var2);
            case 14:
                jz4 jz4Var = (jz4) this.Y;
                Set set = (Set) obj;
                ea6 ea6Var = new ea6();
                synchronized (jz4Var.X) {
                    s05 s05Var = jz4Var.f0;
                    sn snVar = new sn((Object) set, (Object) jz4Var, (Object) ea6Var, (byte) 17);
                    ci8.i(1, snVar);
                    Object[] objArr = s05Var.b;
                    long[] jArr = s05Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j = jArr[i8];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8 - ((~(i8 - length)) >>> 31);
                                for (int i10 = 0; i10 < i9; i10++) {
                                    if ((j & 255) < 128) {
                                        snVar.B(objArr[(i8 << 3) + i10]);
                                    }
                                    j >>= 8;
                                }
                                if (i9 == 8) {
                                    if (i8 != length) {
                                        i8++;
                                    }
                                }
                            } else if (i8 != length) {
                                i8++;
                            }
                        }
                    }
                    List list2 = (List) ea6Var.X;
                    if (list2 != null) {
                        int size2 = list2.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            ((n17) list2.get(i11)).b(dn8.a);
                        }
                    }
                }
                return dn8.a;
            case 15:
                ((Integer) obj2).getClass();
                ((ir5) this.Y).a(w79.P(1), (lp2) obj);
                return dn8.a;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                p86 p86Var = (p86) this.Y;
                Set set2 = (Set) obj;
                synchronized (p86Var.c) {
                    try {
                        if (((m86) p86Var.u.getValue()).compareTo(m86.g0) >= 0) {
                            t05 t05Var3 = p86Var.h;
                            if (set2 instanceof ww6) {
                                t05 t05Var4 = ((ww6) set2).X;
                                Object[] objArr2 = t05Var4.b;
                                long[] jArr2 = t05Var4.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i12 = 0;
                                    while (true) {
                                        long j2 = jArr2[i12];
                                        if ((((~j2) << c3) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j2 & 255) < 128) {
                                                    Object obj4 = objArr2[(i12 << 3) + i14];
                                                    c2 = c3;
                                                    if (!(obj4 instanceof zh7) || ((zh7) obj4).g(1)) {
                                                        t05Var3.a(obj4);
                                                    }
                                                } else {
                                                    c2 = c3;
                                                }
                                                j2 >>= 8;
                                                i14++;
                                                c3 = c2;
                                            }
                                            c = c3;
                                            if (i13 == 8) {
                                            }
                                        } else {
                                            c = c3;
                                        }
                                        if (i12 != length2) {
                                            i12++;
                                            c3 = c;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj5 : set2) {
                                    if (!(obj5 instanceof zh7) || ((zh7) obj5).g(1)) {
                                        t05Var3.a(obj5);
                                    }
                                }
                            }
                            lm0VarY = p86Var.y();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (lm0VarY != null) {
                    ((mm0) lm0VarY).f(dn8.a);
                }
                return dn8.a;
            case 17:
                pv3 pv3Var = (pv3) this.Y;
                lp2 lp2Var5 = (lp2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (lp2Var5.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    i21.d(48, (gn2) pv3Var, lp2Var5, b.a);
                } else {
                    lp2Var5.Q();
                }
                return dn8.a;
            case 18:
                qu6 qu6Var = (qu6) this.Y;
                int iIntValue4 = ((Integer) obj).intValue();
                q61 q61Var = (q61) obj2;
                r61 key = q61Var.getKey();
                q61 q61VarH0 = qu6Var.g0.H0(key);
                if (key == oy1.E0) {
                    bm3 bm3Var = (bm3) q61VarH0;
                    bm3 parent = (bm3) q61Var;
                    while (true) {
                        if (parent == null) {
                            parent = null;
                        } else if (parent != bm3Var && (parent instanceof fx6)) {
                            ir0 ir0Var = (ir0) iu.a.getObjectVolatile((fx6) parent, rm3.X);
                            parent = ir0Var != null ? ir0Var.getParent() : null;
                        }
                    }
                    if (parent != bm3Var) {
                        xw3.n("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ", parent, ", expected child of ", bm3Var, ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'");
                        return null;
                    }
                    if (bm3Var != null) {
                        iIntValue4++;
                    }
                } else if (q61Var != q61VarH0) {
                    iIntValue4 = Integer.MIN_VALUE;
                } else {
                    iIntValue4++;
                }
                return Integer.valueOf(iIntValue4);
            case 19:
                da6 da6Var = (da6) this.Y;
                ((hq5) obj).a();
                da6Var.X = ((z85) obj2).a;
                return dn8.a;
            case 20:
                i97 i97Var = (i97) this.Y;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                for (e95 e95Var : i97Var.b) {
                    e95Var.a.b(obj, Boolean.valueOf(zBooleanValue != dh3.f(e95Var.a.a.get(obj), Boolean.TRUE)));
                }
                return dn8.a;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                na7 na7Var = (na7) this.Y;
                Set set3 = (Set) obj;
                synchronized (na7Var.X) {
                    try {
                        t05 t05Var5 = na7Var.h0;
                        if (t05Var5 != null) {
                            Object[] objArr3 = t05Var5.b;
                            long[] jArr3 = t05Var5.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j3 = jArr3[i15];
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                        int i17 = 0;
                                        while (true) {
                                            if (i17 < i16) {
                                                if ((j3 & 255) >= 128 || !set3.contains(objArr3[(i15 << 3) + i17])) {
                                                    j3 >>= 8;
                                                    i17++;
                                                } else {
                                                    n17Var = na7Var.j0;
                                                }
                                            } else if (i16 == 8) {
                                                if (i15 != length3) {
                                                    i15++;
                                                }
                                            }
                                        }
                                    } else if (i15 != length3) {
                                        i15++;
                                    }
                                }
                            }
                        } else if (wv0.m0(set3, na7Var.f0)) {
                            n17Var = na7Var.j0;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (n17Var != null) {
                    n17Var.b(dn8.a);
                }
                return dn8.a;
            case 22:
                jb7 jb7Var = (jb7) this.Y;
                sv1 sv1Var = (sv1) obj;
                pb7 pb7Var = pb7.a;
                sv1.o0(sv1Var, jb7Var.b, sv1Var.h0(pb7.b) / 2.0f, ((z85) obj2).a, null, 120);
                return dn8.a;
            case 23:
                xd7 xd7Var = (xd7) this.Y;
                Set set4 = (Set) obj;
                AtomicReference atomicReference = xd7Var.b;
                while (true) {
                    Object obj6 = atomicReference.get();
                    if (obj6 == null) {
                        objH0 = set4;
                    } else if (obj6 instanceof Set) {
                        objH0 = i21.L(obj6, set4);
                    } else {
                        if (!(obj6 instanceof List)) {
                            d01.b("Unexpected notification");
                            b61.n();
                            return null;
                        }
                        objH0 = wv0.H0((Collection) obj6, i21.K(set4));
                    }
                    do {
                        if (atomicReference.compareAndSet(obj6, objH0)) {
                            if (xd7Var.b()) {
                                xd7Var.a.B(new hr5(xd7Var, (byte) 22));
                            }
                            return dn8.a;
                        }
                    } while (atomicReference.get() == obj6);
                }
                break;
            case 24:
                char[] cArr = (char[]) this.Y;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                charSequence.getClass();
                int iN0 = fm7.n0(charSequence, cArr, iIntValue5, false);
                if (iN0 < 0) {
                    return null;
                }
                return new qg5(Integer.valueOf(iN0), 1);
            case 25:
                List list3 = (List) this.Y;
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                charSequence2.getClass();
                if (list3.size() == 1) {
                    String str7 = (String) wv0.N0(list3);
                    int iM0 = fm7.m0(charSequence2, str7, iIntValue6, false, 4);
                    if (iM0 < 0) {
                        qg5Var = null;
                    } else {
                        qg5Var = new qg5(Integer.valueOf(iM0), str7);
                    }
                } else {
                    if (iIntValue6 < 0) {
                        iIntValue6 = 0;
                    }
                    kf3 kf3Var = new kf3(iIntValue6, charSequence2.length(), 1);
                    int i18 = kf3Var.Z;
                    int i19 = kf3Var.Y;
                    if (charSequence2 instanceof String) {
                        if ((i18 <= 0 || iIntValue6 > i19) && (i18 >= 0 || i19 > iIntValue6)) {
                            qg5Var = null;
                        } else {
                            while (true) {
                                Iterator it = list3.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        qg5Var = new qg5(Integer.valueOf(iIntValue6), str3);
                                    } else if (iIntValue6 != i19) {
                                        iIntValue6 += i18;
                                    } else {
                                        qg5Var = null;
                                    }
                                } while (!str4.regionMatches(0, (String) charSequence2, iIntValue6, str4.length()));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    qg5Var = new qg5(Integer.valueOf(iIntValue6), str3);
                                } else if (iIntValue6 != i19) {
                                    iIntValue6 += i18;
                                } else {
                                    qg5Var = null;
                                }
                            }
                        }
                    } else if ((i18 <= 0 || iIntValue6 > i19) && (i18 >= 0 || i19 > iIntValue6)) {
                        qg5Var = null;
                    } else {
                        int i20 = iIntValue6;
                        while (true) {
                            Iterator it2 = list3.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    qg5Var = new qg5(Integer.valueOf(i20), str);
                                } else if (i20 != i19) {
                                    i20 += i18;
                                } else {
                                    qg5Var = null;
                                }
                            } while (!fm7.w0(str2, 0, charSequence2, i20, str2.length(), false));
                            str = (String) next;
                            if (str != null) {
                                qg5Var = new qg5(Integer.valueOf(i20), str);
                            } else if (i20 != i19) {
                                i20 += i18;
                            } else {
                                qg5Var = null;
                            }
                        }
                    }
                }
                if (qg5Var != null) {
                    return new qg5(qg5Var.X, Integer.valueOf(((String) qg5Var.Y).length()));
                }
                return null;
            case 26:
                ((Integer) obj2).getClass();
                return ts2.f((TextClassification) this.Y, (lp2) obj);
            case 27:
                ((Integer) obj2).getClass();
                return ts2.g((RemoteAction) this.Y, (lp2) obj);
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                ((Integer) obj2).getClass();
                ((b88) this.Y).a(w79.P(1), (lp2) obj);
                return dn8.a;
            default:
                return new hf3(((long) ((n50) this.Y).a(0, (int) (((pf3) obj).a >> 32), (z24) obj2)) << 32);
        }
    }

    public /* synthetic */ b1(Object obj, int i, byte b) {
        this.X = b;
        this.Y = obj;
    }
}

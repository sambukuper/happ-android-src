package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.widget.EditText;
import android.widget.TextView;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import androidx.core.widget.NestedScrollView;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http.DateFormattingKt;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.util.dnsttv.dto.enums.DnsTTLogType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vk1 implements id1, is0, jh4, j6, vu, xo2, d61, d91, ke7, dk6, vo1 {
    public final /* synthetic */ byte X;
    public Object Y;

    public vk1(byte b) {
        this.X = b;
        switch (b) {
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                this.Y = null;
                break;
            case 22:
                this.Y = new c15(0, new r54[16]);
                break;
            case 24:
                dp4 dp4Var = new dp4();
                this.Y = dp4Var;
                if (!dp4Var.Y) {
                    if (dp4Var.Z) {
                        xr5.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    dp4Var.a();
                    dp4Var.Z = true;
                    break;
                }
                break;
            default:
                i26 i26Var = um1.a;
                this.Y = (SmallDisplaySizeQuirk) um1.a().b(SmallDisplaySizeQuirk.class);
                break;
        }
    }

    public static void B(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw p61.k(it);
        }
    }

    public static o64 G(vk1 vk1Var, int i) {
        j74 j74Var = (j74) vk1Var.Y;
        dd7 dd7VarD = yn0.D();
        gn2 gn2VarE = dd7VarD != null ? dd7VarD.e() : null;
        dd7 dd7VarP = yn0.P(dd7VarD);
        try {
            e74 e74Var = (e74) j74Var.h0.getValue();
            yn0.c0(dd7VarD, dd7VarP, gn2VarE);
            p64 p64Var = j74Var.r0;
            long j = e74Var.j;
            boolean z = j74Var.f0;
            uh3 uh3Var = new uh3(i, e74Var);
            sa2 sa2Var = p64Var.c;
            if (sa2Var == null) {
                return oy1.u0;
            }
            f63 f63Var = p64Var.b;
            ws5 ws5Var = (ws5) sa2Var.d;
            boolean z2 = ws5Var instanceof eg;
            vs5 vs5Var = new vs5(sa2Var, i, f63Var, uh3Var);
            vs5Var.f0 = new q31(j);
            if (!z2) {
                ws5Var.a(vs5Var);
            } else if (z) {
                eg egVar = (eg) ws5Var;
                egVar.Y.add(new ju5(1, vs5Var));
                if (!egVar.Z) {
                    egVar.Z = true;
                    egVar.X.post(egVar);
                }
            } else {
                eg egVar2 = (eg) ws5Var;
                egVar2.Y.add(new ju5(0, vs5Var));
                if (!egVar2.Z) {
                    egVar2.Z = true;
                    egVar2.X.post(egVar2);
                }
            }
            wa.O(i, "compose:lazy:schedule_prefetch:index");
            return vs5Var;
        } catch (Throwable th) {
            yn0.c0(dd7VarD, dd7VarP, gn2VarE);
            throw th;
        }
    }

    public m61 A(m61 m61Var) {
        return m61Var instanceof rc6 ? m61Var : new k7(-((gr4) this.Y).l(), m61Var);
    }

    public it4 C(v63 v63Var, ht4 ht4Var, ta7 ta7Var, pw6 pw6Var) {
        it4 it4Var;
        boolean zY;
        int iAbs;
        it4 it4Var2;
        kc0 kc0Var = v63Var.i;
        tr5 tr5Var = v63Var.q;
        if (kc0Var.X) {
            a86 a86VarC = ((v76) this.Y).c();
            if (a86VarC != null) {
                synchronized (a86VarC.c) {
                    try {
                        d86 d86Var = (d86) ((LinkedHashMap) ((e86) a86VarC.a.Z).Z).get(ht4Var);
                        it4Var = d86Var != null ? new it4(d86Var.a, d86Var.b) : null;
                        if (it4Var == null) {
                            b8 b8Var = a86VarC.b;
                            ArrayList arrayList = (ArrayList) ((LinkedHashMap) b8Var.c).get(ht4Var);
                            if (arrayList == null) {
                                it4Var = null;
                            } else {
                                int size = arrayList.size();
                                int i = 0;
                                while (true) {
                                    if (i >= size) {
                                        it4Var2 = null;
                                        break;
                                    }
                                    g86 g86Var = (g86) arrayList.get(i);
                                    d53 d53Var = (d53) g86Var.a.get();
                                    it4Var2 = d53Var != null ? new it4(d53Var, g86Var.b) : null;
                                    if (it4Var2 != null) {
                                        break;
                                    }
                                    i++;
                                }
                                b8Var.b();
                                it4Var = it4Var2;
                            }
                        }
                        if (it4Var != null && !it4Var.a.c()) {
                            synchronized (a86VarC.c) {
                                e86 e86Var = (e86) a86VarC.a.Z;
                                Object objRemove = ((LinkedHashMap) e86Var.Z).remove(ht4Var);
                                if (objRemove != null) {
                                    e86Var.Y = e86Var.c() - e86Var.g(ht4Var, objRemove);
                                    e86Var.b(ht4Var, objRemove, null);
                                }
                                if (objRemove != null) {
                                }
                                if (((LinkedHashMap) a86VarC.b.c).remove(ht4Var) != null) {
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                it4Var = null;
            }
            if (it4Var != null) {
                d53 d53Var2 = it4Var.a;
                d60 d60Var = d53Var2 instanceof d60 ? (d60) d53Var2 : null;
                if (d60Var == null) {
                    zY = true;
                } else {
                    Bitmap.Config config = d60Var.a.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    zY = dq.y(v63Var, config);
                }
                if (zY) {
                    String str = (String) ht4Var.b.get("coil#size");
                    if (str == null) {
                        Object obj = it4Var.b.get("coil#is_sampled");
                        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                        if ((bool != null ? bool.booleanValue() : false) || (!dh3.f(ta7Var, ta7.c) && tr5Var != tr5.Y)) {
                            int iB = d53Var2.b();
                            int iA = d53Var2.a();
                            ta7 ta7Var2 = d53Var2 instanceof d60 ? (ta7) z68.F(v63Var, y63.b) : ta7.c;
                            yo1 yo1Var = ta7Var.a;
                            int i2 = yo1Var instanceof wo1 ? ((wo1) yo1Var).a : Integer.MAX_VALUE;
                            yo1 yo1Var2 = ta7Var2.a;
                            int iMin = Math.min(i2, yo1Var2 instanceof wo1 ? ((wo1) yo1Var2).a : Integer.MAX_VALUE);
                            yo1 yo1Var3 = ta7Var.b;
                            int i3 = yo1Var3 instanceof wo1 ? ((wo1) yo1Var3).a : Integer.MAX_VALUE;
                            yo1 yo1Var4 = ta7Var2.b;
                            int iMin2 = Math.min(i3, yo1Var4 instanceof wo1 ? ((wo1) yo1Var4).a : Integer.MAX_VALUE);
                            double d = ((double) iMin) / ((double) iB);
                            double d2 = ((double) iMin2) / ((double) iA);
                            int iOrdinal = ((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? pw6.Y : pw6Var).ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal != 1) {
                                    b61.c();
                                    return null;
                                }
                                if (d < d2) {
                                    iAbs = Math.abs(iMin - iB);
                                } else {
                                    iAbs = Math.abs(iMin2 - iA);
                                    d = d2;
                                }
                            } else if (d > d2) {
                                iAbs = Math.abs(iMin - iB);
                            } else {
                                iAbs = Math.abs(iMin2 - iA);
                                d = d2;
                            }
                            if (iAbs > 1) {
                                int iOrdinal2 = tr5Var.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 != 1) {
                                        b61.c();
                                        return null;
                                    }
                                    if (d <= 1.0d) {
                                    }
                                } else if (d == 1.0d) {
                                }
                            }
                        }
                        return it4Var;
                    }
                    if (str.equals(ta7Var.toString())) {
                        return it4Var;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a2  */
    public ht4 D(v63 v63Var, Object obj, pd5 pd5Var, oy1 oy1Var) {
        String str;
        String strI;
        kc0 kc0Var = v63Var.i;
        Map map = v63Var.d;
        if (kc0Var != kc0.DISABLED) {
            List list = ((v76) this.Y).d.c;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    qg5 qg5Var = (qg5) list.get(i);
                    gg ggVar = (gg) qg5Var.X;
                    if (((zu3) qg5Var.Y).O(obj)) {
                        ggVar.getClass();
                        switch (ggVar.a) {
                            case 0:
                                dq8 dq8Var = (dq8) obj;
                                if (!dh3.f(dq8Var.c, "android.resource")) {
                                    str = null;
                                } else {
                                    Configuration configuration = pd5Var.a.getResources().getConfiguration();
                                    Bitmap.Config[] configArr = at8.a;
                                    str = dq8Var + ":" + (configuration.uiMode & 48);
                                }
                                break;
                            case 1:
                                dq8 dq8Var2 = (dq8) obj;
                                String str2 = dq8Var2.c;
                                if (!(str2 == null || str2.equals("file")) || dq8Var2.e == null) {
                                    str = null;
                                } else {
                                    Bitmap.Config[] configArr2 = at8.a;
                                    if ((dh3.f(dq8Var2.c, "file") && dh3.f(wv0.t0(rq7.j(dq8Var2)), "android_asset")) || !((Boolean) z68.G(pd5Var, y63.c)).booleanValue() || (strI = rq7.i(dq8Var2)) == null) {
                                        str = null;
                                    } else {
                                        s92 s92Var = pd5Var.f;
                                        String str3 = oi5.Y;
                                        str = dq8Var2 + "-" + s92Var.metadata(g55.r(strI)).f;
                                    }
                                }
                                break;
                            default:
                                str = ((dq8) obj).a;
                                break;
                        }
                        if (str != null) {
                        }
                    }
                    i++;
                } else {
                    str = null;
                }
            }
            if (str != null) {
                if (((List) z68.F(v63Var, y63.a)).isEmpty()) {
                    return new ht4(str, map);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("coil#size", pd5Var.b.toString());
                return new ht4(str, linkedHashMap);
            }
        }
        return null;
    }

    public void E() {
        ((tk2) this.Y).E0.R();
    }

    public void F(qf0 qf0Var) {
        if (qf0Var.b) {
            return;
        }
        xm0 xm0Var = (xm0) this.Y;
        synchronized (((ArrayList) xm0Var.Z)) {
            ((ArrayList) xm0Var.Z).remove(qf0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0168  */
    /* JADX WARN: Code duplicated, block: B:58:0x016f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0172  */
    public void H(ho2 ho2Var, StringBuilder sb) {
        String strP;
        boolean z;
        wk1 wk1Var = (wk1) this.Y;
        zk1 zk1Var = wk1Var.a;
        if (!zk1Var.A()) {
            if (!zk1Var.z()) {
                List listY = ho2Var.Y();
                listY.getClass();
                wk1Var.t(listY, sb);
                wk1Var.p(sb, ho2Var, null);
                fl1 fl1VarE = ho2Var.e();
                fl1VarE.getClass();
                wk1Var.Y(fl1VarE, sb);
                wk1Var.D(ho2Var, sb);
                if (zk1Var.t()) {
                    wk1Var.B(ho2Var, sb);
                }
                wk1Var.J(ho2Var, sb);
                if (zk1Var.t()) {
                    boolean z2 = false;
                    if (ho2Var.o()) {
                        Collection collectionQ = ho2Var.q();
                        collectionQ.getClass();
                        Collection collection = collectionQ;
                        if (!collection.isEmpty()) {
                            Iterator it = collection.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((ho2) it.next()).o()) {
                                        if (!zk1Var.l()) {
                                            z = false;
                                        }
                                    }
                                }
                            }
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    if (ho2Var.s()) {
                        Collection collectionQ2 = ho2Var.q();
                        collectionQ2.getClass();
                        Collection collection2 = collectionQ2;
                        if (!collection2.isEmpty()) {
                            Iterator it2 = collection2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((ho2) it2.next()).s()) {
                                        if (!zk1Var.l()) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                z2 = true;
                                break;
                            }
                        }
                        z2 = true;
                        break;
                    }
                    wk1Var.E(sb, ho2Var.F(), "tailrec");
                    wk1Var.E(sb, ho2Var.h(), "suspend");
                    wk1Var.E(sb, ho2Var.i(), "inline");
                    wk1Var.E(sb, z2, "infix");
                    wk1Var.E(sb, z, "operator");
                } else {
                    wk1Var.E(sb, ho2Var.h(), "suspend");
                }
                wk1Var.A(ho2Var, sb);
                if (zk1Var.D()) {
                    if (ho2Var.c0()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (ho2Var.h0()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(wk1Var.z("fun"));
            sb.append(" ");
            List typeParameters = ho2Var.getTypeParameters();
            typeParameters.getClass();
            wk1Var.U(sb, typeParameters, true);
            wk1Var.M(ho2Var, sb);
        }
        wk1Var.G(ho2Var, sb, true);
        List listL = ho2Var.L();
        listL.getClass();
        wk1Var.X(sb, listL, ho2Var.z());
        wk1Var.N(ho2Var, sb);
        t14 t14VarJ = ho2Var.j();
        mj0 mj0Var = zk1Var.l;
        nw3[] nw3VarArr = zk1.Z;
        nw3 nw3Var = nw3VarArr[10];
        mj0Var.getClass();
        nw3Var.getClass();
        if (!((Boolean) mj0Var.Y).booleanValue()) {
            mj0 mj0Var2 = zk1Var.k;
            nw3 nw3Var2 = nw3VarArr[9];
            mj0Var2.getClass();
            nw3Var2.getClass();
            if (((Boolean) mj0Var2.Y).booleanValue() || t14VarJ == null) {
                sb.append(": ");
                if (t14VarJ == null) {
                    strP = "[NULL]";
                } else {
                    strP = wk1Var.P(t14VarJ);
                }
                sb.append(strP);
            } else {
                v15 v15Var = zz3.e;
                if (!zz3.E(t14VarJ, tg7.d)) {
                    sb.append(": ");
                    if (t14VarJ == null) {
                        strP = "[NULL]";
                    } else {
                        strP = wk1Var.P(t14VarJ);
                    }
                    sb.append(strP);
                }
            }
        }
        List typeParameters2 = ho2Var.getTypeParameters();
        typeParameters2.getClass();
        wk1Var.Z(typeParameters2, sb);
    }

    public void I(cx5 cx5Var, StringBuilder sb, String str) {
        wk1 wk1Var = (wk1) this.Y;
        int iOrdinal = wk1Var.a.w().ordinal();
        if (iOrdinal == 0) {
            wk1Var.B(cx5Var, sb);
            sb.append(str.concat(" for "));
            wk1Var.L(cx5Var.l0, sb);
        } else if (iOrdinal == 1) {
            H(cx5Var, sb);
        } else {
            if (iOrdinal == 2) {
                return;
            }
            b61.c();
        }
    }

    @Override // defpackage.d91
    public Iterable a(Object obj) {
        us3 us3Var = (us3) this.Y;
        Collection collectionC = ((sx4) obj).l().c();
        collectionC.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionC.iterator();
        while (it.hasNext()) {
            ot0 ot0VarX = ((t14) it.next()).n0().x();
            sx4 sx4VarA = null;
            ot0 ot0VarA = ot0VarX != null ? ot0VarX.a() : null;
            sx4 sx4Var = ot0VarA instanceof sx4 ? (sx4) ot0VarA : null;
            if (sx4Var != null && (sx4VarA = us3Var.a(sx4Var)) == null) {
                sx4VarA = sx4Var;
            }
            if (sx4VarA != null) {
                arrayList.add(sx4VarA);
            }
        }
        return arrayList;
    }

    @Override // defpackage.vu, defpackage.zn2
    public xb4 apply(Object obj) {
        return vr3.H(((zn2) this.Y).apply(obj));
    }

    @Override // defpackage.xo2
    public void b(Object obj) {
    }

    @Override // defpackage.j6
    public void c(Object obj) {
        i6 i6Var = (i6) obj;
        ml2 ml2Var = (ml2) this.Y;
        il2 il2Var = (il2) ml2Var.F.pollLast();
        if (il2Var == null) {
            return;
        }
        String str = il2Var.X;
        int i = il2Var.Y;
        qk2 qk2VarA = ml2Var.c.A(str);
        if (qk2VarA == null) {
            return;
        }
        qk2VarA.w(i, i6Var.X, i6Var.Y);
    }

    @Override // defpackage.id1
    public Object d(hx5 hx5Var, Object obj) {
        I(hx5Var, (StringBuilder) obj, "getter");
        return dn8.a;
    }

    @Override // defpackage.id1
    public Object e(ot8 ot8Var, Object obj) {
        ((wk1) this.Y).W(ot8Var, true, (StringBuilder) obj, true);
        return dn8.a;
    }

    @Override // defpackage.id1
    public Object f(k3 k3Var, Object obj) {
        ((wk1) this.Y).S(k3Var, (StringBuilder) obj, true);
        return dn8.a;
    }

    @Override // defpackage.id1
    public Object g(i44 i44Var, Object obj) {
        ((StringBuilder) obj).append(i44Var.getName());
        return dn8.a;
    }

    @Override // defpackage.id1
    public Object h(tx5 tx5Var, Object obj) {
        I(tx5Var, (StringBuilder) obj, "setter");
        return dn8.a;
    }

    @Override // defpackage.d61
    public void i(u23 u23Var, List list) {
        t23 t23Var;
        u23Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c61 c61Var = (c61) it.next();
            c61Var.getClass();
            arrayList.add(c61Var.a(true));
        }
        Map<String, List<String>> mapSingletonMap = Collections.singletonMap("Set-Cookie", arrayList);
        mapSingletonMap.getClass();
        try {
            ((CookieHandler) this.Y).put(u23Var.f(), mapSingletonMap);
        } catch (IOException e) {
            lo5 lo5Var = lo5.a;
            lo5 lo5Var2 = lo5.a;
            StringBuilder sb = new StringBuilder("Saving cookies failed for ");
            try {
                t23Var = new t23((byte) 0);
                t23Var.f(u23Var, "/...");
            } catch (IllegalArgumentException unused) {
                t23Var = null;
            }
            u23 u23VarB = t23Var != null ? t23Var.b() : null;
            u23VarB.getClass();
            sb.append(u23VarB);
            String string = sb.toString();
            lo5Var2.getClass();
            lo5.i(string, 5, e);
        }
    }

    @Override // defpackage.id1
    public Object j(n74 n74Var, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        wk1 wk1Var = (wk1) this.Y;
        wk1Var.getClass();
        fk2 fk2Var = n74Var.h0;
        sb.append(wk1Var.z("package"));
        gk2 gk2Var = fk2Var.a;
        gk2Var.getClass();
        String strL = wk1Var.l(os4.I(gk2.f(gk2Var)));
        if (strL.length() > 0) {
            sb.append(" ");
            sb.append(strL);
        }
        if (wk1Var.a.p()) {
            sb.append(" in context of ");
            wk1Var.G(n74Var.g0, sb, false);
        }
        return dn8.a;
    }

    @Override // defpackage.id1
    public Object k(km1 km1Var, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        wk1 wk1Var = (wk1) this.Y;
        wk1Var.getClass();
        wk1Var.p(sb, km1Var, null);
        fl1 fl1Var = km1Var.j0;
        fl1Var.getClass();
        wk1Var.Y(fl1Var, sb);
        wk1Var.B(km1Var, sb);
        sb.append(wk1Var.z("typealias"));
        sb.append(" ");
        wk1Var.G(km1Var, sb, true);
        wk1Var.U(sb, km1Var.k0(), false);
        wk1Var.r(km1Var, sb);
        sb.append(" = ");
        sb.append(wk1Var.P(km1Var.J0()));
        return dn8.a;
    }

    @Override // defpackage.id1
    public Object l(wx4 wx4Var, Object obj) {
        ((wk1) this.Y).G(wx4Var, (StringBuilder) obj, true);
        return dn8.a;
    }

    @Override // defpackage.id1
    public Object n(gx5 gx5Var, Object obj) {
        ((wk1) this.Y).L(gx5Var, (StringBuilder) obj);
        return dn8.a;
    }

    @Override // defpackage.id1
    public /* bridge */ /* synthetic */ Object o(ho2 ho2Var, Object obj) {
        H(ho2Var, (StringBuilder) obj);
        return dn8.a;
    }

    @Override // defpackage.vo1
    public boolean p(float f) {
        if (f == 0.0f) {
            return false;
        }
        x();
        ((NestedScrollView) this.Y).j((int) f);
        return true;
    }

    @Override // defpackage.id1
    public Object q(sx4 sx4Var, Object obj) throws IOException {
        gs0 gs0VarT0;
        String str;
        StringBuilder sb = (StringBuilder) obj;
        wk1 wk1Var = (wk1) this.Y;
        zk1 zk1Var = wk1Var.a;
        byte b = 1;
        boolean z = sx4Var.g0() == us0.f0;
        if (!zk1Var.A()) {
            List listF0 = sx4Var.f0();
            listF0.getClass();
            wk1Var.t(listF0, sb);
            wk1Var.p(sb, sx4Var, null);
            if (!z) {
                fl1 fl1VarE = sx4Var.e();
                fl1VarE.getClass();
                wk1Var.Y(fl1VarE, sb);
            }
            if ((sx4Var.g0() != us0.Y || sx4Var.m() != fx4.g0) && (!sx4Var.g0().a() || sx4Var.m() != fx4.Y)) {
                fx4 fx4VarM = sx4Var.m();
                fx4VarM.getClass();
                wk1Var.C(fx4VarM, sb, wk1.m(sx4Var));
            }
            wk1Var.B(sx4Var, sb);
            wk1Var.E(sb, zk1Var.u().contains(xk1.j0) && sx4Var.n(), "inner");
            wk1Var.E(sb, zk1Var.u().contains(xk1.l0) && sx4Var.w0(), "data");
            wk1Var.E(sb, zk1Var.u().contains(xk1.m0) && sx4Var.i(), "inline");
            wk1Var.E(sb, zk1Var.u().contains(xk1.s0) && sx4Var.y0(), "value");
            wk1Var.E(sb, zk1Var.u().contains(xk1.r0) && sx4Var.x0(), "fun");
            if (sx4Var.v0()) {
                str = "companion object";
            } else {
                int iOrdinal = sx4Var.g0().ordinal();
                if (iOrdinal == 0) {
                    str = "class";
                } else if (iOrdinal == 1) {
                    str = "interface";
                } else if (iOrdinal == 2) {
                    str = "enum class";
                } else if (iOrdinal == 3) {
                    str = "enum entry";
                } else if (iOrdinal == 4) {
                    str = "annotation class";
                } else {
                    if (iOrdinal != 5) {
                        b61.c();
                        return null;
                    }
                    str = "object";
                }
            }
            sb.append(wk1Var.z(str));
        }
        if (bl1.k(sx4Var)) {
            mj0 mj0Var = zk1Var.G;
            nw3 nw3Var = zk1.Z[31];
            mj0Var.getClass();
            nw3Var.getClass();
            if (((Boolean) mj0Var.Y).booleanValue()) {
                if (zk1Var.A()) {
                    sb.append("companion object");
                }
                wk1.O(sb);
                ed1 ed1VarP = sx4Var.p();
                if (ed1VarP != null) {
                    sb.append("of ");
                    v15 name = ed1VarP.getName();
                    name.getClass();
                    sb.append(wk1Var.F(name, false));
                }
            }
            if (zk1Var.D() || !dh3.f(sx4Var.getName(), hf7.b)) {
                if (!zk1Var.A()) {
                    wk1.O(sb);
                }
                v15 name2 = sx4Var.getName();
                name2.getClass();
                sb.append(wk1Var.F(name2, true));
            }
        } else {
            if (!zk1Var.A()) {
                wk1.O(sb);
            }
            wk1Var.G(sx4Var, sb, true);
        }
        if (!z) {
            List listK0 = sx4Var.k0();
            listK0.getClass();
            wk1Var.U(sb, listK0, false);
            wk1Var.r(sx4Var, sb);
            if (!sx4Var.g0().a()) {
                mj0 mj0Var2 = zk1Var.i;
                nw3 nw3Var2 = zk1.Z[7];
                mj0Var2.getClass();
                nw3Var2.getClass();
                if (((Boolean) mj0Var2.Y).booleanValue() && (gs0VarT0 = sx4Var.t0()) != null) {
                    sb.append(" ");
                    wk1Var.p(sb, gs0VarT0, null);
                    fl1 fl1VarE2 = gs0VarT0.e();
                    fl1VarE2.getClass();
                    wk1Var.Y(fl1VarE2, sb);
                    sb.append(wk1Var.z("constructor"));
                    List listL = gs0VarT0.L();
                    listL.getClass();
                    wk1Var.X(sb, listL, gs0VarT0.z());
                }
            }
            mj0 mj0Var3 = zk1Var.x;
            nw3 nw3Var3 = zk1.Z[22];
            mj0Var3.getClass();
            nw3Var3.getClass();
            if (!((Boolean) mj0Var3.Y).booleanValue() && !zz3.F(sx4Var.X())) {
                Collection collectionC = sx4Var.l().c();
                collectionC.getClass();
                if (!collectionC.isEmpty() && (collectionC.size() != 1 || !zz3.y((t14) collectionC.iterator().next()))) {
                    wk1.O(sb);
                    sb.append(": ");
                    wv0.x0(collectionC, sb, ", ", null, null, new uk1(wk1Var, b), 60);
                }
            }
            wk1Var.Z(listK0, sb);
        }
        return dn8.a;
    }

    @Override // defpackage.jh4
    public void r(String str, DnsTTLogType dnsTTLogType) {
        dnsTTLogType.getClass();
        ((vr1) this.Y).c(str, false);
    }

    @Override // defpackage.id1
    public Object s(uf5 uf5Var, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        wk1 wk1Var = (wk1) this.Y;
        wk1Var.getClass();
        fk2 fk2Var = uf5Var.i0;
        sb.append(wk1Var.z("package-fragment"));
        gk2 gk2Var = fk2Var.a;
        gk2Var.getClass();
        String strL = wk1Var.l(os4.I(gk2.f(gk2Var)));
        if (strL.length() > 0) {
            sb.append(" ");
            sb.append(strL);
        }
        if (wk1Var.a.p()) {
            sb.append(" in ");
            wk1Var.G(uf5Var.p(), sb, false);
        }
        return dn8.a;
    }

    @Override // defpackage.d61
    public List t(u23 u23Var) {
        t23 t23Var;
        String strSubstring;
        d02 d02Var = d02.X;
        u23Var.getClass();
        try {
            Map<String, List<String>> map = ((CookieHandler) this.Y).get(u23Var.f(), e02.X);
            map.getClass();
            ArrayList arrayList = null;
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if ("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                    value.getClass();
                    if (value.isEmpty()) {
                        continue;
                    } else {
                        for (String str : value) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            str.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            int length = str.length();
                            int i = 0;
                            while (i < length) {
                                int iF = ks8.f(str, ";,", i, length);
                                int iE = ks8.e(str, '=', i, iF);
                                int iL = ks8.l(str, i, iE);
                                String strSubstring2 = str.substring(iL, ks8.m(str, iL, iE));
                                if (!mm7.Z(strSubstring2, false, "$")) {
                                    if (iE < iF) {
                                        int iL2 = ks8.l(str, iE + 1, iF);
                                        strSubstring = str.substring(iL2, ks8.m(str, iL2, iF));
                                    } else {
                                        strSubstring = _UrlKt.FRAGMENT_ENCODE_SET;
                                    }
                                    if (mm7.Z(strSubstring, false, "\"") && mm7.R(strSubstring, false, "\"")) {
                                        strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                                    }
                                    if (!dh3.f(fm7.R0(strSubstring2).toString(), strSubstring2)) {
                                        bt.q("name is not trimmed");
                                        return null;
                                    }
                                    if (!dh3.f(fm7.R0(strSubstring).toString(), strSubstring)) {
                                        bt.q("value is not trimmed");
                                        return null;
                                    }
                                    String str2 = u23Var.d;
                                    str2.getClass();
                                    String strU = nr4.U(str2);
                                    if (strU == null) {
                                        bt.q("unexpected domain: ".concat(str2));
                                        return null;
                                    }
                                    arrayList2.add(new c61(strSubstring2, strSubstring, DateFormattingKt.MAX_DATE, strU, "/", false, false, false, false));
                                }
                                i = iF + 1;
                            }
                            arrayList.addAll(arrayList2);
                        }
                    }
                }
            }
            if (arrayList == null) {
                return d02Var;
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
            return listUnmodifiableList;
        } catch (IOException e) {
            lo5 lo5Var = lo5.a;
            lo5 lo5Var2 = lo5.a;
            StringBuilder sb = new StringBuilder("Loading cookies failed for ");
            try {
                t23Var = new t23((byte) 0);
                t23Var.f(u23Var, "/...");
            } catch (IllegalArgumentException unused) {
                t23Var = null;
            }
            u23 u23VarB = t23Var != null ? t23Var.b() : null;
            u23VarB.getClass();
            sb.append(u23VarB);
            String string = sb.toString();
            lo5Var2.getClass();
            lo5.i(string, 5, e);
            return d02Var;
        }
    }

    public String toString() {
        switch (this.X) {
            case 15:
                return "HmacSHA256";
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                StringBuilder sb = new StringBuilder();
                v44 v44Var = (v44) this.Y;
                sb.append(v44Var);
                sb.append(": ");
                sb.append(((Map) hi5.e0(v44Var.m0, v44.q0[0])).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.xo2
    public void u(Throwable th) {
        ((q53) this.Y).close();
    }

    @Override // defpackage.vo1
    public float w() {
        return -((NestedScrollView) this.Y).getVerticalScrollFactorCompat();
    }

    @Override // defpackage.vo1
    public void x() {
        ((NestedScrollView) this.Y).i0.abortAnimation();
    }

    @Override // defpackage.is0
    public hs0 y(qs0 qs0Var) {
        hs0 hs0VarY;
        qs0Var.getClass();
        wf5 wf5Var = (wf5) this.Y;
        fk2 fk2Var = qs0Var.a;
        fk2Var.getClass();
        ArrayList<tf5> arrayList = new ArrayList();
        wf5Var.b(fk2Var, arrayList);
        for (tf5 tf5Var : arrayList) {
            if ((tf5Var instanceof oa0) && (hs0VarY = ((oa0) tf5Var).m0.y(qs0Var)) != null) {
                return hs0VarY;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    @Override // defpackage.id1
    public Object z(gs0 gs0Var, Object obj) {
        boolean z;
        gs0 gs0VarT0;
        boolean z2 = gs0Var.H0;
        StringBuilder sb = (StringBuilder) obj;
        wk1 wk1Var = (wk1) this.Y;
        wk1Var.getClass();
        wk1Var.p(sb, gs0Var, null);
        zk1 zk1Var = wk1Var.a;
        if (zk1Var.x() || gs0Var.R0().m() != fx4.Z) {
            fl1 fl1VarE = gs0Var.e();
            fl1VarE.getClass();
            if (wk1Var.Y(fl1VarE, sb)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        wk1Var.A(gs0Var, sb);
        mj0 mj0Var = zk1Var.P;
        nw3[] nw3VarArr = zk1.Z;
        nw3 nw3Var = nw3VarArr[40];
        mj0Var.getClass();
        nw3Var.getClass();
        boolean z3 = ((Boolean) mj0Var.Y).booleanValue() || !z2 || z;
        if (z3) {
            sb.append(wk1Var.z("constructor"));
        }
        sx4 sx4VarS0 = gs0Var.p();
        sx4VarS0.getClass();
        if (zk1Var.y()) {
            if (z3) {
                sb.append(" ");
            }
            wk1Var.G(sx4VarS0, sb, true);
            wk1Var.U(sb, gs0Var.getTypeParameters(), false);
        }
        List listL = gs0Var.L();
        listL.getClass();
        wk1Var.X(sb, listL, gs0Var.z());
        mj0 mj0Var2 = zk1Var.q;
        nw3 nw3Var2 = nw3VarArr[15];
        mj0Var2.getClass();
        nw3Var2.getClass();
        if (((Boolean) mj0Var2.Y).booleanValue() && !z2 && (gs0VarT0 = sx4VarS0.t0()) != null) {
            List listL2 = gs0VarT0.L();
            listL2.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listL2) {
                ot8 ot8Var = (ot8) obj2;
                if (!ot8Var.I0() && ot8Var.n0 == null) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" : ");
                sb.append(wk1Var.z("this"));
                sb.append(wv0.y0(arrayList, ", ", "(", ")", ag.E0, 24));
            }
        }
        if (zk1Var.y()) {
            wk1Var.Z(gs0Var.getTypeParameters(), sb);
        }
        return dn8.a;
    }

    public /* synthetic */ vk1(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    public /* synthetic */ vk1(byte b, boolean z) {
        this.X = b;
    }

    public vk1(v76 v76Var, dq dqVar) {
        this.X = (byte) 28;
        this.Y = v76Var;
    }

    public vk1(CookieManager cookieManager) {
        this.X = (byte) 18;
        cookieManager.getClass();
        this.Y = cookieManager;
    }

    public vk1(String str) {
        this.X = (byte) 15;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (bytes != null) {
            this.Y = Arrays.copyOf(bytes, bytes.length);
        } else {
            bt.q("The Secret cannot be null");
            throw null;
        }
    }

    public vk1(TextView textView) {
        this.X = (byte) 7;
        this.Y = new pz1(textView);
    }

    public vk1(EditText editText) {
        this.X = (byte) 6;
        this.Y = new mj0(editText);
    }

    public vk1(Context context, ComponentName componentName, fu6 fu6Var) {
        this.X = (byte) 27;
        if (Build.VERSION.SDK_INT >= 26) {
            this.Y = new fs4(context, componentName, fu6Var);
        } else {
            this.Y = new es4(context, componentName, fu6Var);
        }
    }
}

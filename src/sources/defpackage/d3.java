package defpackage;

import android.view.Choreographer;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.feature.main.MainViewModel;
import su.happ.proxyutility.service.SubscriptionUpdater$UpdateTask;
import su.happ.proxyutility.service.SubscriptionUpdater$UpdateTask$isUiAlive$2$1$receiver$1;

/* JADX INFO: loaded from: classes.dex */
public final class d3 implements gn2 {
    public final /* synthetic */ byte X;
    public final Object Y;
    public final Object Z;

    public /* synthetic */ d3(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gn2
    public final Object B(Object obj) {
        ql3 ql3Var;
        mh8 mh8VarP0;
        di7 di7Var;
        long j;
        Class<?> cls;
        vk1 vk1VarC;
        Class<?> cls2;
        String str;
        byte b = 2;
        int i = 0;
        switch (this.X) {
            case 0:
                rh8 rh8Var = (rh8) this.Y;
                ql3[] ql3VarArr = (ql3[]) this.Z;
                int iIntValue = ((Number) obj).intValue();
                if (rh8Var == null || (ql3Var = (ql3) rh8Var.a.get(Integer.valueOf(iIntValue))) == null) {
                    return (iIntValue < 0 || iIntValue >= ql3VarArr.length) ? ql3.f : ql3VarArr[iIntValue];
                }
                return ql3Var;
            case 1:
                w39 w39Var = (w39) this.Y;
                xi8 xi8Var = (xi8) this.Z;
                e3 e3Var = (e3) obj;
                e3Var.getClass();
                x14 x14Var = e3Var.a;
                if ((w39Var.R() && x14Var != null && xi8Var.m(x14Var)) || x14Var == null || (mh8VarP0 = xi8Var.p0(x14Var)) == null) {
                    return null;
                }
                int iZ = xi8Var.Z(mh8VarP0);
                ArrayList arrayList = new ArrayList(iZ);
                while (i < iZ) {
                    ji8 ji8VarH0 = xi8Var.h0(mh8VarP0, i);
                    x14 x14VarP = xi8Var.p(xi8Var.A0(x14Var, i));
                    rl3 rl3Var = e3Var.b;
                    arrayList.add(x14VarP == null ? new e3(null, rl3Var, ji8VarH0) : new e3(x14VarP, e0.b(w39Var.A(), rl3Var, w39Var.B(x14VarP)), ji8VarH0));
                    i++;
                }
                return arrayList;
            case 2:
                wd3 wd3Var = (wd3) this.Y;
                synchronized (wd3Var.c) {
                    try {
                        wd3Var.e = true;
                        c15 c15Var = wd3Var.d;
                        Object[] objArr = c15Var.X;
                        int i2 = c15Var.Z;
                        while (i < i2) {
                            i75 i75Var = (i75) ((b09) objArr[i]).get();
                            if (i75Var != null && (di7Var = i75Var.b) != null) {
                                di7Var.closeConnection();
                                i75Var.b = null;
                            }
                            i++;
                        }
                        wd3Var.d.g();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                o78 o78Var = ((rf) this.Z).Y;
                o78Var.b.set(null);
                q78 q78Var = o78Var.a;
                q78Var.getClass();
                q78Var.a(p78.Y);
                return dn8.a;
            case 3:
                yh yhVar = (yh) this.Y;
                zh zhVar = (zh) this.Z;
                synchronized (yhVar.g0) {
                    yhVar.i0.remove(zhVar);
                }
                return dn8.a;
            case 4:
                ((Choreographer) ((ai) this.Y).Y).removeFrameCallback((zh) this.Z);
                return dn8.a;
            case 5:
                KeyEvent keyEvent = ((cx3) obj).a;
                y05 y05Var = (y05) this.Z;
                if (!((jc8) this.Y).b()) {
                    y05Var.setValue(Boolean.FALSE);
                }
                return Boolean.FALSE;
            case 6:
                z47 z47Var = (z47) this.Y;
                vl1 vl1Var = (vl1) this.Z;
                jl1 jl1Var = vl1Var.n0;
                v15 v15Var = (v15) obj;
                v15Var.getClass();
                qy5 qy5Var = (qy5) ((LinkedHashMap) z47Var.Y).get(v15Var);
                if (qy5Var != null) {
                    return q22.B0(((hl1) jl1Var.X).a, vl1Var, v15Var, (te4) z47Var.f0, new ll1(((hl1) jl1Var.X).a, new c3((Object) vl1Var, (Object) qy5Var, (byte) 11)), ke7.G);
                }
                return null;
            case 7:
                id7 id7Var = (id7) obj;
                synchronized (kd7.c) {
                    j = kd7.e;
                    kd7.e = 1 + j;
                }
                return new x05(j, id7Var, (gn2) this.Y, (gn2) this.Z);
            case 8:
                vk3 vk3Var = (vk3) this.Y;
                ev3 ev3Var = (ev3) this.Z;
                String str2 = (String) obj;
                str2.getClass();
                if (vk3Var.getName().equals(str2)) {
                    return i21.K(vk3Var);
                }
                List listW = gv3.w(ev3Var);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listW) {
                    if (((vk3) obj2).getName().equals(str2)) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            case 9:
                sa2 sa2Var = (sa2) this.Y;
                Object obj3 = sa2Var.a;
                mm0 mm0Var = (mm0) this.Z;
                synchronized (obj3) {
                    ((ArrayList) sa2Var.c).remove(mm0Var);
                }
                return dn8.a;
            case 10:
                t44 t44Var = (t44) this.Y;
                z47 z47Var2 = (z47) this.Z;
                v15 v15Var2 = (v15) obj;
                v15Var2.getClass();
                te4 te4Var = t44Var.r;
                sx4 sx4Var = t44Var.n;
                if (!((Set) te4Var.invoke()).contains(v15Var2)) {
                    if (!((Set) t44Var.s.invoke()).contains(v15Var2)) {
                        za6 za6Var = (za6) ((Map) t44Var.t.invoke()).get(v15Var2);
                        if (za6Var == null) {
                            return null;
                        }
                        ve4 ve4Var = (ve4) ((c6) z47Var2.Y).f0;
                        return q22.B0(ve4Var, t44Var.n, v15Var2, new te4(ve4Var, new r44(t44Var, b)), hi5.w0(z47Var2, za6Var), lh4.Z0(za6Var));
                    }
                    gb4 gb4VarR = i21.r();
                    sx4Var.getClass();
                    z47Var2.getClass();
                    gb4 gb4VarJ = i21.j(gb4VarR);
                    int iA = gb4VarJ.a();
                    if (iA == 0) {
                        return null;
                    }
                    if (iA == 1) {
                        return (sx4) wv0.O0(gb4VarJ);
                    }
                    xw3.s(gb4VarJ, "Multiple classes with same name are generated: ");
                    return null;
                }
                lr5 lr5Var = (lr5) ((c6) z47Var2.Y).Y;
                qs0 qs0VarF = el1.f(sx4Var);
                qs0VarF.getClass();
                qs0 qs0VarD = qs0VarF.d(v15Var2);
                fk2 fk2Var = qs0VarD.a;
                String strX = mm7.X(qs0VarD.b.a.a, '.', '$');
                if (!fk2Var.a.c()) {
                    strX = fk2Var.a.a + '.' + strX;
                }
                try {
                    cls = Class.forName(strX, false, (ClassLoader) lr5Var.Y);
                    break;
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                ta6 ta6Var = cls != null ? new ta6(cls) : null;
                if (ta6Var != null) {
                    return new p44(z47Var2, sx4Var, ta6Var, null);
                }
                return null;
            case 11:
                q97 q97Var = (q97) this.Y;
                t44 t44Var2 = (t44) this.Z;
                v15 v15Var3 = (v15) obj;
                v15Var3.getClass();
                return dh3.f(q97Var.getName(), v15Var3) ? i21.K(q97Var) : wv0.H0(t44Var2.N(v15Var3), t44Var2.O(v15Var3));
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                b54 b54Var = (b54) this.Y;
                z47 z47Var3 = b54Var.b;
                z47 z47Var4 = (z47) this.Z;
                x44 x44Var = (x44) obj;
                x44Var.getClass();
                v44 v44Var = b54Var.o;
                fk2 fk2Var2 = v44Var.i0;
                v15 v15Var4 = x44Var.a;
                fk2Var2.getClass();
                gk2 gk2Var = fk2Var2.a;
                v15Var4.getClass();
                fk2 fk2Var3 = fk2.c;
                gk2 gk2Var2 = wl7.h0(v15Var4).a;
                gk2Var2.c();
                String str3 = gk2Var2.a;
                ta6 ta6Var2 = x44Var.b;
                c6 c6Var = (c6) z47Var4.Y;
                if (ta6Var2 != null) {
                    y45 y45Var = (y45) c6Var.i0;
                    ((zl1) ((c6) z47Var3.Y).j0).c().c.getClass();
                    hv4.g.getClass();
                    fk2 fk2VarC = ta6Var2.c();
                    vk1VarC = (fk2VarC == null || (str = fk2VarC.a.a) == null) ? null : y45Var.C(str);
                } else {
                    y45 y45Var2 = (y45) c6Var.i0;
                    ((zl1) ((c6) z47Var3.Y).j0).c().c.getClass();
                    hv4.g.getClass();
                    String strX2 = mm7.X(str3, '.', '$');
                    if (!gk2Var.c()) {
                        strX2 = fk2Var2 + '.' + strX2;
                    }
                    vk1VarC = y45Var2.C(strX2);
                }
                qb6 qb6Var = vk1VarC != null ? (qb6) vk1VarC.Y : null;
                qs0 qs0VarA = qb6Var != null ? ia6.a(qb6Var.a) : null;
                if (qs0VarA != null && (qs0VarA.g() || qs0VarA.c)) {
                    return null;
                }
                mb6 y44Var = z44.j0;
                if (qb6Var != null) {
                    if (qb6Var.b.a == a04.CLASS) {
                        zl1 zl1Var = (zl1) ((c6) z47Var3.Y).j0;
                        hs0 hs0VarG = zl1Var.g(qb6Var);
                        sx4 sx4VarA = hs0VarG == null ? null : zl1Var.c().t.a(ia6.a(qb6Var.a), hs0VarG);
                        if (sx4VarA != null) {
                            y44Var = new y44(sx4VarA);
                        }
                    } else {
                        y44Var = a54.j0;
                    }
                }
                if (y44Var instanceof y44) {
                    return ((y44) y44Var).j0;
                }
                if (y44Var instanceof a54) {
                    return null;
                }
                if (!(y44Var instanceof z44)) {
                    b61.c();
                    return null;
                }
                if (ta6Var2 == null) {
                    lr5 lr5Var2 = (lr5) c6Var.Y;
                    String strX3 = mm7.X(str3, '.', '$');
                    if (!gk2Var.c()) {
                        strX3 = gk2Var.a + '.' + strX3;
                    }
                    try {
                        cls2 = Class.forName(strX3, false, (ClassLoader) lr5Var2.Y);
                    } catch (ClassNotFoundException unused2) {
                        cls2 = null;
                    }
                    ta6Var2 = cls2 != null ? new ta6(cls2) : null;
                    break;
                }
                fk2 fk2VarC2 = ta6Var2 != null ? ta6Var2.c() : null;
                if (fk2VarC2 == null || fk2VarC2.a.c() || !fk2VarC2.b().equals(v44Var.i0)) {
                    return null;
                }
                return new p44(z47Var4, v44Var, ta6Var2, null);
            case 13:
                ux0 ux0Var = (ux0) this.Y;
                dj4 dj4Var = (dj4) this.Z;
                if (ux0Var == dj4Var.h) {
                    dj4Var.h = null;
                }
                return dn8.a;
            case 14:
                String value = ((SubId) obj).getValue();
                value.getClass();
                MainViewModel mainViewModel = (MainViewModel) this.Y;
                String str4 = ((vm4) ((wm4) this.Z)).a;
                mainViewModel.getClass();
                str4.getClass();
                jm4.Q(zw8.a(mainViewModel), null, new jo4(null, str4, value, mainViewModel), 3);
                mainViewModel.v();
                return dn8.a;
            case 15:
                ld0 ld0Var = (ld0) obj;
                z51 z51Var = (z51) this.Y;
                ld0 ld0Var2 = (ld0) this.Z;
                ld0Var.getClass();
                z51Var.u(ld0Var2, ld0Var);
                return dn8.a;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                String value2 = ((SubId) obj).getValue();
                pv3 pv3Var = (pv3) this.Y;
                value2.getClass();
                int iOrdinal = ((sn6) ((lh7) this.Z).getValue()).f.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        ((gn2) pv3Var).B(new go6(value2));
                    } else {
                        if (iOrdinal != 2) {
                            b61.c();
                            return null;
                        }
                        ((gn2) pv3Var).B(new oo6(value2));
                    }
                }
                ((gn2) pv3Var).B(mo6.a);
                return dn8.a;
            case 17:
                try {
                    ((SubscriptionUpdater$UpdateTask) this.Y).a.unregisterReceiver((SubscriptionUpdater$UpdateTask$isUiAlive$2$1$receiver$1) this.Z);
                    break;
                } catch (IllegalArgumentException unused3) {
                }
                return dn8.a;
            case 18:
                ((kd8) this.Y).a.h.j((lh) this.Z);
                return dn8.a;
            default:
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof r49) {
                    ((ec4) this.Y).d(((r49) th2).X);
                }
                ((xb4) this.Z).cancel(false);
                return dn8.a;
        }
    }
}

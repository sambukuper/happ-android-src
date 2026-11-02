package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Size;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.messaging.EnhancedIntentService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;

    public /* synthetic */ j0(cx1 cx1Var, px1 px1Var, qd0 qd0Var) {
        this.X = (byte) 9;
        Map map = Collections.EMPTY_MAP;
        this.Y = cx1Var;
        this.Z = px1Var;
        this.f0 = qd0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        aj0 aj0Var;
        qc4 qc4VarB;
        s39 s39VarB;
        ArrayList arrayList;
        byte b = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        boolean z = false;
        zC = false;
        boolean zC = false;
        Object obj = null;
        Object[] objArr = 0;
        Object obj2 = null;
        boolean zBooleanValue = true;
        char c = 1;
        char c2 = 1;
        switch (this.X) {
            case 0:
                Throwable th = (Throwable) this.Y;
                k0 k0Var = (k0) this.Z;
                List list = (List) this.f0;
                if (th != null) {
                    k0Var.b.onError(th);
                    return;
                } else {
                    k0Var.b.a(list);
                    return;
                }
            case 1:
                ch chVar = (ch) this.Y;
                ah ahVar = (ah) this.Z;
                bh bhVar = (bh) this.f0;
                ActionMode actionModeStartActionMode = chVar.a.startActionMode(new ve2(ahVar), 1);
                chVar.h = actionModeStartActionMode;
                if (actionModeStartActionMode == null) {
                    bhVar.close();
                    return;
                }
                return;
            case 2:
                ((xg0) this.Y).b(wg0.c((te6) this.Z), (de) this.f0);
                return;
            case 3:
                ((xg0) this.Y).c(wg0.c((te6) this.Z), (ra) this.f0);
                return;
            case 4:
                ArrayList arrayList2 = (ArrayList) this.Y;
                v85 v85Var = (v85) this.Z;
                String str = (String) this.f0;
                try {
                    for (Object obj3 : arrayList2) {
                        if (dh3.f(((aj0) obj3).e(), str)) {
                            obj = obj3;
                            aj0Var = (aj0) obj;
                            if (aj0Var != null || (qc4VarB = aj0Var.b()) == null) {
                                return;
                            }
                            qc4VarB.i(v85Var);
                            return;
                        }
                    }
                    aj0Var = (aj0) obj;
                    if (aj0Var != null) {
                        return;
                    } else {
                        return;
                    }
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 5:
                of1 of1Var = (of1) this.Y;
                qz qzVar = (qz) this.Z;
                String str2 = qzVar.a;
                jy jyVar = (jy) this.f0;
                of1Var.getClass();
                Logger logger = of1.f;
                try {
                    se8 se8VarA = of1Var.c.a(str2);
                    if (se8VarA == null) {
                        String str3 = "Transport backend '" + str2 + "' is not registered";
                        logger.warning(str3);
                        new IllegalArgumentException(str3);
                    } else {
                        of1Var.e.C(new mf1(of1Var, qzVar, ((so0) se8VarA).a(jyVar), b));
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    return;
                }
            case 6:
                ViewGroup viewGroup = (ViewGroup) this.Y;
                View view = (View) this.Z;
                ag1 ag1Var = (ag1) this.f0;
                viewGroup.endViewTransition(view);
                ((xe7) ag1Var.c.X).c(ag1Var);
                return;
            case 7:
                jg1 jg1Var = (jg1) this.Y;
                px1 px1Var = (px1) this.Z;
                Map map = Collections.EMPTY_MAP;
                qd0 qd0Var = (qd0) this.f0;
                try {
                    jg1Var.a.e(px1Var);
                    qd0Var.b(null);
                    return;
                } catch (RuntimeException e2) {
                    qd0Var.d(e2);
                    return;
                }
            case 8:
                jg1 jg1Var2 = (jg1) this.Y;
                Runnable runnable = (Runnable) this.Z;
                Runnable runnable2 = (Runnable) this.f0;
                if (jg1Var2.j) {
                    runnable.run();
                    return;
                } else {
                    runnable2.run();
                    return;
                }
            case 9:
                cx1 cx1Var = (cx1) this.Y;
                px1 px1Var2 = (px1) this.Z;
                Map map2 = Collections.EMPTY_MAP;
                qd0 qd0Var2 = (qd0) this.f0;
                try {
                    cx1Var.a.e(px1Var2);
                    qd0Var2.b(null);
                    return;
                } catch (RuntimeException e3) {
                    qd0Var2.d(e3);
                    return;
                }
            case 10:
                cx1 cx1Var2 = (cx1) this.Y;
                Runnable runnable3 = (Runnable) this.Z;
                Runnable runnable4 = (Runnable) this.f0;
                if (cx1Var2.f) {
                    runnable3.run();
                    return;
                } else {
                    runnable4.run();
                    return;
                }
            case 11:
                bz1 bz1Var = (bz1) this.Y;
                pu puVar = (pu) this.Z;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f0;
                try {
                    pi2 pi2VarK = oc.k(bz1Var.a);
                    if (pi2VarK == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    oi2 oi2Var = (oi2) pi2VarK.a;
                    synchronized (oi2Var.c) {
                        oi2Var.e = threadPoolExecutor;
                        break;
                    }
                    pi2VarK.a.a(new az1(puVar, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    puVar.D(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.Y;
                Intent intent = (Intent) this.Z;
                z18 z18Var = (z18) this.f0;
                int i = EnhancedIntentService.h0;
                try {
                    enhancedIntentService.c(intent);
                    return;
                } finally {
                    z18Var.a(null);
                }
            case 13:
                qk2 qk2Var = (qk2) this.Y;
                qk2Var.J0 = qk2Var.z((LayoutInflater) this.Z, (ViewGroup) this.f0);
                return;
            case 14:
                fv5 fv5Var = (fv5) this.Y;
                ud0 ud0Var = (ud0) this.Z;
                a59 a59Var = (a59) this.f0;
                fv5Var.getClass();
                try {
                    zBooleanValue = ((Boolean) ud0Var.Y.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused2) {
                }
                synchronized (fv5Var.k) {
                    try {
                        s39VarB = v18.b(a59Var.a);
                        String str4 = s39VarB.a;
                        if (fv5Var.c(str4) == a59Var) {
                            fv5Var.b(str4);
                        }
                        lh4.P0().getClass();
                        arrayList = new ArrayList(fv5Var.j);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((p52) it.next()).b(s39VarB, zBooleanValue);
                }
                return;
            case 15:
                ((zv7) this.Y).b((xx7) this.Z, (Map.Entry) this.f0);
                return;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                ly7 ly7Var = (ly7) this.Y;
                hy7 hy7Var = (hy7) this.Z;
                mf1 mf1Var = (mf1) this.f0;
                ky7 ky7Var = ly7Var.f;
                ky7Var.a();
                if (ky7Var.g) {
                    ky7Var.g = false;
                    hy7Var.c();
                    hy7Var.i.b(null);
                    return;
                }
                ky7Var.b = hy7Var;
                ky7Var.d = mf1Var;
                Size size = hy7Var.b;
                ky7Var.a = size;
                ky7Var.f = false;
                if (ky7Var.b()) {
                    return;
                }
                hi5.z0("SurfaceViewImpl");
                ky7Var.h.e.getHolder().setFixedSize(size.getWidth(), size.getHeight());
                return;
            case 17:
                xd6 xd6Var = (xd6) this.Y;
                bh7 bh7Var = (bh7) this.Z;
                zv7 zv7Var = (zv7) this.f0;
                fv5 fv5Var2 = (fv5) xd6Var.Y;
                fv5Var2.getClass();
                s39 s39Var = bh7Var.a;
                String str5 = s39Var.a;
                ArrayList arrayList3 = new ArrayList();
                l49 l49Var = (l49) fv5Var2.e.n(new uh1(fv5Var2, arrayList3, str5, c2 == true ? 1 : 0));
                byte b2 = 7;
                if (l49Var == null) {
                    lh4 lh4VarP0 = lh4.P0();
                    s39Var.toString();
                    lh4VarP0.getClass();
                    ((ki3) fv5Var2.d.h0).execute(new sc4(fv5Var2, s39Var, b2));
                    return;
                }
                synchronized (fv5Var2.k) {
                    try {
                        synchronized (fv5Var2.k) {
                            b = fv5Var2.c(str5) != null ? (byte) 1 : (byte) 0;
                            break;
                        }
                        if (b != 0) {
                            Set set = (Set) fv5Var2.h.get(str5);
                            if (((bh7) set.iterator().next()).a.b == s39Var.b) {
                                set.add(bh7Var);
                                lh4 lh4VarP1 = lh4.P0();
                                s39Var.toString();
                                lh4VarP1.getClass();
                            } else {
                                ((ki3) fv5Var2.d.h0).execute(new sc4(fv5Var2, s39Var, b2));
                            }
                            return;
                        }
                        if (l49Var.t != s39Var.b) {
                            ((ki3) fv5Var2.d.h0).execute(new sc4(fv5Var2, s39Var, b2));
                            return;
                        }
                        d6 d6Var = new d6(fv5Var2.b, fv5Var2.c, fv5Var2.d, fv5Var2, fv5Var2.e, l49Var, arrayList3);
                        if (zv7Var != null) {
                            d6Var.f0 = zv7Var;
                        }
                        a59 a59Var2 = new a59(d6Var);
                        u61 u61Var = (u61) a59Var2.e.Z;
                        dm3 dm3VarG = u70.g();
                        u61Var.getClass();
                        ud0 ud0VarN = vr3.N(g33.K(u61Var, dm3VarG), new y49(a59Var2, objArr == true ? 1 : 0, c == true ? 1 : 0));
                        ud0VarN.Y.a(new j0((Object) fv5Var2, (Object) ud0VarN, (Object) a59Var2, (byte) 14), (ki3) fv5Var2.d.h0);
                        fv5Var2.g.put(str5, a59Var2);
                        HashSet hashSet = new HashSet();
                        hashSet.add(bh7Var);
                        fv5Var2.h.put(str5, hashSet);
                        lh4 lh4VarP2 = lh4.P0();
                        s39Var.toString();
                        lh4VarP2.getClass();
                        return;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            default:
                x49 x49Var = (x49) this.Y;
                aa6 aa6Var = (aa6) this.Z;
                a59 a59Var3 = (a59) this.f0;
                l49 l49Var2 = a59Var3.a;
                if (!(x49Var instanceof u49)) {
                    if (x49Var instanceof t49) {
                        ac4 ac4Var = new ac4();
                        int i2 = b59.a;
                        lh4.P0().getClass();
                        if (l49Var2.c()) {
                            a59Var3.b();
                        } else {
                            a59Var3.e(ac4Var);
                        }
                        aa6Var.X = false;
                        return;
                    }
                    if (x49Var instanceof v49) {
                        aa6Var.X = a59Var3.c(((v49) x49Var).a);
                        return;
                    }
                    if (!(x49Var instanceof w49)) {
                        b61.c();
                        return;
                    }
                    if (((w49) x49Var).a) {
                        zC = a59Var3.c(-256);
                    } else {
                        ac4 ac4Var2 = new ac4();
                        int i3 = b59.a;
                        lh4.P0().getClass();
                        if (l49Var2.c()) {
                            a59Var3.b();
                        } else {
                            a59Var3.e(ac4Var2);
                        }
                    }
                    aa6Var.X = zC;
                    return;
                }
                dc4 dc4Var = ((u49) x49Var).a;
                n49 n49Var = a59Var3.i;
                String str6 = a59Var3.c;
                u39 u39VarB = n49Var.b(str6);
                d49 d49VarW = a59Var3.h.w();
                d49VarW.getClass();
                u15.G(d49VarW.a, false, true, new nm7(str6, (byte) 5));
                if (u39VarB != null) {
                    if (u39VarB == u39.Y) {
                        if (dc4Var instanceof cc4) {
                            int i4 = b59.a;
                            lh4.P0().getClass();
                            if (l49Var2.c()) {
                                a59Var3.b();
                            } else {
                                n49Var.h(u39.Z, str6);
                                u91 u91Var = ((cc4) dc4Var).a;
                                u91Var.getClass();
                                u15.G(n49Var.a, false, true, new gq6(u91Var, str6, (byte) 27));
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                pi1 pi1Var = a59Var3.j;
                                for (String str7 : pi1Var.a(str6)) {
                                    if (n49Var.b(str7) == u39.g0 && ((Boolean) u15.G(pi1Var.a, true, false, new m40(str7, (byte) 4))).booleanValue()) {
                                        int i5 = b59.a;
                                        lh4.P0().getClass();
                                        n49Var.h(u39.X, str7);
                                        n49Var.g(jCurrentTimeMillis, str7);
                                        a59Var3.m.add(str7);
                                    }
                                }
                            }
                        } else if (dc4Var instanceof bc4) {
                            int i6 = b59.a;
                            lh4.P0().getClass();
                            a59Var3.a(-256);
                            z = true;
                        } else {
                            int i7 = b59.a;
                            lh4.P0().getClass();
                            if (l49Var2.c()) {
                                a59Var3.b();
                            } else {
                                a59Var3.e(dc4Var);
                            }
                        }
                    } else if (!u39VarB.a()) {
                        a59Var3.a(-512);
                        z = true;
                    }
                }
                aa6Var.X = z;
                return;
        }
    }

    public /* synthetic */ j0(of1 of1Var, qz qzVar, em7 em7Var, jy jyVar) {
        this.X = (byte) 5;
        this.Y = of1Var;
        this.Z = qzVar;
        this.f0 = jyVar;
    }

    public /* synthetic */ j0(jg1 jg1Var, px1 px1Var, qd0 qd0Var) {
        this.X = (byte) 7;
        Map map = Collections.EMPTY_MAP;
        this.Y = jg1Var;
        this.Z = px1Var;
        this.f0 = qd0Var;
    }

    public /* synthetic */ j0(xg0 xg0Var, wg0 wg0Var, te6 te6Var, Object obj, byte b) {
        this.X = b;
        this.Y = xg0Var;
        this.Z = te6Var;
        this.f0 = obj;
    }

    public /* synthetic */ j0(qk2 qk2Var, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.X = (byte) 13;
        this.Y = qk2Var;
        this.Z = layoutInflater;
        this.f0 = viewGroup;
    }

    public /* synthetic */ j0(Object obj, Object obj2, Object obj3, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
    }
}

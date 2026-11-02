package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.util.Log;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.work.impl.WorkDatabase;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.connection.ConnectPlan;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g00 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;

    public /* synthetic */ g00(lp2 lp2Var, ep0 ep0Var, xb7 xb7Var, wy4 wy4Var) {
        this.X = (byte) 6;
        this.Y = lp2Var;
        this.Z = ep0Var;
        this.f0 = xb7Var;
    }

    /* JADX WARN: Code duplicated, block: B:189:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:82:0x0204  */
    @Override // defpackage.dn2
    public final Object invoke() {
        int i;
        s86 s86Var;
        s86 s86VarD;
        s86 s86VarD2;
        int i2;
        boolean z = true;
        byte b = 0;
        q51 q51Var = null;
        switch (this.X) {
            case 0:
                h00 h00Var = (h00) this.Y;
                y5 y5Var = (y5) this.Z;
                ca6 ca6Var = (ca6) this.f0;
                h00Var.a();
                rv rvVar = (rv) y5Var.g0;
                int i3 = ca6Var.X;
                do {
                    i = rvVar.get();
                } while (!rvVar.compareAndSet(i, ((i >>> 27) & 15) == i3 ? i - 1 : i));
                return dn8.a;
            case 1:
                jc8 jc8Var = (jc8) this.Y;
                b71 b71Var = (b71) this.Z;
                y05 y05Var = (y05) this.f0;
                if (jc8Var.b()) {
                    w51.G(b71Var, null, null, new l40(jc8Var, q51Var, b), 3);
                    y05Var.setValue(Boolean.FALSE);
                }
                return dn8.a;
            case 2:
                t80 t80Var = (t80) this.Y;
                s86 s86VarY0 = t80.Y0(t80Var, (i55) this.Z, (p5) this.f0);
                if (s86VarY0 == null) {
                    return null;
                }
                o41 o41Var = t80Var.q0;
                if (pf3.a(o41Var.x0, -1L)) {
                    zc3.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return s86VarY0.k(o41Var.c1(s86VarY0, o41Var.Z0(), 0L) ^ (-9223372034707292160L));
            case 3:
                return CertificatePinner.check$lambda$0((CertificatePinner) this.Y, (List) this.Z, (String) this.f0);
            case 4:
                return ConnectPlan.connectTls$lambda$0((CertificatePinner) this.Y, (Handshake) this.Z, (Address) this.f0);
            case 5:
                o41 o41Var2 = (o41) this.Y;
                qo8 qo8Var = (qo8) this.Z;
                w80 w80Var = (w80) this.f0;
                dn8 dn8Var = dn8.a;
                yr2 yr2Var = o41Var2.v0;
                while (true) {
                    c15 c15Var = (c15) yr2Var.Y;
                    int i4 = c15Var.Z;
                    if (i4 != 0) {
                        if (i4 == 0) {
                            em7.g("MutableVector is empty.");
                            return null;
                        }
                        s86 s86Var2 = (s86) ((l41) c15Var.X[i4 - 1]).a.invoke();
                        if (s86Var2 == null ? true : o41.a1(o41Var2, s86Var2, 0L, 0L, 3)) {
                            c15 c15Var2 = (c15) yr2Var.Y;
                            ((l41) c15Var2.k(c15Var2.Z - 1)).b.f(dn8Var);
                        }
                    }
                }
                if (o41Var2.w0 && (s86Var = (s86) o41Var2.u0.invoke()) != null && o41.a1(o41Var2, s86Var, 0L, 0L, 3)) {
                    o41Var2.w0 = false;
                }
                qo8Var.e = o41Var2.Y0(w80Var, 0L);
                return dn8Var;
            case 6:
                lp2 lp2Var = (lp2) this.Y;
                ep0 ep0Var = (ep0) this.Z;
                xb7 xb7Var = (xb7) this.f0;
                a01 a01Var = lp2Var.M;
                ep0 ep0Var2 = a01Var.b;
                try {
                    a01Var.b = ep0Var;
                    xb7 xb7Var2 = lp2Var.G;
                    int[] iArr = lp2Var.o;
                    vz4 vz4Var = lp2Var.v;
                    lp2Var.o = null;
                    lp2Var.v = null;
                    try {
                        lp2Var.G = xb7Var;
                        boolean z2 = a01Var.e;
                        try {
                            a01Var.e = false;
                            lp2Var.B(null, null);
                            a01Var.e = z2;
                            lp2Var.G = xb7Var2;
                            lp2Var.o = iArr;
                            lp2Var.v = vz4Var;
                            a01Var.b = ep0Var2;
                            return dn8.a;
                        } catch (Throwable th) {
                            a01Var.e = z2;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        lp2Var.G = xb7Var2;
                        lp2Var.o = iArr;
                        lp2Var.v = vz4Var;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    a01Var.b = ep0Var2;
                    throw th3;
                }
            case 7:
                gn2 gn2Var = (gn2) this.Y;
                y05 y05Var2 = (y05) this.Z;
                gn2 gn2Var2 = (gn2) this.f0;
                if (gn2Var != null) {
                    Boolean bool = (Boolean) y05Var2.getValue();
                    bool.booleanValue();
                    Boolean bool2 = (Boolean) gn2Var.B(bool);
                    if (bool2 != null) {
                        y05Var2.setValue(bool2);
                    } else {
                        g33.b(gn2Var2, y05Var2, null);
                    }
                } else {
                    g33.b(gn2Var2, y05Var2, null);
                }
                return dn8.a;
            case 8:
                gn2 gn2Var3 = (gn2) this.Y;
                zo8 zo8Var = (zo8) this.Z;
                ((y05) this.f0).setValue(Boolean.TRUE);
                gn2Var3.B(new wa3(zo8Var));
                return dn8.a;
            case 9:
                aa6 aa6Var = (aa6) this.Y;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.Z;
                q7 q7Var = (q7) this.f0;
                if (aa6Var.X) {
                    lh4 lh4VarP0 = lh4.P0();
                    int i5 = k39.a;
                    lh4VarP0.getClass();
                    connectivityManager.unregisterNetworkCallback(q7Var);
                }
                return dn8.a;
            case 10:
                zi1 zi1Var = (zi1) this.Y;
                j74 j74Var = (j74) this.Z;
                k44 k44Var = (k44) this.f0;
                y64 y64Var = (y64) zi1Var.getValue();
                return new z64(j74Var, y64Var, k44Var, new ne((kf3) ((j64) j74Var.g0.e).getValue(), y64Var));
            case 11:
                rn2 rn2Var = (rn2) this.Y;
                ea6 ea6Var = (ea6) this.Z;
                w03 w03Var = (w03) this.f0;
                vi4 vi4Var = (vi4) ea6Var.X;
                s05 s05Var = vi4Var.o0;
                if (s05Var == null) {
                    long[] jArr = uw6.a;
                    s05Var = new s05();
                    vi4Var.o0 = s05Var;
                }
                Object objG = s05Var.g(w03Var);
                if (objG == null) {
                    objG = new ti4(vi4Var);
                    s05Var.l(w03Var, objG);
                }
                ti4 ti4Var = (ti4) objG;
                ti4Var.X = false;
                rn2Var.K(ti4Var, w03Var);
                return dn8.a;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                MainActivity mainActivity = (MainActivity) this.Y;
                String str = (String) this.Z;
                File file = (File) this.f0;
                InputStream inputStreamOpen = mainActivity.getAssets().open(str);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        inputStreamOpen.getClass();
                        gv3.m(inputStreamOpen, fileOutputStream);
                        fileOutputStream.close();
                        inputStreamOpen.close();
                        return Integer.valueOf(Log.i("HAPP", "Copied from apk assets folder to " + file.getAbsolutePath()));
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            oc.h(fileOutputStream, th4);
                            throw th5;
                        }
                    }
                } catch (Throwable th6) {
                    try {
                        throw th6;
                    } catch (Throwable th7) {
                        oc.h(inputStreamOpen, th6);
                        throw th7;
                    }
                }
            case 13:
                o87 o87Var = (o87) this.Y;
                b71 b71Var2 = (b71) this.Z;
                o87 o87Var2 = (o87) this.f0;
                if (((Boolean) ((gn2) o87Var.d.f0).B(p87.Y)).booleanValue()) {
                    w51.G(b71Var2, null, null, new uw4(o87Var2, q51Var, (byte) 6), 3);
                }
                return Boolean.TRUE;
            case 14:
                gn2 gn2Var4 = (gn2) this.Y;
                i55 i55Var = (i55) this.Z;
                aa6 aa6Var2 = (aa6) this.f0;
                s86 s86Var3 = s86.e;
                pk6 pk6Var = i55.Z0;
                gn2Var4.B(pk6Var);
                boolean zF = dh3.f(i55Var.L0, pk6Var.q0);
                b = i55Var.O0 != pk6Var.r0 ? (byte) 1 : (byte) 0;
                mb6 mb6VarA = pk6Var.q0.a(pk6Var.t0, pk6Var.w0, pk6Var.v0);
                pk6Var.A0 = mb6VarA;
                boolean zF2 = dh3.f(i55Var.N0, mb6VarA.D());
                aa6Var2.X = !zF2;
                if (!zF || b != 0 || !zF2) {
                    i55Var.L0 = pk6Var.q0;
                    i55Var.O0 = pk6Var.r0;
                    mb6 mb6Var = pk6Var.A0;
                    if (mb6Var == null || (s86VarD = mb6Var.D()) == null) {
                        s86VarD = s86Var3;
                    }
                    i55Var.N0 = s86VarD;
                    mb6 mb6Var2 = pk6Var.A0;
                    if (mb6Var2 != null && (s86VarD2 = mb6Var2.D()) != null) {
                        lf3 lf3VarL = os4.L(s86VarD2);
                        s86Var3 = new s86(lf3VarL.a, lf3VarL.b, lf3VarL.c, lf3VarL.d);
                    }
                    i55Var.M0 = s86Var3;
                    if (i55Var.P0 && (b != 0 || (i55Var.O0 && !zF))) {
                        i55Var.w0.I();
                    }
                }
                i55Var.P0 = true;
                return dn8.a;
            case 15:
                gp2 gp2Var = (gp2) this.Y;
                bc7 bc7Var = (bc7) this.Z;
                vc5 vc5Var = (vc5) this.f0;
                if (gp2Var != null) {
                    bc7Var.a(bc7Var.c(gp2Var) - bc7Var.t);
                }
                List listK = nr4.k(bc7Var, null, bc7Var.t, null);
                tz0 tz0Var = (tz0) wv0.B0(listK);
                Integer num = tz0Var != null ? tz0Var.b : null;
                List listB = vc5Var.b(num);
                if (num != null && !listB.isEmpty()) {
                    listB = wv0.H0(i21.K(new tz0(((tz0) wv0.r0(listB)).a, null, num)), wv0.o0(listB, 1));
                }
                return new rz0(wv0.H0(listK, listB), vc5Var.z());
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                pv3 pv3Var = (pv3) this.Y;
                dn2 dn2Var = (dn2) this.Z;
                dn2 dn2Var2 = (dn2) this.f0;
                ((gn2) pv3Var).B(ew5.a);
                if (dn2Var != null) {
                    dn2Var.invoke();
                }
                dn2Var2.invoke();
                return dn8.a;
            case 17:
                y68 y68Var = (y68) this.Y;
                gn2 gn2Var5 = (gn2) this.Z;
                dn2 dn2Var3 = (dn2) this.f0;
                gn2Var5.B(fm7.R0(y68Var.c().Z).toString());
                dn2Var3.invoke();
                return dn8.a;
            case 18:
                Context context = (Context) this.Y;
                Intent intent = (Intent) this.Z;
                dn2 dn2Var4 = (dn2) this.f0;
                context.startActivity(intent);
                dn2Var4.invoke();
                return dn8.a;
            case 19:
                h57 h57Var = (h57) this.Y;
                mi0 mi0Var = (mi0) this.Z;
                st2 st2Var = (st2) this.f0;
                f57 f57Var = ((e57) h57Var.e.getValue()).c() ? (f57) h57Var.f.getValue() : null;
                if (f57Var != null) {
                    int i6 = f57Var.h;
                    if (i6 == 1) {
                        i2 = 1;
                    } else if (i6 == 0) {
                        i2 = 0;
                    } else {
                        if (i6 == 0 || i6 == 1) {
                            bt.q("kotlin.Unit");
                            return null;
                        }
                        i2 = i6;
                    }
                } else {
                    i2 = 0;
                }
                return mi0Var.a(i2, f57Var, false, st2Var, null, (Map) h57Var.c.getValue(), (Map) h57Var.d.getValue());
            case 20:
                AbstractComposeView abstractComposeView = (AbstractComposeView) this.Y;
                ge geVar = (ge) this.Z;
                dw8 dw8Var = (dw8) this.f0;
                abstractComposeView.removeOnAttachStateChangeListener(geVar);
                cr5.b(abstractComposeView).a.remove(dw8Var);
                return dn8.a;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                e49 e49Var = (e49) this.Y;
                UUID uuid = (UUID) this.Z;
                u91 u91Var = (u91) this.f0;
                String string = uuid.toString();
                lh4 lh4VarP1 = lh4.P0();
                uuid.toString();
                Objects.toString(u91Var);
                lh4VarP1.getClass();
                WorkDatabase workDatabase = e49Var.a;
                workDatabase.b();
                try {
                    l49 l49VarC = workDatabase.x().c(string);
                    if (l49VarC == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (l49VarC.b == u39.Y) {
                        c49 c49Var = new c49(string, u91Var);
                        d49 d49VarW = workDatabase.w();
                        d49VarW.getClass();
                        u15.G(d49VarW.a, false, true, new gq6(d49VarW, c49Var, (byte) 25));
                    } else {
                        lh4.P0().getClass();
                    }
                    workDatabase.p();
                    workDatabase.l();
                    return null;
                } catch (Throwable th8) {
                    try {
                        lh4.P0().getClass();
                        throw th8;
                    } catch (Throwable th9) {
                        workDatabase.l();
                        throw th9;
                    }
                }
            default:
                x39 x39Var = (x39) this.Y;
                String str2 = (String) this.Z;
                g49 g49Var = (g49) this.f0;
                dn8 dn8Var2 = dn8.a;
                n49 n49VarX = x39Var.k0.x();
                List listD = n49VarX.d(str2);
                if (listD.size() > 1) {
                    u52.k("Can't apply UPDATE policy to the chains of work.");
                    return null;
                }
                j49 j49Var = (j49) wv0.t0(listD);
                if (j49Var == null) {
                    q12.a(new l39(x39Var, str2, g62.Y, i21.K(g49Var), null));
                } else {
                    String str3 = j49Var.a;
                    l49 l49VarC2 = n49VarX.c(str3);
                    if (l49VarC2 == null) {
                        bt.i(pc6.q("WorkSpec with ", str3, ", that matches a name \"", str2, "\", wasn't found"));
                        return null;
                    }
                    if (!l49VarC2.c()) {
                        u52.k("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                        return null;
                    }
                    if (j49Var.b == u39.h0) {
                        n49VarX.a(str3);
                        q12.a(new l39(x39Var, str2, g62.Y, i21.K(g49Var), null));
                    } else {
                        l49 l49VarB = l49.b(g49Var.b, j49Var.a, null, null, null, 0, 0L, 0, 0, 0L, 0, 33554430);
                        fv5 fv5Var = x39Var.n0;
                        fv5Var.getClass();
                        WorkDatabase workDatabase2 = x39Var.k0;
                        workDatabase2.getClass();
                        xy0 xy0Var = x39Var.j0;
                        xy0Var.getClass();
                        List list = x39Var.m0;
                        list.getClass();
                        Set set = g49Var.c;
                        String str4 = l49VarB.a;
                        l49 l49VarC3 = workDatabase2.x().c(str4);
                        if (l49VarC3 == null) {
                            bt.q(pc6.p("Worker with ", str4, " doesn't exist"));
                            return null;
                        }
                        if (!l49VarC3.b.a()) {
                            if (l49VarC3.c() ^ l49VarB.c()) {
                                throw new UnsupportedOperationException("Can't update " + (l49VarC3.c() ? "Periodic" : "OneTime") + " Worker to " + ((Object) (l49VarB.c() ? "Periodic" : "OneTime")) + " Worker. Update operation must preserve worker's type.");
                            }
                            synchronized (fv5Var.k) {
                                if (fv5Var.c(str4) == null) {
                                    z = false;
                                }
                                break;
                            }
                            if (!z) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    ((xw6) it.next()).d(str4);
                                }
                            }
                            boolean z3 = z;
                            workDatabase2.o(new d40(workDatabase2, str4, l49VarC3, l49VarB, list, set, z3, x39Var));
                            if (!z3) {
                                ax6.b(xy0Var, workDatabase2, list);
                            }
                        }
                    }
                }
                return dn8Var2;
        }
    }

    public /* synthetic */ g00(Object obj, Object obj2, Object obj3, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
    }
}

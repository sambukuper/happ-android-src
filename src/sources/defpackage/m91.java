package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.SystemClock;
import androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m91 implements u06 {
    public final /* synthetic */ byte X;
    public final byte Y;
    public final Object Z;
    public final Object f0;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ m91(byte b, int i, Object obj, Object obj2) {
        this.X = b;
        this.Z = obj;
        this.f0 = obj2;
        this.Y = i;
    }

    @Override // defpackage.v06
    public final Object get() {
        Object ej0Var;
        Object lr8Var;
        Object it2Var;
        Object yx7Var;
        switch (this.X) {
            case 0:
                l91 l91Var = (l91) this.Z;
                n91 n91Var = (n91) this.f0;
                byte b = this.Y;
                switch (b) {
                    case 0:
                        jh0 jh0Var = n91Var.a;
                        jh0Var.getClass();
                        ej0Var = new ej0(jh0Var, (lr8) n91Var.H.get(), (aj0) n91Var.F.get(), (qh0) n91Var.I.get(), (pr8) n91Var.k.get(), (ok0) n91Var.y.get());
                        return ej0Var;
                    case 1:
                        fu6 fu6Var = l91Var.a;
                        fu6 fu6Var2 = l91Var.a;
                        rj0 rj0Var = (rj0) fu6Var.f0;
                        hi5.R(rj0Var);
                        vh0 vh0Var = (vh0) fu6Var2.h0;
                        hi5.R(vh0Var);
                        mj0 mj0Var = new mj0((Object) l91Var, (Object) n91Var, (byte) 13);
                        t79 t79Var = (t79) n91Var.f.get();
                        dj4 dj4Var = (dj4) n91Var.n.get();
                        ps psVar = new ps((byte) 3);
                        psVar.b(n91Var.p.get());
                        psVar.b(n91Var.r.get());
                        psVar.b(n91Var.s.get());
                        psVar.b(n91Var.l.get());
                        psVar.b(n91Var.t.get());
                        psVar.b(n91Var.q.get());
                        psVar.b(n91Var.n.get());
                        psVar.b(n91Var.u.get());
                        psVar.b(n91Var.v.get());
                        ArrayList arrayList = psVar.b;
                        Set setSingleton = arrayList.isEmpty() ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList));
                        xe0 xe0Var = (xe0) n91Var.x.get();
                        ok0 ok0Var = (ok0) n91Var.y.get();
                        yr2 yr2Var = n91Var.z;
                        u06 u06Var = n91Var.k;
                        u06 u06Var2 = n91Var.F;
                        w02 w02Var = (w02) n91Var.D.get();
                        qj0 qj0Var = (qj0) n91Var.e.get();
                        bm0 bm0Var = (bm0) fu6Var2.i0;
                        mi0 mi0Var = (mi0) n91Var.G.get();
                        Context context = (Context) fu6Var2.Y;
                        lr8Var = new lr8(rj0Var, vh0Var, mj0Var, t79Var, dj4Var, setSingleton, xe0Var, ok0Var, yr2Var, u06Var, u06Var2, w02Var, qj0Var, bm0Var, mi0Var, context, wp1.g.i(context));
                        return lr8Var;
                    case 2:
                        qj0 qj0Var2 = (qj0) n91Var.e.get();
                        qj0Var2.getClass();
                        return new u79(qj0Var2);
                    case 3:
                        jh0 jh0Var2 = n91Var.a;
                        jh0Var2.getClass();
                        return new qj0(jh0Var2, (jj0) n91Var.d.get());
                    case 4:
                        rj0 rj0Var2 = (rj0) l91Var.a.f0;
                        hi5.R(rj0Var2);
                        jh0 jh0Var3 = n91Var.a;
                        jh0Var3.getClass();
                        try {
                            return zh0.b(rj0Var2.b(), jh0Var3.Y);
                        } catch (ms1 unused) {
                            hi5.j0();
                            return null;
                        }
                    case 5:
                        return new dj4((jj0) n91Var.d.get(), (kh7) n91Var.l.get(), (pr8) n91Var.k.get(), (lx0) n91Var.m.get());
                    case 6:
                        qj0 qj0Var3 = (qj0) n91Var.e.get();
                        ik0 ik0Var = (ik0) n91Var.j.get();
                        ik0Var.getClass();
                        return new kh7(qj0Var3, (um1.a().b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) == null && !ik0Var.a().a(ImageCaptureFailWithAutoFlashQuirk.class)) ? qe4.h0 : pz2.u0, (pr8) n91Var.k.get());
                    case 7:
                        return new ik0((jj0) n91Var.d.get(), (vk7) n91Var.i.get());
                    case 8:
                        return new vk7((StreamConfigurationMap) n91Var.g.get(), (ue5) n91Var.h.get());
                    case 9:
                        jj0 jj0Var = (jj0) n91Var.d.get();
                        if (jj0Var == null) {
                            return null;
                        }
                        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key.getClass();
                        return (StreamConfigurationMap) ((lf0) jj0Var).c(key);
                    case 10:
                        jj0 jj0Var2 = (jj0) n91Var.d.get();
                        return new ue5(jj0Var2);
                    case 11:
                        jh0 jh0Var4 = n91Var.a;
                        jh0Var4.getClass();
                        Executor executor = ((wx) l91Var.a.Z).a;
                        executor.getClass();
                        u61 u61VarX = nr4.x(executor);
                        lr8Var = new pr8(gv3.c(g33.K(pw7.b(), u61VarX).B0(new x61("CXCP-UseCase-" + jh0Var4.Y))), executor, u61VarX);
                        return lr8Var;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        return new lx0();
                    case 13:
                        return new x32((z32) n91Var.o.get());
                    case 14:
                        return new z32((qj0) n91Var.e.get(), (pr8) n91Var.k.get(), (lx0) n91Var.m.get());
                    case 15:
                        qj0 qj0Var4 = (qj0) n91Var.e.get();
                        kh7 kh7Var = (kh7) n91Var.l.get();
                        pr8 pr8Var = (pr8) n91Var.k.get();
                        uc8 uc8Var = (uc8) n91Var.q.get();
                        ik0 ik0Var2 = (ik0) n91Var.j.get();
                        ik0Var2.getClass();
                        ej0Var = new pd2(qj0Var4, kh7Var, pr8Var, uc8Var, ik0Var2.a().a(TorchFlashRequiredFor3aUpdateQuirk.class) ? lh4.M0 : lh4.l0);
                        return ej0Var;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        return new uc8((qj0) n91Var.e.get(), (kh7) n91Var.l.get(), (pr8) n91Var.k.get());
                    case 17:
                        qj0 qj0Var5 = (qj0) n91Var.e.get();
                        ik0 ik0Var3 = (ik0) n91Var.j.get();
                        ik0Var3.getClass();
                        lr8Var = new dh2(qj0Var5, ik0Var3.a().a(AfRegionFlipHorizontallyQuirk.class) ? lh4.g0 : qe4.i0, (kh7) n91Var.l.get(), (pr8) n91Var.k.get(), n91Var.b());
                        return lr8Var;
                    case 18:
                        return new tj7((pd2) n91Var.r.get(), (pr8) n91Var.k.get());
                    case 19:
                        return new nv8();
                    case 20:
                        return new r79(n91Var.b());
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                        ye0 ye0Var = (ye0) n91Var.w.get();
                        pr8 pr8Var2 = (pr8) n91Var.k.get();
                        lx0 lx0Var = (lx0) n91Var.m.get();
                        ye0Var.getClass();
                        pr8Var2.getClass();
                        lx0Var.getClass();
                        lr8Var = new xe0(ye0Var, pr8Var2, lx0Var);
                        return lr8Var;
                    case 22:
                        return new ye0();
                    case 23:
                        return new ok0();
                    case 24:
                        qj0 qj0Var6 = (qj0) n91Var.e.get();
                        jh0 jh0Var5 = n91Var.a;
                        jh0Var5.getClass();
                        return new zi0(qj0Var6, jh0Var5, (ok0) n91Var.y.get(), (rh0) n91Var.A.get(), (wg0) n91Var.B.get(), (dh2) n91Var.s.get(), (ik0) n91Var.j.get(), (w02) n91Var.D.get(), (vk7) n91Var.i.get(), (bh3) n91Var.E.get(), n91Var.b);
                    case 25:
                        return new rh0((r79) n91Var.v.get(), (x32) n91Var.p.get(), (uc8) n91Var.q.get(), (dj4) n91Var.n.get());
                    case 26:
                        return new wg0();
                    case 27:
                        String str = (String) n91Var.C.get();
                        ik0 ik0Var4 = (ik0) n91Var.j.get();
                        str.getClass();
                        ik0Var4.getClass();
                        return new x02(str, ik0Var4.a());
                    case _DnsMessageKt.TYPE_AAAA /* 28 */:
                        jh0 jh0Var6 = n91Var.a;
                        jh0Var6.getClass();
                        String str2 = jh0Var6.Y;
                        hi5.R(str2);
                        return str2;
                    case 29:
                        l91Var.a().getClass();
                        return new bh3();
                    case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                        wg0 wg0Var = (wg0) n91Var.B.get();
                        lx0 lx0Var2 = (lx0) n91Var.m.get();
                        jh0 jh0Var7 = n91Var.a;
                        jh0Var7.getClass();
                        ik0 ik0Var5 = (ik0) n91Var.j.get();
                        t79 t79Var2 = (t79) n91Var.f.get();
                        k28 k28VarA = n91Var.a();
                        jj0 jj0Var3 = (jj0) n91Var.d.get();
                        fu6 fu6Var3 = l91Var.a;
                        lr8Var = new mi0(wg0Var, lx0Var2, jh0Var7, ik0Var5, t79Var2, k28VarA, jj0Var3, (bm0) fu6Var3.i0, (dq) fu6Var3.g0);
                        return lr8Var;
                    case 31:
                        return new oh0((qj0) n91Var.e.get(), (x32) n91Var.p.get(), (pd2) n91Var.r.get(), (dh2) n91Var.s.get(), (tj7) n91Var.t.get(), (uc8) n91Var.q.get(), (dj4) n91Var.n.get(), (r79) n91Var.v.get(), (t79) n91Var.f.get(), (xe0) n91Var.x.get(), (lr8) n91Var.H.get(), (pr8) n91Var.k.get(), (nv8) n91Var.u.get());
                    default:
                        throw new AssertionError((int) b);
                }
            case 1:
                r91 r91Var = (r91) this.Z;
                p91 p91Var = (p91) this.f0;
                fu6 fu6Var4 = (fu6) p91Var.a;
                byte b2 = this.Y;
                switch (b2) {
                    case 0:
                        b71 b71Var = (b71) ((u06) p91Var.c).get();
                        s98 s98Var = (s98) r91Var.f.get();
                        tl7 tl7Var = (tl7) r91Var.o.get();
                        hi0 hi0Var = (hi0) fu6Var4.Z;
                        it2 it2Var2 = (it2) fu6Var4.f0;
                        yx7 yx7Var2 = (yx7) fu6Var4.h0;
                        nf0 nf0Var = (nf0) ((u06) p91Var.d).get();
                        mn0 mn0Var = (mn0) ((u06) p91Var.e).get();
                        r91 r91Var2 = (r91) p91Var.b;
                        return new ef0(b71Var, s98Var, tl7Var, hi0Var, it2Var2, yx7Var2, nf0Var, mn0Var, new y5((s98) r91Var2.f.get(), (hi0) fu6Var4.Z, (cl7) fu6Var4.g0, (jg0) r91Var2.p.get(), (tl7) r91Var2.o.get()), (s16) r91Var.u.get(), (jl0) r91Var.z.get(), (jg0) r91Var.p.get(), (u08) r91Var.m.get(), (ni0) fu6Var4.Y, (re0) fu6Var4.i0, (cl7) fu6Var4.g0, (j11) r91Var.A.get());
                    case 1:
                        s98 s98Var2 = (s98) r91Var.f.get();
                        bm3 bm3Var = (bm3) r91Var.d.get();
                        s98Var2.getClass();
                        bm3Var.getClass();
                        return gv3.c(g33.K(new ow7(bm3Var), g33.K(s98Var2.h, new x61("CXCP-Camera2Controller"))));
                    case 2:
                        u06 u06Var3 = r91Var.g;
                        s98 s98Var3 = (s98) r91Var.f.get();
                        hi0 hi0Var2 = (hi0) fu6Var4.Z;
                        bm3 bm3Var2 = (bm3) r91Var.d.get();
                        u06Var3.getClass();
                        s98Var3.getClass();
                        bm3Var2.getClass();
                        return new nf0(u06Var3, s98Var3, hi0Var2.a, bm3Var2);
                    case 3:
                        m91 m91Var = (m91) p91Var.g;
                        m91 m91Var2 = (m91) p91Var.h;
                        m91 m91Var3 = (m91) p91Var.i;
                        m91 m91Var4 = (m91) p91Var.j;
                        m91 m91Var5 = (m91) p91Var.k;
                        hi0 hi0Var3 = (hi0) fu6Var4.Z;
                        m91Var.getClass();
                        m91Var2.getClass();
                        m91Var3.getClass();
                        m91Var4.getClass();
                        m91Var5.getClass();
                        int i = hi0Var3.h;
                        if (i != 2) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                return (mn0) m91Var4.get();
                            }
                            return i == 1 ? (mn0) m91Var2.get() : (mn0) m91Var3.get();
                        }
                        if (Build.VERSION.SDK_INT >= 31) {
                            return (mn0) m91Var5.get();
                        }
                        bt.i("Cannot use Extension sessions below Android S");
                        return null;
                    case 4:
                        return new ue((s98) r91Var.f.get(), (cl7) fu6Var4.g0, (hi0) fu6Var4.Z, (byte) 0);
                    case 5:
                        return new te((cl7) fu6Var4.g0, (s98) r91Var.f.get());
                    case 6:
                        return new ue((s98) r91Var.f.get(), (cl7) fu6Var4.g0, (hi0) fu6Var4.Z, (byte) 1);
                    case 7:
                        return new cf((s98) r91Var.f.get(), (hi0) fu6Var4.Z, (cl7) fu6Var4.g0);
                    case 8:
                        return new wd((s98) r91Var.f.get(), (hi0) fu6Var4.Z, (cl7) fu6Var4.g0, (ig0) r91Var.n.get(), (tl7) r91Var.o.get());
                    default:
                        throw new AssertionError((int) b2);
                }
            default:
                byte b3 = this.Y;
                switch (b3) {
                    case 0:
                        q91 q91Var = (q91) this.f0;
                        hi0 hi0Var4 = (hi0) q91Var.a.Y;
                        jj0 jj0Var4 = (jj0) q91Var.c.get();
                        it2 it2Var3 = (it2) ((q91) this.f0).e.get();
                        it2 it2Var4 = (it2) ((q91) this.f0).e.get();
                        cl7 cl7Var = (cl7) ((q91) this.f0).f.get();
                        yx7 yx7Var3 = (yx7) ((q91) this.f0).h.get();
                        ef0 ef0Var = (ef0) ((q91) this.f0).g.get();
                        jm2 jm2Var = (jm2) ((q91) this.f0).k.get();
                        hm2 hm2Var = (hm2) ((q91) this.f0).i.get();
                        pw pwVar = (pw) ((r91) this.Z).r.get();
                        q91 q91Var2 = (q91) this.f0;
                        return new qi0(hi0Var4, jj0Var4, it2Var3, it2Var4, cl7Var, yx7Var3, ef0Var, jm2Var, hm2Var, pwVar, (ni0) q91Var2.a.Z, (ri0) q91Var2.o.get(), (si0) ((q91) this.f0).p.get(), (lt2) ((q91) this.f0).m.get(), (b71) ((q91) this.f0).n.get(), (u51) ((q91) this.f0).r.get());
                    case 1:
                        q91 q91Var3 = (q91) this.f0;
                        hi0 hi0Var5 = (hi0) q91Var3.a.Y;
                        mg0 mg0Var = (mg0) q91Var3.b.get();
                        mg0Var.getClass();
                        String str3 = hi0Var5.a;
                        str3.getClass();
                        return ((re0) mg0Var).c.a(str3);
                    case 2:
                        og0 og0Var = (og0) ((r91) this.Z).w.get();
                        dq dqVar = ((q91) this.f0).a;
                        yj0 yj0Var = (yj0) ((r91) this.Z).y.get();
                        og0Var.getClass();
                        yj0Var.getClass();
                        mg0 mg0Var2 = og0Var.d;
                        hi5.R(mg0Var2);
                        return mg0Var2;
                    case 3:
                        s98 s98Var4 = (s98) ((r91) this.Z).f.get();
                        q91 q91Var4 = (q91) this.f0;
                        dq dqVar2 = q91Var4.a;
                        it2Var = new it2(s98Var4, (ni0) dqVar2.Z, (hi0) dqVar2.Y, (kc4) q91Var4.d.get(), (List) ((q91) this.f0).l.get(), (jg0) ((r91) this.Z).p.get());
                        return it2Var;
                    case 4:
                        return new kc4();
                    case 5:
                        q91 q91Var5 = (q91) this.f0;
                        hi0 hi0Var6 = (hi0) q91Var5.a.Y;
                        kc4 kc4Var = (kc4) q91Var5.d.get();
                        jm2 jm2Var2 = (jm2) ((q91) this.f0).k.get();
                        kc4Var.getClass();
                        jm2Var2.getClass();
                        ArrayList arrayListN = i21.N(kc4Var);
                        arrayListN.add(kc4Var);
                        arrayListN.add(jm2Var2);
                        arrayListN.addAll(hi0Var6.j);
                        yx7Var = arrayListN;
                        return yx7Var;
                    case 6:
                        cl7 cl7Var2 = (cl7) ((q91) this.f0).f.get();
                        hm2 hm2Var2 = (hm2) ((q91) this.f0).i.get();
                        jj0 jj0Var5 = (jj0) ((q91) this.f0).c.get();
                        g08 g08Var = (g08) ((q91) this.f0).j.get();
                        cl7Var2.getClass();
                        hm2Var2.getClass();
                        jj0Var5.getClass();
                        g08Var.getClass();
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE;
                        key2.getClass();
                        Integer num = (Integer) ((lf0) jj0Var5).c(key2);
                        if (num != null) {
                            num.intValue();
                        }
                        return new jm2(cl7Var2, hm2Var2);
                    case 7:
                        jj0 jj0Var6 = (jj0) ((q91) this.f0).c.get();
                        hi0 hi0Var7 = (hi0) ((q91) this.f0).a.Y;
                        ((s98) ((r91) this.Z).f.get()).getClass();
                        it2Var = new cl7(jj0Var6, hi0Var7, new k32(), ((q91) this.f0).g);
                        return it2Var;
                    case 8:
                        q91 q91Var6 = (q91) this.f0;
                        dq dqVar3 = q91Var6.a;
                        ni0 ni0Var = (ni0) dqVar3.Z;
                        hi0 hi0Var8 = (hi0) dqVar3.Y;
                        mg0 mg0Var3 = (mg0) q91Var6.b.get();
                        yj0 yj0Var2 = (yj0) ((r91) this.Z).y.get();
                        it2 it2Var5 = (it2) ((q91) this.f0).e.get();
                        cl7 cl7Var3 = (cl7) ((q91) this.f0).f.get();
                        yx7 yx7Var4 = (yx7) ((q91) this.f0).h.get();
                        mg0Var3.getClass();
                        yj0Var2.getClass();
                        it2Var5.getClass();
                        cl7Var3.getClass();
                        yx7Var4.getClass();
                        re0 re0Var = (re0) mg0Var3;
                        ef0 ef0Var2 = (ef0) ((u06) new p91((r91) re0Var.e.Y, new fu6(re0Var, ni0Var, hi0Var8, it2Var5, cl7Var3, yx7Var4, re0Var)).f).get();
                        synchronized (re0Var.f) {
                            re0Var.g.add(ef0Var2);
                        }
                        hi5.R(ef0Var2);
                        return ef0Var2;
                    case 9:
                        cl7 cl7Var4 = (cl7) ((q91) this.f0).f.get();
                        yr2 yr2Var2 = ((q91) this.f0).g;
                        jl0 jl0Var = (jl0) ((r91) this.Z).z.get();
                        cl7Var4.getClass();
                        yr2Var2.getClass();
                        jl0Var.getClass();
                        yx7Var = new yx7(cl7Var4, yr2Var2, jl0Var, cl7Var4.g0);
                        return yx7Var;
                    case 10:
                        return new hm2();
                    case 11:
                        long j = Long.MAX_VALUE;
                        long j2 = Long.MAX_VALUE;
                        for (int i2 = 0; i2 < 3; i2++) {
                            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                            System.currentTimeMillis();
                            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                            if (jElapsedRealtimeNanos2 < j2) {
                                j2 = jElapsedRealtimeNanos2;
                            }
                        }
                        for (int i3 = 0; i3 < 3; i3++) {
                            long jNanoTime = System.nanoTime();
                            SystemClock.elapsedRealtimeNanos();
                            long jNanoTime2 = System.nanoTime() - jNanoTime;
                            if (jNanoTime2 < j) {
                                j = jNanoTime2;
                            }
                        }
                        return new g08();
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        it2Var = new ri0((lt2) ((q91) this.f0).m.get(), (it2) ((q91) this.f0).e.get(), (b71) ((q91) this.f0).n.get());
                        return it2Var;
                    case 13:
                        return new lt2();
                    case 14:
                        s98 s98Var5 = (s98) ((r91) this.Z).f.get();
                        bm3 bm3Var3 = (bm3) ((r91) this.Z).d.get();
                        s98Var5.getClass();
                        bm3Var3.getClass();
                        return gv3.c(g33.K(new ow7(bm3Var3), g33.K(s98Var5.h, new x61("CXCP-Graph"))));
                    case 15:
                        it2Var = new si0((lt2) ((q91) this.f0).m.get(), (it2) ((q91) this.f0).e.get(), (b71) ((q91) this.f0).n.get());
                        return it2Var;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                        it2Var = new u51((it2) ((q91) this.f0).e.get(), (jj0) ((q91) this.f0).c.get(), (qt2) ((q91) this.f0).q.get(), (kc4) ((q91) this.f0).d.get());
                        return it2Var;
                    case 17:
                        return new qt2();
                    default:
                        throw new AssertionError((int) b3);
                }
        }
    }
}

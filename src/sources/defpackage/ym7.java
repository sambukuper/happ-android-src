package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.tencent.mmkv.MMKV;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.service.SubscriptionUpdater$UpdateTask;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ym7 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ Object i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ym7(Object obj, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((ym7) n((q51) obj2, (b71) obj)).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((ym7) n((q51) obj2, (b71) obj)).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return ((ym7) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 3:
                return ((ym7) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 4:
                return ((ym7) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 5:
                return ((ym7) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 6:
                return ((ym7) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 7:
                return ((ym7) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 8:
                return ((ym7) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 9:
                return ((ym7) n((q51) obj2, (b71) obj)).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((ym7) n((q51) obj2, bool)).q(dn8Var);
                return dn8Var;
            case 11:
                return ((ym7) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 12:
                return ((ym7) n((q51) obj2, (dn8) obj)).q(dn8Var);
            default:
                return ((ym7) n((q51) obj2, (b71) obj)).q(dn8Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.i0;
        switch (b) {
            case 0:
                return new ym7((an7) obj2, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new ym7((yt7) obj2, q51Var, (byte) 1);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return new ym7((SubscriptionUpdater$UpdateTask) obj2, q51Var, (byte) 2);
            case 3:
                return new ym7((n48) obj2, q51Var, (byte) 3);
            case 4:
                return new ym7((a68) obj2, q51Var, (byte) 4);
            case 5:
                return new ym7((qa4) obj2, q51Var, (byte) 5);
            case 6:
                return new ym7((yg1) obj2, q51Var, (byte) 6);
            case 7:
                return new ym7((aa8) obj2, q51Var, (byte) 7);
            case 8:
                return new ym7((rf0) obj2, q51Var, (byte) 8);
            case 9:
                return new ym7((xf8) obj2, q51Var, (byte) 9);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                ym7 ym7Var = new ym7((Context) obj2, q51Var, (byte) 10);
                ym7Var.h0 = ((Boolean) obj).booleanValue();
                return ym7Var;
            case 11:
                return new ym7((List) obj2, q51Var, (byte) 11);
            case 12:
                return new ym7((uz8) obj2, q51Var, (byte) 12);
            default:
                return new ym7((z05) obj2, q51Var, (byte) 13);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        dn8 dn8Var;
        switch (this.g0) {
            case 0:
                an7 an7Var = (an7) this.i0;
                c71 c71Var = c71.X;
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    ss8 ss8Var = ss8.a;
                    if (ss8.x()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        List list = an7.g;
                        if (((MMKV) an7Var.c.getValue()).f(0L, "pref_blacklist_last_update") + 86400000 < jCurrentTimeMillis) {
                            this.h0 = true;
                            if (an7Var.d(this) == c71Var) {
                                return c71Var;
                            }
                        }
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                dn8 dn8Var2 = dn8.a;
                c71 c71Var2 = c71.X;
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    yt7 yt7Var = (yt7) this.i0;
                    ft7 ft7Var = ft7.a;
                    this.h0 = true;
                    Object objL = yt7Var.f.l(ft7Var, this);
                    if (objL != c71Var2) {
                        objL = dn8Var2;
                    }
                    if (objL == c71Var2) {
                        return c71Var2;
                    }
                } else {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var2;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                c71 c71Var3 = c71.X;
                boolean z3 = this.h0;
                if (z3) {
                    if (z3) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                SubscriptionUpdater$UpdateTask subscriptionUpdater$UpdateTask = (SubscriptionUpdater$UpdateTask) this.i0;
                Context context = ((ec4) subscriptionUpdater$UpdateTask).a;
                this.h0 = true;
                final mm0 mm0Var = new mm0(1, mb6.H(this));
                mm0Var.s();
                BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: su.happ.proxyutility.service.SubscriptionUpdater$UpdateTask$isUiAlive$2$1$receiver$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(Context context2, Intent intent) {
                        context2.getClass();
                        intent.getClass();
                        mm0 mm0Var2 = mm0Var;
                        if (mm0Var2.r() instanceof b65) {
                            mm0Var2.f(Boolean.TRUE);
                        }
                    }
                };
                context.getClass();
                ue3.I(context, broadcastReceiver, new IntentFilter("su.happ.proxyutility.action.check.main.process.alive.response"), (Integer) null);
                Intent intent = new Intent().setAction("su.happ.proxyutility.action.check.main.process.alive").setPackage("su.happ.proxyutility");
                intent.getClass();
                context.sendBroadcast(intent);
                mm0Var.u(new d3(subscriptionUpdater$UpdateTask, broadcastReceiver, (byte) 17));
                Object objQ = mm0Var.q();
                return objQ == c71Var3 ? c71Var3 : objQ;
            case 3:
                n48 n48Var = (n48) this.i0;
                c71 c71Var4 = c71.X;
                boolean z4 = this.h0;
                if (!z4) {
                    w39.n0(obj);
                    ca6 ca6Var = new ca6();
                    ca6Var.X = 1;
                    j31 j31VarL = w51.L(new a23(n48Var, ca6Var, (byte) 26));
                    fh1 fh1Var = new fh1(n48Var, (q51) null);
                    this.h0 = true;
                    if (z91.n(j31VarL, fh1Var, this) == c71Var4) {
                        return c71Var4;
                    }
                } else {
                    if (!z4) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case 4:
                c71 c71Var5 = c71.X;
                boolean z5 = this.h0;
                if (!z5) {
                    w39.n0(obj);
                    oi oiVar = ((a68) this.i0).x0;
                    z85 z85Var = new z85(9205357640488583168L);
                    this.h0 = true;
                    if (oiVar.e(this, z85Var) == c71Var5) {
                        return c71Var5;
                    }
                } else {
                    if (!z5) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case 5:
                dn8 dn8Var3 = dn8.a;
                c71 c71Var6 = c71.X;
                boolean z6 = this.h0;
                if (z6) {
                    if (z6) {
                        w39.n0(obj);
                        return dn8Var3;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                qa4 qa4Var = (qa4) this.i0;
                this.h0 = true;
                qa4Var.getClass();
                qa4Var.a.a.a(new te0(new j05(), qa4Var, (byte) 8), this);
                return c71Var6;
            case 6:
                c71 c71Var7 = c71.X;
                boolean z7 = this.h0;
                if (z7) {
                    if (z7) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                yg1 yg1Var = (yg1) this.i0;
                this.h0 = true;
                Object objH = yg1Var.h(this);
                return objH == c71Var7 ? c71Var7 : objH;
            case 7:
                c71 c71Var8 = c71.X;
                boolean z8 = this.h0;
                if (z8) {
                    if (z8) {
                        w39.n0(obj);
                        return dn8.a;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                ca6 ca6Var2 = new ca6();
                aa8 aa8Var = (aa8) this.i0;
                u77 u77Var = aa8Var.q0.a;
                te0 te0Var = new te0(ca6Var2, aa8Var, (byte) 15);
                this.h0 = true;
                u77Var.a(te0Var, this);
                return c71Var8;
            case 8:
                c71 c71Var9 = c71.X;
                boolean z9 = this.h0;
                if (!z9) {
                    w39.n0(obj);
                    rf0 rf0Var = (rf0) this.i0;
                    this.h0 = true;
                    if (rf0Var.B(this) == c71Var9) {
                        return c71Var9;
                    }
                } else {
                    if (!z9) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case 9:
                c71 c71Var10 = c71.X;
                boolean z10 = this.h0;
                if (!z10) {
                    w39.n0(obj);
                    xf8 xf8Var = (xf8) this.i0;
                    this.h0 = true;
                    if (xf8Var.f(this) == c71Var10) {
                        return c71Var10;
                    }
                } else {
                    if (!z10) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                w39.n0(obj);
                boolean z11 = this.h0;
                Context context2 = (Context) this.i0;
                HashMap map = zf5.a;
                PackageManager packageManager = context2.getPackageManager();
                packageManager.getClass();
                zf5.a(packageManager, new ComponentName(context2, (Class<?>) RescheduleReceiver.class), z11, xf5.X);
                return dn8.a;
            case 11:
                c71 c71Var11 = c71.X;
                boolean z12 = this.h0;
                if (z12) {
                    if (z12) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                List list2 = (List) this.i0;
                ArrayList arrayList = new ArrayList(xv0.Z(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(vr3.P(((wg1) it.next()).c()));
                }
                kb4 kb4Var = new kb4(new ArrayList(arrayList), false, dp1.a());
                this.h0 = true;
                Object objH2 = gv3.h(kb4Var, this);
                return objH2 == c71Var11 ? c71Var11 : objH2;
            case 12:
                dn8 dn8Var4 = dn8.a;
                c71 c71Var12 = c71.X;
                boolean z13 = this.h0;
                if (!z13) {
                    w39.n0(obj);
                    uz8 uz8Var = (uz8) this.i0;
                    sz8 sz8Var = sz8.a;
                    this.h0 = true;
                    Object objL2 = uz8Var.e.l(sz8Var, this);
                    if (objL2 != c71Var12) {
                        objL2 = dn8Var4;
                    }
                    if (objL2 == c71Var12) {
                        return c71Var12;
                    }
                } else {
                    if (!z13) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var4;
            default:
                c71 c71Var13 = c71.X;
                boolean z14 = this.h0;
                if (!z14) {
                    w39.n0(obj);
                    this.h0 = true;
                    if (u70.F(1000L, this) == c71Var13) {
                        return c71Var13;
                    }
                } else {
                    if (!z14) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                z05 z05Var = (z05) this.i0;
                synchronized (z05Var.Z) {
                    if (z05Var.Y || z05Var.X != 0) {
                        dn8Var = dn8.a;
                    } else {
                        z05Var.h0 = null;
                        z05Var.Y = true;
                        ((p5) ((z05) this.i0).g0).invoke();
                        dn8Var = dn8.a;
                    }
                }
                return dn8Var;
        }
    }
}

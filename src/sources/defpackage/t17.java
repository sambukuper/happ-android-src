package defpackage;

import android.content.Intent;
import android.util.Base64;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import coil3.target.ImageViewTarget;
import com.google.gson.a;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import okhttp3.dnsoverhttps.DnsOverHttps;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.SocketServerInfo;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.TestPingViaProxyData;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.service.XRayTestService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class t17 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ Object j0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t17(Object obj, Object obj2, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = obj;
        this.j0 = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        c71 c71Var = c71.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 3:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 4:
                n((q51) obj2, (b71) obj).q(dn8Var);
                return c71Var;
            case 5:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 6:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 7:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 8:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 9:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 11:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 12:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 13:
                n((q51) obj2, (rf) obj).q(dn8Var);
                return c71Var;
            case 14:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 15:
                return n((q51) obj2, (vq5) obj).q(dn8Var);
            case 16:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 17:
                return n((q51) obj2, obj).q(dn8Var);
            case 18:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 19:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 20:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            default:
                return n((q51) obj2, (b71) obj).q(dn8Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.j0;
        switch (b) {
            case 0:
                return new t17((SocketServerInfo) this.i0, (String[]) obj2, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new t17((yg1) this.i0, (yg1) obj2, q51Var, (byte) 1);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return new t17((d27) this.i0, (String) obj2, q51Var, (byte) 2);
            case 3:
                return new t17((y45) this.i0, (d27) obj2, q51Var, (byte) 3);
            case 4:
                return new t17((l27) this.i0, (q0) obj2, q51Var, (byte) 4);
            case 5:
                return new t17((xz4) this.i0, (vd7) obj2, q51Var, (byte) 5);
            case 6:
                return new t17((wb7) this.i0, (pi) obj2, q51Var, (byte) 6);
            case 7:
                return new t17((wg) this.i0, (pk) obj2, q51Var, (byte) 7);
            case 8:
                return new t17((qk7) this.i0, (ld6) obj2, q51Var, (byte) 8);
            case 9:
                return new t17((rk7) this.i0, (ld6) obj2, q51Var, (byte) 9);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                return new t17((np7) this.i0, (String) obj2, q51Var, (byte) 10);
            case 11:
                return new t17((pu7) this.i0, (lr5) obj2, q51Var, (byte) 11);
            case 12:
                return new t17((pu7) this.i0, (y45) obj2, q51Var, (byte) 12);
            case 13:
                t17 t17Var = new t17((y48) obj2, q51Var, (byte) 13);
                t17Var.i0 = obj;
                return t17Var;
            case 14:
                t17 t17Var2 = new t17((a68) obj2, q51Var, (byte) 14);
                t17Var2.i0 = obj;
                return t17Var2;
            case 15:
                t17 t17Var3 = new t17((xf8) obj2, q51Var, (byte) 15);
                t17Var3.i0 = obj;
                return t17Var3;
            case 16:
                return new t17((xf8) this.i0, (dn2) obj2, q51Var, (byte) 16);
            case 17:
                t17 t17Var4 = new t17((ze2) obj2, q51Var, (byte) 17);
                t17Var4.i0 = obj;
                return t17Var4;
            case 18:
                return new t17((rb8) this.i0, (String) obj2, q51Var, (byte) 18);
            case 19:
                return new t17((gn2) this.i0, (ux0) obj2, q51Var, (byte) 19);
            case 20:
                return new t17((xe2) this.i0, (sy8) obj2, q51Var, (byte) 20);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return new t17((p86) this.i0, (View) obj2, q51Var, (byte) 21);
            default:
                return new t17((Intent) this.i0, (XRayTestService) obj2, q51Var, (byte) 22);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        Object objQ;
        xx3 rj6Var;
        Object objQ2;
        xx3 rj6Var2;
        Object objB;
        Object objB2;
        d02 rj6Var3;
        og7 rj6Var4;
        XRayConfig.OutboundBean outboundBeanJ;
        String strG;
        byte b = this.g0;
        byte b2 = 10;
        byte b3 = 9;
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        Object obj2 = this.j0;
        xx3 xx3Var = null;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (z) {
                    if (z) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                nf1 nf1Var = tp1.a;
                ye1 ye1Var = ye1.Z;
                ar6 ar6Var = new ar6((SocketServerInfo) this.i0, (String[]) obj2, (q51) null, (byte) 1);
                this.h0 = true;
                Object objW = w51.W(ye1Var, ar6Var, this);
                return objW == c71Var ? c71Var : objW;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                boolean z2 = this.h0;
                if (z2) {
                    if (z2) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                yg1 yg1Var = (yg1) this.i0;
                s61 s61Var = ((s51) this).Y;
                s61Var.getClass();
                tz6 tz6Var = new tz6(s61Var);
                tz6Var.g(yg1Var.u(), new q5(2, (q51) null, (byte) 11));
                tz6Var.g(((yg1) obj2).u(), new q5(2, (q51) null, (byte) 12));
                this.h0 = true;
                Object objD = tz6.d(tz6Var, this);
                return objD == c71Var ? c71Var : objD;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    z17 z17Var = new z17(new j31(new wu1((d27) this.i0, (String) obj2, (q51) null, (byte) 7), (byte) 7), (byte) 0);
                    this.h0 = true;
                    objQ = gv3.q(z17Var, this);
                    if (objQ == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z3) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                    objQ = obj;
                }
                String str = (String) objQ;
                str.getClass();
                try {
                    byte[] bArrDecode = Base64.decode(str, 10);
                    bArrDecode.getClass();
                    rj6Var = new String(bArrDecode, iq0.a);
                    break;
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                    rj6Var = new rj6(th);
                }
                String str2 = (String) (rj6Var instanceof rj6 ? null : rj6Var);
                List listS0 = fm7.s0(str2 != null ? str2 : "");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : listS0) {
                    if (!fm7.o0((String) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 3:
                boolean z4 = this.h0;
                if (!z4) {
                    w39.n0(obj);
                    z17 z17Var2 = new z17(new j31(new qk4((y45) this.i0, (d27) obj2, (q51) null, (byte) 18), (byte) 7), (byte) 1);
                    this.h0 = true;
                    objQ2 = gv3.q(z17Var2, this);
                    if (objQ2 == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z4) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                    objQ2 = obj;
                }
                String str3 = (String) objQ2;
                str3.getClass();
                try {
                    byte[] bArrDecode2 = Base64.decode(str3, 0);
                    bArrDecode2.getClass();
                    rj6Var2 = new String(bArrDecode2, iq0.a);
                    break;
                } catch (Throwable th2) {
                    if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                        throw th2;
                    }
                    rj6Var2 = new rj6(th2);
                }
                String str4 = (String) (rj6Var2 instanceof rj6 ? null : rj6Var2);
                List listS1 = fm7.s0(str4 != null ? str4 : "");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : listS1) {
                    if (!fm7.o0((String) obj4)) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
            case 4:
                boolean z5 = this.h0;
                if (z5) {
                    if (!z5) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        w39.n0(obj);
                    }
                    return null;
                }
                w39.n0(obj);
                this.h0 = true;
                if (z91.n(((l27) this.i0).f, (q0) obj2, this) == c71Var) {
                    return c71Var;
                }
                bt.i("SharedFlow never completes, this call should never return.");
                return null;
            case 5:
                boolean z6 = this.h0;
                if (z6) {
                    if (z6) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                u77 u77Var = ((xz4) this.i0).a;
                mh mhVar = new mh((vd7) obj2, (byte) 6);
                this.h0 = true;
                u77Var.a(mhVar, this);
                return c71Var;
            case 6:
                wb7 wb7Var = (wb7) this.i0;
                rh5 rh5Var = wb7Var.o0;
                boolean z7 = this.h0;
                if (!z7) {
                    w39.n0(obj);
                    rh5Var.setValue(Boolean.TRUE);
                    m15 m15Var = wb7Var.t0;
                    ka kaVar = wb7Var.s0;
                    this.h0 = true;
                    m15Var.getClass();
                    if (gv3.n(new l15(f15.Y, m15Var, (pi) obj2, kaVar, (q51) null), this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z7) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                rh5Var.setValue(Boolean.FALSE);
                return dn8Var;
            case 7:
                boolean z8 = this.h0;
                if (!z8) {
                    w39.n0(obj);
                    this.h0 = true;
                    return oi.a((oi) ((wg) this.i0).c, new Float(0.0f), (pk) obj2, (gn2) null, this, 12) == c71Var ? c71Var : dn8Var;
                }
                if (z8) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                boolean z9 = this.h0;
                if (z9) {
                    if (z9) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                qc2 qc2Var = (qc2) ((qk7) this.i0).b.getValue();
                String str5 = ((ld6) obj2).X;
                this.h0 = true;
                return qc2Var.i(str5, this) == c71Var ? c71Var : dn8Var;
            case 9:
                boolean z10 = this.h0;
                try {
                    if (z10) {
                        if (z10) {
                            w39.n0(obj);
                            return dn8Var;
                        }
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                    ld6 ld6Var = (ld6) obj2;
                    xl2 xl2Var = ((rk7) this.i0).d1;
                    if (xl2Var == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    AppCompatImageView appCompatImageView = xl2Var.n0;
                    appCompatImageView.getClass();
                    String str6 = ld6Var.f0;
                    v76 v76VarA = pa7.a(appCompatImageView.getContext());
                    s63 s63Var = new s63(appCompatImageView.getContext());
                    s63Var.c = str6;
                    f4 f4Var = b73.a;
                    s63Var.d = new ImageViewTarget(appCompatImageView);
                    y63.a(s63Var);
                    v63 v63VarA = s63Var.a();
                    rm3 rm3VarM = w39.J(v63VarA, w51.j(v76VarA.b, (s61) v76VarA.a.c.getValue(), new t76(v76VarA, v63VarA, (q51) null, (byte) 0), 2)).m();
                    this.h0 = true;
                    return rm3VarM.V0(this) == c71Var ? c71Var : dn8Var;
                } catch (Throwable th3) {
                    if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                        throw th3;
                    }
                    return dn8Var;
                }
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                boolean z11 = this.h0;
                if (z11) {
                    if (z11) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                np7 np7Var = (np7) this.i0;
                String str7 = (String) obj2;
                str7.getClass();
                zn7 zn7Var = new zn7(str7);
                this.h0 = true;
                return np7Var.i(zn7Var, this) == c71Var ? c71Var : dn8Var;
            case 11:
                boolean z12 = this.h0;
                if (z12) {
                    if (z12) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                d27 d27Var = (d27) ((pu7) this.i0).b.getValue();
                this.h0 = true;
                d27Var.getClass();
                Object objN = gv3.n(new co((Object) d27Var, obj2, (q51) xx3Var, b3), this);
                if (objN != c71Var) {
                    objN = dn8Var;
                }
                return objN == c71Var ? c71Var : dn8Var;
            case 12:
                boolean z13 = this.h0;
                if (z13) {
                    if (z13) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                d27 d27Var2 = (d27) ((pu7) this.i0).b.getValue();
                this.h0 = true;
                d27Var2.getClass();
                Object objN2 = gv3.n(new co((Object) d27Var2, obj2, (q51) xx3Var, b2), this);
                if (objN2 != c71Var) {
                    objN2 = dn8Var;
                }
                return objN2 == c71Var ? c71Var : dn8Var;
            case 13:
                y48 y48Var = (y48) obj2;
                boolean z14 = this.h0;
                if (z14) {
                    if (!z14) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        w39.n0(obj);
                        b61.n();
                    }
                    return null;
                }
                w39.n0(obj);
                rf rfVar = (rf) this.i0;
                kd8 kd8Var = y48Var.s0;
                y78 y78Var = y48Var.t0;
                wx3 wx3Var = y48Var.x0;
                boolean z15 = y48Var.y0;
                wx3Var.getClass();
                int i = wx3Var.a;
                vx3 vx3Var = new vx3(i);
                if (i == -1) {
                    vx3Var = null;
                }
                int i2 = vx3Var != null ? vx3Var.a : 0;
                Boolean bool = wx3Var.b;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                int i3 = wx3Var.c;
                xx3Var = i3 != 0 ? new xx3(i3) : null;
                int i4 = xx3Var != null ? xx3Var.a : 1;
                int iA = wx3Var.a();
                ge4 ge4Var = wx3Var.f;
                if (ge4Var == null) {
                    ge4Var = ge4.Z;
                }
                s73 s73Var = new s73(z15, i2, zBooleanValue, i4, iA, ge4Var);
                kx6 kx6Var = new kx6(1, y48Var, y48.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)Z", 8, (byte) 1);
                s48 s48Var = new s48(y48Var, (byte) 12);
                w05 w05Var = y48Var.A0;
                fw8 fw8Var = (fw8) hi5.W(y48Var, y01.t);
                t48 t48Var = new t48(y48Var, (byte) 7);
                this.h0 = true;
                hi5.s0(rfVar, kd8Var, y78Var, s73Var, kx6Var, s48Var, w05Var, fw8Var, t48Var, this);
                return c71Var;
            case 14:
                a68 a68Var = (a68) obj2;
                boolean z16 = this.h0;
                if (z16) {
                    if (z16) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                b71 b71Var = (b71) this.i0;
                j31 j31VarL = w51.L(new v38(a68Var, (byte) 1));
                te0 te0Var = new te0(a68Var, b71Var, (byte) 14);
                this.h0 = true;
                return j31VarL.a(te0Var, this) == c71Var ? c71Var : dn8Var;
            case 15:
                boolean z17 = this.h0;
                if (z17) {
                    if (z17) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                vq5 vq5Var = (vq5) this.i0;
                this.h0 = true;
                Object objA = ((xf8) obj2).a(vq5Var, this);
                return objA == c71Var ? c71Var : objA;
            case 16:
                dn2 dn2Var = (dn2) obj2;
                boolean z18 = this.h0;
                try {
                    if (!z18) {
                        w39.n0(obj);
                        xf8 xf8Var = (xf8) this.i0;
                        this.h0 = true;
                        objB = xf8Var.b(this);
                        if (objB == c71Var) {
                            return c71Var;
                        }
                    } else {
                        if (!z18) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w39.n0(obj);
                        objB = obj;
                    }
                    dn2Var.invoke();
                    return dn8Var;
                } catch (Throwable th4) {
                    dn2Var.invoke();
                    throw th4;
                }
            case 17:
                Object obj5 = this.i0;
                boolean z19 = this.h0;
                if (!z19) {
                    w39.n0(obj);
                    this.i0 = null;
                    this.h0 = true;
                    return ((ze2) obj2).l(obj5, this) == c71Var ? c71Var : dn8Var;
                }
                if (z19) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                boolean z20 = this.h0;
                if (!z20) {
                    w39.n0(obj);
                    this.h0 = true;
                    Object objB3 = ((rb8) this.i0).b((String) obj2, this);
                    return objB3 == c71Var ? c71Var : objB3;
                }
                if (z20) {
                    w39.n0(obj);
                    return obj;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                boolean z21 = this.h0;
                if (!z21) {
                    w39.n0(obj);
                    gn2 gn2Var = (gn2) this.i0;
                    this.h0 = true;
                    objB2 = gn2Var.B(this);
                    if (objB2 == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z21) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                    objB2 = obj;
                }
                zc1.f0((xg1) objB2, (ux0) obj2);
                return dn8Var;
            case 20:
                boolean z22 = this.h0;
                if (z22) {
                    if (z22) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                xe2 xe2Var = (xe2) this.i0;
                mh mhVar2 = new mh((sy8) obj2, (byte) 9);
                this.h0 = true;
                return xe2Var.a(mhVar2, this) == c71Var ? c71Var : dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                m01 m01Var = (p86) this.i0;
                View view = (View) obj2;
                boolean z23 = this.h0;
                try {
                    if (!z23) {
                        w39.n0(obj);
                        this.h0 = true;
                        Object objR = gv3.r(((p86) m01Var).u, new q5(2, (q51) null, (byte) 9), this);
                        if (objR != c71Var) {
                            objR = dn8Var;
                        }
                        if (objR == c71Var) {
                            return c71Var;
                        }
                    } else {
                        if (!z23) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w39.n0(obj);
                    }
                    if (q29.a(view) != m01Var) {
                        return dn8Var;
                    }
                    view.setTag(g46.androidx_compose_ui_view_composition_context, null);
                    return dn8Var;
                } catch (Throwable th5) {
                    if (q29.a(view) == m01Var) {
                        view.setTag(g46.androidx_compose_ui_view_composition_context, null);
                    }
                    throw th5;
                }
            default:
                XRayTestService xRayTestService = (XRayTestService) obj2;
                boolean z24 = this.h0;
                if (!z24) {
                    w39.n0(obj);
                    String stringExtra = ((Intent) this.i0).getStringExtra("content");
                    if (stringExtra == null) {
                        return dn8Var;
                    }
                    a aVar = yw2.b;
                    aVar.getClass();
                    TestPingViaProxyData testPingViaProxyData = (TestPingViaProxyData) aVar.c(stringExtra, new yi8(TestPingViaProxyData.class));
                    if (testPingViaProxyData == null) {
                        return dn8Var;
                    }
                    vz7 vz7Var = d69.a;
                    if (!d69.s(testPingViaProxyData.getGuid())) {
                        vz7 vz7Var2 = XRayTestService.X;
                        xRayTestService.a(testPingViaProxyData);
                        return dn8Var;
                    }
                    kw4 kw4Var = kw4.a;
                    ServerConfig serverConfigB = kw4.b(testPingViaProxyData.getGuid());
                    if (serverConfigB == null) {
                        vz7 vz7Var3 = XRayTestService.X;
                        xRayTestService.a(testPingViaProxyData);
                        return dn8Var;
                    }
                    SubscriptionItem subscriptionItemF = kw4.f(serverConfigB.getSubscriptionId());
                    if (subscriptionItemF == null || !subscriptionItemF.b0()) {
                        return dn8Var;
                    }
                    String config = testPingViaProxyData.getConfig();
                    d02 d02Var = d02.X;
                    config.getClass();
                    try {
                        XRayConfig xRayConfig = (XRayConfig) aVar.c(config, new yi8(XRayConfig.class));
                        DnsOverHttps dnsOverHttpsA = fr1.a();
                        if (dnsOverHttpsA != null && (outboundBeanJ = xRayConfig.j()) != null && (strG = outboundBeanJ.g()) != null) {
                            List listLookup = dnsOverHttpsA.lookup(strG);
                            rj6Var3 = new ArrayList();
                            Iterator it = listLookup.iterator();
                            while (it.hasNext()) {
                                String hostAddress = ((InetAddress) it.next()).getHostAddress();
                                if (hostAddress != null) {
                                    rj6Var3.add(hostAddress);
                                }
                            }
                            ss8 ss8Var = ss8.a;
                            if (ss8.t()) {
                                rj6Var3.toString();
                            }
                            if (sj6.a(rj6Var3) == null) {
                                d02Var = rj6Var3;
                            }
                            d02Var = (List) d02Var;
                        }
                    } catch (Throwable th6) {
                        if ((th6 instanceof InterruptedException) || (th6 instanceof CancellationException)) {
                            throw th6;
                        }
                        rj6Var3 = new rj6(th6);
                    }
                    d02 d02Var2 = !d02Var.isEmpty() ? d02Var : null;
                    if (d02Var2 == null) {
                        return dn8Var;
                    }
                    ii iiVar = new ii(new ArrayList(), d02Var2, testPingViaProxyData, xRayTestService, (byte) 9);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = d02Var2.iterator();
                    while (it2.hasNext()) {
                        try {
                            rj6Var4 = w51.G((b71) XRayTestService.Z.getValue(), (s61) null, (e71) null, new o69(testPingViaProxyData, (String) it2.next(), iiVar, null), 3);
                        } catch (Throwable th7) {
                            if ((th7 instanceof InterruptedException) || (th7 instanceof CancellationException)) {
                                throw th7;
                            }
                            rj6Var4 = new rj6(th7);
                        }
                        if (rj6Var4 instanceof rj6) {
                            rj6Var4 = null;
                        }
                        bm3 bm3Var = (bm3) rj6Var4;
                        if (bm3Var != null) {
                            arrayList3.add(bm3Var);
                        }
                        break;
                    }
                    this.h0 = true;
                    if (jb5.y(arrayList3, this) == c71Var) {
                        return c71Var;
                    }
                    break;
                } else {
                    if (!z24) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                qe4.N0(xRayTestService, 73, "");
                return dn8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t17(Object obj, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.j0 = obj;
    }
}

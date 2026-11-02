package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.gson.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.AlertMessageData;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.AlertType;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r5 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public /* synthetic */ Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(boolean z, oh2 oh2Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 19;
        this.h0 = z;
        this.i0 = oh2Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) throws Throwable {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 1:
                ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 2:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 3:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 4:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 5:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 6:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 7:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 8:
                return ((r5) n((q51) obj2, (ze2) obj)).q(dn8Var);
            case 9:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 10:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 11:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 13:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 14:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 15:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 17:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 18:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 19:
                ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 20:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 22:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 23:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 24:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 25:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 26:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 27:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
            default:
                return ((r5) n((q51) obj2, (b71) obj)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = 2;
        switch (this.g0) {
            case 0:
                return new r5(this.i0, q51Var, (byte) 0);
            case 1:
                return new r5((ComponentActivity) this.i0, this.h0, q51Var, (byte) 1);
            case 2:
                return new r5((BaseActivity) this.i0, q51Var, b);
            case 3:
                return new r5(this.i0, q51Var, (byte) 3);
            case 4:
                return new r5(this.i0, q51Var, (byte) 4);
            case 5:
                return new r5(this.i0, q51Var, (byte) 5);
            case 6:
                return new r5(this.i0, q51Var, (byte) 6);
            case 7:
                return new r5(this.i0, q51Var, (byte) 7);
            case 8:
                return new r5(this.i0, q51Var, (byte) 8);
            case 9:
                return new r5(this.i0, q51Var, (byte) 9);
            case 10:
                return new r5(this.i0, q51Var, (byte) 10);
            case 11:
                return new r5(this.i0, q51Var, (byte) 11);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return new r5(this.i0, q51Var, (byte) 12);
            case 13:
                return new r5(this.i0, q51Var, (byte) 13);
            case 14:
                return new r5(this.i0, q51Var, (byte) 14);
            case 15:
                return new r5(this.i0, q51Var, (byte) 15);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return new r5(this.i0, q51Var, (byte) 16);
            case 17:
                return new r5(this.i0, q51Var, (byte) 17);
            case 18:
                return new r5(this.i0, q51Var, (byte) 18);
            case 19:
                return new r5(this.h0, (oh2) this.i0, q51Var);
            case 20:
                return new r5(this.i0, q51Var, (byte) 20);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return new r5((sn) this.i0, this.h0, q51Var, (byte) 21);
            case 22:
                return new r5(this.i0, q51Var, (byte) 22);
            case 23:
                return new r5(this.i0, q51Var, (byte) 23);
            case 24:
                r5 r5Var = new r5(b, q51Var);
                r5Var.i0 = obj;
                return r5Var;
            case 25:
                return new r5(this.i0, q51Var, (byte) 25);
            case 26:
                return new r5(this.i0, q51Var, (byte) 26);
            case 27:
                return new r5(this.i0, q51Var, (byte) 27);
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return new r5(this.i0, q51Var, (byte) 28);
            default:
                return new r5(this.i0, q51Var, (byte) 29);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        Object objR;
        Object objT;
        b71 b71Var;
        Object objW;
        Object value;
        byte b = this.g0;
        byte b2 = 25;
        byte b3 = 3;
        byte b4 = 0;
        byte b5 = 2;
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        byte b6 = 1;
        q51 q51Var = null;
        switch (b) {
            case 0:
                s5 s5Var = (s5) this.i0;
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    oh7 oh7Var = s5Var.a.u;
                    q5 q5Var = new q5(b5, q51Var, b4);
                    this.h0 = true;
                    if (gv3.r(oh7Var, q5Var, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                s5Var.d.b();
                return dn8Var;
            case 1:
                w39.n0(obj);
                e08 e08Var = new e08(new as(b4, this.h0));
                ComponentActivity componentActivity = (ComponentActivity) this.i0;
                if (componentActivity != null) {
                    gy1.a(componentActivity, e08Var, e08Var);
                }
                return dn8Var;
            case 2:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    an7 an7Var = ((BaseActivity) this.i0).H0;
                    this.h0 = true;
                    return an7Var.c(this) == c71Var ? c71Var : dn8Var;
                }
                if (z2) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z3 = this.h0;
                if (z3) {
                    if (z3) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                nf0 nf0Var = (nf0) this.i0;
                pd0 pd0Var = nf0Var.l0;
                mh mhVar = new mh(nf0Var, b6);
                this.h0 = true;
                return pd0Var.a(mhVar, this) == c71Var ? c71Var : dn8Var;
            case 4:
                boolean z4 = this.h0;
                if (z4) {
                    if (z4) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                og0 og0Var = (og0) this.i0;
                this.h0 = true;
                LinkedHashMap linkedHashMap = og0Var.c;
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    re0 re0Var = (re0) ((mg0) ((Map.Entry) it.next()).getValue());
                    gv3.i(re0Var.b.e, null);
                    arrayList.add(w51.j(re0Var.a.a, null, new bv(re0Var, q51Var, b5), 3));
                }
                Object objY = jb5.y(arrayList, this);
                if (objY != c71Var) {
                    objY = dn8Var;
                }
                return objY == c71Var ? c71Var : dn8Var;
            case 5:
                db dbVar = (db) this.i0;
                boolean z5 = this.h0;
                if (z5) {
                    if (z5) {
                        w39.n0(obj);
                        objR = obj;
                    } else {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                w39.n0(obj);
                oh7 oh7Var2 = dbVar.u;
                q5 q5Var2 = new q5(b5, q51Var, b3);
                this.h0 = true;
                objR = gv3.r(oh7Var2, q5Var2, this);
                if (objR == c71Var) {
                    return c71Var;
                }
                mk0 mk0Var = (mk0) objR;
                if (mk0Var instanceof rk0) {
                    return new hb5(dbVar, null, 2);
                }
                if (mk0Var instanceof qk0) {
                    dbVar.a();
                    return new hb5(null, ((qk0) mk0Var).a, 1);
                }
                if (mk0Var instanceof pk0) {
                    dbVar.a();
                    return new hb5(null, ((pk0) mk0Var).i, 1);
                }
                if (mk0Var instanceof yk0) {
                    dbVar.a();
                    u52.r(mk0Var, "Unexpected CameraState: ");
                } else {
                    b61.c();
                }
                return null;
            case 6:
                boolean z6 = this.h0;
                if (z6) {
                    if (z6) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.i0;
                this.h0 = true;
                Object objG = constraintTrackingWorker.g(this);
                return objG == c71Var ? c71Var : objG;
            case 7:
                f81 f81Var = (f81) this.i0;
                boolean z7 = this.h0;
                if (z7) {
                    if (z7) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                j31 j31VarL = w51.L(new o7(f81Var, b2));
                mh mhVar2 = new mh(f81Var, b5);
                this.h0 = true;
                Object objA = j31VarL.a(new te0(new ca6(), new n(mhVar2, (byte) 7), b3), this);
                if (objA != c71Var) {
                    objA = dn8Var;
                }
                if (objA != c71Var) {
                    objA = dn8Var;
                }
                return objA == c71Var ? c71Var : dn8Var;
            case 8:
                boolean z8 = this.h0;
                if (!z8) {
                    w39.n0(obj);
                    ib1 ib1Var = (ib1) this.i0;
                    this.h0 = true;
                    return ib1Var.d(this) == c71Var ? c71Var : dn8Var;
                }
                if (z8) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
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
                ca6 ca6Var = new ca6();
                ca6 ca6Var2 = new ca6();
                ca6 ca6Var3 = new ca6();
                ie1 ie1Var = (ie1) this.i0;
                u77 u77Var = ie1Var.q0.a;
                qp0 qp0Var = new qp0(ca6Var, ca6Var2, ca6Var3, ie1Var, (byte) 1);
                this.h0 = true;
                u77Var.a(qp0Var, this);
                return c71Var;
            case 10:
                boolean z10 = this.h0;
                if (!z10) {
                    w39.n0(obj);
                    this.h0 = true;
                    if (u70.F(3000L, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z10) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                ((io1) this.i0).R(false, false);
                return dn8Var;
            case 11:
                boolean z11 = this.h0;
                if (!z11) {
                    w39.n0(obj);
                    ls1 ls1Var = ((vr1) this.i0).g;
                    this.h0 = true;
                    return ls1Var.a(this) == c71Var ? c71Var : dn8Var;
                }
                if (z11) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
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
                xe2 xe2Var = (xe2) this.i0;
                this.h0 = true;
                Object objA2 = xe2Var.a(a65.X, this);
                if (objA2 != c71Var) {
                    objA2 = dn8Var;
                }
                return objA2 == c71Var ? c71Var : dn8Var;
            case 13:
                boolean z13 = this.h0;
                if (!z13) {
                    w39.n0(obj);
                    ci2 ci2Var = (ci2) this.i0;
                    this.h0 = true;
                    return yn0.s(ci2Var, null, this) == c71Var ? c71Var : dn8Var;
                }
                if (z13) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                boolean z14 = this.h0;
                if (!z14) {
                    w39.n0(obj);
                    p72 p72Var = (p72) ((HappApplication) this.i0).w0.getValue();
                    this.h0 = true;
                    return p72Var.b(this) == c71Var ? c71Var : dn8Var;
                }
                if (!z14) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                Object obj2 = ((sj6) obj).X;
                return dn8Var;
            case 15:
                boolean z15 = this.h0;
                if (!z15) {
                    w39.n0(obj);
                    fi3 fi3Var = (fi3) this.i0;
                    this.h0 = true;
                    return fi3Var.a(this) == c71Var ? c71Var : dn8Var;
                }
                if (z15) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                boolean z16 = this.h0;
                if (!z16) {
                    w39.n0(obj);
                    xe2 xe2VarJ = ((ak3) this.i0).c.j();
                    this.h0 = true;
                    objT = gv3.t(xe2VarJ, this);
                    if (objT == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z16) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                    objT = obj;
                }
                o05 o05Var = (o05) objT;
                return o05Var != null ? o05Var.a() : e02.X;
            case 17:
                boolean z17 = this.h0;
                if (z17) {
                    if (z17) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                qk qkVar = (qk) ((zz2) this.i0).Z;
                Float f = new Float(0.0f);
                wf7 wf7VarV = wl7.V(0.0f, 400.0f, new Float(0.5f), 1);
                this.h0 = true;
                return ry7.d(qkVar, f, wf7VarV, true, new zx6(b2), this) == c71Var ? c71Var : dn8Var;
            case 18:
                boolean z18 = this.h0;
                if (z18) {
                    if (z18) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                th4 th4Var = (th4) this.i0;
                this.h0 = true;
                Object objL = th4Var.f.l(wf4.a, this);
                if (objL != c71Var) {
                    objL = dn8Var;
                }
                return objL == c71Var ? c71Var : dn8Var;
            case 19:
                w39.n0(obj);
                if (this.h0) {
                    oh2.a((oh2) this.i0);
                }
                return dn8Var;
            case 20:
                boolean z19 = this.h0;
                if (!z19) {
                    w39.n0(obj);
                    j74 j74Var = (j74) this.i0;
                    this.h0 = true;
                    return j74.f(j74Var, 0, this) == c71Var ? c71Var : dn8Var;
                }
                if (z19) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                w39.n0(obj);
                ((sn) this.i0).B(Boolean.valueOf(this.h0));
                return dn8Var;
            case 22:
                boolean z20 = this.h0;
                if (z20) {
                    if (z20) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                oi oiVar = ((nw4) this.i0).e;
                Float f2 = new Float(0.0f);
                this.h0 = true;
                return oi.a(oiVar, f2, null, null, this, 14) == c71Var ? c71Var : dn8Var;
            case 23:
                boolean z21 = this.h0;
                if (z21) {
                    if (z21) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                x90 x90Var = ((uy4) this.i0).g;
                this.h0 = true;
                Object objN = gv3.n(new jy2((Object) x90Var, q51Var, (byte) 16), this);
                return objN == c71Var ? c71Var : objN;
            case 24:
                boolean z22 = this.h0;
                if (!z22) {
                    w39.n0(obj);
                    b71Var = (b71) this.i0;
                } else {
                    if (!z22) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b71Var = (b71) this.i0;
                    w39.n0(obj);
                }
                while (u70.X(b71Var.getCoroutineContext())) {
                    dx4 dx4Var = new dx4((byte) 6);
                    this.i0 = b71Var;
                    this.h0 = true;
                    s61 s61Var = this.Y;
                    s61Var.getClass();
                    if (z68.H(s61Var).a(dx4Var, this) == c71Var) {
                        return c71Var;
                    }
                }
                return dn8Var;
            case 25:
                boolean z23 = this.h0;
                if (z23) {
                    if (z23) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                y5 y5Var = (y5) this.i0;
                this.h0 = true;
                y5Var.X(this);
                return c71Var;
            case 26:
                boolean z24 = this.h0;
                if (z24) {
                    if (z24) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                fu6 fu6Var = (fu6) this.i0;
                this.h0 = true;
                qk4 qk4Var = new qk4((Object) fu6Var, q51Var, (byte) 11);
                nw7 nw7Var = new nw7(this, w());
                return z38.d(nw7Var, true, nw7Var, qk4Var) == c71Var ? c71Var : dn8Var;
            case 27:
                boolean z25 = this.h0;
                if (!z25) {
                    w39.n0(obj);
                    be beVar = gx1.Y;
                    long jL0 = vj8.l0(2000, lx1.MILLISECONDS);
                    this.h0 = true;
                    if (u70.G(jL0, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z25) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                String string = mn6.j().getString(y46.routing_profiles_clean_title);
                string.getClass();
                String string2 = mn6.j().getString(y46.routing_profiles_clean);
                string2.getClass();
                String string3 = mn6.j().getString(y46.close);
                string3.getClass();
                AlertMessageData alertMessageData = new AlertMessageData(string, string2, string3, AlertType.INFO);
                Context contextJ = mn6.j();
                contextJ.getClass();
                String strConcat = "data:".concat(new a().h(alertMessageData));
                try {
                    Intent intent = new Intent();
                    intent.setAction("su.happ.proxyutility.action.activity");
                    intent.setPackage("su.happ.proxyutility");
                    intent.putExtra("key", 122);
                    intent.putExtra("content", (Serializable) strConcat);
                    contextJ.sendBroadcast(intent);
                    return dn8Var;
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                    return dn8Var;
                }
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                boolean z26 = this.h0;
                if (!z26) {
                    w39.n0(obj);
                    nf1 nf1Var = tp1.a;
                    rq6 rq6Var = new rq6(2, null);
                    this.h0 = true;
                    objW = w51.W(nf1Var, rq6Var, this);
                    if (objW == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z26) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                    objW = obj;
                }
                cm5 cm5Var = (cm5) objW;
                sq6 sq6Var = (sq6) this.i0;
                sq6Var.getClass();
                oh7 oh7Var3 = sq6Var.b;
                oh7Var3.getClass();
                do {
                    value = oh7Var3.getValue();
                } while (!oh7Var3.k(value, kq6.a((kq6) value, cm5Var, null, false, 2)));
                return dn8Var;
            default:
                boolean z27 = this.h0;
                if (!z27) {
                    w39.n0(obj);
                    p67 p67Var = (p67) this.i0;
                    this.h0 = true;
                    return p67Var.e(this) == c71Var ? c71Var : dn8Var;
                }
                if (z27) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r5(Object obj, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r5(Object obj, boolean z, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = obj;
        this.h0 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r5(int i, q51 q51Var) {
        super(i, q51Var);
        this.g0 = (byte) 24;
    }
}

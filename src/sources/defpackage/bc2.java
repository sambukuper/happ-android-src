package defpackage;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class bc2 implements ze2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ze2 Y;
    public final /* synthetic */ qc2 Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ bc2(ze2 ze2Var, qc2 qc2Var, byte b) {
        this.X = b;
        this.Y = ze2Var;
        this.Z = qc2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object l(Object obj, q51 q51Var) {
        ac2 ac2Var;
        ld6 rj6Var;
        gc2 gc2Var;
        ic2 ic2Var;
        kc2 kc2Var;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        qc2 qc2Var = this.Z;
        ze2 ze2Var = this.Y;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                if (q51Var instanceof ac2) {
                    ac2Var = (ac2) q51Var;
                    int i = ac2Var.g0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ac2Var.g0 = i - Integer.MIN_VALUE;
                    } else {
                        ac2Var = new ac2(this, q51Var);
                    }
                } else {
                    ac2Var = new ac2(this, q51Var);
                }
                Object obj2 = ac2Var.f0;
                int i2 = ac2Var.g0;
                if (i2 != 0) {
                    if (i2 == 1) {
                        w39.n0(obj2);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj2);
                m02 m02Var = (Set) ((o05) obj).c(qc2Var.b);
                if (m02Var == null) {
                    m02Var = m02.X;
                }
                ArrayList arrayList = new ArrayList();
                for (String str : (Iterable) m02Var) {
                    try {
                        um3 um3Var = vm3.d;
                        g55 g55Var = ((vm3) um3Var).b;
                        rj6Var = (ld6) um3Var.a(ld6.Companion.serializer(), str);
                    } catch (Throwable th) {
                        if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                            throw th;
                        }
                        rj6Var = new rj6(th);
                    }
                    if (rj6Var instanceof rj6) {
                        rj6Var = null;
                    }
                    ld6 ld6Var = rj6Var;
                    if (ld6Var != null) {
                        arrayList.add(ld6Var);
                    }
                    break;
                }
                ac2Var.g0 = 1;
                return ze2Var.l(arrayList, ac2Var) == c71Var ? c71Var : dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                if (q51Var instanceof gc2) {
                    gc2Var = (gc2) q51Var;
                    int i3 = gc2Var.g0;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        gc2Var.g0 = i3 - Integer.MIN_VALUE;
                    } else {
                        gc2Var = new gc2(this, q51Var);
                    }
                } else {
                    gc2Var = new gc2(this, q51Var);
                }
                Object obj3 = gc2Var.f0;
                int i4 = gc2Var.g0;
                if (i4 == 0) {
                    w39.n0(obj3);
                    Object objC = ((o05) obj).c(qc2Var.c);
                    gc2Var.g0 = 1;
                    return ze2Var.l(objC, gc2Var) == c71Var ? c71Var : dn8Var;
                }
                if (i4 == 1) {
                    w39.n0(obj3);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                if (q51Var instanceof ic2) {
                    ic2Var = (ic2) q51Var;
                    int i5 = ic2Var.g0;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ic2Var.g0 = i5 - Integer.MIN_VALUE;
                    } else {
                        ic2Var = new ic2(this, q51Var);
                    }
                } else {
                    ic2Var = new ic2(this, q51Var);
                }
                Object obj4 = ic2Var.f0;
                int i6 = ic2Var.g0;
                if (i6 == 0) {
                    w39.n0(obj4);
                    Object objC2 = ((o05) obj).c(qc2Var.d);
                    ic2Var.g0 = 1;
                    return ze2Var.l(objC2, ic2Var) == c71Var ? c71Var : dn8Var;
                }
                if (i6 == 1) {
                    w39.n0(obj4);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (q51Var instanceof kc2) {
                    kc2Var = (kc2) q51Var;
                    int i7 = kc2Var.g0;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        kc2Var.g0 = i7 - Integer.MIN_VALUE;
                    } else {
                        kc2Var = new kc2(this, q51Var);
                    }
                } else {
                    kc2Var = new kc2(this, q51Var);
                }
                Object obj5 = kc2Var.f0;
                int i8 = kc2Var.g0;
                if (i8 == 0) {
                    w39.n0(obj5);
                    Object objC3 = ((o05) obj).c(qc2Var.e);
                    kc2Var.g0 = 1;
                    return ze2Var.l(objC3, kc2Var) == c71Var ? c71Var : dn8Var;
                }
                if (i8 == 1) {
                    w39.n0(obj5);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class yk5 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ cl5 i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yk5(cl5 cl5Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = cl5Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
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
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 5:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 6:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 7:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            case 8:
                return n((q51) obj2, (b71) obj).q(dn8Var);
            default:
                return n((q51) obj2, (dn8) obj).q(dn8Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        cl5 cl5Var = this.i0;
        switch (b) {
            case 0:
                return new yk5(cl5Var, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new yk5(cl5Var, q51Var, (byte) 1);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return new yk5(cl5Var, q51Var, (byte) 2);
            case 3:
                return new yk5(cl5Var, q51Var, (byte) 3);
            case 4:
                return new yk5(cl5Var, q51Var, (byte) 4);
            case 5:
                return new yk5(cl5Var, q51Var, (byte) 5);
            case 6:
                return new yk5(cl5Var, q51Var, (byte) 6);
            case 7:
                return new yk5(cl5Var, q51Var, (byte) 7);
            case 8:
                return new yk5(cl5Var, q51Var, (byte) 8);
            default:
                return new yk5(cl5Var, q51Var, (byte) 9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        Object objW;
        Object value;
        Object objW2;
        Object value2;
        byte b = this.g0;
        int i = 2;
        int i2 = 0;
        cl5 cl5Var = this.i0;
        c71 c71Var = c71.X;
        dn8 dn8Var = dn8.a;
        q51 q51Var = null;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    vz7 vz7Var = x06.a;
                    this.h0 = true;
                    nf1 nf1Var = tp1.a;
                    objW = w51.W(ye1.Z, new vh(i, q51Var, (byte) 4), this);
                    if (objW == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                    objW = obj;
                }
                jk5 jk5Var = (jk5) objW;
                oh7 oh7Var = cl5Var.f;
                oh7Var.getClass();
                do {
                    value = oh7Var.getValue();
                } while (!oh7Var.k(value, lk5.a((lk5) value, jk5Var, null, null, null, null, false, 62)));
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    vz7 vz7Var2 = x06.a;
                    this.h0 = true;
                    nf1 nf1Var2 = tp1.a;
                    objW2 = w51.W(ye1.Z, new vh(i, q51Var, (byte) 3), this);
                    if (objW2 == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                    objW2 = obj;
                }
                km5 km5VarG0 = mb6.g0((Iterable) objW2);
                oh7 oh7Var2 = cl5Var.f;
                oh7Var2.getClass();
                do {
                    value2 = oh7Var2.getValue();
                } while (!oh7Var2.k(value2, lk5.a((lk5) value2, null, null, null, km5VarG0, null, false, 55)));
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    ig8 ig8VarF = cl5Var.f();
                    this.h0 = true;
                    if (ig8VarF.b(this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z3) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            case 3:
                boolean z4 = this.h0;
                if (!z4) {
                    w39.n0(obj);
                    ig8 ig8VarF2 = cl5Var.f();
                    this.h0 = true;
                    if (ig8VarF2.b(this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z4) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            case 4:
                boolean z5 = this.h0;
                if (!z5) {
                    w39.n0(obj);
                    ig8 ig8VarF3 = cl5Var.f();
                    this.h0 = true;
                    if (ig8VarF3.b(this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z5) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            case 5:
                boolean z6 = this.h0;
                if (!z6) {
                    w39.n0(obj);
                    ig8 ig8VarF4 = cl5Var.f();
                    this.h0 = true;
                    if (ig8VarF4.b(this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z6) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            case 6:
                h76 h76Var = cl5Var.g;
                boolean z7 = this.h0;
                if (!z7) {
                    w39.n0(obj);
                    ka2 ka2Var = new ka2(new la2(w27.l0(new la2(wv0.l0(((lk5) h76Var.X.getValue()).c), true, new dx4((byte) 23)), zk5.X), true, new al5(1, ((lk5) h76Var.X.getValue()).h, km5.class, "contains", "contains(Ljava/lang/Object;)Z", 0, (byte) 0)));
                    while (ka2Var.hasNext()) {
                        if (cl5Var.e((String) ka2Var.next()) && (i2 = i2 + 1) < 0) {
                            i21.W();
                            throw null;
                        }
                    }
                    mk5 mk5Var = new mk5(i2);
                    this.h0 = true;
                    Object objL = cl5Var.h.l(mk5Var, this);
                    if (objL != c71Var) {
                        objL = dn8Var;
                    }
                    if (objL == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z7) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            case 7:
                boolean z8 = this.h0;
                if (!z8) {
                    w39.n0(obj);
                    ArrayList arrayList = kk5.a;
                    km5 km5Var = ((lk5) cl5Var.g.X.getValue()).h;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (km5Var.Z.containsKey((String) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            if (cl5Var.e((String) it.next()) && (i2 = i2 + 1) < 0) {
                                i21.W();
                                throw null;
                            }
                        }
                    }
                    nk5 nk5Var = new nk5(i2);
                    this.h0 = true;
                    Object objL2 = cl5Var.h.l(nk5Var, this);
                    if (objL2 != c71Var) {
                        objL2 = dn8Var;
                    }
                    if (objL2 == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z8) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            case 8:
                boolean z9 = this.h0;
                if (!z9) {
                    w39.n0(obj);
                    ig8 ig8VarF5 = cl5Var.f();
                    this.h0 = true;
                    if (ig8VarF5.b(this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z9) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            default:
                boolean z10 = this.h0;
                if (!z10) {
                    w39.n0(obj);
                    this.h0 = true;
                    Object objL3 = cl5Var.h.l(ok5.a, this);
                    if (objL3 != c71Var) {
                        objL3 = dn8Var;
                    }
                    if (objL3 == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z10) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
        }
    }
}

package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.util.dnsttv.dto.enums.DnsTTLogType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class qq1 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public byte h0;
    public final /* synthetic */ boolean i0;
    public Object j0;
    public final /* synthetic */ Object k0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qq1(Object obj, Object obj2, boolean z, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.j0 = obj;
        this.k0 = obj2;
        this.i0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                break;
        }
        return n(q51Var, b71Var).q(dn8Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.k0;
        switch (b) {
            case 0:
                return new qq1(this.i0, (p91) obj2, q51Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new qq1((ci4) this.j0, (gg4) obj2, this.i0, q51Var, (byte) 1);
            default:
                return new qq1((bx3) this.j0, (y48) obj2, this.i0, q51Var, (byte) 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        p91 p91Var;
        List list;
        Object value;
        byte b = this.g0;
        boolean z = this.i0;
        dn8 dn8Var = c71.X;
        Object obj2 = this.k0;
        dn8 dn8Var2 = dn8.a;
        switch (b) {
            case 0:
                byte b2 = this.h0;
                try {
                    if (b2 == 0) {
                        w39.n0(obj);
                        p91 p91Var2 = (p91) obj2;
                        if (z || (list = (List) p91Var2.j) == null || list.isEmpty()) {
                            this.j0 = p91Var2;
                            this.h0 = (byte) 1;
                            if (p91Var2.n(this) == dn8Var) {
                                return dn8Var;
                            }
                        } else {
                            this.j0 = p91Var2;
                            this.h0 = (byte) 2;
                            if (p91Var2.m(this) == dn8Var) {
                                return dn8Var;
                            }
                        }
                        p91Var = p91Var2;
                    } else {
                        if (b2 != 1 && b2 != 2) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p91Var = (p91) this.j0;
                        w39.n0(obj);
                    }
                    jh4.v((yr2) p91Var.c, "worksDomains:" + ((List) p91Var.k), DnsTTLogType.INFO, 4);
                    break;
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                }
                return dn8Var2;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                gg4 gg4Var = (gg4) obj2;
                ci4 ci4Var = (ci4) this.j0;
                byte b3 = this.h0;
                if (b3 != 0) {
                    if (b3 == 1) {
                        w39.n0(obj);
                    } else {
                        if (b3 != 2) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w39.n0(obj);
                    }
                    return dn8Var2;
                }
                w39.n0(obj);
                nf1 nf1Var = tp1.a;
                ye1 ye1Var = ye1.Z;
                zh4 zh4Var = new zh4(gg4Var, ci4Var, z, null);
                this.h0 = (byte) 1;
                obj = w51.W(ye1Var, zh4Var, this);
                if (obj == dn8Var) {
                    return dn8Var;
                }
                Object obj3 = ((sj6) obj).X;
                ci4Var.getClass();
                oh7 oh7Var = ci4Var.c;
                oh7Var.getClass();
                do {
                    value = oh7Var.getValue();
                } while (!oh7Var.k(value, (ng4) (sj6.a(obj3) == null ? obj3 : new lg4(gg4Var, null, 6, 0))));
                Object obj4 = !(obj3 instanceof rj6) ? pg4.a : sg4.a;
                this.h0 = (byte) 2;
                Object objL = ci4Var.e.l(obj4, this);
                if (objL != dn8Var) {
                    objL = dn8Var2;
                }
                if (objL == dn8Var) {
                    return dn8Var;
                }
                return dn8Var2;
            default:
                y48 y48Var = (y48) obj2;
                byte b4 = this.h0;
                if (b4 == 0) {
                    w39.n0(obj);
                    switch (((bx3) this.j0).ordinal()) {
                        case 17:
                            r68 r68Var = y48Var.u0;
                            this.h0 = (byte) 1;
                            r68Var.c(false, this);
                            if (dn8Var2 == dn8Var) {
                                return dn8Var;
                            }
                            break;
                        case 18:
                            r68 r68Var2 = y48Var.u0;
                            this.h0 = (byte) 3;
                            if (r68Var2.t(z, this) == dn8Var) {
                                return dn8Var;
                            }
                            break;
                        case 19:
                            r68 r68Var3 = y48Var.u0;
                            this.h0 = (byte) 2;
                            r68Var3.d(this);
                            if (dn8Var2 == dn8Var) {
                                return dn8Var;
                            }
                            break;
                    }
                } else {
                    if (b4 != 1 && b4 != 2 && b4 != 3) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq1(boolean z, p91 p91Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 0;
        this.i0 = z;
        this.k0 = p91Var;
    }
}

package defpackage;

import java.util.Set;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class xb2 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ Object i0;
    public final /* synthetic */ long j0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb2(nm4 nm4Var, String str, long j, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 2;
        this.h0 = nm4Var;
        this.i0 = str;
        this.j0 = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                n((q51) obj2, (o05) obj).q(dn8Var);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                n((q51) obj2, (o05) obj).q(dn8Var);
                break;
            default:
                n((q51) obj2, (b71) obj).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.i0;
        switch (b) {
            case 0:
                xb2 xb2Var = new xb2((qc2) obj2, this.j0, q51Var, (byte) 0);
                xb2Var.h0 = obj;
                return xb2Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                xb2 xb2Var2 = new xb2((qc2) obj2, this.j0, q51Var, (byte) 1);
                xb2Var2.h0 = obj;
                return xb2Var2;
            default:
                return new xb2((nm4) this.h0, (String) obj2, this.j0, q51Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        long j = this.j0;
        Object obj2 = this.i0;
        switch (b) {
            case 0:
                o05 o05Var = (o05) this.h0;
                w39.n0(obj);
                js5 js5Var = ((qc2) obj2).b;
                m02 m02Var = (Set) o05Var.c(js5Var);
                if (m02Var == null) {
                    m02Var = m02.X;
                }
                o05Var.f(js5Var, w27.o0(w27.l0(new la2(w27.m0(new hu((Iterable) m02Var, (byte) 1), new ya2((byte) 5)), true, new bd(j, (byte) 2)), new ya2((byte) 6))));
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                o05 o05Var2 = (o05) this.h0;
                w39.n0(obj);
                o05Var2.e(((qc2) obj2).e, new Long(j));
                break;
            default:
                w39.n0(obj);
                nm4 nm4Var = (nm4) this.h0;
                String str = (String) obj2;
                Long l = new Long(j);
                if (l.longValue() <= -1) {
                    l = null;
                }
                nm4Var.K(str, new Long(l != null ? l.longValue() : -1L));
                break;
        }
        return dn8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb2(qc2 qc2Var, long j, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = qc2Var;
        this.j0 = j;
    }
}

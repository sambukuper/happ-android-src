package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.compose.foundation.layout.b;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class d67 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ d67(byte b, int i, Object obj, Object obj2) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Object obj3 = this.Z;
        Object obj4 = this.Y;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                jb5.f((p67) obj4, (za3) obj3, (lp2) obj, w79.P(73));
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                gn2 gn2Var = (pv3) obj4;
                oh2 oh2Var = (oh2) obj3;
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    kx4 kx4VarU = ch3.u(b.a);
                    Object objK = lp2Var.K();
                    if (objK == zz0.a) {
                        objK = new bz2(oh2Var, (byte) 5);
                        lp2Var.g0(objK);
                    }
                    ts7.a(0, gn2Var, lp2Var, z91.C(kx4VarU, (gn2) objK));
                }
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                ((Integer) obj2).getClass();
                bt7.b((yt7) obj4, (kx4) obj3, (lp2) obj, w79.P(57));
                break;
            case 3:
                ((Integer) obj2).getClass();
                eu7.b((mu7) obj4, (kx4) obj3, (lp2) obj, w79.P(57));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((ts2) obj4).b((Drawable) obj3, (lp2) obj, w79.P(49));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((z48) obj4).j((zy0) obj3, (lp2) obj, w79.P(7));
                break;
            case 6:
                r68 r68Var = (r68) obj4;
                e38 e38Var = (e38) obj;
                Context context = (Context) obj2;
                boolean zM = r68Var.m();
                kd8 kd8Var = r68Var.a;
                CharSequence charSequence = kd8Var.d().Z;
                long j = kd8Var.d().f0;
                op5 op5Var = r68Var.f;
                v28 v28Var = new v28(r68Var, (b71) obj3, context, (byte) 3);
                ox1 ox1Var = pp5.a;
                if (Build.VERSION.SDK_INT >= 28 && charSequence != null && op5Var != null && (op5Var instanceof op5)) {
                    op5Var.a(e38Var, charSequence, j, v28Var);
                    w39.h(e38Var, context, zM, charSequence, j);
                } else {
                    v28Var.B(e38Var);
                    if (charSequence != null) {
                        w39.h(e38Var, context, zM, charSequence, j);
                    }
                }
                break;
            default:
                ((Integer) obj2).getClass();
                mn7.b((zo8) obj4, (kx4) obj3, (lp2) obj, w79.P(1));
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ d67(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }
}

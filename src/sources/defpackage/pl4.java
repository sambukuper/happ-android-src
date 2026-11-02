package defpackage;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class pl4 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ MainActivity i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pl4(MainActivity mainActivity, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = mainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                return n(q51Var, b71Var).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                n(q51Var, b71Var).q(dn8Var);
                return c71.X;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return n(q51Var, b71Var).q(dn8Var);
            case 3:
                return n(q51Var, b71Var).q(dn8Var);
            case 4:
                return n(q51Var, b71Var).q(dn8Var);
            case 5:
                return n(q51Var, b71Var).q(dn8Var);
            default:
                return n(q51Var, b71Var).q(dn8Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        MainActivity mainActivity = this.i0;
        switch (b) {
            case 0:
                return new pl4(mainActivity, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new pl4(mainActivity, q51Var, (byte) 1);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return new pl4(mainActivity, q51Var, (byte) 2);
            case 3:
                return new pl4(mainActivity, q51Var, (byte) 3);
            case 4:
                return new pl4(mainActivity, q51Var, (byte) 4);
            case 5:
                return new pl4(mainActivity, q51Var, (byte) 5);
            default:
                return new pl4(mainActivity, q51Var, (byte) 6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        byte b2 = 3;
        byte b3 = 2;
        lx1 lx1Var = lx1.Z;
        dn8 dn8Var = dn8.a;
        d94 d94Var = this.i0;
        c71 c71Var = c71.X;
        byte b4 = 1;
        q51 q51Var = null;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    wj4 wj4Var = new wj4(d94Var, q51Var, (byte) 29);
                    this.h0 = true;
                    return u15.L(d94Var, wj4Var, this) == c71Var ? c71Var : dn8Var;
                }
                if (z) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                boolean z2 = this.h0;
                if (z2) {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        w39.n0(obj);
                        b61.n();
                    }
                    return null;
                }
                w39.n0(obj);
                f76 f76Var = d94Var.G().u;
                yk4 yk4Var = new yk4(d94Var, b3);
                this.h0 = true;
                f76Var.X.a(yk4Var, this);
                return c71Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    pl4 pl4Var = new pl4(d94Var, q51Var, b4);
                    this.h0 = true;
                    return u15.L(d94Var, pl4Var, this) == c71Var ? c71Var : dn8Var;
                }
                if (z3) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
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
                xe2 xe2VarT = w51.t(new j31(new o(d94Var.G().x, (byte) 13), (byte) 5));
                tk0 tk0Var = new tk0(d94Var, (q51) null, (byte) 5);
                this.h0 = true;
                return z91.n(xe2VarT, tk0Var, this) == c71Var ? c71Var : dn8Var;
            case 4:
                boolean z5 = this.h0;
                if (!z5) {
                    w39.n0(obj);
                    pl4 pl4Var2 = new pl4(d94Var, q51Var, b2);
                    this.h0 = true;
                    return u15.L(d94Var, pl4Var2, this) == c71Var ? c71Var : dn8Var;
                }
                if (z5) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                boolean z6 = this.h0;
                if (!z6) {
                    w39.n0(obj);
                    be beVar = gx1.Y;
                    long jM0 = vj8.m0(500L, lx1Var);
                    this.h0 = true;
                    if (u70.G(jM0, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z6) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
                d94Var.w1 = valueAnimatorOfFloat;
                valueAnimatorOfFloat.setDuration(1000L);
                d94Var.w1.setInterpolator(new LinearInterpolator());
                d94Var.w1.addUpdateListener(new sj4(d94Var, (byte) 1));
                ValueAnimator valueAnimator = d94Var.w1;
                valueAnimator.getClass();
                valueAnimator.addListener(new ow8(d94Var, b2));
                d94Var.w1.start();
                return dn8Var;
            default:
                boolean z7 = this.h0;
                if (!z7) {
                    w39.n0(obj);
                    be beVar2 = gx1.Y;
                    long jM1 = vj8.m0(1000L, lx1Var);
                    this.h0 = true;
                    if (u70.G(jM1, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z7) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                m51 m51Var = ko1.B1;
                km4.l0(d94Var.n(), jo1.g0, (String) null);
                return dn8Var;
        }
    }
}

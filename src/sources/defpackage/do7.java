package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.routing.rules.RoutingRulesActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class do7 extends uy7 implements rn2 {
    public byte g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ ky2 i0;
    public final /* synthetic */ Context j0;
    public final /* synthetic */ gn2 k0;
    public final /* synthetic */ fn6 l0;
    public final /* synthetic */ gn2 m0;
    public final /* synthetic */ o87 n0;
    public final /* synthetic */ Activity o0;
    public final /* synthetic */ gn2 p0;
    public final /* synthetic */ String q0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do7(ky2 ky2Var, Context context, gn2 gn2Var, fn6 fn6Var, gn2 gn2Var2, o87 o87Var, Activity activity, gn2 gn2Var3, String str, q51 q51Var) {
        super(2, q51Var);
        this.i0 = ky2Var;
        this.j0 = context;
        this.k0 = gn2Var;
        this.l0 = fn6Var;
        this.m0 = gn2Var2;
        this.n0 = o87Var;
        this.o0 = activity;
        this.p0 = gn2Var3;
        this.q0 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (co7) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        do7 do7Var = new do7(this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, this.o0, this.p0, this.q0, q51Var);
        do7Var.h0 = obj;
        return do7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        if (r5.c(r13, r12) == r7) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (r5.c(r13, r12) == r7) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        if (r5.c(r13, r12) == r7) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
    
        if (r5.c(r13, r12) == r7) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cb, code lost:
    
        if (r5.c(r13, r12) == r7) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ea, code lost:
    
        if (r5.c(r13, r12) == r7) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0122, code lost:
    
        if (r12.n0.c(r12) == r7) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0164, code lost:
    
        if (r5.c(r13, r12) == r7) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        co7 co7Var = (co7) this.h0;
        byte b = this.g0;
        gn2 gn2Var = this.m0;
        switch (b) {
            case 0:
                w39.n0(obj);
                boolean z = co7Var instanceof wn7;
                my2 my2Var = my2.Y;
                ky2 ky2Var = this.i0;
                Context context = this.j0;
                c71 c71Var = c71.X;
                if (z) {
                    String string = context.getString(y46.toast_failure);
                    string.getClass();
                    by2 by2Var = new by2(string, my2Var);
                    this.h0 = null;
                    this.g0 = (byte) 1;
                } else if (co7Var instanceof xn7) {
                    String string2 = context.getString(y46.routing_export_profile_failure_not_select);
                    string2.getClass();
                    by2 by2Var2 = new by2(string2, my2Var);
                    this.h0 = null;
                    this.g0 = (byte) 2;
                } else if (co7Var instanceof yn7) {
                    ss8 ss8Var = ss8.a;
                    ss8.E(context, ((yn7) co7Var).a);
                    String string3 = context.getString(y46.toast_success);
                    string3.getClass();
                    by2 by2Var3 = new by2(string3, my2.X);
                    this.h0 = null;
                    this.g0 = (byte) 3;
                } else {
                    boolean z2 = co7Var instanceof ao7;
                    my2 my2Var2 = my2.Z;
                    if (z2) {
                        String string4 = context.getString(y46.routing_settings_warning_empty_profiles);
                        string4.getClass();
                        by2 by2Var4 = new by2(string4, my2Var2);
                        this.h0 = null;
                        this.g0 = (byte) 4;
                    } else if (co7Var instanceof un7) {
                        String string5 = context.getString(y46.routing_settings_profile_name_empty);
                        string5.getClass();
                        by2 by2Var5 = new by2(string5, my2Var);
                        this.h0 = null;
                        this.g0 = (byte) 5;
                    } else {
                        if (!(co7Var instanceof vn7)) {
                            if (!(co7Var instanceof tn7)) {
                                if (!(co7Var instanceof rn7)) {
                                    if (co7Var instanceof zn7) {
                                        Activity activity = this.o0;
                                        if (activity != null) {
                                            activity.startActivity(new Intent(activity, (Class<?>) RoutingRulesActivity.class).putExtra("profileId", ((zn7) co7Var).a));
                                        }
                                    } else if (co7Var instanceof bo7) {
                                        String string6 = context.getString(y46.warning_settings_after_tunnel_restart);
                                        string6.getClass();
                                        by2 by2Var6 = new by2(string6, my2Var2);
                                        this.h0 = null;
                                        this.g0 = (byte) 8;
                                    } else {
                                        if (!dh3.f(co7Var, sn7.a)) {
                                            b61.c();
                                            return null;
                                        }
                                        this.p0.B(new rv5(this.q0, this.l0));
                                    }
                                    break;
                                } else {
                                    this.h0 = null;
                                    this.g0 = (byte) 7;
                                    break;
                                }
                                return c71Var;
                            }
                            tn7 tn7Var = (tn7) co7Var;
                            this.k0.B(new dw5(tn7Var.a, tn7Var.b, tn7Var.c, tn7Var.e, tn7Var.d, this.l0));
                            gn2Var.B(new yo7(true));
                            return dn8.a;
                        }
                        String string7 = context.getString(y46.routing_import_profile_main_error);
                        string7.getClass();
                        by2 by2Var7 = new by2(string7, my2Var);
                        this.h0 = null;
                        this.g0 = (byte) 6;
                    }
                }
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
                w39.n0(obj);
                return dn8.a;
            case 7:
                w39.n0(obj);
                gn2Var.B(io7.a);
                return dn8.a;
            default:
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}

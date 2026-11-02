package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2;
import su.happ.proxyutility.dto.RouteSettings;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class yk4 implements ze2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ MainActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ yk4(MainActivity mainActivity, byte b) {
        this.X = b;
        this.Y = mainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object a(String str, q51 q51Var) {
        xk4 xk4Var;
        if (q51Var instanceof xk4) {
            xk4Var = (xk4) q51Var;
            int i = xk4Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                xk4Var.h0 = i - Integer.MIN_VALUE;
            } else {
                xk4Var = new xk4(this, q51Var);
            }
        } else {
            xk4Var = new xk4(this, q51Var);
        }
        xk4 xk4Var2 = xk4Var;
        Object objL = xk4Var2.f0;
        int i2 = xk4Var2.h0;
        try {
            if (i2 == 0) {
                w39.n0(objL);
                MainActivity mainActivity = this.Y;
                xk4Var2.h0 = 1;
                objL = MainActivity.L(mainActivity, str, false, null, null, null, xk4Var2, 248);
                c71 c71Var = c71.X;
                if (objL == c71Var) {
                    return c71Var;
                }
            } else {
                if (i2 != 1) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(objL);
            }
            ((Boolean) objL).getClass();
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
        return dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, su.happ.proxyutility.feature.main.MainActivity] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object l(Object obj, q51 q51Var) {
        Object value;
        xm4 xm4Var;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return a((String) obj, q51Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                pm4 pm4Var = (pm4) obj;
                int i = MainActivity.y1;
                StateDownloadFileV2.Loading.Progress progress = pm4Var.a;
                boolean z = progress instanceof StateDownloadFileV2.Error;
                ?? r0 = this.Y;
                if (z) {
                    b6 b6Var = r0.Q0;
                    if (b6Var == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    b6Var.q0.setCardBackgroundColor(w79.v((Context) r0, d36.bg_error));
                    b6 b6Var2 = r0.Q0;
                    if (b6Var2 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    b6Var2.H0.setText(r0.getString(y46.routing_downloading_geo_files_failure));
                    b6 b6Var3 = r0.Q0;
                    if (b6Var3 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    b6Var3.G0.setVisibility(8);
                    b6 b6Var4 = r0.Q0;
                    if (b6Var4 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    b6Var4.s0.setVisibility(0);
                    b6 b6Var5 = r0.Q0;
                    if (b6Var5 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    b6Var5.s0.setImageResource(q36.ic_error);
                    b6 b6Var6 = r0.Q0;
                    if (b6Var6 != null) {
                        rp7.g(14, b6Var6.q0, true, false);
                        return dn8Var;
                    }
                    dh3.T("binding");
                    throw null;
                }
                if (progress instanceof StateDownloadFileV2.Loading) {
                    b6 b6Var7 = r0.Q0;
                    if (b6Var7 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    b6Var7.q0.setCardBackgroundColor(w79.v((Context) r0, d36.bg_geo_card));
                    b6 b6Var8 = r0.Q0;
                    if (b6Var8 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    b6Var8.H0.setText(r0.getString(y46.routing_downloading_geo_files_progress));
                    if (progress instanceof StateDownloadFileV2.Loading.Progress) {
                        StateDownloadFileV2.Loading.Progress progress2 = progress;
                        Long lE = progress2.e();
                        b6 b6Var9 = r0.Q0;
                        if (lE == null) {
                            if (b6Var9 == null) {
                                dh3.T("binding");
                                throw null;
                            }
                            b6Var9.G0.setVisibility(8);
                        } else {
                            if (b6Var9 == null) {
                                dh3.T("binding");
                                throw null;
                            }
                            b6Var9.G0.setVisibility(0);
                            b6 b6Var10 = r0.Q0;
                            if (b6Var10 == null) {
                                dh3.T("binding");
                                throw null;
                            }
                            b6Var10.G0.setText(r0.getString(y46.routing_downloading_geo_files_progress_value, progress2.d(), x79.g(progress2.c()), x79.g(progress2.e().longValue())));
                        }
                    }
                    b6 b6Var11 = r0.Q0;
                    if (b6Var11 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    if (b6Var11.s0.getAnimation() == null) {
                        b6 b6Var12 = r0.Q0;
                        if (b6Var12 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        b6Var12.s0.setVisibility(0);
                        b6 b6Var13 = r0.Q0;
                        if (b6Var13 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        b6Var13.s0.setImageResource(q36.ic_loading);
                        b6 b6Var14 = r0.Q0;
                        if (b6Var14 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        b6Var14.s0.startAnimation(z91.E());
                    }
                    b6 b6Var15 = r0.Q0;
                    if (b6Var15 != null) {
                        rp7.g(14, b6Var15.q0, true, false);
                        return dn8Var;
                    }
                    dh3.T("binding");
                    throw null;
                }
                boolean z2 = progress instanceof StateDownloadFileV2.Success;
                if (z2) {
                    if (System.currentTimeMillis() - ((StateDownloadFileV2.Success) progress).c() <= 5000 && !pm4Var.b) {
                        b6 b6Var16 = r0.Q0;
                        if (b6Var16 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        b6Var16.q0.setCardBackgroundColor(w79.v((Context) r0, d36.bg_geo_card));
                        b6 b6Var17 = r0.Q0;
                        if (b6Var17 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        b6Var17.H0.setText(r0.getString(y46.geo_file_download_success));
                        b6 b6Var18 = r0.Q0;
                        if (b6Var18 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        b6Var18.G0.setVisibility(8);
                        b6 b6Var19 = r0.Q0;
                        if (b6Var19 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        oc.g(b6Var19.s0);
                        b6 b6Var20 = r0.Q0;
                        if (b6Var20 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        b6Var20.s0.setImageResource(q36.ic_success);
                        b6 b6Var21 = r0.Q0;
                        if (b6Var21 != null) {
                            rp7.g(14, b6Var21.q0, true, false);
                            return dn8Var;
                        }
                        dh3.T("binding");
                        throw null;
                    }
                }
                if (!z2 && progress != null) {
                    b61.c();
                    return null;
                }
                b6 b6Var22 = r0.Q0;
                if (b6Var22 == null) {
                    dh3.T("binding");
                    throw null;
                }
                rp7.g(14, b6Var22.q0, false, false);
                b6 b6Var23 = r0.Q0;
                if (b6Var23 == null) {
                    dh3.T("binding");
                    throw null;
                }
                b6Var23.G0.setVisibility(8);
                b6 b6Var24 = r0.Q0;
                if (b6Var24 != null) {
                    oc.g(b6Var24.s0);
                    return dn8Var;
                }
                dh3.T("binding");
                throw null;
            default:
                kn4 kn4Var = (kn4) obj;
                int i2 = MainActivity.y1;
                boolean z3 = kn4Var instanceof fn4;
                FragmentActivity fragmentActivity = this.Y;
                if (z3) {
                    gg8 gg8Var = ((fn4) kn4Var).a;
                    if (gg8Var instanceof cg8) {
                        String string = fragmentActivity.getString(y46.toast_dns_from_json_failed_to_retrieve_host, RouteSettings.DEFAULT_REMOTE_DNS_IP);
                        string.getClass();
                        pu.P(fragmentActivity, string);
                        return dn8Var;
                    }
                    if (gg8Var instanceof dg8) {
                        String string2 = fragmentActivity.getString(y46.toast_dns_from_json_invalid_ip, ((dg8) gg8Var).X, RouteSettings.DEFAULT_REMOTE_DNS_IP);
                        string2.getClass();
                        pu.P(fragmentActivity, string2);
                        return dn8Var;
                    }
                    if (gg8Var instanceof eg8) {
                        String string3 = fragmentActivity.getString(y46.toast_dns_from_json_missing_servers_section, RouteSettings.DEFAULT_REMOTE_DNS_IP);
                        string3.getClass();
                        pu.P(fragmentActivity, string3);
                        return dn8Var;
                    }
                    if (gg8Var instanceof fg8) {
                        return dn8Var;
                    }
                    b61.c();
                } else {
                    if (kn4Var instanceof gn4) {
                        b6 b6Var25 = fragmentActivity.Q0;
                        if (b6Var25 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        rp7.e(b6Var25.f0, true);
                        m51 m51Var = vh3.z1;
                        ml2 ml2VarN = fragmentActivity.n();
                        uh3 uh3Var = new uh3((byte) 0);
                        m51 m51Var2 = vh3.z1;
                        nf1 nf1Var = tp1.a;
                        jm4.Q(m51Var2, dm4.a, new jy2(ml2VarN, uh3Var, (q51) null, (byte) 3), 2);
                        return dn8Var;
                    }
                    if (kn4Var instanceof zm4) {
                        b6 b6Var26 = fragmentActivity.Q0;
                        if (b6Var26 != null) {
                            rp7.e(b6Var26.f0, false);
                            return dn8Var;
                        }
                        dh3.T("binding");
                        throw null;
                    }
                    if (kn4Var instanceof jn4) {
                        fragmentActivity.g0();
                        return dn8Var;
                    }
                    if (kn4Var instanceof ym4) {
                        fragmentActivity.C();
                        return dn8Var;
                    }
                    if (kn4Var instanceof hn4) {
                        be.m(fragmentActivity, fragmentActivity.getString(y46.warning_text), (String) null, fragmentActivity.getString(y46.warning_notification_disabled), fragmentActivity.getString(y46.settings), fragmentActivity.getString(y46.close), (Integer) null, new mj4(fragmentActivity, (byte) 10), (dn2) null, 1162);
                        return dn8Var;
                    }
                    if (kn4Var instanceof in4) {
                        be.m(fragmentActivity, fragmentActivity.getString(y46.warning_text), (String) null, fragmentActivity.getString(y46.warning_sub_reset), fragmentActivity.getString(y46.yes), fragmentActivity.getString(y46.no), (Integer) null, new a23(fragmentActivity, kn4Var, (byte) 7), (dn2) null, 1162);
                        return dn8Var;
                    }
                    if (kn4Var instanceof en4) {
                        pu.Q(fragmentActivity, y46.toast_success);
                        return dn8Var;
                    }
                    if (kn4Var instanceof cn4) {
                        pu.M(fragmentActivity, y46.routing_settings_profile_name_empty);
                        return dn8Var;
                    }
                    if (kn4Var instanceof dn4) {
                        pu.M(fragmentActivity, y46.routing_import_profile_main_error);
                        return dn8Var;
                    }
                    if (kn4Var instanceof bn4) {
                        bn4 bn4Var = (bn4) kn4Var;
                        ((gw5) fragmentActivity.g1.getValue()).e(new dw5(bn4Var.a, bn4Var.b, bn4Var.c, bn4Var.d, bn4Var.e, null));
                        return dn8Var;
                    }
                    if (kn4Var instanceof an4) {
                        ((za3) fragmentActivity.i1.getValue()).f(new sa3(((an4) kn4Var).a));
                        oh7 oh7Var = fragmentActivity.G().w;
                        do {
                            value = oh7Var.getValue();
                            xm4Var = (xm4) value;
                            xm4Var.getClass();
                        } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, null, null, false, 0, 0, null, null, false, null, false, null, false, true, null, 49151)));
                        return dn8Var;
                    }
                    b61.c();
                }
                return null;
        }
    }
}

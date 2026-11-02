package su.happ.proxyutility.ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import defpackage.e46;
import defpackage.ln7;
import defpackage.t46;
import defpackage.v6;
import defpackage.y46;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EDeeplinkType;
import su.happ.proxyutility.ui.foundation.component.HappInfoField;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDivider;
import su.happ.proxyutility.ui.foundation.component.HappSettingsTitle;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/ui/UrlSchemesSettingsActivity;", "Lsu/happ/proxyutility/ui/BaseActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class UrlSchemesSettingsActivity extends BaseActivity {
    public v6 Q0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r27v0, resolved type: su.happ.proxyutility.ui.UrlSchemesSettingsActivity */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final void onCreate(Bundle bundle) {
        Toolbar toolbarB;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(t46.activity_url_schemes_settings, (ViewGroup) null, false);
        int i = e46.cl_add_routing_profile;
        if (((LinearLayout) ln7.b(viewInflate, i)) != null) {
            i = e46.cl_add_server;
            if (((LinearLayout) ln7.b(viewInflate, i)) != null) {
                i = e46.cl_main;
                if (((ScrollView) ln7.b(viewInflate, i)) != null) {
                    i = e46.cl_start_vpn_tunnel;
                    if (((LinearLayout) ln7.b(viewInflate, i)) != null) {
                        i = e46.cl_stop_vpn_tunnel;
                        if (((LinearLayout) ln7.b(viewInflate, i)) != null) {
                            i = e46.cl_toggle_vpn_tunnel;
                            if (((LinearLayout) ln7.b(viewInflate, i)) != null) {
                                i = e46.divider_disconnect;
                                if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                                    i = e46.if_add;
                                    HappInfoField happInfoField = (HappInfoField) ln7.b(viewInflate, i);
                                    if (happInfoField != null) {
                                        i = e46.if_add_routing;
                                        HappInfoField happInfoField2 = (HappInfoField) ln7.b(viewInflate, i);
                                        if (happInfoField2 != null) {
                                            i = e46.if_close;
                                            HappInfoField happInfoField3 = (HappInfoField) ln7.b(viewInflate, i);
                                            if (happInfoField3 != null) {
                                                i = e46.if_close_without_ui;
                                                HappInfoField happInfoField4 = (HappInfoField) ln7.b(viewInflate, i);
                                                if (happInfoField4 != null) {
                                                    i = e46.if_connect;
                                                    HappInfoField happInfoField5 = (HappInfoField) ln7.b(viewInflate, i);
                                                    if (happInfoField5 != null) {
                                                        i = e46.if_connect_without_ui;
                                                        HappInfoField happInfoField6 = (HappInfoField) ln7.b(viewInflate, i);
                                                        if (happInfoField6 != null) {
                                                            i = e46.if_crypt;
                                                            HappInfoField happInfoField7 = (HappInfoField) ln7.b(viewInflate, i);
                                                            if (happInfoField7 != null) {
                                                                i = e46.if_crypt2;
                                                                HappInfoField happInfoField8 = (HappInfoField) ln7.b(viewInflate, i);
                                                                if (happInfoField8 != null) {
                                                                    i = e46.if_crypt3;
                                                                    HappInfoField happInfoField9 = (HappInfoField) ln7.b(viewInflate, i);
                                                                    if (happInfoField9 != null) {
                                                                        i = e46.if_crypt4;
                                                                        HappInfoField happInfoField10 = (HappInfoField) ln7.b(viewInflate, i);
                                                                        if (happInfoField10 != null) {
                                                                            i = e46.if_crypt5;
                                                                            HappInfoField happInfoField11 = (HappInfoField) ln7.b(viewInflate, i);
                                                                            if (happInfoField11 != null) {
                                                                                i = e46.if_disconnect;
                                                                                HappInfoField happInfoField12 = (HappInfoField) ln7.b(viewInflate, i);
                                                                                if (happInfoField12 != null) {
                                                                                    i = e46.if_disconnect_without_ui;
                                                                                    HappInfoField happInfoField13 = (HappInfoField) ln7.b(viewInflate, i);
                                                                                    if (happInfoField13 != null) {
                                                                                        i = e46.if_off_routing;
                                                                                        HappInfoField happInfoField14 = (HappInfoField) ln7.b(viewInflate, i);
                                                                                        if (happInfoField14 != null) {
                                                                                            i = e46.if_onadd_routing;
                                                                                            HappInfoField happInfoField15 = (HappInfoField) ln7.b(viewInflate, i);
                                                                                            if (happInfoField15 != null) {
                                                                                                i = e46.if_open;
                                                                                                HappInfoField happInfoField16 = (HappInfoField) ln7.b(viewInflate, i);
                                                                                                if (happInfoField16 != null) {
                                                                                                    i = e46.if_open_without_ui;
                                                                                                    HappInfoField happInfoField17 = (HappInfoField) ln7.b(viewInflate, i);
                                                                                                    if (happInfoField17 != null) {
                                                                                                        i = e46.if_toggle;
                                                                                                        HappInfoField happInfoField18 = (HappInfoField) ln7.b(viewInflate, i);
                                                                                                        if (happInfoField18 != null) {
                                                                                                            i = e46.if_toggle_without_ui;
                                                                                                            HappInfoField happInfoField19 = (HappInfoField) ln7.b(viewInflate, i);
                                                                                                            if (happInfoField19 != null) {
                                                                                                                i = e46.title_add_routing_profile;
                                                                                                                if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null) {
                                                                                                                    i = e46.title_add_server;
                                                                                                                    if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null) {
                                                                                                                        i = e46.title_start_vpn_tunnel;
                                                                                                                        if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null) {
                                                                                                                            i = e46.title_stop_vpn_tunnel;
                                                                                                                            if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null) {
                                                                                                                                i = e46.title_toggle_vpn_tunnel;
                                                                                                                                if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null && (toolbarB = ln7.b(viewInflate, (i = e46.toolbar))) != null) {
                                                                                                                                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                                                                                                                                    this.Q0 = new v6(linearLayout, happInfoField, happInfoField2, happInfoField3, happInfoField4, happInfoField5, happInfoField6, happInfoField7, happInfoField8, happInfoField9, happInfoField10, happInfoField11, happInfoField12, happInfoField13, happInfoField14, happInfoField15, happInfoField16, happInfoField17, happInfoField18, happInfoField19, toolbarB);
                                                                                                                                    setContentView(linearLayout);
                                                                                                                                    v6 v6Var = this.Q0;
                                                                                                                                    if (v6Var == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    LinearLayout linearLayout2 = v6Var.X;
                                                                                                                                    linearLayout2.getClass();
                                                                                                                                    setBarsParams(linearLayout2);
                                                                                                                                    v6 v6Var2 = this.Q0;
                                                                                                                                    if (v6Var2 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    r(v6Var2.w0);
                                                                                                                                    setTitle(getString(y46.title_url_schemes));
                                                                                                                                    boolean zY = ue3.y(this);
                                                                                                                                    v6 v6Var3 = this.Q0;
                                                                                                                                    if (v6Var3 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var3.h0.setFocusableInTouchMode(zY);
                                                                                                                                    v6 v6Var4 = this.Q0;
                                                                                                                                    if (v6Var4 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var4.i0.setFocusableInTouchMode(zY);
                                                                                                                                    v6 v6Var5 = this.Q0;
                                                                                                                                    if (v6Var5 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var5.s0.setFocusableInTouchMode(zY);
                                                                                                                                    v6 v6Var6 = this.Q0;
                                                                                                                                    if (v6Var6 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var6.t0.setFocusableInTouchMode(zY);
                                                                                                                                    v6 v6Var7 = this.Q0;
                                                                                                                                    if (v6Var7 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var7.o0.setFocusableInTouchMode(zY);
                                                                                                                                    v6 v6Var8 = this.Q0;
                                                                                                                                    if (v6Var8 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var8.p0.setFocusableInTouchMode(zY);
                                                                                                                                    v6 v6Var9 = this.Q0;
                                                                                                                                    if (v6Var9 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var9.f0.setFocusableInTouchMode(zY);
                                                                                                                                    v6 v6Var10 = this.Q0;
                                                                                                                                    if (v6Var10 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var10.g0.setFocusableInTouchMode(zY);
                                                                                                                                    v6 v6Var11 = this.Q0;
                                                                                                                                    if (v6Var11 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var11.u0.setFocusableInTouchMode(zY);
                                                                                                                                    v6 v6Var12 = this.Q0;
                                                                                                                                    if (v6Var12 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var12.v0.setFocusableInTouchMode(zY);
                                                                                                                                    v6 v6Var13 = this.Q0;
                                                                                                                                    if (v6Var13 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var13.Y.setFocusableInTouchMode(zY);
                                                                                                                                    v6 v6Var14 = this.Q0;
                                                                                                                                    if (v6Var14 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var14.j0.setFocusableInTouchMode(zY);
                                                                                                                                    v6 v6Var15 = this.Q0;
                                                                                                                                    if (v6Var15 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var15.k0.setFocusableInTouchMode(zY);
                                                                                                                                    v6 v6Var16 = this.Q0;
                                                                                                                                    if (v6Var16 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var16.l0.setFocusableInTouchMode(zY);
                                                                                                                                    v6 v6Var17 = this.Q0;
                                                                                                                                    if (v6Var17 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var17.m0.setFocusableInTouchMode(zY);
                                                                                                                                    v6 v6Var18 = this.Q0;
                                                                                                                                    if (v6Var18 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var18.n0.setFocusableInTouchMode(zY);
                                                                                                                                    v6 v6Var19 = this.Q0;
                                                                                                                                    if (v6Var19 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var19.Z.setFocusableInTouchMode(zY);
                                                                                                                                    v6 v6Var20 = this.Q0;
                                                                                                                                    if (v6Var20 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var20.r0.setFocusableInTouchMode(zY);
                                                                                                                                    v6 v6Var21 = this.Q0;
                                                                                                                                    if (v6Var21 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var21.q0.setFocusableInTouchMode(zY);
                                                                                                                                    v6 v6Var22 = this.Q0;
                                                                                                                                    if (v6Var22 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var22.h0.setTitle("happ://" + EDeeplinkType.CONNECT.getPrefix());
                                                                                                                                    v6 v6Var23 = this.Q0;
                                                                                                                                    if (v6Var23 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var23.i0.setTitle("happ://" + EDeeplinkType.CONNECT_WITHOUT_UI.getPrefix());
                                                                                                                                    v6 v6Var24 = this.Q0;
                                                                                                                                    if (v6Var24 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var24.s0.setTitle("happ://" + EDeeplinkType.OPEN.getPrefix());
                                                                                                                                    v6 v6Var25 = this.Q0;
                                                                                                                                    if (v6Var25 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var25.t0.setTitle("happ://" + EDeeplinkType.OPEN_WITHOUT_UI.getPrefix());
                                                                                                                                    v6 v6Var26 = this.Q0;
                                                                                                                                    if (v6Var26 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var26.o0.setTitle("happ://" + EDeeplinkType.DISCONNECT.getPrefix());
                                                                                                                                    v6 v6Var27 = this.Q0;
                                                                                                                                    if (v6Var27 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var27.p0.setTitle("happ://" + EDeeplinkType.DISCONNECT_WITHOUT_UI.getPrefix());
                                                                                                                                    v6 v6Var28 = this.Q0;
                                                                                                                                    if (v6Var28 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var28.f0.setTitle("happ://" + EDeeplinkType.CLOSE.getPrefix());
                                                                                                                                    v6 v6Var29 = this.Q0;
                                                                                                                                    if (v6Var29 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var29.g0.setTitle("happ://" + EDeeplinkType.CLOSE_WITHOUT_UI.getPrefix());
                                                                                                                                    v6 v6Var30 = this.Q0;
                                                                                                                                    if (v6Var30 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var30.u0.setTitle("happ://" + EDeeplinkType.TOGGLE.getPrefix());
                                                                                                                                    v6 v6Var31 = this.Q0;
                                                                                                                                    if (v6Var31 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var31.v0.setTitle("happ://" + EDeeplinkType.TOGGLE_WITHOUT_UI.getPrefix());
                                                                                                                                    v6 v6Var32 = this.Q0;
                                                                                                                                    if (v6Var32 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var32.Y.setTitle("happ://" + EDeeplinkType.ADD.getPrefix() + "{url}");
                                                                                                                                    v6 v6Var33 = this.Q0;
                                                                                                                                    if (v6Var33 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var33.j0.setTitle("happ://" + EDeeplinkType.CRYPTO.getPrefix() + "{url}");
                                                                                                                                    v6 v6Var34 = this.Q0;
                                                                                                                                    if (v6Var34 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var34.k0.setTitle("happ://" + EDeeplinkType.CRYPTO2.getPrefix() + "{url}");
                                                                                                                                    v6 v6Var35 = this.Q0;
                                                                                                                                    if (v6Var35 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var35.l0.setTitle("happ://" + EDeeplinkType.CRYPTO3.getPrefix() + "{url}");
                                                                                                                                    v6 v6Var36 = this.Q0;
                                                                                                                                    if (v6Var36 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var36.m0.setTitle("happ://" + EDeeplinkType.CRYPTO4.getPrefix() + "{url}");
                                                                                                                                    v6 v6Var37 = this.Q0;
                                                                                                                                    if (v6Var37 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var37.n0.setTitle("happ://" + EDeeplinkType.CRYPTO5.getPrefix() + "{url}");
                                                                                                                                    v6 v6Var38 = this.Q0;
                                                                                                                                    if (v6Var38 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    HappInfoField happInfoField20 = v6Var38.Z;
                                                                                                                                    EDeeplinkType eDeeplinkType = EDeeplinkType.ROUTING;
                                                                                                                                    happInfoField20.setTitle("happ://" + eDeeplinkType.getPrefix() + "add/{base64}");
                                                                                                                                    v6 v6Var39 = this.Q0;
                                                                                                                                    if (v6Var39 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var39.r0.setTitle("happ://" + eDeeplinkType.getPrefix() + "onadd/{base64}");
                                                                                                                                    v6 v6Var40 = this.Q0;
                                                                                                                                    if (v6Var40 == null) {
                                                                                                                                        dh3.T("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    v6Var40.q0.setTitle("happ://" + eDeeplinkType.getPrefix() + "off");
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        b61.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final Toolbar v() {
        v6 v6Var = this.Q0;
        if (v6Var != null) {
            return v6Var.w0;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final boolean x() {
        v6 v6Var = this.Q0;
        if (v6Var != null) {
            return v6Var.h0.requestFocus();
        }
        dh3.T("binding");
        throw null;
    }
}

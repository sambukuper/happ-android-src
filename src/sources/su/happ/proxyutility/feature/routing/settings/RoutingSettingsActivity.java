package su.happ.proxyutility.feature.routing.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import defpackage.e46;
import defpackage.ln7;
import defpackage.t46;
import defpackage.wm6;
import defpackage.y46;
import kotlin.Metadata;
import su.happ.proxyutility.domain.routing.entity.RouteProfile;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.routing.settings.RoutingSettingsActivity;
import su.happ.proxyutility.ui.BaseActivity;
import su.happ.proxyutility.ui.foundation.component.HappForwardField;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDivider;
import su.happ.proxyutility.ui.foundation.component.HappSettingsTitle;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;
import su.happ.proxyutility.ui.foundation.component.HappToggleField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsActivity;", "Lsu/happ/proxyutility/ui/BaseActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class RoutingSettingsActivity extends BaseActivity {
    public static final /* synthetic */ int T0 = 0;
    public d6 Q0;
    public final vz7 R0 = new vz7(new w76((byte) 17));
    public final vz7 S0 = new vz7(new hr5(this, (byte) 9));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: su.happ.proxyutility.feature.routing.settings.RoutingSettingsActivity */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final void onCreate(Bundle bundle) {
        Toolbar toolbarB;
        super.onCreate(bundle);
        final byte b = 0;
        View viewInflate = getLayoutInflater().inflate(t46.activity_routing_settings, (ViewGroup) null, false);
        int i = e46.divider_direct;
        if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
            i = e46.divider_proxy;
            if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                i = e46.ff_block;
                HappForwardField happForwardField = (HappForwardField) ln7.b(viewInflate, i);
                if (happForwardField != null) {
                    i = e46.ff_direct;
                    HappForwardField happForwardField2 = (HappForwardField) ln7.b(viewInflate, i);
                    if (happForwardField2 != null) {
                        i = e46.ff_proxy;
                        HappForwardField happForwardField3 = (HappForwardField) ln7.b(viewInflate, i);
                        if (happForwardField3 != null) {
                            i = e46.ll_main;
                            if (((LinearLayout) ln7.b(viewInflate, i)) != null) {
                                i = e46.ll_order_routing;
                                if (((LinearLayout) ln7.b(viewInflate, i)) != null) {
                                    i = e46.ll_proxy_edit;
                                    LinearLayout linearLayout = (LinearLayout) ln7.b(viewInflate, i);
                                    if (linearLayout != null) {
                                        i = e46.ll_route_settings;
                                        if (((LinearLayout) ln7.b(viewInflate, i)) != null) {
                                            i = e46.spinner_order_routing;
                                            HappSpinnerField happSpinnerField = (HappSpinnerField) ln7.b(viewInflate, i);
                                            if (happSpinnerField != null) {
                                                i = e46.title_order_routing;
                                                if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null) {
                                                    i = e46.title_proxy_edit;
                                                    if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null) {
                                                        i = e46.title_route_settings;
                                                        if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null) {
                                                            i = e46.toggle_proxy_edit;
                                                            HappToggleField happToggleField = (HappToggleField) ln7.b(viewInflate, i);
                                                            if (happToggleField != null && (toolbarB = ln7.b(viewInflate, (i = e46.toolbar))) != null) {
                                                                LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                                                                this.Q0 = new d6(linearLayout2, happForwardField, happForwardField2, happForwardField3, linearLayout, happSpinnerField, happToggleField, toolbarB, (byte) 1);
                                                                setContentView(linearLayout2);
                                                                mb6.g((wm6) this.S0.getValue());
                                                                d6 d6Var = this.Q0;
                                                                if (d6Var == null) {
                                                                    dh3.T("binding");
                                                                    throw null;
                                                                }
                                                                LinearLayout linearLayout3 = (LinearLayout) d6Var.Y;
                                                                linearLayout3.getClass();
                                                                setBarsParams(linearLayout3);
                                                                d6 d6Var2 = this.Q0;
                                                                if (d6Var2 == null) {
                                                                    dh3.T("binding");
                                                                    throw null;
                                                                }
                                                                r((Toolbar) d6Var2.f0);
                                                                setTitle(getString(y46.routing_activity_title));
                                                                final String stringExtra = getIntent().getStringExtra("profileId");
                                                                if (stringExtra == null) {
                                                                    finishAffinity();
                                                                    return;
                                                                }
                                                                final Intent intentPutExtra = new Intent((Context) this, (Class<?>) RoutingSettingsEditActivity.class).addFlags(268435456).putExtra("profileId", stringExtra);
                                                                intentPutExtra.getClass();
                                                                mn6 mn6Var = (mn6) this.R0.getValue();
                                                                vz7 vz7Var = mn6.j;
                                                                RouteProfile routeProfileN = mn6Var.n(stringExtra, (String) null);
                                                                if (routeProfileN != null) {
                                                                    d6 d6Var3 = this.Q0;
                                                                    if (d6Var3 == null) {
                                                                        dh3.T("binding");
                                                                        throw null;
                                                                    }
                                                                    ((HappToggleField) d6Var3.k0).setChecked(routeProfileN.b().getRouteSettings().getGlobalProxy());
                                                                    d6 d6Var4 = this.Q0;
                                                                    if (d6Var4 == null) {
                                                                        dh3.T("binding");
                                                                        throw null;
                                                                    }
                                                                    ((HappToggleField) d6Var4.k0).setOnToggleClickListener(new gn2(this) { // from class: sp6
                                                                        public final /* synthetic */ RoutingSettingsActivity Y;

                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                        {
                                                                            this.Y = this;
                                                                        }

                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                        public final Object B(Object obj) {
                                                                            byte b2 = b;
                                                                            dn8 dn8Var = dn8.a;
                                                                            String str = stringExtra;
                                                                            RoutingSettingsActivity routingSettingsActivity = this.Y;
                                                                            switch (b2) {
                                                                                case 0:
                                                                                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                                                                    int i2 = RoutingSettingsActivity.T0;
                                                                                    mn6 mn6Var2 = (mn6) routingSettingsActivity.R0.getValue();
                                                                                    as asVar = new as((byte) 3, zBooleanValue);
                                                                                    vz7 vz7Var2 = mn6.j;
                                                                                    mn6Var2.D(str, (String) null, asVar);
                                                                                    break;
                                                                                default:
                                                                                    int iIntValue = ((Integer) obj).intValue();
                                                                                    int i3 = RoutingSettingsActivity.T0;
                                                                                    mn6 mn6Var3 = (mn6) routingSettingsActivity.R0.getValue();
                                                                                    qb qbVar = new qb((byte) 7, iIntValue);
                                                                                    vz7 vz7Var3 = mn6.j;
                                                                                    mn6Var3.D(str, (String) null, qbVar);
                                                                                    break;
                                                                            }
                                                                            return dn8Var;
                                                                        }
                                                                    });
                                                                    d6 d6Var5 = this.Q0;
                                                                    if (d6Var5 == null) {
                                                                        dh3.T("binding");
                                                                        throw null;
                                                                    }
                                                                    ((HappSpinnerField) d6Var5.Z).setSelection(routeProfileN.b().getRouteSettings().getRouteOrder().ordinal());
                                                                }
                                                                d6 d6Var6 = this.Q0;
                                                                if (d6Var6 == null) {
                                                                    dh3.T("binding");
                                                                    throw null;
                                                                }
                                                                ((HappForwardField) d6Var6.i0).setOnForwardIconClickListener(new dn2(this) { // from class: tp6
                                                                    public final /* synthetic */ RoutingSettingsActivity Y;

                                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                    {
                                                                        this.Y = this;
                                                                    }

                                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                    public final Object invoke() {
                                                                        byte b2 = b;
                                                                        dn8 dn8Var = dn8.a;
                                                                        Intent intent = intentPutExtra;
                                                                        AppCompatActivity appCompatActivity = this.Y;
                                                                        switch (b2) {
                                                                            case 0:
                                                                                int i2 = RoutingSettingsActivity.T0;
                                                                                appCompatActivity.startActivity(intent.putExtra("routingSettingsEditType", "PROXY"));
                                                                                break;
                                                                            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                                int i3 = RoutingSettingsActivity.T0;
                                                                                appCompatActivity.startActivity(intent.putExtra("routingSettingsEditType", "DIRECT"));
                                                                                break;
                                                                            default:
                                                                                int i4 = RoutingSettingsActivity.T0;
                                                                                appCompatActivity.startActivity(intent.putExtra("routingSettingsEditType", "BLOCK"));
                                                                                break;
                                                                        }
                                                                        return dn8Var;
                                                                    }
                                                                });
                                                                d6 d6Var7 = this.Q0;
                                                                if (d6Var7 == null) {
                                                                    dh3.T("binding");
                                                                    throw null;
                                                                }
                                                                final byte b2 = 1;
                                                                ((HappForwardField) d6Var7.h0).setOnForwardIconClickListener(new dn2(this) { // from class: tp6
                                                                    public final /* synthetic */ RoutingSettingsActivity Y;

                                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                    {
                                                                        this.Y = this;
                                                                    }

                                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                    public final Object invoke() {
                                                                        byte b3 = b2;
                                                                        dn8 dn8Var = dn8.a;
                                                                        Intent intent = intentPutExtra;
                                                                        AppCompatActivity appCompatActivity = this.Y;
                                                                        switch (b3) {
                                                                            case 0:
                                                                                int i2 = RoutingSettingsActivity.T0;
                                                                                appCompatActivity.startActivity(intent.putExtra("routingSettingsEditType", "PROXY"));
                                                                                break;
                                                                            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                                int i3 = RoutingSettingsActivity.T0;
                                                                                appCompatActivity.startActivity(intent.putExtra("routingSettingsEditType", "DIRECT"));
                                                                                break;
                                                                            default:
                                                                                int i4 = RoutingSettingsActivity.T0;
                                                                                appCompatActivity.startActivity(intent.putExtra("routingSettingsEditType", "BLOCK"));
                                                                                break;
                                                                        }
                                                                        return dn8Var;
                                                                    }
                                                                });
                                                                d6 d6Var8 = this.Q0;
                                                                if (d6Var8 == null) {
                                                                    dh3.T("binding");
                                                                    throw null;
                                                                }
                                                                final byte b3 = 2;
                                                                ((HappForwardField) d6Var8.g0).setOnForwardIconClickListener(new dn2(this) { // from class: tp6
                                                                    public final /* synthetic */ RoutingSettingsActivity Y;

                                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                    {
                                                                        this.Y = this;
                                                                    }

                                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                    public final Object invoke() {
                                                                        byte b4 = b3;
                                                                        dn8 dn8Var = dn8.a;
                                                                        Intent intent = intentPutExtra;
                                                                        AppCompatActivity appCompatActivity = this.Y;
                                                                        switch (b4) {
                                                                            case 0:
                                                                                int i2 = RoutingSettingsActivity.T0;
                                                                                appCompatActivity.startActivity(intent.putExtra("routingSettingsEditType", "PROXY"));
                                                                                break;
                                                                            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                                int i3 = RoutingSettingsActivity.T0;
                                                                                appCompatActivity.startActivity(intent.putExtra("routingSettingsEditType", "DIRECT"));
                                                                                break;
                                                                            default:
                                                                                int i4 = RoutingSettingsActivity.T0;
                                                                                appCompatActivity.startActivity(intent.putExtra("routingSettingsEditType", "BLOCK"));
                                                                                break;
                                                                        }
                                                                        return dn8Var;
                                                                    }
                                                                });
                                                                d6 d6Var9 = this.Q0;
                                                                if (d6Var9 == null) {
                                                                    dh3.T("binding");
                                                                    throw null;
                                                                }
                                                                HappSpinnerField happSpinnerField2 = (HappSpinnerField) d6Var9.Z;
                                                                if (d6Var9 == null) {
                                                                    dh3.T("binding");
                                                                    throw null;
                                                                }
                                                                LinearLayout linearLayout4 = (LinearLayout) d6Var9.Y;
                                                                linearLayout4.getClass();
                                                                i21.O(happSpinnerField2, linearLayout4, new gn2(this) { // from class: sp6
                                                                    public final /* synthetic */ RoutingSettingsActivity Y;

                                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                    {
                                                                        this.Y = this;
                                                                    }

                                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                    public final Object B(Object obj) {
                                                                        byte b4 = b2;
                                                                        dn8 dn8Var = dn8.a;
                                                                        String str = stringExtra;
                                                                        RoutingSettingsActivity routingSettingsActivity = this.Y;
                                                                        switch (b4) {
                                                                            case 0:
                                                                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                                                                int i2 = RoutingSettingsActivity.T0;
                                                                                mn6 mn6Var2 = (mn6) routingSettingsActivity.R0.getValue();
                                                                                as asVar = new as((byte) 3, zBooleanValue);
                                                                                vz7 vz7Var2 = mn6.j;
                                                                                mn6Var2.D(str, (String) null, asVar);
                                                                                break;
                                                                            default:
                                                                                int iIntValue = ((Integer) obj).intValue();
                                                                                int i3 = RoutingSettingsActivity.T0;
                                                                                mn6 mn6Var3 = (mn6) routingSettingsActivity.R0.getValue();
                                                                                qb qbVar = new qb((byte) 7, iIntValue);
                                                                                vz7 vz7Var3 = mn6.j;
                                                                                mn6Var3.D(str, (String) null, qbVar);
                                                                                break;
                                                                        }
                                                                        return dn8Var;
                                                                    }
                                                                });
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
        b61.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final Toolbar v() {
        d6 d6Var = this.Q0;
        if (d6Var != null) {
            return (Toolbar) d6Var.f0;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final boolean x() {
        d6 d6Var = this.Q0;
        if (d6Var != null) {
            return ((LinearLayout) d6Var.j0).requestFocus();
        }
        dh3.T("binding");
        throw null;
    }
}

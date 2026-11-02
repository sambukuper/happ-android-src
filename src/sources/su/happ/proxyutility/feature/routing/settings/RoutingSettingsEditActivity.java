package su.happ.proxyutility.feature.routing.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import defpackage.e46;
import defpackage.fq6;
import defpackage.gq6;
import defpackage.iq6;
import defpackage.ln7;
import defpackage.m26;
import defpackage.mr2;
import defpackage.ss8;
import defpackage.t46;
import defpackage.v46;
import defpackage.wl7;
import defpackage.wp6;
import defpackage.x79;
import defpackage.xp6;
import defpackage.y46;
import defpackage.ym6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.routing.entity.RouteProfile;
import su.happ.proxyutility.domain.routing.entity.RouteSettingsCache;
import su.happ.proxyutility.dto.RouteSettings;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.ERoutingSettingsType;
import su.happ.proxyutility.feature.routing.settings.RoutingSettingsEditActivity;
import su.happ.proxyutility.ui.BaseActivity;
import su.happ.proxyutility.ui.foundation.component.HappForwardField;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDivider;
import su.happ.proxyutility.ui.foundation.component.HappSettingsTitle;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsEditActivity;", "Lsu/happ/proxyutility/ui/BaseActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class RoutingSettingsEditActivity extends BaseActivity {
    public static final /* synthetic */ int U0 = 0;
    public fu6 Q0;
    public final mn6 R0;
    public final y5 S0;
    public final vz7 T0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RoutingSettingsEditActivity() {
        HappApplication happApplication = HappApplication.M0;
        this.R0 = k32.i().f();
        this.S0 = new y5(yb6.a.b(iq6.class), new xp6(this, (byte) 1), new xp6(this, (byte) 0), new xp6(this, (byte) 2));
        this.T0 = new vz7(new hr5(this, (byte) 10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final iq6 A() {
        return (iq6) this.S0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: su.happ.proxyutility.feature.routing.settings.RoutingSettingsEditActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void B(boolean z) {
        byte b;
        iq6 iq6VarA = A();
        fu6 fu6Var = this.Q0;
        if (fu6Var == null) {
            dh3.T("binding");
            throw null;
        }
        List listF0 = fm7.F0(String.valueOf(((AppCompatEditText) fu6Var.Z).getText()), new String[]{",", " ", "\n"}, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it = listF0.iterator();
        while (it.hasNext()) {
            String string = fm7.R0((String) it.next()).toString();
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                arrayList.add(string);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            b = 0;
            if (!it2.hasNext()) {
                break;
            }
            String str = (String) it2.next();
            if (!mm7.Z(str, false, "geoip:")) {
                ss8 ss8Var = ss8.a;
                if (!ss8.A(str)) {
                    if (mm7.Z(str, false, "geosite:") || mm7.Z(str, false, "regexp:") || mm7.Z(str, false, "domain:") || mm7.Z(str, false, "full:")) {
                        arrayList3.add(str);
                    } else {
                        arrayList3.add(str);
                    }
                }
            }
            arrayList2.add(str);
        }
        Map mapJ = zp4.J(new qg5[]{new qg5(mr2.GEOIP, arrayList2), new qg5(mr2.GEOSITE, arrayList3)});
        mn6 mn6Var = iq6VarA.b;
        String str2 = ((fq6) iq6VarA.d.X.getValue()).X;
        gq6 gq6Var = new gq6(iq6VarA, mapJ, b);
        vz7 vz7Var = mn6.j;
        if (mn6Var.D(str2, (String) null, gq6Var) == null || z) {
            return;
        }
        x79.h(this, y46.toast_success);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void C() {
        ArrayList arrayListH0;
        String strY0;
        fu6 fu6Var = this.Q0;
        if (fu6Var == null) {
            dh3.T("binding");
            throw null;
        }
        AppCompatEditText appCompatEditText = (AppCompatEditText) fu6Var.Z;
        String str = ((fq6) A().d.X.getValue()).X;
        vz7 vz7Var = mn6.j;
        RouteProfile routeProfileN = this.R0.n(str, (String) null);
        if (routeProfileN == null) {
            strY0 = "";
        } else {
            RouteSettings routeSettings = routeProfileN.b().getRouteSettings();
            int i = wp6.a[((fq6) A().d.X.getValue()).Z.ordinal()];
            if (i == 1) {
                arrayListH0 = wv0.H0(routeSettings.getProxyIp(), routeSettings.getProxySites());
            } else if (i == 2) {
                arrayListH0 = wv0.H0(routeSettings.getDirectIp(), routeSettings.getDirectSites());
            } else {
                if (i != 3) {
                    b61.c();
                    return;
                }
                arrayListH0 = wv0.H0(routeSettings.getBlockIp(), routeSettings.getBlockSites());
            }
            strY0 = wv0.y0(arrayListH0, "\n", (String) null, (String) null, (gn2) null, 62);
        }
        appCompatEditText.setText(wl7.e0(strY0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: su.happ.proxyutility.feature.routing.settings.RoutingSettingsEditActivity */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final void onCreate(Bundle bundle) {
        AppCompatEditText appCompatEditTextB;
        Toolbar toolbarB;
        Object value;
        fq6 fq6Var;
        Object next;
        String string;
        Object value2;
        fq6 fq6Var2;
        super.onCreate(bundle);
        final byte b = 0;
        View viewInflate = getLayoutInflater().inflate(t46.activity_routing_settings_edit, (ViewGroup) null, false);
        int i = e46.divider_route_show_tags_geo_site;
        if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null && (appCompatEditTextB = ln7.b(viewInflate, (i = e46.et_routing_content))) != null) {
            i = e46.ff_route_show_tags_geo_ip;
            HappForwardField happForwardField = (HappForwardField) ln7.b(viewInflate, i);
            if (happForwardField != null) {
                i = e46.ff_route_show_tags_geo_site;
                HappForwardField happForwardField2 = (HappForwardField) ln7.b(viewInflate, i);
                if (happForwardField2 != null) {
                    i = e46.ll_main;
                    if (((LinearLayout) ln7.b(viewInflate, i)) != null) {
                        i = e46.ll_route_settings_show_tags;
                        if (((LinearLayout) ln7.b(viewInflate, i)) != null) {
                            i = e46.title_routing_settings;
                            AppCompatTextView appCompatTextView = (HappSettingsTitle) ln7.b(viewInflate, i);
                            if (appCompatTextView != null && (toolbarB = ln7.b(viewInflate, (i = e46.toolbar))) != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                this.Q0 = new fu6(linearLayout, appCompatEditTextB, happForwardField, happForwardField2, appCompatTextView, toolbarB, (byte) 1);
                                setContentView(linearLayout);
                                mb6.g((ym6) this.T0.getValue());
                                fu6 fu6Var = this.Q0;
                                if (fu6Var == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                LinearLayout linearLayout2 = (LinearLayout) fu6Var.Y;
                                linearLayout2.getClass();
                                setBarsParams(linearLayout2);
                                fu6 fu6Var2 = this.Q0;
                                if (fu6Var2 == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                r((Toolbar) fu6Var2.i0);
                                String stringExtra = getIntent().getStringExtra("profileId");
                                if (stringExtra == null) {
                                    finishAffinity();
                                    return;
                                }
                                oh7 oh7Var = A().c;
                                oh7Var.getClass();
                                do {
                                    value = oh7Var.getValue();
                                    fq6Var = (fq6) value;
                                    fq6Var.getClass();
                                } while (!oh7Var.k(value, fq6.c(fq6Var, stringExtra, null, 6)));
                                fu6 fu6Var3 = this.Q0;
                                if (fu6Var3 == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                AppCompatEditText appCompatEditText = (AppCompatEditText) fu6Var3.Z;
                                int minLines = appCompatEditText.getMinLines();
                                fu6 fu6Var4 = this.Q0;
                                if (fu6Var4 == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                appCompatEditText.setMaxHeight(((AppCompatEditText) fu6Var4.Z).getLineHeight() * minLines);
                                String stringExtra2 = getIntent().getStringExtra("routingSettingsEditType");
                                if (stringExtra2 == null) {
                                    stringExtra2 = "PROXY";
                                }
                                Iterator it = ERoutingSettingsType.a().iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!dh3.f(((ERoutingSettingsType) next).name(), stringExtra2));
                                ERoutingSettingsType eRoutingSettingsType = (ERoutingSettingsType) next;
                                if (eRoutingSettingsType != null) {
                                    oh7 oh7Var2 = A().c;
                                    oh7Var2.getClass();
                                    do {
                                        value2 = oh7Var2.getValue();
                                        fq6Var2 = (fq6) value2;
                                        fq6Var2.getClass();
                                    } while (!oh7Var2.k(value2, fq6.c(fq6Var2, null, eRoutingSettingsType, 3)));
                                }
                                String[] stringArray = getResources().getStringArray(m26.routing_tag);
                                stringArray.getClass();
                                fu6 fu6Var5 = this.Q0;
                                if (fu6Var5 == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                AppCompatTextView appCompatTextView2 = (HappSettingsTitle) fu6Var5.h0;
                                String str = stringArray[((fq6) A().d.X.getValue()).Z.ordinal()];
                                str.getClass();
                                CharSequence upperCase = str.toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                                appCompatTextView2.setText(upperCase);
                                fu6 fu6Var6 = this.Q0;
                                if (fu6Var6 == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                Toolbar toolbar = (Toolbar) fu6Var6.i0;
                                int i2 = wp6.a[((fq6) A().d.X.getValue()).Z.ordinal()];
                                final byte b2 = 1;
                                if (i2 == 1) {
                                    string = getString(y46.routing_activity_proxy);
                                } else if (i2 == 2) {
                                    string = getString(y46.routing_activity_direct);
                                } else {
                                    if (i2 != 3) {
                                        b61.c();
                                        return;
                                    }
                                    string = getString(y46.routing_activity_block);
                                }
                                toolbar.setTitle(string);
                                final Intent intentPutExtra = new Intent((Context) this, (Class<?>) RoutingSettingsEditSearchActivity.class).addFlags(268435456).putExtra("profileId", ((fq6) A().d.X.getValue()).X).putExtra("routingSettingsEditType", ((fq6) A().d.X.getValue()).Z.name());
                                intentPutExtra.getClass();
                                fu6 fu6Var7 = this.Q0;
                                if (fu6Var7 == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                ((HappForwardField) fu6Var7.f0).setOnForwardIconClickListener(new dn2(this) { // from class: vp6
                                    public final /* synthetic */ RoutingSettingsEditActivity Y;

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    {
                                        this.Y = this;
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    /* JADX WARN: Type inference failed for: r5v1, types: [android.content.Context, su.happ.proxyutility.feature.routing.settings.RoutingSettingsEditActivity] */
                                    public final Object invoke() {
                                        byte b3 = b;
                                        dn8 dn8Var = dn8.a;
                                        Intent intent = intentPutExtra;
                                        ?? r5 = this.Y;
                                        switch (b3) {
                                            case 0:
                                                int i3 = RoutingSettingsEditActivity.U0;
                                                r5.B(true);
                                                r5.startActivity(intent.putExtra("routingSettingsGeoFileType", "GEOIP"));
                                                break;
                                            default:
                                                int i4 = RoutingSettingsEditActivity.U0;
                                                r5.B(true);
                                                r5.startActivity(intent.putExtra("routingSettingsGeoFileType", "GEOSITE"));
                                                break;
                                        }
                                        return dn8Var;
                                    }
                                });
                                fu6 fu6Var8 = this.Q0;
                                if (fu6Var8 == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                ((HappForwardField) fu6Var8.g0).setOnForwardIconClickListener(new dn2(this) { // from class: vp6
                                    public final /* synthetic */ RoutingSettingsEditActivity Y;

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    {
                                        this.Y = this;
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    /* JADX WARN: Type inference failed for: r5v1, types: [android.content.Context, su.happ.proxyutility.feature.routing.settings.RoutingSettingsEditActivity] */
                                    public final Object invoke() {
                                        byte b3 = b2;
                                        dn8 dn8Var = dn8.a;
                                        Intent intent = intentPutExtra;
                                        ?? r5 = this.Y;
                                        switch (b3) {
                                            case 0:
                                                int i3 = RoutingSettingsEditActivity.U0;
                                                r5.B(true);
                                                r5.startActivity(intent.putExtra("routingSettingsGeoFileType", "GEOIP"));
                                                break;
                                            default:
                                                int i4 = RoutingSettingsEditActivity.U0;
                                                r5.B(true);
                                                r5.startActivity(intent.putExtra("routingSettingsGeoFileType", "GEOSITE"));
                                                break;
                                        }
                                        return dn8Var;
                                    }
                                });
                                fu6 fu6Var9 = this.Q0;
                                if (fu6Var9 != null) {
                                    ((AppCompatEditText) fu6Var9.Z).post(new fl6(this, (byte) 1));
                                    return;
                                } else {
                                    dh3.T("binding");
                                    throw null;
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
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(v46.menu_routing, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        final byte b = 0;
        final byte b2 = 1;
        if (itemId == e46.save_routing) {
            B(false);
            C();
            return true;
        }
        if (itemId == e46.del_routing) {
            fu6 fu6Var = this.Q0;
            if (fu6Var == null) {
                dh3.T("binding");
                throw null;
            }
            ((AppCompatEditText) fu6Var.Z).setText(null);
            B(false);
            return true;
        }
        int i = e46.set_lan;
        mn6 mn6Var = this.R0;
        if (itemId == i) {
            String str = ((fq6) A().d.X.getValue()).X;
            gn2 gn2Var = new gn2(this) { // from class: up6
                public final /* synthetic */ RoutingSettingsEditActivity Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final Object B(Object obj) {
                    byte b3 = b;
                    RoutingSettingsEditActivity routingSettingsEditActivity = this.Y;
                    switch (b3) {
                        case 0:
                            RouteSettingsCache routeSettingsCache = (RouteSettingsCache) obj;
                            int i2 = RoutingSettingsEditActivity.U0;
                            routeSettingsCache.getClass();
                            int i3 = wp6.a[((fq6) routingSettingsEditActivity.A().d.X.getValue()).Z.ordinal()];
                            if (i3 == 1) {
                                RouteSettings.INSTANCE.getClass();
                                List list = RouteSettings.LAN_ADDRESSES;
                                ArrayList arrayList = new ArrayList();
                                for (Object obj2 : list) {
                                    if (!routeSettingsCache.getRouteSettings().getProxyIp().contains((String) obj2)) {
                                        arrayList.add(obj2);
                                    }
                                }
                                List proxyIp = routeSettingsCache.getRouteSettings().getProxyIp();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    proxyIp.add((String) it.next());
                                }
                            } else if (i3 == 2) {
                                RouteSettings.INSTANCE.getClass();
                                List list2 = RouteSettings.LAN_ADDRESSES;
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj3 : list2) {
                                    if (!routeSettingsCache.getRouteSettings().getDirectIp().contains((String) obj3)) {
                                        arrayList2.add(obj3);
                                    }
                                }
                                List directIp = routeSettingsCache.getRouteSettings().getDirectIp();
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    directIp.add((String) it2.next());
                                }
                            } else {
                                if (i3 != 3) {
                                    b61.c();
                                    return null;
                                }
                                RouteSettings.INSTANCE.getClass();
                                List list3 = RouteSettings.LAN_ADDRESSES;
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj4 : list3) {
                                    if (!routeSettingsCache.getRouteSettings().getBlockIp().contains((String) obj4)) {
                                        arrayList3.add(obj4);
                                    }
                                }
                                List blockIp = routeSettingsCache.getRouteSettings().getBlockIp();
                                Iterator it3 = arrayList3.iterator();
                                while (it3.hasNext()) {
                                    blockIp.add((String) it3.next());
                                }
                            }
                            return routeSettingsCache;
                        default:
                            RouteSettingsCache routeSettingsCache2 = (RouteSettingsCache) obj;
                            int i4 = RoutingSettingsEditActivity.U0;
                            routeSettingsCache2.getClass();
                            int i5 = wp6.a[((fq6) routingSettingsEditActivity.A().d.X.getValue()).Z.ordinal()];
                            if (i5 == 1) {
                                RouteSettings routeSettings = routeSettingsCache2.getRouteSettings();
                                RouteSettings defaultValue = routeSettingsCache2.getDefaultValue();
                                List proxyIp2 = defaultValue != null ? defaultValue.getProxyIp() : null;
                                if (proxyIp2 == null) {
                                    bt.q("Required value was null.");
                                    return null;
                                }
                                RouteSettings defaultValue2 = routeSettingsCache2.getDefaultValue();
                                List proxySites = defaultValue2 != null ? defaultValue2.getProxySites() : null;
                                if (proxySites != null) {
                                    return RouteSettingsCache.a(routeSettingsCache2, null, RouteSettings.e(routeSettings, false, null, null, null, null, null, null, null, null, null, proxySites, proxyIp2, null, null, null, null, false, null, null, null, null, 8382463), null, null, false, 29);
                                }
                                bt.q("Required value was null.");
                                return null;
                            }
                            if (i5 == 2) {
                                RouteSettings routeSettings2 = routeSettingsCache2.getRouteSettings();
                                RouteSettings defaultValue3 = routeSettingsCache2.getDefaultValue();
                                List directIp2 = defaultValue3 != null ? defaultValue3.getDirectIp() : null;
                                if (directIp2 == null) {
                                    bt.q("Required value was null.");
                                    return null;
                                }
                                RouteSettings defaultValue4 = routeSettingsCache2.getDefaultValue();
                                List directSites = defaultValue4 != null ? defaultValue4.getDirectSites() : null;
                                if (directSites != null) {
                                    return RouteSettingsCache.a(routeSettingsCache2, null, RouteSettings.e(routeSettings2, false, null, null, null, null, null, null, null, null, null, null, null, directSites, directIp2, null, null, false, null, null, null, null, 8364031), null, null, false, 29);
                                }
                                bt.q("Required value was null.");
                                return null;
                            }
                            if (i5 != 3) {
                                b61.c();
                                return null;
                            }
                            RouteSettings routeSettings3 = routeSettingsCache2.getRouteSettings();
                            RouteSettings defaultValue5 = routeSettingsCache2.getDefaultValue();
                            List blockIp2 = defaultValue5 != null ? defaultValue5.getBlockIp() : null;
                            if (blockIp2 == null) {
                                bt.q("Required value was null.");
                                return null;
                            }
                            RouteSettings defaultValue6 = routeSettingsCache2.getDefaultValue();
                            List blockSites = defaultValue6 != null ? defaultValue6.getBlockSites() : null;
                            if (blockSites != null) {
                                return RouteSettingsCache.a(routeSettingsCache2, null, RouteSettings.e(routeSettings3, false, null, null, null, null, null, null, null, null, null, null, null, null, null, blockSites, blockIp2, false, null, null, null, null, 8290303), null, null, false, 29);
                            }
                            bt.q("Required value was null.");
                            return null;
                    }
                }
            };
            vz7 vz7Var = mn6.j;
            if (mn6Var.D(str, (String) null, gn2Var) != null) {
                C();
                return true;
            }
        } else {
            if (itemId != e46.set_default) {
                return super.onOptionsItemSelected(menuItem);
            }
            String str2 = ((fq6) A().d.X.getValue()).X;
            gn2 gn2Var2 = new gn2(this) { // from class: up6
                public final /* synthetic */ RoutingSettingsEditActivity Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final Object B(Object obj) {
                    byte b3 = b2;
                    RoutingSettingsEditActivity routingSettingsEditActivity = this.Y;
                    switch (b3) {
                        case 0:
                            RouteSettingsCache routeSettingsCache = (RouteSettingsCache) obj;
                            int i2 = RoutingSettingsEditActivity.U0;
                            routeSettingsCache.getClass();
                            int i3 = wp6.a[((fq6) routingSettingsEditActivity.A().d.X.getValue()).Z.ordinal()];
                            if (i3 == 1) {
                                RouteSettings.INSTANCE.getClass();
                                List list = RouteSettings.LAN_ADDRESSES;
                                ArrayList arrayList = new ArrayList();
                                for (Object obj2 : list) {
                                    if (!routeSettingsCache.getRouteSettings().getProxyIp().contains((String) obj2)) {
                                        arrayList.add(obj2);
                                    }
                                }
                                List proxyIp = routeSettingsCache.getRouteSettings().getProxyIp();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    proxyIp.add((String) it.next());
                                }
                            } else if (i3 == 2) {
                                RouteSettings.INSTANCE.getClass();
                                List list2 = RouteSettings.LAN_ADDRESSES;
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj3 : list2) {
                                    if (!routeSettingsCache.getRouteSettings().getDirectIp().contains((String) obj3)) {
                                        arrayList2.add(obj3);
                                    }
                                }
                                List directIp = routeSettingsCache.getRouteSettings().getDirectIp();
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    directIp.add((String) it2.next());
                                }
                            } else {
                                if (i3 != 3) {
                                    b61.c();
                                    return null;
                                }
                                RouteSettings.INSTANCE.getClass();
                                List list3 = RouteSettings.LAN_ADDRESSES;
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj4 : list3) {
                                    if (!routeSettingsCache.getRouteSettings().getBlockIp().contains((String) obj4)) {
                                        arrayList3.add(obj4);
                                    }
                                }
                                List blockIp = routeSettingsCache.getRouteSettings().getBlockIp();
                                Iterator it3 = arrayList3.iterator();
                                while (it3.hasNext()) {
                                    blockIp.add((String) it3.next());
                                }
                            }
                            return routeSettingsCache;
                        default:
                            RouteSettingsCache routeSettingsCache2 = (RouteSettingsCache) obj;
                            int i4 = RoutingSettingsEditActivity.U0;
                            routeSettingsCache2.getClass();
                            int i5 = wp6.a[((fq6) routingSettingsEditActivity.A().d.X.getValue()).Z.ordinal()];
                            if (i5 == 1) {
                                RouteSettings routeSettings = routeSettingsCache2.getRouteSettings();
                                RouteSettings defaultValue = routeSettingsCache2.getDefaultValue();
                                List proxyIp2 = defaultValue != null ? defaultValue.getProxyIp() : null;
                                if (proxyIp2 == null) {
                                    bt.q("Required value was null.");
                                    return null;
                                }
                                RouteSettings defaultValue2 = routeSettingsCache2.getDefaultValue();
                                List proxySites = defaultValue2 != null ? defaultValue2.getProxySites() : null;
                                if (proxySites != null) {
                                    return RouteSettingsCache.a(routeSettingsCache2, null, RouteSettings.e(routeSettings, false, null, null, null, null, null, null, null, null, null, proxySites, proxyIp2, null, null, null, null, false, null, null, null, null, 8382463), null, null, false, 29);
                                }
                                bt.q("Required value was null.");
                                return null;
                            }
                            if (i5 == 2) {
                                RouteSettings routeSettings2 = routeSettingsCache2.getRouteSettings();
                                RouteSettings defaultValue3 = routeSettingsCache2.getDefaultValue();
                                List directIp2 = defaultValue3 != null ? defaultValue3.getDirectIp() : null;
                                if (directIp2 == null) {
                                    bt.q("Required value was null.");
                                    return null;
                                }
                                RouteSettings defaultValue4 = routeSettingsCache2.getDefaultValue();
                                List directSites = defaultValue4 != null ? defaultValue4.getDirectSites() : null;
                                if (directSites != null) {
                                    return RouteSettingsCache.a(routeSettingsCache2, null, RouteSettings.e(routeSettings2, false, null, null, null, null, null, null, null, null, null, null, null, directSites, directIp2, null, null, false, null, null, null, null, 8364031), null, null, false, 29);
                                }
                                bt.q("Required value was null.");
                                return null;
                            }
                            if (i5 != 3) {
                                b61.c();
                                return null;
                            }
                            RouteSettings routeSettings3 = routeSettingsCache2.getRouteSettings();
                            RouteSettings defaultValue5 = routeSettingsCache2.getDefaultValue();
                            List blockIp2 = defaultValue5 != null ? defaultValue5.getBlockIp() : null;
                            if (blockIp2 == null) {
                                bt.q("Required value was null.");
                                return null;
                            }
                            RouteSettings defaultValue6 = routeSettingsCache2.getDefaultValue();
                            List blockSites = defaultValue6 != null ? defaultValue6.getBlockSites() : null;
                            if (blockSites != null) {
                                return RouteSettingsCache.a(routeSettingsCache2, null, RouteSettings.e(routeSettings3, false, null, null, null, null, null, null, null, null, null, null, null, null, null, blockSites, blockIp2, false, null, null, null, null, 8290303), null, null, false, 29);
                            }
                            bt.q("Required value was null.");
                            return null;
                    }
                }
            };
            vz7 vz7Var2 = mn6.j;
            if (mn6Var.D(str2, (String) null, gn2Var2) != null) {
                C();
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final void onResume() {
        super.onResume();
        C();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onStart() {
        super.onStart();
        fu6 fu6Var = this.Q0;
        if (fu6Var != null) {
            ((AppCompatEditText) fu6Var.Z).requestFocus();
        } else {
            dh3.T("binding");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final Toolbar v() {
        fu6 fu6Var = this.Q0;
        if (fu6Var != null) {
            return (Toolbar) fu6Var.i0;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final boolean x() {
        fu6 fu6Var = this.Q0;
        if (fu6Var != null) {
            return ((AppCompatEditText) fu6Var.Z).requestFocus();
        }
        dh3.T("binding");
        throw null;
    }
}

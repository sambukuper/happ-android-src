package su.happ.proxyutility.feature.routing.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.aq6;
import defpackage.bm4;
import defpackage.bq6;
import defpackage.e46;
import defpackage.eq6;
import defpackage.ln7;
import defpackage.lr2;
import defpackage.mr2;
import defpackage.ss8;
import defpackage.t46;
import defpackage.y46;
import defpackage.yp6;
import java.util.Iterator;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.ERoutingSettingsType;
import su.happ.proxyutility.feature.routing.settings.RoutingSettingsEditSearchActivity;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsEditSearchActivity;", "Lsu/happ/proxyutility/ui/BaseActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class RoutingSettingsEditSearchActivity extends BaseActivity {
    public static final /* synthetic */ int U0 = 0;
    public z47 Q0;
    public final y5 R0 = new y5(yb6.a.b(eq6.class), new bq6(this, (byte) 1), new bq6(this, (byte) 0), new bq6(this, (byte) 2));
    public final vz7 S0;
    public final vz7 T0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RoutingSettingsEditSearchActivity() {
        final byte b = 0;
        final byte b2 = 1;
        this.S0 = new vz7(new dn2(this) { // from class: zp6
            public final /* synthetic */ RoutingSettingsEditSearchActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                switch (b) {
                    case 0:
                        z47 z47Var = this.Y.Q0;
                        if (z47Var != null) {
                            return new aq6(z47Var);
                        }
                        dh3.T("binding");
                        throw null;
                    default:
                        int i = RoutingSettingsEditSearchActivity.U0;
                        RoutingSettingsEditSearchActivity routingSettingsEditSearchActivity = this.Y;
                        return new lr2((aq6) routingSettingsEditSearchActivity.S0.getValue(), new al5(1, routingSettingsEditSearchActivity, RoutingSettingsEditSearchActivity.class, "onClick", "onClick(Ljava/lang/String;)V", 0, (byte) 8), new kn7(0, routingSettingsEditSearchActivity.A(), eq6.class, "getFilterGeoFileSearchCache", "getFilterGeoFileSearchCache()Ljava/util/List;", 0, (byte) 1));
                }
            }
        });
        this.T0 = new vz7(new dn2(this) { // from class: zp6
            public final /* synthetic */ RoutingSettingsEditSearchActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                switch (b2) {
                    case 0:
                        z47 z47Var = this.Y.Q0;
                        if (z47Var != null) {
                            return new aq6(z47Var);
                        }
                        dh3.T("binding");
                        throw null;
                    default:
                        int i = RoutingSettingsEditSearchActivity.U0;
                        RoutingSettingsEditSearchActivity routingSettingsEditSearchActivity = this.Y;
                        return new lr2((aq6) routingSettingsEditSearchActivity.S0.getValue(), new al5(1, routingSettingsEditSearchActivity, RoutingSettingsEditSearchActivity.class, "onClick", "onClick(Ljava/lang/String;)V", 0, (byte) 8), new kn7(0, routingSettingsEditSearchActivity.A(), eq6.class, "getFilterGeoFileSearchCache", "getFilterGeoFileSearchCache()Ljava/util/List;", 0, (byte) 1));
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final eq6 A() {
        return (eq6) this.R0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: su.happ.proxyutility.feature.routing.settings.RoutingSettingsEditSearchActivity */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final void onCreate(Bundle bundle) {
        RecyclerView recyclerViewB;
        Toolbar toolbarB;
        Object next;
        Object next2;
        String string;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(t46.activity_routing_settings_edit_search, (ViewGroup) null, false);
        int i = e46.et_routing_content;
        AppCompatEditText appCompatEditTextB = ln7.b(viewInflate, i);
        if (appCompatEditTextB == null || (recyclerViewB = ln7.b(viewInflate, (i = e46.rv_geo_file_groups))) == null || (toolbarB = ln7.b(viewInflate, (i = e46.toolbar))) == null) {
            b61.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
            return;
        }
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        this.Q0 = new z47(linearLayout, appCompatEditTextB, recyclerViewB, toolbarB, (byte) 3);
        setContentView(linearLayout);
        mb6.g((aq6) this.S0.getValue());
        z47 z47Var = this.Q0;
        if (z47Var == null) {
            dh3.T("binding");
            throw null;
        }
        LinearLayout linearLayout2 = (LinearLayout) z47Var.Y;
        linearLayout2.getClass();
        setBarsParams(linearLayout2);
        z47 z47Var2 = this.Q0;
        if (z47Var2 == null) {
            dh3.T("binding");
            throw null;
        }
        r((Toolbar) z47Var2.g0);
        eq6 eq6VarA = A();
        ss8 ss8Var = ss8.a;
        eq6VarA.h = ss8.L(this);
        A().i = new yp6(this, (byte) 0);
        eq6 eq6VarA2 = A();
        Intent intent = getIntent();
        intent.getClass();
        String stringExtra = intent.getStringExtra("profileId");
        if (stringExtra == null) {
            stringExtra = eq6VarA2.e;
        }
        eq6VarA2.e = stringExtra;
        String stringExtra2 = intent.getStringExtra("routingSettingsEditType");
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
        if (eRoutingSettingsType == null) {
            eRoutingSettingsType = eq6VarA2.d;
        }
        eq6VarA2.d = eRoutingSettingsType;
        String stringExtra3 = intent.getStringExtra("routingSettingsGeoFileType");
        if (stringExtra3 == null) {
            stringExtra3 = "GEOIP";
        }
        Iterator it2 = mr2.g0.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!dh3.f(((mr2) next2).name(), stringExtra3));
        mr2 mr2Var = (mr2) next2;
        if (mr2Var == null) {
            mr2Var = eq6VarA2.c;
        }
        eq6VarA2.c = mr2Var;
        tu0 tu0VarA = zw8.a(eq6VarA2);
        nf1 nf1Var = tp1.a;
        jm4.Q(tu0VarA, dm4.a, new l40(eq6VarA2, (q51) null, (byte) 11), 2);
        z47 z47Var3 = this.Q0;
        if (z47Var3 == null) {
            dh3.T("binding");
            throw null;
        }
        Toolbar toolbar = (Toolbar) z47Var3.g0;
        int iOrdinal = A().c.ordinal();
        if (iOrdinal == 0) {
            string = getString(y46.routing_activity_find_title_geosite);
        } else {
            if (iOrdinal != 1) {
                b61.c();
                return;
            }
            string = getString(y46.routing_activity_find_title_geoip);
        }
        toolbar.setTitle(string);
        z47 z47Var4 = this.Q0;
        if (z47Var4 == null) {
            dh3.T("binding");
            throw null;
        }
        ((RecyclerView) z47Var4.f0).setAdapter((lr2) this.T0.getValue());
        z47 z47Var5 = this.Q0;
        if (z47Var5 == null) {
            dh3.T("binding");
            throw null;
        }
        ((RecyclerView) z47Var5.f0).i(w39.c(this));
        z47 z47Var6 = this.Q0;
        if (z47Var6 == null) {
            dh3.T("binding");
            throw null;
        }
        ((RecyclerView) z47Var6.f0).setLayoutManager(new LinearLayoutManager(1));
        z47 z47Var7 = this.Q0;
        if (z47Var7 == null) {
            dh3.T("binding");
            throw null;
        }
        ((AppCompatEditText) z47Var7.Z).setImeOptions(3);
        z47 z47Var8 = this.Q0;
        if (z47Var8 == null) {
            dh3.T("binding");
            throw null;
        }
        ((AppCompatEditText) z47Var8.Z).addTextChangedListener(new x42(this, (byte) 6));
        A().j.e(this, new bm4(new yp6(this, (byte) 1), (byte) 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final Toolbar v() {
        z47 z47Var = this.Q0;
        if (z47Var != null) {
            return (Toolbar) z47Var.g0;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final boolean x() {
        z47 z47Var = this.Q0;
        if (z47Var != null) {
            return ((AppCompatEditText) z47Var.Z).requestFocus();
        }
        dh3.T("binding");
        throw null;
    }
}

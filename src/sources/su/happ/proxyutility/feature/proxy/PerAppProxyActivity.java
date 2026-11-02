package su.happ.proxyutility.feature.proxy;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ComponentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.f;
import com.tencent.mmkv.MMKV;
import defpackage.cl5;
import defpackage.dk5;
import defpackage.e46;
import defpackage.ik5;
import defpackage.jk5;
import defpackage.lk5;
import defpackage.ln7;
import defpackage.my2;
import defpackage.qk5;
import defpackage.ss8;
import defpackage.t46;
import defpackage.uj5;
import defpackage.v46;
import defpackage.xj5;
import defpackage.y46;
import defpackage.yk5;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import su.happ.proxyutility.dto.AppInfo;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.proxy.PerAppProxyActivity;
import su.happ.proxyutility.ui.SnackbarHostActivity;
import su.happ.proxyutility.ui.foundation.component.HappSnackbarHost;
import su.happ.proxyutility.ui.foundation.component.HappTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/proxy/PerAppProxyActivity;", "Lsu/happ/proxyutility/ui/SnackbarHostActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class PerAppProxyActivity extends SnackbarHostActivity {
    public static final /* synthetic */ int V0 = 0;
    public c6 Q0;
    public final vz7 S0;
    public final vz7 T0;
    public final y5 R0 = new y5(yb6.a.b(cl5.class), new dk5(this, (byte) 1), new dk5(this, (byte) 0), new dk5(this, (byte) 2));
    public final r6 U0 = m(new o61(this, (byte) 20), new n6((byte) 2));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PerAppProxyActivity() {
        final byte b = 0;
        final byte b2 = 1;
        this.S0 = new vz7(new dn2(this) { // from class: sj5
            public final /* synthetic */ PerAppProxyActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                switch (b) {
                    case 0:
                        c6 c6Var = this.Y.Q0;
                        if (c6Var != null) {
                            return new uj5(c6Var);
                        }
                        dh3.T("binding");
                        throw null;
                    default:
                        int i = PerAppProxyActivity.V0;
                        PerAppProxyActivity perAppProxyActivity = this.Y;
                        ik5 ik5Var = new ik5((uj5) perAppProxyActivity.S0.getValue(), new d0(1, perAppProxyActivity, PerAppProxyActivity.class, "onAppInfoClick", "onAppInfoClick(Lsu/happ/proxyutility/dto/AppInfo;)V", 0, (byte) 29));
                        ((f) ik5Var).a.registerObserver(new ul2(perAppProxyActivity, (byte) 1));
                        return ik5Var;
                }
            }
        });
        this.T0 = new vz7(new dn2(this) { // from class: sj5
            public final /* synthetic */ PerAppProxyActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                switch (b2) {
                    case 0:
                        c6 c6Var = this.Y.Q0;
                        if (c6Var != null) {
                            return new uj5(c6Var);
                        }
                        dh3.T("binding");
                        throw null;
                    default:
                        int i = PerAppProxyActivity.V0;
                        PerAppProxyActivity perAppProxyActivity = this.Y;
                        ik5 ik5Var = new ik5((uj5) perAppProxyActivity.S0.getValue(), new d0(1, perAppProxyActivity, PerAppProxyActivity.class, "onAppInfoClick", "onAppInfoClick(Lsu/happ/proxyutility/dto/AppInfo;)V", 0, (byte) 29));
                        ((f) ik5Var).a.registerObserver(new ul2(perAppProxyActivity, (byte) 1));
                        return ik5Var;
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final HappSnackbarHost A() {
        c6 c6Var = this.Q0;
        if (c6Var != null) {
            return (HappSnackbarHost) c6Var.p0;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final cl5 B() {
        return (cl5) this.R0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: su.happ.proxyutility.feature.proxy.PerAppProxyActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void C(String str, my2 my2Var) {
        int i = zx2.B;
        c6 c6Var = this.Q0;
        if (c6Var != null) {
            k42.g(this, ((HappSnackbarHost) c6Var.p0).getHost(), str, my2Var, (Iterable) null, this.J0, 80);
        } else {
            dh3.T("binding");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r21v0, resolved type: su.happ.proxyutility.feature.proxy.PerAppProxyActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        View viewB;
        View viewB2;
        View viewB3;
        View viewB4;
        Toolbar toolbarB;
        Object value;
        lk5 lk5Var;
        super/*su.happ.proxyutility.ui.BaseActivity*/.onCreate(bundle);
        q51 q51Var = null;
        final byte b = 0;
        View viewInflate = getLayoutInflater().inflate(t46.activity_per_app_proxy, (ViewGroup) null, false);
        int i = e46.cl_per_app_proxy_block;
        if (ln7.b(viewInflate, i) != null) {
            i = e46.cl_per_app_proxy_mode;
            if (((LinearLayout) ln7.b(viewInflate, i)) != null && (viewB = ln7.b(viewInflate, (i = e46.divider_bypass))) != null && (viewB2 = ln7.b(viewInflate, (i = e46.divider_off))) != null && (viewB3 = ln7.b(viewInflate, (i = e46.divider_on))) != null) {
                i = e46.ll_bypass;
                LinearLayout linearLayout = (LinearLayout) ln7.b(viewInflate, i);
                if (linearLayout != null) {
                    i = e46.ll_main;
                    if (((LinearLayout) ln7.b(viewInflate, i)) != null) {
                        i = e46.ll_off;
                        LinearLayout linearLayout2 = (LinearLayout) ln7.b(viewInflate, i);
                        if (linearLayout2 != null) {
                            i = e46.ll_on;
                            LinearLayout linearLayout3 = (LinearLayout) ln7.b(viewInflate, i);
                            if (linearLayout3 != null) {
                                i = e46.pb_waiting;
                                ProgressBar progressBar = (ProgressBar) ln7.b(viewInflate, i);
                                if (progressBar != null) {
                                    i = e46.rl_list_applications;
                                    if (((RelativeLayout) ln7.b(viewInflate, i)) != null && (viewB4 = ln7.b(viewInflate, (i = e46.rv_list_applications))) != null) {
                                        i = e46.snackbar_host_root;
                                        HappSnackbarHost happSnackbarHost = (HappSnackbarHost) ln7.b(viewInflate, i);
                                        if (happSnackbarHost != null) {
                                            i = e46.title_list_applications;
                                            if (((HappTextView) ln7.b(viewInflate, i)) != null) {
                                                i = e46.title_per_app_proxy;
                                                if (((HappTextView) ln7.b(viewInflate, i)) != null && (toolbarB = ln7.b(viewInflate, (i = e46.toolbar))) != null) {
                                                    i = e46.tv_bypass;
                                                    HappTextView happTextView = (HappTextView) ln7.b(viewInflate, i);
                                                    if (happTextView != null) {
                                                        i = e46.tv_description;
                                                        HappTextView happTextView2 = (HappTextView) ln7.b(viewInflate, i);
                                                        if (happTextView2 != null) {
                                                            i = e46.tv_off;
                                                            HappTextView happTextView3 = (HappTextView) ln7.b(viewInflate, i);
                                                            if (happTextView3 != null) {
                                                                i = e46.tv_on;
                                                                HappTextView happTextView4 = (HappTextView) ln7.b(viewInflate, i);
                                                                if (happTextView4 != null) {
                                                                    RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                                                                    this.Q0 = new c6(relativeLayout, viewB, viewB2, viewB3, linearLayout, linearLayout2, linearLayout3, progressBar, viewB4, happSnackbarHost, toolbarB, happTextView, happTextView2, happTextView3, happTextView4);
                                                                    setContentView(relativeLayout);
                                                                    mb6.g((uj5) this.S0.getValue());
                                                                    c6 c6Var = this.Q0;
                                                                    if (c6Var == null) {
                                                                        dh3.T("binding");
                                                                        throw null;
                                                                    }
                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) c6Var.f0;
                                                                    relativeLayout2.getClass();
                                                                    setBarsParams(relativeLayout2);
                                                                    c6 c6Var2 = this.Q0;
                                                                    if (c6Var2 == null) {
                                                                        dh3.T("binding");
                                                                        throw null;
                                                                    }
                                                                    r((Toolbar) c6Var2.q0);
                                                                    c6 c6Var3 = this.Q0;
                                                                    if (c6Var3 == null) {
                                                                        dh3.T("binding");
                                                                        throw null;
                                                                    }
                                                                    ((LinearLayout) c6Var3.n0).setOnClickListener(new View.OnClickListener(this) { // from class: tj5
                                                                        public final /* synthetic */ PerAppProxyActivity Y;

                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                        {
                                                                            this.Y = this;
                                                                        }

                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            byte b2 = b;
                                                                            PerAppProxyActivity perAppProxyActivity = this.Y;
                                                                            switch (b2) {
                                                                                case 0:
                                                                                    int i2 = PerAppProxyActivity.V0;
                                                                                    perAppProxyActivity.B().h(jk5.Z);
                                                                                    break;
                                                                                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                                    int i3 = PerAppProxyActivity.V0;
                                                                                    perAppProxyActivity.B().h(jk5.Y);
                                                                                    break;
                                                                                default:
                                                                                    int i4 = PerAppProxyActivity.V0;
                                                                                    perAppProxyActivity.B().h(jk5.f0);
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    c6 c6Var4 = this.Q0;
                                                                    if (c6Var4 == null) {
                                                                        dh3.T("binding");
                                                                        throw null;
                                                                    }
                                                                    final byte b2 = 1;
                                                                    ((LinearLayout) c6Var4.m0).setOnClickListener(new View.OnClickListener(this) { // from class: tj5
                                                                        public final /* synthetic */ PerAppProxyActivity Y;

                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                        {
                                                                            this.Y = this;
                                                                        }

                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            byte b3 = b2;
                                                                            PerAppProxyActivity perAppProxyActivity = this.Y;
                                                                            switch (b3) {
                                                                                case 0:
                                                                                    int i2 = PerAppProxyActivity.V0;
                                                                                    perAppProxyActivity.B().h(jk5.Z);
                                                                                    break;
                                                                                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                                    int i3 = PerAppProxyActivity.V0;
                                                                                    perAppProxyActivity.B().h(jk5.Y);
                                                                                    break;
                                                                                default:
                                                                                    int i4 = PerAppProxyActivity.V0;
                                                                                    perAppProxyActivity.B().h(jk5.f0);
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    c6 c6Var5 = this.Q0;
                                                                    if (c6Var5 == null) {
                                                                        dh3.T("binding");
                                                                        throw null;
                                                                    }
                                                                    final byte b3 = 2;
                                                                    ((LinearLayout) c6Var5.l0).setOnClickListener(new View.OnClickListener(this) { // from class: tj5
                                                                        public final /* synthetic */ PerAppProxyActivity Y;

                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                        {
                                                                            this.Y = this;
                                                                        }

                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            byte b4 = b3;
                                                                            PerAppProxyActivity perAppProxyActivity = this.Y;
                                                                            switch (b4) {
                                                                                case 0:
                                                                                    int i2 = PerAppProxyActivity.V0;
                                                                                    perAppProxyActivity.B().h(jk5.Z);
                                                                                    break;
                                                                                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                                    int i3 = PerAppProxyActivity.V0;
                                                                                    perAppProxyActivity.B().h(jk5.Y);
                                                                                    break;
                                                                                default:
                                                                                    int i4 = PerAppProxyActivity.V0;
                                                                                    perAppProxyActivity.B().h(jk5.f0);
                                                                                    break;
                                                                            }
                                                                        }
                                                                    });
                                                                    c6 c6Var6 = this.Q0;
                                                                    if (c6Var6 == null) {
                                                                        dh3.T("binding");
                                                                        throw null;
                                                                    }
                                                                    ((View) c6Var6.k0).setAdapter((ik5) this.T0.getValue());
                                                                    c6 c6Var7 = this.Q0;
                                                                    if (c6Var7 == null) {
                                                                        dh3.T("binding");
                                                                        throw null;
                                                                    }
                                                                    ((View) c6Var7.k0).i(w39.c(this));
                                                                    if (!ue3.y(this)) {
                                                                        c6 c6Var8 = this.Q0;
                                                                        if (c6Var8 == null) {
                                                                            dh3.T("binding");
                                                                            throw null;
                                                                        }
                                                                        ((View) c6Var8.k0).setLayoutManager(new LinearLayoutManager(1));
                                                                    }
                                                                    cl5 cl5VarB = B();
                                                                    boolean z = ((MMKV) cl5VarB.c.getValue()).getBoolean("pref_allow_system_apps", true);
                                                                    oh7 oh7Var = cl5VarB.f;
                                                                    oh7Var.getClass();
                                                                    do {
                                                                        value = oh7Var.getValue();
                                                                        lk5Var = (lk5) value;
                                                                        lk5Var.getClass();
                                                                    } while (!oh7Var.k(value, lk5.a(lk5Var, null, null, null, null, null, z, 31)));
                                                                    cl5 cl5VarB2 = B();
                                                                    jm4.Q(zw8.a(cl5VarB2), (u61) null, new yk5(cl5VarB2, q51Var, b), 3);
                                                                    cl5 cl5VarB3 = B();
                                                                    jm4.Q(zw8.a(cl5VarB3), (u61) null, new y9(cl5VarB3, this, (q51) null, (byte) 13), 3);
                                                                    g94 g94Var = ((ComponentActivity) this).X;
                                                                    jm4.Q(ys0.z(g94Var), (u61) null, new xj5(this, q51Var, b2), 3);
                                                                    jm4.Q(ys0.z(g94Var), (u61) null, new xj5(this, q51Var, (byte) 3), 3);
                                                                    u84 u84VarZ = ys0.z(g94Var);
                                                                    nf1 nf1Var = tp1.a;
                                                                    hv2 hv2Var = dm4.a;
                                                                    jm4.Q(u84VarZ, hv2Var, new xj5(this, q51Var, (byte) 5), 2);
                                                                    jm4.Q(ys0.z(g94Var), hv2Var, new xj5(this, q51Var, (byte) 7), 2);
                                                                    jm4.Q(ys0.z(g94Var), hv2Var, new xj5(this, q51Var, (byte) 9), 2);
                                                                    jm4.Q(ys0.z(g94Var), hv2Var, new xj5(this, q51Var, (byte) 11), 2);
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
        b61.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: su.happ.proxyutility.feature.proxy.PerAppProxyActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(v46.menu_per_app_proxy, menu);
        MenuItem menuItemFindItem = menu.findItem(e46.search_view);
        if (menuItemFindItem != null) {
            SearchView actionView = menuItemFindItem.getActionView();
            actionView.getClass();
            SearchView searchView = actionView;
            boolean zY = ue3.y(this);
            int i = 0;
            while (true) {
                if (!(i < searchView.getChildCount())) {
                    searchView.setOnQueryTextListener(new y45(this));
                    break;
                }
                int i2 = i + 1;
                View childAt = searchView.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                ka2 ka2Var = new ka2(w27.m0(new hu((LinearLayout) childAt, (byte) 8), new dx4((byte) 19)));
                while (ka2Var.hasNext()) {
                    ImageView imageView = (ImageView) ka2Var.next();
                    imageView.setClickable(true);
                    imageView.setFocusable(true);
                    imageView.setFocusableInTouchMode(zY);
                }
                i = i2;
            }
        }
        return super/*su.happ.proxyutility.ui.BaseActivity*/.onCreateOptionsMenu(menu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: su.happ.proxyutility.feature.proxy.PerAppProxyActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        dn8 rj6Var;
        Object value;
        lk5 lk5Var;
        Set setT0;
        j2 j2VarC;
        Object value2;
        lk5 lk5Var2;
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        byte b = 3;
        int i = 0;
        gn2 dx4Var = null;
        if (itemId == e46.select_all) {
            if (((lk5) B().g.X.getValue()).g) {
                cl5 cl5VarB = B();
                u15.S(cl5VarB.f, new dx4((byte) 21));
                jm4.Q(zw8.a(cl5VarB), (u61) null, new yk5(cl5VarB, dx4Var, (byte) 5), 3);
                return true;
            }
            cl5 cl5VarB2 = B();
            h76 h76Var = cl5VarB2.g;
            j2 j2Var = ((lk5) h76Var.X.getValue()).c;
            ArrayList arrayList = new ArrayList(xv0.Z(j2Var, 10));
            ListIterator listIterator = j2Var.listIterator(0);
            while (listIterator.hasNext()) {
                arrayList.add(((AppInfo) listIterator.next()).getPackageName());
            }
            Set setC1 = wv0.c1(arrayList);
            if (((lk5) h76Var.X.getValue()).g) {
                setT0 = wv0.T0(((lk5) h76Var.X.getValue()).d, setC1);
            } else {
                km5 km5Var = ((lk5) h76Var.X.getValue()).d;
                km5Var.getClass();
                Set setB1 = wv0.b1(km5Var);
                bw0.d0(setB1, setC1);
                setT0 = setB1;
            }
            km5 km5VarG0 = mb6.g0(setT0);
            boolean z = ((lk5) h76Var.X.getValue()).g;
            ec7 ec7Var = ec7.Y;
            if (z) {
                j2 j2Var2 = ((lk5) h76Var.X.getValue()).c;
                qm5 qm5VarC = ec7Var.c();
                ListIterator listIterator2 = j2Var2.listIterator(0);
                while (listIterator2.hasNext()) {
                    qm5VarC.add(AppInfo.a((AppInfo) listIterator2.next(), 0));
                }
                j2VarC = qm5VarC.c();
            } else {
                j2 j2Var3 = ((lk5) h76Var.X.getValue()).c;
                qm5 qm5VarC2 = ec7Var.c();
                ListIterator listIterator3 = j2Var3.listIterator(0);
                while (listIterator3.hasNext()) {
                    qm5VarC2.add(AppInfo.a((AppInfo) listIterator3.next(), 1));
                }
                j2VarC = qm5VarC2.c();
            }
            j2 j2Var4 = j2VarC;
            oh7 oh7Var = cl5VarB2.f;
            oh7Var.getClass();
            do {
                value2 = oh7Var.getValue();
                lk5Var2 = (lk5) value2;
                lk5Var2.getClass();
            } while (!oh7Var.k(value2, lk5.a(lk5Var2, null, null, j2Var4, km5VarG0, null, false, 51)));
            jm4.Q(zw8.a(cl5VarB2), (u61) null, new yk5(cl5VarB2, dx4Var, (byte) 4), 3);
            return true;
        }
        int i2 = e46.import_proxy_app;
        my2 my2Var = my2.X;
        if (itemId == i2) {
            ss8 ss8Var = ss8.a;
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            String string = fm7.R0(ss8.g(applicationContext)).toString();
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                dx4Var = (30 & 32) == 0 ? new dx4((byte) 20) : null;
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "");
                la4 la4Var = new la4(string);
                while (la4Var.hasNext()) {
                    Object next = la4Var.next();
                    i++;
                    if (i > 1) {
                        sb.append((CharSequence) "\n");
                    }
                    z39.e(sb, next, dx4Var);
                }
                sb.append((CharSequence) "");
                if (B().g(sb.toString())) {
                    String string2 = getString(y46.toast_success);
                    string2.getClass();
                    C(string2, my2Var);
                    return true;
                }
                String string3 = getString(y46.toast_failure);
                string3.getClass();
                C(string3, my2.Y);
                return true;
            }
        } else {
            if (itemId == e46.export_proxy_app) {
                km5 km5Var2 = ((lk5) B().g.X.getValue()).d;
                String strLineSeparator = System.lineSeparator();
                strLineSeparator.getClass();
                String strY0 = wv0.y0(km5Var2, strLineSeparator, (String) null, (String) null, (gn2) null, 62);
                ss8 ss8Var2 = ss8.a;
                Context applicationContext2 = getApplicationContext();
                applicationContext2.getClass();
                ss8.E(applicationContext2, strY0);
                String string4 = getString(y46.toast_success);
                string4.getClass();
                C(string4, my2Var);
                return true;
            }
            if (itemId == e46.invert) {
                cl5 cl5VarB3 = B();
                j2 j2Var5 = ((lk5) cl5VarB3.g.X.getValue()).c;
                ArrayList arrayList2 = new ArrayList(xv0.Z(j2Var5, 10));
                ListIterator listIterator4 = j2Var5.listIterator(0);
                while (listIterator4.hasNext()) {
                    arrayList2.add(((AppInfo) listIterator4.next()).getPackageName());
                }
                u15.S(cl5VarB3.f, new qk5(wv0.c1(arrayList2), (byte) 0));
                jm4.Q(zw8.a(cl5VarB3), (u61) null, new yk5(cl5VarB3, dx4Var, b), 3);
                return true;
            }
            if (itemId == e46.system_apps) {
                cl5 cl5VarB4 = B();
                oh7 oh7Var2 = cl5VarB4.f;
                oh7Var2.getClass();
                do {
                    value = oh7Var2.getValue();
                    lk5Var = (lk5) value;
                    lk5Var.getClass();
                } while (!oh7Var2.k(value, lk5.a(lk5Var, null, null, null, null, null, !lk5Var.f, 31)));
                ((MMKV) cl5VarB4.c.getValue()).putBoolean("pref_allow_system_apps", ((lk5) cl5VarB4.g.X.getValue()).f);
                invalidateOptionsMenu();
                return true;
            }
            int i3 = e46.spy_apps;
            jk5 jk5Var = jk5.f0;
            if (itemId == i3) {
                cl5 cl5VarB5 = B();
                cl5VarB5.h(jk5Var);
                jm4.Q(zw8.a(cl5VarB5), (u61) null, new yk5(cl5VarB5, dx4Var, (byte) 7), 3);
                return true;
            }
            if (itemId == e46.google_apps) {
                cl5 cl5VarB6 = B();
                cl5VarB6.h(jk5Var);
                jm4.Q(zw8.a(cl5VarB6), (u61) null, new yk5(cl5VarB6, dx4Var, (byte) 6), 3);
                return true;
            }
            if (itemId == e46.clear) {
                u15.S(B().f, new dx4((byte) 22));
                return true;
            }
            if (itemId != e46.import_from_file) {
                return super/*su.happ.proxyutility.ui.BaseActivity*/.onOptionsItemSelected(menuItem);
            }
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("text/plain");
            try {
                r6 r6Var = this.U0;
                Intent intentCreateChooser = Intent.createChooser(intent, getString(y46.title_file_chooser));
                intentCreateChooser.getClass();
                r6Var.h0(intentCreateChooser);
                rj6Var = dn8.a;
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var = new rj6(th);
            }
            Throwable thA = sj6.a(rj6Var);
            if (thA != null && (thA instanceof ActivityNotFoundException)) {
                pu.M(this, y46.toast_require_file_manager);
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: su.happ.proxyutility.feature.proxy.PerAppProxyActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onPause() {
        super/*su.happ.proxyutility.ui.BaseActivity*/.onPause();
        c6 c6Var = this.Q0;
        if (c6Var == null) {
            dh3.T("binding");
            throw null;
        }
        if (((View) c6Var.k0).getAdapter() != null) {
            cl5 cl5VarB = B();
            vz7 vz7Var = x06.a;
            km5 km5Var = ((lk5) cl5VarB.g.X.getValue()).d;
            km5Var.getClass();
            ((MMKV) x06.a.getValue()).n("pref_per_app_proxy_set", km5Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: su.happ.proxyutility.feature.proxy.PerAppProxyActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItemFindItem;
        MenuItem menuItemFindItem2;
        if (menu != null && (menuItemFindItem2 = menu.findItem(e46.system_apps)) != null) {
            menuItemFindItem2.setTitle(getString(((lk5) B().g.X.getValue()).f ? y46.menu_item_hide_system_apps : y46.menu_item_show_system_apps));
        }
        if (menu != null && (menuItemFindItem = menu.findItem(e46.select_all)) != null) {
            menuItemFindItem.setTitle(getString(((lk5) B().g.X.getValue()).g ? y46.menu_item_unselect_all : y46.menu_item_select_all));
        }
        return super/*android.app.Activity*/.onPrepareOptionsMenu(menu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Toolbar v() {
        c6 c6Var = this.Q0;
        if (c6Var != null) {
            return (Toolbar) c6Var.q0;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean x() {
        c6 c6Var = this.Q0;
        if (c6Var != null) {
            return ((LinearLayout) c6Var.m0).requestFocus();
        }
        dh3.T("binding");
        throw null;
    }
}

package su.happ.proxyutility.feature.excluded_routes;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ComponentActivity;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.e46;
import defpackage.e52;
import defpackage.j52;
import defpackage.k52;
import defpackage.m52;
import defpackage.ss8;
import defpackage.t46;
import defpackage.v46;
import defpackage.v5;
import defpackage.w42;
import defpackage.y46;
import defpackage.z42;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import su.happ.proxyutility.dto.ExcludeSettingsCache;
import su.happ.proxyutility.dto.RouteSettings;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.excluded_routes.ExcludedRoutesActivity;
import su.happ.proxyutility.ui.SnackbarHostActivity;
import su.happ.proxyutility.ui.foundation.component.HappSnackbarHost;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/excluded_routes/ExcludedRoutesActivity;", "Lsu/happ/proxyutility/ui/SnackbarHostActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class ExcludedRoutesActivity extends SnackbarHostActivity {
    public static final /* synthetic */ int U0 = 0;
    public v5 Q0;
    public final y5 R0 = new y5(yb6.a.b(m52.class), new e52(this, (byte) 1), new e52(this, (byte) 0), new e52(this, (byte) 2));
    public final vz7 S0;
    public final vz7 T0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ExcludedRoutesActivity() {
        final byte b = 0;
        final byte b2 = 1;
        this.S0 = new vz7(new dn2(this) { // from class: v42
            public final /* synthetic */ ExcludedRoutesActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                byte b3 = b;
                ExcludedRoutesActivity excludedRoutesActivity = this.Y;
                switch (b3) {
                    case 0:
                        v5 v5Var = excludedRoutesActivity.Q0;
                        if (v5Var != null) {
                            return new w42(v5Var);
                        }
                        dh3.T("binding");
                        throw null;
                    default:
                        int i = ExcludedRoutesActivity.U0;
                        return new j52((w42) excludedRoutesActivity.S0.getValue(), new b1(excludedRoutesActivity, (byte) 8));
                }
            }
        });
        this.T0 = new vz7(new dn2(this) { // from class: v42
            public final /* synthetic */ ExcludedRoutesActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                byte b3 = b2;
                ExcludedRoutesActivity excludedRoutesActivity = this.Y;
                switch (b3) {
                    case 0:
                        v5 v5Var = excludedRoutesActivity.Q0;
                        if (v5Var != null) {
                            return new w42(v5Var);
                        }
                        dh3.T("binding");
                        throw null;
                    default:
                        int i = ExcludedRoutesActivity.U0;
                        return new j52((w42) excludedRoutesActivity.S0.getValue(), new b1(excludedRoutesActivity, (byte) 8));
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final HappSnackbarHost A() {
        v5 v5Var = this.Q0;
        if (v5Var == null) {
            dh3.T("binding");
            throw null;
        }
        HappSnackbarHost happSnackbarHost = v5Var.q0;
        happSnackbarHost.getClass();
        return happSnackbarHost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final m52 B() {
        return (m52) this.R0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void C() {
        pu.M(this, y46.toast_failure);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: su.happ.proxyutility.feature.excluded_routes.ExcludedRoutesActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super/*su.happ.proxyutility.ui.BaseActivity*/.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = v5.s0;
        DataBinderMapperImpl dataBinderMapperImpl = x91.a;
        v5 v5Var = (v5) kw8.c(t46.activity_excluded_routes, layoutInflater, (ViewGroup) null);
        v5Var.getClass();
        this.Q0 = v5Var;
        setContentView(((kw8) v5Var).Z);
        mb6.g((w42) this.S0.getValue());
        v5 v5Var2 = this.Q0;
        if (v5Var2 == null) {
            dh3.T("binding");
            throw null;
        }
        LinearLayout linearLayout = v5Var2.o0;
        linearLayout.getClass();
        setBarsParams(linearLayout);
        v5 v5Var3 = this.Q0;
        if (v5Var3 == null) {
            dh3.T("binding");
            throw null;
        }
        r(v5Var3.r0);
        setTitle(getString(y46.excluded_routes_title));
        v5 v5Var4 = this.Q0;
        if (v5Var4 == null) {
            dh3.T("binding");
            throw null;
        }
        AppCompatEditText appCompatEditText = v5Var4.n0;
        appCompatEditText.getClass();
        appCompatEditText.addTextChangedListener(new x42(this, (byte) 0));
        v5 v5Var5 = this.Q0;
        if (v5Var5 == null) {
            dh3.T("binding");
            throw null;
        }
        v5Var5.m0.setOnClickListener(new st0(this, (byte) 2));
        v5 v5Var6 = this.Q0;
        if (v5Var6 == null) {
            dh3.T("binding");
            throw null;
        }
        RecyclerView recyclerView = v5Var6.p0;
        recyclerView.getClass();
        recyclerView.setAdapter((j52) this.T0.getValue());
        if (!ue3.y(this)) {
            v5 v5Var7 = this.Q0;
            if (v5Var7 == null) {
                dh3.T("binding");
                throw null;
            }
            RecyclerView recyclerView2 = v5Var7.p0;
            recyclerView2.getClass();
            recyclerView2.setLayoutManager(new LinearLayoutManager(1));
        }
        v5 v5Var8 = this.Q0;
        if (v5Var8 == null) {
            dh3.T("binding");
            throw null;
        }
        RecyclerView recyclerView3 = v5Var8.p0;
        recyclerView3.getClass();
        recyclerView3.i(w39.c(this));
        v5 v5Var9 = this.Q0;
        if (v5Var9 == null) {
            dh3.T("binding");
            throw null;
        }
        RecyclerView recyclerView4 = v5Var9.p0;
        recyclerView4.getClass();
        new y42(this, recyclerView4);
        g94 g94Var = ((ComponentActivity) this).X;
        u84 u84VarZ = ys0.z(g94Var);
        nf1 nf1Var = tp1.a;
        hv2 hv2Var = dm4.a;
        jm4.Q(u84VarZ, hv2Var, new z42(this, null, (byte) 1), 2);
        jm4.Q(ys0.z(g94Var), hv2Var, new z42(this, null, (byte) 4), 2);
        jm4.Q(ys0.z(g94Var), hv2Var, new z42(this, null, (byte) 6), 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: su.happ.proxyutility.feature.excluded_routes.ExcludedRoutesActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(v46.action_excluded_routes, menu);
        int i = 0;
        while (true) {
            if (!(i < menu.size())) {
                return super/*su.happ.proxyutility.ui.BaseActivity*/.onCreateOptionsMenu(menu);
            }
            int i2 = i + 1;
            MenuItem item = menu.getItem(i);
            if (item == null) {
                throw new IndexOutOfBoundsException();
            }
            SpannableString spannableString = new SpannableString(String.valueOf(item.getTitle()));
            spannableString.setSpan(new RelativeSizeSpan(0.75f), 0, spannableString.length(), 33);
            item.setTitle(spannableString);
            i = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r24v0, resolved type: su.happ.proxyutility.feature.excluded_routes.ExcludedRoutesActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        dn8 rj6Var;
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == e46.add_private) {
            m52 m52VarB = B();
            RouteSettings.INSTANCE.getClass();
            Iterator it = RouteSettings.LAN_ADDRESSES.iterator();
            while (it.hasNext()) {
                m52VarB.f().e((String) it.next(), null);
            }
        } else if (itemId == e46.clear_all) {
            m52 m52VarB2 = B();
            jm5 it2 = ((k52) m52VarB2.d.X.getValue()).b.iterator();
            while (true) {
                jm5 jm5Var = it2;
                if (!jm5Var.hasNext()) {
                    break;
                }
                m52VarB2.g(((ExcludeSettingsCache) jm5Var.next()).getValue(), null, null);
            }
        } else {
            if (itemId == e46.import_ip) {
                ss8 ss8Var = ss8.a;
                String strG = ss8.g(this);
                m52 m52VarB3 = B();
                m52VarB3.f().a(strG, new ub(0, this, ExcludedRoutesActivity.class, "showSuccessSnackbar", "showSuccessSnackbar()V", 0, (byte) 7), new ub(0, this, ExcludedRoutesActivity.class, "showFailureSnackbar", "showFailureSnackbar()V", 0, (byte) 8));
                return true;
            }
            if (itemId != e46.export_ip) {
                return super/*su.happ.proxyutility.ui.BaseActivity*/.onOptionsItemSelected(menuItem);
            }
            m52 m52VarB4 = B();
            ub ubVar = new ub(0, this, ExcludedRoutesActivity.class, "showSuccessSnackbar", "showSuccessSnackbar()V", 0, (byte) 9);
            ub ubVar2 = new ub(0, this, ExcludedRoutesActivity.class, "showFailureSnackbar", "showFailureSnackbar()V", 0, (byte) 10);
            oh7 oh7Var = m52VarB4.f().b;
            try {
                if (((Collection) oh7Var.getValue()).isEmpty()) {
                    ubVar2.invoke();
                } else {
                    ss8 ss8Var2 = ss8.a;
                    Iterable iterable = (Iterable) oh7Var.getValue();
                    ArrayList arrayList = new ArrayList(xv0.Z(iterable, 10));
                    Iterator it3 = iterable.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((ExcludeSettingsCache) it3.next()).getValue());
                    }
                    ss8.E(this, wv0.y0(wv0.Y0(arrayList), ",", (String) null, (String) null, (gn2) null, 62));
                }
                rj6Var = dn8.a;
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var = new rj6(th);
            }
            if (sj6.a(rj6Var) == null) {
                ubVar.invoke();
            } else {
                ubVar2.invoke();
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Toolbar v() {
        v5 v5Var = this.Q0;
        if (v5Var == null) {
            dh3.T("binding");
            throw null;
        }
        Toolbar toolbar = v5Var.r0;
        toolbar.getClass();
        return toolbar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean x() {
        v5 v5Var = this.Q0;
        if (v5Var != null) {
            return v5Var.n0.requestFocus();
        }
        dh3.T("binding");
        throw null;
    }
}

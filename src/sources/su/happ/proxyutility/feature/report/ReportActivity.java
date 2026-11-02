package su.happ.proxyutility.feature.report;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.app.ComponentActivity;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.ee6;
import defpackage.fe6;
import defpackage.g6;
import defpackage.le6;
import defpackage.t46;
import defpackage.y46;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/report/ReportActivity;", "Lsu/happ/proxyutility/ui/BaseActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class ReportActivity extends BaseActivity {
    public static final /* synthetic */ int S0 = 0;
    public g6 Q0;
    public final y5 R0 = new y5(yb6.a.b(le6.class), new fe6(this, (byte) 1), new fe6(this, (byte) 0), new fe6(this, (byte) 2));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: su.happ.proxyutility.feature.report.ReportActivity */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = t46.activity_report;
        DataBinderMapperImpl dataBinderMapperImpl = x91.a;
        setContentView(i);
        kw8 kw8VarA = x91.a((ViewGroup) getWindow().getDecorView().findViewById(R.id.content), 0, i);
        kw8VarA.getClass();
        g6 g6Var = (g6) kw8VarA;
        this.Q0 = g6Var;
        View view = ((kw8) g6Var).Z;
        view.getClass();
        setBarsParams(view);
        g6 g6Var2 = this.Q0;
        if (g6Var2 == null) {
            dh3.T("binding");
            throw null;
        }
        r(g6Var2.p0);
        setTitle(getString(y46.title_report_problem));
        g6 g6Var3 = this.Q0;
        if (g6Var3 == null) {
            dh3.T("binding");
            throw null;
        }
        AppCompatEditText appCompatEditText = g6Var3.o0;
        appCompatEditText.getClass();
        appCompatEditText.addTextChangedListener(new x42(this, (byte) 4));
        g6 g6Var4 = this.Q0;
        if (g6Var4 == null) {
            dh3.T("binding");
            throw null;
        }
        g6Var4.n0.setOnCheckedChangeListener(new pr0(this, (byte) 1));
        g6 g6Var5 = this.Q0;
        if (g6Var5 == null) {
            dh3.T("binding");
            throw null;
        }
        g6Var5.m0.setOnClickListener(new st0(this, (byte) 16));
        u84 u84VarZ = ys0.z(((ComponentActivity) this).X);
        nf1 nf1Var = tp1.a;
        jm4.Q(u84VarZ, dm4.a, new ee6(this, null, (byte) 1), 2);
    }
}

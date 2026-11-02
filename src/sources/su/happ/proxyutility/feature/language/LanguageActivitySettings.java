package su.happ.proxyutility.feature.language;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.tencent.mmkv.MMKV;
import defpackage.e46;
import defpackage.j24;
import defpackage.k24;
import defpackage.ln7;
import defpackage.m26;
import defpackage.n24;
import defpackage.o24;
import defpackage.qi3;
import defpackage.r24;
import defpackage.t46;
import defpackage.y46;
import java.util.ArrayList;
import kotlin.Metadata;
import su.happ.proxyutility.dto.LanguageData;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.language.LanguageActivitySettings;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/language/LanguageActivitySettings;", "Lsu/happ/proxyutility/ui/BaseActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class LanguageActivitySettings extends BaseActivity {
    public static final /* synthetic */ int V0 = 0;
    public lr Q0;
    public final y5 R0 = new y5(yb6.a.b(r24.class), new k24(this, (byte) 1), new k24(this, (byte) 0), new k24(this, (byte) 2));
    public final vz7 S0 = new vz7(new ei3((byte) 8));
    public final vz7 T0;
    public final vz7 U0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LanguageActivitySettings() {
        final byte b = 0;
        final byte b2 = 1;
        this.T0 = new vz7(new dn2(this) { // from class: i24
            public final /* synthetic */ LanguageActivitySettings Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r4v0, types: [android.content.Context, java.lang.Object, su.happ.proxyutility.feature.language.LanguageActivitySettings] */
            public final Object invoke() {
                switch (b) {
                    case 0:
                        int i = LanguageActivitySettings.V0;
                        ?? r4 = this.Y;
                        String str = ((p24) ((r24) r4.R0.getValue()).c.X.getValue()).X;
                        Resources resources = r4.getResources();
                        int i2 = q36.ic_radio_button_checked_24px;
                        ThreadLocal threadLocal = xf6.a;
                        return new o24(str, resources.getDrawable(i2, null), r4.getResources().getDrawable(q36.ic_radio_button_unchecked_24px, null), new d0(1, (Object) r4, LanguageActivitySettings.class, "onLanguageSelected", "onLanguageSelected(Ljava/lang/String;)V", 0, (byte) 19));
                    default:
                        lr lrVar = this.Y.Q0;
                        if (lrVar != null) {
                            return new j24(lrVar);
                        }
                        dh3.T("binding");
                        throw null;
                }
            }
        });
        this.U0 = new vz7(new dn2(this) { // from class: i24
            public final /* synthetic */ LanguageActivitySettings Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r4v0, types: [android.content.Context, java.lang.Object, su.happ.proxyutility.feature.language.LanguageActivitySettings] */
            public final Object invoke() {
                switch (b2) {
                    case 0:
                        int i = LanguageActivitySettings.V0;
                        ?? r4 = this.Y;
                        String str = ((p24) ((r24) r4.R0.getValue()).c.X.getValue()).X;
                        Resources resources = r4.getResources();
                        int i2 = q36.ic_radio_button_checked_24px;
                        ThreadLocal threadLocal = xf6.a;
                        return new o24(str, resources.getDrawable(i2, null), r4.getResources().getDrawable(q36.ic_radio_button_unchecked_24px, null), new d0(1, (Object) r4, LanguageActivitySettings.class, "onLanguageSelected", "onLanguageSelected(Ljava/lang/String;)V", 0, (byte) 19));
                    default:
                        lr lrVar = this.Y.Q0;
                        if (lrVar != null) {
                            return new j24(lrVar);
                        }
                        dh3.T("binding");
                        throw null;
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: su.happ.proxyutility.feature.language.LanguageActivitySettings */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final void onCreate(Bundle bundle) {
        RecyclerView recyclerViewB;
        Toolbar toolbarB;
        super.onCreate(bundle);
        int i = 0;
        View viewInflate = getLayoutInflater().inflate(t46.activity_language_settings, (ViewGroup) null, false);
        int i2 = e46.cl_main;
        if (ln7.b(viewInflate, i2) != null && (recyclerViewB = ln7.b(viewInflate, (i2 = e46.rv_language))) != null) {
            i2 = e46.title_category;
            if (((TextView) ln7.b(viewInflate, i2)) != null && (toolbarB = ln7.b(viewInflate, (i2 = e46.toolbar))) != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                this.Q0 = new lr(linearLayout, recyclerViewB, toolbarB, (byte) 4);
                setContentView(linearLayout);
                mb6.g((j24) this.U0.getValue());
                lr lrVar = this.Q0;
                if (lrVar == null) {
                    dh3.T("binding");
                    throw null;
                }
                LinearLayout linearLayout2 = (LinearLayout) lrVar.Y;
                linearLayout2.getClass();
                setBarsParams(linearLayout2);
                lr lrVar2 = this.Q0;
                if (lrVar2 == null) {
                    dh3.T("binding");
                    throw null;
                }
                r((Toolbar) lrVar2.f0);
                setTitle(getString(y46.title_language));
                lr lrVar3 = this.Q0;
                if (lrVar3 == null) {
                    dh3.T("binding");
                    throw null;
                }
                RecyclerView recyclerView = (RecyclerView) lrVar3.Z;
                vz7 vz7Var = this.T0;
                recyclerView.setAdapter((o24) vz7Var.getValue());
                lr lrVar4 = this.Q0;
                if (lrVar4 == null) {
                    dh3.T("binding");
                    throw null;
                }
                ((RecyclerView) lrVar4.Z).setLayoutManager(new LinearLayoutManager(1));
                String[] stringArray = getResources().getStringArray(m26.language_select);
                stringArray.getClass();
                String[] stringArray2 = getResources().getStringArray(m26.language_select_value);
                stringArray2.getClass();
                String strI = ((MMKV) this.S0.getValue()).i("pref_language");
                if (strI == null) {
                    strI = stringArray2[0];
                }
                o24 o24Var = (o24) vz7Var.getValue();
                ArrayList arrayList = new ArrayList(stringArray2.length);
                int length = stringArray2.length;
                int i3 = 0;
                while (i < length) {
                    String str = stringArray2[i];
                    int i4 = i3 + 1;
                    String str2 = stringArray[i3];
                    str2.getClass();
                    str.getClass();
                    arrayList.add(new LanguageData(str2, dh3.f(strI, str), str));
                    i++;
                    i3 = i4;
                }
                o24Var.getClass();
                o24Var.g.b(arrayList);
                return;
            }
        }
        b61.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final Toolbar v() {
        lr lrVar = this.Q0;
        if (lrVar != null) {
            return (Toolbar) lrVar.f0;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final boolean x() {
        l lVarI = ((RecyclerView) ((j24) this.U0.getValue()).X.Z).I(0);
        n24 n24Var = lVarI instanceof n24 ? (n24) lVarI : null;
        if (n24Var == null) {
            return false;
        }
        return ((qi3) n24Var.v.Y).Z.requestFocus();
    }
}

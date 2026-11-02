package su.happ.proxyutility.feature.ping;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.tencent.mmkv.MMKV;
import defpackage.dw4;
import defpackage.e46;
import defpackage.hn5;
import defpackage.in5;
import defpackage.ln7;
import defpackage.m26;
import defpackage.n67;
import defpackage.ob4;
import defpackage.qi3;
import defpackage.rd3;
import defpackage.t46;
import defpackage.vn5;
import defpackage.vx2;
import defpackage.wl7;
import defpackage.xn5;
import defpackage.y46;
import java.util.ArrayList;
import kotlin.Metadata;
import su.happ.proxyutility.dto.PingTypeData;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EPingType;
import su.happ.proxyutility.feature.ping.PingSettingsActivity;
import su.happ.proxyutility.ui.BaseActivity;
import su.happ.proxyutility.ui.foundation.component.HappEditText;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDescription;
import su.happ.proxyutility.ui.foundation.component.HappSettingsTitle;
import su.happ.proxyutility.ui.foundation.component.HappSliderField;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/ping/PingSettingsActivity;", "Lsu/happ/proxyutility/ui/BaseActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class PingSettingsActivity extends BaseActivity {
    public static final /* synthetic */ int U0 = 0;
    public d6 Q0;
    public final vz7 R0 = new vz7(new dw4((byte) 20));
    public final vz7 S0;
    public final vz7 T0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PingSettingsActivity() {
        final byte b = 0;
        this.S0 = new vz7(new dn2(this) { // from class: wn5
            public final /* synthetic */ PingSettingsActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r4v0, types: [android.content.Context, java.lang.Object, su.happ.proxyutility.feature.ping.PingSettingsActivity] */
            public final Object invoke() {
                switch (b) {
                    case 0:
                        PingSettingsActivity pingSettingsActivity = this.Y;
                        d6 d6Var = pingSettingsActivity.Q0;
                        if (d6Var != null) {
                            return new xn5(pingSettingsActivity, d6Var);
                        }
                        dh3.T("binding");
                        throw null;
                    default:
                        int i = PingSettingsActivity.U0;
                        ?? r4 = this.Y;
                        Resources resources = r4.getResources();
                        int i2 = q36.ic_radio_button_checked_24px;
                        ThreadLocal threadLocal = xf6.a;
                        return new in5(resources.getDrawable(i2, null), r4.getResources().getDrawable(q36.ic_radio_button_unchecked_24px, null), (xn5) r4.S0.getValue(), new al5(1, r4, PingSettingsActivity.class, "onPingSelected", "onPingSelected(Lsu/happ/proxyutility/dto/enums/EPingType;)V", 0, (byte) 1));
                }
            }
        });
        final byte b2 = 1;
        this.T0 = new vz7(new dn2(this) { // from class: wn5
            public final /* synthetic */ PingSettingsActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r4v0, types: [android.content.Context, java.lang.Object, su.happ.proxyutility.feature.ping.PingSettingsActivity] */
            public final Object invoke() {
                switch (b2) {
                    case 0:
                        PingSettingsActivity pingSettingsActivity = this.Y;
                        d6 d6Var = pingSettingsActivity.Q0;
                        if (d6Var != null) {
                            return new xn5(pingSettingsActivity, d6Var);
                        }
                        dh3.T("binding");
                        throw null;
                    default:
                        int i = PingSettingsActivity.U0;
                        ?? r4 = this.Y;
                        Resources resources = r4.getResources();
                        int i2 = q36.ic_radio_button_checked_24px;
                        ThreadLocal threadLocal = xf6.a;
                        return new in5(resources.getDrawable(i2, null), r4.getResources().getDrawable(q36.ic_radio_button_unchecked_24px, null), (xn5) r4.S0.getValue(), new al5(1, r4, PingSettingsActivity.class, "onPingSelected", "onPingSelected(Lsu/happ/proxyutility/dto/enums/EPingType;)V", 0, (byte) 1));
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MMKV A() {
        return (MMKV) this.R0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: su.happ.proxyutility.feature.ping.PingSettingsActivity */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [vx2] */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final void onCreate(Bundle bundle) {
        RecyclerView recyclerViewB;
        Toolbar toolbarB;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(t46.activity_ping_settings, (ViewGroup) null, false);
        int i = e46.et_url_test_ping;
        AppCompatEditText appCompatEditText = (HappEditText) ln7.b(viewInflate, i);
        if (appCompatEditText != null) {
            i = e46.fl_url_test_ping;
            FrameLayout frameLayout = (FrameLayout) ln7.b(viewInflate, i);
            if (frameLayout != null) {
                i = e46.ll_main;
                if (((LinearLayout) ln7.b(viewInflate, i)) != null) {
                    i = e46.ll_ui_settings;
                    if (((LinearLayout) ln7.b(viewInflate, i)) != null) {
                        i = e46.ll_url_test_ping;
                        if (((LinearLayout) ln7.b(viewInflate, i)) != null && (recyclerViewB = ln7.b(viewInflate, (i = e46.rv_ping_type))) != null) {
                            i = e46.slider_proxy_ping_timeout;
                            HappSliderField happSliderField = (HappSliderField) ln7.b(viewInflate, i);
                            if (happSliderField != null) {
                                i = e46.spinner_ping_mode;
                                HappSpinnerField happSpinnerField = (HappSpinnerField) ln7.b(viewInflate, i);
                                if (happSpinnerField != null) {
                                    i = e46.spinner_ping_result;
                                    HappSpinnerField happSpinnerField2 = (HappSpinnerField) ln7.b(viewInflate, i);
                                    if (happSpinnerField2 != null) {
                                        i = e46.title_category;
                                        if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null) {
                                            i = e46.title_proxy_ping_timeout;
                                            if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null && (toolbarB = ln7.b(viewInflate, (i = e46.toolbar))) != null) {
                                                i = e46.tv_test_url_description;
                                                if (((HappSettingsDescription) ln7.b(viewInflate, i)) != null) {
                                                    i = e46.tv_ui_settings;
                                                    if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null) {
                                                        i = e46.tv_url_test_ping_title;
                                                        if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null) {
                                                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                                                            this.Q0 = new d6(linearLayout, appCompatEditText, frameLayout, recyclerViewB, happSliderField, happSpinnerField, happSpinnerField2, toolbarB, (byte) 0);
                                                            setContentView(linearLayout);
                                                            d6 d6Var = this.Q0;
                                                            if (d6Var == null) {
                                                                dh3.T("binding");
                                                                throw null;
                                                            }
                                                            LinearLayout linearLayout2 = (LinearLayout) d6Var.Y;
                                                            linearLayout2.getClass();
                                                            setBarsParams(linearLayout2);
                                                            d6 d6Var2 = this.Q0;
                                                            if (d6Var2 == null) {
                                                                dh3.T("binding");
                                                                throw null;
                                                            }
                                                            r((Toolbar) d6Var2.f0);
                                                            setTitle(getString(y46.title_ping));
                                                            mb6.g((xn5) this.S0.getValue());
                                                            d6 d6Var3 = this.Q0;
                                                            if (d6Var3 == null) {
                                                                dh3.T("binding");
                                                                throw null;
                                                            }
                                                            ((HappSpinnerField) d6Var3.Z).setSelection(A().e(0, "pref_ping_mode"));
                                                            d6 d6Var4 = this.Q0;
                                                            if (d6Var4 == null) {
                                                                dh3.T("binding");
                                                                throw null;
                                                            }
                                                            HappSpinnerField happSpinnerField3 = (HappSpinnerField) d6Var4.Z;
                                                            if (d6Var4 == null) {
                                                                dh3.T("binding");
                                                                throw null;
                                                            }
                                                            LinearLayout linearLayout3 = (LinearLayout) d6Var4.Y;
                                                            linearLayout3.getClass();
                                                            i21.O(happSpinnerField3, linearLayout3, new vj2(this, (byte) 23));
                                                            d6 d6Var5 = this.Q0;
                                                            if (d6Var5 == null) {
                                                                dh3.T("binding");
                                                                throw null;
                                                            }
                                                            ((HappSliderField) d6Var5.j0).setValue(n67.c().e(7, "pref_proxy_ping_timeout"));
                                                            d6 d6Var6 = this.Q0;
                                                            if (d6Var6 == null) {
                                                                dh3.T("binding");
                                                                throw null;
                                                            }
                                                            HappSliderField happSliderField2 = (HappSliderField) d6Var6.j0;
                                                            final m30 m30Var = new m30(this, (byte) 6);
                                                            happSliderField2.f0.S((vx2) new Object() { // from class: vx2
                                                            });
                                                            d6 d6Var7 = this.Q0;
                                                            if (d6Var7 == null) {
                                                                dh3.T("binding");
                                                                throw null;
                                                            }
                                                            ((FrameLayout) d6Var7.h0).setOnClickListener(new st0(this, (byte) 12));
                                                            d6 d6Var8 = this.Q0;
                                                            if (d6Var8 == null) {
                                                                dh3.T("binding");
                                                                throw null;
                                                            }
                                                            ((HappEditText) d6Var8.g0).setFilters(new rd3[]{new rd3(255)});
                                                            String strI = A().i("pref_delay_test_url");
                                                            if (strI != null) {
                                                                d6 d6Var9 = this.Q0;
                                                                if (d6Var9 == null) {
                                                                    dh3.T("binding");
                                                                    throw null;
                                                                }
                                                                ((HappEditText) d6Var9.g0).setText(wl7.e0(strI));
                                                            }
                                                            d6 d6Var10 = this.Q0;
                                                            if (d6Var10 == null) {
                                                                dh3.T("binding");
                                                                throw null;
                                                            }
                                                            ((HappEditText) d6Var10.g0).addTextChangedListener(new x42(this, (byte) 3));
                                                            int iE = A().e(-1, "pref_ping_result");
                                                            vn5.X.getClass();
                                                            vn5 vn5Var = (vn5) wv0.u0(iE, vn5.g0);
                                                            if (vn5Var == null) {
                                                                vn5Var = vn5.Y;
                                                            }
                                                            d6 d6Var11 = this.Q0;
                                                            if (d6Var11 == null) {
                                                                dh3.T("binding");
                                                                throw null;
                                                            }
                                                            ((HappSpinnerField) d6Var11.k0).setSelection(vn5Var.ordinal());
                                                            d6 d6Var12 = this.Q0;
                                                            if (d6Var12 == null) {
                                                                dh3.T("binding");
                                                                throw null;
                                                            }
                                                            ((HappSpinnerField) d6Var12.k0).setOnSpinnerItemClickListener(new ob4(this, (byte) 1));
                                                            d6 d6Var13 = this.Q0;
                                                            if (d6Var13 == null) {
                                                                dh3.T("binding");
                                                                throw null;
                                                            }
                                                            RecyclerView recyclerView = (RecyclerView) d6Var13.i0;
                                                            vz7 vz7Var = this.T0;
                                                            recyclerView.setAdapter((in5) vz7Var.getValue());
                                                            d6 d6Var14 = this.Q0;
                                                            if (d6Var14 == null) {
                                                                dh3.T("binding");
                                                                throw null;
                                                            }
                                                            ((RecyclerView) d6Var14.i0).setLayoutManager(new LinearLayoutManager(1));
                                                            String[] stringArray = getResources().getStringArray(m26.ping_type);
                                                            stringArray.getClass();
                                                            EPingType.Companion companion = EPingType.INSTANCE;
                                                            int iE2 = A().e(-1, "pref_ping_type");
                                                            companion.getClass();
                                                            EPingType ePingType = (EPingType) wv0.u0(iE2, EPingType.c());
                                                            if (ePingType == null) {
                                                                ePingType = EPingType.VIA_PROXY_GET;
                                                            }
                                                            l22 l22VarC = EPingType.c();
                                                            ArrayList arrayList = new ArrayList(xv0.Z(l22VarC, 10));
                                                            int i2 = 0;
                                                            for (Object obj : l22VarC) {
                                                                int i3 = i2 + 1;
                                                                if (i2 < 0) {
                                                                    i21.X();
                                                                    throw null;
                                                                }
                                                                EPingType ePingType2 = (EPingType) obj;
                                                                String str = stringArray[i2];
                                                                str.getClass();
                                                                arrayList.add(new PingTypeData(str, ePingType2, ePingType == ePingType2));
                                                                i2 = i3;
                                                            }
                                                            in5 in5Var = (in5) vz7Var.getValue();
                                                            in5Var.getClass();
                                                            in5Var.g.b(arrayList);
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
        l lVarI = ((RecyclerView) ((xn5) this.S0.getValue()).X.i0).I(0);
        hn5 hn5Var = lVarI instanceof hn5 ? (hn5) lVarI : null;
        if (hn5Var == null) {
            return false;
        }
        return ((qi3) hn5Var.v.Y).Z.requestFocus();
    }
}

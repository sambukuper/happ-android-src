package su.happ.proxyutility.feature.ui_settings;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.tencent.mmkv.MMKV;
import defpackage.e46;
import defpackage.ln7;
import defpackage.ng8;
import defpackage.ob4;
import defpackage.pl8;
import defpackage.ss8;
import defpackage.t46;
import defpackage.y46;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.ui_settings.UISettingsActivity;
import su.happ.proxyutility.ui.BaseActivity;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDescription;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;
import su.happ.proxyutility.ui.foundation.component.HappToggleField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/ui_settings/UISettingsActivity;", "Lsu/happ/proxyutility/ui/BaseActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class UISettingsActivity extends BaseActivity {
    public static final /* synthetic */ int T0 = 0;
    public y5 Q0;
    public final vz7 R0 = new vz7(new ng8((byte) 2));
    public final vz7 S0 = new vz7(new v38(this, (byte) 8));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MMKV A() {
        return (MMKV) this.R0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: su.happ.proxyutility.feature.ui_settings.UISettingsActivity */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final void onCreate(Bundle bundle) {
        Toolbar toolbarB;
        super.onCreate(bundle);
        final byte b = 0;
        View viewInflate = getLayoutInflater().inflate(t46.activity_ui_settings, (ViewGroup) null, false);
        int i = e46.ll_main;
        if (((LinearLayout) ln7.b(viewInflate, i)) != null) {
            i = e46.ll_ui_settings;
            if (((LinearLayout) ln7.b(viewInflate, i)) != null) {
                i = e46.spinner_font_size;
                HappSpinnerField happSpinnerField = (HappSpinnerField) ln7.b(viewInflate, i);
                if (happSpinnerField != null) {
                    i = e46.toggle_enable_speed;
                    HappToggleField happToggleField = (HappToggleField) ln7.b(viewInflate, i);
                    if (happToggleField != null) {
                        i = e46.toggle_live_updates;
                        HappToggleField happToggleField2 = (HappToggleField) ln7.b(viewInflate, i);
                        if (happToggleField2 != null && (toolbarB = ln7.b(viewInflate, (i = e46.toolbar))) != null) {
                            i = e46.tv_enable_speed_description;
                            if (((HappSettingsDescription) ln7.b(viewInflate, i)) != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                this.Q0 = new y5(linearLayout, happSpinnerField, happToggleField, happToggleField2, toolbarB, (byte) 2);
                                setContentView(linearLayout);
                                mb6.g((pl8) this.S0.getValue());
                                y5 y5Var = this.Q0;
                                if (y5Var == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                LinearLayout linearLayout2 = (LinearLayout) y5Var.Y;
                                linearLayout2.getClass();
                                setBarsParams(linearLayout2);
                                y5 y5Var2 = this.Q0;
                                if (y5Var2 == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                r((Toolbar) y5Var2.f0);
                                setTitle(getString(y46.title_ui_settings));
                                boolean zC = A().c("pref_speed_enabled", false);
                                y5 y5Var3 = this.Q0;
                                if (y5Var3 == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                ((HappToggleField) y5Var3.g0).setChecked(zC);
                                y5 y5Var4 = this.Q0;
                                if (y5Var4 == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                ((HappToggleField) y5Var4.g0).setOnToggleClickListener(new gn2(this) { // from class: ik8
                                    public final /* synthetic */ UISettingsActivity Y;

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    {
                                        this.Y = this;
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    public final Object B(Object obj) {
                                        byte b2 = b;
                                        dn8 dn8Var = dn8.a;
                                        UISettingsActivity uISettingsActivity = this.Y;
                                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                        switch (b2) {
                                            case 0:
                                                int i2 = UISettingsActivity.T0;
                                                uISettingsActivity.A().p("pref_speed_enabled", zBooleanValue);
                                                break;
                                            default:
                                                int i3 = UISettingsActivity.T0;
                                                uISettingsActivity.A().p("pref_live_updates", zBooleanValue);
                                                break;
                                        }
                                        return dn8Var;
                                    }
                                });
                                int iE = A().e(-1, "pref_font_size");
                                aj2.X.getClass();
                                aj2 aj2VarG = k32.g(iE);
                                y5 y5Var5 = this.Q0;
                                if (y5Var5 == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                ((HappSpinnerField) y5Var5.Z).setSelection(aj2VarG.ordinal());
                                y5 y5Var6 = this.Q0;
                                if (y5Var6 == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                ((HappSpinnerField) y5Var6.Z).setOnSpinnerItemClickListener(new ob4(this, (byte) 6));
                                y5 y5Var7 = this.Q0;
                                if (y5Var7 == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                ((HappToggleField) y5Var7.h0).setVisibility(ss8.b ? 0 : 8);
                                boolean zC2 = A().c("pref_live_updates", false);
                                y5 y5Var8 = this.Q0;
                                if (y5Var8 == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                ((HappToggleField) y5Var8.h0).setChecked(zC2);
                                y5 y5Var9 = this.Q0;
                                if (y5Var9 == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                final byte b2 = 1;
                                ((HappToggleField) y5Var9.h0).setOnToggleClickListener(new gn2(this) { // from class: ik8
                                    public final /* synthetic */ UISettingsActivity Y;

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    {
                                        this.Y = this;
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    public final Object B(Object obj) {
                                        byte b3 = b2;
                                        dn8 dn8Var = dn8.a;
                                        UISettingsActivity uISettingsActivity = this.Y;
                                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                        switch (b3) {
                                            case 0:
                                                int i2 = UISettingsActivity.T0;
                                                uISettingsActivity.A().p("pref_speed_enabled", zBooleanValue);
                                                break;
                                            default:
                                                int i3 = UISettingsActivity.T0;
                                                uISettingsActivity.A().p("pref_live_updates", zBooleanValue);
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
        b61.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final Toolbar v() {
        y5 y5Var = this.Q0;
        if (y5Var != null) {
            return (Toolbar) y5Var.f0;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final boolean x() {
        return ((HappToggleField) ((pl8) this.S0.getValue()).X.g0).requestFocus();
    }
}

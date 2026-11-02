package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import su.happ.proxyutility.ui.foundation.component.HappForwardField;
import su.happ.proxyutility.ui.foundation.component.HappInputField;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDescription;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDivider;
import su.happ.proxyutility.ui.foundation.component.HappSnackbarHost;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;
import su.happ.proxyutility.ui.foundation.component.HappToggleField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class w6 extends kw8 {
    public static final /* synthetic */ int E0 = 0;
    public final HappToggleField A0;
    public final HappToggleField B0;
    public final Toolbar C0;
    public final HappSettingsDescription D0;
    public final HappSettingsDivider m0;
    public final HappSettingsDivider n0;
    public final HappForwardField o0;
    public final HappForwardField p0;
    public final HappInputField q0;
    public final HappInputField r0;
    public final HappInputField s0;
    public final LinearLayout t0;
    public final LinearLayout u0;
    public final ScrollView v0;
    public final HappSnackbarHost w0;
    public final HappSpinnerField x0;
    public final HappToggleField y0;
    public final HappToggleField z0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w6(View view, HappSettingsDivider happSettingsDivider, HappSettingsDivider happSettingsDivider2, HappForwardField happForwardField, HappForwardField happForwardField2, HappInputField happInputField, HappInputField happInputField2, HappInputField happInputField3, LinearLayout linearLayout, LinearLayout linearLayout2, ScrollView scrollView, HappSnackbarHost happSnackbarHost, HappSpinnerField happSpinnerField, HappToggleField happToggleField, HappToggleField happToggleField2, HappToggleField happToggleField3, HappToggleField happToggleField4, Toolbar toolbar, HappSettingsDescription happSettingsDescription) {
        super(view, (Object) null);
        this.m0 = happSettingsDivider;
        this.n0 = happSettingsDivider2;
        this.o0 = happForwardField;
        this.p0 = happForwardField2;
        this.q0 = happInputField;
        this.r0 = happInputField2;
        this.s0 = happInputField3;
        this.t0 = linearLayout;
        this.u0 = linearLayout2;
        this.v0 = scrollView;
        this.w0 = happSnackbarHost;
        this.x0 = happSpinnerField;
        this.y0 = happToggleField;
        this.z0 = happToggleField2;
        this.A0 = happToggleField3;
        this.B0 = happToggleField4;
        this.C0 = toolbar;
        this.D0 = happSettingsDescription;
    }
}

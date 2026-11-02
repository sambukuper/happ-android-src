package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import su.happ.proxyutility.ui.foundation.component.HappInputField;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDescription;
import su.happ.proxyutility.ui.foundation.component.HappSnackbarHost;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;
import su.happ.proxyutility.ui.foundation.component.HappToggleField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class z5 extends kw8 {
    public static final /* synthetic */ int B0 = 0;
    public final Toolbar A0;
    public final HappSettingsDescription m0;
    public final HappInputField n0;
    public final HappInputField o0;
    public final HappInputField p0;
    public final HappInputField q0;
    public final HappInputField r0;
    public final HappInputField s0;
    public final LinearLayout t0;
    public final ScrollView u0;
    public final HappSnackbarHost v0;
    public final HappSettingsDescription w0;
    public final HappSpinnerField x0;
    public final HappSpinnerField y0;
    public final HappToggleField z0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z5(View view, HappSettingsDescription happSettingsDescription, HappInputField happInputField, HappInputField happInputField2, HappInputField happInputField3, HappInputField happInputField4, HappInputField happInputField5, HappInputField happInputField6, LinearLayout linearLayout, ScrollView scrollView, HappSnackbarHost happSnackbarHost, HappSettingsDescription happSettingsDescription2, HappSpinnerField happSpinnerField, HappSpinnerField happSpinnerField2, HappToggleField happToggleField, Toolbar toolbar) {
        super(view, (Object) null);
        this.m0 = happSettingsDescription;
        this.n0 = happInputField;
        this.o0 = happInputField2;
        this.p0 = happInputField3;
        this.q0 = happInputField4;
        this.r0 = happInputField5;
        this.s0 = happInputField6;
        this.t0 = linearLayout;
        this.u0 = scrollView;
        this.v0 = happSnackbarHost;
        this.w0 = happSettingsDescription2;
        this.x0 = happSpinnerField;
        this.y0 = happSpinnerField2;
        this.z0 = happToggleField;
        this.A0 = toolbar;
    }
}

package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import su.happ.proxyutility.ui.foundation.component.HappForwardField;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDivider;
import su.happ.proxyutility.ui.foundation.component.HappToggleField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class rl2 implements ov8 {
    public final LinearLayout X;
    public final ProgressBar Y;
    public final HappSettingsDivider Z;
    public final HappSettingsDivider f0;
    public final HappForwardField g0;
    public final HappForwardField h0;
    public final HappForwardField i0;
    public final LinearLayout j0;
    public final HappToggleField k0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public rl2(LinearLayout linearLayout, ProgressBar progressBar, HappSettingsDivider happSettingsDivider, HappSettingsDivider happSettingsDivider2, HappForwardField happForwardField, HappForwardField happForwardField2, HappForwardField happForwardField3, LinearLayout linearLayout2, HappToggleField happToggleField) {
        this.X = linearLayout;
        this.Y = progressBar;
        this.Z = happSettingsDivider;
        this.f0 = happSettingsDivider2;
        this.g0 = happForwardField;
        this.h0 = happForwardField2;
        this.i0 = happForwardField3;
        this.j0 = linearLayout2;
        this.k0 = happToggleField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View getRoot() {
        return this.X;
    }
}

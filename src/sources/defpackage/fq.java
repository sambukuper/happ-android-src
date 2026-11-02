package defpackage;

import androidx.appcompat.widget.AppCompatSpinner;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fq extends ak2 {
    public final /* synthetic */ lq l0;
    public final /* synthetic */ AppCompatSpinner m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq(AppCompatSpinner appCompatSpinner, AppCompatSpinner appCompatSpinner2, lq lqVar) {
        super(appCompatSpinner2);
        this.m0 = appCompatSpinner;
        this.l0 = lqVar;
    }

    @Override // defpackage.ak2
    public final v87 b() {
        return this.l0;
    }

    @Override // defpackage.ak2
    public final boolean c() {
        AppCompatSpinner appCompatSpinner = this.m0;
        if (appCompatSpinner.getInternalPopup().a()) {
            return true;
        }
        appCompatSpinner.k0.n(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
        return true;
    }
}

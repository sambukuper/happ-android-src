package defpackage;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jr4<S> extends dn5 {
    public int e1;
    public bd0 f1;

    @Override // defpackage.qk2
    public final void F(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.e1);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1);
    }

    @Override // defpackage.qk2
    public final void y(Bundle bundle) {
        super.y(bundle);
        if (bundle == null) {
            bundle = this.h0;
        }
        this.e1 = bundle.getInt("THEME_RES_ID_KEY");
        this.f1 = (bd0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // defpackage.qk2
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(k(), this.e1));
        throw null;
    }
}

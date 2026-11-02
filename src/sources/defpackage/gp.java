package defpackage;

import android.view.LayoutInflater;
import androidx.activity.ComponentActivity;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gp implements ia5 {
    public final /* synthetic */ BaseActivity a;

    public gp(BaseActivity baseActivity) {
        this.a = baseActivity;
    }

    @Override // defpackage.ia5
    public final void a(ComponentActivity componentActivity) {
        BaseActivity baseActivity = this.a;
        mp mpVarP = baseActivity.p();
        wp wpVar = (wp) mpVarP;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(wpVar.m0);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(wpVar);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        ((xd6) baseActivity.f0.Z).i("androidx:appcompat");
        mpVarP.c();
    }
}

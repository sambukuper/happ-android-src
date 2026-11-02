package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.l;
import java.util.ArrayList;
import java.util.List;
import su.happ.proxyutility.dto.GeoFileSearchCache;
import su.happ.proxyutility.ui.foundation.component.HappTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class lr2 extends f {
    public final aq6 c;
    public final al5 d;
    public final kn7 e;
    public final iv f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public lr2(aq6 aq6Var, al5 al5Var, kn7 kn7Var) {
        aq6Var.getClass();
        this.c = aq6Var;
        this.d = al5Var;
        this.e = kn7Var;
        this.f = new iv(this, new h52((byte) 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void l(TextView textView, boolean z, boolean z2) {
        if (z2) {
            os4.N(textView, v26.colorHintGray);
        } else if (z) {
            os4.N(textView, v26.colorGeoSelected);
            textView.setTypeface(null, 1);
        } else {
            os4.N(textView, v26.colorTitleDialog);
            textView.setTypeface(null, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a() {
        return this.f.f.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(l lVar, int i) {
        GeoFileSearchCache geoFileSearchCache = (GeoFileSearchCache) this.f.f.get(i);
        f63 f63Var = ((kr2) lVar).u;
        ((HappTextView) f63Var.Z).setText(geoFileSearchCache.getValue());
        l((HappTextView) f63Var.Z, geoFileSearchCache.getIsSelected(), geoFileSearchCache.getHasTitle());
        if (geoFileSearchCache.getHasTitle()) {
            return;
        }
        ((RelativeLayout) f63Var.f0).setOnClickListener(new go1(this, geoFileSearchCache, (byte) 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(l lVar, int i, List list) {
        kr2 kr2Var = (kr2) lVar;
        list.getClass();
        iv ivVar = this.f;
        GeoFileSearchCache geoFileSearchCache = (GeoFileSearchCache) ivVar.f.get(i);
        l((HappTextView) kr2Var.u.Z, geoFileSearchCache.getIsSelected(), geoFileSearchCache.getHasTitle());
        if (list.isEmpty()) {
            e(kr2Var, i);
            return;
        }
        Object objR0 = wv0.r0(list);
        objR0.getClass();
        if (((Bundle) objR0).getBoolean("update")) {
            List list2 = (List) this.e.invoke();
            if (list2 != null) {
                ivVar.b(new ArrayList(list2));
            } else {
                ivVar.b(new ArrayList(ivVar.f));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final l g(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(t46.item_recycler_geofile, viewGroup, false);
        int i2 = e46.geo_file_value_name;
        HappTextView happTextView = (HappTextView) ln7.b(viewInflate, i2);
        if (happTextView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
            return new kr2(this, new f63(relativeLayout, happTextView, relativeLayout, (byte) 5));
        }
        b61.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }
}

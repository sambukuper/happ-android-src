package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fp implements wv6 {
    public final /* synthetic */ byte a;
    public final Object b;

    public fp(xd6 xd6Var) {
        this.a = (byte) 1;
        this.b = new LinkedHashSet();
        xd6Var.D("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.wv6
    public final Bundle a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                ((BaseActivity) obj).p();
                return bundle;
            default:
                Bundle bundleH = dh3.h((qg5[]) Arrays.copyOf(new qg5[0], 0));
                List listY0 = wv0.Y0((LinkedHashSet) obj);
                bundleH.putStringArrayList("classes_to_restore", listY0 instanceof ArrayList ? (ArrayList) listY0 : new ArrayList<>(listY0));
                return bundleH;
        }
    }

    public fp(BaseActivity baseActivity) {
        this.a = (byte) 0;
        this.b = baseActivity;
    }
}

package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tv6 implements wv6 {
    public final xd6 a;
    public boolean b;
    public Bundle c;
    public final vz7 d;

    public tv6(xd6 xd6Var, fx8 fx8Var) {
        xd6Var.getClass();
        this.a = xd6Var;
        this.d = new vz7(new hr5(fx8Var, (byte) 13));
    }

    @Override // defpackage.wv6
    public final Bundle a() {
        Bundle bundleH = dh3.h((qg5[]) Arrays.copyOf(new qg5[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleH.putAll(bundle);
        }
        for (Map.Entry entry : ((uv6) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((hy0) ((ov6) entry.getValue()).b.h0).a();
            if (!bundleA.isEmpty()) {
                str.getClass();
                bundleH.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleH;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleI = this.a.i("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleH = dh3.h((qg5[]) Arrays.copyOf(new qg5[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleH.putAll(bundle);
        }
        if (bundleI != null) {
            bundleH.putAll(bundleI);
        }
        this.c = bundleH;
        this.b = true;
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fj2 {
    public final List a;
    public final boolean b;

    public fj2() {
        this.b = true;
        this.a = Collections.singletonList(null);
    }

    public fj2(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public fj2(ArrayList arrayList) {
        this.b = false;
        this.a = arrayList;
    }
}

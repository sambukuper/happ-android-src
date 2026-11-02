package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wx6 implements nf5 {
    public final int X;
    public final List Y;
    public Float Z = null;
    public Float f0 = null;
    public jx6 g0 = null;
    public jx6 h0 = null;

    public wx6(int i, ArrayList arrayList) {
        this.X = i;
        this.Y = arrayList;
    }

    @Override // defpackage.nf5
    public final boolean t() {
        return this.Y.contains(this);
    }
}

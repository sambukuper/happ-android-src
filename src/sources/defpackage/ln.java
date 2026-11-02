package defpackage;

import android.text.SegmentFinder;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ln extends SegmentFinder {
    public final /* synthetic */ xd6 a;

    public ln(xd6 xd6Var) {
        this.a = xd6Var;
    }

    public final int nextEndBoundary(int i) {
        return this.a.f(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.a(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.c(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.e(i);
    }
}

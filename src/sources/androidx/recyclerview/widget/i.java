package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import defpackage.pv8;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements pv8 {
    public final /* synthetic */ j a;

    public i(j jVar) {
        this.a = jVar;
    }

    @Override // defpackage.pv8
    public final int a(View view) {
        return this.a.R(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    @Override // defpackage.pv8
    public final int b() {
        return this.a.getPaddingTop();
    }

    @Override // defpackage.pv8
    public final int c() {
        j jVar = this.a;
        return jVar.q0 - jVar.getPaddingBottom();
    }

    @Override // defpackage.pv8
    public final View d(int i) {
        return this.a.H(i);
    }

    @Override // defpackage.pv8
    public final int e(View view) {
        return this.a.L(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }
}

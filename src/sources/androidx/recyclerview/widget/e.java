package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import defpackage.td5;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends td5 {
    @Override // defpackage.td5
    public final int d(View view) {
        return ((j) this.b).L(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    @Override // defpackage.td5
    public final int e(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        ((j) this.b).getClass();
        return j.O(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // defpackage.td5
    public final int f(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        ((j) this.b).getClass();
        return j.P(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // defpackage.td5
    public final int g(View view) {
        return ((j) this.b).R(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    @Override // defpackage.td5
    public final int h() {
        return ((j) this.b).q0;
    }

    @Override // defpackage.td5
    public final int i() {
        j jVar = (j) this.b;
        return jVar.q0 - jVar.getPaddingBottom();
    }

    @Override // defpackage.td5
    public final int j() {
        return ((j) this.b).getPaddingBottom();
    }

    @Override // defpackage.td5
    public final int k() {
        return ((j) this.b).o0;
    }

    @Override // defpackage.td5
    public final int l() {
        return ((j) this.b).n0;
    }

    @Override // defpackage.td5
    public final int m() {
        return ((j) this.b).getPaddingTop();
    }

    @Override // defpackage.td5
    public final int n() {
        j jVar = (j) this.b;
        return (jVar.q0 - jVar.getPaddingTop()) - jVar.getPaddingBottom();
    }

    @Override // defpackage.td5
    public final int p(View view) {
        j jVar = (j) this.b;
        Rect rect = (Rect) this.c;
        jVar.W(view, rect);
        return rect.bottom;
    }

    @Override // defpackage.td5
    public final int q(View view) {
        j jVar = (j) this.b;
        Rect rect = (Rect) this.c;
        jVar.W(view, rect);
        return rect.top;
    }

    @Override // defpackage.td5
    public final void r(int i) {
        ((j) this.b).d0(i);
    }
}

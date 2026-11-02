package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.ku4;
import defpackage.mt4;
import defpackage.nt4;
import defpackage.st4;
import defpackage.zv7;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements mt4, ku4, AdapterView.OnItemClickListener {
    public static final int[] g0 = {R.attr.background, R.attr.divider};
    public nt4 f0;

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        zv7 zv7VarR = zv7.r(i, 0, context, attributeSet, g0);
        TypedArray typedArray = (TypedArray) zv7VarR.Y;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(zv7VarR.e(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(zv7VarR.e(1));
        }
        zv7VarR.v();
    }

    @Override // defpackage.mt4
    public final boolean a(st4 st4Var) {
        return this.f0.q(st4Var, null, 0);
    }

    @Override // defpackage.ku4
    public final void b(nt4 nt4Var) {
        this.f0 = nt4Var;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((st4) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}

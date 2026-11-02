package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class el6 extends ViewGroup {
    public final byte f0;
    public final ArrayList g0;
    public final ArrayList h0;
    public final xd6 i0;
    public int j0;

    public el6(Context context) {
        super(context);
        this.f0 = (byte) 5;
        ArrayList arrayList = new ArrayList();
        this.g0 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.h0 = arrayList2;
        this.i0 = new xd6((byte) 2);
        setClipChildren(false);
        gl6 gl6Var = new gl6(context);
        addView(gl6Var);
        arrayList.add(gl6Var);
        arrayList2.add(gl6Var);
        this.j0 = 1;
        setTag(g46.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}

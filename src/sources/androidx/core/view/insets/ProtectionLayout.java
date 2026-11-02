package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.bt;
import defpackage.d08;
import defpackage.fl6;
import defpackage.gw0;
import defpackage.j46;
import defpackage.pc6;
import defpackage.vx5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {
    public static final Object h0 = new Object();
    public final ArrayList f0;
    public vx5 g0;

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f0 = new ArrayList();
    }

    private d08 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(j46.tag_system_bar_state_monitor);
        if (tag instanceof d08) {
            return (d08) tag;
        }
        d08 d08Var = new d08(viewGroup);
        viewGroup.setTag(j46.tag_system_bar_state_monitor, d08Var);
        return d08Var;
    }

    public final void a() {
        ArrayList arrayList = this.f0;
        if (arrayList.isEmpty()) {
            b();
            return;
        }
        d08 orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        b();
        this.g0 = new vx5(orInstallSystemBarStateMonitor, arrayList);
        getChildCount();
        if (this.g0.a.size() <= 0) {
            return;
        }
        gw0 gw0Var = (gw0) this.g0.a.get(0);
        getContext();
        gw0Var.getClass();
        bt.q(pc6.j(0, "Unexpected side: "));
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != h0) {
            vx5 vx5Var = this.g0;
            int childCount = getChildCount() - (vx5Var != null ? vx5Var.a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        if (this.g0 != null) {
            removeViews(getChildCount() - this.g0.a.size(), this.g0.a.size());
            int size = this.g0.a.size();
            vx5 vx5Var = this.g0;
            if (size > 0) {
                ((gw0) vx5Var.a.get(0)).getClass();
                throw null;
            }
            ArrayList arrayList = vx5Var.a;
            if (!vx5Var.f) {
                vx5Var.f = true;
                vx5Var.b.b.remove(vx5Var);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((gw0) arrayList.get(size2)).c = null;
                }
                arrayList.clear();
            }
            this.g0 = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(j46.tag_system_bar_state_monitor);
        if (tag instanceof d08) {
            d08 d08Var = (d08) tag;
            if (d08Var.b.isEmpty()) {
                d08Var.a.post(new fl6((Object) d08Var, (byte) 9));
                viewGroup.setTag(j46.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<gw0> list) {
        ArrayList arrayList = this.f0;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            a();
            requestApplyInsets();
        }
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}

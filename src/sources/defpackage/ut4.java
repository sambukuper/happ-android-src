package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ut4 extends FrameLayout implements qv0 {
    public final CollapsibleActionView f0;

    /* JADX WARN: Multi-variable type inference failed */
    public ut4(View view) {
        super(view.getContext());
        this.f0 = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.qv0
    public final void onActionViewCollapsed() {
        this.f0.onActionViewCollapsed();
    }

    @Override // defpackage.qv0
    public final void onActionViewExpanded() {
        this.f0.onActionViewExpanded();
    }
}

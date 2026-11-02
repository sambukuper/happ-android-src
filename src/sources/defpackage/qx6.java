package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qx6 implements rx6 {
    public final ScrollFeedbackProvider X;

    public qx6(NestedScrollView nestedScrollView) {
        this.X = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.rx6
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.X.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.rx6
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.X.onScrollProgress(i, i2, i3, i4);
    }
}

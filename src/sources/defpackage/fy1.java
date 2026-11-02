package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fy1 extends View {
    public final /* synthetic */ ey1 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy1(ey1 ey1Var, Context context) {
        super(context);
        this.f0 = ey1Var;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) throws Throwable {
        configuration.getClass();
        this.f0.run();
    }
}

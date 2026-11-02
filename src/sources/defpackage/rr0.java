package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import com.tistory.zladnrms.roundablelayout.RoundableLayout;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rr0 extends ViewOutlineProvider {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ rr0(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) throws Exception {
        byte b = this.a;
        View view2 = this.b;
        switch (b) {
            case 0:
                ur0 ur0Var = ((Chip) view2).j0;
                if (ur0Var != null) {
                    ur0Var.getOutline(outline);
                    return;
                } else {
                    outline.setAlpha(0.0f);
                    return;
                }
            default:
                view.getClass();
                outline.getClass();
                Path path = ((RoundableLayout) view2).getPath();
                if (path == null) {
                    throw new Exception();
                }
                outline.setConvexPath(path);
                return;
        }
    }
}

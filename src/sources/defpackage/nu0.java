package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nu0 extends ViewOutlineProvider {
    public final /* synthetic */ byte a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        vw8 vw8Var;
        Outline outline2;
        switch (this.a) {
            case 0:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 3:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 4:
                if (!(view instanceof vw8) || (outline2 = (vw8Var = (vw8) view).j0) == null) {
                    return;
                }
                outline.set(outline2);
                float f = vw8Var.p0;
                if (f == 0.0f && vw8Var.q0 == 0.0f) {
                    return;
                }
                outline.offset((int) f, (int) vw8Var.q0);
                return;
            default:
                view.getClass();
                throw new ClassCastException();
        }
    }
}

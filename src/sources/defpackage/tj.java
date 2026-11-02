package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.google.accompanist.drawablepainter.DrawablePainter;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tj implements Drawable.Callback {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ tj(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                ((xj) obj).invalidateSelf();
                break;
            default:
                drawable.getClass();
                DrawablePainter drawablePainter = (DrawablePainter) obj;
                rh5 rh5Var = drawablePainter.i0;
                rh5Var.setValue(Integer.valueOf(((Number) rh5Var.getValue()).intValue() + 1));
                drawablePainter.j0.setValue(new ua7(zv1.a(drawablePainter.h0)));
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.X) {
            case 0:
                ((xj) this.Y).scheduleSelf(runnable, j);
                break;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) zv1.a.getValue()).postAtTime(runnable, j);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.X) {
            case 0:
                ((xj) this.Y).unscheduleSelf(runnable);
                break;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) zv1.a.getValue()).removeCallbacks(runnable);
                break;
        }
    }
}

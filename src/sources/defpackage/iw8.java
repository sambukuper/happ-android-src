package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class iw8 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte X;

    public /* synthetic */ iw8(byte b) {
        this.X = b;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.X) {
            case 0:
                (view != null ? (kw8) view.getTag(m46.dataBinding) : null).X.run();
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                view.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.X;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}

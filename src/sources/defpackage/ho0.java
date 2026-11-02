package defpackage;

import android.view.View;
import androidx.camera.view.PreviewView;
import com.google.android.material.carousel.CarouselLayoutManager;
import io.sentry.android.replay.k0;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ho0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ho0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    view.post(new c1(carouselLayoutManager, (byte) 10));
                }
                break;
            case 1:
                PreviewView previewView = (PreviewView) obj;
                int i9 = PreviewView.r0;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    previewView.a();
                    s08.b();
                    previewView.getViewPort();
                }
                break;
            default:
                k0 k0Var = (k0) obj;
                int i10 = i4 - i2;
                int i11 = i8 - i6;
                if (i3 - i != i7 - i5 || i10 != i11) {
                    WeakReference weakReference = (WeakReference) wv0.B0(k0Var.i0);
                    if (dh3.f(view, weakReference != null ? (View) weakReference.get() : null)) {
                        view.getClass();
                        k0Var.k(view);
                        break;
                    }
                }
                break;
        }
    }
}

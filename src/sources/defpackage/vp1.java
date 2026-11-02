package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.camera.view.PreviewView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vp1 implements DisplayManager.DisplayListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vp1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        switch (this.a) {
            case 0:
                wp1 wp1Var = (wp1) this.b;
                synchronized (wp1Var.c) {
                    wp1Var.d = null;
                    wp1Var.f = null;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        switch (this.a) {
            case 0:
                wp1 wp1Var = (wp1) this.b;
                synchronized (wp1Var.c) {
                    wp1Var.d = null;
                    wp1Var.f = null;
                }
                return;
            default:
                PreviewView previewView = (PreviewView) this.b;
                Display defaultDisplay = previewView.getDefaultDisplay();
                if (defaultDisplay == null || defaultDisplay.getDisplayId() != i) {
                    return;
                }
                previewView.a();
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        switch (this.a) {
            case 0:
                wp1 wp1Var = (wp1) this.b;
                synchronized (wp1Var.c) {
                    wp1Var.d = null;
                    wp1Var.f = null;
                }
                return;
            default:
                return;
        }
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }
}

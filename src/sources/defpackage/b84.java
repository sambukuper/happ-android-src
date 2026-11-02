package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b84 extends wl7 {
    public final /* synthetic */ byte g;
    public final SideSheetBehavior h;

    public /* synthetic */ b84(SideSheetBehavior sideSheetBehavior, byte b) {
        this.g = b;
        this.h = sideSheetBehavior;
    }

    @Override // defpackage.wl7
    public final int D(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.g) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.wl7
    public final int G() {
        byte b = this.g;
        SideSheetBehavior sideSheetBehavior = this.h;
        switch (b) {
            case 0:
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                return Math.max(0, (sideSheetBehavior.m - sideSheetBehavior.l) - sideSheetBehavior.o);
        }
    }

    @Override // defpackage.wl7
    public final int H() {
        byte b = this.g;
        SideSheetBehavior sideSheetBehavior = this.h;
        switch (b) {
            case 0:
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    @Override // defpackage.wl7
    public final int I() {
        byte b = this.g;
        SideSheetBehavior sideSheetBehavior = this.h;
        switch (b) {
            case 0:
                return sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    @Override // defpackage.wl7
    public final int J() {
        switch (this.g) {
            case 0:
                return -this.h.l;
            default:
                return G();
        }
    }

    @Override // defpackage.wl7
    public final int K(View view) {
        byte b = this.g;
        SideSheetBehavior sideSheetBehavior = this.h;
        switch (b) {
            case 0:
                return view.getRight() + sideSheetBehavior.o;
            default:
                return view.getLeft() - sideSheetBehavior.o;
        }
    }

    @Override // defpackage.wl7
    public final int L(CoordinatorLayout coordinatorLayout) {
        switch (this.g) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // defpackage.wl7
    public final int M() {
        switch (this.g) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // defpackage.wl7
    public final boolean O(float f) {
        switch (this.g) {
            case 0:
                return f > 0.0f;
            default:
                return f < 0.0f;
        }
    }

    @Override // defpackage.wl7
    public final boolean P(View view) {
        switch (this.g) {
            case 0:
                return view.getRight() < (G() - H()) / 2;
            default:
                return view.getLeft() > (G() + this.h.m) / 2;
        }
    }

    @Override // defpackage.wl7
    public final boolean Q(float f, float f2) {
        switch (this.g) {
            case 0:
                return Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f;
            default:
                return Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f;
        }
    }

    @Override // defpackage.wl7
    public final boolean U(View view, float f) {
        byte b = this.g;
        SideSheetBehavior sideSheetBehavior = this.h;
        switch (b) {
            case 0:
                return Math.abs((f * sideSheetBehavior.k) + ((float) view.getLeft())) > 0.5f;
            default:
                return Math.abs((f * sideSheetBehavior.k) + ((float) view.getRight())) > 0.5f;
        }
    }

    @Override // defpackage.wl7
    public final void j0(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.g) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }

    @Override // defpackage.wl7
    public final void k0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        byte b = this.g;
        SideSheetBehavior sideSheetBehavior = this.h;
        switch (b) {
            case 0:
                if (i <= sideSheetBehavior.m) {
                    marginLayoutParams.leftMargin = i2;
                }
                break;
            default:
                int i3 = sideSheetBehavior.m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                }
                break;
        }
    }

    @Override // defpackage.wl7
    public final int p(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.g) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.wl7
    public final float q(int i) {
        switch (this.g) {
            case 0:
                float fH = H();
                return (i - fH) / (G() - fH);
            default:
                float f = this.h.m;
                return (f - i) / (f - G());
        }
    }
}

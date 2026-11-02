package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hx8 extends kx8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ViewPager2 b;

    public /* synthetic */ hx8(ViewPager2 viewPager2, byte b) {
        this.a = b;
        this.b = viewPager2;
    }

    @Override // defpackage.kx8
    public void a(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    this.b.c();
                }
                break;
        }
    }

    @Override // defpackage.kx8
    public final void c(int i) {
        byte b = this.a;
        ViewPager2 viewPager2 = this.b;
        switch (b) {
            case 0:
                if (viewPager2.i0 != i) {
                    viewPager2.i0 = i;
                    viewPager2.y0.r();
                }
                break;
            default:
                viewPager2.clearFocus();
                if (viewPager2.hasFocus()) {
                    viewPager2.o0.requestFocus(2);
                }
                break;
        }
    }
}

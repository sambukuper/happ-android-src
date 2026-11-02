package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lo0 extends mo0 {
    public final /* synthetic */ CarouselLayoutManager b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo0(CarouselLayoutManager carouselLayoutManager) {
        super(0);
        this.b = carouselLayoutManager;
    }

    @Override // defpackage.mo0
    public final int a() {
        CarouselLayoutManager carouselLayoutManager = this.b;
        return carouselLayoutManager.q0 - carouselLayoutManager.getPaddingBottom();
    }

    @Override // defpackage.mo0
    public final int c() {
        return this.b.p0;
    }

    @Override // defpackage.mo0
    public final int d() {
        CarouselLayoutManager carouselLayoutManager = this.b;
        if (carouselLayoutManager.c1()) {
            return carouselLayoutManager.p0;
        }
        return 0;
    }

    @Override // defpackage.mo0
    public final int e() {
        return this.b.getPaddingTop();
    }
}

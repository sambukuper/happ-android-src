package defpackage;

import com.google.android.flexbox.FlexboxLayoutManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xd2 {
    public int a;
    public int b;
    public int c;
    public int d = 0;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ FlexboxLayoutManager h;

    public xd2(FlexboxLayoutManager flexboxLayoutManager) {
        this.h = flexboxLayoutManager;
    }

    public final void a() {
        FlexboxLayoutManager flexboxLayoutManager = this.h;
        if (!flexboxLayoutManager.j() && flexboxLayoutManager.v0) {
            this.c = this.e ? flexboxLayoutManager.D0.i() : flexboxLayoutManager.p0 - flexboxLayoutManager.D0.m();
            return;
        }
        boolean z = this.e;
        td5 td5Var = flexboxLayoutManager.D0;
        this.c = z ? td5Var.i() : td5Var.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.a = -1;
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.f = false;
        this.g = false;
        FlexboxLayoutManager flexboxLayoutManager = this.h;
        boolean zJ = flexboxLayoutManager.j();
        boolean z = flexboxLayoutManager.s0;
        if (zJ) {
            if (z == 0) {
                this.e = flexboxLayoutManager.r0 == 1;
                return;
            } else {
                this.e = z == 2;
                return;
            }
        }
        if (z == 0) {
            this.e = flexboxLayoutManager.r0 == 3;
        } else {
            this.e = z == 2;
        }
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.a + ", mFlexLinePosition=" + this.b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f + ", mAssignedFromSavedState=" + this.g + '}';
    }
}

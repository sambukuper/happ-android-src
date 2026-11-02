package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.leanback.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import java.util.ArrayList;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b20 extends RecyclerView {
    public GridLayoutManager O1;
    public boolean P1;
    public boolean Q1;
    public d96 R1;
    public int S1;
    public int T1;

    public b20(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.P1 = true;
        this.Q1 = true;
        this.S1 = 4;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this);
        this.O1 = gridLayoutManager;
        setLayoutManager(gridLayoutManager);
        setPreserveFocusAfterLayout(false);
        setDescendantFocusability(262144);
        setHasFixedSize(true);
        setChildrenDrawingOrderEnabled(true);
        setWillNotDraw(true);
        setOverScrollMode(2);
        ((ff1) getItemAnimator()).g = false;
        this.u0.add(new v10(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchGenericFocusedEvent(MotionEvent motionEvent) {
        return super.dispatchGenericFocusedEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final View focusSearch(int i) {
        if (isFocused()) {
            GridLayoutManager gridLayoutManager = this.O1;
            View viewD = gridLayoutManager.D(gridLayoutManager.G0);
            if (viewD != null) {
                return focusSearch(viewD, i);
            }
        }
        return super.focusSearch(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int iIndexOfChild;
        GridLayoutManager gridLayoutManager = this.O1;
        View viewD = gridLayoutManager.D(gridLayoutManager.G0);
        if (viewD != null && i2 >= (iIndexOfChild = indexOfChild(viewD))) {
            return i2 < i + (-1) ? ((iIndexOfChild + i) - 1) - i2 : iIndexOfChild;
        }
        return i2;
    }

    public int getExtraLayoutSpace() {
        return this.O1.c1;
    }

    public int getFocusScrollStrategy() {
        return this.O1.Y0;
    }

    @Deprecated
    public int getHorizontalMargin() {
        return this.O1.Q0;
    }

    public int getHorizontalSpacing() {
        return this.O1.Q0;
    }

    public int getInitialPrefetchItemCount() {
        return this.S1;
    }

    public int getItemAlignmentOffset() {
        return ((mi3) this.O1.a1.f0).b;
    }

    public float getItemAlignmentOffsetPercent() {
        return ((mi3) this.O1.a1.f0).c;
    }

    public int getItemAlignmentViewId() {
        return ((mi3) this.O1.a1.f0).a;
    }

    public z10 getOnUnhandledKeyListener() {
        return null;
    }

    public final int getSaveChildrenLimitNumber() {
        return this.O1.e1.Z;
    }

    public final int getSaveChildrenPolicy() {
        return this.O1.e1.Y;
    }

    public int getSelectedPosition() {
        return this.O1.G0;
    }

    public int getSelectedSubPosition() {
        this.O1.getClass();
        return 0;
    }

    public a20 getSmoothScrollByBehavior() {
        return null;
    }

    public final int getSmoothScrollMaxPendingMoves() {
        return this.O1.s0;
    }

    public final float getSmoothScrollSpeedFactor() {
        return this.O1.r0;
    }

    @Deprecated
    public int getVerticalMargin() {
        return this.O1.R0;
    }

    public int getVerticalSpacing() {
        return this.O1.R0;
    }

    public int getWindowAlignment() {
        return ((m09) this.O1.Z0.f0).f;
    }

    public int getWindowAlignmentOffset() {
        return ((m09) this.O1.Z0.f0).g;
    }

    public float getWindowAlignmentOffsetPercent() {
        return ((m09) this.O1.Z0.f0).h;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.Q1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i) {
        GridLayoutManager gridLayoutManager = this.O1;
        if ((gridLayoutManager.E0 & 64) != 0) {
            gridLayoutManager.F1(i, false);
        } else {
            super.j0(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i, int i2) {
        n0(i, i2, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m0(int i, int i2) {
        n0(i, i2, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void o0(int i) {
        GridLayoutManager gridLayoutManager = this.O1;
        if ((gridLayoutManager.E0 & 64) != 0) {
            gridLayoutManager.F1(i, false);
        } else {
            super.o0(i);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        GridLayoutManager gridLayoutManager = this.O1;
        if (!z) {
            gridLayoutManager.getClass();
            return;
        }
        int i2 = gridLayoutManager.G0;
        while (true) {
            View viewD = gridLayoutManager.D(i2);
            if (viewD == null) {
                return;
            }
            if (viewD.getVisibility() == 0 && viewD.hasFocusable()) {
                viewD.requestFocus();
                return;
            }
            i2++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        if ((this.T1 & 1) != 1) {
            GridLayoutManager gridLayoutManager = this.O1;
            int i5 = gridLayoutManager.Y0;
            if (i5 == 1 || i5 == 2) {
                int I = gridLayoutManager.I();
                if ((i & 2) != 0) {
                    i3 = I;
                    i4 = 1;
                    i2 = 0;
                } else {
                    i2 = I - 1;
                    i3 = -1;
                    i4 = -1;
                }
                m09 m09Var = (m09) gridLayoutManager.Z0.f0;
                int i6 = m09Var.j;
                int i7 = ((m09Var.i - i6) - m09Var.k) + i6;
                while (i2 != i3) {
                    View viewH = gridLayoutManager.H(i2);
                    if (viewH.getVisibility() == 0 && gridLayoutManager.v0.g(viewH) >= i6 && gridLayoutManager.v0.d(viewH) <= i7 && viewH.requestFocus(i, rect)) {
                        return true;
                    }
                    i2 += i4;
                }
            } else {
                View viewD = gridLayoutManager.D(gridLayoutManager.G0);
                if (viewD != null) {
                    return viewD.requestFocus(i, rect);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x000f  */
    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        int i2;
        GridLayoutManager gridLayoutManager = this.O1;
        if (gridLayoutManager != null) {
            if (gridLayoutManager.u0) {
                if (i == 1) {
                    i2 = 524288;
                } else {
                    i2 = 0;
                }
            } else if (i == 1) {
                i2 = 262144;
            } else {
                i2 = 0;
            }
            int i3 = gridLayoutManager.E0;
            if ((786432 & i3) == i2) {
                return;
            }
            gridLayoutManager.E0 = i2 | (i3 & (-786433)) | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            ((m09) gridLayoutManager.Z0.Z).l = i == 1;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        boolean z = view.hasFocus() && isFocusable();
        if (z) {
            this.T1 = 1 | this.T1;
            requestFocus();
        }
        super.removeView(view);
        if (z) {
            this.T1 ^= -2;
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        boolean zHasFocus = getChildAt(i).hasFocus();
        if (zHasFocus) {
            this.T1 |= 1;
            requestFocus();
        }
        super.removeViewAt(i);
        if (zHasFocus) {
            this.T1 ^= -2;
        }
    }

    public void setAnimateChildLayout(boolean z) {
        if (this.P1 != z) {
            this.P1 = z;
            if (z) {
                super.setItemAnimator(this.R1);
            } else {
                this.R1 = getItemAnimator();
                super.setItemAnimator(null);
            }
        }
    }

    public void setChildrenVisibility(int i) {
        GridLayoutManager gridLayoutManager = this.O1;
        gridLayoutManager.K0 = i;
        if (i != -1) {
            int I = gridLayoutManager.I();
            for (int i2 = 0; i2 < I; i2++) {
                gridLayoutManager.H(i2).setVisibility(gridLayoutManager.K0);
            }
        }
    }

    public void setExtraLayoutSpace(int i) {
        GridLayoutManager gridLayoutManager = this.O1;
        int i2 = gridLayoutManager.c1;
        if (i2 == i) {
            return;
        }
        if (i2 < 0) {
            bt.q("ExtraLayoutSpace must >= 0");
        } else {
            gridLayoutManager.c1 = i;
            gridLayoutManager.K0();
        }
    }

    public void setFocusDrawingOrderEnabled(boolean z) {
        super.setChildrenDrawingOrderEnabled(z);
    }

    public void setFocusScrollStrategy(int i) {
        if (i != 0 && i != 1 && i != 2) {
            bt.q("Invalid scrollStrategy");
        } else {
            this.O1.Y0 = i;
            requestLayout();
        }
    }

    public final void setFocusSearchDisabled(boolean z) {
        setDescendantFocusability(z ? 393216 : 262144);
        GridLayoutManager gridLayoutManager = this.O1;
        gridLayoutManager.E0 = (z ? 32768 : 0) | (gridLayoutManager.E0 & (-32769));
    }

    public void setGravity(int i) {
        this.O1.U0 = i;
        requestLayout();
    }

    public void setHasOverlappingRendering(boolean z) {
        this.Q1 = z;
    }

    @Deprecated
    public void setHorizontalMargin(int i) {
        setHorizontalSpacing(i);
    }

    public void setHorizontalSpacing(int i) {
        GridLayoutManager gridLayoutManager = this.O1;
        if (gridLayoutManager.u0) {
            gridLayoutManager.Q0 = i;
            gridLayoutManager.T0 = i;
        } else {
            gridLayoutManager.Q0 = i;
            gridLayoutManager.S0 = i;
        }
        requestLayout();
    }

    public void setInitialPrefetchItemCount(int i) {
        this.S1 = i;
    }

    public void setItemAlignmentOffset(int i) {
        GridLayoutManager gridLayoutManager = this.O1;
        ((mi3) gridLayoutManager.a1.f0).b = i;
        gridLayoutManager.G1();
        requestLayout();
    }

    public void setItemAlignmentOffsetPercent(float f) {
        GridLayoutManager gridLayoutManager = this.O1;
        mi3 mi3Var = (mi3) gridLayoutManager.a1.f0;
        if ((f < 0.0f || f > 100.0f) && f != -1.0f) {
            kp5.e();
            return;
        }
        mi3Var.c = f;
        gridLayoutManager.G1();
        requestLayout();
    }

    public void setItemAlignmentOffsetWithPadding(boolean z) {
        GridLayoutManager gridLayoutManager = this.O1;
        ((mi3) gridLayoutManager.a1.f0).d = z;
        gridLayoutManager.G1();
        requestLayout();
    }

    public void setItemAlignmentViewId(int i) {
        GridLayoutManager gridLayoutManager = this.O1;
        ((mi3) gridLayoutManager.a1.f0).a = i;
        gridLayoutManager.G1();
    }

    @Deprecated
    public void setItemMargin(int i) {
        setItemSpacing(i);
    }

    public void setItemSpacing(int i) {
        GridLayoutManager gridLayoutManager = this.O1;
        gridLayoutManager.Q0 = i;
        gridLayoutManager.R0 = i;
        gridLayoutManager.T0 = i;
        gridLayoutManager.S0 = i;
        requestLayout();
    }

    public void setLayoutEnabled(boolean z) {
        GridLayoutManager gridLayoutManager = this.O1;
        int i = gridLayoutManager.E0;
        if (((i & 512) != 0) != z) {
            gridLayoutManager.E0 = (i & (-513)) | (z ? 512 : 0);
            gridLayoutManager.K0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(j jVar) {
        if (jVar != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) jVar;
            this.O1 = gridLayoutManager;
            gridLayoutManager.t0 = this;
            gridLayoutManager.X0 = null;
            super.setLayoutManager(jVar);
            return;
        }
        super.setLayoutManager(null);
        GridLayoutManager gridLayoutManager2 = this.O1;
        if (gridLayoutManager2 != null) {
            gridLayoutManager2.t0 = null;
            gridLayoutManager2.X0 = null;
        }
        this.O1 = null;
    }

    public void setOnChildLaidOutListener(ca5 ca5Var) {
        this.O1.getClass();
    }

    public void setOnChildSelectedListener(da5 da5Var) {
        this.O1.getClass();
    }

    public void setOnChildViewHolderSelectedListener(ea5 ea5Var) {
        GridLayoutManager gridLayoutManager = this.O1;
        if (ea5Var == null) {
            gridLayoutManager.F0 = null;
            return;
        }
        ArrayList arrayList = gridLayoutManager.F0;
        if (arrayList == null) {
            gridLayoutManager.F0 = new ArrayList();
        } else {
            arrayList.clear();
        }
        gridLayoutManager.F0.add(ea5Var);
    }

    public void setPruneChild(boolean z) {
        GridLayoutManager gridLayoutManager = this.O1;
        int i = gridLayoutManager.E0;
        int i2 = DnsOverHttps.MAX_RESPONSE_SIZE;
        if (((i & DnsOverHttps.MAX_RESPONSE_SIZE) != 0) != z) {
            int i3 = i & (-65537);
            if (!z) {
                i2 = 0;
            }
            gridLayoutManager.E0 = i3 | i2;
            if (z) {
                gridLayoutManager.K0();
            }
        }
    }

    public final void setSaveChildrenLimitNumber(int i) {
        cb0 cb0Var = this.O1.e1;
        cb0Var.Z = i;
        cb0Var.c();
    }

    public final void setSaveChildrenPolicy(int i) {
        cb0 cb0Var = this.O1.e1;
        cb0Var.Y = i;
        cb0Var.c();
    }

    public void setScrollEnabled(boolean z) {
        int i;
        GridLayoutManager gridLayoutManager = this.O1;
        int i2 = gridLayoutManager.E0;
        if (((i2 & 131072) != 0) != z) {
            int i3 = (i2 & (-131073)) | (z ? 131072 : 0);
            gridLayoutManager.E0 = i3;
            if ((i3 & 131072) == 0 || gridLayoutManager.Y0 != 0 || (i = gridLayoutManager.G0) == -1) {
                return;
            }
            gridLayoutManager.A1(i, true);
        }
    }

    public void setSelectedPosition(int i) {
        this.O1.F1(i, false);
    }

    public void setSelectedPositionSmooth(int i) {
        this.O1.F1(i, true);
    }

    public final void setSmoothScrollMaxPendingMoves(int i) {
        this.O1.s0 = i;
    }

    public final void setSmoothScrollSpeedFactor(float f) {
        this.O1.r0 = f;
    }

    @Deprecated
    public void setVerticalMargin(int i) {
        setVerticalSpacing(i);
    }

    public void setVerticalSpacing(int i) {
        GridLayoutManager gridLayoutManager = this.O1;
        if (gridLayoutManager.u0) {
            gridLayoutManager.R0 = i;
            gridLayoutManager.S0 = i;
        } else {
            gridLayoutManager.R0 = i;
            gridLayoutManager.T0 = i;
        }
        requestLayout();
    }

    public void setWindowAlignment(int i) {
        ((m09) this.O1.Z0.f0).f = i;
        requestLayout();
    }

    public void setWindowAlignmentOffset(int i) {
        ((m09) this.O1.Z0.f0).g = i;
        requestLayout();
    }

    public void setWindowAlignmentOffsetPercent(float f) {
        m09 m09Var = (m09) this.O1.Z0.f0;
        if ((f < 0.0f || f > 100.0f) && f != -1.0f) {
            kp5.e();
        } else {
            m09Var.h = f;
            requestLayout();
        }
    }

    public void setWindowAlignmentPreferKeyLineOverHighEdge(boolean z) {
        m09 m09Var = (m09) this.O1.Z0.f0;
        int i = m09Var.e;
        m09Var.e = z ? i | 2 : i & (-3);
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverLowEdge(boolean z) {
        m09 m09Var = (m09) this.O1.Z0.f0;
        int i = m09Var.e;
        m09Var.e = z ? i | 1 : i & (-2);
        requestLayout();
    }

    public final void u0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g66.lbBaseGridView);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(g66.lbBaseGridView_focusOutFront, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(g66.lbBaseGridView_focusOutEnd, false);
        GridLayoutManager gridLayoutManager = this.O1;
        gridLayoutManager.E0 = (z ? 2048 : 0) | (gridLayoutManager.E0 & (-6145)) | (z2 ? 4096 : 0);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(g66.lbBaseGridView_focusOutSideStart, true);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(g66.lbBaseGridView_focusOutSideEnd, true);
        GridLayoutManager gridLayoutManager2 = this.O1;
        gridLayoutManager2.E0 = (z3 ? 8192 : 0) | (gridLayoutManager2.E0 & (-24577)) | (z4 ? Http2.INITIAL_MAX_FRAME_SIZE : 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(g66.lbBaseGridView_android_verticalSpacing, typedArrayObtainStyledAttributes.getDimensionPixelSize(g66.lbBaseGridView_verticalMargin, 0));
        if (gridLayoutManager2.u0) {
            gridLayoutManager2.R0 = dimensionPixelSize;
            gridLayoutManager2.S0 = dimensionPixelSize;
        } else {
            gridLayoutManager2.R0 = dimensionPixelSize;
            gridLayoutManager2.T0 = dimensionPixelSize;
        }
        GridLayoutManager gridLayoutManager3 = this.O1;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(g66.lbBaseGridView_android_horizontalSpacing, typedArrayObtainStyledAttributes.getDimensionPixelSize(g66.lbBaseGridView_horizontalMargin, 0));
        if (gridLayoutManager3.u0) {
            gridLayoutManager3.Q0 = dimensionPixelSize2;
            gridLayoutManager3.T0 = dimensionPixelSize2;
        } else {
            gridLayoutManager3.Q0 = dimensionPixelSize2;
            gridLayoutManager3.S0 = dimensionPixelSize2;
        }
        if (typedArrayObtainStyledAttributes.hasValue(g66.lbBaseGridView_android_gravity)) {
            setGravity(typedArrayObtainStyledAttributes.getInt(g66.lbBaseGridView_android_gravity, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setOnKeyInterceptListener(w10 w10Var) {
    }

    public void setOnMotionInterceptListener(x10 x10Var) {
    }

    public void setOnTouchInterceptListener(y10 y10Var) {
    }

    public void setOnUnhandledKeyListener(z10 z10Var) {
    }

    public final void setSmoothScrollByBehavior(a20 a20Var) {
    }
}

package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.j;
import defpackage.bt;
import defpackage.cw8;
import defpackage.d96;
import defpackage.f4;
import defpackage.gx8;
import defpackage.hx8;
import defpackage.i01;
import defpackage.ie2;
import defpackage.ix8;
import defpackage.jf1;
import defpackage.jx8;
import defpackage.kg5;
import defpackage.kk7;
import defpackage.lx8;
import defpackage.ml2;
import defpackage.mx6;
import defpackage.mx8;
import defpackage.nx6;
import defpackage.nx8;
import defpackage.oi0;
import defpackage.ox8;
import defpackage.pk2;
import defpackage.q02;
import defpackage.qi4;
import defpackage.qk2;
import defpackage.t56;
import defpackage.vd0;
import defpackage.xb;
import defpackage.yr6;
import io.sentry.c2;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public final Rect f0;
    public final Rect g0;
    public final i01 h0;
    public int i0;
    public boolean j0;
    public final gx8 k0;
    public final jx8 l0;
    public int m0;
    public Parcelable n0;
    public final nx8 o0;
    public final mx8 p0;
    public final nx6 q0;
    public final i01 r0;
    public final q02 s0;
    public final kg5 t0;
    public d96 u0;
    public boolean v0;
    public boolean w0;
    public int x0;
    public final yr6 y0;

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f0 = new Rect();
        this.g0 = new Rect();
        i01 i01Var = new i01();
        this.h0 = i01Var;
        byte b = 0;
        this.j0 = false;
        this.k0 = new gx8(this, b);
        this.m0 = -1;
        this.u0 = null;
        this.v0 = false;
        byte b2 = 1;
        this.w0 = true;
        this.x0 = -1;
        this.y0 = new yr6(this);
        nx8 nx8Var = new nx8(this, context);
        this.o0 = nx8Var;
        nx8Var.setId(View.generateViewId());
        this.o0.setDescendantFocusability(131072);
        jx8 jx8Var = new jx8(this);
        this.l0 = jx8Var;
        this.o0.setLayoutManager(jx8Var);
        this.o0.setScrollingTouchSlop(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t56.ViewPager2);
        cw8.m(this, context, t56.ViewPager2, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(t56.ViewPager2_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.o0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            nx8 nx8Var2 = this.o0;
            ix8 ix8Var = new ix8();
            ArrayList arrayList = nx8Var2.I0;
            if (arrayList == null) {
                arrayList = new ArrayList();
                nx8Var2.I0 = arrayList;
            }
            arrayList.add(ix8Var);
            nx6 nx6Var = new nx6(this);
            this.q0 = nx6Var;
            this.s0 = new q02((Object) nx6Var, (byte) 3);
            mx8 mx8Var = new mx8(this);
            this.p0 = mx8Var;
            mx8Var.a(this.o0);
            this.o0.j(this.q0);
            i01 i01Var2 = new i01();
            this.r0 = i01Var2;
            this.q0.a = i01Var2;
            hx8 hx8Var = new hx8(this, b);
            hx8 hx8Var2 = new hx8(this, b2);
            ((ArrayList) i01Var2.b).add(hx8Var);
            ((ArrayList) this.r0.b).add(hx8Var2);
            yr6 yr6Var = this.y0;
            nx8 nx8Var3 = this.o0;
            yr6Var.getClass();
            nx8Var3.setImportantForAccessibility(2);
            yr6Var.f0 = new gx8(yr6Var, b2);
            ViewPager2 viewPager2 = (ViewPager2) yr6Var.g0;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            ((ArrayList) this.r0.b).add(i01Var);
            kg5 kg5Var = new kg5(this.l0);
            this.t0 = kg5Var;
            ((ArrayList) this.r0.b).add(kg5Var);
            nx8 nx8Var4 = this.o0;
            attachViewToParent(nx8Var4, 0, nx8Var4.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a() {
        f adapter;
        qk2 qk2VarZ;
        if (this.m0 == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.n0;
        if (parcelable != null) {
            if (adapter instanceof kk7) {
                kk7 kk7Var = (kk7) adapter;
                qi4 qi4Var = kk7Var.e;
                qi4 qi4Var2 = kk7Var.f;
                if (!qi4Var2.d() || !qi4Var.d()) {
                    bt.i("Expected the adapter to be 'fresh' while restoring state.");
                    return;
                }
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(kk7.class.getClassLoader());
                }
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    byte b = 2;
                    if (!it.hasNext()) {
                        if (!qi4Var.d()) {
                            kk7Var.k = true;
                            kk7Var.j = true;
                            kk7Var.n();
                            Handler handler = new Handler(Looper.getMainLooper());
                            xb xbVar = new xb(kk7Var, (byte) 10);
                            kk7Var.c.a(new jf1(handler, xbVar, b));
                            handler.postDelayed(xbVar, 10000L);
                            break;
                        }
                        break;
                    }
                    String next = it.next();
                    if (next.startsWith("f#") && next.length() > 2) {
                        long j = Long.parseLong(next.substring(2));
                        ml2 ml2Var = kk7Var.d;
                        ml2Var.getClass();
                        String string = bundle.getString(next);
                        if (string == null) {
                            qk2VarZ = null;
                        } else {
                            qk2VarZ = ml2Var.c.z(string);
                            if (qk2VarZ == null) {
                                ml2Var.f0(new IllegalStateException(oi0.m("Fragment no longer exists for key ", next, ": unique id ", string)));
                                throw null;
                            }
                        }
                        qi4Var.f(j, qk2VarZ);
                    } else {
                        if (!next.startsWith("s#") || next.length() <= 2) {
                            bt.q("Unexpected key in savedState: ".concat(next));
                            return;
                        }
                        long j2 = Long.parseLong(next.substring(2));
                        pk2 pk2Var = (pk2) bundle.getParcelable(next);
                        if (kk7Var.m(j2)) {
                            qi4Var2.f(j2, pk2Var);
                        }
                    }
                }
            }
            this.n0 = null;
        }
        int iMax = Math.max(0, Math.min(this.m0, adapter.a() - 1));
        this.i0 = iMax;
        this.m0 = -1;
        this.o0.j0(iMax);
        this.y0.r();
    }

    public final void b(int i) {
        i01 i01Var;
        f adapter = getAdapter();
        if (adapter == null) {
            if (this.m0 != -1) {
                this.m0 = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.a() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.a() - 1);
        int i2 = this.i0;
        nx6 nx6Var = this.q0;
        if ((iMin == i2 && nx6Var.f == 0) || iMin == i2) {
            return;
        }
        double d = i2;
        this.i0 = iMin;
        this.y0.r();
        if (nx6Var.f != 0) {
            nx6Var.e();
            mx6 mx6Var = nx6Var.g;
            d = ((double) mx6Var.a) + ((double) mx6Var.b);
        }
        nx6Var.getClass();
        nx6Var.e = 2;
        boolean z = nx6Var.i != iMin;
        nx6Var.i = iMin;
        nx6Var.c(2);
        if (z && (i01Var = nx6Var.a) != null) {
            i01Var.c(iMin);
        }
        double d2 = iMin;
        double dAbs = Math.abs(d2 - d);
        nx8 nx8Var = this.o0;
        if (dAbs <= 3.0d) {
            nx8Var.o0(iMin);
        } else {
            nx8Var.j0(d2 > d ? iMin - 3 : iMin + 3);
            nx8Var.post(new vd0(iMin, nx8Var));
        }
    }

    public final void c() {
        mx8 mx8Var = this.p0;
        if (mx8Var == null) {
            bt.i("Design assumption violated.");
            return;
        }
        jx8 jx8Var = this.l0;
        View viewE = mx8Var.e(jx8Var);
        if (viewE == null) {
            return;
        }
        jx8Var.getClass();
        int iT = j.T(viewE);
        if (iT != this.i0 && getScrollState() == 0) {
            this.r0.c(iT);
        }
        this.j0 = false;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.o0.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.o0.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof ox8) {
            int i = ((ox8) parcelable).X;
            sparseArray.put(this.o0.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.y0.getClass();
        this.y0.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public f getAdapter() {
        return this.o0.getAdapter();
    }

    public int getCurrentItem() {
        return this.i0;
    }

    public int getItemDecorationCount() {
        return this.o0.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.x0;
    }

    public int getOrientation() {
        return this.l0.r0 == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        int orientation = getOrientation();
        nx8 nx8Var = this.o0;
        if (orientation == 0) {
            height = nx8Var.getWidth() - nx8Var.getPaddingLeft();
            paddingBottom = nx8Var.getPaddingRight();
        } else {
            height = nx8Var.getHeight() - nx8Var.getPaddingTop();
            paddingBottom = nx8Var.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.q0.f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iA;
        int iA2;
        int iA3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.y0.g0;
        if (viewPager2.getAdapter() == null) {
            iA = 0;
            iA2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            iA = viewPager2.getAdapter().a();
            iA2 = 1;
        } else {
            iA2 = viewPager2.getAdapter().a();
            iA = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f4.a(iA, iA2, 0).X);
        f adapter = viewPager2.getAdapter();
        if (adapter == null || (iA3 = adapter.a()) == 0 || !viewPager2.w0) {
            return;
        }
        if (viewPager2.i0 > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.i0 < iA3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        nx8 nx8Var = this.o0;
        int measuredWidth = nx8Var.getMeasuredWidth();
        int measuredHeight = nx8Var.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f0;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.g0;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        nx8Var.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.j0) {
            c();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.o0, i, i2);
        int measuredWidth = this.o0.getMeasuredWidth();
        int measuredHeight = this.o0.getMeasuredHeight();
        int measuredState = this.o0.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ox8)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ox8 ox8Var = (ox8) parcelable;
        super.onRestoreInstanceState(ox8Var.getSuperState());
        this.m0 = ox8Var.Y;
        this.n0 = ox8Var.Z;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ox8 ox8Var = new ox8(super.onSaveInstanceState());
        nx8 nx8Var = this.o0;
        ox8Var.X = nx8Var.getId();
        int i = this.m0;
        if (i == -1) {
            i = this.i0;
        }
        ox8Var.Y = i;
        Parcelable parcelable = this.n0;
        if (parcelable != null) {
            ox8Var.Z = parcelable;
            return ox8Var;
        }
        f adapter = nx8Var.getAdapter();
        if (adapter instanceof kk7) {
            kk7 kk7Var = (kk7) adapter;
            kk7Var.getClass();
            qi4 qi4Var = kk7Var.e;
            int iH = qi4Var.h();
            qi4 qi4Var2 = kk7Var.f;
            Bundle bundle = new Bundle(qi4Var2.h() + iH);
            for (int i2 = 0; i2 < qi4Var.h(); i2++) {
                long jE = qi4Var.e(i2);
                qk2 qk2Var = (qk2) qi4Var.b(jE);
                if (qk2Var != null && qk2Var.s()) {
                    String strF = ie2.f(jE, "f#");
                    ml2 ml2Var = kk7Var.d;
                    ml2Var.getClass();
                    if (qk2Var.v0 != ml2Var) {
                        ml2Var.f0(new IllegalStateException(ie2.i("Fragment ", qk2Var, " is not currently in the FragmentManager")));
                        throw null;
                    }
                    bundle.putString(strF, qk2Var.g0);
                }
            }
            for (int i3 = 0; i3 < qi4Var2.h(); i3++) {
                long jE2 = qi4Var2.e(i3);
                if (kk7Var.m(jE2)) {
                    bundle.putParcelable(ie2.f(jE2, "s#"), (Parcelable) qi4Var2.b(jE2));
                }
            }
            ox8Var.Z = bundle;
        }
        return ox8Var;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        yr6 yr6Var = this.y0;
        yr6Var.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        yr6Var.getClass();
        ViewPager2 viewPager2 = (ViewPager2) yr6Var.g0;
        if (i != 8192 && i != 4096) {
            c2.g();
            return false;
        }
        int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.w0) {
            viewPager2.b(currentItem);
        }
        return true;
    }

    public void setAdapter(f fVar) {
        nx8 nx8Var = this.o0;
        f adapter = nx8Var.getAdapter();
        yr6 yr6Var = this.y0;
        if (adapter != null) {
            adapter.a.unregisterObserver((gx8) yr6Var.f0);
        } else {
            yr6Var.getClass();
        }
        gx8 gx8Var = this.k0;
        if (adapter != null) {
            adapter.a.unregisterObserver(gx8Var);
        }
        nx8Var.setAdapter(fVar);
        this.i0 = 0;
        a();
        yr6Var.r();
        if (fVar != null) {
            fVar.a.registerObserver((gx8) yr6Var.f0);
        }
        if (fVar != null) {
            fVar.a.registerObserver(gx8Var);
        }
    }

    public void setCurrentItem(int i) {
        Object obj = this.s0.Y;
        b(i);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.y0.r();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            bt.q("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        } else {
            this.x0 = i;
            this.o0.requestLayout();
        }
    }

    public void setOrientation(int i) {
        this.l0.A1(i);
        this.y0.r();
    }

    public void setPageTransformer(lx8 lx8Var) {
        boolean z = this.v0;
        nx8 nx8Var = this.o0;
        if (lx8Var != null) {
            if (!z) {
                this.u0 = nx8Var.getItemAnimator();
                this.v0 = true;
            }
            nx8Var.setItemAnimator(null);
        } else if (z) {
            nx8Var.setItemAnimator(this.u0);
            this.u0 = null;
            this.v0 = false;
        }
        kg5 kg5Var = this.t0;
        if (lx8Var == kg5Var.b) {
            return;
        }
        kg5Var.b = lx8Var;
        if (lx8Var == null) {
            return;
        }
        nx6 nx6Var = this.q0;
        nx6Var.e();
        mx6 mx6Var = nx6Var.g;
        double d = ((double) mx6Var.a) + ((double) mx6Var.b);
        int i = (int) d;
        float f = (float) (d - ((double) i));
        kg5Var.b(i, f, Math.round(getPageSize() * f));
    }

    public void setUserInputEnabled(boolean z) {
        this.w0 = z;
        this.y0.r();
    }
}

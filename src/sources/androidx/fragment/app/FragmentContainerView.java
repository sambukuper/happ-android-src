package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import defpackage.b61;
import defpackage.bt;
import defpackage.cw8;
import defpackage.e66;
import defpackage.gl2;
import defpackage.ml2;
import defpackage.om0;
import defpackage.qk2;
import defpackage.r00;
import defpackage.t36;
import defpackage.tk2;
import defpackage.w19;
import defpackage.wl2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00028\u0000\"\n\b\u0000\u0010\u0018*\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", _UrlKt.FRAGMENT_ENCODE_SET, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/animation/LayoutTransition;", "transition", "Ldn8;", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", _UrlKt.FRAGMENT_ENCODE_SET, "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Lqk2;", "F", "getFragment", "()Lqk2;", MetaParams.FRAGMENT}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList f0;
    public final ArrayList g0;
    public View.OnApplyWindowInsetsListener h0;
    public boolean i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, ml2 ml2Var) {
        View view;
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.f0 = new ArrayList();
        this.g0 = new ArrayList();
        this.i0 = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = e66.FragmentContainerView;
        iArr.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(e66.FragmentContainerView_android_name) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(e66.FragmentContainerView_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        qk2 qk2VarD = ml2Var.D(id);
        if (classAttribute != null && qk2VarD == null) {
            if (id == -1) {
                b61.k("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag " + ((Object) string) : _UrlKt.FRAGMENT_ENCODE_SET);
                throw null;
            }
            gl2 gl2VarI = ml2Var.I();
            context.getClassLoader();
            qk2 qk2VarA = gl2VarI.a(classAttribute);
            qk2VarA.getClass();
            qk2VarA.z0 = id;
            qk2VarA.A0 = id;
            qk2VarA.B0 = string;
            qk2VarA.v0 = ml2Var;
            tk2 tk2Var = ml2Var.w;
            qk2VarA.w0 = tk2Var;
            qk2VarA.H0 = true;
            if ((tk2Var == null ? null : tk2Var.B0) != null) {
                qk2VarA.H0 = true;
            }
            r00 r00Var = new r00(ml2Var);
            r00Var.o = true;
            qk2VarA.I0 = this;
            qk2VarA.r0 = true;
            r00Var.g(getId(), qk2VarA, string, 1);
            if (r00Var.g) {
                bt.i("This transaction is already being added to the back stack");
                throw null;
            }
            r00Var.q.B(r00Var, true);
        }
        for (wl2 wl2Var : ml2Var.c.C()) {
            qk2 qk2Var = wl2Var.c;
            if (qk2Var.A0 == getId() && (view = qk2Var.J0) != null && view.getParent() == null) {
                qk2Var.I0 = this;
                wl2Var.b();
                wl2Var.k();
            }
        }
    }

    public final void a(View view) {
        if (this.g0.contains(view)) {
            this.f0.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(t36.fragment_container_view_tag);
        if ((tag instanceof qk2 ? (qk2) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            om0.l("Views added to a FragmentContainerView must be associated with a Fragment. View ", view, " is not associated with a Fragment.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        w19 w19VarG;
        windowInsets.getClass();
        w19 w19VarG2 = w19.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.h0;
        if (onApplyWindowInsetsListener != null) {
            w19VarG = w19.g(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            WeakHashMap weakHashMap = cw8.a;
            WindowInsets windowInsetsF = w19VarG2.f();
            if (windowInsetsF != null && !windowInsetsF.equals(windowInsetsF)) {
                w19VarG2 = w19.g(this, windowInsetsF);
            }
            w19VarG = w19VarG2;
        }
        if (!w19VarG.a.r()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                cw8.b(getChildAt(i), w19VarG);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.i0) {
            Iterator it = this.f0.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.i0) {
            ArrayList arrayList = this.f0;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.g0.remove(view);
        if (this.f0.remove(view)) {
            this.i0 = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends qk2> F getFragment() {
        qk2 qk2Var;
        FragmentActivity fragmentActivity;
        ml2 ml2VarN;
        View view = this;
        while (true) {
            if (view == null) {
                qk2Var = null;
                break;
            }
            Object tag = view.getTag(t36.fragment_container_view_tag);
            qk2Var = tag instanceof qk2 ? (qk2) tag : null;
            if (qk2Var != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (qk2Var == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    fragmentActivity = null;
                    break;
                }
                if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (fragmentActivity == null) {
                b61.k("View ", this, " is not within a subclass of FragmentActivity.");
                return null;
            }
            ml2VarN = fragmentActivity.n();
        } else {
            if (!qk2Var.s()) {
                throw new IllegalStateException("The Fragment " + qk2Var + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            ml2VarN = qk2Var.j();
        }
        return (F) ml2VarN.D(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.i0 = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        this.h0 = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.g0.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        String str;
        super(context, attributeSet, i);
        context.getClass();
        this.f0 = new ArrayList();
        this.g0 = new ArrayList();
        this.i0 = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = e66.FragmentContainerView;
            iArr.getClass();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            typedArrayObtainStyledAttributes.getClass();
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(e66.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + ((Object) str) + "=\"" + ((Object) classAttribute) + "\"");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }
}

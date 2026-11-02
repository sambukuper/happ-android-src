package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.b1;
import defpackage.bt;
import defpackage.c1;
import defpackage.cr5;
import defpackage.d94;
import defpackage.dw8;
import defpackage.ew8;
import defpackage.fx8;
import defpackage.g00;
import defpackage.g46;
import defpackage.ge;
import defpackage.gs8;
import defpackage.h59;
import defpackage.lp2;
import defpackage.m01;
import defpackage.m59;
import defpackage.m86;
import defpackage.mf5;
import defpackage.p86;
import defpackage.pc6;
import defpackage.pn7;
import defpackage.q29;
import defpackage.s05;
import defpackage.ts7;
import defpackage.u15;
import defpackage.u52;
import defpackage.us7;
import defpackage.xz0;
import defpackage.ys7;
import defpackage.yv6;
import defpackage.yw;
import defpackage.zy0;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u001d\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010!\u001a\u0004\u0018\u00010\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u000eR.\u0010)\u001a\u0004\u0018\u00010\"2\b\u0010\u0018\u001a\u0004\u0018\u00010\"8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010/\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b+\u0010,\u0012\u0004\b-\u0010.R0\u00106\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00138\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b0\u00101\u0012\u0004\b5\u0010.\u001a\u0004\b2\u00103\"\u0004\b4\u0010\u0016R\u0014\u00108\u001a\u00020\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b7\u00103R$\u0010>\u001a\u0002092\u0006\u0010\u0018\u001a\u0002098F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0011\u0010@\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b?\u00103¨\u0006A"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", _UrlKt.FRAGMENT_ENCODE_SET, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lm01;", "parent", "Ldn8;", "setParentCompositionContext", "(Lm01;)V", "Lew8;", "strategy", "setViewCompositionStrategy", "(Lew8;)V", _UrlKt.FRAGMENT_ENCODE_SET, "isTransitionGroup", "setTransitionGroup", "(Z)V", "Landroid/os/IBinder;", "value", "g0", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "i0", "Lm01;", "setParentContext", "parentContext", "Lxz0;", "j0", "Lxz0;", "getComposeViewContext$ui", "()Lxz0;", "setComposeViewContext$ui", "(Lxz0;)V", "composeViewContext", "Lkotlin/Function0;", "k0", "Ldn2;", "getDisposeViewCompositionStrategy$annotations", "()V", "disposeViewCompositionStrategy", "l0", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "Lyw;", "getAutoClearFocusBehavior-4UtRPd4", "()I", "setAutoClearFocusBehavior-17tfJxM", "(I)V", "autoClearFocusBehavior", "getHasComposition", "hasComposition", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AbstractComposeView extends ViewGroup {
    public static final /* synthetic */ int o0 = 0;
    public WeakReference f0;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public IBinder previousAttachedWindowToken;
    public h59 h0;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public m01 parentContext;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public xz0 composeViewContext;
    public g00 k0;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public boolean showLayoutBounds;
    public boolean m0;
    public boolean n0;

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        ge geVar = new ge(this, (byte) 7);
        addOnAttachStateChangeListener(geVar);
        dw8 dw8Var = new dw8(this);
        cr5.b(this).a.add(dw8Var);
        this.k0 = new g00((Object) this, (Object) geVar, (Object) dw8Var, (byte) 20);
    }

    private final void setParentContext(m01 m01Var) {
        if (this.parentContext != m01Var) {
            this.parentContext = m01Var;
            if (m01Var != null) {
                this.f0 = null;
            }
            h59 h59Var = this.h0;
            if (h59Var != null) {
                h59Var.a();
                this.h0 = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.f0 = null;
        }
    }

    public abstract void a(int i, lp2 lp2Var);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.composeViewContext == null) {
                AndroidComposeView androidComposeView = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof AndroidComposeView) {
                        androidComposeView = (AndroidComposeView) childAt;
                    }
                }
                if (androidComposeView != null) {
                    androidComposeView.setComposeViewContext(k(u15.n(this), androidComposeView.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                f();
            }
        }
    }

    public final void c() {
        if (this.m0) {
            return;
        }
        u52.k(pc6.p("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
    }

    public final void d() {
        xz0 xz0Var;
        if (this.parentContext != null || isAttachedToWindow() || ((xz0Var = this.composeViewContext) != null && xz0Var.a.isAttachedToWindow())) {
            f();
        } else {
            bt.i("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
    }

    public final void e() {
        View childAt = getChildAt(0);
        AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
        if (androidComposeView != null && androidComposeView.composeViewContextIncrementedDuringInit) {
            androidComposeView.getComposeViewContext().b();
            androidComposeView.composeViewContextIncrementedDuringInit = false;
        }
        h59 h59Var = this.h0;
        if (h59Var != null) {
            h59Var.a();
        }
        this.h0 = null;
        requestLayout();
    }

    public final void f() {
        if (this.h0 == null) {
            byte b = 0;
            try {
                this.m0 = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    xz0 xz0VarI = this.composeViewContext;
                    if (xz0VarI == null) {
                        xz0VarI = i();
                    }
                    this.h0 = m59.a(this, xz0VarI, new zy0(1003123809, true, new b1(this, b)));
                    Trace.endSection();
                    this.m0 = false;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                this.m0 = false;
                throw th2;
            }
        }
    }

    public void g(int i, boolean z, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m0getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(g46.auto_clear_focus_behavior_tag);
        yw ywVar = tag instanceof yw ? (yw) tag : null;
        if (ywVar != null) {
            return ywVar.a;
        }
        return 1;
    }

    /* JADX INFO: renamed from: getComposeViewContext$ui, reason: from getter */
    public final xz0 getComposeViewContext() {
        return this.composeViewContext;
    }

    public final boolean getHasComposition() {
        return this.h0 != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public final xz0 i() {
        xz0 composeViewContext;
        fx8 fx8Var;
        fx8 fx8Var2 = null;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
            if (androidComposeView != null) {
                composeViewContext = androidComposeView.getComposeViewContext();
            } else {
                composeViewContext = null;
            }
        }
        View viewN = u15.n(this);
        xz0 xz0VarR = u15.r(viewN);
        if (xz0VarR != null) {
            return k(viewN, xz0VarR);
        }
        m01 m01VarJ = j();
        d94 d94VarB = us7.b(viewN);
        if (d94VarB == null) {
            d94VarB = composeViewContext != null ? composeViewContext.d() : null;
            if (d94VarB == null) {
                bt.i("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        d94 d94Var = d94VarB;
        yv6 yv6VarD = ys7.d(viewN);
        if (yv6VarD == null) {
            if (composeViewContext != null) {
                composeViewContext.g();
                yv6VarD = composeViewContext.e;
                yv6VarD.getClass();
            } else {
                yv6VarD = null;
            }
            if (yv6VarD == null) {
                bt.i("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        yv6 yv6Var = yv6VarD;
        fx8 fx8VarJ = gs8.j(viewN);
        if (fx8VarJ == null) {
            if (composeViewContext != null) {
                composeViewContext.g();
                fx8Var2 = composeViewContext.f;
            }
            fx8Var = fx8Var2;
        } else {
            fx8Var = fx8VarJ;
        }
        xz0 xz0Var = new xz0(u15.r(u15.n(viewN)), viewN, m01VarJ, d94Var, yv6Var, fx8Var);
        viewN.setTag(g46.androidx_compose_ui_view_compose_view_context, new WeakReference(xz0Var));
        return xz0Var;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.n0 || super.isTransitionGroup();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [m01] */
    /* JADX WARN: Type inference failed for: r0v1, types: [m01] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [m01] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [p86] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19 */
    public final m01 j() {
        m01 m01Var;
        ?? A = this.parentContext;
        if (A == 0) {
            A = q29.a(this);
            if (A == 0) {
                Object parent = getParent();
                while (true) {
                    if (A != 0 || !(parent instanceof View)) {
                        A = A;
                        break;
                    }
                    A = A;
                    View view = (View) parent;
                    m01 m01VarA = q29.a(view);
                    parent = ts7.d(view);
                    A = m01VarA;
                }
            }
            m86 m86Var = m86.Y;
            if (A != 0) {
                ?? r3 = (!(A instanceof p86) || ((m86) ((p86) A).u.getValue()).compareTo(m86Var) > 0) ? A : 0;
                if (r3 != 0) {
                    this.f0 = new WeakReference(r3);
                }
            } else {
                A = 0;
            }
            if (A == 0) {
                WeakReference weakReference = this.f0;
                if (weakReference == null || (m01Var = (m01) weakReference.get()) == null || ((m01Var instanceof p86) && ((m86) ((p86) m01Var).u.getValue()).compareTo(m86Var) <= 0)) {
                    A = m01Var;
                    A = m01Var;
                    A = 0;
                }
                if (A == 0) {
                    A = q29.b(this);
                    ?? r2 = ((m86) A.u.getValue()).compareTo(m86Var) > 0 ? A : 0;
                    if (r2 != 0) {
                        this.f0 = new WeakReference(r2);
                    }
                }
            }
        }
        return A;
    }

    public final xz0 k(View view, xz0 xz0Var) {
        m01 m01VarJ = j();
        d94 d94VarB = us7.b(view);
        fx8 fx8VarJ = gs8.j(view);
        yv6 yv6VarD = ys7.d(view);
        if (m01VarJ == xz0Var.c() && d94VarB == xz0Var.d()) {
            xz0Var.g();
            if (fx8VarJ == xz0Var.f) {
                xz0Var.g();
                yv6 yv6Var = xz0Var.e;
                yv6Var.getClass();
                if (yv6VarD == yv6Var) {
                    return xz0Var;
                }
            }
        }
        if (m01VarJ.j() != xz0Var.c().j()) {
            e();
        }
        if (d94VarB == null) {
            d94VarB = xz0Var.d();
        }
        d94 d94Var = d94VarB;
        if (yv6VarD == null) {
            xz0Var.g();
            yv6VarD = xz0Var.e;
            yv6VarD.getClass();
        }
        xz0 xz0Var2 = new xz0(xz0Var, view, m01VarJ, d94Var, yv6VarD, fx8VarJ);
        view.setTag(g46.androidx_compose_ui_view_compose_view_context, new WeakReference(xz0Var2));
        return xz0Var2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s05 s05Var = q29.a;
        Object objD = ts7.d(this);
        View view = this;
        while (objD instanceof View) {
            View view2 = (View) objD;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objD = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new c1(this, (byte) 0));
        } else {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g(i, z, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        f();
        h(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m1setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(g46.auto_clear_focus_behavior_tag, new yw(i));
    }

    public final void setComposeViewContext$ui(xz0 xz0Var) {
        if (this.composeViewContext != xz0Var) {
            if (xz0Var == null) {
                e();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
                if (androidComposeView != null) {
                    if (androidComposeView.getCoroutineContext() != xz0Var.c().j()) {
                        e();
                    }
                    androidComposeView.setComposeViewContext(xz0Var);
                }
            }
            this.composeViewContext = xz0Var;
        }
    }

    public final void setParentCompositionContext(m01 parent) {
        setParentContext(parent);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((mf5) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean isTransitionGroup) {
        super.setTransitionGroup(isTransitionGroup);
        this.n0 = true;
    }

    public final void setViewCompositionStrategy(ew8 strategy) {
        g00 g00Var = this.k0;
        if (g00Var != null) {
            g00Var.invoke();
        }
        ((pn7) strategy).getClass();
        ge geVar = new ge(this, (byte) 7);
        addOnAttachStateChangeListener(geVar);
        dw8 dw8Var = new dw8(this);
        cr5.b(this).a.add(dw8Var);
        this.k0 = new g00((Object) this, (Object) geVar, (Object) dw8Var, (byte) 20);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public /* synthetic */ AbstractComposeView(Context context) {
        this(context, null, 0);
    }
}

package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.h;
import androidx.appcompat.widget.i;
import io.sentry.c2;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s09 extends u70 implements b5 {
    public static final AccelerateInterpolator E = new AccelerateInterpolator();
    public static final DecelerateInterpolator F = new DecelerateInterpolator();
    public boolean A;
    public final p09 B;
    public final p09 C;
    public final q09 D;
    public Context g;
    public Context h;
    public ActionBarOverlayLayout i;
    public ActionBarContainer j;
    public wd1 k;
    public ActionBarContextView l;
    public final View m;
    public boolean n;
    public r09 o;
    public r09 p;
    public dq q;
    public boolean r;
    public final ArrayList s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public sx8 y;
    public boolean z;

    public s09(Activity activity, boolean z) {
        new ArrayList();
        this.s = new ArrayList();
        this.t = 0;
        this.u = true;
        this.x = true;
        this.B = new p09(this, (byte) 0);
        this.C = new p09(this, (byte) 1);
        this.D = new q09(this);
        View decorView = activity.getWindow().getDecorView();
        v0(decorView);
        if (z) {
            return;
        }
        this.m = decorView.findViewById(R.id.content);
    }

    @Override // defpackage.u70
    public final boolean B() {
        h hVar;
        wd1 wd1Var = this.k;
        if (wd1Var == null || (hVar = ((i) wd1Var).a.R0) == null || hVar.Y == null) {
            return false;
        }
        h hVar2 = ((i) wd1Var).a.R0;
        st4 st4Var = hVar2 == null ? null : hVar2.Y;
        if (st4Var == null) {
            return true;
        }
        st4Var.collapseActionView();
        return true;
    }

    @Override // defpackage.u70
    public final void H(boolean z) {
        if (z == this.r) {
            return;
        }
        this.r = z;
        ArrayList arrayList = this.s;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        c2.m();
    }

    @Override // defpackage.u70
    public final int N() {
        return ((i) this.k).b;
    }

    @Override // defpackage.u70
    public final Context U() {
        Context context = this.h;
        if (context != null) {
            return context;
        }
        TypedValue typedValue = new TypedValue();
        this.g.getTheme().resolveAttribute(w26.actionBarWidgetTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.g, i);
            this.h = contextThemeWrapper;
            return contextThemeWrapper;
        }
        Context context2 = this.g;
        this.h = context2;
        return context2;
    }

    @Override // defpackage.u70
    public final void Z() {
        w0(this.g.getResources().getBoolean(z26.abc_action_bar_embed_tabs));
    }

    @Override // defpackage.u70
    public final boolean b0(int i, KeyEvent keyEvent) {
        nt4 nt4Var;
        r09 r09Var = this.o;
        if (r09Var == null || (nt4Var = r09Var.g0) == null) {
            return false;
        }
        nt4Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return nt4Var.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.u70
    public final void k0(boolean z) {
        if (this.n) {
            return;
        }
        l0(z);
    }

    @Override // defpackage.u70
    public final void l0(boolean z) {
        int i = z ? 4 : 0;
        i iVar = (i) this.k;
        int i2 = iVar.b;
        this.n = true;
        iVar.a((i & 4) | (i2 & (-5)));
    }

    @Override // defpackage.u70
    public final void m0(boolean z) {
        sx8 sx8Var;
        this.z = z;
        if (z || (sx8Var = this.y) == null) {
            return;
        }
        sx8Var.a();
    }

    @Override // defpackage.u70
    public final void n0(CharSequence charSequence) {
        i iVar = (i) this.k;
        if (iVar.g) {
            return;
        }
        Toolbar toolbar = iVar.a;
        iVar.h = charSequence;
        if ((iVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (iVar.g) {
                cw8.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.u70
    public final l5 r0(dq dqVar) {
        r09 r09Var = this.o;
        if (r09Var != null) {
            r09Var.b();
        }
        this.i.setHideOnContentScrollEnabled(false);
        this.l.e();
        r09 r09Var2 = new r09(this, this.l.getContext(), dqVar);
        nt4 nt4Var = r09Var2.g0;
        nt4Var.w();
        try {
            boolean zK = ((yr6) r09Var2.h0.Y).k(r09Var2, nt4Var);
            nt4Var.v();
            if (!zK) {
                return null;
            }
            this.o = r09Var2;
            r09Var2.i();
            this.l.c(r09Var2);
            u0(true);
            return r09Var2;
        } catch (Throwable th) {
            nt4Var.v();
            throw th;
        }
    }

    public final void u0(boolean z) {
        qx8 qx8VarJ;
        qx8 qx8VarJ2;
        boolean z2 = this.w;
        if (z) {
            if (!z2) {
                this.w = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.i;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                x0(false);
            }
        } else if (z2) {
            this.w = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.i;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            x0(false);
        }
        boolean zIsLaidOut = this.j.isLaidOut();
        wd1 wd1Var = this.k;
        if (!zIsLaidOut) {
            if (z) {
                ((i) wd1Var).a.setVisibility(4);
                this.l.setVisibility(0);
                return;
            } else {
                ((i) wd1Var).a.setVisibility(0);
                this.l.setVisibility(8);
                return;
            }
        }
        if (z) {
            i iVar = (i) wd1Var;
            qx8VarJ = cw8.a(iVar.a);
            qx8VarJ.a(0.0f);
            qx8VarJ.c(100L);
            qx8VarJ.d(new vb8(iVar, 4));
            qx8VarJ2 = this.l.j(0, 200L);
        } else {
            i iVar2 = (i) wd1Var;
            qx8 qx8VarA = cw8.a(iVar2.a);
            qx8VarA.a(1.0f);
            qx8VarA.c(200L);
            qx8VarA.d(new vb8(iVar2, 0));
            qx8VarJ = this.l.j(8, 100L);
            qx8VarJ2 = qx8VarA;
        }
        sx8 sx8Var = new sx8();
        ArrayList arrayList = sx8Var.a;
        arrayList.add(qx8VarJ);
        View view = (View) qx8VarJ.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) qx8VarJ2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(qx8VarJ2);
        sx8Var.b();
    }

    public final void v0(View view) {
        wd1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(d46.decor_content_parent);
        this.i = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(d46.action_bar);
        if (callbackFindViewById instanceof wd1) {
            wrapper = (wd1) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.k = wrapper;
        this.l = (ActionBarContextView) view.findViewById(d46.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(d46.action_bar_container);
        this.j = actionBarContainer;
        wd1 wd1Var = this.k;
        if (wd1Var == null || this.l == null || actionBarContainer == null) {
            bt.i(s09.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((i) wd1Var).a.getContext();
        this.g = context;
        if ((((i) this.k).b & 4) != 0) {
            this.n = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.k.getClass();
        w0(context.getResources().getBoolean(z26.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.g.obtainStyledAttributes(null, h66.ActionBar, w26.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(h66.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.i;
            if (!actionBarOverlayLayout2.l0) {
                bt.i("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.A = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(h66.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.j;
            WeakHashMap weakHashMap = cw8.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void w0(boolean z) {
        if (z) {
            this.j.setTabContainer(null);
            ((i) this.k).getClass();
        } else {
            ((i) this.k).getClass();
            this.j.setTabContainer(null);
        }
        this.k.getClass();
        ((i) this.k).a.setCollapsible(false);
        this.i.setHasNonEmbeddedTabs(false);
    }

    public final void x0(boolean z) {
        boolean z2 = this.w || !this.v;
        boolean z3 = this.x;
        q09 q09Var = this.D;
        View view = this.m;
        if (!z2) {
            if (z3) {
                this.x = false;
                sx8 sx8Var = this.y;
                if (sx8Var != null) {
                    sx8Var.a();
                }
                int i = this.t;
                p09 p09Var = this.B;
                if (i != 0 || (!this.z && !z)) {
                    p09Var.c();
                    return;
                }
                this.j.setAlpha(1.0f);
                this.j.setTransitioning(true);
                sx8 sx8Var2 = new sx8();
                float f = -this.j.getHeight();
                if (z) {
                    int[] iArr = {0, 0};
                    this.j.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                qx8 qx8VarA = cw8.a(this.j);
                qx8VarA.e(f);
                View view2 = (View) qx8VarA.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(q09Var != null ? new nm1(q09Var, view2) : null);
                }
                boolean z4 = sx8Var2.e;
                ArrayList arrayList = sx8Var2.a;
                if (!z4) {
                    arrayList.add(qx8VarA);
                }
                if (this.u && view != null) {
                    qx8 qx8VarA2 = cw8.a(view);
                    qx8VarA2.e(f);
                    if (!sx8Var2.e) {
                        arrayList.add(qx8VarA2);
                    }
                }
                boolean z5 = sx8Var2.e;
                if (!z5) {
                    sx8Var2.c = E;
                }
                if (!z5) {
                    sx8Var2.b = 250L;
                }
                if (!z5) {
                    sx8Var2.d = p09Var;
                }
                this.y = sx8Var2;
                sx8Var2.b();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.x = true;
        sx8 sx8Var3 = this.y;
        if (sx8Var3 != null) {
            sx8Var3.a();
        }
        this.j.setVisibility(0);
        int i2 = this.t;
        p09 p09Var2 = this.C;
        if (i2 == 0 && (this.z || z)) {
            this.j.setTranslationY(0.0f);
            float f2 = -this.j.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.j.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.j.setTranslationY(f2);
            sx8 sx8Var4 = new sx8();
            qx8 qx8VarA3 = cw8.a(this.j);
            qx8VarA3.e(0.0f);
            View view3 = (View) qx8VarA3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(q09Var != null ? new nm1(q09Var, view3) : null);
            }
            boolean z6 = sx8Var4.e;
            ArrayList arrayList2 = sx8Var4.a;
            if (!z6) {
                arrayList2.add(qx8VarA3);
            }
            if (this.u && view != null) {
                view.setTranslationY(f2);
                qx8 qx8VarA4 = cw8.a(view);
                qx8VarA4.e(0.0f);
                if (!sx8Var4.e) {
                    arrayList2.add(qx8VarA4);
                }
            }
            boolean z7 = sx8Var4.e;
            if (!z7) {
                sx8Var4.c = F;
            }
            if (!z7) {
                sx8Var4.b = 250L;
            }
            if (!z7) {
                sx8Var4.d = p09Var2;
            }
            this.y = sx8Var4;
            sx8Var4.b();
        } else {
            this.j.setAlpha(1.0f);
            this.j.setTranslationY(0.0f);
            if (this.u && view != null) {
                view.setTranslationY(0.0f);
            }
            p09Var2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.i;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = cw8.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public s09(Dialog dialog) {
        new ArrayList();
        this.s = new ArrayList();
        this.t = 0;
        this.u = true;
        this.x = true;
        this.B = new p09(this, (byte) 0);
        this.C = new p09(this, (byte) 1);
        this.D = new q09(this);
        v0(dialog.getWindow().getDecorView());
    }
}

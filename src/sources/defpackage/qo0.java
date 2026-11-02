package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qo0 extends bu4 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int D0 = u46.abc_cascading_menu_item_layout;
    public ViewTreeObserver A0;
    public PopupWindow.OnDismissListener B0;
    public boolean C0;
    public final Context Y;
    public final int Z;
    public final int f0;
    public final int g0;
    public final boolean h0;
    public final Handler i0;
    public View q0;
    public View r0;
    public int s0;
    public boolean t0;
    public boolean u0;
    public int v0;
    public int w0;
    public boolean y0;
    public hu4 z0;
    public final ArrayList j0 = new ArrayList();
    public final ArrayList k0 = new ArrayList();
    public final gq l0 = new gq(this, 2);
    public final ge m0 = new ge(this, 1);
    public final yr2 n0 = new yr2((Object) this, (byte) 14);
    public int o0 = 0;
    public int p0 = 0;
    public boolean x0 = false;

    public qo0(Context context, View view, int i, int i2, boolean z) {
        this.Y = context;
        this.q0 = view;
        this.f0 = i;
        this.g0 = i2;
        this.h0 = z;
        this.s0 = view.getLayoutDirection() == 1 ? (byte) 0 : (byte) 1;
        Resources resources = context.getResources();
        this.Z = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(l36.abc_config_prefDialogWidth));
        this.i0 = new Handler();
    }

    @Override // defpackage.v87
    public final boolean a() {
        ArrayList arrayList = this.k0;
        return arrayList.size() > 0 && ((po0) arrayList.get(0)).a.B0.isShowing();
    }

    @Override // defpackage.iu4
    public final void b(nt4 nt4Var, boolean z) {
        ArrayList arrayList = this.k0;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (nt4Var == ((po0) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((po0) arrayList.get(i2)).b.c(false);
        }
        po0 po0Var = (po0) arrayList.remove(i);
        nt4 nt4Var2 = po0Var.b;
        b bVar = po0Var.a;
        PopupWindow popupWindow = bVar.B0;
        nt4Var2.r(this);
        if (this.C0) {
            popupWindow.setExitTransition(null);
            popupWindow.setAnimationStyle(0);
        }
        bVar.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.s0 = ((po0) arrayList.get(size2 - 1)).c;
        } else {
            this.s0 = this.q0.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((po0) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        hu4 hu4Var = this.z0;
        if (hu4Var != null) {
            hu4Var.b(nt4Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.A0;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.A0.removeGlobalOnLayoutListener(this.l0);
            }
            this.A0 = null;
        }
        this.r0.removeOnAttachStateChangeListener(this.m0);
        this.B0.onDismiss();
    }

    @Override // defpackage.iu4
    public final boolean c(gn7 gn7Var) {
        for (po0 po0Var : this.k0) {
            if (gn7Var == po0Var.b) {
                po0Var.a.Z.requestFocus();
                return true;
            }
        }
        if (!gn7Var.hasVisibleItems()) {
            return false;
        }
        l(gn7Var);
        hu4 hu4Var = this.z0;
        if (hu4Var != null) {
            hu4Var.N(gn7Var);
        }
        return true;
    }

    @Override // defpackage.iu4
    public final boolean d() {
        return false;
    }

    @Override // defpackage.v87
    public final void dismiss() {
        ArrayList arrayList = this.k0;
        int size = arrayList.size();
        if (size > 0) {
            po0[] po0VarArr = (po0[]) arrayList.toArray(new po0[size]);
            for (int i = size - 1; i >= 0; i--) {
                po0 po0Var = po0VarArr[i];
                if (po0Var.a.B0.isShowing()) {
                    po0Var.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.v87
    public final void f() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.j0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((nt4) it.next());
        }
        arrayList.clear();
        View view = this.q0;
        this.r0 = view;
        if (view != null) {
            boolean z = this.A0 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.A0 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.l0);
            }
            this.r0.addOnAttachStateChangeListener(this.m0);
        }
    }

    @Override // defpackage.iu4
    public final void g(hu4 hu4Var) {
        this.z0 = hu4Var;
    }

    @Override // defpackage.iu4
    public final void i() {
        Iterator it = this.k0.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((po0) it.next()).a.Z.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((kt4) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.v87
    public final qw1 j() {
        ArrayList arrayList = this.k0;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((po0) oi0.h(1, arrayList)).a.Z;
    }

    @Override // defpackage.bu4
    public final void l(nt4 nt4Var) {
        nt4Var.b(this, this.Y);
        if (a()) {
            u(nt4Var);
        } else {
            this.j0.add(nt4Var);
        }
    }

    @Override // defpackage.bu4
    public final void n(View view) {
        if (this.q0 != view) {
            this.q0 = view;
            this.p0 = Gravity.getAbsoluteGravity(this.o0, view.getLayoutDirection());
        }
    }

    @Override // defpackage.bu4
    public final void o(boolean z) {
        this.x0 = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        po0 po0Var;
        ArrayList arrayList = this.k0;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                po0Var = null;
                break;
            }
            po0Var = (po0) arrayList.get(i);
            if (!po0Var.a.B0.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (po0Var != null) {
            po0Var.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.bu4
    public final void p(int i) {
        if (this.o0 != i) {
            this.o0 = i;
            this.p0 = Gravity.getAbsoluteGravity(i, this.q0.getLayoutDirection());
        }
    }

    @Override // defpackage.bu4
    public final void q(int i) {
        this.t0 = true;
        this.v0 = i;
    }

    @Override // defpackage.bu4
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.B0 = onDismissListener;
    }

    @Override // defpackage.bu4
    public final void s(boolean z) {
        this.y0 = z;
    }

    @Override // defpackage.bu4
    public final void t(int i) {
        this.u0 = true;
        this.w0 = i;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0156  */
    /* JADX WARN: Code duplicated, block: B:69:0x015a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void u(nt4 nt4Var) {
        boolean z;
        int i;
        View childAt;
        po0 po0Var;
        int i2;
        int i3;
        int i4;
        int width;
        MenuItem item;
        kt4 kt4Var;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.Y;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        kt4 kt4Var2 = new kt4(nt4Var, layoutInflaterFrom, this.h0, D0);
        if (!a() && this.x0) {
            kt4Var2.Z = true;
        } else if (a()) {
            int size = nt4Var.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = nt4Var.getItem(i5);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i5++;
            }
            kt4Var2.Z = z;
        }
        int iM = bu4.m(kt4Var2, context, this.Z);
        b bVar = new b(context, null, this.f0, this.g0);
        bVar.E0 = this.n0;
        bVar.r0 = this;
        PopupWindow popupWindow = bVar.B0;
        popupWindow.setOnDismissListener(this);
        bVar.q0 = this.q0;
        bVar.n0 = this.p0;
        bVar.A0 = true;
        popupWindow.setFocusable(true);
        popupWindow.setInputMethodMode(2);
        bVar.p(kt4Var2);
        bVar.r(iM);
        bVar.n0 = this.p0;
        ArrayList arrayList = this.k0;
        if (arrayList.size() > 0) {
            po0Var = (po0) oi0.h(1, arrayList);
            nt4 nt4Var2 = po0Var.b;
            int size2 = nt4Var2.f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    i = 0;
                    item = null;
                    break;
                }
                item = nt4Var2.getItem(i6);
                if (item.hasSubMenu()) {
                    i = 0;
                    if (nt4Var == item.getSubMenu()) {
                        break;
                    }
                }
                i6++;
            }
            if (item == null) {
                childAt = null;
            } else {
                qw1 qw1Var = po0Var.a.Z;
                ListAdapter adapter = qw1Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    kt4Var = (kt4) headerViewListAdapter.getWrappedAdapter();
                } else {
                    kt4Var = (kt4) adapter;
                    headersCount = i;
                }
                int count = kt4Var.getCount();
                int i7 = i;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (item == kt4Var.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                childAt = (i7 != -1 && (firstVisiblePosition = (i7 + headersCount) - qw1Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < qw1Var.getChildCount()) ? qw1Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            i = 0;
            childAt = null;
            po0Var = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = b.F0;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[i] = Boolean.FALSE;
                        method.invoke(popupWindow, objArr);
                    } catch (Exception unused) {
                    }
                }
            } else {
                wa.I(popupWindow);
            }
            popupWindow.setEnterTransition(null);
            qw1 qw1Var2 = ((po0) arrayList.get(arrayList.size() - 1)).a.Z;
            int[] iArr = new int[2];
            qw1Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.r0.getWindowVisibleDisplayFrame(rect);
            if (this.s0 == 1) {
                if (qw1Var2.getWidth() + iArr[i] + iM > rect.right) {
                    i2 = i;
                } else {
                    i2 = 1;
                }
            } else if (iArr[i] - iM < 0) {
                i2 = 1;
            } else {
                i2 = i;
            }
            int i8 = i2 == 1 ? 1 : i;
            this.s0 = i2;
            if (Build.VERSION.SDK_INT >= 26) {
                bVar.q0 = childAt;
                i4 = i;
                i3 = i4;
            } else {
                int[] iArr2 = new int[2];
                this.q0.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.p0 & 7) == 5) {
                    iArr2[i] = this.q0.getWidth() + iArr2[i];
                    iArr3[i] = childAt.getWidth() + iArr3[i];
                }
                i3 = iArr3[i] - iArr2[i];
                i4 = iArr3[1] - iArr2[1];
            }
            if ((this.p0 & 5) == 5) {
                width = i8 != 0 ? i3 + iM : i3 - childAt.getWidth();
            } else {
                width = i8 != 0 ? i3 + childAt.getWidth() : i3 - iM;
            }
            bVar.h0 = width;
            bVar.m0 = true;
            bVar.l0 = true;
            bVar.l(i4);
        } else {
            if (this.t0) {
                bVar.h0 = this.v0;
            }
            if (this.u0) {
                bVar.l(this.w0);
            }
            Rect rect2 = this.X;
            bVar.z0 = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new po0(bVar, nt4Var, this.s0));
        bVar.f();
        qw1 qw1Var3 = bVar.Z;
        qw1Var3.setOnKeyListener(this);
        if (po0Var == null && this.y0 && nt4Var.m != null) {
            boolean z2 = i;
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(u46.abc_popup_menu_header_item_layout, qw1Var3, z2);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(z2);
            textView.setText(nt4Var.m);
            qw1Var3.addHeaderView(frameLayout, null, z2);
            bVar.f();
        }
    }
}

package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c8 extends yp implements DialogInterface {
    public final a8 i0;

    public c8(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, j(contextThemeWrapper, i));
        this.i0 = new a8(getContext(), this, getWindow());
    }

    public static int j(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(w26.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.yp, defpackage.py0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        a8 a8Var = this.i0;
        a8Var.b.setContentView(a8Var.s);
        Context context = a8Var.a;
        Window window = a8Var.c;
        View viewFindViewById2 = window.findViewById(d46.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(d46.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(d46.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(d46.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(d46.customPanel);
        View view = a8Var.f;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !a8.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(d46.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (a8Var.g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (a8Var.e != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(d46.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(d46.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(d46.buttonPanel);
        ViewGroup viewGroupB = a8.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = a8.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = a8.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(d46.scrollView);
        a8Var.k = nestedScrollView;
        nestedScrollView.setFocusable(false);
        a8Var.k.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(R.id.message);
        a8Var.o = textView;
        if (textView != null) {
            textView.setVisibility(8);
            a8Var.k.removeView(a8Var.o);
            if (a8Var.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) a8Var.k.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(a8Var.k);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(a8Var.e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupB2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupB3.findViewById(R.id.button1);
        a8Var.h = button;
        y4 y4Var = a8Var.y;
        button.setOnClickListener(y4Var);
        boolean zIsEmpty = TextUtils.isEmpty(null);
        Button button2 = a8Var.h;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText((CharSequence) null);
            a8Var.h.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupB3.findViewById(R.id.button2);
        a8Var.i = button3;
        button3.setOnClickListener(y4Var);
        boolean zIsEmpty2 = TextUtils.isEmpty(null);
        Button button4 = a8Var.i;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText((CharSequence) null);
            a8Var.i.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupB3.findViewById(R.id.button3);
        a8Var.j = button5;
        button5.setOnClickListener(y4Var);
        boolean zIsEmpty3 = TextUtils.isEmpty(null);
        Button button6 = a8Var.j;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText((CharSequence) null);
            a8Var.j.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(w26.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = a8Var.h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = a8Var.i;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = a8Var.j;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (a8Var.p != null) {
            viewGroupB.addView(a8Var.p, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(d46.title_template).setVisibility(8);
        } else {
            a8Var.m = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(a8Var.d) || !a8Var.w) {
                window.findViewById(d46.title_template).setVisibility(8);
                a8Var.m.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(d46.alertTitle);
                a8Var.n = textView2;
                textView2.setText(a8Var.d);
                Drawable drawable = a8Var.l;
                if (drawable != null) {
                    a8Var.m.setImageDrawable(drawable);
                } else {
                    a8Var.n.setPadding(a8Var.m.getPaddingLeft(), a8Var.m.getPaddingTop(), a8Var.m.getPaddingRight(), a8Var.m.getPaddingBottom());
                    a8Var.m.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupB3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupB2.findViewById(d46.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = a8Var.k;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = a8Var.e != null ? viewGroupB.findViewById(d46.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(d46.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = a8Var.e;
        if (alertController$RecycleListView != null && (!z3 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f0, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.g0);
        }
        if (!z2) {
            View view2 = a8Var.e;
            if (view2 == null) {
                view2 = a8Var.k;
            }
            if (view2 != null) {
                int i3 = z3 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(d46.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(d46.scrollIndicatorDown);
                WeakHashMap weakHashMap = cw8.a;
                view2.setScrollIndicators(i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = a8Var.e;
        if (alertController$RecycleListView2 == null || (listAdapter = a8Var.q) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = a8Var.r;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.i0.k;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.i0.k;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.yp, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a8 a8Var = this.i0;
        a8Var.d = charSequence;
        TextView textView = a8Var.n;
        if (textView != null) {
            textView.setText(charSequence);
        }
        a8Var.c.setTitle(charSequence);
    }
}

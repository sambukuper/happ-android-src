package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a8 {
    public final Context a;
    public final c8 b;
    public final Window c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public View f;
    public Button h;
    public Button i;
    public Button j;
    public NestedScrollView k;
    public Drawable l;
    public ImageView m;
    public TextView n;
    public TextView o;
    public View p;
    public ListAdapter q;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final boolean w;
    public final y7 x;
    public boolean g = false;
    public int r = -1;
    public final y4 y = new y4(this, 1);

    public a8(Context context, c8 c8Var, Window window) {
        this.a = context;
        this.b = c8Var;
        this.c = window;
        y7 y7Var = new y7();
        y7Var.a = new WeakReference(c8Var);
        this.x = y7Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, h66.AlertDialog, w26.alertDialogStyle, 0);
        this.s = typedArrayObtainStyledAttributes.getResourceId(h66.AlertDialog_android_layout, 0);
        typedArrayObtainStyledAttributes.getResourceId(h66.AlertDialog_buttonPanelSideLayout, 0);
        this.t = typedArrayObtainStyledAttributes.getResourceId(h66.AlertDialog_listLayout, 0);
        typedArrayObtainStyledAttributes.getResourceId(h66.AlertDialog_multiChoiceItemLayout, 0);
        this.u = typedArrayObtainStyledAttributes.getResourceId(h66.AlertDialog_singleChoiceItemLayout, 0);
        this.v = typedArrayObtainStyledAttributes.getResourceId(h66.AlertDialog_listItemLayout, 0);
        this.w = typedArrayObtainStyledAttributes.getBoolean(h66.AlertDialog_showTitle, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(h66.AlertDialog_buttonIconDimen, 0);
        typedArrayObtainStyledAttributes.recycle();
        c8Var.g().f(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}

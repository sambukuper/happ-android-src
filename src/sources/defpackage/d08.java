package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d08 {
    public final b08 a;
    public final ArrayList b = new ArrayList();
    public fe3 c;
    public fe3 d;
    public int e;

    public d08(ViewGroup viewGroup) {
        View childAt;
        fe3 fe3Var = fe3.e;
        this.c = fe3Var;
        this.d = fe3Var;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        b08 b08Var = new b08(this, viewGroup.getContext(), viewGroup);
        this.a = b08Var;
        b08Var.setVisibility(8);
        byte b = 1;
        b08Var.setWillNotDraw(true);
        o61 o61Var = new o61(this, (byte) 29);
        WeakHashMap weakHashMap = cw8.a;
        uv8.c(b08Var, o61Var);
        c19.a(b08Var, new c08(this));
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
            if (childAt.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (childAt == null) {
            viewGroup.addView(b08Var, 0);
        } else {
            childAt.addOnAttachStateChangeListener(new al2(viewGroup, b08Var, b));
        }
    }
}

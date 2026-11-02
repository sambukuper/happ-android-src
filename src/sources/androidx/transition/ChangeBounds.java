package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ap0;
import defpackage.bp0;
import defpackage.by8;
import defpackage.cp0;
import defpackage.dp0;
import defpackage.ne8;
import defpackage.rq7;
import defpackage.x75;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ChangeBounds extends Transition {
    public static final String[] E0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final ap0 F0 = new ap0(PointF.class, "topLeft", (byte) 0);
    public static final ap0 G0 = new ap0(PointF.class, "bottomRight", (byte) 1);
    public static final ap0 H0 = new ap0(PointF.class, "bottomRight", (byte) 2);
    public static final ap0 I0 = new ap0(PointF.class, "topLeft", (byte) 3);
    public static final ap0 J0 = new ap0(PointF.class, "position", (byte) 4);

    public static void K(ne8 ne8Var) {
        View view = ne8Var.b;
        HashMap map = ne8Var.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // androidx.transition.Transition
    public final Animator j(ViewGroup viewGroup, ne8 ne8Var, ne8 ne8Var2) {
        int i;
        ChangeBounds changeBounds;
        Animator animatorA;
        if (ne8Var == null) {
            return null;
        }
        HashMap map = ne8Var.a;
        if (ne8Var2 == null) {
            return null;
        }
        HashMap map2 = ne8Var2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = ne8Var2.b;
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        by8.a(view, i2, i4, i6, i8);
        if (i14 != 2) {
            changeBounds = this;
            animatorA = (i2 == i3 && i4 == i5) ? x75.a(view, H0, changeBounds.x0.a(i6, i8, i7, i9)) : x75.a(view, I0, changeBounds.x0.a(i2, i4, i3, i5));
        } else if (i10 == i12 && i11 == i13) {
            changeBounds = this;
            animatorA = x75.a(view, J0, changeBounds.x0.a(i2, i4, i3, i5));
        } else {
            changeBounds = this;
            dp0 dp0Var = new dp0(view);
            ObjectAnimator objectAnimatorA = x75.a(dp0Var, F0, changeBounds.x0.a(i2, i4, i3, i5));
            ObjectAnimator objectAnimatorA2 = x75.a(dp0Var, G0, changeBounds.x0.a(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorA, objectAnimatorA2);
            animatorSet.addListener(new bp0(dp0Var));
            animatorA = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            rq7.l(viewGroup4, true);
            changeBounds.n().a(new cp0(viewGroup4));
        }
        return animatorA;
    }

    @Override // androidx.transition.Transition
    public final String[] p() {
        return E0;
    }
}

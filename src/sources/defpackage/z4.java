package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.transition.Transition;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public z4(tx8 tx8Var, View view) {
        this.a = (byte) 9;
        this.b = tx8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.E0 = null;
                actionBarOverlayLayout.o0 = false;
                break;
            case 4:
                super.onAnimationCancel(animator);
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
                focusRingDrawable.m0 = 1.0f;
                focusRingDrawable.invalidateSelf();
                break;
            case 9:
                ((tx8) obj).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.E0 = null;
                actionBarOverlayLayout.o0 = false;
                break;
            case 1:
                xj xjVar = (xj) obj;
                ArrayList arrayList = new ArrayList(xjVar.g0);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((ni) arrayList.get(i)).a(xjVar);
                }
                break;
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                bottomSheetBehavior.O(5);
                WeakReference weakReference = bottomSheetBehavior.Y;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.Y.get()).requestLayout();
                    break;
                }
                break;
            case 3:
                yw1 yw1Var = (yw1) obj;
                yw1Var.p();
                yw1Var.r.start();
                break;
            case 4:
            case 5:
            default:
                super.onAnimationEnd(animator);
                break;
            case 6:
                mq4 mq4Var = (mq4) obj;
                mq4Var.b.setTranslationY(0.0f);
                mq4Var.b(0.0f);
                break;
            case 7:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                sideSheetBehavior.w(5);
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.p.get()).requestLayout();
                    break;
                }
                break;
            case 8:
                ((Transition) obj).l();
                animator.removeListener(this);
                break;
            case 9:
                ((tx8) obj).c();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 5:
                super.onAnimationRepeat(animator);
                fa4 fa4Var = (fa4) this.b;
                fa4Var.f = (fa4Var.f + 1) % fa4Var.e.e.length;
                fa4Var.g = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                xj xjVar = (xj) obj;
                ArrayList arrayList = new ArrayList(xjVar.g0);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((ni) arrayList.get(i)).b(xjVar);
                }
                break;
            case 9:
                ((tx8) obj).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ z4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}

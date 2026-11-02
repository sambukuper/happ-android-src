package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q20 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ v20 Y;

    public /* synthetic */ q20(v20 v20Var, byte b) {
        this.X = b;
        this.Y = v20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Rect rect;
        byte b = this.X;
        v20 v20Var = this.Y;
        byte b2 = 2;
        byte b3 = 1;
        switch (b) {
            case 0:
                u20 u20Var = v20Var.i;
                if (u20Var != null && (context = v20Var.h) != null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        rect = b4.f(windowManager);
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int iHeight = rect.height();
                    int[] iArr = new int[2];
                    u20Var.getLocationInWindow(iArr);
                    int height = (iHeight - (u20Var.getHeight() + iArr[1])) + ((int) u20Var.getTranslationY());
                    int i = v20Var.p;
                    if (height < i) {
                        ViewGroup.LayoutParams layoutParams = u20Var.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            c82 c82Var = v20.w;
                        } else {
                            int i2 = v20Var.p;
                            v20Var.q = i2;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i2 - height) + marginLayoutParams.bottomMargin;
                            u20Var.requestLayout();
                        }
                    } else {
                        v20Var.q = i;
                    }
                    break;
                }
                break;
            case 1:
                v20Var.c();
                break;
            default:
                u20 u20Var2 = v20Var.i;
                if (u20Var2 != null) {
                    byte b4 = 0;
                    if (u20Var2.getParent() != null) {
                        u20Var2.setVisibility(0);
                    }
                    if (u20Var2.getAnimationMode() != 1) {
                        int height2 = u20Var2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = u20Var2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height2 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        u20Var2.setTranslationY(height2);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height2, 0);
                        valueAnimator.setInterpolator(v20Var.e);
                        valueAnimator.setDuration(v20Var.c);
                        valueAnimator.addListener(new n20(v20Var, b3));
                        valueAnimator.addUpdateListener(new o20(v20Var, b2));
                        valueAnimator.start();
                    } else {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(v20Var.d);
                        valueAnimatorOfFloat.addUpdateListener(new o20(v20Var, b4));
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(v20Var.f);
                        valueAnimatorOfFloat2.addUpdateListener(new o20(v20Var, b3));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.setDuration(v20Var.a);
                        animatorSet.addListener(new n20(v20Var, (byte) 3));
                        animatorSet.start();
                    }
                    break;
                }
                break;
        }
    }
}

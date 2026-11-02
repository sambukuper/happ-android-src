package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ni3 {
    public static final Rect a = new Rect();

    public static int a(View view, mi3 mi3Var, int i) {
        View viewFindViewById;
        int height;
        int width;
        int width2;
        int width3;
        lu2 lu2Var = (lu2) view.getLayoutParams();
        int i2 = mi3Var.a;
        if (i2 == 0 || (viewFindViewById = view.findViewById(i2)) == null) {
            viewFindViewById = view;
        }
        int paddingBottom = mi3Var.b;
        Rect rect = a;
        if (i != 0) {
            if (mi3Var.d) {
                float f = mi3Var.c;
                if (f == 0.0f) {
                    paddingBottom += viewFindViewById.getPaddingTop();
                } else if (f == 100.0f) {
                    paddingBottom -= viewFindViewById.getPaddingBottom();
                }
            }
            if (mi3Var.c != -1.0f) {
                if (viewFindViewById == view) {
                    lu2Var.getClass();
                    height = (viewFindViewById.getHeight() - lu2Var.h0) - lu2Var.j0;
                } else {
                    height = viewFindViewById.getHeight();
                }
                paddingBottom += (int) ((height * mi3Var.c) / 100.0f);
            }
            if (view == viewFindViewById) {
                return paddingBottom;
            }
            rect.top = paddingBottom;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect);
            return rect.top - lu2Var.h0;
        }
        if (view.getLayoutDirection() != 1) {
            if (mi3Var.d) {
                float f2 = mi3Var.c;
                if (f2 == 0.0f) {
                    paddingBottom += viewFindViewById.getPaddingLeft();
                } else if (f2 == 100.0f) {
                    paddingBottom -= viewFindViewById.getPaddingRight();
                }
            }
            if (mi3Var.c != -1.0f) {
                if (viewFindViewById == view) {
                    lu2Var.getClass();
                    width = (viewFindViewById.getWidth() - lu2Var.g0) - lu2Var.i0;
                } else {
                    width = viewFindViewById.getWidth();
                }
                paddingBottom += (int) ((width * mi3Var.c) / 100.0f);
            }
            if (view == viewFindViewById) {
                return paddingBottom;
            }
            rect.left = paddingBottom;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect);
            return rect.left - lu2Var.g0;
        }
        if (viewFindViewById == view) {
            lu2Var.getClass();
            width2 = (viewFindViewById.getWidth() - lu2Var.g0) - lu2Var.i0;
        } else {
            width2 = viewFindViewById.getWidth();
        }
        int paddingLeft = width2 - paddingBottom;
        if (mi3Var.d) {
            float f3 = mi3Var.c;
            if (f3 == 0.0f) {
                paddingLeft -= viewFindViewById.getPaddingRight();
            } else if (f3 == 100.0f) {
                paddingLeft += viewFindViewById.getPaddingLeft();
            }
        }
        if (mi3Var.c != -1.0f) {
            if (viewFindViewById == view) {
                lu2Var.getClass();
                width3 = (viewFindViewById.getWidth() - lu2Var.g0) - lu2Var.i0;
            } else {
                width3 = viewFindViewById.getWidth();
            }
            paddingLeft -= (int) ((width3 * mi3Var.c) / 100.0f);
        }
        if (view == viewFindViewById) {
            return paddingLeft;
        }
        rect.right = paddingLeft;
        ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect);
        return rect.right + lu2Var.i0;
    }
}

package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rf6 {
    public static rf6 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public fu6 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final qf6 h = new qf6(6);

    public static synchronized rf6 b() {
        rf6 rf6Var;
        rf6Var = g;
        if (rf6Var == null) {
            rf6Var = new rf6();
            g = rf6Var;
        }
        return rf6Var;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        qf6 qf6Var = h;
        qf6Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) qf6Var.a(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public static void h(Drawable drawable, z11 z11Var, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = z11Var.b;
            if (!z && !z11Var.a) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilterE = null;
            ColorStateList colorStateList = z ? (ColorStateList) z11Var.c : null;
            PorterDuff.Mode mode = z11Var.a ? (PorterDuff.Mode) z11Var.d : f;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilterE = e(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilterE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    public final Drawable a(Context context, int i) {
        Object obj;
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        LayerDrawable layerDrawableW;
        TypedValue typedValue = this.c;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.c = typedValue;
        }
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            qi4 qi4Var = (qi4) this.b.get(context);
            obj = null;
            if (qi4Var != null && (weakReference = (WeakReference) qi4Var.b(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    qi4Var.g(j);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.e == null) {
            layerDrawableW = null;
        } else if (i == r36.abc_cab_background_top_material) {
            layerDrawableW = new LayerDrawable(new Drawable[]{c(context, r36.abc_cab_background_internal_bg), c(context, r36.abc_cab_background_top_mtrl_alpha)});
        } else if (i == r36.abc_ratingbar_material) {
            layerDrawableW = fu6.W(this, context, l36.abc_star_big);
        } else if (i == r36.abc_ratingbar_indicator_material) {
            layerDrawableW = fu6.W(this, context, l36.abc_star_medium);
        } else if (i == r36.abc_ratingbar_small_material) {
            layerDrawableW = fu6.W(this, context, l36.abc_star_small);
        } else {
            layerDrawableW = null;
        }
        if (layerDrawableW == null) {
            return layerDrawableW;
        }
        layerDrawableW.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableW.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableW;
                }
                qi4 qi4Var2 = (qi4) this.b.get(context);
                if (qi4Var2 == null) {
                    qi4Var2 = new qi4(obj);
                    this.b.put(context, qi4Var2);
                }
                qi4Var2.f(j, new WeakReference(constantState2));
                return layerDrawableW;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized Drawable d(Context context, int i, boolean z) {
        Drawable drawableA;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableC = c(context, m36.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof eu8) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i);
            if (drawableA == null) {
                drawableA = context.getDrawable(i);
            }
            if (drawableA != null) {
                drawableA = g(context, i, z, drawableA);
            }
            if (drawableA != null) {
                dw1.a(drawableA);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        ue7 ue7Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListX = null;
        colorStateList = (weakHashMap == null || (ue7Var = (ue7) weakHashMap.get(context)) == null) ? null : (ColorStateList) x97.t(ue7Var, i);
        if (colorStateList == null) {
            fu6 fu6Var = this.e;
            if (fu6Var != null) {
                colorStateListX = fu6Var.X(context, i);
            }
            if (colorStateListX != null) {
                WeakHashMap weakHashMap2 = this.a;
                if (weakHashMap2 == null) {
                    weakHashMap2 = new WeakHashMap();
                    this.a = weakHashMap2;
                }
                ue7 ue7Var2 = (ue7) weakHashMap2.get(context);
                if (ue7Var2 == null) {
                    ue7Var2 = new ue7(0);
                    this.a.put(context, ue7Var2);
                }
                ue7Var2.a(i, colorStateListX);
            }
            colorStateList = colorStateListX;
        }
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00fa A[RETURN] */
    public final Drawable g(Context context, int i, boolean z, Drawable drawable) {
        int i2;
        int iRound;
        Drawable drawableMutate;
        ColorStateList colorStateListF = f(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListF != null) {
            Drawable drawableMutate2 = drawable.mutate();
            drawableMutate2.setTintList(colorStateListF);
            if (this.e != null && i == r36.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
            return drawableMutate2;
        }
        fu6 fu6Var = this.e;
        if (fu6Var != null) {
            if (i == r36.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int iC = d98.c(context, w26.colorControlNormal);
                PorterDuff.Mode mode2 = aq.b;
                fu6.w0(drawableFindDrawableByLayerId, iC, mode2);
                fu6.w0(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), d98.c(context, w26.colorControlNormal), mode2);
                fu6.w0(layerDrawable.findDrawableByLayerId(R.id.progress), d98.c(context, w26.colorControlActivated), mode2);
                return drawable;
            }
            if (i == r36.abc_ratingbar_material || i == r36.abc_ratingbar_indicator_material || i == r36.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.background);
                int iB = d98.b(context, w26.colorControlNormal);
                PorterDuff.Mode mode3 = aq.b;
                fu6.w0(drawableFindDrawableByLayerId2, iB, mode3);
                fu6.w0(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), d98.c(context, w26.colorControlActivated), mode3);
                fu6.w0(layerDrawable2.findDrawableByLayerId(R.id.progress), d98.c(context, w26.colorControlActivated), mode3);
                return drawable;
            }
        }
        if (fu6Var != null) {
            PorterDuff.Mode mode4 = aq.b;
            boolean z2 = true;
            if (fu6.u((int[]) fu6Var.Y, i)) {
                i2 = w26.colorControlNormal;
            } else if (fu6.u((int[]) fu6Var.f0, i)) {
                i2 = w26.colorControlActivated;
            } else {
                if (fu6.u((int[]) fu6Var.g0, i)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i == r36.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i2 = 16842800;
                    } else if (i != r36.abc_dialog_material_background) {
                        z2 = false;
                        i2 = 0;
                    }
                    if (z2) {
                        drawableMutate = drawable.mutate();
                        drawableMutate.setColorFilter(aq.c(d98.c(context, i2), mode4));
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                            return drawable;
                        }
                    } else if (z) {
                        return null;
                    }
                }
                i2 = 16842801;
            }
            iRound = -1;
            if (z2) {
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(aq.c(d98.c(context, i2), mode4));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                    return drawable;
                }
            } else if (z) {
                return null;
            }
        } else if (z) {
            return null;
        }
        return drawable;
    }
}

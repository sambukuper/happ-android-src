package androidx.leanback.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.leanback.widget.SearchOrbView;
import defpackage.b36;
import defpackage.bz6;
import defpackage.cw8;
import defpackage.cz6;
import defpackage.f66;
import defpackage.h36;
import defpackage.n36;
import defpackage.p46;
import defpackage.p61;
import defpackage.q46;
import defpackage.r26;
import defpackage.s36;
import defpackage.u36;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class SearchOrbView extends FrameLayout implements View.OnClickListener {
    public static final /* synthetic */ int x0 = 0;
    public View.OnClickListener f0;
    public final View g0;
    public final View h0;
    public final ImageView i0;
    public Drawable j0;
    public cz6 k0;
    public final float l0;
    public final int m0;
    public final int n0;
    public final float o0;
    public final float p0;
    public ValueAnimator q0;
    public boolean r0;
    public boolean s0;
    public final ArgbEvaluator t0;
    public final bz6 u0;
    public ValueAnimator v0;
    public final bz6 w0;

    /* JADX WARN: Type inference failed for: r0v1, types: [bz6] */
    /* JADX WARN: Type inference failed for: r0v2, types: [bz6] */
    public SearchOrbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t0 = new ArgbEvaluator();
        final byte b = 0;
        this.u0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: bz6
            public final /* synthetic */ SearchOrbView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b2 = b;
                SearchOrbView searchOrbView = this.b;
                switch (b2) {
                    case 0:
                        int i2 = SearchOrbView.x0;
                        searchOrbView.setOrbViewColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        break;
                    default:
                        int i3 = SearchOrbView.x0;
                        searchOrbView.setSearchOrbZ(valueAnimator.getAnimatedFraction());
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.w0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: bz6
            public final /* synthetic */ SearchOrbView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b3 = b2;
                SearchOrbView searchOrbView = this.b;
                switch (b3) {
                    case 0:
                        int i2 = SearchOrbView.x0;
                        searchOrbView.setOrbViewColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        break;
                    default:
                        int i3 = SearchOrbView.x0;
                        searchOrbView.setSearchOrbZ(valueAnimator.getAnimatedFraction());
                        break;
                }
            }
        };
        Resources resources = context.getResources();
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResourceId(), (ViewGroup) this, true);
        this.g0 = viewInflate;
        this.h0 = viewInflate.findViewById(u36.search_orb);
        ImageView imageView = (ImageView) viewInflate.findViewById(u36.icon);
        this.i0 = imageView;
        this.l0 = context.getResources().getFraction(s36.lb_search_orb_focused_zoom, 1, 1);
        this.m0 = context.getResources().getInteger(p46.lb_search_orb_pulse_duration_ms);
        this.n0 = context.getResources().getInteger(p46.lb_search_orb_scale_duration_ms);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(h36.lb_search_orb_focused_z);
        this.p0 = dimensionPixelSize;
        this.o0 = context.getResources().getDimensionPixelSize(h36.lb_search_orb_unfocused_z);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f66.lbSearchOrbView, i, 0);
        cw8.m(this, context, f66.lbSearchOrbView, attributeSet, typedArrayObtainStyledAttributes, i);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(f66.lbSearchOrbView_searchOrbIcon);
        setOrbIcon(drawable == null ? resources.getDrawable(n36.lb_ic_in_app_search) : drawable);
        int color = typedArrayObtainStyledAttributes.getColor(f66.lbSearchOrbView_searchOrbColor, resources.getColor(b36.lb_default_search_color));
        setOrbColors(new cz6(color, typedArrayObtainStyledAttributes.getColor(f66.lbSearchOrbView_searchOrbBrightColor, color), typedArrayObtainStyledAttributes.getColor(f66.lbSearchOrbView_searchOrbIconColor, 0)));
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClipChildren(false);
        setOnClickListener(this);
        setSoundEffectsEnabled(false);
        setSearchOrbZ(0.0f);
        imageView.setZ(dimensionPixelSize);
    }

    public final void a(boolean z) {
        float f = z ? this.l0 : 1.0f;
        ViewPropertyAnimator viewPropertyAnimatorScaleY = this.g0.animate().scaleX(f).scaleY(f);
        long j = this.n0;
        viewPropertyAnimatorScaleY.setDuration(j).start();
        if (this.v0 == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.v0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(this.w0);
        }
        ValueAnimator valueAnimator = this.v0;
        if (z) {
            valueAnimator.start();
        } else {
            valueAnimator.reverse();
        }
        this.v0.setDuration(j);
        this.r0 = z;
        b();
    }

    public final void b() {
        ValueAnimator valueAnimator = this.q0;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.q0 = null;
        }
        if (this.r0 && this.s0) {
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(this.t0, Integer.valueOf(this.k0.a), Integer.valueOf(this.k0.b), Integer.valueOf(this.k0.a));
            this.q0 = valueAnimatorOfObject;
            valueAnimatorOfObject.setRepeatCount(-1);
            this.q0.setDuration(this.m0 * 2);
            this.q0.addUpdateListener(this.u0);
            this.q0.start();
        }
    }

    public float getFocusedZoom() {
        return this.l0;
    }

    public int getLayoutResourceId() {
        return q46.lb_search_orb;
    }

    public int getOrbColor() {
        return this.k0.a;
    }

    public cz6 getOrbColors() {
        return this.k0;
    }

    public Drawable getOrbIcon() {
        return this.j0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s0 = true;
        b();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f0;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.s0 = false;
        b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        a(z);
    }

    public void setOnOrbClickedListener(View.OnClickListener onClickListener) {
        this.f0 = onClickListener;
    }

    public void setOrbColor(int i) {
        setOrbColors(new cz6(i, i, 0));
    }

    public void setOrbColors(cz6 cz6Var) {
        this.k0 = cz6Var;
        this.i0.setColorFilter(cz6Var.c);
        if (this.q0 == null) {
            setOrbViewColor(this.k0.a);
        } else {
            this.r0 = true;
            b();
        }
    }

    public void setOrbIcon(Drawable drawable) {
        this.j0 = drawable;
        this.i0.setImageDrawable(drawable);
    }

    public void setOrbViewColor(int i) {
        View view = this.h0;
        if (view.getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) view.getBackground()).setColor(i);
        }
    }

    public void setSearchOrbZ(float f) {
        float f2 = this.o0;
        float fE = p61.e(this.p0, f2, f, f2);
        WeakHashMap weakHashMap = cw8.a;
        this.h0.setZ(fE);
    }

    public SearchOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, r26.searchOrbViewStyle);
    }
}

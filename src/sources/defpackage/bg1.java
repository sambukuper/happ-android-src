package defpackage;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bg1 extends cw0 {
    public final boolean f0;
    public boolean g0;
    public mj0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg1(xe7 xe7Var, boolean z) {
        super(xe7Var);
        xe7Var.getClass();
        this.f0 = z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0028  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1 A[Catch: RuntimeException -> 0x00e7, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x00e7, blocks: (B:78:0x00db, B:80:0x00e1), top: B:91:0x00db }] */
    public final mj0 F0(Context context) {
        int i;
        mj0 mj0Var;
        Animator animatorLoadAnimator;
        int iP;
        if (this.g0) {
            return this.h0;
        }
        xe7 xe7Var = (xe7) this.X;
        qk2 qk2Var = xe7Var.c;
        boolean z = xe7Var.a == ze7.Z;
        nk2 nk2Var = qk2Var.M0;
        int i2 = nk2Var == null ? 0 : nk2Var.f;
        if (this.f0) {
            if (z) {
                if (nk2Var == null) {
                    i = 0;
                } else {
                    i = nk2Var.d;
                }
            } else if (nk2Var == null) {
                i = 0;
            } else {
                i = nk2Var.e;
            }
        } else if (z) {
            if (nk2Var == null) {
                i = 0;
            } else {
                i = nk2Var.b;
            }
        } else if (nk2Var == null) {
            i = 0;
        } else {
            i = nk2Var.c;
        }
        qk2Var.P(0, 0, 0, 0);
        ViewGroup viewGroup = qk2Var.I0;
        mj0 mj0Var2 = null;
        if (viewGroup != null && viewGroup.getTag(t36.visible_removing_fragment_view_tag) != null) {
            qk2Var.I0.setTag(t36.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = qk2Var.I0;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (i == 0 && i2 != 0) {
                if (i2 == 4097) {
                    iP = z ? l26.fragment_open_enter : l26.fragment_open_exit;
                } else if (i2 == 8194) {
                    iP = z ? l26.fragment_close_enter : l26.fragment_close_exit;
                } else if (i2 == 8197) {
                    iP = z ? ci8.P(context, R.attr.activityCloseEnterAnimation) : ci8.P(context, R.attr.activityCloseExitAnimation);
                } else if (i2 == 4099) {
                    iP = z ? l26.fragment_fade_enter : l26.fragment_fade_exit;
                } else if (i2 != 4100) {
                    iP = -1;
                } else {
                    iP = z ? ci8.P(context, R.attr.activityOpenEnterAnimation) : ci8.P(context, R.attr.activityOpenExitAnimation);
                }
                i = iP;
            }
            if (i != 0) {
                boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i));
                if (zEquals) {
                    try {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, i);
                        if (animationLoadAnimation != null) {
                            mj0Var = new mj0(animationLoadAnimation);
                            mj0Var2 = mj0Var;
                        }
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                        try {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                            if (animatorLoadAnimator != null) {
                                mj0Var = new mj0(animatorLoadAnimator);
                                mj0Var2 = mj0Var;
                            }
                        } catch (RuntimeException e2) {
                            if (zEquals) {
                                throw e2;
                            }
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i);
                            if (animationLoadAnimation2 != null) {
                                mj0Var2 = new mj0(animationLoadAnimation2);
                            }
                        }
                    }
                } else {
                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                    if (animatorLoadAnimator != null) {
                        mj0Var = new mj0(animatorLoadAnimator);
                        mj0Var2 = mj0Var;
                    }
                }
            }
        }
        this.h0 = mj0Var2;
        this.g0 = true;
        return mj0Var2;
    }
}

package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.transition.TransitionValues;
import android.util.Property;
import android.util.Range;
import android.view.View;
import androidx.compose.foundation.layout.b;
import androidx.leanback.transition.FadeAndShortSlide;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class bs7 {
    public static z47 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(fu7 fu7Var, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        int i2;
        gn2Var.getClass();
        lp2Var.X(-349536816);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(fu7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.h(gn2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.f(kx4Var) ? 256 : 128;
        }
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            ci8.a(kx4Var, vj8.j0(y46.title_sub_setting, lp2Var), jm4.U(1223425884, new p90(fu7Var, gn2Var, b.a, (byte) 11), lp2Var), lp2Var, ((i2 >> 6) & 14) | 384, 0);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new as7(fu7Var, gn2Var, kx4Var, i, (byte) 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long b(kd8 kd8Var, r68 r68Var, y78 y78Var, long j) {
        long j2;
        long jN = r68Var.n();
        if ((9223372034707292159L & jN) != 9205357640488583168L && kd8Var.d().Z.length() != 0) {
            long j3 = kd8Var.d().f0;
            ev2 ev2VarL = r68Var.l();
            int i = ev2VarL == null ? -1 : x58.a[ev2VarL.ordinal()];
            if (i != -1) {
                if (i == 1 || i == 2) {
                    int i2 = f88.c;
                    j2 = j3 >> 32;
                } else {
                    if (i != 3) {
                        b61.c();
                        return 0L;
                    }
                    int i3 = f88.c;
                    j2 = j3 & 4294967295L;
                }
                int i4 = (int) j2;
                x78 x78VarC = y78Var.c();
                if (x78VarC != null) {
                    bz4 bz4Var = x78VarC.b;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jN >> 32));
                    int iC = bz4Var.c(i4);
                    float f = x78VarC.f(iC);
                    float fG = x78VarC.g(iC);
                    float fM = x97.m(fIntBitsToFloat, Math.min(f, fG), Math.max(f, fG));
                    if (pf3.a(j, 0L) || Math.abs(fIntBitsToFloat - fM) <= ((int) (j >> 32)) / 2) {
                        float fE = bz4Var.e(iC);
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(((bz4Var.a(iC) - fE) / 2.0f) + fE)) & 4294967295L) | (((long) Float.floatToRawIntBits(fM)) << 32);
                        y24 y24VarE = y78Var.e();
                        z85 z85Var = null;
                        if (y24VarE != null) {
                            if (!y24VarE.g()) {
                                y24VarE = null;
                            }
                            if (y24VarE != null) {
                                jFloatToRawIntBits = ys7.b(jFloatToRawIntBits, zc1.o0(y24VarE));
                            }
                        }
                        y24 y24VarE2 = y78Var.e();
                        if (y24VarE2 == null) {
                            return jFloatToRawIntBits;
                        }
                        if (!y24VarE2.g()) {
                            y24VarE2 = null;
                        }
                        if (y24VarE2 == null) {
                            return jFloatToRawIntBits;
                        }
                        y24 y24Var = (y24) y78Var.d.getValue();
                        if (y24Var != null) {
                            if (!y24Var.g()) {
                                y24Var = null;
                            }
                            if (y24Var != null) {
                                z85Var = new z85(y24Var.C(y24VarE2, jFloatToRawIntBits));
                            }
                        }
                        return z85Var != null ? z85Var.a : jFloatToRawIntBits;
                    }
                }
            }
        }
        return 9205357640488583168L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ObjectAnimator c(View view, TransitionValues transitionValues, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, FadeAndShortSlide fadeAndShortSlide) {
        float f5 = f2;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.view.getTag(u36.transitionPosition);
        if (iArr != null) {
            f = (iArr[0] - i) + translationX;
            f5 = (iArr[1] - i2) + translationY;
        }
        int iRound = Math.round(f - translationX) + i;
        int iRound2 = Math.round(f5 - translationY) + i2;
        view.setTranslationX(f);
        view.setTranslationY(f5);
        if (f == f3 && f5 == f4) {
            return null;
        }
        Path path = new Path();
        path.moveTo(f, f5);
        path.lineTo(f3, f4);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, (Property<View, Float>) View.TRANSLATION_Y, path);
        oe8 oe8Var = new oe8(view, transitionValues.view, iRound, iRound2, translationX, translationY);
        fadeAndShortSlide.addListener(oe8Var);
        objectAnimatorOfFloat.addListener(oe8Var);
        objectAnimatorOfFloat.addPauseListener(oe8Var);
        objectAnimatorOfFloat.setInterpolator(timeInterpolator);
        return objectAnimatorOfFloat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final yx8 d(View view) {
        yx8 yx8Var;
        Object tag = view.getTag(b46.coil3_request_manager);
        yx8 yx8Var2 = tag instanceof yx8 ? (yx8) tag : null;
        if (yx8Var2 != null) {
            return yx8Var2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(b46.coil3_request_manager);
                yx8Var = tag2 instanceof yx8 ? (yx8) tag2 : null;
                if (yx8Var == null) {
                    yx8Var = new yx8();
                    view.addOnAttachStateChangeListener(yx8Var);
                    view.setTag(b46.coil3_request_manager, yx8Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yx8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(aj0 aj0Var, xy0 xy0Var, jf6 jf6Var) {
        wc0 wc0VarT;
        z47 z47Var = a;
        if (z47Var == null) {
            bt.i("mCameraUseCaseAdapterProvider must be initialized first!");
            return;
        }
        String strE = aj0Var.e();
        strE.getClass();
        cj0 cj0VarB = ((jk0) z47Var.Y).b(strE);
        a7 a7Var = new a7(cj0VarB.s(), mh0.a);
        dq dqVar = dq.g0;
        tl0 tl0Var = new tl0(cj0VarB, (cj0) null, a7Var, (a7) null, dqVar, dqVar, (vh0) z47Var.Z, (xd6) z47Var.g0, (hr8) z47Var.f0);
        synchronized (tl0Var.m0) {
        }
        List list = (List) xy0Var.Y;
        synchronized (tl0Var.m0) {
            tl0Var.j0 = list;
        }
        synchronized (tl0Var.m0) {
        }
        Range range = (Range) xy0Var.Z;
        synchronized (tl0Var.m0) {
            tl0Var.k0 = range;
        }
        List list2 = (List) xy0Var.h0;
        Objects.toString(list2);
        Objects.toString(jf6Var);
        hi5.z0("CameraUseCaseAdapter");
        synchronized (tl0Var.m0) {
            b7 b7Var = tl0Var.X;
            ih0 ih0Var = tl0Var.l0;
            b7Var.j(ih0Var);
            b7 b7Var2 = tl0Var.Y;
            if (b7Var2 != null) {
                b7Var2.j(ih0Var);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(tl0Var.g0);
            linkedHashSet.addAll(list2);
            HashMap mapI = tl0.i(linkedHashSet, jf6Var);
            try {
                try {
                    wc0VarT = tl0Var.t(linkedHashSet, tl0Var.Y != null);
                    tl0.D(mapI);
                } catch (IllegalArgumentException e) {
                    throw new nl0(e);
                }
            } catch (Throwable th) {
                tl0.D(mapI);
                throw th;
            }
        }
        wc0VarT.getClass();
    }
}

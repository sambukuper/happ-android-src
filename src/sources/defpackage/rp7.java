package defpackage;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class rp7 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(cm5 cm5Var, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        gn2Var.getClass();
        lp2Var.X(764789890);
        int i2 = i | (lp2Var.f(cm5Var) ? 4 : 2) | (lp2Var.h(gn2Var) ? 32 : 16);
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            FillElement fillElement = b.a;
            x73 x73VarE = ((b2) cm5Var).e();
            kx4 kx4VarE = g33.e(kx4Var);
            ig5 ig5VarE = os4.e(7, 24.0f);
            boolean zF = lp2Var.f(x73VarE) | ((i2 & 112) == 32);
            Object objK = lp2Var.K();
            if (zF || objK == zz0.a) {
                objK = new sn(x73VarE, gn2Var, fillElement, (byte) 28);
                lp2Var.g0(objK);
            }
            jb5.a(kx4VarE, (j74) null, 0.0f, ig5VarE, (gt) null, (p8) null, (he2) null, false, (td) null, false, (gn2) objK, lp2Var, 3072, 2038);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new fh(cm5Var, gn2Var, kx4Var, i, (byte) 20);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setStagger(4, 500L);
        viewGroup.setLayoutTransition(layoutTransition);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String c(Uri uri, String str, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        uri.getClass();
        if (uri.isOpaque()) {
            u52.k("This isn't a hierarchical URI.");
            return null;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery != null) {
            String strEncode = Uri.encode(str, null);
            int length = encodedQuery.length();
            int i3 = 0;
            while (true) {
                int iL0 = fm7.l0(encodedQuery, '&', i3, 4);
                int i4 = iL0 != -1 ? iL0 : length;
                int iL1 = fm7.l0(encodedQuery, '=', i3, 4);
                int i5 = (iL1 > i4 || iL1 == -1) ? i4 : iL1;
                if (i5 - i3 == strEncode.length() && mm7.U(i3, 0, strEncode.length(), encodedQuery, strEncode, false)) {
                    return i5 == i4 ? "" : eq8.a(i, encodedQuery.substring(i5 + 1, i4), false);
                }
                if (iL0 != -1) {
                    i3 = iL0 + 1;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List d(Uri uri, String str) {
        if (uri.isOpaque()) {
            u52.k("This isn't a hierarchical URI.");
            return null;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return d02.X;
        }
        String strEncode = Uri.encode(str, null);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int iL0 = fm7.l0(encodedQuery, '&', i, 4);
            int length = iL0 != -1 ? iL0 : encodedQuery.length();
            int iL1 = fm7.l0(encodedQuery, '=', i, 4);
            if (iL1 > length || iL1 == -1) {
                iL1 = length;
            }
            if (iL1 - i == strEncode.length() && mm7.U(i, 0, strEncode.length(), encodedQuery, strEncode, false)) {
                if (iL1 == length) {
                    arrayList.add("");
                } else {
                    arrayList.add(eq8.a(1, encodedQuery.substring(iL1 + 1, length), false));
                }
            }
            if (iL0 == -1) {
                return arrayList;
            }
            i = iL0 + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(View view, boolean z) {
        view.getClass();
        if ((view.getVisibility() == 0) == z) {
            return;
        }
        if (z) {
            view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), j26.fade_in));
            view.setVisibility(0);
        } else if (z) {
            b61.c();
        } else {
            view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), j26.fade_out));
            view.setVisibility(8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean f(KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void g(int i, final View view, boolean z, boolean z2) {
        final byte b = 1;
        if ((i & 2) != 0) {
            z2 = true;
        }
        view.getClass();
        final byte b2 = 0;
        if ((view.getVisibility() == 0) == z) {
            return;
        }
        if (!z2) {
            view.setVisibility(z ? (byte) 0 : (byte) 8);
            return;
        }
        if (z) {
            view.measure(0, 0);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, view.getMeasuredHeight());
            valueAnimatorOfInt.setDuration(500L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nw8
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b3 = b2;
                    View view2 = view;
                    switch (b3) {
                        case 0:
                            valueAnimator.getClass();
                            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            animatedValue.getClass();
                            layoutParams.height = ((Integer) animatedValue).intValue();
                            view2.setLayoutParams(layoutParams);
                            break;
                        default:
                            valueAnimator.getClass();
                            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                            Object animatedValue2 = valueAnimator.getAnimatedValue();
                            animatedValue2.getClass();
                            layoutParams2.height = ((Integer) animatedValue2).intValue();
                            view2.setLayoutParams(layoutParams2);
                            break;
                    }
                }
            });
            valueAnimatorOfInt.addListener(new ow8(view, (byte) 1));
            valueAnimatorOfInt.addListener(new ow8(view, (byte) 0));
            valueAnimatorOfInt.start();
            return;
        }
        if (z) {
            b61.c();
            return;
        }
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(view.getMeasuredHeight(), 1);
        valueAnimatorOfInt2.setDuration(500L);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nw8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b3 = b;
                View view2 = view;
                switch (b3) {
                    case 0:
                        valueAnimator.getClass();
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        animatedValue.getClass();
                        layoutParams.height = ((Integer) animatedValue).intValue();
                        view2.setLayoutParams(layoutParams);
                        break;
                    default:
                        valueAnimator.getClass();
                        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        animatedValue2.getClass();
                        layoutParams2.height = ((Integer) animatedValue2).intValue();
                        view2.setLayoutParams(layoutParams2);
                        break;
                }
            }
        });
        valueAnimatorOfInt2.addListener(new ow8(view, (byte) 2));
        valueAnimatorOfInt2.start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Uri h(Uri uri, String str) {
        uri.getClass();
        Uri.Builder builderScheme = uri.buildUpon().scheme(uri.getScheme());
        if (uri.getPort() != -1) {
            str = str + ":" + uri.getPort();
        }
        Uri uriBuild = builderScheme.encodedAuthority(str).build();
        uriBuild.getClass();
        return uriBuild;
    }
}

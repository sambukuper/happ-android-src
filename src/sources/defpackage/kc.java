package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kc implements ViewTranslationCallback {
    public static final kc a = new kc();

    public final boolean onClearTranslation(View view) {
        dn2 dn2Var;
        view.getClass();
        vc contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.g0 = qc.X;
        ff3 ff3VarC = contentCaptureManager.c();
        Object[] objArr = ff3VarC.c;
        long[] jArr = ff3VarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        s05 s05Var = ((a17) objArr[(i << 3) + i3]).a.d.X;
                        Object objG = s05Var.g(c17.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = s05Var.g(s07.n);
                            q3 q3Var = (q3) (objG2 != null ? objG2 : null);
                            if (q3Var != null && (dn2Var = (dn2) q3Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        gn2 gn2Var;
        view.getClass();
        vc contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.g0 = qc.X;
        ff3 ff3VarC = contentCaptureManager.c();
        Object[] objArr = ff3VarC.c;
        long[] jArr = ff3VarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        s05 s05Var = ((a17) objArr[(i << 3) + i3]).a.d.X;
                        Object objG = s05Var.g(c17.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (dh3.f(objG, Boolean.TRUE)) {
                            Object objG2 = s05Var.g(s07.m);
                            q3 q3Var = (q3) (objG2 != null ? objG2 : null);
                            if (q3Var != null && (gn2Var = (gn2) q3Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        gn2 gn2Var;
        view.getClass();
        vc contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.g0 = qc.Y;
        ff3 ff3VarC = contentCaptureManager.c();
        Object[] objArr = ff3VarC.c;
        long[] jArr = ff3VarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        s05 s05Var = ((a17) objArr[(i << 3) + i3]).a.d.X;
                        Object objG = s05Var.g(c17.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (dh3.f(objG, Boolean.FALSE)) {
                            Object objG2 = s05Var.g(s07.m);
                            q3 q3Var = (q3) (objG2 != null ? objG2 : null);
                            if (q3Var != null && (gn2Var = (gn2) q3Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}

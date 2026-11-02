package defpackage;

import android.content.Context;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import com.tistory.zladnrms.roundablelayout.RoundableLayout;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class p35 {
    public final iv7 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p35(iv7 iv7Var) {
        this.a = iv7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(wv7 wv7Var, ov7 ov7Var) {
        float f = ov7Var.b ? 16.0f : 0.0f;
        oi3 oi3Var = wv7Var.u;
        RoundableLayout roundableLayout = oi3Var.n0;
        float fApplyDimension = TypedValue.applyDimension(1, f, ((kw8) oi3Var).Z.getResources().getDisplayMetrics());
        roundableLayout.setCornerLeftBottom(fApplyDimension);
        roundableLayout.setCornerRightBottom(fApplyDimension);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(wv7 wv7Var, ov7 ov7Var) {
        int i;
        oi3 oi3Var = wv7Var.u;
        AppCompatTextView appCompatTextView = oi3Var.m0;
        Context context = ((kw8) oi3Var).Z.getContext();
        int iOrdinal = ov7Var.a.ordinal();
        if (iOrdinal == 0) {
            i = y46.network_filter_only_mobile;
        } else {
            if (iOrdinal != 1) {
                b61.c();
                return;
            }
            i = y46.network_filter_only_wifi;
        }
        appCompatTextView.setText(context.getString(i));
    }
}

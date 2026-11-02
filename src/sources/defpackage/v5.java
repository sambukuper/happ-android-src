package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;
import su.happ.proxyutility.ui.foundation.component.HappEditText;
import su.happ.proxyutility.ui.foundation.component.HappSnackbarHost;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class v5 extends kw8 {
    public static final /* synthetic */ int s0 = 0;
    public final AppCompatImageButton m0;
    public final HappEditText n0;
    public final LinearLayout o0;
    public final View p0;
    public final HappSnackbarHost q0;
    public final Toolbar r0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v5(View view, AppCompatImageButton appCompatImageButton, HappEditText happEditText, LinearLayout linearLayout, View view2, HappSnackbarHost happSnackbarHost, Toolbar toolbar) {
        super(view, (Object) null);
        this.m0 = appCompatImageButton;
        this.n0 = happEditText;
        this.o0 = linearLayout;
        this.p0 = view2;
        this.q0 = happSnackbarHost;
        this.r0 = toolbar;
    }
}

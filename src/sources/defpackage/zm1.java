package defpackage;

import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import su.happ.proxyutility.ui.foundation.component.HappTextView;
import su.happ.proxyutility.ui.foundation.component.button.HappTextButton;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class zm1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ byte X;
    public final /* synthetic */ TextView Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ zm1(TextView textView, byte b) {
        this.X = b;
        this.Y = textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        byte b = this.X;
        AppCompatButton appCompatButton = this.Y;
        switch (b) {
            case 0:
                vz7 vz7Var = HappTextView.o0;
                k32.l((HappTextView) appCompatButton);
                break;
            default:
                int i = HappTextButton.k0;
                vz7 vz7Var2 = HappTextView.o0;
                k32.l((HappTextButton) appCompatButton);
                break;
        }
    }
}

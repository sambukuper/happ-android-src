package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import su.happ.proxyutility.ui.foundation.component.HappInfoField;
import su.happ.proxyutility.ui.foundation.component.HappInputField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class ax2 implements View.OnLongClickListener {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Context Y;
    public final /* synthetic */ LinearLayout Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ax2(LinearLayout linearLayout, Context context, byte b) {
        this.X = b;
        this.Z = linearLayout;
        this.Y = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        byte b = this.X;
        Context context = this.Y;
        LinearLayout linearLayout = this.Z;
        switch (b) {
            case 0:
                String string = ((HappInfoField) linearLayout).g0.getText().toString();
                if (string.length() == 0) {
                    return false;
                }
                ss8 ss8Var = ss8.a;
                ss8.E(context, string);
                x79.h(context, y46.toast_copied_to_clipboard);
                return true;
            default:
                String strValueOf = String.valueOf(((HappInputField) linearLayout).g0.getText());
                if (strValueOf.length() == 0) {
                    return false;
                }
                ss8 ss8Var2 = ss8.a;
                ss8.E(context, strValueOf);
                x79.h(context, y46.toast_copied_to_clipboard);
                return true;
        }
    }
}

package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ce7 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ View Y;

    public /* synthetic */ ce7(View view, byte b) {
        this.X = b;
        this.Y = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        View view = this.Y;
        switch (b) {
            case 0:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            default:
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                break;
        }
    }
}

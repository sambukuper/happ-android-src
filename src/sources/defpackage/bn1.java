package defpackage;

import android.widget.Button;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class bn1 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Button Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ bn1(Button button, byte b) {
        this.X = b;
        this.Y = button;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        Button button = this.Y;
        switch (b) {
            case 0:
                button.requestFocus();
                break;
            default:
                m51 m51Var = vh3.z1;
                button.requestFocus();
                break;
        }
    }
}

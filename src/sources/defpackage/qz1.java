package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qz1 extends vy1 implements Runnable {
    public final WeakReference X;

    public qz1(EditText editText) {
        this.X = new WeakReference(editText);
    }

    @Override // defpackage.vy1
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.X.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        rz1.a((EditText) this.X.get(), 1);
    }
}

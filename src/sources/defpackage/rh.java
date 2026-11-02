package defpackage;

import android.content.Context;
import android.os.Process;
import android.widget.Toast;
import com.google.android.material.button.MaterialButton;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rh implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ rh(int i, Runnable runnable) {
        this.X = (byte) 0;
        this.Y = i;
        this.Z = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        int i = this.Y;
        Object obj = this.Z;
        switch (b) {
            case 0:
                Process.setThreadPriority(i);
                ((Runnable) obj).run();
                break;
            case 1:
                ((IntConsumer) obj).accept(i);
                break;
            case 2:
                ((xg0) obj).a(i);
                break;
            case 3:
                int[] iArr = MaterialButton.T0;
                ((MaterialButton) obj).setIconSize(i);
                break;
            default:
                Context context = (Context) obj;
                int i2 = fb8.b;
                Toast toastMakeText = Toast.makeText(context, context.getResources().getText(i), 0);
                fb8.a(toastMakeText.getView(), new fv6(context));
                new fb8(context, toastMakeText).show();
                break;
        }
    }

    public /* synthetic */ rh(Object obj, int i, byte b) {
        this.X = b;
        this.Z = obj;
        this.Y = i;
    }
}

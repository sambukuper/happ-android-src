package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ds4 extends Handler {
    public final WeakReference a;
    public WeakReference b;

    public ds4(es4 es4Var) {
        this.a = new WeakReference(es4Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference = this.b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        WeakReference weakReference2 = this.a;
        if (weakReference2.get() == null) {
            return;
        }
        Bundle data = message.getData();
        os4.p(data);
        es4 es4Var = (es4) weakReference2.get();
        Messenger messenger = (Messenger) this.b.get();
        try {
            int i = message.what;
            if (i == 1) {
                os4.p(data.getBundle("data_root_hints"));
                data.getString("data_media_item_id");
                es4Var.getClass();
                return;
            }
            if (i == 2) {
                es4Var.getClass();
                return;
            }
            if (i != 3) {
                message.toString();
                return;
            }
            os4.p(data.getBundle("data_options"));
            os4.p(data.getBundle("data_notify_children_changed_options"));
            String string = data.getString("data_media_item_id");
            data.getParcelableArrayList("data_media_item_list");
            if (es4Var.g == messenger && es4Var.e.get(string) != null) {
                throw new ClassCastException();
            }
        } catch (BadParcelableException unused) {
            if (message.what == 1) {
                es4Var.getClass();
            }
        }
    }
}

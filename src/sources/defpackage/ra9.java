package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ra9 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ xa9 Y;

    public /* synthetic */ ra9(xa9 xa9Var, byte b) {
        this.X = b;
        this.Y = xa9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                xa9 xa9Var = this.Y;
                synchronized (xa9Var) {
                    if (xa9Var.a == 1) {
                        xa9Var.b("Timed out while binding");
                    }
                    break;
                }
                return;
            case 1:
                break;
            default:
                this.Y.b("Service disconnected");
                return;
        }
        while (true) {
            xa9 xa9Var2 = this.Y;
            synchronized (xa9Var2) {
                try {
                    if (xa9Var2.a != 2) {
                        return;
                    }
                    ArrayDeque arrayDeque = xa9Var2.d;
                    if (arrayDeque.isEmpty()) {
                        xa9Var2.d();
                        return;
                    }
                    bb9 bb9Var = (bb9) arrayDeque.poll();
                    SparseArray sparseArray = xa9Var2.e;
                    int i = bb9Var.a;
                    sparseArray.put(i, bb9Var);
                    ((ScheduledExecutorService) xa9Var2.f.f0).schedule(new zo2(xa9Var2, bb9Var, (byte) 24), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(bb9Var));
                    }
                    eb9 eb9Var = xa9Var2.f;
                    Messenger messenger = xa9Var2.b;
                    byte b = bb9Var.c;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = b;
                    messageObtain.arg1 = i;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", bb9Var.a());
                    bundle.putString("pkg", ((Context) eb9Var.Z).getPackageName());
                    bundle.putBundle("data", bb9Var.d);
                    messageObtain.setData(bundle);
                    try {
                        c89 c89Var = xa9Var2.c;
                        Messenger messenger2 = (Messenger) c89Var.X;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            ha9 ha9Var = (ha9) c89Var.Y;
                            if (ha9Var == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            ha9Var.X.send(messageObtain);
                        }
                    } catch (RemoteException e) {
                        xa9Var2.b(e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qc7 implements Handler.Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qc7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ComponentName componentName = null;
        switch (this.a) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                yr6 yr6Var = (yr6) this.b;
                rc7 rc7Var = (rc7) message.obj;
                synchronized (yr6Var.Y) {
                    if (((rc7) yr6Var.f0) == rc7Var || ((rc7) yr6Var.g0) == rc7Var) {
                        yr6Var.c(rc7Var, 2);
                    }
                    break;
                }
                return true;
            case 1:
                int i = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    new StringBuilder(String.valueOf(i).length() + 30);
                }
                xa9 xa9Var = (xa9) this.b;
                synchronized (xa9Var) {
                    try {
                        SparseArray sparseArray = xa9Var.e;
                        bb9 bb9Var = (bb9) sparseArray.get(i);
                        if (bb9Var != null) {
                            sparseArray.remove(i);
                            xa9Var.d();
                            Bundle data = message.getData();
                            if (!data.getBoolean("unsupported", false)) {
                                switch (bb9Var.e) {
                                    case 0:
                                        if (!data.getBoolean("ack", false)) {
                                            bb9Var.c(new db9("Invalid response to one way request", null));
                                        } else {
                                            bb9Var.b(null);
                                        }
                                        break;
                                    default:
                                        Bundle bundle = data.getBundle("data");
                                        if (bundle == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        bb9Var.b(bundle);
                                        break;
                                }
                            } else {
                                bb9Var.c(new db9("Not supported by GmsCore", null));
                            }
                        } else {
                            new StringBuilder(String.valueOf(i).length() + 39);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            default:
                int i2 = message.what;
                if (i2 == 0) {
                    ya9 ya9Var = (ya9) this.b;
                    synchronized (ya9Var.a) {
                        try {
                            ua9 ua9Var = (ua9) message.obj;
                            wa9 wa9Var = (wa9) ya9Var.a.get(ua9Var);
                            if (wa9Var != null && wa9Var.a.isEmpty()) {
                                if (wa9Var.c) {
                                    ua9 ua9Var2 = wa9Var.e;
                                    ya9 ya9Var2 = wa9Var.g;
                                    ya9Var2.c.removeMessages(1, ua9Var2);
                                    ya9Var2.d.b(ya9Var2.b, wa9Var);
                                    wa9Var.c = false;
                                    wa9Var.b = (byte) 2;
                                }
                                ya9Var.a.remove(ua9Var);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return true;
                }
                if (i2 != 1) {
                    return false;
                }
                ya9 ya9Var3 = (ya9) this.b;
                synchronized (ya9Var3.a) {
                    try {
                        ua9 ua9Var3 = (ua9) message.obj;
                        wa9 wa9Var2 = (wa9) ya9Var3.a.get(ua9Var3);
                        if (wa9Var2 != null && wa9Var2.b == 3) {
                            new StringBuilder(String.valueOf(ua9Var3).length() + 47);
                            new Exception();
                            ComponentName componentName2 = wa9Var2.f;
                            if (componentName2 == null) {
                                ua9Var3.getClass();
                            } else {
                                componentName = componentName2;
                            }
                            if (componentName == null) {
                                ua9Var3.getClass();
                                componentName = new ComponentName("com.google.android.gms", "unknown");
                            }
                            wa9Var2.onServiceDisconnected(componentName);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return true;
        }
    }
}

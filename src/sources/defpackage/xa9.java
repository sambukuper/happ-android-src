package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xa9 implements ServiceConnection {
    public byte a = 0;
    public final Messenger b;
    public c89 c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final /* synthetic */ eb9 f;

    public xa9(eb9 eb9Var) {
        this.f = eb9Var;
        f99 f99Var = new f99(Looper.getMainLooper(), new qc7(this, (byte) 1));
        Looper.getMainLooper();
        this.b = new Messenger(f99Var);
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final synchronized boolean a(bb9 bb9Var) throws Throwable {
        xa9 xa9Var;
        Throwable th;
        try {
            try {
                byte b = this.a;
                byte b2 = 0;
                if (b != 0) {
                    try {
                        if (b == 1) {
                            this.d.add(bb9Var);
                            return true;
                        }
                        if (b != 2) {
                            return false;
                        }
                        this.d.add(bb9Var);
                        ((ScheduledExecutorService) this.f.f0).execute(new ra9(this, (byte) 1));
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                        xa9Var = this;
                    }
                } else {
                    this.d.add(bb9Var);
                    try {
                        if (this.a == 0) {
                            this.a = (byte) 1;
                            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                            intent.setPackage("com.google.android.gms");
                            try {
                                d21 d21VarA = d21.a();
                                eb9 eb9Var = this.f;
                                try {
                                    Context context = (Context) eb9Var.Z;
                                    try {
                                        xa9Var = this;
                                        try {
                                            try {
                                                if (d21VarA.c(context, context.getClass().getName(), intent, xa9Var, 1, null)) {
                                                    ra9 ra9Var = new ra9(xa9Var, b2);
                                                    ((ScheduledExecutorService) eb9Var.f0).schedule(ra9Var, 30L, TimeUnit.SECONDS);
                                                } else {
                                                    xa9Var.b("Unable to bind to service");
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        } catch (SecurityException e) {
                                            e = e;
                                            xa9Var.c("Unable to bind to service", e);
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        xa9Var = this;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    xa9Var = this;
                                }
                            } catch (SecurityException e2) {
                                e = e2;
                                xa9Var = this;
                            }
                            return true;
                        }
                        xa9Var = this;
                        try {
                            throw new IllegalStateException();
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                    th = th;
                }
            } catch (Throwable th8) {
                th = th8;
                th = th;
            }
        } catch (Throwable th9) {
            th = th9;
            xa9Var = this;
            th = th;
        }
        throw th;
    }

    public final synchronized void b(String str) {
        c(str, null);
    }

    public final synchronized void c(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            byte b = this.a;
            if (b == 0) {
                throw new IllegalStateException();
            }
            if (b != 1 && b != 2) {
                if (b != 3) {
                    return;
                }
                this.a = (byte) 4;
                return;
            }
            this.a = (byte) 4;
            d21.a().b((Context) this.f.Z, this);
            db9 db9Var = new db9(str, securityException);
            ArrayDeque arrayDeque = this.d;
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((bb9) it.next()).c(db9Var);
            }
            arrayDeque.clear();
            int i = 0;
            while (true) {
                SparseArray sparseArray = this.e;
                if (i >= sparseArray.size()) {
                    sparseArray.clear();
                    return;
                } else {
                    ((bb9) sparseArray.valueAt(i)).c(db9Var);
                    i++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            this.a = (byte) 3;
            d21.a().b((Context) this.f.Z, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ((ScheduledExecutorService) this.f.f0).execute(new zo2(this, iBinder, (byte) 22));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((ScheduledExecutorService) this.f.f0).execute(new ra9(this, (byte) 2));
    }
}

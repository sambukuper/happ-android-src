package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.system.OsConstants;
import java.net.InetSocketAddress;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import libxray.ProcessFinder;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d21 implements ProcessFinder {
    public static final Object Y = new Object();
    public static volatile d21 Z;
    public final Object X;

    public d21(Service service) {
        this.X = (ConnectivityManager) service.getSystemService(ConnectivityManager.class);
    }

    public static d21 a() {
        if (Z == null) {
            synchronized (Y) {
                try {
                    if (Z == null) {
                        Z = new d21();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d21 d21Var = Z;
        w45.s(d21Var);
        return d21Var;
    }

    public void b(Context context, ServiceConnection serviceConnection) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.X;
        if ((serviceConnection instanceof wa9) || !concurrentHashMap.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                concurrentHashMap.remove(serviceConnection);
            }
        }
    }

    public boolean c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.X;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((n59.a(context).a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof wa9) {
            if (executor == null) {
                executor = null;
            }
            return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
            if (zBindService) {
                return zBindService;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }

    @Override // libxray.ProcessFinder
    public long findProcessByConnection(String str, String str2, long j, String str3, long j2) {
        int i;
        str.getClass();
        str2.getClass();
        str3.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.X;
        if (connectivityManager == null) {
            return -1L;
        }
        if (!str.equals("tcp")) {
            if (str.equals("udp")) {
                i = OsConstants.IPPROTO_UDP;
            }
            return -1L;
        }
        i = OsConstants.IPPROTO_TCP;
        if (!fm7.o0(str3) && j2 != 0) {
            try {
                return connectivityManager.getConnectionOwnerUid(i, new InetSocketAddress(str2, (int) j), new InetSocketAddress(str3, (int) j2));
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    public d21() {
        this.X = new ConcurrentHashMap();
    }
}

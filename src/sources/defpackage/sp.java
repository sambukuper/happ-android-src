package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import java.util.Calendar;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sp extends v3 {
    public final /* synthetic */ byte c = 0;
    public final /* synthetic */ wp d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp(wp wpVar, Context context) {
        super(wpVar);
        this.d = wpVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.v3
    public final IntentFilter g() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    @Override // defpackage.v3
    public final int i() {
        Location lastKnownLocation;
        boolean z;
        long j;
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                return ((PowerManager) obj).isPowerSaveMode() ? 2 : 1;
            default:
                zv7 zv7Var = (zv7) obj;
                LocationManager locationManager = (LocationManager) zv7Var.Y;
                dg dgVar = (dg) zv7Var.Z;
                if (dgVar.b > System.currentTimeMillis()) {
                    z = dgVar.a;
                } else {
                    Context context = (Context) zv7Var.X;
                    Location lastKnownLocation2 = null;
                    if (w51.p(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("network")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("network");
                            } else {
                                lastKnownLocation = null;
                            }
                            break;
                        } catch (Exception unused) {
                        }
                    } else {
                        lastKnownLocation = null;
                    }
                    if (w51.p(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                    if (lastKnownLocation2 == null || lastKnownLocation == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > lastKnownLocation.getTime()) {
                        lastKnownLocation = lastKnownLocation2;
                    }
                    z = false;
                    if (lastKnownLocation != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        tg8 tg8Var = tg8.d;
                        if (tg8Var == null) {
                            tg8Var = new tg8();
                            tg8.d = tg8Var;
                        }
                        tg8 tg8Var2 = tg8Var;
                        tg8Var2.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis - 86400000);
                        tg8Var2.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis);
                        z = tg8Var2.c;
                        long j2 = tg8Var2.b;
                        long j3 = tg8Var2.a;
                        tg8Var2.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j4 = tg8Var2.b;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j3) {
                                j2 = j4;
                            } else if (jCurrentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
                        }
                        dgVar.a = z;
                        dgVar.b = j;
                    } else {
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z = true;
                        }
                    }
                }
                return z ? 2 : 1;
        }
    }

    @Override // defpackage.v3
    public final void o() {
        byte b = this.c;
        wp wpVar = this.d;
        switch (b) {
            case 0:
                wpVar.m(true, true);
                break;
            default:
                wpVar.m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp(wp wpVar, zv7 zv7Var) {
        super(wpVar);
        this.d = wpVar;
        this.e = zv7Var;
    }
}

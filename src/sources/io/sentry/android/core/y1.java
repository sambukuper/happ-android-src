package io.sentry.android.core;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import defpackage.di;
import defpackage.fl6;
import io.sentry.ILogger;
import io.sentry.s5;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 implements SensorEventListener {
    public SensorManager a;
    public Sensor b;
    public HandlerThread c;
    public Handler d;
    public volatile w1 e;
    public ILogger f;
    public boolean g;
    public final di h;

    public y1(ILogger iLogger) {
        di diVar = new di();
        diVar.d = new n0();
        this.h = diVar;
        this.f = iLogger;
    }

    public final synchronized void a() {
        this.g = true;
        d();
        HandlerThread handlerThread = this.c;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.c = null;
            this.d = null;
        }
    }

    public final synchronized void b(Context context) {
        try {
            if (this.g) {
                return;
            }
            SensorManager sensorManager = this.a;
            if (sensorManager == null) {
                sensorManager = (SensorManager) context.getSystemService("sensor");
                this.a = sensorManager;
            }
            if (sensorManager != null && this.b == null) {
                this.b = sensorManager.getDefaultSensor(1, false);
            }
            if (this.b != null && this.c == null) {
                HandlerThread handlerThread = new HandlerThread("sentry-shake");
                this.c = handlerThread;
                handlerThread.start();
                this.d = new Handler(this.c.getLooper());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Activity activity, w1 w1Var) {
        if (this.g) {
            return;
        }
        this.e = w1Var;
        b(activity);
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            this.f.h(s5.WARNING, "SensorManager is not available. Shake detection disabled.", new Object[0]);
            return;
        }
        Sensor sensor = this.b;
        if (sensor == null) {
            this.f.h(s5.WARNING, "Accelerometer sensor not available. Shake detection disabled.", new Object[0]);
        } else {
            sensorManager.registerListener(this, sensor, 3, this.d);
        }
    }

    public final synchronized void d() {
        try {
            this.e = null;
            SensorManager sensorManager = this.a;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
            Handler handler = this.d;
            if (handler != null) {
                handler.post(new fl6((Object) this, (byte) 27));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        int i2;
        x1 x1Var;
        int i3;
        x1 x1Var2;
        int i4 = 1;
        if (sensorEvent.sensor.getType() != 1) {
            return;
        }
        float[] fArr = sensorEvent.values;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        boolean z = Math.sqrt((double) ((f3 * f3) + ((f2 * f2) + (f * f)))) > 13.0d;
        di diVar = this.h;
        long j = sensorEvent.timestamp;
        n0 n0Var = (n0) diVar.d;
        long j2 = j - 500000000;
        while (true) {
            i = diVar.a;
            if (i >= 4 && (x1Var2 = (x1) diVar.b) != null) {
                i2 = i4;
                if (j2 - x1Var2.a <= 0) {
                    break;
                }
                if (x1Var2.b) {
                    diVar.c -= i2;
                }
                diVar.a = i - 1;
                x1 x1Var3 = x1Var2.c;
                diVar.b = x1Var3;
                if (x1Var3 == null) {
                    diVar.e = null;
                }
                x1Var2.c = (x1) n0Var.a;
                n0Var.a = x1Var2;
                i4 = i2;
            } else {
                i2 = i4;
                break;
            }
        }
        x1 x1Var4 = (x1) n0Var.a;
        if (x1Var4 == null) {
            x1Var4 = new x1();
        } else {
            n0Var.a = x1Var4.c;
        }
        x1Var4.a = j;
        x1Var4.b = z;
        x1Var4.c = null;
        x1 x1Var5 = (x1) diVar.e;
        if (x1Var5 != null) {
            x1Var5.c = x1Var4;
        }
        diVar.e = x1Var4;
        if (((x1) diVar.b) == null) {
            diVar.b = x1Var4;
        }
        diVar.a = i + i2;
        if (z) {
            diVar.c += i2;
        }
        di diVar2 = this.h;
        x1 x1Var6 = (x1) diVar2.e;
        if (x1Var6 == null || (x1Var = (x1) diVar2.b) == null || (i3 = diVar2.a) < 4 || x1Var6.a - x1Var.a < 250000000 || diVar2.c < (i3 >> 1) + (i3 >> 2)) {
            return;
        }
        while (true) {
            x1 x1Var7 = (x1) diVar2.b;
            if (x1Var7 == null) {
                break;
            }
            diVar2.b = x1Var7.c;
            n0 n0Var2 = (n0) diVar2.d;
            x1Var7.c = (x1) n0Var2.a;
            n0Var2.a = x1Var7;
        }
        diVar2.e = null;
        diVar2.a = 0;
        diVar2.c = 0;
        w1 w1Var = this.e;
        if (w1Var != null) {
            w1Var.b();
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}

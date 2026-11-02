package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uo1 {
    public final Context a;
    public final vo1 b;
    public VelocityTracker c;
    public float d;
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public final int[] h = {Integer.MAX_VALUE, 0};

    public uo1(Context context, vo1 vo1Var) {
        this.a = context;
        this.b = vo1Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:81:0x0165  */
    public final void a(MotionEvent motionEvent, int i) {
        int i2;
        int i3;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z;
        float f;
        float yVelocity;
        long j;
        int i4;
        float fSqrt;
        float f2;
        float[] fArr;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i5 = this.f;
        int[] iArr = this.h;
        if (i5 == source && this.g == deviceId && this.e == i) {
            z = false;
            i2 = 1;
            i3 = 0;
        } else {
            Context context = this.a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i2 = 1;
            int i6 = Build.VERSION.SDK_INT;
            i3 = 0;
            if (i6 >= 34) {
                Method method = hw8.a;
                scaledMinimumFlingVelocity = u3.p(viewConfiguration, deviceId2, i, source2);
            } else {
                Method method2 = hw8.a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i, source2) == null) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    }
                }
            }
            iArr[0] = scaledMinimumFlingVelocity;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i6 >= 34) {
                scaledMaximumFlingVelocity = u3.o(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 == null || device2.getMotionRange(i, source3) == null) {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            this.f = source;
            this.g = deviceId;
            this.e = i;
            z = true;
        }
        int i7 = iArr[i3];
        VelocityTracker velocityTrackerObtain = this.c;
        if (i7 == Integer.MAX_VALUE) {
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.recycle();
                this.c = null;
                return;
            }
            return;
        }
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.c = velocityTrackerObtain;
        }
        Map map = wu8.a;
        velocityTrackerObtain.addMovement(motionEvent);
        float f3 = 0.0f;
        int i8 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = wu8.a;
            if (!map2.containsKey(velocityTrackerObtain)) {
                map2.put(velocityTrackerObtain, new xu8());
            }
            xu8 xu8Var = (xu8) map2.get(velocityTrackerObtain);
            long[] jArr = xu8Var.b;
            long eventTime = motionEvent.getEventTime();
            int i9 = xu8Var.d;
            if (i9 != 0 && eventTime - jArr[xu8Var.e] > 40) {
                xu8Var.d = i3;
                xu8Var.c = 0.0f;
                i9 = 0;
            }
            int i10 = (xu8Var.e + 1) % 20;
            xu8Var.e = i10;
            if (i9 != 20) {
                xu8Var.d = i9 + 1;
            }
            xu8Var.a[i10] = motionEvent.getAxisValue(26);
            jArr[xu8Var.e] = eventTime;
        }
        velocityTrackerObtain.computeCurrentVelocity(XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax, Float.MAX_VALUE);
        xu8 xu8Var2 = (xu8) wu8.a.get(velocityTrackerObtain);
        if (xu8Var2 != null) {
            float[] fArr2 = xu8Var2.a;
            long[] jArr2 = xu8Var2.b;
            int i11 = xu8Var2.d;
            if (i11 < 2) {
                fSqrt = 0.0f;
                f = 0.0f;
            } else {
                int i12 = xu8Var2.e;
                int i13 = ((i12 + 20) - (i11 - 1)) % 20;
                long j2 = jArr2[i12];
                while (true) {
                    j = jArr2[i13];
                    long j3 = j2 - j;
                    i4 = xu8Var2.d;
                    if (j3 <= 100) {
                        break;
                    }
                    xu8Var2.d = i4 - 1;
                    i13 = (i13 + 1) % 20;
                }
                if (i4 < 2) {
                    fSqrt = 0.0f;
                    f = 0.0f;
                } else if (i4 == 2) {
                    int i14 = (i13 + 1) % 20;
                    long j4 = jArr2[i14];
                    if (j == j4) {
                        fSqrt = 0.0f;
                        f = 0.0f;
                    } else {
                        fSqrt = fArr2[i14] / (j4 - j);
                        f = 0.0f;
                    }
                } else {
                    float fAbs = 0.0f;
                    int i15 = 0;
                    int i16 = 0;
                    while (true) {
                        if (i15 >= xu8Var2.d - 1) {
                            break;
                        }
                        int i17 = i15 + i13;
                        long j5 = jArr2[i17 % 20];
                        int i18 = (i17 + 1) % i8;
                        if (jArr2[i18] == j5) {
                            f2 = f3;
                            fArr = fArr2;
                        } else {
                            i16++;
                            f2 = f3;
                            fArr = fArr2;
                            float fSqrt2 = (fAbs < f3 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                            float f4 = fArr[i18] / (jArr2[i18] - j5);
                            fAbs += Math.abs(f4) * (f4 - fSqrt2);
                            if (i16 == i2) {
                                fAbs *= 0.5f;
                            }
                        }
                        i15++;
                        f3 = f2;
                        fArr2 = fArr;
                        i8 = 20;
                        i2 = 1;
                    }
                    f = f3;
                    fSqrt = (fAbs < f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                }
            }
            float f5 = fSqrt * 1000.0f;
            xu8Var2.c = f5;
            if (f5 < (-Math.abs((float) r3))) {
                xu8Var2.c = -Math.abs(Float.MAX_VALUE);
            } else if (xu8Var2.c > Math.abs((float) r3)) {
                xu8Var2.c = Math.abs((float) r3);
            }
        } else {
            f = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = u3.g(velocityTrackerObtain, i);
        } else if (i == 0) {
            yVelocity = velocityTrackerObtain.getXVelocity();
        } else if (i == 1) {
            yVelocity = velocityTrackerObtain.getYVelocity();
        } else {
            xu8 xu8Var3 = (xu8) wu8.a.get(velocityTrackerObtain);
            yVelocity = (xu8Var3 == null || i != 26) ? f : xu8Var3.c;
        }
        vo1 vo1Var = this.b;
        float fW = vo1Var.w() * yVelocity;
        float fSignum = Math.signum(fW);
        if (z || (fSignum != Math.signum(this.d) && fSignum != f)) {
            vo1Var.x();
        }
        if (Math.abs(fW) < iArr[0]) {
            return;
        }
        int i19 = iArr[1];
        float fMax = Math.max(-i19, Math.min(fW, i19));
        this.d = vo1Var.p(fMax) ? fMax : f;
    }
}

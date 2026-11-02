package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hg0 implements ig0 {
    public final Context a;
    public final s98 b;
    public final hl5 c;
    public final mj0 d;
    public final u08 e;
    public final ArrayMap f;
    public final ArrayMap g;
    public final ArrayMap h;

    public hg0(Context context, s98 s98Var, hl5 hl5Var, mj0 mj0Var, u08 u08Var) {
        s98Var.getClass();
        hl5Var.getClass();
        u08Var.getClass();
        this.a = context;
        this.b = s98Var;
        this.c = hl5Var;
        this.d = mj0Var;
        this.e = u08Var;
        this.f = new ArrayMap();
        this.g = new ArrayMap();
        this.h = new ArrayMap();
    }

    public final jj0 a(String str) {
        jj0 jj0VarC;
        str.getClass();
        try {
            Trace.beginSection(((Object) vi0.b(str)) + "#awaitMetadata");
            synchronized (this.f) {
                jj0VarC = (jj0) this.f.get(str);
                if (jj0VarC == null) {
                    if (e()) {
                        jj0VarC = c(str, true);
                    } else {
                        jj0VarC = c(str, false);
                        this.f.put(str, jj0VarC);
                    }
                }
            }
            Trace.endSection();
            return jj0VarC;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final if0 b(int i, String str, boolean z) {
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(((Object) vi0.b(str)) + "#readCameraExtensionMetadata");
            try {
                vi0.b(str);
                if0 if0Var = new if0(str, i, d(str));
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                if (z && !z) {
                    throw new b55();
                }
                vi0.b(str);
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1));
                Trace.endSection();
                return if0Var;
            } catch (Throwable th) {
                throw new IllegalStateException("Failed to load extension metadata for " + ((Object) vi0.b(str)) + '!', th);
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final lf0 c(String str, boolean z) {
        Iterable iterableA0;
        mj0 mj0Var = this.d;
        Map map = (Map) mj0Var.Z;
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(((Object) vi0.b(str)) + "#readCameraMetadata");
            String methodName = null;
            try {
                vi0.b(str);
                Object systemService = this.a.getSystemService("camera");
                systemService.getClass();
                CameraCharacteristics cameraCharacteristics = ((CameraManager) systemService).getCameraCharacteristics(str);
                cameraCharacteristics.getClass();
                if (Build.VERSION.SDK_INT < 32 || cameraCharacteristics.get(CameraCharacteristics.INFO_DEVICE_STATE_SENSOR_ORIENTATION_MAP) == null) {
                    iterableA0 = (Set) map.get(new vi0(str));
                } else {
                    Set set = (Set) map.get(new vi0(str));
                    if (set == null) {
                        set = m02.X;
                    }
                    iterableA0 = q57.a0(set, CameraCharacteristics.SENSOR_ORIENTATION);
                }
                Set setZ = (Set) mj0Var.Y;
                if (iterableA0 != null) {
                    setZ = q57.Z(setZ, iterableA0);
                }
                lf0 lf0Var = new lf0(str, cameraCharacteristics, this, setZ);
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                if (z && !z) {
                    throw new b55();
                }
                vi0.b(str);
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1));
                Trace.endSection();
                return lf0Var;
            } catch (Throwable th) {
                if (Build.VERSION.SDK_INT == 28) {
                    boolean zF = false;
                    if (th instanceof RuntimeException) {
                        StackTraceElement[] stackTrace = th.getStackTrace();
                        stackTrace.getClass();
                        if (stackTrace.length != 0) {
                            methodName = stackTrace[0].getMethodName();
                        }
                        zF = dh3.f(methodName, "_enableShutterSound");
                    }
                    if (zF) {
                        throw new ms1("Failed to load metadata: Do Not Disturb mode is on!");
                    }
                }
                throw new IllegalStateException("Failed to load metadata for " + ((Object) vi0.b(str)) + '!', th);
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final CameraExtensionCharacteristics d(String str) throws CameraAccessException {
        synchronized (this.h) {
            CameraExtensionCharacteristics cameraExtensionCharacteristics = (CameraExtensionCharacteristics) this.h.get(str);
            if (cameraExtensionCharacteristics != null) {
                return cameraExtensionCharacteristics;
            }
            vi0.b(str);
            Object systemService = this.a.getSystemService("camera");
            systemService.getClass();
            str.getClass();
            CameraExtensionCharacteristics cameraExtensionCharacteristics2 = ((CameraManager) systemService).getCameraExtensionCharacteristics(str);
            cameraExtensionCharacteristics2.getClass();
            return cameraExtensionCharacteristics2;
        }
    }

    public final boolean e() {
        boolean z;
        hl5 hl5Var = this.c;
        hl5Var.getClass();
        if (dh3.f(Build.FINGERPRINT, "robolectric")) {
            z = true;
        } else {
            if (!hl5Var.b) {
                Trace.beginSection("CXCP#checkCameraPermission");
                if (hl5Var.a.checkSelfPermission("android.permission.CAMERA") == 0) {
                    hl5Var.b = true;
                }
                Trace.endSection();
            }
            z = hl5Var.b;
        }
        return !z;
    }
}

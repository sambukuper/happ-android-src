package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class xa implements gh0 {
    public final za X;
    public final CameraCaptureSession Y;
    public final eg0 Z;
    public final Handler f0;

    public xa(za zaVar, CameraCaptureSession cameraCaptureSession, eg0 eg0Var, Handler handler) {
        eg0Var.getClass();
        handler.getClass();
        this.X = zaVar;
        this.Y = cameraCaptureSession;
        this.Z = eg0Var;
        this.f0 = handler;
        qv qvVar = gj0.a;
        qvVar.getClass();
        qv.b.incrementAndGet(qvVar);
    }

    @Override // defpackage.gh0
    public final boolean A0() {
        dn8 dn8Var;
        StringBuilder sb = new StringBuilder("CXCP#stopRepeating-");
        String str = this.X.Z;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            eg0 eg0Var = this.Z;
            try {
                this.Y.stopRepeating();
                dn8Var = dn8.a;
            } catch (Exception e) {
                if (e instanceof CameraAccessException) {
                    e.getMessage();
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    int i = 3;
                    if (reason != 1) {
                        if (reason == 2) {
                            i = 6;
                        } else if (reason == 3) {
                            i = 0;
                        } else if (reason == 4) {
                            i = 1;
                        } else if (reason != 5) {
                            cameraAccessException.toString();
                            i = 11;
                        } else {
                            i = 2;
                        }
                    }
                    eg0Var.a(i, str, true);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    eg0Var.a(9, str, false);
                } else if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                dn8Var = null;
            }
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
            return dn8Var != null;
        } catch (Throwable th) {
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
            throw th;
        }
    }

    @Override // defpackage.bo8
    public Object C0(zu3 zu3Var) {
        zu3Var.getClass();
        if (zu3Var.equals(yb6.a.b(CameraCaptureSession.class))) {
            return this.Y;
        }
        return null;
    }

    @Override // defpackage.gh0
    public final Integer G(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        Integer numValueOf;
        captureRequest.getClass();
        StringBuilder sb = new StringBuilder("CXCP#capture-");
        String str = this.X.Z;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            eg0 eg0Var = this.Z;
            try {
                numValueOf = Integer.valueOf(this.Y.capture(captureRequest, captureCallback, this.f0));
            } catch (Exception e) {
                int i = 0;
                if (e instanceof CameraAccessException) {
                    e.getMessage();
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    if (reason == 1) {
                        i = 3;
                    } else if (reason == 2) {
                        i = 6;
                    } else if (reason != 3) {
                        if (reason == 4) {
                            i = 1;
                        } else if (reason != 5) {
                            cameraAccessException.toString();
                            i = 11;
                        } else {
                            i = 2;
                        }
                    }
                    eg0Var.a(i, str, true);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    eg0Var.a(9, str, false);
                } else if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                numValueOf = null;
            }
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
            return numValueOf;
        } catch (Throwable th) {
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
            throw th;
        }
    }

    @Override // defpackage.gh0
    public final Integer L0(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) {
        Integer numValueOf;
        StringBuilder sb = new StringBuilder("CXCP#setRepeatingBurst-");
        String str = this.X.Z;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            eg0 eg0Var = this.Z;
            try {
                numValueOf = Integer.valueOf(this.Y.setRepeatingBurst(arrayList, captureCallback, this.f0));
            } catch (Exception e) {
                int i = 0;
                if (e instanceof CameraAccessException) {
                    e.getMessage();
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    if (reason == 1) {
                        i = 3;
                    } else if (reason == 2) {
                        i = 6;
                    } else if (reason != 3) {
                        if (reason == 4) {
                            i = 1;
                        } else if (reason != 5) {
                            cameraAccessException.toString();
                            i = 11;
                        } else {
                            i = 2;
                        }
                    }
                    eg0Var.a(i, str, true);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    eg0Var.a(9, str, false);
                } else if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                numValueOf = null;
            }
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
            return numValueOf;
        } catch (Throwable th) {
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
            throw th;
        }
    }

    @Override // defpackage.gh0
    public final Integer O0(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        Integer numValueOf;
        captureRequest.getClass();
        StringBuilder sb = new StringBuilder("CXCP#setRepeatingRequest-");
        String str = this.X.Z;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            eg0 eg0Var = this.Z;
            try {
                numValueOf = Integer.valueOf(this.Y.setRepeatingRequest(captureRequest, captureCallback, this.f0));
            } catch (Exception e) {
                int i = 0;
                if (e instanceof CameraAccessException) {
                    e.getMessage();
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    if (reason == 1) {
                        i = 3;
                    } else if (reason == 2) {
                        i = 6;
                    } else if (reason != 3) {
                        if (reason == 4) {
                            i = 1;
                        } else if (reason != 5) {
                            cameraAccessException.toString();
                            i = 11;
                        } else {
                            i = 2;
                        }
                    }
                    eg0Var.a(i, str, true);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    eg0Var.a(9, str, false);
                } else if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                numValueOf = null;
            }
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
            return numValueOf;
        } catch (Throwable th) {
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
            throw th;
        }
    }

    @Override // defpackage.gh0
    public final Integer R0(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) {
        Integer numValueOf;
        StringBuilder sb = new StringBuilder("CXCP#captureBurst-");
        String str = this.X.Z;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            eg0 eg0Var = this.Z;
            try {
                numValueOf = Integer.valueOf(this.Y.captureBurst(arrayList, captureCallback, this.f0));
            } catch (Exception e) {
                int i = 0;
                if (e instanceof CameraAccessException) {
                    e.getMessage();
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    if (reason == 1) {
                        i = 3;
                    } else if (reason == 2) {
                        i = 6;
                    } else if (reason != 3) {
                        if (reason == 4) {
                            i = 1;
                        } else if (reason != 5) {
                            cameraAccessException.toString();
                            i = 11;
                        } else {
                            i = 2;
                        }
                    }
                    eg0Var.a(i, str, true);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    eg0Var.a(9, str, false);
                } else if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                numValueOf = null;
            }
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
            return numValueOf;
        } catch (Throwable th) {
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
            throw th;
        }
    }

    @Override // defpackage.gh0
    public final boolean b0() {
        dn8 dn8Var;
        StringBuilder sb = new StringBuilder("CXCP#abortCaptures-");
        String str = this.X.Z;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            eg0 eg0Var = this.Z;
            try {
                this.Y.abortCaptures();
                dn8Var = dn8.a;
            } catch (Exception e) {
                if (e instanceof CameraAccessException) {
                    e.getMessage();
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    int i = 3;
                    if (reason != 1) {
                        if (reason == 2) {
                            i = 6;
                        } else if (reason == 3) {
                            i = 0;
                        } else if (reason == 4) {
                            i = 1;
                        } else if (reason != 5) {
                            cameraAccessException.toString();
                            i = 11;
                        } else {
                            i = 2;
                        }
                    }
                    eg0Var.a(i, str, true);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    eg0Var.a(9, str, false);
                } else if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                dn8Var = null;
            }
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
            return dn8Var != null;
        } catch (Throwable th) {
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
            throw th;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.Y.close();
    }

    @Override // defpackage.gh0
    public final Surface getInputSurface() {
        return this.Y.getInputSurface();
    }

    @Override // defpackage.gh0
    public final yh0 i0() {
        return this.X;
    }

    @Override // defpackage.gh0
    public final boolean x0(List list) {
        dn8 dn8Var;
        String str = this.X.Z;
        if (Build.VERSION.SDK_INT < 26) {
            bt.i("Attempting to call finalizeOutputConfigurations before O is not supported and may lead to to unexpected behavior if an application is expects this call to succeed.");
            return false;
        }
        String strL = oi0.l("CXCP#finalizeOutputConfigurations-", str);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(strL);
            eg0 eg0Var = this.Z;
            try {
                CameraCaptureSession cameraCaptureSession = this.Y;
                ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((OutputConfiguration) ((af) it.next()).C0(yb6.a.b(OutputConfiguration.class)));
                }
                ue3.q(cameraCaptureSession, arrayList);
                dn8Var = dn8.a;
            } catch (Exception e) {
                if (e instanceof CameraAccessException) {
                    e.getMessage();
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    int i = 3;
                    if (reason != 1) {
                        if (reason == 2) {
                            i = 6;
                        } else if (reason == 3) {
                            i = 0;
                        } else if (reason == 4) {
                            i = 1;
                        } else if (reason != 5) {
                            cameraAccessException.toString();
                            i = 11;
                        } else {
                            i = 2;
                        }
                    }
                    eg0Var.a(i, str, true);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    eg0Var.a(9, str, false);
                } else if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                dn8Var = null;
            }
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
            return dn8Var != null;
        } catch (Throwable th) {
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(p61.h(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
            throw th;
        }
    }
}

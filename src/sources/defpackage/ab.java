package defpackage;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$ExtensionCaptureCallback;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ab extends CameraExtensionSession$ExtensionCaptureCallback {
    public final /* synthetic */ byte a;
    public final qf0 b;
    public final /* synthetic */ bb c;
    public final Serializable d;

    public ab(bb bbVar, qf0 qf0Var) {
        this.a = (byte) 0;
        this.c = bbVar;
        this.b = qf0Var;
        this.d = new ConcurrentLinkedQueue();
    }

    public final void onCaptureFailed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        byte b = this.a;
        qf0 qf0Var = this.b;
        Serializable serializable = this.d;
        cameraExtensionSession.getClass();
        captureRequest.getClass();
        switch (b) {
            case 0:
                if (((ConcurrentLinkedQueue) serializable).isEmpty()) {
                    bb bbVar = this.c;
                    long jIncrementAndGet = sv.b.incrementAndGet(bbVar.g0);
                    bbVar.h0.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
                    ((ConcurrentLinkedQueue) serializable).add(Long.valueOf(jIncrementAndGet));
                }
                Object objRemove = ((ConcurrentLinkedQueue) serializable).remove();
                objRemove.getClass();
                qf0Var.d(captureRequest, ((Number) objRemove).longValue());
                break;
            default:
                Object obj = ((LinkedHashMap) serializable).get(captureRequest);
                obj.getClass();
                LinkedHashMap linkedHashMap = (LinkedHashMap) serializable;
                if (((List) obj).size() != 1) {
                    Object obj2 = linkedHashMap.get(captureRequest);
                    obj2.getClass();
                    Objects.toString(((List) obj2).stream());
                } else {
                    Object obj3 = linkedHashMap.get(captureRequest);
                    obj3.getClass();
                    qf0Var.d(captureRequest, ((Number) ((List) obj3).get(0)).longValue());
                }
                break;
        }
    }

    public final void onCaptureProcessProgressed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, int i) {
        byte b = this.a;
        qf0 qf0Var = this.b;
        cameraExtensionSession.getClass();
        captureRequest.getClass();
        switch (b) {
            case 0:
                qf0Var.e(captureRequest, i);
                break;
            default:
                qf0Var.e(captureRequest, i);
                break;
        }
    }

    public final void onCaptureProcessStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        byte b = this.a;
        cameraExtensionSession.getClass();
        captureRequest.getClass();
    }

    public void onCaptureResultAvailable(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.a) {
            case 0:
                cameraExtensionSession.getClass();
                captureRequest.getClass();
                totalCaptureResult.getClass();
                Serializable serializable = this.d;
                if (((ConcurrentLinkedQueue) serializable).isEmpty()) {
                    bb bbVar = this.c;
                    long jIncrementAndGet = sv.b.incrementAndGet(bbVar.g0);
                    bbVar.h0.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
                    ((ConcurrentLinkedQueue) serializable).add(Long.valueOf(jIncrementAndGet));
                }
                Object objRemove = ((ConcurrentLinkedQueue) serializable).remove();
                objRemove.getClass();
                this.b.c(captureRequest, totalCaptureResult, ((Number) objRemove).longValue());
                break;
            default:
                super.onCaptureResultAvailable(cameraExtensionSession, captureRequest, totalCaptureResult);
                break;
        }
    }

    public final void onCaptureSequenceAborted(CameraExtensionSession cameraExtensionSession, int i) {
        byte b = this.a;
        qf0 qf0Var = this.b;
        cameraExtensionSession.getClass();
        switch (b) {
            case 0:
                qf0Var.f(i);
                break;
            default:
                qf0Var.f(i);
                break;
        }
    }

    public final void onCaptureSequenceCompleted(CameraExtensionSession cameraExtensionSession, int i) {
        byte b = this.a;
        qf0 qf0Var = this.b;
        bb bbVar = this.c;
        cameraExtensionSession.getClass();
        switch (b) {
            case 0:
                Long l = (Long) bbVar.h0.get(cameraExtensionSession);
                l.getClass();
                qf0Var.g(i, l.longValue());
                break;
            default:
                Long l2 = (Long) bbVar.h0.get(cameraExtensionSession);
                l2.getClass();
                qf0Var.g(i, l2.longValue());
                break;
        }
    }

    public final void onCaptureStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, long j) {
        byte b = this.a;
        Serializable serializable = this.d;
        bb bbVar = this.c;
        cameraExtensionSession.getClass();
        captureRequest.getClass();
        switch (b) {
            case 0:
                long jIncrementAndGet = sv.b.incrementAndGet(bbVar.g0);
                bbVar.h0.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
                ((ConcurrentLinkedQueue) serializable).add(Long.valueOf(jIncrementAndGet));
                this.b.h(captureRequest, jIncrementAndGet, j);
                break;
            default:
                long jIncrementAndGet2 = sv.b.incrementAndGet(bbVar.g0);
                bbVar.h0.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet2));
                LinkedHashMap linkedHashMap = (LinkedHashMap) serializable;
                Object arrayList = linkedHashMap.get(captureRequest);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(captureRequest, arrayList);
                }
                ((List) arrayList).add(Long.valueOf(jIncrementAndGet2));
                this.b.h(captureRequest, jIncrementAndGet2, j);
                break;
        }
    }

    public ab(bb bbVar, qf0 qf0Var, LinkedHashMap linkedHashMap) {
        this.a = (byte) 1;
        this.c = bbVar;
        this.b = qf0Var;
        this.d = linkedHashMap;
    }
}

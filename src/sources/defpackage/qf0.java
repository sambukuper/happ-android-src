package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Trace;
import android.util.ArrayMap;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qf0 extends CameraCaptureSession.CaptureCallback {
    public final String a;
    public final boolean b;
    public final ArrayList c;
    public final ArrayList d;
    public final List e;
    public final vk1 f;
    public final ArrayMap g;
    public final ArrayMap h;
    public final cl7 i;
    public final tl7 j;
    public final long k;
    public final ux0 l;
    public volatile Integer m;

    public qf0(String str, boolean z, ArrayList arrayList, ArrayList arrayList2, List list, vk1 vk1Var, ArrayMap arrayMap, ArrayMap arrayMap2, cl7 cl7Var, tl7 tl7Var) {
        str.getClass();
        list.getClass();
        tl7Var.getClass();
        this.a = str;
        this.b = z;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = list;
        this.f = vk1Var;
        this.g = arrayMap;
        this.h = arrayMap2;
        this.i = cl7Var;
        this.j = tl7Var;
        sv svVar = tf0.b;
        svVar.getClass();
        this.k = sv.b.incrementAndGet(svVar);
        this.l = new ux0();
        if (arrayList.size() == arrayList2.size()) {
            return;
        }
        bt.i("CaptureRequestList and CaptureMetadataList must have a 1:1 mapping.");
        throw null;
    }

    public final int a() {
        int iIntValue;
        if (this.m != null) {
            Integer num = this.m;
            if (num != null) {
                return num.intValue();
            }
            b61.e(33, this, "SequenceNumber has not been set for ");
            return 0;
        }
        synchronized (this) {
            Integer num2 = this.m;
            if (num2 == null) {
                throw new IllegalStateException(("SequenceNumber has not been set for " + this + '!').toString());
            }
            iIntValue = num2.intValue();
        }
        return iIntValue;
    }

    public final void b(te6 te6Var, long j, se6 se6Var) {
        this.f.F(this);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((me6) list.get(i)).X(te6Var, j, se6Var);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = te6Var.getRequest().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((me6) te6Var.getRequest().d.get(i2)).X(te6Var, j, se6Var);
        }
        Trace.endSection();
    }

    public final void c(CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult, long j) {
        Trace.beginSection("onCaptureCompleted");
        Trace.beginSection("onCaptureSequenceComplete");
        this.f.F(this);
        Trace.endSection();
        te6 te6VarI = i(captureRequest);
        de deVar = new de(totalCaptureResult, this.a, te6VarI);
        Trace.beginSection("onTotalCaptureResult");
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((me6) list.get(i)).J(te6VarI, j, deVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = te6VarI.getRequest().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((me6) te6VarI.getRequest().d.get(i2)).J(te6VarI, j, deVar);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.beginSection("onComplete");
        Trace.beginSection("InvokeInternalListeners");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ((me6) list.get(i3)).Y(te6VarI, j, deVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = te6VarI.getRequest().d.size();
        for (int i4 = 0; i4 < size4; i4++) {
            ((me6) te6VarI.getRequest().d.get(i4)).Y(te6VarI, j, deVar);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.endSection();
    }

    public final void d(CaptureRequest captureRequest, long j) {
        Trace.beginSection("onCaptureFailed");
        this.l.V(dn8.a);
        te6 te6VarI = i(captureRequest);
        b(te6VarI, j, new t62(te6VarI, j));
        Trace.endSection();
    }

    public final void e(CaptureRequest captureRequest, int i) {
        Trace.beginSection("onCaptureProcessProgressed");
        te6 te6VarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((me6) list.get(i2)).D(te6VarI, i);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = te6VarI.getRequest().d.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((me6) te6VarI.getRequest().d.get(i3)).D(te6VarI, i);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void f(int i) {
        Trace.beginSection("onCaptureSequenceAborted");
        this.l.V(dn8.a);
        this.f.F(this);
        if (a() != i) {
            StringBuilder sb = new StringBuilder("onCaptureSequenceAborted was invoked on ");
            sb.append(a());
            sb.append(", but expected ");
            sb.append(i);
            sb.append('!');
            this.j.getClass();
        }
        Trace.beginSection("InvokeInternalListeners");
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            te6 te6Var = (te6) arrayList.get(i2);
            List list = this.e;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((me6) list.get(i3)).u(te6Var);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            te6 te6Var2 = (te6) arrayList.get(i4);
            int size4 = te6Var2.getRequest().d.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((me6) te6Var2.getRequest().d.get(i5)).u(te6Var2);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void g(int i, long j) {
        Trace.beginSection("onCaptureSequenceCompleted");
        this.l.V(dn8.a);
        this.f.F(this);
        if (a() != i) {
            StringBuilder sb = new StringBuilder("onCaptureSequenceCompleted was invoked on ");
            sb.append(a());
            sb.append(", but expected ");
            sb.append(i);
            sb.append('!');
            this.j.getClass();
        }
        Trace.beginSection("InvokeInternalListeners");
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            te6 te6Var = (te6) arrayList.get(i2);
            List list = this.e;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((me6) list.get(i3)).p(te6Var, j);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            te6 te6Var2 = (te6) arrayList.get(i4);
            int size4 = te6Var2.getRequest().d.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((me6) te6Var2.getRequest().d.get(i5)).p(te6Var2, j);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void h(CaptureRequest captureRequest, long j, long j2) {
        Trace.beginSection("onCaptureStarted");
        this.l.V(dn8.a);
        te6 te6VarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((me6) list.get(i)).C(te6VarI, j, j2);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = te6VarI.getRequest().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((me6) te6VarI.getRequest().d.get(i2)).C(te6VarI, j, j2);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final te6 i(CaptureRequest captureRequest) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i) == captureRequest) {
                return (te6) this.d.get(i);
            }
        }
        b61.l("Failed to find CaptureRequest ", captureRequest, " in ", arrayList);
        return null;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        bl7 bl7Var;
        Object next;
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        surface.getClass();
        Trace.beginSection("onCaptureBufferLost");
        dl7 dl7Var = (dl7) this.g.get(surface);
        ArrayMap arrayMap = this.h;
        if (dl7Var == null) {
            pe5 pe5Var = (pe5) arrayMap.get(surface);
            dl7 dl7Var2 = null;
            if (pe5Var != null) {
                int i = pe5Var.a;
                Iterator it = this.i.j0.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((bl7) next).a != i);
                bl7Var = (bl7) next;
            } else {
                bl7Var = null;
            }
            if (bl7Var != null) {
                fl0 fl0Var = bl7Var.j;
                if (fl0Var == null) {
                    dh3.T("stream");
                    throw null;
                }
                dl7Var2 = new dl7(fl0Var.a);
            }
            dl7Var = dl7Var2;
        }
        pe5 pe5Var2 = (pe5) arrayMap.get(surface);
        if (dl7Var == null) {
            StringBuilder sb = new StringBuilder("Unable to find the streamId for ");
            sb.append(surface);
            bt.l(sb, " on ", mm2.a(j));
            return;
        }
        if (pe5Var2 == null) {
            StringBuilder sb2 = new StringBuilder("Unable to find the outputId for ");
            sb2.append(surface);
            bt.l(sb2, " on ", mm2.a(j));
            return;
        }
        te6 te6VarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((me6) list.get(i2)).getClass();
            te6VarI.getClass();
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = te6VarI.getRequest().d.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((me6) te6VarI.getRequest().d.get(i3)).getClass();
        }
        Trace.endSection();
        Trace.beginSection("InvokeInternalListeners");
        int size3 = list.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ((me6) list.get(i4)).g(te6VarI, j, dl7Var.a, pe5Var2.a);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = te6VarI.getRequest().d.size();
        for (int i5 = 0; i5 < size4; i5++) {
            ((me6) te6VarI.getRequest().d.get(i5)).g(te6VarI, j, dl7Var.a, pe5Var2.a);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        totalCaptureResult.getClass();
        c(captureRequest, totalCaptureResult, totalCaptureResult.getFrameNumber());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        captureFailure.getClass();
        Trace.beginSection("onCaptureFailed");
        this.l.V(dn8.a);
        te6 te6VarI = i(captureRequest);
        b(te6VarI, captureFailure.getFrameNumber(), new gb(te6VarI, captureFailure));
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        captureResult.getClass();
        Trace.beginSection("onCaptureProgressed");
        long frameNumber = captureResult.getFrameNumber();
        ee eeVar = new ee(captureResult, this.a);
        te6 te6VarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((me6) list.get(i)).U(te6VarI, frameNumber, eeVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = te6VarI.getRequest().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((me6) te6VarI.getRequest().d.get(i2)).U(te6VarI, frameNumber, eeVar);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        cameraCaptureSession.getClass();
        f(i);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        cameraCaptureSession.getClass();
        g(i, j);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        h(captureRequest, j2, j);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onReadoutStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        Trace.beginSection("onReadoutStarted");
        te6 te6VarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((me6) list.get(i)).k(te6VarI, j2, j);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = te6VarI.getRequest().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((me6) te6VarI.getRequest().d.get(i2)).k(te6VarI, j2, j);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final String toString() {
        return "Camera2CaptureSequence-" + this.k;
    }
}

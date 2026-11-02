package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface gh0 extends bo8, AutoCloseable {
    boolean A0();

    Integer G(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    Integer L0(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback);

    Integer O0(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    Integer R0(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback);

    boolean b0();

    Surface getInputSurface();

    yh0 i0();

    boolean x0(List list);
}

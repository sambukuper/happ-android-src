package defpackage;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lm2 implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ eb9 a;

    public lm2(eb9 eb9Var) {
        this.a = eb9Var;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        eb9 eb9Var = this.a;
        int i2 = eb9Var.Y;
        if ((i2 & 1) != 0) {
            eb9.j(((SparseIntArray[]) eb9Var.Z)[0], frameMetrics.getMetric(8));
        }
        if ((i2 & 2) != 0) {
            eb9.j(((SparseIntArray[]) eb9Var.Z)[1], frameMetrics.getMetric(1));
        }
        if ((i2 & 4) != 0) {
            eb9.j(((SparseIntArray[]) eb9Var.Z)[2], frameMetrics.getMetric(3));
        }
        if ((i2 & 8) != 0) {
            eb9.j(((SparseIntArray[]) eb9Var.Z)[3], frameMetrics.getMetric(4));
        }
        if ((i2 & 16) != 0) {
            eb9.j(((SparseIntArray[]) eb9Var.Z)[4], frameMetrics.getMetric(5));
        }
        if ((i2 & 64) != 0) {
            eb9.j(((SparseIntArray[]) eb9Var.Z)[6], frameMetrics.getMetric(7));
        }
        if ((i2 & 32) != 0) {
            eb9.j(((SparseIntArray[]) eb9Var.Z)[5], frameMetrics.getMetric(6));
        }
        if ((i2 & 128) != 0) {
            eb9.j(((SparseIntArray[]) eb9Var.Z)[7], frameMetrics.getMetric(0));
        }
        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            eb9.j(((SparseIntArray[]) eb9Var.Z)[8], frameMetrics.getMetric(2));
        }
    }
}

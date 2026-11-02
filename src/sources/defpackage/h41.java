package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h41 implements i41 {
    public final Object a;
    public final View b;

    public h41(ContentCaptureSession contentCaptureSession, View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionB = om0.b(this.a);
            vz vzVarE = mn7.e(this.b);
            Objects.requireNonNull(vzVarE);
            contentCaptureSessionB.notifyViewsDisappeared(bt.b(vzVarE.a), new long[]{Long.MIN_VALUE});
        }
    }

    public final AutofillId b(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionB = om0.b(this.a);
        vz vzVarE = mn7.e(this.b);
        Objects.requireNonNull(vzVarE);
        return contentCaptureSessionB.newAutofillId(bt.b(vzVarE.a), j);
    }

    public final lr5 c(AutofillId autofillId, long j) {
        byte b = 29;
        if (Build.VERSION.SDK_INT >= 29) {
            return new lr5(om0.b(this.a).newVirtualViewStructure(autofillId, j), b);
        }
        return null;
    }

    public final void d(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            om0.b(this.a).notifyViewAppeared(viewStructure);
        }
    }

    public final void e(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            om0.b(this.a).notifyViewDisappeared(autofillId);
        }
    }

    public final void f(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            ((ContentCaptureSession) this.a).notifyViewTextChanged(autofillId, str);
        }
    }
}

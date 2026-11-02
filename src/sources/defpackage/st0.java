package defpackage;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.slider.Slider;
import io.sentry.android.core.c2;
import io.sentry.s5;
import io.sentry.v4;
import java.util.Map;
import java.util.concurrent.CancellationException;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.feature.excluded_routes.ExcludedRoutesActivity;
import su.happ.proxyutility.feature.ping.PingSettingsActivity;
import su.happ.proxyutility.feature.report.ReportActivity;
import su.happ.proxyutility.ui.FaqSettingsActivity;
import su.happ.proxyutility.ui.foundation.component.HappEditText;
import su.happ.proxyutility.ui.foundation.component.HappForwardField;
import su.happ.proxyutility.ui.foundation.component.HappInputField;
import su.happ.proxyutility.ui.foundation.component.HappSliderField;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;
import su.happ.proxyutility.ui.foundation.component.HappToggleField;
import su.happ.proxyutility.ui.widget.QROverlayView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class st0 implements View.OnClickListener {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ st0(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Exception {
        Object rj6Var;
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                wt0 wt0Var = (wt0) obj;
                EditText editText = wt0Var.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (view.hasFocus()) {
                    wt0Var.i.requestFocus();
                }
                if (text != null) {
                    text.clear();
                }
                wt0Var.p();
                return;
            case 1:
                ((yw1) obj).t();
                return;
            case 2:
                ExcludedRoutesActivity excludedRoutesActivity = (ExcludedRoutesActivity) obj;
                int i = ExcludedRoutesActivity.U0;
                m52 m52VarB = excludedRoutesActivity.B();
                ub ubVar = new ub(0, excludedRoutesActivity, ExcludedRoutesActivity.class, "showFailureSnackbar", "showFailureSnackbar()V", 0, (byte) 4);
                Object objE = m52VarB.f().e(((k52) m52VarB.d.X.getValue()).a, null);
                if (sj6.a(objE) != null) {
                    ubVar.invoke();
                    return;
                }
                int i2 = ExcludedRoutesActivity.U0;
                pu.Q(excludedRoutesActivity, y46.toast_success);
                v5 v5Var = excludedRoutesActivity.Q0;
                if (v5Var != null) {
                    v5Var.n0.setText(wl7.e0(_UrlKt.FRAGMENT_ENCODE_SET));
                    return;
                } else {
                    dh3.T("binding");
                    throw null;
                }
            case 3:
                FaqSettingsActivity faqSettingsActivity = (FaqSettingsActivity) obj;
                Map map = FaqSettingsActivity.R0;
                try {
                    ss8 ss8Var = ss8.a;
                    ss8.B(faqSettingsActivity, "https://www.happ.su/main/faq");
                    return;
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                    return;
                }
            case 4:
                ((HappForwardField) obj).h0.performClick();
                return;
            case 5:
                int i3 = HappForwardField.j0;
                ((dn2) obj).invoke();
                return;
            case 6:
                ((HappInputField) obj).g0.requestFocus();
                return;
            case 7:
                Slider slider = ((HappSliderField) obj).f0;
                if (slider.isEnabled()) {
                    slider.requestFocus();
                    return;
                }
                return;
            case 8:
                ((HappSpinnerField) obj).g0.performClick();
                return;
            case 9:
                SwitchCompat switchCompat = ((HappToggleField) obj).g0;
                if (switchCompat.isEnabled()) {
                    switchCompat.performClick();
                    return;
                }
                return;
            case 10:
                ((dr4) obj).Y();
                throw null;
            case 11:
                ni5 ni5Var = (ni5) obj;
                EditText editText2 = ni5Var.f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = ni5Var.f;
                boolean z = editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod);
                EditText editText4 = ni5Var.f;
                if (z) {
                    editText4.setTransformationMethod(null);
                } else {
                    editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    ni5Var.f.setSelection(selectionEnd);
                }
                ni5Var.p();
                return;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                d6 d6Var = ((PingSettingsActivity) obj).Q0;
                if (d6Var != null) {
                    ((HappEditText) d6Var.g0).requestFocus();
                    return;
                } else {
                    dh3.T("binding");
                    throw null;
                }
            case 13:
                int i4 = QROverlayView.s0;
                ((tw6) obj).invoke();
                return;
            case 14:
                int i5 = QROverlayView.s0;
                ((gn2) obj).B(Boolean.valueOf(!view.isSelected()));
                return;
            case 15:
                int i6 = QROverlayView.s0;
                ((tw6) obj).invoke();
                return;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                ReportActivity reportActivity = (ReportActivity) obj;
                int i7 = ReportActivity.S0;
                try {
                    rj6Var = v4.b().v(((ke6) ((le6) reportActivity.R0.getValue()).c.X.getValue()).b, s5.ERROR);
                    break;
                } catch (Throwable th2) {
                    if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                        throw th2;
                    }
                    rj6Var = new rj6(th2);
                }
                if (!(rj6Var instanceof rj6)) {
                    x79.h(reportActivity, y46.toast_success);
                    reportActivity.finish();
                }
                if (sj6.a(rj6Var) != null) {
                    x79.h(reportActivity, y46.toast_failure);
                    return;
                }
                return;
            case 17:
                ((aw7) obj).u.f0.performClick();
                return;
            default:
                ((c2) obj).cancel();
                return;
        }
    }
}

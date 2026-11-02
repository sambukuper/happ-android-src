package su.happ.proxyutility.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ListPopupWindow;
import android.widget.Spinner;
import defpackage.x56;
import java.lang.reflect.Field;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lsu/happ/proxyutility/ui/widget/CustomSpinner;", "Landroid/widget/Spinner;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "position", "Ldn8;", "setSelection", "(I)V", "Landroid/widget/AdapterView$OnItemSelectedListener;", "listener", "setOnItemSelectedListenerForAdapter", "(Landroid/widget/AdapterView$OnItemSelectedListener;)V", "setOnItemSelectedListener", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class CustomSpinner extends Spinner {
    public AdapterView.OnItemSelectedListener f0;
    public AdapterView.OnItemSelectedListener g0;
    public boolean h0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        setPopupBackgroundResource(q36.bg_spinner_item_popup);
        setFocusable(true);
        setClickable(true);
        setFocusableInTouchMode(ue3.y(context));
        int[] iArr = x56.CustomSpinner;
        iArr.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(x56.CustomSpinner_popupHeight, 0.0f);
        Float fValueOf = dimension == 0.0f ? null : Float.valueOf(dimension);
        if (fValueOf != null) {
            float fFloatValue = fValueOf.floatValue();
            try {
                Field declaredField = Spinner.class.getDeclaredField("mPopup");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                obj.getClass();
                ((ListPopupWindow) obj).setHeight((int) fFloatValue);
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (this.h0 && z) {
            this.h0 = false;
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f0;
            if (onItemSelectedListener != null) {
                onItemSelectedListener.onNothingSelected(this);
            }
        }
        super.onWindowFocusChanged(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        CustomSpinner customSpinner;
        this.h0 = true;
        AdapterView.OnItemSelectedListener onItemSelectedListener = this.f0;
        if (onItemSelectedListener != null) {
            customSpinner = this;
            onItemSelectedListener.onItemSelected(customSpinner, getSelectedView(), -1, getSelectedItemId());
        } else {
            customSpinner = this;
        }
        AdapterView.OnItemSelectedListener onItemSelectedListener2 = customSpinner.g0;
        if (onItemSelectedListener2 != null) {
            onItemSelectedListener2.onItemSelected(customSpinner, customSpinner.getSelectedView(), -1, customSpinner.getSelectedItemId());
        }
        return super.performClick();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AdapterView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener listener) {
        this.f0 = listener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOnItemSelectedListenerForAdapter(AdapterView.OnItemSelectedListener listener) {
        this.g0 = listener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AbsSpinner, android.widget.AdapterView
    public void setSelection(int position) {
        AdapterView.OnItemSelectedListener onItemSelectedListener;
        super.setSelection(position);
        if (position != getSelectedItemPosition() || (onItemSelectedListener = this.f0) == null) {
            return;
        }
        onItemSelectedListener.onItemSelected(this, getSelectedView(), position, getSelectedItemId());
    }
}

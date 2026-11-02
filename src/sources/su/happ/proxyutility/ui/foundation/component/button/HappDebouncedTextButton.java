package su.happ.proxyutility.ui.foundation.component.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import defpackage.x56;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.foundation.component.HappTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lsu/happ/proxyutility/ui/foundation/component/button/HappDebouncedTextButton;", "Lcom/google/android/material/button/MaterialButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Y0", "I", "getDebounceTimeout", "()I", "setDebounceTimeout", "(I)V", "debounceTimeout", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class HappDebouncedTextButton extends MaterialButton {

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    public int debounceTimeout;
    public long Z0;
    public aj2 a1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HappDebouncedTextButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.debounceTimeout = 2000;
        this.a1 = aj2.Y;
        int[] iArr = x56.HappDebouncedTextButton;
        iArr.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.debounceTimeout = typedArrayObtainStyledAttributes.getInteger(x56.HappDebouncedTextButton_debounceTimeout, 2000);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getDebounceTimeout() {
        return this.debounceTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: su.happ.proxyutility.ui.foundation.component.button.HappDebouncedTextButton */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onDraw(Canvas canvas) {
        int i;
        canvas.getClass();
        super/*android.view.View*/.onDraw(canvas);
        aj2 aj2Var = this.a1;
        vz7 vz7Var = HappTextView.o0;
        if (aj2Var != HappTextView.p0) {
            float f = d28.f(getTextSize(), getResources().getDisplayMetrics());
            int iOrdinal = this.a1.ordinal();
            int i2 = -2;
            if (iOrdinal == 0) {
                i = -2;
            } else if (iOrdinal == 1) {
                i = 0;
            } else {
                if (iOrdinal != 2) {
                    b61.c();
                    return;
                }
                i = 2;
            }
            float f2 = f - i;
            int iOrdinal2 = HappTextView.p0.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    i2 = 0;
                } else {
                    if (iOrdinal2 != 2) {
                        b61.c();
                        return;
                    }
                    i2 = 2;
                }
            }
            setTextSize(f2 + i2);
            this.a1 = HappTextView.p0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean performClick() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.Z0 < this.debounceTimeout) {
            return false;
        }
        this.Z0 = jCurrentTimeMillis;
        return super.performClick();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setDebounceTimeout(int i) {
        this.debounceTimeout = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HappDebouncedTextButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }
}

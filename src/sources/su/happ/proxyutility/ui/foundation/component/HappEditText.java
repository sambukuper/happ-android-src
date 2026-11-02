package su.happ.proxyutility.ui.foundation.component;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsu/happ/proxyutility/ui/foundation/component/HappEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public class HappEditText extends AppCompatEditText {
    public aj2 m0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: su.happ.proxyutility.ui.foundation.component.HappEditText */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HappEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.m0 = aj2.Y;
        setFocusableInTouchMode(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: su.happ.proxyutility.ui.foundation.component.HappEditText */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onDraw(Canvas canvas) {
        int i;
        canvas.getClass();
        super/*android.view.View*/.onDraw(canvas);
        aj2 aj2Var = this.m0;
        vz7 vz7Var = HappTextView.o0;
        if (aj2Var != HappTextView.p0) {
            float f = d28.f(getTextSize(), getResources().getDisplayMetrics());
            int iOrdinal = this.m0.ordinal();
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
            this.m0 = HappTextView.p0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HappEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }
}

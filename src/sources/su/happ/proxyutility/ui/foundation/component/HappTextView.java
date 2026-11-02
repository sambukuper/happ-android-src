package su.happ.proxyutility.ui.foundation.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.x56;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lsu/happ/proxyutility/ui/foundation/component/HappTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "size", "Ldn8;", "setTextSizeSp", "(F)V", "k32", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public class HappTextView extends AppCompatTextView {
    public static final vz7 o0 = new vz7(new tv2((byte) 17));
    public static aj2 p0 = aj2.Y;
    public aj2 n0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: su.happ.proxyutility.ui.foundation.component.HappTextView */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HappTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.n0 = aj2.Y;
        if (attributeSet == null) {
            setTextAlignment(5);
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x56.HappTextView);
        typedArrayObtainStyledAttributes.getClass();
        try {
            int i2 = typedArrayObtainStyledAttributes.getInt(x56.HappTextView_android_textAlignment, -1);
            int i3 = typedArrayObtainStyledAttributes.getInt(x56.HappTextView_android_gravity, -1);
            if (i2 == -1 && i3 == -1) {
                setTextAlignment(5);
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: su.happ.proxyutility.ui.foundation.component.HappTextView */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onDraw(Canvas canvas) {
        int i;
        canvas.getClass();
        super/*android.view.View*/.onDraw(canvas);
        if (this.n0 != p0) {
            float f = d28.f(getTextSize(), getResources().getDisplayMetrics());
            int iOrdinal = this.n0.ordinal();
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
            int iOrdinal2 = p0.ordinal();
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
            this.n0 = p0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: su.happ.proxyutility.ui.foundation.component.HappTextView */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextSizeSp(float size) {
        int i;
        int iOrdinal = p0.ordinal();
        if (iOrdinal == 0) {
            i = -2;
        } else if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                b61.c();
                return;
            }
        } else {
            i = 0;
        }
        setTextSize(size + i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HappTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }
}

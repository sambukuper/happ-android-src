package su.happ.proxyutility.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import defpackage.e46;
import defpackage.ln7;
import defpackage.t46;
import defpackage.v26;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0012¨\u0006\u0019"}, d2 = {"Lsu/happ/proxyutility/ui/widget/QROverlayView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "ratio", "Ldn8;", "setHorizontalFrameRatio", "(F)V", "", "on", "setTorchState", "(Z)V", "value", "r0", "Z", "isHighlighted", "()Z", "setHighlighted", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class QROverlayView extends FrameLayout {
    public static final /* synthetic */ int s0 = 0;
    public final yr6 f0;
    public final int g0;
    public final Paint h0;
    public final Paint i0;
    public final Paint j0;
    public final float k0;
    public final float l0;
    public final RectF m0;
    public final RectF n0;
    public Bitmap o0;
    public Canvas p0;
    public float q0;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public boolean isHighlighted;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QROverlayView(Context context, AttributeSet attributeSet, int i) {
        MaterialButton materialButtonB;
        MaterialButton materialButtonB2;
        super(context, attributeSet, i);
        context.getClass();
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(t46.widget_qr_overlay, (ViewGroup) this, false);
        addView(constraintLayoutInflate);
        int i2 = e46.btn_close;
        AppCompatImageButton appCompatImageButtonB = ln7.b(constraintLayoutInflate, i2);
        if (appCompatImageButtonB == null || (materialButtonB = ln7.b(constraintLayoutInflate, (i2 = e46.btn_select_photo))) == null || (materialButtonB2 = ln7.b(constraintLayoutInflate, (i2 = e46.btn_torch))) == null) {
            b61.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i2)));
            throw null;
        }
        this.f0 = new yr6(constraintLayoutInflate, appCompatImageButtonB, materialButtonB, materialButtonB2, (byte) 12);
        this.g0 = qw0.d(-16777216, nr4.N(178.5d));
        Paint paint = new Paint();
        paint.setAlpha(nr4.N(178.5d));
        this.h0 = paint;
        this.i0 = new Paint(1);
        Paint paint2 = new Paint(1);
        paint2.setColor(0);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.j0 = paint2;
        this.k0 = TypedValue.applyDimension(1, 12.0f, getResources().getDisplayMetrics());
        this.l0 = TypedValue.applyDimension(1, 11.0f, getResources().getDisplayMetrics());
        this.m0 = new RectF();
        this.n0 = new RectF();
        this.q0 = 1.0f;
        setWillNotDraw(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int iMin = Math.min(width, height);
        float f = this.q0;
        float f2 = iMin;
        float f3 = f2 - ((f > 1.0f ? 0.125f * ((1.0f / f) * 1.5f) : 0.125f) * f2);
        float fApplyDimension = TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics());
        float f4 = width;
        float f5 = height;
        float f6 = f3 / this.q0;
        float f7 = f6 + f5;
        RectF rectF = this.m0;
        rectF.set(f4 - f3, f5 - f6, f4 + f3, f7);
        this.n0.set(rectF.left + fApplyDimension, rectF.top + fApplyDimension, rectF.right - fApplyDimension, rectF.bottom - fApplyDimension);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        Context context = getContext();
        context.getClass();
        int iQ = os4.q(context, v26.colorQrFrame);
        Paint paint = this.i0;
        paint.setColor(iQ);
        Canvas canvas2 = this.p0;
        if (canvas2 != null) {
            canvas2.drawColor(this.g0);
        }
        Canvas canvas3 = this.p0;
        if (canvas3 != null) {
            RectF rectF = this.m0;
            float f = this.k0;
            canvas3.drawRoundRect(rectF, f, f, paint);
        }
        Canvas canvas4 = this.p0;
        if (canvas4 != null) {
            float f2 = this.l0;
            canvas4.drawRoundRect(this.n0, f2, f2, this.j0);
        }
        Bitmap bitmap = this.o0;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.h0);
        }
        super.onDraw(canvas);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.o0 != null || getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        this.p0 = new Canvas(bitmapCreateBitmap);
        this.o0 = bitmapCreateBitmap;
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setHighlighted(boolean z) {
        if (this.isHighlighted != z) {
            this.isHighlighted = z;
            invalidate();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setHorizontalFrameRatio(float ratio) {
        if (ratio > 1.0f) {
            this.q0 = ratio;
            a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setTorchState(boolean on) {
        ((MaterialButton) this.f0.g0).setSelected(on);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QROverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }
}

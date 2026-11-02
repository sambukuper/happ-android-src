package su.happ.proxyutility.feature.stories;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import defpackage.ld6;
import defpackage.ok7;
import defpackage.pk7;
import defpackage.qk7;
import defpackage.t17;
import defpackage.tk7;
import defpackage.uk7;
import defpackage.v26;
import defpackage.wk2;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR#\u0010\u0014\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lsu/happ/proxyutility/feature/stories/StoryProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "index", "Ldn8;", "setCurrentStory", "(I)V", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "l0", "Lg44;", "getAnimator", "()Landroid/animation/ValueAnimator;", "animator", "lr5", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class StoryProgressView extends View {
    public static final /* synthetic */ int p0 = 0;
    public int f0;
    public boolean g0;
    public int h0;
    public float i0;
    public float j0;
    public lr5 k0;
    public final vz7 l0;
    public final m51 m0;
    public final Paint n0;
    public final Paint o0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.l0 = new vz7(new hr5(this, (byte) 24));
        ow7 ow7VarB = pw7.b();
        nf1 nf1Var = tp1.a;
        this.m0 = gv3.c(g33.K(ow7VarB, dm4.a));
        Paint paint = new Paint();
        paint.setColor(os4.q(context, v26.storiesForeground));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics()));
        this.n0 = paint;
        Paint paint2 = new Paint();
        paint2.setColor(os4.q(context, v26.storiesBackground));
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics()));
        this.o0 = paint2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final ValueAnimator getAnimator() {
        return (ValueAnimator) this.l0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        int i = this.h0;
        if (i < this.f0 - 1) {
            setCurrentStory(i + 1);
            return;
        }
        lr5 lr5Var = this.k0;
        if (lr5Var != null) {
            ((ok7) lr5Var.Y).R(false, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        getAnimator().pause();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        getAnimator().resume();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(s51 s51Var) {
        uk7 uk7Var;
        Object value;
        pk7 pk7Var;
        if (s51Var instanceof uk7) {
            uk7Var = (uk7) s51Var;
            int i = uk7Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                uk7Var.h0 = i - Integer.MIN_VALUE;
            } else {
                uk7Var = new uk7(this, s51Var);
            }
        } else {
            uk7Var = new uk7(this, s51Var);
        }
        Object obj = uk7Var.f0;
        int i2 = uk7Var.h0;
        c71 c71Var = dn8.a;
        q51 q51Var = null;
        if (i2 == 0) {
            w39.n0(obj);
            lr5 lr5Var = this.k0;
            if (lr5Var != null) {
                int i3 = this.h0;
                uk7Var.h0 = 1;
                ok7 ok7Var = (ok7) lr5Var.Y;
                wk2 wk2Var = ok7Var.t1;
                if (wk2Var == null) {
                    dh3.T("binding");
                    throw null;
                }
                wk2Var.r0.setCurrentItem(i3);
                qk7 qk7VarY = ok7Var.Y();
                ld6 ld6Var = (ld6) ((pk7) qk7VarY.d.X.getValue()).a.get(i3);
                oh7 oh7Var = qk7VarY.c;
                oh7Var.getClass();
                do {
                    value = oh7Var.getValue();
                    pk7Var = (pk7) value;
                    pk7Var.getClass();
                } while (!oh7Var.k(value, pk7.a(pk7Var, null, false, 0, ld6Var.Y.c().Z, 7)));
                jm4.Q(zw8.a(qk7VarY), (u61) null, new t17(qk7VarY, ld6Var, q51Var, (byte) 8), 3);
                c71 c71Var2 = c71.X;
                if (c71Var == c71Var2) {
                    return c71Var2;
                }
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        getAnimator().start();
        return c71Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        float fApplyDimension = TypedValue.applyDimension(1, 3.0f, getResources().getDisplayMetrics());
        float f = this.j0;
        float f2 = this.f0;
        float f3 = (f - (fApplyDimension * f2)) / f2;
        float fApplyDimension2 = TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
        float fApplyDimension3 = TypedValue.applyDimension(1, 3.0f, getResources().getDisplayMetrics());
        jf3 it = x97.a0(0, this.f0).iterator();
        while (true) {
            jf3 jf3Var = it;
            if (!jf3Var.Z) {
                break;
            }
            float fNextInt = jf3Var.nextInt();
            float f4 = (fNextInt * fApplyDimension) + (fNextInt * f3);
            canvas.drawRoundRect(f4, 0.0f, f4 + f3, fApplyDimension2, fApplyDimension3, fApplyDimension3, this.o0);
        }
        jf3 it2 = x97.a0(0, this.h0).iterator();
        while (true) {
            jf3 jf3Var2 = it2;
            boolean z = jf3Var2.Z;
            Paint paint = this.n0;
            if (!z) {
                float f5 = this.h0;
                float f6 = (f5 * fApplyDimension) + (f5 * f3);
                canvas.drawRoundRect(f6, 0.0f, (f3 * this.i0) + f6, fApplyDimension2, fApplyDimension3, fApplyDimension3, paint);
                return;
            }
            float fNextInt2 = jf3Var2.nextInt();
            float f7 = (fNextInt2 * fApplyDimension) + (fNextInt2 * f3);
            canvas.drawRoundRect(f7, 0.0f, f7 + f3, fApplyDimension2, fApplyDimension3, fApplyDimension3, paint);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.j0 = getMeasuredWidth();
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setCurrentStory(int index) {
        if (index < 0 || index >= this.f0) {
            em7.c(pc6.j(index, "Illegal page index: "));
            return;
        }
        getAnimator().cancel();
        this.h0 = index;
        this.i0 = 0.0f;
        jm4.Q(this.m0, (u61) null, new tk7(this, null, (byte) 1), 3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }
}

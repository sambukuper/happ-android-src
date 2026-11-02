package androidx.camera.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import defpackage.aj0;
import defpackage.b98;
import defpackage.bt;
import defpackage.cw8;
import defpackage.ef5;
import defpackage.hd8;
import defpackage.hi5;
import defpackage.ho0;
import defpackage.hy7;
import defpackage.iv4;
import defpackage.kp5;
import defpackage.kt5;
import defpackage.px8;
import defpackage.qc4;
import defpackage.rt5;
import defpackage.s08;
import defpackage.s18;
import defpackage.s65;
import defpackage.st5;
import defpackage.th0;
import defpackage.tm1;
import defpackage.tt5;
import defpackage.u52;
import defpackage.ut5;
import defpackage.v53;
import defpackage.vp1;
import defpackage.vt5;
import defpackage.y45;
import defpackage.y56;
import defpackage.yz4;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class PreviewView extends FrameLayout {
    public static final /* synthetic */ int r0 = 0;
    public st5 f0;
    public s65 g0;
    public final ScreenFlashView h0;
    public final rt5 i0;
    public boolean j0;
    public final yz4 k0;
    public final AtomicReference l0;
    public final vt5 m0;
    public aj0 n0;
    public final vp1 o0;
    public final ho0 p0;
    public final y45 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f0 = st5.PERFORMANCE;
        rt5 rt5Var = new rt5();
        rt5Var.h = tt5.FILL_CENTER;
        this.i0 = rt5Var;
        this.j0 = true;
        this.k0 = new yz4(ut5.X);
        this.l0 = new AtomicReference();
        this.m0 = new vt5(rt5Var);
        this.o0 = new vp1(this, (byte) 1);
        this.p0 = new ho0(this, (byte) 1);
        this.q0 = new y45(this);
        s08.b();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, y56.PreviewView, i, 0);
        cw8.m(this, context, y56.PreviewView, attributeSet, typedArrayObtainStyledAttributes, i);
        try {
            int integer = typedArrayObtainStyledAttributes.getInteger(y56.PreviewView_scaleType, rt5Var.h.X);
            for (tt5 tt5Var : tt5.values()) {
                if (tt5Var.X == integer) {
                    setScaleType(tt5Var);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(y56.PreviewView_implementationMode, 0);
                    for (st5 st5Var : st5.values()) {
                        if (st5Var.X == integer2) {
                            setImplementationMode(st5Var);
                            typedArrayObtainStyledAttributes.recycle();
                            new s18(context, new kp5((byte) 3));
                            if (getBackground() == null) {
                                setBackgroundColor(getContext().getColor(R.color.black));
                            }
                            ScreenFlashView screenFlashView = new ScreenFlashView(context, null);
                            this.h0 = screenFlashView;
                            screenFlashView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean b(hy7 hy7Var, st5 st5Var) {
        boolean zEquals = hy7Var.d.s().l().equals("androidx.camera.camera2.legacy");
        boolean z = (tm1.a.b(SurfaceViewStretchedQuirk.class) == null && tm1.a.b(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (Build.VERSION.SDK_INT > 24 && !zEquals && !z) {
            int iOrdinal = st5Var.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal != 1) {
                u52.j(st5Var, "Invalid implementation mode: ");
                return false;
            }
        }
        return true;
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getSystemService("display");
    }

    private v53 getScreenFlashInternal() {
        return this.h0.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    bt.p(getScaleType(), "Unexpected scale type: ");
                    return 0;
                }
            }
        }
        return i;
    }

    private void setScreenFlashUiInfo(v53 v53Var) {
        hi5.z0("PreviewView");
    }

    public final void a() {
        Rect rect;
        Display defaultDisplay;
        aj0 aj0Var;
        s08.b();
        if (this.g0 != null) {
            if (this.j0 && (defaultDisplay = getDefaultDisplay()) != null && (aj0Var = this.n0) != null) {
                rt5 rt5Var = this.i0;
                int iN = aj0Var.n(defaultDisplay.getRotation());
                int rotation = defaultDisplay.getRotation();
                if (rt5Var.g) {
                    rt5Var.c = iN;
                    rt5Var.e = rotation;
                }
            }
            this.g0.h();
        }
        vt5 vt5Var = this.m0;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        vt5Var.getClass();
        s08.b();
        synchronized (vt5Var) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = vt5Var.b) != null) {
                    vt5Var.a.a(size, layoutDirection, rect);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Bitmap getBitmap() {
        s08.b();
        s65 s65Var = this.g0;
        if (s65Var == null) {
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) s65Var.c;
        Bitmap bitmapD = s65Var.d();
        if (bitmapD == null) {
            return null;
        }
        rt5 rt5Var = (rt5) s65Var.d;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        if (!rt5Var.f()) {
            return bitmapD;
        }
        Matrix matrixD = rt5Var.d();
        RectF rectFE = rt5Var.e(layoutDirection, size);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapD.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixD);
        matrix.postScale(rectFE.width() / rt5Var.a.getWidth(), rectFE.height() / rt5Var.a.getHeight());
        matrix.postTranslate(rectFE.left, rectFE.top);
        canvas.drawBitmap(bitmapD, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    public th0 getController() {
        s08.b();
        return null;
    }

    public Display getDefaultDisplay() {
        if (getDisplay() == null) {
            return null;
        }
        Display display = getDisplayManager().getDisplay(0);
        return display != null ? display : getDisplay();
    }

    public st5 getImplementationMode() {
        s08.b();
        return this.f0;
    }

    public iv4 getMeteringPointFactory() {
        s08.b();
        return this.m0;
    }

    public ef5 getOutputTransform() {
        Matrix matrixC;
        rt5 rt5Var = this.i0;
        s08.b();
        try {
            matrixC = rt5Var.c(getLayoutDirection(), new Size(getWidth(), getHeight()));
        } catch (IllegalStateException unused) {
            matrixC = null;
        }
        Rect rect = rt5Var.b;
        if (matrixC == null || rect == null) {
            hi5.z0("PreviewView");
            return null;
        }
        RectF rectF = hd8.a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(hd8.a, rectF2, Matrix.ScaleToFit.FILL);
        matrixC.preConcat(matrix);
        if (this.g0 instanceof b98) {
            matrixC.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            hi5.z0("PreviewView");
        }
        new Size(rect.width(), rect.height());
        return new ef5();
    }

    public qc4 getPreviewStreamState() {
        return this.k0;
    }

    public tt5 getScaleType() {
        s08.b();
        return this.i0.h;
    }

    public v53 getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        s08.b();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        rt5 rt5Var = this.i0;
        if (!rt5Var.f()) {
            return null;
        }
        Matrix matrix = new Matrix(rt5Var.d);
        matrix.postConcat(rt5Var.c(layoutDirection, size));
        return matrix;
    }

    public kt5 getSurfaceProvider() {
        s08.b();
        return this.q0;
    }

    public px8 getViewPort() {
        s08.b();
        Display defaultDisplay = getDefaultDisplay();
        if (defaultDisplay == null) {
            return null;
        }
        defaultDisplay.getRotation();
        s08.b();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        new Rational(getWidth(), getHeight());
        getViewPortScaleType();
        getLayoutDirection();
        return new px8();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        DisplayManager displayManager;
        super.onAttachedToWindow();
        if (!isInEditMode() && (displayManager = getDisplayManager()) != null) {
            displayManager.registerDisplayListener(this.o0, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.p0);
        s65 s65Var = this.g0;
        if (s65Var != null) {
            s65Var.e();
        }
        s08.b();
        getViewPort();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        DisplayManager displayManager;
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.p0);
        s65 s65Var = this.g0;
        if (s65Var != null) {
            s65Var.f();
        }
        if (isInEditMode() || (displayManager = getDisplayManager()) == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.o0);
    }

    public void setController(th0 th0Var) {
        s08.b();
        s08.b();
        getViewPort();
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(st5 st5Var) {
        s08.b();
        this.f0 = st5Var;
    }

    public void setScaleType(tt5 tt5Var) {
        s08.b();
        this.i0.h = tt5Var;
        a();
        s08.b();
        getViewPort();
    }

    public void setScreenFlashOverlayColor(int i) {
        this.h0.setBackgroundColor(i);
    }

    public void setScreenFlashWindow(Window window) {
        s08.b();
        this.h0.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}

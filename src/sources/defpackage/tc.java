package defpackage;

import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.LongSparseArray;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.View;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tc {
    public static int[] a(NetworkRequest networkRequest) {
        networkRequest.getClass();
        int[] capabilities = networkRequest.getCapabilities();
        capabilities.getClass();
        return capabilities;
    }

    public static EdgeEffect b(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static RenderEffect c(float f, float f2) {
        return (f == 0.0f && f2 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f, f2, x97.Y(0));
    }

    public static void d(vc vcVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        a17 a17Var;
        y07 y07Var;
        gn2 gn2Var;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (a17Var = (a17) vcVar.c().b((int) jKeyAt)) != null && (y07Var = a17Var.a) != null) {
                Object objG = y07Var.d.X.g(s07.l);
                if (objG == null) {
                    objG = null;
                }
                q3 q3Var = (q3) objG;
                if (q3Var != null && (gn2Var = (gn2) q3Var.b) != null) {
                }
            }
        }
    }

    public static void e(Canvas canvas, int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    public static void f(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public static void g(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    public static gy h(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayList.add(new fy(audioProfile.getMediaType(), audioProfile.getCodec(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayList2 = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayList2.add(new hy(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), 8, 0, 0));
        }
        return gy.a(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    public static EncoderProfiles i(int i, String str) {
        return CamcorderProfile.getAll(str, i);
    }

    public static Path j(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static float k(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static Shader.TileMode l() {
        return Shader.TileMode.DECAL;
    }

    public static final Map m(TotalCaptureResult totalCaptureResult) {
        return totalCaptureResult.getPhysicalCameraTotalResults();
    }

    public static im6 n(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        bt.q(pc6.j(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new im6(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static int o(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        int i = SystemJobService.g0;
        switch (stopReason) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    public static final List p(CameraExtensionCharacteristics cameraExtensionCharacteristics) {
        List<Integer> supportedExtensions = cameraExtensionCharacteristics.getSupportedExtensions();
        supportedExtensions.getClass();
        return supportedExtensions;
    }

    public static boolean q(String str) {
        String str2 = Build.MANUFACTURER;
        str2.getClass();
        if (str2.equalsIgnoreCase(str)) {
            return true;
        }
        String str3 = Build.BRAND;
        str3.getClass();
        return str3.equalsIgnoreCase(str);
    }

    public static boolean r() {
        if (Build.VERSION.SDK_INT >= 31 && "Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER)) {
            return true;
        }
        String str = Build.HARDWARE;
        str.getClass();
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        if (mm7.Z(lowerCase, false, "ums")) {
            return true;
        }
        if (q("Itel")) {
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            if (mm7.Z(lowerCase2, false, "sp")) {
                return true;
            }
        }
        return false;
    }

    public static Typeface s(Configuration configuration, Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT < 31 || (i = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, z91.m(typeface.getWeight() + configuration.fontWeightAdjustment, 1, XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax), typeface.isItalic());
    }

    public static final InputConfiguration t(String str, List list) {
        list.getClass();
        str.getClass();
        if (list.isEmpty()) {
            bt.i("Call to create InputConfiguration but list of InputConfigData is empty.");
            return null;
        }
        if (list.size() == 1) {
            hd3 hd3Var = (hd3) wv0.r0(list);
            return new InputConfiguration(hd3Var.a, hd3Var.b, hd3Var.c);
        }
        ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hd3 hd3Var2 = (hd3) it.next();
            rc.e();
            arrayList.add(rc.c(hd3Var2.a, hd3Var2.b, str));
        }
        p61.u();
        return rc.b(((hd3) wv0.r0(list)).c, arrayList);
    }

    public static void u(vc vcVar, long[] jArr, Consumer consumer) {
        y07 y07Var;
        for (long j : jArr) {
            a17 a17Var = (a17) vcVar.c().b((int) j);
            if (a17Var != null && (y07Var = a17Var.a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(vcVar.X.getAutofillId(), y07Var.f);
                Object objG = y07Var.d.X.g(c17.C);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new ql(tb4.a(list, "\n", null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static float v(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static void w(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void x(RenderNode renderNode, o60 o60Var) {
        renderNode.setRenderEffect(o60Var != null ? o60Var.a() : null);
    }

    public static void y(View view, o60 o60Var) {
        view.setRenderEffect(o60Var != null ? o60Var.a() : null);
    }

    public static int[] z(NetworkRequest networkRequest) {
        networkRequest.getClass();
        int[] transportTypes = networkRequest.getTransportTypes();
        transportTypes.getClass();
        return transportTypes;
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import com.blacksquircle.ui.editorkit.widget.internal.SyntaxHighlightEditText;
import io.sentry.android.core.d;
import io.sentry.android.replay.c0;
import io.sentry.android.replay.d0;
import io.sentry.android.replay.screenshot.b;
import io.sentry.android.replay.util.f;
import io.sentry.android.replay.video.a;
import io.sentry.s5;
import io.sentry.s6;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.http2.Http2;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hg extends g24 implements dn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hg(Object obj, byte b) {
        super(0);
        this.Y = b;
        this.Z = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [d02, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.Y;
        Object arrayList = d02.X;
        dn8 dn8Var = dn8.a;
        Object obj = this.Z;
        switch (b) {
            case 0:
                z68.W((ig) obj);
                return dn8Var;
            case 1:
                ((y05) obj).setValue(Boolean.FALSE);
                return dn8Var;
            case 2:
                ce8 ce8Var = (ce8) obj;
                Object objC = ce8Var.c();
                r12 r12Var = r12.Z;
                return Boolean.valueOf(objC == r12Var && ce8Var.d.getValue() == r12Var);
            case 3:
                return (List) obj;
            case 4:
                try {
                    return (List) ((dn2) obj).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return arrayList;
                }
            case 5:
                SyntaxHighlightEditText syntaxHighlightEditText = (SyntaxHighlightEditText) obj;
                if (syntaxHighlightEditText.getLanguage() != null) {
                    if (k42.X == null) {
                        k42.X = new k42();
                    }
                    n88 structure = syntaxHighlightEditText.getStructure();
                    structure.getClass();
                    String string = structure.a.toString();
                    arrayList = new ArrayList();
                    StringReader stringReader = new StringReader(string);
                    jp3 jp3Var = new jp3();
                    jp3Var.c = new char[Http2.INITIAL_MAX_FRAME_SIZE];
                    jp3Var.i = false;
                    jp3Var.a = stringReader;
                    while (true) {
                        try {
                            int iOrdinal = jp3Var.a().ordinal();
                            if (iOrdinal != 17) {
                                switch (iOrdinal) {
                                    case 0:
                                        arrayList.add(new xz7(lb8.X, (int) jp3Var.j, jp3Var.b()));
                                        break;
                                    case 1:
                                    case 2:
                                    case 3:
                                        arrayList.add(new xz7(lb8.Z, (int) jp3Var.j, jp3Var.b()));
                                        break;
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                        arrayList.add(new xz7(lb8.Y, (int) jp3Var.j, jp3Var.b()));
                                        break;
                                    case 10:
                                    case 11:
                                        arrayList.add(new xz7(lb8.f0, (int) jp3Var.j, jp3Var.b()));
                                        break;
                                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                                    case 13:
                                        arrayList.add(new xz7(lb8.g0, (int) jp3Var.j, jp3Var.b()));
                                        break;
                                }
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
                return arrayList;
            case 6:
                ((c0) obj).f0.set(true);
                return dn8Var;
            case 7:
                Matrix matrix = new Matrix();
                d0 d0Var = ((b) obj).d;
                matrix.preScale(d0Var.c, d0Var.d);
                return matrix;
            case 8:
                return new Canvas((Bitmap) ((f) obj).X.getValue());
            default:
                d dVar = (d) obj;
                a aVar = (a) dVar.b;
                s6 s6Var = (s6) dVar.a;
                String str = aVar.f;
                int iIntValue = aVar.e;
                try {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodec) dVar.c).getCodecInfo().getCapabilitiesForType(str).getVideoCapabilities();
                    if (videoCapabilities != null && !videoCapabilities.getBitrateRange().contains(Integer.valueOf(iIntValue))) {
                        s6Var.getLogger().h(s5.DEBUG, "Encoder doesn't support the provided bitRate: " + iIntValue + ", the value will be clamped to the closest one", new Object[0]);
                        Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(iIntValue));
                        objClamp.getClass();
                        iIntValue = ((Number) objClamp).intValue();
                    }
                    break;
                } catch (Throwable th2) {
                    s6Var.getLogger().e(s5.DEBUG, "Could not retrieve MediaCodec info", th2);
                }
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, aVar.b, aVar.c);
                mediaFormatCreateVideoFormat.getClass();
                mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
                mediaFormatCreateVideoFormat.setInteger("bitrate", iIntValue);
                mediaFormatCreateVideoFormat.setFloat("frame-rate", aVar.d);
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
                return mediaFormatCreateVideoFormat;
        }
    }
}

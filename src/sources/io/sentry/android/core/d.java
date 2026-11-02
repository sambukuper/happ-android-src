package io.sentry.android.core;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import android.os.Handler;
import android.util.SparseIntArray;
import android.view.Surface;
import androidx.core.app.FrameMetricsAggregator;
import defpackage.fm7;
import defpackage.hg;
import defpackage.ie2;
import defpackage.j78;
import defpackage.kp5;
import defpackage.oi0;
import defpackage.pc6;
import defpackage.w74;
import defpackage.x97;
import io.sentry.s5;
import io.sentry.s6;
import java.nio.ByteBuffer;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;

    public d(s6 s6Var, io.sentry.android.replay.video.a aVar) {
        s6Var.getClass();
        this.a = s6Var;
        this.b = aVar;
        io.sentry.android.replay.video.c cVar = io.sentry.android.replay.video.c.Y;
        w74 w74Var = w74.Y;
        MediaCodec mediaCodecCreateByCodecName = ((Boolean) x97.P(w74Var, cVar).getValue()).booleanValue() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(aVar.f);
        mediaCodecCreateByCodecName.getClass();
        this.c = mediaCodecCreateByCodecName;
        this.d = x97.P(w74Var, new hg(this, (byte) 9));
        this.e = new MediaCodec.BufferInfo();
        String absolutePath = aVar.a.getAbsolutePath();
        absolutePath.getClass();
        this.f = new io.sentry.android.replay.video.b(absolutePath, aVar.d);
    }

    public void a(Activity activity) {
        io.sentry.util.a aVar = (io.sentry.util.a) this.g;
        aVar.g();
        try {
            if (!e()) {
                aVar.close();
                return;
            }
            g(new b(this, activity, (byte) 0), "FrameMetricsAggregator.add");
            c cVarB = b();
            if (cVarB != null) {
                ((WeakHashMap) this.e).put(activity, cVarB);
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public c b() {
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        if (!e() || !((Boolean) ((io.sentry.util.g) this.b).a()).booleanValue()) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) ((FrameMetricsAggregator) ((io.sentry.util.g) this.a).a()).a.Z;
        int i3 = 0;
        if (sparseIntArrayArr == null || sparseIntArrayArr.length <= 0 || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i = 0;
            i2 = 0;
        } else {
            int i4 = 0;
            i = 0;
            i2 = 0;
            while (i3 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i3);
                int iValueAt = sparseIntArray.valueAt(i3);
                i4 += iValueAt;
                if (iKeyAt > 700) {
                    i2 += iValueAt;
                } else if (iKeyAt > 16) {
                    i += iValueAt;
                }
                i3++;
            }
            i3 = i4;
        }
        return new c(i3, i, i2);
    }

    public void c(boolean z) {
        ByteBuffer byteBuffer;
        io.sentry.android.replay.video.b bVar = (io.sentry.android.replay.video.b) this.f;
        MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) this.e;
        MediaCodec mediaCodec = (MediaCodec) this.c;
        s6 s6Var = (s6) this.a;
        if (s6Var.getSessionReplay().m) {
            s6Var.getLogger().h(s5.DEBUG, "[Encoder]: drainCodec(" + z + ')', new Object[0]);
        }
        if (z) {
            if (s6Var.getSessionReplay().m) {
                s6Var.getLogger().h(s5.DEBUG, "[Encoder]: sending EOS to encoder", new Object[0]);
            }
            mediaCodec.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
        int i = 0;
        do {
            int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (iDequeueOutputBuffer != -1) {
                if (iDequeueOutputBuffer == -3) {
                    outputBuffers = mediaCodec.getOutputBuffers();
                } else if (iDequeueOutputBuffer == -2) {
                    if (bVar.c) {
                        kp5.t("format changed twice");
                        return;
                    }
                    MediaFormat outputFormat = mediaCodec.getOutputFormat();
                    outputFormat.getClass();
                    if (s6Var.getSessionReplay().m) {
                        s6Var.getLogger().h(s5.DEBUG, "[Encoder]: encoder output format changed: " + outputFormat, new Object[0]);
                    }
                    MediaMuxer mediaMuxer = bVar.b;
                    bVar.d = mediaMuxer.addTrack(outputFormat);
                    mediaMuxer.start();
                    bVar.c = true;
                } else if (iDequeueOutputBuffer < 0) {
                    if (s6Var.getSessionReplay().m) {
                        s6Var.getLogger().h(s5.DEBUG, pc6.j(iDequeueOutputBuffer, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: "), new Object[0]);
                    }
                    i++;
                } else {
                    if (outputBuffers == null || (byteBuffer = outputBuffers[iDequeueOutputBuffer]) == null) {
                        kp5.t(ie2.h("encoderOutputBuffer ", iDequeueOutputBuffer, " was null"));
                        return;
                    }
                    if ((bufferInfo.flags & 2) != 0) {
                        if (s6Var.getSessionReplay().m) {
                            s6Var.getLogger().h(s5.DEBUG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG", new Object[0]);
                        }
                        bufferInfo.size = 0;
                    }
                    if (bufferInfo.size != 0) {
                        if (!bVar.c) {
                            kp5.t("muxer hasn't started");
                            return;
                        }
                        long j = bVar.a;
                        int i2 = bVar.e;
                        bVar.e = i2 + 1;
                        long j2 = j * ((long) i2);
                        bVar.f = j2;
                        bufferInfo.presentationTimeUs = j2;
                        bVar.b.writeSampleData(bVar.d, byteBuffer, bufferInfo);
                        if (s6Var.getSessionReplay().m) {
                            s6Var.getLogger().h(s5.DEBUG, oi0.n(new StringBuilder("[Encoder]: sent "), bufferInfo.size, " bytes to muxer"), new Object[0]);
                        }
                    }
                    mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    if ((bufferInfo.flags & 4) != 0) {
                        if (s6Var.getSessionReplay().m) {
                            if (z) {
                                s6Var.getLogger().h(s5.DEBUG, "[Encoder]: end of stream reached", new Object[0]);
                                return;
                            } else {
                                s6Var.getLogger().h(s5.DEBUG, "[Encoder]: reached end of stream unexpectedly", new Object[0]);
                                return;
                            }
                        }
                        return;
                    }
                }
                i = 0;
            } else {
                if (!z) {
                    return;
                }
                i++;
                if (s6Var.getSessionReplay().m) {
                    s6Var.getLogger().h(s5.DEBUG, "[Encoder]: no output available, spinning to await EOS", new Object[0]);
                }
            }
        } while (i < 10);
        s6Var.getLogger().h(s5.WARNING, ie2.h("[Encoder]: encoder made no progress for ", i, " iterations, dropping the remaining frames"), new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    public void d(Bitmap bitmap) {
        Surface surface;
        Canvas canvasLockCanvas;
        String str = Build.MANUFACTURER;
        str.getClass();
        if (fm7.d0(str, "xiaomi", true) || fm7.d0(str, "motorola", true)) {
            surface = (Surface) this.g;
            if (surface != null) {
                canvasLockCanvas = surface.lockCanvas(null);
            } else {
                canvasLockCanvas = null;
            }
        } else {
            io.sentry.android.replay.util.i iVar = io.sentry.android.replay.util.i.SOC_MANUFACTURER;
            if (io.sentry.android.replay.util.k.a(iVar).equalsIgnoreCase("spreadtrum") || io.sentry.android.replay.util.k.a(iVar).equalsIgnoreCase("unisoc")) {
                surface = (Surface) this.g;
                if (surface != null) {
                    canvasLockCanvas = surface.lockCanvas(null);
                } else {
                    canvasLockCanvas = null;
                }
            } else {
                Surface surface2 = (Surface) this.g;
                if (surface2 != null) {
                    canvasLockCanvas = surface2.lockHardwareCanvas();
                } else {
                    canvasLockCanvas = null;
                }
            }
        }
        if (canvasLockCanvas != null) {
            canvasLockCanvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Surface surface3 = (Surface) this.g;
        if (surface3 != null) {
            surface3.unlockCanvasAndPost(canvasLockCanvas);
        }
        c(false);
    }

    public boolean e() {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.c;
        return ((Boolean) ((io.sentry.util.g) this.b).a()).booleanValue() && sentryAndroidOptions.isEnableFramesTracking() && !sentryAndroidOptions.isEnablePerformanceV2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public void f() {
        io.sentry.android.replay.video.b logger = (io.sentry.android.replay.video.b) this.f;
        String str = "Failed to release Surface";
        String str2 = "Failed to release MediaCodec";
        MediaCodec mediaCodec = (MediaCodec) this.c;
        s6 s6Var = (s6) this.a;
        try {
            c(true);
            mediaCodec.stop();
        } catch (RuntimeException e) {
            s6Var.getLogger().e(s5.DEBUG, "Failed to properly release video encoder", e);
        } finally {
            try {
                mediaCodec.release();
            } catch (RuntimeException e2) {
                s6Var.getLogger().e(s5.DEBUG, str2, e2);
            }
            try {
                Surface surface = (Surface) this.g;
                if (surface != null) {
                    surface.release();
                }
            } catch (RuntimeException e3) {
                s6Var.getLogger().e(s5.DEBUG, str, e3);
            }
            try {
                logger.a();
            } catch (RuntimeException e4) {
                s6Var.getLogger().e(s5.DEBUG, "Failed to release MediaMuxer", e4);
            }
        }
    }

    public void g(Runnable runnable, String str) {
        try {
            if (io.sentry.android.core.internal.util.f.a.c()) {
                runnable.run();
                return;
            }
            n0 n0Var = (n0) this.f;
            ((Handler) n0Var.a).post(new r1(this, runnable, str, (byte) 1));
        } catch (Throwable unused) {
            if (str != null) {
                ((SentryAndroidOptions) this.c).getLogger().h(s5.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }

    public d(io.sentry.util.h hVar, SentryAndroidOptions sentryAndroidOptions) {
        n0 n0Var = new n0();
        this.d = new ConcurrentHashMap();
        this.e = new WeakHashMap();
        this.g = new io.sentry.util.a();
        this.b = new io.sentry.util.g(new j78(hVar, sentryAndroidOptions.getLogger(), (byte) 25));
        this.a = new io.sentry.util.g(new io.sentry.c2((byte) 11));
        this.c = sentryAndroidOptions;
        this.f = n0Var;
    }
}

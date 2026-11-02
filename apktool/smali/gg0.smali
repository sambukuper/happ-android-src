.class public final Lgg0;
.super Lwl6;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final j0:Lzx;

.field public static final k0:Lzx;

.field public static final l0:Lzx;

.field public static final m0:Lzx;

.field public static final n0:Lzx;

.field public static final o0:Lzx;

.field public static final p0:Lzx;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Lzx;

    .line 7
    .line 8
    const-string v2, "camera2.captureRequest.templateType"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v1, v2, v0, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Lgg0;->j0:Lzx;

    .line 15
    .line 16
    new-instance v0, Lzx;

    .line 17
    .line 18
    const-string v1, "camera2.cameraDevice.stateCallback"

    .line 19
    .line 20
    const-class v2, Landroid/hardware/camera2/CameraDevice$StateCallback;

    .line 21
    .line 22
    invoke-direct {v0, v1, v2, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lgg0;->k0:Lzx;

    .line 26
    .line 27
    new-instance v0, Lzx;

    .line 28
    .line 29
    const-string v1, "camera2.cameraCaptureSession.stateCallback"

    .line 30
    .line 31
    const-class v2, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 32
    .line 33
    invoke-direct {v0, v1, v2, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lgg0;->l0:Lzx;

    .line 37
    .line 38
    new-instance v0, Lzx;

    .line 39
    .line 40
    const-string v1, "camera2.cameraCaptureSession.captureCallback"

    .line 41
    .line 42
    const-class v2, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 43
    .line 44
    invoke-direct {v0, v1, v2, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lgg0;->m0:Lzx;

    .line 48
    .line 49
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    new-instance v1, Lzx;

    .line 55
    .line 56
    const-string v2, "camera2.cameraCaptureSession.streamUseCase"

    .line 57
    .line 58
    invoke-direct {v1, v2, v0, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 59
    .line 60
    .line 61
    sput-object v1, Lgg0;->n0:Lzx;

    .line 62
    .line 63
    new-instance v1, Lzx;

    .line 64
    .line 65
    const-string v2, "camera2.cameraCaptureSession.streamUseHint"

    .line 66
    .line 67
    invoke-direct {v1, v2, v0, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 68
    .line 69
    .line 70
    sput-object v1, Lgg0;->o0:Lzx;

    .line 71
    .line 72
    new-instance v0, Lzx;

    .line 73
    .line 74
    const-string v1, "camera2.cameraCaptureSession.physicalCameraId"

    .line 75
    .line 76
    const-class v2, Ljava/lang/String;

    .line 77
    .line 78
    invoke-direct {v0, v1, v2, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 79
    .line 80
    .line 81
    sput-object v0, Lgg0;->p0:Lzx;

    .line 82
    .line 83
    return-void
.end method

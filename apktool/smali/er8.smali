.class public interface abstract Ler8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lu18;
.implements Le63;


# static fields
.field public static final L:Lzx;

.field public static final M:Lzx;

.field public static final N:Lzx;

.field public static final O:Lzx;

.field public static final P:Lzx;

.field public static final Q:Lzx;

.field public static final R:Lzx;

.field public static final S:Lzx;

.field public static final T:Lzx;

.field public static final U:Lzx;

.field public static final V:Lzx;

.field public static final W:Lzx;

.field public static final a0:Lzx;

.field public static final b0:Lzx;

.field public static final c0:Lzx;

.field public static final d0:Lzx;

.field public static final e0:Lzx;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lzx;

    .line 2
    .line 3
    const-string v1, "camerax.core.useCase.defaultSessionConfig"

    .line 4
    .line 5
    const-class v2, Lf57;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Ler8;->L:Lzx;

    .line 12
    .line 13
    new-instance v0, Lzx;

    .line 14
    .line 15
    const-string v1, "camerax.core.useCase.defaultCaptureConfig"

    .line 16
    .line 17
    const-class v2, Lym0;

    .line 18
    .line 19
    invoke-direct {v0, v1, v2, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Ler8;->M:Lzx;

    .line 23
    .line 24
    new-instance v0, Lzx;

    .line 25
    .line 26
    const-string v1, "camerax.core.useCase.sessionConfigUnpacker"

    .line 27
    .line 28
    const-class v2, Lrl0;

    .line 29
    .line 30
    invoke-direct {v0, v1, v2, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Ler8;->N:Lzx;

    .line 34
    .line 35
    new-instance v0, Lzx;

    .line 36
    .line 37
    const-string v1, "camerax.core.useCase.captureConfigUnpacker"

    .line 38
    .line 39
    const-class v2, Lql0;

    .line 40
    .line 41
    invoke-direct {v0, v1, v2, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Ler8;->O:Lzx;

    .line 45
    .line 46
    new-instance v0, Lzx;

    .line 47
    .line 48
    const-string v1, "camerax.core.useCase.surfaceOccupancyPriority"

    .line 49
    .line 50
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    invoke-direct {v0, v1, v2, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Ler8;->P:Lzx;

    .line 56
    .line 57
    new-instance v0, Lzx;

    .line 58
    .line 59
    const-string v1, "camerax.core.useCase.sessionType"

    .line 60
    .line 61
    invoke-direct {v0, v1, v2, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 62
    .line 63
    .line 64
    sput-object v0, Ler8;->Q:Lzx;

    .line 65
    .line 66
    new-instance v0, Lzx;

    .line 67
    .line 68
    const-string v1, "camerax.core.useCase.targetFrameRate"

    .line 69
    .line 70
    const-class v4, Landroid/util/Range;

    .line 71
    .line 72
    invoke-direct {v0, v1, v4, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 73
    .line 74
    .line 75
    sput-object v0, Ler8;->R:Lzx;

    .line 76
    .line 77
    new-instance v0, Lzx;

    .line 78
    .line 79
    const-string v1, "camerax.core.useCase.isStrictFrameRateRequired"

    .line 80
    .line 81
    const-class v4, Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-direct {v0, v1, v4, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 84
    .line 85
    .line 86
    sput-object v0, Ler8;->S:Lzx;

    .line 87
    .line 88
    new-instance v0, Lzx;

    .line 89
    .line 90
    const-string v1, "camerax.core.useCase.resolutionToMaxFrameRate"

    .line 91
    .line 92
    const-class v5, Ljava/util/Map;

    .line 93
    .line 94
    invoke-direct {v0, v1, v5, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 95
    .line 96
    .line 97
    sput-object v0, Ler8;->T:Lzx;

    .line 98
    .line 99
    new-instance v0, Lzx;

    .line 100
    .line 101
    const-string v1, "camerax.core.useCase.zslDisabled"

    .line 102
    .line 103
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 104
    .line 105
    invoke-direct {v0, v1, v5, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 106
    .line 107
    .line 108
    sput-object v0, Ler8;->U:Lzx;

    .line 109
    .line 110
    new-instance v0, Lzx;

    .line 111
    .line 112
    const-string v1, "camerax.core.useCase.highResolutionDisabled"

    .line 113
    .line 114
    invoke-direct {v0, v1, v5, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 115
    .line 116
    .line 117
    sput-object v0, Ler8;->V:Lzx;

    .line 118
    .line 119
    new-instance v0, Lzx;

    .line 120
    .line 121
    const-string v1, "camerax.core.useCase.captureType"

    .line 122
    .line 123
    const-class v5, Lgr8;

    .line 124
    .line 125
    invoke-direct {v0, v1, v5, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 126
    .line 127
    .line 128
    sput-object v0, Ler8;->W:Lzx;

    .line 129
    .line 130
    new-instance v0, Lzx;

    .line 131
    .line 132
    const-string v1, "camerax.core.useCase.previewStabilizationMode"

    .line 133
    .line 134
    invoke-direct {v0, v1, v2, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 135
    .line 136
    .line 137
    sput-object v0, Ler8;->a0:Lzx;

    .line 138
    .line 139
    new-instance v0, Lzx;

    .line 140
    .line 141
    const-string v1, "camerax.core.useCase.videoStabilizationMode"

    .line 142
    .line 143
    invoke-direct {v0, v1, v2, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 144
    .line 145
    .line 146
    sput-object v0, Ler8;->b0:Lzx;

    .line 147
    .line 148
    new-instance v0, Lzx;

    .line 149
    .line 150
    const-string v1, "camerax.core.useCase.isVideoQualitySelectorDefault"

    .line 151
    .line 152
    invoke-direct {v0, v1, v4, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 153
    .line 154
    .line 155
    sput-object v0, Ler8;->c0:Lzx;

    .line 156
    .line 157
    new-instance v0, Lzx;

    .line 158
    .line 159
    const-string v1, "camerax.core.useCase.takePictureManagerProvider"

    .line 160
    .line 161
    const-class v2, Lcr8;

    .line 162
    .line 163
    invoke-direct {v0, v1, v2, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 164
    .line 165
    .line 166
    sput-object v0, Ler8;->d0:Lzx;

    .line 167
    .line 168
    new-instance v0, Lzx;

    .line 169
    .line 170
    const-string v1, "camerax.core.useCase.streamUseCase"

    .line 171
    .line 172
    const-class v2, Ljl7;

    .line 173
    .line 174
    invoke-direct {v0, v1, v2, v3}, Lzx;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 175
    .line 176
    .line 177
    sput-object v0, Ler8;->e0:Lzx;

    .line 178
    .line 179
    return-void
.end method


# virtual methods
.method public B()I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sget-object v1, Ler8;->a0:Lzx;

    .line 7
    .line 8
    invoke-interface {p0, v1, v0}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public r()Ljl7;
    .locals 2

    .line 1
    sget-object v0, Ler8;->e0:Lzx;

    .line 2
    .line 3
    sget-object v1, Ljl7;->Y:Ljl7;

    .line 4
    .line 5
    invoke-interface {p0, v0, v1}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljl7;

    .line 10
    .line 11
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public s()Lgr8;
    .locals 1

    .line 1
    sget-object v0, Ler8;->W:Lzx;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lb76;->d(Lzx;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lgr8;

    .line 8
    .line 9
    return-object p0
.end method

.method public t()I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sget-object v1, Ler8;->b0:Lzx;

    .line 7
    .line 8
    invoke-interface {p0, v1, v0}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public v(Landroid/util/Size;)I
    .locals 2

    .line 1
    sget-object v0, Ler8;->T:Lzx;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {p0, v0, v1}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Ljava/util/Map;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0

    .line 32
    :cond_0
    const p0, 0x7fffffff

    .line 33
    .line 34
    .line 35
    return p0
.end method

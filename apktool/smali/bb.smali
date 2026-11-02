.class public final Lbb;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lfi0;


# instance fields
.field public final X:Lza;

.field public final Y:Landroid/hardware/camera2/CameraExtensionSession;

.field public final Z:Leg0;

.field public final f0:Lhv;

.field public final g0:Lsv;

.field public final h0:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Lza;Landroid/hardware/camera2/CameraExtensionSession;Leg0;Lhv;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lbb;->X:Lza;

    .line 8
    .line 9
    iput-object p2, p0, Lbb;->Y:Landroid/hardware/camera2/CameraExtensionSession;

    .line 10
    .line 11
    iput-object p3, p0, Lbb;->Z:Leg0;

    .line 12
    .line 13
    iput-object p4, p0, Lbb;->f0:Lhv;

    .line 14
    .line 15
    sget-object p1, Lgj0;->a:Lqv;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object p2, Lqv;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 21
    .line 22
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 23
    .line 24
    .line 25
    new-instance p1, Lsv;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    const-wide/16 p2, 0x0

    .line 31
    .line 32
    iput-wide p2, p1, Lsv;->a:J

    .line 33
    .line 34
    iput-object p1, p0, Lbb;->g0:Lsv;

    .line 35
    .line 36
    new-instance p1, Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lbb;->h0:Ljava/util/HashMap;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final A0()Z
    .locals 8

    .line 1
    iget-object v0, p0, Lbb;->X:Lza;

    .line 2
    .line 3
    iget-object v0, v0, Lza;->Z:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    :try_start_0
    iget-object v3, p0, Lbb;->Y:Landroid/hardware/camera2/CameraExtensionSession;

    .line 8
    .line 9
    invoke-virtual {v3}, Landroid/hardware/camera2/CameraExtensionSession;->stopRepeating()V

    .line 10
    .line 11
    .line 12
    sget-object p0, Ldn8;->a:Ldn8;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    goto :goto_3

    .line 15
    :catch_0
    move-exception v3

    .line 16
    instance-of v4, v3, Landroid/hardware/camera2/CameraAccessException;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    iget-object p0, p0, Lbb;->Z:Leg0;

    .line 20
    .line 21
    if-eqz v4, :cond_5

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    check-cast v3, Landroid/hardware/camera2/CameraAccessException;

    .line 27
    .line 28
    invoke-virtual {v3}, Landroid/hardware/camera2/CameraAccessException;->getReason()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const/4 v6, 0x3

    .line 33
    if-eq v4, v2, :cond_4

    .line 34
    .line 35
    const/4 v7, 0x2

    .line 36
    if-eq v4, v7, :cond_3

    .line 37
    .line 38
    if-eq v4, v6, :cond_2

    .line 39
    .line 40
    const/4 v6, 0x4

    .line 41
    if-eq v4, v6, :cond_1

    .line 42
    .line 43
    const/4 v6, 0x5

    .line 44
    if-eq v4, v6, :cond_0

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    const/16 v6, 0xb

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move v6, v7

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move v6, v2

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move v6, v1

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    const/4 v6, 0x6

    .line 59
    :cond_4
    :goto_0
    invoke-virtual {p0, v6, v0, v2}, Leg0;->a(ILjava/lang/String;Z)V

    .line 60
    .line 61
    .line 62
    :goto_1
    move-object p0, v5

    .line 63
    goto :goto_3

    .line 64
    :cond_5
    instance-of v4, v3, Ljava/lang/IllegalArgumentException;

    .line 65
    .line 66
    if-nez v4, :cond_8

    .line 67
    .line 68
    instance-of v4, v3, Ljava/lang/SecurityException;

    .line 69
    .line 70
    if-nez v4, :cond_8

    .line 71
    .line 72
    instance-of v4, v3, Ljava/lang/UnsupportedOperationException;

    .line 73
    .line 74
    if-nez v4, :cond_8

    .line 75
    .line 76
    instance-of v4, v3, Ljava/lang/NullPointerException;

    .line 77
    .line 78
    if-eqz v4, :cond_6

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_6
    instance-of p0, v3, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    if-eqz p0, :cond_7

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_7
    throw v3

    .line 87
    :cond_8
    :goto_2
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    const/16 v3, 0x9

    .line 91
    .line 92
    invoke-virtual {p0, v3, v0, v1}, Leg0;->a(ILjava/lang/String;Z)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :goto_3
    if-eqz p0, :cond_9

    .line 97
    .line 98
    move v1, v2

    .line 99
    :cond_9
    return v1
.end method

.method public final C0(Lzu3;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lbt;->m()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Lyb6;->a:Lzb6;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Lbb;->Y:Landroid/hardware/camera2/CameraExtensionSession;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public final G(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lbb;->X:Lza;

    .line 5
    .line 6
    iget-object v0, v0, Lza;->Z:Ljava/lang/String;

    .line 7
    .line 8
    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    iget-object v2, p0, Lbb;->Y:Landroid/hardware/camera2/CameraExtensionSession;

    .line 11
    .line 12
    iget-object v3, p0, Lbb;->f0:Lhv;

    .line 13
    .line 14
    const/16 v4, 0x21

    .line 15
    .line 16
    if-lt v1, v4, :cond_0

    .line 17
    .line 18
    :try_start_1
    new-instance v1, Lab;

    .line 19
    .line 20
    check-cast p2, Lqf0;

    .line 21
    .line 22
    invoke-direct {v1, p0, p2}, Lab;-><init>(Lbb;Lqf0;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, p1, v3, v1}, Landroid/hardware/camera2/CameraExtensionSession;->capture(Landroid/hardware/camera2/CaptureRequest;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraExtensionSession$ExtensionCaptureCallback;)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    new-instance v1, Lab;

    .line 33
    .line 34
    check-cast p2, Lqf0;

    .line 35
    .line 36
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, p0, p2, v4}, Lab;-><init>(Lbb;Lqf0;Ljava/util/LinkedHashMap;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, p1, v3, v1}, Landroid/hardware/camera2/CameraExtensionSession;->capture(Landroid/hardware/camera2/CaptureRequest;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraExtensionSession$ExtensionCaptureCallback;)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 52
    return-object p0

    .line 53
    :goto_1
    instance-of p2, p1, Landroid/hardware/camera2/CameraAccessException;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    iget-object p0, p0, Lbb;->Z:Leg0;

    .line 57
    .line 58
    if-eqz p2, :cond_6

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    check-cast p1, Landroid/hardware/camera2/CameraAccessException;

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraAccessException;->getReason()I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    const/4 v2, 0x1

    .line 70
    const/4 v3, 0x3

    .line 71
    if-eq p2, v2, :cond_4

    .line 72
    .line 73
    const/4 v4, 0x2

    .line 74
    if-eq p2, v4, :cond_3

    .line 75
    .line 76
    if-eq p2, v3, :cond_5

    .line 77
    .line 78
    const/4 v1, 0x4

    .line 79
    if-eq p2, v1, :cond_2

    .line 80
    .line 81
    const/4 v1, 0x5

    .line 82
    if-eq p2, v1, :cond_1

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    const/16 v1, 0xb

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_1
    move v1, v4

    .line 91
    goto :goto_2

    .line 92
    :cond_2
    move v1, v2

    .line 93
    goto :goto_2

    .line 94
    :cond_3
    const/4 v1, 0x6

    .line 95
    goto :goto_2

    .line 96
    :cond_4
    move v1, v3

    .line 97
    :cond_5
    :goto_2
    invoke-virtual {p0, v1, v0, v2}, Leg0;->a(ILjava/lang/String;Z)V

    .line 98
    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_6
    instance-of p2, p1, Ljava/lang/IllegalArgumentException;

    .line 102
    .line 103
    if-nez p2, :cond_9

    .line 104
    .line 105
    instance-of p2, p1, Ljava/lang/SecurityException;

    .line 106
    .line 107
    if-nez p2, :cond_9

    .line 108
    .line 109
    instance-of p2, p1, Ljava/lang/UnsupportedOperationException;

    .line 110
    .line 111
    if-nez p2, :cond_9

    .line 112
    .line 113
    instance-of p2, p1, Ljava/lang/NullPointerException;

    .line 114
    .line 115
    if-eqz p2, :cond_7

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_7
    instance-of p0, p1, Ljava/lang/IllegalStateException;

    .line 119
    .line 120
    if-eqz p0, :cond_8

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_8
    throw p1

    .line 124
    :cond_9
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    const/16 p1, 0x9

    .line 128
    .line 129
    invoke-virtual {p0, p1, v0, v1}, Leg0;->a(ILjava/lang/String;Z)V

    .line 130
    .line 131
    .line 132
    :goto_4
    const/4 p0, 0x0

    .line 133
    return-object p0
.end method

.method public final L0(Ljava/util/ArrayList;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Landroid/hardware/camera2/CaptureRequest;

    .line 13
    .line 14
    invoke-virtual {p0, p1, p2}, Lbb;->O0(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    const-string p0, "CameraExtensionSession does not support setRepeatingBurst for more than oneCaptureRequest"

    .line 20
    .line 21
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0
.end method

.method public final O0(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lbb;->X:Lza;

    .line 5
    .line 6
    iget-object v0, v0, Lza;->Z:Ljava/lang/String;

    .line 7
    .line 8
    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    iget-object v2, p0, Lbb;->Y:Landroid/hardware/camera2/CameraExtensionSession;

    .line 11
    .line 12
    iget-object v3, p0, Lbb;->f0:Lhv;

    .line 13
    .line 14
    const/16 v4, 0x21

    .line 15
    .line 16
    if-lt v1, v4, :cond_0

    .line 17
    .line 18
    :try_start_1
    new-instance v1, Lab;

    .line 19
    .line 20
    check-cast p2, Lqf0;

    .line 21
    .line 22
    invoke-direct {v1, p0, p2}, Lab;-><init>(Lbb;Lqf0;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, p1, v3, v1}, Landroid/hardware/camera2/CameraExtensionSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraExtensionSession$ExtensionCaptureCallback;)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    new-instance v1, Lab;

    .line 33
    .line 34
    check-cast p2, Lqf0;

    .line 35
    .line 36
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, p0, p2, v4}, Lab;-><init>(Lbb;Lqf0;Ljava/util/LinkedHashMap;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, p1, v3, v1}, Landroid/hardware/camera2/CameraExtensionSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraExtensionSession$ExtensionCaptureCallback;)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 52
    return-object p0

    .line 53
    :goto_1
    instance-of p2, p1, Landroid/hardware/camera2/CameraAccessException;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    iget-object p0, p0, Lbb;->Z:Leg0;

    .line 57
    .line 58
    if-eqz p2, :cond_6

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    check-cast p1, Landroid/hardware/camera2/CameraAccessException;

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraAccessException;->getReason()I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    const/4 v2, 0x1

    .line 70
    const/4 v3, 0x3

    .line 71
    if-eq p2, v2, :cond_4

    .line 72
    .line 73
    const/4 v4, 0x2

    .line 74
    if-eq p2, v4, :cond_3

    .line 75
    .line 76
    if-eq p2, v3, :cond_5

    .line 77
    .line 78
    const/4 v1, 0x4

    .line 79
    if-eq p2, v1, :cond_2

    .line 80
    .line 81
    const/4 v1, 0x5

    .line 82
    if-eq p2, v1, :cond_1

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    const/16 v1, 0xb

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_1
    move v1, v4

    .line 91
    goto :goto_2

    .line 92
    :cond_2
    move v1, v2

    .line 93
    goto :goto_2

    .line 94
    :cond_3
    const/4 v1, 0x6

    .line 95
    goto :goto_2

    .line 96
    :cond_4
    move v1, v3

    .line 97
    :cond_5
    :goto_2
    invoke-virtual {p0, v1, v0, v2}, Leg0;->a(ILjava/lang/String;Z)V

    .line 98
    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_6
    instance-of p2, p1, Ljava/lang/IllegalArgumentException;

    .line 102
    .line 103
    if-nez p2, :cond_9

    .line 104
    .line 105
    instance-of p2, p1, Ljava/lang/SecurityException;

    .line 106
    .line 107
    if-nez p2, :cond_9

    .line 108
    .line 109
    instance-of p2, p1, Ljava/lang/UnsupportedOperationException;

    .line 110
    .line 111
    if-nez p2, :cond_9

    .line 112
    .line 113
    instance-of p2, p1, Ljava/lang/NullPointerException;

    .line 114
    .line 115
    if-eqz p2, :cond_7

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_7
    instance-of p0, p1, Ljava/lang/IllegalStateException;

    .line 119
    .line 120
    if-eqz p0, :cond_8

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_8
    throw p1

    .line 124
    :cond_9
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    const/16 p1, 0x9

    .line 128
    .line 129
    invoke-virtual {p0, p1, v0, v1}, Leg0;->a(ILjava/lang/String;Z)V

    .line 130
    .line 131
    .line 132
    :goto_4
    const/4 p0, 0x0

    .line 133
    return-object p0
.end method

.method public final R0(Ljava/util/ArrayList;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/hardware/camera2/CaptureRequest;

    .line 16
    .line 17
    invoke-virtual {p0, v0, p2}, Lbb;->G(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public final b0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lbb;->Y:Landroid/hardware/camera2/CameraExtensionSession;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/hardware/camera2/CameraExtensionSession;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getInputSurface()Landroid/view/Surface;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final i0()Lyh0;
    .locals 0

    .line 1
    iget-object p0, p0, Lbb;->X:Lza;

    .line 2
    .line 3
    return-object p0
.end method

.method public final x0(Ljava/util/List;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

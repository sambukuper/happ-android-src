.class public Lxa;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgh0;


# instance fields
.field public final X:Lza;

.field public final Y:Landroid/hardware/camera2/CameraCaptureSession;

.field public final Z:Leg0;

.field public final f0:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lza;Landroid/hardware/camera2/CameraCaptureSession;Leg0;Landroid/os/Handler;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lxa;->X:Lza;

    .line 11
    .line 12
    iput-object p2, p0, Lxa;->Y:Landroid/hardware/camera2/CameraCaptureSession;

    .line 13
    .line 14
    iput-object p3, p0, Lxa;->Z:Leg0;

    .line 15
    .line 16
    iput-object p4, p0, Lxa;->f0:Landroid/os/Handler;

    .line 17
    .line 18
    sget-object p0, Lgj0;->a:Lqv;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget-object p1, Lqv;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 24
    .line 25
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final A0()Z
    .locals 13

    .line 1
    const-string v0, "%.3f ms"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "CXCP#stopRepeating-"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Lxa;->X:Lza;

    .line 11
    .line 12
    iget-object v2, v2, Lza;->Z:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    const-wide v5, 0x412e848000000000L    # 1000000.0

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v8, 0x1

    .line 32
    :try_start_0
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lxa;->Z:Leg0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    const/4 v9, 0x0

    .line 38
    :try_start_1
    iget-object p0, p0, Lxa;->Y:Landroid/hardware/camera2/CameraCaptureSession;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/hardware/camera2/CameraCaptureSession;->stopRepeating()V

    .line 41
    .line 42
    .line 43
    sget-object p0, Ldn8;->a:Ldn8;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :catch_0
    move-exception p0

    .line 50
    :try_start_2
    instance-of v10, p0, Landroid/hardware/camera2/CameraAccessException;

    .line 51
    .line 52
    if-eqz v10, :cond_5

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    check-cast p0, Landroid/hardware/camera2/CameraAccessException;

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/hardware/camera2/CameraAccessException;->getReason()I

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    const/4 v11, 0x3

    .line 64
    if-eq v10, v8, :cond_4

    .line 65
    .line 66
    const/4 v12, 0x2

    .line 67
    if-eq v10, v12, :cond_3

    .line 68
    .line 69
    if-eq v10, v11, :cond_2

    .line 70
    .line 71
    const/4 v11, 0x4

    .line 72
    if-eq v10, v11, :cond_1

    .line 73
    .line 74
    const/4 v11, 0x5

    .line 75
    if-eq v10, v11, :cond_0

    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    const/16 v11, 0xb

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    move v11, v12

    .line 84
    goto :goto_0

    .line 85
    :cond_1
    move v11, v8

    .line 86
    goto :goto_0

    .line 87
    :cond_2
    move v11, v9

    .line 88
    goto :goto_0

    .line 89
    :cond_3
    const/4 v11, 0x6

    .line 90
    :cond_4
    :goto_0
    invoke-virtual {v1, v11, v2, v8}, Leg0;->a(ILjava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    :goto_1
    move-object p0, v7

    .line 94
    goto :goto_3

    .line 95
    :cond_5
    instance-of v10, p0, Ljava/lang/IllegalArgumentException;

    .line 96
    .line 97
    if-nez v10, :cond_8

    .line 98
    .line 99
    instance-of v10, p0, Ljava/lang/SecurityException;

    .line 100
    .line 101
    if-nez v10, :cond_8

    .line 102
    .line 103
    instance-of v10, p0, Ljava/lang/UnsupportedOperationException;

    .line 104
    .line 105
    if-nez v10, :cond_8

    .line 106
    .line 107
    instance-of v10, p0, Ljava/lang/NullPointerException;

    .line 108
    .line 109
    if-eqz v10, :cond_6

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_6
    instance-of v1, p0, Ljava/lang/IllegalStateException;

    .line 113
    .line 114
    if-eqz v1, :cond_7

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_7
    throw p0

    .line 118
    :cond_8
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    const/16 p0, 0x9

    .line 122
    .line 123
    invoke-virtual {v1, p0, v2, v9}, Leg0;->a(ILjava/lang/String;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :goto_3
    invoke-static {v3, v4}, Lp61;->h(J)J

    .line 128
    .line 129
    .line 130
    move-result-wide v1

    .line 131
    long-to-double v1, v1

    .line 132
    div-double/2addr v1, v5

    .line 133
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-static {v1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-static {v7, v0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    if-eqz p0, :cond_9

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_9
    move v8, v9

    .line 152
    :goto_4
    return v8

    .line 153
    :goto_5
    invoke-static {v3, v4}, Lp61;->h(J)J

    .line 154
    .line 155
    .line 156
    move-result-wide v1

    .line 157
    long-to-double v1, v1

    .line 158
    div-double/2addr v1, v5

    .line 159
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-static {v1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-static {v7, v0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    throw p0
.end method

.method public C0(Lzu3;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-class v0, Landroid/hardware/camera2/CameraCaptureSession;

    .line 5
    .line 6
    sget-object v1, Lyb6;->a:Lzb6;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Lxa;->Y:Landroid/hardware/camera2/CameraCaptureSession;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public final G(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;
    .locals 11

    .line 1
    const-string v0, "%.3f ms"

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v2, "CXCP#capture-"

    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lxa;->X:Lza;

    .line 14
    .line 15
    iget-object v2, v2, Lza;->Z:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 25
    .line 26
    .line 27
    move-result-wide v3

    .line 28
    const-wide v5, 0x412e848000000000L    # 1000000.0

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    const/4 v7, 0x1

    .line 34
    const/4 v8, 0x0

    .line 35
    :try_start_0
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lxa;->Z:Leg0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    :try_start_1
    iget-object v9, p0, Lxa;->Y:Landroid/hardware/camera2/CameraCaptureSession;

    .line 41
    .line 42
    iget-object p0, p0, Lxa;->f0:Landroid/os/Handler;

    .line 43
    .line 44
    invoke-virtual {v9, p1, p2, p0}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    goto :goto_3

    .line 53
    :catchall_0
    move-exception p0

    .line 54
    goto/16 :goto_4

    .line 55
    .line 56
    :catch_0
    move-exception p0

    .line 57
    :try_start_2
    instance-of p1, p0, Landroid/hardware/camera2/CameraAccessException;

    .line 58
    .line 59
    const/4 p2, 0x0

    .line 60
    if-eqz p1, :cond_5

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    check-cast p0, Landroid/hardware/camera2/CameraAccessException;

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/hardware/camera2/CameraAccessException;->getReason()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    const/4 v9, 0x3

    .line 72
    if-eq p1, v7, :cond_3

    .line 73
    .line 74
    const/4 v10, 0x2

    .line 75
    if-eq p1, v10, :cond_2

    .line 76
    .line 77
    if-eq p1, v9, :cond_4

    .line 78
    .line 79
    const/4 p2, 0x4

    .line 80
    if-eq p1, p2, :cond_1

    .line 81
    .line 82
    const/4 p2, 0x5

    .line 83
    if-eq p1, p2, :cond_0

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    const/16 p2, 0xb

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    move p2, v10

    .line 92
    goto :goto_0

    .line 93
    :cond_1
    move p2, v7

    .line 94
    goto :goto_0

    .line 95
    :cond_2
    const/4 p2, 0x6

    .line 96
    goto :goto_0

    .line 97
    :cond_3
    move p2, v9

    .line 98
    :cond_4
    :goto_0
    invoke-virtual {v1, p2, v2, v7}, Leg0;->a(ILjava/lang/String;Z)V

    .line 99
    .line 100
    .line 101
    :goto_1
    move-object p0, v8

    .line 102
    goto :goto_3

    .line 103
    :cond_5
    instance-of p1, p0, Ljava/lang/IllegalArgumentException;

    .line 104
    .line 105
    if-nez p1, :cond_8

    .line 106
    .line 107
    instance-of p1, p0, Ljava/lang/SecurityException;

    .line 108
    .line 109
    if-nez p1, :cond_8

    .line 110
    .line 111
    instance-of p1, p0, Ljava/lang/UnsupportedOperationException;

    .line 112
    .line 113
    if-nez p1, :cond_8

    .line 114
    .line 115
    instance-of p1, p0, Ljava/lang/NullPointerException;

    .line 116
    .line 117
    if-eqz p1, :cond_6

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_6
    instance-of p1, p0, Ljava/lang/IllegalStateException;

    .line 121
    .line 122
    if-eqz p1, :cond_7

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_7
    throw p0

    .line 126
    :cond_8
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    const/16 p0, 0x9

    .line 130
    .line 131
    invoke-virtual {v1, p0, v2, p2}, Leg0;->a(ILjava/lang/String;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :goto_3
    invoke-static {v3, v4}, Lp61;->h(J)J

    .line 136
    .line 137
    .line 138
    move-result-wide p1

    .line 139
    long-to-double p1, p1

    .line 140
    div-double/2addr p1, v5

    .line 141
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-static {v8, v0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    return-object p0

    .line 157
    :goto_4
    invoke-static {v3, v4}, Lp61;->h(J)J

    .line 158
    .line 159
    .line 160
    move-result-wide p1

    .line 161
    long-to-double p1, p1

    .line 162
    div-double/2addr p1, v5

    .line 163
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-static {v8, v0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    throw p0
.end method

.method public final L0(Ljava/util/ArrayList;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;
    .locals 11

    .line 1
    const-string v0, "%.3f ms"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "CXCP#setRepeatingBurst-"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Lxa;->X:Lza;

    .line 11
    .line 12
    iget-object v2, v2, Lza;->Z:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    const-wide v5, 0x412e848000000000L    # 1000000.0

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    const/4 v7, 0x1

    .line 31
    const/4 v8, 0x0

    .line 32
    :try_start_0
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lxa;->Z:Leg0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    :try_start_1
    iget-object v9, p0, Lxa;->Y:Landroid/hardware/camera2/CameraCaptureSession;

    .line 38
    .line 39
    iget-object p0, p0, Lxa;->f0:Landroid/os/Handler;

    .line 40
    .line 41
    invoke-virtual {v9, p1, p2, p0}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingBurst(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    goto :goto_3

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :catch_0
    move-exception p0

    .line 54
    :try_start_2
    instance-of p1, p0, Landroid/hardware/camera2/CameraAccessException;

    .line 55
    .line 56
    const/4 p2, 0x0

    .line 57
    if-eqz p1, :cond_5

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    check-cast p0, Landroid/hardware/camera2/CameraAccessException;

    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/hardware/camera2/CameraAccessException;->getReason()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    const/4 v9, 0x3

    .line 69
    if-eq p1, v7, :cond_3

    .line 70
    .line 71
    const/4 v10, 0x2

    .line 72
    if-eq p1, v10, :cond_2

    .line 73
    .line 74
    if-eq p1, v9, :cond_4

    .line 75
    .line 76
    const/4 p2, 0x4

    .line 77
    if-eq p1, p2, :cond_1

    .line 78
    .line 79
    const/4 p2, 0x5

    .line 80
    if-eq p1, p2, :cond_0

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    const/16 p2, 0xb

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    move p2, v10

    .line 89
    goto :goto_0

    .line 90
    :cond_1
    move p2, v7

    .line 91
    goto :goto_0

    .line 92
    :cond_2
    const/4 p2, 0x6

    .line 93
    goto :goto_0

    .line 94
    :cond_3
    move p2, v9

    .line 95
    :cond_4
    :goto_0
    invoke-virtual {v1, p2, v2, v7}, Leg0;->a(ILjava/lang/String;Z)V

    .line 96
    .line 97
    .line 98
    :goto_1
    move-object p0, v8

    .line 99
    goto :goto_3

    .line 100
    :cond_5
    instance-of p1, p0, Ljava/lang/IllegalArgumentException;

    .line 101
    .line 102
    if-nez p1, :cond_8

    .line 103
    .line 104
    instance-of p1, p0, Ljava/lang/SecurityException;

    .line 105
    .line 106
    if-nez p1, :cond_8

    .line 107
    .line 108
    instance-of p1, p0, Ljava/lang/UnsupportedOperationException;

    .line 109
    .line 110
    if-nez p1, :cond_8

    .line 111
    .line 112
    instance-of p1, p0, Ljava/lang/NullPointerException;

    .line 113
    .line 114
    if-eqz p1, :cond_6

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_6
    instance-of p1, p0, Ljava/lang/IllegalStateException;

    .line 118
    .line 119
    if-eqz p1, :cond_7

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_7
    throw p0

    .line 123
    :cond_8
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    const/16 p0, 0x9

    .line 127
    .line 128
    invoke-virtual {v1, p0, v2, p2}, Leg0;->a(ILjava/lang/String;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :goto_3
    invoke-static {v3, v4}, Lp61;->h(J)J

    .line 133
    .line 134
    .line 135
    move-result-wide p1

    .line 136
    long-to-double p1, p1

    .line 137
    div-double/2addr p1, v5

    .line 138
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-static {v8, v0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    return-object p0

    .line 154
    :goto_4
    invoke-static {v3, v4}, Lp61;->h(J)J

    .line 155
    .line 156
    .line 157
    move-result-wide p1

    .line 158
    long-to-double p1, p1

    .line 159
    div-double/2addr p1, v5

    .line 160
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-static {v8, v0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    throw p0
.end method

.method public final O0(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;
    .locals 11

    .line 1
    const-string v0, "%.3f ms"

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v2, "CXCP#setRepeatingRequest-"

    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lxa;->X:Lza;

    .line 14
    .line 15
    iget-object v2, v2, Lza;->Z:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 25
    .line 26
    .line 27
    move-result-wide v3

    .line 28
    const-wide v5, 0x412e848000000000L    # 1000000.0

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    const/4 v7, 0x1

    .line 34
    const/4 v8, 0x0

    .line 35
    :try_start_0
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lxa;->Z:Leg0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    :try_start_1
    iget-object v9, p0, Lxa;->Y:Landroid/hardware/camera2/CameraCaptureSession;

    .line 41
    .line 42
    iget-object p0, p0, Lxa;->f0:Landroid/os/Handler;

    .line 43
    .line 44
    invoke-virtual {v9, p1, p2, p0}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    goto :goto_3

    .line 53
    :catchall_0
    move-exception p0

    .line 54
    goto/16 :goto_4

    .line 55
    .line 56
    :catch_0
    move-exception p0

    .line 57
    :try_start_2
    instance-of p1, p0, Landroid/hardware/camera2/CameraAccessException;

    .line 58
    .line 59
    const/4 p2, 0x0

    .line 60
    if-eqz p1, :cond_5

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    check-cast p0, Landroid/hardware/camera2/CameraAccessException;

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/hardware/camera2/CameraAccessException;->getReason()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    const/4 v9, 0x3

    .line 72
    if-eq p1, v7, :cond_3

    .line 73
    .line 74
    const/4 v10, 0x2

    .line 75
    if-eq p1, v10, :cond_2

    .line 76
    .line 77
    if-eq p1, v9, :cond_4

    .line 78
    .line 79
    const/4 p2, 0x4

    .line 80
    if-eq p1, p2, :cond_1

    .line 81
    .line 82
    const/4 p2, 0x5

    .line 83
    if-eq p1, p2, :cond_0

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    const/16 p2, 0xb

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    move p2, v10

    .line 92
    goto :goto_0

    .line 93
    :cond_1
    move p2, v7

    .line 94
    goto :goto_0

    .line 95
    :cond_2
    const/4 p2, 0x6

    .line 96
    goto :goto_0

    .line 97
    :cond_3
    move p2, v9

    .line 98
    :cond_4
    :goto_0
    invoke-virtual {v1, p2, v2, v7}, Leg0;->a(ILjava/lang/String;Z)V

    .line 99
    .line 100
    .line 101
    :goto_1
    move-object p0, v8

    .line 102
    goto :goto_3

    .line 103
    :cond_5
    instance-of p1, p0, Ljava/lang/IllegalArgumentException;

    .line 104
    .line 105
    if-nez p1, :cond_8

    .line 106
    .line 107
    instance-of p1, p0, Ljava/lang/SecurityException;

    .line 108
    .line 109
    if-nez p1, :cond_8

    .line 110
    .line 111
    instance-of p1, p0, Ljava/lang/UnsupportedOperationException;

    .line 112
    .line 113
    if-nez p1, :cond_8

    .line 114
    .line 115
    instance-of p1, p0, Ljava/lang/NullPointerException;

    .line 116
    .line 117
    if-eqz p1, :cond_6

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_6
    instance-of p1, p0, Ljava/lang/IllegalStateException;

    .line 121
    .line 122
    if-eqz p1, :cond_7

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_7
    throw p0

    .line 126
    :cond_8
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    const/16 p0, 0x9

    .line 130
    .line 131
    invoke-virtual {v1, p0, v2, p2}, Leg0;->a(ILjava/lang/String;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :goto_3
    invoke-static {v3, v4}, Lp61;->h(J)J

    .line 136
    .line 137
    .line 138
    move-result-wide p1

    .line 139
    long-to-double p1, p1

    .line 140
    div-double/2addr p1, v5

    .line 141
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-static {v8, v0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    return-object p0

    .line 157
    :goto_4
    invoke-static {v3, v4}, Lp61;->h(J)J

    .line 158
    .line 159
    .line 160
    move-result-wide p1

    .line 161
    long-to-double p1, p1

    .line 162
    div-double/2addr p1, v5

    .line 163
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-static {v8, v0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    throw p0
.end method

.method public final R0(Ljava/util/ArrayList;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;
    .locals 11

    .line 1
    const-string v0, "%.3f ms"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "CXCP#captureBurst-"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Lxa;->X:Lza;

    .line 11
    .line 12
    iget-object v2, v2, Lza;->Z:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    const-wide v5, 0x412e848000000000L    # 1000000.0

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    const/4 v7, 0x1

    .line 31
    const/4 v8, 0x0

    .line 32
    :try_start_0
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lxa;->Z:Leg0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    :try_start_1
    iget-object v9, p0, Lxa;->Y:Landroid/hardware/camera2/CameraCaptureSession;

    .line 38
    .line 39
    iget-object p0, p0, Lxa;->f0:Landroid/os/Handler;

    .line 40
    .line 41
    invoke-virtual {v9, p1, p2, p0}, Landroid/hardware/camera2/CameraCaptureSession;->captureBurst(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    goto :goto_3

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :catch_0
    move-exception p0

    .line 54
    :try_start_2
    instance-of p1, p0, Landroid/hardware/camera2/CameraAccessException;

    .line 55
    .line 56
    const/4 p2, 0x0

    .line 57
    if-eqz p1, :cond_5

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    check-cast p0, Landroid/hardware/camera2/CameraAccessException;

    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/hardware/camera2/CameraAccessException;->getReason()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    const/4 v9, 0x3

    .line 69
    if-eq p1, v7, :cond_3

    .line 70
    .line 71
    const/4 v10, 0x2

    .line 72
    if-eq p1, v10, :cond_2

    .line 73
    .line 74
    if-eq p1, v9, :cond_4

    .line 75
    .line 76
    const/4 p2, 0x4

    .line 77
    if-eq p1, p2, :cond_1

    .line 78
    .line 79
    const/4 p2, 0x5

    .line 80
    if-eq p1, p2, :cond_0

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    const/16 p2, 0xb

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    move p2, v10

    .line 89
    goto :goto_0

    .line 90
    :cond_1
    move p2, v7

    .line 91
    goto :goto_0

    .line 92
    :cond_2
    const/4 p2, 0x6

    .line 93
    goto :goto_0

    .line 94
    :cond_3
    move p2, v9

    .line 95
    :cond_4
    :goto_0
    invoke-virtual {v1, p2, v2, v7}, Leg0;->a(ILjava/lang/String;Z)V

    .line 96
    .line 97
    .line 98
    :goto_1
    move-object p0, v8

    .line 99
    goto :goto_3

    .line 100
    :cond_5
    instance-of p1, p0, Ljava/lang/IllegalArgumentException;

    .line 101
    .line 102
    if-nez p1, :cond_8

    .line 103
    .line 104
    instance-of p1, p0, Ljava/lang/SecurityException;

    .line 105
    .line 106
    if-nez p1, :cond_8

    .line 107
    .line 108
    instance-of p1, p0, Ljava/lang/UnsupportedOperationException;

    .line 109
    .line 110
    if-nez p1, :cond_8

    .line 111
    .line 112
    instance-of p1, p0, Ljava/lang/NullPointerException;

    .line 113
    .line 114
    if-eqz p1, :cond_6

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_6
    instance-of p1, p0, Ljava/lang/IllegalStateException;

    .line 118
    .line 119
    if-eqz p1, :cond_7

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_7
    throw p0

    .line 123
    :cond_8
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    const/16 p0, 0x9

    .line 127
    .line 128
    invoke-virtual {v1, p0, v2, p2}, Leg0;->a(ILjava/lang/String;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :goto_3
    invoke-static {v3, v4}, Lp61;->h(J)J

    .line 133
    .line 134
    .line 135
    move-result-wide p1

    .line 136
    long-to-double p1, p1

    .line 137
    div-double/2addr p1, v5

    .line 138
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-static {v8, v0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    return-object p0

    .line 154
    :goto_4
    invoke-static {v3, v4}, Lp61;->h(J)J

    .line 155
    .line 156
    .line 157
    move-result-wide p1

    .line 158
    long-to-double p1, p1

    .line 159
    div-double/2addr p1, v5

    .line 160
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-static {v8, v0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    throw p0
.end method

.method public final b0()Z
    .locals 13

    .line 1
    const-string v0, "%.3f ms"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "CXCP#abortCaptures-"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Lxa;->X:Lza;

    .line 11
    .line 12
    iget-object v2, v2, Lza;->Z:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    const-wide v5, 0x412e848000000000L    # 1000000.0

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v8, 0x1

    .line 32
    :try_start_0
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lxa;->Z:Leg0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    const/4 v9, 0x0

    .line 38
    :try_start_1
    iget-object p0, p0, Lxa;->Y:Landroid/hardware/camera2/CameraCaptureSession;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/hardware/camera2/CameraCaptureSession;->abortCaptures()V

    .line 41
    .line 42
    .line 43
    sget-object p0, Ldn8;->a:Ldn8;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :catch_0
    move-exception p0

    .line 50
    :try_start_2
    instance-of v10, p0, Landroid/hardware/camera2/CameraAccessException;

    .line 51
    .line 52
    if-eqz v10, :cond_5

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    check-cast p0, Landroid/hardware/camera2/CameraAccessException;

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/hardware/camera2/CameraAccessException;->getReason()I

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    const/4 v11, 0x3

    .line 64
    if-eq v10, v8, :cond_4

    .line 65
    .line 66
    const/4 v12, 0x2

    .line 67
    if-eq v10, v12, :cond_3

    .line 68
    .line 69
    if-eq v10, v11, :cond_2

    .line 70
    .line 71
    const/4 v11, 0x4

    .line 72
    if-eq v10, v11, :cond_1

    .line 73
    .line 74
    const/4 v11, 0x5

    .line 75
    if-eq v10, v11, :cond_0

    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    const/16 v11, 0xb

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    move v11, v12

    .line 84
    goto :goto_0

    .line 85
    :cond_1
    move v11, v8

    .line 86
    goto :goto_0

    .line 87
    :cond_2
    move v11, v9

    .line 88
    goto :goto_0

    .line 89
    :cond_3
    const/4 v11, 0x6

    .line 90
    :cond_4
    :goto_0
    invoke-virtual {v1, v11, v2, v8}, Leg0;->a(ILjava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    :goto_1
    move-object p0, v7

    .line 94
    goto :goto_3

    .line 95
    :cond_5
    instance-of v10, p0, Ljava/lang/IllegalArgumentException;

    .line 96
    .line 97
    if-nez v10, :cond_8

    .line 98
    .line 99
    instance-of v10, p0, Ljava/lang/SecurityException;

    .line 100
    .line 101
    if-nez v10, :cond_8

    .line 102
    .line 103
    instance-of v10, p0, Ljava/lang/UnsupportedOperationException;

    .line 104
    .line 105
    if-nez v10, :cond_8

    .line 106
    .line 107
    instance-of v10, p0, Ljava/lang/NullPointerException;

    .line 108
    .line 109
    if-eqz v10, :cond_6

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_6
    instance-of v1, p0, Ljava/lang/IllegalStateException;

    .line 113
    .line 114
    if-eqz v1, :cond_7

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_7
    throw p0

    .line 118
    :cond_8
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    const/16 p0, 0x9

    .line 122
    .line 123
    invoke-virtual {v1, p0, v2, v9}, Leg0;->a(ILjava/lang/String;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :goto_3
    invoke-static {v3, v4}, Lp61;->h(J)J

    .line 128
    .line 129
    .line 130
    move-result-wide v1

    .line 131
    long-to-double v1, v1

    .line 132
    div-double/2addr v1, v5

    .line 133
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-static {v1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-static {v7, v0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    if-eqz p0, :cond_9

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_9
    move v8, v9

    .line 152
    :goto_4
    return v8

    .line 153
    :goto_5
    invoke-static {v3, v4}, Lp61;->h(J)J

    .line 154
    .line 155
    .line 156
    move-result-wide v1

    .line 157
    long-to-double v1, v1

    .line 158
    div-double/2addr v1, v5

    .line 159
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-static {v1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-static {v7, v0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    throw p0
.end method

.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lxa;->Y:Landroid/hardware/camera2/CameraCaptureSession;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/hardware/camera2/CameraCaptureSession;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getInputSurface()Landroid/view/Surface;
    .locals 0

    .line 1
    iget-object p0, p0, Lxa;->Y:Landroid/hardware/camera2/CameraCaptureSession;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/hardware/camera2/CameraCaptureSession;->getInputSurface()Landroid/view/Surface;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final i0()Lyh0;
    .locals 0

    .line 1
    iget-object p0, p0, Lxa;->X:Lza;

    .line 2
    .line 3
    return-object p0
.end method

.method public final x0(Ljava/util/List;)Z
    .locals 14

    .line 1
    const-string v0, "%.3f ms"

    .line 2
    .line 3
    iget-object v1, p0, Lxa;->X:Lza;

    .line 4
    .line 5
    iget-object v1, v1, Lza;->Z:Ljava/lang/String;

    .line 6
    .line 7
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v3, 0x1a

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-lt v2, v3, :cond_b

    .line 13
    .line 14
    const-string v2, "CXCP#finalizeOutputConfigurations-"

    .line 15
    .line 16
    invoke-static {v2, v1}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 21
    .line 22
    .line 23
    move-result-wide v5

    .line 24
    const-wide v7, 0x412e848000000000L    # 1000000.0

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    const/4 v9, 0x1

    .line 31
    :try_start_0
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, Lxa;->Z:Leg0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    :try_start_1
    iget-object p0, p0, Lxa;->Y:Landroid/hardware/camera2/CameraCaptureSession;

    .line 37
    .line 38
    new-instance v10, Ljava/util/ArrayList;

    .line 39
    .line 40
    const/16 v11, 0xa

    .line 41
    .line 42
    invoke-static {p1, v11}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 43
    .line 44
    .line 45
    move-result v11

    .line 46
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    if-eqz v11, :cond_0

    .line 58
    .line 59
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v11

    .line 63
    check-cast v11, Laf;

    .line 64
    .line 65
    const-class v12, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 66
    .line 67
    sget-object v13, Lyb6;->a:Lzb6;

    .line 68
    .line 69
    invoke-virtual {v13, v12}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 70
    .line 71
    .line 72
    move-result-object v12

    .line 73
    invoke-virtual {v11, v12}, Laf;->C0(Lzu3;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    check-cast v11, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 78
    .line 79
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception p0

    .line 84
    goto/16 :goto_6

    .line 85
    .line 86
    :catch_0
    move-exception p0

    .line 87
    goto :goto_1

    .line 88
    :cond_0
    invoke-static {p0, v10}, Lue3;->q(Landroid/hardware/camera2/CameraCaptureSession;Ljava/util/ArrayList;)V

    .line 89
    .line 90
    .line 91
    sget-object p0, Ldn8;->a:Ldn8;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :goto_1
    :try_start_2
    instance-of p1, p0, Landroid/hardware/camera2/CameraAccessException;

    .line 95
    .line 96
    if-eqz p1, :cond_6

    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    check-cast p0, Landroid/hardware/camera2/CameraAccessException;

    .line 102
    .line 103
    invoke-virtual {p0}, Landroid/hardware/camera2/CameraAccessException;->getReason()I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    const/4 v10, 0x3

    .line 108
    if-eq p1, v9, :cond_5

    .line 109
    .line 110
    const/4 v11, 0x2

    .line 111
    if-eq p1, v11, :cond_4

    .line 112
    .line 113
    if-eq p1, v10, :cond_3

    .line 114
    .line 115
    const/4 v10, 0x4

    .line 116
    if-eq p1, v10, :cond_2

    .line 117
    .line 118
    const/4 v10, 0x5

    .line 119
    if-eq p1, v10, :cond_1

    .line 120
    .line 121
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    const/16 v10, 0xb

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_1
    move v10, v11

    .line 128
    goto :goto_2

    .line 129
    :cond_2
    move v10, v9

    .line 130
    goto :goto_2

    .line 131
    :cond_3
    move v10, v4

    .line 132
    goto :goto_2

    .line 133
    :cond_4
    const/4 v10, 0x6

    .line 134
    :cond_5
    :goto_2
    invoke-virtual {v2, v10, v1, v9}, Leg0;->a(ILjava/lang/String;Z)V

    .line 135
    .line 136
    .line 137
    :goto_3
    move-object p0, v3

    .line 138
    goto :goto_5

    .line 139
    :cond_6
    instance-of p1, p0, Ljava/lang/IllegalArgumentException;

    .line 140
    .line 141
    if-nez p1, :cond_9

    .line 142
    .line 143
    instance-of p1, p0, Ljava/lang/SecurityException;

    .line 144
    .line 145
    if-nez p1, :cond_9

    .line 146
    .line 147
    instance-of p1, p0, Ljava/lang/UnsupportedOperationException;

    .line 148
    .line 149
    if-nez p1, :cond_9

    .line 150
    .line 151
    instance-of p1, p0, Ljava/lang/NullPointerException;

    .line 152
    .line 153
    if-eqz p1, :cond_7

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_7
    instance-of p1, p0, Ljava/lang/IllegalStateException;

    .line 157
    .line 158
    if-eqz p1, :cond_8

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_8
    throw p0

    .line 162
    :cond_9
    :goto_4
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    const/16 p0, 0x9

    .line 166
    .line 167
    invoke-virtual {v2, p0, v1, v4}, Leg0;->a(ILjava/lang/String;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :goto_5
    invoke-static {v5, v6}, Lp61;->h(J)J

    .line 172
    .line 173
    .line 174
    move-result-wide v1

    .line 175
    long-to-double v1, v1

    .line 176
    div-double/2addr v1, v7

    .line 177
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-static {p1, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-static {v3, v0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    if-eqz p0, :cond_a

    .line 193
    .line 194
    move v4, v9

    .line 195
    :cond_a
    return v4

    .line 196
    :goto_6
    invoke-static {v5, v6}, Lp61;->h(J)J

    .line 197
    .line 198
    .line 199
    move-result-wide v1

    .line 200
    long-to-double v1, v1

    .line 201
    div-double/2addr v1, v7

    .line 202
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-static {p1, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-static {v3, v0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    throw p0

    .line 218
    :cond_b
    const-string p0, "Attempting to call finalizeOutputConfigurations before O is not supported and may lead to to unexpected behavior if an application is expects this call to succeed."

    .line 219
    .line 220
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    return v4
.end method

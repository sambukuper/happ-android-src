.class public final Lbg0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Ls98;

.field public final b:Ljg0;

.field public final c:Lhk6;


# direct methods
.method public constructor <init>(Ls98;Ljg0;Lhk6;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lbg0;->a:Ls98;

    .line 14
    .line 15
    iput-object p2, p0, Lbg0;->b:Ljg0;

    .line 16
    .line 17
    iput-object p3, p0, Lbg0;->c:Lhk6;

    .line 18
    .line 19
    return-void
.end method

.method public static c(Lyh0;)V
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/SurfaceTexture;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/16 v2, 0x280

    .line 8
    .line 9
    const/16 v3, 0x1e0

    .line 10
    .line 11
    invoke-virtual {v0, v2, v3}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Landroid/view/Surface;

    .line 15
    .line 16
    invoke-direct {v2, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lnr4;->e(Z)Lpv;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v3, Ljava/util/concurrent/CountDownLatch;

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    invoke-direct {v3, v4}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 27
    .line 28
    .line 29
    new-instance v4, Lag0;

    .line 30
    .line 31
    invoke-direct {v4, v3, v1, v2, v0}, Lag0;-><init>(Ljava/util/concurrent/CountDownLatch;Lpv;Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-interface {p0, v5, v4}, Lyh0;->c0(Ljava/util/List;Lfh0;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    invoke-virtual {v1}, Lpv;->a()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_1

    .line 53
    .line 54
    invoke-virtual {v2}, Landroid/view/Surface;->release()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Lyh0;Landroid/hardware/camera2/CameraDevice;Ldb;Lpw;ZZ)V
    .locals 8

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v4, 0x0

    .line 5
    const-class v6, Landroid/hardware/camera2/CameraDevice;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget-object v0, Lyb6;->a:Lzb6;

    .line 10
    .line 11
    invoke-virtual {v0, v6}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {p1, v0}, Lbo8;->C0(Lzu3;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/hardware/camera2/CameraDevice;

    .line 20
    .line 21
    move-object v7, v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v7, v4

    .line 24
    :goto_0
    if-eqz v7, :cond_b

    .line 25
    .line 26
    invoke-virtual {v7}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lvi0;->a(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    if-eqz p2, :cond_2

    .line 37
    .line 38
    invoke-virtual {p2}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const-string p0, "Unwrapped camera device has camera ID "

    .line 50
    .line 51
    const-string p1, ", but the wrapped camera device has camera ID "

    .line 52
    .line 53
    invoke-static {p0, v0, p1}, Lp61;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p2}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const/16 p1, 0x21

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1

    .line 83
    :cond_2
    :goto_1
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 84
    .line 85
    const/16 v0, 0x1e

    .line 86
    .line 87
    if-lt p2, v0, :cond_4

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    if-ge p2, v0, :cond_3

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    iget-object p2, p4, Lpw;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 96
    .line 97
    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    :cond_4
    :goto_2
    invoke-static {v7}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    invoke-interface {p1}, Lyh0;->m()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    if-eqz p5, :cond_5

    .line 108
    .line 109
    const-string p2, "Camera2DeviceCloserImpl#reopenCameraDevice"

    .line 110
    .line 111
    :try_start_0
    invoke-static {p2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v7, p3}, Lbg0;->b(Landroid/hardware/camera2/CameraDevice;Ldb;)V

    .line 115
    .line 116
    .line 117
    iget-object v1, p0, Lbg0;->c:Lhk6;

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-static {v2}, Lvi0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    iget-object p2, v1, Lhk6;->h:Ls98;

    .line 129
    .line 130
    iget-object p2, p2, Ls98;->d:Lu61;

    .line 131
    .line 132
    new-instance v0, Lwu1;

    .line 133
    .line 134
    const/4 v5, 0x6

    .line 135
    move-object v3, p0

    .line 136
    invoke-direct/range {v0 .. v5}, Lwu1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 137
    .line 138
    .line 139
    invoke-static {p2, v0}, Lz51;->R(Ls61;Lrn2;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    check-cast p0, Lf00;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    .line 145
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :catchall_0
    move-exception v0

    .line 150
    move-object p0, v0

    .line 151
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 152
    .line 153
    .line 154
    throw p0

    .line 155
    :cond_5
    move-object v3, p0

    .line 156
    new-instance p0, Lf00;

    .line 157
    .line 158
    invoke-direct {p0, p1, p3}, Lf00;-><init>(Lyh0;Ldb;)V

    .line 159
    .line 160
    .line 161
    :goto_3
    iget-object p2, p0, Lf00;->a:Lyh0;

    .line 162
    .line 163
    iget-object p0, p0, Lf00;->b:Ldb;

    .line 164
    .line 165
    if-eqz p2, :cond_8

    .line 166
    .line 167
    if-nez p0, :cond_6

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_6
    if-eqz p6, :cond_7

    .line 171
    .line 172
    const-string p4, "Camera2DeviceCloserImpl#createCaptureSession"

    .line 173
    .line 174
    :try_start_1
    invoke-static {p4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v2}, Lvi0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    invoke-static {p2}, Lbg0;->c(Lyh0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 181
    .line 182
    .line 183
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 184
    .line 185
    .line 186
    goto :goto_4

    .line 187
    :catchall_1
    move-exception v0

    .line 188
    move-object p0, v0

    .line 189
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 190
    .line 191
    .line 192
    throw p0

    .line 193
    :cond_7
    :goto_4
    new-instance v4, Lqg5;

    .line 194
    .line 195
    invoke-direct {v4, p2, p0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :cond_8
    :goto_5
    if-nez v4, :cond_9

    .line 199
    .line 200
    invoke-interface {p1}, Lyh0;->J()V

    .line 201
    .line 202
    .line 203
    invoke-interface {p1}, Lyh0;->B0()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p3, v7}, Ldb;->d(Landroid/hardware/camera2/CameraDevice;)V

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :cond_9
    iget-object p0, v4, Lqg5;->X:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast p0, Lyh0;

    .line 213
    .line 214
    iget-object p2, v4, Lqg5;->Y:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast p2, Ldb;

    .line 217
    .line 218
    sget-object p4, Lyb6;->a:Lzb6;

    .line 219
    .line 220
    invoke-virtual {p4, v6}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 221
    .line 222
    .line 223
    move-result-object p4

    .line 224
    invoke-interface {p0, p4}, Lbo8;->C0(Lzu3;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    if-eqz p0, :cond_a

    .line 229
    .line 230
    check-cast p0, Landroid/hardware/camera2/CameraDevice;

    .line 231
    .line 232
    invoke-interface {p1}, Lyh0;->J()V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3, p0, p2}, Lbg0;->b(Landroid/hardware/camera2/CameraDevice;Ldb;)V

    .line 236
    .line 237
    .line 238
    invoke-interface {p1}, Lyh0;->B0()V

    .line 239
    .line 240
    .line 241
    if-eqz p5, :cond_c

    .line 242
    .line 243
    invoke-virtual {p3, v7}, Ldb;->d(Landroid/hardware/camera2/CameraDevice;)V

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :cond_a
    const-string p0, "Required value was null."

    .line 248
    .line 249
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    return-void

    .line 253
    :cond_b
    move-object v3, p0

    .line 254
    if-eqz p2, :cond_c

    .line 255
    .line 256
    invoke-virtual {v3, p2, p3}, Lbg0;->b(Landroid/hardware/camera2/CameraDevice;Ldb;)V

    .line 257
    .line 258
    .line 259
    :cond_c
    return-void
.end method

.method public final b(Landroid/hardware/camera2/CameraDevice;Ldb;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v0, Laa6;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lki;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-direct {v1, p1, v0, v2, v3}, Lki;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, Lbg0;->a:Ls98;

    .line 21
    .line 22
    const-wide/16 v3, 0x1b58

    .line 23
    .line 24
    invoke-virtual {v2, v3, v4, v1}, Ls98;->b(JLgn2;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ldn8;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Lvi0;->a(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lbg0;->b:Ljg0;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Ljg0;->b:Ltl7;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    sget-object v1, Ljj0;->h:Lij0;

    .line 51
    .line 52
    iget-object p0, p0, Ljg0;->a:Lig0;

    .line 53
    .line 54
    check-cast p0, Lhg0;

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Lhg0;->a(Ljava/lang/String;)Ljj0;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-static {p0}, Lij0;->c(Ljj0;)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-eqz p0, :cond_1

    .line 68
    .line 69
    iget-boolean p0, v0, Laa6;->X:Z

    .line 70
    .line 71
    if-eqz p0, :cond_1

    .line 72
    .line 73
    invoke-static {p1}, Lvi0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    iget-object p0, p2, Ldb;->r:Ljava/util/concurrent/CountDownLatch;

    .line 77
    .line 78
    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 79
    .line 80
    const-wide/16 v0, 0x7d0

    .line 81
    .line 82
    invoke-virtual {p0, v0, v1, p2}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-eqz p0, :cond_0

    .line 87
    .line 88
    invoke-static {p1}, Lvi0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_0
    invoke-static {p1}, Lvi0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    :cond_1
    return-void
.end method

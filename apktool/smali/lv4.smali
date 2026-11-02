.class public final Llv4;
.super Lhq8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final q:Lqj0;

.field public final r:Lwp1;

.field public final s:Landroid/util/Size;

.field public final t:Ljava/lang/Object;

.field public u:Lc57;

.field public v:Lv73;


# direct methods
.method public constructor <init>(Lqj0;Lkv4;Lwp1;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2}, Lhq8;-><init>(Ler8;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Llv4;->q:Lqj0;

    .line 11
    .line 12
    iput-object p3, p0, Llv4;->r:Lwp1;

    .line 13
    .line 14
    sget-object p2, Lnv4;->a:Landroid/util/Size;

    .line 15
    .line 16
    iget-object p1, p1, Lqj0;->b:Ljj0;

    .line 17
    .line 18
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast p1, Llf0;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    invoke-static {}, Lhi5;->j0()Z

    .line 35
    .line 36
    .line 37
    move-object p1, v0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/16 v1, 0x22

    .line 40
    .line 41
    invoke-virtual {p1, v1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :goto_0
    if-nez p1, :cond_1

    .line 46
    .line 47
    goto/16 :goto_6

    .line 48
    .line 49
    :cond_1
    array-length v1, p1

    .line 50
    if-nez v1, :cond_2

    .line 51
    .line 52
    goto/16 :goto_6

    .line 53
    .line 54
    :cond_2
    sget-object p2, Lix7;->a:Landroid/util/Size;

    .line 55
    .line 56
    const-class p2, Landroidx/camera/camera2/compat/quirk/RepeatingStreamConstraintForVideoRecordingQuirk;

    .line 57
    .line 58
    invoke-static {}, Lum1;->a()Li26;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1, p2}, Li26;->b(Ljava/lang/Class;)Lf26;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    check-cast p2, Landroidx/camera/camera2/compat/quirk/RepeatingStreamConstraintForVideoRecordingQuirk;

    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    if-nez p2, :cond_3

    .line 70
    .line 71
    move-object p2, p1

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    new-instance p2, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    array-length v2, p1

    .line 79
    move v3, v1

    .line 80
    :goto_1
    if-ge v3, v2, :cond_5

    .line 81
    .line 82
    aget-object v4, p1, v3

    .line 83
    .line 84
    sget-object v5, Lix7;->b:Lrx0;

    .line 85
    .line 86
    sget-object v6, Lix7;->a:Landroid/util/Size;

    .line 87
    .line 88
    invoke-virtual {v5, v4, v6}, Lrx0;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-ltz v5, :cond_4

    .line 93
    .line 94
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_5
    new-array v2, v1, [Landroid/util/Size;

    .line 101
    .line 102
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    check-cast p2, [Landroid/util/Size;

    .line 107
    .line 108
    :goto_2
    array-length v2, p2

    .line 109
    if-nez v2, :cond_6

    .line 110
    .line 111
    invoke-static {}, Lhi5;->m0()Z

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_6
    move-object p1, p2

    .line 116
    :goto_3
    array-length p2, p1

    .line 117
    const/4 v2, 0x1

    .line 118
    if-le p2, v2, :cond_7

    .line 119
    .line 120
    new-instance p2, Lmv4;

    .line 121
    .line 122
    invoke-direct {p2, v1}, Lmv4;-><init>(B)V

    .line 123
    .line 124
    .line 125
    array-length v3, p1

    .line 126
    if-le v3, v2, :cond_7

    .line 127
    .line 128
    invoke-static {p1, p2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 129
    .line 130
    .line 131
    :cond_7
    invoke-virtual {p3}, Lwp1;->c()Landroid/util/Size;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    .line 136
    .line 137
    .line 138
    move-result p3

    .line 139
    int-to-long v2, p3

    .line 140
    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    int-to-long p2, p2

    .line 145
    mul-long/2addr v2, p2

    .line 146
    const-wide/32 p2, 0x4b000

    .line 147
    .line 148
    .line 149
    invoke-static {p2, p3, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 150
    .line 151
    .line 152
    move-result-wide p2

    .line 153
    array-length v2, p1

    .line 154
    move v3, v1

    .line 155
    :goto_4
    if-ge v3, v2, :cond_b

    .line 156
    .line 157
    aget-object v4, p1, v3

    .line 158
    .line 159
    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    int-to-long v5, v5

    .line 164
    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    int-to-long v7, v7

    .line 169
    mul-long/2addr v5, v7

    .line 170
    cmp-long v5, v5, p2

    .line 171
    .line 172
    if-nez v5, :cond_8

    .line 173
    .line 174
    move-object p2, v4

    .line 175
    goto :goto_6

    .line 176
    :cond_8
    if-lez v5, :cond_a

    .line 177
    .line 178
    if-nez v0, :cond_9

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_9
    move-object p2, v0

    .line 182
    goto :goto_6

    .line 183
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 184
    .line 185
    move-object v0, v4

    .line 186
    goto :goto_4

    .line 187
    :cond_b
    :goto_5
    if-nez v0, :cond_9

    .line 188
    .line 189
    aget-object p2, p1, v1

    .line 190
    .line 191
    :goto_6
    iput-object p2, p0, Llv4;->s:Landroid/util/Size;

    .line 192
    .line 193
    new-instance p1, Ljava/lang/Object;

    .line 194
    .line 195
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 196
    .line 197
    .line 198
    iput-object p1, p0, Llv4;->t:Ljava/lang/Object;

    .line 199
    .line 200
    return-void
.end method


# virtual methods
.method public final A(Liz;Liz;)Liz;
    .locals 1

    .line 1
    iget-object p2, p0, Llv4;->s:Landroid/util/Size;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Llv4;->J(Landroid/util/Size;)Lb57;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lb57;->c()Lf57;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, v0}, Lhq8;->G(Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Liz;->b()Lxy0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    iput-object p2, p0, Lxy0;->Y:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {p0}, Lxy0;->b()Liz;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public final B()V
    .locals 3

    .line 1
    iget-object v0, p0, Llv4;->u:Lc57;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lc57;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Llv4;->u:Lc57;

    .line 10
    .line 11
    iget-object v1, p0, Llv4;->t:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1

    .line 14
    :try_start_0
    iget-object v2, p0, Llv4;->v:Lv73;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v2}, Lwg1;->a()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    iput-object v0, p0, Llv4;->v:Lv73;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    monitor-exit v1

    .line 27
    return-void

    .line 28
    :goto_1
    monitor-exit v1

    .line 29
    throw p0
.end method

.method public final I(Landroid/util/Size;)Lv73;
    .locals 4

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
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v0, v1, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Landroid/view/Surface;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, Llv4;->v:Lv73;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v2}, Lwg1;->a()V

    .line 28
    .line 29
    .line 30
    :cond_0
    new-instance v2, Lv73;

    .line 31
    .line 32
    iget-object v3, p0, Lhq8;->h:Ler8;

    .line 33
    .line 34
    invoke-interface {v3}, Le63;->n()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-direct {v2, v1, p1, v3}, Lv73;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    .line 39
    .line 40
    .line 41
    iput-object v2, p0, Llv4;->v:Lv73;

    .line 42
    .line 43
    iget-object p0, v2, Lwg1;->e:Lud0;

    .line 44
    .line 45
    invoke-static {p0}, Lvr3;->P(Lxb4;)Lxb4;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    new-instance p1, Lsc4;

    .line 50
    .line 51
    const/4 v3, 0x4

    .line 52
    invoke-direct {p1, v1, v0, v3}, Lsc4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, Ldp1;->a()Ldp1;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-interface {p0, p1, v0}, Lxb4;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 60
    .line 61
    .line 62
    return-object v2
.end method

.method public final J(Landroid/util/Size;)Lb57;
    .locals 4

    .line 1
    iget-object v0, p0, Llv4;->t:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, Llv4;->I(Landroid/util/Size;)Lv73;

    .line 5
    .line 6
    .line 7
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit v0

    .line 9
    iget-object v0, p0, Llv4;->u:Lc57;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lc57;->b()V

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance v0, Lc57;

    .line 17
    .line 18
    new-instance v2, Le53;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    invoke-direct {v2, p0, p1, v3}, Le53;-><init>(Lhq8;Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v2}, Lc57;-><init>(Ld57;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Llv4;->u:Lc57;

    .line 28
    .line 29
    new-instance p0, Lkv4;

    .line 30
    .line 31
    invoke-direct {p0}, Lkv4;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-static {p0, p1}, Lb57;->d(Ler8;Landroid/util/Size;)Lb57;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    iget-object p1, p0, La57;->b:Lxm0;

    .line 39
    .line 40
    iput v3, p1, Lxm0;->Y:I

    .line 41
    .line 42
    sget-object p1, Lpx1;->d:Lpx1;

    .line 43
    .line 44
    const/4 v2, -0x1

    .line 45
    invoke-virtual {p0, v1, p1, v2}, Lb57;->b(Lwg1;Lpx1;I)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, La57;->f:Lc57;

    .line 49
    .line 50
    return-object p0

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    monitor-exit v0

    .line 53
    throw p0
.end method

.method public final g(ZLhr8;)Ler8;
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Llv4;->q:Lqj0;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Llv4;->r:Lwp1;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance p0, Lkv4;

    .line 15
    .line 16
    invoke-direct {p0}, Lkv4;-><init>()V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public final m(Ll11;)Ldr8;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Lk42;

    .line 5
    .line 6
    iget-object v0, p0, Llv4;->q:Lqj0;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Llv4;->r:Lwp1;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    return-object p1
.end method

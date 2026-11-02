.class public final Lza;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lyh0;


# instance fields
.field public final X:Ljj0;

.field public final Y:Landroid/hardware/camera2/CameraDevice;

.field public final Z:Ljava/lang/String;

.field public final f0:Leg0;

.field public final g0:Ldq;

.field public final h0:Ls98;

.field public final i0:Lpv;

.field public final j0:Ltv;


# direct methods
.method public constructor <init>(Ljj0;Landroid/hardware/camera2/CameraDevice;Ljava/lang/String;Leg0;Ldq;Ls98;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lza;->X:Ljj0;

    .line 17
    .line 18
    iput-object p2, p0, Lza;->Y:Landroid/hardware/camera2/CameraDevice;

    .line 19
    .line 20
    iput-object p3, p0, Lza;->Z:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p4, p0, Lza;->f0:Leg0;

    .line 23
    .line 24
    iput-object p5, p0, Lza;->g0:Ldq;

    .line 25
    .line 26
    iput-object p6, p0, Lza;->h0:Ls98;

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-static {p1}, Lnr4;->e(Z)Lpv;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lza;->i0:Lpv;

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    invoke-static {p1}, Lnr4;->g(Ljava/lang/Object;)Ltv;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lza;->j0:Ltv;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final B0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lza;->i0:Lpv;

    .line 2
    .line 3
    invoke-virtual {v0}, Lpv;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lza;->j0:Ltv;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Ltv;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ln57;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lza;->c(Ln57;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    :cond_1
    const-string p0, "Check failed."

    .line 25
    .line 26
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final C(I)V
    .locals 6

    .line 1
    const-string v0, "setCameraAudioRestriction"

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lza;->Z:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v1, p0, Lza;->f0:Leg0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    :try_start_1
    iget-object p0, p0, Lza;->Y:Landroid/hardware/camera2/CameraDevice;

    .line 11
    .line 12
    invoke-static {p0, p1}, Lb4;->p(Landroid/hardware/camera2/CameraDevice;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    .line 14
    .line 15
    goto :goto_2

    .line 16
    :catch_0
    move-exception p0

    .line 17
    :try_start_2
    instance-of p1, p0, Landroid/hardware/camera2/CameraAccessException;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz p1, :cond_5

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    check-cast p0, Landroid/hardware/camera2/CameraAccessException;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/hardware/camera2/CameraAccessException;->getReason()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x3

    .line 33
    if-eq p1, v3, :cond_3

    .line 34
    .line 35
    const/4 v5, 0x2

    .line 36
    if-eq p1, v5, :cond_2

    .line 37
    .line 38
    if-eq p1, v4, :cond_4

    .line 39
    .line 40
    const/4 v2, 0x4

    .line 41
    if-eq p1, v2, :cond_1

    .line 42
    .line 43
    const/4 v2, 0x5

    .line 44
    if-eq p1, v2, :cond_0

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    const/16 v2, 0xb

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move v2, v5

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move v2, v3

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    const/4 v2, 0x6

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    move v2, v4

    .line 59
    :cond_4
    :goto_0
    invoke-virtual {v1, v2, v0, v3}, Leg0;->a(ILjava/lang/String;Z)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_5
    instance-of p1, p0, Ljava/lang/IllegalArgumentException;

    .line 64
    .line 65
    if-nez p1, :cond_8

    .line 66
    .line 67
    instance-of p1, p0, Ljava/lang/SecurityException;

    .line 68
    .line 69
    if-nez p1, :cond_8

    .line 70
    .line 71
    instance-of p1, p0, Ljava/lang/UnsupportedOperationException;

    .line 72
    .line 73
    if-nez p1, :cond_8

    .line 74
    .line 75
    instance-of p1, p0, Ljava/lang/NullPointerException;

    .line 76
    .line 77
    if-eqz p1, :cond_6

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_6
    instance-of p1, p0, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    if-eqz p1, :cond_7

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_7
    throw p0

    .line 86
    :cond_8
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    const/16 p0, 0x9

    .line 90
    .line 91
    invoke-virtual {v1, p0, v0, v2}, Leg0;->a(ILjava/lang/String;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 92
    .line 93
    .line 94
    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :catchall_0
    move-exception p0

    .line 99
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 100
    .line 101
    .line 102
    throw p0
.end method

.method public final C0(Lzu3;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-class v0, Landroid/hardware/camera2/CameraDevice;

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
    iget-object p0, p0, Lza;->Y:Landroid/hardware/camera2/CameraDevice;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public final H0(Lw62;)Z
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    iget-object v6, v7, Lw62;->b:Lhv;

    .line 6
    .line 7
    const-string v8, "%.3f ms"

    .line 8
    .line 9
    iget-object v9, v1, Lza;->Y:Landroid/hardware/camera2/CameraDevice;

    .line 10
    .line 11
    iget-object v0, v7, Lw62;->f:Ljava/lang/Integer;

    .line 12
    .line 13
    iget-object v2, v7, Lw62;->g:Lx62;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lza;->a(Ln57;)Lqg5;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v4, v3, Lqg5;->X:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    iget-object v3, v3, Lqg5;->Y:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v3, Ln57;

    .line 30
    .line 31
    const/4 v10, 0x0

    .line 32
    if-nez v4, :cond_0

    .line 33
    .line 34
    return v10

    .line 35
    :cond_0
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-virtual {v1, v3}, Lza;->b(Ln57;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    const-string v4, "CXCP#createExtensionSession-"

    .line 41
    .line 42
    iget-object v11, v1, Lza;->Z:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v4, v11}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 49
    .line 50
    .line 51
    move-result-wide v12

    .line 52
    const-wide v16, 0x412e848000000000L    # 1000000.0

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    :try_start_0
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-object v15, v1, Lza;->f0:Leg0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-object v4, v7, Lw62;->a:Ljava/util/ArrayList;

    .line 67
    .line 68
    new-instance v10, Ljava/util/ArrayList;

    .line 69
    .line 70
    const/16 v5, 0xa

    .line 71
    .line 72
    invoke-static {v4, v5}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    invoke-direct {v10, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    const-class v14, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 88
    .line 89
    if-eqz v5, :cond_2

    .line 90
    .line 91
    :try_start_2
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    check-cast v5, Laf;

    .line 96
    .line 97
    move/from16 v18, v0

    .line 98
    .line 99
    sget-object v0, Lyb6;->a:Lzb6;

    .line 100
    .line 101
    invoke-virtual {v0, v14}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v5, v0}, Laf;->C0(Lzu3;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 110
    .line 111
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move/from16 v0, v18

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :catchall_0
    move-exception v0

    .line 118
    move-wide/from16 v19, v12

    .line 119
    .line 120
    const/4 v12, 0x0

    .line 121
    goto/16 :goto_a

    .line 122
    .line 123
    :catch_0
    move-exception v0

    .line 124
    move-wide/from16 v19, v12

    .line 125
    .line 126
    const/4 v12, 0x0

    .line 127
    goto :goto_3

    .line 128
    :cond_2
    move/from16 v18, v0

    .line 129
    .line 130
    new-instance v0, Lxd;

    .line 131
    .line 132
    iget-object v4, v1, Lza;->f0:Leg0;

    .line 133
    .line 134
    iget-object v5, v1, Lza;->g0:Ldq;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    .line 136
    move-wide/from16 v19, v12

    .line 137
    .line 138
    move/from16 v13, v18

    .line 139
    .line 140
    const/4 v12, 0x0

    .line 141
    :try_start_3
    invoke-direct/range {v0 .. v6}, Lxd;-><init>(Lza;Lx62;Ln57;Leg0;Ldq;Lhv;)V

    .line 142
    .line 143
    .line 144
    new-instance v2, Landroid/hardware/camera2/params/ExtensionSessionConfiguration;

    .line 145
    .line 146
    invoke-direct {v2, v13, v10, v6, v0}, Landroid/hardware/camera2/params/ExtensionSessionConfiguration;-><init>(ILjava/util/List;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraExtensionSession$StateCallback;)V

    .line 147
    .line 148
    .line 149
    iget-object v0, v7, Lw62;->h:Laf;

    .line 150
    .line 151
    if-eqz v0, :cond_4

    .line 152
    .line 153
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 154
    .line 155
    const/16 v5, 0x22

    .line 156
    .line 157
    if-lt v4, v5, :cond_4

    .line 158
    .line 159
    sget-object v4, Lyb6;->a:Lzb6;

    .line 160
    .line 161
    invoke-virtual {v4, v14}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    invoke-virtual {v0, v4}, Laf;->C0(Lzu3;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    check-cast v0, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 170
    .line 171
    if-eqz v0, :cond_3

    .line 172
    .line 173
    invoke-static {v2, v0}, Lu3;->G(Landroid/hardware/camera2/params/ExtensionSessionConfiguration;Landroid/hardware/camera2/params/OutputConfiguration;)V

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :catchall_1
    move-exception v0

    .line 178
    goto/16 :goto_a

    .line 179
    .line 180
    :catch_1
    move-exception v0

    .line 181
    goto :goto_3

    .line 182
    :cond_3
    const-string v0, "Failed to unwrap Postview OutputConfiguration"

    .line 183
    .line 184
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 185
    .line 186
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw v2

    .line 190
    :cond_4
    :goto_1
    invoke-virtual {v9, v2}, Landroid/hardware/camera2/CameraDevice;->createExtensionSession(Landroid/hardware/camera2/params/ExtensionSessionConfiguration;)V

    .line 191
    .line 192
    .line 193
    sget-object v5, Ldn8;->a:Ldn8;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 194
    .line 195
    :goto_2
    const/4 v2, 0x0

    .line 196
    goto :goto_8

    .line 197
    :goto_3
    :try_start_4
    instance-of v2, v0, Landroid/hardware/camera2/CameraAccessException;

    .line 198
    .line 199
    if-eqz v2, :cond_a

    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    check-cast v0, Landroid/hardware/camera2/CameraAccessException;

    .line 205
    .line 206
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraAccessException;->getReason()I

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    const/4 v4, 0x3

    .line 211
    const/4 v5, 0x1

    .line 212
    if-eq v2, v5, :cond_9

    .line 213
    .line 214
    const/4 v5, 0x2

    .line 215
    if-eq v2, v5, :cond_8

    .line 216
    .line 217
    if-eq v2, v4, :cond_7

    .line 218
    .line 219
    const/4 v4, 0x4

    .line 220
    if-eq v2, v4, :cond_6

    .line 221
    .line 222
    const/4 v4, 0x5

    .line 223
    if-eq v2, v4, :cond_5

    .line 224
    .line 225
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    const/16 v0, 0xb

    .line 229
    .line 230
    :goto_4
    const/4 v5, 0x1

    .line 231
    goto :goto_5

    .line 232
    :cond_5
    move v0, v5

    .line 233
    goto :goto_4

    .line 234
    :cond_6
    const/4 v0, 0x1

    .line 235
    goto :goto_4

    .line 236
    :cond_7
    const/4 v0, 0x0

    .line 237
    goto :goto_4

    .line 238
    :cond_8
    const/4 v0, 0x6

    .line 239
    goto :goto_4

    .line 240
    :cond_9
    move v0, v4

    .line 241
    :goto_5
    invoke-virtual {v15, v0, v11, v5}, Leg0;->a(ILjava/lang/String;Z)V

    .line 242
    .line 243
    .line 244
    :goto_6
    move-object v5, v12

    .line 245
    goto :goto_2

    .line 246
    :cond_a
    instance-of v2, v0, Ljava/lang/IllegalArgumentException;

    .line 247
    .line 248
    if-nez v2, :cond_d

    .line 249
    .line 250
    instance-of v2, v0, Ljava/lang/SecurityException;

    .line 251
    .line 252
    if-nez v2, :cond_d

    .line 253
    .line 254
    instance-of v2, v0, Ljava/lang/UnsupportedOperationException;

    .line 255
    .line 256
    if-nez v2, :cond_d

    .line 257
    .line 258
    instance-of v2, v0, Ljava/lang/NullPointerException;

    .line 259
    .line 260
    if-eqz v2, :cond_b

    .line 261
    .line 262
    goto :goto_7

    .line 263
    :cond_b
    instance-of v2, v0, Ljava/lang/IllegalStateException;

    .line 264
    .line 265
    if-eqz v2, :cond_c

    .line 266
    .line 267
    goto :goto_6

    .line 268
    :cond_c
    throw v0

    .line 269
    :cond_d
    :goto_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    const/16 v0, 0x9

    .line 273
    .line 274
    const/4 v2, 0x0

    .line 275
    invoke-virtual {v15, v0, v11, v2}, Leg0;->a(ILjava/lang/String;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 276
    .line 277
    .line 278
    move-object v5, v12

    .line 279
    :goto_8
    invoke-static/range {v19 .. v20}, Lp61;->h(J)J

    .line 280
    .line 281
    .line 282
    move-result-wide v6

    .line 283
    long-to-double v6, v6

    .line 284
    div-double v6, v6, v16

    .line 285
    .line 286
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    const/4 v4, 0x1

    .line 295
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-static {v12, v8, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    if-nez v5, :cond_e

    .line 303
    .line 304
    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    if-eqz v3, :cond_e

    .line 308
    .line 309
    invoke-virtual {v1, v3}, Lza;->c(Ln57;)V

    .line 310
    .line 311
    .line 312
    :cond_e
    if-eqz v5, :cond_f

    .line 313
    .line 314
    const/4 v10, 0x1

    .line 315
    goto :goto_9

    .line 316
    :cond_f
    move v10, v2

    .line 317
    :goto_9
    return v10

    .line 318
    :goto_a
    invoke-static/range {v19 .. v20}, Lp61;->h(J)J

    .line 319
    .line 320
    .line 321
    move-result-wide v1

    .line 322
    long-to-double v1, v1

    .line 323
    div-double v1, v1, v16

    .line 324
    .line 325
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    const/4 v5, 0x1

    .line 334
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    invoke-static {v12, v8, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    throw v0
.end method

.method public final J()V
    .locals 1

    .line 1
    iget-object v0, p0, Lza;->i0:Lpv;

    .line 2
    .line 3
    invoke-virtual {v0}, Lpv;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lza;->j0:Ltv;

    .line 10
    .line 11
    iget-object v0, v0, Ltv;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ln57;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lza;->b(Ln57;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final J0(Ljava/util/ArrayList;Lsn0;)Z
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v7, "%.3f ms"

    .line 4
    .line 5
    iget-object v8, v1, Lza;->h0:Ls98;

    .line 6
    .line 7
    iget-object v9, v1, Lza;->Y:Landroid/hardware/camera2/CameraDevice;

    .line 8
    .line 9
    move-object/from16 v2, p2

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lza;->a(Ln57;)Lqg5;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v3, v0, Lqg5;->X:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iget-object v0, v0, Lqg5;->Y:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v4, v0

    .line 26
    check-cast v4, Ln57;

    .line 27
    .line 28
    const/4 v10, 0x0

    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    return v10

    .line 32
    :cond_0
    if-eqz v4, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1, v4}, Lza;->b(Ln57;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    const-string v0, "CXCP#createConstrainedHighSpeedCaptureSession-"

    .line 38
    .line 39
    iget-object v11, v1, Lza;->Z:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v0, v11}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 46
    .line 47
    .line 48
    move-result-wide v12

    .line 49
    const/4 v3, 0x0

    .line 50
    const/4 v5, 0x1

    .line 51
    :try_start_0
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v6, v1, Lza;->f0:Leg0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 55
    .line 56
    :try_start_1
    new-instance v0, Lhb;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 57
    .line 58
    move-object/from16 v16, v3

    .line 59
    .line 60
    move-object v3, v4

    .line 61
    :try_start_2
    iget-object v4, v1, Lza;->f0:Leg0;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 62
    .line 63
    move/from16 v17, v5

    .line 64
    .line 65
    :try_start_3
    iget-object v5, v1, Lza;->g0:Ldq;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 66
    .line 67
    move-object/from16 v18, v6

    .line 68
    .line 69
    :try_start_4
    invoke-virtual {v8}, Ls98;->a()Landroid/os/Handler;

    .line 70
    .line 71
    .line 72
    move-result-object v6
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 73
    move/from16 v15, v17

    .line 74
    .line 75
    move-object/from16 v14, v18

    .line 76
    .line 77
    const-wide v19, 0x412e848000000000L    # 1000000.0

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    :try_start_5
    invoke-direct/range {v0 .. v6}, Lhb;-><init>(Lza;Lfh0;Ln57;Leg0;Ldq;Landroid/os/Handler;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v8}, Ls98;->a()Landroid/os/Handler;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    move-object/from16 v4, p1

    .line 90
    .line 91
    invoke-virtual {v9, v4, v0, v2}, Landroid/hardware/camera2/CameraDevice;->createConstrainedHighSpeedCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V

    .line 92
    .line 93
    .line 94
    sget-object v0, Ldn8;->a:Ldn8;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 95
    .line 96
    goto/16 :goto_7

    .line 97
    .line 98
    :catchall_0
    move-exception v0

    .line 99
    goto/16 :goto_8

    .line 100
    .line 101
    :catch_0
    move-exception v0

    .line 102
    goto :goto_3

    .line 103
    :catchall_1
    move-exception v0

    .line 104
    move/from16 v15, v17

    .line 105
    .line 106
    :goto_0
    const-wide v19, 0x412e848000000000L    # 1000000.0

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    goto/16 :goto_8

    .line 112
    .line 113
    :catch_1
    move-exception v0

    .line 114
    move/from16 v15, v17

    .line 115
    .line 116
    move-object/from16 v14, v18

    .line 117
    .line 118
    :goto_1
    const-wide v19, 0x412e848000000000L    # 1000000.0

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :catch_2
    move-exception v0

    .line 125
    move-object v14, v6

    .line 126
    move/from16 v15, v17

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :catchall_2
    move-exception v0

    .line 130
    move v15, v5

    .line 131
    goto :goto_0

    .line 132
    :catch_3
    move-exception v0

    .line 133
    :goto_2
    move v15, v5

    .line 134
    move-object v14, v6

    .line 135
    goto :goto_1

    .line 136
    :catch_4
    move-exception v0

    .line 137
    move-object v3, v4

    .line 138
    goto :goto_2

    .line 139
    :goto_3
    :try_start_6
    instance-of v2, v0, Landroid/hardware/camera2/CameraAccessException;

    .line 140
    .line 141
    if-eqz v2, :cond_7

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    check-cast v0, Landroid/hardware/camera2/CameraAccessException;

    .line 147
    .line 148
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraAccessException;->getReason()I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    const/4 v5, 0x3

    .line 153
    if-eq v2, v15, :cond_6

    .line 154
    .line 155
    const/4 v4, 0x2

    .line 156
    if-eq v2, v4, :cond_5

    .line 157
    .line 158
    if-eq v2, v5, :cond_4

    .line 159
    .line 160
    const/4 v5, 0x4

    .line 161
    if-eq v2, v5, :cond_3

    .line 162
    .line 163
    const/4 v5, 0x5

    .line 164
    if-eq v2, v5, :cond_2

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    const/16 v5, 0xb

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_2
    move v5, v4

    .line 173
    goto :goto_4

    .line 174
    :cond_3
    move v5, v15

    .line 175
    goto :goto_4

    .line 176
    :cond_4
    move v5, v10

    .line 177
    goto :goto_4

    .line 178
    :cond_5
    const/4 v5, 0x6

    .line 179
    :cond_6
    :goto_4
    invoke-virtual {v14, v5, v11, v15}, Leg0;->a(ILjava/lang/String;Z)V

    .line 180
    .line 181
    .line 182
    :goto_5
    const/4 v0, 0x0

    .line 183
    goto :goto_7

    .line 184
    :cond_7
    instance-of v2, v0, Ljava/lang/IllegalArgumentException;

    .line 185
    .line 186
    if-nez v2, :cond_a

    .line 187
    .line 188
    instance-of v2, v0, Ljava/lang/SecurityException;

    .line 189
    .line 190
    if-nez v2, :cond_a

    .line 191
    .line 192
    instance-of v2, v0, Ljava/lang/UnsupportedOperationException;

    .line 193
    .line 194
    if-nez v2, :cond_a

    .line 195
    .line 196
    instance-of v2, v0, Ljava/lang/NullPointerException;

    .line 197
    .line 198
    if-eqz v2, :cond_8

    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_8
    instance-of v2, v0, Ljava/lang/IllegalStateException;

    .line 202
    .line 203
    if-eqz v2, :cond_9

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_9
    throw v0

    .line 207
    :cond_a
    :goto_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    const/16 v0, 0x9

    .line 211
    .line 212
    invoke-virtual {v14, v0, v11, v10}, Leg0;->a(ILjava/lang/String;Z)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 213
    .line 214
    .line 215
    goto :goto_5

    .line 216
    :goto_7
    invoke-static {v12, v13}, Lp61;->h(J)J

    .line 217
    .line 218
    .line 219
    move-result-wide v4

    .line 220
    long-to-double v4, v4

    .line 221
    div-double v4, v4, v19

    .line 222
    .line 223
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-static {v2, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    const/4 v4, 0x0

    .line 236
    invoke-static {v4, v7, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    if-nez v0, :cond_b

    .line 240
    .line 241
    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    if-eqz v3, :cond_b

    .line 245
    .line 246
    invoke-virtual {v1, v3}, Lza;->c(Ln57;)V

    .line 247
    .line 248
    .line 249
    :cond_b
    if-eqz v0, :cond_c

    .line 250
    .line 251
    move v10, v15

    .line 252
    :cond_c
    return v10

    .line 253
    :goto_8
    invoke-static {v12, v13}, Lp61;->h(J)J

    .line 254
    .line 255
    .line 256
    move-result-wide v1

    .line 257
    long-to-double v1, v1

    .line 258
    div-double v1, v1, v19

    .line 259
    .line 260
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-static {v1, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    const/4 v4, 0x0

    .line 273
    invoke-static {v4, v7, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    throw v0
.end method

.method public final X(Li57;)Z
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    const-string v8, "%.3f ms"

    .line 6
    .line 7
    iget-object v9, v1, Lza;->Y:Landroid/hardware/camera2/CameraDevice;

    .line 8
    .line 9
    iget-object v10, v7, Li57;->b:Ljava/util/List;

    .line 10
    .line 11
    iget-object v2, v7, Li57;->e:Lsn0;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Lza;->a(Ln57;)Lqg5;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v3, v0, Lqg5;->X:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    iget-object v0, v0, Lqg5;->Y:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v4, v0

    .line 28
    check-cast v4, Ln57;

    .line 29
    .line 30
    const/4 v11, 0x0

    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    return v11

    .line 34
    :cond_0
    if-eqz v4, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1, v4}, Lza;->b(Ln57;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    const-string v0, "CXCP#createCaptureSession-"

    .line 40
    .line 41
    iget-object v12, v1, Lza;->Z:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0, v12}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 48
    .line 49
    .line 50
    move-result-wide v13

    .line 51
    :try_start_0
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v6, v1, Lza;->f0:Leg0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 55
    .line 56
    :try_start_1
    iget v0, v7, Li57;->a:I

    .line 57
    .line 58
    iget-object v3, v7, Li57;->c:Ljava/util/ArrayList;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 59
    .line 60
    const-wide v16, 0x412e848000000000L    # 1000000.0

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    :try_start_2
    new-instance v15, Ljava/util/ArrayList;

    .line 66
    .line 67
    const/16 v11, 0xa

    .line 68
    .line 69
    invoke-static {v3, v11}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    invoke-direct {v15, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_2

    .line 85
    .line 86
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    check-cast v5, Laf;

    .line 91
    .line 92
    const-class v11, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 93
    .line 94
    move/from16 v18, v0

    .line 95
    .line 96
    sget-object v0, Lyb6;->a:Lzb6;

    .line 97
    .line 98
    invoke-virtual {v0, v11}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v5, v0}, Laf;->C0(Lzu3;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 107
    .line 108
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move/from16 v0, v18

    .line 112
    .line 113
    const/16 v11, 0xa

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :catchall_0
    move-exception v0

    .line 117
    move-wide/from16 v20, v13

    .line 118
    .line 119
    goto/16 :goto_e

    .line 120
    .line 121
    :catch_0
    move-exception v0

    .line 122
    move-object v3, v4

    .line 123
    :goto_1
    move-wide/from16 v20, v13

    .line 124
    .line 125
    :goto_2
    move-object v13, v6

    .line 126
    goto/16 :goto_7

    .line 127
    .line 128
    :cond_2
    move/from16 v18, v0

    .line 129
    .line 130
    iget-object v11, v7, Li57;->d:Ljava/util/concurrent/Executor;

    .line 131
    .line 132
    new-instance v0, Lhb;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 133
    .line 134
    move-object v3, v4

    .line 135
    :try_start_3
    iget-object v4, v1, Lza;->f0:Leg0;

    .line 136
    .line 137
    iget-object v5, v1, Lza;->g0:Ldq;

    .line 138
    .line 139
    move-object/from16 v19, v0

    .line 140
    .line 141
    iget-object v0, v1, Lza;->h0:Ls98;

    .line 142
    .line 143
    invoke-virtual {v0}, Ls98;->a()Landroid/os/Handler;

    .line 144
    .line 145
    .line 146
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 147
    move-wide/from16 v20, v13

    .line 148
    .line 149
    move/from16 v14, v18

    .line 150
    .line 151
    move-object v13, v6

    .line 152
    move-object v6, v0

    .line 153
    move-object/from16 v0, v19

    .line 154
    .line 155
    :try_start_4
    invoke-direct/range {v0 .. v6}, Lhb;-><init>(Lza;Lfh0;Ln57;Leg0;Ldq;Landroid/os/Handler;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-static {v14, v15, v11, v0}, Lfn;->a(ILjava/util/ArrayList;Ljava/util/concurrent/Executor;Lhb;)Landroid/hardware/camera2/params/SessionConfiguration;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    if-eqz v10, :cond_4

    .line 166
    .line 167
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 168
    .line 169
    const/16 v4, 0x1f

    .line 170
    .line 171
    if-lt v2, v4, :cond_3

    .line 172
    .line 173
    invoke-static {v12, v10}, Ltc;->t(Ljava/lang/String;Ljava/util/List;)Landroid/hardware/camera2/params/InputConfiguration;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-static {v0, v2}, Len;->T(Landroid/hardware/camera2/params/SessionConfiguration;Landroid/hardware/camera2/params/InputConfiguration;)V

    .line 178
    .line 179
    .line 180
    goto :goto_3

    .line 181
    :catchall_1
    move-exception v0

    .line 182
    goto/16 :goto_e

    .line 183
    .line 184
    :catch_1
    move-exception v0

    .line 185
    goto/16 :goto_7

    .line 186
    .line 187
    :cond_3
    new-instance v2, Landroid/hardware/camera2/params/InputConfiguration;

    .line 188
    .line 189
    invoke-static {v10}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    check-cast v4, Lhd3;

    .line 194
    .line 195
    iget v4, v4, Lhd3;->a:I

    .line 196
    .line 197
    invoke-static {v10}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    check-cast v5, Lhd3;

    .line 202
    .line 203
    iget v5, v5, Lhd3;->b:I

    .line 204
    .line 205
    invoke-static {v10}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    check-cast v6, Lhd3;

    .line 210
    .line 211
    iget v6, v6, Lhd3;->c:I

    .line 212
    .line 213
    invoke-direct {v2, v4, v5, v6}, Landroid/hardware/camera2/params/InputConfiguration;-><init>(III)V

    .line 214
    .line 215
    .line 216
    invoke-static {v0, v2}, Len;->T(Landroid/hardware/camera2/params/SessionConfiguration;Landroid/hardware/camera2/params/InputConfiguration;)V

    .line 217
    .line 218
    .line 219
    :cond_4
    :goto_3
    const-string v2, "createCaptureRequest"
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 220
    .line 221
    :try_start_5
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    iget v2, v7, Li57;->f:I

    .line 225
    .line 226
    invoke-virtual {v9, v2}, Landroid/hardware/camera2/CameraDevice;->createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 227
    .line 228
    .line 229
    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 230
    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    iget-object v4, v1, Lza;->X:Ljj0;

    .line 237
    .line 238
    check-cast v4, Llf0;

    .line 239
    .line 240
    iget-object v4, v4, Llf0;->k0:Lg44;

    .line 241
    .line 242
    invoke-interface {v4}, Lg44;->getValue()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    check-cast v4, Ljava/util/Set;

    .line 247
    .line 248
    check-cast v4, Ljava/lang/Iterable;

    .line 249
    .line 250
    new-instance v5, Ljava/util/ArrayList;

    .line 251
    .line 252
    const/16 v6, 0xa

    .line 253
    .line 254
    invoke-static {v4, v6}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 259
    .line 260
    .line 261
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result v6

    .line 269
    if-eqz v6, :cond_5

    .line 270
    .line 271
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v6

    .line 275
    check-cast v6, Landroid/hardware/camera2/CaptureRequest$Key;

    .line 276
    .line 277
    invoke-virtual {v6}, Landroid/hardware/camera2/CaptureRequest$Key;->getName()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_5
    iget-object v4, v7, Li57;->g:Ljava/util/Map;

    .line 286
    .line 287
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    :cond_6
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 296
    .line 297
    .line 298
    move-result v6

    .line 299
    if-eqz v6, :cond_7

    .line 300
    .line 301
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v6

    .line 305
    check-cast v6, Ljava/util/Map$Entry;

    .line 306
    .line 307
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v7

    .line 311
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v6

    .line 315
    instance-of v10, v7, Landroid/hardware/camera2/CaptureRequest$Key;

    .line 316
    .line 317
    if-eqz v10, :cond_6

    .line 318
    .line 319
    move-object v10, v7

    .line 320
    check-cast v10, Landroid/hardware/camera2/CaptureRequest$Key;

    .line 321
    .line 322
    invoke-virtual {v10}, Landroid/hardware/camera2/CaptureRequest$Key;->getName()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v10

    .line 326
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v10
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 330
    if-eqz v10, :cond_6

    .line 331
    .line 332
    :try_start_7
    move-object v10, v7

    .line 333
    check-cast v10, Landroid/hardware/camera2/CaptureRequest$Key;

    .line 334
    .line 335
    invoke-virtual {v2, v10, v6}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/IllegalArgumentException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 336
    .line 337
    .line 338
    goto :goto_5

    .line 339
    :catch_2
    :try_start_8
    check-cast v7, Landroid/hardware/camera2/CaptureRequest$Key;

    .line 340
    .line 341
    invoke-virtual {v7}, Landroid/hardware/camera2/CaptureRequest$Key;->getName()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    invoke-static {v6}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    goto :goto_5

    .line 348
    :cond_7
    invoke-virtual {v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    invoke-static {v0, v2}, Len;->Z(Landroid/hardware/camera2/params/SessionConfiguration;Landroid/hardware/camera2/CaptureRequest;)V

    .line 356
    .line 357
    .line 358
    const-string v2, "Api28Compat.createCaptureSession"
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 359
    .line 360
    :try_start_9
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    invoke-static {v9, v0}, Len;->h(Landroid/hardware/camera2/CameraDevice;Landroid/hardware/camera2/params/SessionConfiguration;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 364
    .line 365
    .line 366
    :try_start_a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 367
    .line 368
    .line 369
    sget-object v0, Ldn8;->a:Ldn8;

    .line 370
    .line 371
    :goto_6
    const/4 v2, 0x0

    .line 372
    goto/16 :goto_c

    .line 373
    .line 374
    :catchall_2
    move-exception v0

    .line 375
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 376
    .line 377
    .line 378
    throw v0

    .line 379
    :catchall_3
    move-exception v0

    .line 380
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 381
    .line 382
    .line 383
    throw v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 384
    :catch_3
    move-exception v0

    .line 385
    goto/16 :goto_1

    .line 386
    .line 387
    :catchall_4
    move-exception v0

    .line 388
    move-wide/from16 v20, v13

    .line 389
    .line 390
    const-wide v16, 0x412e848000000000L    # 1000000.0

    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    goto/16 :goto_e

    .line 396
    .line 397
    :catch_4
    move-exception v0

    .line 398
    move-object v3, v4

    .line 399
    move-wide/from16 v20, v13

    .line 400
    .line 401
    const-wide v16, 0x412e848000000000L    # 1000000.0

    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    goto/16 :goto_2

    .line 407
    .line 408
    :goto_7
    :try_start_b
    instance-of v2, v0, Landroid/hardware/camera2/CameraAccessException;

    .line 409
    .line 410
    if-eqz v2, :cond_d

    .line 411
    .line 412
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    check-cast v0, Landroid/hardware/camera2/CameraAccessException;

    .line 416
    .line 417
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraAccessException;->getReason()I

    .line 418
    .line 419
    .line 420
    move-result v2

    .line 421
    const/4 v5, 0x3

    .line 422
    const/4 v4, 0x1

    .line 423
    if-eq v2, v4, :cond_c

    .line 424
    .line 425
    const/4 v4, 0x2

    .line 426
    if-eq v2, v4, :cond_b

    .line 427
    .line 428
    if-eq v2, v5, :cond_a

    .line 429
    .line 430
    const/4 v5, 0x4

    .line 431
    if-eq v2, v5, :cond_9

    .line 432
    .line 433
    const/4 v5, 0x5

    .line 434
    if-eq v2, v5, :cond_8

    .line 435
    .line 436
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    const/16 v5, 0xb

    .line 440
    .line 441
    :goto_8
    const/4 v4, 0x1

    .line 442
    goto :goto_9

    .line 443
    :cond_8
    move v5, v4

    .line 444
    goto :goto_8

    .line 445
    :cond_9
    const/4 v4, 0x1

    .line 446
    const/4 v5, 0x1

    .line 447
    goto :goto_9

    .line 448
    :cond_a
    const/4 v4, 0x1

    .line 449
    const/4 v5, 0x0

    .line 450
    goto :goto_9

    .line 451
    :cond_b
    const/4 v5, 0x6

    .line 452
    goto :goto_8

    .line 453
    :cond_c
    :goto_9
    invoke-virtual {v13, v5, v12, v4}, Leg0;->a(ILjava/lang/String;Z)V

    .line 454
    .line 455
    .line 456
    :goto_a
    const/4 v0, 0x0

    .line 457
    goto :goto_6

    .line 458
    :cond_d
    instance-of v2, v0, Ljava/lang/IllegalArgumentException;

    .line 459
    .line 460
    if-nez v2, :cond_10

    .line 461
    .line 462
    instance-of v2, v0, Ljava/lang/SecurityException;

    .line 463
    .line 464
    if-nez v2, :cond_10

    .line 465
    .line 466
    instance-of v2, v0, Ljava/lang/UnsupportedOperationException;

    .line 467
    .line 468
    if-nez v2, :cond_10

    .line 469
    .line 470
    instance-of v2, v0, Ljava/lang/NullPointerException;

    .line 471
    .line 472
    if-eqz v2, :cond_e

    .line 473
    .line 474
    goto :goto_b

    .line 475
    :cond_e
    instance-of v2, v0, Ljava/lang/IllegalStateException;

    .line 476
    .line 477
    if-eqz v2, :cond_f

    .line 478
    .line 479
    goto :goto_a

    .line 480
    :cond_f
    throw v0

    .line 481
    :cond_10
    :goto_b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    const/16 v0, 0x9

    .line 485
    .line 486
    const/4 v2, 0x0

    .line 487
    invoke-virtual {v13, v0, v12, v2}, Leg0;->a(ILjava/lang/String;Z)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 488
    .line 489
    .line 490
    const/4 v0, 0x0

    .line 491
    :goto_c
    invoke-static/range {v20 .. v21}, Lp61;->h(J)J

    .line 492
    .line 493
    .line 494
    move-result-wide v4

    .line 495
    long-to-double v4, v4

    .line 496
    div-double v4, v4, v16

    .line 497
    .line 498
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 499
    .line 500
    .line 501
    move-result-object v4

    .line 502
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v4

    .line 506
    const/4 v5, 0x1

    .line 507
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v4

    .line 511
    const/4 v5, 0x0

    .line 512
    invoke-static {v5, v8, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    if-nez v0, :cond_11

    .line 516
    .line 517
    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    if-eqz v3, :cond_11

    .line 521
    .line 522
    invoke-virtual {v1, v3}, Lza;->c(Ln57;)V

    .line 523
    .line 524
    .line 525
    :cond_11
    if-eqz v0, :cond_12

    .line 526
    .line 527
    const/4 v11, 0x1

    .line 528
    goto :goto_d

    .line 529
    :cond_12
    move v11, v2

    .line 530
    :goto_d
    return v11

    .line 531
    :goto_e
    invoke-static/range {v20 .. v21}, Lp61;->h(J)J

    .line 532
    .line 533
    .line 534
    move-result-wide v1

    .line 535
    long-to-double v1, v1

    .line 536
    div-double v1, v1, v16

    .line 537
    .line 538
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 539
    .line 540
    .line 541
    move-result-object v1

    .line 542
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v1

    .line 546
    const/4 v4, 0x1

    .line 547
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    const/4 v5, 0x0

    .line 552
    invoke-static {v5, v8, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    throw v0
.end method

.method public final Y(I)Landroid/hardware/camera2/CaptureRequest$Builder;
    .locals 12

    .line 1
    const-string v0, "%.3f ms"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "CXCP#createCaptureRequest-"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Lza;->Z:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    const-wide v5, 0x412e848000000000L    # 1000000.0

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    const/4 v7, 0x1

    .line 29
    const/4 v8, 0x0

    .line 30
    :try_start_0
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lza;->f0:Leg0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    :try_start_1
    iget-object p0, p0, Lza;->Y:Landroid/hardware/camera2/CameraDevice;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraDevice;->createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 38
    .line 39
    .line 40
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    goto :goto_3

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto/16 :goto_4

    .line 44
    .line 45
    :catch_0
    move-exception p0

    .line 46
    :try_start_2
    instance-of p1, p0, Landroid/hardware/camera2/CameraAccessException;

    .line 47
    .line 48
    const/4 v9, 0x0

    .line 49
    if-eqz p1, :cond_5

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    check-cast p0, Landroid/hardware/camera2/CameraAccessException;

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/hardware/camera2/CameraAccessException;->getReason()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    const/4 v10, 0x3

    .line 61
    if-eq p1, v7, :cond_3

    .line 62
    .line 63
    const/4 v11, 0x2

    .line 64
    if-eq p1, v11, :cond_2

    .line 65
    .line 66
    if-eq p1, v10, :cond_4

    .line 67
    .line 68
    const/4 v9, 0x4

    .line 69
    if-eq p1, v9, :cond_1

    .line 70
    .line 71
    const/4 v9, 0x5

    .line 72
    if-eq p1, v9, :cond_0

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    const/16 v9, 0xb

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    move v9, v11

    .line 81
    goto :goto_0

    .line 82
    :cond_1
    move v9, v7

    .line 83
    goto :goto_0

    .line 84
    :cond_2
    const/4 v9, 0x6

    .line 85
    goto :goto_0

    .line 86
    :cond_3
    move v9, v10

    .line 87
    :cond_4
    :goto_0
    invoke-virtual {v1, v9, v2, v7}, Leg0;->a(ILjava/lang/String;Z)V

    .line 88
    .line 89
    .line 90
    :goto_1
    move-object p0, v8

    .line 91
    goto :goto_3

    .line 92
    :cond_5
    instance-of p1, p0, Ljava/lang/IllegalArgumentException;

    .line 93
    .line 94
    if-nez p1, :cond_8

    .line 95
    .line 96
    instance-of p1, p0, Ljava/lang/SecurityException;

    .line 97
    .line 98
    if-nez p1, :cond_8

    .line 99
    .line 100
    instance-of p1, p0, Ljava/lang/UnsupportedOperationException;

    .line 101
    .line 102
    if-nez p1, :cond_8

    .line 103
    .line 104
    instance-of p1, p0, Ljava/lang/NullPointerException;

    .line 105
    .line 106
    if-eqz p1, :cond_6

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_6
    instance-of p1, p0, Ljava/lang/IllegalStateException;

    .line 110
    .line 111
    if-eqz p1, :cond_7

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_7
    throw p0

    .line 115
    :cond_8
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    const/16 p0, 0x9

    .line 119
    .line 120
    invoke-virtual {v1, p0, v2, v9}, Leg0;->a(ILjava/lang/String;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :goto_3
    invoke-static {v3, v4}, Lp61;->h(J)J

    .line 125
    .line 126
    .line 127
    move-result-wide v1

    .line 128
    long-to-double v1, v1

    .line 129
    div-double/2addr v1, v5

    .line 130
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-static {v8, v0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    return-object p0

    .line 146
    :goto_4
    invoke-static {v3, v4}, Lp61;->h(J)J

    .line 147
    .line 148
    .line 149
    move-result-wide v1

    .line 150
    long-to-double v1, v1

    .line 151
    div-double/2addr v1, v5

    .line 152
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-static {v8, v0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    throw p0
.end method

.method public final a(Ln57;)Lqg5;
    .locals 2

    .line 1
    iget-object v0, p0, Lza;->i0:Lpv;

    .line 2
    .line 3
    invoke-virtual {v0}, Lpv;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lza;->c(Ln57;)V

    .line 10
    .line 11
    .line 12
    new-instance p0, Lqg5;

    .line 13
    .line 14
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {p0, p1, v0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    new-instance v0, Lqg5;

    .line 22
    .line 23
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 24
    .line 25
    iget-object p0, p0, Lza;->j0:Ltv;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Ltv;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-direct {v0, v1, p0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public final b(Ln57;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p0, "#onSessionDisconnected"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :try_start_0
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ln57;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 30
    .line 31
    .line 32
    throw p0
.end method

.method public final c(Ln57;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p0, "#onSessionFinalized"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :try_start_0
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ln57;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 30
    .line 31
    .line 32
    throw p0
.end method

.method public final c0(Ljava/util/List;Lfh0;)Z
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v7, "%.3f ms"

    .line 4
    .line 5
    iget-object v8, v1, Lza;->h0:Ls98;

    .line 6
    .line 7
    iget-object v9, v1, Lza;->Y:Landroid/hardware/camera2/CameraDevice;

    .line 8
    .line 9
    move-object/from16 v2, p2

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lza;->a(Ln57;)Lqg5;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v3, v0, Lqg5;->X:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iget-object v0, v0, Lqg5;->Y:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v4, v0

    .line 26
    check-cast v4, Ln57;

    .line 27
    .line 28
    const/4 v10, 0x0

    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    return v10

    .line 32
    :cond_0
    if-eqz v4, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1, v4}, Lza;->b(Ln57;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    const-string v0, "CXCP#createCaptureSession-"

    .line 38
    .line 39
    iget-object v11, v1, Lza;->Z:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v0, v11}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 46
    .line 47
    .line 48
    move-result-wide v12

    .line 49
    const/4 v3, 0x0

    .line 50
    const/4 v5, 0x1

    .line 51
    :try_start_0
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v6, v1, Lza;->f0:Leg0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 55
    .line 56
    :try_start_1
    new-instance v0, Lhb;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 57
    .line 58
    move-object/from16 v16, v3

    .line 59
    .line 60
    move-object v3, v4

    .line 61
    :try_start_2
    iget-object v4, v1, Lza;->f0:Leg0;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 62
    .line 63
    move/from16 v17, v5

    .line 64
    .line 65
    :try_start_3
    iget-object v5, v1, Lza;->g0:Ldq;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 66
    .line 67
    move-object/from16 v18, v6

    .line 68
    .line 69
    :try_start_4
    invoke-virtual {v8}, Ls98;->a()Landroid/os/Handler;

    .line 70
    .line 71
    .line 72
    move-result-object v6
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 73
    move/from16 v15, v17

    .line 74
    .line 75
    move-object/from16 v14, v18

    .line 76
    .line 77
    const-wide v19, 0x412e848000000000L    # 1000000.0

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    :try_start_5
    invoke-direct/range {v0 .. v6}, Lhb;-><init>(Lza;Lfh0;Ln57;Leg0;Ldq;Landroid/os/Handler;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v8}, Ls98;->a()Landroid/os/Handler;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    move-object/from16 v4, p1

    .line 90
    .line 91
    invoke-virtual {v9, v4, v0, v2}, Landroid/hardware/camera2/CameraDevice;->createCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V

    .line 92
    .line 93
    .line 94
    sget-object v0, Ldn8;->a:Ldn8;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 95
    .line 96
    goto/16 :goto_7

    .line 97
    .line 98
    :catchall_0
    move-exception v0

    .line 99
    goto/16 :goto_8

    .line 100
    .line 101
    :catch_0
    move-exception v0

    .line 102
    goto :goto_3

    .line 103
    :catchall_1
    move-exception v0

    .line 104
    move/from16 v15, v17

    .line 105
    .line 106
    :goto_0
    const-wide v19, 0x412e848000000000L    # 1000000.0

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    goto/16 :goto_8

    .line 112
    .line 113
    :catch_1
    move-exception v0

    .line 114
    move/from16 v15, v17

    .line 115
    .line 116
    move-object/from16 v14, v18

    .line 117
    .line 118
    :goto_1
    const-wide v19, 0x412e848000000000L    # 1000000.0

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :catch_2
    move-exception v0

    .line 125
    move-object v14, v6

    .line 126
    move/from16 v15, v17

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :catchall_2
    move-exception v0

    .line 130
    move v15, v5

    .line 131
    goto :goto_0

    .line 132
    :catch_3
    move-exception v0

    .line 133
    :goto_2
    move v15, v5

    .line 134
    move-object v14, v6

    .line 135
    goto :goto_1

    .line 136
    :catch_4
    move-exception v0

    .line 137
    move-object v3, v4

    .line 138
    goto :goto_2

    .line 139
    :goto_3
    :try_start_6
    instance-of v2, v0, Landroid/hardware/camera2/CameraAccessException;

    .line 140
    .line 141
    if-eqz v2, :cond_7

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    check-cast v0, Landroid/hardware/camera2/CameraAccessException;

    .line 147
    .line 148
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraAccessException;->getReason()I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    const/4 v5, 0x3

    .line 153
    if-eq v2, v15, :cond_6

    .line 154
    .line 155
    const/4 v4, 0x2

    .line 156
    if-eq v2, v4, :cond_5

    .line 157
    .line 158
    if-eq v2, v5, :cond_4

    .line 159
    .line 160
    const/4 v5, 0x4

    .line 161
    if-eq v2, v5, :cond_3

    .line 162
    .line 163
    const/4 v5, 0x5

    .line 164
    if-eq v2, v5, :cond_2

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    const/16 v5, 0xb

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_2
    move v5, v4

    .line 173
    goto :goto_4

    .line 174
    :cond_3
    move v5, v15

    .line 175
    goto :goto_4

    .line 176
    :cond_4
    move v5, v10

    .line 177
    goto :goto_4

    .line 178
    :cond_5
    const/4 v5, 0x6

    .line 179
    :cond_6
    :goto_4
    invoke-virtual {v14, v5, v11, v15}, Leg0;->a(ILjava/lang/String;Z)V

    .line 180
    .line 181
    .line 182
    :goto_5
    const/4 v0, 0x0

    .line 183
    goto :goto_7

    .line 184
    :cond_7
    instance-of v2, v0, Ljava/lang/IllegalArgumentException;

    .line 185
    .line 186
    if-nez v2, :cond_a

    .line 187
    .line 188
    instance-of v2, v0, Ljava/lang/SecurityException;

    .line 189
    .line 190
    if-nez v2, :cond_a

    .line 191
    .line 192
    instance-of v2, v0, Ljava/lang/UnsupportedOperationException;

    .line 193
    .line 194
    if-nez v2, :cond_a

    .line 195
    .line 196
    instance-of v2, v0, Ljava/lang/NullPointerException;

    .line 197
    .line 198
    if-eqz v2, :cond_8

    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_8
    instance-of v2, v0, Ljava/lang/IllegalStateException;

    .line 202
    .line 203
    if-eqz v2, :cond_9

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_9
    throw v0

    .line 207
    :cond_a
    :goto_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    const/16 v0, 0x9

    .line 211
    .line 212
    invoke-virtual {v14, v0, v11, v10}, Leg0;->a(ILjava/lang/String;Z)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 213
    .line 214
    .line 215
    goto :goto_5

    .line 216
    :goto_7
    invoke-static {v12, v13}, Lp61;->h(J)J

    .line 217
    .line 218
    .line 219
    move-result-wide v4

    .line 220
    long-to-double v4, v4

    .line 221
    div-double v4, v4, v19

    .line 222
    .line 223
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-static {v2, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    const/4 v4, 0x0

    .line 236
    invoke-static {v4, v7, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    if-nez v0, :cond_b

    .line 240
    .line 241
    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    if-eqz v3, :cond_b

    .line 245
    .line 246
    invoke-virtual {v1, v3}, Lza;->c(Ln57;)V

    .line 247
    .line 248
    .line 249
    :cond_b
    if-eqz v0, :cond_c

    .line 250
    .line 251
    move v10, v15

    .line 252
    :cond_c
    return v10

    .line 253
    :goto_8
    invoke-static {v12, v13}, Lp61;->h(J)J

    .line 254
    .line 255
    .line 256
    move-result-wide v1

    .line 257
    long-to-double v1, v1

    .line 258
    div-double v1, v1, v19

    .line 259
    .line 260
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-static {v1, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    const/4 v4, 0x0

    .line 273
    invoke-static {v4, v7, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    throw v0
.end method

.method public final g(Lhd3;Ljava/util/ArrayList;Lsn0;)Z
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v7, "%.3f ms"

    .line 6
    .line 7
    iget-object v8, v1, Lza;->h0:Ls98;

    .line 8
    .line 9
    iget-object v9, v1, Lza;->Y:Landroid/hardware/camera2/CameraDevice;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Lza;->a(Ln57;)Lqg5;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget-object v4, v3, Lqg5;->X:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v4, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    iget-object v3, v3, Lqg5;->Y:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Ln57;

    .line 28
    .line 29
    const/4 v10, 0x0

    .line 30
    if-nez v4, :cond_0

    .line 31
    .line 32
    return v10

    .line 33
    :cond_0
    if-eqz v3, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Lza;->b(Ln57;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    const-string v4, "CXCP#createReprocessableCaptureSessionByConfigurations-"

    .line 39
    .line 40
    iget-object v11, v1, Lza;->Z:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v4, v11}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 47
    .line 48
    .line 49
    move-result-wide v12

    .line 50
    :try_start_0
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v4, v1, Lza;->f0:Leg0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 54
    .line 55
    const-wide v16, 0x412e848000000000L    # 1000000.0

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    :try_start_1
    new-instance v14, Landroid/hardware/camera2/params/InputConfiguration;

    .line 61
    .line 62
    iget v15, v0, Lhd3;->a:I

    .line 63
    .line 64
    iget v5, v0, Lhd3;->b:I

    .line 65
    .line 66
    iget v0, v0, Lhd3;->c:I

    .line 67
    .line 68
    invoke-direct {v14, v15, v5, v0}, Landroid/hardware/camera2/params/InputConfiguration;-><init>(III)V

    .line 69
    .line 70
    .line 71
    new-instance v15, Ljava/util/ArrayList;

    .line 72
    .line 73
    const/16 v0, 0xa

    .line 74
    .line 75
    move-object/from16 v5, p2

    .line 76
    .line 77
    invoke-static {v5, v0}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-direct {v15, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_2

    .line 93
    .line 94
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    check-cast v5, Laf;

    .line 99
    .line 100
    const-class v6, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 101
    .line 102
    sget-object v10, Lyb6;->a:Lzb6;

    .line 103
    .line 104
    invoke-virtual {v10, v6}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v5, v6}, Laf;->C0(Lzu3;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    check-cast v5, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 113
    .line 114
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    const/4 v10, 0x0

    .line 118
    goto :goto_0

    .line 119
    :catchall_0
    move-exception v0

    .line 120
    const/4 v10, 0x1

    .line 121
    goto/16 :goto_a

    .line 122
    .line 123
    :catch_0
    move-exception v0

    .line 124
    move-object/from16 v18, v4

    .line 125
    .line 126
    :goto_1
    const/4 v10, 0x1

    .line 127
    goto :goto_2

    .line 128
    :cond_2
    new-instance v0, Lhb;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 129
    .line 130
    move-object v5, v4

    .line 131
    :try_start_2
    iget-object v4, v1, Lza;->f0:Leg0;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 132
    .line 133
    move-object v6, v5

    .line 134
    :try_start_3
    iget-object v5, v1, Lza;->g0:Ldq;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 135
    .line 136
    move-object v10, v6

    .line 137
    :try_start_4
    invoke-virtual {v8}, Ls98;->a()Landroid/os/Handler;

    .line 138
    .line 139
    .line 140
    move-result-object v6
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 141
    move-object/from16 v18, v10

    .line 142
    .line 143
    const/4 v10, 0x1

    .line 144
    :try_start_5
    invoke-direct/range {v0 .. v6}, Lhb;-><init>(Lza;Lfh0;Ln57;Leg0;Ldq;Landroid/os/Handler;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v8}, Ls98;->a()Landroid/os/Handler;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-virtual {v9, v14, v15, v0, v2}, Landroid/hardware/camera2/CameraDevice;->createReprocessableCaptureSessionByConfigurations(Landroid/hardware/camera2/params/InputConfiguration;Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V

    .line 152
    .line 153
    .line 154
    sget-object v5, Ldn8;->a:Ldn8;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 155
    .line 156
    const/4 v2, 0x0

    .line 157
    goto/16 :goto_8

    .line 158
    .line 159
    :catchall_1
    move-exception v0

    .line 160
    goto/16 :goto_a

    .line 161
    .line 162
    :catch_1
    move-exception v0

    .line 163
    goto :goto_2

    .line 164
    :catch_2
    move-exception v0

    .line 165
    move-object/from16 v18, v10

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :catch_3
    move-exception v0

    .line 169
    move-object/from16 v18, v6

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :catch_4
    move-exception v0

    .line 173
    move-object/from16 v18, v5

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :goto_2
    :try_start_6
    instance-of v2, v0, Landroid/hardware/camera2/CameraAccessException;

    .line 177
    .line 178
    if-eqz v2, :cond_8

    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    check-cast v0, Landroid/hardware/camera2/CameraAccessException;

    .line 184
    .line 185
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraAccessException;->getReason()I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    const/4 v6, 0x3

    .line 190
    if-eq v2, v10, :cond_3

    .line 191
    .line 192
    const/4 v4, 0x2

    .line 193
    if-eq v2, v4, :cond_7

    .line 194
    .line 195
    if-eq v2, v6, :cond_6

    .line 196
    .line 197
    const/4 v5, 0x4

    .line 198
    if-eq v2, v5, :cond_5

    .line 199
    .line 200
    const/4 v5, 0x5

    .line 201
    if-eq v2, v5, :cond_4

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    const/16 v6, 0xb

    .line 207
    .line 208
    :cond_3
    :goto_3
    move-object/from16 v5, v18

    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_4
    move v6, v4

    .line 212
    goto :goto_3

    .line 213
    :cond_5
    move v6, v10

    .line 214
    goto :goto_3

    .line 215
    :cond_6
    move-object/from16 v5, v18

    .line 216
    .line 217
    const/4 v6, 0x0

    .line 218
    goto :goto_4

    .line 219
    :cond_7
    const/4 v6, 0x6

    .line 220
    goto :goto_3

    .line 221
    :goto_4
    invoke-virtual {v5, v6, v11, v10}, Leg0;->a(ILjava/lang/String;Z)V

    .line 222
    .line 223
    .line 224
    :goto_5
    const/4 v2, 0x0

    .line 225
    :goto_6
    const/4 v5, 0x0

    .line 226
    goto :goto_8

    .line 227
    :cond_8
    move-object/from16 v5, v18

    .line 228
    .line 229
    instance-of v2, v0, Ljava/lang/IllegalArgumentException;

    .line 230
    .line 231
    if-nez v2, :cond_b

    .line 232
    .line 233
    instance-of v2, v0, Ljava/lang/SecurityException;

    .line 234
    .line 235
    if-nez v2, :cond_b

    .line 236
    .line 237
    instance-of v2, v0, Ljava/lang/UnsupportedOperationException;

    .line 238
    .line 239
    if-nez v2, :cond_b

    .line 240
    .line 241
    instance-of v2, v0, Ljava/lang/NullPointerException;

    .line 242
    .line 243
    if-eqz v2, :cond_9

    .line 244
    .line 245
    goto :goto_7

    .line 246
    :cond_9
    instance-of v2, v0, Ljava/lang/IllegalStateException;

    .line 247
    .line 248
    if-eqz v2, :cond_a

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_a
    throw v0

    .line 252
    :cond_b
    :goto_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    const/16 v0, 0x9

    .line 256
    .line 257
    const/4 v2, 0x0

    .line 258
    invoke-virtual {v5, v0, v11, v2}, Leg0;->a(ILjava/lang/String;Z)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 259
    .line 260
    .line 261
    goto :goto_6

    .line 262
    :goto_8
    invoke-static {v12, v13}, Lp61;->h(J)J

    .line 263
    .line 264
    .line 265
    move-result-wide v11

    .line 266
    long-to-double v11, v11

    .line 267
    div-double v11, v11, v16

    .line 268
    .line 269
    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-static {v0, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    const/4 v4, 0x0

    .line 282
    invoke-static {v4, v7, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    if-nez v5, :cond_c

    .line 286
    .line 287
    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    if-eqz v3, :cond_c

    .line 291
    .line 292
    invoke-virtual {v1, v3}, Lza;->c(Ln57;)V

    .line 293
    .line 294
    .line 295
    :cond_c
    if-eqz v5, :cond_d

    .line 296
    .line 297
    goto :goto_9

    .line 298
    :cond_d
    move v10, v2

    .line 299
    :goto_9
    return v10

    .line 300
    :catchall_2
    move-exception v0

    .line 301
    const/4 v10, 0x1

    .line 302
    const-wide v16, 0x412e848000000000L    # 1000000.0

    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    :goto_a
    invoke-static {v12, v13}, Lp61;->h(J)J

    .line 308
    .line 309
    .line 310
    move-result-wide v1

    .line 311
    long-to-double v1, v1

    .line 312
    div-double v1, v1, v16

    .line 313
    .line 314
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    const/4 v4, 0x0

    .line 327
    invoke-static {v4, v7, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    throw v0
.end method

.method public final k(Ljava/util/ArrayList;Lsn0;)Z
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v7, "%.3f ms"

    .line 4
    .line 5
    iget-object v8, v1, Lza;->h0:Ls98;

    .line 6
    .line 7
    iget-object v9, v1, Lza;->Y:Landroid/hardware/camera2/CameraDevice;

    .line 8
    .line 9
    move-object/from16 v2, p2

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lza;->a(Ln57;)Lqg5;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v3, v0, Lqg5;->X:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iget-object v0, v0, Lqg5;->Y:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v4, v0

    .line 26
    check-cast v4, Ln57;

    .line 27
    .line 28
    const/4 v10, 0x0

    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    return v10

    .line 32
    :cond_0
    if-eqz v4, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1, v4}, Lza;->b(Ln57;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    const-string v0, "CXCP#createCaptureSessionByOutputConfigurations-"

    .line 38
    .line 39
    iget-object v11, v1, Lza;->Z:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v0, v11}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 46
    .line 47
    .line 48
    move-result-wide v12

    .line 49
    :try_start_0
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v6, v1, Lza;->f0:Leg0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 53
    .line 54
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    .line 55
    .line 56
    const/16 v3, 0xa

    .line 57
    .line 58
    move-object/from16 v5, p1

    .line 59
    .line 60
    invoke-static {v5, v3}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 75
    if-eqz v5, :cond_2

    .line 76
    .line 77
    :try_start_2
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    check-cast v5, Laf;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 82
    .line 83
    const-wide v16, 0x412e848000000000L    # 1000000.0

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    :try_start_3
    const-class v14, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 89
    .line 90
    sget-object v15, Lyb6;->a:Lzb6;

    .line 91
    .line 92
    invoke-virtual {v15, v14}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 93
    .line 94
    .line 95
    move-result-object v14

    .line 96
    invoke-virtual {v5, v14}, Laf;->C0(Lzu3;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    check-cast v5, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 101
    .line 102
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :catchall_0
    move-exception v0

    .line 107
    :goto_1
    const/4 v15, 0x1

    .line 108
    goto/16 :goto_c

    .line 109
    .line 110
    :catch_0
    move-exception v0

    .line 111
    :goto_2
    move-object v3, v4

    .line 112
    :goto_3
    move-object v14, v6

    .line 113
    :goto_4
    const/4 v15, 0x1

    .line 114
    goto :goto_6

    .line 115
    :catchall_1
    move-exception v0

    .line 116
    const-wide v16, 0x412e848000000000L    # 1000000.0

    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :catch_1
    move-exception v0

    .line 123
    const-wide v16, 0x412e848000000000L    # 1000000.0

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_2
    move-object v3, v0

    .line 130
    const-wide v16, 0x412e848000000000L    # 1000000.0

    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    new-instance v0, Lhb;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 136
    .line 137
    move-object v5, v3

    .line 138
    move-object v3, v4

    .line 139
    :try_start_4
    iget-object v4, v1, Lza;->f0:Leg0;

    .line 140
    .line 141
    move-object v14, v5

    .line 142
    iget-object v5, v1, Lza;->g0:Ldq;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 143
    .line 144
    move-object v15, v6

    .line 145
    :try_start_5
    invoke-virtual {v8}, Ls98;->a()Landroid/os/Handler;

    .line 146
    .line 147
    .line 148
    move-result-object v6
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 149
    move-object v10, v14

    .line 150
    move-object v14, v15

    .line 151
    const/4 v15, 0x1

    .line 152
    :try_start_6
    invoke-direct/range {v0 .. v6}, Lhb;-><init>(Lza;Lfh0;Ln57;Leg0;Ldq;Landroid/os/Handler;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v8}, Ls98;->a()Landroid/os/Handler;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {v9, v10, v0, v2}, Landroid/hardware/camera2/CameraDevice;->createCaptureSessionByOutputConfigurations(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V

    .line 160
    .line 161
    .line 162
    sget-object v0, Ldn8;->a:Ldn8;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 163
    .line 164
    :goto_5
    const/4 v2, 0x0

    .line 165
    goto/16 :goto_a

    .line 166
    .line 167
    :catchall_2
    move-exception v0

    .line 168
    goto/16 :goto_c

    .line 169
    .line 170
    :catch_2
    move-exception v0

    .line 171
    goto :goto_6

    .line 172
    :catch_3
    move-exception v0

    .line 173
    move-object v14, v15

    .line 174
    goto :goto_4

    .line 175
    :catch_4
    move-exception v0

    .line 176
    goto :goto_3

    .line 177
    :catchall_3
    move-exception v0

    .line 178
    const/4 v15, 0x1

    .line 179
    const-wide v16, 0x412e848000000000L    # 1000000.0

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    goto/16 :goto_c

    .line 185
    .line 186
    :catch_5
    move-exception v0

    .line 187
    move-object v3, v4

    .line 188
    move-object v14, v6

    .line 189
    const/4 v15, 0x1

    .line 190
    const-wide v16, 0x412e848000000000L    # 1000000.0

    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    :goto_6
    :try_start_7
    instance-of v2, v0, Landroid/hardware/camera2/CameraAccessException;

    .line 196
    .line 197
    if-eqz v2, :cond_8

    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    check-cast v0, Landroid/hardware/camera2/CameraAccessException;

    .line 203
    .line 204
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraAccessException;->getReason()I

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    const/4 v5, 0x3

    .line 209
    if-eq v2, v15, :cond_7

    .line 210
    .line 211
    const/4 v4, 0x2

    .line 212
    if-eq v2, v4, :cond_6

    .line 213
    .line 214
    if-eq v2, v5, :cond_5

    .line 215
    .line 216
    const/4 v5, 0x4

    .line 217
    if-eq v2, v5, :cond_4

    .line 218
    .line 219
    const/4 v5, 0x5

    .line 220
    if-eq v2, v5, :cond_3

    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    const/16 v5, 0xb

    .line 226
    .line 227
    goto :goto_7

    .line 228
    :cond_3
    move v5, v4

    .line 229
    goto :goto_7

    .line 230
    :cond_4
    move v5, v15

    .line 231
    goto :goto_7

    .line 232
    :cond_5
    const/4 v5, 0x0

    .line 233
    goto :goto_7

    .line 234
    :cond_6
    const/4 v5, 0x6

    .line 235
    :cond_7
    :goto_7
    invoke-virtual {v14, v5, v11, v15}, Leg0;->a(ILjava/lang/String;Z)V

    .line 236
    .line 237
    .line 238
    :goto_8
    const/4 v0, 0x0

    .line 239
    goto :goto_5

    .line 240
    :cond_8
    instance-of v2, v0, Ljava/lang/IllegalArgumentException;

    .line 241
    .line 242
    if-nez v2, :cond_b

    .line 243
    .line 244
    instance-of v2, v0, Ljava/lang/SecurityException;

    .line 245
    .line 246
    if-nez v2, :cond_b

    .line 247
    .line 248
    instance-of v2, v0, Ljava/lang/UnsupportedOperationException;

    .line 249
    .line 250
    if-nez v2, :cond_b

    .line 251
    .line 252
    instance-of v2, v0, Ljava/lang/NullPointerException;

    .line 253
    .line 254
    if-eqz v2, :cond_9

    .line 255
    .line 256
    goto :goto_9

    .line 257
    :cond_9
    instance-of v2, v0, Ljava/lang/IllegalStateException;

    .line 258
    .line 259
    if-eqz v2, :cond_a

    .line 260
    .line 261
    goto :goto_8

    .line 262
    :cond_a
    throw v0

    .line 263
    :cond_b
    :goto_9
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    const/16 v0, 0x9

    .line 267
    .line 268
    const/4 v2, 0x0

    .line 269
    invoke-virtual {v14, v0, v11, v2}, Leg0;->a(ILjava/lang/String;Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 270
    .line 271
    .line 272
    const/4 v0, 0x0

    .line 273
    :goto_a
    invoke-static {v12, v13}, Lp61;->h(J)J

    .line 274
    .line 275
    .line 276
    move-result-wide v4

    .line 277
    long-to-double v4, v4

    .line 278
    div-double v4, v4, v16

    .line 279
    .line 280
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    invoke-static {v4, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    const/4 v5, 0x0

    .line 293
    invoke-static {v5, v7, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    if-nez v0, :cond_c

    .line 297
    .line 298
    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    if-eqz v3, :cond_c

    .line 302
    .line 303
    invoke-virtual {v1, v3}, Lza;->c(Ln57;)V

    .line 304
    .line 305
    .line 306
    :cond_c
    if-eqz v0, :cond_d

    .line 307
    .line 308
    move v10, v15

    .line 309
    goto :goto_b

    .line 310
    :cond_d
    move v10, v2

    .line 311
    :goto_b
    return v10

    .line 312
    :goto_c
    invoke-static {v12, v13}, Lp61;->h(J)J

    .line 313
    .line 314
    .line 315
    move-result-wide v1

    .line 316
    long-to-double v1, v1

    .line 317
    div-double v1, v1, v16

    .line 318
    .line 319
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    invoke-static {v1, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    const/4 v5, 0x0

    .line 332
    invoke-static {v5, v7, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    throw v0
.end method

.method public final m()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lza;->Z:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final p(Landroid/hardware/camera2/TotalCaptureResult;)Landroid/hardware/camera2/CaptureRequest$Builder;
    .locals 12

    .line 1
    const-string v0, "%.3f ms"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "CXCP#createReprocessCaptureRequest-"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Lza;->Z:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    const-wide v5, 0x412e848000000000L    # 1000000.0

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    const/4 v7, 0x1

    .line 29
    const/4 v8, 0x0

    .line 30
    :try_start_0
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lza;->f0:Leg0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    :try_start_1
    iget-object p0, p0, Lza;->Y:Landroid/hardware/camera2/CameraDevice;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraDevice;->createReprocessCaptureRequest(Landroid/hardware/camera2/TotalCaptureResult;)Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 38
    .line 39
    .line 40
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    goto :goto_3

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto/16 :goto_4

    .line 44
    .line 45
    :catch_0
    move-exception p0

    .line 46
    :try_start_2
    instance-of p1, p0, Landroid/hardware/camera2/CameraAccessException;

    .line 47
    .line 48
    const/4 v9, 0x0

    .line 49
    if-eqz p1, :cond_5

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    check-cast p0, Landroid/hardware/camera2/CameraAccessException;

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/hardware/camera2/CameraAccessException;->getReason()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    const/4 v10, 0x3

    .line 61
    if-eq p1, v7, :cond_3

    .line 62
    .line 63
    const/4 v11, 0x2

    .line 64
    if-eq p1, v11, :cond_2

    .line 65
    .line 66
    if-eq p1, v10, :cond_4

    .line 67
    .line 68
    const/4 v9, 0x4

    .line 69
    if-eq p1, v9, :cond_1

    .line 70
    .line 71
    const/4 v9, 0x5

    .line 72
    if-eq p1, v9, :cond_0

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    const/16 v9, 0xb

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    move v9, v11

    .line 81
    goto :goto_0

    .line 82
    :cond_1
    move v9, v7

    .line 83
    goto :goto_0

    .line 84
    :cond_2
    const/4 v9, 0x6

    .line 85
    goto :goto_0

    .line 86
    :cond_3
    move v9, v10

    .line 87
    :cond_4
    :goto_0
    invoke-virtual {v1, v9, v2, v7}, Leg0;->a(ILjava/lang/String;Z)V

    .line 88
    .line 89
    .line 90
    :goto_1
    move-object p0, v8

    .line 91
    goto :goto_3

    .line 92
    :cond_5
    instance-of p1, p0, Ljava/lang/IllegalArgumentException;

    .line 93
    .line 94
    if-nez p1, :cond_8

    .line 95
    .line 96
    instance-of p1, p0, Ljava/lang/SecurityException;

    .line 97
    .line 98
    if-nez p1, :cond_8

    .line 99
    .line 100
    instance-of p1, p0, Ljava/lang/UnsupportedOperationException;

    .line 101
    .line 102
    if-nez p1, :cond_8

    .line 103
    .line 104
    instance-of p1, p0, Ljava/lang/NullPointerException;

    .line 105
    .line 106
    if-eqz p1, :cond_6

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_6
    instance-of p1, p0, Ljava/lang/IllegalStateException;

    .line 110
    .line 111
    if-eqz p1, :cond_7

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_7
    throw p0

    .line 115
    :cond_8
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    const/16 p0, 0x9

    .line 119
    .line 120
    invoke-virtual {v1, p0, v2, v9}, Leg0;->a(ILjava/lang/String;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :goto_3
    invoke-static {v3, v4}, Lp61;->h(J)J

    .line 125
    .line 126
    .line 127
    move-result-wide v1

    .line 128
    long-to-double v1, v1

    .line 129
    div-double/2addr v1, v5

    .line 130
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-static {v8, v0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    return-object p0

    .line 146
    :goto_4
    invoke-static {v3, v4}, Lp61;->h(J)J

    .line 147
    .line 148
    .line 149
    move-result-wide v1

    .line 150
    long-to-double v1, v1

    .line 151
    div-double/2addr v1, v5

    .line 152
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-static {v8, v0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    throw p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AndroidCameraDevice(camera="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lza;->Z:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {p0}, Lvi0;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 p0, 0x29

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final u(Landroid/hardware/camera2/params/InputConfiguration;Ljava/util/ArrayList;Lsn0;)Z
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v7, "%.3f ms"

    .line 4
    .line 5
    iget-object v8, v1, Lza;->h0:Ls98;

    .line 6
    .line 7
    iget-object v9, v1, Lza;->Y:Landroid/hardware/camera2/CameraDevice;

    .line 8
    .line 9
    move-object/from16 v2, p3

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lza;->a(Ln57;)Lqg5;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v3, v0, Lqg5;->X:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iget-object v0, v0, Lqg5;->Y:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v4, v0

    .line 26
    check-cast v4, Ln57;

    .line 27
    .line 28
    const/4 v10, 0x0

    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    return v10

    .line 32
    :cond_0
    if-eqz v4, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1, v4}, Lza;->b(Ln57;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    const-string v0, "CXCP#createReprocessableCaptureSession-"

    .line 38
    .line 39
    iget-object v11, v1, Lza;->Z:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v0, v11}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 46
    .line 47
    .line 48
    move-result-wide v12

    .line 49
    const/4 v3, 0x0

    .line 50
    const/4 v5, 0x1

    .line 51
    :try_start_0
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v6, v1, Lza;->f0:Leg0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 55
    .line 56
    :try_start_1
    new-instance v0, Lhb;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 57
    .line 58
    move-object/from16 v16, v3

    .line 59
    .line 60
    move-object v3, v4

    .line 61
    :try_start_2
    iget-object v4, v1, Lza;->f0:Leg0;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 62
    .line 63
    move/from16 v17, v5

    .line 64
    .line 65
    :try_start_3
    iget-object v5, v1, Lza;->g0:Ldq;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 66
    .line 67
    move-object/from16 v18, v6

    .line 68
    .line 69
    :try_start_4
    invoke-virtual {v8}, Ls98;->a()Landroid/os/Handler;

    .line 70
    .line 71
    .line 72
    move-result-object v6
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 73
    move/from16 v15, v17

    .line 74
    .line 75
    move-object/from16 v14, v18

    .line 76
    .line 77
    const-wide v19, 0x412e848000000000L    # 1000000.0

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    :try_start_5
    invoke-direct/range {v0 .. v6}, Lhb;-><init>(Lza;Lfh0;Ln57;Leg0;Ldq;Landroid/os/Handler;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v8}, Ls98;->a()Landroid/os/Handler;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    move-object/from16 v4, p1

    .line 90
    .line 91
    move-object/from16 v5, p2

    .line 92
    .line 93
    invoke-virtual {v9, v4, v5, v0, v2}, Landroid/hardware/camera2/CameraDevice;->createReprocessableCaptureSession(Landroid/hardware/camera2/params/InputConfiguration;Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V

    .line 94
    .line 95
    .line 96
    sget-object v0, Ldn8;->a:Ldn8;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 97
    .line 98
    goto/16 :goto_7

    .line 99
    .line 100
    :catchall_0
    move-exception v0

    .line 101
    goto/16 :goto_8

    .line 102
    .line 103
    :catch_0
    move-exception v0

    .line 104
    goto :goto_3

    .line 105
    :catchall_1
    move-exception v0

    .line 106
    move/from16 v15, v17

    .line 107
    .line 108
    :goto_0
    const-wide v19, 0x412e848000000000L    # 1000000.0

    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    goto/16 :goto_8

    .line 114
    .line 115
    :catch_1
    move-exception v0

    .line 116
    move/from16 v15, v17

    .line 117
    .line 118
    move-object/from16 v14, v18

    .line 119
    .line 120
    :goto_1
    const-wide v19, 0x412e848000000000L    # 1000000.0

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :catch_2
    move-exception v0

    .line 127
    move-object v14, v6

    .line 128
    move/from16 v15, v17

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :catchall_2
    move-exception v0

    .line 132
    move v15, v5

    .line 133
    goto :goto_0

    .line 134
    :catch_3
    move-exception v0

    .line 135
    :goto_2
    move v15, v5

    .line 136
    move-object v14, v6

    .line 137
    goto :goto_1

    .line 138
    :catch_4
    move-exception v0

    .line 139
    move-object v3, v4

    .line 140
    goto :goto_2

    .line 141
    :goto_3
    :try_start_6
    instance-of v2, v0, Landroid/hardware/camera2/CameraAccessException;

    .line 142
    .line 143
    if-eqz v2, :cond_7

    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    check-cast v0, Landroid/hardware/camera2/CameraAccessException;

    .line 149
    .line 150
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraAccessException;->getReason()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    const/4 v5, 0x3

    .line 155
    if-eq v2, v15, :cond_6

    .line 156
    .line 157
    const/4 v4, 0x2

    .line 158
    if-eq v2, v4, :cond_5

    .line 159
    .line 160
    if-eq v2, v5, :cond_4

    .line 161
    .line 162
    const/4 v5, 0x4

    .line 163
    if-eq v2, v5, :cond_3

    .line 164
    .line 165
    const/4 v5, 0x5

    .line 166
    if-eq v2, v5, :cond_2

    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    const/16 v5, 0xb

    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_2
    move v5, v4

    .line 175
    goto :goto_4

    .line 176
    :cond_3
    move v5, v15

    .line 177
    goto :goto_4

    .line 178
    :cond_4
    move v5, v10

    .line 179
    goto :goto_4

    .line 180
    :cond_5
    const/4 v5, 0x6

    .line 181
    :cond_6
    :goto_4
    invoke-virtual {v14, v5, v11, v15}, Leg0;->a(ILjava/lang/String;Z)V

    .line 182
    .line 183
    .line 184
    :goto_5
    const/4 v0, 0x0

    .line 185
    goto :goto_7

    .line 186
    :cond_7
    instance-of v2, v0, Ljava/lang/IllegalArgumentException;

    .line 187
    .line 188
    if-nez v2, :cond_a

    .line 189
    .line 190
    instance-of v2, v0, Ljava/lang/SecurityException;

    .line 191
    .line 192
    if-nez v2, :cond_a

    .line 193
    .line 194
    instance-of v2, v0, Ljava/lang/UnsupportedOperationException;

    .line 195
    .line 196
    if-nez v2, :cond_a

    .line 197
    .line 198
    instance-of v2, v0, Ljava/lang/NullPointerException;

    .line 199
    .line 200
    if-eqz v2, :cond_8

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_8
    instance-of v2, v0, Ljava/lang/IllegalStateException;

    .line 204
    .line 205
    if-eqz v2, :cond_9

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_9
    throw v0

    .line 209
    :cond_a
    :goto_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    const/16 v0, 0x9

    .line 213
    .line 214
    invoke-virtual {v14, v0, v11, v10}, Leg0;->a(ILjava/lang/String;Z)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 215
    .line 216
    .line 217
    goto :goto_5

    .line 218
    :goto_7
    invoke-static {v12, v13}, Lp61;->h(J)J

    .line 219
    .line 220
    .line 221
    move-result-wide v4

    .line 222
    long-to-double v4, v4

    .line 223
    div-double v4, v4, v19

    .line 224
    .line 225
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    invoke-static {v2, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    const/4 v4, 0x0

    .line 238
    invoke-static {v4, v7, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    if-nez v0, :cond_b

    .line 242
    .line 243
    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    if-eqz v3, :cond_b

    .line 247
    .line 248
    invoke-virtual {v1, v3}, Lza;->c(Ln57;)V

    .line 249
    .line 250
    .line 251
    :cond_b
    if-eqz v0, :cond_c

    .line 252
    .line 253
    move v10, v15

    .line 254
    :cond_c
    return v10

    .line 255
    :goto_8
    invoke-static {v12, v13}, Lp61;->h(J)J

    .line 256
    .line 257
    .line 258
    move-result-wide v1

    .line 259
    long-to-double v1, v1

    .line 260
    div-double v1, v1, v19

    .line 261
    .line 262
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    invoke-static {v1, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    const/4 v4, 0x0

    .line 275
    invoke-static {v4, v7, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    throw v0
.end method

.class public final Lu79;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lt79;


# instance fields
.field public final a:Ljj0;

.field public final b:Lvz7;

.field public final c:Lxd6;

.field public d:Z

.field public final e:Z

.field public f:Lz76;

.field public g:Lv73;


# direct methods
.method public constructor <init>(Lqj0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lqj0;->b:Ljj0;

    .line 5
    .line 6
    iput-object p1, p0, Lu79;->a:Ljj0;

    .line 7
    .line 8
    new-instance p1, Lv38;

    .line 9
    .line 10
    const/16 v0, 0xd

    .line 11
    .line 12
    invoke-direct {p1, p0, v0}, Lv38;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lvz7;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Lvz7;-><init>(Ldn2;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lu79;->b:Lvz7;

    .line 21
    .line 22
    new-instance p1, Lxd6;

    .line 23
    .line 24
    new-instance v0, Lem7;

    .line 25
    .line 26
    const/16 v1, 0x19

    .line 27
    .line 28
    invoke-direct {v0, v1}, Lem7;-><init>(B)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p1, v0}, Lxd6;-><init>(Lem7;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lu79;->c:Lxd6;

    .line 35
    .line 36
    const-class p1, Landroidx/camera/camera2/compat/quirk/ZslDisablerQuirk;

    .line 37
    .line 38
    invoke-static {}, Lum1;->a()Li26;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0, p1}, Li26;->b(Ljava/lang/Class;)Lf26;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    const/4 p1, 0x1

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const/4 p1, 0x0

    .line 51
    :goto_0
    iput-boolean p1, p0, Lu79;->e:Z

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lu79;->g()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final b(Lb57;)V
    .locals 9

    .line 1
    iget-object v0, p1, La57;->b:Lxm0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lu79;->g()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p0, Lu79;->d:Z

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iput v2, v0, Lxm0;->Y:I

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-boolean v1, p0, Lu79;->e:Z

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    iput v2, v0, Lxm0;->Y:I

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    sget-object v1, Ljj0;->h:Lij0;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lu79;->a:Ljj0;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sget-object v3, Landroid/hardware/camera2/CameraCharacteristics;->REQUEST_AVAILABLE_CAPABILITIES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    check-cast v1, Llf0;

    .line 37
    .line 38
    invoke-virtual {v1, v3}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, [I

    .line 43
    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    sget-object v1, Lij0;->b:[I

    .line 47
    .line 48
    :cond_2
    const/4 v3, 0x4

    .line 49
    invoke-static {v1, v3}, Leu;->a0([II)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_3

    .line 54
    .line 55
    invoke-static {}, Lhi5;->k0()Z

    .line 56
    .line 57
    .line 58
    iput v2, v0, Lxm0;->Y:I

    .line 59
    .line 60
    return-void

    .line 61
    :cond_3
    iget-object v1, p0, Lu79;->b:Lvz7;

    .line 62
    .line 63
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 68
    .line 69
    const/16 v3, 0x22

    .line 70
    .line 71
    invoke-virtual {v2, v3}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getInputSizes(I)[Landroid/util/Size;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-static {v2}, Leu;->K0([Ljava/lang/Object;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_c

    .line 91
    .line 92
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-nez v5, :cond_4

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_4
    move-object v5, v4

    .line 104
    check-cast v5, Landroid/util/Size;

    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5}, Landroid/util/Size;->getWidth()I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    invoke-virtual {v5}, Landroid/util/Size;->getHeight()I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    mul-int/2addr v5, v6

    .line 118
    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    move-object v7, v6

    .line 123
    check-cast v7, Landroid/util/Size;

    .line 124
    .line 125
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v7}, Landroid/util/Size;->getWidth()I

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    invoke-virtual {v7}, Landroid/util/Size;->getHeight()I

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    mul-int/2addr v7, v8

    .line 137
    if-ge v5, v7, :cond_6

    .line 138
    .line 139
    move-object v4, v6

    .line 140
    move v5, v7

    .line 141
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    if-nez v6, :cond_5

    .line 146
    .line 147
    :goto_0
    check-cast v4, Landroid/util/Size;

    .line 148
    .line 149
    if-nez v4, :cond_7

    .line 150
    .line 151
    invoke-static {}, Lhi5;->m0()Z

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_7
    const-string v2, "CXCP"

    .line 156
    .line 157
    invoke-static {v2}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_8

    .line 162
    .line 163
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    :cond_8
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    check-cast v1, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 171
    .line 172
    invoke-virtual {v1, v3}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getValidOutputFormatsForInput(I)[I

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    const/16 v2, 0x100

    .line 180
    .line 181
    invoke-static {v1, v2}, Leu;->a0([II)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-nez v1, :cond_9

    .line 186
    .line 187
    invoke-static {}, Lhi5;->m0()Z

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :cond_9
    new-instance v1, Lcv4;

    .line 192
    .line 193
    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    const/16 v5, 0x9

    .line 202
    .line 203
    invoke-direct {v1, v2, v4, v3, v5}, Lcv4;-><init>(IIII)V

    .line 204
    .line 205
    .line 206
    iget-object v2, v1, Lcv4;->Y:Lyg0;

    .line 207
    .line 208
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    new-instance v4, Lz76;

    .line 212
    .line 213
    invoke-direct {v4, v1}, Lz76;-><init>(Lq63;)V

    .line 214
    .line 215
    .line 216
    new-instance v5, Lj78;

    .line 217
    .line 218
    const/16 v6, 0x8

    .line 219
    .line 220
    invoke-direct {v5, p0, v6}, Lj78;-><init>(Ljava/lang/Object;B)V

    .line 221
    .line 222
    .line 223
    invoke-static {}, Lki3;->a()Ljava/util/concurrent/Executor;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    invoke-virtual {v1, v5, v6}, Lcv4;->p(Lp63;Ljava/util/concurrent/Executor;)V

    .line 228
    .line 229
    .line 230
    new-instance v1, Lv73;

    .line 231
    .line 232
    invoke-virtual {v4}, Lz76;->getSurface()Landroid/view/Surface;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    if-eqz v5, :cond_b

    .line 237
    .line 238
    new-instance v6, Landroid/util/Size;

    .line 239
    .line 240
    invoke-virtual {v4}, Lz76;->b()I

    .line 241
    .line 242
    .line 243
    move-result v7

    .line 244
    invoke-virtual {v4}, Lz76;->a()I

    .line 245
    .line 246
    .line 247
    move-result v8

    .line 248
    invoke-direct {v6, v7, v8}, Landroid/util/Size;-><init>(II)V

    .line 249
    .line 250
    .line 251
    invoke-direct {v1, v5, v6, v3}, Lv73;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    .line 252
    .line 253
    .line 254
    iget-object v3, v1, Lwg1;->e:Lud0;

    .line 255
    .line 256
    invoke-static {v3}, Lvr3;->P(Lxb4;)Lxb4;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    new-instance v5, Lcn0;

    .line 261
    .line 262
    const/4 v6, 0x3

    .line 263
    invoke-direct {v5, v4, v6}, Lcn0;-><init>(Lz76;B)V

    .line 264
    .line 265
    .line 266
    invoke-static {}, Lkm4;->J()Ljava/util/concurrent/ScheduledExecutorService;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    invoke-interface {v3, v5, v6}, Lxb4;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 271
    .line 272
    .line 273
    sget-object v3, Lpx1;->d:Lpx1;

    .line 274
    .line 275
    const/4 v5, -0x1

    .line 276
    invoke-virtual {p1, v1, v3, v5}, Lb57;->b(Lwg1;Lpx1;I)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0, v2}, Lxm0;->c(Lxg0;)V

    .line 280
    .line 281
    .line 282
    iget-object v0, p1, La57;->e:Ljava/util/ArrayList;

    .line 283
    .line 284
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    if-nez v3, :cond_a

    .line 289
    .line 290
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    :cond_a
    new-instance v0, Landroid/hardware/camera2/params/InputConfiguration;

    .line 294
    .line 295
    invoke-virtual {v4}, Lz76;->b()I

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    invoke-virtual {v4}, Lz76;->a()I

    .line 300
    .line 301
    .line 302
    move-result v3

    .line 303
    invoke-virtual {v4}, Lz76;->e()I

    .line 304
    .line 305
    .line 306
    move-result v5

    .line 307
    invoke-direct {v0, v2, v3, v5}, Landroid/hardware/camera2/params/InputConfiguration;-><init>(III)V

    .line 308
    .line 309
    .line 310
    iput-object v0, p1, La57;->g:Landroid/hardware/camera2/params/InputConfiguration;

    .line 311
    .line 312
    iput-object v4, p0, Lu79;->f:Lz76;

    .line 313
    .line 314
    iput-object v1, p0, Lu79;->g:Lv73;

    .line 315
    .line 316
    return-void

    .line 317
    :cond_b
    const-string p0, "Required value was null."

    .line 318
    .line 319
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    return-void

    .line 323
    :cond_c
    invoke-static {}, Lbt;->n()V

    .line 324
    .line 325
    .line 326
    return-void
.end method

.method public final c(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final d(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lu79;->d:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lu79;->f()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iput-boolean p1, p0, Lu79;->d:Z

    .line 11
    .line 12
    return-void
.end method

.method public final e(Lwg1;Lf57;)Z
    .locals 1

    .line 1
    iget-object p0, p1, Lwg1;->h:Landroid/util/Size;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p2, p2, Lf57;->i:Landroid/hardware/camera2/params/InputConfiguration;

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    iget p1, p1, Lwg1;->i:I

    .line 11
    .line 12
    invoke-virtual {p2}, Landroid/hardware/camera2/params/InputConfiguration;->getFormat()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ne p1, v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-virtual {p2}, Landroid/hardware/camera2/params/InputConfiguration;->getWidth()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-ne p1, v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-virtual {p2}, Landroid/hardware/camera2/params/InputConfiguration;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-ne p0, p1, :cond_0

    .line 37
    .line 38
    const/4 p0, 0x1

    .line 39
    return p0

    .line 40
    :cond_0
    const/4 p0, 0x0

    .line 41
    return p0
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object p0, p0, Lu79;->c:Lxd6;

    .line 2
    .line 3
    :goto_0
    iget-object v0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/ArrayDeque;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lxd6;->l()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ln63;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw p0
.end method

.method public final g()V
    .locals 6

    .line 1
    iget-object v0, p0, Lu79;->g:Lv73;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lu79;->f:Lz76;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v3, v0, Lwg1;->e:Lud0;

    .line 11
    .line 12
    invoke-static {v3}, Lvr3;->P(Lxb4;)Lxb4;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    new-instance v4, Lcn0;

    .line 17
    .line 18
    const/4 v5, 0x4

    .line 19
    invoke-direct {v4, v1, v5}, Lcn0;-><init>(Lz76;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lkm4;->J()Ljava/util/concurrent/ScheduledExecutorService;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-interface {v3, v4, v5}, Lxb4;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lz76;->h()V

    .line 30
    .line 31
    .line 32
    iput-object v2, p0, Lu79;->f:Lz76;

    .line 33
    .line 34
    :cond_0
    invoke-virtual {v0}, Lwg1;->a()V

    .line 35
    .line 36
    .line 37
    iput-object v2, p0, Lu79;->g:Lv73;

    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0}, Lu79;->f()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

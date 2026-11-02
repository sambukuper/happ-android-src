.class public final Lk53;
.super Lhq8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final z:Li53;


# instance fields
.field public final q:Ljava/lang/Object;

.field public r:Lm53;

.field public s:Ljava/util/concurrent/Executor;

.field public t:Lzz2;

.field public u:Landroid/graphics/Rect;

.field public v:Landroid/graphics/Matrix;

.field public w:Lb57;

.field public x:Lv73;

.field public y:Lc57;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Li53;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk53;->z:Li53;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lo53;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lhq8;-><init>(Ler8;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lk53;->q:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final A(Liz;Liz;)Liz;
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    const-string p2, "ImageAnalysis"

    .line 8
    .line 9
    invoke-static {p2}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, Lhq8;->h:Ler8;

    .line 13
    .line 14
    check-cast p2, Lo53;

    .line 15
    .line 16
    invoke-virtual {p0}, Lhq8;->f()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p2, p1}, Lk53;->I(Lo53;Liz;)Lb57;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iput-object p2, p0, Lk53;->w:Lb57;

    .line 24
    .line 25
    invoke-virtual {p2}, Lb57;->c()Lf57;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    aget-object p2, p2, v1

    .line 41
    .line 42
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-virtual {p0, p2}, Lhq8;->G(Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    return-object p1
.end method

.method public final B()V
    .locals 4

    .line 1
    invoke-static {}, Ls08;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk53;->y:Lc57;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lc57;->b()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lk53;->y:Lc57;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lk53;->x:Lv73;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Lwg1;->a()V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lk53;->x:Lv73;

    .line 22
    .line 23
    :cond_1
    iget-object v0, p0, Lk53;->q:Ljava/lang/Object;

    .line 24
    .line 25
    monitor-enter v0

    .line 26
    :try_start_0
    iget-object v2, p0, Lk53;->r:Lm53;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    iput-boolean v3, v2, Lm53;->w0:Z

    .line 30
    .line 31
    invoke-virtual {v2}, Lm53;->c()V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lk53;->r:Lm53;

    .line 35
    .line 36
    monitor-exit v0

    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw p0
.end method

.method public final C(Landroid/graphics/Matrix;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lhq8;->C(Landroid/graphics/Matrix;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk53;->q:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lk53;->r:Lm53;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Lm53;->h(Landroid/graphics/Matrix;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    :goto_0
    iput-object p1, p0, Lk53;->v:Landroid/graphics/Matrix;

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw p0
.end method

.method public final E(Landroid/graphics/Rect;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lhq8;->k:Landroid/graphics/Rect;

    .line 2
    .line 3
    iget-object v0, p0, Lk53;->q:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lk53;->r:Lm53;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Lm53;->i(Landroid/graphics/Rect;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    iput-object p1, p0, Lk53;->u:Landroid/graphics/Rect;

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p0
.end method

.method public final I(Lo53;Liz;)Lb57;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-static {}, Ls08;->b()V

    .line 8
    .line 9
    .line 10
    iget-object v3, v2, Liz;->a:Landroid/util/Size;

    .line 11
    .line 12
    invoke-static {}, Lj03;->a()Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    sget-object v5, Le98;->K:Lzx;

    .line 17
    .line 18
    invoke-interface {v1, v5, v4}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Ljava/util/concurrent/Executor;

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v5, v0, Lhq8;->h:Ler8;

    .line 28
    .line 29
    check-cast v5, Lo53;

    .line 30
    .line 31
    sget-object v6, Lo53;->Y:Lzx;

    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    invoke-interface {v5, v6, v8}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    const/4 v6, 0x1

    .line 49
    if-ne v5, v6, :cond_0

    .line 50
    .line 51
    iget-object v5, v0, Lhq8;->h:Ler8;

    .line 52
    .line 53
    check-cast v5, Lo53;

    .line 54
    .line 55
    sget-object v8, Lo53;->Z:Lzx;

    .line 56
    .line 57
    const/4 v9, 0x6

    .line 58
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    invoke-interface {v5, v8, v9}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    check-cast v5, Ljava/lang/Integer;

    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    const/4 v5, 0x4

    .line 74
    :goto_0
    sget-object v8, Lo53;->f0:Lzx;

    .line 75
    .line 76
    const/4 v9, 0x0

    .line 77
    invoke-interface {v1, v8, v9}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    if-nez v8, :cond_10

    .line 82
    .line 83
    new-instance v8, Lz76;

    .line 84
    .line 85
    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    iget-object v12, v0, Lhq8;->h:Ler8;

    .line 94
    .line 95
    invoke-interface {v12}, Le63;->n()I

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    invoke-static {v10, v11, v12, v5}, Lz68;->x(IIII)Lo8;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-direct {v8, v5}, Lz76;-><init>(Lq63;)V

    .line 104
    .line 105
    .line 106
    iget-object v5, v0, Lk53;->q:Ljava/lang/Object;

    .line 107
    .line 108
    monitor-enter v5

    .line 109
    :try_start_0
    invoke-virtual {v0}, Lk53;->K()V

    .line 110
    .line 111
    .line 112
    iget-object v10, v0, Lk53;->r:Lm53;

    .line 113
    .line 114
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 115
    invoke-virtual {v0}, Lhq8;->d()Lcj0;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    if-eqz v5, :cond_1

    .line 120
    .line 121
    invoke-virtual {v0}, Lhq8;->d()Lcj0;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    iget-object v11, v0, Lhq8;->h:Ler8;

    .line 126
    .line 127
    check-cast v11, Lo53;

    .line 128
    .line 129
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 130
    .line 131
    sget-object v13, Lo53;->i0:Lzx;

    .line 132
    .line 133
    invoke-interface {v11, v13, v12}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v11

    .line 137
    check-cast v11, Ljava/lang/Boolean;

    .line 138
    .line 139
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 140
    .line 141
    .line 142
    move-result v11

    .line 143
    if-eqz v11, :cond_1

    .line 144
    .line 145
    invoke-virtual {v0, v5, v7}, Lhq8;->i(Lcj0;Z)I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    rem-int/lit16 v5, v5, 0xb4

    .line 150
    .line 151
    if-eqz v5, :cond_1

    .line 152
    .line 153
    move v5, v6

    .line 154
    goto :goto_1

    .line 155
    :cond_1
    move v5, v7

    .line 156
    :goto_1
    if-eqz v5, :cond_2

    .line 157
    .line 158
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    .line 159
    .line 160
    .line 161
    move-result v11

    .line 162
    goto :goto_2

    .line 163
    :cond_2
    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    .line 164
    .line 165
    .line 166
    move-result v11

    .line 167
    :goto_2
    if-eqz v5, :cond_3

    .line 168
    .line 169
    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    goto :goto_3

    .line 174
    :cond_3
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    :goto_3
    invoke-virtual {v0}, Lk53;->J()I

    .line 179
    .line 180
    .line 181
    move-result v12

    .line 182
    const/4 v13, 0x2

    .line 183
    const/16 v14, 0x23

    .line 184
    .line 185
    if-ne v12, v13, :cond_4

    .line 186
    .line 187
    move v12, v6

    .line 188
    goto :goto_4

    .line 189
    :cond_4
    move v12, v14

    .line 190
    :goto_4
    iget-object v15, v0, Lhq8;->h:Ler8;

    .line 191
    .line 192
    invoke-interface {v15}, Le63;->n()I

    .line 193
    .line 194
    .line 195
    move-result v15

    .line 196
    if-ne v15, v14, :cond_5

    .line 197
    .line 198
    invoke-virtual {v0}, Lk53;->J()I

    .line 199
    .line 200
    .line 201
    move-result v15

    .line 202
    if-ne v15, v13, :cond_5

    .line 203
    .line 204
    move v13, v6

    .line 205
    goto :goto_5

    .line 206
    :cond_5
    move v13, v7

    .line 207
    :goto_5
    iget-object v15, v0, Lhq8;->h:Ler8;

    .line 208
    .line 209
    invoke-interface {v15}, Le63;->n()I

    .line 210
    .line 211
    .line 212
    move-result v15

    .line 213
    if-ne v15, v14, :cond_6

    .line 214
    .line 215
    invoke-virtual {v0}, Lk53;->J()I

    .line 216
    .line 217
    .line 218
    move-result v15

    .line 219
    const/4 v6, 0x3

    .line 220
    if-ne v15, v6, :cond_6

    .line 221
    .line 222
    const/4 v6, 0x1

    .line 223
    goto :goto_6

    .line 224
    :cond_6
    move v6, v7

    .line 225
    :goto_6
    iget-object v15, v0, Lhq8;->h:Ler8;

    .line 226
    .line 227
    invoke-interface {v15}, Le63;->n()I

    .line 228
    .line 229
    .line 230
    move-result v15

    .line 231
    if-ne v15, v14, :cond_9

    .line 232
    .line 233
    invoke-virtual {v0}, Lhq8;->d()Lcj0;

    .line 234
    .line 235
    .line 236
    move-result-object v14

    .line 237
    if-eqz v14, :cond_7

    .line 238
    .line 239
    invoke-virtual {v0}, Lhq8;->d()Lcj0;

    .line 240
    .line 241
    .line 242
    move-result-object v14

    .line 243
    invoke-virtual {v0, v14, v7}, Lhq8;->i(Lcj0;Z)I

    .line 244
    .line 245
    .line 246
    move-result v14

    .line 247
    if-nez v14, :cond_8

    .line 248
    .line 249
    :cond_7
    sget-object v14, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 250
    .line 251
    iget-object v15, v0, Lhq8;->h:Ler8;

    .line 252
    .line 253
    check-cast v15, Lo53;

    .line 254
    .line 255
    sget-object v7, Lo53;->h0:Lzx;

    .line 256
    .line 257
    invoke-interface {v15, v7, v9}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    check-cast v7, Ljava/lang/Boolean;

    .line 262
    .line 263
    invoke-virtual {v14, v7}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v7

    .line 267
    if-eqz v7, :cond_9

    .line 268
    .line 269
    :cond_8
    const/16 v16, 0x1

    .line 270
    .line 271
    goto :goto_7

    .line 272
    :cond_9
    const/16 v16, 0x0

    .line 273
    .line 274
    :goto_7
    if-nez v13, :cond_a

    .line 275
    .line 276
    if-eqz v16, :cond_b

    .line 277
    .line 278
    if-nez v6, :cond_b

    .line 279
    .line 280
    :cond_a
    new-instance v9, Lz76;

    .line 281
    .line 282
    invoke-virtual {v8}, Lz76;->s()I

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    invoke-static {v11, v5, v12, v6}, Lz68;->x(IIII)Lo8;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    invoke-direct {v9, v5}, Lz76;-><init>(Lq63;)V

    .line 291
    .line 292
    .line 293
    :cond_b
    if-eqz v9, :cond_c

    .line 294
    .line 295
    iget-object v5, v10, Lm53;->v0:Ljava/lang/Object;

    .line 296
    .line 297
    monitor-enter v5

    .line 298
    :try_start_1
    iput-object v9, v10, Lm53;->j0:Lz76;

    .line 299
    .line 300
    monitor-exit v5

    .line 301
    goto :goto_8

    .line 302
    :catchall_0
    move-exception v0

    .line 303
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 304
    throw v0

    .line 305
    :cond_c
    :goto_8
    invoke-virtual {v0}, Lk53;->L()V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v8, v10, v4}, Lz76;->p(Lp63;Ljava/util/concurrent/Executor;)V

    .line 309
    .line 310
    .line 311
    iget-object v4, v2, Liz;->a:Landroid/util/Size;

    .line 312
    .line 313
    invoke-static {v1, v4}, Lb57;->d(Ler8;Landroid/util/Size;)Lb57;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    iget-object v4, v2, Liz;->f:Ll11;

    .line 318
    .line 319
    if-eqz v4, :cond_d

    .line 320
    .line 321
    iget-object v5, v1, La57;->b:Lxm0;

    .line 322
    .line 323
    invoke-virtual {v5, v4}, Lxm0;->d(Ll11;)V

    .line 324
    .line 325
    .line 326
    :cond_d
    iget-object v4, v0, Lk53;->x:Lv73;

    .line 327
    .line 328
    if-eqz v4, :cond_e

    .line 329
    .line 330
    invoke-virtual {v4}, Lwg1;->a()V

    .line 331
    .line 332
    .line 333
    :cond_e
    new-instance v4, Lv73;

    .line 334
    .line 335
    invoke-virtual {v8}, Lz76;->getSurface()Landroid/view/Surface;

    .line 336
    .line 337
    .line 338
    move-result-object v5

    .line 339
    iget-object v6, v0, Lhq8;->h:Ler8;

    .line 340
    .line 341
    invoke-interface {v6}, Le63;->n()I

    .line 342
    .line 343
    .line 344
    move-result v6

    .line 345
    invoke-direct {v4, v5, v3, v6}, Lv73;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    .line 346
    .line 347
    .line 348
    iput-object v4, v0, Lk53;->x:Lv73;

    .line 349
    .line 350
    iget-object v3, v4, Lwg1;->e:Lud0;

    .line 351
    .line 352
    invoke-static {v3}, Lvr3;->P(Lxb4;)Lxb4;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    new-instance v4, Lsc;

    .line 357
    .line 358
    const/16 v5, 0x1a

    .line 359
    .line 360
    invoke-direct {v4, v8, v9, v5}, Lsc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 361
    .line 362
    .line 363
    invoke-static {}, Lkm4;->J()Ljava/util/concurrent/ScheduledExecutorService;

    .line 364
    .line 365
    .line 366
    move-result-object v5

    .line 367
    invoke-interface {v3, v4, v5}, Lxb4;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 368
    .line 369
    .line 370
    iget v3, v2, Liz;->d:I

    .line 371
    .line 372
    iput v3, v1, La57;->h:I

    .line 373
    .line 374
    invoke-virtual {v0, v1, v2}, Lhq8;->a(Lb57;Liz;)V

    .line 375
    .line 376
    .line 377
    iget-object v3, v0, Lk53;->x:Lv73;

    .line 378
    .line 379
    iget-object v2, v2, Liz;->c:Lpx1;

    .line 380
    .line 381
    const/4 v4, -0x1

    .line 382
    invoke-virtual {v1, v3, v2, v4}, Lb57;->b(Lwg1;Lpx1;I)V

    .line 383
    .line 384
    .line 385
    iget-object v2, v0, Lk53;->y:Lc57;

    .line 386
    .line 387
    if-eqz v2, :cond_f

    .line 388
    .line 389
    invoke-virtual {v2}, Lc57;->b()V

    .line 390
    .line 391
    .line 392
    :cond_f
    new-instance v2, Lc57;

    .line 393
    .line 394
    new-instance v3, Le53;

    .line 395
    .line 396
    const/4 v4, 0x0

    .line 397
    invoke-direct {v3, v0, v10, v4}, Le53;-><init>(Lhq8;Ljava/lang/Object;B)V

    .line 398
    .line 399
    .line 400
    invoke-direct {v2, v3}, Lc57;-><init>(Ld57;)V

    .line 401
    .line 402
    .line 403
    iput-object v2, v0, Lk53;->y:Lc57;

    .line 404
    .line 405
    iput-object v2, v1, La57;->f:Lc57;

    .line 406
    .line 407
    return-object v1

    .line 408
    :catchall_1
    move-exception v0

    .line 409
    :try_start_2
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 410
    throw v0

    .line 411
    :cond_10
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 412
    .line 413
    .line 414
    return-object v9
.end method

.method public final J()I
    .locals 2

    .line 1
    iget-object p0, p0, Lhq8;->h:Ler8;

    .line 2
    .line 3
    check-cast p0, Lo53;

    .line 4
    .line 5
    sget-object v0, Lo53;->g0:Lzx;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {p0, v0, v1}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public final K()V
    .locals 6

    .line 1
    iget-object v0, p0, Lk53;->q:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lhq8;->h:Ler8;

    .line 5
    .line 6
    check-cast v1, Lo53;

    .line 7
    .line 8
    sget-object v2, Lo53;->Y:Lzx;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-interface {v1, v2, v4}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v4, 0x1

    .line 26
    if-ne v2, v4, :cond_0

    .line 27
    .line 28
    new-instance v1, Ln53;

    .line 29
    .line 30
    invoke-direct {v1}, Lm53;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lk53;->r:Lm53;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :cond_0
    new-instance v2, Lr53;

    .line 40
    .line 41
    invoke-static {}, Lj03;->a()Ljava/util/concurrent/Executor;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    sget-object v5, Le98;->K:Lzx;

    .line 46
    .line 47
    invoke-interface {v1, v5, v4}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 52
    .line 53
    invoke-direct {v2, v1}, Lr53;-><init>(Ljava/util/concurrent/Executor;)V

    .line 54
    .line 55
    .line 56
    iput-object v2, p0, Lk53;->r:Lm53;

    .line 57
    .line 58
    move-object v1, v2

    .line 59
    :goto_0
    invoke-virtual {p0}, Lk53;->J()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    iput v2, v1, Lm53;->f0:I

    .line 64
    .line 65
    iget-object v1, p0, Lk53;->r:Lm53;

    .line 66
    .line 67
    iget-object v2, p0, Lhq8;->h:Ler8;

    .line 68
    .line 69
    check-cast v2, Lo53;

    .line 70
    .line 71
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 72
    .line 73
    sget-object v5, Lo53;->i0:Lzx;

    .line 74
    .line 75
    invoke-interface {v2, v5, v4}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    iput-boolean v2, v1, Lm53;->g0:Z

    .line 86
    .line 87
    invoke-virtual {p0}, Lhq8;->d()Lcj0;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iget-object v2, p0, Lhq8;->h:Ler8;

    .line 92
    .line 93
    check-cast v2, Lo53;

    .line 94
    .line 95
    sget-object v4, Lo53;->h0:Lzx;

    .line 96
    .line 97
    const/4 v5, 0x0

    .line 98
    invoke-interface {v2, v4, v5}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    check-cast v2, Ljava/lang/Boolean;

    .line 103
    .line 104
    if-eqz v1, :cond_1

    .line 105
    .line 106
    invoke-interface {v1}, Lcj0;->s()Laj0;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-interface {v4}, Laj0;->s()Li26;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    const-class v5, Landroidx/camera/core/internal/compat/quirk/OnePixelShiftQuirk;

    .line 115
    .line 116
    invoke-virtual {v4, v5}, Li26;->a(Ljava/lang/Class;)Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    goto :goto_1

    .line 121
    :cond_1
    move v4, v3

    .line 122
    :goto_1
    iget-object v5, p0, Lk53;->r:Lm53;

    .line 123
    .line 124
    if-nez v2, :cond_2

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    :goto_2
    iput-boolean v4, v5, Lm53;->h0:Z

    .line 132
    .line 133
    if-eqz v1, :cond_3

    .line 134
    .line 135
    iget-object v2, p0, Lk53;->r:Lm53;

    .line 136
    .line 137
    invoke-virtual {p0, v1, v3}, Lhq8;->i(Lcj0;Z)I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    iput v1, v2, Lm53;->Y:I

    .line 142
    .line 143
    :cond_3
    iget-object v1, p0, Lk53;->u:Landroid/graphics/Rect;

    .line 144
    .line 145
    if-eqz v1, :cond_4

    .line 146
    .line 147
    iget-object v2, p0, Lk53;->r:Lm53;

    .line 148
    .line 149
    invoke-virtual {v2, v1}, Lm53;->i(Landroid/graphics/Rect;)V

    .line 150
    .line 151
    .line 152
    :cond_4
    iget-object v1, p0, Lk53;->v:Landroid/graphics/Matrix;

    .line 153
    .line 154
    if-eqz v1, :cond_5

    .line 155
    .line 156
    iget-object v2, p0, Lk53;->r:Lm53;

    .line 157
    .line 158
    invoke-virtual {v2, v1}, Lm53;->h(Landroid/graphics/Matrix;)V

    .line 159
    .line 160
    .line 161
    :cond_5
    iget-object v1, p0, Lk53;->s:Ljava/util/concurrent/Executor;

    .line 162
    .line 163
    if-eqz v1, :cond_6

    .line 164
    .line 165
    iget-object v2, p0, Lk53;->t:Lzz2;

    .line 166
    .line 167
    if-eqz v2, :cond_6

    .line 168
    .line 169
    iget-object p0, p0, Lk53;->r:Lm53;

    .line 170
    .line 171
    iget-object v3, p0, Lm53;->v0:Ljava/lang/Object;

    .line 172
    .line 173
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 174
    :try_start_1
    iput-object v2, p0, Lm53;->X:Lf53;

    .line 175
    .line 176
    iput-object v1, p0, Lm53;->i0:Ljava/util/concurrent/Executor;

    .line 177
    .line 178
    monitor-exit v3

    .line 179
    goto :goto_3

    .line 180
    :catchall_1
    move-exception p0

    .line 181
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 182
    :try_start_2
    throw p0

    .line 183
    :cond_6
    :goto_3
    monitor-exit v0

    .line 184
    return-void

    .line 185
    :goto_4
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 186
    throw p0
.end method

.method public final L()V
    .locals 4

    .line 1
    iget-object v0, p0, Lk53;->q:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lhq8;->d()Lcj0;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v2, p0, Lk53;->r:Lm53;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {p0, v1, v3}, Lhq8;->i(Lcj0;Z)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    iput p0, v2, Lm53;->Y:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p0
.end method

.method public final g(ZLhr8;)Ler8;
    .locals 3

    .line 1
    sget-object v0, Lk53;->z:Li53;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Li53;->a:Lo53;

    .line 7
    .line 8
    invoke-interface {v0}, Ler8;->s()Lgr8;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-interface {p2, v1, v2}, Lhr8;->a(Lgr8;I)Ll11;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-static {p2, v0}, Ll11;->q(Ll11;Ll11;)Lqd5;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    :cond_0
    if-nez p2, :cond_1

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :cond_1
    invoke-virtual {p0, p2}, Lhq8;->m(Ll11;)Ldr8;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lh53;

    .line 32
    .line 33
    new-instance p1, Lo53;

    .line 34
    .line 35
    iget-object p0, p0, Lh53;->Y:Lk05;

    .line 36
    .line 37
    invoke-static {p0}, Lqd5;->c(Ll11;)Lqd5;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-direct {p1, p0}, Lo53;-><init>(Lqd5;)V

    .line 42
    .line 43
    .line 44
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lhq8;->h()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "ImageAnalysis:"

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final v(Laj0;Ldr8;)Ler8;
    .locals 0

    .line 1
    iget-object p0, p0, Lk53;->q:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    invoke-interface {p2}, Ldr8;->d()Ler8;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw p1
.end method

.method public final w(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lhq8;->D(I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lk53;->L()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final z(Ll11;)Liz;
    .locals 3

    .line 1
    iget-object v0, p0, Lk53;->w:Lb57;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lb57;->a(Ll11;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk53;->w:Lb57;

    .line 7
    .line 8
    invoke-virtual {v0}, Lb57;->c()Lf57;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    aget-object v0, v0, v2

    .line 24
    .line 25
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0, v0}, Lhq8;->G(Ljava/util/List;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lhq8;->i:Liz;

    .line 39
    .line 40
    invoke-virtual {p0}, Liz;->b()Lxy0;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iput-object p1, p0, Lxy0;->i0:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {p0}, Lxy0;->b()Liz;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method
